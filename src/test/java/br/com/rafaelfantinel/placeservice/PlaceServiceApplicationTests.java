package br.com.rafaelfantinel.placeservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.rafaelfantinel.placeservice.api.PlaceRequest;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PlaceServiceApplicationTests {
	@Autowired
	WebTestClient webTestClient;

	@Test
	void testCreatePlaceSuccess() {
		final var expectedName = "Valid name";
		final var expectedState = "Valid state";
		final var expectedSlug = "valid-name";

		webTestClient
		.post()
		.uri("/places")
		.bodyValue(
			new PlaceRequest(expectedName, expectedState)
		)
		.exchange()
		.expectBody()
		.jsonPath("name").isEqualTo(expectedName)
 		.jsonPath("state").isEqualTo(expectedState)
		.jsonPath("slug").isEqualTo(expectedSlug)
		.jsonPath("createdAt").isNotEmpty()
		.jsonPath("updatedAt").isNotEmpty();
	}

	@Test
	public void testCreatePlaceFailure() {
		final var expectedInvalidName = "";
		final var expectedInvalidState = "";

		webTestClient
		.post()
		.uri("/places")
		.bodyValue(
			new PlaceRequest(expectedInvalidName, expectedInvalidState)
		)
		.exchange()
		.expectStatus().isBadRequest();
	}

}

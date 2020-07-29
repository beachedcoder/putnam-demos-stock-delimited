package com.putnam.demo.files_demo;

import com.putnam.demo.files_demo.domain.Stock;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class StockDomainObjectTests {
	/*
		note: remember these tests are to ensure we confirm business logic in Bean and while supporting code coverage
	 */
	@Test
	void testHashCode() {
		//CFA,VictoryShares US 500 Volatility Wtd ETF,NASDAQ,$8.83M,$8159.86,n/a
		Stock currentObject = new Stock("CFA", "VictoryShares US 500 Volatility Wtd ETF",
				"NASDAQ", "$8.83M", "8159.86", "n/a");
		
		assertTrue(currentObject.hashCode()>0);
	}


	@Test
	void StockDefaultConstructorTest() {
		Stock objUnderTest = new Stock();
		
		assertNotNull(objUnderTest, "Default constructor failed to initialize instance of Stock");
		assertTrue(objUnderTest.getId()>0, "Default id value not provided by default constructor");
		assertEquals(0.0, objUnderTest.getTradedAt(),.2,"runtime initialized value not zero");
	}

	@Disabled
	@Test
	void StockConstructorWithAllFieldValuesTest() {
		//STOR,STORE Capital Corporation,NYSE,$3.62B,$4440.66,Consumer Services
		Stock currentObject = new Stock("STOR", "STORE Capital Corporation",
				"NYSE", "$3.62B", "4440.66", "Consumer Services");

		assertAll(
				() -> assertNotNull(currentObject, "constructor failed to instantiate instance of Stock"),
				() -> assertEquals(4440.66f, currentObject.getTradedAt(), 0.0, "conversion of String value for tradedAt failed"),
				() -> assertEquals("NYSE", currentObject.getExchangeMarket(), "exchange market failed to be set during instantiation"),
				() -> assertEquals("STOR", currentObject.getExchangeSymbol(), "exchanged symbol failed to be initialized"),
				() -> assertEquals("STORE Capital Corporation", currentObject.getCompanyName(), "")
		);

	}

	@Test
	void testGetId() {
		assertTrue((new Stock()).getId() > 0);
	}

	@Test
	void testSetId() {
		long tTime = Instant.MIN.getNano();
		Stock currentObject = new Stock();
		currentObject.setId(tTime);
		assertEquals(tTime, currentObject.getId(), "setting id failed");

	}


	@Test
	void testEqualsObject() {
		int idValue = Instant.now().getNano();
		Stock expectedObj = new Stock("STOR", "STORE Capital Corporation",
				"NYSE", "$3.62B", "4440.66", "Consumer Services");
		expectedObj.setId(idValue);

		Stock secondObject = new Stock("STOR", "STORE Capital Corporation",
				"NYSE", "$3.62B", "4440.66", "Consumer Services");
		secondObject.setId(idValue);

		assertEquals(expectedObj, secondObject, "equality of object state failed with same data");

	}


    @Test
	void testGetExchangeSymbol() {

	}

	@Disabled
	@Test
	void testSetExchangeSymbol() {

	}

	@Disabled
	@Test
	void testGetCompanyName() {

	}

	@Disabled
	@Test
	void testSetCompanyName() {

	}

	@Disabled
	@Test
	void testGetExchangeMarket() {

	}

	@Disabled
	@Test
	void testSetExchangeMarket() {

	}

	@Disabled
	@Test
	void testGetMarketCap() {

	}

	@Disabled
	@Test
	void testSetMarketCap() {

	}

	@Disabled
	@Test
	void testGetTradedAt() {

	}

	@Disabled
	@Test
	void testSetTradedAt() {

	}

	@Disabled
	@Test
	void testGetIndustrySector() {

	}

	@Disabled
	@Test
	void testSetIndustrySector() {

	}

	@Disabled
	@Test
	void testToString() {

	}

}

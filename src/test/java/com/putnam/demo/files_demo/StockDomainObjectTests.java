package com.putnam.demo.files_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.putnam.demo.files_demo.domain.Stock;

class StockDomainObjectTests {

	@Test
	void testHashCode() {
		//CFA,VictoryShares US 500 Volatility Wtd ETF,NASDAQ,$8.83M,$8159.86,n/a
		Stock currentObject = new Stock("CFA","VictoryShares US 500 Volatility Wtd ETF",
				"NASDAQ","$8.83M","8159.86","n/a");
		
		assertNotNull(currentObject.hashCode());
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
	
	}

	@Disabled
	@Test
	void testGetId() {

	}

	@Disabled
	@Test
	void testSetId() {


	}

	@Disabled
	@Test
	void testGetExchangeSymbol() {
		
	}

	@Disabled
	@Test
	void testSetExchangeSymbol() {
		
	}

	@Test
	void testGetCompanyName() {
		
	}

	@Test
	void testSetCompanyName() {
		
	}

	@Test
	void testGetExchangeMarket() {
		
	}

	@Test
	void testSetExchangeMarket() {
		
	}

	@Test
	void testGetMarketCap() {
		
	}

	@Test
	void testSetMarketCap() {
	
	}

	@Test
	void testGetTradedAt() {
		
	}

	@Test
	void testSetTradedAt() {
		
	}

	@Test
	void testGetIndustrySector() {
		
	}

	@Test
	void testSetIndustrySector() {
		
	}

	@Test
	void testEqualsObject() {
	
	}

	@Test
	void testToString() {
		
	}

}

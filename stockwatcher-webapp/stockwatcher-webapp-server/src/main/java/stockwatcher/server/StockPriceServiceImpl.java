package stockwatcher.server;

import java.util.Random;

import stockwatcher.shared.StockPrice;
import stockwatcher.shared.StockPriceService;

public class StockPriceServiceImpl extends com.google.gwt.user.server.rpc.RemoteServiceServlet
		implements StockPriceService {
	
	private static final long serialVersionUID = 1L;
	
	private static final double MAX_PRICE = 100.0; // $100.00
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

	@Override
	public StockPrice[] getPrices(String[] symbols) {
		Random rnd = new Random();

		StockPrice[] prices = new StockPrice[symbols.length];
		for (int i = 0; i < symbols.length; i++) {
			double price = rnd.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);

			prices[i] = new StockPrice(symbols[i], price, change);
		}

		return prices;
	}

}
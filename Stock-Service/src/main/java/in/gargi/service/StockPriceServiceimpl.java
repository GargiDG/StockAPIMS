package in.gargi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gargi.entity.StockPrice;
import in.gargi.exception.StockNotFoundException;
import in.gargi.repository.StockRepository;

@Service
public class StockPriceServiceimpl implements IStockPriceService {

	@Autowired
	private StockRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {

		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if (stockPrice == null) {
			throw new StockNotFoundException("Company not available");
		}

		return stockPrice.getCompanyPrice();
	}
}

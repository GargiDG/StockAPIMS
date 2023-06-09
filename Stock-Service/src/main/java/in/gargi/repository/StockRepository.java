package in.gargi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gargi.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {
	public StockPrice findByCompanyName(String companyName);
}

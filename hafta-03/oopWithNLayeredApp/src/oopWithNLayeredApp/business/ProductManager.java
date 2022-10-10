package oopWithNLayeredApp.business;

import java.lang.System.Logger;

// import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
  private ProductDao productDao;
  private Logger[] loggers;
  
  public ProductManager(Logger[] loggers) {
    this.loggers = loggers;
  }


  public ProductManager(ProductDao productDao, oopWithNLayeredApp.core.logging.Logger[] loggers) {
    this.productDao = productDao;
  }


  public void add(Product product) throws Exception{
    //iş kuralları
    if(product.getUnitPrice()<10) {
      throw new Exception("Urun fiyati 10'dan kucuk olamaz.");
    }
    productDao.add(product);

    for ( Logger logger:loggers ) {
      logger.log(null, product.getName());
    }
  }
}

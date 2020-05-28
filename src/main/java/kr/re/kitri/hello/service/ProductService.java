package kr.re.kitri.hello.service;

import kr.re.kitri.hello.model.Product;

public interface ProductService {
    public String retrieveProducts();
    Product viewProductDetail(int i);
}

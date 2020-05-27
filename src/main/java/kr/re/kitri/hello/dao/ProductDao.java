package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    //외부 IO를 수행하는 역할은 DAO에서 진행된다.
    public String selectProducts(){
        //DB에 접속 하여 쿼리 전송
        //MyBatis.. 활용
        return "상품목록 받으세요";
    }

    public Product selectProductById(int i) {
        //DB에서 조회
        Product p = new Product(i + "", "아이폰11", 500000, "iphone");
        return p;
    }
}

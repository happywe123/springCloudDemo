package cn.how2j.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import cn.how2j.springcloud.pojo.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Value("${server.port}")
    String port;

    public List<Product> listProducts(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port,50));
        ps.add(new Product(1,"product a from port:"+port,150));
        ps.add(new Product(1,"product a from port:"+port,250));
        return ps;
    }
}

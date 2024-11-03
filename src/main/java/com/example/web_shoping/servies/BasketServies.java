package com.example.web_shoping.servies;

import com.example.web_shoping.Basket;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Scope("Prototype")
public class BasketServies {

    private static final Log log = LogFactory.getLog( BasketServies.class );
    private final ThreadLocal<Basket> basket = ThreadLocal.withInitial(Basket::new);

    public void addItem(List<Integer> itemId) {
        basket.get().addItem(itemId);
    }

    public List<List<Integer>> getItems() {
        return basket.get().getItems();
    }

    @PostConstruct
    public void setUp(){
        log.info( "Basket Service Initialized" );
    }
    @PreDestroy
    public void destroy(){
        log.info( "Basket Service Destroyed" );
    }
}

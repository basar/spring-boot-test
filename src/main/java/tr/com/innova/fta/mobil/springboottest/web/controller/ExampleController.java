package tr.com.innova.fta.mobil.springboottest.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.innova.fta.mobil.springboottest.domain.Floor;
import tr.com.innova.fta.mobil.springboottest.service.IFloorService;

import java.util.List;

/**
 * Created by bcetinkaya
 */

@RestController
public class ExampleController {

    private final static Logger logger= LoggerFactory.getLogger(ExampleController.class);

    @Autowired
    private IFloorService floorService;

    @RequestMapping("/")
    public String home(){



        return "HelloWorld";
    }


}

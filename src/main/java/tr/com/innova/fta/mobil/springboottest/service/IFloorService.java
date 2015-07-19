package tr.com.innova.fta.mobil.springboottest.service;

import tr.com.innova.fta.mobil.springboottest.domain.Floor;

import java.util.List;

/**
 * Created by bcetinkaya
 */
public interface IFloorService {

    List<Floor> findAllFloors();

    Floor addFloor(Floor floor);

}

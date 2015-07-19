package tr.com.innova.fta.mobil.springboottest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.innova.fta.mobil.springboottest.domain.Floor;
import tr.com.innova.fta.mobil.springboottest.repository.FloorRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by bcetinkaya
 */
@Service
public class FloorService implements IFloorService {


    private FloorRepository floorRepository;

    @Autowired
    public FloorService(FloorRepository floorRepository){
        this.floorRepository = floorRepository;
    }


    public List<Floor> findAllFloors(){
        return this.floorRepository.findAll();
    }

    @Transactional
    public Floor addFloor(Floor floor){
        return this.floorRepository.saveAndFlush(floor);
    }

}

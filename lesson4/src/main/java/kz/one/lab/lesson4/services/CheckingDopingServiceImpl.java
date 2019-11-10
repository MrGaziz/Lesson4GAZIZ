package kz.one.lab.lesson4.services;

import kz.one.lab.lesson4.entity.Fighter;
import org.springframework.stereotype.Service;

@Service
public class CheckingDopingServiceImpl implements CheckingDopingService{
    public boolean checkFigher(Fighter dude){
        return dude.getPowerLevel()<10;
    }

}

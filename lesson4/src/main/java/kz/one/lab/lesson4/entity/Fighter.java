package kz.one.lab.lesson4.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class Fighter {
    @Builder.Default
    String name = "Незванный Гость";
    int strength;
    int agility;
    int skill;
    public int getPowerLevel(){
        return strength+agility+skill;
    }
}

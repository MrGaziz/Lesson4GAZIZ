package kz.one.lab.lesson4.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class Arena {
    @Builder.Default
    List<Fighter> fighters = new ArrayList<>();
}

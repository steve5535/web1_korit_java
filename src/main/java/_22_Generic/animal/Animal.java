package _22_Generic.animal;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Animal {
    private String name;
    private int size;

    public abstract void sound();
}

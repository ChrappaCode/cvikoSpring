package sk.stuba.fei.uim.oop.cviko.cviko2;

import java.util.List;

public interface IZvieraciServise {

    List<Zviera> getAll();
    Zviera vyrob(ZvieraRequest request);
    List<Zviera> getAllByName(String meno);

}

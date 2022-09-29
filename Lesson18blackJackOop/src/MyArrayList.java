import java.util.ArrayList;

public class MyArrayList extends ArrayList {
    @Override
    public String toString() {
        return "MyArrayList{" +
                "modCount=" + modCount +
                '}';
    }
}

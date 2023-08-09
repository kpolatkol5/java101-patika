public class Student<T> implements Idatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("veri eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {

        System.out.println("veri silindi");
        return true;

    }

    @Override
    public boolean updata(T data) {
        System.out.println(" güncellendi");

        return true;

    }

    @Override
    public void select(T data) {
        System.out.println("veri seçildi");

    }
}

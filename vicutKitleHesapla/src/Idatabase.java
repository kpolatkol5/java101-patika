public interface Idatabase<T> {
    public boolean insert(T data);

    public boolean delete(T data);

    public boolean updata(T data);

    public void select(T data);

}

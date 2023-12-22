package Dao;

import java.util.ArrayList;


public interface DaoInterface<T> {
	public int Insert(T t);
	public int Delete(T t);
	public int Update(T t);
	public ArrayList<T> SelectAll();
	public T SelectByID(T t);
	public ArrayList<T> SelectCondition(String condition);
	
}

package lesson11.lecture.jdbc.framework.dataaccess.intface;
import dataaccess.*;
public class DataAccessFactory {
	public static dataaccess.DataAccess getDataAccess() {
		return new DataAccessSubsystemFacade();
	}
}

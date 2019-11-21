import java.rmi.RemoteException;

import java.rmi.*;
public interface AddServerInterface extends Remote{
	 int add(int x, int y) throws RemoteException; 
}

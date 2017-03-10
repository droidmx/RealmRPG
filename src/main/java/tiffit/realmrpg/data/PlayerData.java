package tiffit.realmrpg.data;

public class PlayerData {

	//Transient = gson wont see this field when turning this class into a json
	/**Discord User ID*/
	public transient final String ID; 
	
	
	public PlayerData(String id) {
		ID = id;
	}

}

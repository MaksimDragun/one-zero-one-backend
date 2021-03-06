package org.dragberry.ozo.common.levelresult;

import java.io.Serializable;
import java.text.MessageFormat;

public class NewLevelResultResponse<V extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1771865981934548201L;
	
	private V value;
	
	private boolean personal;
	
	private boolean worlds;
	
	public NewLevelResultResponse(V value, boolean worlds, boolean personal) {
		this.value = value;
		this.worlds = worlds;
		this.personal = this.worlds ? true : personal;
	}
	
	public NewLevelResultResponse() {}

	@Override
	public String toString() {
		return MessageFormat.format("ResultResponse: value=[{0}]; worlds=[{1}]; personal=[{2}]", value, worlds, personal);
	}
	
	public V getValue() {
		return value;
	}

	public boolean isPersonal() {
		return personal;
	}

	public boolean isWorlds() {
		return worlds;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void setPersonal(boolean personal) {
		this.personal = personal;
	}

	public void setWorlds(boolean worlds) {
		this.worlds = worlds;
	}

}

package org.dragberry.ozo.common;

public interface DomainEnum<V> {

	String UNKNOWN_VALUE_MSG = "Unknown Action value: {0}!";
	String NPE_MSG = "Action cannot be null!";
	
	V getValue();
	
}

package com.study.java;

import java.util.Objects;

public class Study {
	public int id;
	public String topic;
	public Boolean hasBrain;
	/*
	 * @Override public int hashCode() { return Objects.hash(hasBrain, id,
	 * topic); }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Study other = (Study) obj;
		return Objects.equals(hasBrain, other.hasBrain) && id == other.id
				&& Objects.equals(topic, other.topic);
	}

}

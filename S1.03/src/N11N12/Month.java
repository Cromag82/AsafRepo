package N11N12;

import java.util.Objects;

public class Month {
	
	private String month;
	
	public Month(String name) {
	this.month = name;
	}
	
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}



	@Override
	public int hashCode() {
		return Objects.hash(month);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(month, other.month);
	}
}



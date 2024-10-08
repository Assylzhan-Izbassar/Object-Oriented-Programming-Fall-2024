package Ex2;

import java.util.Objects;

public class Good {
	public int x;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Good)) return false;
		
		Good g = (Good) o;
		
		return this.x == g.x;
	}
	
	@Override
	public String toString() {
		return this.x + "";
	}
}

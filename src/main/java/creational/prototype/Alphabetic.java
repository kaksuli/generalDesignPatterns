package creational.prototype;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.
 *
 * Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.
 * Prototype design pattern uses java cloning to copy the object.
 *
 * @author sulaiman kadkhodaei
 *
 * Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
 * It should not be done by any other class.
 * However whether to use shallow or deep copy of the Object properties depends on the requirements and its a design decision.
 */

@Getter
public class Alphabetic implements Cloneable {

	private List<String> alphabeticList;

	public Alphabetic() {
		alphabeticList = new ArrayList<>();
	}

	public Alphabetic(List<String> list) {
		this.alphabeticList = list;
	}

	public void loadData() {
		alphabeticList.add("A");
		alphabeticList.add("B");
		alphabeticList.add("C");
		alphabeticList.add("D");
	}

	//Notice that the clone method is overridden to provide a deep copy of the alphabetic list.
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Alphabetic(new ArrayList<>(this.getAlphabeticList()));
	}

}
package gupta.shanu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle2 implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	//@Required
	//@Autowired
	//@Qualifier("circleRelated")
	//Resource
	@Resource(name="point3")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle: ");
		System.out.println("Center: (" + center.getX() + "," + center.getY() + ")");
	}
	
	@PostConstruct
	public void myInit(){
		System.out.println("myInit gets called");
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("cleanUp gets called");
	}

}

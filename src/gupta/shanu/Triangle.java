package gupta.shanu;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape, InitializingBean, DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Drawing Triangle");
		System.out.println("PointA = (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("PointB = (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("PointC = (" + pointC.getX() + "," + pointC.getY() + ")");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean of triangle gets called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean of triangle gets called");
	}
	
	public void myInit(){
		System.out.println("myInit method of triangle gets called");
	}
	
	public void cleanUp(){
		System.out.println("cleanUp method of triangle gets called");
	}
}

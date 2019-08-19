package com.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera= new Camera();
	}
	public Mobile(Camera camera) {
		this.camera=camera;
	}
	
	public boolean startPhotoApp() {
		// TODO Auto-generated method stub
		//return true;
		
		System.out.println("Inside photo app method");
		if(camera.on())
		{
			System.out.println("positive code path");
			System.out.println("Assume some hardware interaction happens here");
			return true;
		}
		
		System.out.println("Negative code path");
		System.out.println("Assume somre exception handling and  error log happens here");
		return false;
	}

}

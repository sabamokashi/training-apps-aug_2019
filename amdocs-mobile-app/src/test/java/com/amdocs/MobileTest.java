package com.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;

import org.mockito.Mockito;
;
public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraFunctionsNormally() {
	//mocking - creating dummy Camera object with no original code
	Camera mockedCamera = Mockito.mock(Camera.class);
	//stubbing -  hard coding response of dependent method
	Mockito.when(mockedCamera.on()).thenReturn(true);
	//Dependency injection
	Mobile mobile = new Mobile(mockedCamera);
	
	
	boolean actualResponse = mobile.startPhotoApp();
	boolean expectedResponse= true;
	
	assertEquals(expectedResponse, actualResponse);
	
	//verify the camera on() method invoking with the startphotoapp() method
	Mockito.verify(mockedCamera, Mockito.times(1)).on();
	
	
	
	}

}

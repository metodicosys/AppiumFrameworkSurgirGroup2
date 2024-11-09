package org.meto.appium.utils;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class scroll_sequence {
	
	//AndroidDriver driver;
	static AppiumDriver driver;
	
	public scroll_sequence(AppiumDriver driver)
	{
		scroll_sequence.driver = driver;
		driver.findElement(AppiumBy.accessibilityId("swipe")).click();
		scroll_sequence.scrollexact();
		
	}
	
	
	
	public static void scrollexact() {
		Dimension size = scroll_sequence.driver.manage().window().getSize();
		System.out.println(size);
		Point midPoint = new Point((int)(size.width * 0.5),(int)(size.height * 0.5));
		int bottom = midPoint.y + (int)(midPoint.y * 0.75);
		int top = midPoint.y - (int)(midPoint.y * 0.80);
		
		Point Start = new Point(midPoint.x, bottom);
		Point End = new Point(midPoint.x, top);
		
		swipe(Start, End, Duration.ofMillis(500));
	//	swipe(Start, Duration.ofMillis(300));
		
	}
	
	
	protected static void swipe(Point start, Point end, Duration duration) { //  Point end,
		// TODO Auto-generated method stub
		PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
		Sequence swipe = new Sequence(input, 0);
		swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
		swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		
		swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
		swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		((AppiumDriver)scroll_sequence.driver).perform(ImmutableList.of(swipe));
		
		
	}

	
}

ScrollView
==========

### The Introduction:

ScrollView is the action in which you can scroll up and down in an Android
application. It is very useful for the continuation of displaying information if
not everything can fit on the screen at one time. Incorporating this view can
make applications cleaner looking and more user friendly. Below is a visual
representation of the ScrollView, and its basic usage.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/ryanScrollTest.gif)

### The History:

Introduced in API level \#1, that makes ScrollView a grandfather compared to
most subsequently following packages in later versions. It originates from the
package: android.widgets

### The major methods/attributes:

As this is a View, there aren’t many methods/attributes to get this widget
going. One notable piece of information however is that the ScrollView can
contain only one child.

The methods that I have found useful:

-   pageScroll (int direction) - The ScrollView will shift one page down or up
    on a shortcut press.

-   scrollTo(int x, int y) and smoothScrollTo(int x, int y) - this method
    scrolls to the corresponding x and y values within the scroll view. Can be
    very useful for longer than normal ScrollViews. The main difference between
    the two methods is that scrollTo will immediately jump to the x,y and
    smoothScrollTo will perform an animation while scrolling.

-   onTouchEvent(MotionEvent ev) - this method when called can determine what
    type of event is occurring on the screen. By checking for if the user
    scrolls using ACTION_SCROLL, one could trigger an event with a scroll.

### An example project:

Step 1: Create the ScrollView by editing the xml to adopt the entire view as a
ScrollView.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout.gif)

Step 2: Add a layout of your choice to the ScrollView.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout2.gif)

Step 3: Add the desired fields into your layout of choice.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout3.gif)

Step 4: After finishing your view jump to the code!

### The code: 

 

### The reference:

 

CN Tower Picture

https://en.wikipedia.org/wiki/File:Toronto_-_ON_-_Toronto_Harbourfront7.jpg

 

 

 

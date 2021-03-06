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

The methods that I have found useful, practical, and have used personally in
apps:

-   **pageScroll (int direction)** - The ScrollView will shift one page down or
    up on a shortcut press. View.FOCUS_UP to go up one page, and View.FOCUS_DOWN
    to go down one page. Added in API Level 1.

-   **scrollTo(int x, int y)** and **smoothScrollTo(int x, int y)** - this
    method scrolls to the corresponding x and y values within the scroll view.
    Can be very useful for longer than normal ScrollViews. The main difference
    between the two methods is that scrollTo will immediately jump to the x,y
    and smoothScrollTo will perform an animation while scrolling. Added in API
    Level 1.

-   **getHeight()** - This method will get the height of your current android
    device. By doing this, you can correctly determine that your ScrollView can
    work on all devices appropriately, depending on your use.

### An example project:

**Step 1:** Create the ScrollView by editing the xml to adopt the entire view as
a ScrollView. This will make your current activity available to be adopted into
a ScrollView.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout.gif)

**Step 2:** Add a layout of your choice to the ScrollView. Because the
ScrollView is only able to have one child, you must decide what type of layout
you will be using within your ScrollView activity.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout2.gif)

**Step 3:** Add the desired fields into your layout of choice.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout3.gif)

**Step 4:** Remember to set IDs for your meaningful fields. By setting the
appropriate IDs, you can find and initialize your fields, buttons and more in
your code which we will cover in the code section.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout4.gif)

**Step 5:** After finishing your view jump to the code!

### The code:

**Step 1:** Initialize your views. By initializing your views in one general
location. Your code can become easier to maintain and easier to read by outside
sources.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/code1.png)

**Step 2:** Initialize your buttons to listen for a trigger or event. By having
your buttons ‘listen’ for an event to occur, your application can do anything
you tell it to within that instance!

![](https://github.com/rfmaynard/ScrollView/blob/master/images/code2.png)

**Step 3:** Decide what your click listener is going to do. For this example we
are going to decide that the jump listener will jump to the top of the activity.
What we first must be made aware of is the getHeight() method, as mentioned
above. By letting the ScrollView get the height of the device we are running
this on, we can safely run the scrollTo or smoothScrollTo methods without any
worry of over extending where we wish to jump to.

![](https://github.com/rfmaynard/ScrollView/blob/master/images/code3.png)

**Step 4:** Have fun with the coding! I have attached code
[HERE](https://github.com/rfmaynard/ScrollView/tree/master/ScrollViewCode) with
other examples you can try playing around with. Included are the above mentioned
methods from ‘The History’ section. Enjoy!

### The Final Product:

![](https://github.com/rfmaynard/ScrollView/blob/master/images/scrollLayout_final.gif)

### References:

CN Tower Picture

https://en.wikipedia.org/wiki/File:Toronto_-*ON*-_Toronto_Harbourfront7.jpg

Sunset Portrait

https://www.flickr.com/photos/leppre/25586215627

Android Documentation

https://developer.android.com/reference/android/widget/ScrollView

 

 

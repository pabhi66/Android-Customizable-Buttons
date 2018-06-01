![sample](https://i.imgur.com/OJ2qtWT.png)

<p align="center">
  
  <a href="https://android-arsenal.com/api?level=14">
    <img src="https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat" alt="Gratipay"></a>
  
  <a href="https://travis-ci.org/GabrielGouv/Android-Customizable-Buttons">
    <img src="https://travis-ci.org/GabrielGouv/Android-Customizable-Buttons.svg?branch=master" alt="Gratipay"></a>
  
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="Gratipay"></a>
    
 </p>

<br>

Create an XML file that represents the button states? Create an XML file that represents each button state? No more. Customizable Buttons is a library for Android built in **Kotlin**, you can easily create custom buttons for your app!

**NOTE:** This is a work in progress and is not recommended to use in your project yet. **The documentation and plugin repository will be added soon**, when the project reaches a more mature stage.

<br><br>
<p align="center">
  <img src="https://i.imgur.com/Ypw9tGn.gif">
</p>

# Usage

In this basic example you can see how to easily create a custom button with ripple effect. Check the [Wiki](https://github.com/GabrielGouv/Android-Customizable-Buttons/wiki) for more examples.

### XML:
```XML
<com.github.gabrielgouv.customizablebuttons.CustomizableButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:cb_text="Normal / Enabled"
        app:cb_textColorNormal="#DAEBF2"
        app:cb_textAllCaps="true"
        app:cb_elevation="4dp"
        app:cb_useRippleEffect="true"
        app:cb_rippleColor="#012C40"
        app:cb_rippleOpacity="1"
        app:cb_backgroundColorNormal="#00708C"
        app:cb_backgroundColorPressed="#012C40"
        app:cb_borderColorNormal="#012C40"
        app:cb_borderThicknessNormal="2dp"
        app:cb_borderRadiusNormal="30dp" />
```

##### Button with progress bar
```XML
<com.github.gabrielgouv.customizablebuttons.CustomizableButtonWithProgressBar
        android:id="@+id/progressButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
```
```KOTLIN
    val progressButton = findViewById(R.id.progressButton)
    progressButton.isLoading = true
```

You can use `android:enabled="false"` or `app:cb_enabled="false"` to set your button disabled. You can check the [**Button XML Attributes**](https://github.com/GabrielGouv/Android-Customizable-Buttons/wiki/Button-XML-Attributes) for more information about attributes.

### Result:
![sample](https://i.imgur.com/AgpE30d.gif)
![sample](https://user-images.githubusercontent.com/11162404/40819636-181a04c8-652a-11e8-9909-845c10b9ea3e.png)

# License

```
MIT License

Copyright (c) 2017 João Gabriel Gouveia de Almeida

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```


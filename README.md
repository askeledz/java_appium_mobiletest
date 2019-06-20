Mobile Appium Tests
===================

Following may be useful:

- Appium Desktop - https://github.com/appium/appium-desktop/releases/latest 
- Appium Studio - https://experitest.com/mobile-test-automation/appium-studio/
- Android Studio (Allows you to install SDK and Emulators) - https://developer.android.com/studio/index.html
- XCode - https://developer.apple.com/xcode/


## Prerequisites

- Follow the instrcuctions:
    https://www.swtestacademy.com/how-to-install-appium-on-mac/

- Put the following into .zshrc or .bashrc
```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
export ANDROID_HOME=/Users/username/Library/Android/sdk
export JMETER_HOME=/Users/username/Documents/Private/Development/workspace/apache-jmeter-5.1.1
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export PATH=$ANDROID_HOME/tools/bin:$PATH
export PATH=$JMETER_HOME/bin:$PATH
export PATH=/usr/local/Cellar/maven/3.6.1/bin:$PATH
export PATH=/usr/local/bin:$PATH
launchctl setenv ANDROID_HOME /Users/username/Library/Android/sdk
```

- If you prefer Appium Desktop, you need to setup ANDROID_HOME and JAVA_HOME under Appium/Configurations.


## Android 

## Run Android emulator and get ID
```
-    cd ~/Library/Android/sdk/tools
get Emulator Name
-    ${ANDROID_HOME}/emulator/emulator -avd -list-avds
run Emulator
-    ${ANDROID_HOME}/emulator/emulator -avd Pixel_2_API_25
```  
-OR

```
    Your emulator is out of date, please update by launching Android Studio:
 -  Start Android Studio
 -  Select menu "Tools > Android > SDK Manager"
 -  Click "SDK Tools" tab
 -  Check "Android Emulator" checkbox
 -  Click "OK"
```

### Run Android test from CMD 

get Emulator ID and run test
-    adb devices
-    mvn clean test -P android -Dtest=AndroidTest01 -Ddevice=androidsim -Ddevice.id=emulator-5554 -DpathToAppFile=/Users/askeledzija/Documents/Private/Development/workspace/autotest-appium-template/Ioniq.apk -DappiumServerURL=http://127.0.0.1:4723/wd/hub



### Inspect Android app element

Using Inspector session in Appium Desktop
Import dependencies:
e.g

    {
    "app": "/Users/{username}/path/to/app-staging-release.apk",
    "VERSION": "9.0",
    "deviceName": "Android device",
    "platformName": "Android"
    }


- OR 

Using UIAutomatorViewer
```
${ANDROID_SDK_ROOT}/emulator/emulator -avd -list-avds

adb kill-server

${ANDROID_SDK_ROOT}/emulator/emulator -avd Nexus_5X_API_28

adb start-server

adb devices

Install the app: 

adb -s emulator-5554 install /Users/{username}/path/to/app-staging-release.apk

(If the installation is successful then you will get your app in the launcher of your android emulator.)

Run UIAutomatorViewer
uiautomatorviewer
```
- OR 
```
Using AppiumStudio

${ANDROID_SDK_ROOT}/emulator/emulator -avd -list-avds

adb kill-server

${ANDROID_SDK_ROOT}/emulator/emulator -avd Nexus_5X_API_28

adb start-server

adb devices

Run Appium Studio
    - Add Device (Emulator-5554)
    - Import app
    - Run app
    - Select the app and Start Recording.
```


## iOS

### Run IOS simulator and get ID

 -  Start Xcode
 -  Build project against iOS simulator

   Go to CMD and get ID:
 - xcrun simctl list | egrep '(Booted)'


### Run iOS test on simulator from CMD
```
    mvn clean test -P ios -Dtest=IOSTest01 -Ddevice=iphonesim -Ddevice.id=43DB6B26-FB51-456D-A4F4-C50B367C24DF -DpathToAppFile=/Users/askeledzija/Library/Developer/Xcode/DerivedData/Ioniq-czckahckwnmqfhdjtqoykgvbvlyg/Build/Products/qa.debug-iphonesimulator/Ioniq.app -DappiumServerURL=http://127.0.0.1:4723/wd/hub
```

### For Real Apple devices follow the instructions:

e.g:

Prerequesit: -->
https://github.com/appium/appium-xcuitest-driver/blob/master/docs/real-device-config.md

Build WebDriverAgentRunner: -->
```
    xcodebuild -project WebDriverAgent.xcodeproj -scheme WebDriverAgentRunner -destination 'id=c90fffb424403ecceab1707cc65bff6d7e6828c3' test
```
Run test on Real device: -->
```
    mvn clean test -P ios -Dtest=AppiumTest02 -Ddevice=iphone -Ddevice.id=c90fffb424403ecceab1707cc65bff6d7e6828c3 -    DpathToAppFile=/Users/{username}/Library/Developer/Xcode/DerivedData/AppName-czckahckwnmqfhdjtqoykgvbvlyg/Build/Products/dev.debug-iphonesimulator/appname.app -DappiumServerURL=http://127.0.0.1:4723/wd/hub
```
//-DbundleID=test4u.iosappaskeledz


### Inspect iOS app element

Start XCode and run the app on simulator
XCode --> Open Developer tool --> Accessibility Inspector


Appium Inspector:
```
       {
        "platformName": "iOS",
        "platformVersion": "12.2",
        "deviceName": "iPhone XR",
        "automationName": "XCUITest",
        "app": "/Users/{username}/Library/Developer/Xcode/DerivedData/Ioniq-czckahckwnmqfhdjtqoykgvbvlyg/Build/Products/qa.debug-iphonesimulator/Ioniq.app"
        }
```

### How do I run tests?
        
- If you want to specify a specific Appium server you can use:

        mvn clean test -P <profileName> -Dtest=<testClassName> -Ddevice=androidsim -Ddevice.id=emulator-5554 -DpathToAppFile=<pathToAppFile> -DappiumServerURL=http://127.0.0.1:4723/wd/hub     

You can specify which device type to use by using one of the following switches:

- `-Ddevice=android`
- `-Ddevice=androidsim`
- `-Ddevice=iphone`
- `-Ddevice=iphonesim`
- `-Ddevice=ipad`
- `-Ddevice=windows`

If the tests fail screenshots will be saved in ${project.basedir}/target/screenshots

### Selenium Grid support

- `remoteDriver` - Connect to a selenium Grid (e.g. Sauce Labs).
- `gridURL` - URL for the selenium grid you want to connect to.
- `appiumVersion` - The version of Appium required to run the tests

### Additional information for setting up iOS Devices

Read https://github.com/appium/appium-xcuitest-driver for XCUITest support, the brew commands below have been taken from their README.md.

    brew install libimobiledevice --HEAD
    brew install carthage

If things don't work, check https://github.com/appium/appium-xcuitest-driver to see if anything has changed

You will need to place a appium.xcconfig in the `${project.basedir}/src/test/resources` directory.

Devices used for performing tests need to be added to https://developer.apple.com/account/ios/device/
Machines running tests will need to download a test certificate from https://developer.apple.com/account/ios/certificate/development (Do this via Xcode)

In iOS8, devices each have their own setting which enables or disables UIAutomation, It lives in the “Developer” view in the Settings app. You need to verify that UIAutomation is enabled in this view before the simulator or device can be used..

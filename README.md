# Android P Activity Lifecycle Bug
This is a sample app that demonstrates an Android P lifecycle bug.

## Issue:
When resuming an app from the Overview (multitasking) screen, `Activity.onResume()` is called for all activities in the app backstack when `android:windowIsTranslucent="true"` is applied to the app theme (or each Activity theme). This is a regressionn from Android Oreo, and all lower API levels. Only the topmost screen should see the `Activity.onResume()` event.

## Steps to reproduce:
1. Open default launcher activity, `MainActiivty`
2. Tap the "Go to Second Activity" button to go to `SecondActivity`
3. Tap the "Go to Third Activity" button to go to `ThirdActivity`
4. Open the Overview (multitasking) screen
5. Go back to the sample app
6. Observe Logcat results

## Expected Logcat results:
``` 
D/ThirdActivity: onResume()
``` 

## Actual Logcat results:
``` 
D/ThirdActivity: onResume()
D/SecondActivity: onResume()
D/MainActivity: onResume()
```

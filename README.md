# Reusable WebView Container
A WebView container. Just replace the

* Logo

* App name -> go to "app\src\main\res\values\strings.xml". You can edit it there.

* webURL -> go to "app\src\main\java/com/yusuf/codegridx/MainActivity.kt".
  You'll see a variable there called "webURL". But don't for get the blackslash at the end i.e "https:\\google.com\".
  Also, I think it has to be https, i'm not sure again 

And you're done. I have also setup CI/CD so you can just download the APK as an artifact on github.
Finally, "webView.settings.javaScriptEnabled" is set to true...Do with that information as you'd like

The more I use it, the more features I will add or edit

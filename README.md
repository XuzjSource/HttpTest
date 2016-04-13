# HttpTest
Android上发送 HTTP请求，一种是HttpURLConnection ，一种使用OKHttpUtils库

MainActivity中的按钮调用HttpURLConnection来发送HTTP请求，原理。不可在主线程中更新UI和访问网络。
SecondActivity 调用okhttp-utils库，git网站 https://github.com/hongyangAndroid/okhttp-utils。
直接用okhttp-utils的jar包，okhttp应使用3.0以上版本。可直接更新UI。

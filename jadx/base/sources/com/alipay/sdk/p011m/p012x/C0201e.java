package com.alipay.sdk.p011m.p012x;

import OoooooO.C21445Oooo;
import android.R;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.app.H5PayActivity;
import com.aspose.slides.C22218Oooo;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.reflect.Method;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25056OooOO0o;
import o00Oo0oO.OooOOOO;
import o0oOO.C30799OooO0oO;
import o0oOO.RunnableC30797OooO0o;
import o0oOO.RunnableC30798OooO0o0;

/* JADX INFO: renamed from: com.alipay.sdk.m.x.e */
/* JADX INFO: loaded from: classes.dex */
public class C0201e extends LinearLayout {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final Handler f66872Oooo00O = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final TextView f66873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f66874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ProgressBar f66875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageView f66876OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public WebView f66877OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InterfaceC22157OooO0o0 f66878OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22156OooO0Oo f66879OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO0o f66880OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public InterfaceC22158OooO0oO f66881OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final float f66882Oooo000;

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO00o */
    public class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC19049OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ View f66884OooOo0o;

            public RunnableC19049OooO00o(View view) {
                this.f66884OooOo0o = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f66884OooOo0o.setEnabled(true);
            }
        }

        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC22158OooO0oO interfaceC22158OooO0oO = C0201e.this.f66881OooOooo;
            if (interfaceC22158OooO0oO != null) {
                view.setEnabled(false);
                C0201e.f66872Oooo00O.postDelayed(new RunnableC19049OooO00o(view), 256L);
                C0201e c0201e = C0201e.this;
                if (view == c0201e.f66874OooOo0o) {
                    C0200d c0200d = (C0200d) interfaceC22158OooO0oO;
                    synchronized (c0200d) {
                        c0200d.OooO();
                    }
                } else if (view == c0201e.f66876OooOoO0) {
                    synchronized (((C0200d) interfaceC22158OooO0oO)) {
                        c0201e.getWebView().reload();
                        c0201e.getRefreshButton().setVisibility(4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0O0 */
    public class OooO0O0 extends WebChromeClient {
        public OooO0O0() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C0200d c0200d = (C0200d) C0201e.this.f66878OooOoo;
            synchronized (c0200d) {
                try {
                    if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                        c0200d.f66858OooOo0o.runOnUiThread(new RunnableC30798OooO0o0(c0200d));
                    }
                    jsPromptResult.cancel();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            C0201e c0201e = C0201e.this;
            if (!c0201e.f66879OooOoo0.f66888OooO0O0) {
                c0201e.f66875OooOoO.setVisibility(8);
            } else {
                if (i > 90) {
                    c0201e.f66875OooOoO.setVisibility(4);
                    return;
                }
                if (c0201e.f66875OooOoO.getVisibility() == 4) {
                    c0201e.f66875OooOoO.setVisibility(0);
                }
                c0201e.f66875OooOoO.setProgress(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            C0201e c0201e = C0201e.this;
            C0200d c0200d = (C0200d) c0201e.f66878OooOoo;
            synchronized (c0200d) {
                if (!str.startsWith("http") && !c0201e.getUrl().endsWith(str)) {
                    c0200d.f66864OooOooo.getTitle().setText(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0OO */
    public class OooO0OO extends WebViewClient {
        public OooO0OO() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            C0201e c0201e = C0201e.this;
            C0200d c0200d = (C0200d) c0201e.f66880OooOooO;
            synchronized (c0200d) {
                o00OOOOo.OooO00o.OooO0OO(c0200d.f66861OooOoo, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + OooOOOO.OooOOo(str));
                C0201e c0201e2 = c0200d.f66864OooOooo;
                if (c0201e2 != null) {
                    c0201e2.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                }
                c0201e.getRefreshButton().setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C0201e c0201e;
            C0200d c0200d = (C0200d) C0201e.this.f66880OooOooO;
            synchronized (c0200d) {
                o00OOOOo.OooO00o.OooO0OO(c0200d.f66861OooOoo, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + OooOOOO.OooOOo(str));
                if (!TextUtils.isEmpty(str) && !str.endsWith(".apk") && (c0201e = c0200d.f66864OooOooo) != null) {
                    c0201e.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                }
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C0201e c0201e = C0201e.this;
            C0200d c0200d = (C0200d) c0201e.f66880OooOooO;
            synchronized (c0200d) {
                c0200d.f66863OooOooO = true;
                o00OOOOo.OooO00o.OooO0oO(c0200d.f66861OooOoo, "net", "webError", "onReceivedError:" + i + "|" + str2);
                c0201e.getRefreshButton().setVisibility(0);
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C0200d c0200d = (C0200d) C0201e.this.f66880OooOooO;
            synchronized (c0200d) {
                H5PayActivity h5PayActivity = c0200d.f66858OooOo0o;
                if (h5PayActivity == null) {
                    return;
                }
                o00OOOOo.OooO00o.OooO0oO(c0200d.f66861OooOoo, "net", "SSLError", "2-" + sslError);
                h5PayActivity.runOnUiThread(new RunnableC30797OooO0o(c0200d, h5PayActivity, sslErrorHandler));
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C0200d c0200d = (C0200d) C0201e.this.f66880OooOooO;
            synchronized (c0200d) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    H5PayActivity h5PayActivity = c0200d.f66858OooOo0o;
                    if (h5PayActivity == null) {
                        return true;
                    }
                    if (OooOOOO.OooO0oo(h5PayActivity, str, c0200d.f66861OooOoo)) {
                        return true;
                    }
                    if (str.startsWith("alipayjsbridge://")) {
                        c0200d.OooO0o(str.substring(17));
                    } else if (TextUtils.equals(str, "sdklite://h5quit")) {
                        c0200d.OooO0Oo(false);
                    } else if (str.startsWith(HttpUtils.HTTP_PREFIX) || str.startsWith("https://")) {
                        c0200d.f66864OooOooo.OooO0O0(str);
                    } else {
                        try {
                            Intent intent = new Intent();
                            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setData(Uri.parse(str));
                            h5PayActivity.startActivity(intent);
                        } catch (Throwable th) {
                            C25047OooO00o c25047OooO00o = c0200d.f66861OooOoo;
                            if (c25047OooO00o != null) {
                                String simpleName = th.getClass().getSimpleName();
                                o00OOOOo.OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
                                oooO0OO.getClass();
                                oooO0OO.OooO0o("biz", simpleName, o00OOOOo.OooO0OO.OooO0OO(th));
                            }
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22156OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f66887OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f66888OooO0O0;

        public C22156OooO0Oo(boolean z, boolean z2) {
            this.f66887OooO00o = z;
            this.f66888OooO0O0 = z2;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0o */
    public interface OooO0o {
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC22157OooO0o0 {
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC22158OooO0oO {
    }

    public C0201e(H5PayActivity h5PayActivity, C22156OooO0Oo c22156OooO0Oo) {
        super(h5PayActivity, null);
        OooO00o oooO00o = new OooO00o();
        this.f66879OooOoo0 = c22156OooO0Oo;
        this.f66882Oooo000 = h5PayActivity.getResources().getDisplayMetrics().density;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(h5PayActivity);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(c22156OooO0Oo.f66887OooO00o ? 0 : 8);
        ImageView imageView = new ImageView(h5PayActivity);
        this.f66874OooOo0o = imageView;
        imageView.setOnClickListener(oooO00o);
        ImageView imageView2 = this.f66874OooOo0o;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f66874OooOo0o.setImageDrawable(C25056OooOO0o.OooO00o(h5PayActivity, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg=="));
        this.f66874OooOo0o.setPadding(OooO00o(12), 0, OooO00o(12), 0);
        linearLayout.addView(this.f66874OooOo0o, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(h5PayActivity);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(OooO00o(1), OooO00o(25)));
        TextView textView = new TextView(h5PayActivity);
        this.f66873OooOo = textView;
        textView.setTextColor(-15658735);
        this.f66873OooOo.setTextSize(17.0f);
        this.f66873OooOo.setMaxLines(1);
        this.f66873OooOo.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(OooO00o(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f66873OooOo, layoutParams);
        ImageView imageView3 = new ImageView(h5PayActivity);
        this.f66876OooOoO0 = imageView3;
        imageView3.setOnClickListener(oooO00o);
        this.f66876OooOoO0.setScaleType(scaleType);
        this.f66876OooOoO0.setImageDrawable(C25056OooOO0o.OooO00o(h5PayActivity, "iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII="));
        this.f66876OooOoO0.setPadding(OooO00o(12), 0, OooO00o(12), 0);
        linearLayout.addView(this.f66876OooOoO0, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, OooO00o(48)));
        ProgressBar progressBar = new ProgressBar(h5PayActivity, null, R.style.Widget.ProgressBar.Horizontal);
        this.f66875OooOoO = progressBar;
        progressBar.setProgressDrawable(h5PayActivity.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f66875OooOoO.setMax(100);
        this.f66875OooOoO.setBackgroundColor(-218103809);
        addView(this.f66875OooOoO, new LinearLayout.LayoutParams(-1, OooO00o(2)));
        OooO0Oo(h5PayActivity);
    }

    public final int OooO00o(int i) {
        return (int) (i * this.f66882Oooo000);
    }

    public final void OooO0O0(String str) {
        this.f66877OooOoOO.loadUrl(str);
        WebView webView = this.f66877OooOoOO;
        int i = AbstractC0199c.f66856OooOoO0;
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public final void OooO0OO() {
        removeAllViews();
        this.f66877OooOoOO.removeAllViews();
        this.f66877OooOoOO.setWebViewClient(null);
        this.f66877OooOoOO.setWebChromeClient(null);
        this.f66877OooOoOO.destroy();
    }

    public final void OooO0Oo(H5PayActivity h5PayActivity) {
        WebView webView = new WebView(h5PayActivity);
        this.f66877OooOoOO = webView;
        webView.setVerticalScrollbarOverlay(true);
        WebView webView2 = this.f66877OooOoOO;
        String userAgentString = webView2.getSettings().getUserAgentString();
        WebSettings settings = webView2.getSettings();
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(userAgentString);
        sbOooO0OO.append(C21445Oooo.OooO0O0(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0(" (", "Android " + Build.VERSION.RELEASE, ";", OooOOOO.OooOOO(), ";"), h5PayActivity.getResources().getConfiguration().locale.toString(), ";;", OooOOOO.OooOOOo(h5PayActivity), ")(sdk android)"));
        settings.setUserAgentString(sbOooO0OO.toString());
        WebSettings settings2 = this.f66877OooOoOO.getSettings();
        settings2.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings2.setSupportMultipleWindows(true);
        settings2.setUseWideViewPort(true);
        settings2.setAppCacheMaxSize(HttpRequest.DEFAULT_PROGRESS_STEP_SIZE);
        settings2.setAppCachePath(h5PayActivity.getCacheDir().getAbsolutePath());
        settings2.setAllowFileAccess(false);
        settings2.setTextSize(WebSettings.TextSize.NORMAL);
        settings2.setAllowFileAccessFromFileURLs(false);
        settings2.setAllowUniversalAccessFromFileURLs(false);
        settings2.setAppCacheEnabled(true);
        settings2.setJavaScriptEnabled(true);
        settings2.setSavePassword(false);
        settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        settings2.setCacheMode(1);
        settings2.setDomStorageEnabled(true);
        settings2.setAllowContentAccess(false);
        this.f66877OooOoOO.setVerticalScrollbarOverlay(true);
        this.f66877OooOoOO.setDownloadListener(new C30799OooO0oO(h5PayActivity));
        try {
            try {
                this.f66877OooOoOO.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f66877OooOoOO.removeJavascriptInterface("accessibility");
                this.f66877OooOoOO.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.f66877OooOoOO.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (method != null) {
                method.invoke(this.f66877OooOoOO, "searchBoxJavaBridge_");
                method.invoke(this.f66877OooOoOO, "accessibility");
                method.invoke(this.f66877OooOoOO, "accessibilityTraversal");
            }
        }
        WebView webView3 = this.f66877OooOoOO;
        int i = AbstractC0199c.f66856OooOoO0;
        if (webView3 != null) {
            try {
                webView3.resumeTimers();
            } catch (Throwable unused3) {
            }
        }
        addView(this.f66877OooOoOO, new LinearLayout.LayoutParams(-1, -1));
    }

    public ImageView getBackButton() {
        return this.f66874OooOo0o;
    }

    public ProgressBar getProgressbar() {
        return this.f66875OooOoO;
    }

    public ImageView getRefreshButton() {
        return this.f66876OooOoO0;
    }

    public TextView getTitle() {
        return this.f66873OooOo;
    }

    public String getUrl() {
        return this.f66877OooOoOO.getUrl();
    }

    public WebView getWebView() {
        return this.f66877OooOoOO;
    }

    public void setChromeProxy(InterfaceC22157OooO0o0 interfaceC22157OooO0o0) {
        this.f66878OooOoo = interfaceC22157OooO0o0;
        if (interfaceC22157OooO0o0 == null) {
            this.f66877OooOoOO.setWebChromeClient(null);
        } else {
            this.f66877OooOoOO.setWebChromeClient(new OooO0O0());
        }
    }

    public void setWebClientProxy(OooO0o oooO0o) {
        this.f66880OooOooO = oooO0o;
        if (oooO0o == null) {
            this.f66877OooOoOO.setWebViewClient(null);
        } else {
            this.f66877OooOoOO.setWebViewClient(new OooO0OO());
        }
    }

    public void setWebEventProxy(InterfaceC22158OooO0oO interfaceC22158OooO0oO) {
        this.f66881OooOooo = interfaceC22158OooO0oO;
    }
}

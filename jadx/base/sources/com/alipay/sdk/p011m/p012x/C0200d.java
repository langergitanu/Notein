package com.alipay.sdk.p011m.p012x;

import OooOooO.C20741OooOOoo;
import Oooo.C20811OooO00o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import com.alipay.sdk.app.H5PayActivity;
import com.alipay.sdk.p011m.p012x.C0201e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18143d5;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
import o00OOOoO.C25016OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.OooOOOO;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.x.d */
/* JADX INFO: loaded from: classes.dex */
public class C0200d extends AbstractC0199c implements C0201e.InterfaceC22157OooO0o0, C0201e.OooO0o, C0201e.InterfaceC22158OooO0oO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f66859OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f66860OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C25047OooO00o f66861OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f66862OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f66863OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C0201e f66864OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C20811OooO00o f66865Oooo000;

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$OooO00o */
    public static abstract class OooO00o implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<C0201e> f66866OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f66867OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f66868OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f66869OooO0Oo = false;

        public OooO0O0(C0201e c0201e, String str, String str2) {
            this.f66866OooO00o = new WeakReference<>(c0201e);
            this.f66867OooO0O0 = str;
            this.f66868OooO0OO = str2;
        }

        public final void OooO00o(JSONObject jSONObject) {
            if (this.f66869OooO0Oo) {
                return;
            }
            WeakReference<C0201e> weakReference = this.f66866OooO00o;
            C0201e c0201e = weakReference == null ? null : weakReference.get();
            if (c0201e == null) {
                return;
            }
            this.f66869OooO0Oo = true;
            String str = this.f66868OooO0OO;
            String strReplace = TextUtils.isEmpty(str) ? "" : str.replace("'", "");
            String string = jSONObject.toString();
            c0201e.OooO0O0(androidx.core.database.OooO00o.OooO00o("javascript:window.AlipayJSBridge.callBackFromNativeFunc('", strReplace, "','", TextUtils.isEmpty(string) ? "" : string.replace("'", ""), "');"));
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f66870OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f66871OooO0O0;

        public OooO0OO(OooO0O0 oooO0O0, String str) {
            this.f66870OooO00o = oooO0O0;
            this.f66871OooO0O0 = str;
        }

        public final void OooO00o(boolean z, JSONObject jSONObject, String str) {
            try {
                this.f66870OooO00o.OooO00o(new JSONObject().put(FirebaseAnalytics.Param.SUCCESS, z).put("random", this.f66871OooO0O0).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public C0200d(H5PayActivity h5PayActivity, String str, C25047OooO00o c25047OooO00o) {
        super(h5PayActivity, str);
        this.f66859OooOoO = true;
        this.f66860OooOoOO = "GET";
        this.f66862OooOoo0 = false;
        this.f66864OooOooo = null;
        C20811OooO00o c20811OooO00o = new C20811OooO00o();
        c20811OooO00o.f59743OooO00o = new Stack();
        this.f66865Oooo000 = c20811OooO00o;
        this.f66861OooOoo = c25047OooO00o;
        synchronized (this) {
            try {
                C0201e c0201e = new C0201e(this.f66858OooOo0o, new C0201e.C22156OooO0Oo(!OooO00o(), true ^ OooO00o()));
                this.f66864OooOooo = c0201e;
                c0201e.setChromeProxy(this);
                this.f66864OooOooo.setWebClientProxy(this);
                this.f66864OooOooo.setWebEventProxy(this);
                addView(this.f66864OooOooo);
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void OooO() {
        try {
            H5PayActivity h5PayActivity = this.f66858OooOo0o;
            C0201e c0201e = this.f66864OooOooo;
            if (h5PayActivity != null && c0201e != null) {
                if (this.f66859OooOoO) {
                    h5PayActivity.finish();
                } else {
                    c0201e.OooO0O0("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
                }
            }
        } finally {
        }
    }

    public final synchronized void OooO0O0(String str) {
        try {
            if ("POST".equals(this.f66860OooOoOO)) {
                this.f66864OooOooo.f66877OooOoOO.postUrl(str, null);
            } else {
                this.f66864OooOooo.OooO0O0(str);
            }
            WebView webView = this.f66864OooOooo.getWebView();
            if (webView != null) {
                try {
                    webView.resumeTimers();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void OooO0OO(String str, String str2, String str3) {
        JSONObject jSONObject;
        byte b;
        try {
            C0201e c0201e = this.f66864OooOooo;
            if (c0201e == null) {
                return;
            }
            try {
                jSONObject = new JSONObject(str3);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            OooO0O0 oooO0O0 = new OooO0O0(c0201e, str, str2);
            Context context = c0201e.getContext();
            try {
                String str4 = oooO0O0.f66867OooO0O0;
                switch (str4.hashCode()) {
                    case -1785164386:
                        b = !str4.equals("canUseTaoLogin") ? (byte) -1 : (byte) 8;
                        break;
                    case -552487705:
                        if (str4.equals("taoLogin")) {
                            b = 9;
                            break;
                        }
                        break;
                    case 3015911:
                        if (str4.equals("back")) {
                            b = 2;
                            break;
                        }
                        break;
                    case 3127582:
                        if (str4.equals("exit")) {
                            b = 3;
                            break;
                        }
                        break;
                    case 110371416:
                        if (str4.equals(NoteMeta.PROPERTY_TITLE)) {
                            b = 0;
                            break;
                        }
                        break;
                    case 1085444827:
                        if (str4.equals("refresh")) {
                            b = 1;
                            break;
                        }
                        break;
                    case 1703426986:
                        if (str4.equals("pushWindow")) {
                            b = 6;
                            break;
                        }
                        break;
                    case 1906413305:
                        if (str4.equals("backButton")) {
                            b = 4;
                            break;
                        }
                        break;
                    case 1947723784:
                        if (str4.equals("sdkInfo")) {
                            b = 7;
                            break;
                        }
                        break;
                    case 2033767917:
                        if (str4.equals("refreshButton")) {
                            b = 5;
                            break;
                        }
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0o0(this.f66861OooOoo, "jInfoErr", th, str);
            }
            switch (b) {
                case 0:
                    if (jSONObject.has(NoteMeta.PROPERTY_TITLE)) {
                        c0201e.getTitle().setText(jSONObject.optString(NoteMeta.PROPERTY_TITLE, ""));
                    }
                    return;
                case 1:
                    c0201e.getWebView().reload();
                    return;
                case 2:
                    OooOO0();
                    return;
                case 3:
                    C20741OooOOoo.f59588OooO0O0 = jSONObject.optString("result", null);
                    OooO0Oo(jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS, false));
                    return;
                case 4:
                    c0201e.getBackButton().setVisibility(jSONObject.optBoolean("show", true) ? 0 : 4);
                    return;
                case 5:
                    c0201e.getRefreshButton().setVisibility(jSONObject.optBoolean("show", true) ? 0 : 4);
                    return;
                case 6:
                    OooO0oO(jSONObject.optString("url"), jSONObject.optString(NoteMeta.PROPERTY_TITLE, ""));
                    return;
                case 7:
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sdk_version", "15.8.11");
                    jSONObject2.put(C18143d5.APP_NAME, this.f66861OooOoo.f85034OooO0O0);
                    jSONObject2.put("app_version", this.f66861OooOoo.f85033OooO00o);
                    oooO0O0.OooO00o(jSONObject2);
                    return;
                case 8:
                    String url = c0201e.getUrl();
                    if (OooOOOO.OooO(url, this.f66861OooOoo)) {
                        JSONObject jSONObject3 = new JSONObject();
                        boolean zOooOO0 = OooOOOO.OooOO0(this.f66861OooOoo, context, Collections.singletonList(new C25016OooO00o.OooO0O0("com.taobao.taobao", 0, "")), false);
                        jSONObject3.put("enabled", zOooOO0);
                        o00OOOOo.OooO00o.OooO0OO(this.f66861OooOoo, "biz", "TbChk", String.valueOf(zOooOO0));
                        oooO0O0.OooO00o(jSONObject3);
                    } else {
                        o00OOOOo.OooO00o.OooO0oO(this.f66861OooOoo, "biz", "jsUrlErr", url);
                    }
                    return;
                case 9:
                    String url2 = c0201e.getUrl();
                    if (OooOOOO.OooO(url2, this.f66861OooOoo)) {
                        String strOptString = jSONObject.optString("random");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("options");
                        if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("url");
                            String strOptString3 = jSONObjectOptJSONObject.optString("action");
                            if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                C25047OooO00o c25047OooO00o = this.f66861OooOoo;
                                Activity activity = (Activity) context;
                                OooO0OO oooO0OO = new OooO0OO(oooO0O0, strOptString);
                                try {
                                    o00OOOOo.OooO00o.OooO0O0("TbStart", c25047OooO00o);
                                    activity.startActivityForResult(new Intent(strOptString3, Uri.parse(strOptString2)), 1010);
                                    o00OOOO0.OooO0OO.f84884OooO00o = oooO0OO;
                                } catch (Throwable th2) {
                                    oooO0OO.OooO00o(false, null, "UNKNOWN_ERROR");
                                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "TbActFail", th2);
                                }
                            }
                        }
                        break;
                    } else {
                        o00OOOOo.OooO00o.OooO0oO(this.f66861OooOoo, "biz", "jsUrlErr", url2);
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void OooO0Oo(boolean z) {
        C20741OooOOoo.f59587OooO00o = z;
        this.f66858OooOo0o.finish();
    }

    public final synchronized void OooO0o(String str) {
        try {
            HashMap mapOooOO0o = OooOOOO.OooOO0o(str, this.f66861OooOoo);
            if (str.startsWith("callNativeFunc")) {
                OooO0OO((String) mapOooOO0o.get("func"), (String) mapOooOO0o.get("cbId"), (String) mapOooOO0o.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            } else if (str.startsWith("onBack")) {
                OooOO0();
            } else if (str.startsWith("setTitle") && mapOooOO0o.containsKey(NoteMeta.PROPERTY_TITLE)) {
                this.f66864OooOooo.getTitle().setText((CharSequence) mapOooOO0o.get(NoteMeta.PROPERTY_TITLE));
            } else if (str.startsWith("onRefresh")) {
                this.f66864OooOooo.getWebView().reload();
            } else if (str.startsWith("showBackButton") && mapOooOO0o.containsKey("bshow")) {
                this.f66864OooOooo.getBackButton().setVisibility(TextUtils.equals(TelemetryEventStrings.Value.TRUE, (CharSequence) mapOooOO0o.get("bshow")) ? 0 : 4);
            } else if (str.startsWith("onExit")) {
                C20741OooOOoo.f59588OooO0O0 = (String) mapOooOO0o.get("result");
                OooO0Oo(TextUtils.equals(TelemetryEventStrings.Value.TRUE, (CharSequence) mapOooOO0o.get("bsucc")));
            } else if (str.startsWith("onLoadJs")) {
                this.f66864OooOooo.OooO0O0("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0o0() {
        try {
            H5PayActivity h5PayActivity = this.f66858OooOo0o;
            if (h5PayActivity == null) {
                return;
            }
            if (!OooO00o()) {
                if (!this.f66862OooOoo0) {
                    OooO();
                }
                return;
            }
            C0201e c0201e = this.f66864OooOooo;
            if (c0201e != null && c0201e.getWebView() != null) {
                if (!c0201e.getWebView().canGoBack()) {
                    C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0O0();
                    h5PayActivity.finish();
                } else if (this.f66863OooOooO) {
                    int iOooO00o = o00OOOO0.OooO0O0.OooO00o(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST);
                    C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0OO(o00OOOO0.OooO0O0.OooO0O0(iOooO00o), o00OOOO0.OooO0O0.OooO0OO(iOooO00o), "");
                    h5PayActivity.finish();
                }
                return;
            }
            h5PayActivity.finish();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0oO(String str, String str2) {
        C0201e c0201e = this.f66864OooOooo;
        try {
            C0201e c0201e2 = new C0201e(this.f66858OooOo0o, new C0201e.C22156OooO0Oo(!OooO00o(), !OooO00o()));
            this.f66864OooOooo = c0201e2;
            c0201e2.setChromeProxy(this);
            this.f66864OooOooo.setWebClientProxy(this);
            this.f66864OooOooo.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f66864OooOooo.getTitle().setText(str2);
            }
            this.f66862OooOoo0 = true;
            ((Stack) this.f66865Oooo000.f59743OooO00o).push(c0201e);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new com.alipay.sdk.p011m.p012x.OooO0O0(this, c0201e, str));
            this.f66864OooOooo.setAnimation(translateAnimation);
            addView(this.f66864OooOooo);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void OooO0oo() {
        try {
            if (((Stack) this.f66865Oooo000.f59743OooO00o).isEmpty()) {
                this.f66858OooOo0o.finish();
            } else {
                this.f66862OooOoo0 = true;
                C0201e c0201e = this.f66864OooOooo;
                this.f66864OooOooo = (C0201e) ((Stack) this.f66865Oooo000.f59743OooO00o).pop();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setAnimationListener(new com.alipay.sdk.p011m.p012x.OooO00o(this, c0201e));
                c0201e.setAnimation(translateAnimation);
                removeView(c0201e);
                addView(this.f66864OooOooo);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooOO0() {
        try {
            WebView webView = this.f66864OooOooo.getWebView();
            if (webView.canGoBack()) {
                webView.goBack();
            } else {
                C20811OooO00o c20811OooO00o = this.f66865Oooo000;
                if (c20811OooO00o == null || ((Stack) c20811OooO00o.f59743OooO00o).isEmpty()) {
                    OooO0Oo(false);
                } else {
                    OooO0oo();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public final synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f66862OooOoo0 ? true : super.onInterceptTouchEvent(motionEvent);
    }
}

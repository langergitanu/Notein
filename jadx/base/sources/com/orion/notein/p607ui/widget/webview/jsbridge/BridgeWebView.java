package com.orion.notein.p607ui.widget.webview.jsbridge;

import OooOoo.C20593OooO0Oo;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o0oOoooO.C31172OooO0O0;
import o0oOoooO.C31174OooO0Oo;
import o0oOoooO.C31175OooO0o0;
import o0oOoooO.InterfaceC31171OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BridgeWebView extends WebView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f80175OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashMap f80176OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List<C31175OooO0o0> f80177OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC31171OooO00o f80178OooOoO0;

    public BridgeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80176OooOo0o = new HashMap();
        this.f80175OooOo = new HashMap();
        this.f80178OooOoO0 = new C31174OooO0Oo();
        this.f80177OooOoO = new ArrayList();
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        C31172OooO0O0 c31172OooO0O0 = new C31172OooO0O0();
        c31172OooO0O0.f111194OooO00o = this;
        setWebViewClient(c31172OooO0O0);
    }

    public final void OooO00o(C31175OooO0o0 c31175OooO0o0) {
        String string;
        c31175OooO0o0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callbackId", c31175OooO0o0.f111195OooO00o);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, c31175OooO0o0.f111198OooO0Oo);
            jSONObject.put("handlerName", c31175OooO0o0.f111199OooO0o0);
            jSONObject.put("responseData", c31175OooO0o0.f111197OooO0OO);
            jSONObject.put("responseId", c31175OooO0o0.f111196OooO0O0);
            string = jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            string = null;
        }
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("javascript:WebViewJavascriptBridge._handleMessageFromNative('", string.replaceAll("(\\\\)([^utrn])", "\\\\\\\\$1$2").replaceAll("(?<=[^\\\\])(\")", "\\\\\""), "');");
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            loadUrl(strOooO0O0);
        }
    }

    public List<C31175OooO0o0> getStartupMessage() {
        return this.f80177OooOoO;
    }

    public void setDefaultHandler(InterfaceC31171OooO00o interfaceC31171OooO00o) {
        this.f80178OooOoO0 = interfaceC31171OooO00o;
    }

    public void setStartupMessage(List<C31175OooO0o0> list) {
        this.f80177OooOoO = list;
    }
}

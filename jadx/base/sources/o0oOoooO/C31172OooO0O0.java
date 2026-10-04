package o0oOoooO;

import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.aspose.words.internal.zzZBH;
import com.orion.notein.p607ui.widget.webview.jsbridge.BridgeWebView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: o0oOoooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31172OooO0O0 extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BridgeWebView f111194OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageFinished(WebView webView, String str) throws Throwable {
        InputStream inputStreamOpen;
        String string;
        String line;
        super.onPageFinished(webView, str);
        zzZBH zzzbh = 0;
        try {
            try {
                inputStreamOpen = webView.getContext().getAssets().open("WebViewJavascriptBridge.js");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    StringBuilder sb = new StringBuilder();
                    do {
                        line = bufferedReader.readLine();
                        if (line != null && !line.matches("^\\s*\\/\\/.*")) {
                            sb.append(line);
                        }
                    } while (line != null);
                    bufferedReader.close();
                    inputStreamOpen.close();
                    string = sb.toString();
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                    }
                    string = null;
                }
            } catch (Throwable th) {
                th = th;
                zzzbh = "WebViewJavascriptBridge.js";
                if (zzzbh != 0) {
                    try {
                        zzzbh.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            if (zzzbh != 0) {
            }
            throw th;
        }
        webView.loadUrl("javascript:" + string);
        BridgeWebView bridgeWebView = this.f111194OooO00o;
        if (bridgeWebView.getStartupMessage() != null) {
            Iterator<C31175OooO0o0> it = bridgeWebView.getStartupMessage().iterator();
            while (it.hasNext()) {
                bridgeWebView.OooO00o(it.next());
            }
            bridgeWebView.setStartupMessage(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        boolean zStartsWith = str.startsWith("yy://return/");
        BridgeWebView bridgeWebView = this.f111194OooO00o;
        if (zStartsWith) {
            bridgeWebView.getClass();
            String[] strArrSplit = str.replace("yy://return/", "").split("/");
            String string = null;
            String str2 = strArrSplit.length >= 1 ? strArrSplit[0] : null;
            HashMap map = bridgeWebView.f80176OooOo0o;
            InterfaceC31173OooO0OO interfaceC31173OooO0OO = (InterfaceC31173OooO0OO) map.get(str2);
            if (str.startsWith("yy://return/_fetchQueue/")) {
                string = str.replace("yy://return/_fetchQueue/", "");
            } else {
                String[] strArrSplit2 = str.replace("yy://return/", "").split("/");
                if (strArrSplit2.length >= 2) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < strArrSplit2.length; i++) {
                        sb.append(strArrSplit2[i]);
                    }
                    string = sb.toString();
                }
            }
            if (interfaceC31173OooO0OO != null) {
                interfaceC31173OooO0OO.OooO00o(string);
                map.remove(str2);
            }
        } else {
            if (!str.startsWith("yy://")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            bridgeWebView.getClass();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                com.orion.notein.p607ui.widget.webview.jsbridge.OooO00o oooO00o = new com.orion.notein.p607ui.widget.webview.jsbridge.OooO00o(bridgeWebView);
                bridgeWebView.loadUrl("javascript:WebViewJavascriptBridge._fetchQueue();");
                bridgeWebView.f80176OooOo0o.put("javascript:WebViewJavascriptBridge._fetchQueue();".replace("javascript:WebViewJavascriptBridge.", "").replaceAll("\\(.*\\);", ""), oooO00o);
            }
        }
        return true;
    }
}

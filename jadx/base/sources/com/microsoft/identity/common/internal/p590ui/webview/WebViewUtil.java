package com.microsoft.identity.common.internal.p590ui.webview;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewUtil {
    private static CookieManager getCookieManager(Context context) {
        setDataDirectorySuffix(context);
        return CookieManager.getInstance();
    }

    public static void removeCookiesFromWebView(Context context) {
        CookieManager cookieManager = getCookieManager(context);
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
    }

    public static void removeSessionCookiesFromWebView(Context context) {
        CookieManager cookieManager = getCookieManager(context);
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
    }

    public static void setAcceptCookie(boolean z, Context context) {
        getCookieManager(context).setAcceptCookie(z);
    }

    public static void setDataDirectorySuffix(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                if (ProcessUtil.isRunningOnAuthService(context)) {
                    WebView.setDataDirectorySuffix(ProcessUtil.AuthServiceProcess);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }
}

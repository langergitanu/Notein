package o0O0O0Oo;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;
import o0O0oo0o.C26212OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o {
    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            Pattern pattern = C26212OooO00o.f89545OooO00o;
            if (TextUtils.isEmpty("url is null")) {
                return str;
            }
            Log.i("UriUtil", C26212OooO00o.OooO00o("url is null"));
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            C26212OooO00o.OooO0O0("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e) {
            C26212OooO00o.OooO0O0("UriUtil", "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }
}

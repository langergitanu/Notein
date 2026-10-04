package com.huawei.hms.hatool;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import o0O00o00.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.v0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18025v0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f53927a = {"e2f856b9f9a4fd4cb2795aeaf83268e4bff189aaec05d691ffde76e075b82648", "173cf86fe9894a0f70dadd09d4fd88c380836099d4939f8c3754361bdc16a32b", "b368b110e3b565fe97c91f786e11bc48754cc8e4e6f21d8a94a68ac6ad67aaaf", "db48223fd9e143f7e133c57f5d08a4e38549ce3ebd921fe3b4003c26e5e35bed", "4bdecdf772491e35c4e8b48f88aee22bae1311984f2e1da4dfad0b78ee7f5163", "3081a0adab3018d57165e6dd24074bdbac640f6dbe21a9e24d3474a87ebf38b8", "db53fcdc9ab71e9bdd4eab257fe1aba7989ad2b24fbe3a85dfef72ea1dd6bae2", "d80f18e8081b624cc64985f87f70118f1702985d2e10dbc985ee7be334fd3c7d", "5fed96c85bd58c58aadbd465c172a4c9a794d8eb2f86cbc7bcee6caf4c7a2c5f", "07ff9b7aeeff969173c45b285fe0fecdbaae244576ff7a2796a36f1c0c11adb4", "92974c6802419e4d18b5ec536cbfa167b8e8eff09ec4c8510a5b95750b1e0c82", "403f14ad2f0e5eb3c4f3a0bcd5c1592cc4492662ad53191c92905255d4990656", "4230baa077b401374d0fc012375047e79ea0790d58d095ef18d97d95470c738d", "f8d927750a0952ffb5bd87dfb83d781ae65f7bed043a7886d1d3cdcfc94bb77a", "e9702f1e92e97fce49cdf81a5fa730a4e913554d09b3fe41e1d8a7fba00a8459", "24fbae40bcd50b759b26e3ba0f46aa25e932fa7da05f226d75ec507bcf53bce5"};

    /* JADX INFO: renamed from: a */
    public static String m77555a(String str) {
        if (TextUtils.isEmpty(str)) {
            C18030y.m77586c("hmsSdk", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str) && !str.toLowerCase(Locale.US).startsWith("http:")) {
                return new URI(str).getHost();
            }
            C18030y.m77583b("hmsSdk", "url don't starts with https");
            return null;
        } catch (URISyntaxException e) {
            C18030y.m77583b("hmsSdk", "getHostByURI error : " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77558b(String str) {
        if (C17999k1.f53848a.booleanValue()) {
            return true;
        }
        for (String str2 : f53927a) {
            if (m77557a(str, str2, 2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m77556a(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            C18030y.m77586c("hmsSdk", "url is null");
            return str;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < i) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArrSplit[strArrSplit.length - i]);
        for (int i2 = 1; i2 < i; i2++) {
            stringBuffer.append(".");
            stringBuffer.append(strArrSplit[(strArrSplit.length - i) + i2]);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77557a(String str, String str2, int i) {
        String string;
        StringBuilder sb;
        String strM77555a = m77555a(str);
        if (TextUtils.isEmpty(strM77555a) || TextUtils.isEmpty(str2)) {
            string = "url or whitelistHash is null";
        } else {
            String strM77556a = m77556a(strM77555a, i);
            if (!TextUtils.isEmpty(strM77556a)) {
                if (str2.equals(OooO00o.OooO00o(strM77555a))) {
                    return true;
                }
                if (!str2.equals(OooO00o.OooO00o(strM77556a))) {
                    return false;
                }
                try {
                    String strSubstring = strM77555a.substring(0, strM77555a.length() - strM77556a.length());
                    if (strSubstring.endsWith(".")) {
                        return strSubstring.matches("^[A-Za-z0-9.-]+$");
                    }
                    return false;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    sb = new StringBuilder("IndexOutOfBoundsException");
                    sb.append(e.getMessage());
                    string = sb.toString();
                    C18030y.m77583b("hmsSdk", string);
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("Exception : ");
                    sb.append(e.getMessage());
                    string = sb.toString();
                    C18030y.m77583b("hmsSdk", string);
                    return false;
                }
            }
            string = "get urlLastNStr is null";
        }
        C18030y.m77583b("hmsSdk", string);
        return false;
    }
}

package o00OOOOo;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o00Oo0oO.OooOOOO;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f84888OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84889OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f84890OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84891OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f84892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f84893OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f84894OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f84895OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f84896OooO0oo;

    public static String OooO00o(PackageInfo packageInfo) {
        String strOooO0Oo;
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    strOooO0Oo = OooOOOO.OooO0Oo(null, signature.toByteArray());
                } catch (Throwable unused) {
                }
                String strSubstring = TextUtils.isEmpty(strOooO0Oo) ? MsalUtils.QUERY_STRING_SYMBOL : OooOOOO.OooOOo0(strOooO0Oo).substring(0, 8);
                sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                sb.append(strSubstring);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return MsalUtils.QUERY_STRING_SYMBOL;
        }
    }

    public static String OooO0OO(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(C18241k5.f55433h);
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static String OooO0Oo(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    public final String OooO0O0(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
        String str2 = null;
        if (strArrSplit != null) {
            String strReplace2 = null;
            string = null;
            strReplace = null;
            for (String str3 : strArrSplit) {
                String[] strArrSplit2 = str3.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase("partner")) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("out_trade_no")) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("trade_no")) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(OooOOOO.OooOOOO(strArrSplit2[1], null));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase(HiAnalyticsConstant.BI_KEY_APP_ID) && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
            str2 = strReplace2;
        } else {
            string = null;
            strReplace = null;
        }
        String str4 = OooO0Oo(strReplace) + "," + OooO0Oo(string) + ",-," + OooO0Oo(str2) + ",-,-,-";
        String str5 = this.f84895OooO0oO;
        boolean zIsEmpty = TextUtils.isEmpty(str5);
        String str6 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        if (zIsEmpty) {
            str5 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
        String str7 = this.f84896OooO0oo;
        if (!TextUtils.isEmpty(str7)) {
            str6 = str7;
        }
        StringBuilder sb = new StringBuilder("[(");
        OooOO0.OooO0OO.OooO0o0(sb, this.f84889OooO00o, "),(", str4, "),(");
        sb.append(this.f84890OooO0O0);
        sb.append("),(");
        sb.append(this.f84891OooO0OO);
        sb.append("),(");
        sb.append(this.f84892OooO0Oo);
        sb.append("),(");
        sb.append(this.f84894OooO0o0);
        sb.append("),(");
        OooOO0.OooO0OO.OooO0o0(sb, this.f84893OooO0o, "),(", str5, "),(");
        sb.append(str6);
        sb.append("),(");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f84888OooO, ")]");
    }

    public final synchronized void OooO0o(String str, String str2, String str3) {
        try {
            String str4 = TextUtils.isEmpty(this.f84896OooO0oo) ? "" : "^";
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            String strOooO0Oo = TextUtils.isEmpty(str3) ? CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR : OooO0Oo(str3);
            sb.append(str + "," + str2 + "," + strOooO0Oo + "," + OooO0Oo(new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date())));
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f84896OooO0oo);
            sb2.append(string);
            this.f84896OooO0oo = sb2.toString();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0o0(String str, String str2) {
        try {
            String str3 = TextUtils.isEmpty(this.f84895OooO0oO) ? "" : "^";
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            String strOooO0Oo = TextUtils.isEmpty("") ? CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR : OooO0Oo("");
            sb.append(strOooO0Oo + "," + OooO0Oo(str) + "," + OooO0Oo(str2) + ",-,-,-,-,-,-,-,-,-,-," + OooO0Oo(new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date())));
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f84895OooO0oO);
            sb2.append(string);
            this.f84895OooO0oO = sb2.toString();
        } catch (Throwable th) {
            throw th;
        }
    }
}

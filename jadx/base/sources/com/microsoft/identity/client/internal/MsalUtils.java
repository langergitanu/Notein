package com.microsoft.identity.client.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.client.BrowserTabActivity;
import com.microsoft.identity.client.CurrentTaskBrowserTabActivity;
import com.microsoft.identity.client.exception.MsalArgumentException;
import com.microsoft.identity.common.internal.logging.Logger;
import com.microsoft.identity.common.internal.util.StringUtil;
import com.microsoft.identity.common.java.configuration.LibraryConfiguration;
import com.microsoft.identity.common.java.exception.BaseException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class MsalUtils {
    public static final String CHROME_PACKAGE = "com.android.chrome";
    public static final int DEFAULT_EXPIRATION_TIME_SEC = 3600;
    public static final String ENCODING_UTF8 = "UTF-8";
    public static final String QUERY_STRING_DELIMITER = "&";
    public static final String QUERY_STRING_SYMBOL = "?";
    private static final String TAG = "MsalUtils";
    private static final String TOKEN_HASH_ALGORITHM = "SHA256";

    private MsalUtils() {
    }

    public static String appendQueryParameterToUrl(String str, Map<String, String> map) throws UnsupportedEncodingException {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty authority string");
        }
        if (map.isEmpty()) {
            return str;
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashSet.add(entry.getKey() + "=" + urlFormEncode(entry.getValue()));
        }
        return String.format(str.contains(QUERY_STRING_SYMBOL) ? str.endsWith("&") ? "%s%s" : "%s&%s" : "%s?%s", str, StringUtil.convertSetToString(hashSet, "&"));
    }

    public static String base64UrlEncodeToString(String str) {
        return Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 10);
    }

    public static Date calculateExpiresOn(String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(13, getExpiryOrDefault(str));
        return gregorianCalendar.getTime();
    }

    public static Set<String> convertArrayToSet(String[] strArr) {
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (!isEmpty(strArr[i])) {
                    hashSet.add(strArr[i]);
                }
            }
        }
        return hashSet;
    }

    public static String createHash(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return !isEmpty(str) ? new String(Base64.encode(MessageDigest.getInstance(TOKEN_HASH_ALGORITHM).digest(str.getBytes("UTF-8")), 2), "UTF-8") : str;
    }

    public static Map<String, String> decodeUrlToMap(String str, String str2) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":decodeUrlToMap");
        HashMap map = new HashMap();
        if (!isEmpty(str) && str2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                String[] strArrSplit = stringTokenizer.nextToken().split("=");
                if (strArrSplit.length == 2) {
                    try {
                        String strUrlFormDecode = urlFormDecode(strArrSplit[0]);
                        String strUrlFormDecode2 = urlFormDecode(strArrSplit[1]);
                        if (!isEmpty(strUrlFormDecode) && !isEmpty(strUrlFormDecode2)) {
                            map.put(strUrlFormDecode, strUrlFormDecode2);
                        }
                    } catch (UnsupportedEncodingException e) {
                        Logger.errorPII(strOooO0OO, "URL form decode failed.", e);
                    }
                }
            }
        }
        return map;
    }

    public static Map<String, String> extractJsonObjectIntoMap(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.getString(next));
        }
        return Collections.unmodifiableMap(map);
    }

    public static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("Unable to find the package info, unable to proceed");
        }
    }

    public static String getChromePackage(Context context) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getChromePackage");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(CHROME_PACKAGE, 1).applicationInfo;
            if (applicationInfo != null) {
                if (applicationInfo.enabled) {
                    return CHROME_PACKAGE;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Logger.error(strOooO0OO, "Failed to retrieve chrome package info.", e);
        }
        return null;
    }

    public static String getChromePackageWithCustomTabSupport(Context context) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getChromePackageWithCustomTabSupport");
        if (context.getPackageManager() == null) {
            Logger.warn(strOooO0OO, "getPackageManager() returned null.");
            return null;
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Logger.warn(strOooO0OO, "No Service responded to Intent: android.support.customtabs.action.CustomTabsService");
            return null;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && CHROME_PACKAGE.equals(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        Logger.warn(strOooO0OO, "No pkg with CustomTab support found.");
        return null;
    }

    public static long getExpiresOn(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
    }

    public static int getExpiryOrDefault(String str) {
        if (isEmpty(str)) {
            return 3600;
        }
        return Integer.parseInt(str);
    }

    public static Set<String> getScopesAsSet(String str) {
        if (isEmpty(str)) {
            return new HashSet();
        }
        String[] strArrSplit = str.toLowerCase(Locale.US).split(" ");
        HashSet hashSet = new HashSet();
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!isEmpty(strArrSplit[i])) {
                hashSet.add(strArrSplit[i]);
            }
        }
        return hashSet;
    }

    public static String getUniqueUserIdentifier(String str, String str2) {
        return base64UrlEncodeToString(str) + "." + base64UrlEncodeToString(str2);
    }

    @Deprecated
    public static boolean hasCustomTabRedirectActivity(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setDataAndNormalize(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        String name = BrowserTabActivity.class.getName();
        if (LibraryConfiguration.getInstance().isAuthorizationInCurrentTask()) {
            name = CurrentTaskBrowserTabActivity.class.getName();
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!it.next().activityInfo.name.equals(name)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isScopeIntersects(Set<String> set, Set<String> set2) {
        Iterator<String> it = set2.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void throwOnMainThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("method: ", str, " may not be called from main thread."));
        }
    }

    public static String urlFormDecode(String str) throws UnsupportedEncodingException {
        return isEmpty(str) ? "" : URLDecoder.decode(str, "UTF-8");
    }

    public static String urlFormEncode(String str) throws UnsupportedEncodingException {
        return isEmpty(str) ? "" : URLEncoder.encode(str, "UTF-8");
    }

    public static void validateNonNullArg(Object obj, String str) throws MsalArgumentException {
        if (obj == null || (((obj instanceof CharSequence) && TextUtils.isEmpty((CharSequence) obj)) || (((obj instanceof List) && ((List) obj).isEmpty()) || ((obj instanceof Map) && ((Map) obj).isEmpty())))) {
            throw new MsalArgumentException(str, C21111o0ooOoO.OooO0Oo(str, " cannot be null or empty"));
        }
    }

    public static void validateNonNullArgument(Object obj, String str) {
        if (obj == null || ((obj instanceof CharSequence) && TextUtils.isEmpty((CharSequence) obj))) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, " cannot be null or empty"));
        }
    }

    public static void throwOnMainThread(BaseException baseException) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(baseException);
        }
    }
}

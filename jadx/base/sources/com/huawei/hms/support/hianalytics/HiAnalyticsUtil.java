package com.huawei.hms.support.hianalytics;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HiAnalyticsUtil {

    /* JADX INFO: renamed from: a */
    private static final Object f56929a = new Object();

    /* JADX INFO: renamed from: b */
    private static HiAnalyticsUtil f56930b;

    /* JADX INFO: renamed from: c */
    private static HiAnalyticsUtils f56931c;

    /* JADX INFO: renamed from: a */
    private String m80113a(Context context, String str) {
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("01||", context.getPackageName(), "|");
        sbOooO0o0.append(Util.getAppId(context));
        sbOooO0o0.append("|60400302|");
        sbOooO0o0.append(str);
        return sbOooO0o0.toString();
    }

    public static HiAnalyticsUtil getInstance() {
        HiAnalyticsUtil hiAnalyticsUtil;
        synchronized (f56929a) {
            try {
                if (f56930b == null) {
                    f56930b = new HiAnalyticsUtil();
                    f56931c = HiAnalyticsUtils.getInstance();
                }
                hiAnalyticsUtil = f56930b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtil;
    }

    public static Map<String, String> getMapFromForegroundResponseHeader(ResponseHeader responseHeader) {
        HashMap map = new HashMap();
        if (responseHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        map.put("service", responseHeader.getSrvName());
        map.put("apiName", responseHeader.getApiName());
        map.put("package", responseHeader.getPkgName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        map.put("result", String.valueOf(responseHeader.getErrorCode()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.4.0.302");
        return map;
    }

    public static Map<String, String> getMapFromRequestHeader(ResponseHeader responseHeader) {
        HashMap map = new HashMap();
        if (responseHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        map.put("service", responseHeader.getSrvName());
        String apiName = responseHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] strArrSplit = apiName.split("\\.");
            if (strArrSplit.length >= 2) {
                map.put("apiName", strArrSplit[1]);
            }
        }
        map.put("package", responseHeader.getPkgName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        map.put("result", String.valueOf(responseHeader.getErrorCode()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.4.0.302");
        return map;
    }

    public static String versionCodeToName(String str) {
        return HiAnalyticsUtils.versionCodeToName(str);
    }

    @Deprecated
    public Map<String, String> getMapForBi(Context context, String str) {
        HashMap map = new HashMap();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            String appId = Util.getAppId(context);
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, TransactionIdCreater.getId(appId, str));
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            map.put("service", str2);
            map.put("apiName", str3);
            map.put("package", context.getPackageName());
            map.put("version", "6.4.0.302");
            map.put("callTime", String.valueOf(System.currentTimeMillis()));
        }
        return map;
    }

    public Map<String, String> getMapFromForegroundRequestHeader(RequestHeader requestHeader) {
        HashMap map = new HashMap();
        if (requestHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        map.put("service", requestHeader.getSrvName());
        map.put("apiName", requestHeader.getApiName());
        map.put("package", requestHeader.getPkgName());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.4.0.302");
        return map;
    }

    @Deprecated
    public boolean hasError() {
        if (SystemUtils.isChinaROM()) {
            return false;
        }
        HMSLog.m80174i("HiAnalyticsUtil", "not ChinaROM ");
        return true;
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        f56931c.onBuoyEvent(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        f56931c.onEvent(context, str, map);
    }

    public void onEvent2(Context context, String str, String str2) {
        f56931c.onEvent2(context, str, str2);
    }

    public void onNewEvent(Context context, String str, Map map) {
        f56931c.onNewEvent(context, str, map);
    }

    public void onEvent(Context context, String str, String str2) {
        if (context != null) {
            onEvent2(context, str, m80113a(context, str2));
        }
    }

    public boolean hasError(Context context) {
        return f56931c.hasError(context);
    }

    public Map<String, String> getMapFromRequestHeader(RequestHeader requestHeader) {
        HashMap map = new HashMap();
        if (requestHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        map.put("service", requestHeader.getSrvName());
        String apiName = requestHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] strArrSplit = apiName.split("\\.");
            if (strArrSplit.length >= 2) {
                map.put("apiName", strArrSplit[1]);
            }
        }
        map.put("package", requestHeader.getPkgName());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.4.0.302");
        return map;
    }
}

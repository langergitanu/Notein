package com.huawei.hms.network.inner.utils;

import android.text.TextUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class CheckConfigUtils {

    public static final class Constants {
        public static final int MAX_CONNECTION_ATTEMPT_DELAY = 2000;
        public static final int MAX_REQUEST_DISCRETE_TIME = 3000;
        public static final int MAX_RETRY_AFTER_TIME = 8000;
        public static final int MAX_RETRY_WAITING_TIME = 8000;
        public static final int MIN_CALL_TIMEOUT = 20;
        public static final int MIN_CONNECTION_ATTEMPT_DELAY = 100;
        public static final int MIN_CONNECT_TIMEOUT = 1000;
        public static final int ZERO = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0162 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean checkIsCorrect(String str, Object obj) {
        String strValueOf;
        strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
        str.getClass();
        switch (str) {
            case "core_write_timeout":
            case "core_read_timeout":
            case "core_connect_keep_alive_duration":
            case "core_connect_pool_size":
                return StringUtils.stringToInteger(strValueOf, -1) > 0;
            case "core_enable_plaintext_url_path":
            case "core_connect_empty_body":
            case "core_enable_privacy_policy":
            case "core_enable_httpdns":
            case "core_enable_concurrent_connect":
            case "core_enable_traffic_control_with_429":
            case "core_disable_weaknetwork_retry":
                if (isBoolean(strValueOf)) {
                    return true;
                }
                break;
            case "core_ping_interval":
            case "core_retry_time":
                if (StringUtils.stringToInteger(strValueOf, -1) >= 0) {
                    return true;
                }
                break;
            case "core_max_request_discrete_time":
                int iStringToInteger = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger >= 0 && iStringToInteger <= 3000) {
                    return true;
                }
                break;
            case "core_call_timeout":
                int iStringToInteger2 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger2 == 0 || iStringToInteger2 >= 20) {
                    return true;
                }
                break;
            case "core_connect_timeout":
                if (StringUtils.stringToInteger(strValueOf, -1) >= 1000) {
                    return true;
                }
                break;
            case "core_max_retry_waiting_time":
                int iStringToInteger3 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger3 >= 0 && iStringToInteger3 <= 8000) {
                    return true;
                }
                break;
            case "core_concurrent_connect_delay":
                int iStringToInteger4 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger4 >= 100 && iStringToInteger4 <= 2000) {
                    return true;
                }
                break;
            case "core_metrics_data":
                if (isMap(strValueOf)) {
                    return true;
                }
                break;
            default:
                return true;
        }
    }

    public static boolean isBoolean(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.trim().equalsIgnoreCase(TelemetryEventStrings.Value.FALSE) || str.trim().equalsIgnoreCase(TelemetryEventStrings.Value.TRUE);
    }

    public static boolean isMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).keys().hasNext();
        } catch (JSONException unused) {
            return false;
        }
    }
}

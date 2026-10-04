package com.microsoft.identity.common.java.eststelemetry;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.microsoft.identity.common.java.util.StringUtil;

/* JADX INFO: loaded from: classes9.dex */
public class TelemetryUtils {
    public static boolean getBooleanFromString(String str) {
        return str != null && str.equals("1");
    }

    public static String getSchemaCompliantString(String str) {
        return StringUtil.isNullOrEmpty(str) ? "" : str.equals(TelemetryEventStrings.Value.TRUE) ? "1" : str.equals(TelemetryEventStrings.Value.FALSE) ? "0" : str;
    }

    public static String getSchemaCompliantStringFromBoolean(boolean z) {
        return z ? "1" : "0";
    }
}

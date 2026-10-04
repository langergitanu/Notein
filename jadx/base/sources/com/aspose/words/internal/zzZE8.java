package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE8 {
    public static long zzD(String str, Object obj) {
        long jLongValue;
        if (obj == null) {
            jLongValue = 0;
        } else if (obj instanceof Number) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Invalid value type (" + obj.getClass() + ") for property '" + str + "': expected Long value.");
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid String value for property '", str, "': expected a number (Long)."));
            }
        }
        if (jLongValue >= 1) {
            return jLongValue;
        }
        throw new IllegalArgumentException("Invalid numeric value (" + jLongValue + ") for property '" + str + "': minimum is 1.");
    }

    public static int zzE(String str, Object obj) {
        int iIntValue;
        if (obj == null) {
            iIntValue = 0;
        } else if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Invalid value type (" + obj.getClass() + ") for property '" + str + "': expected Integer value.");
            }
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid String value for property '", str, "': expected a number (Integer)."));
            }
        }
        if (iIntValue > 0) {
            return iIntValue;
        }
        throw new IllegalArgumentException("Invalid numeric value (" + iIntValue + ") for property '" + str + "': minimum is 1.");
    }

    public static boolean zzF(String str, Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.equalsIgnoreCase(TelemetryEventStrings.Value.FALSE)) {
                return false;
            }
            if (str2.equalsIgnoreCase(TelemetryEventStrings.Value.TRUE)) {
                return true;
            }
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid String value for property '", str, "': expected Boolean value."));
        }
        throw new IllegalArgumentException("Invalid value type (" + obj.getClass() + ") for property '" + str + "': expected Boolean value.");
    }
}

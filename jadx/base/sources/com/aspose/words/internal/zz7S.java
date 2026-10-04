package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DBNull;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
class zz7S {
    static final /* synthetic */ boolean zzVr = true;

    private zz7S() {
    }

    public static String zzE(Object obj, Object obj2) {
        if (obj == null || obj == DBNull.Value) {
            return "";
        }
        if (obj2 == null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.doubleValue() % 1.0d == 0.0d) {
                    obj = Integer.valueOf(d.intValue());
                }
            }
            return obj.toString();
        }
        Format format = (Format) obj2;
        if (zzZKP.zzZX(obj)) {
            if (obj2 instanceof SimpleDateFormat) {
                return format.format(Long.valueOf(zzZKP.zzZW(obj)));
            }
            if (zzVr || (obj2 instanceof DecimalFormat)) {
                return format.format(obj);
            }
            throw new AssertionError();
        }
        if (obj instanceof Date) {
            if (zzVr || (obj2 instanceof SimpleDateFormat)) {
                return format.format(obj);
            }
            throw new AssertionError();
        }
        if (!(obj instanceof zzZQ9)) {
            return obj.toString();
        }
        if (zzVr || (obj2 instanceof SimpleDateFormat)) {
            return format.format(((zzZQ9) obj).zzkH());
        }
        throw new AssertionError();
    }

    private static String zzYh(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\'') {
                z = !z;
            } else if (!z) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private static boolean zzYi(String str) {
        String strZzYh = zzYh(str);
        if (strZzYh.contains("E0")) {
            return false;
        }
        DateFormatSymbols.getInstance(zzZNG.zzpZ().getLocale());
        int i = 0;
        for (int i2 = 0; i2 < strZzYh.length(); i2++) {
            if (Character.isLetter(strZzYh.charAt(i2))) {
                i++;
                if (!"GyMdkHmsSEDFwWahKzZYuXL".contains(String.valueOf(strZzYh.charAt(i2)))) {
                    return false;
                }
            }
        }
        return i != 0;
    }

    public static Format zzYj(String str) {
        if (!zzZYD.zzXk(str)) {
            return null;
        }
        if (zzYi(str)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, zzZNG.zzpZ().getLocale());
            simpleDateFormat.setTimeZone(zzZNG.getTimeZone());
            return simpleDateFormat;
        }
        DecimalFormat decimalFormatZzcl = zzZHS.zzcl();
        decimalFormatZzcl.applyPattern(str);
        return decimalFormatZzcl;
    }
}

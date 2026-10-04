package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22206OooOOo0;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class zzZDF extends zzZD5 {
    protected byte[] zzWIu;

    public zzZDF(String str) {
        this.zzWIu = zzYGI.zzwb(str);
        try {
            getDate();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    private boolean isDigit(int i) {
        byte b;
        byte[] bArr = this.zzWIu;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    private String zzXKT() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(getDate())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str + zzzW(i) + C18241k5.f55433h + zzzW(i2);
    }

    public static zzZDF zzYC(Object obj) {
        if (obj == null || (obj instanceof zzZDF)) {
            return (zzZDF) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
        }
        try {
            return (zzZDF) zzZD5.zzXo((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    private static String zzzW(int i) {
        return i < 10 ? C21532OooOOo.OooO0OO(i, "0") : Integer.toString(i);
    }

    public final Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        char cCharAt;
        String strZzVG = zzYGI.zzVG(this.zzWIu);
        if (strZzVG.endsWith("Z")) {
            simpleDateFormat = zzXKS() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : zzXKR() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : zzXKQ() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strZzVG.indexOf(45) > 0 || strZzVG.indexOf(43) > 0) {
            strZzVG = zzXKU();
            simpleDateFormat = zzXKS() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : zzXKR() ? new SimpleDateFormat("yyyyMMddHHmmssz") : zzXKQ() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = zzXKS() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : zzXKR() ? new SimpleDateFormat("yyyyMMddHHmmss") : zzXKQ() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (zzXKS()) {
            String strSubstring = strZzVG.substring(14);
            int i = 1;
            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                strZzVG = C22246OooO0oo.OooO00o(new StringBuilder(), strZzVG, strSubstring.substring(0, 4) + strSubstring.substring(i), 0, 14);
            } else if (i2 == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(strSubstring.substring(0, i));
                sb.append("00");
                strZzVG = C22246OooO0oo.OooO00o(new StringBuilder(), strZzVG, androidx.concurrent.futures.OooO0O0.OooO00o(strSubstring, i, sb), 0, 14);
            } else if (i2 == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strSubstring.substring(0, i));
                sb2.append("0");
                strZzVG = C22246OooO0oo.OooO00o(new StringBuilder(), strZzVG, androidx.concurrent.futures.OooO0O0.OooO00o(strSubstring, i, sb2), 0, 14);
            }
        }
        return zzZBK.zzY(simpleDateFormat.parse(strZzVG));
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        return zzYGU.hashCode(this.zzWIu);
    }

    public final boolean zzXKQ() {
        return isDigit(10) && isDigit(11);
    }

    public final boolean zzXKR() {
        return isDigit(12) && isDigit(13);
    }

    public final boolean zzXKS() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzWIu;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public final String zzXKU() {
        String strZzVG = zzYGI.zzVG(this.zzWIu);
        if (androidx.core.content.OooO0O0.OooO00o(1, strZzVG) == 'Z') {
            return strZzVG.substring(0, strZzVG.length() - 1) + "GMT+00:00";
        }
        int length = strZzVG.length();
        int i = length - 5;
        char cCharAt = strZzVG.charAt(i);
        if (cCharAt == '-' || cCharAt == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(strZzVG.substring(0, i));
            sb.append("GMT");
            int i2 = length - 2;
            sb.append(strZzVG.substring(i, i2));
            sb.append(C18241k5.f55433h);
            return androidx.concurrent.futures.OooO0O0.OooO00o(strZzVG, i2, sb);
        }
        int length2 = strZzVG.length() - 3;
        char cCharAt2 = strZzVG.charAt(length2);
        if (cCharAt2 != '-' && cCharAt2 != '+') {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzVG);
            sbOooO0OO.append(zzXKT());
            return sbOooO0OO.toString();
        }
        return strZzVG.substring(0, length2) + "GMT" + strZzVG.substring(length2) + ":00";
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        return new zzZCB(this.zzWIu);
    }

    @Override // com.aspose.words.internal.zzZD5
    public int zzXL6() {
        int length = this.zzWIu.length;
        return zzZBC.zzg4(length) + 1 + length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(24, this.zzWIu);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZDF) {
            return zzYGU.zzp(this.zzWIu, ((zzZDF) zzzd5).zzWIu);
        }
        return false;
    }

    public zzZDF(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", zzZBK.zzWHL);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.zzWIu = zzYGI.zzwb(simpleDateFormat.format(date));
    }

    public zzZDF(byte[] bArr) {
        this.zzWIu = bArr;
    }
}

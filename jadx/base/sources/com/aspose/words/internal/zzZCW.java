package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class zzZCW extends zzZD5 {
    private byte[] zzWIu;

    public zzZCW(String str) {
        this.zzWIu = zzYGI.zzwb(str);
        try {
            getDate();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    private Date getDate() throws ParseException {
        return zzZBK.zzY(new SimpleDateFormat("yyMMddHHmmssz").parse(zzXKU()));
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        return zzYGU.hashCode(this.zzWIu);
    }

    public String toString() {
        return zzYGI.zzVG(this.zzWIu);
    }

    public final String zzXKU() {
        String strZzVG = zzYGI.zzVG(this.zzWIu);
        if (strZzVG.indexOf(45) < 0 && strZzVG.indexOf(43) < 0) {
            return strZzVG.length() == 11 ? C22246OooO0oo.OooO00o(new StringBuilder(), strZzVG, "00GMT+00:00", 0, 10) : C22246OooO0oo.OooO00o(new StringBuilder(), strZzVG, "GMT+00:00", 0, 12);
        }
        int iIndexOf = strZzVG.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strZzVG.indexOf(43);
        }
        if (iIndexOf == strZzVG.length() - 3) {
            strZzVG = strZzVG.concat("00");
        }
        if (iIndexOf == 10) {
            return strZzVG.substring(0, 10) + "00GMT" + strZzVG.substring(10, 13) + C18241k5.f55433h + strZzVG.substring(13, 15);
        }
        return strZzVG.substring(0, 12) + "GMT" + strZzVG.substring(12, 15) + C18241k5.f55433h + strZzVG.substring(15, 17);
    }

    public final String zzXKu() {
        String strZzXKU = zzXKU();
        return strZzXKU.charAt(0) < '5' ? "20".concat(strZzXKU) : "19".concat(strZzXKU);
    }

    public final Date zzXKv() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return zzZBK.zzY(simpleDateFormat.parse(zzXKu()));
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        int length = this.zzWIu.length;
        return zzZBC.zzg4(length) + 1 + length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.write(23);
        int length = this.zzWIu.length;
        zzzd7.zzg7(length);
        for (int i = 0; i != length; i++) {
            zzzd7.write(this.zzWIu[i]);
        }
    }

    public zzZCW(byte[] bArr) {
        this.zzWIu = bArr;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZCW) {
            return zzYGU.zzp(this.zzWIu, ((zzZCW) zzzd5).zzWIu);
        }
        return false;
    }
}

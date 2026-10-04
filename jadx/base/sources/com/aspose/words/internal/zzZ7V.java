package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7V extends zzZDB implements zzZDL {
    int type;
    zzZDK zzWqM;

    public zzZ7V(zzZDK zzzdk) {
        this.type = 0;
        this.zzWqM = zzzdk;
    }

    public static zzZ7V zzS(zzZCY zzzcy) {
        return zzXc(zzZCY.zzX(zzzcy));
    }

    private static zzZ7V zzXc(Object obj) {
        if (obj == null || (obj instanceof zzZ7V)) {
            return (zzZ7V) obj;
        }
        if (obj instanceof zzZCY) {
            return new zzZ7V((zzZCY) obj);
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in factory: "));
    }

    private static void zzZ(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(C18241k5.f55433h);
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public final int getType() {
        return this.type;
    }

    public final String toString() {
        String strLineSeparator = zzYGI.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(strLineSeparator);
        if (this.type == 0) {
            zzZ(stringBuffer, strLineSeparator, "fullName", this.zzWqM.toString());
        } else {
            zzZ(stringBuffer, strLineSeparator, "nameRelativeToCRLIssuer", this.zzWqM.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public final zzZDK zzXI1() {
        return this.zzWqM;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZBX(false, this.type, this.zzWqM);
    }

    private zzZ7V(zzZCY zzzcy) {
        int iZzXKy = zzzcy.zzXKy();
        this.type = iZzXKy;
        if (iZzXKy == 0) {
            this.zzWqM = zzZ7Q.zzQ(zzzcy);
        } else {
            this.zzWqM = zzZD2.zzW(zzzcy, false);
        }
    }
}

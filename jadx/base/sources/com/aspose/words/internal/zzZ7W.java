package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7W extends zzZDB {
    zzZ7Q zzWqN;
    zzZ7F zzWqO;
    zzZ7V zzWqP;

    private zzZ7W(zzZD4 zzzd4) {
        for (int i = 0; i != zzzd4.size(); i++) {
            zzZCY zzzcyZzYw = zzZCY.zzYw(zzzd4.zzg6(i));
            int iZzXKy = zzzcyZzYw.zzXKy();
            if (iZzXKy == 0) {
                this.zzWqP = zzZ7V.zzS(zzzcyZzYw);
            } else if (iZzXKy == 1) {
                this.zzWqO = new zzZ7F(zzZCG.zzW(zzzcyZzYw));
            } else {
                if (iZzXKy != 2) {
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + zzzcyZzYw.zzXKy());
                }
                this.zzWqN = zzZ7Q.zzQ(zzzcyZzYw);
            }
        }
    }

    public static zzZ7W zzXd(Object obj) {
        if (obj == null || (obj instanceof zzZ7W)) {
            return (zzZ7W) obj;
        }
        if (obj instanceof zzZD4) {
            return new zzZ7W((zzZD4) obj);
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "Invalid DistributionPoint: "));
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

    public final String toString() {
        String strLineSeparator = zzYGI.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(strLineSeparator);
        zzZ7V zzz7v = this.zzWqP;
        if (zzz7v != null) {
            zzZ(stringBuffer, strLineSeparator, "distributionPoint", zzz7v.toString());
        }
        zzZ7F zzz7f = this.zzWqO;
        if (zzz7f != null) {
            zzZ(stringBuffer, strLineSeparator, "reasons", zzz7f.toString());
        }
        zzZ7Q zzz7q = this.zzWqN;
        if (zzz7q != null) {
            zzZ(stringBuffer, strLineSeparator, "cRLIssuer", zzz7q.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public final zzZ7Q zzXI2() {
        return this.zzWqN;
    }

    public final zzZ7F zzXI3() {
        return this.zzWqO;
    }

    public final zzZ7V zzXI4() {
        return this.zzWqP;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZ7V zzz7v = this.zzWqP;
        if (zzz7v != null) {
            zzzdj.zzZ(new zzZBX(zzz7v));
        }
        zzZ7F zzz7f = this.zzWqO;
        if (zzz7f != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzz7f));
        }
        zzZ7Q zzz7q = this.zzWqN;
        if (zzz7q != null) {
            zzzdj.zzZ(new zzZBX(false, 2, zzz7q));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ7W(zzZ7V zzz7v) {
        this.zzWqP = zzz7v;
        this.zzWqO = null;
        this.zzWqN = null;
    }
}

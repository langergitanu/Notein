package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7N extends zzZDB {
    private boolean zzWpY;
    private boolean zzWpZ;
    private zzZ7F zzWq0;
    private boolean zzWq1;
    private boolean zzWq2;
    private zzZ7V zzWqP;
    private zzZD4 zzWvF;

    private zzZ7N(zzZD4 zzzd4) {
        this.zzWvF = zzzd4;
        for (int i = 0; i != zzzd4.size(); i++) {
            zzZCY zzzcyZzYw = zzZCY.zzYw(zzzd4.zzg6(i));
            int iZzXKy = zzzcyZzYw.zzXKy();
            if (iZzXKy == 0) {
                this.zzWqP = zzZ7V.zzS(zzzcyZzYw);
            } else if (iZzXKy == 1) {
                this.zzWq2 = zzZDM.zzZ(zzzcyZzYw).zzXL1();
            } else if (iZzXKy == 2) {
                this.zzWq1 = zzZDM.zzZ(zzzcyZzYw).zzXL1();
            } else if (iZzXKy == 3) {
                this.zzWq0 = new zzZ7F(zzZCG.zzW(zzzcyZzYw));
            } else if (iZzXKy == 4) {
                this.zzWpZ = zzZDM.zzZ(zzzcyZzYw).zzXL1();
            } else {
                if (iZzXKy != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.zzWpY = zzZDM.zzZ(zzzcyZzYw).zzXL1();
            }
        }
    }

    private static String zzOO(boolean z) {
        return z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    public static zzZ7N zzX5(Object obj) {
        if (obj instanceof zzZ7N) {
            return (zzZ7N) obj;
        }
        if (obj != null) {
            return new zzZ7N(zzZD4.zzYy(obj));
        }
        return null;
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
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(strLineSeparator);
        zzZ7V zzz7v = this.zzWqP;
        if (zzz7v != null) {
            zzZ(stringBuffer, strLineSeparator, "distributionPoint", zzz7v.toString());
        }
        boolean z = this.zzWq2;
        if (z) {
            zzZ(stringBuffer, strLineSeparator, "onlyContainsUserCerts", zzOO(z));
        }
        boolean z2 = this.zzWq1;
        if (z2) {
            zzZ(stringBuffer, strLineSeparator, "onlyContainsCACerts", zzOO(z2));
        }
        zzZ7F zzz7f = this.zzWq0;
        if (zzz7f != null) {
            zzZ(stringBuffer, strLineSeparator, "onlySomeReasons", zzz7f.toString());
        }
        boolean z3 = this.zzWpY;
        if (z3) {
            zzZ(stringBuffer, strLineSeparator, "onlyContainsAttributeCerts", zzOO(z3));
        }
        boolean z4 = this.zzWpZ;
        if (z4) {
            zzZ(stringBuffer, strLineSeparator, "indirectCRL", zzOO(z4));
        }
        stringBuffer.append("]");
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public final zzZ7F zzXHP() {
        return this.zzWq0;
    }

    public final boolean zzXHQ() {
        return this.zzWpY;
    }

    public final boolean zzXHR() {
        return this.zzWpZ;
    }

    public final boolean zzXHS() {
        return this.zzWq1;
    }

    public final boolean zzXHT() {
        return this.zzWq2;
    }

    public final zzZ7V zzXI4() {
        return this.zzWqP;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWvF;
    }
}

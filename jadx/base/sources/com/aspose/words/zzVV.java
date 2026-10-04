package com.aspose.words;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
final class zzVV {
    private String zzCx;
    private long zzDL;
    private long zzOE;
    private boolean zzZx3;

    private zzVV(String str, boolean z, long j, long j2) {
        this.zzCx = str;
        this.zzZx3 = z;
        this.zzDL = j;
        this.zzOE = j2;
    }

    private static long zzP(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        byte bZzX6 = zzzox.zzX6();
        long j = 0;
        int i = 1;
        while (bZzX6 < 0) {
            if (i == 9) {
                throw new IllegalStateException("Directory entry has malformed data.");
            }
            j = (j << 7) + ((long) (bZzX6 & Ascii.DEL));
            bZzX6 = zzzox.zzX6();
            i++;
        }
        return (j << 7) + ((long) bZzX6);
    }

    public static zzVV zzQ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        long jZzP = zzP(zzzox);
        if (jZzP > 2147483647L) {
            throw new IllegalStateException("Directory entry has malformed data.");
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZO0.zzhV().zzZn(zzzox.zzn((int) jZzP)));
        if (com.aspose.words.internal.zzZKN.zzS(strZzU2, "/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            strZzU2 = strZzU2.substring(1);
        }
        return new zzVV(strZzU2, zzP(zzzox) == 1, zzP(zzzox), zzP(zzzox));
    }

    public final long getLength() {
        return this.zzOE;
    }

    public final String getPath() {
        return this.zzCx;
    }

    public final long zz1y() {
        return this.zzDL;
    }

    public final boolean zz1z() {
        return this.zzZx3;
    }
}

package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzKF extends zzTL {
    private static com.aspose.words.internal.zzZNR zzZjH = new com.aspose.words.internal.zzZNR("\\d*[\\./]\\d*[\\./]\\d*", 66);
    private int zzZjI;
    private com.aspose.words.internal.zzZQ9 zzZjJ;

    public zzKF(com.aspose.words.internal.zzZQ9 zzzq9) {
        this(zzzq9, 0);
    }

    private static com.aspose.words.internal.zzZQ9 zzRR(String str) {
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        Iterator<com.aspose.words.internal.zzZNT> it = zzZjH.zzUW(str).iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQ9 zzzq9ZzZi = com.aspose.words.internal.zzJB.zzZi(it.next().getValue());
            if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZi, com.aspose.words.internal.zzZQ9.zz35)) {
                zzzq9 = zzzq9ZzZi;
            }
        }
        return zzzq9;
    }

    public static zzKF zzRS(String str) {
        com.aspose.words.internal.zzZQ9 zzzq9ZzZi = com.aspose.words.internal.zzJB.zzZi(str);
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZi, zzzq9)) {
            zzzq9ZzZi = zzRR(str);
        }
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZi, zzzq9)) {
            return null;
        }
        return new zzKF(zzzq9ZzZi);
    }

    @Override // com.aspose.words.zzTL
    public final String zz8W() {
        return this.zzZjJ.toString();
    }

    @Override // com.aspose.words.zzTL
    public final String zzZ(String str, int i, IFieldResultFormatter iFieldResultFormatter) {
        String dateTime = iFieldResultFormatter != null ? iFieldResultFormatter.formatDateTime(this.zzZjJ.zzkH(), str, this.zzZjI) : null;
        return dateTime != null ? dateTime : zzY0C.zzZ(this.zzZjJ, str, i, this.zzZjI);
    }

    @Override // com.aspose.words.zzTL
    public final int zzbY() {
        return 3;
    }

    public zzKF(com.aspose.words.internal.zzZQ9 zzzq9, int i) {
        this.zzZjJ = zzzq9;
        this.zzZjI = i;
    }
}

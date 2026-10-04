package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOR {
    private int zzUt;
    private int zzZpV;

    public zzOR(int i, int i2) {
        this.zzZpV = i;
        this.zzUt = i2;
    }

    public final String getText() {
        StringBuilder sb = new StringBuilder();
        int i = this.zzZpV;
        if (i == -1) {
            com.aspose.words.internal.zzZNH.zzU(sb, "-n");
        } else if (i != 0) {
            if (i != 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWD(i)).append('n');
            } else {
                sb.append('n');
            }
        }
        int i2 = this.zzUt;
        if (i2 != 0 || this.zzZpV == 0) {
            if (i2 > 0 && this.zzZpV != 0) {
                sb.append('+');
            }
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWD(this.zzUt));
        }
        return sb.toString();
    }

    public final boolean zzMs(int i) {
        int i2 = (i + 1) - this.zzUt;
        int i3 = this.zzZpV;
        return i3 > 0 ? i2 >= 0 && i2 % i3 == 0 : i3 < 0 ? i2 <= 0 && i2 % i3 == 0 : i2 == 0;
    }
}

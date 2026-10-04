package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK9 extends zzZ28 {
    private com.aspose.words.internal.zzZNR zzXCZ = new com.aspose.words.internal.zzZNR("^[ ]{0,3}>", 0);
    private int zzYcw;

    public static int zzCT(String str) {
        int iIndexOf = str.indexOf(62);
        if (iIndexOf == -1) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = iIndexOf + i;
            if (i2 >= str.length() || str.charAt(i2) != '>') {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 7;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        if (zzz27.zzYIS()) {
            this.zzYcw = -1;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = this.zzXCZ.zzUX(zzz27.zzYIT());
        if (!zzzntZzUX.zzhL()) {
            return false;
        }
        int i = this.zzYcw;
        int iZzCT = zzCT(zzzntZzUX.getValue());
        this.zzYcw = iZzCT;
        if (iZzCT <= i) {
            return false;
        }
        setCount(getCount() + 1);
        return true;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 2;
    }
}

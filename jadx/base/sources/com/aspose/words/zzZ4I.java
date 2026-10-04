package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4I extends zzZ28 {
    private com.aspose.words.internal.zzZNR zzYcv = new com.aspose.words.internal.zzZNR("(^(\\s{0,3}([>]+\\s{0,4})?)?) ((\\d+\\.|[*+-])$ | (\\d+\\.|[*+-])\\s+)", 4);
    private int zzYcw;
    private char zzYcx;
    private boolean zzYcy;

    private static char zzJa(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, new char[]{'*', '-', '+'});
        if (iZzZ == -1) {
            return '1';
        }
        return str.charAt(iZzZ);
    }

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 5;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        if (zzz27.zzYIP() == null || zzZ27.zzY(zzz27.zzYIP())) {
            this.zzYcy = false;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = this.zzYcv.zzUX(zzz27.zzYIT());
        if (zzzntZzUX.zzhL()) {
            int i = this.zzYcw;
            this.zzYcw = zzYK9.zzCT(zzzntZzUX.getValue());
            char c = this.zzYcx;
            char cZzJa = zzJa(zzzntZzUX.getValue());
            this.zzYcx = cZzJa;
            if (!this.zzYcy) {
                setCount(getCount() + 1);
                this.zzYcy = true;
                return true;
            }
            if (i != this.zzYcw) {
                setCount(getCount() + 1);
                return true;
            }
            if (c != cZzJa) {
                setCount(getCount() + 1);
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 2;
    }
}

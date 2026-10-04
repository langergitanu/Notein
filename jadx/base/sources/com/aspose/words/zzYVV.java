package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYVV extends zzYWD {
    private int zzL4;
    private boolean zzXUI;
    private int[] zzXUJ;
    private static zzYVV zzXUH = new zzYVV(0);
    private static zzYVV zzXUG = new zzYVV(26);
    private static zzYVV zzXUF = new zzYVV(21);

    public zzYVV(int i) {
        this.zzL4 = i;
        zzYzu();
    }

    private void zzYzu() {
        int[] iArr = this.zzXUJ;
        if (iArr == null || iArr.length <= 0) {
            this.zzXUI = zzYVU.zztp(this.zzL4);
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.zzXUJ;
            if (i >= iArr2.length) {
                this.zzXUI = true;
                return;
            } else {
                if (!zzYVU.zztp(iArr2[i])) {
                    this.zzXUI = false;
                    return;
                }
                i++;
            }
        }
    }

    public static zzYVV zztr(int i) {
        return i != 0 ? i != 21 ? i != 26 ? new zzYVV(i) : zzXUG : zzXUF : zzXUH;
    }

    @Override // com.aspose.words.zzYWD
    public boolean zzJ(Node node) throws Exception {
        int[] iArr = this.zzXUJ;
        if (iArr == null) {
            return this.zzL4 == 0 || node.getNodeType() == this.zzL4;
        }
        for (int i : iArr) {
            if (node.getNodeType() == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzYWD
    public final boolean zzZZP() {
        return this.zzXUI;
    }

    public zzYVV(int[] iArr) {
        this.zzL4 = 0;
        this.zzXUJ = iArr;
        zzYzu();
    }
}

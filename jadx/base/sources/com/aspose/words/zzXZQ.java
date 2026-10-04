package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZQ {
    static zzXZQ zzWTo = new zzXZQ(0, 0);
    private boolean zzWTp = true;
    private int zzWTq;
    private int zzWTr;

    private zzXZQ(int i, int i2) {
        this.zzWTr = i;
        this.zzWTq = i2;
    }

    public static zzXZQ zzXO(Paragraph paragraph) {
        return new zzXZQ(zzhs(paragraph.zzZYj().getAlignment()), 2);
    }

    public static zzXZQ zzf(Cell cell) {
        return new zzXZQ(zzhs(cell.getFirstParagraph().zzZYj().getAlignment()), zzhr(cell.zz6G().getVerticalAlignment()));
    }

    private static int zzhr(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    private static int zzhs(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4 || i == 9) {
                return 6;
            }
            if (i != 10) {
                return 0;
            }
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZQ.class) {
            return false;
        }
        zzXZQ zzxzq = (zzXZQ) obj;
        return zzxzq.zzWTr == this.zzWTr && zzxzq.zzWTq == this.zzWTq && zzxzq.zzWTp == this.zzWTp;
    }

    public final boolean getWrapText() {
        return this.zzWTp;
    }

    public int hashCode() {
        return (((this.zzWTr * 397) ^ this.zzWTq) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWTp);
    }

    public final int zzXRG() {
        return this.zzWTq;
    }

    public final int zzXRH() {
        return this.zzWTr;
    }
}

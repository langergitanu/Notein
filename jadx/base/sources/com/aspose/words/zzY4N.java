package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4N {
    private zzY4J zzX1D;
    private zzY4J zzX1E;
    private int zzX1F;
    private String[] zzX1G;
    private zzY4K zzX1H;
    private String zzZi;

    public zzY4N(zzY4K zzy4k, String[] strArr, String str) {
        if (zzy4k == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: numberingStyle");
        }
        if (strArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: numbers");
        }
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: numberingText");
        }
        this.zzX1H = zzy4k;
        this.zzX1G = strArr;
        this.zzZi = str;
    }

    private String zzXUC() {
        return this.zzX1G[r0.length - 1];
    }

    public final int getListLevelNumber() {
        if (this.zzX1H.zzZ1m()) {
            return 0;
        }
        return this.zzX1G.length - 1;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final boolean zzX(zzY4N zzy4n) {
        zzY4K zzy4k = this.zzX1H;
        if (zzy4k != zzy4n.zzX1H) {
            return false;
        }
        if (zzy4k.zzZ1m()) {
            return true;
        }
        if (this.zzX1G.length != zzy4n.zzX1G.length) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.zzX1G;
            if (i >= strArr.length - 1) {
                return com.aspose.words.internal.zzZKN.equals(this.zzX1H.zzTE(zzXUC()), zzy4n.zzXUC());
            }
            if (!com.aspose.words.internal.zzZKN.equals(strArr[i], zzy4n.zzX1G[i])) {
                return false;
            }
            i++;
        }
    }

    public final boolean zzXUD() {
        if (!this.zzX1H.zzZ1m()) {
            String[] strArr = this.zzX1G;
            if (strArr.length != 1 || !this.zzX1H.zzTF(strArr[0])) {
                return false;
            }
        }
        return true;
    }

    public final zzY4K zzXUE() {
        return this.zzX1H;
    }

    public final zzY4J zzXUF() {
        return this.zzX1E;
    }

    public final zzY4J zzXUG() {
        return this.zzX1D;
    }

    public final int zzXUH() {
        return this.zzX1F;
    }

    public final void zzY(zzY4J zzy4j) {
        this.zzX1E = zzy4j;
    }

    public final void zzZ(zzY4J zzy4j) {
        this.zzX1D = zzy4j;
    }

    public final void zzjt(int i) {
        this.zzX1F = i;
    }

    public final boolean zzY(zzY4N zzy4n) {
        zzY4K zzy4k;
        if (!this.zzX1H.zzXUz() || (zzy4k = this.zzX1H) != zzy4n.zzX1H || !zzy4k.zzTF(zzXUC()) || this.zzX1G.length - 1 != zzy4n.zzX1G.length) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.zzX1G;
            if (i >= strArr.length - 1) {
                return true;
            }
            if (!com.aspose.words.internal.zzZKN.equals(strArr[i], zzy4n.zzX1G[i])) {
                return false;
            }
            i++;
        }
    }
}

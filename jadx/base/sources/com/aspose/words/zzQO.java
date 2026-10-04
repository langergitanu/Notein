package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQO {
    private boolean zzZr7;
    private int zzZr8;
    private zzOJ zzZr9;
    private static zzQO zzZr6 = new zzQO(zzOJ.zzZpP, 0, false);
    private static zzQO zzZr5 = new zzQO(zzOJ.zzZpP, 1, false);
    private static zzQO zzZr4 = new zzQO(zzOJ.zzZpP, 2, false);

    private zzQO(zzOJ zzoj, int i, boolean z) {
        this.zzZr9 = zzoj;
        this.zzZr8 = i;
        this.zzZr7 = z;
    }

    public static zzQO zzZ(zzOJ zzoj, int i, boolean z) {
        return (zzoj != zzOJ.zzZpP || z) ? new zzQO(zzoj, i, z) : i != 0 ? i != 1 ? i != 2 ? zzZr4 : zzZr4 : zzZr5 : zzZr6;
    }

    public final boolean zzZWV() {
        return this.zzZr7;
    }

    public final int zzZWW() {
        return this.zzZr8;
    }

    public final zzOJ zzZWX() {
        return this.zzZr9;
    }
}

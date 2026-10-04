package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1Y {
    private int zzKF;
    private boolean zzY3P;
    private zzY4T zzY45;
    private String zzYhW;
    private boolean zzqt;

    public zzZ1Y(zzY4T zzy4t, zzZAM zzzam) {
        this.zzY45 = zzy4t;
        this.zzY3P = zzzam != null && zzZ7R.zzY(zzzam).getName().contains("InlineCode");
    }

    private void zzIB(String str) {
        this.zzYhW = com.aspose.words.internal.zzZKN.zzS('`', com.aspose.words.internal.zzZKN.equals(str, "") ? 1 : Math.max(zzZ1N.zzYM(str, "InlineCode"), 1));
    }

    private String zzYIX() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzYhW) ? this.zzYhW : Character.toString('`');
    }

    private void zzYIs() {
        if (this.zzY45.zzXUQ().length() <= 0 || this.zzY45.zzXUQ().charAt(this.zzY45.zzXUQ().length() - 1) != zzYIX().charAt(0)) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzU(this.zzY45.zzXUQ(), " ");
    }

    public final void close() {
        zzYIs();
        com.aspose.words.internal.zzZNH.zzU(this.zzY45.zzXUQ(), zzYIX());
        this.zzKF = 0;
        this.zzqt = false;
    }

    public final int getState() {
        return this.zzKF;
    }

    public final boolean isOpened() {
        return this.zzqt;
    }

    public final void open() {
        zzYIs();
        this.zzY45.zzXUQ().insert(com.aspose.words.internal.zzZYD.zzS(this.zzY45.zzXUQ()) ? 0 : this.zzY45.zzXUQ().length(), zzYIX());
        this.zzqt = true;
    }

    public final void zzP(zzZAM zzzam) {
        String name = zzzam != null ? zzZ7R.zzY(zzzam).getName() : "";
        boolean zContains = name.contains("InlineCode");
        int i = this.zzY3P == zContains ? 0 : zContains ? 1 : 2;
        this.zzKF = i;
        if (i == 1) {
            zzIB(name);
        }
        this.zzY3P = zContains;
    }
}

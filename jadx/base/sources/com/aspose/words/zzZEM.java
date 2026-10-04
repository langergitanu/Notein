package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEM {
    private int zzUG;
    private boolean zzYll;
    private double zzZ3i;
    private int zzZGG;

    public zzZEM(TabStop tabStop) {
        this.zzZ3i = zzWT(tabStop.getPosition());
        this.zzUG = tabStop.getAlignment();
        this.zzZGG = tabStop.getLeader();
        this.zzYll = false;
    }

    private static double zzWT(double d) {
        return ((double) com.aspose.words.internal.zzAN.zzZF(com.aspose.words.internal.zzSA.zzr(d))) / 20.0d;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getLeader() {
        return this.zzZGG;
    }

    public final double getPosition() {
        return this.zzZ3i;
    }

    public final boolean zzWU(double d) {
        return com.aspose.words.internal.zzSA.zzr(this.zzZ3i) > com.aspose.words.internal.zzSA.zzr(d);
    }

    public final boolean zzYYK() {
        return this.zzYll;
    }

    public zzZEM(double d) {
        this.zzZ3i = zzWT(d);
        this.zzUG = 0;
        this.zzZGG = 0;
        this.zzYll = true;
    }
}

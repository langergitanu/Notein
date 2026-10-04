package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOB extends zzZZH {
    static boolean zzZD5 = false;
    private int zzYzs;

    public zzZOB() {
        super(0);
    }

    private boolean zzZ9S() {
        return (this.zzYzs * 6) + 8 == zzsk();
    }

    public final zzYBC zzC0(int i) {
        int iZzsk = zzsk();
        int i2 = iZzsk - 1;
        if (zzZ9S()) {
            i2 = iZzsk - 2;
        }
        int i3 = i2 - 1;
        if (i > i3) {
            return null;
        }
        zzYBC zzybc = new zzYBC(zzTe(i), zzTe(i + 1));
        if (i == i3 && !zzZ9S()) {
            zzybc.zzm0(zzybc.getEnd() - 1);
        }
        return zzybc;
    }

    public final zzYBC zzC1(int i) {
        return zzC0(i);
    }

    @Override // com.aspose.words.zzZZH
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (getItemCount() > 6) {
            return super.zzV(zzzow);
        }
        return 0;
    }

    public zzZOB(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        this();
        this.zzYzs = i;
        zzZ(zzzox, zzzra.zzYGE.zzXAu);
    }
}

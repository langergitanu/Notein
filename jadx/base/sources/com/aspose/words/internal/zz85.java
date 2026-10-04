package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz85 {
    private zzZQ5 zzDE;
    private zzZQ5 zzDF;
    private zzG5 zzon;
    private boolean zzoo;
    private boolean zzop;

    public zz85(zzG5 zzg5) {
        this.zzon = zzg5;
        this.zzop = Integer.signum(zzg5.zzJO().getWidth()) != Integer.signum(zzg5.zzJN().getWidth());
        this.zzoo = Integer.signum(zzg5.zzJO().getHeight()) != Integer.signum(zzg5.zzJN().getHeight());
        this.zzDF = zzAN.zzV(zzg5.zzJO());
        this.zzDE = zzAN.zzV(zzg5.zzJN());
    }

    public final boolean zzJM() {
        return this.zzon.zzJM();
    }

    public final zzZQ5 zzJN() {
        return this.zzDE;
    }

    public final zzZQ5 zzJO() {
        return this.zzDF;
    }

    public final int zzJP() {
        return this.zzon.zzJP();
    }

    public abstract byte[] zzJZ() throws Exception;

    public final boolean zzy1() {
        return this.zzoo;
    }

    public final boolean zzy2() {
        return this.zzop;
    }
}

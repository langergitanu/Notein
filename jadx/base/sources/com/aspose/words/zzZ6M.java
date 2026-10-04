package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6M extends zzZ6S {
    private long zzYfk;
    private boolean zzYgx;

    public zzZ6M(zzYMD zzymd) {
        super(zzymd);
        this.zzYfk = com.aspose.words.internal.zzZPZ.zzZm(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static boolean zzX(zzYIA zzyia) throws Exception {
        return zzyia.getHeight() > 0 || zzY39.zzO((zzYIC) zzyia.zza9());
    }

    private long zzYS9() throws Exception {
        if (((int) this.zzYfk) == Integer.MIN_VALUE) {
            this.zzYfk = zzZ63.zzW((zzYIA) this.zzYgm);
        }
        return this.zzYfk;
    }

    public final int zzYSa() {
        return ((zzYIC) ((zzYIA) this.zzYgm).zza9()).hashCode();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzY(this);
        if (zzX((zzYIA) this.zzYgm)) {
            zzYMC zzymcZzV = zzYMC.zzV((zzYIA) this.zzYgm);
            while (zzymcZzV.moveNext()) {
                new zzZ70((zzWT) zzymcZzV.zzYnU(), this.zzYgx).zzZ(zzz61);
            }
        }
        zzz61.zzX(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZm() throws Exception {
        return (((zzYIA) this.zzYgm).getX() - ((int) zzYS9())) / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZo() throws Exception {
        return ((((zzYIA) this.zzYgm).getY() - ((int) (zzYS9() >> 32))) + ((zzYIA) this.zzYgm).zzZXQ()) / 1000.0f;
    }

    public zzZ6M(zzYMD zzymd, byte b) {
        this(zzymd);
        this.zzYgx = true;
    }
}

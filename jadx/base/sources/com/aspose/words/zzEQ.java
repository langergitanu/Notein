package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEQ {
    private long zzYV = 0;
    private com.aspose.words.internal.zzG zzZcl;
    private float zzZcm;
    private zzEO zzZcn;
    private zzCK zzZco;
    private float zzZdW;
    private zzGK zzZyX;

    private zzEQ(zzCK zzck, zzEO zzeo, float f, float f2, zzGK zzgk) {
        this.zzZco = zzck;
        this.zzZcn = zzeo;
        this.zzZdW = f;
        this.zzZcm = f2;
        this.zzZyX = zzgk;
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final zzGK zz3I() {
        return this.zzZyX;
    }

    public final void zzZ(float f, float f2, float f3, float f4, zzDI zzdi) {
        float f5;
        float f6;
        this.zzZcl = new com.aspose.words.internal.zzG();
        boolean z = this.zzZcn != null;
        float f7 = this.zzZdW;
        float f8 = (f7 - this.zzZcm) - f4;
        if (this.zzZco.zzZGm().getHeight() > this.zzZdW && com.aspose.words.internal.zzAN.zzf(this.zzZco.zzZGk())) {
            while (((double) f7) * 1.03d < this.zzZco.zzZGm().getHeight()) {
                f7 += this.zzZdW;
            }
        }
        if (z) {
            this.zzZcn.zzx(f, f2);
            if (this.zzZcn.zzZLK().zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(this.zzZcn.zzZLK());
            }
            this.zzZcn.zzZLK().zzZO().zzY(f3, (this.zzZdW - this.zzZcn.getHeight()) - f4, 1);
        } else {
            f3 = 0.0f;
        }
        float f9 = (this.zzZdW * 0.2867f) - 12700.0f;
        if (z) {
            if (com.aspose.words.internal.zzAN.zzP(this.zzZcn.getWidth(), 323850.0f)) {
                f5 = zzdi.zzZIC().zzZdM;
                f6 = 0.7f;
            } else if (com.aspose.words.internal.zzAN.zzP(this.zzZcn.getWidth(), 242570.0f)) {
                f5 = zzdi.zzZIC().zzZdM;
                f6 = 0.45f;
            }
            f9 = f5 * f6;
        }
        float width = f9 + (z ? f3 + this.zzZcn.getWidth() : 0.0f);
        this.zzZco.zzZGn().zzZO().zzY(width, f8, 0);
        this.zzZcl.zzX((com.aspose.words.internal.zzZL) this.zzZco.zzZGn());
        if (z) {
            this.zzZcl.zzX((com.aspose.words.internal.zzZL) this.zzZcn.zzZLK());
        }
        this.zzYV = com.aspose.words.internal.zzZPW.zzG(this.zzZco.zzZGm().getWidth() + width, f7);
    }

    public final com.aspose.words.internal.zzG zzZLM() {
        return this.zzZcl;
    }

    public static zzEQ zzZ(String str, zzCV zzcv, zzEO zzeo, float f, zzDI zzdi) throws Exception {
        return zzZ(str, zzcv, zzeo, f, zzdi, null);
    }

    public static zzEQ zzZ(String str, zzCV zzcv, zzEO zzeo, float f, zzDI zzdi, zzGK zzgk) throws Exception {
        return new zzEQ(zzCK.zzZ(zzDG.zzRk(str), zzcv, zzdi, false), zzeo, f, zzDG.zzW(zzcv.zzaR(), zzdi), zzgk);
    }
}

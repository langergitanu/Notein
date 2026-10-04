package com.aspose.words;

import OooOoO.C20509OooO0oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzDU extends zzDX {
    public zzDU(zzEY zzey, zzGK zzgk, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) throws Exception {
        super(zzey, zzgk, zzdi, zzzq4, z);
    }

    private boolean zzZJj() {
        return this.zzZyX.zzZQO() == 14;
    }

    public static float zzu(float f, float f2) {
        if (f2 / f > 0.42d) {
            return C20509OooO0oo.OooO0O0(f, 0.42f, f2, 4.0f);
        }
        return 0.0f;
    }

    @Override // com.aspose.words.zzDX
    public final int zzZJF() {
        if (zzZJj()) {
            return super.zzZJF();
        }
        return 90;
    }

    @Override // com.aspose.words.zzDX
    public final boolean zzZJG() {
        return true;
    }

    @Override // com.aspose.words.zzDX
    public final int zzZJH() {
        return this.zzZyX.zzZPj().getCount() - 1;
    }

    @Override // com.aspose.words.zzDX
    public final void zzZJP() {
        if (!zzZJj()) {
            this.zzZbk = 0.0f;
            this.zzZbj = zzZKB() / zzZJH();
            return;
        }
        zzZd(zzZKC() / this.zzZyX.zzZPb());
        if (zzZQD() || !zzZJj()) {
            return;
        }
        float fZzu = zzu(this.zzZgO.getWidth(), this.zzZgO.getHeight());
        this.zzZby += fZzu;
        this.zzZbx += fZzu;
    }

    @Override // com.aspose.words.zzDX
    public final void zzZJQ() {
    }

    @Override // com.aspose.words.zzDX, com.aspose.words.zzDZ
    public final void zzZKE() throws Exception {
        super.zzZKE();
        if (zzZJj()) {
            return;
        }
        float fZzZJH = this.zzZbj * zzZJH();
        if (fZzZJH <= (zzZKC() * 3.0f) / 4.0f) {
            float fZzZKC = (zzZKC() - ((fZzZJH * 4.0f) / 3.0f)) / 2.0f;
            this.zzZbA += fZzZKC;
            this.zzZbz += fZzZKC;
        } else {
            float fZzZKC2 = (zzZKC() * 3.0f) / 4.0f;
            this.zzZbj = fZzZKC2 / zzZJH();
            this.zzZbx = this.zzZgP.zz3U() == 0 ? Math.max(this.zzZbx, (zz44().getHeight() - fZzZKC2) / 2.0f) : Math.min(this.zzZbx, (zz44().getHeight() - fZzZKC2) / 2.0f);
            this.zzZby = zz44().getHeight() - this.zzZbx;
        }
    }
}

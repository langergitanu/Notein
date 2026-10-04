package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEI implements zzZOY {
    private zzPJ zzwb;
    private zzXN zzwc;
    private boolean zzwd;

    public zzEI(byte[] bArr) throws Exception {
        this(new zzXN(bArr));
        this.zzwd = true;
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        zzXN zzxn = this.zzwc;
        if (zzxn == null || !this.zzwd) {
            return;
        }
        zzxn.dispose();
        this.zzwc = null;
    }

    public final byte[] getImageBytes() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            this.zzwc.zzZ(zzzor, 6);
            return zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public final zzPJ zzDT() {
        if (this.zzwb == null) {
            this.zzwb = new zzPJ();
        }
        return this.zzwb;
    }

    public final void zzDU() {
        zzXN zzxn = this.zzwc;
        if (zzxn == null) {
            throw new IllegalStateException("Disposed object: ImageProcessor");
        }
        zzPJ zzpj = this.zzwb;
        if (zzpj == null) {
            return;
        }
        zzxn.zzZ(zzpj);
        this.zzwb = null;
    }

    public final void zzF(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: backgroundColor");
        }
        zzDU();
        zzZQ5 zzzq5 = new zzZQ5(0, 0, this.zzwc.getWidth(), this.zzwc.getHeight());
        zzXN zzxn = new zzXN(zzzq5.getWidth(), zzzq5.getHeight());
        zzIY zziy = new zzIY(zzxn);
        try {
            zziy.zzZ(zzpv, zzzq5.getWidth(), zzzq5.getHeight());
            zziy.dispose();
            this.zzwc.zzZ(zzzq5, zzxn, zzzq5);
            this.zzwc.close();
            this.zzwc = zzxn;
            this.zzwd = true;
        } catch (Throwable th) {
            zziy.dispose();
            throw th;
        }
    }

    public final void zzK(int i, boolean z) {
        zzZ(i, true, new zzPV(1, 255, 255, 255));
    }

    public final void zzQ(int i, int i2, int i3) {
        zzDU();
        zzZQ5 zzzq5 = new zzZQ5(0, 0, this.zzwc.getWidth(), this.zzwc.getHeight());
        zzXN zzxn = new zzXN(this.zzwc.getWidth(), this.zzwc.getHeight());
        int height = this.zzwc.getHeight();
        int i4 = i - i2;
        int iMin = Math.min(Math.abs(i4), height);
        float f = iMin;
        float f2 = i4 / f;
        int iZzZa = (int) zzZKQ.zzZa(((double) height) / ((double) iMin));
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            try {
                zzZQ5 zzzq52 = new zzZQ5(0, i5, this.zzwc.getWidth(), iZzZa);
                i5 += iZzZa;
                zzZ(zzzq52, zzzq5, ((int) (i6 * f2)) + i2, zzxn);
            } catch (Throwable th) {
                this.zzwc.close();
                throw th;
            }
        }
        if (i5 < this.zzwc.getHeight()) {
            zzZ(new zzZQ5(0, i5, this.zzwc.getWidth(), this.zzwc.getHeight() - i5), zzzq5, i2 + ((int) (f2 * f)), zzxn);
        }
        this.zzwc.close();
        this.zzwc = zzxn;
        this.zzwd = true;
    }

    /* JADX WARN: Finally extract failed */
    public final void zzZ(int i, boolean z, zzPV zzpv) {
        if (i <= 1) {
            return;
        }
        zzDU();
        int width = this.zzwc.getWidth();
        int height = this.zzwc.getHeight();
        zzZQ5 zzzq5 = new zzZQ5(0, 0, this.zzwc.getWidth(), this.zzwc.getHeight());
        zzZQ5 zzzq52 = new zzZQ5(i, i, zzzq5.getWidth(), zzzq5.getHeight());
        int i2 = i * 2;
        zzXN zzxn = new zzXN(this.zzwc.getWidth() + i2, this.zzwc.getHeight() + i2);
        zzIY zziy = new zzIY(zzxn);
        try {
            zziy.zzZ(zzpv, zzxn.getWidth(), zzxn.getHeight());
            try {
                this.zzwc.zzZ(zzzq5, zzxn, zzzq52);
                this.zzwc.close();
                this.zzwc = zzxn;
                new zzES(i).zzX(this.zzwc);
                if (z) {
                    zzXN zzxnZzZ = this.zzwc.zzZ(new zzZQ5(i, i, width, height));
                    this.zzwc.close();
                    this.zzwc = zzxnZzZ;
                }
                this.zzwd = true;
            } catch (Throwable th) {
                this.zzwc.close();
                throw th;
            }
        } finally {
            zziy.dispose();
        }
    }

    public zzEI(zzXN zzxn) {
        this.zzwc = zzxn;
    }

    private void zzZ(zzZQ5 zzzq5, zzZQ5 zzzq52, int i, zzXN zzxn) {
        zzXN zzxn2 = new zzXN(this.zzwc.getWidth(), this.zzwc.getHeight());
        try {
            this.zzwc.zzZ(zzzq52, zzxn2, zzzq52);
            zzPJ zzpj = new zzPJ();
            zzpj.zzZ(zzPN.zzY8(i));
            zzxn2.zzZ(zzpj);
            zzxn2.zzZ(zzzq5, zzxn, zzzq5);
        } finally {
            zzxn2.dispose();
        }
    }
}

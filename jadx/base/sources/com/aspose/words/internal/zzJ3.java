package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzJ3 {
    private zzXZ zzz6;
    private zzZOR zzz7;
    private zzZX0 zzz5 = new zzZX0();
    private zzZOR zzz4 = new zzZOR();

    public zzJ3() throws Exception {
        zzZOR zzzor = new zzZOR();
        this.zzz7 = zzzor;
        this.zzz6 = new zzXZ(zzzor);
    }

    public final void zz4(byte[] bArr) throws Exception {
        this.zzz5.zzoI().add((int) this.zzz7.getPosition());
        this.zzz7.write(bArr, 0, bArr.length);
    }

    public final zzZOR zzGQ() {
        return this.zzz4;
    }

    public final zzZX0 zzGR() {
        return this.zzz5;
    }

    public final zzXZ zzGS() {
        return this.zzz6;
    }

    public final zzZOR zzGT() {
        return this.zzz7;
    }

    public final void zzGU() throws Exception {
        zzZOR zzzor = this.zzz7;
        if (zzzor != null) {
            zzzor.dispose();
            this.zzz7 = null;
        }
        zzZOR zzzor2 = this.zzz4;
        if (zzzor2 != null) {
            zzzor2.dispose();
            this.zzz4 = null;
        }
    }

    public final void zzGV() throws Exception {
        this.zzz5.zzX(new zzXZ(this.zzz4));
    }

    public final void zzGW() throws Exception {
        this.zzz5.zzoI().add((int) this.zzz7.getPosition());
    }

    public final void zzGX() throws Exception {
        this.zzz5.zzoI().add((int) this.zzz7.getPosition());
    }
}

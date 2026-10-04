package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTG {
    int zzYJU;
    int zzYJV;

    public zzZTG(int i, int i2) {
        this.zzYJV = i;
        this.zzYJU = i2;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("Fidcl, dgid:{0}, cspidCur:{1}", Integer.valueOf(this.zzYJV), Integer.valueOf(this.zzYJU));
    }

    public final void zzT(zzZSP zzzsp) throws Exception {
        zzzsp.write(this.zzYJV);
        zzzsp.write(this.zzYJU);
    }

    public zzZTG(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYJV = zzzox.zzXc();
        this.zzYJU = zzzox.zzXc();
    }
}

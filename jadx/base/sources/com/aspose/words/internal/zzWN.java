package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWN extends zzWP {
    private short zzTE;
    private zzZ[] zzTF;

    public static class zzZ {
        private short zzTC;
        private short zzTD;

        public zzZ(short s, short s2) {
            this.zzTD = s;
            this.zzTC = s2;
        }

        public final short zzUW() {
            return this.zzTC;
        }

        public final short zzUX() {
            return this.zzTD;
        }
    }

    private zzWN(zzZ[] zzzArr, short s) {
        this.zzTF = zzzArr;
        this.zzTE = s;
    }

    public static zzWN zzU(zzWK zzwk, int i) throws Exception {
        int iZzUT = zzwk.zzUT() & 65535;
        zzZ[] zzzArr = new zzZ[iZzUT];
        for (int i2 = 0; i2 < iZzUT; i2++) {
            zzzArr[i2] = new zzZ(zzwk.zzUT(), zzwk.zzUU());
        }
        zzWN zzwn = new zzWN(zzzArr, zzwk.zzUT());
        if (zzwn.zzZs(i)) {
            return zzwn;
        }
        throw new IllegalStateException("Incorrect Format 3 FDSelect.");
    }

    private boolean zzZs(int i) {
        zzZ[] zzzArr = this.zzTF;
        if (zzzArr.length == 0 || zzzArr[0].zzUX() != 0 || (this.zzTE & 65535) != i) {
            return false;
        }
        zzZ zzz = this.zzTF[0];
        for (int i2 = 1; i2 < this.zzTF.length; i2++) {
            if ((zzz.zzUX() & 65535) >= (this.zzTF[i2].zzUX() & 65535)) {
                return false;
            }
            zzz = this.zzTF[i2];
        }
        return (zzz.zzUX() & 65535) < (65535 & this.zzTE);
    }

    @Override // com.aspose.words.internal.zzWP
    public final int getSize() {
        return (this.zzTF.length * 3) + 5;
    }

    @Override // com.aspose.words.internal.zzWP
    public final void zzZ(zzWJ zzwj) throws Exception {
        zzwj.zzV((short) 3);
        zzwj.zzU((short) this.zzTF.length);
        for (zzZ zzz : this.zzTF) {
            zzwj.zzU(zzz.zzUX());
            zzwj.zzV(zzz.zzUW());
        }
        zzwj.zzU(this.zzTE);
    }

    @Override // com.aspose.words.internal.zzWP
    public final int zzZt(int i) {
        zzZ zzz = this.zzTF[0];
        int i2 = 1;
        while (true) {
            zzZ[] zzzArr = this.zzTF;
            if (i2 < zzzArr.length && i >= (zzzArr[i2].zzUX() & 65535)) {
                zzz = this.zzTF[i2];
                i2++;
            }
            return zzz.zzUW();
        }
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ {
    private zzXX zzW;
    private zzHX zzX;
    private zzD3<zzHX> zzY = new zzD3<>();
    private zzHX[] zzZ;

    public zzZ(int i, zzXX zzxx) {
        this.zzW = zzxx;
        int i2 = i * 2;
        this.zzZ = new zzHX[i2];
        for (int i3 = 1; i3 < i2; i3++) {
            zzHX zzhx = new zzHX();
            zzhx.zzx6 = i3;
            this.zzZ[i3] = zzhx;
        }
        for (int i4 = 1; i4 < i2; i4++) {
            zzHX[] zzhxArr = this.zzZ;
            zzHX zzhx2 = zzhxArr[i4];
            if (i4 > 1) {
                zzhx2.zzx5 = zzhxArr[i4 / 2];
            }
            if (i4 < i) {
                int i5 = i4 * 2;
                zzhx2.zzx4 = zzhxArr[i5];
                zzhx2.zzx3 = zzhxArr[i5 + 1];
            }
            if (i4 >= i) {
                int i6 = i4 - i;
                zzhx2.zzx2 = i6;
                zzhx2.zzx1 = 1L;
                this.zzY.add(i6, zzhx2);
            }
        }
        zzHX zzhx3 = this.zzZ[1];
        this.zzX = zzhx3;
        zzhx3.zzFO();
    }

    private void zzW(int i) throws Exception {
        zzHX zzhx = this.zzY.get(i);
        int iZzZ = 0;
        int i2 = 0;
        int i3 = 1;
        while (zzhx != this.zzX) {
            zzHX zzhx2 = zzhx.zzx5;
            iZzZ = zzXU.zzZ(iZzZ, i3, zzhx2.zzx3 == zzhx);
            i3 <<= 1;
            i2++;
            zzhx = zzhx2;
        }
        ((zzXV) this.zzW).zzO(iZzZ, i2);
    }

    public final int zzX(int i) {
        int i2 = 0;
        for (zzHX zzhx = this.zzY.get(i); zzhx != this.zzX; zzhx = zzhx.zzx5) {
            i2++;
        }
        return i2 * 65536;
    }

    public final void zzY(int i) throws Exception {
        zzW(i);
        zzZ(i);
    }

    public final void zzZ(int i) {
        zzHX zzhx = this.zzY.get(i);
        while (true) {
            long j = zzhx.zzx1;
            zzhx.zzx1 = 1 + j;
            if (zzhx == this.zzX) {
                return;
            }
            zzHX[] zzhxArr = this.zzZ;
            int i2 = zzhx.zzx6;
            if (zzhxArr[i2 - 1].zzx1 == j) {
                do {
                    i2--;
                } while (this.zzZ[i2 - 1].zzx1 < zzhx.zzx1);
                zzZ(zzhx.zzx6, i2);
            }
            zzhx = zzhx.zzx5;
        }
    }

    private int zzY() throws Exception {
        zzHX zzhx = this.zzX;
        zzXW zzxw = (zzXW) this.zzW;
        while (!zzhx.zzFN()) {
            zzhx = zzxw.zzX0() ? zzhx.zzx3 : zzhx.zzx4;
        }
        return zzhx.zzx2;
    }

    public final int zzZ() throws Exception {
        int iZzY = zzY();
        zzZ(iZzY);
        return iZzY;
    }

    private void zzZ(int i, int i2) {
        zzHX[] zzhxArr = this.zzZ;
        zzHX zzhx = zzhxArr[i];
        zzHX zzhx2 = zzhxArr[i2];
        zzhxArr[i] = zzhx2;
        zzhxArr[i2] = zzhx;
        zzhxArr[i].zzx6 = i;
        zzhx.zzx6 = i2;
        zzZ(zzhx, zzhx2);
    }

    private static void zzZ(zzHX zzhx, zzHX zzhx2) {
        zzHX zzhx3 = zzhx.zzx5;
        zzHX zzhx4 = zzhx2.zzx5;
        if (zzhx3.zzx4 == zzhx) {
            zzhx3.zzZ(zzhx2);
        } else {
            zzhx3.zzY(zzhx2);
        }
        if (zzhx4.zzx4 == zzhx2) {
            zzhx4.zzZ(zzhx);
        } else {
            zzhx4.zzY(zzhx);
        }
    }
}

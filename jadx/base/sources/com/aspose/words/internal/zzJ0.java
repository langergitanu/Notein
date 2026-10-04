package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzJ0 {
    private zzY0 zzTA;
    private byte[] zzyW;
    private byte[] zzyX;
    private zzZOR zzyY;
    private zzJ3 zzyZ = new zzJ3();
    private zzJ2 zzz0;

    public zzJ0(zzY0 zzy0, zzZYZ zzzyz, zzZYZ zzzyz2, boolean z) throws Exception {
        this.zzTA = zzy0;
        this.zzz0 = new zzJ2(zzy0, zzzyz, zzzyz2, z);
    }

    private void zzGK() throws Exception {
        this.zzyW = this.zzyZ.zzGT().zzWy();
        this.zzyX = this.zzyZ.zzGQ().zzWy();
        this.zzyZ.zzGU();
    }

    private float zzGL() throws Exception {
        short sZzXa = this.zzTA.zzXa();
        return (sZzXa >> 14) + ((sZzXa & 16383) / 16383.0f);
    }

    private static zzZYV<Integer> zzU(zzZYV<Integer> zzzyv) {
        zzZYV<Integer> zzzyv2 = new zzZYV<>();
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zzzyv2.add(zzzyv.zzVY(i).intValue(), Integer.valueOf(zzzyv.zzT3(i)));
        }
        return zzzyv2;
    }

    private void zzV(zzZYV<Integer> zzzyv) throws Exception {
        for (int i = 0; i < this.zzz0.zzGP(); i++) {
            if (zzzyv.zzVE(i)) {
                this.zzyZ.zz4(this.zzz0.zzWp(i));
            } else {
                this.zzyZ.zz4(new byte[0]);
            }
        }
        this.zzyZ.zzGW();
        this.zzyZ.zzGR().zz7(this.zzz0.zzHW());
        this.zzyZ.zzGV();
    }

    private zzZYV<Integer> zzW(zzZYV<Integer> zzzyv) throws Exception {
        zzZYV<Integer> zzzyv2 = new zzZYV<>();
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zzZ(zzzyv.zzT3(i), zzzyv2);
        }
        return zzzyv2;
    }

    private static int zzWo(int i) {
        int i2 = (i & 1) != 0 ? 4 : 2;
        return (i & 8) != 0 ? i2 + 2 : (i & 64) != 0 ? i2 + 4 : (i & 128) != 0 ? i2 + 8 : i2;
    }

    private void zzZ(int i, zzZYV<Integer> zzzyv) throws Exception {
        short sZzX9;
        if (!zzzyv.zzVE(i) && i <= this.zzz0.zzGP()) {
            zzzyv.add(i, Integer.valueOf(i));
            if (this.zzz0.zzWq(i) == 0) {
                return;
            }
            this.zzz0.zzWr(i);
            if (this.zzTA.zzXa() > 0) {
                return;
            }
            this.zzTA.zzn(8);
            zzDB zzdb = new zzDB();
            do {
                sZzX9 = this.zzTA.zzX9();
                int iZzX9 = 65535 & this.zzTA.zzX9();
                this.zzTA.zzn(zzWo(sZzX9 & 65535));
                zzdb.add(iZzX9);
            } while ((sZzX9 & 32) != 0);
            for (int i2 = 0; i2 < zzdb.getCount(); i2++) {
                zzZ(zzdb.get(i2), zzzyv);
            }
        }
    }

    public final zzZOR zzGM() {
        return this.zzyY;
    }

    public final byte[] zzGN() {
        return this.zzyW;
    }

    public final byte[] zzGO() {
        return this.zzyX;
    }

    public final void zzX(zzZYV<Integer> zzzyv) throws Exception {
        zzV(zzW(zzzyv));
        zzGK();
    }

    public final zzD3<zzP8> zzY(zzDB zzdb) throws Exception {
        zzD3<zzP8> zzd3 = new zzD3<>(zzdb.getCount());
        for (int i = 0; i < zzdb.getCount(); i++) {
            int i2 = zzdb.get(i);
            if (!zzd3.zzVE(i2) && i2 < this.zzz0.zzGP()) {
                zzZX6 zzzx6 = new zzZX6();
                zzZ(i2, zzzx6, (zzP9) null);
                zzd3.set(i2, zzZX2.zzZ(zzzx6));
            }
        }
        return zzd3;
    }

    private void zzY(zzZX6 zzzx6, zzP9 zzp9) throws Exception {
        int iZzXa;
        int iZzXa2;
        int iZzXa3 = this.zzTA.zzXa();
        this.zzTA.zzXa();
        this.zzTA.zzXa();
        this.zzTA.zzXa();
        this.zzTA.zzXa();
        int[] iArr = new int[iZzXa3];
        for (int i = 0; i < iZzXa3; i++) {
            iArr[i] = 65535 & this.zzTA.zzX9();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < iZzXa3; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i2 = i4;
            }
            i2++;
        }
        this.zzTA.zzn(this.zzTA.zzX9() & 65535);
        byte[] bArr = new byte[i2];
        int i5 = 0;
        while (i5 < i2) {
            byte b = this.zzTA.readByte();
            int i6 = i5 + 1;
            bArr[i5] = b;
            if (zzXU.zzY(b)[3]) {
                int i7 = this.zzTA.readByte() & 255;
                int i8 = 0;
                while (i8 < i7) {
                    bArr[i6] = b;
                    i8++;
                    i6++;
                }
            }
            i5 = i6;
        }
        int[] iArr2 = new int[i2];
        int i9 = 0;
        while (true) {
            if (i9 >= i2) {
                break;
            }
            boolean[] zArrZzY = zzXU.zzY(bArr[i9]);
            if (zArrZzY[1]) {
                iZzXa2 = (this.zzTA.readByte() & 255) * (zArrZzY[4] ? 1 : -1);
            } else {
                iZzXa2 = zArrZzY[4] ? iArr2[i9] : this.zzTA.zzXa();
            }
            iArr2[i9] = iZzXa2;
            i9++;
        }
        int[] iArr3 = new int[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            boolean[] zArrZzY2 = zzXU.zzY(bArr[i10]);
            if (zArrZzY2[2]) {
                iZzXa = (this.zzTA.readByte() & 255) * (zArrZzY2[5] ? 1 : -1);
            } else {
                iZzXa = zArrZzY2[5] ? iArr3[i10] : this.zzTA.zzXa();
            }
            iArr3[i10] = iZzXa;
        }
        zzP9 zzp92 = zzp9 != null ? new zzP9(1.0f, 0.0f, 0.0f, 1.0f, zzp9.zzOb(), zzp9.zzOa()) : null;
        zzP9 zzp93 = zzp9 != null ? new zzP9(zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), 0.0f, 0.0f) : null;
        if (zzp92 != null) {
            long jZzR = zzp92.zzR(zzZPY.zzG(iArr2[0], iArr3[0]));
            iArr2[0] = (int) Float.intBitsToFloat((int) jZzR);
            iArr3[0] = (int) zzZPY.zzYC(jZzR);
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            boolean[] zArrZzY3 = zzXU.zzY(bArr[i11]);
            boolean z = iArr[i12] == i11;
            if (z) {
                i12++;
            }
            long jZzG = zzZPY.zzG(iArr2[i11], iArr3[i11]);
            if (zzp93 != null) {
                jZzG = zzp93.zzR(jZzG);
            }
            zzzx6.zzoU().zzZ((int) Float.intBitsToFloat((int) jZzG), (int) zzZPY.zzYC(jZzG), zArrZzY3[0], z, i11 == 0);
            i11++;
        }
    }

    public final int zzZ(zzID zzid, zzZYV<Integer> zzzyv) throws Exception {
        zzY(zzid, zzzyv);
        zzGK();
        return this.zzyZ.zzGR().zzoI().getCount() - 1;
    }

    private void zzZ(int i, zzZX6 zzzx6, zzP9 zzp9) throws Exception {
        if (this.zzz0.zzWq(i) == 0) {
            return;
        }
        this.zzz0.zzWr(i);
        short sZzXa = this.zzTA.zzXa();
        if (sZzXa == 0) {
            return;
        }
        this.zzTA.zzq().zzH(this.zzTA.zzq().getPosition() - 2);
        if (zzp9 == null) {
            zzp9 = new zzP9();
        }
        if (sZzXa < 0) {
            zzZ(zzzx6, zzp9);
        } else {
            zzY(zzzx6, zzp9);
        }
    }

    private void zzZ(zzZX6 zzzx6, zzP9 zzp9) throws Exception {
        short sZzX9;
        short sZzXa;
        short sZzXa2;
        this.zzTA.zzXa();
        short sZzXa3 = this.zzTA.zzXa();
        short sZzXa4 = this.zzTA.zzXa();
        this.zzTA.zzXa();
        this.zzTA.zzXa();
        zzP9 zzp9ZzOh = zzp9.zzOh();
        int i = -1;
        while (true) {
            sZzX9 = this.zzTA.zzX9();
            int iZzX9 = this.zzTA.zzX9() & 65535;
            zzP9 zzp9ZzOh2 = i == iZzX9 ? zzp9.zzOh() : zzp9ZzOh.zzOh();
            if ((sZzX9 & 512) != 0) {
                zzp9ZzOh = zzp9ZzOh2;
            }
            if ((sZzX9 & 1) != 0) {
                sZzXa = this.zzTA.zzXa();
                sZzXa2 = this.zzTA.zzXa();
            } else {
                sZzXa = (short) (this.zzTA.readByte() & 255);
                sZzXa2 = (short) (this.zzTA.readByte() & 255);
            }
            if ((sZzX9 & 2) != 0) {
                zzp9ZzOh2.zzY(sZzXa, sZzXa2, 0);
            }
            if ((sZzX9 & 8) != 0) {
                float fZzGL = zzGL();
                zzp9ZzOh2.zzZ(fZzGL, fZzGL, 0);
            } else if ((sZzX9 & 64) != 0) {
                zzp9ZzOh2.zzZ(zzGL(), zzGL(), 0);
            } else if ((sZzX9 & 128) != 0) {
                zzp9ZzOh2.zzZ(new zzP9(zzGL(), zzGL(), zzGL(), zzGL(), 0.0f, 0.0f), 0);
            }
            long position = this.zzTA.zzq().getPosition();
            zzZ(iZzX9, zzzx6, zzp9ZzOh2);
            this.zzTA.zzq().zzH(position);
            if ((sZzX9 & 32) == 0) {
                break;
            } else {
                i = iZzX9;
            }
        }
        if ((sZzX9 & 256) != 0) {
            this.zzTA.zzn(this.zzTA.zzX9() & 65535);
        }
        zzzx6.zzoU().zzZu(sZzXa3, sZzXa4);
    }

    private void zzY(zzID zzid, zzZYV<Integer> zzzyv) throws Exception {
        zzZYV<Integer> zzzyvZzU = zzU(zzzyv);
        zzZOR zzzor = new zzZOR();
        this.zzyY = zzzor;
        zzXZ zzxz = new zzXZ(zzzor);
        for (int i = 0; i < zzzyvZzU.getCount(); i++) {
            int iIntValue = zzzyvZzU.zzVY(i).intValue();
            zzZ(zzzyv, zzzyvZzU, iIntValue);
            zzid.zzWl(iIntValue).zzX(zzxz);
        }
        this.zzyZ.zzGW();
        this.zzyZ.zzGR().zz7(this.zzz0.zzHW());
        this.zzyZ.zzGV();
    }

    private void zzZ(zzZYV<Integer> zzzyv, zzZYV<Integer> zzzyv2, int i) throws Exception {
        int i2;
        this.zzyZ.zzGX();
        this.zzz0.zzWr(i);
        int iZzWq = this.zzz0.zzWq(i);
        if (iZzWq == 0) {
            return;
        }
        short sZzXa = this.zzTA.zzXa();
        if (sZzXa < 0) {
            this.zzyZ.zzGS().zzj(sZzXa);
            byte[] bArrZzn = this.zzTA.zzn(8);
            this.zzyZ.zzGS().zzW(bArrZzn, bArrZzn.length);
            do {
                short sZzX9 = this.zzTA.zzX9();
                int i3 = sZzX9 & 65535;
                this.zzyZ.zzGS().zzj(i3);
                int iZzY = zzY(zzzyv, zzzyv2, this.zzTA.zzX9() & 65535);
                byte[] bArrZzn2 = this.zzTA.zzn(zzWo(i3));
                this.zzyZ.zzGS().zzj(iZzY);
                this.zzyZ.zzGS().zzW(bArrZzn2, bArrZzn2.length);
                i2 = sZzX9 & 32;
                if (i2 == 0 && (sZzX9 & 256) != 0) {
                    int iZzX9 = this.zzTA.zzX9() & 65535;
                    byte[] bArrZzn3 = this.zzTA.zzn(iZzX9);
                    this.zzyZ.zzGS().zzj(iZzX9);
                    this.zzyZ.zzGS().zzW(bArrZzn3, bArrZzn3.length);
                }
            } while (i2 != 0);
        } else {
            this.zzTA.zzq().zzH(this.zzTA.zzq().getPosition() - 2);
            byte[] bArrZzn4 = this.zzTA.zzn(iZzWq);
            this.zzyZ.zzGS().zzW(bArrZzn4, bArrZzn4.length);
        }
        if (zzAN.zzZP(this.zzyZ.zzGS().zzq().getPosition())) {
            this.zzyZ.zzGS().writeByte((byte) 0);
        }
    }

    private static int zzY(zzZYV<Integer> zzzyv, zzZYV<Integer> zzzyv2, int i) {
        if (zzzyv.zzVE(i)) {
            return zzzyv.get(i).intValue();
        }
        int iZzT3 = zzzyv2.zzT3(zzzyv2.getCount() - 1) + 1;
        zzzyv.add(i, Integer.valueOf(iZzT3));
        zzzyv2.add(iZzT3, Integer.valueOf(i));
        return iZzT3;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYX extends zzJ1 {
    public byte[] zzPh;
    public zzZX4[] zzch;

    private void zzP(zzXZ zzxz) throws Exception {
        for (zzZX4 zzzx4 : this.zzch) {
            zzxz.zzj(zzzx4.zzoP());
        }
    }

    private void zzQ(zzXZ zzxz) throws Exception {
        for (zzZX4 zzzx4 : this.zzch) {
            zzxz.zzj(zzzx4.zzoQ());
        }
    }

    private void zzR(zzXZ zzxz) throws Exception {
        byte[] bArrZzrd = zzrd();
        zzxz.zzW(bArrZzrd, bArrZzrd.length);
        zzQ(zzxz);
        zzP(zzxz);
    }

    private void zzS(zzXZ zzxz) throws Exception {
        zzxz.zzi(this.zzPh.length);
        byte[] bArr = this.zzPh;
        zzxz.zzW(bArr, bArr.length);
    }

    private void zzT(zzXZ zzxz) throws Exception {
        int i = 0;
        while (true) {
            zzZX4[] zzzx4Arr = this.zzch;
            if (i >= zzzx4Arr.length) {
                return;
            }
            if (zzzx4Arr[i].zzoN()) {
                zzxz.zzi(i);
            }
            i++;
        }
    }

    private static short zzZ(zzY0 zzy0, boolean z, boolean z2) throws Exception {
        if (z) {
            return (short) ((zzy0.readByte() & 255) * (z2 ? 1 : -1));
        }
        if (z2) {
            return (short) 0;
        }
        return zzy0.zzXa();
    }

    private byte[] zzrd() {
        byte[] bArr = new byte[this.zzch.length];
        int i = 0;
        while (true) {
            zzZX4[] zzzx4Arr = this.zzch;
            if (i >= zzzx4Arr.length) {
                return bArr;
            }
            bArr[i] = zzzx4Arr[i].zzoO();
            i++;
        }
    }

    public static zzZYX zzs(zzY0 zzy0) throws Exception {
        zzZYX zzzyx = new zzZYX();
        short sZzXa = zzy0.zzXa();
        zzzyx.zzz1 = sZzXa;
        if (sZzXa < 0) {
            throw new IllegalStateException("Invalid contours number.");
        }
        zzzyx.zzBm = zzy0.zzXa();
        zzzyx.zzBl = zzy0.zzXa();
        zzzyx.zzBk = zzy0.zzXa();
        zzzyx.zzBj = zzy0.zzXa();
        if (!zzzyx.isEmpty()) {
            zzDB zzdb = new zzDB(zzzyx.zzz1);
            int i = 0;
            for (int i2 = 0; i2 < zzzyx.zzz1; i2++) {
                zzdb.add(zzy0.zzX9() & 65535);
            }
            zzdb.sort();
            int i3 = zzdb.get(zzzyx.zzz1 - 1) + 1;
            zzzyx.zzPh = zzy0.zzn(65535 & zzy0.zzX9());
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i4 < i3) {
                byte b = zzy0.readByte();
                int i5 = i4 + 1;
                bArr[i4] = b;
                if (zzXU.zzZ(b, (byte) 8)) {
                    int i6 = zzy0.readByte() & 255;
                    int i7 = 0;
                    while (i7 < i6) {
                        bArr[i5] = b;
                        i7++;
                        i5++;
                    }
                }
                i4 = i5;
            }
            int[] iArr = new int[i3];
            for (int i8 = 0; i8 < i3; i8++) {
                iArr[i8] = zzZ(zzy0, zzXU.zzZ(bArr[i8], (byte) 2), zzXU.zzZ(bArr[i8], (byte) 16));
            }
            int[] iArr2 = new int[i3];
            for (int i9 = 0; i9 < i3; i9++) {
                iArr2[i9] = zzZ(zzy0, zzXU.zzZ(bArr[i9], (byte) 4), zzXU.zzZ(bArr[i9], (byte) 32));
            }
            zzzyx.zzch = new zzZX4[i3];
            short s = 0;
            short s2 = 0;
            while (i < i3) {
                int i10 = iArr[i];
                short s3 = (short) (s + i10);
                int i11 = iArr2[i];
                short s4 = (short) (s2 + i11);
                zzzyx.zzch[i] = new zzZX4(i10, i11, s3, s4, zzXU.zzZ(bArr[i], (byte) 1), zzdb.contains(i));
                i++;
                s = s3;
                s2 = s4;
            }
        }
        return zzzyx;
    }

    @Override // com.aspose.words.internal.zzJ1
    public final void zzX(zzXZ zzxz) throws Exception {
        if (isEmpty()) {
            return;
        }
        super.zzX(zzxz);
        zzT(zzxz);
        zzS(zzxz);
        zzR(zzxz);
    }

    public final void zzre() {
        zzZX4[] zzzx4Arr = this.zzch;
        if (zzzx4Arr.length == 0) {
            return;
        }
        this.zzBm = (short) zzzx4Arr[0].getX();
        this.zzBk = (short) this.zzch[0].getX();
        this.zzBl = (short) this.zzch[0].getY();
        this.zzBj = (short) this.zzch[0].getY();
        int i = 1;
        while (true) {
            zzZX4[] zzzx4Arr2 = this.zzch;
            if (i >= zzzx4Arr2.length) {
                return;
            }
            this.zzBm = zzZKQ.min(this.zzBm, (short) zzzx4Arr2[i].getX());
            this.zzBk = zzZKQ.max(this.zzBk, (short) this.zzch[i].getX());
            this.zzBl = zzZKQ.min(this.zzBl, (short) this.zzch[i].getY());
            this.zzBj = zzZKQ.max(this.zzBj, (short) this.zzch[i].getY());
            i++;
        }
    }
}

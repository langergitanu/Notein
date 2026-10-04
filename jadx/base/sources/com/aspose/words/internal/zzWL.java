package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzWL {
    private int[] zzTB;
    private byte[] zzTZ;
    private int zzZF;

    private zzWL() {
    }

    public static int zzA(int i, int i2) {
        if (i == 0) {
            return 2;
        }
        return ((i + 1) * zzZr(i2)) + 3 + i2;
    }

    public static zzWL zzT(zzWK zzwk) throws Exception {
        zzWL zzwl = new zzWL();
        int iZzUT = zzwk.zzUT() & 65535;
        zzwl.zzZF = iZzUT;
        if (iZzUT == 0) {
            zzwl.zzTZ = new byte[0];
            zzwl.zzTB = new int[0];
            return zzwl;
        }
        zzwl.zzTB = zzwk.zzZ(zzwk.zzUR(), zzwl.zzZF + 1);
        zzwl.zzTZ = zzwk.zzn(r1[zzwl.zzZF] - 1);
        return zzwl;
    }

    private static short zzZr(int i) {
        int i2 = i + 1;
        if (i2 < 256) {
            return (short) 1;
        }
        if (i2 < 65536) {
            return (short) 2;
        }
        return i2 < 16777216 ? (short) 3 : (short) 4;
    }

    public final int getSize() {
        return zzA(this.zzZF, this.zzTZ.length);
    }

    public final int zzUV() {
        return this.zzZF;
    }

    public final void zzZ(zzWJ zzwj) throws Exception {
        zzwj.zzU((short) this.zzZF);
        if (this.zzZF == 0) {
            return;
        }
        short sZzZr = zzZr(this.zzTZ.length);
        zzwj.zzT(sZzZr);
        zzwj.zzZ(this.zzTB, sZzZr);
        zzwj.writeBytes(this.zzTZ);
    }

    public final byte[] zzZq(int i) {
        if (i < 0 || i > this.zzZF) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        int[] iArr = this.zzTB;
        int i2 = iArr[i];
        int i3 = i2 - 1;
        int i4 = iArr[i + 1] - i2;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = this.zzTZ[i3 + i5];
        }
        return bArr;
    }

    public zzWL(ArrayList<byte[]> arrayList) throws Exception {
        if (arrayList.size() == 0) {
            this.zzTZ = new byte[0];
            this.zzTB = new int[0];
            this.zzZF = 0;
            return;
        }
        zzZOR zzzor = new zzZOR();
        try {
            int size = arrayList.size();
            this.zzZF = size;
            int[] iArr = new int[size + 1];
            this.zzTB = iArr;
            iArr[0] = 1;
            int i = 0;
            while (i < this.zzZF) {
                byte[] bArr = arrayList.get(i);
                zzzor.write(bArr, 0, bArr.length);
                i++;
                this.zzTB[i] = ((int) zzzor.getPosition()) + 1;
            }
            this.zzTZ = zzzor.zzWy();
            zzzor.close();
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }
}

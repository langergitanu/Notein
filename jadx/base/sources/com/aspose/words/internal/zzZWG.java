package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.io.EOFException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWG {
    private int zz8A;
    private int zz8B;
    private int zz8C;
    private int zz8D;
    private double zz8E;
    private double zz8F;
    private short zz8G;
    private long zz8H;
    private short[] zz8x;
    private short zz8y;
    private short zz8z;
    private int zzVL;
    private int zzVN;
    private int zzVz;

    public zzZWG(byte[] bArr) throws Exception {
        this(new zzZOR(bArr));
    }

    private static double zzV(zzY0 zzy0, boolean z) throws Exception {
        int iZzW = zzW(zzy0, z);
        if (zzW(zzy0, z) != 0) {
            return (((long) iZzW) & 4294967295L) / (((long) r4) & 4294967295L);
        }
        return 0.0d;
    }

    private static int zzW(zzY0 zzy0, boolean z) throws Exception {
        int iZzXb = zzy0.zzXb();
        return !z ? zzXU.zz8(iZzXb) : iZzXb;
    }

    private static short zzX(zzY0 zzy0, boolean z) throws Exception {
        short sZzX9 = zzy0.zzX9();
        return !z ? zzXU.zzY(sZzX9) : sZzX9;
    }

    private void zzZ(zzY0 zzy0, boolean z, short s, short s2, int i) throws Exception {
        int i2 = s & 65535;
        if (i2 == 262) {
            this.zz8D = zzX(zzy0, z) & 65535;
            return;
        }
        if (i2 == 274) {
            this.zz8G = zzX(zzy0, z);
            return;
        }
        if (i2 == 277) {
            this.zz8z = zzX(zzy0, z);
            return;
        }
        if (i2 == 296) {
            this.zz8C = zzX(zzy0, z) & 65535;
            return;
        }
        if (i2 == 332) {
            this.zz8A = zzX(zzy0, z) & 65535;
            return;
        }
        if (i2 == 334) {
            this.zz8y = zzX(zzy0, z);
            return;
        }
        switch (i2) {
            case 256:
                this.zzVL = s2 == 3 ? zzX(zzy0, z) : zzW(zzy0, z);
                break;
            case 257:
                this.zzVN = s2 == 3 ? zzX(zzy0, z) : zzW(zzy0, z);
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                this.zz8x = zzZ(zzy0, z, i);
                break;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                this.zzVz = zzX(zzy0, z) & 65535;
                break;
            default:
                switch (i2) {
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                        this.zz8F = zzV(zzy0, z);
                        break;
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                        this.zz8E = zzV(zzy0, z);
                        break;
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                        this.zz8B = zzX(zzy0, z) & 65535;
                        break;
                }
                break;
        }
    }

    public static boolean zzZS(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzZU(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzZU(zzZOP zzzop) throws Exception {
        try {
            short sZzXa = new zzZOX(zzzop).zzXa();
            return sZzXa == 18761 || sZzXa == 19789;
        } catch (EOFException unused) {
            return false;
        }
    }

    private boolean zzo2() {
        int i = this.zzVz;
        return i == 1 || i == 32773 || i == 5 || i == 6;
    }

    private boolean zzo3() {
        int i = this.zzVz;
        return i == 1 || i == 32773 || i == 5 || i == 6;
    }

    private boolean zzo4() {
        int i = this.zzVz;
        return i == 1 || i == 5 || i == 32773;
    }

    private boolean zzo5() {
        int i = this.zzVz;
        return i == 1 || i == 2 || i == 32773;
    }

    private boolean zzo6() {
        int i = this.zzVz;
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 32773;
    }

    private boolean zzo7() {
        short[] sArr = this.zz8x;
        if (sArr.length != (this.zz8z & 65535)) {
            return false;
        }
        short s = sArr[0];
        boolean z = s == 8 || s == 16;
        int i = 0;
        while (true) {
            short[] sArr2 = this.zz8x;
            if (i >= sArr2.length) {
                return z;
            }
            z = z && sArr2[i] == sArr2[0];
            i++;
        }
    }

    private boolean zzo8() {
        return this.zz8A == 1 && this.zz8y == 4;
    }

    private boolean zzo9() {
        if (this.zz8B == 1 && zzo2() && zzo8()) {
            return zzo7();
        }
        return false;
    }

    private boolean zzoa() {
        if (this.zz8B == 1 && zzo3()) {
            return zzo7();
        }
        return false;
    }

    private boolean zzob() {
        short s = this.zz8x[0];
        return (s == 1 || s == 4 || s == 8) && zzo4();
    }

    private boolean zzoc() {
        short s = this.zz8x[0];
        return (s == 4 || s == 8 || s == 16) && zzo5();
    }

    private boolean zzod() {
        return this.zz8x[0] == 0 && zzo6();
    }

    private void zzp(zzY0 zzy0) throws Exception {
        short s;
        zzZWG zzzwg = this;
        zzY0 zzy02 = zzy0;
        short s2 = 1;
        boolean z = zzy02.zzXa() == 19789;
        if (zzX(zzy02, z) != 42) {
            return;
        }
        zzy02.zzq().zzH(zzzwg.zz8H + (((long) zzW(zzy02, z)) & 4294967295L));
        short sZzX = zzX(zzy02, z);
        int i = 0;
        long position = zzy02.zzq().getPosition();
        while (i < (65535 & sZzX)) {
            zzy02.zzq().zzH(position);
            long j = 12 + position;
            short sZzX2 = zzX(zzy02, z);
            short sZzX3 = zzX(zzy02, z);
            int iZzW = zzW(zzy02, z);
            if (iZzW != 0) {
                if (((sZzX3 == s2 || sZzX3 == 2) && (((long) iZzW) & 4294967295L) > 4) || ((sZzX3 == 3 && (((long) iZzW) & 4294967295L) > 2) || ((sZzX3 == 4 && (((long) iZzW) & 4294967295L) > 1) || sZzX3 == 5))) {
                    s = sZzX;
                    long jZzW = zzzwg.zz8H + (((long) zzW(zzy02, z)) & 4294967295L);
                    if (jZzW >= zzy02.zzq().getLength()) {
                        return;
                    } else {
                        zzy02.zzq().zzH(jZzW);
                    }
                } else {
                    s = sZzX;
                }
                zzzwg.zzZ(zzy02, z, sZzX2, sZzX3, iZzW);
            } else {
                s = sZzX;
            }
            i++;
            s2 = 1;
            zzzwg = this;
            zzy02 = zzy0;
            position = j;
            sZzX = s;
        }
    }

    public final int getOrientation() {
        short s = this.zz8G;
        if (s != 0) {
            return s & 65535;
        }
        return 1;
    }

    public final int zzoe() {
        return this.zz8C;
    }

    public final boolean zzof() {
        int i = this.zz8C;
        if (i != 1 && i != 2 && i != 3) {
            return false;
        }
        int i2 = this.zz8D;
        if (i2 == 0 || i2 == 1) {
            return zzod() || zzoc();
        }
        if (i2 == 2) {
            return zzoa();
        }
        if (i2 == 3) {
            return zzob();
        }
        if (i2 != 5) {
            return false;
        }
        return zzo9();
    }

    public final double zzog() {
        if (this.zz8C == 1) {
            return 96.0d;
        }
        return this.zz8E;
    }

    public final double zzoh() {
        if (this.zz8C == 1) {
            return 96.0d;
        }
        return this.zz8F;
    }

    public final int zzoi() {
        int i = this.zzVN;
        if (i != 0) {
            return (int) (((long) i) & 4294967295L);
        }
        return 100;
    }

    public final int zzoj() {
        int i = this.zzVL;
        if (i != 0) {
            return (int) (((long) i) & 4294967295L);
        }
        return 100;
    }

    public final boolean zzok() {
        if (this.zz8D == 2) {
            short[] sArr = this.zz8x;
            if (sArr.length == 3 && sArr[0] == 16 && sArr[1] == 16 && sArr[2] == 16) {
                return true;
            }
        }
        return false;
    }

    public zzZWG(zzZOP zzzop) throws Exception {
        this(new zzY0(zzzop));
    }

    public zzZWG(zzY0 zzy0) throws Exception {
        this.zz8D = 32767;
        this.zz8C = 2;
        this.zzVz = 1;
        this.zz8B = 1;
        this.zz8A = 1;
        this.zz8z = (short) 1;
        this.zz8y = (short) 4;
        this.zz8x = new short[]{0};
        this.zz8H = zzy0.zzq().getPosition();
        zzp(zzy0);
    }

    private static short[] zzZ(zzY0 zzy0, boolean z, int i) throws Exception {
        int i2 = (int) (((long) i) & 4294967295L);
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = zzX(zzy0, z);
        }
        return sArr;
    }
}

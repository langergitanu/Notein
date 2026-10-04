package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJU {
    private long[][] zzZLS;
    private char[] zzZLT;
    private char[] zzZLU;
    private byte[] zzZM0;
    private int[] zzZM1;
    private int[] zzZM2;
    private char[] zzZM3;
    private String zzZM4;
    private long[][] zzZM8;
    private long[][] zzZM9;
    private long[] zzZMb;
    private long[] zzZMc;
    private long[] zzZMd;
    private long[] zzZMe;
    private int[] zzZMh;
    private long[] zzZMj;
    private long[] zzZMk;
    private zzZJN zzZMn;
    private int zzVz = -1;
    private int zzVN = -1;
    private int zzVL = -1;
    private int zzZMm = -1;
    private int zzZMl = -1;
    private int zzil = -1;
    private int zzZMi = -1;
    private int zzZMg = -1;
    private int zzZMf = -1;
    private int zzZMa = -1;
    private int zz8D = -1;
    private int zz8C = -1;
    private int zzZM7 = -1;
    private int zzZM6 = -1;
    private long zzZM5 = -1;
    private ByteOrder zz5a = ByteOrder.BIG_ENDIAN;
    private int zzZLZ = -1;
    private int zzZLY = -1;
    private int zzUw = -1;
    private int zzZLX = -1;
    private long zzZLW = -1;
    private long zzZLV = -1;

    private static char[] toChars(int i) {
        return new char[]{(char) i};
    }

    private static char[] zzN(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArr[i];
        }
        return cArr;
    }

    private static int[] zzT(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        int length = cArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    private List<zzZJX> zzdy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzZJX(256, 3, 1, toChars(this.zzUw)));
        arrayList.add(new zzZJX(257, 3, 1, toChars(this.zzZLX)));
        int[] iArr = this.zzZMh;
        if (iArr != null) {
            arrayList.add(new zzZJX(StyleIdentifier.COLORFUL_LIST_ACCENT_6, 3, 4, zzN(iArr)));
        }
        arrayList.add(new zzZJX(StyleIdentifier.COLORFUL_GRID_ACCENT_6, 3, 1, toChars(this.zzVz)));
        arrayList.add(new zzZJX(StyleIdentifier.SUBTLE_REFERENCE, 3, 1, toChars(this.zz8D)));
        int i = this.zzZMa;
        if (i != -1) {
            arrayList.add(new zzZJX(StyleIdentifier.TOC_HEADING, 3, 1, toChars(i)));
        }
        long[] jArr = this.zzZMk;
        arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_1_LIGHT, 4, jArr.length, jArr));
        arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_5_DARK, 3, 1, toChars(this.zzZMi)));
        arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_6_COLORFUL, 3, 1, toChars(this.zzZMm)));
        long[] jArr2 = this.zzZMj;
        arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_7_COLORFUL, 4, jArr2.length, jArr2));
        long[][] jArr3 = this.zzZM9;
        if (jArr3 != null) {
            arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_3_ACCENT_1, 5, 1, jArr3));
        }
        long[][] jArr4 = this.zzZM8;
        if (jArr4 != null) {
            arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_4_ACCENT_1, 5, 1, jArr4));
        }
        int i2 = this.zzZM7;
        if (i2 != -1) {
            arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2, 4, 1, new long[]{i2}));
        }
        int i3 = this.zz8C;
        if (i3 != -1) {
            arrayList.add(new zzZJX(StyleIdentifier.GRID_TABLE_3_ACCENT_3, 3, 1, toChars(i3)));
        }
        int[] iArr2 = this.zzZM2;
        if (iArr2 != null) {
            arrayList.add(new zzZJX(StyleIdentifier.LIST_TABLE_3_ACCENT_2, 3, 1, zzN(iArr2)));
        }
        char[] cArr = this.zzZLU;
        if (cArr != null) {
            arrayList.add(new zzZJX(530, 3, 2, cArr));
        }
        char[] cArr2 = this.zzZLT;
        if (cArr2 != null) {
            arrayList.add(new zzZJX(531, 3, 1, cArr2));
        }
        long[][] jArr5 = this.zzZLS;
        if (jArr5 != null) {
            arrayList.add(new zzZJX(532, 5, 6, jArr5));
        }
        return arrayList;
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final void zzL(long[] jArr) {
        this.zzZM7 = (int) jArr[0];
    }

    public final void zzQ6(int i) {
        this.zzZLX = i;
    }

    public final void zzQ7(int i) {
        this.zzUw = i;
    }

    public final void zzQ8(int i) {
        this.zz8D = i;
    }

    public final void zzQ9(int i) {
        this.zzZMj = new long[i];
    }

    public final void zzQa(int i) {
        this.zzZMk = new long[i];
    }

    public final void zzQb(int i) {
        this.zzZMm = i;
    }

    public final void zzQc(int i) {
        this.zzZMi = i;
    }

    public final void zzQd(int i) {
        this.zzil = i;
    }

    public final long zzQe(int i) {
        long[] jArr = this.zzZMe;
        if (jArr != null) {
            return jArr[i];
        }
        long[] jArr2 = this.zzZMk;
        if (jArr2 != null) {
            return jArr2[i];
        }
        long[] jArr3 = this.zzZMd;
        if (jArr3 != null) {
            return jArr3[i];
        }
        return -1L;
    }

    public final long zzQf(int i) {
        long[] jArr = this.zzZMb;
        if (jArr != null) {
            return jArr[i];
        }
        long[] jArr2 = this.zzZMj;
        if (jArr2 != null) {
            return jArr2[i];
        }
        long[] jArr3 = this.zzZMc;
        if (jArr3 != null) {
            return jArr3[i];
        }
        throw new IllegalStateException("TIFF directory contains neither StripByteCounts nor TileByteCounts field: we must attempt to calculate from strip or tile width and height.");
    }

    public final void zzR(char[] cArr) {
        this.zzZM2 = zzT(cArr);
    }

    public final void zzS(char[] cArr) {
        this.zzZM1 = zzT(cArr);
    }

    public final void zzU(char[] cArr) {
        this.zzZLT = cArr;
    }

    public final void zzV(char[] cArr) {
        this.zzZLU = cArr;
    }

    public final void zzW(int i, int i2, Object obj) throws IOException {
        if (i == 262) {
            this.zz8D = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 266) {
            this.zzZMa = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 273) {
            this.zzZMk = (long[]) obj;
            return;
        }
        if (i == 296) {
            this.zz8C = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 305) {
            this.zzZM4 = String.valueOf(obj);
            return;
        }
        if (i == 317) {
            this.zzil = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 320) {
            this.zzZM3 = (char[]) obj;
            return;
        }
        if (i == 34675) {
            this.zzZM0 = (byte[]) obj;
            return;
        }
        if (i == 292) {
            this.zzZM7 = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 293) {
            this.zzZM6 = zzZJR.zzR(i2, obj);
            return;
        }
        if (i == 338) {
            this.zzZM2 = zzZJR.zzZS(obj);
            return;
        }
        if (i == 339) {
            this.zzZM1 = zzZJR.zzZS(obj);
            return;
        }
        if (i == 513) {
            this.zzZMd = (long[]) obj;
            return;
        }
        if (i == 514) {
            this.zzZMc = (long[]) obj;
            return;
        }
        switch (i) {
            case 256:
                this.zzVL = zzZJR.zzR(i2, obj);
                break;
            case 257:
                this.zzVN = zzZJR.zzR(i2, obj);
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                this.zzZMh = zzZJR.zzZS(obj);
                break;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                int iZzR = zzZJR.zzR(i2, obj);
                this.zzVz = iZzR;
                this.zzZMn = zzZJY.zzYU(iZzR, this.zzZMa);
                break;
            default:
                switch (i) {
                    case StyleIdentifier.GRID_TABLE_5_DARK /* 277 */:
                        this.zzZMi = zzZJR.zzR(i2, obj);
                        break;
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL /* 278 */:
                        this.zzZMm = zzZJR.zzR(i2, obj);
                        break;
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
                        this.zzZMj = (long[]) obj;
                        break;
                    default:
                        Class cls = Long.TYPE;
                        switch (i) {
                            case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                                if (this.zzZM9 == null) {
                                    this.zzZM9 = (long[][]) Array.newInstance((Class<?>) cls, 1, 2);
                                }
                                this.zzZM9[0][0] = zzZJR.zzR(i2, obj);
                                break;
                            case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                                if (this.zzZM8 == null) {
                                    this.zzZM8 = (long[][]) Array.newInstance((Class<?>) cls, 1, 2);
                                }
                                this.zzZM8[0][0] = zzZJR.zzR(i2, obj);
                                break;
                            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                                this.zzZMl = zzZJR.zzR(i2, obj);
                                break;
                            default:
                                switch (i) {
                                    case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                                        this.zzZMg = zzZJR.zzR(i2, obj);
                                        break;
                                    case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                                        this.zzZMf = zzZJR.zzR(i2, obj);
                                        break;
                                    case StyleIdentifier.LIST_TABLE_3 /* 324 */:
                                        this.zzZMe = (long[]) obj;
                                        break;
                                    case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                                        this.zzZMb = (long[]) obj;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public final int zzWL() {
        return this.zzVz;
    }

    public final void zzX(long[][] jArr) {
        this.zzZM8 = jArr;
    }

    public final void zzY(long[][] jArr) {
        this.zzZLS = jArr;
    }

    public final void zzYo(long j) {
        this.zzZM5 = j;
    }

    public final zzZJN zzZ(zzZJW zzzjw) {
        int i;
        if (this.zz8D == 6 && (i = this.zzVz) != 7 && i != 6) {
            boolean z = zzzjw.zze3().zzd5().getType() == 5;
            zzZJN zzzjn = this.zzZMn;
            if (zzzjn instanceof zzZJH) {
                zzzjn = null;
            }
            this.zzZMn = new zzZJE(zzzjn, z);
        }
        return this.zzZMn;
    }

    public final void zzZL(float f) {
        if (this.zzZM8 == null) {
            this.zzZM8 = new long[1][];
        }
        long[][] jArr = this.zzZM8;
        if (jArr[0] == null) {
            jArr[0] = new long[2];
        }
        long[] jArr2 = jArr[0];
        jArr2[0] = (int) f;
        jArr2[1] = 1;
    }

    public final void zzZM(float f) {
        if (this.zzZM9 == null) {
            this.zzZM9 = new long[1][];
        }
        long[][] jArr = this.zzZM9;
        if (jArr[0] == null) {
            jArr[0] = new long[2];
        }
        long[] jArr2 = jArr[0];
        jArr2[0] = (int) f;
        jArr2[1] = 1;
    }

    public final void zzZW(int i) {
        this.zzVz = i;
    }

    public final int zzdA() {
        return this.zzZLZ;
    }

    public final ByteOrder zzdB() {
        return this.zz5a;
    }

    public final int[] zzdC() {
        return this.zzZM2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] zzdD() {
        boolean z;
        int i = this.zzZMi;
        int i2 = -1;
        if (i == -1) {
            return null;
        }
        int[] iArr = this.zzZM1;
        if (iArr == null) {
            this.zzZM1 = new int[i];
            i2 = 4;
        } else {
            if (iArr.length == i) {
                z = false;
                for (int i3 = 0; i3 < this.zzZMi; i3++) {
                    int[] iArr2 = this.zzZM1;
                    int i4 = z ? i2 : iArr2[i3];
                    iArr2[i3] = i4;
                    if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                        System.out.println("Illegal value for SAMPLE_FORMAT, assuming SAMPLE_FORMAT_UNDEFINED");
                        this.zzZM1[i3] = 4;
                    }
                }
                return this.zzZM1;
            }
            i2 = iArr[0];
        }
        z = true;
        while (i3 < this.zzZMi) {
        }
        return this.zzZM1;
    }

    public final int zzdE() {
        return this.zzZM6;
    }

    public final int zzdF() {
        return this.zzZM7;
    }

    public final void zzdG() {
        this.zz8C = 1;
    }

    public final int zzdH() {
        return this.zz8C;
    }

    public final int zzdI() {
        long[][] jArr = this.zzZM8;
        if (jArr == null) {
            return -1;
        }
        return (int) jArr[0][0];
    }

    public final int zzdJ() {
        long[][] jArr = this.zzZM9;
        if (jArr == null) {
            return -1;
        }
        return (int) jArr[0][0];
    }

    public final char[] zzdK() {
        return this.zzZM3;
    }

    public final int zzdL() {
        if (this.zz8D == -1) {
            int i = this.zzVz;
            if (i == 2 || i == 3 || i == 4) {
                this.zz8D = 0;
            } else if (this.zzZM3 != null) {
                this.zz8D = 3;
            } else {
                int i2 = this.zzZMi;
                if (i2 == 3 || i2 == 4) {
                    this.zz8D = 2;
                } else {
                    this.zz8D = 1;
                }
            }
        }
        return this.zz8D;
    }

    public final int zzdM() {
        return this.zzZMa;
    }

    public final void zzdN() {
        this.zzZMb = null;
    }

    public final void zzdO() {
        this.zzZMe = null;
    }

    public final void zzdP() {
        this.zzZMf = -1;
    }

    public final int zzdQ() {
        return this.zzZMm;
    }

    public final void zzdR() {
        this.zzZMl = 1;
    }

    public final int zzdS() {
        return this.zzZMl;
    }

    public final int zzdT() {
        return this.zzZMi;
    }

    public final int[] zzdU() {
        boolean z;
        int i = this.zzZMi;
        if (i == -1) {
            return null;
        }
        int[] iArr = new int[i];
        int[] iArr2 = this.zzZMh;
        int i2 = 1;
        if (iArr2 == null) {
            z = true;
        } else if (iArr2.length != i) {
            i2 = iArr2[0];
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        for (int i3 = 0; i3 < this.zzZMi; i3++) {
            iArr[i3] = z ? i2 : this.zzZMh[i3];
        }
        this.zzZMh = iArr;
        return iArr;
    }

    public final void zzdV() {
        this.zzZMg = -1;
    }

    public final int zzdW() {
        return this.zzZMg;
    }

    public final int zzdX() {
        return this.zzil;
    }

    public final int zzdY() {
        int i = this.zzZMf;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzZMm;
        return i2 == -1 ? this.zzVN : i2;
    }

    public final int zzdZ() {
        int i = this.zzZMg;
        return i == -1 ? this.zzVL : i;
    }

    public final int zzdv() {
        return this.zz8D;
    }

    public final long zzdw() {
        return this.zzZLV;
    }

    public final long zzdx() {
        return this.zzZLW;
    }

    public final int zzdz() {
        return this.zzZLY;
    }

    public final byte[] zze0() {
        return this.zzZM0;
    }

    public final void zzZ(ByteOrder byteOrder) {
        this.zz5a = byteOrder;
    }

    public final long zzZ(zzZJT zzzjt) throws Exception {
        long position;
        long j;
        List<zzZJX> listZzdy = zzdy();
        zzzjt.writeShort(listZzdy.size());
        long size = (listZzdy.size() * 12) + zzzjt.getPosition() + 4;
        for (zzZJX zzzjx : listZzdy) {
            int type = zzzjx.getType();
            int count = zzzjx.getCount();
            int iZzQ5 = zzZJS.zzQ5(type) * count;
            int iZze5 = zzzjx.zze5();
            zzzjt.writeShort(iZze5);
            zzzjt.writeShort(type);
            zzzjt.writeInt(count);
            zzzjt.writeInt(0);
            long position2 = zzzjt.getPosition();
            zzzjt.zzH(zzzjt.getPosition() - 4);
            if (iZzQ5 > 4) {
                j = (size + 3) & (-4);
                zzzjt.writeInt((int) j);
                zzzjt.zzH(j);
                zzzjt.zzZ(zzzjx);
                position = zzzjt.getPosition();
            } else {
                long position3 = zzzjt.getPosition();
                zzzjt.zzZ(zzzjx);
                position = size;
                j = position3;
            }
            if (iZze5 == 279 || iZze5 == 325 || iZze5 == 514) {
                this.zzZLW = j;
            } else if (iZze5 == 273 || iZze5 == 324 || iZze5 == 513) {
                this.zzZLV = j;
            }
            zzzjt.zzH(position2);
            size = position;
        }
        return size;
    }

    public final void zzW(char[] cArr) {
        this.zzZMh = zzT(cArr);
    }

    public final void zzW(long[][] jArr) {
        this.zzZM9 = jArr;
    }
}

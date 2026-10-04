package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJD {
    public static final int[] zzZKK = {2, 3, 4, 5, 7, 8, 32773, 32946, 6, 1};
    private Bitmap zz4r;
    private zzZOP zzN5;
    private int zzZKA;
    private int zzZKB;
    int zzZKD;
    int zzZKE;
    int zzZKF;
    int zzZKG;
    int zzZKH;
    char[] zzZKI;
    int zzZKJ;
    private boolean zzZKf;
    private boolean zzZKg;
    private byte[] zzZKh;
    private boolean zzZKi;
    private boolean zzZKj;
    private int[] zzZKk;
    private int zzZKl;
    private int zzZKm;
    private int zzZKn;
    private int zzZKo;
    private long zzZKp;
    private boolean zzZKq;
    private zzZJ9 zzZKr;
    private ByteOrder zzZKs;
    private long zzZKu;
    private zzZJT zzZKv;
    private int zzZKw;
    private int zzZKx;
    private int zzZKy;
    private int[] zzZKz;
    private int zzZMB;
    private int zzZMC;
    private zzZJU zzZMD;
    int zzZKC = 4;
    private long zzZKt = 0;

    private void zzKF() throws Exception {
        zzZJU zzzju = this.zzZMD;
        if (zzzju != null) {
            this.zzZKs = zzzju.zzdB();
        } else {
            this.zzZKs = ByteOrder.BIG_ENDIAN;
        }
        if (this.zzZKs == ByteOrder.BIG_ENDIAN) {
            this.zzZKv.writeShort(19789);
        } else {
            this.zzZKv.writeShort(18761);
        }
        this.zzZKv.writeShort(42);
        this.zzZKv.writeInt(0);
        long position = this.zzN5.getPosition();
        this.zzZKt = position;
        this.zzZKu = position - 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzW(Bitmap bitmap, int i, int i2) throws IOException {
        Object[] objArr;
        int i3;
        char[] cArr;
        char[] cArr2;
        int i4;
        int i5;
        if (this.zzZMD.zzdS() != -1 && this.zzZMD.zzdS() != 1) {
            this.zzZMD.zzdR();
        }
        this.zzZKk = zzZK4.zzN(bitmap);
        if (this.zzZKj) {
            this.zzZKk = new int[]{1};
        }
        this.zzZKo = -1;
        boolean z = false;
        if (this.zzZMD.zzdv() != -1) {
            int iZzdv = this.zzZMD.zzdv();
            this.zzZKo = iZzdv;
            if (iZzdv == 3) {
                this.zzZKo = -1;
                objArr = false;
            } else {
                objArr = true;
            }
        } else {
            objArr = false;
        }
        int length = this.zzZKk.length;
        if (length <= 1 || !bitmap.hasAlpha()) {
            i3 = 0;
            cArr = null;
        } else {
            length--;
            cArr = new char[1];
            if (bitmap.isPremultiplied()) {
                cArr[0] = 1;
            } else {
                cArr[0] = 2;
            }
            i3 = 1;
        }
        if (length == 3) {
            this.zzZKn = 2;
            if (this.zzZKo == -1) {
                this.zzZKo = 2;
            }
        } else if (length == 1) {
            this.zzZKn = 1;
            int i6 = this.zzZKo;
            if (i6 != 1 && i6 != 0) {
                this.zzZKo = 1;
            }
        }
        if (this.zzZMD.zzWL() == -1) {
            this.zzZMD.zzZW(1);
        }
        int iZzdX = this.zzZMD.zzdX();
        this.zzZKJ = iZzdX;
        int i7 = 8;
        if (iZzdX != -1 && (this.zzZKk[0] != 8 || (iZzdX != 1 && iZzdX != 2))) {
            this.zzZKJ = 1;
            this.zzZMD.zzQd(1);
        }
        int iZzWL = this.zzZMD.zzWL();
        this.zzZKr = null;
        if (iZzWL == 2) {
            this.zzZKr = new zzZJ1();
            if (objArr == false) {
                this.zzZKo = 0;
            }
        } else if (iZzWL == 3) {
            this.zzZKr = new zzZJ0();
            if (objArr == false) {
                this.zzZKo = 0;
            }
        } else if (iZzWL == 4) {
            this.zzZKr = new zzZIZ();
            if (objArr == false) {
                this.zzZKo = 0;
            }
        } else if (iZzWL == 5) {
            this.zzZKr = new zzZJ4(this.zzZKJ);
        } else {
            if (iZzWL == 6) {
                throw new IOException("Old JPEG compression not supported!");
            }
            if (iZzWL == 7) {
                this.zzZKf = true;
                if (length == 3 || length == 4) {
                    int[] iArr = this.zzZKk;
                    if (iArr[0] == 8 && iArr[1] == 8 && iArr[2] == 8) {
                        this.zzZKo = 6;
                    } else {
                        if (length != 1 || this.zzZKk[0] != 8) {
                            throw new IOException("JPEG compression supported for 1- and 3-band byte images only!");
                        }
                        this.zzZKo = 1;
                    }
                    this.zzZKr = new zzZJ6();
                    i3 = 0;
                }
            } else if (iZzWL == 8) {
                this.zzZKr = new zzZIY();
            } else if (iZzWL == 32773) {
                this.zzZKr = new zzZJ2();
            } else if (iZzWL == 32946) {
                this.zzZKr = new zzZJ8();
            } else if (this.zzZMD.zzdM() == 2) {
                this.zzZKr = new zzZJ5();
            } else {
                this.zzZKr = new zzZJ3();
            }
        }
        this.zzZMD.zzQ8(this.zzZKo);
        int i8 = i3 + length;
        this.zzZKI = new char[i8];
        this.zzZKH = 0;
        int i9 = 0;
        while (i9 < length) {
            this.zzZKH = Math.max(this.zzZKH, this.zzZKk[i9]);
            i9++;
            z = z;
        }
        boolean z2 = z;
        int i10 = this.zzZKH;
        if (i10 == 3) {
            this.zzZKH = 4;
        } else if (i10 > 4 && i10 < 8) {
            this.zzZKH = 8;
        } else if (i10 > 8 && i10 < 16) {
            this.zzZKH = 16;
        } else if (i10 > 16) {
            this.zzZKH = 32;
        }
        int i11 = z2 ? 1 : 0;
        while (true) {
            cArr2 = this.zzZKI;
            i4 = i7;
            if (i11 >= cArr2.length) {
                break;
            }
            cArr2[i11] = (char) this.zzZKH;
            i11++;
            i7 = i4;
        }
        if (cArr2.length == 1 && cArr2[z2 ? 1 : 0] == 1) {
            int[] iArrZzdU = this.zzZMD.zzdU();
            if (iArrZzdU != null && (iArrZzdU.length != 1 || iArrZzdU[z2 ? 1 : 0] != 1)) {
                this.zzZMD.zzW((char[]) null);
            }
        } else {
            this.zzZMD.zzW(cArr2);
        }
        int[] iArrZzdD = this.zzZMD.zzdD();
        if (iArrZzdD == null && ((i5 = this.zzZKH) == 16 || i5 == 32)) {
            char c = i5 == 16 ? (char) 1 : i5 == 32 ? (char) 3 : (char) 2;
            this.zzZKC = c;
            char[] cArr3 = new char[this.zzZKI.length];
            Arrays.fill(cArr3, c);
            this.zzZMD.zzS(cArr3);
        } else if (iArrZzdD != null) {
            this.zzZKC = iArrZzdD[z2 ? 1 : 0];
        } else {
            this.zzZKC = 4;
        }
        if (cArr != null) {
            this.zzZMD.zzR(cArr);
        } else {
            this.zzZMD.zzR(null);
        }
        this.zzZMD.zzQc(this.zzZKI.length);
        if (this.zzZMD.zzdJ() == -1 && this.zzZMD.zzdI() == -1) {
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[z2 ? 1 : 0] = 1;
            long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iArr2);
            jArr[z2 ? 1 : 0] = new long[2];
            int iZzdH = this.zzZMD.zzdH();
            if (iZzdH == -1 && this.zzZMD.zzdA() == -1 && this.zzZMD.zzdz() == -1) {
                long[] jArr2 = jArr[z2 ? 1 : 0];
                jArr2[z2 ? 1 : 0] = 1;
                jArr2[1] = 1;
                this.zzZMD.zzdG();
            } else {
                if (iZzdH == -1) {
                    iZzdH = 2;
                }
                int iMax = Math.max(i, i2);
                if (iZzdH == 2) {
                    long[] jArr3 = jArr[z2 ? 1 : 0];
                    jArr3[z2 ? 1 : 0] = iMax;
                    jArr3[1] = 4;
                } else if (iZzdH != 3) {
                    long[] jArr4 = jArr[z2 ? 1 : 0];
                    jArr4[z2 ? 1 : 0] = 1;
                    jArr4[1] = 1;
                } else {
                    long[] jArr5 = jArr[z2 ? 1 : 0];
                    jArr5[z2 ? 1 : 0] = ((long) iMax) * 100;
                    jArr5[1] = 1016;
                }
            }
            this.zzZMD.zzW(jArr);
            this.zzZMD.zzX(jArr);
        } else if (this.zzZMD.zzdJ() == -1 && this.zzZMD.zzdI() != -1) {
            this.zzZMD.zzZM(r3.zzdI());
        } else if (this.zzZMD.zzdJ() != -1 && this.zzZMD.zzdI() == -1) {
            this.zzZMD.zzZL(r3.zzdJ());
        }
        this.zzZMD.zzQ7(i);
        this.zzZMD.zzQ6(i2);
        int iZzdQ = this.zzZMD.zzdQ();
        if (iZzdQ == -1) {
            iZzdQ = Math.max(Math.max(8192 / ((((this.zzZKH * i8) * i) + 7) / 8), 1), i4);
        } else if (iZzdQ < 0) {
            iZzdQ = i2;
        }
        int iMin = Math.min(iZzdQ, i2);
        this.zzZKG = i;
        this.zzZKF = iMin;
        this.zzZKE = C24611OooO00o.OooO00o(i, i, 1, i);
        this.zzZKD = C24611OooO00o.OooO00o(i2, iMin, 1, iMin);
        if (iZzWL == 7) {
            int i12 = length != 1 ? 2 : 1;
            if (iMin < i2) {
                int iMax2 = Math.max(i12, i12) * 8;
                iMin = Math.max((((iMax2 / 2) + this.zzZKF) / iMax2) * iMax2, iMax2);
                this.zzZKF = iMin;
            }
        }
        this.zzZKq = z2;
        this.zzZMD.zzdV();
        this.zzZMD.zzdP();
        this.zzZMD.zzdO();
        this.zzZMD.zzdN();
        this.zzZMD.zzQb(iMin);
        this.zzZMD.zzQa(this.zzZKD);
        this.zzZMD.zzQ9(this.zzZKD);
    }

    public final void zzZ(zzZJU zzzju, Bitmap bitmap, boolean z) throws Exception {
        if (bitmap == null) {
            throw new IllegalArgumentException("image == null!");
        }
        this.zzZMD = zzzju;
        this.zzZKv = new zzZJT(zzzju.zzdB(), this.zzN5);
        this.zz4r = bitmap;
        boolean z2 = true;
        int i = 0;
        boolean z3 = this.zzZMD.zzWL() == 2 || this.zzZMD.zzWL() == 3 || this.zzZMD.zzWL() == 4;
        this.zzZKj = z3;
        if (z3) {
            this.zz4r = zzZK4.zzS(this.zz4r);
        }
        this.zzZMC = 0;
        this.zzZMB = 0;
        this.zzZKB = bitmap.getWidth();
        this.zzZKA = bitmap.getHeight();
        new zzZQ5(this.zzZMC, this.zzZMB, this.zzZKB, this.zzZKA);
        this.zzZKz = null;
        this.zzZKw = 4;
        this.zzZKy = 1;
        this.zzZKx = 1;
        int i2 = this.zzZKB;
        int i3 = this.zzZKA;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Empty source region!");
        }
        long j = 4;
        if (z) {
            zzKF();
            this.zzN5.zzH(this.zzZKu + 4);
            long j2 = (this.zzZKt + 3) & (-4);
            this.zzZKt = j2;
            this.zzZKv.writeInt((int) j2);
        }
        zzW(bitmap, i2, i3);
        this.zzZKr.zzZ(this.zzZMD);
        this.zzZKr.zzY(this.zzZKv);
        int i4 = this.zzZKn;
        if ((i4 != 1 || this.zzZKo != 0) && (i4 != 0 || this.zzZKo != 1)) {
            z2 = false;
        }
        this.zzZKi = z2;
        long jZzZ = this.zzZMD.zzZ(this.zzZKv);
        this.zzZKp = this.zzN5.getPosition();
        this.zzZKv.writeInt(0);
        this.zzN5.zzH(jZzZ);
        if (jZzZ > this.zzZKt) {
            this.zzZKt = jZzZ;
        }
        if (this.zzZKj) {
            this.zzZKh = zzZK4.zzZ(this.zz4r, this.zzZKg, this.zzZKi);
        }
        long jZzdx = this.zzZMD.zzdx();
        long jZzdw = this.zzZMD.zzdw();
        this.zzZKm = this.zzZKG * this.zzZKF * this.zzZKD * this.zzZKE;
        this.zzZKl = 0;
        int i5 = 0;
        while (i5 < this.zzZKD) {
            int i6 = i;
            while (i6 < this.zzZKE) {
                long position = this.zzZKv.getPosition();
                int i7 = this.zzZMC;
                int i8 = this.zzZKG;
                int i9 = this.zzZKy;
                int i10 = (i6 * i8 * i9) + i7;
                int i11 = this.zzZMB;
                long j3 = j;
                int i12 = this.zzZKF;
                int i13 = i5 * i12;
                int i14 = i5;
                int i15 = this.zzZKx;
                zzZQ5 zzzq5 = new zzZQ5(i10, (i13 * i15) + i11, i8 * i9, i12 * i15);
                try {
                    int iZzZ = zzZ(zzzq5, this.zzZKr);
                    long j4 = ((long) iZzZ) + position;
                    if (j4 > this.zzZKt) {
                        this.zzZKt = j4;
                    }
                    this.zzZKl = (zzzq5.getWidth() * zzzq5.getHeight()) + this.zzZKl;
                    long position2 = this.zzZKv.getPosition();
                    this.zzZKv.seek(jZzdw);
                    this.zzZKv.writeInt((int) position);
                    jZzdw += j3;
                    this.zzZKv.seek(jZzdx);
                    this.zzZKv.writeInt(iZzZ);
                    jZzdx += j3;
                    this.zzZKv.zzH(position2);
                    i6++;
                    i5 = i14;
                    j = j3;
                } catch (IOException e) {
                    throw new IOException("I/O error writing TIFF file!", e);
                }
            }
            i5++;
            i = 0;
        }
    }

    public final void zzZD(zzZOP zzzop) throws Exception {
        this.zzZKg = false;
        this.zzN5 = zzzop;
        if (zzzop == null) {
            throw new IllegalStateException("output == null!");
        }
        try {
            this.zzZKu = zzzop.getPosition();
            try {
                byte[] bArr = new byte[4];
                this.zzN5.read(bArr, 0, 4);
                byte b = bArr[0];
                if ((b == 73 && bArr[1] == 73 && bArr[2] == 42 && bArr[3] == 0) || (b == 77 && bArr[1] == 77 && bArr[2] == 0 && bArr[3] == 42)) {
                    this.zzZKt = this.zzN5.getLength();
                } else {
                    this.zzZKt = this.zzZKu;
                }
            } catch (Exception unused) {
                this.zzZKt = this.zzZKu;
            }
            this.zzN5.zzH(this.zzZKu);
        } catch (Exception unused2) {
            this.zzZKu = 0L;
            this.zzZKt = 0L;
        }
    }

    public final void zzZ(int i, Bitmap bitmap) throws Exception {
        if (this.zzN5 == null) {
            throw new IllegalStateException("Output not set!");
        }
        if (bitmap != null) {
            long[] jArr = new long[1];
            long[] jArr2 = new long[1];
            zzZ(i, jArr, jArr2);
            this.zzZKv.seek(jArr[0]);
            long j = jArr[0];
            if (j + 4 > this.zzZKt) {
                this.zzZKt = j + 4;
            }
            long j2 = (this.zzZKt + 3) & (-4);
            this.zzZKt = j2;
            this.zzZKv.writeInt((int) j2);
            this.zzZKv.seek(this.zzZKt);
            zzZ(this.zzZMD, bitmap, false);
            this.zzZKv.seek(this.zzZKp);
            this.zzZKv.writeInt((int) jArr2[0]);
            return;
        }
        throw new IllegalArgumentException("image == null!");
    }

    private void zzZ(int i, long[] jArr, long[] jArr2) throws Exception {
        ByteOrder byteOrder;
        if (i >= -1) {
            long position = this.zzZKv.getPosition();
            this.zzZKv.seek(this.zzZKu);
            byte[] bArr = new byte[2];
            this.zzN5.read(bArr, 0, 2);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            if (i2 == 19789) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else if (i2 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else {
                this.zzZKv.seek(position);
                throw new IOException("Illegal byte order");
            }
            zzZKF zzzkf = new zzZKF(byteOrder, this.zzN5);
            if (zzzkf.readUnsignedShort() == 42) {
                jArr[0] = zzzkf.zzf0();
                long jZzf1 = zzzkf.zzf1();
                jArr2[0] = jZzf1;
                if (jZzf1 == 0) {
                    if (i <= 0) {
                        return;
                    }
                    zzzkf.seek(position);
                    throw new IndexOutOfBoundsException("imageIndex is greater than the largest available index!");
                }
                zzzkf.seek(jZzf1);
                int i3 = 0;
                while (true) {
                    if (i != -1 && i3 >= i) {
                        return;
                    }
                    try {
                        zzzkf.zzQk(zzzkf.readShort() * 12);
                        jArr[0] = zzzkf.zzf0();
                        long jZzf12 = zzzkf.zzf1();
                        jArr2[0] = jZzf12;
                        if (jZzf12 == 0) {
                            if (i == -1 || i3 >= i - 1) {
                                return;
                            }
                            zzzkf.seek(position);
                            throw new IndexOutOfBoundsException("imageIndex is greater than the largest available index!");
                        }
                        zzzkf.seek(jZzf12);
                        i3++;
                    } catch (EOFException unused) {
                        zzzkf.seek(position);
                        jArr2[0] = 0;
                        return;
                    }
                }
            } else {
                this.zzZKv.seek(position);
                throw new IOException("Illegal magic number");
            }
        } else {
            throw new IndexOutOfBoundsException("imageIndex < -1!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(zzZQ5 zzzq5, zzZJ9 zzzj9) throws Exception {
        zzZQ5 zzzq52;
        zzZQ5 zzzq53 = new zzZQ5(0, 0, this.zz4r.getWidth(), this.zz4r.getHeight());
        if (!this.zzZKq) {
            zzzq5 = zzZQ5.zzY(zzzq5, zzzq53);
        } else {
            if (!zzzq53.zzQ(zzzq5)) {
                zzZQ5 zzzq5ZzY = zzZQ5.zzY(zzzq53, zzzq5);
                zzzq52 = zzzq5;
                zzzq5 = zzzq5ZzY;
            }
            if (!zzzq5.isEmpty()) {
                return 0;
            }
            zzzq52.getX();
            zzzq52.getY();
            int width = zzzq52.getWidth();
            int height = zzzq52.getHeight();
            if (this.zzZKj) {
                int i = (width + 7) / 8;
                byte[] bArr = new byte[i * height];
                zzZ(this.zzZKh, bArr, zzzq5, i);
                return zzzj9.zzZ(bArr, 0, width, height, this.zzZKk, i);
            }
            int i2 = this.zzZKy;
            int i3 = this.zzZKx;
            int iOooO00o = C24611OooO00o.OooO00o(width, i2, 1, i2);
            int iOooO00o2 = C24611OooO00o.OooO00o(height, i3, 1, i3);
            if (iOooO00o == 0 || iOooO00o2 == 0) {
                return 0;
            }
            int i4 = this.zzZKH;
            int i5 = 8 / i4;
            int iOooO00o3 = iOooO00o * this.zzZKw;
            if (i4 < 8) {
                iOooO00o3 = C24611OooO00o.OooO00o(iOooO00o3, i5, 1, i5);
            } else if (i4 == 16) {
                iOooO00o3 *= 2;
            } else if (i4 == 32) {
                iOooO00o3 *= 4;
            }
            if (i4 == 8) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zz4r, zzzq5.getX(), zzzq5.getY(), zzzq5.getWidth(), zzzq5.getHeight());
                if (this.zzZKf) {
                    return zzzj9.zzK(bitmapCreateBitmap);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iOooO00o3 * iOooO00o2);
                bitmapCreateBitmap.copyPixelsToBuffer(byteBufferAllocate);
                return zzzj9.zzZ(byteBufferAllocate.array(), 0, width, height, this.zzZKk, width * this.zzZKw);
            }
            throw new UnsupportedOperationException();
        }
        zzzq52 = zzzq5;
        if (!zzzq5.isEmpty()) {
        }
    }

    private void zzZ(byte[] bArr, byte[] bArr2, zzZQ5 zzzq5, int i) throws Exception {
        int width = zzzq5.getWidth();
        int height = zzzq5.getHeight();
        int x = zzzq5.getX();
        int y = zzzq5.getY();
        byte[] bArr3 = new byte[width];
        for (int i2 = y; i2 < y + height; i2++) {
            zzZ(x, i2, width, bArr3, bArr);
            zzZ(x, i2, width, bArr3, bArr2, i, zzzq5);
        }
    }

    private static byte[] zzZ(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = (i2 * i3) + i;
        int i5 = 0;
        int i6 = i4;
        while (i6 < i4 + i3) {
            bArr[i5] = bArr2[i6];
            i6++;
            i5++;
        }
        return bArr;
    }

    private void zzZ(int i, int i2, int i3, byte[] bArr, byte[] bArr2, int i4, zzZQ5 zzzq5) {
        int i5;
        int x = zzzq5.getX();
        int y = zzzq5.getY();
        int width = this.zz4r.getWidth();
        int height = this.zz4r.getHeight();
        if (i < x || i2 < y || i + i3 > width || i2 + 1 > height) {
            throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
        }
        if (i3 == 0) {
            return;
        }
        int i6 = i - x;
        int i7 = (i2 - y) * i4;
        int i8 = 0;
        for (int i9 = 0; i9 <= 0; i9++) {
            int i10 = i6;
            int i11 = 0;
            while (i11 < i3 && (i5 = i10 & 7) != 0) {
                int i12 = 7 - i5;
                int i13 = (i10 >> 3) + i7;
                bArr2[i13] = (byte) (((bArr[i8] & 1) << i12) | (bArr2[i13] & (~(1 << i12))));
                i10++;
                i11++;
                i8++;
            }
            int i14 = (i10 >> 3) + i7;
            while (i11 < i3 - 7) {
                int i15 = i8 + 7;
                int i16 = ((bArr[i8 + 1] & 1) << 6) | ((bArr[i8] & 1) << 7) | ((bArr[i8 + 2] & 1) << 5) | ((bArr[i8 + 3] & 1) << 4) | ((bArr[i8 + 4] & 1) << 3) | ((bArr[i8 + 5] & 1) << 2) | ((bArr[i8 + 6] & 1) << 1);
                i8 += 8;
                bArr2[i14] = (byte) (i16 | (bArr[i15] & 1));
                i10 += 8;
                i11 += 8;
                i14++;
            }
            while (i11 < i3) {
                int i17 = 7 - (i10 & 7);
                int i18 = (i10 >> 3) + i7;
                bArr2[i18] = (byte) (((bArr[i8] & 1) << i17) | (bArr2[i18] & (~(1 << i17))));
                i10++;
                i11++;
                i8++;
            }
            i7 += i4;
        }
    }
}

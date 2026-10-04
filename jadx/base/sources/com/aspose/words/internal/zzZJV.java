package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.io.EOFException;
import java.nio.ByteOrder;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJV {
    private ByteOrder zz5a;
    private zzZOP zzN5;
    private int zzZMB;
    private int zzZMC;
    private zzZJU zzZMD;
    private zzZJN zzZMn;
    private zzZJW zzZMo;
    private zzZKF zzZMs;
    private int zzZMt;
    private int zzZMu;
    private int zzZMv;
    private int zzZMw;
    private int zzZMx;
    private int zzZMy;
    private int zzZMA = 1;
    private int zzZMz = 1;
    private byte[] zzUD = new byte[12];
    private long zzZMr = -1;
    private int zzZMq = -1;
    private int zzZMp = -1;

    private void zzLh() throws Exception {
        this.zzN5.read(this.zzUD, 0, 2);
        byte[] bArr = this.zzUD;
        int i = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        if (i == 19789) {
            this.zz5a = ByteOrder.BIG_ENDIAN;
        } else if (i == 18761) {
            this.zz5a = ByteOrder.LITTLE_ENDIAN;
        } else {
            System.err.println("Bad byte order flag. Use LITTLE_ENDIAN by default");
        }
        zzZKF zzzkf = new zzZKF(this.zz5a, this.zzN5);
        this.zzZMs = zzzkf;
        int unsignedShort = zzzkf.readUnsignedShort();
        if (unsignedShort != 42) {
            System.err.println("Bad magic number: " + unsignedShort);
        }
        long jZzf1 = this.zzZMs.zzf1();
        this.zzZMr = jZzf1;
        this.zzN5.zzH(jZzf1);
        zzZJU zzzju = new zzZJU();
        this.zzZMD = zzzju;
        zzzju.zzZ(this.zz5a);
        zzX(this.zzZMD);
        zzW(this.zzZMD);
    }

    private void zzW(zzZJU zzzju) throws Exception {
        int iZzdZ = zzzju.zzdZ();
        int iZzdY = zzzju.zzdY();
        int width = zzzju.getWidth();
        int height = zzzju.getHeight();
        int[] iArrZzdU = zzzju.zzdU();
        int iZzdT = zzzju.zzdT();
        int iZzdS = zzzju.zzdS();
        zzZQ5 zzzq5 = new zzZQ5(0, 0, width, height);
        this.zzZMC = zzzq5.getX();
        this.zzZMB = zzzq5.getY();
        this.zzZMq = C24611OooO00o.OooO00o(width, iZzdZ, 1, iZzdZ);
        this.zzZMp = C24611OooO00o.OooO00o(height, iZzdY, 1, iZzdY);
        this.zzZMo = zzZJW.zzY(zzzju);
        if (this.zzZMD.zze0() != null && (this.zzZMo.zze3() instanceof zzZIQ)) {
            System.err.println("ICC_Profile has been read from the TIFF image but it cannot be applied at the moment.");
        }
        this.zzZMn = zzzju.zzZ(this.zzZMo);
        zzZJP zzzjq = (zzzju.zzdL() == 8 && this.zzZMo.zze3().zzd5().getType() == 5) ? new zzZJQ() : (zzzju.zzdL() != 6 || (this.zzZMn instanceof zzZJE) || zzzju.zzWL() == 7 || zzzju.zzWL() == 6) ? null : new zzZJO(zzzju);
        this.zzZMn.zzL(iArrZzdU);
        this.zzZMn.zzPZ(this.zzZMC);
        this.zzZMn.zzPY(this.zzZMB);
        this.zzZMn.zzQ1(this.zzZMA);
        this.zzZMn.zzQ0(this.zzZMz);
        this.zzZMn.zzPX(this.zzZMy);
        this.zzZMn.zzPW(this.zzZMx);
        this.zzZMn.zzQc(iZzdT);
        this.zzZMn.zzZ(zzzjq);
        this.zzZMn.zzM(zzzju.zzdD());
        int iZzYK = zzZIF.zzYK(zzzq5.getX(), iZzdZ);
        int iZzYJ = zzZIF.zzYJ(zzzq5.getY(), iZzdY);
        int iZzYK2 = zzZIF.zzYK((zzzq5.getWidth() + zzzq5.getX()) - 1, iZzdZ);
        int iZzYJ2 = zzZIF.zzYJ((zzzq5.getHeight() + zzzq5.getY()) - 1, iZzdY);
        int iZzdT2 = zzzju.zzdT();
        int[] iArr = new int[iZzdT2];
        for (int i = 0; i < iZzdT2; i++) {
            iArr[i] = i;
        }
        int[] iArr2 = new int[iZzdT2];
        for (int i2 = 0; i2 < iZzdT2; i2++) {
            iArr2[i2] = i2;
        }
        this.zzZMn.zzK(iArr);
        this.zzZMn.zzJ(iArr2);
        if (iZzdS != 2) {
            while (iZzYJ <= iZzYJ2) {
                for (int i3 = iZzYK; i3 <= iZzYK2; i3++) {
                    zzZ(i3, iZzYJ, -1, zzzju);
                }
                iZzYJ++;
            }
            return;
        }
        this.zzZMn.zzdr();
        while (iZzYJ <= iZzYJ2) {
            for (int i4 = iZzYK; i4 <= iZzYK2; i4++) {
                for (int i5 = 0; i5 < iZzdT2; i5++) {
                    this.zzZMn.zzK(new int[]{iArr[i5]});
                    this.zzZMn.zzJ(new int[]{iArr2[i5]});
                    zzZ(i4, iZzYJ, i5, zzzju);
                }
            }
            iZzYJ++;
        }
    }

    private void zzX(zzZJU zzzju) throws Exception {
        int unsignedShort = this.zzZMs.readUnsignedShort();
        long position = this.zzN5.getPosition();
        for (int i = 0; i < unsignedShort; i++) {
            this.zzN5.zzH(position);
            int unsignedShort2 = this.zzZMs.readUnsignedShort();
            int unsignedShort3 = this.zzZMs.readUnsignedShort();
            int iZzf1 = (int) this.zzZMs.zzf1();
            if (zzZJS.zzQ5(unsignedShort3) * iZzf1 > 4) {
                this.zzN5.zzH(this.zzZMs.zzf1());
            }
            zzzju.zzW(unsignedShort2, unsignedShort3, zzZJR.zzZ(this.zzZMs, unsignedShort3, iZzf1));
            position += 12;
        }
        try {
            long jZzf1 = this.zzZMs.zzf1();
            if (jZzf1 > 0) {
                zzzju.zzYo(jZzf1);
            }
        } catch (EOFException e) {
            System.err.println(e.getMessage() + " but it seems to be ok. There is no other images.");
        }
    }

    private void zzZ(int i, int i2, int i3, zzZJU zzzju) throws Exception {
        zzZQ5 zzzq5 = new zzZQ5(zzzju.zzdZ() * i, zzzju.zzdY() * i2, zzzju.zzdZ(), zzzju.zzdY());
        if (!zze1()) {
            zzzq5 = zzZQ5.zzY(zzzq5, new zzZQ5(0, 0, zzzju.getWidth(), zzzju.getHeight()));
        }
        if (zzzq5.getWidth() <= 0 || zzzq5.getHeight() <= 0) {
            return;
        }
        int x = zzzq5.getX();
        int y = zzzq5.getY();
        int width = zzzq5.getWidth();
        int height = zzzq5.getHeight();
        this.zzZMu = zzZIF.zzYM(x - this.zzZMC, this.zzZMA);
        int iZzYL = zzZIF.zzYL(((x + width) - 1) - this.zzZMC, this.zzZMA);
        this.zzZMt = zzZIF.zzYM(y - this.zzZMB, this.zzZMz);
        int iZzYL2 = zzZIF.zzYL(((y + height) - 1) - this.zzZMB, this.zzZMz);
        int i4 = this.zzZMu;
        this.zzZMw = (iZzYL - i4) + 1;
        int i5 = this.zzZMt;
        this.zzZMv = (iZzYL2 - i5) + 1;
        this.zzZMu = i4 + this.zzZMy;
        this.zzZMt = i5 + this.zzZMx;
        zzZQ5 zzzq5ZzY = zzZQ5.zzY(new zzZQ5(this.zzZMu, this.zzZMt, this.zzZMw, this.zzZMv), new zzZQ5(0, 0, zzzju.getWidth(), zzzju.getHeight()));
        this.zzZMu = zzzq5ZzY.getX();
        this.zzZMt = zzzq5ZzY.getY();
        this.zzZMw = zzzq5ZzY.getWidth();
        int height2 = zzzq5ZzY.getHeight();
        this.zzZMv = height2;
        if (this.zzZMw <= 0 || height2 <= 0) {
            return;
        }
        int i6 = this.zzZMu;
        int i7 = this.zzZMy;
        int i8 = this.zzZMA;
        int i9 = this.zzZMC;
        int i10 = ((i6 - i7) * i8) + i9;
        int i11 = ((((((i6 + r7) - 1) - i7) * i8) + i9) - i10) + 1;
        int i12 = this.zzZMt;
        int i13 = this.zzZMx;
        int i14 = this.zzZMz;
        int i15 = this.zzZMB;
        int i16 = ((i12 - i13) * i14) + i15;
        int i17 = ((((((i12 + height2) - 1) - i13) * i14) + i15) - i16) + 1;
        int i18 = (this.zzZMq * i2) + i;
        if (zzzju.zzdS() == 2) {
            i18 += this.zzZMq * i3 * this.zzZMp;
        }
        long jZzQe = zzzju.zzQe(i18);
        long jZzQf = zzzju.zzQf(i18);
        this.zzZMn.zzPU(x);
        this.zzZMn.zzPT(y);
        this.zzZMn.zzPS(width);
        this.zzZMn.zzPR(height);
        this.zzZMn.zzQ4(this.zzZMu);
        this.zzZMn.zzPQ(this.zzZMt);
        this.zzZMn.zzQ3(this.zzZMw);
        this.zzZMn.zzQ2(this.zzZMv);
        this.zzZMn.zzPO(i10);
        this.zzZMn.zzPN(i16);
        this.zzZMn.zzPP(i11);
        this.zzZMn.zzPM(i17);
        this.zzZMn.zzZ(this.zzZMD);
        this.zzZMn.zz5(this.zzN5);
        this.zzZMn.zzZ(this.zzZMs);
        this.zzZMn.zzYn(jZzQe);
        this.zzZMn.zzQd(zzzju.zzdX());
        this.zzZMn.zzPV((int) jZzQf);
        this.zzZMn.zzX(this.zzZMo);
        this.zzZMn.zzdu();
        long position = this.zzN5.getPosition();
        this.zzZMn.zzdt();
        this.zzN5.zzH(position);
    }

    private boolean zze1() {
        return this.zzZMD.zzdW() != -1;
    }

    public final Bitmap getBitmap() {
        int width = this.zzZMo.getWidth();
        int height = this.zzZMo.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        zzZIS zzzisZze3 = this.zzZMo.zze3();
        zzZIA zzziaZze2 = this.zzZMo.zze2();
        zzZIO zzzioZze4 = this.zzZMo.zze4();
        int[] iArr = new int[width * height];
        Object objZzZ = null;
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = 0;
            while (i3 < width) {
                objZzZ = zzziaZze2.zzZ(i3, i2, objZzZ, zzzioZze4);
                iArr[i] = zzzisZze3.zzZN(objZzZ);
                i3++;
                i++;
            }
        }
        return Bitmap.createBitmap(iArr, 0, width, width, height, config);
    }

    public final void zzZE(zzZOP zzzop) throws Exception {
        this.zzN5 = zzzop;
        zzLh();
    }
}

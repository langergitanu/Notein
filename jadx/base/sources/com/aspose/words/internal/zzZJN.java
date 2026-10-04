package com.aspose.words.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZJN {
    protected int zz8r;
    protected long zzDs;
    protected zzZOP zzN5;
    protected int zzZLA;
    protected int zzZLB;
    protected int zzZLC;
    protected int zzZLD;
    protected int zzZLE;
    protected int zzZLF;
    protected int zzZLG;
    protected int zzZLH;
    protected int zzZLI;
    protected boolean zzZLJ;
    protected int[] zzZLK;
    protected int zzZLL;
    protected int zzZLM;
    protected int zzZLN;
    protected int zzZLO;
    protected int[] zzZLP;
    private zzZJW zzZLm;
    private boolean zzZLn;
    private int zzZLo;
    private int zzZLp;
    private int[][] zzZLq;
    private boolean zzZLr;
    private boolean zzZLs;
    private boolean zzZLt;
    private int[] zzZLu;
    private int zzZLv;
    private int zzZLw;
    private zzZJP zzZLx;
    private int zzZLy;
    private int[] zzZLz;
    protected zzZJU zzZMD;
    protected int zzZMi;
    protected zzZJW zzZMo;
    protected zzZKF zzZMs;
    protected int zzil;

    private void zzW(byte[] bArr, int i, int i2, int i3) throws IOException {
        zzZIA zzziaZze2 = this.zzZLm.zze2();
        int iZzcN = zzziaZze2.zzcN();
        int[] iArrZzcY = zzziaZze2.zzcY();
        zzZOR zzzor = new zzZOR(bArr);
        long j = 0;
        int i4 = 0;
        int i5 = this.zzZLH;
        int iZzRI = 0;
        while (i4 < i3) {
            zzzor.zzH(j);
            int i6 = this.zzZLI;
            int i7 = 0;
            int i8 = 0;
            while (i7 < i2) {
                int i9 = i6;
                int i10 = 0;
                while (i10 < iZzcN) {
                    if (i8 == 0) {
                        iZzRI = zzzor.zzRI();
                    }
                    int i11 = iZzcN;
                    zzZIA zzzia = zzziaZze2;
                    long jZzr = zzr(iZzRI, iArrZzcY[i10], i8);
                    int i12 = (i8 + iArrZzcY[i10]) & 7;
                    int i13 = i9;
                    zzzia.zzZ(i13, i5, i10, (int) jZzr, this.zzZLm.zze4());
                    i7 = i7;
                    i8 = i12;
                    iZzRI = iZzRI;
                    iZzcN = i11;
                    i9 = i13;
                    i10++;
                    zzziaZze2 = zzzia;
                }
                i7++;
                i6 = i9 + 1;
                iZzcN = iZzcN;
            }
            j += (long) i;
            i4++;
            i5++;
            iZzcN = iZzcN;
        }
    }

    private void zzX(zzZIA zzzia, zzZIO zzzio, zzZIA zzzia2, zzZIO zzzio2) {
        int i;
        int i2;
        int i3;
        int width = this.zzZLm.getWidth();
        int height = this.zzZLm.getHeight();
        int i4 = this.zzZLI;
        int i5 = this.zzZLH;
        int i6 = 0;
        if (i4 < 0) {
            int i7 = 0 - i4;
            width -= i7;
            i2 = i4 + i7;
            i = 0;
        } else {
            i = i4;
            i2 = i;
        }
        if (i5 < 0) {
            int i8 = 0 - i5;
            height -= i8;
            i3 = i5 + i8;
            i5 = 0;
        } else {
            i3 = i5;
        }
        if (i + width > width) {
            width -= i;
        }
        int i9 = width;
        if (i5 + height > height) {
            height -= i5;
        }
        if (i9 <= 0 || height <= 0) {
            return;
        }
        int dataType = zzzia.getDataType();
        if (dataType == 0 || dataType == 1 || dataType == 2 || dataType == 3) {
            int i10 = i2;
            int i11 = i9;
            int[] iArr = null;
            while (i6 < height) {
                int i12 = i11;
                int[] iArrZzZ = zzzia.zzZ(i10, i3 + i6, i12, iArr, zzzio);
                i11 = i12;
                zzzia2.zzY(i, i5 + i6, i11, iArrZzZ, zzzio2);
                i6++;
                iArr = iArrZzZ;
            }
            return;
        }
        if (dataType == 4) {
            int i13 = i2;
            int i14 = i9;
            float[] fArr = null;
            while (i6 < height) {
                int i15 = i14;
                float[] fArrZzZ = zzzia.zzZ(i13, i3 + i6, i15, fArr, zzzio);
                i14 = i15;
                zzzia2.zzY(i, i5 + i6, i14, fArrZzZ, zzzio2);
                i6++;
                fArr = fArrZzZ;
            }
            return;
        }
        if (dataType != 5) {
            return;
        }
        double[] dArr = null;
        while (i6 < height) {
            double[] dArrZzZ = zzzia.zzZ(i2, i3 + i6, i9, dArr, zzzio);
            int i16 = i2;
            int i17 = i9;
            zzzia2.zzY(i, i5 + i6, i17, dArrZzZ, zzzio2);
            i6++;
            i9 = i17;
            dArr = dArrZzZ;
            i2 = i16;
        }
    }

    private void zzY(int[] iArr, int i, int i2, int i3) throws Exception {
        int i4 = this.zzZLG * (i2 / 32);
        int i5 = i4 * 4;
        byte[] bArr = new byte[this.zzZLF * i5];
        zzX(bArr, 0, i2, i5);
        if (this.zzZMD.zzdB() == ByteOrder.BIG_ENDIAN) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.zzZLF; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = bArr[i6] & 255;
                    int i10 = bArr[i6 + 1] & 255;
                    int i11 = i6 + 3;
                    int i12 = bArr[i6 + 2] & 255;
                    i6 += 4;
                    iArr[i + i8] = (i10 << 16) | (i9 << 24) | (i12 << 8) | (bArr[i11] & 255);
                }
                i += i3;
            }
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzZLF; i14++) {
            for (int i15 = 0; i15 < i4; i15++) {
                int i16 = bArr[i13] & 255;
                int i17 = bArr[i13 + 1] & 255;
                int i18 = i13 + 3;
                int i19 = bArr[i13 + 2] & 255;
                i13 += 4;
                iArr[i + i15] = (i17 << 8) | (i19 << 16) | ((bArr[i18] & 255) << 24) | i16;
            }
            i += i3;
        }
    }

    private zzZJW zzds() {
        int i = this.zzZLG;
        int i2 = this.zzZLF;
        if (!this.zzZLJ) {
            zzZJW zzzjwZzY = zzZJW.zzY(this.zzZMD);
            if (zzzjwZzY == null) {
                return null;
            }
            return zzzjwZzY;
        }
        int i3 = this.zzZLP[this.zzZLK[0]];
        int i4 = this.zzZLu[0];
        int i5 = 3;
        if (i4 == 3) {
            i5 = 4;
        } else if (i3 <= 8) {
            i5 = 0;
        } else if (i3 <= 16) {
            i5 = i4 == 2 ? 2 : 1;
        }
        zzZIR zzzirZzPE = zzZIR.zzPE(1003);
        if (i3 != 1 && i3 != 2 && i3 != 4) {
            zzZJW zzzjwZzZ = zzZJW.zzZ(zzzirZzPE, new int[]{0}, i5, false, false, i, i2);
            zzzjwZzZ.zzZ(this.zzZMD);
            return zzzjwZzZ;
        }
        int i6 = 1 << i3;
        byte[] bArr = new byte[i6];
        byte[] bArr2 = new byte[i6];
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = 0;
            bArr2[i7] = 0;
            bArr3[i7] = 0;
        }
        return zzZJW.zzZ(new zzZIE(i3, i6, bArr, bArr2, bArr3), new zzZID(0, i, i2, i3), this.zzZMD);
    }

    private static long zzr(int i, int i2, int i3) throws IOException {
        if (i2 < 0 || i2 > 64) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return 0L;
        }
        if (i == -1) {
            throw new EOFException();
        }
        return ((-1) >>> (64 - i2)) & (((long) i) >>> (-((i3 + i2) - 8)));
    }

    public final void zz5(zzZOP zzzop) {
        this.zzN5 = zzzop;
    }

    public final void zzJ(int[] iArr) {
        this.zzZLz = (int[]) iArr.clone();
    }

    public final void zzK(int[] iArr) {
        this.zzZLK = iArr;
    }

    public final void zzL(int[] iArr) {
        this.zzZLP = iArr;
    }

    public final void zzM(int[] iArr) {
        this.zzZLu = iArr;
    }

    public final void zzPM(int i) {
        this.zzZLA = i;
    }

    public final void zzPN(int i) {
        this.zzZLC = i;
    }

    public final void zzPO(int i) {
        this.zzZLD = i;
    }

    public final void zzPP(int i) {
        this.zzZLB = i;
    }

    public final void zzPQ(int i) {
        this.zzZLE = i;
    }

    public final void zzPR(int i) {
        this.zzZLF = i;
    }

    public final void zzPS(int i) {
        this.zzZLG = i;
    }

    public final void zzPT(int i) {
        this.zzZLH = i;
    }

    public final void zzPU(int i) {
        this.zzZLI = i;
    }

    public final void zzPV(int i) {
        this.zz8r = i;
    }

    public final void zzPW(int i) {
        this.zzZLL = i;
    }

    public final void zzPX(int i) {
        this.zzZLM = i;
    }

    public final void zzPY(int i) {
        this.zzZLN = i;
    }

    public final void zzPZ(int i) {
        this.zzZLO = i;
    }

    public final void zzQ0(int i) {
        this.zzZLo = i;
    }

    public final void zzQ1(int i) {
        this.zzZLp = i;
    }

    public final void zzQ2(int i) {
        this.zzZLv = i;
    }

    public final void zzQ3(int i) {
        this.zzZLw = i;
    }

    public final void zzQ4(int i) {
        this.zzZLy = i;
    }

    public final void zzQc(int i) {
        this.zzZMi = i;
    }

    public final void zzQd(int i) {
        this.zzil = i;
    }

    public abstract void zzX(byte[] bArr, int i, int i2, int i3) throws Exception;

    public final void zzYn(long j) {
        this.zzDs = j;
    }

    public final void zzZ(zzZJU zzzju) {
        this.zzZMD = zzzju;
    }

    public final void zzdr() {
        this.zzZLJ = true;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void zzdt() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.internal.zzZJN.zzdt():void");
    }

    public void zzdu() {
        int[] iArrZzcY;
        boolean z;
        boolean z2;
        int i;
        boolean z3 = false;
        this.zzZLt = false;
        int length = this.zzZLz.length;
        if (this.zzZLJ) {
            int length2 = this.zzZLP.length;
            iArrZzcY = new int[length2];
            int iZzPD = this.zzZMo.zze2().zzPD(0);
            for (int i2 = 0; i2 < length2; i2++) {
                iArrZzcY[i2] = iZzPD;
            }
        } else {
            iArrZzcY = this.zzZMo.zze2().zzcY();
        }
        if (this.zzZMD.zzdL() != 5 || ((i = this.zzZLP[0]) != 1 && i != 2 && i != 4)) {
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (iArrZzcY[this.zzZLz[i3]] != this.zzZLP[this.zzZLK[i3]]) {
                    this.zzZLt = true;
                    break;
                }
                i3++;
            }
        }
        if (this.zzZLt) {
            throw new UnsupportedOperationException();
        }
        this.zzZLq = null;
        if (length == this.zzZMi) {
            z = true;
            z2 = true;
            for (int i4 = 0; i4 < length; i4++) {
                if (this.zzZLK[i4] != i4) {
                    z = false;
                }
                if (this.zzZLz[i4] != i4) {
                    z2 = false;
                }
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean zZzZ = zzZIF.zzZ(this.zzZMo.zze2());
        this.zzZLs = zZzZ;
        this.zzZLr = zZzZ ? true : zzZIF.zzW(this.zzZMo);
        if (this.zzZLx == null && this.zzZLp == 1 && this.zzZLo == 1) {
            int i5 = this.zzZLG;
            int i6 = this.zzZLw;
            if (i5 == i6 && this.zzZLF == this.zzZLv && this.zzZLy + i6 <= this.zzZMo.getWidth() && this.zzZLE + this.zzZLv <= this.zzZMo.getHeight() && z && z2 && !this.zzZLt) {
                z3 = true;
            }
        }
        this.zzZLn = z3;
    }

    private void zzZ(float[] fArr, int i, int i2, int i3) throws Exception {
        int i4 = this.zzZLG * (i2 / 32);
        int i5 = i4 * 4;
        byte[] bArr = new byte[this.zzZLF * i5];
        zzX(bArr, 0, i2, i5);
        if (this.zzZMD.zzdB() == ByteOrder.BIG_ENDIAN) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.zzZLF; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = bArr[i6] & 255;
                    int i10 = bArr[i6 + 1] & 255;
                    int i11 = i6 + 3;
                    int i12 = bArr[i6 + 2] & 255;
                    i6 += 4;
                    fArr[i + i8] = Float.intBitsToFloat((i10 << 16) | (i9 << 24) | (i12 << 8) | (bArr[i11] & 255));
                }
                i += i3;
            }
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzZLF; i14++) {
            for (int i15 = 0; i15 < i4; i15++) {
                int i16 = bArr[i13] & 255;
                int i17 = bArr[i13 + 1] & 255;
                int i18 = i13 + 3;
                int i19 = bArr[i13 + 2] & 255;
                i13 += 4;
                fArr[i + i15] = Float.intBitsToFloat((i17 << 8) | (i19 << 16) | ((bArr[i18] & 255) << 24) | i16);
            }
            i += i3;
        }
    }

    public final void zzX(zzZJW zzzjw) {
        this.zzZMo = zzzjw;
    }

    private static boolean zzY(zzZJW zzzjw) {
        zzZIA zzziaZze2 = zzzjw.zze2();
        int iZzd1 = zzziaZze2.zzd1();
        if (zzziaZze2 instanceof zzZID) {
            return (iZzd1 == 1 || iZzd1 == 2 || iZzd1 == 4) && (zzzjw.zze4() instanceof zzZIN);
        }
        return false;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void zzZ(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private void zzY(zzZIA zzzia, zzZIO zzzio, zzZIA zzzia2, zzZIO zzzio2) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        byte b;
        int i5;
        int width = this.zzZMo.getWidth();
        int height = this.zzZMo.getHeight();
        int width2 = this.zzZLm.getWidth();
        int height2 = this.zzZLm.getHeight();
        int i6 = this.zzZLI;
        int i7 = this.zzZLH;
        if (i6 < 0) {
            int i8 = 0 - i6;
            width2 -= i8;
            i = i6 + i8;
            i6 = 0;
        } else {
            i = i6;
        }
        if (i7 < 0) {
            int i9 = 0 - i7;
            height2 -= i9;
            i2 = i7 + i9;
            i7 = 0;
        } else {
            i2 = i7;
        }
        if (i6 + width2 > width) {
            width2 = width - i6;
        }
        if (i7 + height2 > height) {
            height2 = height - i7;
        }
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        byte[] data = ((zzZIN) zzzio).getData();
        byte[] data2 = ((zzZIN) zzzio2).getData();
        zzZID zzzid = (zzZID) zzzia;
        zzZID zzzid2 = (zzZID) zzzia2;
        int iZzlP = zzzid.zzlP();
        int iZzlP2 = zzzid2.zzlP();
        int iZzcQ = (zzzid.zzcQ() * i) + (i2 * 8 * iZzlP) + zzzid.zzcP();
        int iZzcQ2 = (zzzid2.zzcQ() * i6) + (i7 * 8 * iZzlP2) + zzzid2.zzcP();
        int iZzcQ3 = zzzid2.zzcQ() * width2;
        int i10 = iZzcQ & 7;
        int i11 = iZzcQ2 & 7;
        if (i10 == i11) {
            if (i11 != 0) {
                int i12 = 8 - i11;
                int i13 = iZzcQ >> 3;
                int i14 = iZzcQ2 >> 3;
                int i15 = 255 >> i11;
                if (iZzcQ3 < i12) {
                    i15 &= 255 << (i12 - iZzcQ3);
                    i12 = iZzcQ3;
                }
                for (int i16 = 0; i16 < height2; i16++) {
                    data2[i14] = (byte) ((data2[i14] & (~i15)) | (data[i13] & i15));
                    i13 += iZzlP;
                    i14 += iZzlP2;
                }
                i5 = 65280;
                iZzcQ += i12;
                iZzcQ2 += i12;
                iZzcQ3 -= i12;
            } else {
                i5 = 65280;
            }
            if (iZzcQ3 >= 8) {
                int i17 = iZzcQ >> 3;
                int i18 = iZzcQ2 >> 3;
                int i19 = iZzcQ3 >> 3;
                if (i19 == iZzlP && iZzlP == iZzlP2) {
                    System.arraycopy(data, i17, data2, i18, iZzlP * height2);
                } else {
                    for (int i20 = 0; i20 < height2; i20++) {
                        System.arraycopy(data, i17, data2, i18, i19);
                        i17 += iZzlP;
                        i18 += iZzlP2;
                    }
                }
                int i21 = i19 * 8;
                iZzcQ += i21;
                iZzcQ2 += i21;
                iZzcQ3 -= i21;
            }
            if (iZzcQ3 > 0) {
                int i22 = iZzcQ >> 3;
                int i23 = iZzcQ2 >> 3;
                int i24 = (i5 >> iZzcQ3) & 255;
                for (int i25 = 0; i25 < height2; i25++) {
                    data2[i23] = (byte) ((data2[i23] & (~i24)) | (data[i22] & i24));
                    i22 += iZzlP;
                    i23 += iZzlP2;
                }
                return;
            }
            return;
        }
        if (i11 != 0 || iZzcQ3 < 8) {
            int i26 = 8 - i11;
            int i27 = iZzcQ >> 3;
            int i28 = iZzcQ2 >> 3;
            int i29 = 8 - i10;
            int i30 = 255 >> i11;
            if (iZzcQ3 < i26) {
                i30 &= 255 << (i26 - iZzcQ3);
                i26 = iZzcQ3;
            }
            int i31 = i30;
            int length = data.length - 1;
            int i32 = 0;
            while (i32 < height2) {
                byte b2 = data[i27];
                if (i27 < length) {
                    i4 = i32;
                    b = data[i27 + 1];
                } else {
                    i4 = i32;
                    b = 0;
                }
                byte[] bArr2 = data2;
                bArr2[i28] = (byte) ((data2[i28] & (~i31)) | ((((b2 << i10) | ((b & 255) >> i29)) >> i11) & i31));
                i27 += iZzlP;
                i28 += iZzlP2;
                i32 = i4 + 1;
                data2 = bArr2;
            }
            bArr = data2;
            iZzcQ += i26;
            iZzcQ2 += i26;
            iZzcQ3 -= i26;
            i3 = 8;
        } else {
            bArr = data2;
            i3 = 8;
        }
        if (iZzcQ3 >= i3) {
            int i33 = iZzcQ >> 3;
            int i34 = iZzcQ2 >> 3;
            int i35 = iZzcQ3 >> 3;
            int i36 = iZzcQ & 7;
            int i37 = 8 - i36;
            int i38 = 0;
            while (i38 < height2) {
                int i39 = (i38 * iZzlP) + i33;
                int i40 = (i38 * iZzlP2) + i34;
                byte b3 = data[i39];
                int i41 = i33;
                int i42 = 0;
                while (i42 < i35) {
                    i39++;
                    int i43 = i42;
                    byte b4 = data[i39];
                    bArr[i40] = (byte) (((b4 & 255) >> i37) | (b3 << i36));
                    i40++;
                    b3 = b4;
                    i42 = i43 + 1;
                    i34 = i34;
                }
                i38++;
                i33 = i41;
            }
            int i44 = i35 * 8;
            iZzcQ += i44;
            iZzcQ2 += i44;
            iZzcQ3 -= i44;
        }
        if (iZzcQ3 > 0) {
            int i45 = iZzcQ >> 3;
            int i46 = iZzcQ2 >> 3;
            int i47 = (65280 >> iZzcQ3) & 255;
            int i48 = iZzcQ & 7;
            int i49 = 8 - i48;
            int length2 = data.length - 1;
            for (int i50 = 0; i50 < height2; i50++) {
                bArr[i46] = (byte) ((((data[i45] << i48) | (((i45 < length2 ? data[i45 + 1] : (byte) 0) & 255) >> i49)) & i47) | (bArr[i46] & (~i47)));
                i45 += iZzlP;
                i46 += iZzlP2;
            }
        }
    }

    private static void zzZ(byte[] bArr, int i, int i2, short[] sArr, int[] iArr, int i3, int i4) throws IOException {
        int i5;
        if (sArr != null) {
            int i6 = i / 2;
            int i7 = i % 2;
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i3;
                int i11 = 0;
                while (i11 < i6) {
                    int i12 = i8 + 1;
                    int i13 = (bArr[i8] & 255) << 8;
                    i8 += 2;
                    sArr[i10] = (short) ((bArr[i12] & 255) | i13);
                    i11++;
                    i10++;
                }
                if (i7 != 0) {
                    sArr[i10] = (short) ((bArr[i8] & 255) << 8);
                    i8++;
                }
                i3 += i4;
            }
            return;
        }
        if (iArr != null) {
            int i14 = i / 4;
            int i15 = i % 4;
            int i16 = 0;
            for (int i17 = 0; i17 < i2; i17++) {
                int i18 = i3;
                int i19 = 0;
                while (true) {
                    i5 = 24;
                    if (i19 >= i14) {
                        break;
                    }
                    int i20 = i16 + 3;
                    int i21 = ((bArr[i16] & 255) << 24) | ((bArr[i16 + 1] & 255) << 16) | ((bArr[i16 + 2] & 255) << 8);
                    i16 += 4;
                    iArr[i18] = i21 | (bArr[i20] & 255);
                    i19++;
                    i18++;
                }
                if (i15 != 0) {
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i15) {
                        i23 |= (bArr[i16] & 255) << i5;
                        i5 -= 8;
                        i22++;
                        i16++;
                    }
                    iArr[i18] = i23;
                }
                i3 += i4;
            }
            return;
        }
        throw new IOException("shortData == null && intData == null!");
    }

    private void zzZ(zzZIA zzzia, zzZIO zzzio, zzZIA zzzia2, zzZIO zzzio2) {
        if (zzY(this.zzZLm) && zzY(this.zzZMo) && ((zzZID) zzzia).zzcQ() == ((zzZID) zzzia2).zzcQ()) {
            zzY(zzzia, zzzio, zzzia2, zzzio2);
        } else {
            zzX(zzzia, zzzio, zzzia2, zzzio2);
        }
    }

    public final void zzZ(zzZJP zzzjp) {
        this.zzZLx = zzzjp;
    }

    public final void zzZ(zzZKF zzzkf) {
        this.zzZMs = zzzkf;
    }
}

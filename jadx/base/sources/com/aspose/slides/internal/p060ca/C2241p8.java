package com.aspose.slides.internal.p060ca;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.p8 */
/* JADX INFO: loaded from: classes3.dex */
class C2241p8 {

    /* JADX INFO: renamed from: du */
    private C2253q1 f7724du;

    /* JADX INFO: renamed from: h4 */
    private k4 f7725h4 = new k4();

    /* JADX INFO: renamed from: k4 */
    private int f7726k4;

    /* JADX INFO: renamed from: kk */
    private C2307to f7727kk;

    /* JADX INFO: renamed from: to */
    private C2307to f7728to;

    /* JADX INFO: renamed from: x1 */
    private C2307to f7729x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.p8$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public byte f7730k4;

        /* JADX INFO: renamed from: kk */
        public byte f7731kk;

        /* JADX INFO: renamed from: x1 */
        public byte f7732x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m11240x1(k4 k4Var) {
            return k4Var.f7730k4 == this.f7730k4 && k4Var.f7732x1 == this.f7732x1 && k4Var.f7731kk == this.f7731kk;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m11240x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f7730k4 = this.f7730k4;
            k4Var.f7732x1 = this.f7732x1;
            k4Var.f7731kk = this.f7731kk;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m11234k4(short s, int[] iArr) {
        boolean z;
        int iM11447k4;
        iArr[0] = 0;
        boolean z2 = s >= 0;
        int i = 0;
        while (true) {
            if (z2) {
                int i2 = s + InputDeviceCompat.SOURCE_ANY;
                iArr[0] = (i2 / 8) + 1;
                iM11447k4 = i2 % 8;
                z = false;
            } else {
                z = z2;
                iM11447k4 = this.f7727kk.m11447k4();
            }
            i = (i << 2) | (iM11447k4 & (-5));
            if ((iM11447k4 & 4) == 0) {
                return i + 2;
            }
            z2 = z;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m11238x1(int i) {
        int iM11447k4 = 0;
        while (i > 0) {
            iM11447k4 = (iM11447k4 << 3) | this.f7729x1.m11447k4();
            i--;
        }
        return iM11447k4 + 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11235k4(k4[] k4VarArr, byte b, C3152yj c3152yj) {
        if (C7019kk.m27462to(Byte.valueOf(k4VarArr[0].f7731kk), 6) == C7019kk.m27462to((Object) (byte) 0, 6)) {
            if (C7019kk.m27462to(Byte.valueOf(b), 6) == C7019kk.m27462to(Byte.valueOf(k4VarArr[0].f7730k4), 6)) {
                k4VarArr[0].f7731kk = (byte) 1;
                return;
            } else {
                c3152yj.writeByte(b);
                return;
            }
        }
        if (C7019kk.m27462to(Byte.valueOf(k4VarArr[0].f7731kk), 6) == C7019kk.m27462to((Object) (byte) 1, 6)) {
            k4VarArr[0].f7732x1 = b;
            if (C7019kk.m27462to(Byte.valueOf(b), 6) != 0) {
                k4VarArr[0].f7731kk = (byte) 2;
                return;
            } else {
                c3152yj.writeByte(k4VarArr[0].f7730k4);
                k4VarArr[0].f7731kk = (byte) 0;
                return;
            }
        }
        if (C7019kk.m27462to(Byte.valueOf(k4VarArr[0].f7731kk), 6) != C7019kk.m27462to((Object) (byte) 2, 6)) {
            k4 k4Var = k4VarArr[0];
            k4Var.f7730k4 = b;
            k4Var.f7731kk = (byte) 0;
        } else {
            for (int iM27462to = C7019kk.m27462to(Byte.valueOf(k4VarArr[0].f7732x1), 6); iM27462to > 0; iM27462to--) {
                c3152yj.writeByte(b);
            }
            k4VarArr[0].f7731kk = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m11236k4(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            for (int i4 = 0; i4 < 96; i4++) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) i3;
                i2 += 2;
                bArr[i5] = (byte) i4;
            }
        }
        for (int i6 = 0; i2 < 7168 && i6 < 256; i6++) {
            byte b = (byte) i6;
            bArr[i2] = b;
            bArr[i2 + 1] = b;
            int i7 = i2 + 3;
            bArr[i2 + 2] = b;
            i2 += 4;
            bArr[i7] = b;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m11237k4(boolean z) {
        byte b;
        int i = 7168;
        byte[] bArrM11236k4 = m11236k4(this.f7726k4 + 7168);
        C3152yj c3152yj = new C3152yj(this.f7726k4);
        while (i < bArrM11236k4.length) {
            try {
                short sM11447k4 = this.f7728to.m11447k4();
                if (sM11447k4 < 256) {
                    b = (byte) sM11447k4;
                } else {
                    C2253q1 c2253q1 = this.f7724du;
                    if (sM11447k4 == c2253q1.f7753k4) {
                        b = bArrM11236k4[i - 2];
                    } else if (sM11447k4 == c2253q1.f7756x1) {
                        b = bArrM11236k4[i - 4];
                    } else if (sM11447k4 == c2253q1.f7754kk) {
                        b = bArrM11236k4[i - 6];
                    } else {
                        int[] iArr = {0};
                        int iM11234k4 = m11234k4(sM11447k4, iArr);
                        int iM11238x1 = m11238x1(iArr[0]);
                        if (iM11238x1 >= 512) {
                            iM11234k4++;
                        }
                        int i2 = ((i - iM11238x1) - iM11234k4) + 1;
                        int i3 = 0;
                        while (i3 < iM11234k4) {
                            byte b2 = bArrM11236k4[i2 + i3];
                            int i4 = i + 1;
                            bArrM11236k4[i] = b2;
                            if (z) {
                                k4[] k4VarArr = {this.f7725h4};
                                m11235k4(k4VarArr, b2, c3152yj);
                                k4VarArr[0].CloneTo(this.f7725h4);
                            } else {
                                c3152yj.writeByte(b2);
                            }
                            i3++;
                            i = i4;
                        }
                    }
                }
                int i5 = i + 1;
                bArrM11236k4[i] = b;
                if (z) {
                    k4[] k4VarArr2 = {this.f7725h4};
                    m11235k4(k4VarArr2, b, c3152yj);
                    k4VarArr2[0].CloneTo(this.f7725h4);
                } else {
                    c3152yj.writeByte(b);
                }
                i = i5;
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
        c3152yj.close();
        byte[] array = c3152yj.toArray();
        c3152yj.dispose();
        return array;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11239k4(byte[] bArr) {
        C2135ix c2135ix = new C2135ix(bArr);
        boolean zM10795x1 = c2135ix.m10795x1();
        k4 k4Var = new k4();
        this.f7725h4 = k4Var;
        k4Var.f7731kk = (byte) 100;
        this.f7729x1 = new C2307to(c2135ix, 8);
        this.f7727kk = new C2307to(c2135ix, 8);
        int iM10794x1 = c2135ix.m10794x1(24);
        this.f7726k4 = iM10794x1;
        C2253q1 c2253q1 = new C2253q1(iM10794x1);
        this.f7724du = c2253q1;
        this.f7728to = new C2307to(c2135ix, c2253q1.f7751du);
        return m11237k4(zM10795x1);
    }
}

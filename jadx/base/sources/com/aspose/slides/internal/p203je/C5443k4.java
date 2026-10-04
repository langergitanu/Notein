package com.aspose.slides.internal.p203je;

import OooOO0.OooO0OO;
import OooooOo.C21392OooOo00;
import com.aspose.slides.internal.p044bq.C1839x1;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.internal.je.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5443k4 implements InterfaceC4809to {

    /* JADX INFO: renamed from: c5 */
    private int f14407c5;

    /* JADX INFO: renamed from: ck */
    private float f14408ck;

    /* JADX INFO: renamed from: du */
    private boolean f14409du;

    /* JADX INFO: renamed from: dy */
    private boolean f14410dy;

    /* JADX INFO: renamed from: fa */
    private float f14411fa;

    /* JADX INFO: renamed from: h4 */
    private int f14412h4;

    /* JADX INFO: renamed from: jd */
    private boolean f14413jd;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4809to f14414k4;

    /* JADX INFO: renamed from: kk */
    private int f14415kk;

    /* JADX INFO: renamed from: ks */
    private float f14416ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f14417m9;

    /* JADX INFO: renamed from: to */
    private float f14419to;

    /* JADX INFO: renamed from: up */
    private float f14420up;

    /* JADX INFO: renamed from: x1 */
    private float[] f14421x1;

    /* JADX INFO: renamed from: yj */
    private float f14423yj;

    /* JADX INFO: renamed from: x6 */
    private final k4 f14422x6 = new k4();

    /* JADX INFO: renamed from: rv */
    private final float[] f14418rv = new float[16];

    /* JADX INFO: renamed from: com.aspose.slides.internal.je.k4$k4 */
    public static final class k4 {

        /* JADX INFO: renamed from: h4 */
        private float f14429h4;

        /* JADX INFO: renamed from: kk */
        private int f14432kk;

        /* JADX INFO: renamed from: m9 */
        private float f14434m9;

        /* JADX INFO: renamed from: fa */
        private final float[] f14428fa = new float[3];

        /* JADX INFO: renamed from: up */
        private int f14436up = -1;

        /* JADX INFO: renamed from: yj */
        private final float[] f14438yj = new float[4];

        /* JADX INFO: renamed from: ks */
        private final float[] f14433ks = {0.0f, 0.0f, -1.0f, 0.0f};

        /* JADX INFO: renamed from: k4 */
        private final float[][] f14431k4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 5, 8);

        /* JADX INFO: renamed from: x1 */
        private final EnumC19061k4[] f14437x1 = new EnumC19061k4[4];

        /* JADX INFO: renamed from: to */
        private float f14435to = Float.MAX_VALUE;

        /* JADX INFO: renamed from: du */
        private float f14426du = Float.MAX_VALUE;

        /* JADX INFO: renamed from: dy */
        private float f14427dy = Float.MIN_VALUE;

        /* JADX INFO: renamed from: jd */
        private int f14430jd = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c5 */
        private float f14424c5 = Float.MAX_VALUE;

        /* JADX INFO: renamed from: ck */
        private boolean f14425ck = true;

        /* JADX INFO: renamed from: com.aspose.slides.internal.je.k4$k4$k4, reason: collision with other inner class name */
        public enum EnumC19061k4 {
            LEFT,
            RIGHT
        }

        /* JADX INFO: renamed from: du */
        private float m22261du() {
            int i;
            float[] fArr = this.f14431k4[this.f14430jd];
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = 0.0f;
            int i2 = 2;
            while (true) {
                i = this.f14432kk;
                if (i2 >= i) {
                    break;
                }
                float f4 = fArr[i2];
                float f5 = fArr[i2 + 1];
                float fM9609k4 = C1839x1.m9609k4(f, f2, f4, f5);
                f3 += fM9609k4;
                this.f14428fa[(i2 / 2) - 1] = fM9609k4;
                i2 += 2;
                f = f4;
                f2 = f5;
            }
            float fM9609k42 = C1839x1.m9609k4(fArr[0], fArr[1], fArr[i - 2], fArr[i - 1]);
            if (f3 - fM9609k42 < 0.01f || this.f14430jd == 4) {
                return (f3 + fM9609k42) / 2.0f;
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: kk */
        private void m22262kk() {
            int i = this.f14430jd;
            EnumC19061k4[] enumC19061k4Arr = this.f14437x1;
            do {
                i--;
                EnumC19061k4 enumC19061k4 = enumC19061k4Arr[i];
                EnumC19061k4 enumC19061k42 = EnumC19061k4.RIGHT;
                if (enumC19061k4 != enumC19061k42) {
                    enumC19061k4Arr[i] = enumC19061k42;
                    float[][] fArr = this.f14431k4;
                    float[] fArr2 = fArr[i];
                    int i2 = i + 1;
                    System.arraycopy(fArr2, 0, fArr[i2], 0, 8);
                    this.f14430jd = i2;
                    m22263to();
                    return;
                }
            } while (i != 0);
            this.f14430jd = 0;
            this.f14425ck = true;
        }

        /* JADX INFO: renamed from: to */
        private void m22263to() {
            float fM22261du = m22261du();
            if (fM22261du >= 0.0f) {
                float f = this.f14435to;
                this.f14429h4 = f;
                float f2 = this.f14426du;
                this.f14434m9 = f2;
                this.f14435to = ((1 << (4 - this.f14430jd)) * 0.0625f) + f;
                this.f14426du = f2 + fM22261du;
                this.f14433ks[2] = -1.0f;
                this.f14436up = -1;
                return;
            }
            float[][] fArr = this.f14431k4;
            int i = this.f14430jd;
            float[] fArr2 = fArr[i];
            C1839x1.m9618k4(fArr2, 0, fArr[i + 1], 0, fArr2, 0, this.f14432kk);
            EnumC19061k4[] enumC19061k4Arr = this.f14437x1;
            int i2 = this.f14430jd;
            enumC19061k4Arr[i2] = EnumC19061k4.LEFT;
            this.f14430jd = i2 + 1;
            m22263to();
        }

        /* JADX INFO: renamed from: k4 */
        public float m22265k4(float f) {
            float f2 = this.f14427dy + f;
            while (true) {
                float f3 = this.f14426du;
                float f4 = 1.0f;
                if (f3 >= f2) {
                    this.f14427dy = f2;
                    float f5 = this.f14434m9;
                    float f6 = (f2 - f5) / (f3 - f5);
                    if (!m22264x1(0.05f)) {
                        float[] fArr = this.f14433ks;
                        if (fArr[2] < 0.0f) {
                            float[] fArr2 = this.f14428fa;
                            float f7 = fArr2[0] + 0.0f;
                            float f8 = fArr2[1] + f7;
                            int i = this.f14432kk;
                            if (i == 8) {
                                float f9 = fArr2[2] + f8;
                                fArr[0] = OooO0OO.OooO0O0(f7, f8, 3.0f, f9);
                                fArr[1] = C21392OooOo00.OooO00o(f7, 2.0f, f8, 3.0f);
                                fArr[2] = f7 * 3.0f;
                                fArr[3] = -f9;
                            } else if (i == 6) {
                                fArr[0] = 0.0f;
                                float f10 = f7 * 2.0f;
                                fArr[1] = f8 - f10;
                                fArr[2] = f10;
                                fArr[3] = -f8;
                            }
                        }
                        if (C1839x1.m9610k4(fArr[0], fArr[1], fArr[2], f6 * fArr[3], this.f14438yj, 0, 0.0f, 1.0f) == 1 && !Float.isNaN(this.f14438yj[0])) {
                            f6 = this.f14438yj[0];
                        }
                    }
                    float f11 = this.f14435to;
                    float f12 = this.f14429h4;
                    float fOooO0O0 = OooO0OO.OooO0O0(f11, f12, f6, f12);
                    if (fOooO0O0 >= 1.0f) {
                        this.f14425ck = true;
                    } else {
                        f4 = fOooO0O0;
                    }
                    this.f14424c5 = f;
                    return f4;
                }
                if (this.f14425ck) {
                    this.f14424c5 = f3 - this.f14427dy;
                    return 1.0f;
                }
                m22262kk();
            }
        }

        /* JADX INFO: renamed from: x1 */
        public float m22268x1() {
            return this.f14424c5;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m22264x1(float f) {
            int i = this.f14436up;
            if (i != -1) {
                return i == 1;
            }
            float[] fArr = this.f14428fa;
            float f2 = fArr[0];
            float f3 = fArr[1];
            if (!C1839x1.m9620k4(f2, f3, f * f3)) {
                this.f14436up = 0;
                return false;
            }
            if (this.f14432kk == 8) {
                float f4 = this.f14428fa[2];
                float f5 = f * f4;
                if (!C1839x1.m9620k4(f3, f4, f5) || !C1839x1.m9620k4(f2, f4, f5)) {
                    this.f14436up = 0;
                    return false;
                }
            }
            this.f14436up = 1;
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public void m22266k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public void m22267k4(float[] fArr, int i) {
            System.arraycopy(fArr, 0, this.f14431k4[0], 0, 8);
            this.f14432kk = i;
            this.f14430jd = 0;
            this.f14429h4 = 0.0f;
            this.f14434m9 = 0.0f;
            this.f14435to = 0.0f;
            this.f14426du = 0.0f;
            m22263to();
            this.f14427dy = 0.0f;
            if (this.f14430jd > 0) {
                this.f14437x1[0] = EnumC19061k4.LEFT;
                this.f14425ck = false;
            } else {
                this.f14437x1[0] = EnumC19061k4.RIGHT;
                this.f14425ck = true;
            }
            this.f14424c5 = 0.0f;
        }
    }

    public C5443k4(float f, float[] fArr, InterfaceC4809to interfaceC4809to) {
        this.f14414k4 = interfaceC4809to;
        if (f < 0.0f) {
            throw new IllegalArgumentException("phase < 0 !");
        }
        this.f14421x1 = fArr;
        this.f14415kk = fArr.length;
        this.f14413jd = true;
        int i = 0;
        while (true) {
            float f2 = this.f14421x1[i];
            if (f < f2) {
                this.f14408ck = f;
                this.f14419to = f;
                this.f14409du = this.f14413jd;
                this.f14412h4 = i;
                this.f14417m9 = true;
                this.f14410dy = false;
                return;
            }
            f -= f2;
            i = (i + 1) % this.f14415kk;
            m22255k4(i);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m22258kk(float f, float f2) {
        this.f14414k4.mo9585k4(f, f2);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        mo9603x1(this.f14411fa, this.f14420up);
        mo9585k4(this.f14411fa, this.f14420up);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
        this.f14414k4.mo9602x1();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f14410dy = true;
        this.f14407c5 = this.f14412h4;
        this.f14413jd = this.f14409du;
        this.f14408ck = this.f14419to;
        this.f14423yj = f;
        this.f14411fa = f;
        this.f14416ks = f2;
        this.f14420up = f2;
        this.f14417m9 = true;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        float f3;
        float f4 = f - this.f14423yj;
        float f5 = f2 - this.f14416ks;
        float f6 = (f5 * f5) + (f4 * f4);
        if (f6 == 0.0f || Float.isInfinite(f6) || Float.isNaN(f6)) {
            return;
        }
        float fSqrt = (float) Math.sqrt(f6);
        float f7 = f4 / fSqrt;
        float f8 = f5 / fSqrt;
        float[] fArr = this.f14418rv;
        float[] fArr2 = this.f14421x1;
        while (true) {
            float f9 = fArr2[this.f14407c5];
            float f10 = this.f14408ck;
            f3 = f9 - f10;
            if (fSqrt <= f3) {
                break;
            }
            float f11 = f9 * f7;
            float f12 = f9 * f8;
            if (f10 == 0.0f) {
                fArr[0] = this.f14423yj + f11;
                fArr[1] = this.f14416ks + f12;
            } else {
                float f13 = f3 / f9;
                fArr[0] = (f11 * f13) + this.f14423yj;
                fArr[1] = (f13 * f12) + this.f14416ks;
            }
            m22256k4(fArr, 0, 4);
            fSqrt -= f3;
            int i = (this.f14407c5 + 1) % this.f14415kk;
            this.f14407c5 = i;
            m22255k4(i);
            this.f14408ck = 0.0f;
        }
        fArr[0] = f;
        fArr[1] = f2;
        m22256k4(fArr, 0, 4);
        this.f14408ck += fSqrt;
        if (fSqrt == f3) {
            this.f14408ck = 0.0f;
            int i2 = (this.f14407c5 + 1) % this.f14415kk;
            this.f14407c5 = i2;
            m22255k4(i2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m22259x1(int i) {
        int i2;
        if (m22257k4(this.f14418rv, i)) {
            return;
        }
        this.f14422x6.m22267k4(this.f14418rv, i);
        float f = this.f14421x1[this.f14407c5] - this.f14408ck;
        int i3 = 0;
        float f2 = 0.0f;
        while (true) {
            float fM22265k4 = this.f14422x6.m22265k4(f);
            if (fM22265k4 >= 1.0f) {
                break;
            }
            if (fM22265k4 != 0.0f) {
                float[] fArr = this.f14418rv;
                i2 = i;
                C1839x1.m9615k4((fM22265k4 - f2) / (1.0f - f2), fArr, i3, fArr, 0, fArr, i2, i);
                m22256k4(this.f14418rv, 2, i2);
                f2 = fM22265k4;
                i3 = i2;
            } else {
                i2 = i;
            }
            int i4 = (this.f14407c5 + 1) % this.f14415kk;
            this.f14407c5 = i4;
            m22255k4(i4);
            this.f14408ck = 0.0f;
            f = this.f14421x1[this.f14407c5];
            i = i2;
        }
        m22256k4(this.f14418rv, i3 + 2, i);
        float fM22268x1 = this.f14408ck + this.f14422x6.m22268x1();
        this.f14408ck = fM22268x1;
        float[] fArr2 = this.f14421x1;
        int i5 = this.f14407c5;
        if (fM22268x1 >= fArr2[i5]) {
            this.f14408ck = 0.0f;
            int i6 = (i5 + 1) % this.f14415kk;
            this.f14407c5 = i6;
            m22255k4(i6);
        }
        this.f14422x6.m22266k4();
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        float[] fArr = this.f14418rv;
        fArr[0] = this.f14423yj;
        fArr[1] = this.f14416ks;
        fArr[2] = f;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f4;
        m22259x1(6);
    }

    /* JADX INFO: renamed from: x1 */
    private void m22260x1(float[] fArr, int i, int i2) {
        if (i2 == 4) {
            this.f14414k4.mo9603x1(fArr[i], fArr[i + 1]);
        } else if (i2 == 6) {
            this.f14414k4.mo9586k4(fArr[i], fArr[i + 1], fArr[i + 2], fArr[i + 3]);
        } else {
            if (i2 != 8) {
                return;
            }
            this.f14414k4.mo9587k4(fArr[i], fArr[i + 1], fArr[i + 2], fArr[i + 3], fArr[i + 4], fArr[i + 5]);
        }
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr = this.f14418rv;
        fArr[0] = this.f14423yj;
        fArr[1] = this.f14416ks;
        fArr[2] = f;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f4;
        fArr[6] = f5;
        fArr[7] = f6;
        m22259x1(8);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22255k4(int i) {
        if (i == 0) {
            this.f14413jd = true;
        } else {
            this.f14413jd = !this.f14413jd;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m22256k4(float[] fArr, int i, int i2) {
        int i3 = i + i2;
        float f = fArr[i3 - 4];
        float f2 = fArr[i3 - 3];
        if (this.f14413jd) {
            if (this.f14410dy) {
                m22258kk(this.f14423yj, this.f14416ks);
                this.f14410dy = false;
            }
            m22260x1(fArr, i, i2);
        } else {
            this.f14417m9 = false;
            this.f14410dy = true;
        }
        this.f14423yj = f;
        this.f14416ks = f2;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m22257k4(float[] fArr, int i) {
        for (int i2 = 2; i2 < i; i2++) {
            if (fArr[i2] != fArr[i2 - 2]) {
                return false;
            }
        }
        return true;
    }
}

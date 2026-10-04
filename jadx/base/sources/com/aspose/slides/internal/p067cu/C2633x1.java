package com.aspose.slides.internal.p067cu;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.cu.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2633x1 {

    /* JADX INFO: renamed from: k4 */
    private int f8446k4;

    /* JADX INFO: renamed from: x1 */
    private float[] f8447x1;

    private C2633x1(int i, float[] fArr) {
        if (i != 2 && i != 4 && i != 6 && i != 8 && i != 10) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Illegal type ", " for PathItem"));
        }
        this.f8446k4 = i;
        this.f8447x1 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2633x1 m12028k4() {
        return new C2633x1(10, new float[0]);
    }

    /* JADX INFO: renamed from: kk */
    public float[] m12035kk() {
        return this.f8447x1;
    }

    /* JADX INFO: renamed from: to */
    public C12025x6 m12036to() {
        int i = this.f8446k4;
        if (i == 2) {
            float[] fArr = this.f8447x1;
            return new C12025x6(fArr[0], fArr[1]);
        }
        if (i == 4) {
            float[] fArr2 = this.f8447x1;
            return new C12025x6(fArr2[0], fArr2[1]);
        }
        if (i == 6) {
            float[] fArr3 = this.f8447x1;
            return new C12025x6(fArr3[2], fArr3[3]);
        }
        if (i == 8) {
            float[] fArr4 = this.f8447x1;
            return new C12025x6(fArr4[4], fArr4[5]);
        }
        if (i == 10) {
            return null;
        }
        throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" for PathItem ", this.f8446k4, new StringBuilder("Illegal type ")));
    }

    /* JADX INFO: renamed from: x1 */
    public int m12037x1() {
        return this.f8446k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2633x1 m12029k4(float f, float f2) {
        return new C2633x1(2, new float[]{f, f2});
    }

    /* JADX INFO: renamed from: x1 */
    public static C2633x1 m12032x1(float f, float f2) {
        return new C2633x1(4, new float[]{f, f2});
    }

    /* JADX INFO: renamed from: k4 */
    public static C2633x1 m12030k4(float f, float f2, float f3, float f4) {
        return new C2633x1(6, new float[]{f, f2, f3, f4});
    }

    /* JADX INFO: renamed from: x1 */
    public void m12038x1(C12025x6 c12025x6) {
        int i = this.f8446k4;
        if (i == 2) {
            this.f8447x1[0] = c12025x6.m56897x1();
            this.f8447x1[1] = c12025x6.m56895kk();
            return;
        }
        if (i == 4) {
            this.f8447x1[0] = c12025x6.m56897x1();
            this.f8447x1[1] = c12025x6.m56895kk();
            return;
        }
        if (i == 6) {
            this.f8447x1[2] = c12025x6.m56897x1();
            this.f8447x1[3] = c12025x6.m56895kk();
        } else if (i == 8) {
            this.f8447x1[4] = c12025x6.m56897x1();
            this.f8447x1[5] = c12025x6.m56895kk();
        } else {
            if (i == 10) {
                return;
            }
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" for PathItem ", this.f8446k4, new StringBuilder("Illegal type ")));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C2633x1 m12031k4(float f, float f2, float f3, float f4, float f5, float f6) {
        return new C2633x1(8, new float[]{f, f2, f3, f4, f5, f6});
    }

    /* JADX INFO: renamed from: k4 */
    public void m12033k4(InterfaceC4809to interfaceC4809to) {
        int i = this.f8446k4;
        if (i == 2) {
            float[] fArr = this.f8447x1;
            interfaceC4809to.mo9585k4(fArr[0], fArr[1]);
            return;
        }
        if (i == 4) {
            float[] fArr2 = this.f8447x1;
            interfaceC4809to.mo9603x1(fArr2[0], fArr2[1]);
            return;
        }
        if (i == 6) {
            float[] fArr3 = this.f8447x1;
            interfaceC4809to.mo9586k4(fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
        } else if (i == 8) {
            float[] fArr4 = this.f8447x1;
            interfaceC4809to.mo9587k4(fArr4[0], fArr4[1], fArr4[2], fArr4[3], fArr4[4], fArr4[5]);
        } else {
            if (i != 10) {
                return;
            }
            interfaceC4809to.mo9584k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12034k4(C12025x6 c12025x6) {
        this.f8447x1[0] = c12025x6.m56897x1();
        this.f8447x1[1] = c12025x6.m56895kk();
    }
}

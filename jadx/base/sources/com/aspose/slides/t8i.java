package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
final class t8i {

    /* JADX INFO: renamed from: du */
    private long f49052du;

    /* JADX INFO: renamed from: k4 */
    private float[] f49053k4 = null;

    /* JADX INFO: renamed from: x1 */
    private int f49056x1 = -1;

    /* JADX INFO: renamed from: kk */
    private int f49054kk = -1;

    /* JADX INFO: renamed from: to */
    private boolean f49055to = false;

    /* JADX INFO: renamed from: dy */
    private void m70995dy() {
        this.f49052du++;
    }

    /* JADX INFO: renamed from: du */
    public final void m70996du() {
        this.f49053k4 = null;
        this.f49056x1 = -1;
        this.f49054kk = -1;
        m70995dy();
    }

    public boolean equals(Object obj) {
        LightRig lightRig = (LightRig) C7019kk.m27452k4(obj, LightRig.class);
        if (lightRig == null) {
            return false;
        }
        float[] fArrM1865du = lightRig.m1865du();
        float[] fArr = this.f49053k4;
        if ((fArr == null && fArrM1865du != null) || (fArr != null && fArrM1865du == null)) {
            return false;
        }
        if (fArr != null && fArrM1865du != null) {
            if (fArr.length == fArrM1865du.length) {
                int i = 0;
                while (true) {
                    float[] fArr2 = this.f49053k4;
                    if (i >= fArr2.length) {
                        break;
                    }
                    if (fArr2[i] != fArrM1865du[i]) {
                        return false;
                    }
                    i++;
                }
            } else {
                return false;
            }
        }
        return this.f49056x1 == lightRig.getDirection() && this.f49054kk == lightRig.getLightType();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m70997h4() {
        return this.f49055to;
    }

    public int hashCode() {
        return 23456;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m70998k4() {
        return this.f49056x1;
    }

    /* JADX INFO: renamed from: kk */
    public final float[] m71004kk() {
        float[] fArr = this.f49053k4;
        if (fArr != null) {
            return (float[]) fArr.clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m71005m9() {
        return this.f49052du;
    }

    /* JADX INFO: renamed from: to */
    public final float[] m71006to() {
        return this.f49053k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m71007x1() {
        return this.f49054kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70999k4(float f, float f2, float f3) {
        if (C14064he.m66715kk(f + f2 + f3)) {
            this.f49053k4 = null;
        } else {
            if (this.f49053k4 == null) {
                this.f49053k4 = new float[3];
            }
            float[] fArr = this.f49053k4;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
        }
        m70995dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71008x1(int i) {
        this.f49054kk = i;
        this.f49055to = false;
        m70995dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71000k4(int i) {
        this.f49056x1 = i;
        this.f49055to = false;
        m70995dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71001k4(ILightRig iLightRig) {
        this.f49053k4 = iLightRig.getRotation();
        this.f49056x1 = iLightRig.getDirection();
        this.f49054kk = iLightRig.getLightType();
        m70995dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71002k4(ILightRigEffectiveData iLightRigEffectiveData) {
        this.f49053k4 = iLightRigEffectiveData.getRotation();
        this.f49056x1 = iLightRigEffectiveData.getDirection();
        this.f49054kk = iLightRigEffectiveData.getLightType();
        m70995dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71003k4(boolean z) {
        this.f49055to = z;
    }
}

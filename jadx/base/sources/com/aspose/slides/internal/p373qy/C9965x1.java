package com.aspose.slides.internal.p373qy;

import com.aspose.slides.internal.p167hh.C4586to;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.qy.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9965x1 implements InterfaceC9964k4 {

    /* JADX INFO: renamed from: k4 */
    private final String f35987k4;

    /* JADX INFO: renamed from: kk */
    private final k4 f35988kk;

    /* JADX INFO: renamed from: to */
    private final float[] f35989to;

    /* JADX INFO: renamed from: x1 */
    private final k4 f35990x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.qy.x1$k4 */
    public class k4 {

        /* JADX INFO: renamed from: du */
        private final float f35991du;

        /* JADX INFO: renamed from: kk */
        private final float f35993kk;

        /* JADX INFO: renamed from: to */
        private final C9604wy f35994to;

        /* JADX INFO: renamed from: x1 */
        private final float f35995x1;

        public k4(C12013m9 c12013m9) {
            float fM56639dy = c12013m9.m56639dy();
            this.f35995x1 = fM56639dy;
            C9579bv c9579bvMo18944ck = ((C4586to) c12013m9.m56647ks()).mo18944ck();
            float fM46794m9 = c9579bvMo18944ck.m46794m9();
            this.f35993kk = fM46794m9;
            C9604wy c9604wyM46764du = c9579bvMo18944ck.m46764du();
            this.f35994to = c9604wyM46764du;
            C9578b3 c9578b3M46906k4 = c9604wyM46764du.m46906k4();
            c9578b3M46906k4 = c9578b3M46906k4 == null ? c9604wyM46764du.m46907k4(32) : c9578b3M46906k4;
            this.f35991du = c9578b3M46906k4 != null ? C9965x1.this.m49076k4(fM56639dy, fM46794m9, c9578b3M46906k4) : 0.0f;
        }
    }

    public C9965x1(String str, C12013m9 c12013m9, C12013m9 c12013m92) {
        this.f35987k4 = str;
        this.f35990x1 = new k4(c12013m9);
        this.f35988kk = c12013m92 != null ? new k4(c12013m92) : null;
        this.f35989to = new float[str.length() + 1];
        float fM49075k4 = 0.0f;
        int i = 0;
        while (i < str.length()) {
            fM49075k4 += m49075k4(str.charAt(i));
            i++;
            this.f35989to[i] = fM49075k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m49075k4(char c) {
        C9578b3 c9578b3M46907k4;
        C9578b3 c9578b3M46907k42;
        if (c == '\t' || Character.isIdentifierIgnorable(c)) {
            return 0.0f;
        }
        k4 k4Var = this.f35988kk;
        if (k4Var != null && k4Var.f35994to != null && (c9578b3M46907k42 = this.f35988kk.f35994to.m46907k4(c)) != null) {
            return m49076k4(this.f35988kk.f35995x1, this.f35988kk.f35993kk, c9578b3M46907k42);
        }
        if (this.f35990x1.f35994to != null && (c9578b3M46907k4 = this.f35990x1.f35994to.m46907k4(c)) != null) {
            return m49076k4(this.f35990x1.f35995x1, this.f35990x1.f35993kk, c9578b3M46907k4);
        }
        k4 k4Var2 = this.f35988kk;
        return k4Var2 != null ? k4Var2.f35991du : this.f35990x1.f35991du;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public float m49076k4(float f, float f2, C9578b3 c9578b3) {
        return C7035kk.m27489k4(f, f2, c9578b3.m46755kk());
    }

    @Override // com.aspose.slides.internal.p373qy.InterfaceC9964k4
    /* JADX INFO: renamed from: k4 */
    public float mo23081k4(int i, int i2) {
        float[] fArr = this.f35989to;
        return fArr[i2] - fArr[i];
    }

    @Override // com.aspose.slides.internal.p373qy.InterfaceC9964k4
    /* JADX INFO: renamed from: k4 */
    public int mo23082k4(int i, float f) {
        int length = this.f35987k4.length();
        int i2 = i;
        while (i2 < length) {
            float[] fArr = this.f35989to;
            int i3 = i2 + 1;
            if (fArr[i3] - fArr[i] > f) {
                return i2;
            }
            i2 = i3;
        }
        return length;
    }
}

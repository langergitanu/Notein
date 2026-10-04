package com.aspose.slides.internal.p271mc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C6363fa {

    /* JADX INFO: renamed from: du */
    private C12003du[] f18126du;

    /* JADX INFO: renamed from: h4 */
    private float[] f18127h4;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f18128k4 = new C12025x6();

    /* JADX INFO: renamed from: kk */
    private C12025x6 f18129kk = new C12025x6();

    /* JADX INFO: renamed from: to */
    private float f18130to;

    /* JADX INFO: renamed from: x1 */
    private float f18131x1;

    public C6363fa(C12025x6 c12025x6, float f, C12025x6 c12025x62, float f2, AbstractC6972x1 abstractC6972x1, C7186k4 c7186k4) {
        float f3;
        float f4;
        if (c7186k4 != null) {
            float[] fArrM27788x1 = c7186k4.m27788x1();
            f3 = fArrM27788x1[0];
            f4 = fArrM27788x1[1];
        } else {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        float f5 = (f4 - f3) / 20.0f;
        float[] fArr = new float[21];
        for (int i = 0; i < 21; i++) {
            fArr[i] = i * f5;
        }
        List<C12003du> listM26191k4 = C6371x1.m26191k4(fArr, abstractC6972x1);
        m26135k4(c12025x6.Clone());
        m26134k4(f);
        m26139x1(c12025x62.Clone());
        m26138x1(f2);
        m26137k4(listM26191k4.toArray(new C12003du[0]));
        m26136k4(fArr);
    }

    /* JADX INFO: renamed from: du */
    public final float[] m26140du() {
        return this.f18127h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m26141k4() {
        return this.f18128k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final float m26143kk() {
        return this.f18130to;
    }

    /* JADX INFO: renamed from: to */
    public final C12003du[] m26144to() {
        return this.f18126du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m26145x1() {
        return this.f18129kk.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26134k4(float f) {
        this.f18131x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m26138x1(float f) {
        this.f18130to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m26139x1(C12025x6 c12025x6) {
        this.f18129kk = c12025x6.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26142k4(C11913yj c11913yj) {
        C12025x6[] c12025x6Arr = {m26141k4(), m26145x1()};
        c11913yj.m55775k4(c12025x6Arr);
        m26135k4(c12025x6Arr[0].Clone());
        m26139x1(c12025x6Arr[1].Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m26135k4(C12025x6 c12025x6) {
        this.f18128k4 = c12025x6.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26136k4(float[] fArr) {
        this.f18127h4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    private void m26137k4(C12003du[] c12003duArr) {
        this.f18126du = c12003duArr;
    }
}

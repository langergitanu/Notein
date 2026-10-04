package com.aspose.slides.internal.p271mc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6359c5 {

    /* JADX INFO: renamed from: kk */
    private C12003du[] f18089kk;

    /* JADX INFO: renamed from: to */
    private float[] f18090to;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f18088k4 = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f18091x1 = new C12025x6();

    public C6359c5(C12025x6 c12025x6, C12025x6 c12025x62, AbstractC6972x1 abstractC6972x1, C7186k4 c7186k4) {
        float f;
        float f2;
        if (c7186k4 != null) {
            float[] fArrM27788x1 = c7186k4.m27788x1();
            f = fArrM27788x1[0];
            f2 = fArrM27788x1[1];
        } else {
            f = 0.0f;
            f2 = 1.0f;
        }
        float f3 = (f2 - f) / 20.0f;
        float[] fArr = new float[21];
        for (int i = 0; i < 21; i++) {
            fArr[i] = i * f3;
        }
        List<C12003du> listM26191k4 = C6371x1.m26191k4(fArr, abstractC6972x1);
        m26051k4(c12025x6.Clone());
        m26054x1(c12025x62.Clone());
        m26053k4(listM26191k4.toArray(new C12003du[0]));
        m26052k4(fArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m26055k4() {
        return this.f18088k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du[] m26057kk() {
        return this.f18089kk;
    }

    /* JADX INFO: renamed from: to */
    public final float[] m26058to() {
        return this.f18090to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m26059x1() {
        return this.f18091x1.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    private void m26054x1(C12025x6 c12025x6) {
        this.f18091x1 = c12025x6.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26056k4(C11913yj c11913yj) {
        C12025x6[] c12025x6Arr = {m26055k4(), m26059x1()};
        c11913yj.m55775k4(c12025x6Arr);
        m26051k4(c12025x6Arr[0].Clone());
        m26054x1(c12025x6Arr[1].Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m26051k4(C12025x6 c12025x6) {
        this.f18088k4 = c12025x6.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26052k4(float[] fArr) {
        this.f18090to = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    private void m26053k4(C12003du[] c12003duArr) {
        this.f18089kk = c12003duArr;
    }
}

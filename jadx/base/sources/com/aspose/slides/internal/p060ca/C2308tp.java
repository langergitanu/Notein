package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tp */
/* JADX INFO: loaded from: classes3.dex */
class C2308tp {
    /* JADX INFO: renamed from: k4 */
    public static C2141j8 m11448k4(InterfaceC2416zz interfaceC2416zz) {
        C2153k2 c2153k2M10583k4 = interfaceC2416zz.mo10369qw().m10583k4();
        for (int size = c2153k2M10583k4.m10866kk().m10541k4().size() - 1; size >= 0; size--) {
            if (C7019kk.m27469x1(c2153k2M10583k4.m10866kk().m10541k4().get_Item(size), C2239p5.class)) {
                C2239p5 c2239p5 = (C2239p5) c2153k2M10583k4.m10866kk().m10541k4().get_Item(size);
                C2141j8 c2141j8 = new C2141j8(c2239p5.m11228k4(), c2239p5.m11229x1());
                c2153k2M10583k4.m10866kk().m10541k4().m10129k4(c2141j8);
                return c2141j8;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static C2336vf m11451x1(InterfaceC2416zz interfaceC2416zz, double d, double d2) {
        C2153k2 c2153k2M10583k4 = interfaceC2416zz.mo10369qw().m10583k4();
        c2153k2M10583k4.m10864k4(new C2148jn(c2153k2M10583k4.m10862k4().m10858k4() + d, c2153k2M10583k4.m10862k4().m10860x1() + d2));
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        c2153k2M10583k4.m10867x1().m11689k4(c2153k2M10583k4.m10862k4().m10858k4(), c2153k2M10583k4.m10862k4().m10860x1(), dArr, dArr2);
        C2336vf c2336vf = new C2336vf(dArr[0], dArr2[0]);
        c2153k2M10583k4.m10866kk().m10541k4().m10129k4(c2336vf);
        return c2336vf;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2239p5 m11449k4(InterfaceC2416zz interfaceC2416zz, double d, double d2) {
        C2153k2 c2153k2M10583k4 = interfaceC2416zz.mo10369qw().m10583k4();
        c2153k2M10583k4.m10864k4(new C2148jn(c2153k2M10583k4.m10862k4().m10858k4() + d, c2153k2M10583k4.m10862k4().m10860x1() + d2));
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        c2153k2M10583k4.m10867x1().m11689k4(c2153k2M10583k4.m10862k4().m10858k4(), c2153k2M10583k4.m10862k4().m10860x1(), dArr, dArr2);
        C2239p5 c2239p5 = new C2239p5(dArr[0], dArr2[0]);
        c2153k2M10583k4.m10866kk().m10541k4().m10129k4(c2239p5);
        return c2239p5;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2305th m11450k4(InterfaceC2416zz interfaceC2416zz, double d, double d2, double d3, double d4, double d5, double d6) {
        C2153k2 c2153k2M10583k4 = interfaceC2416zz.mo10369qw().m10583k4();
        double dM10858k4 = c2153k2M10583k4.m10862k4().m10858k4() + d;
        double dM10860x1 = c2153k2M10583k4.m10862k4().m10860x1() + d2;
        double d7 = dM10858k4 + d3;
        double d8 = dM10860x1 + d4;
        double d9 = d7 + d5;
        double d10 = d8 + d6;
        c2153k2M10583k4.m10864k4(new C2148jn(d9, d10));
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        c2153k2M10583k4.m10867x1().m11689k4(dM10858k4, dM10860x1, dArr, dArr2);
        double d11 = dArr[0];
        double d12 = dArr2[0];
        double[] dArr3 = {0.0d};
        double[] dArr4 = {0.0d};
        c2153k2M10583k4.m10867x1().m11689k4(d7, d8, dArr3, dArr4);
        double d13 = dArr3[0];
        double d14 = dArr4[0];
        double[] dArr5 = {0.0d};
        double[] dArr6 = {0.0d};
        c2153k2M10583k4.m10867x1().m11689k4(d9, d10, dArr5, dArr6);
        C2305th c2305th = new C2305th(d11, d12, d13, d14, dArr5[0], dArr6[0]);
        c2153k2M10583k4.m10866kk().m10541k4().m10129k4(c2305th);
        return c2305th;
    }
}

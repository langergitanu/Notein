package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.s7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2286s7 extends AbstractC2313tw {

    /* JADX INFO: renamed from: dy */
    private C2033cj f7862dy;

    /* JADX INFO: renamed from: k4 */
    private String f7865k4;

    /* JADX INFO: renamed from: kk */
    private C2097gf[] f7866kk;

    /* JADX INFO: renamed from: x1 */
    private C2097gf f7869x1;

    /* JADX INFO: renamed from: jd */
    private Object f7864jd = new Object();

    /* JADX INFO: renamed from: ck */
    private Object f7860ck = new Object();

    /* JADX INFO: renamed from: du */
    private C2337vh f7861du = new C2337vh(this);

    /* JADX INFO: renamed from: h4 */
    private C2385y9 f7863h4 = new C2385y9();

    /* JADX INFO: renamed from: m9 */
    private C2310ts f7867m9 = new C2310ts(this);

    /* JADX INFO: renamed from: to */
    private int f7868to = 0;

    /* JADX INFO: renamed from: c5 */
    private List<Integer> f7859c5 = new List<>();

    public C2286s7(C2033cj c2033cj) {
        this.f7862dy = c2033cj;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: c5 */
    public InterfaceC2030c9 mo10258c5() {
        return this.f7861du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: ck */
    public C2033cj mo10259ck() {
        return this.f7862dy;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: du */
    public int mo10260du() {
        return 2;
    }

    /* JADX INFO: renamed from: dy */
    public int m11379dy() {
        return m11382k4().m11740m9().m11210kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: fa */
    public InterfaceC2201mt mo10261fa() {
        return new C2138j2(this);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: h4 */
    public String mo10262h4() {
        return this.f7865k4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public InterfaceC2371xl mo10263jd() {
        return this.f7867m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m11380k4(int i) {
        C2097gf c2097gfM11385kk = m11385kk();
        C2097gf[] c2097gfArr = this.f7866kk;
        if (c2097gfArr != null && c2097gfArr.length != 0) {
            int iM11614k4 = m11382k4().m11742x1().m11614k4(i) & 255;
            C2097gf[] c2097gfArr2 = this.f7866kk;
            if (iM11614k4 < c2097gfArr2.length) {
                c2097gfM11385kk = c2097gfArr2[iM11614k4];
            }
        }
        double d = c2097gfM11385kk.m10587x1().f7607k4;
        int[] iArr = {0};
        int[] iArr2 = {0};
        this.f7863h4.m11740m9().m11206k4(i, iArr, iArr2);
        int i2 = iArr[0];
        int i3 = iArr2[0];
        C2386yd c2386yd = new C2386yd(m11385kk().m10584k4().f7944up);
        C2068ei c2068ei = new C2068ei();
        C2180lr c2180lr = new C2180lr(c2386yd, this, c2097gfM11385kk, c2068ei);
        c2386yd.m10366k4(c2180lr);
        c2180lr.m11045k4().m10478kk(d);
        c2386yd.mo10372x1(new C2317u4(this.f7863h4.m11740m9().m11202h4(), i2, i3));
        return c2068ei;
    }

    /* JADX INFO: renamed from: kk */
    public final C2097gf m11385kk() {
        return this.f7869x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m11386m9() {
        return m11385kk().m10584k4().f7933k4;
    }

    /* JADX INFO: renamed from: to */
    public final List<Integer> m11387to() {
        return this.f7859c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11388x1(String str) {
        C2310ts c2310ts = (C2310ts) C7019kk.m27452k4((Object) mo10263jd(), C2310ts.class);
        if (c2310ts == null) {
            return -1;
        }
        C2343w2 c2343w2M11456x1 = c2310ts.m11456x1();
        if (c2343w2M11456x1.m11585x1(str)) {
            return ((C2334v6) mo10263jd().mo10989x1((char) c2343w2M11456x1.m11582k4(str))).m11556k4();
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10265k4(AbstractC2220nx abstractC2220nx) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            return m11380k4(c2334v6.m11556k4());
        }
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            return m11381k4(c2319ub.m11480k4());
        }
        throw new C2147jm("string name Glyph ID is not supported for this font type.");
    }

    /* JADX INFO: renamed from: x1 */
    public final C2097gf[] m11389x1() {
        return this.f7866kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m11381k4(String str) {
        int iM11388x1 = m11388x1(str);
        if (iM11388x1 != -1) {
            return m11380k4(iM11388x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2385y9 m11382k4() {
        return this.f7863h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11383k4(C2097gf c2097gf) {
        this.f7869x1 = c2097gf;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11384k4(C2097gf[] c2097gfArr) {
        this.f7866kk = c2097gfArr;
    }
}

package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.fa */
/* JADX INFO: loaded from: classes4.dex */
public final class C6889fa implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private C12026yj f18836k4;

    /* JADX INFO: renamed from: kk */
    private C6893kk f18837kk;

    /* JADX INFO: renamed from: to */
    private C6893kk f18838to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC6897x1 f18839x1;

    private C6889fa() {
    }

    /* JADX INFO: renamed from: c5 */
    public final float m26967c5() {
        return this.f18836k4.m56907c5();
    }

    /* JADX INFO: renamed from: ck */
    public final int m26968ck() {
        return this.f18836k4.m56908ck();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        C6889fa c6889fa = new C6889fa();
        c6889fa.f18836k4 = (C12026yj) this.f18836k4.deepClone();
        c6889fa.f18839x1 = (AbstractC6897x1) this.f18839x1.deepClone();
        return c6889fa;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f18836k4.dispose();
        this.f18839x1.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final float[] m26969du() {
        return this.f18836k4.m56910du();
    }

    /* JADX INFO: renamed from: dy */
    public final int m26970dy() {
        return this.f18836k4.m56911dy();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6889fa.class) && m26966k4((C6889fa) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final int m26971fa() {
        return this.f18836k4.m56934up();
    }

    /* JADX INFO: renamed from: h4 */
    public final C6893kk m26972h4() {
        return this.f18837kk;
    }

    public int hashCode() {
        C12026yj c12026yj = this.f18836k4;
        int iHashCode = (c12026yj != null ? c12026yj.hashCode() : 0) * 397;
        AbstractC6897x1 abstractC6897x1 = this.f18839x1;
        return ((((iHashCode ^ (abstractC6897x1 != null ? abstractC6897x1.hashCode() : 0)) * 397) ^ (m26972h4() != null ? m26972h4().hashCode() : 0)) * 397) ^ (m26983m9() != null ? m26983m9().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final float[] m26973jd() {
        return this.f18836k4.m56916jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12026yj m26974k4() {
        return this.f18836k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6897x1 m26979kk() {
        return this.f18839x1;
    }

    /* JADX INFO: renamed from: ks */
    public final int m26982ks() {
        return this.f18836k4.m56912fa();
    }

    /* JADX INFO: renamed from: m9 */
    public final C6893kk m26983m9() {
        return this.f18838to;
    }

    /* JADX INFO: renamed from: rv */
    public final C11913yj m26984rv() {
        return this.f18836k4.m56940x6();
    }

    /* JADX INFO: renamed from: to */
    public final C12003du m26985to() {
        return this.f18836k4.m56925kk();
    }

    /* JADX INFO: renamed from: up */
    public final int m26986up() {
        return this.f18836k4.m56941yj();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m26987x1() {
        return this.f18836k4.m56917k4();
    }

    /* JADX INFO: renamed from: x6 */
    public final float m26990x6() {
        return this.f18836k4.m56930ne();
    }

    /* JADX INFO: renamed from: yj */
    public final float m26991yj() {
        return this.f18836k4.m56928ks();
    }

    public C6889fa(AbstractC6897x1 abstractC6897x1) {
        this.f18839x1 = abstractC6897x1;
        this.f18836k4 = new C12026yj(abstractC6897x1.mo26959k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26975k4(float f) {
        this.f18836k4.m56918k4(f);
    }

    /* JADX INFO: renamed from: kk */
    public final void m26980kk(float f) {
        this.f18836k4.m56926kk(f);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26988x1(float f) {
        this.f18836k4.m56936x1(f);
    }

    public C6889fa(C12003du c12003du) {
        this.f18839x1 = new C6896up(c12003du.Clone());
        this.f18836k4 = new C12026yj(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26976k4(int i) {
        this.f18836k4.m56909du(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m26981kk(int i) {
        this.f18836k4.m56932to(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26989x1(int i) {
        this.f18836k4.m56914h4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26977k4(C12003du c12003du) {
        this.f18836k4.m56923k4(c12003du.Clone());
        this.f18839x1 = new C6896up(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26978k4(float[] fArr) {
        this.f18836k4.m56939x1(fArr);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26966k4(C6889fa c6889fa) {
        return C14067j2.m66728k4(this.f18836k4, c6889fa.f18836k4) && C14067j2.m66728k4(this.f18839x1, c6889fa.f18839x1) && C14067j2.m66728k4(m26972h4(), c6889fa.m26972h4()) && C14067j2.m66728k4(m26983m9(), c6889fa.m26983m9());
    }
}

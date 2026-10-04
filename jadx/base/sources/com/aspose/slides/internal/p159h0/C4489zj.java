package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.zj */
/* JADX INFO: loaded from: classes.dex */
public class C4489zj extends AbstractC7020m9<C4489zj> {

    /* JADX INFO: renamed from: k4 */
    private float f12343k4;

    /* JADX INFO: renamed from: kk */
    private float f12344kk;

    /* JADX INFO: renamed from: x1 */
    private float f12345x1;

    public C4489zj() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C4489zj Clone() {
        C4489zj c4489zj = new C4489zj();
        CloneTo(c4489zj);
        return c4489zj;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4489zj) {
            return m18501kk((C4489zj) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f12343k4), Float.valueOf(this.f12345x1), Float.valueOf(this.f12344kk));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m18506k4() {
        return this.f12343k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m18508kk() {
        return this.f12344kk;
    }

    /* JADX INFO: renamed from: to */
    public final C4489zj m18510to() {
        float fM67496rv = (float) C14116yg.m67496rv((m18508kk() * m18508kk()) + (m18511x1() * m18511x1()) + (m18506k4() * m18506k4()));
        return fM67496rv > 0.0f ? new C4489zj(m18506k4() / fM67496rv, m18511x1() / fM67496rv, m18508kk() / fM67496rv) : new C4489zj(0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m18511x1() {
        return this.f12345x1;
    }

    public C4489zj(float f) {
        m18507k4(f);
        m18512x1(f);
        m18509kk(f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4489zj m18496k4(float f, C4489zj c4489zj) {
        return new C4489zj(c4489zj.m18506k4() * f, c4489zj.m18511x1() * f, c4489zj.m18508kk() * f);
    }

    /* JADX INFO: renamed from: kk */
    public static float m18500kk(C4489zj c4489zj, C4489zj c4489zj2) {
        return (c4489zj2.m18508kk() * c4489zj.m18508kk()) + (c4489zj2.m18511x1() * c4489zj.m18511x1()) + (c4489zj2.m18506k4() * c4489zj.m18506k4());
    }

    /* JADX INFO: renamed from: to */
    public static C4489zj m18502to(C4489zj c4489zj, C4489zj c4489zj2) {
        return new C4489zj((c4489zj2.m18508kk() * c4489zj.m18511x1()) - (c4489zj2.m18511x1() * c4489zj.m18508kk()), (c4489zj2.m18506k4() * c4489zj.m18508kk()) - (c4489zj2.m18508kk() * c4489zj.m18506k4()), (c4489zj2.m18511x1() * c4489zj.m18506k4()) - (c4489zj2.m18506k4() * c4489zj.m18511x1()));
    }

    /* JADX INFO: renamed from: x1 */
    public static C4489zj m18503x1(C4489zj c4489zj, float f) {
        return new C4489zj(c4489zj.m18506k4() / f, c4489zj.m18511x1() / f, c4489zj.m18508kk() / f);
    }

    public C4489zj(float f, float f2, float f3) {
        m18507k4(f);
        m18512x1(f2);
        m18509kk(f3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4489zj m18497k4(C4489zj c4489zj) {
        return new C4489zj(-c4489zj.m18506k4(), -c4489zj.m18511x1(), -c4489zj.m18508kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static C4489zj m18504x1(C4489zj c4489zj, C4489zj c4489zj2) {
        return new C4489zj(c4489zj.m18506k4() - c4489zj2.m18506k4(), c4489zj.m18511x1() - c4489zj2.m18511x1(), c4489zj.m18508kk() - c4489zj2.m18508kk());
    }

    /* JADX INFO: renamed from: kk */
    public final void m18509kk(float f) {
        this.f12344kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4489zj m18498k4(C4489zj c4489zj, float f) {
        return new C4489zj(c4489zj.m18506k4() * f, c4489zj.m18511x1() * f, c4489zj.m18508kk() * f);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m18501kk(C4489zj c4489zj) {
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18512x1(float f) {
        this.f12345x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4489zj m18499k4(C4489zj c4489zj, C4489zj c4489zj2) {
        return new C4489zj(c4489zj2.m18506k4() + c4489zj.m18506k4(), c4489zj2.m18511x1() + c4489zj.m18511x1(), c4489zj2.m18508kk() + c4489zj.m18508kk());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4489zj c4489zj) {
        c4489zj.f12343k4 = this.f12343k4;
        c4489zj.f12345x1 = this.f12345x1;
        c4489zj.f12344kk = this.f12344kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18507k4(float f) {
        this.f12343k4 = f;
    }
}

package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.pl */
/* JADX INFO: loaded from: classes3.dex */
class C14293pl extends AbstractC7020m9<C14293pl> {

    /* JADX INFO: renamed from: to */
    public static final C14293pl f48090to;

    /* JADX INFO: renamed from: k4 */
    public float f48091k4;

    /* JADX INFO: renamed from: kk */
    public float f48092kk;

    /* JADX INFO: renamed from: x1 */
    public float f48093x1;

    static {
        C14293pl c14293pl = new C14293pl();
        f48090to = c14293pl;
        c14293pl.f48091k4 = 0.0f;
        c14293pl.f48093x1 = 0.0f;
        c14293pl.f48092kk = 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m69132x1(C14293pl c14293pl) {
        return c14293pl.f48091k4 == this.f48091k4 && c14293pl.f48093x1 == this.f48093x1 && c14293pl.f48092kk == this.f48092kk;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14293pl) {
            return m69132x1((C14293pl) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f48091k4), Float.valueOf(this.f48093x1), Float.valueOf(this.f48092kk));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14293pl Clone() {
        C14293pl c14293pl = new C14293pl();
        CloneTo(c14293pl);
        return c14293pl;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14293pl m69131k4(C14293pl c14293pl, C14293pl c14293pl2) {
        C14293pl c14293pl3 = new C14293pl();
        c14293pl3.f48091k4 = C14116yg.m67481k4(c14293pl.f48091k4, c14293pl2.f48091k4);
        c14293pl3.f48093x1 = C14116yg.m67481k4(c14293pl.f48093x1, c14293pl2.f48093x1);
        c14293pl3.f48092kk = C14116yg.m67481k4(c14293pl.f48092kk, c14293pl2.f48092kk);
        return c14293pl3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14293pl c14293pl) {
        c14293pl.f48091k4 = this.f48091k4;
        c14293pl.f48093x1 = this.f48093x1;
        c14293pl.f48092kk = this.f48092kk;
    }
}

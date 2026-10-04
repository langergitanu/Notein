package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.em */
/* JADX INFO: loaded from: classes.dex */
public class C4443em extends AbstractC7020m9<C4443em> {

    /* JADX INFO: renamed from: k4 */
    private int f12207k4;

    /* JADX INFO: renamed from: x1 */
    private int f12208x1;

    public C4443em() {
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
        if (obj instanceof C4443em) {
            return m18172kk((C4443em) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f12207k4), Integer.valueOf(this.f12208x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m18173k4() {
        return this.f12207k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m18175kk() {
        return (float) C14116yg.m67496rv((((double) m18177x1()) * ((double) m18177x1())) + ((double) (m18173k4() * m18173k4())));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C4443em Clone() {
        C4443em c4443em = new C4443em();
        CloneTo(c4443em);
        return c4443em;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m18177x1() {
        return this.f12208x1;
    }

    public C4443em(int i, int i2) {
        m18174k4(i);
        m18178x1(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4443em m18170k4(C4443em c4443em, C4443em c4443em2) {
        return new C4443em(c4443em.m18173k4() - c4443em2.m18173k4(), c4443em.m18177x1() - c4443em2.m18177x1());
    }

    /* JADX INFO: renamed from: kk */
    private boolean m18172kk(C4443em c4443em) {
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18178x1(int i) {
        this.f12208x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4459os m18171k4(C4443em c4443em) {
        return new C4459os(c4443em.m18173k4(), c4443em.m18177x1());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4443em c4443em) {
        c4443em.f12207k4 = this.f12207k4;
        c4443em.f12208x1 = this.f12208x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18174k4(int i) {
        this.f12207k4 = i;
    }
}

package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C6101zj extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private C12014ne[] f17233k4;

    public C6101zj(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: dy */
    public final C12014ne[] m24730dy() {
        return this.f17233k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m24732k4((C6101zj) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ (m24730dy() != null ? AbstractC14092to.m67208k4((Object) m24730dy()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24731k4(C12014ne[] c12014neArr) {
        this.f17233k4 = c12014neArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24733kk() {
        return (mo24431G_() & 128) > 0;
    }

    /* JADX INFO: renamed from: to */
    public final short m24734to() {
        return (short) (mo24431G_() & Short.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24732k4(C6101zj c6101zj) {
        return m24438k4((C6045bz) c6101zj) && C12530dy.m58334k4(m24730dy(), c6101zj.m24730dy());
    }
}

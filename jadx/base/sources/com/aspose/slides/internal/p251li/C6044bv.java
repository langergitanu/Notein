package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C6044bv extends AbstractC6068lr {

    /* JADX INFO: renamed from: k4 */
    private float f17142k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC4619du f17143kk;

    /* JADX INFO: renamed from: x1 */
    private float f17144x1;

    public C6044bv() {
        m24449x1((short) 16400);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4619du m24423c5() {
        return this.f17143kk;
    }

    /* JADX INFO: renamed from: dy */
    public final float m24424dy() {
        return this.f17144x1;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
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
        return m24427k4((C6044bv) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17143kk.mo19017h4() + 12;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM24578up = ((((m24578up() * 397) ^ C14064he.m66708k4(this.f17142k4)) * 397) ^ C14064he.m66708k4(this.f17144x1)) * 397;
        AbstractC4619du abstractC4619du = this.f17143kk;
        return iM24578up ^ (abstractC4619du != null ? abstractC4619du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24425k4(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        this.f17142k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24428kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final float m24429to() {
        return this.f17142k4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StartAngle: {1}, SweepAngle: {2}, RectData: {3}", super.toString(), Float.valueOf(this.f17142k4), Float.valueOf(this.f17144x1), this.f17143kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24430x1(float f) {
        this.f17144x1 = f;
    }

    public C6044bv(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24426k4(AbstractC4619du abstractC4619du) {
        this.f17143kk = abstractC4619du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24427k4(C6044bv c6044bv) {
        return m24578up() == c6044bv.m24578up() && C14064he.m66718x1(this.f17142k4, c6044bv.f17142k4) && C14064he.m66718x1(this.f17144x1, c6044bv.f17144x1) && C14067j2.m66728k4(this.f17143kk, c6044bv.f17143kk);
    }
}

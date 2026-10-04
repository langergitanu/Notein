package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C6056fa extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4619du f17166k4;

    public C6056fa() {
        m24449x1((short) 16399);
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC4619du m24498dy() {
        return this.f17166k4;
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
        return m24500k4((C6056fa) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17166k4.mo19017h4();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        AbstractC4619du abstractC4619du = this.f17166k4;
        if (abstractC4619du != null) {
            return abstractC4619du.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24499k4(AbstractC4619du abstractC4619du) {
        this.f17166k4 = abstractC4619du;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24501kk() {
        return m24447wl();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24502to() {
        return m24433h4(14);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectData: [{1}]", super.toString(), this.f17166k4);
    }

    public C6056fa(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24500k4(C6056fa c6056fa) {
        return C14067j2.m66728k4(this.f17166k4, c6056fa.f17166k4);
    }
}

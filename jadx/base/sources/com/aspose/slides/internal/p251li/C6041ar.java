package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C6041ar extends AbstractC6068lr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4619du f17141k4;

    public C6041ar() {
        m24449x1((short) 16398);
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
        return m24418k4((C6041ar) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17141k4.mo19017h4() + 4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM24578up = m24578up() * 397;
        AbstractC4619du abstractC4619du = this.f17141k4;
        return iM24578up ^ (abstractC4619du != null ? abstractC4619du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24417k4(AbstractC4619du abstractC4619du) {
        this.f17141k4 = abstractC4619du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24419kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC4619du m24420to() {
        return this.f17141k4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectData: {1}", super.toString(), this.f17141k4);
    }

    public C6041ar(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24418k4(C6041ar c6041ar) {
        return m24578up() == c6041ar.m24578up() && C14067j2.m66728k4(this.f17141k4, c6041ar.f17141k4);
    }
}

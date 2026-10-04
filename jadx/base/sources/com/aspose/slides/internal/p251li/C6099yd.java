package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C6099yd extends AbstractC6068lr {

    /* JADX INFO: renamed from: k4 */
    private long f17226k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4619du[] f17227x1;

    public C6099yd() {
        m24449x1((short) 16394);
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC4619du[] m24705dy() {
        return this.f17227x1;
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
        return m24708k4((C6099yd) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 8;
        if (m24705dy() != null) {
            for (AbstractC4619du abstractC4619du : m24705dy()) {
                iMo19017h4 += abstractC4619du.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM24578up = ((m24578up() * 397) ^ ((int) this.f17226k4)) * 397;
        AbstractC4619du[] abstractC4619duArr = this.f17227x1;
        return iM24578up ^ (abstractC4619duArr != null ? AbstractC14092to.m67208k4((Object) abstractC4619duArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24706k4(long j) {
        this.f17226k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24709kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final long m24710to() {
        return this.f17226k4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Count: {1}, RectData: {2}", super.toString(), Long.valueOf(this.f17226k4), this.f17227x1);
    }

    public C6099yd(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24707k4(AbstractC4619du[] abstractC4619duArr) {
        this.f17227x1 = abstractC4619duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24708k4(C6099yd c6099yd) {
        return m24578up() == c6099yd.m24578up() && this.f17226k4 == c6099yd.f17226k4 && C12530dy.m58334k4(this.f17227x1, c6099yd.f17227x1);
    }
}

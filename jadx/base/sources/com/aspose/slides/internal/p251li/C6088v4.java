package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6088v4 extends AbstractC6068lr {

    /* JADX INFO: renamed from: k4 */
    private long f17214k4;

    /* JADX INFO: renamed from: x1 */
    private C4657to[] f17215x1;

    public C6088v4() {
        m24449x1((short) 16396);
    }

    /* JADX INFO: renamed from: c5 */
    public final C4657to[] m24658c5() {
        return this.f17215x1;
    }

    /* JADX INFO: renamed from: dy */
    public final long m24659dy() {
        return this.f17214k4;
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
        return m24662k4((C6088v4) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 8;
        if (m24658c5() != null) {
            for (C4657to c4657to : m24658c5()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM24578up = ((m24578up() * 397) ^ ((int) this.f17214k4)) * 397;
        C4657to[] c4657toArr = this.f17215x1;
        return iM24578up ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24660k4(long j) {
        if ((4294967295L & j) < 3) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17214k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24663kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24664to() {
        return m24433h4(13);
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Long.valueOf(this.f17214k4), this.f17215x1);
    }

    public C6088v4(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24661k4(C4657to[] c4657toArr) {
        this.f17215x1 = c4657toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24662k4(C6088v4 c6088v4) {
        return m24578up() == c6088v4.m24578up() && this.f17214k4 == c6088v4.f17214k4 && C12530dy.m58334k4(this.f17215x1, c6088v4.f17215x1);
    }
}

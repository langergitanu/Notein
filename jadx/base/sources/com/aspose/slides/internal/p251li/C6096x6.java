package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6096x6 extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private float f17220k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC4619du f17221kk;

    /* JADX INFO: renamed from: x1 */
    private float f17222x1;

    public C6096x6() {
        m24449x1((short) 16401);
    }

    /* JADX INFO: renamed from: c5 */
    public final float m24680c5() {
        return this.f17222x1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m24681dy() {
        return this.f17220k4;
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
        return m24685k4((C6096x6) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17221kk.mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM66708k4 = ((C14064he.m66708k4(this.f17220k4) * 397) ^ C14064he.m66708k4(this.f17222x1)) * 397;
        AbstractC4619du abstractC4619du = this.f17221kk;
        return iM66708k4 ^ (abstractC4619du != null ? abstractC4619du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC4619du m24682jd() {
        return this.f17221kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24683k4(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        this.f17220k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24686kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final byte m24687to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StartAngle: {1}, SweepAngle: {2}, RectData: {3}", super.toString(), Float.valueOf(this.f17220k4), Float.valueOf(this.f17222x1), this.f17221kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24688x1(float f) {
        if (f < -360.0f || f > 360.0f) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f17222x1 = f;
    }

    public C6096x6(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24684k4(AbstractC4619du abstractC4619du) {
        this.f17221kk = abstractC4619du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24685k4(C6096x6 c6096x6) {
        return C14064he.m66718x1(this.f17220k4, c6096x6.f17220k4) && C14064he.m66718x1(this.f17222x1, c6096x6.f17222x1) && C14067j2.m66728k4(this.f17221kk, c6096x6.f17221kk);
    }
}

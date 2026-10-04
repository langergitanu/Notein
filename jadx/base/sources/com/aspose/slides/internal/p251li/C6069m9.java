package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6069m9 extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4619du f17193k4;

    /* JADX INFO: renamed from: kk */
    private float f17194kk;

    /* JADX INFO: renamed from: x1 */
    private float f17195x1;

    public C6069m9() {
        m24449x1((short) 16402);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: H_ */
    public int mo24432H_() {
        return m24585kk() ? 16 : 24;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m24579c5() {
        return this.f17194kk;
    }

    /* JADX INFO: renamed from: dy */
    public final float m24580dy() {
        return this.f17195x1;
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
        return m24584k4((C6069m9) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return this.f17193k4.mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        AbstractC4619du abstractC4619du = this.f17193k4;
        return ((((abstractC4619du != null ? abstractC4619du.hashCode() : 0) * 397) ^ C14064he.m66708k4(this.f17195x1)) * 397) ^ C14064he.m66708k4(this.f17194kk);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC4619du m24581jd() {
        return this.f17193k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24582k4(float f) {
        this.f17195x1 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24585kk() {
        return m24433h4(14);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: m9 */
    public int mo24441m9() {
        return !m24585kk() ? 36 : 28;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24586to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectangleData: {1}, StartAngle: {2}, SweepAngle: {3}", super.toString(), this.f17193k4, Float.valueOf(this.f17195x1), Float.valueOf(this.f17194kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24587x1(float f) {
        this.f17194kk = f;
    }

    public C6069m9(C6045bz c6045bz) {
        super(c6045bz);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: k4 */
    public void mo24435k4(int i) {
        if (!m24585kk() && i == 24) {
            super.mo24448x1(i);
        } else {
            if (!m24585kk() || i != 16) {
                throw new InvalidDataException("Invalid value");
            }
            super.mo24448x1(i);
        }
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: x1 */
    public void mo24448x1(int i) {
        if (!m24585kk() && i == 36) {
            super.mo24448x1(i);
        } else {
            if (!m24585kk() || i != 28) {
                throw new InvalidDataException("Invalid value");
            }
            super.mo24448x1(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24583k4(AbstractC4619du abstractC4619du) {
        this.f17193k4 = abstractC4619du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24584k4(C6069m9 c6069m9) {
        return C14067j2.m66728k4(this.f17193k4, c6069m9.f17193k4) && C14064he.m66718x1(this.f17195x1, c6069m9.f17195x1) && C14064he.m66718x1(this.f17194kk, c6069m9.f17194kk);
    }
}

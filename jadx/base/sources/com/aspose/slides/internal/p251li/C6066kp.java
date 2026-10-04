package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C6066kp extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private float f17188k4;

    /* JADX INFO: renamed from: x1 */
    private float f17189x1;

    public C6066kp() {
        m24449x1((short) 16430);
    }

    /* JADX INFO: renamed from: dy */
    public final float m24559dy() {
        return this.f17189x1;
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
        return m24561k4((C6066kp) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ C14064he.m66708k4(m24563to())) * 397) ^ C14064he.m66708k4(m24559dy());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24560k4(float f) {
        this.f17188k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24562kk() {
        return m24433h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final float m24563to() {
        return this.f17188k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Sx: {2}, Sy: {3}", super.toString(), Boolean.valueOf(m24562kk()), Float.valueOf(m24563to()), Float.valueOf(m24559dy()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24564x1(float f) {
        this.f17189x1 = f;
    }

    public C6066kp(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24561k4(C6066kp c6066kp) {
        return m24438k4((C6045bz) c6066kp) && C14064he.m66718x1(m24563to(), c6066kp.m24563to()) && C14064he.m66718x1(m24559dy(), c6066kp.m24559dy());
    }
}

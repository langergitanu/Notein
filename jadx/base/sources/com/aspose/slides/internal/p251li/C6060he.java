package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.he */
/* JADX INFO: loaded from: classes4.dex */
public class C6060he extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private float f17171k4;

    /* JADX INFO: renamed from: x1 */
    private float f17172x1;

    public C6060he() {
        m24449x1((short) 16429);
    }

    /* JADX INFO: renamed from: dy */
    public final float m24512dy() {
        return this.f17172x1;
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
        return m24514k4((C6060he) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ C14064he.m66708k4(m24516to())) * 397) ^ C14064he.m66708k4(m24512dy());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24513k4(float f) {
        this.f17171k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24515kk() {
        return m24433h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final float m24516to() {
        return this.f17171k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Dx: {2}, Dy: {3}", super.toString(), Boolean.valueOf(m24515kk()), Float.valueOf(m24516to()), Float.valueOf(m24512dy()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24517x1(float f) {
        this.f17172x1 = f;
    }

    public C6060he(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24514k4(C6060he c6060he) {
        return m24438k4((C6045bz) c6060he) && C14064he.m66718x1(m24516to(), c6060he.m24516to()) && C14064he.m66718x1(m24512dy(), c6060he.m24512dy());
    }
}

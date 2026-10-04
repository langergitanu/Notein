package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6083ts extends AbstractC6081to {

    /* JADX INFO: renamed from: k4 */
    private float f17207k4;

    /* JADX INFO: renamed from: x1 */
    private float f17208x1;

    public C6083ts() {
        m24449x1((short) 16437);
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
        return m24637k4((C6083ts) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (C14064he.m66708k4(this.f17207k4) * 397) ^ C14064he.m66708k4(this.f17208x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24636k4(float f) {
        this.f17207k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final float m24638kk() {
        return this.f17207k4;
    }

    /* JADX INFO: renamed from: to */
    public final float m24639to() {
        return this.f17208x1;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Dx: {1}, Dy: {2}", super.toString(), Float.valueOf(this.f17207k4), Float.valueOf(this.f17208x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24640x1(float f) {
        this.f17208x1 = f;
    }

    public C6083ts(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24637k4(C6083ts c6083ts) {
        return C14064he.m66718x1(this.f17207k4, c6083ts.f17207k4) && C14064he.m66718x1(this.f17208x1, c6083ts.f17208x1);
    }
}

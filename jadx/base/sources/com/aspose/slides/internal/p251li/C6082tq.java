package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.tq */
/* JADX INFO: loaded from: classes4.dex */
public class C6082tq extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private float f17206k4;

    public C6082tq() {
        m24449x1((short) 16432);
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
        return m24633k4((C6082tq) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ C14064he.m66708k4(m24635to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24632k4(float f) {
        this.f17206k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final int m24634kk() {
        return m24442ne() & 255;
    }

    /* JADX INFO: renamed from: to */
    public final float m24635to() {
        return this.f17206k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PageUnit: {1}, PageScale: {2}", super.toString(), C14042ak.m66410k4(C10197ss.class, m24634kk()), Float.valueOf(m24635to()));
    }

    public C6082tq(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24633k4(C6082tq c6082tq) {
        return m24438k4((C6045bz) c6082tq) && C14064he.m66718x1(m24635to(), c6082tq.m24635to());
    }
}

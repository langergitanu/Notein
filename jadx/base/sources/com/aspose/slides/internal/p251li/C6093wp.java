package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C6093wp extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private float f17218k4;

    public C6093wp() {
        m24449x1((short) 16431);
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
        return m24674k4((C6093wp) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ C14064he.m66708k4(m24676to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24673k4(float f) {
        this.f17218k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24675kk() {
        return m24433h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final float m24676to() {
        return this.f17218k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Angle: {2}", super.toString(), Boolean.valueOf(m24675kk()), Float.valueOf(m24676to()));
    }

    public C6093wp(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24674k4(C6093wp c6093wp) {
        return m24438k4((C6045bz) c6093wp) && C14064he.m66718x1(m24676to(), c6093wp.m24676to());
    }
}

package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11039x6 extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private float f38369k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13369du f38370kk;

    /* JADX INFO: renamed from: x1 */
    private float f38371x1;

    public C11039x6() {
        m53208x1((short) 16401);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC13369du m53429c5() {
        return this.f38370kk;
    }

    /* JADX INFO: renamed from: dy */
    public final float m53430dy() {
        return this.f38371x1;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53433k4((C11039x6) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM66708k4 = ((C14064he.m66708k4(this.f38369k4) * 397) ^ C14064he.m66708k4(this.f38371x1)) * 397;
        AbstractC13369du abstractC13369du = this.f38370kk;
        return iM66708k4 ^ (abstractC13369du != null ? abstractC13369du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53431k4(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        this.f38369k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53434kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53435m9() {
        return this.f38369k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53436to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StartAngle: {1}, SweepAngle: {2}, RectData: {3}", super.toString(), Float.valueOf(this.f38369k4), Float.valueOf(this.f38371x1), this.f38370kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53437x1(float f) {
        if (f < -360.0f || f > 360.0f) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f38371x1 = f;
    }

    public C11039x6(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53432k4(AbstractC13369du abstractC13369du) {
        this.f38370kk = abstractC13369du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53433k4(C11039x6 c11039x6) {
        return C14064he.m66718x1(this.f38369k4, c11039x6.f38369k4) && C14064he.m66718x1(this.f38371x1, c11039x6.f38371x1) && C14067j2.m66728k4(this.f38370kk, c11039x6.f38370kk);
    }
}

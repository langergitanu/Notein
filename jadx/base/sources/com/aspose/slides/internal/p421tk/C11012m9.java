package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11012m9 extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13369du f38342k4;

    /* JADX INFO: renamed from: kk */
    private float f38343kk;

    /* JADX INFO: renamed from: x1 */
    private float f38344x1;

    public C11012m9() {
        m53208x1((short) 16402);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int av_() {
        return m53340kk() ? 16 : 24;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC13369du m53335c5() {
        return this.f38342k4;
    }

    /* JADX INFO: renamed from: dy */
    public final float m53336dy() {
        return this.f38343kk;
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
        return m53339k4((C11012m9) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    /* JADX INFO: renamed from: h4 */
    public int mo53197h4() {
        return !m53340kk() ? 36 : 28;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        AbstractC13369du abstractC13369du = this.f38342k4;
        return ((((abstractC13369du != null ? abstractC13369du.hashCode() : 0) * 397) ^ C14064he.m66708k4(this.f38344x1)) * 397) ^ C14064he.m66708k4(this.f38343kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53337k4(float f) {
        this.f38344x1 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53340kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53341m9() {
        return this.f38344x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53342to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectangleData: {1}, StartAngle: {2}, SweepAngle: {3}", super.toString(), this.f38342k4, Float.valueOf(this.f38344x1), Float.valueOf(this.f38343kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53343x1(float f) {
        this.f38343kk = f;
    }

    public C11012m9(C10988bz c10988bz) {
        super(c10988bz);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    /* JADX INFO: renamed from: k4 */
    public void mo53200k4(int i) {
        if (!m53340kk() && i == 24) {
            super.mo53207x1(i);
        } else {
            if (!m53340kk() || i != 16) {
                throw new InvalidDataException("Invalid value");
            }
            super.mo53207x1(i);
        }
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    /* JADX INFO: renamed from: x1 */
    public void mo53207x1(int i) {
        if (!m53340kk() && i == 36) {
            super.mo53207x1(i);
        } else {
            if (!m53340kk() || i != 28) {
                throw new InvalidDataException("Invalid value");
            }
            super.mo53207x1(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53338k4(AbstractC13369du abstractC13369du) {
        this.f38342k4 = abstractC13369du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53339k4(C11012m9 c11012m9) {
        return C14067j2.m66728k4(this.f38342k4, c11012m9.f38342k4) && C14064he.m66718x1(this.f38344x1, c11012m9.f38344x1) && C14064he.m66718x1(this.f38343kk, c11012m9.f38343kk);
    }
}

package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11031v4 extends AbstractC11011lr {

    /* JADX INFO: renamed from: k4 */
    private long f38363k4;

    /* JADX INFO: renamed from: x1 */
    private C13407to[] f38364x1;

    public C11031v4() {
        m53208x1((short) 16396);
    }

    /* JADX INFO: renamed from: dy */
    public final C13407to[] m53408dy() {
        return this.f38364x1;
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
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
        return m53411k4((C11031v4) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM53332fa = ((m53332fa() * 397) ^ ((int) this.f38363k4)) * 397;
        C13407to[] c13407toArr = this.f38364x1;
        return iM53332fa ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53409k4(long j) {
        if ((4294967295L & j) < 3) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f38363k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53412kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final long m53413m9() {
        return this.f38363k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53414to() {
        return m53198h4(13);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Long.valueOf(this.f38363k4), this.f38364x1);
    }

    public C11031v4(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53410k4(C13407to[] c13407toArr) {
        this.f38364x1 = c13407toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53411k4(C11031v4 c11031v4) {
        return m53332fa() == c11031v4.m53332fa() && this.f38363k4 == c11031v4.f38363k4 && C3022m9.m12723k4(this.f38364x1, c11031v4.f38364x1);
    }
}

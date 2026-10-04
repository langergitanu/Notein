package com.aspose.slides.internal.p421tk;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C11019rv extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private long f38351k4;

    public C11019rv() {
        m53208x1((short) 16405);
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
        return m53367k4((C11019rv) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (int) this.f38351k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53366k4(long j) {
        if ((4294967295L & j) > 63) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f38351k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53368kk() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: to */
    public final long m53369to() {
        return this.f38351k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PenId: {1}", super.toString(), Long.valueOf(this.f38351k4));
    }

    public C11019rv(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53367k4(C11019rv c11019rv) {
        return this.f38351k4 == c11019rv.f38351k4;
    }
}

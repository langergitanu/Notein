package com.aspose.slides.internal.p019ac;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1346kk extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private long f5846k4;

    /* JADX INFO: renamed from: x1 */
    private int[] f5847x1;

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
        return m7938k4((C1346kk) obj);
    }

    public int hashCode() {
        int i = ((int) this.f5846k4) * 397;
        int[] iArr = this.f5847x1;
        return i ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m7935k4() {
        return 134248036L;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m7939kk() {
        return this.f5847x1;
    }

    public String toString() {
        return C14113y2.m67402k4("Signature: {0}, NumAxes: {1}, Values: {2}", Long.valueOf(m7935k4()), Long.valueOf(m7940x1()), m7939kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m7940x1() {
        return this.f5846k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7936k4(long j) {
        if ((j & 4294967295L) != 134248036) {
            throw new ArgumentOutOfRangeException("value", "Signature must be set to 0x08007664.");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7941x1(long j) {
        this.f5846k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7937k4(int[] iArr) {
        this.f5847x1 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7938k4(C1346kk c1346kk) {
        return this.f5846k4 == c1346kk.f5846k4 && C3022m9.m12721k4(this.f5847x1, c1346kk.f5847x1);
    }
}

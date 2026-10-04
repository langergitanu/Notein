package com.aspose.slides.internal.p260ly;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6277kk extends AbstractC6280ne {

    /* JADX INFO: renamed from: k4 */
    private long f17830k4;

    /* JADX INFO: renamed from: x1 */
    private int[] f17831x1;

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
        return m25578k4((C6277kk) obj);
    }

    public int hashCode() {
        int i = ((int) this.f17830k4) * 397;
        int[] iArr = this.f17831x1;
        return i ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m25575k4() {
        return 134248036L;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m25579kk() {
        return this.f17831x1;
    }

    public String toString() {
        return C14113y2.m67402k4("Signature: {0}, NumAxes: {1}, Values: {2}", Long.valueOf(m25575k4()), Long.valueOf(m25580x1()), m25579kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25580x1() {
        return this.f17830k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25576k4(long j) {
        if ((j & 4294967295L) != 134248036) {
            throw new ArgumentOutOfRangeException("value", "Signature must be set to 0x08007664.");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25581x1(long j) {
        this.f17830k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25577k4(int[] iArr) {
        this.f17831x1 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25578k4(C6277kk c6277kk) {
        return this.f17830k4 == c6277kk.f17830k4 && C12530dy.m58332k4(this.f17831x1, c6277kk.f17831x1);
    }
}

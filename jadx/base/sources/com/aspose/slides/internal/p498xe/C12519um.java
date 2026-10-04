package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.um */
/* JADX INFO: loaded from: classes5.dex */
public class C12519um extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private long f41915k4;

    /* JADX INFO: renamed from: x1 */
    private long f41916x1;

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
        return m58234k4((C12519um) obj);
    }

    public int hashCode() {
        return (((int) this.f41915k4) * 397) ^ ((int) this.f41916x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m58232k4() {
        return this.f41915k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12023wl m58235kk() {
        return new C12023wl((int) this.f41915k4, (int) this.f41916x1);
    }

    public String toString() {
        return C14113y2.m67402k4("Cx: {0}, Cy: {1}", Long.valueOf(this.f41915k4), Long.valueOf(this.f41916x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m58236x1() {
        return this.f41916x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58233k4(long j) {
        this.f41915k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58237x1(long j) {
        this.f41916x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58234k4(C12519um c12519um) {
        return this.f41915k4 == c12519um.f41915k4 && this.f41916x1 == c12519um.f41916x1;
    }
}

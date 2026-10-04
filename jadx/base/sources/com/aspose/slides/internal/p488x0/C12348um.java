package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.um */
/* JADX INFO: loaded from: classes5.dex */
public class C12348um extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private long f41291k4;

    /* JADX INFO: renamed from: x1 */
    private long f41292x1;

    public C12348um() {
    }

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
        return m57818k4((C12348um) obj);
    }

    public int hashCode() {
        return (((int) this.f41291k4) * 397) ^ ((int) this.f41292x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57816k4() {
        return this.f41291k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12023wl m57819kk() {
        return new C12023wl((int) this.f41291k4, (int) this.f41292x1);
    }

    public String toString() {
        return C14113y2.m67402k4("Cx: {0}, Cy: {1}", Long.valueOf(this.f41291k4), Long.valueOf(this.f41292x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m57820x1() {
        return this.f41292x1;
    }

    public C12348um(long j, long j2) {
        this.f41291k4 = j;
        this.f41292x1 = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57817k4(long j) {
        this.f41291k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57821x1(long j) {
        this.f41292x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57818k4(C12348um c12348um) {
        return this.f41291k4 == c12348um.f41291k4 && this.f41292x1 == c12348um.f41292x1;
    }
}

package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12346to extends AbstractC12340kk {

    /* JADX INFO: renamed from: k4 */
    private int f41285k4;

    /* JADX INFO: renamed from: x1 */
    private int f41286x1;

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
        return m57803k4((C12346to) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m57802h4() {
        return this.f41286x1;
    }

    public int hashCode() {
        return (C14081nv.m67061k4(this.f41285k4) * 397) ^ C14081nv.m67061k4(this.f41286x1);
    }

    @Override // com.aspose.slides.internal.p488x0.AbstractC12340kk
    /* JADX INFO: renamed from: k4 */
    public void mo57657k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m57756k4());
        c3149x1.m13446k4(this.f41285k4);
        c3149x1.m13446k4(this.f41286x1);
        c3149x1.m13446k4(m57760x1());
        c3149x1.m13446k4(m57759kk() & 65535);
    }

    /* JADX INFO: renamed from: kk */
    public final void m57804kk(int i) {
        this.f41285k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final int m57805to() {
        return this.f41285k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Width: {1}, Height: {2}", super.toString(), Integer.valueOf(this.f41285k4), Integer.valueOf(this.f41286x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57803k4(C12346to c12346to) {
        return this.f41285k4 == c12346to.f41285k4 && this.f41286x1 == c12346to.f41286x1 && m57760x1() == c12346to.m57760x1() && m57759kk() == c12346to.m57759kk() && m57756k4() == c12346to.m57756k4();
    }

    /* JADX INFO: renamed from: to */
    public final void m57806to(int i) {
        this.f41286x1 = i;
    }
}

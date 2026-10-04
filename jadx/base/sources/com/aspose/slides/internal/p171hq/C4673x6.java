package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C4673x6 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private int f13052k4;

    /* JADX INFO: renamed from: x1 */
    private int f13053x1;

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
        return m19466k4((C4673x6) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f13052k4 * 397) ^ this.f13053x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19464k4() {
        return this.f13052k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12017to m19467kk() {
        return new C12017to(m19464k4(), m19468x1());
    }

    public String toString() {
        return C14113y2.m67402k4("First: {0}, Length: {1}", Integer.valueOf(this.f13052k4), Integer.valueOf(this.f13053x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19468x1() {
        return this.f13053x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19465k4(int i) {
        this.f13052k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19469x1(int i) {
        this.f13053x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19466k4(C4673x6 c4673x6) {
        return this.f13052k4 == c4673x6.f13052k4 && this.f13053x1 == c4673x6.f13053x1;
    }
}

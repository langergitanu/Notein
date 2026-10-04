package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13423x6 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private int f44905k4;

    /* JADX INFO: renamed from: x1 */
    private int f44906x1;

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
        return m62449k4((C13423x6) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f44905k4 * 397) ^ this.f44906x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62447k4() {
        return this.f44905k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12017to m62450kk() {
        return new C12017to(m62447k4(), m62451x1());
    }

    public String toString() {
        return C14113y2.m67402k4("First: {0}, Length: {1}", Integer.valueOf(this.f44905k4), Integer.valueOf(this.f44906x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62451x1() {
        return this.f44906x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62448k4(int i) {
        this.f44905k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62452x1(int i) {
        this.f44906x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62449k4(C13423x6 c13423x6) {
        return this.f44905k4 == c13423x6.f44905k4 && this.f44906x1 == c13423x6.f44906x1;
    }
}

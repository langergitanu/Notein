package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.y2 */
/* JADX INFO: loaded from: classes5.dex */
public class C13426y2 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13386jw f44919k4;

    /* JADX INFO: renamed from: kk */
    private int f44920kk;

    /* JADX INFO: renamed from: x1 */
    private C13386jw f44921x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.z4.y2$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Integer.class) { // from class: com.aspose.slides.internal.z4.y2.k4.1
                {
                    addConstant("And", 0L);
                    addConstant("Or", 1L);
                    addConstant("Xor", 2L);
                    addConstant("Exclude", 3L);
                    addConstant("Complement", 4L);
                }
            });
        }

        private k4() {
        }
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
        return m62483k4((C13426y2) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13386jw c13386jw = this.f44919k4;
        int iMo62023h4 = c13386jw != null ? c13386jw.mo62023h4() : 0;
        C13386jw c13386jw2 = this.f44921x1;
        return c13386jw2 != null ? c13386jw2.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        C13386jw c13386jw = this.f44919k4;
        int iHashCode = (c13386jw != null ? c13386jw.hashCode() : 0) * 397;
        C13386jw c13386jw2 = this.f44921x1;
        return ((iHashCode ^ (c13386jw2 != null ? c13386jw2.hashCode() : 0)) * 397) ^ m62480k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62480k4() {
        return this.f44920kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C13386jw m62484kk() {
        return this.f44921x1;
    }

    public String toString() {
        return C14113y2.m67402k4("[Left: {0}, Right: {1}, Operation: {2}]", this.f44919k4, this.f44921x1, C14042ak.m66410k4(k4.class, m62480k4()));
    }

    /* JADX INFO: renamed from: x1 */
    public final C13386jw m62485x1() {
        return this.f44919k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62481k4(int i) {
        this.f44920kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62486x1(C13386jw c13386jw) {
        this.f44921x1 = c13386jw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62482k4(C13386jw c13386jw) {
        this.f44919k4 = c13386jw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62483k4(C13426y2 c13426y2) {
        return C14067j2.m66728k4(this.f44919k4, c13426y2.f44919k4) && C14067j2.m66728k4(this.f44921x1, c13426y2.f44921x1) && m62480k4() == c13426y2.m62480k4();
    }
}

package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.y2 */
/* JADX INFO: loaded from: classes.dex */
public class C4676y2 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4636jw f13066k4;

    /* JADX INFO: renamed from: kk */
    private int f13067kk;

    /* JADX INFO: renamed from: x1 */
    private C4636jw f13068x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.hq.y2$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Integer.class) { // from class: com.aspose.slides.internal.hq.y2.k4.1
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
        return m19501k4((C4676y2) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4636jw c4636jw = this.f13066k4;
        int iMo19017h4 = c4636jw != null ? c4636jw.mo19017h4() : 0;
        C4636jw c4636jw2 = this.f13068x1;
        return c4636jw2 != null ? c4636jw2.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        C4636jw c4636jw = this.f13066k4;
        int iHashCode = (c4636jw != null ? c4636jw.hashCode() : 0) * 397;
        C4636jw c4636jw2 = this.f13068x1;
        return ((iHashCode ^ (c4636jw2 != null ? c4636jw2.hashCode() : 0)) * 397) ^ m19498k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19498k4() {
        return this.f13067kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C4636jw m19502kk() {
        return this.f13068x1;
    }

    public String toString() {
        return C14113y2.m67402k4("[Left: {0}, Right: {1}, Operation: {2}]", this.f13066k4, this.f13068x1, C14042ak.m66410k4(k4.class, m19498k4()));
    }

    /* JADX INFO: renamed from: x1 */
    public final C4636jw m19503x1() {
        return this.f13066k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19499k4(int i) {
        this.f13067kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19504x1(C4636jw c4636jw) {
        this.f13068x1 = c4636jw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19500k4(C4636jw c4636jw) {
        this.f13066k4 = c4636jw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19501k4(C4676y2 c4676y2) {
        return C14067j2.m66728k4(this.f13066k4, c4676y2.f13066k4) && C14067j2.m66728k4(this.f13068x1, c4676y2.f13068x1) && m19498k4() == c4676y2.m19498k4();
    }
}

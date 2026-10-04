package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ak */
/* JADX INFO: loaded from: classes5.dex */
public class C13358ak extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private int f44716k4;

    /* JADX INFO: renamed from: x1 */
    private C13425xw f44717x1;

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
        return m62031k4((C13358ak) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        if (m62028k4() != null) {
            return m62028k4().mo62023h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        int i = this.f44716k4 * 397;
        C13425xw c13425xw = this.f44717x1;
        return i ^ (c13425xw != null ? c13425xw.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13425xw m62028k4() {
        return this.f44717x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62029k4(int i) {
        this.f44716k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62030k4(C13425xw c13425xw) {
        this.f44717x1 = c13425xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62031k4(C13358ak c13358ak) {
        return this.f44716k4 == c13358ak.f44716k4 && C14067j2.m66728k4(this.f44717x1, c13358ak.f44717x1);
    }
}

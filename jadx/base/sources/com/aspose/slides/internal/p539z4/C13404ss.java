package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ss */
/* JADX INFO: loaded from: classes5.dex */
public class C13404ss extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private int f44853k4;

    /* JADX INFO: renamed from: x1 */
    private C13425xw f44854x1;

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
        return m62333k4((C13404ss) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        if (m62334x1() != null) {
            return m62334x1().mo62023h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        return (m62330k4() * 397) ^ (m62334x1() != null ? m62334x1().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62330k4() {
        return this.f44853k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13425xw m62334x1() {
        return this.f44854x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62331k4(int i) {
        this.f44853k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62332k4(C13425xw c13425xw) {
        this.f44854x1 = c13425xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62333k4(C13404ss c13404ss) {
        return m62330k4() == c13404ss.m62330k4() && C14067j2.m66728k4(m62334x1(), c13404ss.m62334x1());
    }
}

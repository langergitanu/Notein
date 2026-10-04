package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C13429yj extends C13374fa {

    /* JADX INFO: renamed from: k4 */
    private int f44926k4;

    /* JADX INFO: renamed from: x1 */
    private C13431zj[] f44927x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13429yj.class) && m62497k4((C13429yj) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13374fa, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (this.f44926k4 * 8) + 4;
    }

    public int hashCode() {
        int i = this.f44926k4 * 397;
        C13431zj[] c13431zjArr = this.f44927x1;
        return i ^ (c13431zjArr != null ? AbstractC14092to.m67208k4((Object) c13431zjArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62498k4() {
        return this.f44926k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13431zj[] m62501x1() {
        return this.f44927x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62499k4(int i) {
        this.f44926k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62500k4(C13431zj[] c13431zjArr) {
        this.f44927x1 = c13431zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62497k4(C13429yj c13429yj) {
        return this.f44926k4 == c13429yj.f44926k4 && C3022m9.m12723k4(this.f44927x1, c13429yj.f44927x1);
    }
}

package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.yj */
/* JADX INFO: loaded from: classes.dex */
public final class C4679yj extends C4624fa {

    /* JADX INFO: renamed from: k4 */
    private int f13073k4;

    /* JADX INFO: renamed from: x1 */
    private C4681zj[] f13074x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4679yj.class) && m19515k4((C4679yj) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4624fa, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (this.f13073k4 * 8) + 4;
    }

    public int hashCode() {
        int i = this.f13073k4 * 397;
        C4681zj[] c4681zjArr = this.f13074x1;
        return i ^ (c4681zjArr != null ? AbstractC14092to.m67208k4((Object) c4681zjArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19516k4() {
        return this.f13073k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4681zj[] m19519x1() {
        return this.f13074x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19517k4(int i) {
        this.f13073k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19518k4(C4681zj[] c4681zjArr) {
        this.f13074x1 = c4681zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19515k4(C4679yj c4679yj) {
        return this.f13073k4 == c4679yj.f13073k4 && C12530dy.m58334k4(this.f13074x1, c4679yj.f13074x1);
    }
}

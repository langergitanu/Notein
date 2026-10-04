package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.yj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10981yj extends AbstractC10973uz {

    /* JADX INFO: renamed from: du */
    private C10951c5 f38269du;

    /* JADX INFO: renamed from: h4 */
    private boolean f38270h4;

    /* JADX INFO: renamed from: k4 */
    private String f38271k4;

    /* JADX INFO: renamed from: kk */
    private boolean f38272kk;

    /* JADX INFO: renamed from: to */
    private String f38273to;

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f38274x1;

    public AbstractC10981yj() {
        this.f38274x1 = C12025x6.f40591k4.Clone();
        this.f38272kk = true;
        this.f38273to = C14113y2.f47374k4;
        this.f38269du = null;
        this.f38270h4 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10951c5 m53140c5() {
        return this.f38269du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m53141dy() {
        return this.f38272kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12025x6 m53142h4() {
        return this.f38274x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53143k4(C10951c5 c10951c5) {
        this.f38269du = c10951c5;
        this.f38270h4 = c10951c5 != null;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m53145m9() {
        return this.f38271k4;
    }

    /* JADX INFO: renamed from: to */
    public abstract C12007ix mo52867to();

    /* JADX INFO: renamed from: x1 */
    public final void m53146x1(String str) {
        this.f38273to = str;
    }

    public AbstractC10981yj(C12025x6 c12025x6, String str) {
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        this.f38274x1 = c12025x6Clone;
        this.f38272kk = true;
        this.f38273to = C14113y2.f47374k4;
        this.f38269du = null;
        this.f38270h4 = false;
        c12025x6.CloneTo(c12025x6Clone);
        this.f38271k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53144k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38274x1);
    }
}

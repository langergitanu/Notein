package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.bz */
/* JADX INFO: loaded from: classes.dex */
public class C4613bz extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int f12871k4;

    /* JADX INFO: renamed from: kk */
    private int f12872kk;

    /* JADX INFO: renamed from: x1 */
    private int f12873x1;

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
        return m19045k4((C4613bz) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 12;
    }

    public int hashCode() {
        return (((m19043k4() * 397) ^ m19048x1()) * 397) ^ m19046kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19043k4() {
        return this.f12871k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m19046kk() {
        return this.f12872kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19048x1() {
        return this.f12873x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19044k4(int i) {
        this.f12871k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19047kk(int i) {
        this.f12872kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19049x1(int i) {
        this.f12873x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19045k4(C4613bz c4613bz) {
        return m19043k4() == c4613bz.m19043k4() && m19048x1() == c4613bz.m19048x1() && m19046kk() == c4613bz.m19046kk();
    }
}

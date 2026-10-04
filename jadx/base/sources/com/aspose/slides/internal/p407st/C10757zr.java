package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zr */
/* JADX INFO: loaded from: classes4.dex */
public class C10757zr {

    /* JADX INFO: renamed from: k4 */
    private long f37587k4;

    /* JADX INFO: renamed from: x1 */
    private C10597pu f37588x1 = new C10597pu();

    /* JADX INFO: renamed from: k4 */
    public final long m52173k4() {
        return this.f37587k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m52179kk() {
        return this.f37588x1.m50797ne() + 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10597pu m52180x1() {
        return this.f37588x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52174k4(long j) {
        this.f37587k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52175k4(C3134k4 c3134k4, int i) {
        this.f37587k4 = c3134k4.m13384uz();
        C10597pu c10597pu = new C10597pu();
        this.f37588x1 = c10597pu;
        long j = i;
        if ((this.f37587k4 & 4294967295L) <= j) {
            c10597pu.m50791k4(c3134k4);
        } else {
            this.f37587k4 = j & 4294967295L;
            c3134k4.m13371ck().setPosition(c3134k4.m13371ck().getPosition() - 4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52176k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37587k4 & 4294967295L);
        this.f37588x1.m50792k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52177k4(C10597pu c10597pu) {
        this.f37588x1 = c10597pu;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52178k4(C10757zr c10757zr) {
        return this.f37588x1.m50796kk(c10757zr.f37588x1);
    }
}

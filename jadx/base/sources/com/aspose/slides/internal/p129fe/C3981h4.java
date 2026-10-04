package com.aspose.slides.internal.p129fe;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3981h4 implements IDisposable {

    /* JADX INFO: renamed from: du */
    private C14112xw f10805du;

    /* JADX INFO: renamed from: k4 */
    private C3978du f10806k4;

    /* JADX INFO: renamed from: kk */
    private int f10807kk;

    /* JADX INFO: renamed from: to */
    private int f10808to;

    /* JADX INFO: renamed from: x1 */
    private int f10809x1;

    private C3981h4() {
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m15692k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public C3978du m15693k4() {
        return this.f10806k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m15694kk() {
        return this.f10809x1;
    }

    /* JADX INFO: renamed from: to */
    public int m15695to() {
        return this.f10807kk;
    }

    @Deprecated
    /* JADX INFO: renamed from: x1 */
    public int m15696x1() {
        return this.f10808to;
    }

    @Deprecated
    public C3981h4(C3978du c3978du, int i) {
        this.f10806k4 = c3978du;
        this.f10809x1 = 1;
        this.f10807kk = 1;
        this.f10808to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15692k4(boolean z) {
    }

    public C3981h4(C3978du c3978du, long j) {
        this.f10806k4 = c3978du;
        this.f10809x1 = 1;
        this.f10807kk = 4;
        C14112xw c14112xwM15613k4 = C3914k4.m15613k4(4);
        this.f10805du = c14112xwM15613k4;
        int i = (int) j;
        this.f10808to = i;
        C3914k4.m15624x1(c14112xwM15613k4, i);
    }
}

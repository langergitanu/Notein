package com.aspose.slides.internal.p138fu;

import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4134x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final C12009k4 f11314k4;

    /* JADX INFO: renamed from: x1 */
    private C12009k4 f11315x1;

    public C4134x1(C12009k4 c12009k4, C12009k4 c12009k42) {
        this.f11314k4 = c12009k4;
        this.f11315x1 = c12009k42;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (C14067j2.m66729x1(this.f11314k4, this.f11315x1)) {
            return;
        }
        this.f11315x1.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m16582k4() {
        return this.f11315x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16583k4(C12009k4 c12009k4) {
        this.f11315x1.dispose();
        this.f11315x1 = c12009k4;
    }
}

package com.aspose.slides.internal.p474wg;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.w6 */
/* JADX INFO: loaded from: classes5.dex */
final class C11981w6 extends AbstractC11963qw {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ AbstractC11963qw f40455k4;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ ReentrantLock f40456x1;

    public C11981w6(AbstractC11963qw abstractC11963qw, ReentrantLock reentrantLock) {
        this.f40455k4 = abstractC11963qw;
        this.f40456x1 = reentrantLock;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11963qw
    /* JADX INFO: renamed from: k4 */
    public boolean mo55877k4(C11971tq c11971tq) {
        boolean zMo55877k4 = this.f40455k4.mo55877k4(c11971tq);
        if (zMo55877k4) {
            this.f40456x1.unlock();
        }
        return zMo55877k4;
    }
}

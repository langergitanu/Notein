package com.aspose.slides.internal.p474wg;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.os */
/* JADX INFO: loaded from: classes5.dex */
final class C11960os extends AbstractC11979vh {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ ReentrantLock f40333k4;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ AbstractC11979vh f40334x1;

    public C11960os(ReentrantLock reentrantLock, AbstractC11979vh abstractC11979vh) {
        this.f40333k4 = reentrantLock;
        this.f40334x1 = abstractC11979vh;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11979vh
    /* JADX INFO: renamed from: k4 */
    public void mo55973k4(C11971tq c11971tq) {
        if (c11971tq.m56120dy()) {
            if (c11971tq.m56125m9()) {
                this.f40333k4.unlock();
            }
            this.f40334x1.mo55973k4(c11971tq);
            return;
        }
        try {
            if (!c11971tq.m56125m9()) {
                this.f40333k4.lock();
            }
            this.f40334x1.mo55973k4(c11971tq);
            this.f40333k4.unlock();
        } catch (Throwable th) {
            this.f40333k4.unlock();
            throw th;
        }
    }
}

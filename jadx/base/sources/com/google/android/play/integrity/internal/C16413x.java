package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.x */
/* JADX INFO: loaded from: classes7.dex */
final class C16413x extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C16365ae f51585a;

    public C16413x(C16365ae c16365ae) {
        this.f51585a = c16365ae;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        synchronized (this.f51585a.f51545g) {
            try {
                if (this.f51585a.f51551m.get() > 0 && this.f51585a.f51551m.decrementAndGet() > 0) {
                    this.f51585a.f51541c.m75061d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C16365ae c16365ae = this.f51585a;
                if (c16365ae.f51553o != null) {
                    c16365ae.f51541c.m75061d("Unbind from service.", new Object[0]);
                    C16365ae c16365ae2 = this.f51585a;
                    c16365ae2.f51540b.unbindService(c16365ae2.f51552n);
                    this.f51585a.f51546h = false;
                    this.f51585a.f51553o = null;
                    this.f51585a.f51552n = null;
                }
                this.f51585a.m75009x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

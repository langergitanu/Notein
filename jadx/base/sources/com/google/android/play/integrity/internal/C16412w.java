package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.w */
/* JADX INFO: loaded from: classes7.dex */
final class C16412w extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f51582a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractRunnableC16409t f51583b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C16365ae f51584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16412w(C16365ae c16365ae, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC16409t abstractRunnableC16409t) {
        super(taskCompletionSource);
        this.f51582a = taskCompletionSource2;
        this.f51583b = abstractRunnableC16409t;
        this.f51584c = c16365ae;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        synchronized (this.f51584c.f51545g) {
            try {
                C16365ae.m75003o(this.f51584c, this.f51582a);
                if (this.f51584c.f51551m.getAndIncrement() > 0) {
                    this.f51584c.f51541c.m75061d("Already connected to the service.", new Object[0]);
                }
                C16365ae.m75005q(this.f51584c, this.f51583b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

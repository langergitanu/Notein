package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.firebase.firestore.util.AsyncQueue;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67582OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67583OooOo0o;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f67583OooOo0o = i;
        this.f67582OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67583OooOo0o) {
            case 0:
                ((WorkInitializer) this.f67582OooOo).lambda$ensureContextsScheduled$1();
                break;
            default:
                ((AsyncQueue.DelayedTask) this.f67582OooOo).handleDelayElapsed();
                break;
        }
    }
}

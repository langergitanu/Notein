package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooO implements SynchronizationGuard.CriticalSection, Continuation {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67557OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67558OooOo0o;

    public /* synthetic */ OooO(Object obj, Object obj2) {
        this.f67558OooOo0o = obj;
        this.f67557OooOo = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f67558OooOo0o).lambda$logAndUpdateState$3((TransportContext) this.f67557OooOo);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigRealtimeHttpClient) this.f67558OooOo0o).lambda$beginRealtimeHttpStream$1((Task) this.f67557OooOo, task);
    }
}

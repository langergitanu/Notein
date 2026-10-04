package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.network.embedded.AbstractC18338r7;
import com.huawei.hms.network.embedded.InterfaceC18159e7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOO0 implements Continuation, AbstractC18338r7.b {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68371OooOo0o;

    public /* synthetic */ OooOO0(Object obj) {
        this.f68371OooOo0o = obj;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7.b
    public AbstractC18338r7 create(InterfaceC18159e7 interfaceC18159e7) {
        return AbstractC18338r7.m79457a((AbstractC18338r7) this.f68371OooOo0o, interfaceC18159e7);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Datastore) this.f68371OooOo0o).lambda$commit$0(task);
    }
}

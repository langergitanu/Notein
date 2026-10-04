package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import oO00o00o.InterfaceC32331OooO0OO;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22629OooOoO implements Continuation, InterfaceC32331OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68181OooOo0o;

    public /* synthetic */ C22629OooOoO(Object obj) {
        this.f68181OooOo0o = obj;
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return DisplayCallbacksImpl.lambda$maybeToTask$10((TaskCompletionSource) this.f68181OooOo0o, (Throwable) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Transaction) this.f68181OooOo0o).lambda$lookup$0(task);
    }
}

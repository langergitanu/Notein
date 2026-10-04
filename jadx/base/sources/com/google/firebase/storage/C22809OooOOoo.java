package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.storage.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22809OooOOoo implements OnFailureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f68726OooO00o;

    public /* synthetic */ C22809OooOOoo(TaskCompletionSource taskCompletionSource) {
        this.f68726OooO00o = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f68726OooO00o.setException(exc);
    }
}

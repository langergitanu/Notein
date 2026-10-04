package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.storage.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22807OooOOo implements OnSuccessListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f68722OooO00o;

    public /* synthetic */ C22807OooOOo(TaskCompletionSource taskCompletionSource) {
        this.f68722OooO00o = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f68722OooO00o.setResult(obj);
    }
}

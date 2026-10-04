package com.google.firebase.appcheck.debug.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67883OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67884OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f67885OooOoO0;

    public /* synthetic */ OooO0OO(int i, Object obj, Object obj2) {
        this.f67884OooOo0o = i;
        this.f67883OooOo = obj;
        this.f67885OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67884OooOo0o) {
            case 0:
                DebugAppCheckProvider.lambda$determineDebugSecret$0((FirebaseApp) this.f67883OooOo, (TaskCompletionSource) this.f67885OooOoO0);
                break;
            default:
                ((FirestoreClient) this.f67883OooOo).lambda$new$1((User) this.f67885OooOoO0);
                break;
        }
    }
}

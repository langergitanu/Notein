package com.google.firebase.appcheck.internal;

import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.firestore.core.FirestoreClient;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67887OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f67888OooOoO0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f67887OooOo0o = i;
        this.f67886OooOo = obj;
        this.f67888OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67887OooOo0o) {
            case 0:
                ((DefaultFirebaseAppCheck) this.f67886OooOo).lambda$updateStoredToken$6((AppCheckToken) this.f67888OooOoO0);
                break;
            default:
                ((FirestoreClient) this.f67886OooOo).lambda$configureFieldIndexes$21((List) this.f67888OooOoO0);
                break;
        }
    }
}

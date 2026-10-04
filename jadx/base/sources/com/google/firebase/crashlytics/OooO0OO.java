package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }
}

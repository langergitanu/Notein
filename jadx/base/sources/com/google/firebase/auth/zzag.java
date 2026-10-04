package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzag implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ ActionCodeSettings zza;
    private final /* synthetic */ FirebaseUser zzb;

    public zzag(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.zza = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.zzb = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        return FirebaseAuth.getInstance(this.zzb.zza()).zza(this.zza, (String) Preconditions.checkNotNull(task.getResult().getToken()));
    }
}

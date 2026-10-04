package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzai implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseUser zzc;

    public zzai(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.zzc = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        return FirebaseAuth.getInstance(this.zzc.zza()).zza((String) Preconditions.checkNotNull(task.getResult().getToken()), this.zza, this.zzb);
    }
}

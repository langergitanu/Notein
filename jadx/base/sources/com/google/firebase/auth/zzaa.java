package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzaa implements Continuation<RecaptchaTasksClient, Task<Void>> {
    public zzaa(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new FirebaseAuthException(CloudSyncError.CODE_INTERNAL, com.google.android.gms.internal.p624firebaseauthapi.zzac.zzb(exception != null ? exception.getMessage() : "")));
    }
}

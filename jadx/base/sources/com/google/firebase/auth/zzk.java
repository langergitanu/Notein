package com.google.firebase.auth;

import android.util.Log;
import com.aspose.slides.internal.p407st.OooO00o;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzk implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzk(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            OooO00o.OooO0O0("Error while validating application identity: ", exception != null ? exception.getMessage() : "", "FirebaseAuth");
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.zzc.zza(this.zza, task.getResult());
    }
}

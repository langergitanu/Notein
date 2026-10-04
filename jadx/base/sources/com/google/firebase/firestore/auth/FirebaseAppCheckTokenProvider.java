package com.google.firebase.firestore.auth;

import OooO0o.C20424OooO0Oo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseAppCheckTokenProvider extends CredentialsProvider<String> {
    private static final String LOG_TAG = "FirebaseAppCheckTokenProvider";
    private Listener<String> changeListener;
    private boolean forceRefresh;
    private InteropAppCheckTokenProvider interopAppCheckTokenProvider;
    private final AppCheckTokenListener tokenListener = new AppCheckTokenListener() { // from class: com.google.firebase.firestore.auth.OooO00o
        @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
        public final void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
            this.f68120OooO00o.lambda$new$0(appCheckTokenResult);
        }
    };

    public FirebaseAppCheckTokenProvider(Deferred<InteropAppCheckTokenProvider> deferred) {
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.firestore.auth.OooO0O0
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                this.f68121OooOo0o.lambda$new$1(provider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$2(Task task) throws Exception {
        return task.isSuccessful() ? Tasks.forResult(((AppCheckTokenResult) task.getResult()).getToken()) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Provider provider) {
        synchronized (this) {
            try {
                InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
                this.interopAppCheckTokenProvider = interopAppCheckTokenProvider;
                if (interopAppCheckTokenProvider != null) {
                    interopAppCheckTokenProvider.addAppCheckTokenListener(this.tokenListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTokenChanged, reason: merged with bridge method [inline-methods] */
    public synchronized void lambda$new$0(AppCheckTokenResult appCheckTokenResult) {
        try {
            if (appCheckTokenResult.getError() != null) {
                Logger.warn(LOG_TAG, "Error getting App Check token; using placeholder token instead. Error: " + appCheckTokenResult.getError(), new Object[0]);
            }
            Listener<String> listener = this.changeListener;
            if (listener != null) {
                listener.onValue(appCheckTokenResult.getToken());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized Task<String> getToken() {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.interopAppCheckTokenProvider;
        if (interopAppCheckTokenProvider == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("AppCheck is not available"));
        }
        Task<AppCheckTokenResult> token = interopAppCheckTokenProvider.getToken(this.forceRefresh);
        this.forceRefresh = false;
        return token.continueWithTask(Executors.DIRECT_EXECUTOR, new C20424OooO0Oo());
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void invalidateToken() {
        this.forceRefresh = true;
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void removeChangeListener() {
        this.changeListener = null;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.interopAppCheckTokenProvider;
        if (interopAppCheckTokenProvider != null) {
            interopAppCheckTokenProvider.removeAppCheckTokenListener(this.tokenListener);
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void setChangeListener(Listener<String> listener) {
        this.changeListener = listener;
    }
}

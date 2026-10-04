package com.google.firebase.firestore.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseAuthCredentialsProvider extends CredentialsProvider<User> {
    private static final String LOG_TAG = "FirebaseAuthCredentialsProvider";
    private Listener<User> changeListener;
    private boolean forceRefresh;
    private final IdTokenListener idTokenListener = new IdTokenListener() { // from class: com.google.firebase.firestore.auth.OooO0OO
        @Override // com.google.firebase.auth.internal.IdTokenListener
        public final void onIdTokenChanged(InternalTokenResult internalTokenResult) {
            this.f68122OooO00o.lambda$new$0(internalTokenResult);
        }
    };
    private InternalAuthProvider internalAuthProvider;
    private int tokenCounter;

    public FirebaseAuthCredentialsProvider(Deferred<InternalAuthProvider> deferred) {
        deferred.whenAvailable(new C22615OooO0Oo(this));
    }

    private synchronized User getUser() {
        String uid;
        try {
            InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
            uid = internalAuthProvider == null ? null : internalAuthProvider.getUid();
        } catch (Throwable th) {
            throw th;
        }
        return uid != null ? new User(uid) : User.UNAUTHENTICATED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$2(int i, Task task) throws Exception {
        synchronized (this) {
            try {
                if (i != this.tokenCounter) {
                    Logger.debug(LOG_TAG, "getToken aborted due to token change", new Object[0]);
                    return getToken();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((GetTokenResult) task.getResult()).getToken());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(InternalTokenResult internalTokenResult) {
        onIdTokenChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Provider provider) {
        synchronized (this) {
            this.internalAuthProvider = (InternalAuthProvider) provider.get();
            onIdTokenChanged();
            this.internalAuthProvider.addIdTokenListener(this.idTokenListener);
        }
    }

    private synchronized void onIdTokenChanged() {
        this.tokenCounter++;
        Listener<User> listener = this.changeListener;
        if (listener != null) {
            listener.onValue(getUser());
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized Task<String> getToken() {
        InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
        if (internalAuthProvider == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("auth is not available"));
        }
        Task<GetTokenResult> accessToken = internalAuthProvider.getAccessToken(this.forceRefresh);
        this.forceRefresh = false;
        final int i = this.tokenCounter;
        return accessToken.continueWithTask(Executors.DIRECT_EXECUTOR, new Continuation() { // from class: com.google.firebase.firestore.auth.OooO0o0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f68125OooOo0o.lambda$getToken$2(i, task);
            }
        });
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void invalidateToken() {
        this.forceRefresh = true;
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void removeChangeListener() {
        this.changeListener = null;
        InternalAuthProvider internalAuthProvider = this.internalAuthProvider;
        if (internalAuthProvider != null) {
            internalAuthProvider.removeIdTokenListener(this.idTokenListener);
        }
    }

    @Override // com.google.firebase.firestore.auth.CredentialsProvider
    public synchronized void setChangeListener(Listener<User> listener) {
        this.changeListener = listener;
        listener.onValue(getUser());
    }
}

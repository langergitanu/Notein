package com.google.firebase.functions;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0013H\u0002J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m80612d2 = {"Lcom/google/firebase/functions/FirebaseContextProvider;", "Lcom/google/firebase/functions/ContextProvider;", "tokenProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "instanceId", "Lcom/google/firebase/iid/internal/FirebaseInstanceIdInternal;", "appCheckDeferred", "Lcom/google/firebase/inject/Deferred;", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Lcom/google/firebase/inject/Provider;Lcom/google/firebase/inject/Provider;Lcom/google/firebase/inject/Deferred;Ljava/util/concurrent/Executor;)V", "TAG", "", "appCheckRef", "Ljava/util/concurrent/atomic/AtomicReference;", "getContext", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableContext;", "getLimitedUseAppCheckToken", "", "getAuthToken", "getAppCheckToken", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseContextProvider implements ContextProvider {
    private final String TAG;
    private final AtomicReference<InteropAppCheckTokenProvider> appCheckRef;
    private final Executor executor;
    private final Provider<FirebaseInstanceIdInternal> instanceId;
    private final Provider<InternalAuthProvider> tokenProvider;

    public FirebaseContextProvider(Provider<InternalAuthProvider> tokenProvider, Provider<FirebaseInstanceIdInternal> instanceId, Deferred<InteropAppCheckTokenProvider> appCheckDeferred, @Lightweight Executor executor) {
        OooOOO0.OooO0oO(tokenProvider, "tokenProvider");
        OooOOO0.OooO0oO(instanceId, "instanceId");
        OooOOO0.OooO0oO(appCheckDeferred, "appCheckDeferred");
        OooOOO0.OooO0oO(executor, "executor");
        this.tokenProvider = tokenProvider;
        this.instanceId = instanceId;
        this.executor = executor;
        this.TAG = "FirebaseContextProvider";
        this.appCheckRef = new AtomicReference<>();
        appCheckDeferred.whenAvailable(new OooO00o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FirebaseContextProvider firebaseContextProvider, Provider p) {
        OooOOO0.OooO0oO(p, "p");
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) p.get();
        firebaseContextProvider.appCheckRef.set(interopAppCheckTokenProvider);
        interopAppCheckTokenProvider.addAppCheckTokenListener(new OooO0O0());
    }

    private final Task<String> getAppCheckToken(boolean getLimitedUseAppCheckToken) {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.appCheckRef.get();
        if (interopAppCheckTokenProvider == null) {
            Task<String> taskForResult = Tasks.forResult(null);
            OooOOO0.OooO0o(taskForResult, "forResult(...)");
            return taskForResult;
        }
        Task<AppCheckTokenResult> limitedUseToken = getLimitedUseAppCheckToken ? interopAppCheckTokenProvider.getLimitedUseToken() : interopAppCheckTokenProvider.getToken(false);
        OooOOO0.OooO0Oo(limitedUseToken);
        Task taskOnSuccessTask = limitedUseToken.onSuccessTask(this.executor, new androidx.core.view.inputmethod.OooO00o(this));
        OooOOO0.OooO0o(taskOnSuccessTask, "onSuccessTask(...)");
        return taskOnSuccessTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getAppCheckToken$lambda$4(FirebaseContextProvider firebaseContextProvider, AppCheckTokenResult result) {
        OooOOO0.OooO0oO(result, "result");
        if (result.getError() != null) {
            Log.w(firebaseContextProvider.TAG, "Error getting App Check token. Error: " + result.getError());
        }
        return Tasks.forResult(result.getToken());
    }

    private final Task<String> getAuthToken() {
        InternalAuthProvider internalAuthProvider = this.tokenProvider.get();
        if (internalAuthProvider == null) {
            Task<String> taskForResult = Tasks.forResult(null);
            OooOOO0.OooO0o(taskForResult, "forResult(...)");
            return taskForResult;
        }
        Task taskContinueWith = internalAuthProvider.getAccessToken(false).continueWith(this.executor, new com.aspose.slides.OooO0O0());
        OooOOO0.OooO0o(taskContinueWith, "continueWith(...)");
        return taskContinueWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAuthToken$lambda$3(Task task) throws Exception {
        OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            return ((GetTokenResult) task.getResult()).getToken();
        }
        Exception exception = task.getException();
        if (exception instanceof FirebaseNoSignedInUserException) {
            return null;
        }
        OooOOO0.OooO0Oo(exception);
        throw exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getContext$lambda$2(Task task, FirebaseContextProvider firebaseContextProvider, Task task2, Void r3) {
        return Tasks.forResult(new HttpsCallableContext((String) task.getResult(), firebaseContextProvider.instanceId.get().getToken(), (String) task2.getResult()));
    }

    @Override // com.google.firebase.functions.ContextProvider
    public Task<HttpsCallableContext> getContext(boolean getLimitedUseAppCheckToken) {
        final Task<String> authToken = getAuthToken();
        final Task<String> appCheckToken = getAppCheckToken(getLimitedUseAppCheckToken);
        return Tasks.whenAll((Task<?>[]) new Task[]{authToken, appCheckToken}).onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.functions.OooO0OO
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                FirebaseContextProvider firebaseContextProvider = this;
                return FirebaseContextProvider.getContext$lambda$2(authToken, firebaseContextProvider, appCheckToken, (Void) obj);
            }
        });
    }
}

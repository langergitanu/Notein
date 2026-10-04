package com.google.firebase.appcheck.debug.internal;

import android.util.Log;
import com.aspose.slides.C22208OooOo0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.debug.InternalDebugSecretProvider;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import com.google.firebase.inject.Provider;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class DebugAppCheckProvider implements AppCheckProvider {
    private static final String TAG = "com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider";
    private static final String UTF_8 = "UTF-8";
    private final Executor blockingExecutor;
    private final Task<String> debugSecretTask;
    private final Executor liteExecutor;
    private final NetworkClient networkClient;
    private final RetryManager retryManager;

    public DebugAppCheckProvider(FirebaseApp firebaseApp, Provider<InternalDebugSecretProvider> provider, Executor executor, Executor executor2, Executor executor3) {
        Preconditions.checkNotNull(firebaseApp);
        this.networkClient = new NetworkClient(firebaseApp);
        this.liteExecutor = executor;
        this.blockingExecutor = executor3;
        this.retryManager = new RetryManager();
        String debugSecret = provider.get() != null ? provider.get().getDebugSecret() : null;
        this.debugSecretTask = debugSecret == null ? determineDebugSecret(firebaseApp, executor2) : Tasks.forResult(debugSecret);
    }

    public static Task<String> determineDebugSecret(FirebaseApp firebaseApp, Executor executor) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new OooO0OO(0, firebaseApp, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$determineDebugSecret$0(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        StorageHelper storageHelper = new StorageHelper(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        String strRetrieveDebugSecret = storageHelper.retrieveDebugSecret();
        if (strRetrieveDebugSecret == null) {
            strRetrieveDebugSecret = UUID.randomUUID().toString();
            storageHelper.saveDebugSecret(strRetrieveDebugSecret);
        }
        Log.d(TAG, "Enter this debug secret into the allow list in the Firebase Console for your project: " + strRetrieveDebugSecret);
        taskCompletionSource.setResult(strRetrieveDebugSecret);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppCheckTokenResponse lambda$getToken$1(ExchangeDebugTokenRequest exchangeDebugTokenRequest) throws Exception {
        return this.networkClient.exchangeAttestationForAppCheckToken(exchangeDebugTokenRequest.toJsonString().getBytes("UTF-8"), 2, this.retryManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$2(String str) throws Exception {
        final ExchangeDebugTokenRequest exchangeDebugTokenRequest = new ExchangeDebugTokenRequest(str);
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.debug.internal.OooO0O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67882OooOo0o.lambda$getToken$1(exchangeDebugTokenRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$3(AppCheckTokenResponse appCheckTokenResponse) throws Exception {
        return Tasks.forResult(DefaultAppCheckToken.constructFromAppCheckTokenResponse(appCheckTokenResponse));
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        return this.debugSecretTask.onSuccessTask(this.liteExecutor, new OooO00o(this)).onSuccessTask(this.liteExecutor, new C22208OooOo0());
    }

    public DebugAppCheckProvider(String str, NetworkClient networkClient, Executor executor, Executor executor2, RetryManager retryManager) {
        this.networkClient = networkClient;
        this.liteExecutor = executor;
        this.blockingExecutor = executor2;
        this.retryManager = retryManager;
        this.debugSecretTask = Tasks.forResult(str);
    }
}

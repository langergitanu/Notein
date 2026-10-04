package com.google.firebase.appcheck.internal;

import com.aspose.slides.C22211OooOoO;
import com.aspose.slides.C22215OooOoo0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckProviderFactory;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public class DefaultFirebaseAppCheck extends FirebaseAppCheck {
    private static final long BUFFER_TIME_MILLIS = 300000;
    private final List<FirebaseAppCheck.AppCheckListener> appCheckListenerList;
    private AppCheckProvider appCheckProvider;
    private AppCheckProviderFactory appCheckProviderFactory;
    private final List<AppCheckTokenListener> appCheckTokenListenerList;
    private final Executor backgroundExecutor;
    private AppCheckToken cachedToken;
    private Task<AppCheckToken> cachedTokenTask;
    private final Clock clock;
    private final FirebaseApp firebaseApp;
    private final Provider<HeartBeatController> heartbeatControllerProvider;
    private final Executor liteExecutor;
    private final Task<Void> retrieveStoredTokenTask;
    private final StorageHelper storageHelper;
    private final TokenRefreshManager tokenRefreshManager;
    private final Executor uiExecutor;

    public DefaultFirebaseAppCheck(FirebaseApp firebaseApp, Provider<HeartBeatController> provider, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(provider);
        this.firebaseApp = firebaseApp;
        this.heartbeatControllerProvider = provider;
        this.appCheckTokenListenerList = new ArrayList();
        this.appCheckListenerList = new ArrayList();
        this.storageHelper = new StorageHelper(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        this.tokenRefreshManager = new TokenRefreshManager(firebaseApp.getApplicationContext(), this, executor2, scheduledExecutorService);
        this.uiExecutor = executor;
        this.liteExecutor = executor2;
        this.backgroundExecutor = executor3;
        this.retrieveStoredTokenTask = retrieveStoredAppCheckTokenInBackground(executor3);
        this.clock = new Clock.DefaultClock();
    }

    private boolean hasValidToken() {
        AppCheckToken appCheckToken = this.cachedToken;
        return appCheckToken != null && appCheckToken.getExpireTimeMillis() - this.clock.currentTimeMillis() > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchTokenFromProvider$5(AppCheckToken appCheckToken) throws Exception {
        updateStoredToken(appCheckToken);
        Iterator<FirebaseAppCheck.AppCheckListener> it = this.appCheckListenerList.iterator();
        while (it.hasNext()) {
            it.next().onAppCheckTokenChanged(appCheckToken);
        }
        DefaultAppCheckTokenResult defaultAppCheckTokenResultConstructFromAppCheckToken = DefaultAppCheckTokenResult.constructFromAppCheckToken(appCheckToken);
        Iterator<AppCheckTokenListener> it2 = this.appCheckTokenListenerList.iterator();
        while (it2.hasNext()) {
            it2.next().onAppCheckTokenChanged(defaultAppCheckTokenResultConstructFromAppCheckToken);
        }
        return Tasks.forResult(appCheckToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getAppCheckToken$4(boolean z, Task task) throws Exception {
        if (!z && hasValidToken()) {
            return Tasks.forResult(this.cachedToken);
        }
        if (this.appCheckProvider == null) {
            return Tasks.forException(new FirebaseException("No AppCheckProvider installed."));
        }
        Task<AppCheckToken> task2 = this.cachedTokenTask;
        if (task2 == null || task2.isComplete() || this.cachedTokenTask.isCanceled()) {
            this.cachedTokenTask = fetchTokenFromProvider();
        }
        return this.cachedTokenTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getLimitedUseToken$3(Task task) throws Exception {
        return task.isSuccessful() ? Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult())) : Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$1(Task task) throws Exception {
        return task.isSuccessful() ? Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult())) : Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$2(boolean z, Task task) throws Exception {
        if (!z && hasValidToken()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken(this.cachedToken));
        }
        if (this.appCheckProvider == null) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException("No AppCheckProvider installed.")));
        }
        Task<AppCheckToken> task2 = this.cachedTokenTask;
        if (task2 == null || task2.isComplete() || this.cachedTokenTask.isCanceled()) {
            this.cachedTokenTask = fetchTokenFromProvider();
        }
        return this.cachedTokenTask.continueWithTask(this.liteExecutor, new C22211OooOoO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retrieveStoredAppCheckTokenInBackground$0(TaskCompletionSource taskCompletionSource) {
        AppCheckToken appCheckTokenRetrieveAppCheckToken = this.storageHelper.retrieveAppCheckToken();
        if (appCheckTokenRetrieveAppCheckToken != null) {
            setCachedToken(appCheckTokenRetrieveAppCheckToken);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStoredToken$6(AppCheckToken appCheckToken) {
        this.storageHelper.saveAppCheckToken(appCheckToken);
    }

    private Task<Void> retrieveStoredAppCheckTokenInBackground(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.appcheck.internal.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f67890OooOo0o.lambda$retrieveStoredAppCheckTokenInBackground$0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void updateStoredToken(AppCheckToken appCheckToken) {
        this.backgroundExecutor.execute(new OooO00o(0, this, appCheckToken));
        setCachedToken(appCheckToken);
        this.tokenRefreshManager.maybeScheduleTokenRefresh(appCheckToken);
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void addAppCheckListener(FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        this.appCheckListenerList.add(appCheckListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckListenerList.size() + this.appCheckTokenListenerList.size());
        if (hasValidToken()) {
            appCheckListener.onAppCheckTokenChanged(this.cachedToken);
        }
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void addAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        this.appCheckTokenListenerList.add(appCheckTokenListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckListenerList.size() + this.appCheckTokenListenerList.size());
        if (hasValidToken()) {
            appCheckTokenListener.onAppCheckTokenChanged(DefaultAppCheckTokenResult.constructFromAppCheckToken(this.cachedToken));
        }
    }

    public Task<AppCheckToken> fetchTokenFromProvider() {
        return this.appCheckProvider.getToken().onSuccessTask(this.uiExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.internal.OooO0o0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f67897OooOo0o.lambda$fetchTokenFromProvider$5((AppCheckToken) obj);
            }
        });
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public Task<AppCheckToken> getAppCheckToken(final boolean z) {
        return this.retrieveStoredTokenTask.continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.OooO0OO
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f67892OooOo0o.lambda$getAppCheckToken$4(z, task);
            }
        });
    }

    public Provider<HeartBeatController> getHeartbeatControllerProvider() {
        return this.heartbeatControllerProvider;
    }

    public AppCheckProviderFactory getInstalledAppCheckProviderFactory() {
        return this.appCheckProviderFactory;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public Task<AppCheckToken> getLimitedUseAppCheckToken() {
        AppCheckProvider appCheckProvider = this.appCheckProvider;
        return appCheckProvider == null ? Tasks.forException(new FirebaseException("No AppCheckProvider installed.")) : appCheckProvider.getToken();
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public Task<AppCheckTokenResult> getLimitedUseToken() {
        return getLimitedUseAppCheckToken().continueWithTask(this.liteExecutor, new C22215OooOoo0());
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public Task<AppCheckTokenResult> getToken(final boolean z) {
        return this.retrieveStoredTokenTask.continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.OooO0Oo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f67894OooOo0o.lambda$getToken$2(z, task);
            }
        });
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(AppCheckProviderFactory appCheckProviderFactory) {
        installAppCheckProviderFactory(appCheckProviderFactory, this.firebaseApp.isDataCollectionDefaultEnabled());
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void removeAppCheckListener(FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        this.appCheckListenerList.remove(appCheckListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckListenerList.size() + this.appCheckTokenListenerList.size());
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void removeAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        this.appCheckTokenListenerList.remove(appCheckTokenListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckListenerList.size() + this.appCheckTokenListenerList.size());
    }

    public void resetAppCheckState() {
        this.appCheckProviderFactory = null;
        this.appCheckProvider = null;
        this.cachedToken = null;
        this.storageHelper.clearSharedPrefs();
    }

    public void setCachedToken(AppCheckToken appCheckToken) {
        this.cachedToken = appCheckToken;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void setTokenAutoRefreshEnabled(boolean z) {
        this.tokenRefreshManager.setIsAutoRefreshEnabled(z);
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(AppCheckProviderFactory appCheckProviderFactory, boolean z) {
        Preconditions.checkNotNull(appCheckProviderFactory);
        this.appCheckProviderFactory = appCheckProviderFactory;
        this.appCheckProvider = appCheckProviderFactory.create(this.firebaseApp);
        this.tokenRefreshManager.setIsAutoRefreshEnabled(z);
    }
}

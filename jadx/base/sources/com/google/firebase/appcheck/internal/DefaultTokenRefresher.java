package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class DefaultTokenRefresher {
    static final long INITIAL_DELAY_SECONDS = 30;
    static final long MAX_DELAY_SECONDS = 960;
    private static final long UNSET_DELAY = -1;
    private volatile long delayAfterFailureSeconds = -1;
    private final DefaultFirebaseAppCheck firebaseAppCheck;
    private final Executor liteExecutor;
    private volatile ScheduledFuture<?> refreshFuture;
    private final ScheduledExecutorService scheduledExecutorService;

    public DefaultTokenRefresher(DefaultFirebaseAppCheck defaultFirebaseAppCheck, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.firebaseAppCheck = (DefaultFirebaseAppCheck) Preconditions.checkNotNull(defaultFirebaseAppCheck);
        this.liteExecutor = executor;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private long getNextRefreshMillis() {
        return this.delayAfterFailureSeconds == -1 ? INITIAL_DELAY_SECONDS : this.delayAfterFailureSeconds * 2 < MAX_DELAY_SECONDS ? this.delayAfterFailureSeconds * 2 : MAX_DELAY_SECONDS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$0(Exception exc) {
        scheduleRefreshAfterFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRefresh() {
        this.firebaseAppCheck.fetchTokenFromProvider().addOnFailureListener(this.liteExecutor, new OooO0o(this, 0));
    }

    private void scheduleRefreshAfterFailure() {
        cancel();
        this.delayAfterFailureSeconds = getNextRefreshMillis();
        this.refreshFuture = this.scheduledExecutorService.schedule(new RunnableC22537OooO0oO(this, 0), this.delayAfterFailureSeconds, TimeUnit.SECONDS);
    }

    public void cancel() {
        if (this.refreshFuture == null || this.refreshFuture.isDone()) {
            return;
        }
        this.refreshFuture.cancel(false);
    }

    public void scheduleRefresh(long j) {
        cancel();
        this.delayAfterFailureSeconds = -1L;
        this.refreshFuture = this.scheduledExecutorService.schedule(new RunnableC22537OooO0oO(this, 0), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }
}

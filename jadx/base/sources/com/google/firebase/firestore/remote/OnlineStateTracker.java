package com.google.firebase.firestore.remote;

import OooOoo.C20593OooO0Oo;
import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.Locale;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
class OnlineStateTracker {
    private static final String LOG_TAG = "OnlineStateTracker";
    private static final int MAX_WATCH_STREAM_FAILURES = 1;
    private static final int ONLINE_STATE_TIMEOUT_MS = 10000;
    private final OnlineStateCallback onlineStateCallback;
    private AsyncQueue.DelayedTask onlineStateTimer;
    private int watchStreamFailures;
    private final AsyncQueue workerQueue;
    private OnlineState state = OnlineState.UNKNOWN;
    private boolean shouldWarnClientIsOffline = true;

    public interface OnlineStateCallback {
        void handleOnlineStateChange(OnlineState onlineState);
    }

    public OnlineStateTracker(AsyncQueue asyncQueue, OnlineStateCallback onlineStateCallback) {
        this.workerQueue = asyncQueue;
        this.onlineStateCallback = onlineStateCallback;
    }

    private void clearOnlineStateTimer() {
        AsyncQueue.DelayedTask delayedTask = this.onlineStateTimer;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.onlineStateTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleWatchStreamStart$0() {
        this.onlineStateTimer = null;
        Assert.hardAssert(this.state == OnlineState.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        Locale locale = Locale.ENGLISH;
        logClientOfflineWarningIfNecessary("Backend didn't respond within 10 seconds\n");
        setAndBroadcastState(OnlineState.OFFLINE);
    }

    private void logClientOfflineWarningIfNecessary(String str) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (!this.shouldWarnClientIsOffline) {
            Logger.debug(LOG_TAG, "%s", strOooO0O0);
        } else {
            Logger.warn(LOG_TAG, "%s", strOooO0O0);
            this.shouldWarnClientIsOffline = false;
        }
    }

    private void setAndBroadcastState(OnlineState onlineState) {
        if (onlineState != this.state) {
            this.state = onlineState;
            this.onlineStateCallback.handleOnlineStateChange(onlineState);
        }
    }

    public OnlineState getState() {
        return this.state;
    }

    public void handleWatchStreamFailure(o00Oo0 o00oo02) {
        if (this.state == OnlineState.ONLINE) {
            setAndBroadcastState(OnlineState.UNKNOWN);
            Assert.hardAssert(this.watchStreamFailures == 0, "watchStreamFailures must be 0", new Object[0]);
            Assert.hardAssert(this.onlineStateTimer == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i = this.watchStreamFailures + 1;
        this.watchStreamFailures = i;
        if (i >= 1) {
            clearOnlineStateTimer();
            Locale locale = Locale.ENGLISH;
            logClientOfflineWarningIfNecessary("Connection failed 1 times. Most recent error: " + o00oo02);
            setAndBroadcastState(OnlineState.OFFLINE);
        }
    }

    public void handleWatchStreamStart() {
        if (this.watchStreamFailures == 0) {
            setAndBroadcastState(OnlineState.UNKNOWN);
            Assert.hardAssert(this.onlineStateTimer == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.onlineStateTimer = this.workerQueue.enqueueAfterDelay(AsyncQueue.TimerId.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: com.google.firebase.firestore.remote.OooOo0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68401OooOo0o.lambda$handleWatchStreamStart$0();
                }
            });
        }
    }

    public void updateState(OnlineState onlineState) {
        clearOnlineStateTimer();
        this.watchStreamFailures = 0;
        if (onlineState == OnlineState.ONLINE) {
            this.shouldWarnClientIsOffline = false;
        }
        setAndBroadcastState(onlineState);
    }
}

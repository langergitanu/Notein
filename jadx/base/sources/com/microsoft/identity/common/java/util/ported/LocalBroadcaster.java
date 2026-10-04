package com.microsoft.identity.common.java.util.ported;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public enum LocalBroadcaster {
    INSTANCE;

    private static final String TAG = "LocalBroadcaster";
    private static ExecutorService sBroadcastExecutor = Executors.newSingleThreadExecutor();
    final ConcurrentHashMap<String, IReceiverCallback> mReceivers = new ConcurrentHashMap<>();

    public interface IReceiverCallback {
        void onReceive(PropertyBag propertyBag);
    }

    LocalBroadcaster() {
    }

    public static void resetBroadcast() {
        shutdownAndAwaitTerminationForBroadcasterService();
        sBroadcastExecutor = Executors.newSingleThreadExecutor();
    }

    private static void shutdownAndAwaitTerminationForBroadcasterService() {
        sBroadcastExecutor.shutdown();
        try {
            ExecutorService executorService = sBroadcastExecutor;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(20L, timeUnit)) {
                return;
            }
            sBroadcastExecutor.shutdownNow();
            if (sBroadcastExecutor.awaitTermination(5L, timeUnit)) {
                return;
            }
            Logger.info(TAG + ":shutdownAndAwaitTerminationForBroadcasterService", "broadcastExecutor did not terminate");
        } catch (InterruptedException unused) {
            sBroadcastExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public void broadcast(final String str, final PropertyBag propertyBag) {
        if (str == null) {
            throw new NullPointerException("alias is marked non-null but is null");
        }
        if (propertyBag == null) {
            throw new NullPointerException("propertyBag is marked non-null but is null");
        }
        sBroadcastExecutor.execute(new Runnable() { // from class: com.microsoft.identity.common.java.util.ported.LocalBroadcaster.1
            @Override // java.lang.Runnable
            public void run() {
                IReceiverCallback iReceiverCallback = LocalBroadcaster.this.mReceivers.get(str);
                if (iReceiverCallback != null) {
                    Logger.info(LocalBroadcaster.TAG + ":broadcast", "broadcasting to alias: " + str);
                    iReceiverCallback.onReceive(propertyBag);
                    return;
                }
                Logger.info(LocalBroadcaster.TAG + ":broadcast", "No callback is registered with alias: " + str + ". Do nothing.");
            }
        });
    }

    public void clearReceivers() {
        this.mReceivers.clear();
    }

    public boolean hasReceivers(String str) {
        if (str != null) {
            return this.mReceivers.containsKey(str);
        }
        throw new NullPointerException("alias is marked non-null but is null");
    }

    public void registerCallback(String str, IReceiverCallback iReceiverCallback) {
        if (str == null) {
            throw new NullPointerException("alias is marked non-null but is null");
        }
        if (iReceiverCallback == null) {
            throw new NullPointerException("callback is marked non-null but is null");
        }
        if (this.mReceivers.containsKey(str)) {
            Logger.warn(OooO00o.OooO0OO(new StringBuilder(), TAG, ":registerCallback"), "The alias: " + str + " has already been registered. It will be overwritten");
        }
        Logger.info(OooO00o.OooO0OO(new StringBuilder(), TAG, ":registerCallback"), "Registering alias: ".concat(str));
        this.mReceivers.put(str, iReceiverCallback);
    }

    public void unregisterCallback(String str) {
        if (str == null) {
            throw new NullPointerException("alias is marked non-null but is null");
        }
        Logger.info(OooO00o.OooO0OO(new StringBuilder(), TAG, ":unregisterCallback"), "Removing alias: ".concat(str));
        this.mReceivers.remove(str);
    }
}

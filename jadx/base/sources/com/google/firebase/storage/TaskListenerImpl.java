package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.internal.ActivityLifecycleListener;
import com.google.firebase.storage.internal.SmartHandler;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
class TaskListenerImpl<ListenerTypeT, ResultT extends StorageTask.ProvideError> {
    private OnRaise<ListenerTypeT, ResultT> onRaise;
    private int targetStates;
    private StorageTask<ResultT> task;
    private final Queue<ListenerTypeT> listenerQueue = new ConcurrentLinkedQueue();
    private final HashMap<ListenerTypeT, SmartHandler> handlerMap = new HashMap<>();

    public interface OnRaise<ListenerTypeT, ResultT> {
        void raise(ListenerTypeT listenertypet, ResultT resultt);
    }

    public TaskListenerImpl(StorageTask<ResultT> storageTask, int i, OnRaise<ListenerTypeT, ResultT> onRaise) {
        this.task = storageTask;
        this.targetStates = i;
        this.onRaise = onRaise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$1(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInternalStateChanged$2(Object obj, StorageTask.ProvideError provideError) {
        this.onRaise.raise(obj, provideError);
    }

    public void addListener(Activity activity, Executor executor, final ListenerTypeT listenertypet) {
        boolean z;
        SmartHandler smartHandler;
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.task.getSyncObject()) {
            try {
                z = (this.task.getInternalState() & this.targetStates) != 0;
                this.listenerQueue.add(listenertypet);
                smartHandler = new SmartHandler(executor);
                this.handlerMap.put(listenertypet, smartHandler);
                if (activity != null) {
                    Preconditions.checkArgument(!activity.isDestroyed(), "Activity is already destroyed!");
                    ActivityLifecycleListener.getInstance().runOnActivityStopped(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.OooOo0O
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f68732OooOo0o.lambda$addListener$0(listenertypet);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            final StorageTask.ProvideError provideErrorSnapState = this.task.snapState();
            smartHandler.callBack(new Runnable() { // from class: com.google.firebase.storage.OooOo0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68734OooOo0o.lambda$addListener$1(listenertypet, provideErrorSnapState);
                }
            });
        }
    }

    public int getListenerCount() {
        return Math.max(this.listenerQueue.size(), this.handlerMap.size());
    }

    public void onInternalStateChanged() {
        if ((this.task.getInternalState() & this.targetStates) != 0) {
            final StorageTask.ProvideError provideErrorSnapState = this.task.snapState();
            for (final ListenerTypeT listenertypet : this.listenerQueue) {
                SmartHandler smartHandler = this.handlerMap.get(listenertypet);
                if (smartHandler != null) {
                    smartHandler.callBack(new Runnable() { // from class: com.google.firebase.storage.OooOo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f68728OooOo0o.lambda$onInternalStateChanged$2(listenertypet, provideErrorSnapState);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: removeListener, reason: merged with bridge method [inline-methods] */
    public void lambda$addListener$0(ListenerTypeT listenertypet) {
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.task.getSyncObject()) {
            this.handlerMap.remove(listenertypet);
            this.listenerQueue.remove(listenertypet);
            ActivityLifecycleListener.getInstance().removeCookie(listenertypet);
        }
    }
}

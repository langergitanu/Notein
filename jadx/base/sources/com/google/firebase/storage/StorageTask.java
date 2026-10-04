package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.TaskListenerImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public abstract class StorageTask<ResultT extends ProvideError> extends ControllableTask<ResultT> {
    static final int INTERNAL_STATE_CANCELED = 256;
    static final int INTERNAL_STATE_CANCELING = 32;
    static final int INTERNAL_STATE_FAILURE = 64;
    static final int INTERNAL_STATE_IN_PROGRESS = 4;
    static final int INTERNAL_STATE_NOT_STARTED = 1;
    static final int INTERNAL_STATE_PAUSED = 16;
    static final int INTERNAL_STATE_PAUSING = 8;
    static final int INTERNAL_STATE_QUEUED = 2;
    static final int INTERNAL_STATE_SUCCESS = 128;
    static final int STATES_CANCELED = 256;
    static final int STATES_COMPLETE = 448;
    static final int STATES_FAILURE = 64;
    static final int STATES_INPROGRESS = -465;
    static final int STATES_PAUSED = 16;
    static final int STATES_SUCCESS = 128;
    private static final String TAG = "StorageTask";
    private static final HashMap<Integer, HashSet<Integer>> ValidTaskInitiatedStateChanges;
    private static final HashMap<Integer, HashSet<Integer>> ValidUserInitiatedStateChanges;
    private ResultT finalResult;
    protected final Object syncObject = new Object();
    final TaskListenerImpl<OnSuccessListener<? super ResultT>, ResultT> successManager = new TaskListenerImpl<>(this, 128, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.OooO0oo
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            this.f68711OooO00o.lambda$new$0((OnSuccessListener) obj, (StorageTask.ProvideError) obj2);
        }
    });
    final TaskListenerImpl<OnFailureListener, ResultT> failureManager = new TaskListenerImpl<>(this, 64, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.OooOO0o
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            this.f68719OooO00o.lambda$new$1((OnFailureListener) obj, (StorageTask.ProvideError) obj2);
        }
    });
    final TaskListenerImpl<OnCompleteListener<ResultT>, ResultT> completeListener = new TaskListenerImpl<>(this, STATES_COMPLETE, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.OooOOO0
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            this.f68721OooO00o.lambda$new$2((OnCompleteListener) obj, (StorageTask.ProvideError) obj2);
        }
    });
    final TaskListenerImpl<OnCanceledListener, ResultT> cancelManager = new TaskListenerImpl<>(this, 256, new TaskListenerImpl.OnRaise() { // from class: com.google.firebase.storage.OooOOO
        @Override // com.google.firebase.storage.TaskListenerImpl.OnRaise
        public final void raise(Object obj, Object obj2) {
            this.f68720OooO00o.lambda$new$3((OnCanceledListener) obj, (StorageTask.ProvideError) obj2);
        }
    });
    final TaskListenerImpl<OnProgressListener<? super ResultT>, ResultT> progressManager = new TaskListenerImpl<>(this, STATES_INPROGRESS, new OooOOOO());
    final TaskListenerImpl<OnPausedListener<? super ResultT>, ResultT> pausedManager = new TaskListenerImpl<>(this, 16, new C22806OooOOOo());
    private volatile int currentState = 1;

    public interface ProvideError {
        Exception getError();
    }

    public class SnapshotBase implements ProvideError {
        private final Exception error;

        public SnapshotBase(Exception exc) {
            if (exc != null) {
                this.error = exc;
                return;
            }
            if (StorageTask.this.isCanceled()) {
                this.error = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
            } else if (StorageTask.this.getInternalState() == 64) {
                this.error = StorageException.fromErrorStatus(Status.RESULT_INTERNAL_ERROR);
            } else {
                this.error = null;
            }
        }

        @Override // com.google.firebase.storage.StorageTask.ProvideError
        public Exception getError() {
            return this.error;
        }

        public StorageReference getStorage() {
            return getTask().getStorage();
        }

        public StorageTask<ResultT> getTask() {
            return StorageTask.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        ValidUserInitiatedStateChanges = map;
        HashMap<Integer, HashSet<Integer>> map2 = new HashMap<>();
        ValidTaskInitiatedStateChanges = map2;
        map.put(1, new HashSet<>(Arrays.asList(16, 256)));
        map.put(2, new HashSet<>(Arrays.asList(8, 32)));
        map.put(4, new HashSet<>(Arrays.asList(8, 32)));
        map.put(16, new HashSet<>(Arrays.asList(2, 256)));
        map.put(64, new HashSet<>(Arrays.asList(2, 256)));
        map2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        map2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        map2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        map2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        map2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    private <ContinuationResultT> Task<ContinuationResultT> continueWithImpl(Executor executor, final Continuation<ResultT, ContinuationResultT> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.completeListener.addListener(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.OooOOo0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68723OooO00o.lambda$continueWithImpl$4(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private <ContinuationResultT> Task<ContinuationResultT> continueWithTaskImpl(Executor executor, final Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.completeListener.addListener(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.OooOO0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68712OooO00o.lambda$continueWithTaskImpl$5(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void ensureFinalState() {
        if (isComplete() || isPaused() || getInternalState() == 2 || tryChangeState(256, false)) {
            return;
        }
        tryChangeState(64, false);
    }

    private ResultT getFinalResult() {
        ResultT resultt = this.finalResult;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.finalResult == null) {
            this.finalResult = (ResultT) snapState();
        }
        return this.finalResult;
    }

    private String getStateString(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(getStateString(i));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$continueWithImpl$4(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object objThen = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(objThen);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e.getCause());
            } else {
                taskCompletionSource.setException(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$continueWithTaskImpl$5(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new C22807OooOOo(taskCompletionSource));
            task2.addOnFailureListener(new C22809OooOOoo(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new OooOo00(cancellationTokenSource));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e.getCause());
            } else {
                taskCompletionSource.setException(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRunnable$7() {
        try {
            run();
        } finally {
            ensureFinalState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(OnSuccessListener onSuccessListener, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        onSuccessListener.onSuccess(provideError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(OnFailureListener onFailureListener, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        onFailureListener.onFailure(provideError.getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(OnCompleteListener onCompleteListener, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(OnCanceledListener onCanceledListener, ProvideError provideError) {
        StorageTaskManager.getInstance().unRegister(this);
        onCanceledListener.onCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$successTaskImpl$6(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, ProvideError provideError) {
        try {
            Task taskThen = successContinuation.then(provideError);
            Objects.requireNonNull(taskCompletionSource);
            taskThen.addOnSuccessListener(new C22807OooOOo(taskCompletionSource));
            taskThen.addOnFailureListener(new C22809OooOOoo(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            taskThen.addOnCanceledListener(new OooOo00(cancellationTokenSource));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e.getCause());
            } else {
                taskCompletionSource.setException(e);
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    private <ContinuationResultT> Task<ContinuationResultT> successTaskImpl(Executor executor, final SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.successManager.addListener(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.OooOO0O
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                StorageTask.lambda$successTaskImpl$6(successContinuation, taskCompletionSource2, cancellationTokenSource, (StorageTask.ProvideError) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean cancel() {
        return tryChangeState(new int[]{256, 32}, true);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        return continueWithImpl(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return continueWithTaskImpl(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (getFinalResult() == null) {
            return null;
        }
        return getFinalResult().getError();
    }

    public int getInternalState() {
        return this.currentState;
    }

    public Runnable getRunnable() {
        return new OooO(this, 0);
    }

    public ResultT getSnapshot() {
        return (ResultT) snapState();
    }

    public abstract StorageReference getStorage();

    public Object getSyncObject() {
        return this.syncObject;
    }

    @Override // com.google.firebase.storage.CancellableTask, com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return getInternalState() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (getInternalState() & STATES_COMPLETE) != 0;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean isInProgress() {
        return (getInternalState() & STATES_INPROGRESS) != 0;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean isPaused() {
        return (getInternalState() & 16) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (getInternalState() & 128) != 0;
    }

    public void onCanceled() {
    }

    public void onFailure() {
    }

    public void onPaused() {
    }

    public void onProgress() {
    }

    public void onQueued() {
    }

    public void onSuccess() {
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return successTaskImpl(null, successContinuation);
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean pause() {
        return tryChangeState(new int[]{16, 8}, true);
    }

    public boolean queue() {
        if (!tryChangeState(2, false)) {
            return false;
        }
        schedule();
        return true;
    }

    public StorageTask<ResultT> removeOnCanceledListener(OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.cancelManager.lambda$addListener$0(onCanceledListener);
        return this;
    }

    public StorageTask<ResultT> removeOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.completeListener.lambda$addListener$0(onCompleteListener);
        return this;
    }

    public StorageTask<ResultT> removeOnFailureListener(OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.failureManager.lambda$addListener$0(onFailureListener);
        return this;
    }

    public StorageTask<ResultT> removeOnPausedListener(OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        this.pausedManager.lambda$addListener$0(onPausedListener);
        return this;
    }

    public StorageTask<ResultT> removeOnProgressListener(OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        this.progressManager.lambda$addListener$0(onProgressListener);
        return this;
    }

    public StorageTask<ResultT> removeOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.successManager.lambda$addListener$0(onSuccessListener);
        return this;
    }

    public void resetState() {
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean resume() {
        if (!tryChangeState(2, true)) {
            return false;
        }
        resetState();
        schedule();
        return true;
    }

    public abstract void run();

    public abstract void schedule();

    public ResultT snapState() {
        ResultT resultt;
        synchronized (this.syncObject) {
            resultt = (ResultT) snapStateImpl();
        }
        return resultt;
    }

    public abstract ResultT snapStateImpl();

    public boolean tryChangeState(int[] iArr, boolean z) {
        HashMap<Integer, HashSet<Integer>> map = z ? ValidUserInitiatedStateChanges : ValidTaskInitiatedStateChanges;
        synchronized (this.syncObject) {
            try {
                for (int i : iArr) {
                    HashSet<Integer> hashSet = map.get(Integer.valueOf(getInternalState()));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i))) {
                        this.currentState = i;
                        int i2 = this.currentState;
                        if (i2 == 2) {
                            StorageTaskManager.getInstance().ensureRegistered(this);
                            onQueued();
                        } else if (i2 == 4) {
                            onProgress();
                        } else if (i2 == 16) {
                            onPaused();
                        } else if (i2 == 64) {
                            onFailure();
                        } else if (i2 == 128) {
                            onSuccess();
                        } else if (i2 == 256) {
                            onCanceled();
                        }
                        this.successManager.onInternalStateChanged();
                        this.failureManager.onInternalStateChanged();
                        this.cancelManager.onInternalStateChanged();
                        this.completeListener.onInternalStateChanged();
                        this.pausedManager.onInternalStateChanged();
                        this.progressManager.onInternalStateChanged();
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "changed internal state to: " + getStateString(i) + " isUser: " + z + " from state:" + getStateString(this.currentState));
                        }
                        return true;
                    }
                }
                Log.w(TAG, "unable to change internal state to: " + getStateString(iArr) + " isUser: " + z + " from state:" + getStateString(this.currentState));
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        return continueWithImpl(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return continueWithTaskImpl(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return successTaskImpl(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public ResultT getResult() {
        if (getFinalResult() != null) {
            Exception error = getFinalResult().getError();
            if (error == null) {
                return (ResultT) getFinalResult();
            }
            throw new RuntimeExecutionException(error);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.cancelManager.addListener(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.completeListener.addListener(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.failureManager.addListener(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        this.pausedManager.addListener(null, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        this.progressManager.addListener(null, null, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.successManager.addListener(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(executor);
        this.cancelManager.addListener(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(executor);
        this.completeListener.addListener(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(executor);
        this.failureManager.addListener(null, executor, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(Executor executor, OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        Preconditions.checkNotNull(executor);
        this.pausedManager.addListener(null, executor, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(Executor executor, OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        Preconditions.checkNotNull(executor);
        this.progressManager.addListener(null, executor, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSuccessListener);
        this.successManager.addListener(null, executor, onSuccessListener);
        return this;
    }

    private String getStateString(int i) {
        if (i == 1) {
            return "INTERNAL_STATE_NOT_STARTED";
        }
        if (i == 2) {
            return "INTERNAL_STATE_QUEUED";
        }
        if (i == 4) {
            return "INTERNAL_STATE_IN_PROGRESS";
        }
        if (i == 8) {
            return "INTERNAL_STATE_PAUSING";
        }
        if (i == 16) {
            return "INTERNAL_STATE_PAUSED";
        }
        if (i == 32) {
            return "INTERNAL_STATE_CANCELING";
        }
        if (i == 64) {
            return "INTERNAL_STATE_FAILURE";
        }
        if (i == 128) {
            return "INTERNAL_STATE_SUCCESS";
        }
        if (i != 256) {
            return "Unknown Internal State!";
        }
        return "INTERNAL_STATE_CANCELED";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @Override // com.google.android.gms.tasks.Task
    public <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable {
        if (getFinalResult() != null) {
            if (!cls.isInstance(getFinalResult().getError())) {
                Exception error = getFinalResult().getError();
                if (error == null) {
                    return (ResultT) getFinalResult();
                }
                throw new RuntimeExecutionException(error);
            }
            throw cls.cast(getFinalResult().getError());
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(activity);
        this.cancelManager.addListener(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnCompleteListener(Activity activity, OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(activity);
        this.completeListener.addListener(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(activity);
        this.failureManager.addListener(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public StorageTask<ResultT> addOnPausedListener(Activity activity, OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        Preconditions.checkNotNull(activity);
        this.pausedManager.addListener(activity, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public StorageTask<ResultT> addOnProgressListener(Activity activity, OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        Preconditions.checkNotNull(activity);
        this.progressManager.addListener(activity, null, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public StorageTask<ResultT> addOnSuccessListener(Activity activity, OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(onSuccessListener);
        this.successManager.addListener(activity, null, onSuccessListener);
        return this;
    }

    public boolean tryChangeState(int i, boolean z) {
        return tryChangeState(new int[]{i}, z);
    }
}

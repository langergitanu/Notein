package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.UploadTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) throws Exception {
        return Tasks.forResult(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) throws Exception {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation successContinuation, Task task) throws Exception {
        return task.isSuccessful() ? successContinuation.then(task.getResult()) : task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new RunnableC22570OooO0Oo()), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        UploadTask uploadTask;
        synchronized (this.tailLock) {
            uploadTask = (Task<T>) this.tail.continueWithTask(this.executor, new OooO0OO(callable));
            this.tail = uploadTask;
        }
        return uploadTask;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        UploadTask uploadTask;
        synchronized (this.tailLock) {
            uploadTask = (Task<T>) this.tail.continueWithTask(this.executor, new C22571OooO0o0(callable));
            this.tail = uploadTask;
        }
        return uploadTask;
    }

    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, final SuccessContinuation<T, R> successContinuation) {
        UploadTask uploadTask;
        synchronized (this.tailLock) {
            uploadTask = (Task<R>) this.tail.continueWithTask(this.executor, new C22572OooO0oO(callable)).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.OooO0oo
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.lambda$submitTaskOnSuccess$5(successContinuation, task);
                }
            });
            this.tail = uploadTask;
        }
        return uploadTask;
    }

    public Task<Void> submit(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new OooO0O0(runnable));
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        UploadTask uploadTask;
        synchronized (this.tailLock) {
            uploadTask = (Task<R>) this.tail.continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.concurrency.OooO0o
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return CrashlyticsWorker.lambda$submitTask$3(callable, task);
                }
            }).continueWithTask(this.executor, continuation);
            this.tail = uploadTask;
        }
        return uploadTask;
    }
}

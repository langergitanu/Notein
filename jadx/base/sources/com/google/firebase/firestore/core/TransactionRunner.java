package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.datepicker.RunnableC22468OooO0Oo;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.TransactionOptions;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: loaded from: classes8.dex */
public class TransactionRunner<TResult> {
    private AsyncQueue asyncQueue;
    private int attemptsRemaining;
    private ExponentialBackoff backoff;
    private RemoteStore remoteStore;
    private TaskCompletionSource<TResult> taskSource = new TaskCompletionSource<>();
    private Function<Transaction, Task<TResult>> updateFunction;

    public TransactionRunner(AsyncQueue asyncQueue, RemoteStore remoteStore, TransactionOptions transactionOptions, Function<Transaction, Task<TResult>> function) {
        this.asyncQueue = asyncQueue;
        this.remoteStore = remoteStore;
        this.updateFunction = function;
        this.attemptsRemaining = transactionOptions.getMaxAttempts();
        this.backoff = new ExponentialBackoff(asyncQueue, AsyncQueue.TimerId.RETRY_TRANSACTION);
    }

    private void handleTransactionError(Task task) {
        if (this.attemptsRemaining <= 0 || !isRetryableTransactionError(task.getException())) {
            this.taskSource.setException(task.getException());
        } else {
            runWithBackoff();
        }
    }

    private static boolean isRetryableTransactionError(Exception exc) {
        if (!(exc instanceof FirebaseFirestoreException)) {
            return false;
        }
        FirebaseFirestoreException firebaseFirestoreException = (FirebaseFirestoreException) exc;
        FirebaseFirestoreException.Code code = firebaseFirestoreException.getCode();
        return code == FirebaseFirestoreException.Code.ABORTED || code == FirebaseFirestoreException.Code.ALREADY_EXISTS || code == FirebaseFirestoreException.Code.FAILED_PRECONDITION || !Datastore.isPermanentError(firebaseFirestoreException.getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$0(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.taskSource.setResult((TResult) task.getResult());
        } else {
            handleTransactionError(task2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$1(Transaction transaction, final Task task) {
        if (task.isSuccessful()) {
            transaction.commit().addOnCompleteListener(this.asyncQueue.getExecutor(), new OnCompleteListener() { // from class: com.google.firebase.firestore.core.OooOoOO
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    this.f68183OooO00o.lambda$runWithBackoff$0(task, task2);
                }
            });
        } else {
            handleTransactionError(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$2() {
        final Transaction transactionCreateTransaction = this.remoteStore.createTransaction();
        this.updateFunction.apply(transactionCreateTransaction).addOnCompleteListener(this.asyncQueue.getExecutor(), new OnCompleteListener() { // from class: com.google.firebase.firestore.core.OooOoo0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f68186OooO00o.lambda$runWithBackoff$1(transactionCreateTransaction, task);
            }
        });
    }

    private void runWithBackoff() {
        this.attemptsRemaining--;
        this.backoff.backoffAndRun(new RunnableC22468OooO0Oo(this, 1));
    }

    public Task<TResult> run() {
        runWithBackoff();
        return this.taskSource.getTask();
    }
}

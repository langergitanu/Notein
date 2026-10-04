package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class TaskImpl<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: b */
    private TResult f57556b;

    /* JADX INFO: renamed from: c */
    private Exception f57557c;

    /* JADX INFO: renamed from: e */
    private volatile boolean f57559e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f57560f;

    /* JADX INFO: renamed from: a */
    private final Object f57555a = new Object();

    /* JADX INFO: renamed from: d */
    private C18859q<TResult> f57558d = new C18859q<>();

    /* JADX INFO: renamed from: a */
    private void m80526a() {
        synchronized (this.f57555a) {
            C18864d.m80556a(this.f57559e, "Task is not yet complete");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m80527b() {
        synchronized (this.f57555a) {
            C18864d.m80556a(!this.f57559e, "Task is already complete");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m80528c() {
        if (this.f57560f) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: d */
    private void m80529d() {
        synchronized (this.f57555a) {
            try {
                if (this.f57559e) {
                    this.f57558d.m80538a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        C18864d.m80554a(onCanceledListener, "OnCanceledListener is not null");
        return addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        C18864d.m80554a(onCompleteListener, "OnCompleteListener is not null");
        return addOnCompleteListener(TaskExecutors.MAIN_THREAD, onCompleteListener);
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        C18864d.m80554a(onFailureListener, "OnFailureListener is not null");
        return addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> onSuccessListener) {
        C18864d.m80554a(onSuccessListener, "OnSuccessListener is not null");
        return addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        C18864d.m80554a(continuation, "Continuation is not null");
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        C18864d.m80554a(continuation, "Continuation is not null");
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.oplus.ocs.base.task.Task
    public Exception getException() {
        Exception exc;
        synchronized (this.f57555a) {
            exc = this.f57557c;
        }
        return exc;
    }

    @Override // com.oplus.ocs.base.task.Task
    public TResult getResult() {
        TResult tresult;
        synchronized (this.f57555a) {
            try {
                m80526a();
                m80528c();
                if (this.f57557c != null) {
                    throw new RuntimeException(this.f57557c);
                }
                tresult = this.f57556b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.oplus.ocs.base.task.Task
    public boolean isCanceled() {
        return this.f57560f;
    }

    @Override // com.oplus.ocs.base.task.Task
    public boolean isComplete() {
        boolean z;
        synchronized (this.f57555a) {
            z = this.f57559e;
        }
        return z;
    }

    @Override // com.oplus.ocs.base.task.Task
    public boolean isSuccessful() {
        boolean z;
        synchronized (this.f57555a) {
            try {
                z = this.f57559e && !this.f57560f && this.f57557c == null;
            } finally {
            }
        }
        return z;
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(successContinuation, "SuccessContinuation is not null");
        TaskImpl taskImpl = new TaskImpl();
        this.f57558d.m80539a(new C18855m(executor, successContinuation, taskImpl));
        m80529d();
        return taskImpl;
    }

    public void setException(Exception exc) {
        C18864d.m80554a(exc, "Exception must not be null");
        synchronized (this.f57555a) {
            m80527b();
            this.f57559e = true;
            this.f57557c = exc;
        }
        this.f57558d.m80538a(this);
    }

    public void setResult(TResult tresult) {
        synchronized (this.f57555a) {
            m80527b();
            this.f57559e = true;
            this.f57556b = tresult;
        }
        this.f57558d.m80538a(this);
    }

    public boolean tryCancel() {
        boolean z;
        synchronized (this.f57555a) {
            if (this.f57559e) {
                z = false;
            } else {
                z = true;
                this.f57559e = true;
                this.f57560f = true;
                this.f57558d.m80538a(this);
            }
        }
        return z;
    }

    public boolean trySetException(Exception exc) {
        boolean z;
        C18864d.m80554a(exc, "Exception must not be null");
        C18864d.m80554a(exc, "Exception must not be null");
        synchronized (this.f57555a) {
            if (this.f57559e) {
                z = false;
            } else {
                this.f57559e = true;
                this.f57557c = exc;
                this.f57558d.m80538a(this);
                z = true;
            }
        }
        return z;
    }

    public boolean trySetResult(TResult tresult) {
        boolean z;
        synchronized (this.f57555a) {
            if (this.f57559e) {
                z = false;
            } else {
                this.f57559e = true;
                this.f57556b = tresult;
                this.f57558d.m80538a(this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onCanceledListener, "OnCanceledListener is not null");
        this.f57558d.m80539a(new C18846d(executor, onCanceledListener));
        m80529d();
        return this;
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onCompleteListener, "OnCompleteListener is not null");
        this.f57558d.m80539a(new C18848f(executor, onCompleteListener));
        m80529d();
        return this;
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onFailureListener, "OnFailureListener is not null");
        this.f57558d.m80539a(new C18850h(executor, onFailureListener));
        m80529d();
        return this;
    }

    @Override // com.oplus.ocs.base.task.Task
    public Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(onSuccessListener, "OnSuccessListener is not null");
        this.f57558d.m80539a(new C18852j(executor, onSuccessListener));
        m80529d();
        return this;
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(continuation, "Continuation is not null");
        TaskImpl taskImpl = new TaskImpl();
        this.f57558d.m80539a(new C18845c(executor, continuation, taskImpl));
        m80529d();
        return taskImpl;
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        C18864d.m80554a(executor, "Executor is not null");
        C18864d.m80554a(continuation, "Continuation is not null");
        TaskImpl taskImpl = new TaskImpl();
        this.f57558d.m80539a(new C18845c(executor, continuation, taskImpl));
        m80529d();
        return taskImpl;
    }

    @Override // com.oplus.ocs.base.task.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        C18864d.m80554a(successContinuation, "SuccessContinuation is not null");
        return onSuccessTask(TaskExecutors.MAIN_THREAD, successContinuation);
    }

    @Override // com.oplus.ocs.base.task.Task
    public <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f57555a) {
            try {
                m80526a();
                m80528c();
                if (!cls.isInstance(this.f57557c)) {
                    if (this.f57557c == null) {
                        tresult = this.f57556b;
                    } else {
                        throw new RuntimeException(this.f57557c);
                    }
                } else {
                    throw cls.cast(this.f57557c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }
}

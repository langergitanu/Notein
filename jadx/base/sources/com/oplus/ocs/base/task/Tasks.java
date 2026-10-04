package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class Tasks {

    /* JADX INFO: renamed from: com.oplus.ocs.base.task.Tasks$a */
    public static class C18840a implements InterfaceC18842c {

        /* JADX INFO: renamed from: a */
        private final Object f57561a = new Object();

        /* JADX INFO: renamed from: b */
        private TaskImpl<Void> f57562b;

        /* JADX INFO: renamed from: c */
        private Exception f57563c;

        /* JADX INFO: renamed from: d */
        private volatile int f57564d;

        /* JADX INFO: renamed from: e */
        private volatile int f57565e;

        /* JADX INFO: renamed from: f */
        private volatile int f57566f;

        /* JADX INFO: renamed from: g */
        private volatile int f57567g;

        /* JADX INFO: renamed from: h */
        private volatile boolean f57568h;

        public C18840a(int i, TaskImpl<Void> taskImpl) {
            this.f57564d = i;
            this.f57562b = taskImpl;
        }

        /* JADX INFO: renamed from: a */
        private void m80532a() {
            synchronized (this.f57561a) {
                try {
                    if (this.f57565e + this.f57566f + this.f57567g != this.f57564d) {
                        return;
                    }
                    if (this.f57563c != null) {
                        this.f57562b.setException(new ExecutionException(this.f57566f + " out of " + this.f57564d + " underlying tasks failed", this.f57563c));
                    } else if (this.f57568h) {
                        this.f57562b.tryCancel();
                    } else {
                        this.f57562b.setResult(null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.oplus.ocs.base.task.OnCanceledListener
        public final void onCanceled() {
            synchronized (this.f57561a) {
                this.f57567g++;
                this.f57568h = true;
                m80532a();
            }
        }

        @Override // com.oplus.ocs.base.task.OnFailureListener
        public final void onFailure(Exception exc) {
            C18864d.m80553a(exc);
            synchronized (this.f57561a) {
                this.f57566f++;
                this.f57563c = exc;
                m80532a();
            }
        }

        @Override // com.oplus.ocs.base.task.OnSuccessListener
        public final void onSuccess(Object obj) {
            synchronized (this.f57561a) {
                this.f57565e++;
                m80532a();
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.ocs.base.task.Tasks$c */
    public interface InterfaceC18842c extends OnCanceledListener, OnFailureListener, OnSuccessListener<Object> {
    }

    private Tasks() {
    }

    /* JADX INFO: renamed from: a */
    private static <TResult> TResult m80530a(Task<TResult> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        C18864d.m80557b("Must not be called on the main application thread");
        C18864d.m80554a(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) m80530a(task);
        }
        C18841b c18841b = new C18841b((byte) 0);
        m80531a(task, c18841b);
        c18841b.f57569a.await();
        return (TResult) m80530a(task);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        C18864d.m80553a(callable);
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static <TResult> Task<TResult> forCanceled() {
        TaskImpl taskImpl = new TaskImpl();
        taskImpl.tryCancel();
        return taskImpl;
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
        C18864d.m80553a(exc);
        TaskImpl taskImpl = new TaskImpl();
        taskImpl.setException(exc);
        return taskImpl;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        TaskImpl taskImpl = new TaskImpl();
        taskImpl.setResult(tresult);
        return taskImpl;
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        TaskImpl taskImpl = new TaskImpl();
        C18840a c18840a = new C18840a(collection.size(), taskImpl);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m80531a(it2.next(), c18840a);
        }
        return taskImpl;
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        return whenAll(collection).continueWithTask(new C18857o(collection));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task<?>> collection) {
        return (Task<List<TResult>>) whenAll(collection).continueWith(new C18858p(collection));
    }

    /* JADX INFO: renamed from: com.oplus.ocs.base.task.Tasks$b */
    public static class C18841b implements InterfaceC18842c {

        /* JADX INFO: renamed from: a */
        CountDownLatch f57569a;

        private C18841b() {
            this.f57569a = new CountDownLatch(1);
        }

        @Override // com.oplus.ocs.base.task.OnCanceledListener
        public final void onCanceled() {
            this.f57569a.countDown();
        }

        @Override // com.oplus.ocs.base.task.OnFailureListener
        public final void onFailure(Exception exc) {
            this.f57569a.countDown();
        }

        @Override // com.oplus.ocs.base.task.OnSuccessListener
        public final void onSuccess(Object obj) {
            this.f57569a.countDown();
        }

        public C18841b(byte b) {
            this();
        }
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        return whenAllComplete(Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task<?>... taskArr) {
        return whenAllSuccess(Arrays.asList(taskArr));
    }

    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        C18864d.m80554a(executor, "Executor must not be null");
        C18864d.m80554a(callable, "Callback must not be null");
        TaskImpl taskImpl = new TaskImpl();
        executor.execute(new RunnableC18843a(taskImpl, callable));
        return taskImpl;
    }

    /* JADX INFO: renamed from: a */
    private static <TResult> void m80531a(Task<TResult> task, InterfaceC18842c interfaceC18842c) {
        Executor executor = TaskExecutors.CURRENT_THREAD;
        task.addOnSuccessListener(executor, interfaceC18842c);
        task.addOnFailureListener(executor, interfaceC18842c);
        task.addOnCanceledListener(executor, interfaceC18842c);
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C18864d.m80557b("Must not be called on the main application thread");
        C18864d.m80554a(task, "Task must not be null");
        C18864d.m80554a(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) m80530a(task);
        }
        C18841b c18841b = new C18841b((byte) 0);
        m80531a(task, c18841b);
        if (c18841b.f57569a.await(j, timeUnit)) {
            return (TResult) m80530a(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        if (taskArr.length == 0) {
            return forResult(null);
        }
        return whenAll(Arrays.asList(taskArr));
    }
}

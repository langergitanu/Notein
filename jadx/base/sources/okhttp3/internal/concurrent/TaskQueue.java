package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class TaskQueue {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskRunner f124321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f124322OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f124323OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Task f124324OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f124325OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f124326OooO0o0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class AwaitIdleTask extends Task {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final CountDownLatch f124327OooO0o0;

        public AwaitIdleTask() {
            super(OooOOO0.OooOOO0(" awaitIdle", Util.f124308OooO0oo), false);
            this.f124327OooO0o0 = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long OooO00o() {
            this.f124327OooO0o0.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        OooOOO0.OooO0oO(taskRunner, "taskRunner");
        OooOOO0.OooO0oO(name, "name");
        this.f124321OooO00o = taskRunner;
        this.f124322OooO0O0 = name;
        this.f124326OooO0o0 = new ArrayList();
    }

    public final void OooO00o() {
        byte[] bArr = Util.f124301OooO00o;
        synchronized (this.f124321OooO00o) {
            try {
                if (OooO0O0()) {
                    this.f124321OooO00o.OooO0Oo(this);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0O0() {
        Task task = this.f124324OooO0Oo;
        if (task != null && task.f124318OooO0O0) {
            this.f124325OooO0o = true;
        }
        ArrayList arrayList = this.f124326OooO0o0;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i = size - 1;
            if (((Task) arrayList.get(size)).f124318OooO0O0) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.f124330OooO0oo.getClass();
                if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
                    TaskLoggerKt.OooO00o(task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
            if (i < 0) {
                return z;
            }
            size = i;
        }
    }

    public final void OooO0OO(Task task, long j) {
        OooOOO0.OooO0oO(task, "task");
        synchronized (this.f124321OooO00o) {
            if (!this.f124323OooO0OO) {
                if (OooO0o0(task, j, false)) {
                    this.f124321OooO00o.OooO0Oo(this);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else if (task.f124318OooO0O0) {
                TaskRunner.f124330OooO0oo.getClass();
                if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
                    TaskLoggerKt.OooO00o(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.f124330OooO0oo.getClass();
                if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
                    TaskLoggerKt.OooO00o(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void OooO0o() {
        byte[] bArr = Util.f124301OooO00o;
        synchronized (this.f124321OooO00o) {
            try {
                this.f124323OooO0OO = true;
                if (OooO0O0()) {
                    this.f124321OooO00o.OooO0Oo(this);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0o0(Task task, long j, boolean z) {
        Iterator it;
        int size;
        OooOOO0.OooO0oO(task, "task");
        TaskQueue taskQueue = task.f124319OooO0OO;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f124319OooO0OO = this;
        }
        TaskRunner.RealBackend realBackend = this.f124321OooO00o.f124332OooO00o;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f124326OooO0o0;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f124320OooO0Oo = j2;
            TaskRunner.f124330OooO0oo.getClass();
            if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
                TaskLoggerKt.OooO00o(task, this, z ? OooOOO0.OooOOO0(TaskLoggerKt.OooO0O0(j2 - jNanoTime), "run again after ") : OooOOO0.OooOOO0(TaskLoggerKt.OooO0O0(j2 - jNanoTime), "scheduled after "));
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).f124320OooO0Oo - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size != 0) {
                return true;
            }
        } else if (task.f124320OooO0Oo <= j2) {
            TaskRunner.f124330OooO0oo.getClass();
            if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
                TaskLoggerKt.OooO00o(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f124320OooO0Oo = j2;
            TaskRunner.f124330OooO0oo.getClass();
            if (TaskRunner.f124331OooOO0.isLoggable(Level.FINE)) {
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                }
                size++;
            }
            if (size == -1) {
            }
            arrayList.add(size, task);
            if (size != 0) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF124322OooO0O0() {
        return this.f124322OooO0O0;
    }
}

package okhttp3.internal.concurrent;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0oO0OO.ThreadFactoryC34011OooO0O0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Backend", "Companion", "RealBackend", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class TaskRunner {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final TaskRunner f124329OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Companion f124330OooO0oo = new Companion(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Logger f124331OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RealBackend f124332OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f124334OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f124335OooO0Oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f124333OooO0O0 = 10000;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f124337OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f124336OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TaskRunner$runnable$1 f124338OooO0oO = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            Task taskOooO0OO;
            long jNanoTime;
            while (true) {
                TaskRunner taskRunner = this.f124340OooOo0o;
                synchronized (taskRunner) {
                    taskOooO0OO = taskRunner.OooO0OO();
                }
                if (taskOooO0OO == null) {
                    return;
                }
                TaskQueue taskQueue = taskOooO0OO.f124319OooO0OO;
                OooOOO0.OooO0Oo(taskQueue);
                TaskRunner taskRunner2 = this.f124340OooOo0o;
                TaskRunner.f124330OooO0oo.getClass();
                boolean zIsLoggable = TaskRunner.f124331OooOO0.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    TaskRunner.RealBackend realBackend = taskQueue.f124321OooO00o.f124332OooO00o;
                    jNanoTime = System.nanoTime();
                    TaskLoggerKt.OooO00o(taskOooO0OO, taskQueue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        TaskRunner.OooO00o(taskRunner2, taskOooO0OO);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        if (zIsLoggable) {
                            TaskRunner.RealBackend realBackend2 = taskQueue.f124321OooO00o.f124332OooO00o;
                            TaskLoggerKt.OooO00o(taskOooO0OO, taskQueue, OooOOO0.OooOOO0(TaskLoggerKt.OooO0O0(System.nanoTime() - jNanoTime), "finished run in "));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        TaskRunner.RealBackend realBackend3 = taskQueue.f124321OooO00o.f124332OooO00o;
                        TaskLoggerKt.OooO00o(taskOooO0OO, taskQueue, OooOOO0.OooOOO0(TaskLoggerKt.OooO0O0(System.nanoTime() - jNanoTime), "failed a run in "));
                    }
                    throw th;
                }
            }
        }
    };

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface Backend {
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadPoolExecutor f124339OooO00o;

        public RealBackend(ThreadFactoryC34011OooO0O0 threadFactoryC34011OooO0O0) {
            this.f124339OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC34011OooO0O0);
        }

        public final void OooO00o(TaskRunner$runnable$1 runnable) {
            OooOOO0.OooO0oO(runnable, "runnable");
            this.f124339OooO00o.execute(runnable);
        }
    }

    static {
        String name = OooOOO0.OooOOO0(" TaskRunner", Util.f124308OooO0oo);
        OooOOO0.OooO0oO(name, "name");
        f124329OooO = new TaskRunner(new RealBackend(new ThreadFactoryC34011OooO0O0(name, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        OooOOO0.OooO0o(logger, "getLogger(TaskRunner::class.java.name)");
        f124331OooOO0 = logger;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        this.f124332OooO00o = realBackend;
    }

    public static final void OooO00o(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        byte[] bArr = Util.f124301OooO00o;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.f124317OooO00o);
        try {
            long jOooO00o = task.OooO00o();
            synchronized (taskRunner) {
                taskRunner.OooO0O0(task, jOooO00o);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (taskRunner) {
                taskRunner.OooO0O0(task, -1L);
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void OooO0O0(Task task, long j) {
        byte[] bArr = Util.f124301OooO00o;
        TaskQueue taskQueue = task.f124319OooO0OO;
        OooOOO0.OooO0Oo(taskQueue);
        if (taskQueue.f124324OooO0Oo != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = taskQueue.f124325OooO0o;
        taskQueue.f124325OooO0o = false;
        taskQueue.f124324OooO0Oo = null;
        this.f124337OooO0o0.remove(taskQueue);
        if (j != -1 && !z && !taskQueue.f124323OooO0OO) {
            taskQueue.OooO0o0(task, j, true);
        }
        if (taskQueue.f124326OooO0o0.isEmpty()) {
            return;
        }
        this.f124336OooO0o.add(taskQueue);
    }

    public final Task OooO0OO() {
        long j;
        Task task;
        boolean z;
        byte[] bArr = Util.f124301OooO00o;
        while (true) {
            ArrayList arrayList = this.f124336OooO0o;
            if (arrayList.isEmpty()) {
                return null;
            }
            RealBackend realBackend = this.f124332OooO00o;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = LocationRequestCompat.PASSIVE_INTERVAL;
            Task task2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    task = null;
                    z = false;
                    break;
                }
                Task task3 = (Task) ((TaskQueue) it.next()).f124326OooO0o0.get(0);
                j = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f124320OooO0Oo - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.f124337OooO0o0;
            if (task2 != null) {
                byte[] bArr2 = Util.f124301OooO00o;
                task2.f124320OooO0Oo = -1L;
                TaskQueue taskQueue = task2.f124319OooO0OO;
                OooOOO0.OooO0Oo(taskQueue);
                taskQueue.f124326OooO0o0.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f124324OooO0Oo = task2;
                arrayList2.add(taskQueue);
                if (z || (!this.f124334OooO0OO && !arrayList.isEmpty())) {
                    realBackend.OooO00o(this.f124338OooO0oO);
                }
                return task2;
            }
            if (this.f124334OooO0OO) {
                if (jMin >= this.f124335OooO0Oo - j) {
                    return task;
                }
                notify();
                return task;
            }
            this.f124334OooO0OO = true;
            this.f124335OooO0Oo = j + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i = size - 1;
                            ((TaskQueue) arrayList2.get(size)).OooO0O0();
                            if (i < 0) {
                                break;
                            }
                            size = i;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                            taskQueue2.OooO0O0();
                            if (taskQueue2.f124326OooO0o0.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                }
            } finally {
                this.f124334OooO0OO = false;
            }
        }
    }

    public final void OooO0Oo(TaskQueue taskQueue) {
        OooOOO0.OooO0oO(taskQueue, "taskQueue");
        byte[] bArr = Util.f124301OooO00o;
        if (taskQueue.f124324OooO0Oo == null) {
            boolean zIsEmpty = taskQueue.f124326OooO0o0.isEmpty();
            ArrayList arrayList = this.f124336OooO0o;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                OooOOO0.OooO0oO(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z = this.f124334OooO0OO;
        RealBackend realBackend = this.f124332OooO00o;
        if (z) {
            notify();
        } else {
            realBackend.OooO00o(this.f124338OooO0oO);
        }
    }

    public final TaskQueue OooO0o0() {
        int i;
        synchronized (this) {
            i = this.f124333OooO0O0;
            this.f124333OooO0O0 = i + 1;
        }
        return new TaskQueue(this, OooOOO0.OooOOO0(Integer.valueOf(i), "Q"));
    }
}

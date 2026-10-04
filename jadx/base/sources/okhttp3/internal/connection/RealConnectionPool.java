package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m80612d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "", "maxIdleConnections", "I", "", "keepAliveDurationNs", "J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/connection/RealConnection;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealConnectionPool {
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OooOOO0.OooO0oO(taskRunner, "taskRunner");
        OooOOO0.OooO0oO(timeUnit, "timeUnit");
        this.maxIdleConnections = 5;
        this.keepAliveDurationNs = timeUnit.toNanos(5L);
        this.cleanupQueue = taskRunner.OooO0o0();
        final String strOooOOO0 = OooOOO0.OooOOO0(" ConnectionPool", Util.f124308OooO0oo);
        this.cleanupTask = new Task(strOooOOO0) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long OooO00o() {
                return this.f124419OooO0o0.OooO0O0(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
    }

    public final boolean OooO00o(Address address, RealCall call, ArrayList arrayList, boolean z) {
        OooOOO0.OooO0oO(call, "call");
        Iterator<RealConnection> it = this.connections.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            RealConnection connection = it.next();
            OooOOO0.OooO0o(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!(connection.f124403OooO0oO != null)) {
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                if (connection.OooO0oo(address, arrayList)) {
                    call.OooO0O0(connection);
                    return true;
                }
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            }
        }
    }

    public final long OooO0O0(long j) {
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        for (RealConnection connection : this.connections) {
            OooOOO0.OooO0o(connection, "connection");
            synchronized (connection) {
                if (OooO0o0(connection, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - connection.f124412OooOOo0;
                    if (j3 > j2) {
                        realConnection = connection;
                        j2 = j3;
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
            }
        }
        long j4 = this.keepAliveDurationNs;
        if (j2 < j4 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j4 - j2;
            }
            if (i2 > 0) {
                return j4;
            }
            return -1L;
        }
        OooOOO0.OooO0Oo(realConnection);
        synchronized (realConnection) {
            if (!realConnection.f124411OooOOOo.isEmpty()) {
                return 0L;
            }
            if (realConnection.f124412OooOOo0 + j2 != j) {
                return 0L;
            }
            realConnection.f124405OooOO0 = true;
            this.connections.remove(realConnection);
            Socket socket = realConnection.f124400OooO0Oo;
            OooOOO0.OooO0Oo(socket);
            Util.OooO0Oo(socket);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.OooO00o();
            }
            return 0L;
        }
    }

    public final boolean OooO0OO(RealConnection connection) {
        OooOOO0.OooO0oO(connection, "connection");
        byte[] bArr = Util.f124301OooO00o;
        if (!connection.f124405OooOO0 && this.maxIdleConnections != 0) {
            this.cleanupQueue.OooO0OO(this.cleanupTask, 0L);
            return false;
        }
        connection.f124405OooOO0 = true;
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.OooO00o();
        }
        return true;
    }

    public final void OooO0Oo() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        OooOOO0.OooO0o(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection connection = it.next();
            OooOOO0.OooO0o(connection, "connection");
            synchronized (connection) {
                if (connection.f124411OooOOOo.isEmpty()) {
                    it.remove();
                    connection.f124405OooOO0 = true;
                    socket = connection.f124400OooO0Oo;
                    OooOOO0.OooO0Oo(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.OooO0Oo(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.OooO00o();
        }
    }

    public final void OooO0o(RealConnection realConnection) {
        byte[] bArr = Util.f124301OooO00o;
        this.connections.add(realConnection);
        this.cleanupQueue.OooO0OO(this.cleanupTask, 0L);
    }

    public final int OooO0o0(RealConnection realConnection, long j) {
        byte[] bArr = Util.f124301OooO00o;
        ArrayList arrayList = realConnection.f124411OooOOOo;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.f124398OooO0O0.f124290OooO00o.f124018OooO + " was leaked. Did you forget to close a response body?";
                Platform.f124683OooO00o.getClass();
                Platform.f124684OooO0O0.OooOO0(((RealCall.CallReference) reference).f124395OooO00o, str);
                arrayList.remove(i);
                realConnection.f124405OooOO0 = true;
                if (arrayList.isEmpty()) {
                    realConnection.f124412OooOOo0 = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}

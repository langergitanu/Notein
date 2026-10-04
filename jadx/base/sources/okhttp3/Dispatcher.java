package okhttp3;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0oO0OO.ThreadFactoryC34011OooO0O0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Dispatcher {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ThreadPoolExecutor f124104OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f124103OooO00o = 64;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f124105OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f124106OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque<RealCall> f124107OooO0o0 = new ArrayDeque<>();

    public final synchronized ExecutorService OooO00o() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f124104OooO0O0 == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = OooOOO0.OooOOO0(" Dispatcher", Util.f124308OooO0oo);
                OooOOO0.OooO0oO(name, "name");
                this.f124104OooO0O0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC34011OooO0O0(name, false));
            }
            threadPoolExecutor = this.f124104OooO0O0;
            OooOOO0.OooO0Oo(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void OooO0O0(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            OooO0Oo();
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        OooO0Oo();
    }

    public final void OooO0OO(RealCall.AsyncCall asyncCall) {
        asyncCall.f124392OooOo.decrementAndGet();
        OooO0O0(this.f124106OooO0Oo, asyncCall);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r3 < 5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r1.remove();
        r2.f124392OooOo.incrementAndGet();
        r0.add(r2);
        r8.f124106OooO0Oo.add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo() {
        int size;
        int i;
        byte[] bArr = Util.f124301OooO00o;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.f124105OooO0OO.iterator();
            OooOOO0.OooO0o(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                int size2 = this.f124106OooO0Oo.size();
                synchronized (this) {
                    int i2 = this.f124103OooO00o;
                    if (size2 >= i2) {
                        break;
                    }
                    int i3 = next.f124392OooOo.get();
                    synchronized (this) {
                    }
                }
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    int i4 = i + 1;
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) arrayList.get(i);
                    ExecutorService executorServiceOooO00o = OooO00o();
                    asyncCall.getClass();
                    RealCall realCall = asyncCall.f124394OooOoO0;
                    Dispatcher dispatcher = realCall.f124375OooOo0o.f124174OooOo0o;
                    byte[] bArr2 = Util.f124301OooO00o;
                    try {
                        try {
                            ((ThreadPoolExecutor) executorServiceOooO00o).execute(asyncCall);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            realCall.OooO0oO(interruptedIOException);
                            asyncCall.f124393OooOo0o.onFailure(realCall, interruptedIOException);
                            realCall.f124375OooOo0o.f124174OooOo0o.OooO0OO(asyncCall);
                        }
                        i = i4;
                    } catch (Throwable th) {
                        realCall.f124375OooOo0o.f124174OooOo0o.OooO0OO(asyncCall);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f124106OooO0Oo.size();
                this.f124107OooO0o0.size();
            }
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        size = arrayList.size();
        i = 0;
        while (i < size) {
        }
    }
}

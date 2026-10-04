package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0oO0OO.C34010OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo00OoO.C34523OooO0OO;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "AsyncCall", "CallReference", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealCall implements Call {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Request f124374OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OkHttpClient f124375OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final RealConnectionPool f124376OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f124377OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final EventListener f124378OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final AtomicBoolean f124379OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RealCall$timeout$1 f124380OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Object f124381OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ExchangeFinder f124382OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f124383Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RealConnection f124384Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f124385Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Exchange f124386Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f124387Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f124388Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public volatile Exchange f124389Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public volatile boolean f124390Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile RealConnection f124391Oooo0oO;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public volatile AtomicInteger f124392OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Callback f124393OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ RealCall f124394OooOoO0;

        public AsyncCall(RealCall this$0, Callback callback) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124394OooOoO0 = this$0;
            this.f124393OooOo0o = callback;
            this.f124392OooOo = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher dispatcher;
            String strOooOOO0 = OooOOO0.OooOOO0(this.f124394OooOoO0.f124374OooOo.f124238OooO00o.OooO0oo(), "OkHttp ");
            RealCall realCall = this.f124394OooOoO0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strOooOOO0);
            try {
                realCall.f124380OooOoo0.enter();
                try {
                    try {
                        z = true;
                        try {
                            this.f124393OooOo0o.onResponse(realCall, realCall.OooO0o0());
                            dispatcher = realCall.f124375OooOo0o.f124174OooOo0o;
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                Platform.f124683OooO00o.getClass();
                                Platform platform = Platform.f124684OooO0O0;
                                String strOooOOO02 = OooOOO0.OooOOO0(RealCall.OooO00o(realCall), "Callback failure for ");
                                platform.getClass();
                                Platform.OooO(strOooOOO02, 4, e);
                            } else {
                                this.f124393OooOo0o.onFailure(realCall, e);
                            }
                            dispatcher = realCall.f124375OooOo0o.f124174OooOo0o;
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException(OooOOO0.OooOOO0(th, "canceled due to "));
                                C32435OooO0Oo.OooO00o(iOException, th);
                                this.f124393OooOo0o.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.f124375OooOo0o.f124174OooOo0o.OooO0OO(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                dispatcher.OooO0OO(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f124395OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            OooOOO0.OooO0oO(referent, "referent");
            this.f124395OooO00o = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [oOo00OoO.OooOoo, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient client, Request originalRequest, boolean z) {
        OooOOO0.OooO0oO(client, "client");
        OooOOO0.OooO0oO(originalRequest, "originalRequest");
        this.f124375OooOo0o = client;
        this.f124374OooOo = originalRequest;
        this.f124377OooOoO0 = z;
        this.f124376OooOoO = client.f124173OooOo.getDelegate();
        C34010OooO00o c34010OooO00o = client.f124177OooOoOO;
        c34010OooO00o.getClass();
        byte[] bArr = Util.f124301OooO00o;
        EventListener$Companion$NONE$1 this_asFactory = c34010OooO00o.f122308OooO00o;
        OooOOO0.OooO0oO(this_asFactory, "$this_asFactory");
        this.f124378OooOoOO = this_asFactory;
        ?? r4 = new C34523OooO0OO() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // oOo00OoO.C34523OooO0OO
            public final void timedOut() {
                this.f124396OooO00o.cancel();
            }
        };
        r4.timeout(client.f124196OoooO0O, TimeUnit.MILLISECONDS);
        this.f124380OooOoo0 = r4;
        this.f124379OooOoo = new AtomicBoolean();
        this.f124388Oooo0OO = true;
    }

    public static final String OooO00o(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.f124390Oooo0o0 ? "canceled " : "");
        sb.append(realCall.f124377OooOoO0 ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(realCall.f124374OooOo.f124238OooO00o.OooO0oo());
        return sb.toString();
    }

    public final void OooO0O0(RealConnection realConnection) {
        byte[] bArr = Util.f124301OooO00o;
        if (this.f124384Oooo000 != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f124384Oooo000 = realConnection;
        realConnection.f124411OooOOOo.add(new CallReference(this, this.f124381OooOooO));
    }

    public final <E extends IOException> E OooO0OO(E e) {
        E interruptedIOException;
        Socket socketOooO0oo;
        byte[] bArr = Util.f124301OooO00o;
        RealConnection realConnection = this.f124384Oooo000;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketOooO0oo = OooO0oo();
            }
            if (this.f124384Oooo000 == null) {
                if (socketOooO0oo != null) {
                    Util.OooO0Oo(socketOooO0oo);
                }
                this.f124378OooOoOO.OooO0oo(this, realConnection);
            } else if (socketOooO0oo != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f124385Oooo00O && exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e == null) {
            this.f124378OooOoOO.OooO00o(this);
            return interruptedIOException;
        }
        EventListener eventListener = this.f124378OooOoOO;
        OooOOO0.OooO0Oo(interruptedIOException);
        eventListener.OooO0O0(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void OooO0Oo(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f124388Oooo0OO) {
                throw new IllegalStateException("released");
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        if (z && (exchange = this.f124389Oooo0o) != null) {
            exchange.f124349OooO0Oo.cancel();
            exchange.f124346OooO00o.OooO0o(exchange, true, true, null);
        }
        this.f124386Oooo00o = null;
    }

    public final <E extends IOException> E OooO0o(Exchange exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        OooOOO0.OooO0oO(exchange, "exchange");
        if (exchange.equals(this.f124389Oooo0o)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.f124383Oooo0) {
                            if (z2 || !this.f124387Oooo0O0) {
                                z4 = false;
                            }
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                        if (z) {
                            this.f124383Oooo0 = false;
                        }
                        if (z2) {
                            this.f124387Oooo0O0 = false;
                        }
                        boolean z5 = this.f124383Oooo0;
                        boolean z6 = (z5 || this.f124387Oooo0O0) ? false : true;
                        if (!z5 && !this.f124387Oooo0O0 && !this.f124388Oooo0OO) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                    C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                }
            }
            if (z3) {
                this.f124389Oooo0o = null;
                RealConnection realConnection = this.f124384Oooo000;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.f124409OooOOO0++;
                    }
                }
            }
            if (z4) {
                return (E) OooO0OO(e);
            }
        }
        return e;
    }

    public final Response OooO0o0() throws IOException {
        ArrayList arrayList = new ArrayList();
        C34431OooOo0.OooOo0o(arrayList, this.f124375OooOo0o.f124176OooOoO0);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f124375OooOo0o));
        arrayList.add(new BridgeInterceptor(this.f124375OooOo0o.f124184Oooo000));
        this.f124375OooOo0o.getClass();
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.f124341OooO00o);
        if (!this.f124377OooOoO0) {
            C34431OooOo0.OooOo0o(arrayList, this.f124375OooOo0o.f124175OooOoO);
        }
        arrayList.add(new CallServerInterceptor(this.f124377OooOoO0));
        Request request = this.f124374OooOo;
        OkHttpClient okHttpClient = this.f124375OooOo0o;
        try {
            try {
                Response responseOooO00o = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.f124193OoooO, okHttpClient.f124197OoooOO0, okHttpClient.f124200o000oOoO).OooO00o(this.f124374OooOo);
                if (this.f124390Oooo0o0) {
                    Util.OooO0OO(responseOooO00o);
                    throw new IOException("Canceled");
                }
                OooO0oO(null);
                return responseOooO00o;
            } catch (IOException e) {
                IOException iOExceptionOooO0oO = OooO0oO(e);
                if (iOExceptionOooO0oO == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionOooO0oO;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                OooO0oO(null);
            }
            throw th;
        }
    }

    public final IOException OooO0oO(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.f124388Oooo0OO) {
                    this.f124388Oooo0OO = false;
                    if (!this.f124383Oooo0 && !this.f124387Oooo0O0) {
                        z = true;
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? OooO0OO(iOException) : iOException;
    }

    public final Socket OooO0oo() {
        RealConnection realConnection = this.f124384Oooo000;
        OooOOO0.OooO0Oo(realConnection);
        byte[] bArr = Util.f124301OooO00o;
        ArrayList arrayList = realConnection.f124411OooOOOo;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (OooOOO0.OooO0O0(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f124384Oooo000 = null;
        if (arrayList.isEmpty()) {
            realConnection.f124412OooOOo0 = System.nanoTime();
            if (this.f124376OooOoO.OooO0OO(realConnection)) {
                Socket socket = realConnection.f124400OooO0Oo;
                OooOOO0.OooO0Oo(socket);
                return socket;
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.f124390Oooo0o0) {
            return;
        }
        this.f124390Oooo0o0 = true;
        Exchange exchange = this.f124389Oooo0o;
        if (exchange != null) {
            exchange.f124349OooO0Oo.cancel();
        }
        RealConnection realConnection = this.f124391Oooo0oO;
        if (realConnection != null && (socket = realConnection.f124399OooO0OO) != null) {
            Util.OooO0Oo(socket);
        }
        this.f124378OooOoOO.getClass();
    }

    public final Object clone() {
        return new RealCall(this.f124375OooOo0o, this.f124374OooOo, this.f124377OooOoO0);
    }

    @Override // okhttp3.Call
    public final Response execute() {
        if (!this.f124379OooOoo.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        enter();
        Platform.f124683OooO00o.getClass();
        this.f124381OooOooO = Platform.f124684OooO0O0.OooO0oO();
        this.f124378OooOoOO.OooO0OO(this);
        try {
            Dispatcher dispatcher = this.f124375OooOo0o.f124174OooOo0o;
            synchronized (dispatcher) {
                dispatcher.f124107OooO0o0.add(this);
            }
            return OooO0o0();
        } finally {
            Dispatcher dispatcher2 = this.f124375OooOo0o.f124174OooOo0o;
            dispatcher2.getClass();
            dispatcher2.OooO0O0(dispatcher2.f124107OooO0o0, this);
        }
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public final boolean getF124390Oooo0o0() {
        return this.f124390Oooo0o0;
    }

    @Override // okhttp3.Call
    public final void o0000O0O(Callback callback) {
        AsyncCall next;
        if (!this.f124379OooOoo.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f124683OooO00o.getClass();
        this.f124381OooOooO = Platform.f124684OooO0O0.OooO0oO();
        this.f124378OooOoOO.OooO0OO(this);
        Dispatcher dispatcher = this.f124375OooOo0o.f124174OooOo0o;
        AsyncCall asyncCall = new AsyncCall(this, callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.f124105OooO0OO.add(asyncCall);
            if (!this.f124377OooOoO0) {
                String str = this.f124374OooOo.f124238OooO00o.f124132OooO0Oo;
                Iterator<AsyncCall> it = dispatcher.f124106OooO0Oo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<AsyncCall> it2 = dispatcher.f124105OooO0OO.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (OooOOO0.OooO0O0(next.f124394OooOoO0.f124374OooOo.f124238OooO00o.f124132OooO0Oo, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        next = it.next();
                        if (OooOOO0.OooO0O0(next.f124394OooOoO0.f124374OooOo.f124238OooO00o.f124132OooO0Oo, str)) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    asyncCall.f124392OooOo = next.f124392OooOo;
                }
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        dispatcher.OooO0Oo();
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: request, reason: from getter */
    public final Request getF124374OooOo() {
        return this.f124374OooOo;
    }
}

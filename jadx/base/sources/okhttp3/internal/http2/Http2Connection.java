package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2Connection implements Closeable {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final Companion f124524OoooOOO = new Companion(0);

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final Settings f124525OoooOOo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashMap f124526OooOo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Listener f124527OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f124528OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f124529OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f124530OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final TaskRunner f124531OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f124532OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final TaskQueue f124533OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final TaskQueue f124534OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f124535Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f124536Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final TaskQueue f124537Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final PushObserver f124538Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f124539Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f124540Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f124541Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Settings f124542Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public long f124543Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Settings f124544Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f124545Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Http2Writer f124546OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f124547OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f124548OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Socket f124549OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final ReaderRunnable f124550OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final LinkedHashSet f124551o000oOoO;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TaskRunner f124552OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Socket f124553OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f124554OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public C34542OooOo0O f124555OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Listener f124556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public C34540OooOo0 f124557OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final PushObserver f124558OooO0oO;

        public Builder(TaskRunner taskRunner) {
            OooOOO0.OooO0oO(taskRunner, "taskRunner");
            this.f124552OooO00o = taskRunner;
            this.f124556OooO0o = Listener.f124559OooO00o;
            this.f124558OooO0oO = PushObserver.f124648OooO00o;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static abstract class Listener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f124559OooO00o;

        @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f124559OooO00o = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void OooO0O0(Http2Stream http2Stream) throws IOException {
                    http2Stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void OooO00o(Http2Connection connection, Settings settings) {
            OooOOO0.OooO0oO(connection, "connection");
            OooOOO0.OooO0oO(settings, "settings");
        }

        public abstract void OooO0O0(Http2Stream http2Stream) throws IOException;
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Http2Connection f124560OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Http2Reader f124561OooOo0o;

        public ReaderRunnable(Http2Connection this$0, Http2Reader http2Reader) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124560OooOo = this$0;
            this.f124561OooOo0o = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
        
            if (r17 == false) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        
            r4.OooOO0(okhttp3.internal.Util.f124302OooO0O0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(final boolean z, final int i, C34542OooOo0O source, final int i2) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            OooOOO0.OooO0oO(source, "source");
            this.f124560OooOo.getClass();
            if (!(i != 0 && (i & 1) == 0)) {
                Http2Stream http2StreamOooOOO0 = this.f124560OooOo.OooOOO0(i);
                if (http2StreamOooOOO0 != null) {
                    byte[] bArr = Util.f124301OooO00o;
                    Http2Stream.FramingSource framingSource = http2StreamOooOOO0.f124610OooO;
                    long j2 = i2;
                    framingSource.getClass();
                    while (true) {
                        if (j2 <= 0) {
                            break;
                        }
                        synchronized (framingSource.f124633OooOoo0) {
                            z2 = framingSource.f124628OooOo;
                            z3 = framingSource.f124630OooOoO.f123723OooOo + j2 > framingSource.f124629OooOo0o;
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                        if (z3) {
                            source.skip(j2);
                            framingSource.f124633OooOoo0.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                            break;
                        }
                        if (z2) {
                            source.skip(j2);
                            break;
                        }
                        long j3 = source.read(framingSource.f124631OooOoO0, j2);
                        if (j3 == -1) {
                            throw new EOFException();
                        }
                        j2 -= j3;
                        Http2Stream http2Stream = framingSource.f124633OooOoo0;
                        synchronized (http2Stream) {
                            try {
                                if (framingSource.f124632OooOoOO) {
                                    C34524OooO0Oo c34524OooO0Oo = framingSource.f124631OooOoO0;
                                    j = c34524OooO0Oo.f123723OooOo;
                                    c34524OooO0Oo.OooO00o();
                                } else {
                                    C34524OooO0Oo c34524OooO0Oo2 = framingSource.f124630OooOoO;
                                    boolean z4 = c34524OooO0Oo2.f123723OooOo == 0;
                                    c34524OooO0Oo2.o0000O00(framingSource.f124631OooOoO0);
                                    if (z4) {
                                        http2Stream.notifyAll();
                                    }
                                    j = 0;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (j > 0) {
                            framingSource.OooO00o(j);
                        }
                    }
                } else {
                    this.f124560OooOo.Oooo00o(i, ErrorCode.PROTOCOL_ERROR);
                    long j4 = i2;
                    this.f124560OooOo.OooOooo(j4);
                    source.skip(j4);
                }
            } else {
                final Http2Connection http2Connection = this.f124560OooOo;
                http2Connection.getClass();
                final C34524OooO0Oo c34524OooO0Oo3 = new C34524OooO0Oo();
                long j5 = i2;
                source.o0000OOO(j5);
                source.read(c34524OooO0Oo3, j5);
                final String str = http2Connection.f124529OooOoO0 + '[' + i + "] onData";
                http2Connection.f124534OooOooo.OooO0OO(new Task(str, http2Connection, i, c34524OooO0Oo3, i2, z) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1

                    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                    public final /* synthetic */ int f124571OooO0o;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f124572OooO0o0;

                    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                    public final /* synthetic */ C34524OooO0Oo f124573OooO0oO;

                    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
                    public final /* synthetic */ int f124574OooO0oo;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        try {
                            PushObserver pushObserver = this.f124572OooO0o0.f124538Oooo00O;
                            C34524OooO0Oo c34524OooO0Oo4 = this.f124573OooO0oO;
                            int i3 = this.f124574OooO0oo;
                            ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                            c34524OooO0Oo4.skip(i3);
                            this.f124572OooO0o0.f124546OoooO.OooOOoo(this.f124571OooO0o, ErrorCode.CANCEL);
                            synchronized (this.f124572OooO0o0) {
                                this.f124572OooO0o0.f124551o000oOoO.remove(Integer.valueOf(this.f124571OooO0o));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void OooO0O0(final int i, final List list, final boolean z) {
            this.f124560OooOo.getClass();
            if (i != 0 && (i & 1) == 0) {
                final Http2Connection http2Connection = this.f124560OooOo;
                http2Connection.getClass();
                final String str = http2Connection.f124529OooOoO0 + '[' + i + "] onHeaders";
                http2Connection.f124534OooOooo.OooO0OO(new Task(str, http2Connection, i, list, z) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1

                    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                    public final /* synthetic */ int f124575OooO0o;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f124576OooO0o0;

                    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                    public final /* synthetic */ List f124577OooO0oO;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        ((PushObserver.Companion.PushObserverCancel) this.f124576OooO0o0.f124538Oooo00O).getClass();
                        try {
                            this.f124576OooO0o0.f124546OoooO.OooOOoo(this.f124575OooO0o, ErrorCode.CANCEL);
                            synchronized (this.f124576OooO0o0) {
                                this.f124576OooO0o0.f124551o000oOoO.remove(Integer.valueOf(this.f124575OooO0o));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            final Http2Connection http2Connection2 = this.f124560OooOo;
            synchronized (http2Connection2) {
                Http2Stream http2StreamOooOOO0 = http2Connection2.OooOOO0(i);
                if (http2StreamOooOOO0 != null) {
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    http2StreamOooOOO0.OooOO0(Util.OooOo0o(list), z);
                    return;
                }
                if (http2Connection2.f124532OooOoo0) {
                    return;
                }
                if (i <= http2Connection2.f124528OooOoO) {
                    return;
                }
                if (i % 2 == http2Connection2.f124530OooOoOO % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i, http2Connection2, false, z, Util.OooOo0o(list));
                http2Connection2.f124528OooOoO = i;
                http2Connection2.f124526OooOo.put(Integer.valueOf(i), http2Stream);
                TaskQueue taskQueueOooO0o0 = http2Connection2.f124531OooOoo.OooO0o0();
                final String str2 = http2Connection2.f124529OooOoO0 + '[' + i + "] onStream";
                taskQueueOooO0o0.OooO0OO(new Task(str2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        try {
                            http2Connection2.f124527OooOo0o.OooO0O0(http2Stream);
                            return -1L;
                        } catch (IOException e) {
                            Platform.f124683OooO00o.getClass();
                            Platform platform = Platform.f124684OooO0O0;
                            String strOooOOO0 = OooOOO0.OooOOO0(http2Connection2.f124529OooOoO0, "Http2Connection.Listener failure for ");
                            platform.getClass();
                            Platform.OooO(strOooOOO0, 4, e);
                            try {
                                http2Stream.OooO0OO(ErrorCode.PROTOCOL_ERROR, e);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        public final void OooO0OO(final int i, final List list) {
            final Http2Connection http2Connection = this.f124560OooOo;
            http2Connection.getClass();
            synchronized (http2Connection) {
                if (http2Connection.f124551o000oOoO.contains(Integer.valueOf(i))) {
                    http2Connection.Oooo00o(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f124551o000oOoO.add(Integer.valueOf(i));
                TaskQueue taskQueue = http2Connection.f124534OooOooo;
                final String str = http2Connection.f124529OooOoO0 + '[' + i + "] onRequest";
                taskQueue.OooO0OO(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        ((PushObserver.Companion.PushObserverCancel) http2Connection.f124538Oooo00O).getClass();
                        try {
                            http2Connection.f124546OoooO.OooOOoo(i, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.f124551o000oOoO.remove(Integer.valueOf(i));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ?? r0 = this.f124560OooOo;
            Http2Reader http2Reader = this.f124561OooOo0o;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r3 = 1;
            IOException e = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                    errorCode = errorCode2;
                }
                if (!http2Reader.OooO00o(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (http2Reader.OooO00o(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    r0.OooO00o(errorCode, errorCode2, null);
                    r3 = errorCode;
                } catch (IOException e3) {
                    e = e3;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    r0.OooO00o(errorCode2, errorCode2, e);
                    r3 = errorCode;
                }
                Util.OooO0OO(http2Reader);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th4) {
                th = th4;
            }
            r3 = errorCode2;
            r0.OooO00o(r3, errorCode2, e);
            Util.OooO0OO(http2Reader);
            throw th;
        }
    }

    static {
        Settings settings = new Settings();
        settings.OooO0OO(7, 65535);
        settings.OooO0OO(5, 16384);
        f124525OoooOOo = settings;
    }

    public Http2Connection(Builder builder) {
        this.f124527OooOo0o = builder.f124556OooO0o;
        String str = builder.f124554OooO0OO;
        if (str == null) {
            OooOOO0.OooOOOO("connectionName");
            throw null;
        }
        this.f124529OooOoO0 = str;
        this.f124530OooOoOO = 3;
        TaskRunner taskRunner = builder.f124552OooO00o;
        this.f124531OooOoo = taskRunner;
        this.f124533OooOooO = taskRunner.OooO0o0();
        this.f124534OooOooo = taskRunner.OooO0o0();
        this.f124537Oooo000 = taskRunner.OooO0o0();
        this.f124538Oooo00O = builder.f124558OooO0oO;
        Settings settings = new Settings();
        settings.OooO0OO(7, 16777216);
        this.f124542Oooo0o = settings;
        this.f124544Oooo0oO = f124525OoooOOo;
        this.f124547OoooO0 = r0.OooO00o();
        Socket socket = builder.f124553OooO0O0;
        if (socket == null) {
            OooOOO0.OooOOOO("socket");
            throw null;
        }
        this.f124549OoooO0O = socket;
        C34540OooOo0 c34540OooOo0 = builder.f124557OooO0o0;
        if (c34540OooOo0 == null) {
            OooOOO0.OooOOOO("sink");
            throw null;
        }
        this.f124546OoooO = new Http2Writer(c34540OooOo0);
        C34542OooOo0O c34542OooOo0O = builder.f124555OooO0Oo;
        if (c34542OooOo0O == null) {
            OooOOO0.OooOOOO("source");
            throw null;
        }
        this.f124550OoooOO0 = new ReaderRunnable(this, new Http2Reader(c34542OooOo0O));
        this.f124551o000oOoO = new LinkedHashSet();
    }

    public final void OooO00o(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        byte[] bArr = Util.f124301OooO00o;
        try {
            OooOOoo(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f124526OooOo.isEmpty()) {
                    array = null;
                } else {
                    array = this.f124526OooOo.values().toArray(new Http2Stream[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    this.f124526OooOo.clear();
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.OooO0OO(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f124546OoooO.close();
        } catch (IOException unused3) {
        }
        try {
            this.f124549OoooO0O.close();
        } catch (IOException unused4) {
        }
        this.f124533OooOooO.OooO0o();
        this.f124534OooOooo.OooO0o();
        this.f124537Oooo000.OooO0o();
    }

    public final void OooO0OO(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        OooO00o(errorCode, errorCode, iOException);
    }

    public final synchronized Http2Stream OooOOO0(int i) {
        return (Http2Stream) this.f124526OooOo.get(Integer.valueOf(i));
    }

    public final synchronized Http2Stream OooOOo0(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f124526OooOo.remove(Integer.valueOf(i));
        notifyAll();
        return http2Stream;
    }

    public final void OooOOoo(ErrorCode errorCode) throws IOException {
        synchronized (this.f124546OoooO) {
            C24033OooOooo c24033OooOooo = new C24033OooOooo();
            synchronized (this) {
                if (this.f124532OooOoo0) {
                    return;
                }
                this.f124532OooOoo0 = true;
                int i = this.f124528OooOoO;
                c24033OooOooo.f80940OooOo0o = i;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                this.f124546OoooO.OooOOO0(i, errorCode, Util.f124301OooO00o);
            }
        }
    }

    public final synchronized void OooOooo(long j) {
        long j2 = this.f124545Oooo0oo + j;
        this.f124545Oooo0oo = j2;
        long j3 = j2 - this.f124535Oooo;
        if (j3 >= this.f124542Oooo0o.OooO00o() / 2) {
            Oooo0(0, j3);
            this.f124535Oooo += j3;
        }
    }

    public final void Oooo0(final int i, final long j) {
        final String str = this.f124529OooOoO0 + '[' + i + "] windowUpdate";
        this.f124533OooOooO.OooO0OO(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long OooO00o() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.f124546OoooO.o00000O(i, j);
                    return -1L;
                } catch (IOException e) {
                    Http2Connection.Companion companion = Http2Connection.f124524OoooOOO;
                    http2Connection.OooO0OO(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f124546OoooO.f124639OooOoO0);
        r6 = r2;
        r8.f124548OoooO00 += r6;
        r4 = oO00ooO.C32460OooOooO.f116667OooO00o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000(int i, boolean z, C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
        int iMin;
        long j2;
        if (j == 0) {
            this.f124546OoooO.o000O0O0(z, i, c34524OooO0Oo, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f124548OoooO00;
                            long j4 = this.f124547OoooO0;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f124526OooOo.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.f124546OoooO.o000O0O0(z && j == 0, i, c34524OooO0Oo, iMin);
        }
    }

    public final void Oooo00o(final int i, final ErrorCode errorCode) {
        final String str = this.f124529OooOoO0 + '[' + i + "] writeSynReset";
        this.f124533OooOooO.OooO0OO(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long OooO00o() {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.f124546OoooO.OooOOoo(i, errorCode);
                    return -1L;
                } catch (IOException e) {
                    Http2Connection.Companion companion = Http2Connection.f124524OoooOOO;
                    http2Connection.OooO0OO(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() throws IOException {
        this.f124546OoooO.flush();
    }
}

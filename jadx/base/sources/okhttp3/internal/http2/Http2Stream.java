package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo00OoO.C34523OooO0OO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2Stream {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final FramingSource f124610OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f124611OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Http2Connection f124612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f124613OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f124614OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f124615OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f124616OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayDeque<Headers> f124617OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f124618OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final FramingSink f124619OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final StreamTimeout f124620OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final StreamTimeout f124621OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public IOException f124622OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ErrorCode f124623OooOOO0;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "LoOo00OoO/OooOoO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class FramingSink implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C34524OooO0Oo f124624OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final boolean f124625OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f124626OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f124627OooOoO0;

        public FramingSink(Http2Stream this$0, boolean z) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124626OooOoO = this$0;
            this.f124625OooOo0o = z;
            this.f124624OooOo = new C34524OooO0Oo();
        }

        /* JADX WARN: Finally extract failed */
        public final void OooO00o(boolean z) throws IOException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = this.f124626OooOoO;
            synchronized (http2Stream) {
                try {
                    http2Stream.f124621OooOO0o.enter();
                    while (http2Stream.f124616OooO0o0 >= http2Stream.f124615OooO0o && !this.f124625OooOo0o && !this.f124627OooOoO0 && http2Stream.OooO0o() == null) {
                        try {
                            http2Stream.OooOO0o();
                        } catch (Throwable th) {
                            http2Stream.f124621OooOO0o.OooO00o();
                            throw th;
                        }
                    }
                    http2Stream.f124621OooOO0o.OooO00o();
                    http2Stream.OooO0O0();
                    jMin = Math.min(http2Stream.f124615OooO0o - http2Stream.f124616OooO0o0, this.f124624OooOo.f123723OooOo);
                    http2Stream.f124616OooO0o0 += jMin;
                    z2 = z && jMin == this.f124624OooOo.f123723OooOo;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f124626OooOoO.f124621OooOO0o.enter();
            try {
                Http2Stream http2Stream2 = this.f124626OooOoO;
                http2Stream2.f124612OooO0O0.Oooo000(http2Stream2.f124611OooO00o, z2, this.f124624OooOo, jMin);
            } finally {
                this.f124626OooOoO.f124621OooOO0o.OooO00o();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Http2Stream http2Stream = this.f124626OooOoO;
            byte[] bArr = Util.f124301OooO00o;
            synchronized (http2Stream) {
                if (this.f124627OooOoO0) {
                    return;
                }
                boolean z = http2Stream.OooO0o() == null;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                Http2Stream http2Stream2 = this.f124626OooOoO;
                if (!http2Stream2.f124619OooOO0.f124625OooOo0o) {
                    if (this.f124624OooOo.f123723OooOo > 0) {
                        while (this.f124624OooOo.f123723OooOo > 0) {
                            OooO00o(true);
                        }
                    } else if (z) {
                        http2Stream2.f124612OooO0O0.Oooo000(http2Stream2.f124611OooO00o, true, null, 0L);
                    }
                }
                synchronized (this.f124626OooOoO) {
                    this.f124627OooOoO0 = true;
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
                this.f124626OooOoO.f124612OooO0O0.flush();
                this.f124626OooOoO.OooO00o();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public final void flush() throws IOException {
            Http2Stream http2Stream = this.f124626OooOoO;
            byte[] bArr = Util.f124301OooO00o;
            synchronized (http2Stream) {
                http2Stream.OooO0O0();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            while (this.f124624OooOo.f123723OooOo > 0) {
                OooO00o(false);
                this.f124626OooOoO.f124612OooO0O0.flush();
            }
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final C34547OooOoo timeout() {
            return this.f124626OooOoO.f124621OooOO0o;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final void write(C34524OooO0Oo source, long j) throws IOException {
            OooOOO0.OooO0oO(source, "source");
            byte[] bArr = Util.f124301OooO00o;
            C34524OooO0Oo c34524OooO0Oo = this.f124624OooOo;
            c34524OooO0Oo.write(source, j);
            while (c34524OooO0Oo.f123723OooOo >= 16384) {
                OooO00o(false);
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "LoOo00OoO/OooOoo0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class FramingSource implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f124628OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f124629OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final C34524OooO0Oo f124630OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C34524OooO0Oo f124631OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f124632OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f124633OooOoo0;

        public FramingSource(Http2Stream this$0, long j, boolean z) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124633OooOoo0 = this$0;
            this.f124629OooOo0o = j;
            this.f124628OooOo = z;
            this.f124631OooOoO0 = new C34524OooO0Oo();
            this.f124630OooOoO = new C34524OooO0Oo();
        }

        public final void OooO00o(long j) {
            byte[] bArr = Util.f124301OooO00o;
            this.f124633OooOoo0.f124612OooO0O0.OooOooo(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            Http2Stream http2Stream = this.f124633OooOoo0;
            synchronized (http2Stream) {
                this.f124632OooOoOO = true;
                C34524OooO0Oo c34524OooO0Oo = this.f124630OooOoO;
                j = c34524OooO0Oo.f123723OooOo;
                c34524OooO0Oo.OooO00o();
                http2Stream.notifyAll();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            if (j > 0) {
                OooO00o(j);
            }
            this.f124633OooOoo0.OooO00o();
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws Throwable {
            Throwable streamResetException;
            boolean z;
            long j2;
            OooOOO0.OooO0oO(sink, "sink");
            long j3 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            while (true) {
                Http2Stream http2Stream = this.f124633OooOoo0;
                synchronized (http2Stream) {
                    http2Stream.f124620OooOO0O.enter();
                    try {
                        if (http2Stream.OooO0o() == null || this.f124628OooOo) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.f124622OooOOO;
                            if (streamResetException == null) {
                                ErrorCode errorCodeOooO0o = http2Stream.OooO0o();
                                OooOOO0.OooO0Oo(errorCodeOooO0o);
                                streamResetException = new StreamResetException(errorCodeOooO0o);
                            }
                        }
                        if (this.f124632OooOoOO) {
                            throw new IOException("stream closed");
                        }
                        C34524OooO0Oo c34524OooO0Oo = this.f124630OooOoO;
                        long j4 = c34524OooO0Oo.f123723OooOo;
                        z = false;
                        if (j4 > j3) {
                            j2 = c34524OooO0Oo.read(sink, Math.min(j, j4));
                            long j5 = http2Stream.f124613OooO0OO + j2;
                            http2Stream.f124613OooO0OO = j5;
                            long j6 = j5 - http2Stream.f124614OooO0Oo;
                            if (streamResetException == null && j6 >= http2Stream.f124612OooO0O0.f124542Oooo0o.OooO00o() / 2) {
                                http2Stream.f124612OooO0O0.Oooo0(http2Stream.f124611OooO00o, j6);
                                http2Stream.f124614OooO0Oo = http2Stream.f124613OooO0OO;
                            }
                        } else {
                            if (!this.f124628OooOo && streamResetException == null) {
                                http2Stream.OooOO0o();
                                z = true;
                            }
                            j2 = -1;
                        }
                        http2Stream.f124620OooOO0O.OooO00o();
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } finally {
                    }
                }
                if (!z) {
                    if (j2 != -1) {
                        OooO00o(j2);
                        return j2;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j3 = 0;
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final C34547OooOoo timeout() {
            return this.f124633OooOoo0.f124620OooOO0O;
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "LoOo00OoO/OooO0OO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class StreamTimeout extends C34523OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f124634OooO00o;

        public StreamTimeout(Http2Stream this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124634OooO00o = this$0;
        }

        public final void OooO00o() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // oOo00OoO.C34523OooO0OO
        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // oOo00OoO.C34523OooO0OO
        public final void timedOut() {
            this.f124634OooO00o.OooO0o0(ErrorCode.CANCEL);
            final Http2Connection http2Connection = this.f124634OooO00o.f124612OooO0O0;
            synchronized (http2Connection) {
                long j = http2Connection.f124541Oooo0OO;
                long j2 = http2Connection.f124540Oooo0O0;
                if (j < j2) {
                    return;
                }
                http2Connection.f124540Oooo0O0 = j2 + 1;
                http2Connection.f124543Oooo0o0 = System.nanoTime() + ((long) 1000000000);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                TaskQueue taskQueue = http2Connection.f124533OooOooO;
                final String strOooOOO0 = OooOOO0.OooOOO0(" ping", http2Connection.f124529OooOoO0);
                taskQueue.OooO0OO(new Task(strOooOOO0) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.f124546OoooO.o0000oo0(2, 0, false);
                            return -1L;
                        } catch (IOException e) {
                            http2Connection2.OooO0OO(e);
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i, Http2Connection connection, boolean z, boolean z2, Headers headers) {
        OooOOO0.OooO0oO(connection, "connection");
        this.f124611OooO00o = i;
        this.f124612OooO0O0 = connection;
        this.f124615OooO0o = connection.f124544Oooo0oO.OooO00o();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f124617OooO0oO = arrayDeque;
        this.f124610OooO = new FramingSource(this, connection.f124542Oooo0o.OooO00o(), z2);
        this.f124619OooOO0 = new FramingSink(this, z);
        this.f124620OooOO0O = new StreamTimeout(this);
        this.f124621OooOO0o = new StreamTimeout(this);
        if (headers == null) {
            if (!OooO0oo()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (OooO0oo()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    public final synchronized boolean OooO() {
        if (this.f124623OooOOO0 != null) {
            return false;
        }
        FramingSource framingSource = this.f124610OooO;
        if (framingSource.f124628OooOo || framingSource.f124632OooOoOO) {
            FramingSink framingSink = this.f124619OooOO0;
            if (framingSink.f124625OooOo0o || framingSink.f124627OooOoO0) {
                if (this.f124618OooO0oo) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o() throws IOException {
        boolean z;
        boolean zOooO;
        byte[] bArr = Util.f124301OooO00o;
        synchronized (this) {
            FramingSource framingSource = this.f124610OooO;
            if (framingSource.f124628OooOo || !framingSource.f124632OooOoOO) {
                z = false;
                zOooO = OooO();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                FramingSink framingSink = this.f124619OooOO0;
                if (framingSink.f124625OooOo0o || framingSink.f124627OooOoO0) {
                    z = true;
                }
                zOooO = OooO();
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            }
        }
        if (z) {
            OooO0OO(ErrorCode.CANCEL, null);
        } else {
            if (zOooO) {
                return;
            }
            this.f124612OooO0O0.OooOOo0(this.f124611OooO00o);
        }
    }

    public final void OooO0O0() throws IOException {
        FramingSink framingSink = this.f124619OooOO0;
        if (framingSink.f124627OooOoO0) {
            throw new IOException("stream closed");
        }
        if (framingSink.f124625OooOo0o) {
            throw new IOException("stream finished");
        }
        if (this.f124623OooOOO0 != null) {
            IOException iOException = this.f124622OooOOO;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f124623OooOOO0;
            OooOOO0.OooO0Oo(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void OooO0OO(ErrorCode errorCode, IOException iOException) throws IOException {
        if (OooO0Oo(errorCode, iOException)) {
            this.f124612OooO0O0.f124546OoooO.OooOOoo(this.f124611OooO00o, errorCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.f124301OooO00o;
        synchronized (this) {
            if (OooO0o() != null) {
                return false;
            }
            if (this.f124610OooO.f124628OooOo && this.f124619OooOO0.f124625OooOo0o) {
                return false;
            }
            this.f124623OooOOO0 = errorCode;
            this.f124622OooOOO = iOException;
            notifyAll();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            this.f124612OooO0O0.OooOOo0(this.f124611OooO00o);
            return true;
        }
    }

    public final synchronized ErrorCode OooO0o() {
        return this.f124623OooOOO0;
    }

    public final void OooO0o0(ErrorCode errorCode) {
        if (OooO0Oo(errorCode, null)) {
            this.f124612OooO0O0.Oooo00o(this.f124611OooO00o, errorCode);
        }
    }

    public final FramingSink OooO0oO() {
        synchronized (this) {
            try {
                if (!this.f124618OooO0oo && !OooO0oo()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f124619OooOO0;
    }

    public final boolean OooO0oo() {
        boolean z = (this.f124611OooO00o & 1) == 1;
        this.f124612OooO0O0.getClass();
        return true == z;
    }

    public final void OooOO0(Headers headers, boolean z) {
        boolean zOooO;
        OooOOO0.OooO0oO(headers, "headers");
        byte[] bArr = Util.f124301OooO00o;
        synchronized (this) {
            try {
                if (this.f124618OooO0oo && z) {
                    this.f124610OooO.getClass();
                } else {
                    this.f124618OooO0oo = true;
                    this.f124617OooO0oO.add(headers);
                }
                if (z) {
                    this.f124610OooO.f124628OooOo = true;
                }
                zOooO = OooO();
                notifyAll();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zOooO) {
            return;
        }
        this.f124612OooO0O0.OooOOo0(this.f124611OooO00o);
    }

    public final synchronized void OooOO0O(ErrorCode errorCode) {
        if (this.f124623OooOOO0 == null) {
            this.f124623OooOOO0 = errorCode;
            notifyAll();
        }
    }

    public final void OooOO0o() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

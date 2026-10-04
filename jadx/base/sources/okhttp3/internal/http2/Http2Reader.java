package okhttp3.internal.http2;

import Oooo.OooO0OO;
import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import androidx.core.content.C21650OooOoO;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O00oo.C32519OooO0oO;
import oO0O00oo.OooOO0;
import oOo000Oo.OooOo;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.PushObserver;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Companion", "ContinuationSource", "Handler", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Companion f124599OooOoO = new Companion(0);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final Logger f124600OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ContinuationSource f124601OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34542OooOo0O f124602OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Hpack.Reader f124603OooOoO0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int OooO00o(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(C20855OooooOO.OooO0OO(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "LoOo00OoO/OooOoo0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class ContinuationSource implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f124604OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34542OooOo0O f124605OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f124606OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f124607OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f124608OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f124609OooOoo0;

        public ContinuationSource(C34542OooOo0O source) {
            OooOOO0.OooO0oO(source, "source");
            this.f124605OooOo0o = source;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            int i;
            int i2;
            OooOOO0.OooO0oO(sink, "sink");
            do {
                int i3 = this.f124608OooOoOO;
                C34542OooOo0O c34542OooOo0O = this.f124605OooOo0o;
                if (i3 == 0) {
                    c34542OooOo0O.skip(this.f124609OooOoo0);
                    this.f124609OooOoo0 = 0;
                    if ((this.f124607OooOoO0 & 4) == 0) {
                        i = this.f124606OooOoO;
                        int iOooOo00 = Util.OooOo00(c34542OooOo0O);
                        this.f124608OooOoOO = iOooOo00;
                        this.f124604OooOo = iOooOo00;
                        int i4 = c34542OooOo0O.readByte() & 255;
                        this.f124607OooOoO0 = c34542OooOo0O.readByte() & 255;
                        Http2Reader.f124599OooOoO.getClass();
                        Logger logger = Http2Reader.f124600OooOoOO;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.f124519OooO00o;
                            int i5 = this.f124606OooOoO;
                            int i6 = this.f124604OooOo;
                            int i7 = this.f124607OooOoO0;
                            http2.getClass();
                            logger.fine(Http2.OooO00o(true, i5, i6, i4, i7));
                        }
                        i2 = c34542OooOo0O.readInt() & Integer.MAX_VALUE;
                        this.f124606OooOoO = i2;
                        if (i4 != 9) {
                            throw new IOException(C21650OooOoO.OooO00o(i4, " != TYPE_CONTINUATION"));
                        }
                    }
                } else {
                    long j2 = c34542OooOo0O.read(sink, Math.min(j, i3));
                    if (j2 != -1) {
                        this.f124608OooOoOO -= (int) j2;
                        return j2;
                    }
                }
                return -1L;
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final C34547OooOoo timeout() {
            return this.f124605OooOo0o.f123777OooOo0o.timeout();
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        OooOOO0.OooO0o(logger, "getLogger(Http2::class.java.name)");
        f124600OooOoOO = logger;
    }

    public Http2Reader(C34542OooOo0O source) {
        OooOOO0.OooO0oO(source, "source");
        this.f124602OooOo0o = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f124601OooOo = continuationSource;
        this.f124603OooOoO0 = new Hpack.Reader(continuationSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0274, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.OooOOO0.OooOOO0(java.lang.Integer.valueOf(r12), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(boolean z, final Http2Connection.ReaderRunnable readerRunnable) throws IOException {
        final ErrorCode errorCode;
        Object[] array;
        C34542OooOo0O c34542OooOo0O = this.f124602OooOo0o;
        try {
            c34542OooOo0O.o0000OOO(9L);
            int iOooOo00 = Util.OooOo00(c34542OooOo0O);
            if (iOooOo00 > 16384) {
                throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(iOooOo00), "FRAME_SIZE_ERROR: "));
            }
            int i = c34542OooOo0O.readByte() & 255;
            byte b = c34542OooOo0O.readByte();
            int i2 = b & 255;
            int i3 = c34542OooOo0O.readInt();
            final int i4 = i3 & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f124600OooOoOO;
            if (logger.isLoggable(level)) {
                Http2.f124519OooO00o.getClass();
                logger.fine(Http2.OooO00o(true, i4, iOooOo00, i, i2));
            }
            if (z && i != 4) {
                Http2.f124519OooO00o.getClass();
                String[] strArr = Http2.f124521OooO0OO;
                throw new IOException(OooOOO0.OooOOO0(i < strArr.length ? strArr[i] : Util.OooO("0x%02x", Integer.valueOf(i)), "Expected a SETTINGS frame but was "));
            }
            Companion companion = f124599OooOoO;
            int i5 = 2;
            ErrorCode errorCode2 = null;
            switch (i) {
                case 0:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (b & 1) != 0;
                    if ((b & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i6 = (8 & b) != 0 ? c34542OooOo0O.readByte() & 255 : 0;
                    companion.getClass();
                    readerRunnable.OooO00o(z2, i4, c34542OooOo0O, Companion.OooO00o(iOooOo00, i2, i6));
                    c34542OooOo0O.skip(i6);
                    return true;
                case 1:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (b & 1) != 0;
                    int i7 = (8 & b) != 0 ? c34542OooOo0O.readByte() & 255 : 0;
                    if ((b & 32) != 0) {
                        OooOOO0(readerRunnable, i4);
                        iOooOo00 -= 5;
                    }
                    companion.getClass();
                    readerRunnable.OooO0O0(i4, OooO0OO(Companion.OooO00o(iOooOo00, i2, i7), i7, i2, i4), z3);
                    return true;
                case 2:
                    if (iOooOo00 != 5) {
                        throw new IOException(o0Oo0oo.OooO0O0(iOooOo00, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    OooOOO0(readerRunnable, i4);
                    return true;
                case 3:
                    if (iOooOo00 != 4) {
                        throw new IOException(o0Oo0oo.OooO0O0(iOooOo00, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i4 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i8 = c34542OooOo0O.readInt();
                    ErrorCode.f124483OooOo.getClass();
                    ErrorCode[] errorCodeArrValues = ErrorCode.values();
                    int length = errorCodeArrValues.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            errorCode = errorCodeArrValues[i9];
                            if (errorCode.f124491OooOo0o != i8) {
                                i9++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(i8), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    final Http2Connection http2Connection = readerRunnable.f124560OooOo;
                    http2Connection.getClass();
                    if (i4 == 0 || (i3 & 1) != 0) {
                        Http2Stream http2StreamOooOOo0 = http2Connection.OooOOo0(i4);
                        if (http2StreamOooOOo0 != null) {
                            http2StreamOooOOo0.OooOO0O(errorCode);
                            return true;
                        }
                        return true;
                    }
                    final String str = http2Connection.f124529OooOoO0 + '[' + i4 + "] onReset";
                    http2Connection.f124534OooOooo.OooO0OO(new Task(str, http2Connection, i4, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1

                        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                        public final /* synthetic */ int f124581OooO0o;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public final /* synthetic */ Http2Connection f124582OooO0o0;

                        @Override // okhttp3.internal.concurrent.Task
                        public final long OooO00o() {
                            ((PushObserver.Companion.PushObserverCancel) this.f124582OooO0o0.f124538Oooo00O).getClass();
                            synchronized (this.f124582OooO0o0) {
                                this.f124582OooO0o0.f124551o000oOoO.remove(Integer.valueOf(this.f124581OooO0o));
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            }
                            return -1L;
                        }
                    }, 0L);
                    return true;
                case 4:
                    if (i4 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) != 0) {
                        if (iOooOo00 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iOooOo00 % 6 != 0) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(iOooOo00), "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    final Settings settings = new Settings();
                    C32519OooO0oO c32519OooO0oOOooO0oo = OooOO0.OooO0oo(OooOO0.OooO(0, iOooOo00), 6);
                    int i10 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                    int i11 = c32519OooO0oOOooO0oo.f116811OooOo;
                    int i12 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        while (true) {
                            int i13 = i10 + i12;
                            short s = c34542OooOo0O.readShort();
                            byte[] bArr = Util.f124301OooO00o;
                            int i14 = s & 65535;
                            int i15 = c34542OooOo0O.readInt();
                            if (i14 != i5) {
                                if (i14 == 3) {
                                    i14 = 4;
                                } else if (i14 == 4) {
                                    if (i15 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i14 = 7;
                                } else if (i14 == 5 && (i15 < 16384 || i15 > 16777215)) {
                                }
                            } else if (i15 != 0 && i15 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.OooO0OO(i14, i15);
                            if (i10 != i11) {
                                i10 = i13;
                                i5 = 2;
                            }
                            break;
                        }
                    }
                    Http2Connection http2Connection2 = readerRunnable.f124560OooOo;
                    TaskQueue taskQueue = http2Connection2.f124533OooOooO;
                    final String strOooOOO0 = OooOOO0.OooOOO0(" applyAndAckSettings", http2Connection2.f124529OooOoO0);
                    taskQueue.OooO0OO(new Task(strOooOOO0) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v0, types: [T, okhttp3.internal.http2.Settings] */
                        @Override // okhttp3.internal.concurrent.Task
                        public final long OooO00o() {
                            long jOooO00o;
                            int i16;
                            Http2Stream[] http2StreamArr;
                            Http2Connection.ReaderRunnable readerRunnable2 = readerRunnable;
                            Settings settings2 = settings;
                            readerRunnable2.getClass();
                            final C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                            final Http2Connection http2Connection3 = readerRunnable2.f124560OooOo;
                            synchronized (http2Connection3.f124546OoooO) {
                                synchronized (http2Connection3) {
                                    try {
                                        Settings settings3 = http2Connection3.f124544Oooo0oO;
                                        ?? settings4 = new Settings();
                                        settings4.OooO0O0(settings3);
                                        settings4.OooO0O0(settings2);
                                        c24034Oooo00O.f80942OooOo0o = settings4;
                                        jOooO00o = ((long) settings4.OooO00o()) - ((long) settings3.OooO00o());
                                        i16 = 0;
                                        if (jOooO00o == 0 || http2Connection3.f124526OooOo.isEmpty()) {
                                            http2StreamArr = null;
                                        } else {
                                            Object[] array2 = http2Connection3.f124526OooOo.values().toArray(new Http2Stream[0]);
                                            if (array2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                            }
                                            http2StreamArr = (Http2Stream[]) array2;
                                        }
                                        Settings settings5 = (Settings) c24034Oooo00O.f80942OooOo0o;
                                        OooOOO0.OooO0oO(settings5, "<set-?>");
                                        http2Connection3.f124544Oooo0oO = settings5;
                                        http2Connection3.f124537Oooo000.OooO0OO(new Task(OooOOO0.OooOOO0(" onSettings", http2Connection3.f124529OooOoO0)) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // okhttp3.internal.concurrent.Task
                                            public final long OooO00o() {
                                                Http2Connection http2Connection4 = http2Connection3;
                                                http2Connection4.f124527OooOo0o.OooO00o(http2Connection4, (Settings) c24034Oooo00O.f80942OooOo0o);
                                                return -1L;
                                            }
                                        }, 0L);
                                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                try {
                                    http2Connection3.f124546OoooO.OooO00o((Settings) c24034Oooo00O.f80942OooOo0o);
                                } catch (IOException e) {
                                    http2Connection3.OooO0OO(e);
                                }
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                            }
                            if (http2StreamArr == null) {
                                return -1L;
                            }
                            int length2 = http2StreamArr.length;
                            while (i16 < length2) {
                                Http2Stream http2Stream = http2StreamArr[i16];
                                i16++;
                                synchronized (http2Stream) {
                                    http2Stream.f124615OooO0o += jOooO00o;
                                    if (jOooO00o > 0) {
                                        http2Stream.notifyAll();
                                    }
                                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                }
                            }
                            return -1L;
                        }
                    }, 0L);
                    return true;
                case 5:
                    if (i4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i16 = (b & 8) != 0 ? c34542OooOo0O.readByte() & 255 : 0;
                    int i17 = c34542OooOo0O.readInt() & Integer.MAX_VALUE;
                    companion.getClass();
                    readerRunnable.OooO0OO(i17, OooO0OO(Companion.OooO00o(iOooOo00 - 4, i2, i16), i16, i2, i4));
                    return true;
                case 6:
                    if (iOooOo00 != 8) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(iOooOo00), "TYPE_PING length != 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int i18 = c34542OooOo0O.readInt();
                    final int i19 = c34542OooOo0O.readInt();
                    if ((b & 1) == 0) {
                        Http2Connection http2Connection3 = readerRunnable.f124560OooOo;
                        TaskQueue taskQueue2 = http2Connection3.f124533OooOooO;
                        final String strOooOOO02 = OooOOO0.OooOOO0(" ping", http2Connection3.f124529OooOoO0);
                        final Http2Connection http2Connection4 = readerRunnable.f124560OooOo;
                        taskQueue2.OooO0OO(new Task(strOooOOO02) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public final long OooO00o() {
                                int i20 = i18;
                                int i21 = i19;
                                Http2Connection http2Connection5 = http2Connection4;
                                http2Connection5.getClass();
                                try {
                                    http2Connection5.f124546OoooO.o0000oo0(i20, i21, true);
                                    return -1L;
                                } catch (IOException e) {
                                    http2Connection5.OooO0OO(e);
                                    return -1L;
                                }
                            }
                        }, 0L);
                        return true;
                    }
                    Http2Connection http2Connection5 = readerRunnable.f124560OooOo;
                    synchronized (http2Connection5) {
                        try {
                            if (i18 == 1) {
                                http2Connection5.f124536Oooo0++;
                            } else if (i18 != 2) {
                                if (i18 == 3) {
                                    http2Connection5.notifyAll();
                                }
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } else {
                                http2Connection5.f124541Oooo0OO++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iOooOo00 < 8) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(iOooOo00), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i4 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i20 = c34542OooOo0O.readInt();
                    int i21 = c34542OooOo0O.readInt();
                    int i22 = iOooOo00 - 8;
                    ErrorCode.f124483OooOo.getClass();
                    ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                    int length2 = errorCodeArrValues2.length;
                    int i23 = 0;
                    while (true) {
                        if (i23 < length2) {
                            ErrorCode errorCode3 = errorCodeArrValues2[i23];
                            if (errorCode3.f124491OooOo0o == i21) {
                                errorCode2 = errorCode3;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(i21), "TYPE_GOAWAY unexpected error code: "));
                    }
                    C34527OooO0oO debugData = C34527OooO0oO.f123734OooOoO;
                    if (i22 > 0) {
                        debugData = c34542OooOo0O.OoooO0O(i22);
                    }
                    OooOOO0.OooO0oO(debugData, "debugData");
                    debugData.OooO0OO();
                    Http2Connection http2Connection6 = readerRunnable.f124560OooOo;
                    synchronized (http2Connection6) {
                        array = http2Connection6.f124526OooOo.values().toArray(new Http2Stream[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        http2Connection6.f124532OooOoo0 = true;
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    }
                    Http2Stream[] http2StreamArr = (Http2Stream[]) array;
                    int length3 = http2StreamArr.length;
                    int i24 = 0;
                    while (i24 < length3) {
                        Http2Stream http2Stream = http2StreamArr[i24];
                        i24++;
                        if (http2Stream.f124611OooO00o > i20 && http2Stream.OooO0oo()) {
                            http2Stream.OooOO0O(ErrorCode.REFUSED_STREAM);
                            readerRunnable.f124560OooOo.OooOOo0(http2Stream.f124611OooO00o);
                        }
                    }
                    return true;
                case 8:
                    if (iOooOo00 != 4) {
                        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(iOooOo00), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) c34542OooOo0O.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i4 == 0) {
                        Http2Connection http2Connection7 = readerRunnable.f124560OooOo;
                        synchronized (http2Connection7) {
                            http2Connection7.f124547OoooO0 += j;
                            http2Connection7.notifyAll();
                            C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                        }
                        return true;
                    }
                    Http2Stream http2StreamOooOOO0 = readerRunnable.f124560OooOo.OooOOO0(i4);
                    if (http2StreamOooOOO0 != null) {
                        synchronized (http2StreamOooOOO0) {
                            http2StreamOooOOO0.f124615OooO0o += j;
                            if (j > 0) {
                                http2StreamOooOOO0.notifyAll();
                            }
                            C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                        }
                        return true;
                    }
                    return true;
                default:
                    c34542OooOo0O.skip(iOooOo00);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.OooOOO0.OooOOO0(java.lang.Integer.valueOf(r8), "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Header> OooO0OO(int i, int i2, int i3, int i4) throws IOException {
        Hpack.Reader reader;
        ContinuationSource continuationSource = this.f124601OooOo;
        continuationSource.f124608OooOoOO = i;
        continuationSource.f124604OooOo = i;
        continuationSource.f124609OooOoo0 = i2;
        continuationSource.f124607OooOoO0 = i3;
        continuationSource.f124606OooOoO = i4;
        while (true) {
            reader = this.f124603OooOoO0;
            C34542OooOo0O c34542OooOo0O = reader.f124506OooO0OO;
            boolean zO0000o0O = c34542OooOo0O.o0000o0O();
            ArrayList arrayList = reader.f124505OooO0O0;
            if (zO0000o0O) {
                List<Header> listO0ooOO0 = OooOo.o0ooOO0(arrayList);
                arrayList.clear();
                return listO0ooOO0;
            }
            byte b = c34542OooOo0O.readByte();
            byte[] bArr = Util.f124301OooO00o;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                int iOooO0o0 = reader.OooO0o0(i5, 127);
                int i6 = iOooO0o0 - 1;
                if (i6 >= 0) {
                    Hpack hpack = Hpack.f124501OooO00o;
                    hpack.getClass();
                    Header[] headerArr = Hpack.f124502OooO0O0;
                    if (i6 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i6]);
                    }
                }
                Hpack.f124501OooO00o.getClass();
                int length = reader.f124509OooO0o0 + 1 + (i6 - Hpack.f124502OooO0O0.length);
                if (length < 0) {
                    break;
                }
                Header[] headerArr2 = reader.f124507OooO0Oo;
                if (length >= headerArr2.length) {
                    break;
                }
                Header header = headerArr2[length];
                OooOOO0.OooO0Oo(header);
                arrayList.add(header);
            } else if (i5 == 64) {
                Hpack hpack2 = Hpack.f124501OooO00o;
                C34527OooO0oO c34527OooO0oOOooO0Oo = reader.OooO0Oo();
                hpack2.getClass();
                Hpack.OooO00o(c34527OooO0oOOooO0Oo);
                reader.OooO0OO(new Header(c34527OooO0oOOooO0Oo, reader.OooO0Oo()));
            } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                reader.OooO0OO(new Header(reader.OooO0O0(reader.OooO0o0(i5, 63) - 1), reader.OooO0Oo()));
            } else if ((b & 32) == 32) {
                int iOooO0o02 = reader.OooO0o0(i5, 31);
                reader.f124504OooO00o = iOooO0o02;
                if (iOooO0o02 < 0 || iOooO0o02 > 4096) {
                    break;
                }
                int i7 = reader.f124510OooO0oO;
                if (iOooO0o02 < i7) {
                    if (iOooO0o02 == 0) {
                        Header[] headerArr3 = reader.f124507OooO0Oo;
                        OooO0OO.OooOOOO(headerArr3, null, 0, headerArr3.length);
                        reader.f124509OooO0o0 = reader.f124507OooO0Oo.length - 1;
                        reader.f124508OooO0o = 0;
                        reader.f124510OooO0oO = 0;
                    } else {
                        reader.OooO00o(i7 - iOooO0o02);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Hpack hpack3 = Hpack.f124501OooO00o;
                C34527OooO0oO c34527OooO0oOOooO0Oo2 = reader.OooO0Oo();
                hpack3.getClass();
                Hpack.OooO00o(c34527OooO0oOOooO0Oo2);
                arrayList.add(new Header(c34527OooO0oOOooO0Oo2, reader.OooO0Oo()));
            } else {
                arrayList.add(new Header(reader.OooO0O0(reader.OooO0o0(i5, 15) - 1), reader.OooO0Oo()));
            }
        }
        throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(reader.f124504OooO00o), "Invalid dynamic table size update "));
    }

    public final void OooOOO0(Http2Connection.ReaderRunnable readerRunnable, int i) throws IOException {
        C34542OooOo0O c34542OooOo0O = this.f124602OooOo0o;
        c34542OooOo0O.readInt();
        c34542OooOo0O.readByte();
        byte[] bArr = Util.f124301OooO00o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f124602OooOo0o.close();
    }
}

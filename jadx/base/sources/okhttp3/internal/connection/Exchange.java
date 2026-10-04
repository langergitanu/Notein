package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.o0OoOo0;
import oOo00OoO.AbstractC34520OooO;
import oOo00OoO.AbstractC34529OooOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p621ws.RealWebSocket;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Exchange {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RealCall f124346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EventListener f124347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExchangeFinder f124348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExchangeCodec f124349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f124350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f124351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final RealConnection f124352OooO0oO;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "LoOo00OoO/OooO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class RequestBodySink extends AbstractC34520OooO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f124353OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f124354OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f124355OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f124356OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Exchange f124357OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange this$0, InterfaceC34544OooOoO delegate, long j) {
            super(delegate);
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(delegate, "delegate");
            this.f124357OooOoOO = this$0;
            this.f124354OooOo0o = j;
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f124353OooOo) {
                return e;
            }
            this.f124353OooOo = true;
            return (E) this.f124357OooOoOO.OooO00o(this.f124356OooOoO0, false, true, e);
        }

        @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f124355OooOoO) {
                return;
            }
            this.f124355OooOoO = true;
            long j = this.f124354OooOo0o;
            if (j != -1 && this.f124356OooOoO0 != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO
        public final void write(C34524OooO0Oo source, long j) throws IOException {
            OooOOO0.OooO0oO(source, "source");
            if (this.f124355OooOoO) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f124354OooOo0o;
            if (j2 != -1 && this.f124356OooOoO0 + j > j2) {
                StringBuilder sbOooO00o = o0OoOo0.OooO00o(j2, "expected ", " bytes but received ");
                sbOooO00o.append(this.f124356OooOoO0 + j);
                throw new ProtocolException(sbOooO00o.toString());
            }
            try {
                super.write(source, j);
                this.f124356OooOoO0 += j;
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "LoOo00OoO/OooOO0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class ResponseBodySource extends AbstractC34529OooOO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public long f124358OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f124359OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f124360OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f124361OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f124362OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Exchange f124363OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange this$0, InterfaceC34548OooOoo0 delegate, long j) {
            super(delegate);
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(delegate, "delegate");
            this.f124363OooOoo0 = this$0;
            this.f124359OooOo0o = j;
            this.f124361OooOoO0 = true;
            if (j == 0) {
                OooO00o(null);
            }
        }

        public final <E extends IOException> E OooO00o(E e) {
            if (this.f124360OooOoO) {
                return e;
            }
            this.f124360OooOoO = true;
            if (e == null && this.f124361OooOoO0) {
                this.f124361OooOoO0 = false;
                Exchange exchange = this.f124363OooOoo0;
                exchange.f124347OooO0O0.OooOOo0(exchange.f124346OooO00o);
            }
            return (E) this.f124363OooOoo0.OooO00o(this.f124358OooOo, true, false, e);
        }

        @Override // oOo00OoO.AbstractC34529OooOO0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f124362OooOoOO) {
                return;
            }
            this.f124362OooOoOO = true;
            try {
                super.close();
                OooO00o(null);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }

        @Override // oOo00OoO.AbstractC34529OooOO0, oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            OooOOO0.OooO0oO(sink, "sink");
            if (this.f124362OooOoOO) {
                throw new IllegalStateException("closed");
            }
            try {
                long j2 = delegate().read(sink, j);
                if (this.f124361OooOoO0) {
                    this.f124361OooOoO0 = false;
                    Exchange exchange = this.f124363OooOoo0;
                    exchange.f124347OooO0O0.OooOOo0(exchange.f124346OooO00o);
                }
                if (j2 == -1) {
                    OooO00o(null);
                    return -1L;
                }
                long j3 = this.f124358OooOo + j2;
                long j4 = this.f124359OooOo0o;
                if (j4 == -1 || j3 <= j4) {
                    this.f124358OooOo = j3;
                    if (j3 == j4) {
                        OooO00o(null);
                    }
                    return j2;
                }
                throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
            } catch (IOException e) {
                throw OooO00o(e);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(eventListener, "eventListener");
        OooOOO0.OooO0oO(finder, "finder");
        this.f124346OooO00o = call;
        this.f124347OooO0O0 = eventListener;
        this.f124348OooO0OO = finder;
        this.f124349OooO0Oo = exchangeCodec;
        this.f124352OooO0oO = exchangeCodec.OooO0O0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E OooO00o(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            OooO0o(e);
        }
        EventListener eventListener = this.f124347OooO0O0;
        RealCall realCall = this.f124346OooO00o;
        if (z2) {
            if (e != null) {
                eventListener.OooOOO0(realCall, e);
            } else {
                eventListener.OooOO0O(realCall, j);
            }
        }
        if (z) {
            if (e != null) {
                eventListener.OooOOo(realCall, e);
            } else {
                eventListener.OooOOOo(realCall, j);
            }
        }
        return (E) realCall.OooO0o(this, z2, z, e);
    }

    public final InterfaceC34544OooOoO OooO0O0(Request request, boolean z) throws IOException {
        OooOOO0.OooO0oO(request, "request");
        this.f124351OooO0o0 = z;
        RequestBody requestBody = request.f124241OooO0Oo;
        OooOOO0.OooO0Oo(requestBody);
        long jContentLength = requestBody.contentLength();
        this.f124347OooO0O0.OooOO0o(this.f124346OooO00o);
        return new RequestBodySink(this, this.f124349OooO0Oo.OooO0OO(request, jContentLength), jContentLength);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.internal.connection.RealConnection$newWebSocketStreams$1] */
    public final RealConnection$newWebSocketStreams$1 OooO0OO() throws SocketException {
        RealCall realCall = this.f124346OooO00o;
        if (realCall.f124385Oooo00O) {
            throw new IllegalStateException("Check failed.");
        }
        realCall.f124385Oooo00O = true;
        realCall.f124380OooOoo0.exit();
        RealConnection realConnectionOooO0O0 = this.f124349OooO0Oo.OooO0O0();
        realConnectionOooO0O0.getClass();
        Socket socket = realConnectionOooO0O0.f124400OooO0Oo;
        OooOOO0.OooO0Oo(socket);
        final C34542OooOo0O c34542OooOo0O = realConnectionOooO0O0.f124404OooO0oo;
        OooOOO0.OooO0Oo(c34542OooOo0O);
        final C34540OooOo0 c34540OooOo0 = realConnectionOooO0O0.f124397OooO;
        OooOOO0.OooO0Oo(c34540OooOo0);
        socket.setSoTimeout(0);
        realConnectionOooO0O0.OooOO0O();
        return new RealWebSocket.Streams(c34542OooOo0O, c34540OooOo0) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.OooO00o(-1L, true, true, null);
            }
        };
    }

    public final RealResponseBody OooO0Oo(Response response) throws IOException {
        ExchangeCodec exchangeCodec = this.f124349OooO0Oo;
        try {
            String strOooO00o = Response.OooO00o("Content-Type", response);
            long jOooO0o = exchangeCodec.OooO0o(response);
            return new RealResponseBody(strOooO00o, jOooO0o, C34535OooOOOo.OooO0O0(new ResponseBodySource(this, exchangeCodec.OooO00o(response), jOooO0o)));
        } catch (IOException e) {
            this.f124347OooO0O0.OooOOo(this.f124346OooO00o, e);
            OooO0o(e);
            throw e;
        }
    }

    public final void OooO0o(IOException iOException) {
        this.f124350OooO0o = true;
        this.f124348OooO0OO.OooO0OO(iOException);
        RealConnection realConnectionOooO0O0 = this.f124349OooO0Oo.OooO0O0();
        RealCall call = this.f124346OooO00o;
        synchronized (realConnectionOooO0O0) {
            try {
                OooOOO0.OooO0oO(call, "call");
                if (!(iOException instanceof StreamResetException)) {
                    if (!(realConnectionOooO0O0.f124403OooO0oO != null) || (iOException instanceof ConnectionShutdownException)) {
                        realConnectionOooO0O0.f124405OooOO0 = true;
                        if (realConnectionOooO0O0.f124409OooOOO0 == 0) {
                            RealConnection.OooO0Oo(call.f124375OooOo0o, realConnectionOooO0O0.f124398OooO0O0, iOException);
                            realConnectionOooO0O0.f124407OooOO0o++;
                        }
                    }
                } else if (((StreamResetException) iOException).f124652OooOo0o == ErrorCode.REFUSED_STREAM) {
                    int i = realConnectionOooO0O0.f124408OooOOO + 1;
                    realConnectionOooO0O0.f124408OooOOO = i;
                    if (i > 1) {
                        realConnectionOooO0O0.f124405OooOO0 = true;
                        realConnectionOooO0O0.f124407OooOO0o++;
                    }
                } else if (((StreamResetException) iOException).f124652OooOo0o != ErrorCode.CANCEL || !call.f124390Oooo0o0) {
                    realConnectionOooO0O0.f124405OooOO0 = true;
                    realConnectionOooO0O0.f124407OooOO0o++;
                }
            } finally {
            }
        }
    }

    public final Response.Builder OooO0o0(boolean z) throws IOException {
        try {
            Response.Builder builderOooO0oo = this.f124349OooO0Oo.OooO0oo(z);
            if (builderOooO0oo == null) {
                return builderOooO0oo;
            }
            builderOooO0oo.f124282OooOOO0 = this;
            return builderOooO0oo;
        } catch (IOException e) {
            this.f124347OooO0O0.OooOOo(this.f124346OooO00o, e);
            OooO0o(e);
            throw e;
        }
    }
}

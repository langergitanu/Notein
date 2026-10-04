package okhttp3.internal.http1;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34530OooOO0O;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OkHttpClient f124460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RealConnection f124461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34542OooOo0O f124462OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34540OooOo0 f124463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HeadersReader f124464OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f124465OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Headers f124466OooO0oO;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "LoOo00OoO/OooOoo0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public abstract class AbstractSource implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f124467OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34530OooOO0O f124468OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f124469OooOoO0;

        public AbstractSource(Http1ExchangeCodec this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124469OooOoO0 = this$0;
            this.f124468OooOo0o = new C34530OooOO0O(this$0.f124462OooO0OO.f123777OooOo0o.timeout());
        }

        public final void OooO00o() {
            Http1ExchangeCodec http1ExchangeCodec = this.f124469OooOoO0;
            int i = http1ExchangeCodec.f124465OooO0o0;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(http1ExchangeCodec.f124465OooO0o0), "state: "));
            }
            Http1ExchangeCodec.OooO(http1ExchangeCodec, this.f124468OooOo0o);
            http1ExchangeCodec.f124465OooO0o0 = 6;
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public long read(C34524OooO0Oo sink, long j) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.f124469OooOoO0;
            OooOOO0.OooO0oO(sink, "sink");
            try {
                return http1ExchangeCodec.f124462OooO0OO.read(sink, j);
            } catch (IOException e) {
                http1ExchangeCodec.f124461OooO0O0.OooOO0O();
                OooO00o();
                throw e;
            }
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final C34547OooOoo timeout() {
            return this.f124468OooOo0o;
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "LoOo00OoO/OooOoO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class ChunkedSink implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f124470OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34530OooOO0O f124471OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f124472OooOoO0;

        public ChunkedSink(Http1ExchangeCodec this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124472OooOoO0 = this$0;
            this.f124471OooOo0o = new C34530OooOO0O(this$0.f124463OooO0Oo.f123767OooOo0o.timeout());
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f124470OooOo) {
                return;
            }
            this.f124470OooOo = true;
            this.f124472OooOoO0.f124463OooO0Oo.o00000Oo("0\r\n\r\n");
            Http1ExchangeCodec.OooO(this.f124472OooOoO0, this.f124471OooOo0o);
            this.f124472OooOoO0.f124465OooO0o0 = 3;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public final synchronized void flush() {
            if (this.f124470OooOo) {
                return;
            }
            this.f124472OooOoO0.f124463OooO0Oo.flush();
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final C34547OooOoo timeout() {
            return this.f124471OooOo0o;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final void write(C34524OooO0Oo source, long j) throws IOException {
            OooOOO0.OooO0oO(source, "source");
            if (this.f124470OooOo) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec http1ExchangeCodec = this.f124472OooOoO0;
            http1ExchangeCodec.f124463OooO0Oo.Oooooo(j);
            C34540OooOo0 c34540OooOo0 = http1ExchangeCodec.f124463OooO0Oo;
            c34540OooOo0.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
            c34540OooOo0.write(source, j);
            c34540OooOo0.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class ChunkedSource extends AbstractSource {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final HttpUrl f124473OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f124474OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f124475OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f124476OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec this$0, HttpUrl url) {
            super(this$0);
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(url, "url");
            this.f124475OooOoo = this$0;
            this.f124473OooOoO = url;
            this.f124474OooOoOO = -1L;
            this.f124476OooOoo0 = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f124467OooOo) {
                return;
            }
            if (this.f124476OooOoo0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Util.OooO0oo(this)) {
                    this.f124475OooOoo.f124461OooO0O0.OooOO0O();
                    OooO00o();
                }
            }
            this.f124467OooOo = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        
            if (r12.f124476OooOoo0 == false) goto L40;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, oOo00OoO.InterfaceC34548OooOoo0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            OooOOO0.OooO0oO(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (this.f124467OooOo) {
                throw new IllegalStateException("closed");
            }
            if (this.f124476OooOoo0) {
                long j2 = this.f124474OooOoOO;
                Http1ExchangeCodec http1ExchangeCodec = this.f124475OooOoo;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        http1ExchangeCodec.f124462OooO0OO.o00000oo();
                    }
                    try {
                        this.f124474OooOoOO = http1ExchangeCodec.f124462OooO0OO.o00oO0O();
                        String string = C33599OooOo0O.Oooooo0(http1ExchangeCodec.f124462OooO0OO.o000000o(LocationRequestCompat.PASSIVE_INTERVAL)).toString();
                        if (this.f124474OooOoOO < 0 || (string.length() > 0 && !C33595OooOOo.OooOoO0(string, ";", false))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f124474OooOoOO + string + '\"');
                        }
                        if (this.f124474OooOoOO == 0) {
                            this.f124476OooOoo0 = false;
                            HeadersReader headersReader = http1ExchangeCodec.f124464OooO0o;
                            headersReader.getClass();
                            Headers.Builder builder = new Headers.Builder();
                            while (true) {
                                String strO000000o = headersReader.f124458OooO00o.o000000o(headersReader.f124459OooO0O0);
                                headersReader.f124459OooO0O0 -= (long) strO000000o.length();
                                if (strO000000o.length() == 0) {
                                    break;
                                }
                                int iOooo0 = C33599OooOo0O.Oooo0(strO000000o, ':', 1, 4);
                                if (iOooo0 != -1) {
                                    String strSubstring = strO000000o.substring(0, iOooo0);
                                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    String strSubstring2 = strO000000o.substring(iOooo0 + 1);
                                    OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                    builder.OooO0O0(strSubstring, strSubstring2);
                                } else if (strO000000o.charAt(0) == ':') {
                                    String strSubstring3 = strO000000o.substring(1);
                                    OooOOO0.OooO0o(strSubstring3, "this as java.lang.String).substring(startIndex)");
                                    builder.OooO0O0("", strSubstring3);
                                } else {
                                    builder.OooO0O0("", strO000000o);
                                }
                            }
                            http1ExchangeCodec.f124466OooO0oO = builder.OooO0OO();
                            OkHttpClient okHttpClient = http1ExchangeCodec.f124460OooO00o;
                            OooOOO0.OooO0Oo(okHttpClient);
                            Headers headers = http1ExchangeCodec.f124466OooO0oO;
                            OooOOO0.OooO0Oo(headers);
                            HttpHeaders.OooO0Oo(okHttpClient.f124184Oooo000, this.f124473OooOoO, headers);
                            OooO00o();
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long j3 = super.read(sink, Math.min(j, this.f124474OooOoOO));
                if (j3 != -1) {
                    this.f124474OooOoOO -= j3;
                    return j3;
                }
                http1ExchangeCodec.f124461OooO0O0.OooOO0O();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooO00o();
                throw protocolException;
            }
            return -1L;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class FixedLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f124477OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f124478OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec this$0, long j) {
            super(this$0);
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124478OooOoOO = this$0;
            this.f124477OooOoO = j;
            if (j == 0) {
                OooO00o();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f124467OooOo) {
                return;
            }
            if (this.f124477OooOoO != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!Util.OooO0oo(this)) {
                    this.f124478OooOoOO.f124461OooO0O0.OooOO0O();
                    OooO00o();
                }
            }
            this.f124467OooOo = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            OooOOO0.OooO0oO(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (this.f124467OooOo) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f124477OooOoO;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(sink, Math.min(j2, j));
            if (j3 == -1) {
                this.f124478OooOoOO.f124461OooO0O0.OooOO0O();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooO00o();
                throw protocolException;
            }
            long j4 = this.f124477OooOoO - j3;
            this.f124477OooOoO = j4;
            if (j4 == 0) {
                OooO00o();
            }
            return j3;
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "LoOo00OoO/OooOoO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class KnownLengthSink implements InterfaceC34544OooOoO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f124479OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34530OooOO0O f124480OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f124481OooOoO0;

        public KnownLengthSink(Http1ExchangeCodec this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124481OooOoO0 = this$0;
            this.f124480OooOo0o = new C34530OooOO0O(this$0.f124463OooO0Oo.f123767OooOo0o.timeout());
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f124479OooOo) {
                return;
            }
            this.f124479OooOo = true;
            Http1ExchangeCodec http1ExchangeCodec = this.f124481OooOoO0;
            Http1ExchangeCodec.OooO(http1ExchangeCodec, this.f124480OooOo0o);
            http1ExchangeCodec.f124465OooO0o0 = 3;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f124479OooOo) {
                return;
            }
            this.f124481OooOoO0.f124463OooO0Oo.flush();
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final C34547OooOoo timeout() {
            return this.f124480OooOo0o;
        }

        @Override // oOo00OoO.InterfaceC34544OooOoO
        public final void write(C34524OooO0Oo source, long j) throws IOException {
            OooOOO0.OooO0oO(source, "source");
            if (this.f124479OooOo) {
                throw new IllegalStateException("closed");
            }
            long j2 = source.f123723OooOo;
            byte[] bArr = Util.f124301OooO00o;
            if (j < 0 || 0 > j2 || j2 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f124481OooOoO0.f124463OooO0Oo.write(source, j);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class UnknownLengthSource extends AbstractSource {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f124482OooOoO;

        public UnknownLengthSource() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f124467OooOo) {
                return;
            }
            if (!this.f124482OooOoO) {
                OooO00o();
            }
            this.f124467OooOo = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo sink, long j) throws IOException {
            OooOOO0.OooO0oO(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (this.f124467OooOo) {
                throw new IllegalStateException("closed");
            }
            if (this.f124482OooOoO) {
                return -1L;
            }
            long j2 = super.read(sink, j);
            if (j2 != -1) {
                return j2;
            }
            this.f124482OooOoO = true;
            OooO00o();
            return -1L;
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, C34542OooOo0O source, C34540OooOo0 sink) {
        OooOOO0.OooO0oO(connection, "connection");
        OooOOO0.OooO0oO(source, "source");
        OooOOO0.OooO0oO(sink, "sink");
        this.f124460OooO00o = okHttpClient;
        this.f124461OooO0O0 = connection;
        this.f124462OooO0OO = source;
        this.f124463OooO0Oo = sink;
        this.f124464OooO0o = new HeadersReader(source);
    }

    public static final void OooO(Http1ExchangeCodec http1ExchangeCodec, C34530OooOO0O c34530OooOO0O) {
        http1ExchangeCodec.getClass();
        C34547OooOoo c34547OooOoo = c34530OooOO0O.f123741OooO00o;
        C34547OooOoo delegate = C34547OooOoo.NONE;
        OooOOO0.OooO0oO(delegate, "delegate");
        c34530OooOO0O.f123741OooO00o = delegate;
        c34547OooOoo.clearDeadline();
        c34547OooOoo.clearTimeout();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final InterfaceC34548OooOoo0 OooO00o(Response response) {
        if (!HttpHeaders.OooO00o(response)) {
            return OooOO0(0L);
        }
        if ("chunked".equalsIgnoreCase(Response.OooO00o(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, response))) {
            HttpUrl httpUrl = response.f124258OooOo0o.f124238OooO00o;
            int i = this.f124465OooO0o0;
            if (i != 4) {
                throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "state: ").toString());
            }
            this.f124465OooO0o0 = 5;
            return new ChunkedSource(this, httpUrl);
        }
        long jOooOO0O = Util.OooOO0O(response);
        if (jOooOO0O != -1) {
            return OooOO0(jOooOO0O);
        }
        int i2 = this.f124465OooO0o0;
        if (i2 != 4) {
            throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i2), "state: ").toString());
        }
        this.f124465OooO0o0 = 5;
        this.f124461OooO0O0.OooOO0O();
        return new UnknownLengthSource(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final RealConnection getF124593OooO00o() {
        return this.f124461OooO0O0;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final InterfaceC34544OooOoO OooO0OO(Request request, long j) throws ProtocolException {
        OooOOO0.OooO0oO(request, "request");
        RequestBody requestBody = request.f124241OooO0Oo;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f124240OooO0OO.OooO0O0(com.google.common.net.HttpHeaders.TRANSFER_ENCODING))) {
            int i = this.f124465OooO0o0;
            if (i != 1) {
                throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "state: ").toString());
            }
            this.f124465OooO0o0 = 2;
            return new ChunkedSink(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.f124465OooO0o0;
        if (i2 != 1) {
            throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i2), "state: ").toString());
        }
        this.f124465OooO0o0 = 2;
        return new KnownLengthSink(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0Oo() throws IOException {
        this.f124463OooO0Oo.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long OooO0o(Response response) {
        if (!HttpHeaders.OooO00o(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(Response.OooO00o(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, response))) {
            return -1L;
        }
        return Util.OooOO0O(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0o0() {
        this.f124463OooO0Oo.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0oO(Request request) {
        OooOOO0.OooO0oO(request, "request");
        RequestLine requestLine = RequestLine.f124452OooO00o;
        Proxy.Type type = this.f124461OooO0O0.f124398OooO0O0.f124291OooO0O0.type();
        OooOOO0.OooO0o(type, "connection.route().proxy.type()");
        requestLine.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.f124239OooO0O0);
        sb.append(ControlChar.SPACE_CHAR);
        HttpUrl httpUrl = request.f124238OooO00o;
        if (httpUrl.f124137OooOO0 || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.OooO00o(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        OooOO0o(request.f124240OooO0OO, string);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder OooO0oo(boolean z) {
        HeadersReader headersReader = this.f124464OooO0o;
        int i = this.f124465OooO0o0;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "state: ").toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f124454OooO0Oo;
            String strO000000o = headersReader.f124458OooO00o.o000000o(headersReader.f124459OooO0O0);
            headersReader.f124459OooO0O0 -= (long) strO000000o.length();
            companion.getClass();
            StatusLine statusLineOooO00o = StatusLine.Companion.OooO00o(strO000000o);
            int i2 = statusLineOooO00o.f124456OooO0O0;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineOooO00o.f124455OooO00o;
            OooOOO0.OooO0oO(protocol, "protocol");
            builder.f124272OooO0O0 = protocol;
            builder.f124273OooO0OO = i2;
            String message = statusLineOooO00o.f124457OooO0OO;
            OooOOO0.OooO0oO(message, "message");
            builder.f124274OooO0Oo = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strO000000o2 = headersReader.f124458OooO00o.o000000o(headersReader.f124459OooO0O0);
                headersReader.f124459OooO0O0 -= (long) strO000000o2.length();
                if (strO000000o2.length() == 0) {
                    break;
                }
                int iOooo0 = C33599OooOo0O.Oooo0(strO000000o2, ':', 1, 4);
                if (iOooo0 != -1) {
                    String strSubstring = strO000000o2.substring(0, iOooo0);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String strSubstring2 = strO000000o2.substring(iOooo0 + 1);
                    OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    builder2.OooO0O0(strSubstring, strSubstring2);
                } else if (strO000000o2.charAt(0) == ':') {
                    String strSubstring3 = strO000000o2.substring(1);
                    OooOOO0.OooO0o(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    builder2.OooO0O0("", strSubstring3);
                } else {
                    builder2.OooO0O0("", strO000000o2);
                }
            }
            builder.f124275OooO0o = builder2.OooO0OO().OooO0o0();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f124465OooO0o0 = 3;
                return builder;
            }
            if (102 > i2 || i2 >= 200) {
                this.f124465OooO0o0 = 4;
                return builder;
            }
            this.f124465OooO0o0 = 3;
            return builder;
        } catch (EOFException e) {
            throw new IOException(OooOOO0.OooOOO0(this.f124461OooO0O0.f124398OooO0O0.f124290OooO00o.f124018OooO.OooO0oo(), "unexpected end of stream on "), e);
        }
    }

    public final InterfaceC34548OooOoo0 OooOO0(long j) {
        int i = this.f124465OooO0o0;
        if (i != 4) {
            throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "state: ").toString());
        }
        this.f124465OooO0o0 = 5;
        return new FixedLengthSource(this, j);
    }

    public final void OooOO0O(Response response) {
        long jOooOO0O = Util.OooOO0O(response);
        if (jOooOO0O == -1) {
            return;
        }
        InterfaceC34548OooOoo0 interfaceC34548OooOoo0OooOO0 = OooOO0(jOooOO0O);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Util.OooOo0O(Integer.MAX_VALUE, interfaceC34548OooOoo0OooOO0);
        ((FixedLengthSource) interfaceC34548OooOoo0OooOO0).close();
    }

    public final void OooOO0o(Headers headers, String requestLine) {
        OooOOO0.OooO0oO(requestLine, "requestLine");
        int i = this.f124465OooO0o0;
        if (i != 0) {
            throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "state: ").toString());
        }
        C34540OooOo0 c34540OooOo0 = this.f124463OooO0Oo;
        c34540OooOo0.o00000Oo(requestLine);
        c34540OooOo0.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            c34540OooOo0.o00000Oo(headers.OooO0Oo(i2));
            c34540OooOo0.o00000Oo(": ");
            c34540OooOo0.o00000Oo(headers.OooO0oO(i2));
            c34540OooOo0.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        c34540OooOo0.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f124465OooO0o0 = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.f124461OooO0O0.f124399OooO0OO;
        if (socket == null) {
            return;
        }
        Util.OooO0Oo(socket);
    }
}

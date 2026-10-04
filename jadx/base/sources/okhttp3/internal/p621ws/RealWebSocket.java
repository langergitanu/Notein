package okhttp3.internal.p621ws;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import androidx.core.location.LocationRequestCompat;
import com.aspose.words.ControlChar;
import com.facebook.soloader.OooOo;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18177fb;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection$newWebSocketStreams$1;
import okhttp3.internal.p621ws.WebSocketReader;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Close", "Companion", AuthenticationConstants.BUNDLE_MESSAGE, "Streams", "WriterTask", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final List<Protocol> f124734OooOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f124735OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WebSocketExtensions f124736OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Task f124737OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public WebSocketReader f124738OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public WebSocketWriter f124739OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RealConnection$newWebSocketStreams$1 f124740OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f124741OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f124742OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f124743OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f124744OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f124745OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f124746OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f124747OooOOO0;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Close {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f124748OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C34527OooO0oO f124749OooO0O0;

        public Close(int i, C34527OooO0oO c34527OooO0oO) {
            this.f124748OooO00o = i;
            this.f124749OooO0O0 = c34527OooO0oO;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Message {
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static abstract class Streams implements Closeable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C34540OooOo0 f124750OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34542OooOo0O f124751OooOo0o;

        public Streams(C34542OooOo0O source, C34540OooOo0 sink) {
            OooOOO0.OooO0oO(source, "source");
            OooOOO0.OooO0oO(sink, "sink");
            this.f124751OooOo0o = source;
            this.f124750OooOo = sink;
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public final class WriterTask extends Task {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RealWebSocket f124752OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket this$0) {
            super(OooOOO0.OooOOO0(" writer", this$0.f124741OooO0o0), true);
            OooOOO0.OooO0oO(this$0, "this$0");
            this.f124752OooO0o0 = this$0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long OooO00o() {
            RealWebSocket realWebSocket = this.f124752OooO0o0;
            try {
                synchronized (realWebSocket) {
                    if (!realWebSocket.f124745OooOO0O) {
                        throw null;
                    }
                }
                return -1L;
            } catch (IOException e) {
                realWebSocket.OooO0OO(e, null);
                return -1L;
            }
        }
    }

    static {
        new Companion(0);
        f124734OooOOO = OooOo.OooO0oO(Protocol.HTTP_1_1);
    }

    public final void OooO00o(Response response, Exchange exchange) throws IOException {
        int i = response.f124259OooOoO;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(ControlChar.SPACE_CHAR);
            throw new ProtocolException(C21111o0ooOoO.OooO0OO(response.f124260OooOoO0, '\'', sb));
        }
        String strOooO00o = Response.OooO00o(HttpHeaders.CONNECTION, response);
        if (!HttpHeaders.UPGRADE.equalsIgnoreCase(strOooO00o)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strOooO00o) + '\'');
        }
        String strOooO00o2 = Response.OooO00o(HttpHeaders.UPGRADE, response);
        if (!"websocket".equalsIgnoreCase(strOooO00o2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strOooO00o2) + '\'');
        }
        String strOooO00o3 = Response.OooO00o(HttpHeaders.SEC_WEBSOCKET_ACCEPT, response);
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        String strOooO00o4 = C34527OooO0oO.OooO00o.OooO0O0(OooOOO0.OooOOO0(C18177fb.f54841a, null)).OooO0O0(IDevicePopManager.SHA_1).OooO00o();
        if (OooOOO0.OooO0O0(strOooO00o4, strOooO00o3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strOooO00o4 + "' but was '" + ((Object) strOooO00o3) + '\'');
    }

    public final boolean OooO0O0(int i, String str) {
        C34527OooO0oO c34527OooO0oOOooO0O0;
        synchronized (this) {
            try {
                WebSocketProtocol.f124763OooO00o.getClass();
                String strOooO00o = WebSocketProtocol.OooO00o(i);
                if (strOooO00o != null) {
                    throw new IllegalArgumentException(strOooO00o.toString());
                }
                if (str != null) {
                    C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
                    c34527OooO0oOOooO0O0 = C34527OooO0oO.OooO00o.OooO0O0(str);
                    if (c34527OooO0oOOooO0O0.f123736OooOo0o.length > 123) {
                        throw new IllegalArgumentException(OooOOO0.OooOOO0(str, "reason.size() > 123: ").toString());
                    }
                } else {
                    c34527OooO0oOOooO0O0 = null;
                }
                if (!this.f124745OooOO0O && !this.f124743OooO0oo) {
                    this.f124743OooO0oo = true;
                    new Close(i, c34527OooO0oOOooO0O0);
                    throw null;
                }
            } finally {
            }
        }
        return false;
    }

    public final void OooO0OO(Exception exc, Response response) {
        synchronized (this) {
            if (!this.f124745OooOO0O) {
                this.f124745OooOO0O = true;
                this.f124740OooO0o = null;
                this.f124738OooO0OO = null;
                this.f124739OooO0Oo = null;
                throw null;
            }
        }
    }

    public final void OooO0Oo(String name, RealConnection$newWebSocketStreams$1 realConnection$newWebSocketStreams$1) throws IOException {
        OooOOO0.OooO0oO(name, "name");
        WebSocketExtensions webSocketExtensions = this.f124736OooO00o;
        OooOOO0.OooO0Oo(webSocketExtensions);
        synchronized (this) {
            try {
                this.f124741OooO0o0 = name;
                this.f124740OooO0o = realConnection$newWebSocketStreams$1;
                this.f124739OooO0Oo = new WebSocketWriter(realConnection$newWebSocketStreams$1.f124750OooOo, null, webSocketExtensions.f124757OooO00o, webSocketExtensions.f124759OooO0OO, 0L);
                this.f124737OooO0O0 = new WriterTask(this);
                if (0 == 0) {
                    throw null;
                }
                final long nanos = TimeUnit.MILLISECONDS.toNanos(0L);
                final String strOooOOO0 = OooOOO0.OooOOO0(" ping", name);
                new Task(strOooOOO0) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long OooO00o() {
                        WebSocketWriter webSocketWriter;
                        RealWebSocket realWebSocket = this;
                        synchronized (realWebSocket) {
                            try {
                                if (!realWebSocket.f124745OooOO0O && (webSocketWriter = realWebSocket.f124739OooO0Oo) != null) {
                                    int i = realWebSocket.f124747OooOOO0 ? realWebSocket.f124746OooOO0o : -1;
                                    realWebSocket.f124746OooOO0o++;
                                    realWebSocket.f124747OooOOO0 = true;
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    if (i != -1) {
                                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                        sb.append(0L);
                                        sb.append("ms (after ");
                                        realWebSocket.OooO0OO(new SocketTimeoutException(C21023OooO0Oo.OooO0OO(" successful ping/pongs)", i - 1, sb)), null);
                                    } else {
                                        try {
                                            C34527OooO0oO payload = C34527OooO0oO.f123734OooOoO;
                                            OooOOO0.OooO0oO(payload, "payload");
                                            webSocketWriter.OooO00o(9, payload);
                                        } catch (IOException e) {
                                            realWebSocket.OooO0OO(e, null);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return nanos;
                    }
                };
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o() {
        byte[] bArr = Util.f124301OooO00o;
        if (this.f124737OooO0O0 != null) {
            throw null;
        }
    }

    public final void OooO0o0() throws IOException {
        while (this.f124735OooO == -1) {
            WebSocketReader webSocketReader = this.f124738OooO0OO;
            OooOOO0.OooO0Oo(webSocketReader);
            webSocketReader.OooO0OO();
            if (!webSocketReader.f124772OooOooo) {
                int i = webSocketReader.f124770OooOoo0;
                if (i != 1 && i != 2) {
                    byte[] bArr = Util.f124301OooO00o;
                    String hexString = Integer.toHexString(i);
                    OooOOO0.OooO0o(hexString, "toHexString(this)");
                    throw new ProtocolException(OooOOO0.OooOOO0(hexString, "Unknown opcode: "));
                }
                while (!webSocketReader.f124768OooOoOO) {
                    long j = webSocketReader.f124769OooOoo;
                    C34524OooO0Oo buffer = webSocketReader.f124776Oooo00o;
                    if (j > 0) {
                        webSocketReader.f124765OooOo0o.OooOOO0(buffer, j);
                    }
                    if (webSocketReader.f124771OooOooO) {
                        if (webSocketReader.f124774Oooo000) {
                            MessageInflater messageInflater = webSocketReader.f124773Oooo0;
                            if (messageInflater == null) {
                                messageInflater = new MessageInflater(webSocketReader.f124766OooOoO);
                                webSocketReader.f124773Oooo0 = messageInflater;
                            }
                            OooOOO0.OooO0oO(buffer, "buffer");
                            C34524OooO0Oo c34524OooO0Oo = messageInflater.f124730OooOo;
                            if (c34524OooO0Oo.f123723OooOo != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = messageInflater.f124733OooOoO0;
                            if (messageInflater.f124731OooOo0o) {
                                inflater.reset();
                            }
                            c34524OooO0Oo.o0000O00(buffer);
                            c34524OooO0Oo.o000OOo0(65535);
                            long bytesRead = inflater.getBytesRead() + c34524OooO0Oo.f123723OooOo;
                            do {
                                messageInflater.f124732OooOoO.OooO00o(buffer, LocationRequestCompat.PASSIVE_INTERVAL);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        if (i == 1) {
                            buffer.o00000OO();
                            throw null;
                        }
                        C34527OooO0oO bytes = buffer.OoooO0O(buffer.f123723OooOo);
                        OooOOO0.OooO0oO(bytes, "bytes");
                        throw null;
                    }
                    while (!webSocketReader.f124768OooOoOO) {
                        webSocketReader.OooO0OO();
                        if (!webSocketReader.f124772OooOooo) {
                            break;
                        } else {
                            webSocketReader.OooO00o();
                        }
                    }
                    if (webSocketReader.f124770OooOoo0 != 0) {
                        int i2 = webSocketReader.f124770OooOoo0;
                        byte[] bArr2 = Util.f124301OooO00o;
                        String hexString2 = Integer.toHexString(i2);
                        OooOOO0.OooO0o(hexString2, "toHexString(this)");
                        throw new ProtocolException(OooOOO0.OooOOO0(hexString2, "Expected continuation opcode. Got: "));
                    }
                }
                throw new IOException("closed");
            }
            webSocketReader.OooO00o();
        }
    }
}

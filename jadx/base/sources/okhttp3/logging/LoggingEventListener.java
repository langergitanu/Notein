package okhttp3.logging;

import com.aspose.slides.C22218Oooo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes10.dex */
public final class LoggingEventListener extends EventListener {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C22218Oooo f124798OooO0O0 = HttpLoggingInterceptor.Logger.f124797OooOo0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f124799OooO0OO;

    public static class Factory implements EventListener.Factory {
    }

    @Override // okhttp3.EventListener
    public final void OooO(Call call, String str, List<InetAddress> list) {
        OooOo0o("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void OooO00o(RealCall realCall) {
        OooOo0o("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void OooO0O0(RealCall realCall, IOException iOException) {
        OooOo0o("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void OooO0OO(RealCall realCall) {
        this.f124799OooO0OO = System.nanoTime();
        OooOo0o("callStart: " + realCall.f124374OooOo);
    }

    @Override // okhttp3.EventListener
    public final void OooO0Oo(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        OooOo0o("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void OooO0o(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        OooOo0o("connectStart: " + inetSocketAddress + " " + proxy);
    }

    @Override // okhttp3.EventListener
    public final void OooO0o0(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        OooOo0o("connectFailed: null " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void OooO0oO(Call call, Connection connection) {
        OooOo0o("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void OooO0oo(Call call, Connection connection) {
        OooOo0o("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void OooOO0(Call call, String str) {
        OooOo0o("dnsStart: ".concat(str));
    }

    @Override // okhttp3.EventListener
    public final void OooOO0O(Call call, long j) {
        OooOo0o("requestBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void OooOO0o(Call call) {
        OooOo0o("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void OooOOO(Call call, Request request) {
        OooOo0o("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void OooOOO0(Call call, IOException iOException) {
        OooOo0o("requestFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void OooOOOO(Call call) {
        OooOo0o("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void OooOOOo(Call call, long j) {
        OooOo0o("responseBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void OooOOo(Call call, IOException iOException) {
        OooOo0o("responseFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void OooOOo0(Call call) {
        OooOo0o("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void OooOOoo(Call call, Response response) {
        OooOo0o("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void OooOo0(Call call, Handshake handshake) {
        OooOo0o("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void OooOo00(Call call) {
        OooOo0o("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void OooOo0O(Call call) {
        OooOo0o("secureConnectStart");
    }

    public final void OooOo0o(String str) {
        String str2 = "[" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f124799OooO0OO) + " ms] " + str;
        this.f124798OooO0O0.getClass();
        HttpLoggingInterceptor.Logger.OooO00o(str2);
    }
}

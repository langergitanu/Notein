package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/EventListener;", "", "<init>", "()V", "Companion", "Factory", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class EventListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f124110OooO00o;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/EventListener$Companion;", "", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/EventListener$Factory;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface Factory {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.EventListener$Companion$NONE$1] */
    static {
        new Companion(0);
        f124110OooO00o = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
        };
    }

    public void OooO(Call call, String str, List<InetAddress> list) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooO00o(RealCall realCall) {
    }

    public void OooO0O0(RealCall realCall, IOException iOException) {
    }

    public void OooO0OO(RealCall realCall) {
    }

    public void OooO0Oo(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(inetSocketAddress, "inetSocketAddress");
    }

    public void OooO0o(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(inetSocketAddress, "inetSocketAddress");
    }

    public void OooO0o0(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(inetSocketAddress, "inetSocketAddress");
    }

    public void OooO0oO(Call call, Connection connection) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(connection, "connection");
    }

    public void OooO0oo(Call call, Connection connection) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(connection, "connection");
    }

    public void OooOO0(Call call, String str) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOO0O(Call call, long j) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOO0o(Call call) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOOO(Call call, Request request) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(request, "request");
    }

    public void OooOOO0(Call call, IOException ioe) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(ioe, "ioe");
    }

    public void OooOOOO(Call call) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOOOo(Call call, long j) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOOo(Call call, IOException ioe) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(ioe, "ioe");
    }

    public void OooOOo0(Call call) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOOoo(Call call, Response response) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOo0(Call call, Handshake handshake) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOo00(Call call) {
        OooOOO0.OooO0oO(call, "call");
    }

    public void OooOo0O(Call call) {
        OooOOO0.OooO0oO(call, "call");
    }
}

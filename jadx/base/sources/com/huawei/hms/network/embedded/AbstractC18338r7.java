package com.huawei.hms.network.embedded;

import com.google.firebase.firestore.remote.OooOO0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r7 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18338r7 {
    public static final AbstractC18338r7 NONE = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r7$a */
    public class a extends AbstractC18338r7 {
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r7$b */
    public interface b {
        AbstractC18338r7 create(InterfaceC18159e7 interfaceC18159e7);
    }

    /* JADX INFO: renamed from: a */
    public static b m79456a(AbstractC18338r7 abstractC18338r7) {
        return new OooOO0(abstractC18338r7);
    }

    public void callEnd(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void callFailed(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
    }

    public void callStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void connectEnd(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC18132c8 enumC18132c8) {
    }

    public void connectFailed(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC18132c8 enumC18132c8, IOException iOException) {
    }

    public void connectStart(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(InterfaceC18159e7 interfaceC18159e7, InterfaceC18229j7 interfaceC18229j7) {
    }

    public void connectionReleased(InterfaceC18159e7 interfaceC18159e7, InterfaceC18229j7 interfaceC18229j7) {
    }

    public void dnsEnd(InterfaceC18159e7 interfaceC18159e7, String str, List<InetAddress> list) {
    }

    public void dnsStart(InterfaceC18159e7 interfaceC18159e7, String str) {
    }

    public void requestBodyEnd(InterfaceC18159e7 interfaceC18159e7, long j) {
    }

    public void requestBodyStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void requestFailed(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
    }

    public void requestHeadersEnd(InterfaceC18159e7 interfaceC18159e7, C18160e8 c18160e8) {
    }

    public void requestHeadersStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void responseBodyEnd(InterfaceC18159e7 interfaceC18159e7, long j) {
    }

    public void responseBodyStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void responseFailed(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
    }

    public void responseHeadersEnd(InterfaceC18159e7 interfaceC18159e7, C18188g8 c18188g8) {
    }

    public void responseHeadersStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    public void secureConnectEnd(InterfaceC18159e7 interfaceC18159e7, C18364t7 c18364t7) {
    }

    public void secureConnectStart(InterfaceC18159e7 interfaceC18159e7) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AbstractC18338r7 m79457a(AbstractC18338r7 abstractC18338r7, InterfaceC18159e7 interfaceC18159e7) {
        return abstractC18338r7;
    }
}

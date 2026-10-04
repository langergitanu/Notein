package oO00O0oo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O0OOo.C32654OooO0O0;

/* JADX INFO: renamed from: oO00O0oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32226OooOOoo<S extends SocketChannel> extends AbstractC32223OooOOOo<S> implements InterfaceC32225OooOOo0 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final S f115680Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32226OooOOoo(SocketChannel socketChannel, C32654OooO0O0 selector, OooOo00.OooO0OO oooO0OO) {
        super(socketChannel, selector, oooO0OO);
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        this.f115680Oooo00o = socketChannel;
        if (socketChannel.isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fc, code lost:
    
        r13.Oooo00O(oO0O0OOo.OooOO0.CONNECT, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0109, code lost:
    
        throw new java.lang.IllegalStateException("localAddress and remoteAddress should not be null.");
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00o(SocketAddress socketAddress, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C32224OooOOo c32224OooOOo;
        C32226OooOOoo<S> c32226OooOOoo;
        InetAddress address;
        InetAddress address2;
        InetAddress address3;
        if (abstractC32479OooO0OO instanceof C32224OooOOo) {
            c32224OooOOo = (C32224OooOOo) abstractC32479OooO0OO;
            int i = c32224OooOOo.f115678OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32224OooOOo.f115678OooOoO = i - Integer.MIN_VALUE;
            } else {
                c32224OooOOo = new C32224OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32224OooOOo.f115676OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32224OooOOo.f115678OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (this.f115680Oooo00o.connect(socketAddress)) {
                return this;
            }
            oO0O0OOo.OooOO0 oooOO02 = oO0O0OOo.OooOO0.CONNECT;
            Oooo00O(oooOO02, true);
            c32224OooOOo.f115677OooOo0o = this;
            c32224OooOOo.f115678OooOoO = 1;
            if (this.f115671OooOoo0.o000Oo0(this, oooOO02, c32224OooOOo) != enumC32485OooO00o) {
                c32226OooOOoo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c32226OooOOoo = c32224OooOOo.f115677OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        while (true) {
            if (c32226OooOOoo.f115680Oooo00o.finishConnect()) {
                boolean z = OooOOO0.f115666OooO00o;
                S s = c32226OooOOoo.f115680Oooo00o;
                SocketAddress localAddress = z ? s.getLocalAddress() : s.socket().getLocalSocketAddress();
                SocketAddress remoteAddress = z ? s.getRemoteAddress() : s.socket().getRemoteSocketAddress();
                if (localAddress == null || remoteAddress == null) {
                    break;
                }
                InetSocketAddress inetSocketAddress = localAddress instanceof InetSocketAddress ? (InetSocketAddress) localAddress : null;
                InetSocketAddress inetSocketAddress2 = remoteAddress instanceof InetSocketAddress ? (InetSocketAddress) remoteAddress : null;
                String hostAddress = (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null) ? null : address3.getHostAddress();
                if (hostAddress == null) {
                    hostAddress = "";
                }
                String hostAddress2 = (inetSocketAddress2 == null || (address2 = inetSocketAddress2.getAddress()) == null) ? null : address2.getHostAddress();
                String str = hostAddress2 != null ? hostAddress2 : "";
                boolean zIsAnyLocalAddress = (inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress();
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) || (!zIsAnyLocalAddress && !hostAddress.equals(str))) {
                    break;
                }
                if (z) {
                    s.close();
                } else {
                    s.socket().close();
                }
            } else {
                oO0O0OOo.OooOO0 oooOO03 = oO0O0OOo.OooOO0.CONNECT;
                c32226OooOOoo.Oooo00O(oooOO03, true);
                c32224OooOOo.f115677OooOo0o = c32226OooOOoo;
                c32224OooOOo.f115678OooOoO = 2;
                if (c32226OooOOoo.f115671OooOoo0.o000Oo0(c32226OooOOoo, oooOO03, c32224OooOOo) == enumC32485OooO00o) {
                    break;
                }
            }
        }
        return enumC32485OooO00o;
    }

    @Override // oO00O0oo.AbstractC32223OooOOOo, oO0O0OOo.C32663OooOO0o, oO0O0OOo.OooOO0O
    public final SelectableChannel getChannel() {
        return this.f115680Oooo00o;
    }
}

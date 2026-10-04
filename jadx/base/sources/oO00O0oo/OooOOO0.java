package oO00O0oo;

import java.io.IOException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SocketChannel;
import oO00O0oo.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f115666OooO00o;

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f115666OooO00o = z;
    }

    public static final void OooO00o(SocketChannel socketChannel, OooOo00.OooO0OO options) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(options, "options");
        int i = options.f115683OooO0OO;
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        boolean z = f115666OooO00o;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (z) {
                socketChannel.setOption((SocketOption<Integer>) StandardSocketOptions.SO_LINGER, Integer.valueOf(iIntValue));
            } else {
                socketChannel.socket().setSoLinger(true, iIntValue);
            }
        }
        if (z) {
            socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.valueOf(options.f115682OooO0O0));
        } else {
            socketChannel.socket().setTcpNoDelay(options.f115682OooO0O0);
        }
    }
}

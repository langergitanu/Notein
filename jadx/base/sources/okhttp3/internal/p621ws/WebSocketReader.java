package okhttp3.internal.p621ws;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34539OooOo;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34543OooOo0o;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "FrameCallback", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class WebSocketReader implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final RealWebSocket f124764OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34542OooOo0O f124765OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f124766OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f124767OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f124768OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f124769OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f124770OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f124771OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f124772OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public MessageInflater f124773Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f124774Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C34524OooO0Oo f124775Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C34524OooO0Oo f124776Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final byte[] f124777Oooo0O0;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface FrameCallback {
    }

    public WebSocketReader(C34542OooOo0O source, RealWebSocket realWebSocket, boolean z, boolean z2) {
        OooOOO0.OooO0oO(source, "source");
        this.f124765OooOo0o = source;
        this.f124764OooOo = realWebSocket;
        this.f124767OooOoO0 = z;
        this.f124766OooOoO = z2;
        this.f124775Oooo00O = new C34524OooO0Oo();
        this.f124776Oooo00o = new C34524OooO0Oo();
        this.f124777Oooo0O0 = null;
    }

    public final void OooO00o() throws IOException {
        String strO00000OO;
        short s;
        long j = this.f124769OooOoo;
        C34524OooO0Oo c34524OooO0Oo = this.f124775Oooo00O;
        if (j > 0) {
            this.f124765OooOo0o.OooOOO0(c34524OooO0Oo, j);
        }
        int i = this.f124770OooOoo0;
        RealWebSocket realWebSocket = this.f124764OooOo;
        switch (i) {
            case 8:
                long j2 = c34524OooO0Oo.f123723OooOo;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = c34524OooO0Oo.readShort();
                    strO00000OO = c34524OooO0Oo.o00000OO();
                    WebSocketProtocol.f124763OooO00o.getClass();
                    String strOooO00o = WebSocketProtocol.OooO00o(s);
                    if (strOooO00o != null) {
                        throw new ProtocolException(strOooO00o);
                    }
                } else {
                    strO00000OO = "";
                    s = 1005;
                }
                if (s == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (realWebSocket) {
                    try {
                        if (realWebSocket.f124735OooO != -1) {
                            throw new IllegalStateException("already closed");
                        }
                        realWebSocket.f124735OooO = s;
                        realWebSocket.f124744OooOO0 = strO00000OO;
                        if (realWebSocket.f124743OooO0oo) {
                            throw null;
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                throw null;
            case 9:
                C34527OooO0oO payload = c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
                synchronized (realWebSocket) {
                    try {
                        OooOOO0.OooO0oO(payload, "payload");
                        if (!realWebSocket.f124745OooOO0O) {
                            if (!realWebSocket.f124743OooO0oo) {
                                throw null;
                            }
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                C34527OooO0oO payload2 = c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
                synchronized (realWebSocket) {
                    OooOOO0.OooO0oO(payload2, "payload");
                    realWebSocket.f124747OooOOO0 = false;
                }
                return;
            default:
                int i2 = this.f124770OooOoo0;
                byte[] bArr = Util.f124301OooO00o;
                String hexString = Integer.toHexString(i2);
                OooOOO0.OooO0o(hexString, "toHexString(this)");
                throw new ProtocolException(OooOOO0.OooOOO0(hexString, "Unknown control opcode: "));
        }
    }

    public final void OooO0OO() throws IOException {
        boolean z;
        long j;
        if (this.f124768OooOoOO) {
            throw new IOException("closed");
        }
        C34542OooOo0O c34542OooOo0O = this.f124765OooOo0o;
        long timeoutNanos = c34542OooOo0O.f123777OooOo0o.timeout().getTimeoutNanos();
        InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = c34542OooOo0O.f123777OooOo0o;
        interfaceC34548OooOoo0.timeout().clearTimeout();
        try {
            byte b = c34542OooOo0O.readByte();
            byte[] bArr = Util.f124301OooO00o;
            interfaceC34548OooOoo0.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i = b & 15;
            this.f124770OooOoo0 = i;
            boolean z2 = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            this.f124771OooOooO = z2;
            boolean z3 = (b & 8) != 0;
            this.f124772OooOooo = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & SignedBytes.MAX_POWER_OF_TWO) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.f124767OooOoO0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.f124774Oooo000 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = c34542OooOo0O.readByte();
            boolean z5 = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j2 = b2 & Ascii.DEL;
            this.f124769OooOoo = j2;
            if (j2 == 126) {
                this.f124769OooOoo = c34542OooOo0O.readShort() & 65535;
            } else if (j2 == 127) {
                c34542OooOo0O.o0000OOO(8L);
                C34524OooO0Oo c34524OooO0Oo = c34542OooOo0O.f123776OooOo;
                if (c34524OooO0Oo.f123723OooOo < 8) {
                    throw new EOFException();
                }
                C34543OooOo0o c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o;
                OooOOO0.OooO0Oo(c34543OooOo0o);
                int i2 = c34543OooOo0o.f123781OooO0O0;
                int i3 = c34543OooOo0o.f123782OooO0OO;
                if (i3 - i2 < 8) {
                    j = ((((long) c34524OooO0Oo.readInt()) & 4294967295L) << 32) | (((long) c34524OooO0Oo.readInt()) & 4294967295L);
                } else {
                    byte[] bArr2 = c34543OooOo0o.f123780OooO00o;
                    int i4 = i2 + 7;
                    long j3 = ((((long) bArr2[i2]) & 255) << 56) | ((((long) bArr2[1 + i2]) & 255) << 48) | ((((long) bArr2[2 + i2]) & 255) << 40) | ((((long) bArr2[i2 + 3]) & 255) << 32) | ((((long) bArr2[i2 + 4]) & 255) << 24) | ((((long) bArr2[i2 + 5]) & 255) << 16) | ((((long) bArr2[i2 + 6]) & 255) << 8);
                    int i5 = i2 + 8;
                    j = j3 | (((long) bArr2[i4]) & 255);
                    c34524OooO0Oo.f123723OooOo -= 8;
                    if (i5 == i3) {
                        c34524OooO0Oo.f123724OooOo0o = c34543OooOo0o.OooO00o();
                        C34539OooOo.OooO00o(c34543OooOo0o);
                    } else {
                        c34543OooOo0o.f123781OooO0O0 = i5;
                    }
                }
                this.f124769OooOoo = j;
                if (j < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f124769OooOoo);
                    OooOOO0.OooO0o(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.f124772OooOooo && this.f124769OooOoo > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr3 = this.f124777Oooo0O0;
                OooOOO0.OooO0Oo(bArr3);
                c34542OooOo0O.readFully(bArr3);
            }
        } catch (Throwable th) {
            interfaceC34548OooOoo0.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        MessageInflater messageInflater = this.f124773Oooo0;
        if (messageInflater == null) {
            return;
        }
        messageInflater.close();
    }
}

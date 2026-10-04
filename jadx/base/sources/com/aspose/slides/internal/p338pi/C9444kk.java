package com.aspose.slides.internal.p338pi;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p289n2.C6687du;
import com.aspose.slides.internal.p289n2.C6695m9;
import com.aspose.slides.internal.p293n7.C6745k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11958ne;
import com.aspose.slides.internal.p474wg.C11932e0;
import com.aspose.slides.internal.p474wg.C11933em;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.Channels;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.UnsupportedAddressTypeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.pi.kk */
/* JADX INFO: loaded from: classes4.dex */
class C9444kk implements InterfaceC9443k4 {

    /* JADX INFO: renamed from: du */
    private InetSocketAddress f34335du;

    /* JADX INFO: renamed from: k4 */
    private ServerSocket f34336k4;

    /* JADX INFO: renamed from: kk */
    private ServerSocketChannel f34337kk;

    /* JADX INFO: renamed from: to */
    private SocketChannel f34338to;

    /* JADX INFO: renamed from: x1 */
    private Socket f34339x1;

    public C9444kk() {
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f34338to = socketChannelOpen;
            this.f34339x1 = socketChannelOpen.socket();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        Socket socket = this.f34339x1;
        if (socket == null && this.f34336k4 == null) {
            return -1;
        }
        ServerSocket serverSocket = this.f34336k4;
        return (serverSocket != null ? serverSocket.toString() : socket.toString()).hashCode();
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public int mo46226k4(byte[] bArr, int i, int i2, int i3, AbstractC11958ne abstractC11958ne, int[] iArr) {
        return mo46234x1(bArr, i, i2, i3, iArr);
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: x1 */
    public int mo46234x1(byte[] bArr, int i, int i2, int i3, int[] iArr) {
        int iWrite;
        iArr[0] = 0;
        if (this.f34339x1 == null) {
            iArr[0] = 10057;
            return 0;
        }
        try {
            if (this.f34338to.isConnectionPending()) {
                if (!this.f34338to.finishConnect()) {
                    iArr[0] = 10022;
                    return 0;
                }
            } else if (!this.f34338to.isConnected()) {
                iArr[0] = 10057;
                return 0;
            }
            iWrite = this.f34338to.write(ByteBuffer.wrap(C6745k4.m26610k4(bArr), i, i2));
        } catch (Exception unused) {
            iArr[0] = 10054;
        }
        if (iWrite < 0) {
            iWrite = 0;
        }
        if (iWrite == 0 && !this.f34338to.isBlocking()) {
            iArr[0] = 10035;
        }
        return iWrite;
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public int mo46227k4(byte[] bArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        iArr[0] = 0;
        if (this.f34339x1 == null) {
            iArr[0] = 10057;
            return 0;
        }
        try {
            if (this.f34338to.isConnectionPending()) {
                if (!this.f34338to.finishConnect()) {
                    iArr[0] = 10022;
                    return 0;
                }
            } else if (!this.f34338to.isConnected()) {
                iArr[0] = 10057;
                return 0;
            }
            i4 = Channels.newChannel(this.f34338to.socket().getInputStream()).read(ByteBuffer.wrap(C6745k4.m26610k4(bArr), i, i2));
        } catch (Exception unused) {
            iArr[0] = 10054;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 == 0 && !this.f34338to.isBlocking()) {
            iArr[0] = 10035;
        }
        return i4;
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: x1 */
    public void mo46235x1(AbstractC11958ne abstractC11958ne, int[] iArr) {
        iArr[0] = 0;
        C11932e0 c11932e0 = (C11932e0) C7019kk.m27452k4((Object) abstractC11958ne, C11932e0.class);
        if (c11932e0 == null) {
            iArr[0] = 10044;
            return;
        }
        Socket socket = this.f34339x1;
        if (socket == null) {
            iArr[0] = 10022;
            return;
        }
        if (socket.isConnected() || this.f34338to.isConnectionPending()) {
            iArr[0] = 10056;
            return;
        }
        try {
            if (this.f34338to.connect(new InetSocketAddress(InetAddress.getByName(c11932e0.m55933to().toString()), c11932e0.m55928du()))) {
                return;
            }
            iArr[0] = 10035;
        } catch (AlreadyConnectedException unused) {
            iArr[0] = 10056;
        } catch (AsynchronousCloseException unused2) {
            iArr[0] = 10004;
        } catch (ConnectionPendingException unused3) {
            iArr[0] = 10036;
        } catch (UnresolvedAddressException unused4) {
            iArr[0] = 10039;
        } catch (UnsupportedAddressTypeException unused5) {
            iArr[0] = 10041;
        } catch (Exception unused6) {
            iArr[0] = 10061;
        }
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public int mo46228k4(byte[] bArr, int i, int i2, int i3, C11933em[] c11933emArr, int[] iArr) {
        return mo46227k4(bArr, i, i2, i3, iArr);
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46229k4(int i, int i2, Object obj, byte[] bArr, int i3, int[] iArr) {
        iArr[0] = 0;
        if (bArr != null) {
            iArr[0] = -1;
            throw new NotImplementedException();
        }
        Socket socket = this.f34339x1;
        if (socket != null || this.f34336k4 != null) {
            boolean z = true;
            if (i != 0) {
                if (i != 6) {
                    if (i == 17) {
                        if (i2 == 1) {
                            iArr[0] = 10042;
                            return;
                        } else {
                            iArr[0] = 10022;
                            return;
                        }
                    }
                    if (i == 41) {
                        iArr[0] = 10042;
                        return;
                    }
                } else if (i2 != 1) {
                    iArr[0] = 10022;
                    return;
                }
            } else if (i2 != 1) {
                iArr[0] = 10042;
                return;
            }
            try {
                if (i2 == -129) {
                    socket.setSoLinger(false, 0);
                    return;
                }
                Class cls = Integer.TYPE;
                if (i2 == 1) {
                    if (obj != null) {
                        if (((Integer) C7019kk.m27464to(obj, cls)).intValue() == 0) {
                            z = false;
                        }
                    } else if (i3 == 0) {
                        z = false;
                    }
                    this.f34339x1.setTcpNoDelay(z);
                    return;
                }
                if (i2 == 4) {
                    if (obj != null) {
                        if (((Integer) C7019kk.m27464to(obj, cls)).intValue() == 0) {
                            z = false;
                        }
                    } else if (i3 == 0) {
                        z = false;
                    }
                    ServerSocket serverSocket = this.f34336k4;
                    if (serverSocket != null) {
                        serverSocket.setReuseAddress(z);
                        return;
                    } else {
                        this.f34339x1.setReuseAddress(z);
                        return;
                    }
                }
                if (i2 == 8) {
                    if (obj != null) {
                        if (((Integer) C7019kk.m27464to(obj, cls)).intValue() == 0) {
                            z = false;
                        }
                    } else if (i3 == 0) {
                        z = false;
                    }
                    this.f34339x1.setKeepAlive(z);
                    return;
                }
                if (i2 == 128) {
                    C6687du c6687du = (C6687du) C7019kk.m27452k4(obj, C6687du.class);
                    if (c6687du != null) {
                        this.f34339x1.setSoLinger(c6687du.m26444k4(), c6687du.m26445x1());
                        return;
                    } else {
                        iArr[0] = 10022;
                        return;
                    }
                }
                if (i2 == 256) {
                    if (obj != null) {
                        if (((Integer) C7019kk.m27464to(obj, cls)).intValue() == 0) {
                            z = false;
                        }
                    } else if (i3 == 0) {
                        z = false;
                    }
                    this.f34339x1.setOOBInline(z);
                    return;
                }
                if (i2 == 4102) {
                    if (obj != null) {
                        i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                    }
                    ServerSocket serverSocket2 = this.f34336k4;
                    if (serverSocket2 != null) {
                        serverSocket2.setSoTimeout(i3);
                        return;
                    } else {
                        this.f34339x1.setSoTimeout(i3);
                        return;
                    }
                }
                if (i2 == 4097) {
                    if (obj != null) {
                        i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                    }
                    this.f34339x1.setSendBufferSize(i3);
                    return;
                } else {
                    if (i2 != 4098) {
                        iArr[0] = 10022;
                        return;
                    }
                    if (obj != null) {
                        i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                    }
                    ServerSocket serverSocket3 = this.f34336k4;
                    if (serverSocket3 != null) {
                        serverSocket3.setReceiveBufferSize(i3);
                        return;
                    } else {
                        this.f34339x1.setReceiveBufferSize(i3);
                        return;
                    }
                }
            } catch (Exception unused) {
                iArr[0] = 10022;
                return;
            }
        }
        iArr[0] = 10022;
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46230k4(AbstractC11958ne abstractC11958ne, int[] iArr) {
        iArr[0] = 0;
        C11932e0 c11932e0 = (C11932e0) C7019kk.m27452k4((Object) abstractC11958ne, C11932e0.class);
        if (c11932e0 == null) {
            iArr[0] = 10044;
            return;
        }
        Socket socket = this.f34339x1;
        if (socket == null || socket.isBound() || this.f34339x1.isConnected() || this.f34338to.isConnectionPending()) {
            iArr[0] = 10022;
            return;
        }
        try {
            Socket socket2 = new Socket();
            socket2.bind(new InetSocketAddress(InetAddress.getByName(c11932e0.m55933to().toString()), c11932e0.m55928du()));
            this.f34335du = (InetSocketAddress) socket2.getLocalSocketAddress();
            socket2.close();
            this.f34339x1.bind(this.f34335du);
        } catch (Exception unused) {
            iArr[0] = 10048;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m46236k4(Selector selector, int i, C6695m9 c6695m9, int[] iArr) {
        int i2;
        iArr[0] = 0;
        if (this.f34336k4 != null) {
            if (i != 0) {
                return;
            }
            try {
                if (this.f34337kk.isBlocking()) {
                    this.f34337kk.configureBlocking(false);
                }
                this.f34337kk.register(selector, 16, c6695m9);
                return;
            } catch (Exception unused) {
                iArr[0] = 10022;
                return;
            }
        }
        if (i > 0) {
            try {
                i2 = this.f34338to.isConnectionPending() ? 8 : 4;
            } catch (Exception unused2) {
                iArr[0] = 10022;
                return;
            }
        } else {
            i2 = 1;
        }
        if (this.f34338to.isBlocking()) {
            this.f34338to.configureBlocking(false);
        }
        this.f34338to.register(selector, i2, c6695m9);
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46231k4(boolean z, int[] iArr) {
        iArr[0] = 0;
        if (this.f34339x1 != null || this.f34336k4 != null) {
            try {
                (this.f34336k4 != null ? this.f34337kk : this.f34338to).configureBlocking(z);
                return;
            } catch (Exception unused) {
                iArr[0] = 10022;
                return;
            }
        }
        iArr[0] = 10022;
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46232k4(int[] iArr) {
        iArr[0] = 0;
        ServerSocket serverSocket = this.f34336k4;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Exception unused) {
                iArr[0] = 10022;
            }
            try {
                this.f34337kk.close();
            } catch (Exception unused2) {
                iArr[0] = 10022;
            }
            this.f34336k4 = null;
            this.f34337kk = null;
            return;
        }
        Socket socket = this.f34339x1;
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused3) {
                iArr[0] = 10022;
            }
            try {
                this.f34338to.close();
            } catch (Exception unused4) {
                iArr[0] = 10022;
            }
            this.f34339x1 = null;
            this.f34338to = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:20|(1:22)(7:24|(1:26)|49|27|(2:31|(1:42)(3:45|35|(0)))|43|44)|23|49|27|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r11[0] = 10022;
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo46233k4(int i, int i2, C6695m9 c6695m9, int[] iArr) {
        Selector selectorOpen;
        int iSelect;
        boolean zFinishConnect;
        int iValueOf;
        boolean z = false;
        iArr[0] = 0;
        if (i != 2 || this.f34338to.isConnectionPending()) {
            try {
                selectorOpen = Selector.open();
            } catch (IOException unused) {
                iArr[0] = 0;
                selectorOpen = null;
            }
            m46236k4(selectorOpen, i == 0 ? 0 : 1, c6695m9, iArr);
            if (iArr[0] != 0) {
                iArr[0] = 0;
                C9446x1.m46239k4(selectorOpen);
                return i == 2;
            }
            long jM27438h4 = C7019kk.m27438h4((Object) 1, 9);
            if (i2 >= 0) {
                iValueOf = i2 > 999 ? Integer.valueOf(i2 / 1000) : 0;
                iSelect = selectorOpen.select(jM27438h4);
                if (iSelect > 0) {
                    if (this.f34339x1 == null || !this.f34338to.isConnectionPending()) {
                        z = true;
                    } else {
                        try {
                            zFinishConnect = this.f34338to.finishConnect();
                        } catch (Exception unused2) {
                            zFinishConnect = false;
                        }
                        if (!zFinishConnect ? i == 2 : i != 2) {
                        }
                    }
                }
                C9446x1.m46239k4(selectorOpen);
                return z;
            }
            jM27438h4 = C7019kk.m27438h4(iValueOf, 9);
            iSelect = selectorOpen.select(jM27438h4);
            if (iSelect > 0) {
            }
            C9446x1.m46239k4(selectorOpen);
            return z;
        }
        return false;
    }
}

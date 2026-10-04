package com.aspose.slides.internal.p338pi;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p289n2.C6695m9;
import com.aspose.slides.internal.p293n7.C6745k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11958ne;
import com.aspose.slides.internal.p474wg.C11932e0;
import com.aspose.slides.internal.p474wg.C11933em;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.UnsupportedAddressTypeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.pi.to */
/* JADX INFO: loaded from: classes4.dex */
class C9445to implements InterfaceC9443k4 {

    /* JADX INFO: renamed from: k4 */
    private DatagramSocket f34340k4;

    /* JADX INFO: renamed from: kk */
    private InetSocketAddress f34341kk;

    /* JADX INFO: renamed from: x1 */
    private DatagramChannel f34342x1;

    public C9445to() {
        try {
            DatagramChannel datagramChannelOpen = DatagramChannel.open();
            this.f34342x1 = datagramChannelOpen;
            this.f34340k4 = datagramChannelOpen.socket();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        DatagramSocket datagramSocket = this.f34340k4;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.toString().hashCode();
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public int mo46226k4(byte[] bArr, int i, int i2, int i3, AbstractC11958ne abstractC11958ne, int[] iArr) {
        if (!this.f34342x1.isConnected()) {
            mo46235x1(abstractC11958ne, iArr);
        }
        return mo46234x1(bArr, i, i2, i3, iArr);
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: x1 */
    public int mo46234x1(byte[] bArr, int i, int i2, int i3, int[] iArr) {
        iArr[0] = 0;
        if (this.f34340k4 == null) {
            iArr[0] = 10057;
            return 0;
        }
        try {
        } catch (Exception unused) {
            iArr[0] = 10054;
        }
        if (!this.f34342x1.isConnected()) {
            iArr[0] = 10057;
            return 0;
        }
        int iWrite = this.f34342x1.write(ByteBuffer.wrap(C6745k4.m26610k4(bArr), i, i2));
        if (iWrite < 0) {
            iWrite = 0;
        }
        if (iWrite == 0 && !this.f34342x1.isBlocking()) {
            iArr[0] = 10035;
        }
        return iWrite;
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public int mo46227k4(byte[] bArr, int i, int i2, int i3, int[] iArr) {
        iArr[0] = 0;
        if (this.f34340k4 == null) {
            iArr[0] = 10057;
            return 0;
        }
        try {
        } catch (Exception unused) {
            iArr[0] = 10054;
        }
        if (!this.f34342x1.isConnected()) {
            iArr[0] = 10057;
            return 0;
        }
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        this.f34342x1.socket().receive(datagramPacket);
        int length = datagramPacket.getLength();
        if (length < 0) {
            length = 0;
        }
        if (length == 0 && !this.f34342x1.isBlocking()) {
            iArr[0] = 10035;
        }
        return length;
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
        DatagramSocket datagramSocket = this.f34340k4;
        if (datagramSocket == null) {
            iArr[0] = 10022;
            return;
        }
        if (datagramSocket.isConnected() || this.f34342x1.isConnected()) {
            iArr[0] = 10056;
            return;
        }
        try {
            this.f34342x1.connect(new InetSocketAddress(InetAddress.getByName(c11932e0.m55933to().toString()), c11932e0.m55928du()));
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
        if (this.f34340k4 == null) {
            iArr[0] = 10022;
            return;
        }
        boolean z = true;
        if (i != 0) {
            if (i != 6) {
                if (i == 17) {
                    if (i2 != 1) {
                        iArr[0] = 10022;
                        return;
                    }
                    return;
                } else if (i == 41) {
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
        Class cls = Integer.TYPE;
        try {
            if (i2 == 4) {
                if (obj != null) {
                    if (((Integer) C7019kk.m27464to(obj, cls)).intValue() == 0) {
                        z = false;
                    }
                } else if (i3 == 0) {
                    z = false;
                }
                this.f34340k4.setReuseAddress(z);
                return;
            }
            if (i2 == 4102) {
                if (obj != null) {
                    i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                }
                this.f34340k4.setSoTimeout(i3);
            } else if (i2 == 4097) {
                if (obj != null) {
                    i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                }
                this.f34340k4.setSendBufferSize(i3);
            } else {
                if (i2 != 4098) {
                    iArr[0] = 10022;
                    return;
                }
                if (obj != null) {
                    i3 = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
                }
                this.f34340k4.setReceiveBufferSize(i3);
            }
        } catch (Exception unused) {
            iArr[0] = 10022;
        }
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
        DatagramSocket datagramSocket = this.f34340k4;
        if (datagramSocket == null || datagramSocket.isBound() || this.f34340k4.isConnected()) {
            iArr[0] = 10022;
            return;
        }
        try {
            Socket socket = new Socket();
            socket.bind(new InetSocketAddress(InetAddress.getByName(c11932e0.m55933to().toString()), c11932e0.m55928du()));
            this.f34341kk = (InetSocketAddress) socket.getLocalSocketAddress();
            socket.close();
            this.f34340k4.bind(this.f34341kk);
        } catch (Exception e) {
            e.printStackTrace();
            iArr[0] = 10048;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m46237k4(Selector selector, int i, C6695m9 c6695m9, int[] iArr) {
        iArr[0] = 0;
        int i2 = i > 0 ? 4 : 1;
        try {
            if (this.f34342x1.isBlocking()) {
                this.f34342x1.configureBlocking(false);
            }
            this.f34342x1.register(selector, i2, c6695m9);
        } catch (Exception unused) {
            iArr[0] = 10022;
        }
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46231k4(boolean z, int[] iArr) {
        iArr[0] = 0;
        if (this.f34340k4 == null) {
            iArr[0] = 10022;
            return;
        }
        try {
            this.f34342x1.configureBlocking(z);
        } catch (Exception unused) {
            iArr[0] = 10022;
        }
    }

    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    public void mo46232k4(int[] iArr) {
        iArr[0] = 0;
        DatagramSocket datagramSocket = this.f34340k4;
        if (datagramSocket != null) {
            try {
                datagramSocket.close();
            } catch (Exception unused) {
                iArr[0] = 10022;
            }
            try {
                this.f34342x1.close();
            } catch (Exception unused2) {
                iArr[0] = 10022;
            }
            this.f34340k4 = null;
            this.f34342x1 = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:16|(1:18)(6:20|(1:22)|30|23|26|27)|19|30|23|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r8[0] = 10022;
     */
    @Override // com.aspose.slides.internal.p338pi.InterfaceC9443k4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo46233k4(int i, int i2, C6695m9 c6695m9, int[] iArr) {
        Selector selectorOpen;
        int iValueOf;
        iArr[0] = 0;
        try {
            selectorOpen = Selector.open();
        } catch (IOException unused) {
            iArr[0] = 0;
            selectorOpen = null;
        }
        m46237k4(selectorOpen, i == 0 ? 0 : 1, c6695m9, iArr);
        if (iArr[0] != 0) {
            iArr[0] = 0;
            C9446x1.m46239k4(selectorOpen);
            return i == 2;
        }
        long jM27438h4 = C7019kk.m27438h4((Object) 1, 9);
        if (i2 >= 0) {
            iValueOf = i2 > 999 ? Integer.valueOf(i2 / 1000) : 0;
            selectorOpen.select(jM27438h4);
            C9446x1.m46239k4(selectorOpen);
            return false;
        }
        jM27438h4 = C7019kk.m27438h4(iValueOf, 9);
        selectorOpen.select(jM27438h4);
        C9446x1.m46239k4(selectorOpen);
        return false;
    }
}

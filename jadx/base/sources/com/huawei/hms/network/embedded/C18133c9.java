package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c9 */
/* JADX INFO: loaded from: classes9.dex */
public class C18133c9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<InetSocketAddress> f54472a;

    /* JADX INFO: renamed from: d */
    public final int f54475d;

    /* JADX INFO: renamed from: e */
    public int f54476e;

    /* JADX INFO: renamed from: f */
    public Selector f54477f;

    /* JADX INFO: renamed from: i */
    public InetSocketAddress f54480i;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<InetSocketAddress> f54473b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList<b> f54474c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g */
    public Object f54478g = new Object();

    /* JADX INFO: renamed from: h */
    public volatile boolean f54479h = false;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c9$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        public SocketChannel f54481a;

        /* JADX INFO: renamed from: b */
        public InetSocketAddress f54482b;

        /* JADX INFO: renamed from: c */
        public long f54483c;

        public b() {
            this.f54481a = null;
            this.f54482b = null;
            this.f54483c = 0L;
        }

        /* JADX INFO: renamed from: a */
        public void m78142a() {
            SocketChannel socketChannel = this.f54481a;
            if (socketChannel == null) {
                return;
            }
            try {
                try {
                    socketChannel.close();
                } catch (IOException unused) {
                    C18133c9.this.m78137a("Socket channel close error", null);
                }
            } finally {
                this.f54481a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public long m78144b() {
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            long j = this.f54483c;
            if (millis >= j) {
                return 0L;
            }
            return j - millis;
        }

        /* JADX INFO: renamed from: c */
        public boolean m78145c() {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) >= this.f54483c;
        }

        /* JADX INFO: renamed from: a */
        public void m78143a(InetSocketAddress inetSocketAddress, long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) throws IOException {
            this.f54482b = inetSocketAddress;
            this.f54483c = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) + j;
            abstractC18338r7.connectStart(interfaceC18159e7, inetSocketAddress, proxy);
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f54481a = socketChannelOpen;
            socketChannelOpen.configureBlocking(false);
            this.f54481a.connect(inetSocketAddress);
        }
    }

    public C18133c9(ArrayList<InetSocketAddress> arrayList, int i) {
        this.f54472a = new ArrayList<>(arrayList);
        this.f54476e = i;
        this.f54475d = arrayList.size();
    }

    /* JADX INFO: renamed from: b */
    private SocketChannel m78139b(long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        long millis;
        long j2 = this.f54476e;
        long j3 = j2;
        long j4 = j - j2;
        SocketChannel socketChannelM78141d = null;
        loop0: while (true) {
            boolean z = true;
            while (!this.f54479h) {
                if (this.f54472a.size() > 0 && z) {
                    if (m78138a(this.f54472a.remove(0), j, proxy, interfaceC18159e7, abstractC18338r7)) {
                        j4 += (long) this.f54476e;
                        z = false;
                    } else {
                        continue;
                    }
                }
                if (this.f54474c.isEmpty() && this.f54472a.isEmpty()) {
                    return null;
                }
                long jM78144b = this.f54474c.size() > 0 ? this.f54474c.get(0).m78144b() : j4;
                if (this.f54472a.size() > 0 && jM78144b > j3) {
                    jM78144b = j3;
                }
                long jNanoTime = System.nanoTime();
                try {
                    this.f54477f.select(jM78144b);
                    if (this.f54479h) {
                        return null;
                    }
                    millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    socketChannelM78141d = m78141d();
                    if (socketChannelM78141d != null) {
                        break loop0;
                    }
                    m78134a(millis);
                    if (this.f54473b.size() == this.f54475d || millis >= j4) {
                        break loop0;
                    }
                    j4 -= millis;
                    if (this.f54472a.size() <= 0) {
                        continue;
                    } else {
                        if (millis >= j3) {
                            break;
                        }
                        j3 -= millis;
                    }
                } catch (IOException unused) {
                    return null;
                }
            }
            return socketChannelM78141d;
            long j5 = this.f54476e;
            j3 = j5 - ((millis - j3) % j5);
        }
        return socketChannelM78141d;
    }

    /* JADX INFO: renamed from: c */
    private void m78140c() {
        Iterator<b> it = this.f54474c.iterator();
        while (it.hasNext()) {
            it.next().m78142a();
        }
        this.f54474c.clear();
        Selector selector = this.f54477f;
        if (selector != null) {
            try {
                try {
                    try {
                        selector.close();
                    } catch (Exception e) {
                        m78137a("Selector close error", e);
                    }
                } catch (IOException unused) {
                    m78137a("Selector close error", null);
                }
            } finally {
                this.f54477f = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private SocketChannel m78141d() {
        Iterator<SelectionKey> it = this.f54477f.selectedKeys().iterator();
        SocketChannel socketChannel = null;
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            if (next.isConnectable()) {
                b bVar = (b) next.attachment();
                try {
                    SocketChannel socketChannel2 = bVar.f54481a;
                    if (socketChannel2.finishConnect()) {
                        next.cancel();
                        try {
                            this.f54474c.remove(bVar);
                            this.f54480i = bVar.f54482b;
                            return socketChannel2;
                        } catch (IOException unused) {
                            socketChannel = socketChannel2;
                        }
                    } else {
                        next.cancel();
                        m78135a(bVar);
                    }
                } catch (IOException unused2) {
                }
                next.cancel();
                m78135a(bVar);
            }
        }
        return socketChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Socket mo77902a(long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        SocketChannel socketChannelM78139b;
        ClosedSelectorException closedSelectorException;
        try {
            this.f54477f = Selector.open();
            try {
                socketChannelM78139b = m78139b(j, proxy, interfaceC18159e7, abstractC18338r7);
                if (socketChannelM78139b != null) {
                    try {
                        try {
                            try {
                                socketChannelM78139b.configureBlocking(true);
                            } catch (IOException unused) {
                                m78137a("Socket channel close error", null);
                                socketChannelM78139b = null;
                                m78140c();
                                if (socketChannelM78139b == null) {
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (ClosedSelectorException e) {
                                e = e;
                                closedSelectorException = e;
                                socketChannelM78139b = null;
                                m78137a("Selector is already closed", closedSelectorException);
                                m78140c();
                                if (socketChannelM78139b == null) {
                                }
                            }
                        }
                    } catch (IOException unused2) {
                        socketChannelM78139b.close();
                        socketChannelM78139b = null;
                        m78140c();
                        if (socketChannelM78139b == null) {
                        }
                    } catch (ClosedSelectorException e2) {
                        closedSelectorException = e2;
                        m78137a("Selector is already closed", closedSelectorException);
                    }
                }
            } catch (ClosedSelectorException e3) {
                e = e3;
            }
            m78140c();
            if (socketChannelM78139b == null) {
                return socketChannelM78139b.socket();
            }
            return null;
        } catch (IOException unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo77903a() {
        String str;
        if (this.f54477f != null) {
            synchronized (this.f54478g) {
                try {
                    try {
                        this.f54479h = true;
                        Selector selector = this.f54477f;
                        if (selector != null) {
                            selector.close();
                        }
                    } finally {
                        this.f54477f = null;
                    }
                } catch (IOException unused) {
                    str = "Selector close error";
                    m78137a(str, null);
                } catch (Exception unused2) {
                    str = "Selector close exception";
                    m78137a(str, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public List<InetSocketAddress> mo77904b() {
        return this.f54473b;
    }

    /* JADX INFO: renamed from: a */
    private void m78134a(long j) {
        while (this.f54474c.size() > 0) {
            b bVar = this.f54474c.get(0);
            if (!bVar.m78145c()) {
                return;
            } else {
                m78135a(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78135a(b bVar) {
        this.f54473b.add(bVar.f54482b);
        this.f54474c.remove(bVar);
        bVar.m78142a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78137a(String str, Throwable th) {
        C18406wa.m79845f().mo79425a(4, str, th);
    }

    /* JADX INFO: renamed from: a */
    private boolean m78138a(InetSocketAddress inetSocketAddress, long j, Proxy proxy, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        b bVar = new b();
        try {
            bVar.m78143a(inetSocketAddress, j, proxy, interfaceC18159e7, abstractC18338r7);
            synchronized (this.f54478g) {
                try {
                    Selector selector = this.f54477f;
                    if (selector == null) {
                        return false;
                    }
                    bVar.f54481a.register(selector, 8).attach(bVar);
                    this.f54474c.add(bVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException unused) {
            m78137a("Failed to parepare socket channel for " + inetSocketAddress.toString(), null);
            this.f54473b.add(inetSocketAddress);
            bVar.m78142a();
            return false;
        }
    }
}

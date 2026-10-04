package com.huawei.hms.drive;

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
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.bw */
/* JADX INFO: loaded from: classes6.dex */
final class C17813bw {

    /* JADX INFO: renamed from: a */
    private final ArrayList<InetSocketAddress> f53024a;

    /* JADX INFO: renamed from: d */
    private final int f53027d;

    /* JADX INFO: renamed from: e */
    private int f53028e;

    /* JADX INFO: renamed from: f */
    private Selector f53029f;

    /* JADX INFO: renamed from: b */
    private final ArrayList<InetSocketAddress> f53025b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<a> f53026c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private volatile boolean f53030g = false;

    public C17813bw(ArrayList<InetSocketAddress> arrayList, int i) {
        this.f53024a = new ArrayList<>(arrayList);
        this.f53028e = i;
        this.f53027d = arrayList.size();
    }

    /* JADX INFO: renamed from: c */
    private SocketChannel m76393c() {
        Iterator<SelectionKey> it = this.f53029f.selectedKeys().iterator();
        SocketChannel socketChannel = null;
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            if (next.isConnectable()) {
                a aVar = (a) next.attachment();
                try {
                    SocketChannel socketChannel2 = aVar.f53031a;
                    if (socketChannel2.finishConnect()) {
                        next.cancel();
                        try {
                            this.f53026c.remove(aVar);
                            return socketChannel2;
                        } catch (IOException unused) {
                            socketChannel = socketChannel2;
                            next.cancel();
                            m76388a(aVar);
                        }
                    } else {
                        next.cancel();
                        m76388a(aVar);
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return socketChannel;
    }

    /* JADX INFO: renamed from: d */
    private void m76394d() {
        Iterator<a> it = this.f53026c.iterator();
        while (it.hasNext()) {
            it.next().m76398a();
        }
        this.f53026c.clear();
        Selector selector = this.f53029f;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                m76390a("Selector close error", e);
            } finally {
                this.f53029f = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76397b() {
        if (this.f53029f != null) {
            try {
                this.f53030g = true;
                this.f53029f.close();
            } catch (IOException e) {
                m76390a("Selector close error", e);
            } finally {
                this.f53029f = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Socket m76395a(long j, Proxy proxy, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) {
        SocketChannel socketChannelM76392b;
        ClosedSelectorException closedSelectorException;
        try {
            this.f53029f = Selector.open();
            try {
                socketChannelM76392b = m76392b(j, proxy, interfaceC17775al, abstractC17786aw);
                if (socketChannelM76392b != null) {
                    try {
                        try {
                            try {
                                socketChannelM76392b.configureBlocking(true);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (ClosedSelectorException e) {
                                    e = e;
                                    closedSelectorException = e;
                                    socketChannelM76392b = null;
                                    m76390a("Selector is already closed", closedSelectorException);
                                    m76394d();
                                    if (socketChannelM76392b == null) {
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            m76390a("Socket channel close error", e2);
                            socketChannelM76392b = null;
                            m76394d();
                            if (socketChannelM76392b == null) {
                            }
                        }
                    } catch (IOException unused) {
                        socketChannelM76392b.close();
                        socketChannelM76392b = null;
                        m76394d();
                        if (socketChannelM76392b == null) {
                        }
                    } catch (ClosedSelectorException e3) {
                        closedSelectorException = e3;
                        m76390a("Selector is already closed", closedSelectorException);
                    }
                }
            } catch (ClosedSelectorException e4) {
                e = e4;
            }
            m76394d();
            if (socketChannelM76392b == null) {
                return socketChannelM76392b.socket();
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.bw$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        SocketChannel f53031a;

        /* JADX INFO: renamed from: b */
        InetSocketAddress f53032b;

        /* JADX INFO: renamed from: c */
        long f53033c;

        private a() {
            this.f53031a = null;
            this.f53032b = null;
            this.f53033c = 0L;
        }

        /* JADX INFO: renamed from: a */
        public void m76399a(InetSocketAddress inetSocketAddress, long j, Proxy proxy, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) throws IOException {
            this.f53032b = inetSocketAddress;
            this.f53033c = TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) + j;
            abstractC17786aw.m76054a(interfaceC17775al, inetSocketAddress, proxy);
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f53031a = socketChannelOpen;
            socketChannelOpen.configureBlocking(false);
            this.f53031a.connect(inetSocketAddress);
        }

        /* JADX INFO: renamed from: b */
        public boolean m76400b() {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) >= this.f53033c;
        }

        /* JADX INFO: renamed from: c */
        public long m76401c() {
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            long j = this.f53033c;
            if (millis >= j) {
                return 0L;
            }
            return j - millis;
        }

        /* JADX INFO: renamed from: a */
        public void m76398a() {
            SocketChannel socketChannel = this.f53031a;
            if (socketChannel == null) {
                return;
            }
            try {
                socketChannel.close();
            } catch (IOException e) {
                C17813bw.this.m76390a("Socket channel close error", e);
            } finally {
                this.f53031a = null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private SocketChannel m76392b(long j, Proxy proxy, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) {
        long millis;
        int i = this.f53028e;
        long j2 = i;
        long j3 = j - ((long) i);
        SocketChannel socketChannelM76393c = null;
        loop0: while (true) {
            boolean z = true;
            while (!this.f53030g) {
                if (this.f53024a.size() > 0 && z) {
                    if (m76391a(this.f53024a.remove(0), j, proxy, interfaceC17775al, abstractC17786aw)) {
                        j3 += (long) this.f53028e;
                        z = false;
                    } else {
                        continue;
                    }
                }
                if (this.f53026c.isEmpty() && this.f53024a.isEmpty()) {
                    return null;
                }
                long jM76401c = this.f53026c.size() > 0 ? this.f53026c.get(0).m76401c() : j3;
                if (this.f53024a.size() > 0 && jM76401c > j2) {
                    jM76401c = j2;
                }
                long jNanoTime = System.nanoTime();
                try {
                    this.f53029f.select(jM76401c);
                    if (this.f53030g) {
                        return null;
                    }
                    millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    socketChannelM76393c = m76393c();
                    if (socketChannelM76393c != null) {
                        break loop0;
                    }
                    m76387a(millis);
                    if (this.f53025b.size() == this.f53027d || millis >= j3) {
                        break loop0;
                    }
                    j3 -= millis;
                    if (this.f53024a.size() <= 0) {
                        continue;
                    } else {
                        if (millis >= j2) {
                            break;
                        }
                        j2 -= millis;
                    }
                } catch (IOException unused) {
                    return null;
                }
            }
            return socketChannelM76393c;
            int i2 = this.f53028e;
            j2 = ((long) i2) - ((millis - j2) % ((long) i2));
        }
        return socketChannelM76393c;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<InetSocketAddress> m76396a() {
        return this.f53025b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76390a(String str, Throwable th) {
        C17858dn.m76756e().mo76729a(4, str, th);
    }

    /* JADX INFO: renamed from: a */
    private boolean m76391a(InetSocketAddress inetSocketAddress, long j, Proxy proxy, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) {
        a aVar = new a();
        try {
            aVar.m76399a(inetSocketAddress, j, proxy, interfaceC17775al, abstractC17786aw);
            aVar.f53031a.register(this.f53029f, 8).attach(aVar);
            this.f53026c.add(aVar);
            return true;
        } catch (IOException e) {
            m76390a("Failed to parepare socket channel for " + inetSocketAddress.toString(), e);
            this.f53025b.add(inetSocketAddress);
            aVar.m76398a();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76388a(a aVar) {
        this.f53025b.add(aVar.f53032b);
        this.f53026c.remove(aVar);
        aVar.m76398a();
    }

    /* JADX INFO: renamed from: a */
    private void m76387a(long j) {
        while (this.f53026c.size() > 0) {
            a aVar = this.f53026c.get(0);
            if (!aVar.m76400b()) {
                return;
            } else {
                m76388a(aVar);
            }
        }
    }
}

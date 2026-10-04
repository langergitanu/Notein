package com.huawei.hms.drive;

import com.aspose.slides.C22212OooOoO0;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.huawei.hms.drive.cd */
/* JADX INFO: loaded from: classes6.dex */
public final class C17821cd {

    /* JADX INFO: renamed from: a */
    private final C17771ah f53076a;

    /* JADX INFO: renamed from: b */
    private final C17819cb f53077b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC17775al f53078c;

    /* JADX INFO: renamed from: d */
    private final AbstractC17786aw f53079d;

    /* JADX INFO: renamed from: e */
    private List<Proxy> f53080e;

    /* JADX INFO: renamed from: f */
    private int f53081f;

    /* JADX INFO: renamed from: g */
    private List<InetSocketAddress> f53082g;

    /* JADX INFO: renamed from: h */
    private final List<C17802bl> f53083h;

    /* JADX INFO: renamed from: i */
    private boolean f53084i;

    /* JADX INFO: renamed from: j */
    private final List<InetAddress> f53085j;

    public C17821cd(C17771ah c17771ah, C17819cb c17819cb, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw) {
        List list = Collections.EMPTY_LIST;
        this.f53080e = list;
        this.f53082g = list;
        this.f53083h = new ArrayList();
        this.f53076a = c17771ah;
        this.f53077b = c17819cb;
        this.f53078c = interfaceC17775al;
        this.f53079d = abstractC17786aw;
        this.f53084i = interfaceC17775al.mo75979a().m76266e();
        this.f53085j = interfaceC17775al.mo75979a().m76267f();
        m76435a(c17771ah.m75952b(), c17771ah.m75959i());
        if (this.f53084i) {
            if (this.f53080e.size() > 1 || (this.f53080e.size() == 1 && this.f53080e.get(0).type() != Proxy.Type.DIRECT)) {
                this.f53084i = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m76437c() {
        return this.f53081f < this.f53080e.size();
    }

    /* JADX INFO: renamed from: d */
    private Proxy m76438d() throws IOException {
        if (!m76437c()) {
            throw new SocketException("No route to " + this.f53076a.m75952b().m76151f() + "; exhausted proxy configurations: " + this.f53080e);
        }
        List<Proxy> list = this.f53080e;
        int i = this.f53081f;
        this.f53081f = i + 1;
        Proxy proxy = list.get(i);
        m76436a(proxy);
        return proxy;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76440a() {
        return m76437c() || !this.f53083h.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public a m76441b() throws IOException {
        if (!m76440a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m76437c()) {
            Proxy proxyM76438d = m76438d();
            int size = this.f53082g.size();
            for (int i = 0; i < size; i++) {
                C17802bl c17802bl = new C17802bl(this.f53076a, proxyM76438d, this.f53082g.get(i));
                if (this.f53077b.m76429c(c17802bl)) {
                    this.f53083h.add(c17802bl);
                } else {
                    arrayList.add(c17802bl);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (this.f53084i || arrayList.isEmpty()) {
            arrayList.addAll(this.f53083h);
            this.f53083h.clear();
        }
        return new a(arrayList, this.f53084i, this.f53077b);
    }

    /* JADX INFO: renamed from: a */
    public void m76439a(C17802bl c17802bl, IOException iOException) {
        if (c17802bl.m76316b().type() != Proxy.Type.DIRECT && this.f53076a.m75958h() != null) {
            this.f53076a.m75958h().connectFailed(this.f53076a.m75952b().m76144a(), c17802bl.m76316b().address(), iOException);
        }
        if (this.f53084i) {
            return;
        }
        this.f53077b.m76427a(c17802bl);
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.cd$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<C17802bl> f53086a;

        /* JADX INFO: renamed from: c */
        private final C17819cb f53088c;

        /* JADX INFO: renamed from: d */
        private boolean f53089d;

        /* JADX INFO: renamed from: b */
        private int f53087b = 0;

        /* JADX INFO: renamed from: e */
        private InetSocketAddress f53090e = null;

        public a(List<C17802bl> list, boolean z, C17819cb c17819cb) {
            this.f53086a = list;
            this.f53089d = z;
            this.f53088c = c17819cb;
        }

        /* JADX INFO: renamed from: a */
        public boolean m76446a() {
            return this.f53089d ? this.f53086a.size() > 0 : this.f53087b < this.f53086a.size();
        }

        /* JADX INFO: renamed from: b */
        public C17802bl m76447b() {
            if (!m76446a()) {
                throw new NoSuchElementException();
            }
            if (this.f53089d) {
                return this.f53086a.get(0);
            }
            List<C17802bl> list = this.f53086a;
            int i = this.f53087b;
            this.f53087b = i + 1;
            return list.get(i);
        }

        /* JADX INFO: renamed from: c */
        public List<C17802bl> m76448c() {
            return new ArrayList(this.f53086a);
        }

        /* JADX INFO: renamed from: d */
        public boolean m76449d() {
            return this.f53089d;
        }

        /* JADX INFO: renamed from: e */
        public ArrayList<InetSocketAddress> m76450e() {
            ArrayList<InetSocketAddress> arrayList = new ArrayList<>();
            Iterator<C17802bl> it = this.f53086a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m76317c());
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public void m76451f() {
            InetSocketAddress inetSocketAddress;
            if (!this.f53089d || (inetSocketAddress = this.f53090e) == null) {
                return;
            }
            C17802bl c17802blM76442b = m76442b(inetSocketAddress);
            if (c17802blM76442b != null) {
                this.f53088c.m76427a(c17802blM76442b);
            }
            this.f53090e = null;
        }

        /* JADX INFO: renamed from: a */
        public void m76443a(C17802bl c17802bl) {
            if (!this.f53089d) {
                this.f53088c.m76428b(c17802bl);
                return;
            }
            InetSocketAddress inetSocketAddress = this.f53090e;
            if (inetSocketAddress == null) {
                return;
            }
            C17802bl c17802blM76442b = m76442b(inetSocketAddress);
            if (c17802blM76442b != null) {
                this.f53088c.m76428b(c17802blM76442b);
            }
            this.f53090e = null;
        }

        /* JADX INFO: renamed from: b */
        private C17802bl m76442b(InetSocketAddress inetSocketAddress) {
            Iterator<C17802bl> it = this.f53086a.iterator();
            while (it.hasNext()) {
                C17802bl next = it.next();
                if (next.m76317c().equals(inetSocketAddress)) {
                    it.remove();
                    return next;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m76444a(InetSocketAddress inetSocketAddress) {
            if (this.f53089d) {
                this.f53090e = inetSocketAddress;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m76445a(ArrayList<InetSocketAddress> arrayList) {
            if (this.f53089d) {
                Iterator<InetSocketAddress> it = arrayList.iterator();
                while (it.hasNext()) {
                    C17802bl c17802blM76442b = m76442b(it.next());
                    if (c17802blM76442b != null) {
                        this.f53088c.m76427a(c17802blM76442b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76435a(C17792bb c17792bb, Proxy proxy) {
        List<Proxy> listM76333a;
        if (proxy != null) {
            this.f53080e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f53076a.m75958h().select(c17792bb.m76144a());
            if (listSelect != null && !listSelect.isEmpty()) {
                listM76333a = C17806bp.m76332a(listSelect);
            } else {
                listM76333a = C17806bp.m76333a(Proxy.NO_PROXY);
            }
            this.f53080e = listM76333a;
        }
        this.f53081f = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m76436a(Proxy proxy) throws IOException {
        String strM76151f;
        int iM76152g;
        this.f53082g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strM76151f = m76433a(inetSocketAddress);
                iM76152g = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strM76151f = this.f53076a.m75952b().m76151f();
            iM76152g = this.f53076a.m75952b().m76152g();
        }
        if (iM76152g >= 1 && iM76152g <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f53082g.add(InetSocketAddress.createUnresolved(strM76151f, iM76152g));
            } else if (!this.f53084i || this.f53085j.isEmpty()) {
                this.f53079d.m76052a(this.f53078c, strM76151f);
                List<InetAddress> listMo76043a = this.f53076a.m75953c().mo76043a(strM76151f);
                if (!listMo76043a.isEmpty()) {
                    this.f53079d.m76053a(this.f53078c, strM76151f, listMo76043a);
                    int size = listMo76043a.size();
                    for (int i = 0; i < size; i++) {
                        this.f53082g.add(new InetSocketAddress(listMo76043a.get(i), iM76152g));
                    }
                } else {
                    throw new UnknownHostException(this.f53076a.m75953c() + " returned no addresses for " + strM76151f);
                }
            }
            m76434a(iM76152g);
            return;
        }
        throw new SocketException(C22212OooOoO0.OooO0OO(iM76152g, "No route to ", strM76151f, C18241k5.f55433h, "; port is out of range"));
    }

    /* JADX INFO: renamed from: a */
    private void m76434a(int i) {
        if (this.f53084i) {
            List<InetAddress> list = this.f53085j;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f53085j.get(size), i);
                    if (this.f53082g.contains(inetSocketAddress)) {
                        this.f53082g.remove(inetSocketAddress);
                    }
                    this.f53082g.add(0, inetSocketAddress);
                }
            }
            if (this.f53082g.size() == 1) {
                this.f53084i = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m76433a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}

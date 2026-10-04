package com.huawei.hms.network.embedded;

import com.aspose.slides.C22212OooOoO0;
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

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18273m9 {

    /* JADX INFO: renamed from: a */
    public final C18103a7 f55694a;

    /* JADX INFO: renamed from: b */
    public final C18245k9 f55695b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18159e7 f55696c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18338r7 f55697d;

    /* JADX INFO: renamed from: e */
    public List<Proxy> f55698e;

    /* JADX INFO: renamed from: f */
    public int f55699f;

    /* JADX INFO: renamed from: g */
    public List<InetSocketAddress> f55700g;

    /* JADX INFO: renamed from: h */
    public final List<C18216i8> f55701h;

    /* JADX INFO: renamed from: i */
    public boolean f55702i;

    /* JADX INFO: renamed from: j */
    public List<InetAddress> f55703j;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.m9$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C18216i8> f55704a;

        /* JADX INFO: renamed from: b */
        public int f55705b;

        /* JADX INFO: renamed from: c */
        public C18216i8 f55706c;

        /* JADX INFO: renamed from: d */
        public int f55707d;

        /* JADX INFO: renamed from: e */
        public int f55708e;

        /* JADX INFO: renamed from: f */
        public final C18245k9 f55709f;

        /* JADX INFO: renamed from: g */
        public boolean f55710g;

        /* JADX INFO: renamed from: h */
        public InetSocketAddress f55711h;

        public a(List<C18216i8> list) {
            this.f55705b = 0;
            this.f55707d = 0;
            this.f55708e = 0;
            this.f55711h = null;
            this.f55704a = list;
            this.f55710g = false;
            this.f55709f = null;
        }

        /* JADX INFO: renamed from: b */
        private C18216i8 m79174b(InetSocketAddress inetSocketAddress) {
            Iterator<C18216i8> it = this.f55704a.iterator();
            while (it.hasNext()) {
                C18216i8 next = it.next();
                if (next.m78769d().equals(inetSocketAddress)) {
                    it.remove();
                    return next;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m79175a(C18216i8 c18216i8) {
            if (!this.f55710g) {
                this.f55709f.m78980a(c18216i8);
                return;
            }
            InetSocketAddress inetSocketAddress = this.f55711h;
            if (inetSocketAddress == null) {
                return;
            }
            C18216i8 c18216i8M79174b = m79174b(inetSocketAddress);
            if (c18216i8M79174b != null) {
                this.f55709f.m78980a(c18216i8M79174b);
            }
            this.f55711h = null;
        }

        /* JADX INFO: renamed from: c */
        public void m79181c() {
            InetSocketAddress inetSocketAddress;
            if (!this.f55710g || (inetSocketAddress = this.f55711h) == null) {
                return;
            }
            C18216i8 c18216i8M79174b = m79174b(inetSocketAddress);
            if (c18216i8M79174b != null) {
                this.f55709f.m78981b(c18216i8M79174b);
            }
            this.f55711h = null;
        }

        /* JADX INFO: renamed from: d */
        public List<C18216i8> m79182d() {
            return new ArrayList(this.f55704a);
        }

        /* JADX INFO: renamed from: e */
        public C18216i8 m79183e() {
            return this.f55706c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m79184f() {
            return this.f55710g ? this.f55704a.size() > 0 && this.f55707d < this.f55708e : this.f55705b < this.f55704a.size();
        }

        /* JADX INFO: renamed from: g */
        public C18216i8 m79185g() {
            if (!m79184f()) {
                throw new NoSuchElementException();
            }
            if (this.f55710g) {
                C18216i8 c18216i8 = this.f55704a.get(0);
                this.f55706c = c18216i8;
                this.f55707d++;
                return c18216i8;
            }
            List<C18216i8> list = this.f55704a;
            int i = this.f55705b;
            this.f55705b = i + 1;
            return list.get(i);
        }

        /* JADX INFO: renamed from: h */
        public void m79186h() {
            if (this.f55710g) {
                Iterator<C18216i8> it = this.f55704a.iterator();
                while (it.hasNext()) {
                    C18216i8 next = it.next();
                    if (this.f55706c != null && next.m78769d().equals(this.f55706c.m78769d())) {
                        it.remove();
                        this.f55709f.m78981b(next);
                        return;
                    }
                }
            }
        }

        public a(List<C18216i8> list, C18245k9 c18245k9, boolean z) {
            this.f55705b = 0;
            this.f55707d = 0;
            this.f55708e = 0;
            this.f55711h = null;
            this.f55704a = list;
            if (list != null) {
                this.f55708e = list.size();
            }
            this.f55709f = c18245k9;
            this.f55710g = z;
        }

        /* JADX INFO: renamed from: a */
        public void m79176a(InetSocketAddress inetSocketAddress) {
            if (this.f55710g) {
                this.f55711h = inetSocketAddress;
            }
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<InetSocketAddress> m79179b() {
            ArrayList<InetSocketAddress> arrayList = new ArrayList<>();
            Iterator<C18216i8> it = this.f55704a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m78769d());
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        public void m79177a(List<InetSocketAddress> list) {
            if (this.f55710g) {
                Iterator<InetSocketAddress> it = list.iterator();
                while (it.hasNext()) {
                    C18216i8 c18216i8M79174b = m79174b(it.next());
                    if (c18216i8M79174b != null) {
                        this.f55709f.m78981b(c18216i8M79174b);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m79180b(C18216i8 c18216i8) {
            this.f55706c = c18216i8;
        }

        /* JADX INFO: renamed from: a */
        public boolean m79178a() {
            return this.f55710g;
        }
    }

    public C18273m9(C18103a7 c18103a7, C18245k9 c18245k9, InterfaceC18159e7 interfaceC18159e7, AbstractC18338r7 abstractC18338r7) {
        List list = Collections.EMPTY_LIST;
        this.f55698e = list;
        this.f55700g = list;
        this.f55701h = new ArrayList();
        this.f55694a = c18103a7;
        this.f55695b = c18245k9;
        this.f55696c = interfaceC18159e7;
        this.f55697d = abstractC18338r7;
        m79167a(c18103a7.m77862l(), c18103a7.m77857g());
    }

    /* JADX INFO: renamed from: c */
    private boolean m79169c() {
        return this.f55699f < this.f55698e.size();
    }

    /* JADX INFO: renamed from: d */
    private Proxy m79170d() throws IOException {
        if (!m79169c()) {
            throw new SocketException("No route to " + this.f55694a.m77862l().m79929h() + "; exhausted proxy configurations: " + this.f55698e);
        }
        List<Proxy> list = this.f55698e;
        int i = this.f55699f;
        this.f55699f = i + 1;
        Proxy proxy = list.get(i);
        m79168a(proxy);
        return proxy;
    }

    /* JADX INFO: renamed from: a */
    public C18273m9 m79171a(C18160e8 c18160e8) {
        this.f55702i = c18160e8.m78303d();
        this.f55703j = c18160e8.m78299a();
        if (this.f55702i && (this.f55698e.size() > 1 || (this.f55698e.size() == 1 && this.f55698e.get(0).type() != Proxy.Type.DIRECT))) {
            this.f55702i = false;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public a m79173b() throws IOException {
        if (!m79172a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m79169c()) {
            Proxy proxyM79170d = m79170d();
            int size = this.f55700g.size();
            for (int i = 0; i < size; i++) {
                C18216i8 c18216i8 = new C18216i8(this.f55694a, proxyM79170d, this.f55700g.get(i));
                if (this.f55695b.m78982c(c18216i8)) {
                    this.f55701h.add(c18216i8);
                } else {
                    arrayList.add(c18216i8);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (this.f55702i || arrayList.isEmpty()) {
            arrayList.addAll(this.f55701h);
            this.f55701h.clear();
        }
        return new a(arrayList, this.f55695b, this.f55702i);
    }

    /* JADX INFO: renamed from: a */
    public static String m79165a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* JADX INFO: renamed from: a */
    private void m79166a(int i) {
        if (this.f55702i) {
            List<InetAddress> list = this.f55703j;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f55703j.get(size), i);
                    if (this.f55700g.contains(inetSocketAddress)) {
                        this.f55700g.remove(inetSocketAddress);
                    }
                    this.f55700g.add(0, inetSocketAddress);
                }
            }
            if (this.f55700g.size() == 1) {
                this.f55702i = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79167a(C18416x7 c18416x7, Proxy proxy) {
        List<Proxy> listM79373a;
        if (proxy != null) {
            listM79373a = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f55694a.m77859i().select(c18416x7.m79942u());
            listM79373a = (listSelect == null || listSelect.isEmpty()) ? C18313p8.m79373a(Proxy.NO_PROXY) : C18313p8.m79372a(listSelect);
        }
        this.f55698e = listM79373a;
        this.f55699f = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m79168a(Proxy proxy) throws IOException {
        String strM79929h;
        int iM79935n;
        this.f55700g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM79929h = this.f55694a.m77862l().m79929h();
            iM79935n = this.f55694a.m77862l().m79935n();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM79929h = m79165a(inetSocketAddress);
            iM79935n = inetSocketAddress.getPort();
        }
        if (iM79935n < 1 || iM79935n > 65535) {
            throw new SocketException(C22212OooOoO0.OooO0OO(iM79935n, "No route to ", strM79929h, C18241k5.f55433h, "; port is out of range"));
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f55700g.add(InetSocketAddress.createUnresolved(strM79929h, iM79935n));
        } else if (!this.f55702i || this.f55703j.isEmpty()) {
            this.f55697d.dnsStart(this.f55696c, strM79929h);
            List<InetAddress> listLookup = this.f55694a.m77853c().lookup(strM79929h);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.f55694a.m77853c() + " returned no addresses for " + strM79929h);
            }
            this.f55697d.dnsEnd(this.f55696c, strM79929h, listLookup);
            int size = listLookup.size();
            for (int i = 0; i < size; i++) {
                this.f55700g.add(new InetSocketAddress(listLookup.get(i), iM79935n));
            }
        }
        m79166a(iM79935n);
    }

    /* JADX INFO: renamed from: a */
    public boolean m79172a() {
        return m79169c() || !this.f55701h.isEmpty();
    }
}

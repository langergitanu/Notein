package com.huawei.hms.drive;

import com.huawei.hms.drive.C17821cd;
import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.ce */
/* JADX INFO: loaded from: classes6.dex */
public final class C17822ce {

    /* JADX INFO: renamed from: d */
    static final /* synthetic */ boolean f53091d = true;

    /* JADX INFO: renamed from: a */
    public final C17771ah f53092a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17775al f53093b;

    /* JADX INFO: renamed from: c */
    public final AbstractC17786aw f53094c;

    /* JADX INFO: renamed from: e */
    private C17821cd.a f53095e;

    /* JADX INFO: renamed from: f */
    private C17802bl f53096f;

    /* JADX INFO: renamed from: g */
    private final C17780aq f53097g;

    /* JADX INFO: renamed from: h */
    private final Object f53098h;

    /* JADX INFO: renamed from: i */
    private final C17821cd f53099i;

    /* JADX INFO: renamed from: j */
    private int f53100j;

    /* JADX INFO: renamed from: k */
    private C17818ca f53101k;

    /* JADX INFO: renamed from: l */
    private boolean f53102l;

    /* JADX INFO: renamed from: m */
    private boolean f53103m;

    /* JADX INFO: renamed from: n */
    private boolean f53104n;

    /* JADX INFO: renamed from: o */
    private InterfaceC17825ch f53105o;

    /* JADX INFO: renamed from: p */
    private final int f53106p;

    /* JADX INFO: renamed from: com.huawei.hms.drive.ce$a */
    public static final class a extends WeakReference<C17822ce> {

        /* JADX INFO: renamed from: a */
        public final Object f53107a;

        public a(C17822ce c17822ce, Object obj) {
            super(c17822ce);
            this.f53107a = obj;
        }
    }

    public C17822ce(C17780aq c17780aq, C17771ah c17771ah, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw, Object obj, int i) {
        this.f53097g = c17780aq;
        this.f53092a = c17771ah;
        this.f53099i = new C17821cd(c17771ah, m76457i(), interfaceC17775al, abstractC17786aw);
        this.f53093b = interfaceC17775al;
        this.f53094c = abstractC17786aw;
        this.f53098h = obj;
        this.f53106p = i;
    }

    /* JADX INFO: renamed from: h */
    private Socket m76456h() {
        if (!f53091d && !Thread.holdsLock(this.f53097g)) {
            throw new AssertionError();
        }
        C17818ca c17818ca = this.f53101k;
        if (c17818ca == null || !c17818ca.f53052a) {
            return null;
        }
        return m76454a(false, false, true);
    }

    /* JADX INFO: renamed from: i */
    private C17819cb m76457i() {
        return AbstractC17804bn.f52952a.mo76223a(this.f53097g);
    }

    /* JADX INFO: renamed from: a */
    public void m76461a(C17795be c17795be, C17798bh c17798bh) throws Throwable {
        C17818ca c17818ca;
        C17821cd.a aVar;
        int iM76195b = c17795be.m76195b();
        int iM76197c = c17795be.m76197c();
        int iM76198d = c17795be.m76198d();
        int iM76199e = c17795be.m76199e();
        boolean zM76214t = c17795be.m76214t();
        if (!c17798bh.m76271j()) {
            throw new IllegalArgumentException("a normal Request without http2ConnectionIndex");
        }
        if (Integer.parseInt(c17798bh.m76262a("Http2ConnectionIndex")) > this.f53097g.m76000a(this.f53092a)) {
            if (this.f53096f == null && ((aVar = this.f53095e) == null || !aVar.m76446a())) {
                this.f53095e = this.f53099i.m76441b();
            }
            synchronized (this.f53097g) {
                try {
                    C17802bl c17802blM76447b = this.f53095e.m76447b();
                    this.f53096f = c17802blM76447b;
                    c17818ca = new C17818ca(this.f53097g, c17802blM76447b);
                    if (this.f53095e.m76449d()) {
                        c17818ca.m76418a(this.f53095e.m76450e(), this.f53106p);
                        c17818ca.m76415a(this.f53095e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c17818ca.m76414a(iM76195b, iM76197c, iM76198d, iM76199e, zM76214t, this.f53093b, this.f53094c);
            this.f53095e.m76443a(c17818ca.m76422b());
            c17818ca.f53057f = System.nanoTime();
            synchronized (this.f53097g) {
                AbstractC17804bn.f52952a.mo76231b(this.f53097g, c17818ca);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C17802bl m76465b() {
        return this.f53096f;
    }

    /* JADX INFO: renamed from: c */
    public synchronized C17818ca m76466c() {
        return this.f53101k;
    }

    /* JADX INFO: renamed from: d */
    public void m76467d() {
        C17818ca c17818ca;
        Socket socketM76454a;
        synchronized (this.f53097g) {
            c17818ca = this.f53101k;
            socketM76454a = m76454a(false, true, false);
            if (this.f53101k != null) {
                c17818ca = null;
            }
        }
        C17806bp.m76340a(socketM76454a);
        if (c17818ca != null) {
            AbstractC17804bn.f52952a.mo76224a(this.f53093b, (IOException) null);
            this.f53094c.m76059b(this.f53093b, c17818ca);
            this.f53094c.m76064g(this.f53093b);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m76468e() {
        C17818ca c17818ca;
        Socket socketM76454a;
        synchronized (this.f53097g) {
            c17818ca = this.f53101k;
            socketM76454a = m76454a(true, false, false);
            if (this.f53101k != null) {
                c17818ca = null;
            }
        }
        C17806bp.m76340a(socketM76454a);
        if (c17818ca != null) {
            this.f53094c.m76059b(this.f53093b, c17818ca);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m76469f() {
        InterfaceC17825ch interfaceC17825ch;
        C17818ca c17818ca;
        synchronized (this.f53097g) {
            this.f53104n = true;
            interfaceC17825ch = this.f53105o;
            c17818ca = this.f53101k;
        }
        if (interfaceC17825ch != null) {
            interfaceC17825ch.mo76478c();
        } else if (c17818ca != null) {
            c17818ca.m76423c();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m76470g() {
        if (this.f53096f != null) {
            return true;
        }
        C17821cd.a aVar = this.f53095e;
        return (aVar != null && aVar.m76446a()) || this.f53099i.m76440a();
    }

    public String toString() {
        C17818ca c17818caM76466c = m76466c();
        return c17818caM76466c != null ? c17818caM76466c.toString() : this.f53092a.toString();
    }

    /* JADX INFO: renamed from: b */
    private void m76455b(C17818ca c17818ca) {
        int size = c17818ca.f53055d.size();
        for (int i = 0; i < size; i++) {
            if (c17818ca.f53055d.get(i).get() == this) {
                c17818ca.f53055d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17825ch m76459a(C17795be c17795be, InterfaceC17793bc.a aVar, boolean z) {
        try {
            InterfaceC17825ch interfaceC17825chM76413a = m76453a(c17795be, aVar.mo76183b(), aVar.mo76184c(), aVar.mo76185d(), c17795be.m76199e(), c17795be.m76214t(), z).m76413a(c17795be, aVar, this);
            synchronized (this.f53097g) {
                this.f53105o = interfaceC17825chM76413a;
            }
            return interfaceC17825chM76413a;
        } catch (IOException e) {
            throw new C17820cc(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private C17818ca m76453a(C17795be c17795be, int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C17818ca c17818caM76452a = m76452a(c17795be, i, i2, i3, i4, z);
            boolean z3 = z;
            int i5 = i4;
            int i6 = i3;
            int i7 = i2;
            int i8 = i;
            C17795be c17795be2 = c17795be;
            synchronized (this.f53097g) {
                try {
                    if (c17818caM76452a.f53053b == 0 && !c17818caM76452a.m76426f()) {
                        return c17818caM76452a;
                    }
                    if (c17818caM76452a.m76421a(z2)) {
                        return c17818caM76452a;
                    }
                    m76468e();
                    c17795be = c17795be2;
                    i = i8;
                    i2 = i7;
                    i3 = i6;
                    i4 = i5;
                    z = z3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private C17818ca m76452a(C17795be c17795be, int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C17818ca c17818ca;
        Socket socketM76456h;
        C17818ca c17818ca2;
        Socket socketMo76225a;
        C17802bl c17802blM76447b;
        boolean z2;
        boolean z3;
        C17818ca c17818ca3;
        C17821cd.a aVar;
        synchronized (this.f53097g) {
            try {
                if (!this.f53103m) {
                    if (this.f53105o == null) {
                        if (!this.f53104n) {
                            c17818ca = this.f53101k;
                            socketM76456h = m76456h();
                            c17818ca2 = this.f53101k;
                            socketMo76225a = null;
                            if (c17818ca2 != null) {
                                c17818ca = null;
                            } else {
                                c17818ca2 = null;
                            }
                            if (!this.f53102l) {
                                c17818ca = null;
                            }
                            if (c17818ca2 == null) {
                                AbstractC17804bn.f52952a.mo76222a(this.f53097g, this.f53092a, this, (C17802bl) null);
                                C17818ca c17818ca4 = this.f53101k;
                                if (c17818ca4 != null) {
                                    z2 = true;
                                    c17818ca2 = c17818ca4;
                                    c17802blM76447b = null;
                                } else {
                                    c17802blM76447b = this.f53096f;
                                }
                            } else {
                                c17802blM76447b = null;
                            }
                            z2 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        C17806bp.m76340a(socketM76456h);
        if (c17818ca != null) {
            this.f53094c.m76059b(this.f53093b, c17818ca);
        }
        if (z2) {
            this.f53094c.m76047a(this.f53093b, c17818ca2);
        }
        if (c17818ca2 != null) {
            this.f53096f = this.f53101k.m76422b();
            this.f53095e = this.f53101k.m76412a();
            return c17818ca2;
        }
        if (c17802blM76447b != null || ((aVar = this.f53095e) != null && aVar.m76446a())) {
            z3 = false;
        } else {
            this.f53095e = this.f53099i.m76441b();
            z3 = true;
        }
        synchronized (this.f53097g) {
            try {
                if (this.f53104n) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    List<C17802bl> listM76448c = this.f53095e.m76448c();
                    int size = listM76448c.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        C17802bl c17802bl = listM76448c.get(i5);
                        AbstractC17804bn.f52952a.mo76222a(this.f53097g, this.f53092a, this, c17802bl);
                        C17818ca c17818ca5 = this.f53101k;
                        if (c17818ca5 != null) {
                            this.f53096f = c17802bl;
                            z2 = true;
                            c17818ca2 = c17818ca5;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (c17802blM76447b == null) {
                        c17802blM76447b = this.f53095e.m76447b();
                    }
                    this.f53096f = c17802blM76447b;
                    this.f53100j = 0;
                    c17818ca2 = new C17818ca(this.f53097g, c17802blM76447b);
                    c17818ca2.m76415a(this.f53095e);
                    if (this.f53095e.m76449d()) {
                        c17818ca2.m76418a(this.f53095e.m76450e(), this.f53106p);
                    }
                    m76462a(c17818ca2, false);
                }
                c17818ca3 = c17818ca2;
            } finally {
            }
        }
        if (z2) {
            this.f53094c.m76047a(this.f53093b, c17818ca3);
            return c17818ca3;
        }
        c17818ca3.m76414a(i, i2, i3, i4, z, this.f53093b, this.f53094c);
        this.f53095e.m76443a(c17818ca3.m76422b());
        synchronized (this.f53097g) {
            try {
                this.f53102l = true;
                AbstractC17804bn.f52952a.mo76231b(this.f53097g, c17818ca3);
                if (c17818ca3.m76426f()) {
                    socketMo76225a = AbstractC17804bn.f52952a.mo76225a(c17795be, this.f53097g, this.f53092a, this);
                    c17818ca3 = this.f53101k;
                }
            } finally {
            }
        }
        C17806bp.m76340a(socketMo76225a);
        this.f53094c.m76047a(this.f53093b, c17818ca3);
        return c17818ca3;
    }

    /* JADX INFO: renamed from: a */
    public void m76464a(boolean z, InterfaceC17825ch interfaceC17825ch, long j, IOException iOException) {
        C17818ca c17818ca;
        Socket socketM76454a;
        boolean z2;
        this.f53094c.m76058b(this.f53093b, j);
        synchronized (this.f53097g) {
            if (interfaceC17825ch != null) {
                try {
                    if (interfaceC17825ch == this.f53105o) {
                        if (!z) {
                            C17818ca c17818ca2 = this.f53101k;
                            c17818ca2.f53053b++;
                            c17818ca2.f53059h = 0;
                        }
                        c17818ca = this.f53101k;
                        socketM76454a = m76454a(z, false, true);
                        if (this.f53101k != null) {
                            c17818ca = null;
                        }
                        z2 = this.f53103m;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f53105o + " but was " + interfaceC17825ch);
        }
        C17806bp.m76340a(socketM76454a);
        if (c17818ca != null) {
            this.f53094c.m76059b(this.f53093b, c17818ca);
        }
        if (iOException != null) {
            this.f53094c.m76051a(this.f53093b, AbstractC17804bn.f52952a.mo76224a(this.f53093b, iOException));
        } else if (z2) {
            AbstractC17804bn.f52952a.mo76224a(this.f53093b, (IOException) null);
            this.f53094c.m76064g(this.f53093b);
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17825ch m76458a() {
        InterfaceC17825ch interfaceC17825ch;
        synchronized (this.f53097g) {
            interfaceC17825ch = this.f53105o;
        }
        return interfaceC17825ch;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Socket m76454a(boolean z, boolean z2, boolean z3) {
        Socket socketM76424d;
        if (!f53091d && !Thread.holdsLock(this.f53097g)) {
            throw new AssertionError();
        }
        if (z3) {
            this.f53105o = null;
        }
        if (z2) {
            this.f53103m = true;
        }
        C17818ca c17818ca = this.f53101k;
        if (c17818ca != null) {
            if (z) {
                c17818ca.f53052a = true;
            }
            if (this.f53105o == null && (this.f53103m || c17818ca.f53052a)) {
                m76455b(c17818ca);
                if (this.f53101k.f53055d.isEmpty()) {
                    this.f53101k.f53056e = System.nanoTime();
                    socketM76424d = AbstractC17804bn.f52952a.mo76230a(this.f53097g, this.f53101k) ? this.f53101k.m76424d() : null;
                }
                this.f53101k = null;
                return socketM76424d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m76463a(IOException iOException) {
        C17818ca c17818ca;
        boolean z;
        Socket socketM76454a;
        synchronized (this.f53097g) {
            try {
                c17818ca = null;
                if (iOException instanceof C17850df) {
                    EnumC17837ct enumC17837ct = ((C17850df) iOException).f53357a;
                    if (enumC17837ct == EnumC17837ct.REFUSED_STREAM) {
                        int i = this.f53100j + 1;
                        this.f53100j = i;
                        if (i > 1) {
                            this.f53096f = null;
                            z = true;
                        }
                        z = false;
                    } else {
                        if (enumC17837ct != EnumC17837ct.CANCEL) {
                            this.f53096f = null;
                            z = true;
                        }
                        z = false;
                    }
                } else {
                    C17818ca c17818ca2 = this.f53101k;
                    if (c17818ca2 != null && (!c17818ca2.m76426f() || (iOException instanceof C17836cs))) {
                        if (this.f53101k.f53053b == 0) {
                            C17802bl c17802bl = this.f53096f;
                            if (c17802bl != null && iOException != null) {
                                this.f53099i.m76439a(c17802bl, iOException);
                                C17821cd.a aVar = this.f53095e;
                                if (aVar != null) {
                                    aVar.m76451f();
                                }
                            }
                            this.f53096f = null;
                        }
                    } else {
                        C17818ca c17818ca3 = this.f53101k;
                        if (c17818ca3 != null && c17818ca3.m76426f() && (iOException instanceof SocketTimeoutException)) {
                            C17818ca c17818ca4 = this.f53101k;
                            int i2 = c17818ca4.f53059h + 1;
                            c17818ca4.f53059h = i2;
                            if (i2 > c17818ca4.f53060i) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                C17818ca c17818ca5 = this.f53101k;
                socketM76454a = m76454a(z, false, true);
                if (this.f53101k == null && this.f53102l) {
                    c17818ca = c17818ca5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C17806bp.m76340a(socketM76454a);
        if (c17818ca != null) {
            this.f53094c.m76059b(this.f53093b, c17818ca);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76462a(C17818ca c17818ca, boolean z) {
        if (!f53091d && !Thread.holdsLock(this.f53097g)) {
            throw new AssertionError();
        }
        C17818ca c17818ca2 = this.f53101k;
        if (c17818ca2 != null && !c17818ca2.f53052a) {
            throw new IllegalStateException();
        }
        this.f53101k = c17818ca;
        this.f53102l = z;
        c17818ca.f53055d.add(new a(this, this.f53098h));
    }

    /* JADX INFO: renamed from: a */
    public Socket m76460a(C17818ca c17818ca) {
        if (!f53091d && !Thread.holdsLock(this.f53097g)) {
            throw new AssertionError();
        }
        if (this.f53105o == null && this.f53101k.f53055d.size() == 1) {
            Reference<C17822ce> reference = this.f53101k.f53055d.get(0);
            Socket socketM76454a = m76454a(true, false, false);
            this.f53101k = c17818ca;
            c17818ca.f53055d.add(reference);
            return socketM76454a;
        }
        throw new IllegalStateException();
    }
}

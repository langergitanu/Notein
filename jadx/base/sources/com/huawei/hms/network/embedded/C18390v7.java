package com.huawei.hms.network.embedded;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18146d8;
import com.huawei.hms.network.embedded.C18146d8.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18390v7 extends C18312p7 {

    /* JADX INFO: renamed from: o */
    public static final int f56410o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f56411p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f56412q = 32;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f56413r = true;

    /* JADX INFO: renamed from: j */
    public int f56414j = 5;

    /* JADX INFO: renamed from: k */
    public int f56415k = 2;

    /* JADX INFO: renamed from: l */
    public int f56416l = 32;

    /* JADX INFO: renamed from: m */
    public final List<b> f56417m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f56418n = 2;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v7$a */
    public class a implements InterfaceC18173f7 {
        public a() {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18173f7
        public void onFailure(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18173f7
        public void onResponse(InterfaceC18159e7 interfaceC18159e7, C18188g8 c18188g8) throws IOException {
            if (c18188g8 != null) {
                c18188g8.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v7$b */
    public final class b {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ boolean f56420h = true;

        /* JADX INFO: renamed from: a */
        public String f56421a;

        /* JADX INFO: renamed from: b */
        public int f56422b;

        /* JADX INFO: renamed from: c */
        public String f56423c;

        /* JADX INFO: renamed from: d */
        public int f56424d;

        /* JADX INFO: renamed from: e */
        public int f56425e;

        /* JADX INFO: renamed from: f */
        public int f56426f = 1;

        public b(String str, int i, String str2) {
            this.f56421a = str;
            this.f56422b = i;
            this.f56423c = str2;
            m79743a(str, i, str2);
        }

        /* JADX INFO: renamed from: a */
        private void m79743a(String str, int i, String str2) {
            if (!f56420h && !Thread.holdsLock(C18390v7.this)) {
                throw new AssertionError();
            }
            Iterator<C18146d8.a> it = C18390v7.this.f55890f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C18416x7 c18416x7M78310k = it.next().m78226h().m78310k();
                if (c18416x7M78310k.m79929h().equals(str) && c18416x7M78310k.m79935n() == i && c18416x7M78310k.m79940s().equals(str2)) {
                    i2++;
                }
            }
            this.f56425e = i2;
            Iterator<C18146d8.a> it2 = C18390v7.this.f55889e.iterator();
            while (it2.hasNext()) {
                C18416x7 c18416x7M78310k2 = it2.next().m78226h().m78310k();
                if (c18416x7M78310k2.m79929h().equals(str) && c18416x7M78310k2.m79935n() == i && c18416x7M78310k2.m79940s().equals(str2)) {
                    i2++;
                }
            }
            this.f56424d = i2;
        }
    }

    public C18390v7() {
    }

    /* JADX INFO: renamed from: a */
    private b m79729a(C18160e8 c18160e8) {
        return m79733c(c18160e8.m78310k().m79929h(), c18160e8.m78310k().m79935n(), c18160e8.m78310k().m79940s());
    }

    /* JADX INFO: renamed from: c */
    private b m79733c(String str, int i, String str2) {
        for (b bVar : this.f56417m) {
            if (bVar.f56421a.equals(str) && bVar.f56422b == i && bVar.f56423c.equals(str2)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private int m79735d(C18146d8.a aVar) {
        return aVar.m78221c().get() - m79736e(aVar);
    }

    /* JADX INFO: renamed from: e */
    private int m79736e(C18146d8.a aVar) {
        int i = 0;
        for (b bVar : this.f56417m) {
            if (bVar.f56421a.equals(aVar.m78225g())) {
                i += bVar.f56425e;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    private boolean m79737l() {
        boolean z;
        int i;
        int iM79735d;
        if (!f56413r && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C18146d8.a> it = this.f55889e.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C18146d8.a next = it.next();
                    if (this.f55890f.size() >= this.f55885a) {
                        break;
                    }
                    b bVarM79729a = m79729a(next.m78226h());
                    if (bVarM79729a != null) {
                        i = this.f56416l;
                        iM79735d = m79736e(next);
                    } else {
                        i = this.f56414j;
                        iM79735d = m79735d(next);
                    }
                    if (iM79735d < i) {
                        it.remove();
                        next.m78221c().incrementAndGet();
                        arrayList.add(next);
                        this.f55890f.add(next);
                        if (bVarM79729a != null) {
                            bVarM79729a.f56425e++;
                        }
                    }
                }
                if (mo79161d() <= 0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C18146d8.a) it2.next()).m78219a(m79357i());
        }
        return z;
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79353b(C18146d8.a aVar) {
        synchronized (this) {
            try {
                b bVarM79729a = m79729a(aVar.m78226h());
                if (bVarM79729a != null) {
                    bVarM79729a.f56424d--;
                    bVarM79729a.f56425e--;
                    if (aVar.m78223e()) {
                        C18416x7 c18416x7M78310k = aVar.m78226h().m78310k();
                        bVarM79729a.f56426f = aVar.m78222d().m77939b(c18416x7M78310k.m79929h(), c18416x7M78310k.m79935n(), c18416x7M78310k.m79940s());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.m78221c().decrementAndGet();
        m79730a(this.f55890f, aVar);
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: h */
    public int mo79356h() {
        return this.f56415k;
    }

    /* JADX INFO: renamed from: j */
    public int m79741j() {
        int i;
        synchronized (this) {
            i = this.f56414j;
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    public int m79742k() {
        int i;
        synchronized (this) {
            i = this.f56416l;
        }
        return i;
    }

    public C18390v7(ExecutorService executorService) {
        this.f55888d = executorService;
    }

    /* JADX INFO: renamed from: b */
    private void m79732b(C18146d8.a aVar, b bVar) {
        int i;
        boolean z;
        synchronized (this) {
            try {
                if (bVar.f56424d == this.f56416l + 1) {
                    C18416x7 c18416x7M78310k = aVar.m78226h().m78310k();
                    bVar.f56426f = aVar.m78222d().m77939b(c18416x7M78310k.m79929h(), c18416x7M78310k.m79935n(), c18416x7M78310k.m79940s());
                }
                i = bVar.f56426f;
                if (this.f56416l * i * this.f56418n >= bVar.f56424d || i >= this.f56415k) {
                    z = false;
                } else {
                    bVar.f56426f = i + 1;
                    bVar.f56425e++;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            InterfaceC18159e7 interfaceC18159e7Mo77936a = aVar.m78222d().mo77936a(aVar.m78226h().m78308i().m78327b("Http2ConnectionIndex", Integer.toString(i + 1)).m78323a());
            if (interfaceC18159e7Mo77936a instanceof C18146d8) {
                C18146d8 c18146d8 = (C18146d8) interfaceC18159e7Mo77936a;
                a aVar2 = new a();
                Objects.requireNonNull(c18146d8);
                C18146d8.a aVar3 = c18146d8.new a(aVar2);
                aVar3.m78227i();
                synchronized (this) {
                    this.f55890f.add(aVar3);
                }
                aVar3.m78219a(m79357i());
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: a */
    public void mo79350a(C18146d8.a aVar) {
        boolean zM79731a;
        C18146d8.a aVarM79349a;
        synchronized (this) {
            try {
                if (aVar == null) {
                    return;
                }
                b bVarM79729a = m79729a(aVar.m78226h());
                if (bVarM79729a != null) {
                    zM79731a = m79731a(aVar, bVarM79729a);
                } else {
                    m79734c(aVar);
                    zM79731a = false;
                }
                if (!aVar.m78224f().f54557d && (aVarM79349a = m79349a(aVar.m78225g())) != null) {
                    aVar.m78218a(aVarM79349a);
                }
                m79737l();
                if (zM79731a) {
                    m79732b(aVar, bVarM79729a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m79738c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f56414j = i;
        }
        m79737l();
    }

    /* JADX INFO: renamed from: d */
    public void m79739d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        this.f56415k = i;
    }

    /* JADX INFO: renamed from: e */
    public void m79740e(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f56416l = i;
        }
        m79737l();
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: a */
    public void mo79352a(String str, int i, String str2) {
        synchronized (this) {
            try {
                if (m79733c(str, i, str2) != null) {
                    return;
                }
                this.f56417m.add(new b(str, i, str2));
                m79737l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79354b(C18146d8 c18146d8) {
        m79730a(this.f55891g, c18146d8);
    }

    /* JADX INFO: renamed from: a */
    private <T> void m79730a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f55887c;
        }
        if (m79737l() || runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.huawei.hms.network.embedded.C18312p7, com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79355b(String str, int i, String str2) {
        synchronized (this) {
            Iterator<b> it = this.f56417m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (next.f56421a.equals(str) && next.f56422b == i && next.f56423c.equals(str2)) {
                    it.remove();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m79731a(C18146d8.a aVar, b bVar) {
        if (bVar.f56424d == 0) {
            C18416x7 c18416x7M78310k = aVar.m78226h().m78310k();
            if (!aVar.m78222d().m77942c(c18416x7M78310k.m79929h(), c18416x7M78310k.m79935n(), c18416x7M78310k.m79940s())) {
                mo79355b(c18416x7M78310k.m79929h(), c18416x7M78310k.m79935n(), c18416x7M78310k.m79940s());
                m79734c(aVar);
                return false;
            }
        }
        bVar.f56424d++;
        this.f55889e.add(aVar);
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m79734c(C18146d8.a aVar) {
        this.f55889e.add(aVar);
    }
}

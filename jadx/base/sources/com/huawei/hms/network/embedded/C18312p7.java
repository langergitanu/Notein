package com.huawei.hms.network.embedded;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18146d8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p7 */
/* JADX INFO: loaded from: classes9.dex */
public class C18312p7 extends AbstractC18441z6 {

    /* JADX INFO: renamed from: h */
    public static final int f55883h = 1;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ boolean f55884i = true;

    /* JADX INFO: renamed from: c */
    public Runnable f55887c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f55888d;

    /* JADX INFO: renamed from: a */
    public int f55885a = 64;

    /* JADX INFO: renamed from: b */
    public int f55886b = 5;

    /* JADX INFO: renamed from: e */
    public final Deque<C18146d8.a> f55889e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque<C18146d8.a> f55890f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final Deque<C18146d8> f55891g = new ArrayDeque();

    public C18312p7() {
    }

    /* JADX INFO: renamed from: j */
    private boolean m79348j() {
        int i;
        boolean z;
        if (!f55884i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C18146d8.a> it = this.f55889e.iterator();
                while (it.hasNext()) {
                    C18146d8.a next = it.next();
                    if (this.f55890f.size() >= this.f55885a) {
                        break;
                    }
                    if (next.m78221c().get() < this.f55886b) {
                        it.remove();
                        next.m78221c().incrementAndGet();
                        arrayList.add(next);
                        this.f55890f.add(next);
                    }
                }
                z = mo79161d() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C18146d8.a) arrayList.get(i)).m78219a(m79357i());
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public C18146d8.a m79349a(String str) {
        for (C18146d8.a aVar : this.f55890f) {
            if (aVar.m78225g().equals(str)) {
                return aVar;
            }
        }
        for (C18146d8.a aVar2 : this.f55889e) {
            if (aVar2.m78225g().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: b */
    public synchronized void mo79158b() {
        try {
            Iterator<C18146d8.a> it = this.f55889e.iterator();
            while (it.hasNext()) {
                it.next().m78224f().cancel();
            }
            Iterator<C18146d8.a> it2 = this.f55890f.iterator();
            while (it2.hasNext()) {
                it2.next().m78224f().cancel();
            }
            Iterator<C18146d8> it3 = this.f55891g.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: c */
    public synchronized List<InterfaceC18159e7> mo79160c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.f55891g);
            Iterator<C18146d8.a> it = this.f55890f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m78224f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: d */
    public synchronized int mo79161d() {
        return this.f55890f.size() + this.f55891g.size();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: e */
    public synchronized int mo79162e() {
        return this.f55885a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: f */
    public synchronized int mo79163f() {
        return this.f55886b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: g */
    public synchronized int mo79164g() {
        return this.f55889e.size();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: h */
    public int mo79356h() {
        return 1;
    }

    /* JADX INFO: renamed from: i */
    public synchronized ExecutorService m79357i() {
        try {
            if (this.f55888d == null) {
                this.f55888d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C18313p8.m79375a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f55888d;
    }

    public C18312p7(ExecutorService executorService) {
        this.f55888d = executorService;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: a */
    public synchronized List<InterfaceC18159e7> mo79155a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<C18146d8.a> it = this.f55889e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m78224f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: b */
    public void mo79159b(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f55885a = i;
        }
        m79348j();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: a */
    public void mo79156a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f55886b = i;
        }
        m79348j();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79353b(C18146d8.a aVar) {
        aVar.m78221c().decrementAndGet();
        m79347a(this.f55890f, aVar);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: a */
    public void mo79350a(C18146d8.a aVar) {
        C18146d8.a aVarM79349a;
        synchronized (this) {
            try {
                this.f55889e.add(aVar);
                if (!aVar.m78224f().f54557d && (aVarM79349a = m79349a(aVar.m78225g())) != null) {
                    aVar.m78218a(aVarM79349a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m79348j();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79354b(C18146d8 c18146d8) {
        m79347a(this.f55891g, c18146d8);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: a */
    public synchronized void mo79351a(C18146d8 c18146d8) {
        this.f55891g.add(c18146d8);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: b */
    public void mo79355b(String str, int i, String str2) {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18272m8
    /* JADX INFO: renamed from: a */
    public synchronized void mo79157a(Runnable runnable) {
        this.f55887c = runnable;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18441z6
    /* JADX INFO: renamed from: a */
    public void mo79352a(String str, int i, String str2) {
    }

    /* JADX INFO: renamed from: a */
    private <T> void m79347a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f55887c;
        }
        if (m79348j() || runnable == null) {
            return;
        }
        runnable.run();
    }
}

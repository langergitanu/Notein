package com.huawei.hms.drive;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.drive.C17797bg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.au */
/* JADX INFO: loaded from: classes6.dex */
public class C17784au extends AbstractC17770ag {

    /* JADX INFO: renamed from: g */
    static final /* synthetic */ boolean f52735g = true;

    /* JADX INFO: renamed from: b */
    protected Runnable f52737b;

    /* JADX INFO: renamed from: c */
    protected ExecutorService f52738c;

    /* JADX INFO: renamed from: a */
    protected int f52736a = 64;

    /* JADX INFO: renamed from: h */
    private int f52742h = 5;

    /* JADX INFO: renamed from: d */
    protected final Deque<C17797bg.a> f52739d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    protected final Deque<C17797bg.a> f52740e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    protected final Deque<C17797bg> f52741f = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    private boolean m76037d() {
        int i;
        boolean z;
        if (!f52735g && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C17797bg.a> it = this.f52739d.iterator();
                while (it.hasNext()) {
                    C17797bg.a next = it.next();
                    if (this.f52740e.size() >= this.f52736a) {
                        break;
                    }
                    if (m76041b(next) < this.f52742h) {
                        it.remove();
                        arrayList.add(next);
                        this.f52740e.add(next);
                    }
                }
                z = m76040b() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C17797bg.a) arrayList.get(i)).m76255a(m76038a());
        }
        return z;
    }

    @Override // com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: a */
    public void mo75946a(String str, int i, String str2) {
    }

    @Override // com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: b */
    public void mo75948b(String str, int i, String str2) {
    }

    /* JADX INFO: renamed from: c */
    public int mo76042c() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public synchronized ExecutorService m76038a() {
        try {
            if (this.f52738c == null) {
                this.f52738c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C17806bp.m76335a("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f52738c;
    }

    /* JADX INFO: renamed from: b */
    public int m76041b(C17797bg.a aVar) {
        int i = 0;
        for (C17797bg.a aVar2 : this.f52740e) {
            if (!aVar2.m76257c().f52883e && aVar2.m76254a().equals(aVar.m76254a())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: b */
    public void mo75947b(C17797bg c17797bg) {
        m76036a(this.f52741f, c17797bg);
    }

    /* JADX INFO: renamed from: a */
    public void m76039a(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f52736a = i;
            }
            m76037d();
            return;
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m76040b() {
        return this.f52740e.size() + this.f52741f.size();
    }

    @Override // com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: a */
    public synchronized void mo75945a(C17797bg c17797bg) {
        this.f52741f.add(c17797bg);
    }

    @Override // com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: a */
    public void mo75944a(C17797bg.a aVar) {
        m76036a(this.f52740e, aVar);
    }

    /* JADX INFO: renamed from: a */
    private <T> void m76036a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f52737b;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m76037d() || runnable == null) {
            return;
        }
        runnable.run();
    }
}

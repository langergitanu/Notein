package com.huawei.hms.drive;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.drive.C17797bg;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.az */
/* JADX INFO: loaded from: classes6.dex */
public final class C17789az extends C17784au {

    /* JADX INFO: renamed from: h */
    static final /* synthetic */ boolean f52752h = true;

    /* JADX INFO: renamed from: i */
    private int f52753i = 5;

    /* JADX INFO: renamed from: j */
    private int f52754j = 2;

    /* JADX INFO: renamed from: k */
    private int f52755k = 32;

    /* JADX INFO: renamed from: l */
    private final List<a> f52756l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private int f52757m = 2;

    /* JADX INFO: renamed from: com.huawei.hms.drive.az$a */
    public final class a {

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ boolean f52758g = true;

        /* JADX INFO: renamed from: a */
        public String f52759a;

        /* JADX INFO: renamed from: b */
        public int f52760b;

        /* JADX INFO: renamed from: c */
        public String f52761c;

        /* JADX INFO: renamed from: d */
        public int f52762d;

        /* JADX INFO: renamed from: e */
        public int f52763e;

        /* JADX INFO: renamed from: f */
        public int f52764f = 1;

        public a(String str, int i, String str2) {
            this.f52759a = str;
            this.f52760b = i;
            this.f52761c = str2;
            m76094a(str, i, str2);
        }

        /* JADX INFO: renamed from: a */
        private void m76094a(String str, int i, String str2) {
            if (!f52758g && !Thread.holdsLock(C17789az.this)) {
                throw new AssertionError();
            }
            Iterator<C17797bg.a> it = C17789az.this.f52740e.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C17792bb c17792bbM76261a = it.next().m76256b().m76261a();
                if (c17792bbM76261a.m76151f().equals(str) && c17792bbM76261a.m76152g() == i && c17792bbM76261a.m76145b().equals(str2)) {
                    i2++;
                }
            }
            this.f52763e = i2;
            Iterator<C17797bg.a> it2 = C17789az.this.f52739d.iterator();
            while (it2.hasNext()) {
                C17792bb c17792bbM76261a2 = it2.next().m76256b().m76261a();
                if (c17792bbM76261a2.m76151f().equals(str) && c17792bbM76261a2.m76152g() == i && c17792bbM76261a2.m76145b().equals(str2)) {
                    i2++;
                }
            }
            this.f52762d = i2;
        }
    }

    @Override // com.huawei.hms.drive.C17784au, com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: a */
    public void mo75946a(String str, int i, String str2) {
        synchronized (this) {
            try {
                if (m76088c(str, i, str2) != null) {
                    return;
                }
                this.f52756l.add(new a(str, i, str2));
                m76090d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76091b(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f52753i = i;
        }
        m76090d();
    }

    /* JADX INFO: renamed from: c */
    public void m76092c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        synchronized (this) {
            this.f52755k = i;
        }
        m76090d();
    }

    /* JADX INFO: renamed from: d */
    public void m76093d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "max < 1: "));
        }
        this.f52754j = i;
    }

    /* JADX INFO: renamed from: d */
    private boolean m76090d() {
        boolean z;
        int i;
        int iM76089d;
        if (!f52752h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C17797bg.a> it = this.f52739d.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C17797bg.a next = it.next();
                    if (this.f52740e.size() >= this.f52736a) {
                        break;
                    }
                    a aVarM76085a = m76085a(next.m76256b());
                    if (aVarM76085a != null) {
                        i = this.f52755k;
                        iM76089d = m76087c(next);
                    } else {
                        i = this.f52753i;
                        iM76089d = m76089d(next);
                    }
                    if (iM76089d < i) {
                        it.remove();
                        arrayList.add(next);
                        this.f52740e.add(next);
                        if (aVarM76085a != null) {
                            aVarM76085a.f52763e++;
                        }
                    }
                }
                if (m76040b() <= 0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C17797bg.a) it2.next()).m76255a(m76038a());
        }
        return z;
    }

    @Override // com.huawei.hms.drive.C17784au, com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: a */
    public void mo75944a(C17797bg.a aVar) {
        synchronized (this) {
            try {
                a aVarM76085a = m76085a(aVar.m76256b());
                if (aVarM76085a != null) {
                    aVarM76085a.f52762d--;
                    aVarM76085a.f52763e--;
                    if (aVar.m76259e()) {
                        C17792bb c17792bbM76261a = aVar.m76256b().m76261a();
                        aVarM76085a.f52764f = aVar.m76258d().m76196b(c17792bbM76261a.m76151f(), c17792bbM76261a.m76152g(), c17792bbM76261a.m76145b());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m76086a(this.f52740e, aVar);
    }

    @Override // com.huawei.hms.drive.C17784au, com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: b */
    public void mo75948b(String str, int i, String str2) {
        synchronized (this) {
            try {
                Iterator<a> it = this.f52756l.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.f52759a.equals(str) && next.f52760b == i && next.f52761c.equals(str2)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.drive.C17784au
    /* JADX INFO: renamed from: c */
    public int mo76042c() {
        return this.f52754j;
    }

    /* JADX INFO: renamed from: c */
    private int m76087c(C17797bg.a aVar) {
        int i = 0;
        for (a aVar2 : this.f52756l) {
            if (aVar2.f52759a.equals(aVar.m76254a())) {
                i += aVar2.f52763e;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    private a m76088c(String str, int i, String str2) {
        for (a aVar : this.f52756l) {
            if (aVar.f52759a.equals(str) && aVar.f52760b == i && aVar.f52761c.equals(str2)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private <T> void m76086a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f52737b;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m76090d() || runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.huawei.hms.drive.C17784au, com.huawei.hms.drive.AbstractC17770ag
    /* JADX INFO: renamed from: b */
    public void mo75947b(C17797bg c17797bg) {
        m76086a(this.f52741f, c17797bg);
    }

    /* JADX INFO: renamed from: a */
    private a m76085a(C17798bh c17798bh) {
        return m76088c(c17798bh.m76261a().m76151f(), c17798bh.m76261a().m76152g(), c17798bh.m76261a().m76145b());
    }

    /* JADX INFO: renamed from: d */
    private int m76089d(C17797bg.a aVar) {
        return m76041b(aVar) - m76087c(aVar);
    }
}

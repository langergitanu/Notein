package o0O0o00;

import android.graphics.RectF;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.editor.model.PagePart;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o0O0o00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25911OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PriorityQueue<PagePart> f88454OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PriorityQueue<PagePart> f88455OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f88456OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f88457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f88459OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicInteger f88461OooO0oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f88458OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f88460OooO0oO = new Object();

    /* JADX INFO: renamed from: o0O0o00.OooO0OO$OooO00o */
    public static class OooO00o implements Comparator<PagePart> {
        @Override // java.util.Comparator
        public final int compare(PagePart pagePart, PagePart pagePart2) {
            PagePart pagePart3 = pagePart;
            PagePart pagePart4 = pagePart2;
            if (pagePart3.f69354OooOO0 == pagePart4.f69354OooOO0) {
                return 0;
            }
            return pagePart3.f69354OooOO0 > pagePart4.f69354OooOO0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: o0O0o00.OooO0OO$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PagePart f88462OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f88463OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f88464OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f88465OooO0Oo = false;

        public OooO0O0(PagePart pagePart, long j) {
            this.f88462OooO00o = pagePart;
            this.f88463OooO0O0 = j;
        }
    }

    public C25911OooO0OO() {
        OooO00o oooO00o = new OooO00o();
        this.f88461OooO0oo = new AtomicInteger(140);
        this.f88455OooO0O0 = new PriorityQueue<>(140, oooO00o);
        this.f88454OooO00o = new PriorityQueue<>(140, oooO00o);
        this.f88456OooO0OO = new ArrayList();
        this.f88457OooO0Oo = new HashMap();
        this.f88459OooO0o0 = new HashMap();
    }

    public static PagePart OooO0o(PagePart pagePart, PriorityQueue<PagePart> priorityQueue) {
        for (PagePart pagePart2 : priorityQueue) {
            if (pagePart2.equals(pagePart)) {
                return pagePart2;
            }
        }
        return null;
    }

    public static PagePart OooO0o0(int i, RectF rectF, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            PagePart pagePart = (PagePart) it.next();
            if (pagePart.f69347OooO0O0 == i && pagePart.OooO0Oo().equals(rectF)) {
                return pagePart;
            }
        }
        return null;
    }

    public static String OooO0oO(PagePart pagePart) {
        return pagePart.f69347OooO0O0 + C18115b5.CONNECTOR + pagePart.OooO0Oo().left + C18115b5.CONNECTOR + pagePart.OooO0Oo().top + C18115b5.CONNECTOR + pagePart.OooO0Oo().right + C18115b5.CONNECTOR + pagePart.OooO0Oo().bottom + C18115b5.CONNECTOR + System.nanoTime();
    }

    public final ArrayList OooO() {
        ArrayList arrayList;
        synchronized (this.f88456OooO0OO) {
            arrayList = new ArrayList(this.f88456OooO0OO);
            arrayList.sort(new o000OO0O.OooO0O0(1));
        }
        return arrayList;
    }

    public final void OooO00o(ArrayList arrayList) {
        synchronized (this.f88458OooO0o) {
            try {
                OooOO0(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PagePart pagePart = (PagePart) it.next();
                    PagePart pagePartOooO0o = OooO0o(pagePart, this.f88454OooO00o);
                    if (pagePartOooO0o != null) {
                        this.f88454OooO00o.remove(pagePartOooO0o);
                        pagePartOooO0o.OooO0o();
                    }
                    PagePart pagePartOooO0o2 = OooO0o(pagePart, this.f88455OooO0O0);
                    if (pagePartOooO0o2 != null) {
                        this.f88455OooO0O0.remove(pagePartOooO0o2);
                        pagePartOooO0o2.OooO0o();
                    }
                    this.f88455OooO0O0.add(pagePart);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(ArrayList arrayList) {
        synchronized (this.f88456OooO0OO) {
            while (this.f88456OooO0OO.size() + arrayList.size() > 25) {
                try {
                    ((PagePart) this.f88456OooO0OO.remove(0)).OooO0o();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PagePart pagePart = (PagePart) it.next();
                PagePart pagePartOooO0o0 = OooO0o0(pagePart.f69347OooO0O0, pagePart.OooO0Oo(), this.f88456OooO0OO);
                if (pagePartOooO0o0 != null) {
                    this.f88456OooO0OO.remove(pagePartOooO0o0);
                    pagePartOooO0o0.OooO0o();
                }
                this.f88456OooO0OO.add(pagePart);
            }
        }
    }

    public final void OooO0OO() {
        synchronized (this.f88460OooO0oO) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f88457OooO0Oo.entrySet()) {
                    if (jCurrentTimeMillis - ((OooO0O0) entry.getValue()).f88463OooO0O0 > 30000) {
                        arrayList.add((String) entry.getKey());
                        if (!((OooO0O0) entry.getValue()).f88464OooO0OO && ((OooO0O0) entry.getValue()).f88462OooO00o != null) {
                            ((OooO0O0) entry.getValue()).f88462OooO00o.OooO0o();
                            ((OooO0O0) entry.getValue()).f88464OooO0OO = true;
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f88457OooO0Oo.remove((String) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(ArrayList arrayList) {
        PagePart pagePart;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.f88460OooO0oO) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OooO0O0 oooO0O0 = (OooO0O0) this.f88459OooO0o0.remove((String) it.next());
                    if (oooO0O0 != null && (pagePart = oooO0O0.f88462OooO00o) != null && !oooO0O0.f88464OooO0OO) {
                        arrayList2.add(pagePart);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        OooO0O0(arrayList2);
    }

    public final ArrayList OooO0oo() {
        ArrayList arrayList;
        synchronized (this.f88458OooO0o) {
            arrayList = new ArrayList(this.f88454OooO00o);
            arrayList.addAll(this.f88455OooO0O0);
        }
        return arrayList;
    }

    public final void OooOO0(int i) {
        int i2 = this.f88461OooO0oo.get();
        synchronized (this.f88458OooO0o) {
            while (this.f88455OooO0O0.size() + this.f88454OooO00o.size() + i > i2 && !this.f88454OooO00o.isEmpty()) {
                try {
                    PagePart pagePartPoll = this.f88454OooO00o.poll();
                    if (pagePartPoll != null) {
                        pagePartPoll.OooO0o();
                    }
                } finally {
                }
            }
            while (this.f88455OooO0O0.size() + this.f88454OooO00o.size() + i > i2 && !this.f88455OooO0O0.isEmpty()) {
                PagePart pagePartPoll2 = this.f88455OooO0O0.poll();
                if (pagePartPoll2 != null) {
                    pagePartPoll2.OooO0o();
                }
            }
        }
        synchronized (this.f88460OooO0oO) {
            try {
                if (this.f88457OooO0Oo.size() + this.f88459OooO0o0.size() > i2 / 4) {
                    OooO0OO();
                }
            } finally {
            }
        }
    }

    public final void OooOO0O() {
        synchronized (this.f88458OooO0o) {
            try {
                Iterator<PagePart> it = this.f88454OooO00o.iterator();
                while (it.hasNext()) {
                    it.next().OooO0o();
                }
                this.f88454OooO00o.clear();
                Iterator<PagePart> it2 = this.f88455OooO0O0.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO0o();
                }
                this.f88455OooO0O0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0o() {
        synchronized (this.f88456OooO0OO) {
            try {
                Iterator it = this.f88456OooO0OO.iterator();
                while (it.hasNext()) {
                    ((PagePart) it.next()).OooO0o();
                }
                this.f88456OooO0OO.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String OooOOO(PagePart pagePart) {
        String strOooO0oO;
        OooO0O0 oooO0O0;
        PagePart pagePart2;
        synchronized (this.f88460OooO0oO) {
            try {
                strOooO0oO = OooO0oO(pagePart);
                if (this.f88459OooO0o0.containsKey(strOooO0oO) && (oooO0O0 = (OooO0O0) this.f88459OooO0o0.get(strOooO0oO)) != null && (pagePart2 = oooO0O0.f88462OooO00o) != null) {
                    pagePart2.OooO0o();
                }
                this.f88459OooO0o0.put(strOooO0oO, new OooO0O0(pagePart, System.currentTimeMillis()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return strOooO0oO;
    }

    public final String OooOOO0(PagePart pagePart) {
        String strOooO0oO;
        OooO0O0 oooO0O0;
        PagePart pagePart2;
        synchronized (this.f88460OooO0oO) {
            try {
                strOooO0oO = OooO0oO(pagePart);
                if (this.f88457OooO0Oo.containsKey(strOooO0oO) && (oooO0O0 = (OooO0O0) this.f88457OooO0Oo.get(strOooO0oO)) != null && (pagePart2 = oooO0O0.f88462OooO00o) != null) {
                    pagePart2.OooO0o();
                }
                this.f88457OooO0Oo.put(strOooO0oO, new OooO0O0(pagePart, System.currentTimeMillis()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return strOooO0oO;
    }

    public final boolean OooOOOO(RectF rectF, int i, int i2) {
        synchronized (this.f88458OooO0o) {
            try {
                PagePart pagePartOooO0o0 = OooO0o0(i, rectF, this.f88454OooO00o);
                if (pagePartOooO0o0 == null) {
                    return OooO0o0(i, rectF, this.f88455OooO0O0) != null;
                }
                this.f88454OooO00o.remove(pagePartOooO0o0);
                pagePartOooO0o0.f69354OooOO0 = i2;
                this.f88455OooO0O0.offer(pagePartOooO0o0);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

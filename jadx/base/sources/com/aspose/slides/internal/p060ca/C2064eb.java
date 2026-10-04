package com.aspose.slides.internal.p060ca;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.eb */
/* JADX INFO: loaded from: classes3.dex */
public class C2064eb extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    private String f7134k4;

    /* JADX INFO: renamed from: kk */
    private C2347wg f7135kk;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, List<k4>> f7136x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.eb$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public long f7137du;

        /* JADX INFO: renamed from: h4 */
        public C2347wg f7138h4;

        /* JADX INFO: renamed from: k4 */
        public int f7139k4;

        /* JADX INFO: renamed from: kk */
        public int f7140kk;

        /* JADX INFO: renamed from: to */
        public byte[] f7141to;

        /* JADX INFO: renamed from: x1 */
        public int f7142x1;

        public k4(int i, int i2, int i3, C2064eb c2064eb) {
            this.f7139k4 = i;
            this.f7142x1 = i2;
            this.f7140kk = i3;
            this.f7138h4 = i3 != 12 ? new C2195mh(i, i2, c2064eb) : new C2085fe(i, i2, c2064eb);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m10457k4() {
            byte[][] bArr = {this.f7141to};
            long[] jArr = {this.f7137du};
            this.f7138h4.mo10527k4(bArr, jArr);
            this.f7141to = bArr[0];
            this.f7137du = jArr[0];
        }
    }

    public C2064eb(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7134k4 = "{0}_{1}";
        this.f7136x1 = new Dictionary<>();
        this.f7135kk = null;
        m10454k4(0, 3, 4);
        m10454k4(0, 4, 12);
        m10454k4(1, 0, 4);
        m10454k4(3, 1, 4);
    }

    /* JADX INFO: renamed from: kk */
    private String m10452kk(int i, int i2) {
        return C14113y2.m67402k4(this.f7134k4, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:9:0x0033, B:11:0x0039, B:18:0x004f, B:20:0x005a, B:23:0x0061, B:26:0x006c, B:29:0x0076, B:25:0x0068, B:32:0x007e, B:35:0x0085), top: B:62:0x0033, outer: #0 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2347wg m10453k4() {
        m11218dq();
        C2347wg c2347wg = this.f7135kk;
        if (c2347wg != null) {
            return c2347wg;
        }
        List list = new List();
        Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f7136x1.getKeys().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                List.Enumerator<k4> it2 = this.f7136x1.get_Item(it.next()).iterator();
                do {
                    try {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C2347wg c2347wg2 = it2.next().f7138h4;
                        int iM11599kk = c2347wg2.m11599kk();
                        if (iM11599kk != 0) {
                            if (iM11599kk == 2) {
                                list.addItem(c2347wg2);
                            } else if (iM11599kk == 3) {
                                if ((c2347wg2.m11600to() & 65535) == 0) {
                                    list.insertItem(0, c2347wg2);
                                    z = true;
                                } else if ((c2347wg2.m11600to() & 65535) != 1) {
                                    if ((c2347wg2.m11600to() & 65535) == 10) {
                                        list.insertItem(0, c2347wg2);
                                        z = true;
                                    } else if ((c2347wg2.m11600to() & 65535) == 4) {
                                        list.addItem(c2347wg2);
                                    }
                                }
                            }
                        } else if (c2347wg2.m11600to() != 4) {
                            list.addItem(c2347wg2);
                        } else {
                            list.insertItem(0, c2347wg2);
                        }
                    } finally {
                    }
                } while (!z);
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                if (z) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (list.size() > 0) {
            this.f7135kk = (C2347wg) list.get_Item(0);
        }
        return this.f7135kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10456x1(int i, int i2) {
        Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f7136x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<k4> it2 = this.f7136x1.get_Item(it.next()).iterator();
                while (it2.hasNext()) {
                    try {
                        k4 next = it2.next();
                        int i3 = next.f7139k4;
                        if ((i3 & 65535) != 0 || (next.f7142x1 & 65535) != 3) {
                            if (((i3 & 65535) != 1 || (next.f7142x1 & 65535) != 0) && (((i3 & 65535) != 3 || (next.f7142x1 & 65535) != 1) && (((i3 & 65535) != 3 || (next.f7142x1 & 65535) != 10) && ((i3 & 65535) != 0 || (next.f7142x1 & 65535) != 4)))) {
                            }
                        }
                        next.f7138h4.mo10525k4(i, i2);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    public C2064eb(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7134k4 = "{0}_{1}";
        this.f7136x1 = new Dictionary<>();
        this.f7135kk = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10454k4(int i, int i2, int i3) {
        int i4 = i & 65535;
        int i5 = i2 & 65535;
        k4 k4Var = new k4(i4, i5, i3, this);
        String strM10452kk = m10452kk(i4, i5);
        if (!this.f7136x1.containsKey(strM10452kk)) {
            this.f7136x1.set_Item(strM10452kk, new List<>());
        }
        this.f7136x1.get_Item(strM10452kk).addItem(k4Var);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        if (m11217b3()) {
            return;
        }
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        c2212n9.m11151fa();
        int iM11151fa = c2212n9.m11151fa();
        for (int i = 0; i < (iM11151fa & 65535); i++) {
            int iM11151fa2 = c2212n9.m11151fa();
            int iM11151fa3 = c2212n9.m11151fa();
            long jM11164up = c2212n9.m11164up();
            long jM11154k4 = c2212n9.m11154k4();
            c2212n9.m11159k4(((m11222wy() & 4294967295L) + (jM11164up & 4294967295L)) & 4294967295L);
            int iM11151fa4 = c2212n9.m11151fa();
            int i2 = 65535 & iM11151fa4;
            if (i2 > 6) {
                c2212n9.m11151fa();
            }
            C2347wg c2085fe = iM11151fa4 != 0 ? iM11151fa4 != 2 ? iM11151fa4 != 4 ? iM11151fa4 != 6 ? iM11151fa4 != 8 ? iM11151fa4 != 10 ? iM11151fa4 != 12 ? null : new C2085fe(iM11151fa2, iM11151fa3, this) : new C2346w8(iM11151fa2, iM11151fa3, this) : new C2045dd(iM11151fa2, iM11151fa3, this) : new C2339vm(iM11151fa2, iM11151fa3, this) : new C2195mh(iM11151fa2, iM11151fa3, this) : new C2171l0(iM11151fa2, iM11151fa3, this) : new C2348wh(iM11151fa2, iM11151fa3, this);
            if (c2085fe != null) {
                c2085fe.mo10361k4(c2212n9);
                k4 k4Var = new k4(iM11151fa2, iM11151fa3, i2, this);
                k4Var.f7138h4 = c2085fe;
                String strM10452kk = m10452kk(iM11151fa2, iM11151fa3);
                if (!this.f7136x1.containsKey(strM10452kk)) {
                    this.f7136x1.set_Item(strM10452kk, new List<>());
                }
                this.f7136x1.get_Item(strM10452kk).addItem(k4Var);
            }
            c2212n9.m11159k4(jM11154k4);
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                List list = new List();
                SortedList sortedList = new SortedList();
                Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f7136x1.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        String next = it.next();
                        List.Enumerator<k4> it2 = this.f7136x1.get_Item(next).iterator();
                        while (it2.hasNext()) {
                            try {
                                sortedList.addItem(next, it2.next());
                            } catch (Throwable th) {
                                if (!C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    throw th;
                                }
                                it2.dispose();
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    } catch (Throwable th2) {
                        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            throw th2;
                        }
                        it.dispose();
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                IGenericEnumerator<T> it3 = sortedList.getKeys().iterator();
                while (it3.hasNext()) {
                    try {
                        list.addItem(sortedList.get_Item((String) it3.next()));
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                k4[] k4VarArr = (k4[]) list.toArray(new k4[0]);
                c2362x4.m11647k4(0);
                c2362x4.m11647k4(k4VarArr.length & 65535);
                int i = 0;
                for (int i2 = 0; i2 < k4VarArr.length; i2++) {
                    k4VarArr[i2].m10457k4();
                    c2362x4.m11647k4(k4VarArr[i2].f7139k4);
                    c2362x4.m11647k4(k4VarArr[i2].f7142x1);
                    c2362x4.m11660kk(((long) C22213OooOoOO.OooO0O0(k4VarArr.length, 8, 4, i)) & 4294967295L);
                    i += (int) k4VarArr[i2].f7137du;
                }
                for (k4 k4Var : k4VarArr) {
                    c2362x4.m11657k4(k4Var.f7141to);
                }
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th3) {
                c2362x4.dispose();
                throw th3;
            }
        } catch (Throwable th4) {
            c3152yj.dispose();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C2347wg[] m10455k4(int i, int i2) {
        m11218dq();
        String strM10452kk = m10452kk(i, i2);
        if (!this.f7136x1.containsKey(strM10452kk)) {
            return new C2347wg[0];
        }
        k4[] array = this.f7136x1.get_Item(strM10452kk).toArray(new k4[0]);
        List list = new List();
        for (k4 k4Var : array) {
            list.addItem(k4Var.f7138h4);
        }
        return (C2347wg[]) list.toArray(new C2347wg[0]);
    }
}

package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p119f0.C3836du;
import com.aspose.slides.internal.p119f0.C3837h4;
import com.aspose.slides.internal.p119f0.C3838k4;
import com.aspose.slides.internal.p119f0.C3839kk;
import com.aspose.slides.internal.p119f0.C3840to;
import com.aspose.slides.internal.p119f0.C3841x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9799x1 extends AbstractC9768f9 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, List<k4>> f35503k4 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.q7.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public C3837h4 f35504du;

        /* JADX INFO: renamed from: k4 */
        public int f35505k4;

        /* JADX INFO: renamed from: kk */
        public byte[] f35506kk;

        /* JADX INFO: renamed from: to */
        public long f35507to;

        /* JADX INFO: renamed from: x1 */
        public int f35508x1;

        public k4(int i, int i2, AbstractC9768f9 abstractC9768f9) {
            this.f35505k4 = i;
            this.f35508x1 = i2;
            this.f35504du = new C3840to(i, i2, abstractC9768f9);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m48301k4() {
            C3152yj c3152yj = new C3152yj();
            try {
                this.f35504du.mo15365k4(new C12570to(c3152yj));
                c3152yj.flush();
                c3152yj.setPosition(0L);
                byte[] array = c3152yj.toArray();
                this.f35506kk = array;
                this.f35507to = ((long) array.length) & 4294967295L;
            } finally {
                c3152yj.dispose();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9799x1(C12564kk c12564kk) {
        C3837h4 c3839kk;
        int i;
        int position = (int) c12564kk.m58602k4().getPosition();
        if ((c12564kk.m58600du() & 65535) != 0) {
            throw new InvalidOperationException("Unexpected cmap table version.");
        }
        int iM58600du = c12564kk.m58600du() & 65535;
        for (int i2 = 0; i2 < iM58600du; i2++) {
            int iM58600du2 = c12564kk.m58600du();
            int iM58600du3 = c12564kk.m58600du();
            int iM58606x1 = c12564kk.m58606x1();
            int position2 = (int) c12564kk.m58602k4().getPosition();
            c12564kk.m58602k4().setPosition(iM58606x1 + position);
            int iM58600du4 = c12564kk.m58600du();
            if ((iM58600du4 & 65535) > 6) {
                c12564kk.m58600du();
            }
            if (iM58600du4 == 2) {
                c3839kk = new C3839kk(iM58600du2, iM58600du3, this);
            } else if (iM58600du4 != 4) {
                c3839kk = iM58600du4 != 6 ? iM58600du4 != 10 ? iM58600du4 != 12 ? null : new C3841x1(iM58600du2, iM58600du3, this) : new C3838k4(iM58600du2, iM58600du3, this) : new C3836du(iM58600du2, iM58600du3, this);
            } else {
                int i3 = iM58600du2 & 65535;
                if (i3 == 0 || (i3 == 3 && ((i = iM58600du3 & 65535) == 1 || i == 0))) {
                    c3839kk = new C3840to(iM58600du2, iM58600du3, this);
                }
            }
            if (c3839kk != null) {
                c3839kk.mo15362k4(c12564kk);
                k4 k4Var = new k4(iM58600du2, iM58600du3, this);
                k4Var.f35504du = c3839kk;
                String strM48293x1 = m48293x1(iM58600du2, iM58600du3);
                if (!this.f35503k4.containsKey(strM48293x1)) {
                    this.f35503k4.set_Item(strM48293x1, new List<>());
                }
                this.f35503k4.get_Item(strM48293x1).addItem(k4Var);
            }
            c12564kk.m58602k4().setPosition(position2);
        }
        if (this.f35503k4.size() == 0) {
            throw new InvalidOperationException("Cannot find a required cmap table.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3837h4 m48294k4() {
        return m48295k4(false);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m48299kk() {
        return m48298k4(3, 0).length > 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3837h4 m48300x1() {
        Dictionary.Enumerator<String, List<k4>> it = this.f35503k4.iterator();
        while (it.hasNext()) {
            try {
                List list = (List) it.next().getValue();
                if (list.size() != 0) {
                    return ((k4) list.get_Item(0)).f35504du;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m48293x1(int i, int i2) {
        return C14113y2.m67402k4("{0}_{1}", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27469x1(r6, com.aspose.slides.internal.p119f0.C3841x1.class) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:6:0x002b, B:8:0x0031, B:15:0x0047, B:17:0x0051, B:21:0x0058, B:23:0x005f, B:26:0x0065, B:28:0x006e, B:31:0x0074, B:33:0x007c, B:35:0x0082), top: B:63:0x002b, outer: #1 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3837h4 m48295k4(boolean z) {
        List list = new List();
        Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f35503k4.getKeys().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            try {
                List.Enumerator<k4> it2 = this.f35503k4.get_Item(it.next()).iterator();
                do {
                    try {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C3837h4 c3837h4 = it2.next().f35504du;
                        int iM15363du = c3837h4.m15363du();
                        if (iM15363du == 0) {
                            if (!z) {
                            }
                            list.addItem(c3837h4);
                        } else if (iM15363du == 2) {
                            list.addItem(c3837h4);
                        } else if (iM15363du == 3) {
                            if ((c3837h4.m15364h4() & 65535) == 0) {
                                list.insertItem(0, c3837h4);
                            } else if ((c3837h4.m15364h4() & 65535) == 1) {
                                list.insertItem(0, c3837h4);
                                if (z) {
                                }
                            } else if ((c3837h4.m15364h4() & 65535) == 10) {
                                list.insertItem(0, c3837h4);
                                if (!z) {
                                }
                            } else if ((c3837h4.m15364h4() & 65535) == 4) {
                            }
                            z2 = true;
                        }
                    } finally {
                    }
                } while (!z2);
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                if (z2) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (list.size() > 0) {
            return (C3837h4) list.get_Item(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9777kp m48296k4(C9792um c9792um) {
        C3837h4 c3837h4M48294k4 = m48294k4();
        if (c3837h4M48294k4 != null) {
            return c3837h4M48294k4.mo15361k4(c9792um);
        }
        C3837h4 c3837h4M48300x1 = m48300x1();
        return c3837h4M48300x1 != null ? c3837h4M48300x1.mo15361k4(c9792um) : new C9777kp(m48299kk());
    }

    /* JADX INFO: renamed from: k4 */
    private k4 m48292k4(C3837h4 c3837h4) {
        Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f35503k4.getKeys().iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<k4> it2 = this.f35503k4.get_Item(it.next()).iterator();
                while (it2.hasNext()) {
                    try {
                        k4 next = it2.next();
                        if (C14067j2.m66729x1(next.f35504du, c3837h4)) {
                            return next;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48297k4(C12561ix c12561ix) {
        C3837h4 c3837h4M48295k4 = m48295k4(true);
        if (c3837h4M48295k4 != null) {
            ((C3840to) c3837h4M48295k4).m15376k4(c12561ix);
            return;
        }
        C3840to c3840to = new C3840to(3, 1, this);
        c3840to.m15376k4(c12561ix);
        k4 k4Var = new k4(3, 1, this);
        k4Var.f35504du = c3840to;
        String strM48293x1 = m48293x1(3, 1);
        if (!this.f35503k4.containsKey(strM48293x1)) {
            this.f35503k4.set_Item(strM48293x1, new List<>());
        }
        this.f35503k4.get_Item(strM48293x1).addItem(k4Var);
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9768f9
    /* JADX INFO: renamed from: k4 */
    public void mo48051k4(C12570to c12570to) {
        C3837h4 c3837h4M48295k4 = m48295k4(true);
        if (c3837h4M48295k4 == null) {
            return;
        }
        k4[] k4VarArr = {m48292k4(c3837h4M48295k4)};
        c12570to.m58671x1(0);
        c12570to.m58671x1(1);
        k4VarArr[0].m48301k4();
        c12570to.m58671x1(k4VarArr[0].f35505k4 & 65535);
        c12570to.m58671x1(k4VarArr[0].f35508x1 & 65535);
        c12570to.m58668k4(12);
        k4 k4Var = k4VarArr[0];
        long j = k4Var.f35507to;
        byte[] bArr = k4Var.f35506kk;
        c12570to.m58670k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3837h4[] m48298k4(int i, int i2) {
        String strM48293x1 = m48293x1(i, i2);
        if (!this.f35503k4.containsKey(strM48293x1)) {
            return new C3837h4[0];
        }
        k4[] array = this.f35503k4.get_Item(strM48293x1).toArray(new k4[0]);
        List list = new List();
        for (k4 k4Var : array) {
            list.addItem(k4Var.f35504du);
        }
        return (C3837h4[]) list.toArray(new C3837h4[0]);
    }
}

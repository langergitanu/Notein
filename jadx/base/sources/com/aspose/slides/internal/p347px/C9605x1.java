package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p062cf.C2420du;
import com.aspose.slides.internal.p062cf.C2421h4;
import com.aspose.slides.internal.p062cf.C2422k4;
import com.aspose.slides.internal.p062cf.C2423kk;
import com.aspose.slides.internal.p062cf.C2424to;
import com.aspose.slides.internal.p062cf.C2425x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11296k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9605x1 extends AbstractC9576ak {

    /* JADX INFO: renamed from: k4 */
    private String f34743k4 = "{0}_{1}";

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, List<k4>> f34744x1 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.px.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f34745k4;

        /* JADX INFO: renamed from: kk */
        public int f34746kk;

        /* JADX INFO: renamed from: to */
        public C2421h4 f34747to;

        /* JADX INFO: renamed from: x1 */
        public int f34748x1;

        public k4(int i, int i2, int i3, AbstractC9576ak abstractC9576ak) {
            this.f34745k4 = i;
            this.f34748x1 = i2;
            this.f34746kk = i3;
            this.f34747to = new C2424to(i, i2, abstractC9576ak);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9605x1(C11296k4 c11296k4) {
        C2421h4 c2423kk;
        int i;
        int position = (int) c11296k4.m54276k4().getPosition();
        if ((c11296k4.m54274du() & 65535) != 0) {
            throw new InvalidOperationException("Unexpected cmap table version.");
        }
        int iM54274du = c11296k4.m54274du() & 65535;
        for (int i2 = 0; i2 < iM54274du; i2++) {
            int iM54274du2 = c11296k4.m54274du();
            int iM54274du3 = c11296k4.m54274du();
            int iM54280x1 = c11296k4.m54280x1();
            int position2 = (int) c11296k4.m54276k4().getPosition();
            c11296k4.m54276k4().setPosition(iM54280x1 + position);
            int iM54274du4 = c11296k4.m54274du();
            int i3 = iM54274du4 & 65535;
            if (i3 > 6) {
                c11296k4.m54274du();
            }
            if (iM54274du4 == 2) {
                c2423kk = new C2423kk(iM54274du2, iM54274du3, this);
            } else if (iM54274du4 != 4) {
                c2423kk = iM54274du4 != 6 ? iM54274du4 != 10 ? iM54274du4 != 12 ? null : new C2425x1(iM54274du2, iM54274du3, this) : new C2422k4(iM54274du2, iM54274du3, this) : new C2420du(iM54274du2, iM54274du3, this);
            } else {
                int i4 = iM54274du2 & 65535;
                if (i4 == 0 || (i4 == 3 && ((i = iM54274du3 & 65535) == 1 || i == 0))) {
                    c2423kk = new C2424to(iM54274du2, iM54274du3, this);
                }
            }
            if (c2423kk != null) {
                c2423kk.mo11843k4(c11296k4);
                k4 k4Var = new k4(iM54274du2, iM54274du3, i3, this);
                k4Var.f34747to = c2423kk;
                String strM46912x1 = m46912x1(iM54274du2, iM54274du3);
                if (!this.f34744x1.containsKey(strM46912x1)) {
                    this.f34744x1.set_Item(strM46912x1, new List<>());
                }
                this.f34744x1.get_Item(strM46912x1).addItem(k4Var);
            }
            c11296k4.m54276k4().setPosition(position2);
        }
        if (this.f34744x1.size() == 0) {
            throw new InvalidOperationException("Cannot find a required cmap table.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:6:0x002b, B:8:0x0031, B:15:0x0046, B:17:0x0051, B:20:0x0058, B:22:0x005f, B:23:0x0063, B:26:0x006d, B:28:0x0075), top: B:56:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a A[EDGE_INSN: B:64:0x007a->B:30:0x007a BREAK  A[LOOP:1: B:56:0x002b->B:70:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:1: B:56:0x002b->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2421h4 m46913k4() {
        List list = new List();
        Dictionary.KeyCollection.Enumerator<String, List<k4>> it = this.f34744x1.getKeys().iterator();
        boolean z = false;
        do {
            try {
                if (!it.hasNext()) {
                    break;
                }
                List.Enumerator<k4> it2 = this.f34744x1.get_Item(it.next()).iterator();
                while (it2.hasNext()) {
                    try {
                        C2421h4 c2421h4 = it2.next().f34747to;
                        int iM11847x1 = c2421h4.m11847x1();
                        if (iM11847x1 == 0 || iM11847x1 == 2) {
                            list.addItem(c2421h4);
                            if (!z) {
                                break;
                            }
                        } else {
                            if (iM11847x1 == 3) {
                                if ((c2421h4.m11845kk() & 65535) == 0) {
                                    list.insertItem(0, c2421h4);
                                    z = true;
                                } else if ((c2421h4.m11845kk() & 65535) == 1) {
                                    list.insertItem(0, c2421h4);
                                } else if ((c2421h4.m11845kk() & 65535) == 10) {
                                    list.insertItem(0, c2421h4);
                                    z = true;
                                } else if ((c2421h4.m11845kk() & 65535) == 4) {
                                }
                            }
                            if (!z) {
                            }
                        }
                    } finally {
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
        } while (!z);
        if (list.size() > 0) {
            return (C2421h4) list.get_Item(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m46916kk() {
        return m46915k4(3, 0).length > 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2421h4 m46917x1() {
        Dictionary.Enumerator<String, List<k4>> it = this.f34744x1.iterator();
        while (it.hasNext()) {
            try {
                List list = (List) it.next().getValue();
                if (list.size() != 0) {
                    return ((k4) list.get_Item(0)).f34747to;
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
    private String m46912x1(int i, int i2) {
        return C14113y2.m67402k4(this.f34743k4, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final C9604wy m46914k4(C9603wl c9603wl) {
        C2421h4 c2421h4M46913k4 = m46913k4();
        if (c2421h4M46913k4 != null) {
            return c2421h4M46913k4.mo11842k4(c9603wl);
        }
        C2421h4 c2421h4M46917x1 = m46917x1();
        return c2421h4M46917x1 != null ? c2421h4M46917x1.mo11842k4(c9603wl) : new C9604wy(m46916kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final C2421h4[] m46915k4(int i, int i2) {
        String strM46912x1 = m46912x1(i, i2);
        if (!this.f34744x1.containsKey(strM46912x1)) {
            return new C2421h4[0];
        }
        k4[] array = this.f34744x1.get_Item(strM46912x1).toArray(new k4[0]);
        List list = new List();
        for (k4 k4Var : array) {
            list.addItem(k4Var.f34747to);
        }
        return (C2421h4[]) list.toArray(new C2421h4[0]);
    }
}

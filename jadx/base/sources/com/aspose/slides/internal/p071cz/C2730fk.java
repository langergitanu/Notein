package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.fk */
/* JADX INFO: loaded from: classes3.dex */
class C2730fk implements IGenericCloneable<C2730fk> {

    /* JADX INFO: renamed from: k4 */
    private double f8597k4;

    /* JADX INFO: renamed from: x1 */
    private List<AbstractC2904sx> f8598x1;

    private C2730fk(double d, List<AbstractC2904sx> list) {
        this.f8597k4 = d;
        this.f8598x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m12274k4() {
        return this.f8597k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C2730fk cloneT() {
        List list = new List(this.f8598x1.size());
        List.Enumerator<AbstractC2904sx> it = this.f8598x1.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C2730fk(this.f8597k4, list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C2730fk(C2674bu c2674bu) {
        this.f8598x1 = new List<>();
        C12025x6[] c12025x6ArrM12145dy = c2674bu.m12145dy();
        int[] iArrM12143c5 = c2674bu.m12143c5();
        int i = 1;
        if (iArrM12143c5.length <= 1) {
            throw new ArgumentException("Path is empty", "path");
        }
        C2865q1 c2865q1Clone = m12272k4(c12025x6ArrM12145dy[0].Clone()).Clone();
        AbstractC2904sx c2923uh = null;
        while (i < iArrM12143c5.length) {
            if ((iArrM12143c5[i] & 3) == 3) {
                C3002zr c3002zr = (C3002zr) C7019kk.m27452k4((Object) c2923uh, C3002zr.class);
                C2865q1 c2865q1Clone2 = c2865q1Clone.Clone();
                C2865q1 c2865q1Clone3 = m12272k4(c12025x6ArrM12145dy[i].Clone()).Clone();
                C2865q1 c2865q1Clone4 = m12272k4(c12025x6ArrM12145dy[i + 1].Clone()).Clone();
                i += 2;
                C3002zr c3002zr2 = new C3002zr(c2865q1Clone2, c2865q1Clone3, c2865q1Clone4, m12272k4(c12025x6ArrM12145dy[i].Clone()).Clone());
                if (c3002zr != null) {
                    this.f8598x1.removeItem(c3002zr);
                    this.f8597k4 -= c3002zr.mo12528k4();
                    c3002zr2 = c3002zr.m12649k4(c3002zr2);
                }
                c2923uh = c3002zr2;
            } else {
                c2923uh = new C2923uh(c2865q1Clone.Clone(), m12272k4(c12025x6ArrM12145dy[i].Clone()).Clone());
            }
            this.f8598x1.addItem(c2923uh);
            this.f8597k4 += c2923uh.mo12528k4();
            if (i < iArrM12143c5.length) {
                m12272k4(c12025x6ArrM12145dy[i].Clone()).CloneTo(c2865q1Clone);
            }
            i++;
        }
        this.f8598x1.trimExcess();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2730fk m12275k4(double d) {
        double dMo12528k4 = 0.0d;
        if (d == 0.0d) {
            return this;
        }
        List list = new List(this.f8598x1.size());
        List.Enumerator<AbstractC2904sx> it = this.f8598x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC2904sx abstractC2904sxMo12529k4 = it.next().mo12529k4(d);
                list.addItem(abstractC2904sxMo12529k4);
                dMo12528k4 += abstractC2904sxMo12529k4.mo12528k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C2730fk(dMo12528k4, list);
    }

    /* JADX INFO: renamed from: x1 */
    public final C2865q1 m12278x1(double d) {
        if (d < 0.0d) {
            throw new ArgumentException("Offset can not be less than zero", "offset");
        }
        double d2 = this.f8597k4 * d;
        double[] dArr = {0.0d};
        return m12273k4(d2, dArr).mo12531x1(dArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private C2865q1 m12272k4(C12025x6 c12025x6) {
        return new C2865q1(c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC2904sx m12273k4(double d, double[] dArr) {
        AbstractC2904sx abstractC2904sx;
        double dMo12528k4 = 0.0d;
        int i = 0;
        while (true) {
            if (i >= this.f8598x1.size()) {
                abstractC2904sx = null;
                break;
            }
            dMo12528k4 += this.f8598x1.get_Item(i).mo12528k4();
            if (d <= dMo12528k4) {
                abstractC2904sx = this.f8598x1.get_Item(i);
                break;
            }
            i++;
        }
        if (abstractC2904sx == null) {
            abstractC2904sx = (AbstractC2904sx) OooO0O0.OooO00o(this.f8598x1, 1);
        }
        dArr[0] = abstractC2904sx.mo12528k4() != 0.0d ? (abstractC2904sx.mo12528k4() - (dMo12528k4 - d)) / abstractC2904sx.mo12528k4() : 0.0d;
        return abstractC2904sx;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2968xo m12276k4(double d, double d2, boolean z) {
        if (d < 0.0d) {
            throw new ArgumentException("Offset can not be less than zero", "offset");
        }
        if (d2 < 0.0d) {
            throw new ArgumentException("Length can not be less than zero", "length");
        }
        double d3 = this.f8597k4 * d;
        double[] dArr = {0.0d};
        return m12273k4(d3, dArr).mo12530k4(dArr[0], d2, z);
    }
}

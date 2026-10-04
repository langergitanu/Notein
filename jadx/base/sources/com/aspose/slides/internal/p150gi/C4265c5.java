package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.OooOo;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p048bv.C1856c5;
import com.aspose.slides.internal.p057c6.C1982jd;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p151gj.C4319h4;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10017to;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4265c5 {

    /* JADX INFO: renamed from: c5 */
    private C1856c5 f11607c5;

    /* JADX INFO: renamed from: ck */
    private kk f11608ck;

    /* JADX INFO: renamed from: du */
    public InterfaceC1984kk f11609du;

    /* JADX INFO: renamed from: h4 */
    public InterfaceC1984kk f11611h4;

    /* JADX INFO: renamed from: k4 */
    public int f11612k4;

    /* JADX INFO: renamed from: kk */
    public String f11613kk;

    /* JADX INFO: renamed from: m9 */
    public boolean f11614m9;

    /* JADX INFO: renamed from: to */
    public int f11615to;

    /* JADX INFO: renamed from: jd */
    private static final String[] f11605jd = {"LINEAR-GRADIENT"};

    /* JADX INFO: renamed from: fa */
    private static final k4 f11604fa = k4.m17169k4(95, new x1(), C12003du.f40505to.Clone());

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f11606ks = new C7017h4("TL", "TR", "BL", "BR", "LINEAR-GRADIENT");

    /* JADX INFO: renamed from: dy */
    private int f11610dy = -1;

    /* JADX INFO: renamed from: x1 */
    public C12003du f11617x1 = new C12003du();

    /* JADX INFO: renamed from: up */
    private k4[] f11616up = new k4[4];

    /* JADX INFO: renamed from: yj */
    private C4286ne[] f11618yj = new C4286ne[4];

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private int f11619du;

        /* JADX INFO: renamed from: k4 */
        public C4308x1 f11620k4 = null;

        /* JADX INFO: renamed from: kk */
        public C4286ne f11621kk;

        /* JADX INFO: renamed from: to */
        private C12003du f11622to;

        /* JADX INFO: renamed from: x1 */
        public int f11623x1;

        private k4(int i, C4286ne c4286ne, C12003du c12003du) {
            C12003du c12003du2 = new C12003du();
            this.f11622to = c12003du2;
            this.f11619du = -1;
            this.f11623x1 = i;
            this.f11621kk = c4286ne;
            c12003du.CloneTo(c12003du2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            return k4Var != null && C10017to.m49170k4(this.f11622to.Clone(), k4Var.f11622to.Clone()) && this.f11623x1 == k4Var.f11623x1 && C10017to.m49170k4(this.f11621kk, k4Var.f11621kk);
        }

        public int hashCode() {
            if (this.f11619du == -1) {
                int iHashCode = (((629 + (this.f11622to.m56504dy() ? 0 : this.f11622to.hashCode())) * 37) + this.f11623x1) * 37;
                C4286ne c4286ne = this.f11621kk;
                this.f11619du = iHashCode + (c4286ne != null ? c4286ne.hashCode() : 0);
            }
            return this.f11619du;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m17170k4() {
            return this.f11623x1;
        }

        /* JADX INFO: renamed from: kk */
        public final C4286ne m17171kk() {
            return this.f11621kk;
        }

        /* JADX INFO: renamed from: to */
        public final int m17172to() {
            int i = this.f11623x1;
            if (i == 95 || i == 57) {
                return 0;
            }
            return this.f11621kk.mo17182c5();
        }

        public String toString() {
            C6765kp c6765kp = new C6765kp("BorderInfo");
            c6765kp.m26792k4(" {");
            c6765kp.m26805kk(this.f11623x1);
            c6765kp.m26792k4(", ");
            c6765kp.m26791k4(this.f11622to.Clone());
            c6765kp.m26792k4(", ");
            c6765kp.m26791k4(this.f11621kk);
            c6765kp.m26792k4("}");
            return c6765kp.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final C12003du m17173x1() {
            return this.f11622to;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m17169k4(int i, C4286ne c4286ne, C12003du c12003du) {
            return new k4(i, c4286ne, c12003du.Clone());
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5$kk */
    public static abstract class kk {

        /* JADX INFO: renamed from: k4 */
        private int f11624k4;

        public kk(int i) {
            m17174k4(i);
        }

        /* JADX INFO: renamed from: k4 */
        private void m17174k4(int i) {
            this.f11624k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract C4328x1 mo17175k4(C12007ix c12007ix);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5$to */
    public static class to extends kk {

        /* JADX INFO: renamed from: k4 */
        private int f11625k4;

        /* JADX INFO: renamed from: kk */
        private List<k4> f11626kk;

        /* JADX INFO: renamed from: x1 */
        private float f11627x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5$to$k4 */
        public static class k4 {

            /* JADX INFO: renamed from: k4 */
            private C5656k4 f11628k4;

            /* JADX INFO: renamed from: x1 */
            private C14093tq<Float> f11629x1;

            private k4() {
                this.f11629x1 = new C14093tq<>();
            }

            /* JADX INFO: renamed from: k4 */
            public final C5656k4 m17178k4() {
                return this.f11628k4;
            }

            /* JADX INFO: renamed from: x1 */
            public final C14093tq<Float> m17181x1() {
                return this.f11629x1.Clone();
            }

            /* JADX INFO: renamed from: k4 */
            public final void m17179k4(C5656k4 c5656k4) {
                this.f11628k4 = c5656k4;
            }

            /* JADX INFO: renamed from: k4 */
            public final void m17180k4(C14093tq<Float> c14093tq) {
                this.f11629x1 = c14093tq.Clone();
            }
        }

        public to(String str) {
            super(0);
            String[] strArrM67416k4 = C14113y2.m67416k4(str, new char[]{','}, (short) 1);
            if (strArrM67416k4.length > 0) {
                float[] fArr = {this.f11627x1};
                boolean zM66714k4 = C14064he.m66714k4(C14113y2.m67440x1(strArrM67416k4[0]), fArr);
                this.f11627x1 = fArr[0];
                if (zM66714k4) {
                    this.f11625k4 = 4;
                } else {
                    int iM27428k4 = C4265c5.f11606ks.m27428k4(C14113y2.m67371jd(C14113y2.m67440x1(strArrM67416k4[0])));
                    if (iM27428k4 == 0) {
                        this.f11625k4 = 0;
                    } else if (iM27428k4 == 1) {
                        this.f11625k4 = 1;
                    } else if (iM27428k4 == 2) {
                        this.f11625k4 = 2;
                    } else if (iM27428k4 == 3) {
                        this.f11625k4 = 3;
                    }
                }
                this.f11626kk = new List<>(strArrM67416k4.length - 1);
                for (int i = 1; i < strArrM67416k4.length; i++) {
                    String[] strArrM67416k42 = C14113y2.m67416k4(strArrM67416k4[i], new char[]{ControlChar.SPACE_CHAR}, (short) 1);
                    C12385to c12385toM57989x1 = new C12380dy("#([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])", 66).m57989x1(strArrM67416k42[0]);
                    k4 k4Var = new k4();
                    k4Var.m17179k4(C5656k4.m23093k4(C14080ne.m67044x1(c12385toM57989x1.m58004du().m58000k4(1).mo57995kk(), 16), C14080ne.m67044x1(c12385toM57989x1.m58004du().m58000k4(2).mo57995kk(), 16), C14080ne.m67044x1(c12385toM57989x1.m58004du().m58000k4(3).mo57995kk(), 16), C14080ne.m67044x1(c12385toM57989x1.m58004du().m58000k4(4).mo57995kk(), 16)));
                    if (strArrM67416k42.length > 1) {
                        k4Var.m17180k4(new C14093tq<>(Float.valueOf(C14064he.m66707k4(strArrM67416k42[1], C11697x1.m55250kk()))));
                    }
                    this.f11626kk.addItem(k4Var);
                }
            }
        }

        /* JADX INFO: renamed from: x1 */
        private float m17177x1(C12007ix c12007ix) {
            if (this.f11625k4 == 4) {
                return this.f11627x1 - 90.0f;
            }
            float fM67471fa = (float) ((C14116yg.m67471fa(c12007ix.m56575x1() / c12007ix.m56550c5()) * 180.0d) / 3.141592653589793d);
            int i = this.f11625k4;
            if (i == 0) {
                return -(fM67471fa + 90.0f);
            }
            if (i == 1) {
                return -(90.0f - fM67471fa);
            }
            if (i == 2) {
                return fM67471fa + 90.0f;
            }
            if (i != 3) {
                return 0.0f;
            }
            return 90.0f - fM67471fa;
        }

        @Override // com.aspose.slides.internal.p150gi.C4265c5.kk
        /* JADX INFO: renamed from: k4 */
        public C4328x1 mo17175k4(C12007ix c12007ix) {
            C4324m9 c4324m9 = new C4324m9(c12007ix.Clone(), m17177x1(c12007ix.Clone()), true);
            c4324m9.m17405k4(m17176k4());
            return c4324m9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k4 */
        private C4319h4[] m17176k4() {
            float fFloatValue;
            List list = new List(this.f11626kk.size());
            List list2 = new List(this.f11626kk.size());
            List.Enumerator it = this.f11626kk.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    k4 next = it.next();
                    k4 k4Var = new k4();
                    k4Var.m17179k4(new C5656k4(next.m17178k4().m23103m9()));
                    k4Var.m17180k4(next.m17181x1().Clone());
                    list2.addItem(k4Var);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            float f = 0.0f;
            if (!((k4) list2.get_Item(0)).m17181x1().m67302x1()) {
                ((k4) list2.get_Item(0)).m17180k4(new C14093tq<>(Float.valueOf(0.0f)));
            }
            if (!((k4) list2.get_Item(this.f11626kk.size() - 1)).m17181x1().m67302x1()) {
                ((k4) list2.get_Item(this.f11626kk.size() - 1)).m17180k4(new C14093tq<>(Float.valueOf(1.0f)));
            }
            int i = 1;
            while (i < this.f11626kk.size() - 1) {
                if (!((k4) list2.get_Item(i)).m17181x1().m67302x1()) {
                    float fFloatValue2 = ((k4) list2.get_Item(i - 1)).m17181x1().m67297k4().floatValue();
                    int i2 = i + 1;
                    int i3 = 1;
                    while (true) {
                        if (i2 >= this.f11626kk.size()) {
                            fFloatValue = f;
                            break;
                        }
                        if (((k4) list2.get_Item(i2)).m17181x1().m67302x1()) {
                            fFloatValue = ((k4) list2.get_Item(i2)).m17181x1().m67297k4().floatValue();
                            break;
                        }
                        i3++;
                        i2++;
                    }
                    float f2 = (fFloatValue - fFloatValue2) / (i3 + 1);
                    int i4 = i;
                    while (i4 < i + i3) {
                        ((k4) list2.get_Item(i4)).m17180k4(new C14093tq<>(Float.valueOf((((i4 - i) + 1) * f2) + fFloatValue2)));
                        i4++;
                        f = f;
                    }
                }
                i++;
                f = f;
            }
            float f3 = f;
            if (((k4) list2.get_Item(0)).m17181x1().m67297k4().floatValue() != f3) {
                k4 k4Var2 = new k4();
                k4Var2.m17179k4(new C5656k4(0, 255, 255, 255));
                k4Var2.m17180k4(new C14093tq<>(Float.valueOf(f3)));
                list2.insertItem(0, k4Var2);
            }
            if (((k4) OooO0O0.OooO00o(list2, 1)).m17181x1().m67297k4().floatValue() != 1.0f) {
                k4 k4Var3 = new k4();
                k4Var3.m17179k4(new C5656k4(0, 255, 255, 255));
                k4Var3.m17180k4(new C14093tq<>(Float.valueOf(1.0f)));
                list2.addItem(k4Var3);
            }
            it = list2.iterator();
            while (it.hasNext()) {
                try {
                    k4 k4Var4 = (k4) it.next();
                    list.addItem(new C4319h4(k4Var4.m17178k4(), k4Var4.m17181x1().m67297k4().floatValue()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return (C4319h4[]) list.toArray(new C4319h4[0]);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.c5$x1 */
    public static class x1 extends C4286ne {
        private x1() {
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne
        /* JADX INFO: renamed from: c5 */
        public int mo17182c5() {
            return 0;
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne, com.aspose.slides.internal.p150gi.AbstractC4282kp
        /* JADX INFO: renamed from: dy */
        public InterfaceC1984kk mo9877dy() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne
        /* JADX INFO: renamed from: jd */
        public boolean mo17183jd() {
            return true;
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne
        /* JADX INFO: renamed from: k4 */
        public int mo17184k4(InterfaceC1981h4 interfaceC1981h4) {
            return 0;
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne, com.aspose.slides.internal.p150gi.AbstractC4282kp
        public String toString() {
            return "CondLength[0mpt, discard]";
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne, com.aspose.slides.internal.p057c6.InterfaceC1987x1
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo10116k4(int i) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p150gi.C4286ne, com.aspose.slides.internal.p057c6.InterfaceC1987x1
        /* JADX INFO: renamed from: k4 */
        public void mo10117k4(int i, AbstractC4282kp abstractC4282kp, boolean z) {
            throw new NotSupportedException();
        }
    }

    private C4265c5(AbstractC3533um abstractC3533um) {
        InterfaceC1984kk interfaceC1984kkMo9877dy;
        this.f11612k4 = abstractC3533um.m14402to(8).mo17251du();
        C12003du c12003duClone = abstractC3533um.m14402to(9).mo9923k4(abstractC3533um.m14393k4().m14111q_()).Clone();
        ((c12003duClone.m56501c5() & 255) == 0 ? C12003du.f40505to : c12003duClone).CloneTo(this.f11617x1);
        this.f11614m9 = abstractC3533um.m14402to(StyleIdentifier.GRID_TABLE_4_ACCENT_3).mo17251du() == 149;
        String strMo9926j_ = abstractC3533um.m14402to(10).mo9926j_();
        if (strMo9926j_ == null || C14113y2.m67363du(strMo9926j_, "none")) {
            this.f11613kk = C14113y2.f47374k4;
            this.f11615to = -1;
            interfaceC1984kkMo9877dy = null;
            this.f11609du = null;
        } else {
            this.f11613kk = strMo9926j_;
            this.f11615to = abstractC3533um.m14402to(14).mo17251du();
            this.f11609du = abstractC3533um.m14402to(12).mo9877dy();
            interfaceC1984kkMo9877dy = abstractC3533um.m14402to(13).mo9877dy();
        }
        this.f11611h4 = interfaceC1984kkMo9877dy;
        m17144k4(abstractC3533um, 0, 23, 25, 26, 172);
        m17144k4(abstractC3533um, 1, 19, 21, 22, 171);
        m17144k4(abstractC3533um, 2, 47, 49, 50, 177);
        m17144k4(abstractC3533um, 3, 33, 35, 36, 174);
        C4308x1 c4308x1 = new C4308x1();
        c4308x1.m17283k4(abstractC3533um);
        if (c4308x1.m17284k4()) {
            k4[] k4VarArr = this.f11616up;
            if (k4VarArr[0] == null) {
                k4VarArr[0] = f11604fa;
            }
            if (k4VarArr[1] == null) {
                k4VarArr[1] = f11604fa;
            }
            if (k4VarArr[2] == null) {
                k4VarArr[2] = f11604fa;
            }
            if (k4VarArr[3] == null) {
                k4VarArr[3] = f11604fa;
            }
            k4VarArr[0].f11620k4 = c4308x1;
            k4VarArr[1].f11620k4 = c4308x1;
            k4VarArr[2].f11620k4 = c4308x1;
            k4VarArr[3].f11620k4 = c4308x1;
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m17147du(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17165x1(z) + m17153k4(z) + m17166x1(z, interfaceC1981h4) + m17154k4(z, interfaceC1981h4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4265c5 c4265c5 = (C4265c5) C7019kk.m27452k4(obj, C4265c5.class);
        if (c4265c5 != null && this.f11612k4 == c4265c5.f11612k4 && C10017to.m49170k4(this.f11617x1.Clone(), c4265c5.f11617x1.Clone()) && C10017to.m49170k4(this.f11613kk, c4265c5.f11613kk)) {
            InterfaceC1984kk interfaceC1984kk = this.f11609du;
            if (C10017to.m49170k4(interfaceC1984kk, interfaceC1984kk) && C10017to.m49170k4(this.f11611h4, c4265c5.f11611h4) && this.f11615to == c4265c5.f11615to && C14067j2.m66728k4(this.f11616up, c4265c5.f11616up) && C14067j2.m66728k4(this.f11618yj, c4265c5.f11618yj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m17150h4(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17161to(z) + m17159kk(z) + m17162to(z, interfaceC1981h4) + m17160kk(z, interfaceC1981h4);
    }

    public int hashCode() {
        if (this.f11610dy == -1) {
            C12003du c12003duClone = this.f11617x1.Clone();
            String str = this.f11613kk;
            InterfaceC1984kk interfaceC1984kk = this.f11609du;
            InterfaceC1984kk interfaceC1984kk2 = this.f11611h4;
            k4[] k4VarArr = this.f11616up;
            k4 k4Var = k4VarArr[0];
            k4 k4Var2 = k4VarArr[1];
            k4 k4Var3 = k4VarArr[2];
            k4 k4Var4 = k4VarArr[3];
            C4286ne[] c4286neArr = this.f11618yj;
            this.f11610dy = (((m17141k4(c12003duClone, str, interfaceC1984kk, interfaceC1984kk2, k4Var, k4Var2, k4Var3, k4Var4, c4286neArr[0], c4286neArr[1], c4286neArr[2], c4286neArr[3]) * 37) + this.f11612k4) * 37) + this.f11615to;
        }
        return this.f11610dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17151k4(int i, boolean z) {
        int i2;
        k4 k4Var = this.f11616up[i];
        if (k4Var == null || (i2 = k4Var.f11623x1) == 95 || i2 == 57) {
            return 0;
        }
        if (z && k4Var.f11621kk.mo17183jd()) {
            return 0;
        }
        return this.f11616up[i].f11621kk.mo17182c5();
    }

    /* JADX INFO: renamed from: kk */
    public final int m17158kk(int i) {
        k4 k4Var = this.f11616up[i];
        if (k4Var != null) {
            return k4Var.f11623x1;
        }
        return 95;
    }

    /* JADX INFO: renamed from: to */
    public final int m17161to(boolean z) {
        return m17151k4(1, z);
    }

    public String toString() {
        return C14113y2.m67407k4("CommonBordersAndPadding (Before, After, Start, End):\n", "Borders: (", C14057f9.m66591x1(m17159kk(false)), ", ", C14057f9.m66591x1(m17161to(false)), ", ", C14057f9.m66591x1(m17153k4(false)), ", ", C14057f9.m66591x1(m17165x1(false)), ")\n", "Border Colors: (", m17168x1(0), ", ", m17168x1(1), ", ", m17168x1(2), ", ", m17168x1(3), ")\n", "Padding: (", C14057f9.m66591x1(m17160kk(false, null)), ", ", C14057f9.m66591x1(m17162to(false, null)), ", ", C14057f9.m66591x1(m17154k4(false, (InterfaceC1981h4) null)), ", ", C14057f9.m66591x1(m17166x1(false, null)), ")\n");
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17165x1(boolean z) {
        return m17151k4(3, z);
    }

    /* JADX INFO: renamed from: du */
    public final C4286ne m17148du(int i) {
        return this.f11618yj[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17152k4(int i, boolean z, InterfaceC1981h4 interfaceC1981h4) {
        C4286ne c4286ne = this.f11618yj[i];
        if (c4286ne == null) {
            return 0;
        }
        if (z && c4286ne.mo17183jd()) {
            return 0;
        }
        return this.f11618yj[i].mo17184k4(interfaceC1981h4);
    }

    /* JADX INFO: renamed from: kk */
    public final int m17159kk(boolean z) {
        return m17151k4(0, z);
    }

    /* JADX INFO: renamed from: to */
    public final int m17162to(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17152k4(1, z, interfaceC1981h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17166x1(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17152k4(3, z, interfaceC1981h4);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m17149du() {
        return (this.f11617x1.m56504dy() && m17163to() == null && !m17156k4()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17153k4(boolean z) {
        return m17151k4(2, z);
    }

    /* JADX INFO: renamed from: kk */
    public final int m17160kk(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17152k4(0, z, interfaceC1981h4);
    }

    /* JADX INFO: renamed from: to */
    public final C1856c5 m17163to() {
        return this.f11607c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final kk m17167x1() {
        return this.f11608ck;
    }

    /* JADX INFO: renamed from: kk */
    public static k4 m17146kk() {
        return f11604fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17154k4(boolean z, InterfaceC1981h4 interfaceC1981h4) {
        return m17152k4(2, z, interfaceC1981h4);
    }

    /* JADX INFO: renamed from: to */
    public final C4308x1 m17164to(int i) {
        k4 k4Var = this.f11616up[i];
        if (k4Var != null) {
            return k4Var.f11620k4;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m17168x1(int i) {
        k4 k4Var = this.f11616up[i];
        return k4Var != null ? k4Var.m17173x1() : C12003du.f40505to;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m17141k4(Object... objArr) {
        int length = objArr.length;
        int iHashCode = 17;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 37) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: k4 */
    public final k4 m17155k4(int i) {
        k4 k4Var = this.f11616up[i];
        return k4Var == null ? m17146kk() : k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static kk m17142k4(String str) {
        if (str == null) {
            return null;
        }
        C12380dy c12380dy = new C12380dy("^([\\w-]+)\\((.+)\\)$", 66);
        if (!c12380dy.m57988to(str)) {
            return null;
        }
        C12385to c12385toM57989x1 = c12380dy.m57989x1(str);
        if (c12385toM57989x1.m58004du().m57999k4() != 3) {
            return null;
        }
        String strOooO00o = OooOo.OooO00o(c12385toM57989x1, 1);
        String strOooO00o2 = OooOo.OooO00o(c12385toM57989x1, 2);
        if (f11606ks.m27428k4(C14113y2.m67371jd(strOooO00o)) != 4) {
            return null;
        }
        return new to(strOooO00o2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4265c5 m17143k4(AbstractC3533um abstractC3533um) {
        C4286ne c4286ne;
        C4286ne c4286ne2;
        C4286ne c4286ne3;
        InterfaceC1984kk interfaceC1984kk;
        InterfaceC1984kk interfaceC1984kk2;
        C4265c5 c4265c5 = new C4265c5(abstractC3533um);
        C4286ne c4286ne4 = c4265c5.f11618yj[0];
        C4265c5 c4265c52 = ((c4286ne4 == null || c4286ne4.mo9877dy().mo9883kk()) && ((c4286ne = c4265c5.f11618yj[1]) == null || c4286ne.mo9877dy().mo9883kk()) && (((c4286ne2 = c4265c5.f11618yj[2]) == null || c4286ne2.mo9877dy().mo9883kk()) && (((c4286ne3 = c4265c5.f11618yj[3]) == null || c4286ne3.mo9877dy().mo9883kk()) && (((interfaceC1984kk = c4265c5.f11609du) == null || interfaceC1984kk.mo9883kk()) && ((interfaceC1984kk2 = c4265c5.f11611h4) == null || interfaceC1984kk2.mo9883kk()))))) ? c4265c5 : null;
        kk kkVarM17142k4 = m17142k4(c4265c5.f11613kk);
        c4265c5.f11608ck = kkVarM17142k4;
        if ((c4265c52 == null || c4265c52 == c4265c5) && kkVarM17142k4 == null && !C14113y2.m67411k4(c4265c5.f11613kk)) {
            String strM10107k4 = C1982jd.m10107k4(c4265c5.f11613kk);
            C12814to c12814toM14111q_ = abstractC3533um.m14393k4().m14111q_();
            c4265c5.f11607c5 = c12814toM14111q_.m59556du().m59541m9().m9731k4(strM10107k4, c12814toM14111q_.m59558fa());
        }
        return c4265c52 != null ? c4265c52 : c4265c5;
    }

    /* JADX INFO: renamed from: k4 */
    private void m17144k4(AbstractC3533um abstractC3533um, int i, int i2, int i3, int i4, int i5) {
        this.f11618yj[i] = abstractC3533um.m14402to(i5).mo17250ck();
        int iMo17251du = abstractC3533um.m14402to(i3).mo17251du();
        if (iMo17251du != 95) {
            m17145k4(k4.m17169k4(iMo17251du, abstractC3533um.m14402to(i4).mo17250ck(), abstractC3533um.m14402to(i2).mo9923k4(abstractC3533um.m14393k4().m14111q_()).Clone()), i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17145k4(k4 k4Var, int i) {
        this.f11616up[i] = k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17156k4() {
        return this.f11608ck != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17157k4(InterfaceC1981h4 interfaceC1981h4) {
        return m17166x1(false, interfaceC1981h4) + (m17154k4(false, interfaceC1981h4) + (m17162to(false, interfaceC1981h4) + m17160kk(false, interfaceC1981h4))) > 0;
    }
}

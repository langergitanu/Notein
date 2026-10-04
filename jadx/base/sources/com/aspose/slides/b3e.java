package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.C2068ei;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.qy7;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class b3e extends el1 {

    /* JADX INFO: renamed from: du */
    public final int f4096du;

    /* JADX INFO: renamed from: fa */
    private boolean f4097fa;

    /* JADX INFO: renamed from: h4 */
    C14327q4 f4098h4;

    /* JADX INFO: renamed from: k4 */
    public final String f4099k4;

    /* JADX INFO: renamed from: kk */
    public final float f4100kk;

    /* JADX INFO: renamed from: ks */
    private final List<c2j> f4101ks;

    /* JADX INFO: renamed from: rv */
    private boolean f4102rv;

    /* JADX INFO: renamed from: to */
    public final boolean f4103to;

    /* JADX INFO: renamed from: up */
    private float f4104up;

    /* JADX INFO: renamed from: x1 */
    public final float f4105x1;

    /* JADX INFO: renamed from: yj */
    private float f4106yj;

    /* JADX INFO: renamed from: com.aspose.slides.b3e$k4 */
    public static abstract class AbstractC0795k4 extends AbstractC14085qw {
        private AbstractC0795k4() {
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.b3e$x1 */
    public static class C0796x1 extends AbstractC7020m9<C0796x1> {

        /* JADX INFO: renamed from: k4 */
        public AbstractC0795k4 f4111k4;

        /* JADX INFO: renamed from: kk */
        public float f4112kk;

        /* JADX INFO: renamed from: to */
        public float f4113to;

        /* JADX INFO: renamed from: x1 */
        public AbstractC0795k4 f4114x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m3982x1(C0796x1 c0796x1) {
            return C14067j2.m66728k4(c0796x1.f4111k4, this.f4111k4) && C14067j2.m66728k4(c0796x1.f4114x1, this.f4114x1) && c0796x1.f4112kk == this.f4112kk && c0796x1.f4113to == this.f4113to;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C0796x1) {
                return m3982x1((C0796x1) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(this.f4111k4, this.f4114x1, Float.valueOf(this.f4112kk), Float.valueOf(this.f4113to));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public C0796x1 Clone() {
            C0796x1 c0796x1 = new C0796x1();
            CloneTo(c0796x1);
            return c0796x1;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C0796x1 c0796x1) {
            c0796x1.f4111k4 = this.f4111k4;
            c0796x1.f4114x1 = this.f4114x1;
            c0796x1.f4112kk = this.f4112kk;
            c0796x1.f4113to = this.f4113to;
        }
    }

    static {
        C7019kk.m27454k4(l4h.class, (InterfaceC7014c5) new InterfaceC7014c5<l4h>() { // from class: com.aspose.slides.b3e.3
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public l4h mo838x1() {
                return new l4h();
            }
        });
    }

    public b3e(MathematicalText mathematicalText, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4, String str) {
        float f;
        float f2;
        int i;
        super(mathematicalText, interfaceC0851ce);
        this.f4104up = 0.0f;
        this.f4106yj = 0.0f;
        this.f4101ks = new List<>();
        this.f4098h4 = new C14327q4();
        IPortionFormat format = mathematicalText.getFormat();
        str = C14113y2.m67411k4(str) ? mathematicalText.getValue() : str;
        if (!C14113y2.m67411k4(str)) {
            str = ezy.m5795k4(str, MathematicalText.m2005k4(format));
            C6765kp c6765kp = null;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == 8289 && (i = i2 + 1) < str.length() && str.charAt(i) == '(') {
                    c6765kp = new C6765kp(str.length());
                    if (i2 > 0) {
                        c6765kp.m26793k4(str, 0, i2);
                    }
                } else if (c6765kp != null) {
                    c6765kp.m26780k4(str.charAt(i2));
                }
            }
            if (c6765kp != null) {
                str = c6765kp.toString();
            }
        }
        this.f4099k4 = str;
        if (!C14064he.m66715kk(format.getEscapement()) && format.getEscapement() != 0.0f) {
            this.f4106yj = format.getEscapement() * c14327q4.f48231du * (-0.01f);
            c14327q4.f48231du *= 0.666f;
        }
        if (c14327q4.f48234h4) {
            if (!C14117yj.m67514du(str.charAt(0)) && !C14117yj.m67519h4(str.charAt(0))) {
                f = c14327q4.f48231du;
                f2 = 0.86f;
            } else if (c14327q4.f48231du / mo4555du().f48223k4 < 0.64d) {
                f = mo4555du().f48223k4;
                f2 = 0.64f;
            }
            c14327q4.f48231du = f * f2;
        }
        if (m3979x1().m2007x1().m64384x1()) {
            this.f4105x1 = mo4555du().f48223k4;
            c14327q4.f48240up = 1.0f;
            c14327q4.f48233fa = 1.0f;
            this.f4102rv = true;
        } else {
            this.f4105x1 = c14327q4.f48231du;
        }
        this.f4096du = c14327q4.f48230ck;
        this.f4100kk = this.f4105x1 / 96.0f;
        this.f4103to = c14327q4.f48238m9;
        c2j.m4428k4(str, this.f4101ks);
        if (this.f4101ks.size() == 1 && "&".equals(this.f4101ks.get_Item(0).f4274k4)) {
            m3980x1(true);
        }
        c14327q4.CloneTo(this.f4098h4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Duplicate predecessors in PHI insn: B:28:0x0099, 0x00a1: PHI (r10v8 ?? I:android.graphics.Paint) = (r10v10 ?? I:java.lang.StringBuilder) binds: [B:28:0x0099] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:44)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:157)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: k4 */
    private static float m3973k4(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Duplicate predecessors in PHI insn: B:28:0x0099, 0x00a1: PHI (r10v8 ?? I:android.graphics.Paint) = (r10v10 ?? I:java.lang.StringBuilder) binds: [B:28:0x0099] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:44)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:157)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: kk */
    public final AbstractC12024x1 m3978kk() {
        return mo4555du().f48227x1.invoke((PortionFormat) m3979x1().getFormat());
    }

    /* JADX INFO: renamed from: x1 */
    public final MathematicalText m3979x1() {
        return (MathematicalText) this.f4820c5;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        float fM68100k4 = nn2.m68100k4(this.f4103to ? this.f4105x1 * 0.65f : this.f4105x1);
        final float f = (this.f4105x1 * 72.0f) / 96.0f;
        C0796x1 c0796x1 = new C0796x1();
        c0796x1.f4111k4 = new AbstractC0795k4() { // from class: com.aspose.slides.b3e.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }
        };
        c0796x1.f4114x1 = new AbstractC0795k4() { // from class: com.aspose.slides.b3e.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }
        };
        c0796x1.f4112kk = fM68100k4;
        c0796x1.f4113to = this.f4100kk;
        orj orjVarClone = m3974k4(this.f4101ks, c0796x1.Clone(), this.f4096du).Clone();
        l4h l4hVarClone = orjVarClone.f47894k4.Clone();
        this.f4104up = this.f4106yj;
        float f2 = orjVarClone.f47895x1;
        wsf wsfVar = new wsf();
        wsfVar.f49849k4 = l4hVarClone.f45935k4;
        wsfVar.f49850x1 = l4hVarClone.f45937x1;
        h2y h2yVar = new h2y();
        h2yVar.f5390x1 = wsfVar;
        h2yVar.f5389k4 = f2;
        return h2yVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3980x1(boolean z) {
        this.f4097fa = z;
    }

    /* JADX INFO: renamed from: k4 */
    private orj m3974k4(IGenericList<c2j> iGenericList, C0796x1 c0796x1, int i) {
        el1 el1Var;
        l4h l4hVar = new l4h();
        l4hVar.f45935k4 = 0.0f;
        l4hVar.f45937x1 = 0.0f;
        l4hVar.f45936kk = -3.4028235E38f;
        orj orjVar = new orj();
        orjVar.f47895x1 = 0.0f;
        orjVar.f47894k4 = l4hVar;
        if (iGenericList.size() == 0 || m3977k4()) {
            return orjVar;
        }
        C12009k4 c12009k4 = new C12009k4(2, 2);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                if (iGenericList.size() > 1) {
                    l4h[] l4hVarArr = (l4h[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) l4h.class), iGenericList.size()));
                    orjVar.f47895x1 = 0.0f;
                    for (int i2 = 0; i2 < iGenericList.size(); i2++) {
                        c2j c2jVar = iGenericList.get_Item(i2);
                        orj orjVarClone = m3975k4(abstractC12008jdM56582k4, c2jVar, c0796x1.Clone()).Clone();
                        c2jVar.f4276to.f4580k4.f47836k4 = orjVar.f47895x1;
                        orjVarClone.f47894k4.CloneTo(l4hVarArr[i2]);
                        orjVar.f47895x1 += orjVarClone.f47895x1;
                        orjVar.f47894k4.m64303k4(orjVarClone.f47894k4.Clone()).CloneTo(orjVar.f47894k4);
                        if (i2 == 0 && "−".equals(c2jVar.f4274k4) && ((el1Var = this.f4822dy) == null || (C7019kk.m27469x1(el1Var, b3e.class) && "=".equals(((b3e) this.f4822dy).f4099k4)))) {
                            c2jVar.f4277x1 = false;
                        }
                        if (c2jVar.f4277x1 && i != 2) {
                            if (i2 > 0) {
                                oju ojuVar = c2jVar.f4276to.f4580k4;
                                float f = ojuVar.f47836k4;
                                float f2 = c0796x1.f4112kk;
                                ojuVar.f47836k4 = f + f2;
                                orjVar.f47895x1 += f2;
                            }
                            if (i2 + 1 < iGenericList.size() && c2jVar.f4277x1 && (i2 != 0 || i != 0)) {
                                orjVar.f47895x1 += c0796x1.f4112kk;
                            }
                        }
                    }
                    for (int i3 = 0; i3 < iGenericList.size(); i3++) {
                        oju ojuVar2 = iGenericList.get_Item(i3).f4276to.f4580k4;
                        ojuVar2.f47837x1 = (orjVar.f47894k4.f45935k4 - l4hVarArr[i3].f45935k4) + ojuVar2.f47837x1;
                    }
                } else if (iGenericList.size() > 0) {
                    m3975k4(abstractC12008jdM56582k4, iGenericList.get_Item(0), c0796x1.Clone()).Clone().CloneTo(orjVar);
                }
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                return orjVar;
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private orj m3975k4(AbstractC12008jd abstractC12008jd, c2j c2jVar, C0796x1 c0796x1) {
        l4h l4hVar = new l4h();
        l4hVar.f45935k4 = 0.0f;
        l4hVar.f45937x1 = 0.0f;
        l4hVar.f45936kk = -3.4028235E38f;
        float f = (this.f4105x1 * 72.0f) / 96.0f;
        float f2 = this.f4098h4.f48240up;
        if (c2jVar.f4275kk == 1) {
            String strM67440x1 = C14113y2.m67440x1(c2jVar.f4274k4);
            if (strM67440x1.length() > 0 && C14117yj.m67520h4(strM67440x1, 0)) {
                f2 = 1.0f;
            }
        }
        if (c2jVar.f4275kk != 1) {
            f2 = this.f4098h4.f48233fa;
        }
        C12013m9 c12013m9M69385k4 = mo4555du().m69385k4(m3979x1(), c2jVar.f4275kk, f * f2);
        C2132iq c2132iqInvoke = mo4555du().f48224kk.invoke(c12013m9M69385k4.m56648m9());
        float fM3973k4 = m3973k4(abstractC12008jd, c2jVar.f4274k4, c12013m9M69385k4, c0796x1.f4112kk, c0796x1.f4113to, this.f4102rv);
        float fMo10317to = (c2132iqInvoke.mo10258c5().mo10317to() & 4294967295L) / ((c12013m9M69385k4.m56636c5() * 4.0f) / 3.0f);
        float fM56536x1 = c12013m9M69385k4.m56651x1().m56536x1(c12013m9M69385k4.m56642jd()) / fMo10317to;
        IGenericEnumerator<jua> it = new C1250ig(c2jVar.f4274k4).iterator();
        while (it.hasNext()) {
            try {
                C2068ei c2068eiMo10265k4 = c2132iqInvoke.mo10265k4(c2132iqInvoke.mo10751kk(it.next().Clone().toString())[0]);
                l4h l4hVar2 = new l4h();
                C2132iq c2132iq = c2132iqInvoke;
                double d = fMo10317to;
                l4hVar2.f45935k4 = (float) (c2068eiMo10265k4.m10467fa().m10422to() / d);
                l4hVar2.f45937x1 = -((float) (c2068eiMo10265k4.m10467fa().m10424x1() / d));
                l4hVar2.f45936kk = ((float) (c2068eiMo10265k4.m10467fa().m10422to() / d)) - fM56536x1;
                l4hVar.m64303k4(l4hVar2.Clone()).CloneTo(l4hVar);
                c2132iqInvoke = c2132iq;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        dex dexVar = new dex();
        c2jVar.f4276to = dexVar;
        dexVar.f4583x1 = c12013m9M69385k4;
        dexVar.f4582to = new oju(fM3973k4, l4hVar.m64302k4());
        dex dexVar2 = c2jVar.f4276to;
        dexVar2.f4581kk = l4hVar.f45935k4;
        dexVar2.f4580k4 = new oju(0.0f, l4hVar.f45936kk);
        c2jVar.f4276to.f4579du = fM56536x1;
        orj orjVar = new orj();
        orjVar.f47895x1 = fM3973k4;
        l4hVar.CloneTo(orjVar.f47894k4);
        return orjVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        AbstractC12024x1 abstractC12024x1M3978kk = m3978kk();
        AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
        if (m3977k4()) {
            return;
        }
        List.Enumerator<c2j> it = this.f4101ks.iterator();
        while (it.hasNext()) {
            try {
                c2j next = it.next();
                dex dexVarClone = next.f4276to.Clone();
                oju ojuVarClone = dexVarClone.f4580k4.Clone();
                qy7.C14366k4 c14366k4 = new qy7.C14366k4();
                c14366k4.f48495k4 = dexVarClone.f4583x1.m56648m9();
                c14366k4.f48498x1 = (dexVarClone.f4583x1.m56639dy() * 4.0f) / 3.0f;
                qy7 qy7Var = new qy7(mo4555du().f48221du, 72.0f, c14366k4.Clone());
                qy7Var.m69901k4(((C11999ar) abstractC12024x1M3978kk).m56305h4().Clone());
                abstractC14897zn.mo64343k4(next.f4274k4, new C12007ix(ojuVarClone.f47836k4, this.f4104up + ojuVarClone.f47837x1 + dexVarClone.f4579du, 0.0f, 0.0f).Clone(), qy7Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3977k4() {
        return this.f4097fa;
    }
}

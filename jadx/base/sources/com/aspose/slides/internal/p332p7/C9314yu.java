package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yu */
/* JADX INFO: loaded from: classes4.dex */
public class C9314yu extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private byte f33517c5;

    /* JADX INFO: renamed from: ck */
    private C7394ca f33518ck;

    /* JADX INFO: renamed from: du */
    private float f33519du;

    /* JADX INFO: renamed from: dy */
    private float f33520dy;

    /* JADX INFO: renamed from: h4 */
    private float f33521h4;

    /* JADX INFO: renamed from: jd */
    private boolean f33522jd;

    /* JADX INFO: renamed from: kk */
    private double f33523kk;

    /* JADX INFO: renamed from: m9 */
    private float f33524m9;

    /* JADX INFO: renamed from: to */
    private float f33525to;

    /* JADX INFO: renamed from: x1 */
    private double f33526x1;

    /* JADX INFO: renamed from: k4 */
    public static final byte f33516k4 = C8579q6.m39355k4("b");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f33515fa = new C7017h4("blurRad", "dist", "dir", "sx", "sy", "kx", "ky", "algn", "rotWithShape", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    public C9314yu() {
        m45140fa();
    }

    /* JADX INFO: renamed from: ck */
    public static /* synthetic */ C7017h4 m45138ck() {
        return f33515fa;
    }

    /* JADX INFO: renamed from: fa */
    private void m45140fa() {
        this.f33526x1 = 0.0d;
        this.f33523kk = 0.0d;
        this.f33525to = 0.0f;
        this.f33519du = 100.0f;
        this.f33521h4 = 100.0f;
        this.f33524m9 = 0.0f;
        this.f33520dy = 0.0f;
        this.f33517c5 = f33516k4;
        this.f33522jd = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ byte m45141k4(C9314yu c9314yu, byte b) {
        c9314yu.f33517c5 = b;
        return b;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m45150c5() {
        return this.f33522jd;
    }

    /* JADX INFO: renamed from: du */
    public final float m45151du() {
        return this.f33521h4;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m45153dy() {
        return this.f33517c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m45154h4() {
        return this.f33524m9;
    }

    /* JADX INFO: renamed from: jd */
    public final C7394ca m45155jd() {
        return this.f33518ck;
    }

    /* JADX INFO: renamed from: kk */
    public final float m45162kk() {
        return this.f33525to;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m45164m9() {
        return this.f33520dy;
    }

    /* JADX INFO: renamed from: to */
    public final float m45165to() {
        return this.f33519du;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m45167x1() {
        return this.f33523kk;
    }

    public C9314yu(final AbstractC13912i5 abstractC13912i5) {
        m45140fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yu.1
            /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
                java.lang.IllegalArgumentException: Illegal Capacity: -1
                	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
                	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
                	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
                	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(
            /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
                java.lang.IllegalArgumentException: Illegal Capacity: -1
                	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
                	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
                	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
                	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9314yu c9314yu;
                C7394ca c7394ca;
                switch (C9314yu.f33515fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 10:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 11:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 12:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 13:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 14:
                        c9314yu = C9314yu.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c9314yu.f33518ck = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public static /* synthetic */ float m45139du(C9314yu c9314yu, float f) {
        c9314yu.f33520dy = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ float m45146kk(C9314yu c9314yu, float f) {
        c9314yu.f33521h4 = f;
        return f;
    }

    /* JADX INFO: renamed from: to */
    public static /* synthetic */ float m45147to(C9314yu c9314yu, float f) {
        c9314yu.f33524m9 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ double m45148x1(C9314yu c9314yu, double d) {
        c9314yu.f33523kk = d;
        return d;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m45156k4() {
        return this.f33526x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ double m45142k4(C9314yu c9314yu, double d) {
        c9314yu.f33526x1 = d;
        return d;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m45149x1(C9314yu c9314yu, float f) {
        c9314yu.f33519du = f;
        return f;
    }

    /* JADX INFO: renamed from: du */
    public final void m45152du(float f) {
        this.f33520dy = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m45163kk(float f) {
        this.f33521h4 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m45166to(float f) {
        this.f33524m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m45143k4(C9314yu c9314yu, float f) {
        c9314yu.f33525to = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45168x1(double d) {
        this.f33523kk = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45169x1(float f) {
        this.f33519du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45157k4(String str) {
        C7394ca c7394ca;
        if (this.f33518ck != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f33515fa.m27428k4(str)) {
            case 9:
                c7394ca = new C7394ca("scrgbClr", new C9395zr());
                break;
            case 10:
                c7394ca = new C7394ca("srgbClr", new C7670fk());
                break;
            case 11:
                c7394ca = new C7394ca("hslClr", new C9052vm());
                break;
            case 12:
                c7394ca = new C7394ca("sysClr", new C7939il());
                break;
            case 13:
                c7394ca = new C7394ca("schemeClr", new C8732s1());
                break;
            case 14:
                c7394ca = new C7394ca("prstClr", new C8065k9());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f33518ck = c7394ca;
        return this.f33518ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45158k4(byte b) {
        this.f33517c5 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45159k4(double d) {
        this.f33526x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45160k4(float f) {
        this.f33525to = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f33526x1;
        if (d != 0.0d) {
            c3059ii.m12955x1("blurRad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f33523kk;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("dist", C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        if (this.f33525to != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "dir");
        }
        float f = this.f33519du;
        if (f != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("sx", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "sx");
            }
        }
        float f2 = this.f33521h4;
        if (f2 != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("sy", C14113y2.m67408k4(C13850af.m65102k4(f2), "%"));
            } else {
                OooO00o.OooO00o(f2 * 1000.0f, 14, c3059ii, "sy");
            }
        }
        if (this.f33524m9 != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "kx");
        }
        if (this.f33520dy != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "ky");
        }
        byte b = this.f33517c5;
        if (b != f33516k4) {
            c3059ii.m12955x1("algn", C8579q6.m39356k4(b));
        }
        boolean z = this.f33522jd;
        if (!z) {
            c3059ii.m12955x1("rotWithShape", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f33518ck;
        if (c7394ca != null) {
            switch (f33515fa.m27428k4(c7394ca.m29539k4())) {
                case 9:
                    ((C9395zr) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
                case 10:
                    ((C7670fk) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
                case 11:
                    ((C9052vm) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
                case 12:
                    ((C7939il) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
                case 13:
                    ((C8732s1) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
                case 14:
                    ((C8065k9) this.f33518ck.m29541kk()).mo6846k4("a", c3059ii, this.f33518ck.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45161k4(boolean z) {
        this.f33522jd = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ boolean m45145k4(C9314yu c9314yu, boolean z) {
        c9314yu.f33522jd = z;
        return z;
    }
}

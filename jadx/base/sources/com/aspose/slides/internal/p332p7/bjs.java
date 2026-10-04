package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public class bjs extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private float f20581c5;

    /* JADX INFO: renamed from: ck */
    private C9286yi f20582ck;

    /* JADX INFO: renamed from: du */
    private int f20583du;

    /* JADX INFO: renamed from: dy */
    private String f20584dy;

    /* JADX INFO: renamed from: fa */
    private C8163l7 f20585fa;

    /* JADX INFO: renamed from: jd */
    private ypz f20587jd;

    /* JADX INFO: renamed from: ks */
    private ysr f20589ks;

    /* JADX INFO: renamed from: rv */
    private C8952ug f20591rv;

    /* JADX INFO: renamed from: up */
    private jdz f20593up;

    /* JADX INFO: renamed from: x6 */
    private ltr f20594x6;

    /* JADX INFO: renamed from: yj */
    private C9391zp f20595yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f20578k4 = v3t.m42712k4(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);

    /* JADX INFO: renamed from: x1 */
    public static final C14084qq f20580x1 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f20579ne = new C7017h4("id", "authorId", "status", "created", "startDate", "assignedTo", "complete", "sldMkLst", "deMkLst", "txMkLst", "unknownAnchor", "pos", "replyLst", "txBody", "extLst");

    /* JADX INFO: renamed from: kk */
    private C14047bz f20588kk = new C14047bz();

    /* JADX INFO: renamed from: to */
    private C14047bz f20592to = new C14047bz();

    /* JADX INFO: renamed from: h4 */
    private C14084qq f20586h4 = new C14084qq();

    /* JADX INFO: renamed from: m9 */
    private C14084qq f20590m9 = new C14084qq();

    public bjs() {
        m28935x6();
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m28919k4(bjs bjsVar, float f) {
        bjsVar.f20581c5 = f;
        return f;
    }

    /* JADX INFO: renamed from: rv */
    public static /* synthetic */ C7017h4 m28932rv() {
        return f20579ne;
    }

    /* JADX INFO: renamed from: x6 */
    private void m28935x6() {
        C14047bz c14047bz = C14047bz.f47172k4;
        c14047bz.CloneTo(this.f20588kk);
        c14047bz.CloneTo(this.f20592to);
        this.f20583du = f20578k4;
        C14084qq.f47299x1.CloneTo(this.f20586h4);
        f20580x1.CloneTo(this.f20590m9);
        this.f20584dy = "";
        this.f20581c5 = 0.0f;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m28936c5() {
        return this.f20583du;
    }

    /* JADX INFO: renamed from: ck */
    public final C9286yi m28937ck() {
        return this.f20582ck;
    }

    /* JADX INFO: renamed from: du */
    public final ysr m28938du() {
        if (this.f20589ks != null) {
            throw new Exception("Only one <replyLst> element can be added.");
        }
        ysr ysrVar = new ysr();
        this.f20589ks = ysrVar;
        return ysrVar;
    }

    /* JADX INFO: renamed from: dy */
    public final C14047bz m28939dy() {
        return this.f20592to;
    }

    /* JADX INFO: renamed from: fa */
    public final C8163l7 m28940fa() {
        return this.f20585fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8952ug m28941h4() {
        if (this.f20591rv != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f20591rv = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: jd */
    public final C14084qq m28942jd() {
        return this.f20586h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8163l7 m28947kk() {
        if (this.f20585fa != null) {
            throw new Exception("Only one <txMkLst> element can be added.");
        }
        C8163l7 c8163l7 = new C8163l7();
        this.f20585fa = c8163l7;
        return c8163l7;
    }

    /* JADX INFO: renamed from: ks */
    public final C8952ug m28948ks() {
        return this.f20591rv;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14047bz m28949m9() {
        return this.f20588kk;
    }

    /* JADX INFO: renamed from: to */
    public final C9391zp m28950to() {
        if (this.f20595yj != null) {
            throw new Exception("Only one <pos> element can be added.");
        }
        C9391zp c9391zp = new C9391zp();
        this.f20595yj = c9391zp;
        return c9391zp;
    }

    /* JADX INFO: renamed from: up */
    public final C9391zp m28951up() {
        return this.f20595yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9286yi m28952x1() {
        if (this.f20582ck != null) {
            throw new Exception("Only one <deMkLst> element can be added.");
        }
        C9286yi c9286yi = new C9286yi();
        this.f20582ck = c9286yi;
        return c9286yi;
    }

    /* JADX INFO: renamed from: yj */
    public final ysr m28954yj() {
        return this.f20589ks;
    }

    public bjs(final AbstractC13912i5 abstractC13912i5) {
        m28935x6();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bjs.1
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
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bjs.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (bjs.f20579ne.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 7:
                        bjs.this.f20587jd = new ypz(abstractC13912i5);
                        return true;
                    case 8:
                        bjs.this.f20582ck = new C9286yi(abstractC13912i5);
                        return true;
                    case 9:
                        bjs.this.f20585fa = new C8163l7(abstractC13912i5);
                        return true;
                    case 10:
                        bjs.this.f20593up = new jdz(abstractC13912i5);
                        return true;
                    case 11:
                        bjs.this.f20595yj = new C9391zp(abstractC13912i5);
                        return true;
                    case 12:
                        bjs.this.f20589ks = new ysr(abstractC13912i5);
                        return true;
                    case 13:
                        bjs.this.f20591rv = new C8952ug(abstractC13912i5);
                        return true;
                    case 14:
                        bjs.this.f20594x6 = new ltr(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ int m28920k4(bjs bjsVar, int i) {
        bjsVar.f20583du = i;
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ C14047bz m28933x1(bjs bjsVar, C14047bz c14047bz) {
        bjsVar.f20592to = c14047bz;
        return c14047bz;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ C14084qq m28934x1(bjs bjsVar) {
        return bjsVar.f20590m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28953x1(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f20592to);
    }

    /* JADX INFO: renamed from: k4 */
    public final ypz m28943k4() {
        if (this.f20587jd != null) {
            throw new Exception("Only one <sldMkLst> element can be added.");
        }
        ypz ypzVar = new ypz();
        this.f20587jd = ypzVar;
        return ypzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ C14047bz m28929k4(bjs bjsVar, C14047bz c14047bz) {
        bjsVar.f20588kk = c14047bz;
        return c14047bz;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ C14084qq m28930k4(bjs bjsVar) {
        return bjsVar.f20586h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ String m28931k4(bjs bjsVar, String str) {
        bjsVar.f20584dy = str;
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28944k4(int i) {
        this.f20583du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28945k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f20588kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28946k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f20586h4);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f20588kk), "}"));
        c3059ii.m12955x1("authorId", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f20592to), "}"));
        int i = this.f20583du;
        if (i != f20578k4) {
            c3059ii.m12955x1("status", v3t.m42713k4(i));
        }
        C20986OooO0o0.OooO0O0(this.f20586h4, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "created");
        if (C14084qq.m67078dy(this.f20590m9, f20580x1)) {
            C20986OooO0o0.OooO0O0(this.f20590m9, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "startDate");
        }
        if (!"".equals(this.f20584dy)) {
            c3059ii.m12955x1("assignedTo", this.f20584dy);
        }
        float f = this.f20581c5;
        if (f != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("complete", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "complete");
            }
        }
        ypz ypzVar = this.f20587jd;
        if (ypzVar != null) {
            ypzVar.mo6846k4("p188", c3059ii, "sldMkLst");
        }
        C9286yi c9286yi = this.f20582ck;
        if (c9286yi != null) {
            c9286yi.mo6846k4("p188", c3059ii, "deMkLst");
        }
        C8163l7 c8163l7 = this.f20585fa;
        if (c8163l7 != null) {
            c8163l7.mo6846k4("p188", c3059ii, "txMkLst");
        }
        jdz jdzVar = this.f20593up;
        if (jdzVar != null) {
            jdzVar.mo6846k4("p188", c3059ii, "unknownAnchor");
        }
        C9391zp c9391zp = this.f20595yj;
        if (c9391zp != null) {
            c9391zp.mo6846k4("p188", c3059ii, "pos");
        }
        ysr ysrVar = this.f20589ks;
        if (ysrVar != null) {
            ysrVar.mo6846k4("p188", c3059ii, "replyLst");
        }
        C8952ug c8952ug = this.f20591rv;
        if (c8952ug != null) {
            c8952ug.mo6846k4("p188", c3059ii, "txBody");
        }
        ltr ltrVar = this.f20594x6;
        if (ltrVar != null) {
            ltrVar.mo6846k4("p188", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

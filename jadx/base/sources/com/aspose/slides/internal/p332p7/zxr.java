package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class zxr extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f34226jd = new C7017h4("sectionId", NoteMeta.PROPERTY_TITLE, "descr", "offsetFactorX", "offsetFactorY", "scaleFactorX", "scaleFactorY", "zmPr", "extLst");

    /* JADX INFO: renamed from: c5 */
    private ltr f34227c5;

    /* JADX INFO: renamed from: du */
    private float f34228du;

    /* JADX INFO: renamed from: dy */
    private ov2 f34229dy;

    /* JADX INFO: renamed from: h4 */
    private float f34230h4;

    /* JADX INFO: renamed from: k4 */
    private C14047bz f34231k4 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private String f34232kk;

    /* JADX INFO: renamed from: m9 */
    private float f34233m9;

    /* JADX INFO: renamed from: to */
    private float f34234to;

    /* JADX INFO: renamed from: x1 */
    private String f34235x1;

    public zxr() {
        m46021jd();
        this.f34229dy = new ov2();
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ C7017h4 m46020c5() {
        return f34226jd;
    }

    /* JADX INFO: renamed from: jd */
    private void m46021jd() {
        C14047bz.f47172k4.CloneTo(this.f34231k4);
        this.f34235x1 = "";
        this.f34232kk = "";
        this.f34234to = 0.0f;
        this.f34228du = 0.0f;
        this.f34230h4 = 100.0f;
        this.f34233m9 = 100.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m46022k4(zxr zxrVar, float f) {
        zxrVar.f34234to = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ float m46027kk(zxr zxrVar, float f) {
        zxrVar.f34230h4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m46029x1(zxr zxrVar, float f) {
        zxrVar.f34228du = f;
        return f;
    }

    /* JADX INFO: renamed from: du */
    public final float m46031du() {
        return this.f34228du;
    }

    /* JADX INFO: renamed from: dy */
    public final ov2 m46032dy() {
        return this.f34229dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m46033h4() {
        return this.f34230h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m46040m9() {
        return this.f34233m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m46041to() {
        return this.f34234to;
    }

    public zxr(final AbstractC13912i5 abstractC13912i5) {
        m46021jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zxr.1
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
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zxr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = zxr.f34226jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 7) {
                    zxr.this.f34229dy = new ov2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 8) {
                    return false;
                }
                zxr.this.f34227c5 = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: to */
    public static /* synthetic */ float m46028to(zxr zxrVar, float f) {
        zxrVar.f34233m9 = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public final String m46038kk() {
        return this.f34232kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m46043x1() {
        return this.f34235x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ String m46030x1(zxr zxrVar, String str) {
        zxrVar.f34232kk = str;
        return str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m46039kk(float f) {
        this.f34230h4 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m46042to(float f) {
        this.f34233m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m46034k4() {
        return this.f34231k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46044x1(float f) {
        this.f34228du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ C14047bz m46025k4(zxr zxrVar, C14047bz c14047bz) {
        zxrVar.f34231k4 = c14047bz;
        return c14047bz;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46045x1(String str) {
        this.f34232kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ String m46026k4(zxr zxrVar, String str) {
        zxrVar.f34235x1 = str;
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46035k4(float f) {
        this.f34234to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46036k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f34231k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46037k4(String str) {
        this.f34235x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("sectionId", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f34231k4), "}"));
        if (!"".equals(this.f34235x1)) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_TITLE, this.f34235x1);
        }
        if (!"".equals(this.f34232kk)) {
            c3059ii.m12955x1("descr", this.f34232kk);
        }
        float f = this.f34234to;
        if (f != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("offsetFactorX", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "offsetFactorX");
            }
        }
        float f2 = this.f34228du;
        if (f2 != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("offsetFactorY", C14113y2.m67408k4(C13850af.m65102k4(f2), "%"));
            } else {
                OooO00o.OooO00o(f2 * 1000.0f, 14, c3059ii, "offsetFactorY");
            }
        }
        float f3 = this.f34230h4;
        if (f3 != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("scaleFactorX", C14113y2.m67408k4(C13850af.m65102k4(f3), "%"));
            } else {
                OooO00o.OooO00o(f3 * 1000.0f, 14, c3059ii, "scaleFactorX");
            }
        }
        float f4 = this.f34233m9;
        if (f4 != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("scaleFactorY", C14113y2.m67408k4(C13850af.m65102k4(f4), "%"));
            } else {
                OooO00o.OooO00o(f4 * 1000.0f, 14, c3059ii, "scaleFactorY");
            }
        }
        this.f34229dy.mo6846k4("psuz", c3059ii, "zmPr");
        ltr ltrVar = this.f34227c5;
        if (ltrVar != null) {
            ltrVar.mo6846k4("psuz", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

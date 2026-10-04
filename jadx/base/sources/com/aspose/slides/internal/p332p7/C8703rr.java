package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rr */
/* JADX INFO: loaded from: classes4.dex */
public class C8703rr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29460kk = new C7017h4("fontScale", "lnSpcReduction");

    /* JADX INFO: renamed from: k4 */
    private float f29461k4;

    /* JADX INFO: renamed from: x1 */
    private float f29462x1;

    public C8703rr() {
        m40182to();
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ C7017h4 m40181kk() {
        return f29460kk;
    }

    /* JADX INFO: renamed from: to */
    private void m40182to() {
        this.f29461k4 = 100.0f;
        this.f29462x1 = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m40184k4() {
        return this.f29461k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m40186x1() {
        return this.f29462x1;
    }

    public C8703rr(AbstractC13912i5 abstractC13912i5) {
        m40182to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rr.1
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
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m40180k4(C8703rr c8703rr, float f) {
        c8703rr.f29461k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m40183x1(C8703rr c8703rr, float f) {
        c8703rr.f29462x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40185k4(float f) {
        this.f29461k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40187x1(float f) {
        this.f29462x1 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        float f = this.f29461k4;
        if (f != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("fontScale", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "fontScale");
            }
        }
        float f2 = this.f29462x1;
        if (f2 != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("lnSpcReduction", C14113y2.m67408k4(C13850af.m65102k4(f2), "%"));
            } else {
                OooO00o.OooO00o(f2 * 1000.0f, 14, c3059ii, "lnSpcReduction");
            }
        }
        c3059ii.mo21898jd();
    }
}

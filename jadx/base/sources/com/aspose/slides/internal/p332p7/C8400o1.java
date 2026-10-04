package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.o1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8400o1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27679kk = new C7017h4("tx", "ty");

    /* JADX INFO: renamed from: k4 */
    private float f27680k4;

    /* JADX INFO: renamed from: x1 */
    private float f27681x1;

    public C8400o1() {
        m37955x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m37952k4(C8400o1 c8400o1, float f) {
        c8400o1.f27680k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m37954x1(C8400o1 c8400o1, float f) {
        c8400o1.f27681x1 = f;
        return f;
    }

    public C8400o1(AbstractC13912i5 abstractC13912i5) {
        m37955x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o1.1
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
    public static /* synthetic */ C7017h4 m37953k4() {
        return f27679kk;
    }

    /* JADX INFO: renamed from: x1 */
    private void m37955x1() {
        this.f27680k4 = 0.0f;
        this.f27681x1 = 0.0f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        float f = this.f27680k4;
        if (f != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("tx", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "tx");
            }
        }
        float f2 = this.f27681x1;
        if (f2 != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("ty", C14113y2.m67408k4(C13850af.m65102k4(f2), "%"));
            } else {
                OooO00o.OooO00o(f2 * 1000.0f, 14, c3059ii, "ty");
            }
        }
        c3059ii.mo21898jd();
    }
}

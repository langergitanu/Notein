package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ex */
/* JADX INFO: loaded from: classes4.dex */
public class C7610ex extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22506kk = new C7017h4("bright", "contrast");

    /* JADX INFO: renamed from: k4 */
    private float f22507k4;

    /* JADX INFO: renamed from: x1 */
    private float f22508x1;

    public C7610ex() {
        m31405to();
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ C7017h4 m31404kk() {
        return f22506kk;
    }

    /* JADX INFO: renamed from: to */
    private void m31405to() {
        this.f22507k4 = 0.0f;
        this.f22508x1 = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m31407k4() {
        return this.f22507k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m31409x1() {
        return this.f22508x1;
    }

    public C7610ex(AbstractC13912i5 abstractC13912i5) {
        m31405to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ex.1
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
    public static /* synthetic */ float m31403k4(C7610ex c7610ex, float f) {
        c7610ex.f22507k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m31406x1(C7610ex c7610ex, float f) {
        c7610ex.f22508x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31408k4(float f) {
        this.f22507k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31410x1(float f) {
        this.f22508x1 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        float f = this.f22507k4;
        if (f != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("bright", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "bright");
            }
        }
        float f2 = this.f22508x1;
        if (f2 != 0.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("contrast", C14113y2.m67408k4(C13850af.m65102k4(f2), "%"));
            } else {
                OooO00o.OooO00o(f2 * 1000.0f, 14, c3059ii, "contrast");
            }
        }
        c3059ii.mo21898jd();
    }
}

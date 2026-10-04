package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class idr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24636kk = new C7017h4("sz", "autoAdjust");

    /* JADX INFO: renamed from: k4 */
    private float f24637k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f24638x1;

    public idr() {
        m34075to();
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ C7017h4 m34074kk() {
        return f24636kk;
    }

    /* JADX INFO: renamed from: to */
    private void m34075to() {
        this.f24637k4 = Float.NaN;
        this.f24638x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m34076k4() {
        return this.f24637k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m34079x1() {
        return this.f24638x1;
    }

    public idr(AbstractC13912i5 abstractC13912i5) {
        m34075to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.idr.1
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
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m34072k4(idr idrVar, float f) {
        idrVar.f24637k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34077k4(float f) {
        this.f24637k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.f9089k4) {
            c3059ii.m12955x1("sz", C14113y2.m67408k4(C13850af.m65102k4(this.f24637k4), "%"));
        } else {
            OooO00o.OooO00o(this.f24637k4 * 1000.0f, 14, c3059ii, "sz");
        }
        boolean z = this.f24638x1;
        if (!z) {
            c3059ii.m12955x1("autoAdjust", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34078k4(boolean z) {
        this.f24638x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ boolean m34073k4(idr idrVar, boolean z) {
        idrVar.f24638x1 = z;
        return z;
    }
}

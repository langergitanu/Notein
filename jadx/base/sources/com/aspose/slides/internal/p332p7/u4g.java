package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class u4g extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f31032h4 = new C7017h4("by", Constants.MessagePayloadKeys.FROM, "to", "p14:bounceEnd", "cBhvr");

    /* JADX INFO: renamed from: du */
    private no7 f31033du;

    /* JADX INFO: renamed from: k4 */
    private float f31034k4;

    /* JADX INFO: renamed from: kk */
    private float f31035kk;

    /* JADX INFO: renamed from: to */
    private float f31036to;

    /* JADX INFO: renamed from: x1 */
    private float f31037x1;

    public u4g() {
        m42091h4();
        this.f31033du = new no7();
    }

    /* JADX INFO: renamed from: du */
    public static /* synthetic */ C7017h4 m42090du() {
        return f31032h4;
    }

    /* JADX INFO: renamed from: h4 */
    private void m42091h4() {
        this.f31034k4 = Float.NaN;
        this.f31037x1 = Float.NaN;
        this.f31035kk = Float.NaN;
        this.f31036to = Float.NaN;
    }

    /* JADX INFO: renamed from: to */
    public static /* synthetic */ float m42095to(u4g u4gVar, float f) {
        u4gVar.f31036to = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m42097k4() {
        return this.f31034k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m42099kk() {
        return this.f31035kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m42102x1() {
        return this.f31037x1;
    }

    public u4g(final AbstractC13912i5 abstractC13912i5) {
        m42091h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u4g.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.u4g.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (u4g.f31032h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                u4g.this.f31033du = new no7(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m42092k4(u4g u4gVar, float f) {
        u4gVar.f31034k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ float m42094kk(u4g u4gVar, float f) {
        u4gVar.f31035kk = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m42096x1(u4g u4gVar, float f) {
        u4gVar.f31037x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: to */
    public final no7 m42101to() {
        return this.f31033du;
    }

    /* JADX INFO: renamed from: kk */
    public final void m42100kk(float f) {
        this.f31035kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42103x1(float f) {
        this.f31037x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42098k4(float f) {
        this.f31034k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14064he.m66715kk(this.f31034k4)) {
            OooO00o.OooO00o(this.f31034k4 * 60000.0f, 14, c3059ii, "by");
        }
        if (!C14064he.m66715kk(this.f31037x1)) {
            OooO00o.OooO00o(this.f31037x1 * 60000.0f, 14, c3059ii, Constants.MessagePayloadKeys.FROM);
        }
        if (!C14064he.m66715kk(this.f31035kk)) {
            OooO00o.OooO00o(this.f31035kk * 60000.0f, 14, c3059ii, "to");
        }
        if (!C14064he.m66715kk(this.f31036to)) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("p14:bounceEnd", C14113y2.m67408k4(C13850af.m65102k4(this.f31036to), "%"));
            } else {
                OooO00o.OooO00o(this.f31036to * 1000.0f, 14, c3059ii, "p14:bounceEnd");
            }
        }
        this.f31033du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        c3059ii.mo21898jd();
    }
}

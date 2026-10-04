package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
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
public class s0t extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29851m9 = new C7017h4("zoomContents", "p14:bounceEnd", "cBhvr", "by", Constants.MessagePayloadKeys.FROM, "to");

    /* JADX INFO: renamed from: du */
    private uc0 f29852du;

    /* JADX INFO: renamed from: h4 */
    private uc0 f29853h4;

    /* JADX INFO: renamed from: k4 */
    private byte f29854k4;

    /* JADX INFO: renamed from: kk */
    private no7 f29855kk;

    /* JADX INFO: renamed from: to */
    private uc0 f29856to;

    /* JADX INFO: renamed from: x1 */
    private float f29857x1;

    public s0t() {
        m40694jd();
        this.f29855kk = new no7();
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ C7017h4 m40693c5() {
        return f29851m9;
    }

    /* JADX INFO: renamed from: jd */
    private void m40694jd() {
        this.f29854k4 = (byte) -1;
        this.f29857x1 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ byte m40695k4(s0t s0tVar, byte b) {
        s0tVar.f29854k4 = b;
        return b;
    }

    /* JADX INFO: renamed from: du */
    public final no7 m40701du() {
        return this.f29855kk;
    }

    /* JADX INFO: renamed from: dy */
    public final uc0 m40702dy() {
        return this.f29853h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final uc0 m40703h4() {
        return this.f29856to;
    }

    /* JADX INFO: renamed from: kk */
    public final uc0 m40706kk() {
        if (this.f29853h4 != null) {
            throw new Exception("Only one <to> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f29853h4 = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: m9 */
    public final uc0 m40707m9() {
        return this.f29852du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m40708to() {
        return this.f29854k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final uc0 m40709x1() {
        if (this.f29852du != null) {
            throw new Exception("Only one <from> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f29852du = uc0Var;
        return uc0Var;
    }

    public s0t(final AbstractC13912i5 abstractC13912i5) {
        m40694jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s0t.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s0t.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = s0t.f29851m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    s0t.this.f29855kk = new no7(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    s0t.this.f29856to = new uc0(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    s0t.this.f29852du = new uc0(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                s0t.this.f29853h4 = new uc0(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m40696k4(s0t s0tVar, float f) {
        s0tVar.f29857x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final uc0 m40704k4() {
        if (this.f29856to != null) {
            throw new Exception("Only one <by> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f29856to = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40705k4(byte b) {
        this.f29854k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f29854k4;
        if (b != -1) {
            c3059ii.m12955x1("zoomContents", b == 1 ? "1" : "0");
        }
        if (!C14064he.m66715kk(this.f29857x1)) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("p14:bounceEnd", C14113y2.m67408k4(C13850af.m65102k4(this.f29857x1), "%"));
            } else {
                OooO00o.OooO00o(this.f29857x1 * 1000.0f, 14, c3059ii, "p14:bounceEnd");
            }
        }
        this.f29855kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        uc0 uc0Var = this.f29856to;
        if (uc0Var != null) {
            uc0Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "by");
        }
        uc0 uc0Var2 = this.f29852du;
        if (uc0Var2 != null) {
            uc0Var2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, Constants.MessagePayloadKeys.FROM);
        }
        uc0 uc0Var3 = this.f29853h4;
        if (uc0Var3 != null) {
            uc0Var3.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "to");
        }
        c3059ii.mo21898jd();
    }
}

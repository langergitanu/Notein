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
public class it6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f24917c5 = new C7017h4("by", Constants.MessagePayloadKeys.FROM, "to", "calcmode", "valueType", "p14:bounceEnd", "cBhvr", "tavLst");

    /* JADX INFO: renamed from: du */
    private byte f24918du;

    /* JADX INFO: renamed from: dy */
    private sx3 f24919dy;

    /* JADX INFO: renamed from: h4 */
    private float f24920h4;

    /* JADX INFO: renamed from: k4 */
    private String f24921k4;

    /* JADX INFO: renamed from: kk */
    private String f24922kk;

    /* JADX INFO: renamed from: m9 */
    private no7 f24923m9;

    /* JADX INFO: renamed from: to */
    private byte f24924to;

    /* JADX INFO: renamed from: x1 */
    private String f24925x1;

    public it6() {
        m34430jd();
        this.f24923m9 = new no7();
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ C7017h4 m34429c5() {
        return f24917c5;
    }

    /* JADX INFO: renamed from: jd */
    private void m34430jd() {
        this.f24924to = (byte) -1;
        this.f24918du = (byte) -1;
        this.f24920h4 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ byte m34431k4(it6 it6Var, byte b) {
        it6Var.f24924to = b;
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ byte m34437x1(it6 it6Var, byte b) {
        it6Var.f24918du = b;
        return b;
    }

    /* JADX INFO: renamed from: du */
    public final byte m34439du() {
        return this.f24924to;
    }

    /* JADX INFO: renamed from: dy */
    public final sx3 m34440dy() {
        return this.f24919dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m34441h4() {
        return this.f24918du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m34445kk() {
        return this.f24925x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final no7 m34447m9() {
        return this.f24923m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m34448to() {
        return this.f24922kk;
    }

    public it6(final AbstractC13912i5 abstractC13912i5) {
        m34430jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.it6.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.it6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = it6.f24917c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    it6.this.f24923m9 = new no7(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                it6.this.f24919dy = new sx3(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m34432k4(it6 it6Var, float f) {
        it6Var.f24920h4 = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ String m34436kk(it6 it6Var, String str) {
        it6Var.f24922kk = str;
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34449x1() {
        return this.f24921k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ String m34438x1(it6 it6Var, String str) {
        it6Var.f24925x1 = str;
        return str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m34446kk(String str) {
        this.f24922kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final sx3 m34442k4() {
        if (this.f24919dy != null) {
            throw new Exception("Only one <tavLst> element can be added.");
        }
        sx3 sx3Var = new sx3();
        this.f24919dy = sx3Var;
        return sx3Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34450x1(byte b) {
        this.f24918du = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34451x1(String str) {
        this.f24925x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ String m34435k4(it6 it6Var, String str) {
        it6Var.f24921k4 = str;
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34443k4(byte b) {
        this.f24924to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34444k4(String str) {
        this.f24921k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24921k4;
        if (str3 != null) {
            c3059ii.m12955x1("by", str3);
        }
        String str4 = this.f24925x1;
        if (str4 != null) {
            c3059ii.m12955x1(Constants.MessagePayloadKeys.FROM, str4);
        }
        String str5 = this.f24922kk;
        if (str5 != null) {
            c3059ii.m12955x1("to", str5);
        }
        byte b = this.f24924to;
        if (b != -1) {
            c3059ii.m12955x1("calcmode", C8306n3.m37213k4(b));
        }
        byte b2 = this.f24918du;
        if (b2 != -1) {
            c3059ii.m12955x1("valueType", C9359zd.m45578k4(b2));
        }
        if (!C14064he.m66715kk(this.f24920h4)) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("p14:bounceEnd", C14113y2.m67408k4(C13850af.m65102k4(this.f24920h4), "%"));
            } else {
                OooO00o.OooO00o(this.f24920h4 * 1000.0f, 14, c3059ii, "p14:bounceEnd");
            }
        }
        this.f24923m9.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        sx3 sx3Var = this.f24919dy;
        if (sx3Var != null) {
            sx3Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tavLst");
        }
        c3059ii.mo21898jd();
    }
}

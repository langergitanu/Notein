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
public class glt extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f23510fa = new C7017h4("origin", "path", "pathEditMode", "rAng", "ptsTypes", "p14:bounceEnd", "cBhvr", "by", Constants.MessagePayloadKeys.FROM, "to", "rCtr");

    /* JADX INFO: renamed from: c5 */
    private uc0 f23511c5;

    /* JADX INFO: renamed from: ck */
    private uc0 f23512ck;

    /* JADX INFO: renamed from: du */
    private String f23513du;

    /* JADX INFO: renamed from: dy */
    private uc0 f23514dy;

    /* JADX INFO: renamed from: h4 */
    private float f23515h4;

    /* JADX INFO: renamed from: jd */
    private uc0 f23516jd;

    /* JADX INFO: renamed from: k4 */
    private byte f23517k4;

    /* JADX INFO: renamed from: kk */
    private byte f23518kk;

    /* JADX INFO: renamed from: m9 */
    private no7 f23519m9;

    /* JADX INFO: renamed from: to */
    private float f23520to;

    /* JADX INFO: renamed from: x1 */
    private String f23521x1;

    public glt() {
        m32629rv();
        this.f23519m9 = new no7();
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ byte m32622k4(glt gltVar, byte b) {
        gltVar.f23517k4 = b;
        return b;
    }

    /* JADX INFO: renamed from: ks */
    public static /* synthetic */ C7017h4 m32628ks() {
        return f23510fa;
    }

    /* JADX INFO: renamed from: rv */
    private void m32629rv() {
        this.f23517k4 = (byte) -1;
        this.f23518kk = (byte) -1;
        this.f23520to = Float.NaN;
        this.f23515h4 = Float.NaN;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ byte m32631x1(glt gltVar, byte b) {
        gltVar.f23518kk = b;
        return b;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m32635c5() {
        return this.f23513du;
    }

    /* JADX INFO: renamed from: ck */
    public final uc0 m32636ck() {
        return this.f23514dy;
    }

    /* JADX INFO: renamed from: du */
    public final byte m32637du() {
        return this.f23517k4;
    }

    /* JADX INFO: renamed from: dy */
    public final float m32638dy() {
        return this.f23520to;
    }

    /* JADX INFO: renamed from: fa */
    public final uc0 m32639fa() {
        return this.f23511c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m32640h4() {
        return this.f23521x1;
    }

    /* JADX INFO: renamed from: jd */
    public final no7 m32641jd() {
        return this.f23519m9;
    }

    /* JADX INFO: renamed from: kk */
    public final uc0 m32646kk() {
        if (this.f23516jd != null) {
            throw new Exception("Only one <to> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f23516jd = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m32647m9() {
        return this.f23518kk;
    }

    /* JADX INFO: renamed from: to */
    public final uc0 m32648to() {
        if (this.f23512ck != null) {
            throw new Exception("Only one <rCtr> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f23512ck = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: up */
    public final uc0 m32649up() {
        return this.f23516jd;
    }

    /* JADX INFO: renamed from: yj */
    public final uc0 m32653yj() {
        return this.f23512ck;
    }

    public glt(final AbstractC13912i5 abstractC13912i5) {
        m32629rv();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.glt.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.glt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (glt.f23510fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        glt.this.f23519m9 = new no7(abstractC13912i5);
                        return true;
                    case 7:
                        glt.this.f23514dy = new uc0(abstractC13912i5);
                        return true;
                    case 8:
                        glt.this.f23511c5 = new uc0(abstractC13912i5);
                        return true;
                    case 9:
                        glt.this.f23516jd = new uc0(abstractC13912i5);
                        return true;
                    case 10:
                        glt.this.f23512ck = new uc0(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m32623k4(glt gltVar, float f) {
        gltVar.f23520to = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m32632x1(glt gltVar, float f) {
        gltVar.f23515h4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public final uc0 m32650x1() {
        if (this.f23511c5 != null) {
            throw new Exception("Only one <from> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f23511c5 = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final uc0 m32642k4() {
        if (this.f23514dy != null) {
            throw new Exception("Only one <by> element can be added.");
        }
        uc0 uc0Var = new uc0();
        this.f23514dy = uc0Var;
        return uc0Var;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ String m32634x1(glt gltVar, String str) {
        gltVar.f23513du = str;
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ String m32626k4(glt gltVar, String str) {
        gltVar.f23521x1 = str;
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32651x1(byte b) {
        this.f23518kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32643k4(byte b) {
        this.f23517k4 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32652x1(String str) {
        this.f23513du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32644k4(float f) {
        this.f23520to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32645k4(String str) {
        this.f23521x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f23517k4;
        if (b != -1) {
            c3059ii.m12955x1("origin", C9260y6.m44820k4(b));
        }
        String str3 = this.f23521x1;
        if (str3 != null) {
            c3059ii.m12955x1("path", str3);
        }
        byte b2 = this.f23518kk;
        if (b2 != -1) {
            c3059ii.m12955x1("pathEditMode", C8021jm.m34824k4(b2));
        }
        if (!C14064he.m66715kk(this.f23520to)) {
            OooO00o.OooO00o(this.f23520to * 60000.0f, 14, c3059ii, "rAng");
        }
        String str4 = this.f23513du;
        if (str4 != null) {
            c3059ii.m12955x1("ptsTypes", str4);
        }
        if (!C14064he.m66715kk(this.f23515h4)) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("p14:bounceEnd", C14113y2.m67408k4(C13850af.m65102k4(this.f23515h4), "%"));
            } else {
                OooO00o.OooO00o(this.f23515h4 * 1000.0f, 14, c3059ii, "p14:bounceEnd");
            }
        }
        this.f23519m9.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        uc0 uc0Var = this.f23514dy;
        if (uc0Var != null) {
            uc0Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "by");
        }
        uc0 uc0Var2 = this.f23511c5;
        if (uc0Var2 != null) {
            uc0Var2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, Constants.MessagePayloadKeys.FROM);
        }
        uc0 uc0Var3 = this.f23516jd;
        if (uc0Var3 != null) {
            uc0Var3.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "to");
        }
        uc0 uc0Var4 = this.f23512ck;
        if (uc0Var4 != null) {
            uc0Var4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "rCtr");
        }
        c3059ii.mo21898jd();
    }
}

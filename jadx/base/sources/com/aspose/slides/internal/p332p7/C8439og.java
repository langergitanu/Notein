package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.og */
/* JADX INFO: loaded from: classes4.dex */
public class C8439og extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27926kk = new C7017h4("pos", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private float f27927k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f27928x1;

    public C8439og() {
        m38245to();
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ C7017h4 m38244kk() {
        return f27926kk;
    }

    /* JADX INFO: renamed from: to */
    private void m38245to() {
        this.f27927k4 = Float.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m38246k4() {
        return this.f27927k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m38249x1() {
        return this.f27928x1;
    }

    public C8439og(final AbstractC13912i5 abstractC13912i5) {
        m38245to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.og.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.og.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8439og c8439og;
                C7394ca c7394ca;
                switch (C8439og.f27926kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 2:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 3:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 4:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 5:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 6:
                        c8439og = C8439og.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8439og.f27928x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m38242k4(C8439og c8439og, float f) {
        c8439og.f27927k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m38247k4(String str) {
        C7394ca c7394ca;
        if (this.f27928x1 != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f27926kk.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("scrgbClr", new C9395zr());
                break;
            case 2:
                c7394ca = new C7394ca("srgbClr", new C7670fk());
                break;
            case 3:
                c7394ca = new C7394ca("hslClr", new C9052vm());
                break;
            case 4:
                c7394ca = new C7394ca("sysClr", new C7939il());
                break;
            case 5:
                c7394ca = new C7394ca("schemeClr", new C8732s1());
                break;
            case 6:
                c7394ca = new C7394ca("prstClr", new C8065k9());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f27928x1 = c7394ca;
        return this.f27928x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38248k4(float f) {
        this.f27927k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.f9089k4) {
            c3059ii.m12955x1("pos", C14113y2.m67408k4(C13850af.m65102k4(this.f27927k4), "%"));
        } else {
            OooO00o.OooO00o(this.f27927k4 * 1000.0f, 14, c3059ii, "pos");
        }
        C7394ca c7394ca = this.f27928x1;
        if (c7394ca != null) {
            switch (f27926kk.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C9395zr) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
                case 2:
                    ((C7670fk) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
                case 3:
                    ((C9052vm) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
                case 4:
                    ((C7939il) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
                case 5:
                    ((C8732s1) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
                case 6:
                    ((C8065k9) this.f27928x1.m29541kk()).mo6846k4("a", c3059ii, this.f27928x1.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}

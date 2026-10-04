package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.j6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7978j6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25019du = new C7017h4("prst", "fov", "zoom", "rot");

    /* JADX INFO: renamed from: k4 */
    private int f25020k4;

    /* JADX INFO: renamed from: kk */
    private float f25021kk;

    /* JADX INFO: renamed from: to */
    private C8243m5 f25022to;

    /* JADX INFO: renamed from: x1 */
    private float f25023x1;

    public C7978j6() {
        m34571m9();
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ C7017h4 m34567h4() {
        return f25019du;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m34568k4(C7978j6 c7978j6, float f) {
        c7978j6.f25023x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: m9 */
    private void m34571m9() {
        this.f25020k4 = -1;
        this.f25023x1 = 45.0f;
        this.f25021kk = 100.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m34572x1(C7978j6 c7978j6, float f) {
        c7978j6.f25021kk = f;
        return f;
    }

    /* JADX INFO: renamed from: du */
    public final C8243m5 m34573du() {
        return this.f25022to;
    }

    /* JADX INFO: renamed from: kk */
    public final float m34577kk() {
        return this.f25023x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m34578to() {
        return this.f25021kk;
    }

    public C7978j6(final AbstractC13912i5 abstractC13912i5) {
        m34571m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.j6.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.j6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7978j6.f25019du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                C7978j6.this.f25022to = new C8243m5(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ int m34569k4(C7978j6 c7978j6, int i) {
        c7978j6.f25020k4 = i;
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m34579x1() {
        return this.f25020k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8243m5 m34574k4() {
        if (this.f25022to != null) {
            throw new Exception("Only one <rot> element can be added.");
        }
        C8243m5 c8243m5 = new C8243m5();
        this.f25022to = c8243m5;
        return c8243m5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34580x1(float f) {
        this.f25021kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34575k4(float f) {
        this.f25023x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34576k4(int i) {
        this.f25020k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("prst", C7349bu.m29145k4(this.f25020k4));
        if (this.f25023x1 != 45.0f) {
            OooO00o.OooO00o(r5 * 60000.0f, 14, c3059ii, "fov");
        }
        float f = this.f25021kk;
        if (f != 100.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("zoom", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "zoom");
            }
        }
        C8243m5 c8243m5 = this.f25022to;
        if (c8243m5 != null) {
            c8243m5.mo6846k4("a", c3059ii, "rot");
        }
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class v2z extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f31525m9 = new C7017h4("vol", "mute", "numSld", "showWhenStopped", "cTn", "tgtEl");

    /* JADX INFO: renamed from: du */
    private lmh f31526du;

    /* JADX INFO: renamed from: h4 */
    private ycb f31527h4;

    /* JADX INFO: renamed from: k4 */
    private float f31528k4;

    /* JADX INFO: renamed from: kk */
    private long f31529kk;

    /* JADX INFO: renamed from: to */
    private boolean f31530to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31531x1;

    public v2z() {
        m42692dy();
        this.f31526du = new lmh();
        this.f31527h4 = new ycb();
    }

    /* JADX INFO: renamed from: dy */
    private void m42692dy() {
        this.f31528k4 = 50.0f;
        this.f31531x1 = false;
        this.f31529kk = 1L;
        this.f31530to = true;
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ C7017h4 m42698m9() {
        return f31525m9;
    }

    /* JADX INFO: renamed from: du */
    public final lmh m42700du() {
        return this.f31526du;
    }

    /* JADX INFO: renamed from: h4 */
    public final ycb m42701h4() {
        return this.f31527h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m42702k4() {
        return this.f31528k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m42706kk() {
        return this.f31529kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m42707to() {
        return this.f31530to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42708x1(boolean z) {
        this.f31530to = z;
    }

    public v2z(final AbstractC13912i5 abstractC13912i5) {
        m42692dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.v2z.1
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v2z.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = v2z.f31525m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    v2z.this.f31526du = new lmh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                v2z.this.f31527h4 = new ycb(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m42693k4(v2z v2zVar, float f) {
        v2zVar.f31528k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m42709x1() {
        return this.f31531x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ long m42694k4(v2z v2zVar, long j) {
        v2zVar.f31529kk = j;
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ boolean m42699x1(v2z v2zVar, boolean z) {
        v2zVar.f31530to = z;
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42703k4(float f) {
        this.f31528k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42704k4(long j) {
        this.f31529kk = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        float f = this.f31528k4;
        if (f != 50.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("vol", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "vol");
            }
        }
        boolean z = this.f31531x1;
        if (z) {
            c3059ii.m12955x1("mute", z ? "1" : "0");
        }
        long j = this.f31529kk;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("numSld", C13850af.m65147x1(j));
        }
        boolean z2 = this.f31530to;
        if (!z2) {
            c3059ii.m12955x1("showWhenStopped", z2 ? "1" : "0");
        }
        this.f31526du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cTn");
        this.f31527h4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tgtEl");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42705k4(boolean z) {
        this.f31531x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ boolean m42697k4(v2z v2zVar, boolean z) {
        v2zVar.f31531x1 = z;
        return z;
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xh */
/* JADX INFO: loaded from: classes4.dex */
public class C9199xh extends AbstractC7361bz {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f32833ks = new C7017h4("blurRad", "stA", "stPos", "endA", "endPos", "dist", "dir", "fadeDir", "sx", "sy", "kx", "ky", "algn", "rotWithShape");

    /* JADX INFO: renamed from: c5 */
    private float f32834c5;

    /* JADX INFO: renamed from: ck */
    private float f32835ck;

    /* JADX INFO: renamed from: du */
    private float f32836du;

    /* JADX INFO: renamed from: dy */
    private float f32837dy;

    /* JADX INFO: renamed from: fa */
    private float f32838fa;

    /* JADX INFO: renamed from: h4 */
    private double f32839h4;

    /* JADX INFO: renamed from: jd */
    private float f32840jd;

    /* JADX INFO: renamed from: k4 */
    private double f32841k4;

    /* JADX INFO: renamed from: kk */
    private float f32842kk;

    /* JADX INFO: renamed from: m9 */
    private float f32843m9;

    /* JADX INFO: renamed from: to */
    private float f32844to;

    /* JADX INFO: renamed from: up */
    private byte f32845up;

    /* JADX INFO: renamed from: x1 */
    private float f32846x1;

    /* JADX INFO: renamed from: yj */
    private boolean f32847yj;

    public C9199xh() {
        this.f32841k4 = 0.0d;
        this.f32846x1 = 100.0f;
        this.f32842kk = 0.0f;
        this.f32844to = 0.0f;
        this.f32836du = 100.0f;
        this.f32839h4 = 0.0d;
        this.f32843m9 = 0.0f;
        this.f32837dy = 90.0f;
        this.f32834c5 = 100.0f;
        this.f32840jd = 100.0f;
        this.f32835ck = 0.0f;
        this.f32838fa = 0.0f;
        this.f32845up = (byte) -1;
        this.f32847yj = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m44372c5() {
        return this.f32834c5;
    }

    /* JADX INFO: renamed from: ck */
    public final float m44374ck() {
        return this.f32835ck;
    }

    /* JADX INFO: renamed from: du */
    public final float m44375du() {
        return this.f32836du;
    }

    /* JADX INFO: renamed from: dy */
    public final float m44377dy() {
        return this.f32837dy;
    }

    /* JADX INFO: renamed from: fa */
    public final float m44379fa() {
        return this.f32838fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m44380h4() {
        return this.f32839h4;
    }

    /* JADX INFO: renamed from: jd */
    public final float m44382jd() {
        return this.f32840jd;
    }

    /* JADX INFO: renamed from: kk */
    public final float m44389kk() {
        return this.f32842kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m44391m9() {
        return this.f32843m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m44393to() {
        return this.f32844to;
    }

    /* JADX INFO: renamed from: up */
    public final byte m44395up() {
        return this.f32845up;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m44399yj() {
        return this.f32847yj;
    }

    public C9199xh(AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29291k4(abstractC13912i5, new AbstractC7361bz.x1() { // from class: com.aspose.slides.internal.p7.xh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.x1
            /* JADX INFO: renamed from: k4 */
            public boolean mo29302k4(String str, String str2, boolean z) {
                switch (C9199xh.f32833ks.m27428k4(str)) {
                    case 0:
                        C9199xh.this.f32841k4 = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 1:
                        C9199xh.this.f32846x1 = C9199xh.m44371x1(str2);
                        break;
                    case 2:
                        C9199xh.this.f32842kk = C9199xh.m44371x1(str2);
                        break;
                    case 3:
                        C9199xh.this.f32844to = C9199xh.m44371x1(str2);
                        break;
                    case 4:
                        C9199xh.this.f32836du = C9199xh.m44371x1(str2);
                        break;
                    case 5:
                        C9199xh.this.f32839h4 = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 6:
                        C9199xh.this.f32843m9 = C13850af.m65151yj(str2) / 60000.0f;
                        break;
                    case 7:
                        C9199xh.this.f32837dy = C13850af.m65151yj(str2) / 60000.0f;
                        break;
                    case 8:
                        C9199xh.this.f32834c5 = C9199xh.m44371x1(str2);
                        break;
                    case 9:
                        C9199xh.this.f32840jd = C9199xh.m44371x1(str2);
                        break;
                    case 10:
                        C9199xh.this.f32835ck = C13850af.m65151yj(str2) / 60000.0f;
                        break;
                    case 11:
                        C9199xh.this.f32838fa = C13850af.m65151yj(str2) / 60000.0f;
                        break;
                    case 12:
                        if (!z) {
                            C9199xh.this.f32845up = C8579q6.m39355k4(str2);
                        }
                        break;
                    case 13:
                        C9199xh.this.f32847yj = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m44384k4() {
        return this.f32841k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m44396x1() {
        return this.f32846x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m44373c5(float f) {
        this.f32835ck = f;
    }

    /* JADX INFO: renamed from: du */
    public final void m44376du(float f) {
        this.f32843m9 = f;
    }

    /* JADX INFO: renamed from: dy */
    public final void m44378dy(float f) {
        this.f32840jd = f;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m44381h4(float f) {
        this.f32837dy = f;
    }

    /* JADX INFO: renamed from: jd */
    public final void m44383jd(float f) {
        this.f32838fa = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m44390kk(float f) {
        this.f32844to = f;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m44392m9(float f) {
        this.f32834c5 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m44394to(float f) {
        this.f32836du = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: x1 */
    public static float m44371x1(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
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

    /* JADX INFO: renamed from: k4 */
    public final void m44385k4(byte b) {
        this.f32845up = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44386k4(double d) {
        this.f32841k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44387k4(float f) {
        this.f32846x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m44363k4(C3059ii c3059ii, String str, float f, float f2) {
        if (f != f2) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1(str, C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, str);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44397x1(double d) {
        this.f32839h4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44398x1(float f) {
        this.f32842kk = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f32841k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("blurRad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        m44363k4(c3059ii, "stA", this.f32846x1, 100.0f);
        m44363k4(c3059ii, "stPos", this.f32842kk, 0.0f);
        m44363k4(c3059ii, "endA", this.f32844to, 0.0f);
        m44363k4(c3059ii, "endPos", this.f32836du, 100.0f);
        double d2 = this.f32839h4;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("dist", C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        if (this.f32843m9 != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "dir");
        }
        if (this.f32837dy != 90.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "fadeDir");
        }
        m44363k4(c3059ii, "sx", this.f32834c5, 100.0f);
        m44363k4(c3059ii, "sy", this.f32840jd, 100.0f);
        if (this.f32835ck != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "kx");
        }
        if (this.f32838fa != 0.0f) {
            OooO00o.OooO00o(r10 * 60000.0f, 14, c3059ii, "ky");
        }
        byte b = this.f32845up;
        if (b != 7 && b != -1) {
            c3059ii.m12955x1("algn", C8579q6.m39356k4(b));
        }
        boolean z = this.f32847yj;
        if (!z) {
            c3059ii.m12955x1("rotWithShape", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44388k4(boolean z) {
        this.f32847yj = z;
    }
}

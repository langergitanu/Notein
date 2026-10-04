package com.aspose.slides.internal.p332p7;

import com.aspose.slides.C22210OooOo0o;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bz */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f20802k4 = new C7017h4("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "urn:schemas-microsoft-com:vml", "urn:schemas-microsoft-com:office:office", "http://schemas.microsoft.com/office/powerpoint/2010/main", "http://schemas.openxmlformats.org/officeDocument/2006/math", "Infinity", "INF", "-Infinity", "-INF", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);

    /* JADX INFO: renamed from: com.aspose.slides.internal.p7.bz$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo27882k4(String str, String str2);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.p7.bz$kk */
    public static abstract class kk extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo27887k4(AbstractC13912i5 abstractC13912i5);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.p7.bz$x1 */
    public static abstract class x1 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo29302k4(String str, String str2, boolean z);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m29286k4(String str, float f) {
        return C14113y2.m67411k4(str) ? f : C14113y2.m67424kk(str, "s") ? m29297x1(C14113y2.m67443x1(str, 0, str.length() - 1), f) : m29297x1(str, f) * 1000.0f;
    }

    /* JADX INFO: renamed from: kk */
    public static String m29293kk(AbstractC13912i5 abstractC13912i5) {
        if ("".equals(abstractC13912i5.mo65050up())) {
            return abstractC13912i5.mo65019ck();
        }
        int iM27428k4 = f20802k4.m27428k4(abstractC13912i5.mo65050up());
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? abstractC13912i5.mo65019ck() : C14113y2.m67408k4("m:", abstractC13912i5.mo65023fa()) : C14113y2.m67408k4("p14:", abstractC13912i5.mo65023fa()) : C14113y2.m67408k4("o:", abstractC13912i5.mo65023fa()) : C14113y2.m67408k4("v:", abstractC13912i5.mo65023fa()) : C14113y2.m67408k4("r:", abstractC13912i5.mo65023fa());
    }

    /* JADX INFO: renamed from: ks */
    public static C14077m4 m29294ks(String str) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("[0-9]+(?=S)", str);
        String strMo57995kk = c12385toOooO00o.mo58006to() ? c12385toOooO00o.mo57995kk() : "0";
        C12385to c12385toOooO00o2 = C22210OooOo0o.OooO00o("[0-9]+(?=M)", str);
        String strMo57995kk2 = c12385toOooO00o2.mo58006to() ? c12385toOooO00o2.mo57995kk() : "0";
        C12385to c12385toOooO00o3 = C22210OooOo0o.OooO00o("[0-9]+(?=H)", str);
        C14077m4 c14077m4M66815fa = C14077m4.m66805kk(C14077m4.m66805kk(C14077m4.m66808x1(C14044b3.m66426k4(c12385toOooO00o3.mo58006to() ? c12385toOooO00o3.mo57995kk() : "0")), C14077m4.m66804kk(C14044b3.m66426k4(strMo57995kk2))), C14077m4.m66806to(C14044b3.m66426k4(strMo57995kk))).Clone();
        if (c14077m4M66815fa.m66822m9() == 0.0d) {
            float fM29286k4 = m29286k4(str, 0.0f);
            if (fM29286k4 > 0.0f) {
                C14077m4.m66806to(fM29286k4).CloneTo(c14077m4M66815fa);
            }
        }
        return c14077m4M66815fa;
    }

    /* JADX INFO: renamed from: ne */
    public static long m29295ne(String str) {
        return m29287k4(str) & 4294967295L;
    }

    /* JADX INFO: renamed from: rv */
    public static byte m29296rv(String str) {
        try {
            return C13850af.m65068c5(str) ? (byte) 1 : (byte) 0;
        } catch (FormatException unused) {
            return (byte) -1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static float m29297x1(String str, float f) {
        float[] fArr = {0.0f};
        return !C14064he.m66713k4(str, 111, C11697x1.m55250kk(), fArr) ? f : fArr[0];
    }

    /* JADX INFO: renamed from: x6 */
    public static long m29299x6(String str) {
        int length = (6 - str.length()) / 2;
        long jM67457k4 = C14114y9.m67457k4(str, 515);
        return length > 0 ? ((jM67457k4 & 4294967295L) << ((length * 8) & 31)) & 4294967295L : jM67457k4;
    }

    /* JADX INFO: renamed from: yj */
    public static double m29300yj(String str) {
        double[] dArr = {0.0d};
        boolean zM29292k4 = m29292k4(str, dArr);
        double d = dArr[0];
        if (zM29292k4) {
            return d;
        }
        dArr[0] = d;
        boolean zM66435k4 = C14044b3.m66435k4(str, 167, C11683c5.m55033ck(), dArr);
        double d2 = dArr[0];
        if (zM66435k4) {
            if (d2 == 0.0d && str.charAt(0) == '-') {
                return -0.0d;
            }
            return d2;
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        dArr[0] = d2;
        boolean zM29292k42 = m29292k4(strM67440x1, dArr);
        double d3 = dArr[0];
        if (zM29292k42) {
            return d3;
        }
        throw new FormatException(C14113y2.m67408k4("Couldn't parse string '", str, "' as a Double"));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6846k4(String str, C3059ii c3059ii, String str2);

    /* JADX INFO: renamed from: k4 */
    private static long m29287k4(String str) {
        return (long) C14044b3.m66427k4(str, 239, C11683c5.m55033ck());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m29298x1(AbstractC13912i5 abstractC13912i5) {
        m29290k4(abstractC13912i5, new kk() { // from class: com.aspose.slides.internal.p7.bz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static String m29288k4(C14077m4 c14077m4) {
        return C14113y2.m67402k4("PT{0}H{1}M{2}S", Integer.valueOf(c14077m4.m66825x1()), Integer.valueOf(c14077m4.m66820kk()), Integer.valueOf(c14077m4.m66823to()));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m29289k4(AbstractC13912i5 abstractC13912i5, k4 k4Var) {
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && !k4Var.mo27882k4(abstractC13912i5.mo65019ck(), abstractC13912i5.mo65042rv())) {
                k4Var.mo27882k4(m29293kk(abstractC13912i5), abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m29290k4(AbstractC13912i5 abstractC13912i5, kk kkVar) {
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (true) {
            boolean z = false;
            while (true) {
                if ((!z || abstractC13912i5.mo65015ar()) && !abstractC13912i5.mo65026h4()) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    boolean zMo27887k4 = kkVar.mo27887k4(abstractC13912i5);
                    boolean z2 = !zMo27887k4;
                    if (!zMo27887k4) {
                        abstractC13912i5.mo65208bv();
                    }
                    z = z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m29291k4(AbstractC13912i5 abstractC13912i5, x1 x1Var) {
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && !x1Var.mo29302k4(abstractC13912i5.mo65019ck(), abstractC13912i5.mo65042rv(), abstractC13912i5.mo65057x1())) {
                x1Var.mo29302k4(m29293kk(abstractC13912i5), abstractC13912i5.mo65042rv(), abstractC13912i5.mo65057x1());
            }
        }
        abstractC13912i5.mo65020du();
    }

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
    /* JADX INFO: renamed from: k4 */
    public final void m29301k4(
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
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
    private static boolean m29292k4(String str, double[] dArr) {
        switch (f20802k4.m27428k4(str)) {
            case 5:
            case 6:
                dArr[0] = Double.POSITIVE_INFINITY;
                return true;
            case 7:
            case 8:
                dArr[0] = Double.NEGATIVE_INFINITY;
                return true;
            case 9:
                dArr[0] = -0.0d;
                return true;
            default:
                dArr[0] = 0.0d;
                return false;
        }
    }
}

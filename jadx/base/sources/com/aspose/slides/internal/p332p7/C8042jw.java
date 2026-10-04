package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jw */
/* JADX INFO: loaded from: classes4.dex */
public class C8042jw extends AbstractC7361bz {

    /* JADX INFO: renamed from: lr */
    private static final C7017h4 f25367lr = new C7017h4("serverZoom", "firstSlideNum", "showSpecialPlsOnTitleSld", "rtl", "removePersonalInfoOnSave", "compatMode", "strictFirstAndLastChars", "embedTrueTypeFonts", "saveSubsetFonts", "autoCompressPictures", "bookmarkIdSeed", "conformance", "sldMasterIdLst", "notesMasterIdLst", "handoutMasterIdLst", "sldIdLst", "sldSz", "notesSz", "smartTags", "embeddedFontLst", "custShowLst", "photoAlbum", "custDataLst", "kinsoku", "defaultTextStyle", "modifyVerifier", "extLst");

    /* JADX INFO: renamed from: ar */
    private wdt f25368ar;

    /* JADX INFO: renamed from: bv */
    private i0y f25369bv;

    /* JADX INFO: renamed from: c5 */
    private boolean f25370c5;

    /* JADX INFO: renamed from: ck */
    private long f25371ck;

    /* JADX INFO: renamed from: du */
    private boolean f25372du;

    /* JADX INFO: renamed from: dy */
    private boolean f25373dy;

    /* JADX INFO: renamed from: fa */
    private String f25374fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f25375h4;

    /* JADX INFO: renamed from: ix */
    private pti f25376ix;

    /* JADX INFO: renamed from: jd */
    private boolean f25377jd;

    /* JADX INFO: renamed from: k4 */
    private float f25378k4;

    /* JADX INFO: renamed from: kk */
    private boolean f25379kk;

    /* JADX INFO: renamed from: ks */
    private kvo f25380ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f25381m9;

    /* JADX INFO: renamed from: ne */
    private C7258al f25382ne;

    /* JADX INFO: renamed from: qq */
    private fbr f25383qq;

    /* JADX INFO: renamed from: rv */
    private bkf f25384rv;

    /* JADX INFO: renamed from: to */
    private boolean f25385to;

    /* JADX INFO: renamed from: u4 */
    private v4m f25386u4;

    /* JADX INFO: renamed from: um */
    private C8345ni f25387um;

    /* JADX INFO: renamed from: up */
    private mok f25388up;

    /* JADX INFO: renamed from: uz */
    private jrf f25389uz;

    /* JADX INFO: renamed from: v4 */
    private ltr f25390v4;

    /* JADX INFO: renamed from: wl */
    private bzy f25391wl;

    /* JADX INFO: renamed from: x1 */
    private int f25392x1;

    /* JADX INFO: renamed from: x6 */
    private kaf f25393x6;

    /* JADX INFO: renamed from: yj */
    private lp6 f25394yj;

    public C8042jw() {
        m34988ts();
        this.f25382ne = new C7258al();
    }

    /* JADX INFO: renamed from: c6 */
    public static /* synthetic */ C7017h4 m34976c6() {
        return f25367lr;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m34980k4(C8042jw c8042jw, float f) {
        c8042jw.f25378k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: ts */
    private void m34988ts() {
        this.f25378k4 = 50.0f;
        this.f25392x1 = 1;
        this.f25379kk = true;
        this.f25385to = false;
        this.f25372du = false;
        this.f25375h4 = false;
        this.f25381m9 = true;
        this.f25373dy = false;
        this.f25370c5 = false;
        this.f25377jd = true;
        this.f25371ck = 1L;
    }

    /* JADX INFO: renamed from: ak */
    public final C8345ni m34990ak() {
        return this.f25387um;
    }

    /* JADX INFO: renamed from: ar */
    public final kaf m34991ar() {
        return this.f25393x6;
    }

    /* JADX INFO: renamed from: b3 */
    public final fbr m34992b3() {
        return this.f25383qq;
    }

    /* JADX INFO: renamed from: bv */
    public final pti m34993bv() {
        return this.f25376ix;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8345ni m34994c5() {
        if (this.f25387um != null) {
            throw new Exception("Only one <defaultTextStyle> element can be added.");
        }
        C8345ni c8345ni = new C8345ni();
        this.f25387um = c8345ni;
        return c8345ni;
    }

    /* JADX INFO: renamed from: ck */
    public final int m34995ck() {
        return this.f25392x1;
    }

    /* JADX INFO: renamed from: dq */
    public final i0y m34996dq() {
        return this.f25369bv;
    }

    /* JADX INFO: renamed from: du */
    public final kaf m34997du() {
        if (this.f25393x6 != null) {
            throw new Exception("Only one <sldSz> element can be added.");
        }
        kaf kafVar = new kaf();
        this.f25393x6 = kafVar;
        return kafVar;
    }

    /* JADX INFO: renamed from: dy */
    public final fbr m34999dy() {
        if (this.f25383qq != null) {
            throw new Exception("Only one <custDataLst> element can be added.");
        }
        fbr fbrVar = new fbr();
        this.f25383qq = fbrVar;
        return fbrVar;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m35001fa() {
        return this.f25379kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final v4m m35002h4() {
        if (this.f25386u4 != null) {
            throw new Exception("Only one <embeddedFontLst> element can be added.");
        }
        v4m v4mVar = new v4m();
        this.f25386u4 = v4mVar;
        return v4mVar;
    }

    /* JADX INFO: renamed from: ix */
    public final long m35004ix() {
        return this.f25371ck;
    }

    /* JADX INFO: renamed from: jd */
    public final float m35005jd() {
        return this.f25378k4;
    }

    /* JADX INFO: renamed from: kk */
    public final kvo m35015kk() {
        if (this.f25380ks != null) {
            throw new Exception("Only one <handoutMasterIdLst> element can be added.");
        }
        kvo kvoVar = new kvo();
        this.f25380ks = kvoVar;
        return kvoVar;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m35018ks() {
        return this.f25375h4;
    }

    /* JADX INFO: renamed from: lr */
    public final jrf m35019lr() {
        return this.f25389uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final jrf m35020m9() {
        if (this.f25389uz != null) {
            throw new Exception("Only one <custShowLst> element can be added.");
        }
        jrf jrfVar = new jrf();
        this.f25389uz = jrfVar;
        return jrfVar;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m35022ne() {
        return this.f25377jd;
    }

    /* JADX INFO: renamed from: qq */
    public final bkf m35023qq() {
        return this.f25384rv;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m35024rv() {
        return this.f25381m9;
    }

    /* JADX INFO: renamed from: to */
    public final bkf m35025to() {
        if (this.f25384rv != null) {
            throw new Exception("Only one <sldIdLst> element can be added.");
        }
        bkf bkfVar = new bkf();
        this.f25384rv = bkfVar;
        return bkfVar;
    }

    /* JADX INFO: renamed from: u4 */
    public final mok m35027u4() {
        return this.f25388up;
    }

    /* JADX INFO: renamed from: um */
    public final C7258al m35028um() {
        return this.f25382ne;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m35029up() {
        return this.f25385to;
    }

    /* JADX INFO: renamed from: uz */
    public final lp6 m35030uz() {
        return this.f25394yj;
    }

    /* JADX INFO: renamed from: v4 */
    public final v4m m35031v4() {
        return this.f25386u4;
    }

    /* JADX INFO: renamed from: wl */
    public final kvo m35032wl() {
        return this.f25380ks;
    }

    /* JADX INFO: renamed from: wy */
    public final wdt m35033wy() {
        return this.f25368ar;
    }

    /* JADX INFO: renamed from: x1 */
    public final lp6 m35034x1() {
        if (this.f25394yj != null) {
            throw new Exception("Only one <notesMasterIdLst> element can be added.");
        }
        lp6 lp6Var = new lp6();
        this.f25394yj = lp6Var;
        return lp6Var;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m35037x6() {
        return this.f25370c5;
    }

    /* JADX INFO: renamed from: xk */
    public final AbstractC7414ck m35038xk() {
        return this.f25390v4;
    }

    /* JADX INFO: renamed from: yd */
    public final bzy m35039yd() {
        return this.f25391wl;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m35040yj() {
        return this.f25372du;
    }

    public C8042jw(AbstractC13912i5 abstractC13912i5) {
        m34988ts();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jw.1
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
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f25367lr.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 12:
                            this.f25388up = new mok(abstractC13912i5);
                            continue;
                        case 13:
                            this.f25394yj = new lp6(abstractC13912i5);
                            continue;
                        case 14:
                            this.f25380ks = new kvo(abstractC13912i5);
                            continue;
                        case 15:
                            this.f25384rv = new bkf(abstractC13912i5);
                            continue;
                        case 16:
                            this.f25393x6 = new kaf(abstractC13912i5);
                            continue;
                        case 17:
                            this.f25382ne = new C7258al(abstractC13912i5);
                            continue;
                        case 18:
                            this.f25376ix = new pti(abstractC13912i5);
                            break;
                        case 19:
                            this.f25386u4 = new v4m(abstractC13912i5);
                            continue;
                        case 20:
                            this.f25389uz = new jrf(abstractC13912i5);
                            continue;
                        case 21:
                            this.f25391wl = new bzy(abstractC13912i5);
                            break;
                        case 22:
                            this.f25383qq = new fbr(abstractC13912i5);
                            continue;
                        case 23:
                            this.f25368ar = new wdt(abstractC13912i5);
                            break;
                        case 24:
                            this.f25387um = new C8345ni(abstractC13912i5);
                            continue;
                        case 25:
                            this.f25369bv = new i0y(abstractC13912i5);
                            continue;
                        case 26:
                            this.f25390v4 = new ltr(abstractC13912i5);
                            continue;
                        default:
                            abstractC13912i5.mo65208bv();
                            break;
                    }
                    if (abstractC13912i5.mo65015ar()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ int m34981k4(C8042jw c8042jw, int i) {
        c8042jw.f25392x1 = i;
        return i;
    }

    /* JADX INFO: renamed from: du */
    public final void m34998du(boolean z) {
        this.f25381m9 = z;
    }

    /* JADX INFO: renamed from: dy */
    public final void m35000dy(boolean z) {
        this.f25377jd = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m35003h4(boolean z) {
        this.f25373dy = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35016kk(C7259am c7259am) {
        this.f25368ar = (wdt) c7259am;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m35021m9(boolean z) {
        this.f25370c5 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m35026to(boolean z) {
        this.f25375h4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35035x1(C7259am c7259am) {
        this.f25391wl = (bzy) c7259am;
    }

    /* JADX INFO: renamed from: du */
    public static /* synthetic */ boolean m34977du(C8042jw c8042jw, boolean z) {
        c8042jw.f25381m9 = z;
        return z;
    }

    /* JADX INFO: renamed from: dy */
    public static /* synthetic */ boolean m34978dy(C8042jw c8042jw, boolean z) {
        c8042jw.f25377jd = z;
        return z;
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ boolean m34979h4(C8042jw c8042jw, boolean z) {
        c8042jw.f25373dy = z;
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ long m34982k4(C8042jw c8042jw, long j) {
        c8042jw.f25371ck = j;
        return j;
    }

    /* JADX INFO: renamed from: m9 */
    public static /* synthetic */ boolean m34986m9(C8042jw c8042jw, boolean z) {
        c8042jw.f25370c5 = z;
        return z;
    }

    /* JADX INFO: renamed from: to */
    public static /* synthetic */ boolean m34987to(C8042jw c8042jw, boolean z) {
        c8042jw.f25375h4 = z;
        return z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35017kk(boolean z) {
        this.f25372du = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35036x1(boolean z) {
        this.f25385to = z;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ boolean m34985kk(C8042jw c8042jw, boolean z) {
        c8042jw.f25372du = z;
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ boolean m34989x1(C8042jw c8042jw, boolean z) {
        c8042jw.f25385to = z;
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final mok m35006k4() {
        if (this.f25388up != null) {
            throw new Exception("Only one <sldMasterIdLst> element can be added.");
        }
        mok mokVar = new mok();
        this.f25388up = mokVar;
        return mokVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ String m34983k4(C8042jw c8042jw, String str) {
        c8042jw.f25374fa = str;
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35007k4(float f) {
        this.f25378k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35008k4(int i) {
        this.f25392x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35009k4(long j) {
        this.f25371ck = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35010k4(C7259am c7259am) {
        this.f25376ix = (pti) c7259am;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35011k4(AbstractC7414ck abstractC7414ck) {
        this.f25390v4 = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35012k4(i0y i0yVar) {
        this.f25369bv = i0yVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35013k4(String str) {
        this.f25374fa = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        float f = this.f25378k4;
        if (f != 50.0f) {
            if (c3059ii.f9089k4) {
                c3059ii.m12955x1("serverZoom", C14113y2.m67408k4(C13850af.m65102k4(f), "%"));
            } else {
                OooO00o.OooO00o(f * 1000.0f, 14, c3059ii, "serverZoom");
            }
        }
        int i = this.f25392x1;
        if (i != 1) {
            c3059ii.m12955x1("firstSlideNum", C13850af.m65103k4(i));
        }
        boolean z = this.f25379kk;
        if (!z) {
            c3059ii.m12955x1("showSpecialPlsOnTitleSld", z ? "1" : "0");
        }
        boolean z2 = this.f25385to;
        if (z2) {
            c3059ii.m12955x1("rtl", z2 ? "1" : "0");
        }
        boolean z3 = this.f25372du;
        if (z3) {
            c3059ii.m12955x1("removePersonalInfoOnSave", z3 ? "1" : "0");
        }
        boolean z4 = this.f25375h4;
        if (z4) {
            c3059ii.m12955x1("compatMode", z4 ? "1" : "0");
        }
        boolean z5 = this.f25381m9;
        if (!z5) {
            c3059ii.m12955x1("strictFirstAndLastChars", z5 ? "1" : "0");
        }
        boolean z6 = this.f25373dy;
        if (z6) {
            c3059ii.m12955x1("embedTrueTypeFonts", z6 ? "1" : "0");
        }
        boolean z7 = this.f25370c5;
        if (z7) {
            c3059ii.m12955x1("saveSubsetFonts", z7 ? "1" : "0");
        }
        boolean z8 = this.f25377jd;
        if (!z8) {
            c3059ii.m12955x1("autoCompressPictures", z8 ? "1" : "0");
        }
        long j = this.f25371ck;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("bookmarkIdSeed", C13850af.m65147x1(j));
        }
        String str3 = this.f25374fa;
        if (str3 != null) {
            c3059ii.m12955x1("conformance", str3);
        }
        mok mokVar = this.f25388up;
        if (mokVar != null) {
            mokVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldMasterIdLst");
        }
        lp6 lp6Var = this.f25394yj;
        if (lp6Var != null) {
            lp6Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "notesMasterIdLst");
        }
        kvo kvoVar = this.f25380ks;
        if (kvoVar != null) {
            kvoVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "handoutMasterIdLst");
        }
        bkf bkfVar = this.f25384rv;
        if (bkfVar != null) {
            bkfVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldIdLst");
        }
        kaf kafVar = this.f25393x6;
        if (kafVar != null) {
            kafVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldSz");
        }
        this.f25382ne.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "notesSz");
        pti ptiVar = this.f25376ix;
        if (ptiVar != null) {
            ptiVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "smartTags");
        }
        v4m v4mVar = this.f25386u4;
        if (v4mVar != null) {
            v4mVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "embeddedFontLst");
        }
        jrf jrfVar = this.f25389uz;
        if (jrfVar != null) {
            jrfVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custShowLst");
        }
        bzy bzyVar = this.f25391wl;
        if (bzyVar != null) {
            bzyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "photoAlbum");
        }
        fbr fbrVar = this.f25383qq;
        if (fbrVar != null) {
            fbrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custDataLst");
        }
        wdt wdtVar = this.f25368ar;
        if (wdtVar != null) {
            wdtVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "kinsoku");
        }
        C8345ni c8345ni = this.f25387um;
        if (c8345ni != null) {
            c8345ni.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "defaultTextStyle");
        }
        i0y i0yVar = this.f25369bv;
        if (i0yVar != null) {
            i0yVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "modifyVerifier");
        }
        ltr ltrVar = this.f25390v4;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35014k4(boolean z) {
        this.f25379kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ boolean m34984k4(C8042jw c8042jw, boolean z) {
        c8042jw.f25379kk = z;
        return z;
    }
}

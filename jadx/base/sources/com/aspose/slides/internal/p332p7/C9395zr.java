package com.aspose.slides.internal.p332p7;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zr */
/* JADX INFO: loaded from: classes4.dex */
public class C9395zr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f34115du = new C7017h4("r", "g", "b", "tint", "shade", "comp", "inv", "gray", "alpha", "alphaOff", "alphaMod", "hue", "hueOff", "hueMod", LocalePreferences.FirstDayOfWeek.SATURDAY, "satOff", "satMod", "lum", "lumOff", "lumMod", "red", "redOff", "redMod", "green", "greenOff", "greenMod", "blue", "blueOff", "blueMod", "gamma", "invGamma");

    /* JADX INFO: renamed from: k4 */
    private float f34116k4;

    /* JADX INFO: renamed from: kk */
    private float f34117kk;

    /* JADX INFO: renamed from: to */
    private List<C7394ca> f34118to;

    /* JADX INFO: renamed from: x1 */
    private float f34119x1;

    public C9395zr() {
        m45917h4();
    }

    /* JADX INFO: renamed from: du */
    public static /* synthetic */ C7017h4 m45916du() {
        return f34115du;
    }

    /* JADX INFO: renamed from: h4 */
    private void m45917h4() {
        this.f34116k4 = Float.NaN;
        this.f34119x1 = Float.NaN;
        this.f34117kk = Float.NaN;
        this.f34118to = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final float m45922k4() {
        return this.f34116k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m45925kk() {
        return this.f34117kk;
    }

    /* JADX INFO: renamed from: to */
    public final List<C7394ca> m45927to() {
        return this.f34118to;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m45928x1() {
        return this.f34119x1;
    }

    public C9395zr(final AbstractC13912i5 abstractC13912i5) {
        m45917h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zr.1
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
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
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
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8082kf c8082kf;
                List list;
                String str;
                List list2;
                C7394ca c7394ca;
                List list3;
                C7394ca c7394ca2;
                switch (C9395zr.f34115du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "tint";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 4:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "shade";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 5:
                        C7882hu c7882hu = new C7882hu(abstractC13912i5);
                        list2 = C9395zr.this.f34118to;
                        c7394ca = new C7394ca("comp", c7882hu);
                        list2.addItem(c7394ca);
                        return true;
                    case 6:
                        C7916i9 c7916i9 = new C7916i9(abstractC13912i5);
                        list2 = C9395zr.this.f34118to;
                        c7394ca = new C7394ca("inv", c7916i9);
                        list2.addItem(c7394ca);
                        return true;
                    case 7:
                        C8162l6 c8162l6 = new C8162l6(abstractC13912i5);
                        list2 = C9395zr.this.f34118to;
                        c7394ca = new C7394ca("gray", c8162l6);
                        list2.addItem(c7394ca);
                        return true;
                    case 8:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "alpha";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 9:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "alphaOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 10:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "alphaMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 11:
                        C7608ev c7608ev = new C7608ev(abstractC13912i5);
                        list2 = C9395zr.this.f34118to;
                        c7394ca = new C7394ca("hue", c7608ev);
                        list2.addItem(c7394ca);
                        return true;
                    case 12:
                        C7608ev c7608ev2 = new C7608ev(abstractC13912i5);
                        list2 = C9395zr.this.f34118to;
                        c7394ca = new C7394ca("hueOff", c7608ev2);
                        list2.addItem(c7394ca);
                        return true;
                    case 13:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "hueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 14:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = LocalePreferences.FirstDayOfWeek.SATURDAY;
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 15:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "satOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 16:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "satMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 17:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "lum";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 18:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "lumOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 19:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "lumMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 20:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "red";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 21:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "redOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 22:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "redMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 23:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "green";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 24:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "greenOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 25:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "greenMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 26:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "blue";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 27:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "blueOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 28:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C9395zr.this.f34118to;
                        str = "blueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 29:
                        C8595qc c8595qc = new C8595qc(abstractC13912i5);
                        list3 = C9395zr.this.f34118to;
                        c7394ca2 = new C7394ca("gamma", c8595qc);
                        list3.addItem(c7394ca2);
                        return true;
                    case 30:
                        C7544eb c7544eb = new C7544eb(abstractC13912i5);
                        list3 = C9395zr.this.f34118to;
                        c7394ca2 = new C7394ca("invGamma", c7544eb);
                        list3.addItem(c7394ca2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ float m45918k4(C9395zr c9395zr, float f) {
        c9395zr.f34116k4 = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public static /* synthetic */ float m45920kk(C9395zr c9395zr, float f) {
        c9395zr.f34117kk = f;
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ float m45921x1(C9395zr c9395zr, float f) {
        c9395zr.f34119x1 = f;
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m45926kk(float f) {
        this.f34117kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45929x1(float f) {
        this.f34119x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45923k4(String str) {
        C7394ca c7394ca;
        switch (f34115du.m27428k4(str)) {
            case 3:
                c7394ca = new C7394ca("tint", new C8082kf());
                break;
            case 4:
                c7394ca = new C7394ca("shade", new C8082kf());
                break;
            case 5:
                c7394ca = new C7394ca("comp", new C7882hu());
                break;
            case 6:
                c7394ca = new C7394ca("inv", new C7916i9());
                break;
            case 7:
                c7394ca = new C7394ca("gray", new C8162l6());
                break;
            case 8:
                c7394ca = new C7394ca("alpha", new C8082kf());
                break;
            case 9:
                c7394ca = new C7394ca("alphaOff", new C8082kf());
                break;
            case 10:
                c7394ca = new C7394ca("alphaMod", new C8082kf());
                break;
            case 11:
                c7394ca = new C7394ca("hue", new C7608ev());
                break;
            case 12:
                c7394ca = new C7394ca("hueOff", new C7608ev());
                break;
            case 13:
                c7394ca = new C7394ca("hueMod", new C8082kf());
                break;
            case 14:
                c7394ca = new C7394ca(LocalePreferences.FirstDayOfWeek.SATURDAY, new C8082kf());
                break;
            case 15:
                c7394ca = new C7394ca("satOff", new C8082kf());
                break;
            case 16:
                c7394ca = new C7394ca("satMod", new C8082kf());
                break;
            case 17:
                c7394ca = new C7394ca("lum", new C8082kf());
                break;
            case 18:
                c7394ca = new C7394ca("lumOff", new C8082kf());
                break;
            case 19:
                c7394ca = new C7394ca("lumMod", new C8082kf());
                break;
            case 20:
                c7394ca = new C7394ca("red", new C8082kf());
                break;
            case 21:
                c7394ca = new C7394ca("redOff", new C8082kf());
                break;
            case 22:
                c7394ca = new C7394ca("redMod", new C8082kf());
                break;
            case 23:
                c7394ca = new C7394ca("green", new C8082kf());
                break;
            case 24:
                c7394ca = new C7394ca("greenOff", new C8082kf());
                break;
            case 25:
                c7394ca = new C7394ca("greenMod", new C8082kf());
                break;
            case 26:
                c7394ca = new C7394ca("blue", new C8082kf());
                break;
            case 27:
                c7394ca = new C7394ca("blueOff", new C8082kf());
                break;
            case 28:
                c7394ca = new C7394ca("blueMod", new C8082kf());
                break;
            case 29:
                c7394ca = new C7394ca("gamma", new C8595qc());
                break;
            case 30:
                c7394ca = new C7394ca("invGamma", new C7544eb());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f34118to.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45924k4(float f) {
        this.f34116k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C8082kf c8082kf;
        String strM29539k4;
        C7608ev c7608ev;
        String strM29539k42;
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.f9089k4) {
            c3059ii.m12955x1("r", C14113y2.m67408k4(C13850af.m65102k4(this.f34116k4), "%"));
        } else {
            OooO00o.OooO00o(this.f34116k4 * 1000.0f, 14, c3059ii, "r");
        }
        if (c3059ii.f9089k4) {
            c3059ii.m12955x1("g", C14113y2.m67408k4(C13850af.m65102k4(this.f34119x1), "%"));
        } else {
            OooO00o.OooO00o(this.f34119x1 * 1000.0f, 14, c3059ii, "g");
        }
        if (c3059ii.f9089k4) {
            c3059ii.m12955x1("b", C14113y2.m67408k4(C13850af.m65102k4(this.f34117kk), "%"));
        } else {
            OooO00o.OooO00o(this.f34117kk * 1000.0f, 14, c3059ii, "b");
        }
        List.Enumerator<C7394ca> it = this.f34118to.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f34115du.m27428k4(next.m29539k4())) {
                    case 3:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 4:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 5:
                        ((C7882hu) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C7916i9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8162l6) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 9:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 10:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 11:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
                        break;
                    case 12:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
                        break;
                    case 13:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 14:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 15:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 16:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 17:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 18:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 19:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 20:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 21:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 22:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 23:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 24:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 25:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 26:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 27:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 28:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 29:
                        ((C8595qc) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 30:
                        ((C7544eb) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}

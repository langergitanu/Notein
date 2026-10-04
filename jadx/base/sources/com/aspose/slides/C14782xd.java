package com.aspose.slides;

import com.aspose.slides.C14470su;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p046bs.C1848k4;
import com.aspose.slides.internal.p077d8.C3073my;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.xd */
/* JADX INFO: loaded from: classes3.dex */
class C14782xd extends AbstractC13675j7 {

    /* JADX INFO: renamed from: c5 */
    private final String f50039c5;

    /* JADX INFO: renamed from: du */
    private int f50041du;

    /* JADX INFO: renamed from: dy */
    private final ParagraphCollection f50042dy;

    /* JADX INFO: renamed from: h4 */
    private final C13845mp f50044h4;

    /* JADX INFO: renamed from: ks */
    private C14406rn f50046ks;

    /* JADX INFO: renamed from: up */
    private final boolean f50049up;

    /* JADX INFO: renamed from: yj */
    private C13813lx f50051yj;

    /* JADX INFO: renamed from: k4 */
    private static final char[] f50037k4 = {8226, 8211, 8226, 8211, 187, 8226};

    /* JADX INFO: renamed from: jd */
    private static final char[] f50036jd = {ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f50038rv = new C7017h4("font-size", "line-height", "font-family", "color", ContextChain.TAG_INFRA, "em", "b", "strong", "u", "font", "a", "br", "s", "strike", "ul", "ol", "span", "body", "center", "div", ContextChain.TAG_PRODUCT, "h1", "h2", "h3", "h4", "h5", "h6", "noscript", TranslateLanguage.CROATIAN, "li", "td", "blockquote", "img", "sub", "sup", "math", "1", C18385v2.f56336h, "I", "disc", "circle", "square", "list-style-image");

    /* JADX INFO: renamed from: x1 */
    private final List<k4> f50050x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private final List<C14470su.x1> f50045kk = new List<>();

    /* JADX INFO: renamed from: to */
    private final List<List<C14470su.x1>> f50048to = new List<>();

    /* JADX INFO: renamed from: m9 */
    private k4 f50047m9 = new k4();

    /* JADX INFO: renamed from: ck */
    private final List<Portion> f50040ck = new List<>();

    /* JADX INFO: renamed from: fa */
    private final C14470su f50043fa = new C14470su();

    /* JADX INFO: renamed from: com.aspose.slides.xd$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        public boolean f50052du;

        /* JADX INFO: renamed from: h4 */
        public boolean f50053h4;

        /* JADX INFO: renamed from: k4 */
        public final PortionFormat f50054k4;

        /* JADX INFO: renamed from: kk */
        public boolean f50055kk;

        /* JADX INFO: renamed from: to */
        public boolean f50056to;

        /* JADX INFO: renamed from: x1 */
        public IParagraphFormat f50057x1;

        public k4() {
            this.f50054k4 = new PortionFormat();
            this.f50057x1 = new ParagraphFormat(null);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m73322k4(IParagraphFormat iParagraphFormat) {
            this.f50057x1 = iParagraphFormat;
        }

        public k4(k4 k4Var) {
            PortionFormat portionFormat = new PortionFormat();
            this.f50054k4 = portionFormat;
            portionFormat.m361k4((BasePortionFormat) k4Var.f50054k4);
            this.f50057x1 = new ParagraphFormat((ParagraphFormat) k4Var.f50057x1, null);
            this.f50056to = k4Var.f50056to;
            this.f50053h4 = k4Var.f50053h4;
        }
    }

    public C14782xd(ParagraphCollection paragraphCollection, C13845mp c13845mp, String str, boolean z) {
        this.f50044h4 = c13845mp;
        this.f50039c5 = str;
        this.f50042dy = paragraphCollection;
        this.f50041du = paragraphCollection.getCount();
        this.f50049up = z;
        if (paragraphCollection.getCount() == 0 || !z) {
            m73320k4(this.f50047m9.f50057x1);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC3150x6 m73302c5(String str) {
        String strM64935k4 = this.f50044h4.m64935k4(this.f50039c5, str);
        if (strM64935k4 != null) {
            return this.f50044h4.m64934k4(strM64935k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    private void m73303ck(String str) {
        try {
            this.f50046ks = C0853cg.m4578x1(str);
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: du */
    public static float m73304du(String str) {
        if (!C14113y2.m67411k4(str)) {
            C3073my c3073my = new C3073my(str);
            c3073my.m12993dy();
            if (c3073my.m12990c5() != '-' && c3073my.m12990c5() != '+') {
                return yc7.m73835x1(str);
            }
            float fM12996k4 = c3073my.m12996k4(Float.NaN);
            if (!C14064he.m66715kk(fM12996k4)) {
                return yc7.f50320k4[C7019kk.m27462to(Double.valueOf(C3085sv.m13069k4(C14116yg.m67497to(fM12996k4), -2.0d, 4.0d)), 14) + 2];
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: dy */
    private IPPImage m73305dy(String str) {
        AbstractC3150x6 abstractC3150x6M73302c5 = m73302c5(str);
        if (abstractC3150x6M73302c5 != null) {
            return ((ImageCollection) this.f50042dy.getPresentation().getImages()).m1721k4(abstractC3150x6M73302c5);
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public static float m73306h4(String str) {
        if (C14113y2.m67411k4(str)) {
            return Float.NaN;
        }
        C3073my c3073my = new C3073my(str);
        c3073my.m12993dy();
        return c3073my.m13001kk(Float.NaN);
    }

    /* JADX INFO: renamed from: jd */
    private void m73307jd(String str) {
        try {
            this.f50051yj = new C13813lx(C0853cg.m4575k4(str));
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m73308k4(float f) {
        return f * 10.0f * 3.5f * 1.25f;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m73317m9(String str) {
        IBulletFormat bullet;
        char c;
        this.f50047m9.f50057x1.getBullet().setBulletHardFont((byte) 1);
        switch (f50038rv.m27428k4(str)) {
            case 39:
                this.f50047m9.f50057x1.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
                bullet = this.f50047m9.f50057x1.getBullet();
                c = 8226;
                break;
            case 40:
                this.f50047m9.f50057x1.getBullet().setFont(new FontData("Courier New", (byte) 0, PatternStyle.Horizontal));
                bullet = this.f50047m9.f50057x1.getBullet();
                c = 'o';
                break;
            case 41:
                this.f50047m9.f50057x1.getBullet().setFont(new FontData("Wingdings", (byte) 2, (byte) 2));
                bullet = this.f50047m9.f50057x1.getBullet();
                c = 167;
                break;
            default:
                return false;
        }
        bullet.setChar(c);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private void m73318x1(PortionFormat portionFormat) {
        if (portionFormat == null) {
            throw new ArgumentNullException("portionFormat");
        }
        C14406rn c14406rn = this.f50046ks;
        if (c14406rn == null || c14406rn.m70187x1().length == 0) {
            return;
        }
        for (C14198nr c14198nr : this.f50046ks.m70187x1()) {
            m73313k4(portionFormat, c14198nr);
        }
    }

    /* JADX INFO: renamed from: to */
    public void m73321to(String str) {
        if (C14113y2.m67359c5(str, C14113y2.m67408k4("<", "math"))) {
            try {
                C1848k4 c1848k4 = new C1848k4();
                c1848k4.m9641k4(this.f50039c5);
                InterfaceC12778rv interfaceC12778rvM22751k4 = new C5546kk(new rsv(this.f50044h4), c1848k4, null).m22751k4(str);
                if (interfaceC12778rvM22751k4.mo22670xk()) {
                    m63242k4((AbstractC5535bv) interfaceC12778rvM22751k4.mo22671yd().mo20314k4(0));
                    return;
                }
            } catch (RuntimeException unused) {
            }
        }
        m63248kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73309k4() {
        IParagraph iParagraph = this.f50042dy.get_Item(r0.getCount() - 1);
        if (iParagraph.getPortions().getCount() > 0) {
            iParagraph.getPortions().get_Item(iParagraph.getPortions().getCount() - 1).setText(C14113y2.m67408k4(iParagraph.getPortions().get_Item(iParagraph.getPortions().getCount() - 1).getText(), "\u000b"));
        } else {
            iParagraph.getPortions().add(new Portion("\u000b"));
        }
    }

    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: x1 */
    public void mo63249x1(String str) {
        boolean z;
        k4 k4Var = this.f50047m9;
        int size = this.f50050x1.size();
        int i = size - 1;
        this.f50047m9 = this.f50050x1.get_Item(i);
        this.f50050x1.removeAt(i);
        if (k4Var.f50055kk) {
            m73320k4(this.f50047m9.f50057x1);
        }
        C14470su.x1 x1Var = this.f50045kk.get_Item(i);
        this.f50045kk.removeAt(i);
        if (i == this.f50048to.size()) {
            this.f50048to.removeAt(size);
        }
        List<C14470su.x1> list = this.f50048to.get_Item(i);
        if (list == null) {
            list = new List<>();
            this.f50048to.set_Item(i, list);
        }
        list.addItem(x1Var);
        if (this.f50045kk.size() == 0) {
            while (true) {
                if (this.f50041du >= this.f50042dy.getCount()) {
                    break;
                }
                Paragraph paragraph = (Paragraph) this.f50042dy.get_Item(this.f50041du);
                String strM67423kk = C14113y2.m67423kk(paragraph.m2168to(), ControlChar.SPACE_CHAR);
                if ("".equals(strM67423kk) || " ".equals(strM67423kk)) {
                    IGenericEnumerator<IPortion> it = paragraph.getPortions().iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            } else if (C7019kk.m27469x1(it.next(), MathPortion.class)) {
                                z = true;
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (!z) {
                        this.f50042dy.removeAt(this.f50041du);
                    }
                } else if ("\u000b".equals(strM67423kk)) {
                    paragraph.setText("");
                    paragraph.m2165k4(true);
                }
                this.f50041du++;
            }
            List.Enumerator<Portion> it2 = this.f50040ck.iterator();
            while (it2.hasNext()) {
                try {
                    Portion next = it2.next();
                    next.setText(C14113y2.m67393k4(next.getText(), ControlChar.NON_BREAKING_SPACE_CHAR, ControlChar.SPACE_CHAR));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            this.f50040ck.clear();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73310k4(IGenericDictionary<String, String> iGenericDictionary) {
        IBulletFormat bullet;
        IShape iShape = (IShape) C7019kk.m27452k4((Object) this.f50042dy.m2179kk().m2924kk(), IShape.class);
        byte b = 0;
        boolean z = (iShape == null || iShape.getPlaceholder() == null) ? false : true;
        if (!z) {
            this.f50047m9.f50057x1.setIndent(-22.5f);
            this.f50047m9.f50057x1.getBullet().setType((byte) 2);
            String[] strArr = {null};
            iGenericDictionary.tryGetValue("start", strArr);
            short[] sArr = {0};
            boolean zM67179k4 = C14088s7.m67179k4(strArr[0], sArr);
            short s = sArr[0];
            if (!zM67179k4) {
                s = 1;
            }
            this.f50047m9.f50057x1.getBullet().setNumberedBulletStartWith(s);
        }
        String[] strArr2 = {null};
        iGenericDictionary.tryGetValue(C18437z2.f56754h, strArr2);
        String str = strArr2[0];
        boolean zM67411k4 = C14113y2.m67411k4(str);
        if (!zM67411k4) {
            int iM27428k4 = f50038rv.m27428k4(str);
            if (iM27428k4 == 4) {
                bullet = this.f50047m9.f50057x1.getBullet();
                b = 6;
            } else if (iM27428k4 != 10) {
                switch (iM27428k4) {
                    case 36:
                        this.f50047m9.f50057x1.getBullet().setNumberedBulletStyle((byte) 3);
                        break;
                    case 37:
                        this.f50047m9.f50057x1.getBullet().setNumberedBulletStyle((byte) 1);
                        break;
                    case 38:
                        bullet = this.f50047m9.f50057x1.getBullet();
                        b = 7;
                        break;
                    default:
                        zM67411k4 = true;
                        break;
                }
            } else {
                bullet = this.f50047m9.f50057x1.getBullet();
            }
            bullet.setNumberedBulletStyle(b);
        }
        if (zM67411k4 && !z) {
            this.f50047m9.f50057x1.getBullet().setNumberedBulletStyle((byte) 3);
        }
        this.f50047m9.f50057x1.getBullet().setBulletHardFont((byte) 1);
        this.f50047m9.f50057x1.getBullet().setFont(new FontData("+mj-lt"));
    }

    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: x1 */
    public void mo63250x1(String str, String str2) {
        if ("style".equals(str2)) {
            m73307jd(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73311k4(IGenericDictionary<String, String> iGenericDictionary, C14470su.k4 k4Var) {
        IShape iShape = (IShape) C7019kk.m27452k4((Object) this.f50042dy.m2179kk().m2924kk(), IShape.class);
        boolean z = (iShape == null || iShape.getPlaceholder() == null) ? false : true;
        if (!z) {
            this.f50047m9.f50057x1.setIndent(-22.5f);
        }
        this.f50047m9.f50057x1.getBullet().setType((byte) 1);
        String[] strArr = {null};
        iGenericDictionary.tryGetValue(C18437z2.f56754h, strArr);
        String str = strArr[0];
        boolean zM67411k4 = C14113y2.m67411k4(str);
        if (!zM67411k4) {
            zM67411k4 = !m73317m9(str);
        }
        if (!(m73319x1(iGenericDictionary, k4Var) ? false : zM67411k4) || z) {
            return;
        }
        int depth = this.f50047m9.f50057x1.getDepth();
        char[] cArr = f50037k4;
        if (depth >= cArr.length) {
            depth = cArr.length - 1;
        }
        this.f50047m9.f50057x1.getBullet().setChar(cArr[depth]);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m73319x1(IGenericDictionary<String, String> iGenericDictionary, C14470su.k4 k4Var) {
        String[] strArr = {null};
        iGenericDictionary.tryGetValue("style", strArr);
        String str = strArr[0];
        if (C14113y2.m67411k4(str)) {
            return false;
        }
        if (f50038rv.m27428k4(new C3073my(str).m13008x1()) != 42) {
            return false;
        }
        String strM70774k4 = k4Var.m70774k4("list-style-image");
        if (C14113y2.m67411k4(strM70774k4) || !C14113y2.m67448x1(strM70774k4, "url")) {
            return false;
        }
        String strOooO00o = OooO0OO.OooO00o(5, 4, strM70774k4, strM70774k4);
        if (m73305dy(strOooO00o) == null) {
            return false;
        }
        this.f50047m9.f50057x1.getBullet().setType((byte) 3);
        ((BulletFormat) this.f50047m9.f50057x1.getBullet()).getPicture().setImage(m73305dy(strOooO00o));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73320k4(IParagraphFormat iParagraphFormat) {
        Paragraph paragraph = new Paragraph((ParagraphFormat) iParagraphFormat);
        if (this.f50049up) {
            paragraph.getParagraphFormat().getDefaultPortionFormat().setFontHeight(yc7.f50320k4[2]);
        }
        this.f50042dy.add(paragraph);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73312k4(PortionFormat portionFormat) {
        C14470su.x1 x1Var;
        if (portionFormat == null) {
            throw new ArgumentNullException("portionFormat");
        }
        C13813lx c13813lx = this.f50051yj;
        if (c13813lx == null || c13813lx.m64611k4().size() == 0 || this.f50045kk.size() == 0 || (x1Var = (C14470su.x1) OooO0O0.OooO00o(this.f50045kk, 1)) == null || !x1Var.f48921x1.containsKey("class")) {
            return;
        }
        m73314k4(portionFormat, x1Var.f48921x1.get_Item("class"));
    }

    /* JADX INFO: renamed from: k4 */
    private void m73313k4(PortionFormat portionFormat, C14198nr c14198nr) {
        if (C14113y2.m67411k4(c14198nr.m68178x1())) {
            return;
        }
        int iM27428k4 = f50038rv.m27428k4(c14198nr.m68177k4());
        if (iM27428k4 == 0) {
            portionFormat.setFontHeight(m73304du(c14198nr.m68178x1()));
            return;
        }
        if (iM27428k4 == 1) {
            this.f50047m9.f50057x1.setSpaceWithin(m73306h4(c14198nr.m68178x1()));
            return;
        }
        if (iM27428k4 != 2) {
            if (iM27428k4 != 3) {
                return;
            }
            m73316k4(c14198nr.m68178x1(), portionFormat.getFillFormat().getSolidFillColor());
            if (portionFormat.getFillFormat().getSolidFillColor().getColorType() != -1) {
                portionFormat.getFillFormat().setFillType((byte) 1);
                return;
            }
            return;
        }
        if (portionFormat.getLatinFont() == null && portionFormat.getEastAsianFont() == null && portionFormat.getComplexScriptFont() == null) {
            FontData fontData = new FontData(yc7.m73812k4(c14198nr.m68178x1()));
            portionFormat.setLatinFont(fontData);
            portionFormat.setEastAsianFont(fontData);
            portionFormat.setComplexScriptFont(fontData);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73314k4(PortionFormat portionFormat, String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        String strM67402k4 = C14113y2.m67402k4(".{0}", str);
        if (this.f50051yj.m64611k4().containsKey(strM67402k4)) {
            for (C14198nr c14198nr : this.f50051yj.m64611k4().get_Item(strM67402k4)) {
                m73313k4(portionFormat, c14198nr);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: k4 */
    public void mo63243k4(C12804k4 c12804k4) {
        MathBlock mathBlockM7112k4 = new hec().m7112k4(c12804k4);
        if (mathBlockM7112k4 == null || mathBlockM7112k4.getCount() <= 0) {
            return;
        }
        MathPortion mathPortion = new MathPortion();
        ((MathParagraph) mathPortion.getMathParagraph()).add(mathBlockM7112k4);
        mathPortion.m2295x1().m369x1((BasePortionFormat) this.f50047m9.f50054k4);
        this.f50042dy.get_Item(r3.getCount() - 1).getPortions().add(mathPortion);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73315k4(C14470su.k4 k4Var, IGenericDictionary<String, String> iGenericDictionary, float f, float f2) {
        C3073my c3073my;
        int iM13007x1;
        ParagraphFormat paragraphFormat = new ParagraphFormat(null);
        yc7.m73822k4(k4Var, paragraphFormat, 1024.0f, C14064he.m66715kk(f) ? Float.NaN : m73308k4(f), C14064he.m66715kk(f2) ? Float.NaN : m73308k4(f2));
        String[] strArr = {null};
        iGenericDictionary.tryGetValue("class", strArr);
        String str = strArr[0];
        if (!C14113y2.m67411k4(str) && ((str.charAt(0) == 'O' || str.charAt(0) == 'o') && (iM13007x1 = (c3073my = new C3073my(str, 1, str.length() - 1)).m13007x1(-1)) > 0 && iM13007x1 < 8 && c3073my.m12994h4() == 0)) {
            paragraphFormat.setDepth((short) iM13007x1);
        }
        ((ParagraphFormat) this.f50047m9.f50057x1).m2199kk(paragraphFormat);
        k4 k4Var2 = this.f50047m9;
        k4Var2.f50055kk = true;
        m73320k4(k4Var2.f50057x1);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c5 A[SYNTHETIC] */
    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo63245k4(String str) {
        ParagraphCollection paragraphCollection = this.f50042dy;
        IParagraph iParagraph = paragraphCollection.get_Item(paragraphCollection.getCount() - 1);
        this.f50047m9.m73322k4(iParagraph.getParagraphFormat());
        m73312k4(this.f50047m9.f50054k4);
        m73318x1(this.f50047m9.f50054k4);
        this.f50046ks = null;
        int length = str.length();
        if (this.f50047m9.f50052du) {
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            if (i < length) {
                iParagraph.getParagraphFormat().getBullet().setChar(str.charAt(i));
                int i2 = i + 1;
                if (i2 < length && str.charAt(i2) <= ' ') {
                    i2 = i + 2;
                }
                str = length > i2 ? C14113y2.m67422kk(str, i2) : null;
            }
        }
        if (this.f50047m9.f50056to || str == null || this.f50050x1.size() == 0) {
            return;
        }
        if (iParagraph.getParagraphFormat().getBullet().getNumberedBulletStyle() > -1 && (this.f50047m9.f50054k4.getFontBold() == 1 || this.f50047m9.f50054k4.getFontItalic() == 1)) {
            Portion portion = new Portion(this.f50047m9.f50054k4);
            portion.m2289k4("\u200b");
            IPortionFormat portionFormat = portion.getPortionFormat();
            portionFormat.setFontBold((byte) 0);
            portionFormat.setFontItalic((byte) 0);
            iParagraph.getPortions().add(portion);
        }
        if (C14113y2.m67384k4(str, f50036jd) >= 0) {
            int length2 = str.length();
            int i3 = 0;
            boolean z = false;
            while (i3 < length2) {
                int iM67385k4 = C14113y2.m67385k4(str, f50036jd, i3);
                if (iM67385k4 < 0) {
                    iM67385k4 = length2;
                }
                if (i3 < iM67385k4) {
                    String strM67443x1 = C14113y2.m67443x1(str, i3, iM67385k4 - i3);
                    if (C14113y2.m67440x1(strM67443x1).length() == 0) {
                        strM67443x1 = iParagraph.getPortions().getCount() > 0 ? " " : "";
                    } else if (z) {
                        strM67443x1 = C14113y2.m67431to(strM67443x1, ControlChar.SPACE_CHAR);
                        if (iParagraph.getPortions().getCount() > 0) {
                            strM67443x1 = C14113y2.m67407k4(Character.valueOf(ControlChar.SPACE_CHAR), strM67443x1);
                        }
                        z = false;
                    }
                    Portion portion2 = new Portion(this.f50047m9.f50054k4);
                    portion2.m2289k4(strM67443x1);
                    iParagraph.getPortions().add(portion2);
                    if (this.f50047m9.f50053h4) {
                        this.f50040ck.addItem(portion2);
                    }
                }
                if (iM67385k4 < length2) {
                    i3 = iM67385k4 + 1;
                    if (i3 < length2) {
                        if (str.charAt(iM67385k4) == '\r') {
                            int i4 = iM67385k4 + 2;
                            if (str.charAt(i3) != '\n') {
                                i3 = i4;
                                if (str.charAt(i3 - 1) != '\n') {
                                    if (i3 >= length2 && str.charAt(i3) == ' ') {
                                        z = true;
                                    }
                                }
                            } else {
                                i3 = i4;
                                if (i3 >= length2) {
                                }
                            }
                        } else if (str.charAt(i3 - 1) != '\n') {
                        }
                    }
                } else if (iM67385k4 == length2) {
                    break;
                }
            }
        } else {
            Portion portion3 = new Portion(this.f50047m9.f50054k4);
            portion3.m2289k4(str);
            if (this.f50047m9.f50055kk && C14113y2.m67440x1(str).length() == 0 && !this.f50047m9.f50054k4.m2138ix()) {
                portion3.m2295x1().setFontHeight(14.0f);
            }
            if (this.f50047m9.f50053h4) {
                this.f50040ck.addItem(portion3);
            }
            iParagraph.getPortions().add(portion3);
        }
        IBulletFormat bullet = iParagraph.getParagraphFormat().getBullet();
        if (bullet.getType() <= -1 || iParagraph.getPortions().getCount() != 1 || C14064he.m66715kk(bullet.getHeight())) {
            return;
        }
        float fontHeight = iParagraph.getPortions().get_Item(0).getPortionFormat().getFontHeight();
        bullet.setHeight(C14064he.m66715kk(fontHeight) ? 100.0f : 100.0f * (bullet.getHeight() / fontHeight));
    }

    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: k4 */
    public void mo63246k4(String str, IGenericDictionary<String, String> iGenericDictionary) {
        if (iGenericDictionary == null) {
            iGenericDictionary = new Dictionary<>();
        }
        this.f50050x1.addItem(this.f50047m9);
        this.f50045kk.addItem(new C14470su.x1(str, iGenericDictionary));
        this.f50048to.addItem(null);
        this.f50047m9 = new k4(this.f50047m9);
        PortionFormat portionFormat = new PortionFormat();
        C14470su.k4 k4VarM70773k4 = this.f50043fa.m70773k4(this.f50045kk, this.f50048to);
        yc7.m73824k4(k4VarM70773k4, portionFormat, C7019kk.m27469x1(this.f50042dy.m2179kk().m2924kk(), ICell.class));
        this.f50047m9.f50054k4.m369x1((BasePortionFormat) portionFormat);
        switch (f50038rv.m27428k4(str)) {
            case 4:
            case 5:
                this.f50047m9.f50054k4.setFontItalic((byte) 1);
                break;
            case 6:
            case 7:
                this.f50047m9.f50054k4.setFontBold((byte) 1);
                break;
            case 8:
                this.f50047m9.f50054k4.setFontUnderline((byte) 2);
                break;
            case 9:
                String[] strArr = {null};
                boolean zTryGetValue = iGenericDictionary.tryGetValue("size", strArr);
                String str2 = strArr[0];
                if (zTryGetValue) {
                    this.f50047m9.f50054k4.setFontHeight(m73304du(str2));
                }
                strArr[0] = str2;
                iGenericDictionary.tryGetValue(OptionalModuleUtils.FACE, strArr);
                String str3 = strArr[0];
                if (!C14113y2.m67411k4(str3)) {
                    FontData fontData = new FontData(str3);
                    this.f50047m9.f50054k4.setLatinFont(fontData);
                    this.f50047m9.f50054k4.setEastAsianFont(fontData);
                    this.f50047m9.f50054k4.setComplexScriptFont(fontData);
                }
                strArr[0] = str3;
                iGenericDictionary.tryGetValue("color", strArr);
                String str4 = strArr[0];
                if (!C14113y2.m67411k4(str4)) {
                    m73316k4(str4, this.f50047m9.f50054k4.getFillFormat().getSolidFillColor());
                    if (this.f50047m9.f50054k4.getFillFormat().getSolidFillColor().getColorType() != -1) {
                        this.f50047m9.f50054k4.getFillFormat().setFillType((byte) 1);
                    }
                }
                break;
            case 10:
                String[] strArr2 = {null};
                iGenericDictionary.tryGetValue("href", strArr2);
                String str5 = strArr2[0];
                if (!C14113y2.m67411k4(str5)) {
                    this.f50047m9.f50054k4.setHyperlinkClick(new Hyperlink(str5));
                }
                break;
            case 11:
                m73309k4();
                break;
            case 12:
            case 13:
                this.f50047m9.f50054k4.setStrikethroughType((byte) 1);
                break;
            case 14:
                m73311k4(iGenericDictionary, k4VarM70773k4);
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                IParagraphFormat iParagraphFormat = this.f50047m9.f50057x1;
                iParagraphFormat.setDepth((short) (iParagraphFormat.getDepth() + 1));
                break;
            case 15:
                m73310k4(iGenericDictionary);
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                IParagraphFormat iParagraphFormat2 = this.f50047m9.f50057x1;
                iParagraphFormat2.setDepth((short) (iParagraphFormat2.getDepth() + 1));
                break;
            case 16:
                String[] strArrM73829k4 = yc7.m73829k4(k4VarM70773k4, "font-family");
                if (strArrM73829k4 != null && strArrM73829k4.length > 0) {
                    FontData fontData2 = new FontData(strArrM73829k4[0]);
                    this.f50047m9.f50054k4.setLatinFont(fontData2);
                    this.f50047m9.f50054k4.setEastAsianFont(fontData2);
                    this.f50047m9.f50054k4.setComplexScriptFont(fontData2);
                }
                if (C14113y2.m67360du(k4VarM70773k4.m70774k4("mso-spacerun"), "yes", (short) 3) == 0) {
                    this.f50047m9.f50053h4 = true;
                }
                String strM70774k4 = k4VarM70773k4.m70774k4("mso-special-format");
                if (strM70774k4 == null) {
                    if (k4VarM70773k4.m70775x1("mso-tab-count")) {
                        int iM13007x1 = new C3073my(k4VarM70773k4.m70774k4("mso-tab-count")).m13007x1(-1);
                        if (iM13007x1 > 0) {
                            mo63245k4(C14113y2.m67389k4('\t', iM13007x1));
                        }
                        this.f50047m9.f50056to = true;
                    }
                    break;
                } else {
                    ParagraphCollection paragraphCollection = this.f50042dy;
                    BulletFormat bulletFormatM2206x1 = ((ParagraphFormat) paragraphCollection.get_Item(paragraphCollection.getCount() - 1).getParagraphFormat()).m2206x1();
                    if (C14113y2.m67360du(strM70774k4, "bullet", (short) 3) == 0) {
                        this.f50047m9.f50052du = true;
                        bulletFormatM2206x1.setType((byte) 1);
                    } else if (C14113y2.m67448x1(C14113y2.m67368h4(strM70774k4), "\"numbullet") || C14113y2.m67448x1(C14113y2.m67368h4(strM70774k4), "'numbullet")) {
                        this.f50047m9.f50056to = true;
                        C3073my c3073my = new C3073my(strM70774k4, 10, strM70774k4.length() - 11);
                        int iM13007x12 = c3073my.m13007x1(-1);
                        c3073my.m12993dy();
                        if (c3073my.m12990c5() == '\\') {
                            c3073my.m13003m9();
                        }
                        c3073my.m13003m9();
                        int iM13007x13 = c3073my.m13007x1(-1);
                        if (iM13007x12 >= 0 && iM13007x13 >= 0) {
                            bulletFormatM2206x1.setType((byte) 2);
                            bulletFormatM2206x1.setNumberedBulletStyle((byte) iM13007x12);
                            bulletFormatM2206x1.setNumberedBulletStartWith((short) iM13007x13);
                        }
                    }
                    if (bulletFormatM2206x1.m429c5()) {
                        if (this.f50047m9.f50054k4.getLatinFont() != null) {
                            bulletFormatM2206x1.setBulletHardFont((byte) 1);
                            bulletFormatM2206x1.setFont(this.f50047m9.f50054k4.getLatinFont());
                        }
                        String strM70774k42 = k4VarM70773k4.m70774k4("color");
                        if (!C14113y2.m67411k4(strM70774k42)) {
                            m73316k4(strM70774k42, bulletFormatM2206x1.getColor());
                            if (bulletFormatM2206x1.getColor().getColorType() != -1) {
                                bulletFormatM2206x1.setBulletHardColor((byte) 1);
                            }
                        }
                        String strM70774k43 = k4VarM70773k4.m70774k4("font-size");
                        if (!C14113y2.m67411k4(strM70774k43)) {
                            bulletFormatM2206x1.setHeight(m73304du(strM70774k43));
                            this.f50047m9.f50054k4.setFontHeight(bulletFormatM2206x1.getHeight());
                        }
                        ParagraphCollection paragraphCollection2 = this.f50042dy;
                        IParagraph iParagraph = paragraphCollection2.get_Item(paragraphCollection2.getCount() - 1);
                        if (!C14064he.m66715kk(iParagraph.getParagraphFormat().getIndent()) && !C14064he.m66715kk(iParagraph.getParagraphFormat().getMarginLeft())) {
                            iParagraph.getParagraphFormat().setMarginLeft(iParagraph.getParagraphFormat().getIndent() + iParagraph.getParagraphFormat().getMarginLeft());
                            iParagraph.getParagraphFormat().setIndent(Float.NaN);
                            break;
                        }
                    }
                }
                break;
            case 17:
                String strM70774k44 = k4VarM70773k4.m70774k4("background");
                if (!C14113y2.m67411k4(strM70774k44)) {
                    m73316k4(strM70774k44, this.f50042dy.getSlide().getBackground().getFillFormat().getSolidFillColor());
                    if (this.f50042dy.getSlide().getBackground().getFillFormat().getSolidFillColor().getColorType() != -1) {
                        this.f50042dy.getSlide().getBackground().getFillFormat().setFillType((byte) 1);
                        this.f50042dy.getSlide().getBackground().setType((byte) 1);
                    }
                }
                break;
            case 18:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 19:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 20:
                m73315k4(k4VarM70773k4, iGenericDictionary, 1.0f, 1.0f);
                break;
            case 21:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[5]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 0.67f, 0.67f);
                break;
            case 22:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[4]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 0.83f, 0.83f);
                break;
            case 23:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[3]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 1.0f, 1.0f);
                break;
            case 24:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[2]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 1.33f, 1.33f);
                break;
            case 25:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[1]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 1.67f, 1.67f);
                break;
            case 26:
                this.f50047m9.f50054k4.setFontHeight(yc7.f50320k4[0]);
                m73315k4(k4VarM70773k4, iGenericDictionary, 2.33f, 2.33f);
                break;
            case 27:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 28:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 29:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 30:
                m73315k4(k4VarM70773k4, iGenericDictionary, Float.NaN, Float.NaN);
                break;
            case 31:
                m73315k4(k4VarM70773k4, iGenericDictionary, 1.0f, 1.0f);
                break;
            case 32:
                ParagraphCollection paragraphCollection3 = this.f50042dy;
                IParagraph iParagraph2 = paragraphCollection3.get_Item(paragraphCollection3.getCount() - 1);
                String[] strArr3 = {null};
                iGenericDictionary.tryGetValue("src", strArr3);
                String str6 = strArr3[0];
                if (iParagraph2.getPortions().getCount() == 0 && !C14113y2.m67411k4(str6)) {
                    AbstractC3150x6 abstractC3150x6M73302c5 = m73302c5(str6);
                    if (abstractC3150x6M73302c5 == null) {
                        String[] strArr4 = {null};
                        iGenericDictionary.tryGetValue("alt", strArr4);
                        String str7 = strArr4[0];
                        if (!C14113y2.m67411k4(str7)) {
                            iParagraph2.getParagraphFormat().getBullet().setType((byte) 1);
                            iParagraph2.getParagraphFormat().getBullet().setChar(str7.charAt(0));
                        }
                    } else {
                        ((BulletFormat) iParagraph2.getParagraphFormat().getBullet()).getPicture().setImage(((ImageCollection) this.f50042dy.getPresentation().getImages()).m1721k4(abstractC3150x6M73302c5));
                        iParagraph2.getParagraphFormat().getBullet().setType((byte) 3);
                    }
                } else {
                    String[] strArr5 = {null};
                    boolean zTryGetValue2 = iGenericDictionary.tryGetValue("alt", strArr5);
                    String str8 = strArr5[0];
                    if (zTryGetValue2) {
                        mo63245k4(str8);
                    }
                }
                break;
            case 33:
                this.f50047m9.f50054k4.setEscapement(-25.0f);
                this.f50047m9.f50054k4.setFontHeight(Float.NaN);
                break;
            case 34:
                this.f50047m9.f50054k4.setEscapement(30.0f);
                this.f50047m9.f50054k4.setFontHeight(Float.NaN);
                break;
            case 35:
                this.f50047m9.f50054k4.setFontItalic((byte) 1);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73316k4(String str, IColorFormat iColorFormat) {
        new C3073my(str).m12999k4(iColorFormat);
    }

    @Override // com.aspose.slides.AbstractC13675j7
    /* JADX INFO: renamed from: k4 */
    public void mo63247k4(String str, String str2) {
        if ("style".equals(str)) {
            m73303ck(str2);
        }
    }
}

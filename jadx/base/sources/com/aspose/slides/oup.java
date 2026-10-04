package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2182lv;
import com.aspose.slides.internal.p060ca.C2284s2;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.q1h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class oup {

    /* JADX INFO: renamed from: du */
    private final ld2 f47948du;

    /* JADX INFO: renamed from: dy */
    private MathPortion f47949dy;

    /* JADX INFO: renamed from: k4 */
    public final TextFrame f47951k4;

    /* JADX INFO: renamed from: kk */
    private final nrw f47952kk;

    /* JADX INFO: renamed from: to */
    private final r7c f47954to;

    /* JADX INFO: renamed from: x1 */
    public final boolean f47955x1;

    /* JADX INFO: renamed from: m9 */
    private float f47953m9 = 1.0f;

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, C2132iq> f47950h4 = new Dictionary<>();

    public oup(nrw nrwVar, ld2 ld2Var, TextFrame textFrame, r7c r7cVar) {
        this.f47952kk = nrwVar;
        this.f47954to = r7cVar;
        this.f47949dy = (MathPortion) r7cVar.f48542kk;
        C12013m9 c12013m9M64822k4 = mbw.m64822k4();
        if (!m68868k4().containsKey(c12013m9M64822k4.m56648m9())) {
            m68868k4().addItem(c12013m9M64822k4.m56648m9(), ((Presentation) r7cVar.f48542kk.m2284jd().getPresentation()).m2357k4());
        }
        this.f47948du = ld2Var;
        this.f47951k4 = textFrame;
        this.f47955x1 = textFrame.m2908jd().m2937b3().getWrapText();
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, C2132iq> m68868k4() {
        return this.f47950h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<kjz> m68873x1() {
        kjz kjzVar = new kjz(m68872k4(this.f47949dy, this.f47954to, this.f47952kk.f47603k4));
        kjzVar.m70912x1(((MathParagraph) this.f47949dy.getMathParagraph()).m1999k4());
        return m68869k4(kjzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /* JADX INFO: renamed from: k4 */
    public final List<kjz> m68869k4(kjz kjzVar) {
        List.Enumerator it;
        boolean zM27456k4;
        int i;
        el1[] el1VarArr;
        List<kjz> list = new List<>();
        int i2 = 0;
        int i3 = 1;
        boolean[] zArr = {false};
        kjz kjzVarM68870k4 = m68870k4(kjzVar, zArr);
        boolean z = zArr[0];
        if (kjzVarM68870k4 != null) {
            if (!this.f47955x1 || kjzVarM68870k4.f45757to.f48165k4.length > 1 || !z) {
                kjzVarM68870k4.m63953k4(new oju(), false, 0.0f);
                kjzVarM68870k4.m70907k4(kjzVarM68870k4.f45757to.m69272x1().f5389k4);
                list.addItem(kjzVarM68870k4);
                return list;
            }
            List list2 = new List();
            el1[] el1VarArr2 = kjzVarM68870k4.f45757to.f48165k4;
            int length = el1VarArr2.length;
            float f = Float.MAX_VALUE;
            int i4 = 0;
            float fM67481k4 = 0.0f;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                el1 el1Var = el1VarArr2[i4];
                MathBlock mathBlock = new MathBlock();
                list2.clear();
                while (i2 < el1Var.f4826m9.size()) {
                    el1 el1Var2 = el1Var.f4826m9.get_Item(i2);
                    int i5 = i3;
                    el1Var2.m5582kk(new oju());
                    if (el1Var2.m5577dy() || i2 == el1Var.f4826m9.size() - 1) {
                        if (!kjzVarM68870k4.m70910kk() || i2 == el1Var.f4826m9.size() - 1) {
                            list2.addItem(el1Var2);
                        }
                        it = list2.iterator();
                        while (it.hasNext()) {
                            try {
                                int i6 = i2;
                                el1[] el1VarArr3 = el1VarArr2;
                                mathBlock.join(new MathBlock(((el1) it.next()).f4820c5, i5));
                                i2 = i6;
                                el1VarArr2 = el1VarArr3;
                                i5 = 1;
                            } finally {
                            }
                        }
                        i = i2;
                        el1VarArr = el1VarArr2;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        MathParagraph mathParagraph = new MathParagraph(mathBlock);
                        mathParagraph.m1998k4(kjzVarM68870k4.m70910kk());
                        mathParagraph.setJustification(kjzVarM68870k4.f45757to.f48166kk.getJustification());
                        kjz kjzVar2 = new kjz(m68871k4(new MathPortion(mathParagraph), kjzVarM68870k4.f45757to), mathParagraph.getJustification());
                        kjzVar2.m63952k4(kjzVarM68870k4.m63955to());
                        kjzVar2.m63953k4(new oju(), false, 0.0f);
                        kjzVar2.m70907k4(kjzVar2.f45757to.m69272x1().f5389k4);
                        if (f > kjzVar2.f45757to.f48165k4[0].m5583m9().f47836k4) {
                            f = kjzVar2.f45757to.f48165k4[0].m5583m9().f47836k4;
                        }
                        fM67481k4 = C14116yg.m67481k4(fM67481k4, kjzVar2.m70911x1());
                        list.addItem(kjzVar2);
                        mathBlock = new MathBlock();
                        list2 = new List();
                        if (kjzVarM68870k4.m70910kk()) {
                        }
                        i2 = i + 1;
                        i3 = 1;
                        el1VarArr2 = el1VarArr;
                    } else {
                        i = i2;
                        el1VarArr = el1VarArr2;
                    }
                    list2.addItem(el1Var2);
                    i2 = i + 1;
                    i3 = 1;
                    el1VarArr2 = el1VarArr;
                }
                i4 += i3;
                el1VarArr2 = el1VarArr2;
                i2 = 0;
            }
            ?? r7 = i3;
            if (list.size() > r7) {
                it = list.iterator();
                while (it.hasNext()) {
                    try {
                        kjz next = it.next();
                        next.m70909k4((boolean) r7);
                        if (kjzVar.f45757to.f48166kk.getJustification() == 4 && kjzVar.m70910kk()) {
                            next.m70907k4(fM67481k4);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return list;
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12013m9 m68865k4(MathematicalText mathematicalText, byte b, float f, Portion portion) {
        C12013m9 c12013m9M64822k4;
        IPortionFormat format = mathematicalText.getFormat();
        if (b == 3) {
            FontData fontData = (FontData) format.getSymbolFont();
            if (fontData == null) {
                fontData = (FontData) format.getLatinFont();
            }
            qy7 qy7VarM64368x1 = this.f47948du.m64368x1(null, portion, (lrb) format.getEffective(), fontData, this.f47953m9);
            C12013m9 c12013m9M68811k4 = qy7VarM64368x1.m69882b3().m68811k4();
            if (!m68868k4().containsKey(c12013m9M68811k4.m56648m9())) {
                m68867k4(qy7VarM64368x1.m69882b3().m68819x1().m23120k4());
            }
            return c12013m9M68811k4.m56641h4() ? new C12013m9(c12013m9M68811k4, 0) : c12013m9M68811k4;
        }
        if (format.getLatinFont() != null) {
            qy7 qy7VarM64359k4 = this.f47948du.m64359k4((kg7) null, portion, (lrb) format.getEffective(), (FontData) format.getLatinFont(), this.f47953m9);
            c12013m9M64822k4 = qy7VarM64359k4.m69882b3().m68811k4();
            if (!m68868k4().containsKey(c12013m9M64822k4.m56648m9())) {
                m68867k4(qy7VarM64359k4.m69882b3().m68819x1().m23120k4());
            }
            if (qy7VarM64359k4.m69885c5() && !c12013m9M64822k4.m56641h4()) {
                c12013m9M64822k4 = mbw.m64822k4();
            }
        }
        return C12013m9.m56630k4(c12013m9M64822k4.m56651x1(), f, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final kjz m68870k4(kjz kjzVar, boolean[] zArr) {
        int i;
        zArr[0] = false;
        if (kjzVar == null) {
            return kjzVar;
        }
        for (el1 el1Var : kjzVar.f45757to.f48165k4) {
            for (int i2 = 0; i2 < el1Var.f4826m9.size(); i2++) {
                b3e b3eVar = (b3e) C7019kk.m27452k4((Object) el1Var.f4826m9.get_Item(i2), b3e.class);
                if (b3eVar != null) {
                    String str = b3eVar.f4099k4;
                    int iM67384k4 = C14113y2.m67384k4(str, new char[]{'='});
                    if (iM67384k4 == 0) {
                        zArr[0] = true;
                        b3eVar.m5581k4(true);
                    }
                    if (iM67384k4 >= 0 && str.length() > 1) {
                        String strM67443x1 = C14113y2.m67443x1(str, 0, iM67384k4);
                        String strM67443x12 = C14113y2.m67443x1(str, iM67384k4, 1);
                        String strM67422kk = C14113y2.m67422kk(str, iM67384k4 + 1);
                        if (C14113y2.m67411k4(strM67443x1)) {
                            i = 0;
                        } else {
                            el1Var.f4823jd.insertItem(i2, new b3e(new MathematicalText(strM67443x1, b3eVar.m3979x1().getFormat()), b3eVar.mo4555du(), b3eVar.f4098h4.Clone(), strM67443x1));
                            i = 1;
                        }
                        if (!C14113y2.m67411k4(strM67443x12)) {
                            b3e b3eVar2 = new b3e(new MathematicalText(strM67443x12, b3eVar.m3979x1().getFormat()), b3eVar.mo4555du(), b3eVar.f4098h4.Clone(), strM67443x12);
                            zArr[0] = true;
                            b3eVar2.m5581k4(true);
                            el1Var.f4823jd.insertItem(i + i2, b3eVar2);
                            i++;
                        }
                        if (!C14113y2.m67411k4(strM67422kk)) {
                            el1Var.f4823jd.insertItem(i + i2, new b3e(new MathematicalText(strM67422kk, b3eVar.m3979x1().getFormat()), b3eVar.mo4555du(), b3eVar.f4098h4.Clone(), strM67422kk));
                            i++;
                        }
                        if (i > 0) {
                            el1Var.f4823jd.removeAt(i + i2);
                        }
                    }
                }
            }
        }
        return kjzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final pv7 m68871k4(MathPortion mathPortion, pv7 pv7Var) {
        return new pv7((MathParagraph) mathPortion.getMathParagraph(), pv7Var.m69268k4(), pv7Var.f48169x1, pv7Var.f48168to.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final pv7 m68872k4(final MathPortion mathPortion, final r7c r7cVar, fqc fqcVar) {
        C14327q4 c14327q4 = new C14327q4();
        c14327q4.f48231du = Float.NaN;
        c14327q4.f48233fa = 1.0f;
        c14327q4.f48240up = 1.0f;
        final MathParagraph mathParagraph = (MathParagraph) mathPortion.getMathParagraph();
        List list = new List();
        IGenericEnumerator<IMathBlock> it = mathParagraph.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        for (int i = 0; i < list.size(); i++) {
            IMathElement iMathElement = (IMathElement) list.get_Item(i);
            if (C7019kk.m27469x1(iMathElement, MathematicalText.class)) {
                float fontHeight = ((MathematicalText) iMathElement).getFormat().getFontHeight();
                c14327q4.f48231du = fontHeight;
                if (!C14064he.m66715kk(fontHeight)) {
                    break;
                }
            }
            list.addRange(AbstractC14092to.m67204k4((Object[]) iMathElement.getChildren()));
        }
        if (C14064he.m66715kk(c14327q4.f48231du)) {
            c14327q4.f48231du = ((lrb) mathPortion.getPortionFormat().getEffective()).getFontHeight();
        }
        if (C14064he.m66715kk(c14327q4.f48231du)) {
            c14327q4.f48231du = 18.0f;
        }
        final C11999ar c11999ar = new C11999ar(((C14176nc) r7cVar.f48541k4.getFillFormat()).m67938m9().Clone().Clone());
        AbstractC4687to<PortionFormat, AbstractC12024x1> abstractC4687to = new AbstractC4687to<PortionFormat, AbstractC12024x1>() { // from class: com.aspose.slides.oup.1
            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public AbstractC12024x1 invoke(PortionFormat portionFormat) {
                if (portionFormat == null) {
                    return c11999ar;
                }
                if (portionFormat.getFillFormat().getFillType() == -1) {
                    if (mathPortion.getPortionFormat().getFillFormat().getFillType() == 1) {
                        return new C11999ar(((ColorFormat) mathPortion.getPortionFormat().getFillFormat().getSolidFillColor()).m1084to().Clone().Clone());
                    }
                    if (mathPortion.getPortionFormat().getFillFormat().getFillType() == -1) {
                        return c11999ar;
                    }
                }
                AutoShape autoShape = new AutoShape(mathParagraph);
                autoShape.setShapeType(5);
                autoShape.addTextFrame(C14113y2.m67362du("Text", C14113y2.m67365dy(C14052dq.m66570kk())));
                autoShape.m288x1().m2925kk(oup.this.f47951k4);
                autoShape.m288x1().getTextFrameFormat().setWrapText((byte) 0);
                Paragraph paragraph = (Paragraph) ((TextFrame) autoShape.getTextFrame()).getParagraphs().get_Item(0);
                IParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
                if (paragraphFormat.getBullet().getType() == -1) {
                    paragraphFormat.getBullet().setType((byte) 0);
                }
                ((PortionFormat) paragraphFormat.getDefaultPortionFormat()).m361k4((BasePortionFormat) portionFormat);
                return new C11999ar(((C14176nc) nrw.m68182k4(paragraph, 0).get_Item(0).m68194to().get_Item(0).f48541k4.getFillFormat()).m67938m9().Clone().Clone());
            }
        };
        final oup[] oupVarArr = {this};
        q1h q1hVar = new q1h(mathParagraph, c14327q4.f48231du, new AbstractC4687to<String, C2132iq>() { // from class: com.aspose.slides.oup.2
            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C2132iq invoke(String str) {
                return oup.this.m68868k4().containsKey(str) ? oup.this.m68868k4().get_Item(str) : oup.this.m68868k4().get_Item("Cambria Math");
            }
        }, abstractC4687to, new q1h.AbstractC14324k4() { // from class: com.aspose.slides.oup.3
            @Override // com.aspose.slides.q1h.AbstractC14324k4
            /* JADX INFO: renamed from: k4 */
            public C12013m9 mo68876k4(MathematicalText mathematicalText, byte b, float f) {
                return oupVarArr[0].m68865k4(mathematicalText, b, f, r7cVar.f48542kk);
            }
        });
        q1hVar.m69388k4(TextFrame.m2896k4(this.f47951k4));
        q1hVar.f48221du = (Presentation) mathPortion.m2284jd().getPresentation();
        return new pv7(mathParagraph, fqcVar, q1hVar, c14327q4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m68867k4(C9790ts c9790ts) {
        C2033cj[] c2033cjArrMo10154k4 = new C2182lv(new C2350wl(C12565ks.m58632x1(c9790ts.m48233um().mo47984x1()))).mo10154k4();
        for (int i = 0; i < c2033cjArrMo10154k4.length; i++) {
            if (C14113y2.m67363du(c2033cjArrMo10154k4[i].mo10137k4(), c9790ts.m48202k4())) {
                m68868k4().addItem(c9790ts.m48202k4(), (C2132iq) new C2284s2().mo11021k4(c2033cjArrMo10154k4[i]));
            }
        }
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class yup {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50408k4 = new C7017h4("list-level-style-number", "list-level-style-bullet", "list-level-style-image");

    /* JADX INFO: renamed from: k4 */
    private static Paragraph m74090k4(IParagraphCollection iParagraphCollection, int i) {
        for (int count = iParagraphCollection.getCount() - 1; count >= 0; count--) {
            Paragraph paragraph = (Paragraph) iParagraphCollection.get_Item(count);
            if (paragraph.getParagraphFormat().getBullet().getType() != 0 && paragraph.getParagraphFormat().getBullet().getType() != -1 && paragraph.getParagraphFormat().getDepth() == i - 1) {
                return paragraph;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    private static void m74105kk(TextFrame textFrame, com.aspose.slides.internal.p332p7.rsv rsvVar) {
        if (rsvVar == null) {
            return;
        }
        textFrame.getTextFrameFormat().setAutofitType(rsvVar.m40457ck() == 1 ? (byte) 2 : (byte) 0);
    }

    /* JADX INFO: renamed from: to */
    private static void m74106to(TextFrame textFrame, com.aspose.slides.internal.p332p7.rsv rsvVar) {
        int iM40506up;
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (rsvVar == null || (iM40506up = rsvVar.m40506up()) == 0) {
            return;
        }
        if (iM40506up == 1) {
            textFrame.getTextFrameFormat().setWrapText((byte) 0);
        } else {
            if (iM40506up != 2) {
                throw new ArgumentOutOfRangeException();
            }
            textFrame.getTextFrameFormat().setWrapText((byte) 1);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74107x1(TextFrame textFrame, com.aspose.slides.internal.p332p7.mdp mdpVar) {
        ITextFrameFormat textFrameFormat;
        byte b;
        if (mdpVar == null) {
            return;
        }
        switch (mdpVar.m36874kk()) {
            case 0:
            case 3:
            case 4:
                return;
            case 1:
                textFrameFormat = textFrame.getTextFrameFormat();
                b = 0;
                break;
            case 2:
                textFrameFormat = textFrame.getTextFrameFormat();
                b = 2;
                break;
            case 5:
                textFrameFormat = textFrame.getTextFrameFormat();
                b = 1;
                break;
            case 6:
                textFrameFormat = textFrame.getTextFrameFormat();
                b = 3;
                break;
            default:
                throw new ArgumentOutOfRangeException();
        }
        textFrameFormat.setAnchoringType(b);
    }

    /* JADX INFO: renamed from: k4 */
    public static Paragraph m74091k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.ok7 ok7Var, com.aspose.slides.internal.p332p7.w7y w7yVar, wxb wxbVar, gga ggaVar) {
        Paragraph paragraph = new Paragraph();
        textFrame.getParagraphs().add(paragraph);
        fmm.m6229k4(paragraph, textFrame, ok7Var, wxbVar, ggaVar);
        return paragraph;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74108x1(TextFrame textFrame, com.aspose.slides.internal.p332p7.rsv rsvVar) {
        if (rsvVar == null) {
            return;
        }
        int iM40468fa = rsvVar.m40468fa();
        if (iM40468fa == 0) {
            textFrame.getTextFrameFormat().setAnchoringType((byte) -1);
            return;
        }
        if (iM40468fa == 1) {
            textFrame.getTextFrameFormat().setAnchoringType((byte) 0);
            return;
        }
        if (iM40468fa == 2) {
            textFrame.getTextFrameFormat().setAnchoringType((byte) 1);
        } else if (iM40468fa == 3) {
            textFrame.getTextFrameFormat().setAnchoringType((byte) 2);
        } else {
            if (iM40468fa != 4) {
                throw new ArgumentOutOfRangeException();
            }
            textFrame.getTextFrameFormat().setAnchoringType((byte) 3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Paragraph m74092k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.ok7 ok7Var, wxb wxbVar, gga ggaVar) {
        Paragraph paragraph = new Paragraph();
        textFrame.getParagraphs().add(paragraph);
        fmm.m6229k4(paragraph, textFrame, ok7Var, wxbVar, ggaVar);
        return paragraph;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74109x1(TextFrame textFrame, String str, wxb wxbVar) {
        if (str == null) {
            throw new ArgumentNullException("drawStyleName");
        }
        if (wxbVar.m4421kk().containsKey(str)) {
            com.aspose.slides.internal.p332p7.lzc lzcVar = wxbVar.m4421kk().get_Item(str);
            String name = AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) com.aspose.slides.internal.p332p7.wxb.class), Integer.valueOf(lzcVar.m36549kk()));
            if (wxbVar.m72960x1().m69243kk().containsKey(name)) {
                m74106to(textFrame, (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", wxbVar.m72960x1().m69243kk().get_Item(name).m43109x1()));
            }
            com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
            com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar.m36550to());
            m74096k4(textFrame, rsvVar);
            m74095k4(textFrame, mdpVar);
            m74108x1(textFrame, rsvVar);
            m74105kk(textFrame, rsvVar);
            m74106to(textFrame, rsvVar);
            m74094k4(textFrame, lzcVar, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74093k4(Paragraph paragraph, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar) {
        C13674j6.m63225k4(paragraph.getParagraphFormat(), (PortionCollection) paragraph.getPortions(), w7yVar, i, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74094k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("styleElementData");
        }
        if (wgi.m72731kk(lzcVar.m36551x1()) && wxbVar.m72960x1().m69235c5().containsKey(lzcVar.m36551x1())) {
            com.aspose.slides.internal.p332p7.lzc lzcVar2 = wxbVar.m72960x1().m69235c5().get_Item(lzcVar.m36551x1());
            com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar2.m36550to());
            if (rsvVar != null) {
                m74096k4(textFrame, rsvVar);
                m74108x1(textFrame, rsvVar);
            }
            com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar2.m36550to());
            if (mdpVar != null) {
                if (mdpVar.m36887x1() != -1) {
                    ((TextFrameFormat) textFrame.getTextFrameFormat()).m2945dy(mdpVar.m36887x1());
                }
                m74095k4(textFrame, mdpVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74095k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.mdp mdpVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (mdpVar == null) {
            return;
        }
        if (wgi.m72731kk(mdpVar.m36861dy())) {
            double dM72703h4 = (float) wgi.m72703h4(mdpVar.m36861dy());
            if (!C14044b3.m66437kk(dM72703h4)) {
                textFrame.getTextFrameFormat().setMarginBottom(dM72703h4);
            }
        }
        if (wgi.m72731kk(mdpVar.m36878m9())) {
            double dM72703h42 = (float) wgi.m72703h4(mdpVar.m36878m9());
            if (!C14044b3.m66437kk(dM72703h42)) {
                textFrame.getTextFrameFormat().setMarginTop(dM72703h42);
            }
        }
        if (wgi.m72731kk(mdpVar.m36882to())) {
            double dM72703h43 = (float) wgi.m72703h4(mdpVar.m36882to());
            if (!C14044b3.m66437kk(dM72703h43)) {
                textFrame.getTextFrameFormat().setMarginLeft(dM72703h43);
            }
        }
        if (wgi.m72731kk(mdpVar.m36859du())) {
            double dM72703h44 = (float) wgi.m72703h4(mdpVar.m36859du());
            if (C14044b3.m66437kk(dM72703h44)) {
                return;
            }
            textFrame.getTextFrameFormat().setMarginRight(dM72703h44);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74096k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.rsv rsvVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (rsvVar == null) {
            return;
        }
        if (wgi.m72731kk(rsvVar.m40494qq())) {
            textFrame.getTextFrameFormat().setMarginBottom((float) wgi.m72703h4(rsvVar.m40494qq()));
        }
        if (wgi.m72731kk(rsvVar.m40512wl())) {
            textFrame.getTextFrameFormat().setMarginTop((float) wgi.m72703h4(rsvVar.m40512wl()));
        }
        if (wgi.m72731kk(rsvVar.m40502u4())) {
            textFrame.getTextFrameFormat().setMarginLeft((float) wgi.m72703h4(rsvVar.m40502u4()));
        }
        if (wgi.m72731kk(rsvVar.m40508uz())) {
            textFrame.getTextFrameFormat().setMarginRight((float) wgi.m72703h4(rsvVar.m40508uz()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74097k4(TextFrame textFrame, nh5 nh5Var, IGenericList<C7394ca> iGenericList, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar, gga ggaVar) {
        int i2;
        boolean z;
        TextFrame textFrame2;
        nh5 nh5Var2;
        gga ggaVar2;
        Paragraph paragraphM74090k4;
        int i3 = i;
        wxb wxbVar2 = wxbVar;
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (iGenericList == null) {
            throw new ArgumentNullException("textElementsList");
        }
        m74099k4(textFrame, nh5Var, wxbVar2);
        IGenericEnumerator<C7394ca> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (ContextChain.TAG_PRODUCT.equals(next.m29539k4())) {
                    com.aspose.slides.internal.p332p7.ok7 ok7Var = (com.aspose.slides.internal.p332p7.ok7) next.m29542x1();
                    if (w7yVar == null) {
                        Paragraph paragraphM74092k4 = m74092k4(textFrame, ok7Var, wxbVar2, ggaVar);
                        if (C14113y2.m67411k4(paragraphM74092k4.getText()) && (paragraphM74090k4 = m74090k4(textFrame.getParagraphs(), i3)) != null) {
                            paragraphM74092k4.getParagraphFormat().getBullet().setType(paragraphM74090k4.getParagraphFormat().getBullet().getType());
                            paragraphM74092k4.getParagraphFormat().getBullet().setNumberedBulletStyle(paragraphM74090k4.getParagraphFormat().getBullet().getNumberedBulletStyle());
                            paragraphM74092k4.getParagraphFormat().getBullet().setHeight(paragraphM74090k4.getParagraphFormat().getBullet().getHeight());
                        }
                        i2 = i3;
                    } else {
                        com.aspose.slides.internal.p332p7.ok7[] ok7VarArr = {ok7Var};
                        if (iGenericList.size() == 1) {
                            z = true;
                            textFrame2 = textFrame;
                            ggaVar2 = ggaVar;
                            nh5Var2 = nh5Var;
                        } else {
                            z = false;
                            textFrame2 = textFrame;
                            nh5Var2 = nh5Var;
                            ggaVar2 = ggaVar;
                        }
                        m74100k4(textFrame2, nh5Var2, ok7VarArr, z, w7yVar, i3, wxbVar2, ggaVar2);
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                    if ("list".equals(next.m29539k4())) {
                        com.aspose.slides.internal.p332p7.lxj lxjVar = (com.aspose.slides.internal.p332p7.lxj) next.m29542x1();
                        com.aspose.slides.internal.p332p7.w7y w7yVar2 = wxbVar.m4422to().containsKey(lxjVar.m36514kk()) ? wxbVar.m4422to().get_Item(lxjVar.m36514kk()) : w7yVar;
                        if (m74104k4(w7yVar2, i2)) {
                            m74098k4(textFrame, nh5Var, w7yVar, i2 + 1, wxbVar, ggaVar, lxjVar);
                        } else {
                            if (lxjVar.m36515to() != null) {
                                m74097k4(textFrame, nh5Var, lxjVar.m36515to().m39030k4(), w7yVar2, 0, wxbVar, ggaVar);
                            }
                            for (com.aspose.slides.internal.p332p7.aq8 aq8Var : lxjVar.m36511du()) {
                                m74097k4(textFrame, nh5Var, aq8Var.m28416k4(), w7yVar2, i2 + 1, wxbVar, ggaVar);
                            }
                        }
                    }
                }
                wxbVar2 = wxbVar;
                i3 = i2;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74098k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar, gga ggaVar, com.aspose.slides.internal.p332p7.lxj lxjVar) {
        List.Enumerator<C7394ca> it;
        if (lxjVar.m36515to() != null) {
            it = lxjVar.m36515to().m39030k4().iterator();
            while (it.hasNext()) {
                try {
                    C7394ca next = it.next();
                    if (ContextChain.TAG_PRODUCT.equals(next.m29539k4())) {
                        m74097k4(textFrame, nh5Var, (IGenericList<C7394ca>) AbstractC14092to.m67204k4((Object[]) new C7394ca[]{next}), w7yVar, i, wxbVar, ggaVar);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        for (com.aspose.slides.internal.p332p7.aq8 aq8Var : lxjVar.m36511du()) {
            it = aq8Var.m28416k4().iterator();
            while (it.hasNext()) {
                try {
                    C7394ca next2 = it.next();
                    if (ContextChain.TAG_PRODUCT.equals(next2.m29539k4())) {
                        m74097k4(textFrame, nh5Var, (IGenericList<C7394ca>) AbstractC14092to.m67204k4((Object[]) new C7394ca[]{next2}), w7yVar, i, wxbVar, ggaVar);
                    } else if ("list".equals(next2.m29539k4())) {
                        com.aspose.slides.internal.p332p7.aq8[] aq8VarArrM36511du = ((com.aspose.slides.internal.p332p7.lxj) next2.m29542x1()).m36511du();
                        int length = aq8VarArrM36511du.length;
                        int i2 = 0;
                        while (i2 < length) {
                            int i3 = i2;
                            m74097k4(textFrame, nh5Var, aq8VarArrM36511du[i2].m28416k4(), w7yVar, i + 1, wxbVar, ggaVar);
                            i2 = i3 + 1;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74099k4(TextFrame textFrame, nh5 nh5Var, wxb wxbVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (!C14113y2.m67411k4(nh5Var.m68028x1())) {
            m74109x1(textFrame, nh5Var.m68028x1(), wxbVar);
        }
        if (C14113y2.m67411k4(nh5Var.m68027kk())) {
            return;
        }
        m74102k4(textFrame, nh5Var.m68027kk(), wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74100k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.ok7[] ok7VarArr, boolean z, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar, gga ggaVar) {
        for (com.aspose.slides.internal.p332p7.ok7 ok7Var : ok7VarArr) {
            if (ok7Var == null) {
                throw new InvalidOperationException();
            }
            Paragraph paragraphM74091k4 = m74091k4(textFrame, ok7Var, w7yVar, wxbVar, ggaVar);
            if (wgi.m72731kk(nh5Var.m68026k4())) {
                wr8.m72898k4(paragraphM74091k4, nh5Var.m68026k4(), wxbVar);
            }
            m74093k4(paragraphM74091k4, w7yVar, i, wxbVar);
            if (C14113y2.m67363du(C14113y2.f47374k4, paragraphM74091k4.m2168to()) && z && paragraphM74091k4.getPortions().getCount() == 1) {
                paragraphM74091k4.getPortions().get_Item(0).setText(" ");
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74101k4(TextFrame textFrame, wxb wxbVar) {
        textFrame.getTextFrameFormat().setAnchoringType((byte) -1);
        textFrame.getTextFrameFormat().setCenterText((byte) 1);
        textFrame.getTextFrameFormat().setMarginTop(0.0d);
        textFrame.getTextFrameFormat().setMarginRight(0.0d);
        textFrame.getTextFrameFormat().setMarginBottom(0.0d);
        textFrame.getTextFrameFormat().setMarginLeft(0.0d);
        ((TextFrameFormat) textFrame.getTextFrameFormat()).m2945dy((byte) -1);
        textFrame.getParagraphs().clear();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74102k4(TextFrame textFrame, String str, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.mdp mdpVar;
        if (str == null) {
            throw new ArgumentNullException("textStyleName");
        }
        if (wxbVar.m4421kk().containsKey(str)) {
            com.aspose.slides.internal.p332p7.lzc lzcVar = wxbVar.m4421kk().get_Item(str);
            if (lzcVar.m36549kk() == 2 || (mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar.m36550to())) == null) {
                return;
            }
            m74107x1(textFrame, mdpVar);
            m74095k4(textFrame, mdpVar);
            if (C14044b3.m66437kk(wgi.m72703h4(mdpVar.m36865h4()))) {
                return;
            }
            textFrame.getTextFrameFormat().setMarginTop((float) r2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74103k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.ok7[] ok7VarArr, wxb wxbVar, gga ggaVar) {
        for (com.aspose.slides.internal.p332p7.ok7 ok7Var : ok7VarArr) {
            if (ok7Var == null) {
                throw new InvalidOperationException();
            }
            m74092k4(textFrame, ok7Var, wxbVar, ggaVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m74104k4(com.aspose.slides.internal.p332p7.w7y w7yVar, int i) {
        if (w7yVar == null) {
            return true;
        }
        List.Enumerator<C7394ca> it = w7yVar.m43546x1().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (f50408k4.m27428k4(next.m29539k4()) == 0) {
                    com.aspose.slides.internal.p332p7.pcw pcwVar = (com.aspose.slides.internal.p332p7.pcw) next.m29542x1();
                    if ((pcwVar.m38862kk() & 4294967295L) == i + 1) {
                        return C14113y2.m67411k4(pcwVar.m38865to());
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }
}

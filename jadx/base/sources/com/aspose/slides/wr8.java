package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wr8 {
    /* JADX INFO: renamed from: k4 */
    public static com.aspose.slides.internal.p332p7.lzc m72892k4(String str, wxb wxbVar) {
        IGenericDictionary<String, com.aspose.slides.internal.p332p7.lzc> iGenericDictionaryM69235c5;
        if (wxbVar.m4421kk().containsKey(str)) {
            iGenericDictionaryM69235c5 = wxbVar.m4421kk();
        } else {
            if (!wxbVar.m72960x1().m69235c5().containsKey(str)) {
                return null;
            }
            iGenericDictionaryM69235c5 = wxbVar.m72960x1().m69235c5();
        }
        return iGenericDictionaryM69235c5.get_Item(str);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72905x1(Paragraph paragraph, String str, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = m72892k4(C14113y2.m67402k4("{0}outline{1}", str, Integer.valueOf(paragraph.getParagraphFormat().getDepth() + 1)), wxbVar);
        if (lzcVarM72892k4 == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVarM72892k4.m36550to());
        if (mdpVar != null) {
            if (wgi.m72731kk(mdpVar.m36878m9())) {
                paragraph.getParagraphFormat().setSpaceBefore(((float) wgi.m72703h4(mdpVar.m36878m9())) * (-1.0f));
            }
            double dM72703h4 = wgi.m72703h4(mdpVar.m36861dy());
            if (!C14044b3.m66437kk(dM72703h4) && dM72703h4 != 0.0d && paragraph.getParagraphFormat().getSpaceAfter() != 0.0f) {
                paragraph.getParagraphFormat().setSpaceAfter(((float) dM72703h4) * (-1.0f));
            }
            double dM72703h42 = wgi.m72703h4(mdpVar.m36882to());
            if (!C14044b3.m66437kk(dM72703h42) && dM72703h42 != 0.0d && paragraph.getParagraphFormat().getMarginLeft() != 0.0f) {
                paragraph.getParagraphFormat().setMarginLeft((float) dM72703h42);
            }
        }
        com.aspose.slides.internal.p332p7.zob zobVar = (com.aspose.slides.internal.p332p7.zob) wgi.m72712k4(com.aspose.slides.internal.p332p7.zob.class, "text-properties", lzcVarM72892k4.m36550to());
        if (zobVar != null) {
            ap3.m3702k4(paragraph.getParagraphFormat(), zobVar, wxbVar);
            IGenericEnumerator<IPortion> it = paragraph.getPortions().iterator();
            while (it.hasNext()) {
                try {
                    Portion portion = (Portion) it.next();
                    if (C14044b3.m66437kk(portion.getPortionFormat().getFontHeight())) {
                        portion.getPortionFormat().setFontHeight(paragraph.getParagraphFormat().getDefaultPortionFormat().getFontHeight());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72893k4(AutoShape autoShape, nh5 nh5Var, wxb wxbVar) {
        if (autoShape == null) {
            throw new ArgumentNullException("autoShape");
        }
        if (nh5Var == null) {
            throw new ArgumentNullException("propertiesProviderContext");
        }
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = m72892k4(nh5Var.m68026k4(), wxbVar);
        if (lzcVarM72892k4 == null) {
            throw new InvalidOperationException(C14113y2.m67402k4("Style with id {0} not found", nh5Var.m68026k4()));
        }
        if (wgi.m72731kk(lzcVarM72892k4.m36551x1())) {
            com.aspose.slides.internal.p332p7.lzc lzcVarM72892k42 = m72892k4(lzcVarM72892k4.m36551x1(), wxbVar);
            if (lzcVarM72892k42 == null) {
                throw new InvalidOperationException(C14113y2.m67402k4("Parent style with id {0} not found", nh5Var.m68026k4()));
            }
            String[] strArr = {null};
            boolean zM72904k4 = m72904k4(lzcVarM72892k42.m36546k4(), strArr, new int[]{0});
            String str = strArr[0];
            if (zM72904k4) {
                IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        Paragraph paragraph = (Paragraph) it.next();
                        if (dcz.m5051k4(paragraph, new byte[]{0})) {
                            m72905x1(paragraph, str, wxbVar);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72894k4(AutoShape autoShape, String str, wxb wxbVar) {
        if (autoShape == null) {
            throw new ArgumentNullException("autoShape");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw(autoShape.getLineFormat(), autoShape.getFillFormat(), autoShape.getEffectFormat(), null, null, (TextFrameFormat) autoShape.getTextFrame().getTextFrameFormat()), str, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72895k4(Connector connector, String str, wxb wxbVar) {
        if (connector == null) {
            throw new ArgumentNullException("connector");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw(connector.getLineFormat(), connector.getFillFormat()), str, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72896k4(IBaseSlide iBaseSlide, String str, wxb wxbVar) {
        if (iBaseSlide == null) {
            throw new ArgumentNullException("slide");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw(null, iBaseSlide.getBackground().getFillFormat(), null, null, null, null), str, wxbVar);
        if (iBaseSlide.getBackground().getFillFormat().getFillType() != -1) {
            iBaseSlide.getBackground().setType((byte) 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72897k4(IParagraphCollection iParagraphCollection, String str, wxb wxbVar) {
        if (iParagraphCollection == null) {
            throw new ArgumentNullException("portion");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        IGenericEnumerator<IParagraph> it = iParagraphCollection.iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = ((Paragraph) it.next()).getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        Portion portion = (Portion) it2.next();
                        m72903k4(new dxw(portion.getPortionFormat().getLineFormat(), portion.getPortionFormat().getFillFormat()), str, wxbVar);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72898k4(Paragraph paragraph, String str, wxb wxbVar) {
        if (paragraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw((ParagraphFormat) paragraph.getParagraphFormat()), str, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72899k4(PictureFrame pictureFrame, com.aspose.slides.internal.p332p7.cuq cuqVar, String str, wxb wxbVar) {
        if (pictureFrame == null) {
            throw new ArgumentNullException("pictureFrame");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw(pictureFrame.getLineFormat(), pictureFrame.getFillFormat(), pictureFrame.getEffectFormat()), str, wxbVar);
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = m72892k4(str, wxbVar);
        if (lzcVarM72892k4 != null) {
            ap3.m3704k4(pictureFrame, cuqVar, lzcVarM72892k4, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72900k4(Portion portion, String str, wxb wxbVar) {
        if (portion == null) {
            throw new ArgumentNullException("portion");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw((PortionFormat) portion.getPortionFormat()), str, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72901k4(TextFrame textFrame, String str, wxb wxbVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("styleId");
        }
        m72903k4(new dxw((TextFrameFormat) textFrame.getTextFrameFormat()), str, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72902k4(dxw dxwVar, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (dxwVar.m5317k4() == null || dxwVar.m5320x1() == null) {
            if (dxwVar.m5317k4() != null) {
                ap3.m3701k4(dxwVar.m5317k4(), lzcVar, wxbVar);
            }
            if (dxwVar.m5320x1() != null) {
                ap3.m3699k4(dxwVar.m5320x1(), lzcVar, wxbVar);
            }
        } else {
            ap3.m3700k4(dxwVar.m5317k4(), dxwVar.m5320x1(), lzcVar, wxbVar);
        }
        if (dxwVar.m5318kk() != null) {
            ap3.m3698k4(dxwVar.m5318kk(), lzcVar, wxbVar);
        }
        if (dxwVar.m5319to() != null) {
            ap3.m3705k4(dxwVar.m5319to(), lzcVar, wxbVar);
        }
        if (dxwVar.m5315du() == null && dxwVar.m5316h4() == null) {
            return;
        }
        ap3.m3703k4(dxwVar.m5315du(), dxwVar.m5316h4(), lzcVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72903k4(dxw dxwVar, String str, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = m72892k4(str, wxbVar);
        if (lzcVarM72892k4 == null) {
            return;
        }
        if (wgi.m72731kk(lzcVarM72892k4.m36551x1())) {
            m72903k4(dxwVar, lzcVarM72892k4.m36551x1(), wxbVar);
        } else {
            String name = AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) com.aspose.slides.internal.p332p7.wxb.class), Integer.valueOf(lzcVarM72892k4.m36549kk()));
            if (wxbVar.m72960x1().m69243kk().containsKey(name)) {
                com.aspose.slides.internal.p332p7.vht vhtVar = wxbVar.m72960x1().m69243kk().get_Item(name);
                com.aspose.slides.internal.p332p7.lzc lzcVar = new com.aspose.slides.internal.p332p7.lzc();
                List.Enumerator<C7394ca> it = vhtVar.m43109x1().iterator();
                while (it.hasNext()) {
                    try {
                        lzcVar.m36548k4(it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                m72902k4(dxwVar, lzcVar, wxbVar);
            }
        }
        m72902k4(dxwVar, lzcVarM72892k4, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m72904k4(String str, String[] strArr, int[] iArr) {
        strArr[0] = null;
        iArr[0] = 0;
        int iM67430to = C14113y2.m67430to(str, "outline");
        if (iM67430to + 8 != str.length()) {
            return false;
        }
        int[] iArr2 = {0};
        boolean zM66590k4 = C14057f9.m66590k4(C14113y2.m67443x1(str, str.length() - 1, 1), iArr2);
        int i = iArr2[0];
        if (!zM66590k4) {
            return false;
        }
        strArr[0] = C14113y2.m67443x1(str, 0, iM67430to);
        iArr[0] = i;
        return true;
    }
}

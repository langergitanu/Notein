package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ugr {
    /* JADX INFO: renamed from: k4 */
    public static String m71684k4(ITextFrame iTextFrame, ls9 ls9Var) {
        return m71685k4(iTextFrame, ls9Var, false, (byte) 1);
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericEnumerable<String> m71697x1(String str) {
        if (C14113y2.m67359c5(str, IOUtils.LINE_SEPARATOR_WINDOWS)) {
            str = C14113y2.m67401k4(str, IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (C14113y2.m67359c5(str, "\n\r")) {
            str = C14113y2.m67401k4(str, IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (C14113y2.m67359c5(str, IOUtils.LINE_SEPARATOR_UNIX)) {
            return AbstractC14092to.m67204k4((Object[]) C14113y2.m67414k4(str, '\n'));
        }
        if (C14113y2.m67359c5(str, "\r")) {
            return AbstractC14092to.m67204k4((Object[]) C14113y2.m67414k4(str, ControlChar.PARAGRAPH_BREAK_CHAR));
        }
        if (C14113y2.m67359c5(str, "\u000b")) {
            return AbstractC14092to.m67204k4((Object[]) C14113y2.m67414k4(str, ControlChar.LINE_BREAK_CHAR));
        }
        List list = new List();
        list.addItem(str);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m71685k4(ITextFrame iTextFrame, ls9 ls9Var, boolean z, byte b) {
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (i < iTextFrame.getParagraphs().getCount()) {
            String strM71689k4 = m71689k4(ls9Var, iTextFrame.getParagraphs().get_Item(i), z, b, i == iTextFrame.getParagraphs().getCount() - 1);
            if (!C14113y2.m67411k4(strM71689k4)) {
                if (i < iTextFrame.getParagraphs().getCount() - 1) {
                    strM71689k4 = ls9Var.m64571to(strM71689k4);
                }
                c6765kp.m26792k4(strM71689k4);
            }
            i++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private static String m71698x1(String str, ls9 ls9Var) {
        String strM67402k4;
        String strM64566kk = ls9Var.m64566kk();
        String strM67537ne = C14113y2.f47374k4;
        C6765kp c6765kp = new C6765kp();
        int length = strM64566kk.length();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + length;
            if (i2 > str.length() - 1) {
                c6765kp.m26780k4(str.charAt(i));
            } else {
                String strM67443x1 = C14113y2.m67443x1(str, i, length);
                if (C14113y2.m67363du(strM67443x1, strM64566kk)) {
                    if (C14113y2.m67363du(strM67537ne, strM64566kk)) {
                        strM67402k4 = i2 == str.length() + (-1) ? C14113y2.m67402k4("{0}{1}{0}", strM64566kk, "&nbsp;") : C14113y2.m67402k4("{0}{1}{0}{0}", strM64566kk, "&nbsp;");
                    } else if (C14113y2.m67363du(strM67537ne, "&nbsp;")) {
                        strM67402k4 = i2 == str.length() + (-1) ? C14113y2.m67402k4("{0}{1}", "&nbsp;", strM64566kk) : C14113y2.m67402k4("{0}{1}{1}", "&nbsp;", strM64566kk);
                    } else {
                        c6765kp.m26792k4(strM67443x1);
                        i += length - 1;
                        strM67537ne = strM64566kk;
                    }
                    c6765kp.m26792k4(strM67402k4);
                    i += length - 1;
                    strM67537ne = "&nbsp;";
                } else {
                    strM67537ne = C14117yj.m67537ne(str.charAt(i));
                    c6765kp.m26780k4(str.charAt(i));
                }
            }
            i++;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71686k4(ls9 ls9Var, IHyperlink iHyperlink, String str, C6765kp c6765kp) {
        if (iHyperlink == null) {
            if (C14113y2.m67411k4(str)) {
                return C14113y2.f47374k4;
            }
            c6765kp.m26792k4(ls9Var.m64557h4(str));
            return C14113y2.f47374k4;
        }
        if (C14113y2.m67411k4(str)) {
            c6765kp.m26792k4(ls9Var.m64573x1());
            return iHyperlink.getExternalUrl();
        }
        if (C14113y2.m67363du(str, iHyperlink.getExternalUrl())) {
            return str;
        }
        c6765kp.m26792k4(ls9Var.m64557h4(str));
        c6765kp.m26792k4(ls9Var.m64573x1());
        return iHyperlink.getExternalUrl();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71687k4(ls9 ls9Var, IMathPortion iMathPortion) {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<IMathElement> it = iMathPortion.getMathParagraph().iterator();
        while (it.hasNext()) {
            try {
                it = it.next().iterator();
                while (it.hasNext()) {
                    try {
                        IMathElement next = it.next();
                        MathSuperscriptElement mathSuperscriptElement = (MathSuperscriptElement) C7019kk.m27452k4((Object) next, MathSuperscriptElement.class);
                        String strM71694k4 = (mathSuperscriptElement == null || !ls9Var.m64565k4(4)) ? null : m71694k4(ls9Var, mathSuperscriptElement);
                        MathSubscriptElement mathSubscriptElement = (MathSubscriptElement) C7019kk.m27452k4((Object) next, MathSubscriptElement.class);
                        if (mathSubscriptElement != null && ls9Var.m64565k4(8)) {
                            strM71694k4 = m71693k4(ls9Var, mathSubscriptElement);
                        }
                        if (!C14113y2.m67411k4(strM71694k4)) {
                            c6765kp.m26792k4(strM71694k4);
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
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71688k4(ls9 ls9Var, IParagraph iParagraph, String str, byte b) {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<String> it = m71697x1(str).iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                if (C14113y2.m67411k4(next)) {
                    c6765kp.m26792k4(ls9Var.m64566kk());
                } else {
                    String strM64560k4 = ls9Var.m64560k4(next, b);
                    if (iParagraph.getParagraphFormat().getBullet() != null && iParagraph.getParagraphFormat().getBullet().getType() != 0 && iParagraph.getParagraphFormat().getBullet().getType() != -1) {
                        strM64560k4 = iParagraph.getParagraphFormat().getBullet().getType() != 2 ? ls9Var.m64575x1(next, iParagraph.getParagraphFormat().getDepth()) : ls9Var.m64562k4(next, (int) iParagraph.getParagraphFormat().getDepth());
                    }
                    c6765kp.m26792k4(strM64560k4);
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
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71689k4(ls9 ls9Var, IParagraph iParagraph, boolean z, byte b, boolean z2) {
        String strM71691k4 = m71691k4(ls9Var, iParagraph.getPortions());
        if (!z) {
            return strM71691k4;
        }
        if (!C14113y2.m67411k4(strM71691k4)) {
            return m71698x1(m71688k4(ls9Var, iParagraph, strM71691k4, b), ls9Var);
        }
        Object[] objArr = {ls9Var.m64566kk(), "&nbsp;"};
        return !z2 ? C14113y2.m67402k4("{0}{1}{0}", objArr) : C14113y2.m67402k4("{0}{1}", objArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71690k4(ls9 ls9Var, IPortion iPortion) {
        IMathPortion iMathPortion = (IMathPortion) C7019kk.m27452k4((Object) iPortion, IMathPortion.class);
        String text = iPortion.getText();
        if (iMathPortion != null) {
            text = m71687k4(ls9Var, iMathPortion);
        }
        if (C14113y2.m67411k4(text)) {
            return text;
        }
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<String> it = m71697x1(text).iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                c6765kp.m26792k4(C14113y2.m67411k4(next) ? ls9Var.m64566kk() : m71692k4(ls9Var, iPortion.getPortionFormat(), next));
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
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71691k4(ls9 ls9Var, IPortionCollection iPortionCollection) {
        C6765kp c6765kp = new C6765kp();
        String strM71686k4 = C14113y2.f47374k4;
        for (int i = 0; i < iPortionCollection.getCount(); i++) {
            IPortion iPortion = iPortionCollection.get_Item(i);
            strM71686k4 = m71686k4(ls9Var, iPortion.getPortionFormat().getHyperlinkClick(), strM71686k4, c6765kp);
            c6765kp.m26792k4(m71690k4(ls9Var, iPortion));
            if (i == iPortionCollection.getCount() - 1 && !C14113y2.m67363du(strM71686k4, C14113y2.f47374k4)) {
                c6765kp.m26792k4(ls9Var.m64557h4(strM71686k4));
                strM71686k4 = null;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71692k4(ls9 ls9Var, IPortionFormat iPortionFormat, String str) {
        String strM67421kk;
        int length;
        if (C14113y2.m67411k4(str)) {
            return C14113y2.f47374k4;
        }
        boolean zM67424kk = C14113y2.m67424kk(str, " ");
        boolean zM67448x1 = C14113y2.m67448x1(str, " ");
        int length2 = 0;
        if (zM67424kk) {
            strM67421kk = C14113y2.m67362du(str, new char[0]);
            length = str.length() - strM67421kk.length();
        } else {
            strM67421kk = str;
            length = 0;
        }
        if (zM67448x1) {
            strM67421kk = C14113y2.m67421kk(strM67421kk);
            length2 = (str.length() - strM67421kk.length()) - length;
        }
        String strM64556dy = ls9Var.m64556dy(strM67421kk);
        if (C14113y2.m67411k4(strM64556dy)) {
            return m71695k4(str);
        }
        String strM71696k4 = m71696k4(strM64556dy, ls9Var);
        if (iPortionFormat.getStrikethroughType() != 0 && iPortionFormat.getStrikethroughType() != -1 && ls9Var.m64565k4(2)) {
            strM71696k4 = ls9Var.m64567kk(strM71696k4);
        }
        if (iPortionFormat.getFontItalic() == 1) {
            strM71696k4 = ls9Var.m64574x1(strM71696k4);
        }
        if (iPortionFormat.getFontUnderline() != 0 && iPortionFormat.getFontUnderline() != -1 && ls9Var.m64565k4(16)) {
            strM71696k4 = ls9Var.m64554du(strM71696k4);
        }
        if (iPortionFormat.getFontBold() == 1) {
            strM71696k4 = ls9Var.m64559k4(strM71696k4);
        }
        return m71695k4(ls9Var.m64563k4(strM71696k4, length2, length));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71693k4(ls9 ls9Var, MathSubscriptElement mathSubscriptElement) {
        MathematicalText mathematicalText = (MathematicalText) C7019kk.m27452k4((Object) mathSubscriptElement.getBase(), MathematicalText.class);
        MathematicalText mathematicalText2 = (MathematicalText) C7019kk.m27452k4((Object) mathSubscriptElement.getSubscript(), MathematicalText.class);
        if (mathematicalText == null) {
            throw new InvalidCastException("Subscript text element has wrong type of base element.");
        }
        if (mathematicalText2 != null) {
            return ls9Var.m64569kk(m71692k4(ls9Var, mathematicalText.getFormat(), mathematicalText.getValue()), m71692k4(ls9Var, mathematicalText2.getFormat(), mathematicalText2.getValue()));
        }
        throw new InvalidCastException("Subscript text element has wrong type of subscript element.");
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71694k4(ls9 ls9Var, MathSuperscriptElement mathSuperscriptElement) {
        MathematicalText mathematicalText = (MathematicalText) C7019kk.m27452k4((Object) mathSuperscriptElement.getBase(), MathematicalText.class);
        MathematicalText mathematicalText2 = (MathematicalText) C7019kk.m27452k4((Object) mathSuperscriptElement.getSuperscript(), MathematicalText.class);
        if (mathematicalText == null) {
            throw new InvalidCastException("Subscript text element has wrong type of base element.");
        }
        if (mathematicalText2 != null) {
            return ls9Var.m64572to(m71692k4(ls9Var, mathematicalText.getFormat(), mathematicalText.getValue()), m71692k4(ls9Var, mathematicalText2.getFormat(), mathematicalText2.getValue()));
        }
        throw new InvalidCastException("Subscript text element has wrong type of subscript element.");
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71695k4(String str) {
        C6765kp c6765kp = new C6765kp();
        String strM67537ne = C14113y2.f47374k4;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strM67537ne = C14117yj.m67537ne(str.charAt(i));
                c6765kp.m26792k4(strM67537ne);
            } else {
                String str2 = " ".equals(strM67537ne) ? "&nbsp;" : " ";
                c6765kp.m26792k4(str2);
                strM67537ne = str2;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71696k4(String str, ls9 ls9Var) {
        return C14113y2.m67401k4(C14113y2.m67401k4(str, "\u000b", ls9Var.m64566kk()), "\t", C14113y2.m67389k4(ControlChar.SPACE_CHAR, 4));
    }
}

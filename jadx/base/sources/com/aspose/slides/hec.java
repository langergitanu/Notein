package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p307nz.C6964k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hec {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Character, Character> f5484k4;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f5485x1;

    static {
        Dictionary<Character, Character> dictionary = new Dictionary<>();
        f5484k4 = dictionary;
        dictionary.addItem((char) 8592, (char) 8406);
        dictionary.addItem((char) 8594, (char) 8407);
        dictionary.addItem((char) 8596, (char) 8417);
        dictionary.addItem((char) 8636, (char) 8400);
        dictionary.addItem((char) 8640, (char) 8401);
        f5485x1 = new C7017h4("mrow", "mstyle", "mfrac", "msup", "msub", "msubsup", "msqrt", "mroot", "mover", "munder", "munderover", "menclose", "mfenced", "left", "top", "bottom", "right", "updiagonalstrike", "downdiagonalstrike", "verticalstrike", "horizontalstrike");
    }

    /* JADX INFO: renamed from: k4 */
    private IMathElement m7106k4(List<C12804k4> list, C12804k4 c12804k4) {
        MathDelimiter mathDelimiter = new MathDelimiter(m7109kk(list.get_Item(0)));
        String strMo22721to = c12804k4.mo22721to("open");
        if (!C14113y2.m67411k4(strMo22721to)) {
            mathDelimiter.setBeginningCharacter(C14113y2.m67421kk(strMo22721to).charAt(0));
        }
        String strMo22721to2 = c12804k4.mo22721to("close");
        if (!C14113y2.m67411k4(strMo22721to2)) {
            mathDelimiter.setEndingCharacter(C14113y2.m67421kk(strMo22721to2).charAt(0));
        }
        String strMo22721to3 = c12804k4.mo22721to("separators");
        if (C14113y2.m67411k4(strMo22721to3)) {
            mathDelimiter.setSeparatorCharacter((char) 0);
            return mathDelimiter;
        }
        mathDelimiter.setSeparatorCharacter(C14113y2.m67421kk(strMo22721to3).charAt(0));
        return mathDelimiter;
    }

    /* JADX INFO: renamed from: kk */
    private IMathElement m7109kk(C12804k4 c12804k4) {
        switch (f5485x1.m27428k4(c12804k4.mo22604c5())) {
            case 0:
            case 1:
                if (c12804k4.mo22671yd().mo20312k4() > 0) {
                    return new MathBox(m7111x1(c12804k4));
                }
                return null;
            case 2:
                List<C12804k4> listM7110to = m7110to(c12804k4);
                if (listM7110to.size() > 1) {
                    return new MathFraction(m7109kk(listM7110to.get_Item(0)), m7109kk(listM7110to.get_Item(1)));
                }
                return null;
            case 3:
                List<C12804k4> listM7110to2 = m7110to(c12804k4);
                if (listM7110to2.size() > 1) {
                    return new MathSuperscriptElement(m7109kk(listM7110to2.get_Item(0)), m7109kk(listM7110to2.get_Item(1)));
                }
                return null;
            case 4:
                List<C12804k4> listM7110to3 = m7110to(c12804k4);
                if (listM7110to3.size() > 1) {
                    return new MathSubscriptElement(m7109kk(listM7110to3.get_Item(0)), m7109kk(listM7110to3.get_Item(1)));
                }
                return null;
            case 5:
                List<C12804k4> listM7110to4 = m7110to(c12804k4);
                if (listM7110to4.size() > 2) {
                    return new MathRightSubSuperscriptElement(m7109kk(listM7110to4.get_Item(0)), m7109kk(listM7110to4.get_Item(1)), m7109kk(listM7110to4.get_Item(2)));
                }
                return null;
            case 6:
                List<C12804k4> listM7110to5 = m7110to(c12804k4);
                if (listM7110to5.size() > 0) {
                    IMathElement iMathElementM7109kk = m7109kk(listM7110to5.get_Item(0));
                    if (listM7110to5.size() > 1) {
                        MathBlock mathBlock = new MathBlock(iMathElementM7109kk);
                        for (int i = 1; i < listM7110to5.size(); i++) {
                            mathBlock.add(m7109kk(listM7110to5.get_Item(i)));
                        }
                        iMathElementM7109kk = mathBlock;
                    }
                    MathRadical mathRadical = new MathRadical(iMathElementM7109kk, null);
                    mathRadical.setHideDegree(true);
                    return mathRadical;
                }
                return null;
            case 7:
                List<C12804k4> listM7110to6 = m7110to(c12804k4);
                if (listM7110to6.size() > 1) {
                    return new MathRadical(m7109kk(listM7110to6.get_Item(0)), m7109kk(listM7110to6.get_Item(1)));
                }
                return null;
            case 8:
                List<C12804k4> listM7110to7 = m7110to(c12804k4);
                if (listM7110to7.size() > 1) {
                    return m7108k4(listM7110to7, true);
                }
                return null;
            case 9:
                List<C12804k4> listM7110to8 = m7110to(c12804k4);
                if (listM7110to8.size() > 1) {
                    return m7108k4(listM7110to8, false);
                }
                return null;
            case 10:
                List<C12804k4> listM7110to9 = m7110to(c12804k4);
                if (listM7110to9.size() > 2) {
                    return new MathLimit(m7109kk(listM7110to9.get_Item(0)), m7109kk(listM7110to9.get_Item(1))).setUpperLimit(m7109kk(listM7110to9.get_Item(2)));
                }
                return null;
            case 11:
                List<C12804k4> listM7110to10 = m7110to(c12804k4);
                if (listM7110to10.size() > 0) {
                    return m7107k4(listM7110to10, c12804k4.mo22721to("notation"));
                }
                return null;
            case 12:
                List<C12804k4> listM7110to11 = m7110to(c12804k4);
                if (listM7110to11.size() > 0) {
                    return m7106k4(listM7110to11, c12804k4);
                }
                return null;
            default:
                String strMo22607e0 = c12804k4.mo22607e0();
                if (!C14113y2.m67411k4(strMo22607e0)) {
                    return new MathematicalText(C6964k4.m27221k4(strMo22607e0));
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: to */
    private List<C12804k4> m7110to(C12804k4 c12804k4) {
        List<C12804k4> list = new List<>();
        IGenericEnumerator<InterfaceC12777qq> it = c12804k4.mo22671yd().iterator();
        while (it.hasNext()) {
            try {
                C12804k4 c12804k42 = (C12804k4) C7019kk.m27452k4((Object) it.next(), C12804k4.class);
                if (c12804k42 != null) {
                    list.addItem(c12804k42);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private MathBlock m7111x1(C12804k4 c12804k4) {
        IMathElement iMathElementM7109kk;
        MathBlock mathBlock = new MathBlock();
        IGenericEnumerator<InterfaceC12777qq> it = c12804k4.mo22671yd().iterator();
        while (it.hasNext()) {
            try {
                C12804k4 c12804k42 = (C12804k4) C7019kk.m27452k4((Object) it.next(), C12804k4.class);
                if (c12804k42 != null && (iMathElementM7109kk = m7109kk(c12804k42)) != null) {
                    mathBlock.join(iMathElementM7109kk);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return mathBlock;
    }

    /* JADX INFO: renamed from: k4 */
    private IMathElement m7107k4(List<C12804k4> list, String str) {
        MathBorderBox mathBorderBox = new MathBorderBox(m7109kk(list.get_Item(0)));
        if (!C14113y2.m67411k4(str)) {
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            for (String str2 : C14113y2.m67416k4(str, new char[]{ControlChar.SPACE_CHAR}, (short) 1)) {
                switch (f5485x1.m27428k4(C14113y2.m67361du(str2))) {
                    case 13:
                        z = false;
                        break;
                    case 14:
                        z3 = false;
                        break;
                    case 15:
                        z4 = false;
                        break;
                    case 16:
                        z2 = false;
                        break;
                    case 17:
                        mathBorderBox.setStrikethroughBottomLeftToTopRight(true);
                        break;
                    case 18:
                        mathBorderBox.setStrikethroughTopLeftToBottomRight(true);
                        break;
                    case 19:
                        mathBorderBox.setStrikethroughVertical(true);
                        break;
                    case 20:
                        mathBorderBox.setStrikethroughHorizontal(true);
                        break;
                }
            }
            mathBorderBox.setHideLeft(z);
            mathBorderBox.setHideRight(z2);
            mathBorderBox.setHideTop(z3);
            mathBorderBox.setHideBottom(z4);
        }
        return mathBorderBox;
    }

    /* JADX INFO: renamed from: k4 */
    private IMathElement m7108k4(List<C12804k4> list, boolean z) {
        if ("mo".equals(list.get_Item(1).mo22604c5())) {
            String strM27221k4 = C6964k4.m27221k4(list.get_Item(1).mo22607e0());
            if (!C14113y2.m67411k4(strM27221k4) && strM27221k4.length() == 1) {
                if (!z) {
                    return new MathGroupingCharacter(m7109kk(list.get_Item(0)), strM27221k4.charAt(0), 2, 1);
                }
                Character[] chArr = {0};
                boolean zTryGetValue = f5484k4.tryGetValue(Character.valueOf(strM27221k4.charAt(0)), chArr);
                char cCharValue = chArr[0].charValue();
                if (!zTryGetValue) {
                    cCharValue = strM27221k4.charAt(0);
                }
                try {
                    return new MathAccent(m7109kk(list.get_Item(0)), cCharValue);
                } catch (ArgumentOutOfRangeException unused) {
                    return new MathGroupingCharacter(m7109kk(list.get_Item(0)), cCharValue, 1, 2);
                }
            }
        }
        return new MathLimit(m7109kk(list.get_Item(0)), m7109kk(list.get_Item(1)), z);
    }

    /* JADX INFO: renamed from: k4 */
    public final MathBlock m7112k4(C12804k4 c12804k4) {
        return m7111x1(c12804k4);
    }
}

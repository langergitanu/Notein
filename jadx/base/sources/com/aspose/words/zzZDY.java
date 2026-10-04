package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDY {
    private static double[] zzYkn = {7.5d, 10.0d, 12.0d, 13.5d, 18.0d, 24.0d, 36.0d};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "right", "center", "justify", "decimal", "bar", "list", "clear", "none", "dots", "dashes", "line", "heavy", "middledot", "inline", "topbottom", "square", "tight", "through", "margin", "page", "column", FirebaseAnalytics.Param.CHARACTER, "leftmargin", "rightmargin", "insidemargin", "outsidemargin", "paragraph", "topmargin", "bottommargin", "top", "middle", "bottom", "rtl", "ltr", "-aw-start", "around", "auto", "no-wrap-beside", "at-least", "exactly", "inside", "outside");

    public static boolean isWhitespace(char c) {
        return c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ';
    }

    public static String zz2(com.aspose.words.internal.zzPV zzpv) {
        return com.aspose.words.internal.zzZKN.format("#{0:X2}{1:X2}{2:X2}", Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()));
    }

    public static int zzG(String str, int i, int i2) {
        int iZzJR = zzJR(str);
        if (iZzJR <= 0) {
            return 1;
        }
        return iZzJR > i2 ? i2 : iZzJR;
    }

    public static String[] zzJK(String str) {
        return com.aspose.words.internal.zzZKN.zzY(str, new char[]{ControlChar.SPACE_CHAR, '\t', '\n'}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd);
    }

    public static int zzJL(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 2) {
            return 2;
        }
        if (iZzTP == 30) {
            return 1;
        }
        if (iZzTP == 32) {
            return 3;
        }
        if (iZzTP != 41) {
            return iZzTP != 42 ? 0 : 5;
        }
        return 4;
    }

    public static int zzJM(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 1) {
            return 3;
        }
        if (iZzTP == 2) {
            return 2;
        }
        if (iZzTP != 41) {
            return iZzTP != 42 ? 0 : 5;
        }
        return 4;
    }

    public static int zzJN(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP != 39) {
            return iZzTP != 40 ? 2 : 1;
        }
        return 0;
    }

    public static int zzJO(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP != 20) {
            return iZzTP != 21 ? 0 : 2;
        }
        return 1;
    }

    public static int zzJP(String str) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str))) {
            case 36:
                return 2;
            case 37:
                return 0;
            case 38:
                return 1;
            default:
                return 3;
        }
    }

    public static boolean zzJQ(String str) {
        return ContextChain.TAG_PRODUCT.equals(str) || "h1".equals(str) || "h2".equals(str) || "h3".equals(str) || "h4".equals(str) || "h5".equals(str) || "h6".equals(str);
    }

    private static int zzJR(String str) {
        byte b;
        if (str == null) {
            return Integer.MIN_VALUE;
        }
        int i = 0;
        while (i < str.length() && isWhitespace(str.charAt(i))) {
            i++;
        }
        if (i >= str.length()) {
            return Integer.MIN_VALUE;
        }
        if (str.charAt(i) == '-') {
            i++;
            b = -1;
        } else {
            if (str.charAt(i) == '+') {
                i++;
            }
            b = 1;
        }
        if (i >= str.length() || !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
            return Integer.MIN_VALUE;
        }
        long jCharAt = 0;
        while (i < str.length() && com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
            jCharAt = (jCharAt * 10) + ((long) (str.charAt(i) - '0'));
            i++;
            if (jCharAt > 2147483647L) {
                return b > 0 ? Integer.MAX_VALUE : -2147483647;
            }
        }
        return b > 0 ? (int) jCharAt : -((int) jCharAt);
    }

    public static int zzJS(String str) {
        int iZzJR;
        if (str != null && (iZzJR = zzJR(str)) >= 0) {
            return iZzJR;
        }
        return Integer.MIN_VALUE;
    }

    public static String zzJT(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length() && (zzYO(str.charAt(i3)) || isWhitespace(str.charAt(i3))); i3++) {
            i2++;
        }
        for (int length = str.length() - 1; length >= i2 && (zzYO(str.charAt(length)) || isWhitespace(str.charAt(length))); length--) {
            i++;
        }
        int length2 = (str.length() - i2) - i;
        if (length2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length2);
        for (int i4 = i2; i4 < i2 + length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\"') {
                com.aspose.words.internal.zzZNH.zzU(sb, "%22");
            } else if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String zzJU(String str) {
        return zzY(str, true, false, false);
    }

    public static boolean zzM(Node node, Node node2) {
        if (node == null || node2 == null) {
            return false;
        }
        if (node == node2) {
            return true;
        }
        return node2.zzYF(node);
    }

    public static boolean zzS(String str, RefInt refInt) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 20) {
            refInt.set(1);
            return true;
        }
        if (iZzTP != 27) {
            refInt.set(0);
            return false;
        }
        refInt.set(2);
        return true;
    }

    public static boolean zzT(String str, RefInt refInt) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 11) {
            refInt.set(3);
            return true;
        }
        if (iZzTP == 19) {
            refInt.set(0);
            return true;
        }
        if (iZzTP == 20) {
            refInt.set(1);
            return true;
        }
        switch (iZzTP) {
            case 25:
                refInt.set(6);
                return true;
            case 26:
                refInt.set(7);
                return true;
            case 27:
                refInt.set(2);
                return true;
            case 28:
                refInt.set(4);
                return true;
            case 29:
                refInt.set(5);
                return true;
            default:
                refInt.set(2);
                return false;
        }
    }

    public static boolean zzU(String str, RefInt refInt) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str))) {
            case 19:
                refInt.set(0);
                return true;
            case 20:
                refInt.set(1);
                return true;
            case 21:
                refInt.set(2);
                return true;
            case 22:
                refInt.set(3);
                return true;
            case 23:
                refInt.set(4);
                return true;
            case 24:
                refInt.set(5);
                return true;
            case 25:
                refInt.set(6);
                return true;
            case 26:
                refInt.set(7);
                return true;
            default:
                refInt.set(2);
                return false;
        }
    }

    public static boolean zzV(String str, RefInt refInt) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 8) {
            refInt.set(3);
            return true;
        }
        switch (iZzTP) {
            case 14:
                refInt.set(0);
                return true;
            case 15:
                refInt.set(1);
                return true;
            case 16:
                refInt.set(2);
                return true;
            case 17:
                refInt.set(4);
                return true;
            case 18:
                refInt.set(5);
                return true;
            default:
                refInt.set(3);
                return false;
        }
    }

    public static boolean zzW(String str, RefInt refInt) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str))) {
            case 8:
                refInt.set(0);
                return true;
            case 9:
                refInt.set(1);
                return true;
            case 10:
                refInt.set(2);
                return true;
            case 11:
                refInt.set(3);
                return true;
            case 12:
                refInt.set(4);
                return true;
            case 13:
                refInt.set(5);
                return true;
            default:
                refInt.set(0);
                return false;
        }
    }

    public static boolean zzX(String str, RefInt refInt) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 0) {
            refInt.set(0);
            return true;
        }
        if (iZzTP == 1) {
            refInt.set(2);
            return true;
        }
        if (iZzTP == 2) {
            refInt.set(1);
            return true;
        }
        if (iZzTP == 4) {
            refInt.set(3);
            return true;
        }
        if (iZzTP == 5) {
            refInt.set(4);
            return true;
        }
        if (iZzTP == 6) {
            refInt.set(6);
            return true;
        }
        if (iZzTP != 7) {
            refInt.set(0);
            return false;
        }
        refInt.set(7);
        return true;
    }

    public static boolean zzXd(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static String zzY(String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        StringBuilder sb = null;
        boolean z8 = true;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            boolean z9 = z && zzYO(cCharAt);
            if (!z9 && z2 && isWhitespace(cCharAt)) {
                if (z3 || !z8) {
                    z6 = false;
                    z7 = false;
                } else {
                    z6 = cCharAt != ' ';
                    z7 = true;
                }
                z5 = z7;
                z4 = false;
            } else if (z9) {
                z5 = false;
                z4 = z8;
                z6 = false;
            } else {
                z4 = true;
                z5 = true;
                z3 = false;
                z6 = false;
            }
            if ((!z5 || z6) && sb == null) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
            if (z5) {
                if (z6) {
                    sb.append(ControlChar.SPACE_CHAR);
                } else if (sb != null) {
                    sb.append(cCharAt);
                }
            }
            i++;
            z8 = z4;
        }
        return sb != null ? sb.toString() : str;
    }

    private static boolean zzYO(char c) {
        return c > 0 && c <= 31 && c != '\t' && c != '\n';
    }

    public static zzYMX zzZI(Paragraph paragraph) {
        if (paragraph == null) {
            return null;
        }
        return paragraph.zzqw(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
    }

    public static boolean zzZJ(Paragraph paragraph) {
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() != 21) {
                return false;
            }
            Run run = (Run) firstChild;
            if (com.aspose.words.internal.zzZYD.zzXk(run.getText()) || run.zzZYh().zzPk(885) != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzZK(Paragraph paragraph) {
        boolean z = false;
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.zzYB4()) {
            if (!(firstChild instanceof Inline)) {
                return false;
            }
            String text = firstChild.getText();
            int i = 0;
            while (i < text.length()) {
                if (text.charAt(i) != '\f' && text.charAt(i) != 14) {
                    return false;
                }
                i++;
                z = true;
            }
        }
        return z;
    }

    public static boolean zzZL(Paragraph paragraph) {
        Node firstChild = paragraph.getFirstChild();
        boolean z = false;
        while (firstChild != null) {
            if (!(firstChild instanceof ShapeBase) || ((ShapeBase) firstChild).getWrapType() != 3) {
                return false;
            }
            firstChild = firstChild.zzYB4();
            z = true;
        }
        return z;
    }

    public static int zzm(String str, boolean z) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return z ? 4 : 3;
        }
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 0) {
            return 3;
        }
        if (iZzTP == 1) {
            return 4;
        }
        if (iZzTP == 3 || iZzTP == 35) {
            return z ? 4 : 3;
        }
        return 1;
    }

    public static boolean zzn(String str, boolean z) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!(cCharAt == '\n' ? z : isWhitespace(cCharAt))) {
                return true;
            }
        }
        return false;
    }

    public static String zzo(String str, boolean z) {
        return zzY(str, true, true, z);
    }

    public static String zzp(String str, boolean z) {
        return zzY(str, false, true, z);
    }

    public static String zzyA(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "outside" : "inside" : "bottom" : "center" : "top";
    }

    public static String zzyB(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "outside" : "inside" : "right" : "center";
    }

    public static String zzyC(int i) {
        return i == 0 ? "at-least" : "exactly";
    }

    public static String zzyD(int i) {
        return i != 0 ? i != 1 ? "column" : "page" : "margin";
    }

    public static String zzyE(int i) {
        return i != 1 ? i != 2 ? "" : "paragraph" : "page";
    }

    public static String zzyF(int i) {
        return i != 0 ? i != 1 ? i != 2 ? (i == 4 || i == 5) ? "no-wrap-beside" : "none" : "around" : "no-wrap-beside" : "auto";
    }

    public static String zzyG(int i) {
        return "%" + com.aspose.words.internal.zzJB.zzWD(i);
    }

    public static String zzyH(int i) {
        return i != 0 ? i != 2 ? "center" : "right" : "left";
    }

    public static String zzyI(int i) {
        return i != 0 ? i != 2 ? "middle" : "bottom" : "top";
    }

    public static String zzyJ(int i) {
        return i != 1 ? i != 2 ? "left" : "right" : "center";
    }

    public static String zzyK(int i) {
        switch (i) {
            case 0:
                return "margin";
            case 1:
                return "page";
            case 2:
                return "paragraph";
            case 3:
                return "line";
            case 4:
                return "topmargin";
            case 5:
                return "bottommargin";
            case 6:
                return "insidemargin";
            case 7:
                return "outsidemargin";
            default:
                return "";
        }
    }

    public static String zzyL(int i) {
        switch (i) {
            case 0:
                return "margin";
            case 1:
                return "page";
            case 2:
                return "column";
            case 3:
                return FirebaseAnalytics.Param.CHARACTER;
            case 4:
                return "leftmargin";
            case 5:
                return "rightmargin";
            case 6:
                return "insidemargin";
            case 7:
                return "outsidemargin";
            default:
                return "";
        }
    }

    public static String zzyM(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "through" : "tight" : "none" : "square" : "topbottom" : "inline";
    }

    public static String zzyN(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "middledot" : "heavy" : "line" : "dashes" : "dots" : "none";
    }

    public static String zzyO(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? i != 7 ? "" : "clear" : "list" : "bar" : "decimal" : "right" : "center" : "left";
    }

    public static String zzyP(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "justify" : "left" : "right" : "center";
    }

    public static boolean zzX(Paragraph paragraph, zzYMX zzymx, Paragraph paragraph2, zzYMX zzymx2) {
        return paragraph == null || paragraph2 == null || !paragraph.getParagraphBreakFont().getHidden() || zzU(paragraph, zzymx) || zzU(paragraph2, zzymx2);
    }

    public static boolean zzU(Paragraph paragraph, zzYMX zzymx) {
        if (paragraph.isInCell()) {
            return false;
        }
        if ((zzymx.zzVE(1310) && zzymx.zzJ5() == 0) || (zzymx.zzVE(1430) && zzymx.zzJ4() == 0)) {
            return false;
        }
        return zzymx.zzYpF();
    }
}

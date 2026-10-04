package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPO {

    public static class zzX {
        public static String zzZZ(int i, boolean z) {
            int i2 = i & 255;
            if (i2 == 14) {
                return z ? "előbb" : "alább";
            }
            if (i2 == 29) {
                return z ? "ovan" : "nedan";
            }
            if (i2 == 31) {
                return z ? "üst" : "alt";
            }
            if (i2 == 65) {
                return z ? "juu ya" : "chini ya";
            }
            if (i2 == 68) {
                return z ? "өск" : "аска";
            }
            if (i2 == 54) {
                return z ? "hierbo" : "hieronder";
            }
            if (i2 == 55) {
                return z ? "ზემოთ" : "ქვემოთ";
            }
            if (i2 == 62) {
                return z ? "Atas" : "Bawah";
            }
            if (i2 == 63) {
                return z ? "жоғарғы" : "төменгі";
            }
            switch (i2) {
                case 2:
                    return z ? "отгоре" : "отдолу";
                case 3:
                    return z ? "a dalt" : "més avail";
                case 4:
                    return i != 2052 ? z ? "如上" : "如下" : z ? "见上方" : "见下方";
                case 5:
                    return z ? "nahoře" : "dole";
                case 6:
                    return z ? "ovenfor" : "nedenfor";
                case 7:
                    return z ? "oben" : "unten";
                case 8:
                    return z ? "παραπάνω" : "παρακάτω";
                default:
                    switch (i2) {
                        case 10:
                            return z ? "más atrás" : "más adelante";
                        case 11:
                            return z ? "yllä" : "alla";
                        case 12:
                            return z ? "ci-dessus" : "ci-dessous";
                        default:
                            switch (i2) {
                                case 16:
                                    return z ? "più sopra" : "più sotto";
                                case 17:
                                    return z ? "上の" : "下の";
                                case 18:
                                    return z ? "위참조" : "아래참조";
                                case 19:
                                    return z ? "hierboven" : "hieronder";
                                case 20:
                                    return z ? "ovenfor" : "nedenfor";
                                case 21:
                                    return z ? "wyżej" : "niżej";
                                case 22:
                                    return z ? "acima" : "abaixo";
                                default:
                                    switch (i2) {
                                        case 24:
                                            return z ? "deasupra" : "dedesubt";
                                        case 25:
                                            return z ? "выше" : "ниже";
                                        case 26:
                                            return z ? "gore" : "dolje";
                                        case 27:
                                            return z ? "vyššie" : "nižšie";
                                        default:
                                            switch (i2) {
                                                case 34:
                                                    return z ? "вище" : "нижче";
                                                case 35:
                                                    return z ? "вышэй" : "ніжэй";
                                                case 36:
                                                    return z ? "zgoraj" : "spodaj";
                                                case 37:
                                                    return z ? "ülalpool" : "allpool";
                                                case 38:
                                                    return z ? "virs" : "zem";
                                                case 39:
                                                    return z ? "aukščiau" : "žemiau";
                                                default:
                                                    switch (i2) {
                                                        case 43:
                                                            return z ? "վեռժում" : "նեռքժում";
                                                        case 44:
                                                            return i != 2092 ? z ? "yuxarı" : "aşağı" : z ? "јухары" : "ашағы";
                                                        case 45:
                                                            return z ? "goian" : "behean";
                                                        default:
                                                            return z ? "above" : "below";
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    public static class zzY extends zzYVZ {
        private FieldEnd zzYCd;
        private FieldSeparator zzYCe;
        private FieldSeparator zzYCf;

        public zzY(FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
            super(23, 24);
            this.zzYCe = fieldSeparator;
            this.zzYCd = fieldEnd;
        }

        private static ArrayList<SpecialChar> zzR(Node node, Node node2) {
            zzYWI zzywi = new zzYWI(new zzYWB(node, false, node2, false));
            ArrayList<SpecialChar> arrayList = null;
            while (zzywi.zzF(true, true)) {
                if (zzywi.next().getNodeType() == 26) {
                    SpecialChar specialChar = (SpecialChar) zzywi.next();
                    if (com.aspose.words.internal.zzZKN.equals(specialChar.getText(), ControlChar.zzZtN)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, specialChar);
                    }
                }
            }
            return arrayList;
        }

        private static void zzS(Node node, Node node2) {
            ArrayList<SpecialChar> arrayListZzR = zzR(node, node2);
            if (arrayListZzR == null) {
                return;
            }
            for (SpecialChar specialChar : arrayListZzR) {
                specialChar.getParentNode().insertBefore(new Run(specialChar.getDocument(), ControlChar.zzZs5, (zzYEF) specialChar.zzZYh().zzbn()), specialChar);
                specialChar.remove();
            }
        }

        @Override // com.aspose.words.zzYVZ
        public final void zzT(Node node, Node node2) {
            if (((FieldChar) node).getFieldType() != 70) {
                return;
            }
            super.zzT(node, node2);
        }

        @Override // com.aspose.words.zzYVZ
        public final void zzZcy() throws Exception {
            super.zzZcy();
            FieldSeparator fieldSeparator = this.zzYCf;
            if (fieldSeparator != null) {
                zzS(fieldSeparator, this.zzYCd);
            }
        }

        @Override // com.aspose.words.zzYVZ
        public final void zzx(Node node) {
            FieldChar fieldChar = (FieldChar) node;
            fieldChar.getFieldType();
            int nodeType = fieldChar.getNodeType();
            if (nodeType == 23) {
                this.zzYCf = (FieldSeparator) fieldChar;
            } else {
                if (nodeType != 24) {
                    return;
                }
                if (this.zzYCf == null) {
                    this.zzYCf = this.zzYCe;
                }
                zzS(this.zzYCf, fieldChar);
                this.zzYCf = null;
            }
        }
    }

    public static class zzZ implements zzZAJ {
        static zzZAJ zzYCg = new zzZ();

        private zzZ() {
        }

        private static boolean zzYW(char c) {
            if (c == '(' || c == ')' || c == ':' || c == ';') {
                return true;
            }
            switch (c) {
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (c) {
                        case '[':
                        case '\\':
                        case ']':
                            return true;
                        default:
                            switch (c) {
                                case '{':
                                case '|':
                                case '}':
                                    return true;
                                default:
                                    return false;
                            }
                    }
            }
        }

        @Override // com.aspose.words.zzZAJ
        public final int zzDl(int i) {
            return i;
        }

        @Override // com.aspose.words.zzZAJ
        public final int zzDm(int i) {
            return i;
        }

        @Override // com.aspose.words.zzZAJ
        public final void zzDn(int i) {
        }

        @Override // com.aspose.words.zzZAJ
        public final boolean zzYZ(char c) {
            return zzYW(c);
        }
    }

    public static boolean zzD(Field field) {
        return !field.zzZgt() && field.getStart().getAncestor(20) == null;
    }

    private static Node zzE(Field field) {
        OfficeMath officeMathZzZE = zzZE(field.getEnd());
        if (officeMathZzZE == null) {
            return null;
        }
        OfficeMath officeMathZzZE2 = zzZE(field.getSeparator());
        if (officeMathZzZE2 == null || officeMathZzZE2 != officeMathZzZE) {
            return officeMathZzZE;
        }
        return null;
    }

    private static Node zzF(Field field) {
        return zzE(field) != null ? zzE(field) : field.getEnd();
    }

    private static zzZ47 zzI(Field field) {
        if (field == null) {
            return null;
        }
        return zzZPU.zzI(field);
    }

    private static String zzLN(String str) {
        return !com.aspose.words.internal.zzZYD.zzXk(str) ? "0" : androidx.core.content.OooO0O0.OooO00o(1, str) == '.' ? com.aspose.words.internal.zzZKN.zzT(str, str.length() - 1, 1) : str;
    }

    private static Paragraph zzM(Node node, boolean z) {
        return node.zzYAY() == 6 ? (Paragraph) node.zzYBc() : z ? zzYVU.zzXF(node) : zzYVU.zzXE(node);
    }

    private static boolean zzP(zzYWB zzywb) {
        for (Node node : zzywb) {
            if (node.getNodeType() == 22 && zzZPU.zzD9(((FieldStart) node).getFieldType())) {
                return true;
            }
        }
        return false;
    }

    private static zzZAJ zzVT(boolean z) {
        if (z) {
            return zzZ.zzYCg;
        }
        return null;
    }

    private static void zzX(Field field, boolean z) throws Exception {
        if (z) {
            field.zzZgo().zzZ(new zzZSC(field.getStart().zzYBb()));
        }
    }

    public static String zzY(Field field, boolean z) {
        return !zzD(field) ? "" : zzX.zzZZ(field.getLocaleId(), z);
    }

    public static int zzZ(Field field, String str, boolean z) throws Exception {
        Bookmark bookmarkZzT;
        if (com.aspose.words.internal.zzZYD.zzXh(str) || (bookmarkZzT = zzZOO.zzT(field, str)) == null || zzZOO.zzX(bookmarkZzT.getBookmarkStart())) {
            return 0;
        }
        if (z) {
            return 2;
        }
        boolean z2 = false;
        for (Node node : bookmarkZzT.zz9m()) {
            if (node == field.getStart()) {
                return 0;
            }
            if (node.getNodeType() == 22) {
                z2 = true;
            }
        }
        return z2 ? 2 : 0;
    }

    private static OfficeMath zzZE(Node node) {
        OfficeMath officeMath = (OfficeMath) node.getAncestor(35);
        if (officeMath != null) {
            return officeMath.zzYrX();
        }
        return null;
    }

    private static Field zzZG(ArrayList<Field> arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static ArrayList<Field> zzl(Paragraph paragraph) {
        return zzZQF.zzZ(paragraph, false, 90);
    }

    private static Field zzm(Paragraph paragraph) {
        return zzZG(zzZQF.zzZ(paragraph, false, 90));
    }

    private static zzZ47 zzn(Paragraph paragraph) {
        return zzI(zzm(paragraph)) != null ? zzI(zzm(paragraph)) : paragraph.getListLabel().zzYOC();
    }

    private static String zzo(Paragraph paragraph) {
        if (!paragraph.zzYoX()) {
            return zzLN("");
        }
        ListLabel listLabel = paragraph.getListLabel();
        String numberFormat = listLabel.zzYOJ().getNumberFormat();
        int i = -1;
        int length = -1;
        for (int i2 = 0; i2 < numberFormat.length(); i2++) {
            if (ListLevel.zzYF(numberFormat.charAt(i2))) {
                if (i == -1) {
                    i = i2;
                }
                length = (numberFormat.length() - i2) - 1;
            }
        }
        String strZzYOt = listLabel.zzYOt();
        if (i > 0) {
            strZzYOt = com.aspose.words.internal.zzZKN.zzT(strZzYOt, 0, i);
        }
        if (length > 0) {
            strZzYOt = com.aspose.words.internal.zzZKN.zzn(strZzYOt, strZzYOt.length() - length);
        }
        return zzLN(strZzYOt);
    }

    private static String zzY(Bookmark bookmark, Paragraph paragraph, boolean z) throws Exception {
        zzZ47 zzz47ZzY = zzY(bookmark, paragraph);
        if (zzz47ZzY == null) {
            return null;
        }
        return zzZ4D.zzZ(zzz47ZzY, zzVT(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzZ47 zzY(Bookmark bookmark, Paragraph paragraph) throws Exception {
        Field fieldZzY;
        zzZ47 zzz47ZzI;
        ArrayList<Field> arrayListZzl = zzl(paragraph);
        if ((zzI(zzZ(bookmark, arrayListZzl)) != null ? zzI(zzZ(bookmark, arrayListZzl)) : paragraph.getListLabel().zzYOC()) == null) {
            fieldZzY = zzY(bookmark, arrayListZzl);
        } else {
            if (zzI(zzZ(bookmark, arrayListZzl)) == null) {
                zzz47ZzI = paragraph.getListLabel().zzYOC();
                if (zzz47ZzI == null) {
                    return (zzI(zzZ(bookmark, arrayListZzl)) != null ? zzI(zzZ(bookmark, arrayListZzl)) : paragraph.getListLabel().zzYOC()) != null ? zzI(zzZ(bookmark, arrayListZzl)) != null ? zzI(zzZ(bookmark, arrayListZzl)) : paragraph.getListLabel().zzYOC() : zzI(zzY(bookmark, arrayListZzl));
                }
                return zzI(zzZG(arrayListZzl));
            }
            fieldZzY = zzZ(bookmark, arrayListZzl);
        }
        zzz47ZzI = zzI(fieldZzY);
        if (zzz47ZzI == null) {
        }
    }

    public static Paragraph zzZ(Field field, Bookmark bookmark, boolean z, RefBoolean refBoolean) throws Exception {
        zzYA zzya = new zzYA(new zzYWB(field.getSeparator(), false, zzF(field), false), bookmark.getName());
        zzya.zzYzM();
        refBoolean.set(zzya.hasBookmark());
        zzX(field, z);
        return zzM(bookmark.getBookmarkStart(), true);
    }

    private static Field zzY(Bookmark bookmark, ArrayList<Field> arrayList) throws Exception {
        if (arrayList.size() == 0 || bookmark == null) {
            return null;
        }
        ArrayList<Node> arrayListZzY = zzYWG.zzY(bookmark.zz9m(), 22);
        for (Field field : arrayList) {
            if (arrayListZzY.contains(field.getStart())) {
                return field;
            }
        }
        return null;
    }

    public static zzZP6 zzZ(Field field, Bookmark bookmark, zzYWB zzywb, Paragraph paragraph, boolean z, boolean z2) throws Exception {
        boolean z3;
        if (z2) {
            z3 = field.getEnd().zzYAX().getStoryType() == 1;
        } else {
            z3 = z2;
        }
        String strZzZ = zzZ(field, zzywb, z3);
        if (strZzZ != null) {
            return new zzZP2(field, strZzZ);
        }
        zzX(field, zzP(zzywb));
        Node nodeZzZ = zzZ(bookmark, zzywb);
        zzYWB zzywb2 = nodeZzZ != null ? new zzYWB(nodeZzZ, true, zzywb.zzYA1().getNode(), zzywb.zzYA3()) : zzywb;
        zzTS zzts = new zzTS();
        zzts.zzZ(new zzZQA(field));
        zzts.zzZ(new zzY(field.getSeparator(), field.getEnd()));
        if (!z) {
            zzYWJ.zzZ(zzywb2, zzF(field), (zzZA2) new zzTU(new zzZPP(z3), new zzUP()), (zzZA3) zzts, true, 13);
            if (paragraph != zzM(bookmark.getBookmarkEnd(), false)) {
                zzYWJ.zzS(field.getStart().getParentParagraph(), paragraph.zzZYj());
            }
        } else {
            bookmark.remove();
        }
        return new zzZP3(field);
    }

    private static String zzZ(Field field, zzYWB zzywb, boolean z) {
        boolean z2 = field.getStart().zztB(5) != null;
        zzYWI zzywi = new zzYWI(zzywb);
        while (true) {
            for (boolean z3 = true; zzywi.zzF(z3, true); z3 = false) {
                Node next = zzywi.next();
                if (next == field.getStart()) {
                    return "Error! Not a valid bookmark self-reference.";
                }
                if (z2 && next.getNodeType() == 2) {
                    return "Error! Not a valid result for table.";
                }
                if (z || !(next instanceof zzZ96)) {
                    break;
                }
            }
            return null;
        }
    }

    private static Node zzZ(Bookmark bookmark, zzYWB zzywb) {
        CompositeNode parentNode = bookmark.getBookmarkStart().getParentNode();
        if (parentNode.getNodeType() != 6 && parentNode.getNodeType() != 5) {
            return null;
        }
        for (Node node : zzywb) {
            if (node.getNodeType() == 8) {
                return ((CompositeNode) node).getFirstChild();
            }
        }
        return null;
    }

    public static String zzZ(Field field, Bookmark bookmark) {
        return zzZ(field, bookmark.getBookmarkStart());
    }

    public static String zzZ(Field field, Node node) {
        if (!zzD(field)) {
            return "";
        }
        return zzX.zzZZ(field.getLocaleId(), Node.zzD(node, field.getStart()));
    }

    public static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph, boolean z, boolean z2) throws Exception {
        String strZzZ = zzZ(bookmark, paragraph, z);
        return z2 ? zzZ(field, bookmark, paragraph, strZzZ) : strZzZ;
    }

    public static String zzZ(Field field, Paragraph paragraph, boolean z) {
        String strZzo = zzo(paragraph);
        return z ? zzZ(field, (Bookmark) null, paragraph, strZzo) : strZzo;
    }

    public static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph, Paragraph paragraph2, boolean z, String str, boolean z2) throws Exception {
        String strZzZ = zzZ(field, bookmark, paragraph, paragraph2, z, str);
        return z2 ? zzZ(field, bookmark, paragraph, strZzZ) : strZzZ;
    }

    public static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph, boolean z, String str, boolean z2) throws Exception {
        String strZzZ = zzZ(bookmark, paragraph, z, str);
        return z2 ? zzZ(field, bookmark, paragraph, strZzZ) : strZzZ;
    }

    private static String zzZ(Bookmark bookmark, Paragraph paragraph, boolean z) throws Exception {
        return zzLN(zzY(bookmark, paragraph, z));
    }

    private static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph, Paragraph paragraph2, boolean z, String str) throws Exception {
        if (!zzD(field)) {
            return zzZ(bookmark, paragraph, z, str);
        }
        zzZ47 zzz47ZzY = zzY(bookmark, paragraph);
        if (zzz47ZzY == null) {
            return zzLN(null);
        }
        zzZ47 zzz47ZzZ = zzZ(zzz47ZzY, paragraph2);
        int i = 0;
        if (zzz47ZzZ != null) {
            int i2 = 0;
            while (i < zzz47ZzY.zzYO0()) {
                ListLevel listLevelZzwT = zzz47ZzZ.zzwT(i);
                ListLevel listLevelZzwT2 = zzz47ZzY.zzwT(i);
                int iZzR0 = zzz47ZzZ.zzR0(i);
                int iZzR02 = zzz47ZzY.zzR0(i);
                if (listLevelZzwT != listLevelZzwT2 || iZzR0 != iZzR02) {
                    break;
                }
                i2++;
                i++;
            }
            i = i2;
        }
        return zzLN(zzZ4D.zzZ(zzz47ZzY, i, zzVT(z), str));
    }

    private static zzZ47 zzZ(zzZ47 zzz47, Paragraph paragraph) {
        ListLevel listLevelZzwT = zzz47.zzwT(0);
        zzZ47 zzz472 = null;
        for (Paragraph paragraph2 : paragraph.zzYBb().getChildNodes(8, true)) {
            zzZ47 zzz47Zzn = zzn(paragraph2);
            if (zzz47Zzn != null && zzz47Zzn.zzwT(0) == listLevelZzwT) {
                zzz472 = zzz47Zzn;
            }
            if (paragraph2 == paragraph) {
                break;
            }
        }
        return zzz472;
    }

    private static String zzZ(Bookmark bookmark, Paragraph paragraph, boolean z, String str) throws Exception {
        zzZ47 zzz47ZzY = zzY(bookmark, paragraph);
        return zzLN(zzz47ZzY != null ? zzZ4D.zzZ(zzz47ZzY, 0, zzVT(z), str) : null);
    }

    private static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph, String str) {
        String strZzZ = zzZ(field, bookmark, paragraph);
        if (com.aspose.words.internal.zzZKN.zzU3(strZzZ)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(strZzZ.length() + str.length() + 1);
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        sb.append(ControlChar.SPACE_CHAR);
        com.aspose.words.internal.zzZNH.zzU(sb, strZzZ);
        return sb.toString();
    }

    private static String zzZ(Field field, Bookmark bookmark, Paragraph paragraph) {
        if (bookmark != null) {
            return zzZ(field, bookmark);
        }
        return zzZ(field, paragraph);
    }

    private static Field zzZ(Bookmark bookmark, ArrayList<Field> arrayList) {
        if (arrayList.size() == 0 || bookmark == null) {
            return null;
        }
        for (Field field : arrayList) {
            if (zzYWG.zzY(field.zzZgH(), 9).contains(bookmark.getBookmarkStart())) {
                return field;
            }
        }
        return null;
    }
}

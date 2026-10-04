package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4D {

    public interface zzY {
        void append(String str);

        int getLength();

        void setLength(int i);

        void zzq(char c);
    }

    public static class zzZ implements zzZAJ {
        static zzZAJ zzYCg = new zzZ();

        private zzZ() {
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
            return true;
        }
    }

    private static boolean zzJ9(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '\f') {
                return true;
            }
        }
        return false;
    }

    private static int zzQ(Paragraph paragraph, int i) {
        if (i == 1 && paragraph.isDeleteRevision()) {
            return 3;
        }
        if ((i == 0 && paragraph.isInsertRevision()) || ((Integer) paragraph.zzWm(EditingLanguage.KASHMIRI_ARABIC, i)).intValue() == 0 || (paragraph.isInCell() && paragraph.zzZex().zz6G().zz5B())) {
            return 3;
        }
        int iZzZz = zzZz(paragraph);
        return iZzZz == 0 ? (!paragraph.isEndOfSection() || paragraph.isEndOfDocument() || zzYVU.zzXM(paragraph.getParentNode())) ? 1 : 3 : iZzZz;
    }

    public static boolean zzR(Paragraph paragraph, int i) {
        int iZzQ = zzQ(paragraph, i);
        return (iZzQ == 2 || iZzQ == 3) ? false : true;
    }

    private static zzW zzYOg() {
        return new zzW((byte) 0);
    }

    private static zzX zzYOh() {
        return new zzX((byte) 0);
    }

    public static boolean zzZ(Paragraph paragraph, zzZ49 zzz49, int i) {
        int iZzQ = zzQ(paragraph, i);
        List listByListId = paragraph.getDocument().getLists().getListByListId(((Integer) paragraph.zzWm(EditingLanguage.KASHMIRI_ARABIC, i)).intValue());
        if (listByListId == null) {
            iZzQ = 3;
        }
        boolean z = iZzQ != 3;
        if (z) {
            zzZ47 zzz47ZzY = zzz49.zzY(listByListId, ((Integer) paragraph.zzWm(EditingLanguage.GALICIAN, i)).intValue());
            zzz47ZzY.setLocaleId(paragraph.getParagraphBreakFont().getLocaleId());
            if (iZzQ == 1) {
                String[] strArrZzZ = zzZ(zzz47ZzY, false);
                String[] strArrZzZ2 = zzZ(zzz47ZzY, true);
                paragraph.getListLabel().zzZ(strArrZzZ, strArrZzZ2, zzz47ZzY.zzYO2(), i);
                if (i == 0) {
                    paragraph.getListLabel().zzZ(strArrZzZ, strArrZzZ2, zzz47ZzY.zzYO2(), 1);
                }
                return true;
            }
        }
        paragraph.zzqx(i);
        if (i == 0) {
            paragraph.zzqx(1);
        }
        return z;
    }

    private static boolean zzZy(Paragraph paragraph) {
        return paragraph.isInCell() || paragraph.getDocument().zzZpV().zzYVg.getSplitPgBreakAndParaMark();
    }

    private static int zzZz(Paragraph paragraph) {
        Iterator<V> it = paragraph.iterator();
        int i = 0;
        while (it.hasNext()) {
            Node node = (Node) it.next();
            int nodeType = node.getNodeType();
            if (nodeType != 21) {
                switch (nodeType) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        return 1;
                }
            } else {
                String text = ((Run) node).getText();
                if (!com.aspose.words.internal.zzZYD.zzXk(text)) {
                    continue;
                } else {
                    if (zzZy(paragraph) || zzJ9(text)) {
                        return 1;
                    }
                    i = 2;
                }
            }
        }
        return i;
    }

    public static boolean zzxd(int i) {
        return (i == 255 || i == 23) ? false : true;
    }

    public static class zzW implements zzY {
        private ArrayList<String> zzXK;

        private zzW() {
            this.zzXK = new ArrayList<>();
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void append(String str) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXK, str);
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final int getLength() {
            return this.zzXK.size();
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void setLength(int i) {
        }

        public final String[] zzYOf() {
            return (String[]) this.zzXK.toArray(new String[0]);
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void zzq(char c) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXK, Character.toString(c));
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static class zzX implements zzY {
        private StringBuilder zzxe;

        private zzX() {
            this.zzxe = new StringBuilder();
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void append(String str) {
            com.aspose.words.internal.zzZNH.zzU(this.zzxe, str);
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final int getLength() {
            return this.zzxe.length();
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void setLength(int i) {
            this.zzxe.setLength(i);
        }

        public final String toString() {
            return this.zzxe.toString();
        }

        @Override // com.aspose.words.zzZ4D.zzY
        public final void zzq(char c) {
            this.zzxe.append(c);
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    private static String[] zzZ(zzZ47 zzz47, boolean z) {
        RefInt refInt = new RefInt(0);
        String[] strArrZzZ = zzZ(zzz47, zzz47.getListLevel(), (zzZAJ) null, z, refInt);
        refInt.get();
        return strArrZzZ;
    }

    public static String zzZ(zzZ47 zzz47, int i, zzZAJ zzzaj, String str) {
        StringBuilder sb = new StringBuilder();
        int iZzYO0 = zzz47.zzYO0() + 1;
        for (int iZzYO02 = zzz47.zzYO0(); iZzYO02 >= i; iZzYO02--) {
            if (iZzYO02 < iZzYO0 && zzZ(zzz47, iZzYO02)) {
                ListLevel listLevelZzwT = zzz47.zzwT(iZzYO02);
                RefInt refInt = new RefInt(0);
                String strZzZ = zzZ(zzz47, listLevelZzwT, zzzaj, refInt);
                int i2 = refInt.get();
                if (com.aspose.words.internal.zzZKN.zzW(strZzZ, ".", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) && sb.length() > 0 && sb.charAt(0) == '(') {
                    strZzZ = com.aspose.words.internal.zzZKN.zzn(strZzZ, strZzZ.length() - 1);
                }
                if (!com.aspose.words.internal.zzZKN.zzU3(str) && sb.length() != 0) {
                    sb.insert(0, str);
                }
                sb.insert(0, strZzZ);
                if (i2 < iZzYO0) {
                    iZzYO0 = i2;
                }
            }
        }
        return sb.toString();
    }

    private static boolean zzZ(zzZ47 zzz47, int i) {
        return com.aspose.words.internal.zzXU.zzN(zzz47.zzYNY(), 1 << i) || (zzz47.zzYNY() & (FrameMetricsAggregator.EVERY_DURATION >> (9 - i))) == 0;
    }

    private static String zzZ(zzZ47 zzz47, ListLevel listLevel, zzZAJ zzzaj, RefInt refInt) {
        return com.aspose.words.internal.zzZ1.zzY(zzZ(zzz47, listLevel, zzzaj, false, refInt));
    }

    private static String[] zzZ(zzZ47 zzz47, ListLevel listLevel, zzZAJ zzzaj, boolean z, RefInt refInt) {
        zzW zzwZzYOg = zzYOg();
        refInt.set(zzZ(zzwZzYOg, zzz47, listLevel, zzzaj, z));
        return zzwZzYOg.zzYOf();
    }

    private static int zzZ(zzY zzy, zzZ47 zzz47, ListLevel listLevel, zzZAJ zzzaj, boolean z) {
        if (zzzaj == null) {
            zzzaj = zzZ.zzYCg;
        }
        int iZzYOa = listLevel.zzYOa();
        for (int i = 0; i < listLevel.getNumberFormat().length(); i++) {
            char cCharAt = listLevel.getNumberFormat().charAt(i);
            if (Character.getType(cCharAt) != 16 || cCharAt == 173) {
                if (ListLevel.zzx7(cCharAt)) {
                    if (zzxd(zzz47.zzwT(cCharAt).getNumberStyle())) {
                        String strZzZ = zzZ(zzz47, listLevel, cCharAt, z, zzzaj);
                        if (strZzZ.length() > 0) {
                            zzy.append(strZzZ);
                            zzzaj.zzDn(zzy.getLength());
                        }
                        if (iZzYOa > cCharAt) {
                            iZzYOa = cCharAt;
                        }
                    }
                } else if (!z && zzzaj.zzYZ(cCharAt)) {
                    zzy.zzq(cCharAt);
                }
            }
        }
        zzy.setLength(zzzaj.zzDm(zzy.getLength()));
        return iZzYOa;
    }

    private static String zzZ(zzZ47 zzz47, ListLevel listLevel, int i, boolean z, zzZAJ zzzaj) {
        int iZzR0 = zzz47.zzR0(i);
        ListLevel listLevelZzwT = zzz47.zzwT(i);
        if (listLevelZzwT.zzYOb()) {
            return "";
        }
        int iZzDl = zzzaj.zzDl(listLevelZzwT.getNumberStyle());
        if (iZzDl == 23) {
            return listLevelZzwT.getNumberFormat();
        }
        if (z || (listLevel.isLegal() && zzxd(iZzDl) && iZzDl != 22)) {
            iZzDl = 0;
        }
        return zzYTW.zzZ(iZzR0, iZzDl, listLevelZzwT.zzYOe(), true, zzz47.getLocaleId());
    }

    public static String zzZ(zzZ47 zzz47, zzZAJ zzzaj) {
        zzX zzxZzYOh = zzYOh();
        zzZ((zzY) zzxZzYOh, zzz47, zzz47.getListLevel(), zzzaj, false);
        return zzxZzYOh.toString();
    }
}

package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPV {
    private static Object[] zzYCV = zzZcS();
    private int[] zzYCX;
    private HashMap<zzZ, List> zzYCY;
    private com.aspose.words.internal.zzZYG<List> zzYD0;
    private List zzYD2;
    private Node zzYD3;
    private boolean zzYD4;
    private boolean zzYD5;
    private boolean zzYD6;
    private zzY zzYD8;
    private zzZ49 zzYD9;
    private int zzYDa;
    private zzZ4J zzYDb;
    private Document zzZEY;
    private int zzYD7 = -1;
    private com.aspose.words.internal.zzZYV<Object> zzYD1 = new com.aspose.words.internal.zzZYV<>();
    private HashMap<zzZ49, zzY> zzYCZ = new HashMap<>();
    private int zzYCW = -1;

    public static class zzY {
        private int zzYCQ = -1;
        private List zzYCR;

        public final void zzDa(int i) {
            this.zzYCQ = i;
        }

        public final void zzR(List list) {
            this.zzYCR = list;
        }

        public final int zzZcQ() {
            return this.zzYCQ;
        }

        public final List zzZcR() {
            return this.zzYCR;
        }
    }

    public static class zzZ {
        private int zzAr;
        private boolean zzYCS;
        private char zzYCT;
        private int zzYCU;

        public zzZ(int i, char c, boolean z, int i2) {
            this.zzYCU = i;
            this.zzYCT = c;
            this.zzYCS = z;
            this.zzAr = i2;
        }

        private boolean zzZ(zzZ zzz) {
            if (com.aspose.words.internal.zzZKO.zzA(zzz, null)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(zzz, this)) {
                return true;
            }
            return zzz.zzYCU == this.zzYCU && zzz.zzYCT == this.zzYCT && zzz.zzYCS == this.zzYCS && zzz.zzAr == this.zzAr;
        }

        public boolean equals(Object obj) {
            return zzZ((zzZ) com.aspose.words.internal.zzZKW.zzZ(obj, zzZ.class));
        }

        public int hashCode() {
            return this.zzYCT | ((this.zzYCS ? 1 : 0) << 16) | (this.zzYCU << 17);
        }
    }

    public zzZPV(Document document) {
        this.zzZEY = document;
        document.zzZqc();
    }

    private static boolean zzDb(int i) {
        return i != 49;
    }

    private void zzDc(int i) {
        int i2;
        if (!zzDb(i) || (i2 = this.zzYDa) <= 0) {
            return;
        }
        this.zzYDa = i2 - 1;
    }

    private int zzDd(int i) {
        int i2 = this.zzYD7;
        if (i2 != -1) {
            return i2;
        }
        if (i != -1) {
            return i + 1;
        }
        return 0;
    }

    private static int zzLP(String str) {
        if (com.aspose.words.internal.zzZYD.zzi(str, "NumberDefault")) {
            return 1;
        }
        if (com.aspose.words.internal.zzZYD.zzi(str, "OutlineDefault")) {
            return 2;
        }
        return com.aspose.words.internal.zzZYD.zzi(str, "LegalDefault") ? 3 : 0;
    }

    private List zzLQ(String str) {
        List listZzZ;
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYG<List> zzzyg = this.zzYD0;
        List list = zzzyg != null ? zzzyg.get(str) : null;
        if (list != null) {
            return list;
        }
        int iZzLP = zzLP(str);
        if (iZzLP == 0) {
            listZzZ = this.zzZEY.getLists().zzJb(str) != null ? this.zzZEY.getLists().zzJb(str) : zzLQ("NumberDefault");
        } else {
            listZzZ = zzZPX.zzZ(this.zzZEY, this.zzYDb, iZzLP);
            this.zzYDb = listZzZ.zzYPa();
        }
        if (this.zzYD0 == null) {
            this.zzYD0 = new com.aspose.words.internal.zzZYG<>(false);
        }
        this.zzYD0.set(str, listZzZ);
        return listZzZ;
    }

    private List zzLR(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return zzLQ(str);
        }
        List list = this.zzYD2;
        if (list != null) {
            return list;
        }
        List listZzZcR = this.zzYD8.zzZcR();
        return listZzZcR != null ? listZzZcR : zzLQ("NumberDefault");
    }

    private zzZPW zzLS(String str) {
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(60, zzZU.zzZF6);
        if (this.zzZEY.getFieldOptions().isBidiTextSupportedOnUpdate()) {
            zzyef.zzY(zzZU.zzZF6);
        }
        return new zzZPW(str, zzyef);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.aspose.words.FieldStart] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.aspose.words.Node] */
    private void zzR(FieldStart fieldStart) {
        if (this.zzYD4) {
            return;
        }
        do {
            fieldStart = fieldStart.getPreviousSibling();
            if (fieldStart == this.zzYD3) {
                return;
            }
        } while (!zzZJ(fieldStart));
        this.zzYD4 = true;
    }

    private zzZPW zzS(FieldStart fieldStart) {
        switch (fieldStart.getFieldType()) {
            case 52:
            case 53:
            case 54:
                zzZcT();
                break;
        }
        int fieldType = fieldStart.getFieldType();
        if (fieldType == 90) {
            return zzZ((FieldListNum) fieldStart.getField());
        }
        switch (fieldType) {
            case 52:
                return zzZ(2, FilenameUtils.EXTENSION_SEPARATOR, true, 0);
            case 53:
                FieldAutoNumLgl fieldAutoNumLgl = (FieldAutoNumLgl) fieldStart.getField();
                return zzZ(3, zzZPU.zzLO(fieldAutoNumLgl.getSeparatorCharacter()), !fieldAutoNumLgl.getRemoveTrailingPeriod(), fieldAutoNumLgl.getFormat().getGeneralFormats().get(0));
            case 54:
                FieldAutoNum fieldAutoNum = (FieldAutoNum) fieldStart.getField();
                return zzZ(1, zzZPU.zzLO(fieldAutoNum.getSeparatorCharacter()), true, fieldAutoNum.getFormat().getGeneralFormats().get(0));
            default:
                throw new IllegalStateException();
        }
    }

    private int zzT(List list) {
        Object obj = this.zzYD1.get(list.zzYP8());
        if (obj == null) {
            return -1;
        }
        Object[] objArr = zzYCV;
        return com.aspose.words.internal.zzZKV.zzZ(objArr, obj, objArr.length);
    }

    private static boolean zzZJ(Node node) {
        int nodeType = node.getNodeType();
        return (nodeType == 9 || nodeType == 10 || (nodeType == 21 && com.aspose.words.internal.zzZYD.zzXh(node.getText()))) ? false : true;
    }

    private static Object[] zzZcS() {
        Object[] objArr = new Object[9];
        for (int i = 0; i < 9; i++) {
            objArr[i] = new Object();
        }
        return objArr;
    }

    private void zzZcT() {
        if (this.zzYD5) {
            return;
        }
        this.zzYD5 = true;
        if (this.zzYD6) {
            if (this.zzYCX == null) {
                this.zzYCX = new int[10];
            }
            int[] iArr = this.zzYCX;
            int i = this.zzYD7;
            int i2 = i + 1;
            iArr[i2] = iArr[i2] + 1;
            if (i != -1) {
                iArr[0] = 0;
                int i3 = i + 1;
                while (i3 < 9) {
                    i3++;
                    this.zzYCX[i3] = 0;
                }
            }
        }
    }

    private void zzZcU() {
        if (this.zzYD1.getCount() != 0) {
            this.zzYD1.clear();
        }
    }

    private static int zzq(Paragraph paragraph) {
        Style styleZzW = zzW(paragraph.zzqy(1));
        if (styleZzW != null) {
            return styleZzW.zzZ7j() - 1;
        }
        int iIntValue = ((Integer) paragraph.zzWm(1280, 1)).intValue();
        if (iIntValue != 9) {
            return iIntValue;
        }
        return -1;
    }

    private void zzr(Paragraph paragraph) {
        int i = this.zzYD7;
        if (i != -1) {
            this.zzYD8.zzDa(i);
            if (this.zzYD6 && this.zzYD5) {
                this.zzYCW = this.zzYD7;
            }
        }
        this.zzYD7 = zzq(paragraph);
    }

    public final void zzW(FieldSeparator fieldSeparator) {
        if (fieldSeparator.isDeleteRevision()) {
            return;
        }
        zzDc(fieldSeparator.getFieldType());
    }

    public final void zzY(Paragraph paragraph, boolean z, boolean z2) {
        zzr(paragraph);
        this.zzYD6 = z2;
        this.zzYD5 = false;
        this.zzYD4 = false;
        this.zzYD3 = null;
        this.zzYD2 = null;
        zzZcU();
        if (z) {
            List listZzYOL = paragraph.getListFormat().zzYOL();
            this.zzYD2 = listZzYOL;
            this.zzYD8.zzR(listZzYOL);
            List list = this.zzYD2;
            if (list != null) {
                zzZ(list, paragraph.getListFormat().zzYOM() + 1);
            }
        }
    }

    public final void zzZ(zzZ49 zzz49) {
        zzY(zzz49);
    }

    private void zzZ(List list, int i) {
        this.zzYD1.set(list.zzYP8(), zzYCV[Math.min(i, zzYCV.length - 1)]);
    }

    public final void zzT(FieldStart fieldStart) {
        if (fieldStart.isDeleteRevision()) {
            return;
        }
        if (zzDb(fieldStart.getFieldType())) {
            this.zzYDa++;
        }
        if (this.zzYDa == 1 && zzZPU.zzD9(fieldStart.getFieldType())) {
            this.zzZEY.zzZ(fieldStart, zzS(fieldStart));
        }
    }

    public final void zzW(FieldEnd fieldEnd) {
        if (fieldEnd.isDeleteRevision() || fieldEnd.hasSeparator()) {
            return;
        }
        zzDc(fieldEnd.getFieldType());
    }

    private zzZPW zzZ(int i, char c, boolean z, int i2) {
        if (!this.zzYD6) {
            return zzLS("Main Document Only.");
        }
        return zzZ(zzS(zzY(i, c, z, i2)));
    }

    private static Style zzW(Style style) {
        while (!style.isHeading()) {
            style = style.zzY3j();
            if (style == null) {
                return null;
            }
        }
        return style;
    }

    private static zzZPW zzZ(zzZ47 zzz47) {
        zzYEF zzyef = null;
        String strZzZ = zzZ4D.zzZ(zzz47, (zzZAJ) null);
        ListLevel listLevel = zzz47.getListLevel();
        if (listLevel.getNumberStyle() == 23) {
            zzyef = new zzYEF();
            listLevel.zzZYh().zzY(zzyef, zzYEF.zzXq6);
        }
        return new zzZPW(strZzZ, zzyef, zzz47);
    }

    private void zzY(zzZ49 zzz49) {
        if (this.zzYD9 == zzz49) {
            return;
        }
        zzY zzy = (zzY) com.aspose.words.internal.zzQW.zzZ(this.zzYCZ, zzz49);
        this.zzYD8 = zzy;
        if (zzy == null) {
            zzY zzy2 = new zzY();
            this.zzYD8 = zzy2;
            this.zzYCZ.put(zzz49, zzy2);
        }
        this.zzYD9 = zzz49;
    }

    private zzZPW zzZ(FieldListNum fieldListNum) {
        zzR(fieldListNum.getStart());
        List listZzLR = zzLR(fieldListNum.getListName());
        zzZ47 zzz47ZzZ = zzZ(fieldListNum, listZzLR);
        zzZ(fieldListNum.getEnd(), listZzLR);
        return zzZ(zzz47ZzZ);
    }

    private zzZ47 zzS(List list) {
        list.getListLevels().getCount();
        int iMin = Math.min(zzDd(this.zzYCW), 8);
        int[] iArr = new int[9];
        iArr[iMin] = this.zzYCX[this.zzYD7 + 1];
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            iArr[i] = this.zzYCX[i2];
            i = i2;
        }
        return new zzZ47(list, iMin, iArr);
    }

    private List zzY(int i, char c, boolean z, int i2) {
        if (i == 2 && this.zzYD7 == -1) {
            i = 1;
        }
        int i3 = i;
        int iZzAp = zzZLM.zzAp(i2);
        if (iZzAp == 255) {
            iZzAp = 0;
        }
        int i4 = iZzAp;
        zzZ zzz = new zzZ(i3, c, z, i4);
        HashMap<zzZ, List> map = this.zzYCY;
        List list = map != null ? (List) com.aspose.words.internal.zzQW.zzZ(map, zzz) : null;
        if (list != null) {
            return list;
        }
        List listZzZ = zzZPX.zzZ(this.zzZEY, this.zzYDb, i3, c, z, i4);
        this.zzYDb = listZzZ.zzYPa();
        if (this.zzYCY == null) {
            this.zzYCY = new HashMap<>();
        }
        this.zzYCY.put(zzz, listZzZ);
        return listZzZ;
    }

    private zzZ47 zzZ(FieldListNum fieldListNum, List list) {
        zzZ47 zzz47ZzO = this.zzYD9.zzO(list);
        int iZzT = zzT(list);
        boolean z = iZzT == -1;
        int iZzZdc = fieldListNum.zzZdc();
        if (iZzZdc >= 0) {
            iZzT = iZzZdc;
        } else if (z) {
            if (list.zzYP8() == -1 && (fieldListNum.hasListName() || this.zzYD8.zzZcR() == null)) {
                iZzT = zzDd(this.zzYD8.zzZcQ());
            } else {
                iZzT = zzz47ZzO.zzYNZ();
            }
        }
        boolean z2 = this.zzYD4;
        if (!z2 || z) {
            zzZ(list, z2 ? iZzT : iZzT + 1);
        }
        zzz47ZzO.zzZ(list, iZzT, true ^ this.zzYD4);
        int iZzZdb = fieldListNum.zzZdb();
        if (iZzZdb >= 0) {
            zzz47ZzO.zzwU(iZzZdb);
        }
        return zzz47ZzO;
    }

    private void zzZ(FieldEnd fieldEnd, List list) {
        this.zzYD3 = fieldEnd;
        boolean z = this.zzYD4;
        if (!z || this.zzYD2 == null) {
            this.zzYD2 = list;
        }
        if (z) {
            return;
        }
        this.zzYD8.zzR(list);
    }
}

package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVE extends zzZ7I {
    private HashMap<Integer, Integer> zzYM7 = new HashMap<>();
    private ArrayList<Style> zzYM6 = new ArrayList<>();

    private void zzG(DocumentBase documentBase) {
        for (zzZ4J zzz4j : documentBase.getLists().zzYOX()) {
            RefInt refInt = new RefInt(0);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(zzz4j.zzYOO()), refInt);
            int i = refInt.get();
            if (zZzZ) {
                zzz4j.zzxh(i);
            }
            for (ListLevel listLevel : zzz4j.zzYOP()) {
                refInt.set(i);
                boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(listLevel.zzYOc()), refInt);
                int i2 = refInt.get();
                if (zZzZ2) {
                    listLevel.zzx2(i2);
                }
                i = i2;
            }
        }
    }

    private void zzH(DocumentBase documentBase) {
        for (Style style : documentBase.getStyles()) {
            boolean z = false;
            RefInt refInt = new RefInt(0);
            boolean z2 = style.zzY3t() != 12287 && com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(style.zzY3t()), refInt);
            int i = refInt.get();
            if (z2) {
                style.zzl3(i);
            }
            refInt.set(i);
            boolean z3 = style.zzY3v() != 12287 && com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(style.zzY3v()), refInt);
            int i2 = refInt.get();
            if (z3) {
                style.zzl5(i2);
            }
            refInt.set(i2);
            if (style.zzY3u() != 12287 && com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(style.zzY3u()), refInt)) {
                z = true;
            }
            int i3 = refInt.get();
            if (z) {
                style.zzl4(i3);
            }
        }
    }

    public static void zzI(DocumentBase documentBase) throws Exception {
        new zzZVE().zzS(documentBase);
    }

    private static boolean zzP(ArrayList<Style> arrayList, ArrayList<Style> arrayList2) {
        arrayList2.clear();
        int size = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Style style = arrayList.get(i);
            if (style != null && (arrayList2.size() <= 0 || style.equals(arrayList2.get(0)))) {
                if (zzY(style) && (size < 0 || arrayList2.get(size).zzZ7j() > style.zzZ7j())) {
                    size = arrayList2.size();
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, style);
                arrayList.set(i, null);
            }
        }
        boolean z = arrayList2.size() > 0;
        if (size < 0) {
            arrayList2.clear();
            return z;
        }
        if (size < 0) {
            Style style2 = arrayList2.get(0);
            arrayList2.set(0, arrayList2.get(size));
            arrayList2.set(size, style2);
        }
        return z;
    }

    private void zzS(DocumentBase documentBase) throws Exception {
        zzY(documentBase.getStyles());
        if (this.zzYM6.size() == 0) {
            return;
        }
        Iterator<Style> it = this.zzYM6.iterator();
        while (it.hasNext()) {
            documentBase.getStyles().zzs(it.next());
        }
        zzD(documentBase);
        zzH(documentBase);
        zzG(documentBase);
    }

    private void zzU(zzZS zzzs, int i) {
        Object objZzPk = zzzs.zzPk(i);
        if (objZzPk == null) {
            return;
        }
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, (Integer) objZzPk, refInt);
        int i2 = refInt.get();
        if (zZzZ) {
            zzzs.zzQ(i, Integer.valueOf(i2));
        }
    }

    private void zzZP(ArrayList<Style> arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        int iZzZ7j = arrayList.get(0).zzZ7j();
        for (Style style : arrayList) {
            if (style.zzZ7j() != iZzZ7j && zzZ(style)) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYM7, Integer.valueOf(style.zzZ7j()), Integer.valueOf(iZzZ7j));
                com.aspose.words.internal.zzZQG.zzZ(this.zzYM6, style);
            }
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzV(zzYEF zzyef) {
        zzU(zzyef, 50);
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzX(zzY6G zzy6g) {
        zzU(zzy6g, 4005);
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzY(zzYMX zzymx) {
        zzU(zzymx, 1000);
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzZ(zzZZF zzzzf) {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(zzzzf.zzYVZ), refInt);
        int i = refInt.get();
        if (zZzZ) {
            zzzzf.zzYVZ = i;
        }
        refInt.set(i);
        boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(this.zzYM7, Integer.valueOf(zzzzf.zzYVY), refInt);
        int i2 = refInt.get();
        if (zZzZ2) {
            zzzzf.zzYVY = i2;
        }
    }

    private static HashMap<Integer, ArrayList<Style>> zzX(StyleCollection styleCollection) {
        HashMap<Integer, ArrayList<Style>> map = new HashMap<>();
        for (Style style : styleCollection) {
            if (zzY(style) || zzZ(style)) {
                int iZzZ = zzZ(style, true);
                ArrayList<Style> arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(map, Integer.valueOf(iZzZ));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(Integer.valueOf(iZzZ), arrayList);
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList, style);
            }
        }
        return map;
    }

    private void zzY(StyleCollection styleCollection) {
        HashMap<Integer, ArrayList<Style>> mapZzX = zzX(styleCollection);
        ArrayList<Style> arrayList = new ArrayList<>();
        Iterator<T> it = mapZzX.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = (ArrayList) it.next();
            if (arrayList2.size() != 1) {
                while (zzP(arrayList2, arrayList)) {
                    zzZP(arrayList);
                }
            }
        }
    }

    private static boolean zzY(Style style) {
        Style styleZzZ8;
        if (zzX(style)) {
            return style.zzY3t() == 12287 || (styleZzZ8 = style.getDocument().getStyles().zzZ8(style.zzY3t(), false)) == null || zzX(styleZzZ8);
        }
        return false;
    }

    private static boolean zzZ(Style style) {
        Style styleZzZ8;
        if (style.getStyleIdentifier() != 4094) {
            return false;
        }
        return style.zzY3t() == 12287 || (styleZzZ8 = style.getDocument().getStyles().zzZ8(style.zzY3t(), false)) == null || styleZzZ8.getStyleIdentifier() == 4094;
    }

    private static boolean zzX(Style style) {
        int styleIdentifier = style.getStyleIdentifier();
        if (styleIdentifier == 79 || styleIdentifier == 153 || styleIdentifier == 12287 || styleIdentifier == 156 || styleIdentifier == 157) {
            return false;
        }
        switch (styleIdentifier) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                return false;
            default:
                switch (styleIdentifier) {
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                        return false;
                    default:
                        switch (styleIdentifier) {
                            case 84:
                            case 85:
                            case 86:
                                return false;
                            default:
                                switch (styleIdentifier) {
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                        return false;
                                    default:
                                        switch (styleIdentifier) {
                                            case 106:
                                            case 107:
                                            case 108:
                                            case 109:
                                            case 110:
                                                return false;
                                            default:
                                                switch (styleIdentifier) {
                                                    case 178:
                                                    case 179:
                                                    case 180:
                                                    case 181:
                                                        return false;
                                                    default:
                                                        switch (styleIdentifier) {
                                                            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                                                            case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                                                            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                                                            case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                                                            case StyleIdentifier.BOOK_TITLE /* 264 */:
                                                            case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                                                            case StyleIdentifier.TOC_HEADING /* 266 */:
                                                                return false;
                                                            default:
                                                                return true;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static void zzY(Style style, ArrayList<Style> arrayList, int i, boolean z) {
        if (style == null) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, style);
        if (z || i > 0) {
            zzZ(style, arrayList, i - 1, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzZ(Style style, boolean z) {
        int iHashCode;
        int iHashCode2;
        List listZzY39;
        int type = (((((((((((((((((((((style.getType() * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.isHeading())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.isQuickStyle())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.getAutomaticallyUpdate())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.getLocked())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.getUnhideWhenUsed())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.zzY3r())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.zzY3q())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.zzY3p())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.zzY3o())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.zzY3n())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(style.hasRevisions());
        int type2 = style.getType();
        if (type2 == 1) {
            iHashCode = ((type * 397) ^ style.zzZYh().hashCode(Style.zzXa8)) * 397;
            iHashCode2 = style.zzZYj().hashCode(Style.zzXa8);
        } else if (type2 == 2) {
            iHashCode = type * 397;
            iHashCode2 = style.zzZYh().hashCode(Style.zzXa8);
        } else if (type2 == 3) {
            int iHashCode3 = (((type * 397) ^ style.zzZYh().hashCode(Style.zzXa8)) * 397) ^ style.zzZYj().hashCode(Style.zzXa8);
            TableStyle tableStyle = (TableStyle) style;
            for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
                if (conditionalStyle.zzZYa()) {
                    iHashCode3 = (iHashCode3 * 397) ^ conditionalStyle.hashCode();
                }
            }
            iHashCode = ((((iHashCode3 * 397) ^ tableStyle.zz6G().hashCode(Style.zzXa8)) * 397) ^ tableStyle.zzZYd().hashCode(Style.zzXa8)) * 397;
            iHashCode2 = tableStyle.zzZYf().hashCode(Style.zzXa8);
        } else {
            if (type2 != 4) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected style type '{0}'.", Integer.valueOf(style.getType())));
            }
            listZzY39 = style.zzY39();
            if (listZzY39 != null) {
                type = (type * 397) ^ listZzY39.hashCode();
            }
            if (z) {
                return type;
            }
            ArrayList<Style> arrayList = new ArrayList();
            zzZ(style, arrayList, 4, true);
            HashMap map = new HashMap();
            com.aspose.words.internal.zzZQF.zzY(map, Integer.valueOf(style.zzZ7j()), Integer.valueOf(type));
            for (Style style2 : arrayList) {
                RefInt refInt = new RefInt(0);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, Integer.valueOf(style2.zzZ7j()), refInt);
                int iZzZ = refInt.get();
                if (!zZzZ) {
                    iZzZ = zzZ(style2, false);
                    com.aspose.words.internal.zzZQF.zzY(map, Integer.valueOf(style2.zzZ7j()), Integer.valueOf(iZzZ));
                }
                type = (type * 397) ^ iZzZ;
            }
            return type;
        }
        type = iHashCode ^ iHashCode2;
        listZzY39 = style.zzY39();
        if (listZzY39 != null) {
        }
        if (z) {
        }
    }

    private static void zzZ(Style style, ArrayList<Style> arrayList, int i, boolean z) {
        if (z || i > 0) {
            zzY(style.zzY3j(), arrayList, i, z);
        }
        if (i > 0) {
            zzY(style.getLinkedStyle(), arrayList, i, false);
            zzY(style.zzY3i(), arrayList, i, false);
        }
    }
}

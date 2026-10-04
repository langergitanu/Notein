package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4K {
    private static int[] zzYwe = {30, 40, 480, 490, 1580, 2250, 10010};

    public static int zzZ(int i, int i2, zzU8 zzu8) throws Exception {
        if (i2 == 0) {
            return 0;
        }
        if (zzu8.zzN3(i2)) {
            return zzu8.zzN7(i2);
        }
        List listByListId = zzu8.zzZZ5().getLists().getListByListId(i2);
        if (listByListId == null) {
            return 0;
        }
        if (i != 0) {
            List listByListId2 = zzu8.zzZZ6().getLists().getListByListId(i);
            if (zzZ(listByListId2, listByListId)) {
                zzU6.zzZZ2();
                zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Equal list: {0}->{1}.", Integer.valueOf(listByListId.getListId()), Integer.valueOf(listByListId2.getListId())));
                zzU6.zzZZ1();
                zzu8.zzYi(listByListId.getListId(), listByListId2.getListId());
                return listByListId2.getListId();
            }
        }
        return zzZ(listByListId, zzu8);
    }

    public static void zzZ(Paragraph paragraph, zzU8 zzu8) {
        zzZ4J zzz4jZzN1;
        zzYTV zzytvZzZ;
        List listZzRC = paragraph.zzRC(false);
        if (listZzRC == null || (zzz4jZzN1 = zzu8.zzN1(listZzRC.zzYP8())) == null) {
            return;
        }
        zzZ4J zzz4jZzN0 = zzu8.zzN0(listZzRC.zzYP8());
        int iIntValue = ((Integer) paragraph.zzWm(EditingLanguage.GALICIAN, 0)).intValue();
        if (zzZ(zzz4jZzN1, zzz4jZzN0, iIntValue) || (zzytvZzZ = zzz4jZzN1.zzZ(iIntValue, zzu8.zzZZ6().zzZqs())) == null) {
            return;
        }
        paragraph.zzZYj().zzY(zzytvZzZ);
        zzu8.zzZZ7();
    }

    private static boolean zzZ(zzZ4J zzz4j, zzZ4J zzz4j2, int i) {
        if (i >= zzz4j.zzYOP().getCount() || i >= zzz4j2.zzYOP().getCount()) {
            return false;
        }
        ListLevel listLevel = zzz4j.zzYOP().get(i);
        ListLevel listLevel2 = zzz4j2.zzYOP().get(i);
        if (listLevel.getNumberStyle() == 23 || listLevel2.getNumberStyle() == 23) {
            return true;
        }
        return listLevel.getNumberStyle() == listLevel2.getNumberStyle() && listLevel.getStartAt() == listLevel2.getStartAt();
    }

    private static int zzZ(List list, zzU8 zzu8) throws Exception {
        List listZzZ = zzZ(zzu8.zzZZ6(), list, zzu8);
        if (listZzZ != null) {
            zzU6.zzZZ2();
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Match list: {0}->{1}.", Integer.valueOf(list.getListId()), Integer.valueOf(listZzZ.getListId())));
            zzU6.zzZZ1();
            zzu8.zzYi(list.getListId(), listZzZ.getListId());
            return listZzZ.getListId();
        }
        zzU6.zzZZ2();
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Import list: {0}.", Integer.valueOf(list.getListId())));
        zzU6.zzZZ1();
        List listAddCopy = zzu8.zzZZ6().getLists().addCopy(list);
        if (list.isListStyleReference()) {
            listAddCopy.zzYPa().zzxh(new zzY8F(zzu8).zza(list.getStyle()));
        }
        zzu8.zzYi(list.getListId(), listAddCopy.getListId());
        return listAddCopy.getListId();
    }

    private static List zzZ(Document document, List list, zzU8 zzu8) {
        List listByListId = document.getLists().getListByListId(list.getListId());
        if (listByListId != null && zzZ(listByListId, list)) {
            return listByListId;
        }
        for (List list2 : document.getLists()) {
            if (zzZ(list2, list) && !zzu8.zzN2(list2.getListId())) {
                return list2;
            }
        }
        return null;
    }

    private static boolean zzZ(List list, List list2) {
        if (com.aspose.words.internal.zzZ4.zzZ(list, list2)) {
            return false;
        }
        if ((list.zzYP8() != list2.zzYP8() && !zzZ(list.zzYPa(), list2.zzYPa())) || list.zzYPb().getCount() != list2.zzYPb().getCount()) {
            return false;
        }
        for (int i = 0; i < list.zzYPb().getCount(); i++) {
            if (!zzZ(list.zzYPb().zzwW(i).getListLevel(), list2.zzYPb().zzwW(i).getListLevel())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZ(zzZ4J zzz4j, zzZ4J zzz4j2) {
        if (zzz4j.zzYOR() != zzz4j2.zzYOR() || zzz4j.zzYOP().getCount() != zzz4j2.zzYOP().getCount()) {
            return false;
        }
        for (int i = 0; i < zzz4j2.zzYOP().getCount(); i++) {
            if (!zzZ(zzz4j.zzYOP().get(i), zzz4j2.zzYOP().get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZ(ListLevel listLevel, ListLevel listLevel2) {
        if (listLevel.getNumberStyle() != listLevel2.getNumberStyle() || !com.aspose.words.internal.zzZKN.equals(listLevel.getNumberFormat(), listLevel2.getNumberFormat()) || listLevel.getAlignment() != listLevel2.getAlignment() || listLevel.getStartAt() != listLevel2.getStartAt()) {
            return false;
        }
        zzYEF zzyef = new zzYEF();
        listLevel.zzZYh().zzZ((zzZS) zzyef, true);
        zzYEF zzyef2 = new zzYEF();
        listLevel2.zzZYh().zzZ((zzZS) zzyef2, true);
        if (!zzyef.zzW(zzyef2, zzYwe)) {
            return false;
        }
        zzYMX zzymx = new zzYMX();
        listLevel.zzZYj().zzZ((zzZS) zzymx, true);
        zzYMX zzymx2 = new zzYMX();
        listLevel2.zzZYj().zzZ((zzZS) zzymx2, true);
        return zzymx.zzW(zzymx2, zzYwe);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4C {
    public static void zzY(ListLevel listLevel, int i) {
        listLevel.setStartAt(0);
        listLevel.setNumberStyle(255);
        listLevel.setNumberFormat("");
        listLevel.setAlignment(0);
        listLevel.setTrailingCharacter(0);
        listLevel.isLegal(false);
        listLevel.zzx1(0);
        listLevel.zzx0(0);
        listLevel.zzUH(false);
        listLevel.zzYcc = false;
        listLevel.zzUG(false);
        listLevel.setRestartAfterLevel(i - 1);
        listLevel.zzZYh().clear();
        listLevel.zzZYj().clear();
        TabStopCollection tabStopCollection = new TabStopCollection();
        listLevel.zzZYj().zzY(tabStopCollection);
        tabStopCollection.add(new TabStop(StyleIdentifier.LIST_TABLE_4_ACCENT_5, 6, 0));
    }

    public static void zzZ(List list, int i, String str, String str2, int i2, int i3) {
        ListLevel listLevel = list.getListLevels().get(i);
        listLevel.setStartAt(1);
        listLevel.setNumberStyle(23);
        listLevel.setNumberFormat(str2);
        listLevel.setAlignment(0);
        listLevel.setTrailingCharacter(0);
        listLevel.zzx1(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        listLevel.zzUH(true);
        listLevel.zzx2(StyleIdentifier.NIL);
        listLevel.setRestartAfterLevel(i - 1);
        listLevel.zzZYj().zzwa(i3);
        listLevel.zzZYj().zzwb(-360);
        TabStopCollection tabStopCollection = new TabStopCollection();
        tabStopCollection.zzPK(true);
        listLevel.zzZYj().zzY(tabStopCollection);
        tabStopCollection.add(new TabStop(i2, 6, 0));
        listLevel.zzZYh().zzBp(str);
    }

    public static void zzZ(List list, int i, int i2, String str, int i3, int i4, int i5, int i6) {
        zzZ(list, i, i2, str, i3, i4, i5, i6, StyleIdentifier.NIL, 0);
    }

    public static void zzZ(List list, int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8) {
        zzZ(list.getListLevels().get(i), i, i2, str, i3, i4, i5, i6, i7, i8);
    }

    public static void zzZ(ListLevel listLevel, int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8) {
        listLevel.setStartAt(1);
        listLevel.setNumberStyle(i2);
        listLevel.setNumberFormat(str);
        listLevel.setAlignment(i3);
        listLevel.setTrailingCharacter(i8);
        listLevel.zzx1(-i6);
        listLevel.zzUH(true);
        listLevel.zzx2(i7);
        listLevel.setRestartAfterLevel(i - 1);
        listLevel.zzZYj().zzwa(i5);
        listLevel.zzZYj().zzwb(i6);
        TabStopCollection tabStopCollection = new TabStopCollection();
        tabStopCollection.zzPK(true);
        listLevel.zzZYj().zzY(tabStopCollection);
        if (i8 == 0) {
            tabStopCollection.add(new TabStop(i4, 6, 0));
        }
    }
}

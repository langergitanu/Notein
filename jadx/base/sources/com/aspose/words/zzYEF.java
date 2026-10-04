package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
class zzYEF extends WordAttrCollection implements zzZ9G, zzZAB {
    private static zz4W zzXq9;
    static int[] zzXqa = {131073, 131076, 131075, 131074, 65537, InputDeviceCompat.SOURCE_TRACKBALL, 65539, 65538};
    private static int[] zzXq8 = {LogSeverity.ALERT_VALUE, 710, 740, 720, 730, 750};
    private static int[] zzXq7 = {13, 15, 14, 12};
    static int[] zzXq6 = {230, 270, 235, 240};
    static int[] zzXq5 = {380, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 390};
    static int[] zzXq4 = {30, 40, 890};
    static int[] zzXq3 = {60, 250, 120, 170, 70, StyleIdentifier.SUBTLE_EMPHASIS, 180, 90, 100, 110, 80, 130};
    private static int[] zzXq2 = {13, 15, 14, 12, 230, 240};
    private static zzYEF zzXq1 = zzYdy();

    public static Object zzOt(int i) {
        return zzXq1.zzPj(i);
    }

    private static zz4W zzYdv() {
        if (zzXq9 == null) {
            zzXq9 = new zz4W();
        }
        return zzXq9;
    }

    public static String zzYdw() {
        return ((zzU1) zzXq1.zzPj(270)).getName();
    }

    public static String zzYdx() {
        return ((zzU1) zzXq1.zzPj(230)).getName();
    }

    private static zzYEF zzYdy() {
        zzYEF zzyef = new zzYEF();
        zzyef.add(230, zzU1.zzSP("Times New Roman"));
        zzyef.add(270, zzU1.zzSP("Times New Roman"));
        zzyef.add(235, zzU1.zzSP("Times New Roman"));
        zzyef.add(240, zzU1.zzSP("Times New Roman"));
        zzyef.add(45, 0);
        zzyef.add(190, 20);
        zzyef.add(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 20);
        zzyef.add(60, zzZU.zzZF7);
        zzyef.add(250, zzZU.zzZF7);
        zzyef.add(70, zzZU.zzZF7);
        zzyef.add(StyleIdentifier.SUBTLE_EMPHASIS, zzZU.zzZF7);
        zzyef.add(160, com.aspose.words.internal.zzPV.zzHZ);
        zzyef.add(50, 10);
        zzyef.add(StyleIdentifier.LIST_TABLE_4_ACCENT_5, new Border());
        zzyef.add(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, new Shading());
        zzyef.add(80, zzZU.zzZF7);
        zzyef.add(300, zzZU.zzZF7);
        zzyef.add(100, zzZU.zzZF7);
        zzyef.add(90, zzZU.zzZF7);
        zzyef.add(170, zzZU.zzZF7);
        zzyef.add(180, zzZU.zzZF7);
        zzyef.add(210, 0);
        zzyef.add(110, zzZU.zzZF7);
        zzyef.add(120, zzZU.zzZF7);
        zzyef.add(130, zzZU.zzZF7);
        zzyef.add(132, zzZU.zzZF7);
        zzyef.add(10, zzZU.zzZF7);
        zzyef.add(140, 0);
        zzyef.add(450, com.aspose.words.internal.zzPV.zzHZ);
        zzyef.add(StyleIdentifier.GRID_TABLE_4_ACCENT_2, 100);
        zzyef.add(150, 0);
        zzyef.add(200, 0);
        zzyef.add(220, 0);
        zzyef.add(20, com.aspose.words.internal.zzPV.zzHZ);
        zzyef.add(StyleIdentifier.GRID_TABLE_3_ACCENT_5, 0);
        zzyef.add(440, zzZU.zzZF7);
        zzyef.add(StyleIdentifier.BIBLIOGRAPHY, zzZU.zzZF7);
        zzyef.add(StyleIdentifier.PLAIN_TABLE_2, zzZU.zzZF7);
        zzyef.add(StyleIdentifier.LIST_TABLE_2_ACCENT_1, zzZU.zzZF6);
        zzyef.add(380, 1024);
        zzyef.add(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 1024);
        zzyef.add(390, 1024);
        zzyef.add(400, 0);
        zzyef.add(460, 1);
        zzyef.add(470, 0);
        zzyef.add(500, "");
        zzyef.add(510, "");
        zzyef.add(520, "");
        zzyef.add(521, "");
        zzyef.add(522, "");
        zzyef.add(523, "");
        Boolean bool = Boolean.FALSE;
        zzyef.add(LogSeverity.ALERT_VALUE, bool);
        zzyef.add(710, bool);
        zzyef.add(720, 0);
        zzyef.add(730, 2);
        zzyef.add(750, bool);
        zzyef.add(760, bool);
        zzyef.add(770, 0);
        zzyef.add(810, zzYdv());
        zzyef.add(815, zzYdv());
        zzyef.add(820, zzYdv());
        zzyef.add(825, zzYdv());
        zzyef.add(830, zzYdv());
        zzyef.add(835, zzYdv());
        zzyef.add(840, zzYdv());
        zzyef.add(850, 0);
        zzyef.add(855, 0);
        zzyef.add(860, 0);
        zzyef.add(865, 0);
        zzyef.add(870, bool);
        zzyef.add(780, new zzZRH());
        zzyef.add(880, new zzZNW(0, 0));
        zzyef.add(30, 0);
        zzyef.add(40, 0);
        return zzyef;
    }

    private static int zznd(int i) {
        if ((i & 16) != 0) {
            return 2;
        }
        return (i & 9) != 0 ? 1 : 0;
    }

    public static Object zzne(int i) {
        return zzXq1.zzPk(i);
    }

    @Override // com.aspose.words.zzZ9G
    public void clearRunAttrs() {
        clear();
    }

    @Override // com.aspose.words.zzZ9G
    public Object fetchInheritedRunAttr(int i) {
        return zzPi(i);
    }

    public final Border getBorder() {
        return (Border) zzPj(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
    }

    @Override // com.aspose.words.zzZ9G
    public Object getDirectRunAttr(int i) {
        return zzPk(i);
    }

    public final int getLocaleId() {
        return ((Integer) zzPj(380)).intValue();
    }

    public final int getLocaleIdBi() {
        return ((Integer) zzPj(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2)).intValue();
    }

    public final int getLocaleIdFarEast() {
        return ((Integer) zzPj(390)).intValue();
    }

    public final String getNameAscii() {
        return ((zzU1) zzPj(230)).getName();
    }

    public final String getNameFarEast() {
        return ((zzU1) zzPj(235)).getName();
    }

    public final String getNameOther() {
        return ((zzU1) zzPj(240)).getName();
    }

    public final int getScaling() {
        return ((Integer) zzPj(StyleIdentifier.GRID_TABLE_4_ACCENT_2)).intValue();
    }

    public final Shading getShading() {
        return (Shading) zzPj(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
    }

    public final int getSize() {
        return ((Integer) zzPj(190)).intValue();
    }

    public final int getSpacing() {
        return ((Integer) zzPj(150)).intValue();
    }

    public final int getUnderline() {
        return ((Integer) zzPj(140)).intValue();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(210)).intValue();
    }

    @Override // com.aspose.words.zzZ9G
    public void removeRunAttr(int i) {
        remove(i);
    }

    public final void setLocaleIdBi(int i) {
        zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(i));
    }

    public final void setLocaleIdFarEast(int i) {
        zzQ(390, Integer.valueOf(i));
    }

    public final void setName(String str) {
        setNameAscii(str);
        setNameBi(str);
        setNameFarEast(str);
        setNameOther(str);
    }

    public final void setNameAscii(String str) {
        zzQ(230, zzU1.zzSP(str));
    }

    public final void setNameBi(String str) {
        zzQ(270, zzU1.zzSP(str));
    }

    public final void setNameFarEast(String str) {
        zzQ(235, zzU1.zzSP(str));
    }

    public final void setNameOther(String str) {
        zzQ(240, zzU1.zzSP(str));
    }

    @Override // com.aspose.words.zzZ9G
    public void setRunAttr(int i, Object obj) {
        zzQ(i, obj);
    }

    public final void setSize(int i) {
        zzQ(190, Integer.valueOf(i));
    }

    public final void setSpacing(int i) {
        zzQ(150, Integer.valueOf(i));
    }

    public final void setUnderline(int i) {
        zzQ(140, Integer.valueOf(i));
    }

    public final void zzBl(int i) {
        zzQ(50, Integer.valueOf(i));
    }

    public final void zzBp(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            setNameOther(str);
            setNameAscii(str);
        }
    }

    public final void zzI(zzZS zzzs) {
        boolean zContains = contains(500);
        if ((!zContains && contains(160)) || zzzs.zzPg(500)) {
            zzzs.remove(500);
        }
        if (zContains) {
            if (zzzs.contains(510) && !contains(510)) {
                zzzs.zzQ(510, "");
            }
            if (!zzzs.contains(520) || contains(520)) {
                return;
            }
            zzzs.zzQ(520, "");
        }
    }

    public final void zzP(zzU1 zzu1) {
        zzQ(270, zzu1);
    }

    public final void zzQ(zzU1 zzu1) {
        zzQ(240, zzu1);
    }

    public final void zzR(zzU1 zzu1) {
        zzQ(235, zzu1);
    }

    public final void zzR8(boolean z) {
        zzX(760, Boolean.valueOf(z), z);
    }

    public final void zzR9(boolean z) {
        zzX(750, Boolean.valueOf(z), z);
    }

    public final void zzRa(boolean z) {
        zzX(710, Boolean.valueOf(z), z);
    }

    public final void zzRb(boolean z) {
        zzX(LogSeverity.ALERT_VALUE, Boolean.valueOf(z), z);
    }

    public final void zzRc(boolean z) {
        zzS(50, z ? zzXq2 : zzXq7);
    }

    public final void zzS(zzU1 zzu1) {
        zzQ(230, zzu1);
    }

    public final void zzT(zzZU zzzu) {
        zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, zzzu);
    }

    public final void zzU(zzZU zzzu) {
        zzQ(300, zzzu);
    }

    public final void zzV(zzZU zzzu) {
        zzQ(StyleIdentifier.PLAIN_TABLE_2, zzzu);
    }

    @Override // com.aspose.words.WordAttrCollection
    public final Object zzVQ(int i, int i2) {
        return zzB(i, zznd(i2), false);
    }

    @Override // com.aspose.words.WordAttrCollection
    public final Object zzVR(int i, int i2) {
        return zzB(i, zznd(i2), true);
    }

    public final void zzW(zzZU zzzu) {
        zzQ(StyleIdentifier.BIBLIOGRAPHY, zzzu);
    }

    public final void zzX(zzZU zzzu) {
        zzQ(StyleIdentifier.SUBTLE_EMPHASIS, zzzu);
    }

    public final void zzY(com.aspose.words.internal.zzPV zzpv) {
        zzQ(160, zzpv);
    }

    public final com.aspose.words.internal.zzPV zzYKP() {
        return (com.aspose.words.internal.zzPV) zzPj(20);
    }

    public final int zzYL4() {
        return ((Integer) zzPj(220)).intValue();
    }

    public final int zzYL6() {
        return ((Integer) zzPj(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4)).intValue();
    }

    public final boolean zzYdA() {
        return zzYdS().zzZYI() || zzYdP().zzZYI() || zzYdR().zzZYI() || zzYdQ().zzZYI();
    }

    public final zzO zzYdB() {
        return (zzO) zzPk(790);
    }

    public final zzZRH zzYdC() {
        return (zzZRH) zzPk(780);
    }

    public final boolean zzYdD() {
        int i = 0;
        while (true) {
            int[] iArr = zzXq8;
            if (i >= iArr.length) {
                return false;
            }
            if (zzPk(iArr[i]) != null) {
                return true;
            }
            i++;
        }
    }

    public final boolean zzYdE() {
        return ((Boolean) zzPj(750)).booleanValue();
    }

    public final zzZ0V zzYdF() {
        return (zzZ0V) zzPk(740);
    }

    public final int zzYdG() {
        return ((Integer) zzPj(730)).intValue();
    }

    public final int zzYdH() {
        return ((Integer) zzPj(720)).intValue();
    }

    public final boolean zzYdI() {
        return ((Boolean) zzPj(710)).booleanValue();
    }

    public final boolean zzYdJ() {
        return ((Boolean) zzPj(LogSeverity.ALERT_VALUE)).booleanValue();
    }

    public final zzZU zzYdK() {
        return (zzZU) zzPj(440);
    }

    public final zzZU zzYdL() {
        return (zzZU) zzPj(StyleIdentifier.PLAIN_TABLE_2);
    }

    public final zzZU zzYdM() {
        return (zzZU) zzPj(StyleIdentifier.BIBLIOGRAPHY);
    }

    public final zzZU zzYdN() {
        return (zzZU) zzPj(StyleIdentifier.SUBTLE_EMPHASIS);
    }

    public final zzZU zzYdO() {
        return (zzZU) zzPj(250);
    }

    public final zzU1 zzYdP() {
        return (zzU1) zzPj(270);
    }

    public final zzU1 zzYdQ() {
        return (zzU1) zzPj(240);
    }

    public final zzU1 zzYdR() {
        return (zzU1) zzPj(235);
    }

    public final zzU1 zzYdS() {
        return (zzU1) zzPj(230);
    }

    public final int zzYdT() {
        return ((zzU1) zzPj(235)).zzZYJ();
    }

    public final void zzYdU() {
        zzQ(220, 36);
    }

    public final void zzYdV() {
        zzQ(210, 0);
    }

    public final zzZU zzYdW() {
        return (zzZU) zzPj(130);
    }

    public final zzZU zzYdX() {
        return (zzZU) zzPj(120);
    }

    public final zzZU zzYdY() {
        return (zzZU) zzPj(110);
    }

    public final zzZU zzYdZ() {
        return (zzZU) zzPj(80);
    }

    public final boolean zzYdz() {
        return zzYdS().zzZYI() && zzYdP().zzZYI() && zzYdR().zzZYI() && zzYdQ().zzZYI();
    }

    public final zzZU zzYe0() {
        return (zzZU) zzPj(70);
    }

    public final zzZU zzYe1() {
        return (zzZU) zzPj(60);
    }

    public final int zzYe2() {
        return ((Integer) zzPj(40)).intValue();
    }

    public final int zzYe3() {
        return ((Integer) zzPj(30)).intValue();
    }

    @Override // com.aspose.words.WordAttrCollection
    public final void zzYpN() {
        zzRc(false);
    }

    public final void zzZ(zzZU zzzu) {
        zzQ(130, zzzu);
    }

    public final int zzZ7j() {
        return ((Integer) zzPj(50)).intValue();
    }

    public final int zzZ7n() {
        return ((Integer) zzPj(400)).intValue();
    }

    public final int zzZUF() {
        return ((Integer) zzPj(45)).intValue();
    }

    public final void zzZW(com.aspose.words.internal.zzPV zzpv) {
        zzQ(450, zzpv);
    }

    @Override // com.aspose.words.zzZAB
    public final boolean zzZw0() {
        return false;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return (com.aspose.words.internal.zzPV) zzPj(160);
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzXq1;
    }

    public final zzYEF zzn9(int i) {
        if (zzYsN() != null) {
            if ((i & 8) != 0) {
                zzYEF zzyef = (zzYEF) zzbn();
                zzyef.zzRc(false);
                return zzyef;
            }
            if ((i & 16) != 0) {
                return (zzYEF) zzYsN().zzZ6C();
            }
        }
        return this;
    }

    public final void zzna(int i) {
        zzX(730, Integer.valueOf(i), i != 2);
    }

    public final void zznb(int i) {
        zzX(720, Integer.valueOf(i), i != 0);
    }

    public final void zznc(int i) {
        zzQ(235, zzU1.zzMW(i));
    }

    @Override // com.aspose.words.internal.zzZYU
    public final int zzrb() {
        return 4;
    }

    public final void zzvA(int i) {
        zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(i));
    }

    public final void zzvs(int i) {
        zzQ(45, Integer.valueOf(i));
    }

    public static boolean zzW(zzYEF zzyef, zzYEF zzyef2) {
        return zzyef2.zzW(zzyef, zzyef2.zzYdM().toBool() ? Run.zzXqb : Run.zzXqc);
    }

    @Override // com.aspose.words.zzZ9G
    public Object getDirectRunAttr(int i, int i2) {
        return zzVQ(i, i2);
    }

    public final void zzU(zzZRH zzzrh) {
        zzQ(780, zzzrh);
    }

    public final void zzY(zzZU zzzu) {
        zzQ(250, zzzu);
    }

    public final void zzZ(zzO zzo) {
        zzQ(790, zzo);
    }

    public final void zzY(zzZ0V zzz0v) {
        zzX(740, zzz0v, zzz0v != null);
    }
}

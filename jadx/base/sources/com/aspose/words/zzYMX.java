package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
class zzYMX extends WordAttrCollection implements zzZ9Q {
    private static zzYMX zzXGX;
    static int[] zzXGZ = {1440, 1450, 1290, 1300, 1292, 1302, 1310, 1430, 1320, 1330, 1340, 1480, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 1490, 1520};
    static int[] zzXGY = {1350, 1360, 1370, 1380, 1390, 1400};
    static com.aspose.words.internal.zzZQH<Integer, Integer> zzZzU = new com.aspose.words.internal.zzZQH<>();
    private static int[] zzXGW = {EditingLanguage.DIVEHI};

    static {
        zzYMX zzymx = new zzYMX();
        zzXGX = zzymx;
        zzymx.add(1000, 0);
        zzXGX.add(PointerIconCompat.TYPE_GRAB, 0);
        zzYMX zzymx2 = zzXGX;
        Boolean bool = Boolean.FALSE;
        zzymx2.add(1022, bool);
        zzXGX.add(EditingLanguage.DANISH, bool);
        zzXGX.add(EditingLanguage.ITALIAN_ITALY, bool);
        zzXGX.add(1050, bool);
        zzXGX.add(EditingLanguage.SLOVENIAN, bool);
        zzXGX.add(EditingLanguage.YORUBA, bool);
        zzXGX.add(1410, bool);
        zzYMX zzymx3 = zzXGX;
        Boolean bool2 = Boolean.TRUE;
        zzymx3.add(1470, bool2);
        zzXGX.add(EditingLanguage.PAPIAMENTU, bool);
        zzXGX.add(EditingLanguage.SORBIAN, bool2);
        zzXGX.add(EditingLanguage.FAEROESE, bool2);
        zzXGX.add(EditingLanguage.TURKMEN, bool2);
        zzXGX.add(EditingLanguage.MALAYALAM, bool);
        zzXGX.add(1240, bool2);
        zzXGX.add(1250, bool2);
        zzXGX.add(1270, bool2);
        zzXGX.add(1510, 4);
        zzXGX.add(1260, bool2);
        zzXGX.add(1560, bool);
        zzXGX.add(1580, 0);
        zzXGX.add(EditingLanguage.GALICIAN, 0);
        zzXGX.add(EditingLanguage.KASHMIRI_ARABIC, 0);
        zzXGX.add(1280, 9);
        zzXGX.add(1160, 0);
        zzXGX.add(EditingLanguage.BRETON, 0);
        zzXGX.add(EditingLanguage.CENTRAL_KURDISH_IRAQ, 0);
        zzXGX.add(1210, bool);
        zzXGX.add(1230, bool);
        zzXGX.add(1200, 0);
        zzXGX.add(1220, 0);
        zzXGX.add(1205, 0);
        zzXGX.add(1225, 0);
        zzXGX.add(1165, 0);
        zzXGX.add(EditingLanguage.CORSICAN, 0);
        zzXGX.add(1175, 0);
        zzXGX.add(EditingLanguage.GUARANI, new TabStopCollection());
        zzXGX.add(1350, new Border());
        zzXGX.add(1360, new Border());
        zzXGX.add(1370, new Border());
        zzXGX.add(1380, new Border());
        zzXGX.add(1390, new Border());
        zzXGX.add(1400, new Border());
        zzXGX.add(1460, new Shading());
        zzXGX.add(1310, 0);
        zzXGX.add(1430, new zzZKP(2, 0));
        zzXGX.add(1292, 0);
        zzXGX.add(1302, 0);
        zzXGX.add(1290, 0);
        zzXGX.add(1300, 0);
        zzXGX.add(1520, bool);
        zzXGX.add(1320, 2);
        zzXGX.add(1330, 0);
        zzXGX.add(1340, 0);
        zzXGX.add(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0);
        zzXGX.add(1490, 0);
        zzXGX.add(1450, 0);
        zzXGX.add(1440, 0);
        zzXGX.add(1480, 0);
        zzXGX.add(1660, bool);
        zzXGX.add(1585, 0);
        zzXGX.add(1590, 0);
        zzXGX.add(1592, 0);
        zzXGX.add(1593, 0);
        zzXGX.add(1594, 0);
        zzXGX.add(1595, 0);
        zzXGX.add(1650, new zzZ52(240, 2));
        zzXGX.add(1610, 0);
        zzXGX.add(1640, 0);
        zzXGX.add(1620, 0);
        zzXGX.add(1630, 0);
        zzXGX.add(1670, bool);
        zzZzU.zzB(3, 1350);
        zzZzU.zzB(1, 1360);
        zzZzU.zzB(0, 1370);
        zzZzU.zzB(2, 1380);
        zzZzU.zzB(4, 1390);
        zzZzU.zzB(5, 1400);
    }

    public static Object zzOt(int i) {
        return zzXGX.zzPj(i);
    }

    public static boolean zzWp(int i, int i2) {
        return i2 != 10 ? i2 != 30 || Math.abs(i) <= 31681 : i <= 31679;
    }

    private boolean zzYpo() {
        return ((Boolean) zzPj(1520)).booleanValue();
    }

    private int zzYpp() {
        return ((Integer) zzPj(1490)).intValue();
    }

    private int zzYpq() {
        return ((Integer) zzPj(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).intValue();
    }

    public static boolean zzqC(int i) {
        return i == 1160 || i == 1170 || i == 1165 || i == 1175;
    }

    public static int zzqE(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 2) {
            return i;
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ9Q
    public void clearParaAttrs() {
        clear();
    }

    @Override // com.aspose.words.zzZ9Q
    public Object fetchInheritedParaAttr(int i) {
        return zzPi(i);
    }

    @Override // com.aspose.words.zzZ9Q
    public Object fetchParaAttr(int i) {
        Object objZzPk = zzPk(i);
        return objZzPk != null ? objZzPk : fetchInheritedParaAttr(i);
    }

    public final int getAlignment() {
        return ((Integer) zzPj(PointerIconCompat.TYPE_GRAB)).intValue();
    }

    public final boolean getBidi() {
        return ((Boolean) zzPj(1560)).booleanValue();
    }

    @Override // com.aspose.words.zzZ9Q
    public Object getDirectParaAttr(int i) {
        return zzPk(i);
    }

    public final int getDropCapPosition() {
        return ((Integer) zzPj(1440)).intValue();
    }

    public final int getLineSpacingRule() {
        return ((zzZ52) zzPj(1650)).zzZ4A();
    }

    public final int getListId() {
        return ((Integer) zzPj(EditingLanguage.KASHMIRI_ARABIC)).intValue();
    }

    public final int getOutlineLevel() {
        return ((Integer) zzPj(1280)).intValue();
    }

    public final Shading getShading() {
        return (Shading) zzPj(1460);
    }

    public final boolean getSpaceBeforeAuto() {
        return ((Boolean) zzPj(1210)).booleanValue();
    }

    public final TabStopCollection getTabStops() {
        return (TabStopCollection) zzPk(EditingLanguage.GUARANI);
    }

    @Override // com.aspose.words.zzZ9Q
    public void removeParaAttr(int i) {
        remove(i);
    }

    public final void setAlignment(int i) {
        zzQ(PointerIconCompat.TYPE_GRAB, Integer.valueOf(i));
    }

    public final void setBidi(boolean z) {
        zzQ(1560, Boolean.valueOf(z));
    }

    public final void setKeepWithNext(boolean z) {
        zzQ(1050, Boolean.valueOf(z));
    }

    public final void setLineSpacingRule(int i) {
        ((zzZ52) zzhM(1650)).zzAe(i);
    }

    public final void setOutlineLevel(int i) {
        zzQ(1280, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ9Q
    public void setParaAttr(int i, Object obj) {
        zzQ(i, obj);
    }

    public final void setSpaceAfterAuto(boolean z) {
        zzQ(1230, Boolean.valueOf(z));
    }

    public final void setSpaceBeforeAuto(boolean z) {
        zzQ(1210, Boolean.valueOf(z));
    }

    public final void setSuppressLineNumbers(boolean z) {
        zzQ(EditingLanguage.YORUBA, Boolean.valueOf(z));
    }

    public final Border zz5A() {
        return (Border) zzPj(1350);
    }

    public final Border zz5x() {
        return (Border) zzPj(1380);
    }

    public final Border zz5y() {
        return (Border) zzPj(1360);
    }

    public final Border zz5z() {
        return (Border) zzPj(1370);
    }

    public final void zzBl(int i) {
        zzQ(1000, Integer.valueOf(i));
    }

    public final int zzHT() {
        return ((zzZ52) zzPj(1650)).getValue();
    }

    public final int zzJ4() {
        return ((zzZKP) zzPj(1430)).getValue();
    }

    public final int zzJ5() {
        return ((Integer) zzPj(1310)).intValue();
    }

    public final void zzL(Border border) {
        zzQ(1380, border);
    }

    public final void zzM(Border border) {
        zzQ(1360, border);
    }

    public final void zzN(Border border) {
        zzQ(1370, border);
    }

    public final void zzO(Border border) {
        zzQ(1350, border);
    }

    public final void zzY(zzYTV zzytv) {
        zzQ(EditingLanguage.DIVEHI, zzytv);
    }

    public final int zzYM3() {
        return ((Integer) zzPj(1593)).intValue();
    }

    public final int zzYM4() {
        return ((Integer) zzPj(EditingLanguage.BRETON)).intValue();
    }

    public final int zzYM6() {
        return ((Integer) zzPj(1592)).intValue();
    }

    public final int zzYM7() {
        return ((Integer) zzPj(1160)).intValue();
    }

    public final int zzYMa() {
        return ((Integer) zzPj(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue();
    }

    public final int zzYpA() {
        return ((zzZKP) zzPj(1430)).zzZ4A();
    }

    public final int zzYpB() {
        return ((Integer) zzPj(1302)).intValue();
    }

    public final int zzYpC() {
        return ((Integer) zzPj(1292)).intValue();
    }

    public final void zzYpD() {
        zzQ(1300, 0);
    }

    public final int zzYpE() {
        return ((Integer) zzPj(1300)).intValue();
    }

    public final boolean zzYpF() {
        return zzVE(1430) || zzVE(1310) || zzVE(1292) || zzVE(1302) || zzVE(1290) || zzVE(1300) || zzVE(1320) || zzVE(1330);
    }

    public final void zzYpG() {
        zzQ(1290, 0);
    }

    public final int zzYpH() {
        return ((Integer) zzPj(1290)).intValue();
    }

    public final void zzYpI() {
        zzQ(EditingLanguage.BRETON, 0);
    }

    public final boolean zzYpJ() {
        return zzYpK() != null;
    }

    public final zzYTV zzYpK() {
        return (zzYTV) zzPk(EditingLanguage.DIVEHI);
    }

    public final boolean zzYpL() {
        return zzVE(EditingLanguage.KASHMIRI_ARABIC) && getListId() == 0;
    }

    public final void zzYpM() {
        zzQ(EditingLanguage.ITALIAN_ITALY, Boolean.FALSE);
    }

    @Override // com.aspose.words.WordAttrCollection
    public final void zzYpN() {
        if (zzYpg()) {
            remove(1160);
            remove(EditingLanguage.CENTRAL_KURDISH_IRAQ);
        }
        zzS(1000, zzXGW);
    }

    public final boolean zzYpg() {
        Object obj;
        if (zzYsN() == null || (obj = zzYsN().zzZ6C().get(EditingLanguage.KASHMIRI_ARABIC)) == null) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = get(EditingLanguage.KASHMIRI_ARABIC);
        return (obj2 != null ? ((Integer) obj2).intValue() : 0) != iIntValue;
    }

    public final boolean zzYph() {
        return (zzYsN() == null || ((Integer) zzPj(1000)) == ((Integer) zzYsN().zzZ6C().zzPj(1000))) ? false : true;
    }

    public final void zzYpi() {
        if (zzYpK() == null) {
            zzY(new zzYTV());
        }
    }

    public final void zzYpj() {
        TabStopCollection tabStops = getTabStops();
        if (tabStops != null) {
            tabStops.zzYpj();
        }
    }

    public final void zzYpk() {
        for (int i : zzXGZ) {
            remove(i);
        }
    }

    public final int zzYpl() {
        return ((Integer) zzPj(1595)).intValue();
    }

    public final int zzYpm() {
        return ((Integer) zzPj(1594)).intValue();
    }

    public final boolean zzYpn() {
        return ((Boolean) zzPj(1670)).booleanValue();
    }

    public final int zzYpr() {
        return ((Integer) zzPj(1480)).intValue();
    }

    public final int zzYps() {
        return ((Integer) zzPj(1585)).intValue();
    }

    public final void zzYpt() {
        zzQ(1470, Boolean.FALSE);
    }

    public final Border zzYpu() {
        return (Border) zzPj(1400);
    }

    public final Border zzYpv() {
        return (Border) zzPj(1390);
    }

    public final boolean zzYpw() {
        return ((Boolean) zzPj(1660)).booleanValue();
    }

    public final int zzYpx() {
        return ((Integer) zzPj(1340)).intValue();
    }

    public final int zzYpy() {
        return ((Integer) zzPj(1330)).intValue();
    }

    public final int zzYpz() {
        return ((Integer) zzPj(1320)).intValue();
    }

    public final void zzZ(Shading shading) {
        zzQ(1460, shading);
    }

    public final int zzZ0C() {
        return ((Integer) zzPj(EditingLanguage.GALICIAN)).intValue();
    }

    public final int zzZ7j() {
        return ((Integer) zzPj(1000)).intValue();
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzXGX;
    }

    public final zzYMX zzqD(int i) {
        if (zzYsN() != null) {
            if ((i & 16) != 0) {
                zzYMX zzymx = (zzYMX) zzbn();
                zzymx.zzYpN();
                return zzymx;
            }
            if ((i & 32) != 0) {
                return (zzYMX) zzYsN().zzZ6C();
            }
        }
        return this;
    }

    public final void zzqF(int i) {
        zzQ(1585, Integer.valueOf(i));
    }

    public final void zzqG(int i) {
        zzQ(1450, Integer.valueOf(i));
    }

    public final void zzrM(int i) {
        zzQ(EditingLanguage.GALICIAN, Integer.valueOf(ListLevel.zzx6(i)));
    }

    @Override // com.aspose.words.internal.zzZYU
    public final int zzrb() {
        return 2;
    }

    public final void zzw3(int i) {
        zzQ(1220, Integer.valueOf(i));
    }

    public final void zzw5(int i) {
        zzQ(1200, Integer.valueOf(i));
    }

    public final void zzw6(int i) {
        ((zzZ52) zzhM(1650)).setValue(i);
    }

    public final void zzwa(int i) {
        zzQ(1160, Integer.valueOf(i));
    }

    public final void zzwb(int i) {
        zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(i));
    }

    public final void zzx(Border border) {
        zzQ(1400, border);
    }

    public final void zzxC(int i) {
        zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(i));
    }

    public final void zzy(Border border) {
        zzQ(1390, border);
    }

    @Override // com.aspose.words.zzZ9Q
    public Object getDirectParaAttr(int i, int i2) {
        return zzVQ(i, i2);
    }

    public final void zzN(zzYMX zzymx) {
        if (zzYpE() != 0) {
            zzymx.remove(1302);
        } else if (zzYpB() > 0) {
            zzymx.remove(1300);
        }
        if (zzYpH() != 0) {
            zzymx.remove(1292);
        } else if (zzYpC() > 0) {
            zzymx.remove(1290);
        }
    }

    public final boolean zzO(zzYMX zzymx) {
        boolean zZzY = FrameFormat.zzY(this);
        boolean zZzY2 = FrameFormat.zzY(zzymx);
        if (zZzY || zZzY2) {
            return zZzY == zZzY2 && zzYpz() == zzymx.zzYpz() && zzYpy() == zzymx.zzYpy() && zzYpC() == zzymx.zzYpC() && zzYpB() == zzymx.zzYpB() && zzYpH() == zzymx.zzYpH() && zzYpE() == zzymx.zzYpE() && zzJ5() == zzymx.zzJ5() && zzJ4() == zzymx.zzJ4() && zzYpA() == zzymx.zzYpA() && zzYpq() == zzymx.zzYpq() && zzYpp() == zzymx.zzYpp() && zzYpx() == zzymx.zzYpx() && zzYpo() == zzymx.zzYpo() && zzYpr() == zzymx.zzYpr();
        }
        return true;
    }

    public final void zzY(TabStopCollection tabStopCollection) {
        zzQ(EditingLanguage.GUARANI, tabStopCollection);
    }
}

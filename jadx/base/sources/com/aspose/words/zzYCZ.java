package com.aspose.words;

import com.aspose.words.zzZ3W;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCZ extends WordAttrCollection implements zzZ9E {
    private static boolean zzLX;
    private static zzYCZ zzXnS;
    static com.aspose.words.internal.zzD3<zzYCZ> zzXnU = new com.aspose.words.internal.zzD3<>();
    static int[] zzXGY = {2130, 2140, 2150, 2160};
    private static Object zzXnT = new Object();
    private static zzZ3W.zzZ zzXnR = new zzZ3W.zzZ(1800, 1800, 1440, 1440);

    static {
        zzYCZ zzycz = new zzYCZ();
        zzXnS = zzycz;
        zzycz.add(2030, 2);
        zzYCZ zzycz2 = zzXnS;
        Boolean bool = Boolean.FALSE;
        zzycz2.add(2040, bool);
        zzXnS.add(2100, bool);
        zzXnS.add(2340, 0);
        zzXnS.add(2440, 0);
        zzXnS.add(2450, bool);
        zzXnS.add(2260, 12240);
        zzXnS.add(2270, 15840);
        zzXnS.add(2210, 1);
        zzXnS.add(2090, 0);
        zzXnS.add(2312, 0);
        zzXnS.add(EditingLanguage.PORTUGUESE_PORTUGAL, 0);
        zzXnS.add(2080, 0);
        zzXnS.add(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, 0);
        zzXnS.add(2190, 0);
        zzXnS.add(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, 0);
        zzXnS.add(2050, bool);
        zzXnS.add(2200, 1);
        zzXnS.add(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, 0);
        zzXnS.add(2120, 0);
        zzXnS.add(2400, 0);
        zzXnS.add(2180, 1);
        zzYCZ zzycz3 = zzXnS;
        Boolean bool2 = Boolean.TRUE;
        zzycz3.add(2360, bool2);
        zzXnS.add(2350, 1);
        zzXnS.add(EditingLanguage.FRENCH_BELGIUM, bool);
        zzXnS.add(2380, new zzY5Y());
        zzXnS.add(2410, bool);
        zzXnS.add(2390, bool);
        zzXnS.add(2140, new Border());
        zzXnS.add(2160, new Border());
        zzXnS.add(2130, new Border());
        zzXnS.add(2150, new Border());
        zzXnS.add(2220, 0);
        zzXnS.add(2240, 0);
        zzXnS.add(2230, bool2);
        zzXnS.add(2420, 0);
        zzXnS.add(2170, 0);
        zzXnS.add(2430, 0);
        zzXnS.add(2500, 1);
        zzXnS.add(2530, 0);
        zzXnS.add(2520, 1);
        zzXnS.add(2510, 0);
        zzXnS.add(2540, 0);
        zzXnS.add(2600, 3);
        zzXnS.add(2630, 2);
        zzXnS.add(2620, 1);
        zzXnS.add(2610, 0);
        zzXnS.add(2650, 0);
        zzXnS.add(2250, 0);
    }

    public static Object zzOt(int i) {
        return zzYce().zzPk(i);
    }

    private static void zzY(IWarningCallback iWarningCallback, String str) {
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 0, str);
        }
    }

    public static int zzYcc() {
        if (zzLX) {
            return -1;
        }
        return com.aspose.words.internal.zzZNG.zzpZ().zzj9().intValue();
    }

    private static zzYCZ zzYce() {
        zzYCZ zzycz;
        int iZzYcc = zzYcc();
        synchronized (zzXnT) {
            zzycz = zzXnU.get(iZzYcc);
        }
        if (zzycz != null) {
            return zzycz;
        }
        zzYCZ zzycz2 = new zzYCZ();
        zzZ(zzycz2, iZzYcc);
        synchronized (zzXnT) {
            zzXnU.set(iZzYcc, zzycz2);
        }
        return zzycz2;
    }

    private static int zzZh(int i, boolean z) {
        return i != -1 ? zzZ3W.zzwG(i) : z ? 708 : 720;
    }

    private static int zzZi(int i, boolean z) {
        return i != -1 ? zzZ3W.zzwG(i) : z ? 708 : 720;
    }

    private static zzZ3W.zzZ zzmw(int i) {
        return i != -1 ? zzZ3W.zzwH(i) : zzXnR;
    }

    @Override // com.aspose.words.zzZ9E
    public final void clearSectionAttrs() {
        clear();
    }

    @Override // com.aspose.words.zzZ9E
    public final Object fetchInheritedSectionAttr(int i) {
        return zzPi(i);
    }

    @Override // com.aspose.words.zzZ9E
    public final Object fetchSectionAttr(int i) {
        return zzPj(i);
    }

    public final boolean getBidi() {
        return ((Boolean) zzPj(2450)).booleanValue();
    }

    public final boolean getBorderAlwaysInFront() {
        return ((Boolean) zzPj(2230)).booleanValue();
    }

    public final int getBorderAppliesTo() {
        return ((Integer) zzPj(2220)).intValue();
    }

    public final int getBorderDistanceFrom() {
        return ((Integer) zzPj(2240)).intValue();
    }

    public final int getColumnsCount() {
        return ((Integer) zzPj(2350)).intValue();
    }

    public final boolean getDifferentFirstPageHeaderFooter() {
        return ((Boolean) zzPj(2040)).booleanValue();
    }

    @Override // com.aspose.words.zzZ9E
    public final Object getDirectSectionAttr(int i) {
        return zzPk(i);
    }

    public final int getFirstPageTray() {
        return ((Integer) zzPj(EditingLanguage.PORTUGUESE_PORTUGAL)).intValue();
    }

    public final int getHeadingLevelForChapter() {
        return ((Integer) zzPj(2190)).intValue();
    }

    public final int getLineNumberCountBy() {
        return ((Integer) zzPj(2120)).intValue();
    }

    public final int getLineNumberRestartMode() {
        return ((Integer) zzPj(EditingLanguage.MALAY_BRUNEI_DARUSSALAM)).intValue();
    }

    public final int getLineStartingNumber() {
        return ((Integer) zzPj(2180)).intValue();
    }

    public final int getOrientation() {
        return ((Integer) zzPj(2210)).intValue();
    }

    public final int getOtherPagesTray() {
        return ((Integer) zzPj(2080)).intValue();
    }

    public final int getPageHeight() {
        return ((Integer) zzPj(2270)).intValue();
    }

    public final int getPageStartingNumber() {
        return ((Integer) zzPj(2200)).intValue();
    }

    public final int getPageWidth() {
        return ((Integer) zzPj(2260)).intValue();
    }

    public final boolean getRestartPageNumbering() {
        return ((Boolean) zzPj(2050)).booleanValue();
    }

    public final boolean getRtlGutter() {
        return ((Boolean) zzPj(2410)).booleanValue();
    }

    public final int getSectionStart() {
        return ((Integer) zzPj(2030)).intValue();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(2340)).intValue();
    }

    public final void setChapterPageSeparator(int i) {
        zzQ(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, Integer.valueOf(i));
    }

    public final void setDifferentFirstPageHeaderFooter(boolean z) {
        zzQ(2040, Boolean.valueOf(z));
    }

    public final void setHeadingLevelForChapter(int i) {
        zzQ(2190, Integer.valueOf(i));
    }

    public final void setLineStartingNumber(int i) {
        zzQ(2180, Integer.valueOf(i));
    }

    public final void setPageNumberStyle(int i) {
        zzQ(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, Integer.valueOf(i));
    }

    public final void setPageStartingNumber(int i) {
        zzQ(2200, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ9E
    public final void setSectionAttr(int i, Object obj) {
        if (i == 2260 || i == 2270) {
            remove(2090);
        }
        zzQ(i, obj);
    }

    public final void setSectionStart(int i) {
        zzQ(2030, Integer.valueOf(i));
    }

    public final Border zz5A() {
        return (Border) zzPj(2130);
    }

    public final Border zz5x() {
        return (Border) zzPj(2160);
    }

    public final Border zz5y() {
        return (Border) zzPj(2140);
    }

    public final Border zz5z() {
        return (Border) zzPj(2150);
    }

    public final void zzHi(int i) {
        zzQ(2290, Integer.valueOf(i));
    }

    public final void zzHj(int i) {
        zzQ(2280, Integer.valueOf(i));
    }

    public final int zzQX(boolean z) {
        return ((getPageWidth() - zzZRi()) - zzZRh()) - (z ? zzYLq() : 0);
    }

    public final int zzQY(boolean z) {
        zzYcp();
        return zzQX(z) - (Math.max(getColumnsCount() - 1, 0) * zzYco());
    }

    public final void zzQZ(boolean z) {
        zzQ(2360, Boolean.valueOf(z));
    }

    public final void zzR0(boolean z) {
        zzQ(EditingLanguage.FRENCH_BELGIUM, Boolean.valueOf(z));
    }

    public final void zzRE(boolean z) {
        zzQ(2390, Boolean.valueOf(z));
    }

    public final int zzYLa() {
        return ((Integer) zzPj(2440)).intValue();
    }

    public final int zzYLc() {
        return ((Integer) zzPj(2420)).intValue();
    }

    public final int zzYLd() {
        return ((Integer) zzPj(2430)).intValue();
    }

    public final int zzYLm() {
        return ((Integer) zzPj(2400)).intValue();
    }

    public final int zzYLq() {
        return ((Integer) zzPj(2312)).intValue();
    }

    public final int zzYLx() {
        return ((Integer) zzPj(2330)).intValue();
    }

    public final int zzYLy() {
        return ((Integer) zzPj(2320)).intValue();
    }

    public final int zzYPY() {
        return ((Integer) zzPj(2170)).intValue();
    }

    public final void zzYcd() {
        long jZzwF = zzZ3W.zzwF(zzYcc());
        zzQ(2260, Integer.valueOf((int) jZzwF));
        zzQ(2270, Integer.valueOf((int) (jZzwF >>> 32)));
    }

    public final int zzYcf() {
        return ((Integer) zzPj(2630)).intValue();
    }

    public final int zzYcg() {
        return ((Integer) zzPj(2540)).intValue();
    }

    public final int zzYch() {
        return ((Integer) zzPj(2520)).intValue();
    }

    public final int zzYci() {
        return ((Integer) zzPj(2530)).intValue();
    }

    public final int zzYcj() {
        return ((Integer) zzPj(2510)).intValue();
    }

    public final void zzYck() {
        zzQ(2500, 0);
    }

    public final int zzYcl() {
        return ((Integer) zzPj(2500)).intValue();
    }

    public final void zzYcm() {
        zzQ(2450, Boolean.TRUE);
    }

    public final zzY5Y zzYcn() {
        return (zzY5Y) zzPj(2380);
    }

    public final int zzYco() {
        return ((Integer) zzPj(2370)).intValue();
    }

    public final boolean zzYcp() {
        return ((Boolean) zzPj(2360)).booleanValue();
    }

    public final void zzYcq() {
        zzQ(2240, 1);
    }

    public final void zzYcr() {
        zzQ(2210, 2);
    }

    public final int zzYcs() {
        return ((Integer) zzVR(2190, 1)).intValue();
    }

    public final boolean zzYct() {
        return ((Boolean) zzPj(EditingLanguage.FRENCH_BELGIUM)).booleanValue();
    }

    public final void zzYcu() {
        zzQ(2050, Boolean.TRUE);
    }

    public final int zzYcv() {
        return ((Integer) zzVR(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, 1)).intValue();
    }

    public final int zzYcw() {
        return ((Integer) zzVR(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, 1)).intValue();
    }

    public final boolean zzYpR() {
        return ((Boolean) zzPj(2390)).booleanValue();
    }

    public final void zzZ(IWarningCallback iWarningCallback) {
        if (zzYcp()) {
            return;
        }
        while (getColumnsCount() > zzYcn().getCount() && zzYcn().getCount() > 0) {
            zzYcn().removeAt(zzYcn().getCount() - 1);
            zzY(iWarningCallback, "Extra column definitions found, removed.");
        }
        for (int i = 0; i < zzYcn().getCount(); i++) {
            if (zzYcn().get(i).zzXW3() == 0) {
                zzYcn().get(i).zzjM(9690);
                zzY(iWarningCallback, "Column width is missed, used default value 17.09 cm.");
            }
        }
        int count = zzYcn().getCount();
        if (count == 0) {
            zzQZ(true);
        }
        if (getColumnsCount() > count) {
            zzmy(count);
        }
    }

    public final int zzZRf() {
        return ((Integer) zzPj(2310)).intValue();
    }

    public final int zzZRg() {
        return ((Integer) zzPj(2300)).intValue();
    }

    public final int zzZRh() {
        return ((Integer) zzPj(2290)).intValue();
    }

    public final int zzZRi() {
        return ((Integer) zzPj(2280)).intValue();
    }

    public final void zzZqm() {
        int iZzYcc = zzYcc();
        zzZ3W.zzZ zzzZzmw = zzmw(iZzYcc);
        if (zzVE(2280)) {
            zzQ(2280, Integer.valueOf(zzzZzmw.getLeft()));
        }
        if (zzVE(2290)) {
            zzQ(2290, Integer.valueOf(zzzZzmw.getRight()));
        }
        if (zzVE(2300)) {
            zzQ(2300, Integer.valueOf(zzzZzmw.getTop()));
        }
        if (zzVE(2310)) {
            zzQ(2310, Integer.valueOf(zzzZzmw.getBottom()));
        }
        if (zzVE(2320)) {
            zzQ(2320, Integer.valueOf(zzZi(iZzYcc, true)));
        }
        if (zzVE(2330)) {
            zzQ(2330, Integer.valueOf(zzZi(iZzYcc, true)));
        }
        if (zzVE(2370)) {
            zzQ(2370, Integer.valueOf(zzZh(iZzYcc, true)));
        }
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzYce();
    }

    public final void zzmx(int i) {
        zzQ(2370, Integer.valueOf(i));
    }

    public final void zzmy(int i) {
        zzQ(2350, Integer.valueOf(i));
    }

    public final void zzvC(int i) {
        zzQ(2440, Integer.valueOf(i));
    }

    public final void zzvE(int i) {
        zzQ(2170, Integer.valueOf(i));
    }

    public final void zzvP(int i) {
        zzQ(2312, Integer.valueOf(i));
    }

    public final void zzvQ(int i) {
        zzQ(2330, Integer.valueOf(i));
    }

    public final void zzvR(int i) {
        zzQ(2320, Integer.valueOf(i));
    }

    public final void zzvS(int i) {
        zzQ(2310, Integer.valueOf(i));
    }

    public final void zzvT(int i) {
        zzQ(2300, Integer.valueOf(i));
    }

    public final void zzvV(int i) {
        zzQ(2270, Integer.valueOf(i));
    }

    public final void zzvW(int i) {
        zzQ(2260, Integer.valueOf(i));
    }

    public final void zzY(zzY5Y zzy5y) {
        zzQ(2380, zzy5y);
    }

    private static void zzZ(zzYCZ zzycz, int i) {
        for (int i2 = 0; i2 < zzXnS.getCount(); i2++) {
            zzycz.add(zzXnS.zzT3(i2), zzXnS.zzVY(i2));
        }
        zzZ3W.zzZ zzzZzmw = zzmw(i);
        zzycz.add(2280, Integer.valueOf(zzzZzmw.getLeft()));
        zzycz.add(2290, Integer.valueOf(zzzZzmw.getRight()));
        zzycz.add(2300, Integer.valueOf(zzzZzmw.getTop()));
        zzycz.add(2310, Integer.valueOf(zzzZzmw.getBottom()));
        zzycz.add(2320, Integer.valueOf(zzZi(i, false)));
        zzycz.add(2330, Integer.valueOf(zzZi(i, false)));
        zzycz.remove(2370);
        zzycz.add(2370, Integer.valueOf(zzZh(i, false)));
    }
}

package com.aspose.slides;

import OooOo.C20485OooOoO;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.oe */
/* JADX INFO: loaded from: classes3.dex */
class C14232oe {

    /* JADX INFO: renamed from: k4 */
    private static final SortedList<Integer, String> f47756k4;

    /* JADX INFO: renamed from: x1 */
    private static final SortedList<Integer, String> f47757x1;

    static {
        SortedList<Integer, String> sortedList = new SortedList<>();
        f47756k4 = sortedList;
        SortedList<Integer, String> sortedList2 = new SortedList<>();
        f47757x1 = sortedList2;
        sortedList.addItem(0, "");
        sortedList.addItem(1, "barn");
        sortedList.addItem(2, "blinds");
        sortedList.addItem(3, "box");
        sortedList.addItem(4, "checkerboard");
        sortedList.addItem(5, "circle");
        sortedList.addItem(6, "diamond");
        sortedList.addItem(7, "dissolve");
        sortedList.addItem(8, "fade");
        sortedList.addItem(9, "image");
        sortedList.addItem(10, "pixelate");
        sortedList.addItem(11, "plus");
        sortedList.addItem(12, "randombar");
        sortedList.addItem(13, "slide");
        sortedList.addItem(14, "stretch");
        sortedList.addItem(15, "strips");
        C20485OooOoO.OooO0Oo(16, sortedList, "wedge", 17, "wheel");
        sortedList.addItem(18, "wipe");
        sortedList2.addItem(0, "");
        sortedList2.addItem(1, "across");
        sortedList2.addItem(2, "down");
        sortedList2.addItem(3, "downLeft");
        sortedList2.addItem(4, "downRight");
        sortedList2.addItem(5, "fromBottom");
        sortedList2.addItem(6, "fromLeft");
        sortedList2.addItem(7, "fromRight");
        sortedList2.addItem(8, "fromTop");
        sortedList2.addItem(9, "horizontal");
        sortedList2.addItem(10, BackupFile.EXTENSION_NOTEIN_FILE);
        sortedList2.addItem(11, "inHorizontal");
        sortedList2.addItem(12, "inVertical");
        sortedList2.addItem(13, "left");
        sortedList2.addItem(14, "out");
        sortedList2.addItem(15, "outHorizontal");
        C20485OooOoO.OooO0Oo(16, sortedList2, "outVertical", 17, "right");
        C20485OooOoO.OooO0Oo(18, sortedList2, "1", 19, "2");
        C20485OooOoO.OooO0Oo(20, sortedList2, "3", 21, "4");
        C20485OooOoO.OooO0Oo(22, sortedList2, "8", 23, "up");
        C20485OooOoO.OooO0Oo(24, sortedList2, "upLeft", 25, "upRight");
        sortedList2.addItem(26, "vertical");
    }

    /* JADX INFO: renamed from: k4 */
    private static int m68472k4(String str) {
        if (str == null) {
            return 0;
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        int iM67429to = C14113y2.m67429to(strM67440x1, '(');
        if (iM67429to != -1) {
            strM67440x1 = C14113y2.m67443x1(strM67440x1, 0, iM67429to);
        }
        SortedList<Integer, String> sortedList = f47756k4;
        int iIndexOfValue = sortedList.indexOfValue(strM67440x1);
        if (iIndexOfValue == -1) {
            return 0;
        }
        return sortedList.getKeys().get_Item(iIndexOfValue).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m68475x1(String str) {
        String strM67440x1;
        int iM67429to;
        SortedList<Integer, String> sortedList;
        int iIndexOfValue;
        if (str == null || (iM67429to = C14113y2.m67429to((strM67440x1 = C14113y2.m67440x1(str)), '(')) == -1) {
            return 0;
        }
        String strM67443x1 = C14113y2.m67443x1(strM67440x1, iM67429to + 1, (C14113y2.m67429to(strM67440x1, ')') - iM67429to) - 1);
        if (CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(strM67443x1) || (iIndexOfValue = (sortedList = f47757x1).indexOfValue(strM67443x1)) == -1) {
            return 0;
        }
        return sortedList.getKeys().get_Item(iIndexOfValue).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68473k4(IFilterEffect iFilterEffect, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        C14578tv c14578tvMo424k4 = ((FilterEffect) iFilterEffect).mo424k4();
        com.aspose.slides.internal.p332p7.i4y i4yVar = (com.aspose.slides.internal.p332p7.i4y) k4Var.mo2788k4("animEffect").m29542x1();
        no7VarArr[0] = i4yVar.m33856to();
        i4yVar.m33853k4((byte) iFilterEffect.getReveal());
        i4yVar.m33858x1(c14578tvMo424k4.m71329to());
        i4yVar.m33854k4(iFilterEffect.getSubtype() == 0 ? f47756k4.get_Item(Integer.valueOf(iFilterEffect.getType())) : C14113y2.m67407k4(f47756k4.get_Item(Integer.valueOf(iFilterEffect.getType())), '(', f47757x1.get_Item(Integer.valueOf(iFilterEffect.getSubtype())), ')'));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68474k4(IFilterEffect iFilterEffect, com.aspose.slides.internal.p332p7.i4y i4yVar) {
        C14578tv c14578tvMo424k4 = ((FilterEffect) iFilterEffect).mo424k4();
        iFilterEffect.setReveal(i4yVar.m33852k4());
        c14578tvMo424k4.m71328kk(i4yVar.m33855kk());
        iFilterEffect.setType(m68472k4(i4yVar.m33857x1()));
        iFilterEffect.setSubtype(m68475x1(i4yVar.m33857x1()));
    }
}

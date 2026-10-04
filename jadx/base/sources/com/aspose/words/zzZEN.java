package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEN {
    public static zzZEM[] zzZ(Paragraph paragraph, boolean z, int i) {
        zzZGI zzzgiZzZ = zzZGI.zzZ(paragraph, paragraph.zzqw(256), paragraph.zzqw(StyleIdentifier.TABLE_GRID_LIGHT), i);
        double leftIndent = z ? zzzgiZzZ.getLeftIndent() + zzzgiZzZ.getFirstLineIndent() : zzzgiZzZ.getLeftIndent();
        TabStopCollection tabStopCollectionZzZ0O = zzzgiZzZ.zzZ0O();
        TabStopCollection tabStopCollection = new TabStopCollection();
        for (int i2 = 0; i2 < tabStopCollectionZzZ0O.getCount(); i2++) {
            TabStop tabStop = tabStopCollectionZzZ0O.get(i2);
            if (tabStop.isClear()) {
                tabStopCollection.add(tabStop);
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i3 = 0; i3 < tabStopCollectionZzZ0O.getCount(); i3++) {
            TabStop tabStop2 = tabStopCollectionZzZ0O.get(i3);
            if (!tabStop2.isClear() && tabStopCollection.get(tabStop2.getPosition()) == null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZEM>) arrayList, new zzZEM(tabStop2));
                if (tabStop2.getPosition() > leftIndent) {
                    z2 = true;
                }
            }
        }
        if (!zzzgiZzZ.isListItem() && zzzgiZzZ.getFirstLineIndent() < 0.0d) {
            zzZ(new zzZEM((-zzzgiZzZ.getFirstLineIndent()) + leftIndent), arrayList);
        }
        if (zzzgiZzZ.isListItem() && zzzgiZzZ.getFirstLineIndent() <= 0.0d && (!z2 || !paragraph.zzYBb().getCompatibilityOptions().getDoNotUseIndentAsNumberingTabStop())) {
            zzZ(new zzZEM((-zzzgiZzZ.getFirstLineIndent()) + leftIndent), arrayList);
        }
        boolean z3 = arrayList.size() != 0;
        double defaultTabStop = ((Document) paragraph.getDocument()).getDefaultTabStop();
        if (defaultTabStop >= 1.0d) {
            double position = arrayList.size() != 0 ? ((zzZEM) C21505OooO0Oo.OooO00o(1, arrayList)).getPosition() : 0.0d;
            double dZzZb = com.aspose.words.internal.zzZKQ.zzZb(position / defaultTabStop) * defaultTabStop;
            if (position >= 0.0d) {
                dZzZb += defaultTabStop;
            }
            double dZzYRX = paragraph.getParentSection() != null ? paragraph.getParentSection().getPageSetup().zzYRX() : 1584.0d;
            while (dZzZb < dZzYRX) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZEM>) arrayList, new zzZEM(dZzZb));
                dZzZb += defaultTabStop;
            }
            if (!z3) {
                double position2 = arrayList.size() != 0 ? ((zzZEM) arrayList.get(0)).getPosition() : defaultTabStop;
                while (true) {
                    position2 -= defaultTabStop;
                    if (position2 <= leftIndent) {
                        break;
                    }
                    arrayList.add(0, new zzZEM(position2));
                }
            }
        }
        return (zzZEM[]) arrayList.toArray(new zzZEM[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzZEM zzzem, ArrayList<zzZEM> arrayList) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            zzZEM zzzem2 = arrayList.get(i);
            if (com.aspose.words.internal.zzAN.zzL(zzzem2.getPosition(), zzzem.getPosition())) {
                z = true;
                break;
            } else if (zzzem2.getPosition() > zzzem.getPosition()) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        if (i == -1) {
            arrayList.add(zzzem);
        } else {
            arrayList.add(i, zzzem);
        }
    }
}

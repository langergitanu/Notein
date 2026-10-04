package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMI {
    private static int[] zzYwe = {12, 13, 14, 15, 30, 40, 10010};

    public static void zzV(Style style) {
        if (style.zzZYj().zzYsN() != null) {
            zzYMX zzymxZzqw = style.zzqw(1);
            zzYMX zzymxZzqw2 = style.zzqw(33);
            zzymxZzqw.remove(1000);
            zzymxZzqw2.remove(1000);
            zzymxZzqw2.zzX(zzymxZzqw);
            style.zzZYj().zzYsN().zzY(zzymxZzqw2);
        }
        if (style.zzZYh().zzYsN() != null) {
            zzYEF zzyefZzl1 = style.zzl1(1);
            zzYEF zzyefZzl12 = style.zzl1(17);
            zzyefZzl1.remove(50);
            zzyefZzl12.remove(50);
            zzyefZzl12.zzX(zzyefZzl1);
            style.zzZYh().zzYsN().zzY(zzyefZzl12);
        }
    }

    public static void zzZ(zzZAM zzzam) {
        if (zzzam.getRunPr_IInline().zzYsN() == null) {
            return;
        }
        zzYEF expandedRunPr_IInline = zzzam.getExpandedRunPr_IInline(zzzam.getParentParagraph_IInline().zzZYj().zzYph() ? 257 : 1);
        zzYEF expandedRunPr_IInline2 = zzzam.getExpandedRunPr_IInline(17);
        if (expandedRunPr_IInline2.zzVE(50)) {
            return;
        }
        expandedRunPr_IInline2.zzX(expandedRunPr_IInline);
        if (!zzzam.getParentParagraph_IInline().zzZYj().zzYph()) {
            zzzam.getRunPr_IInline().zzYsN().zzY(expandedRunPr_IInline2);
            return;
        }
        for (int i = 0; i < zzzam.getRunPr_IInline().getCount(); i++) {
            int iZzT3 = zzzam.getRunPr_IInline().zzT3(i);
            int[] iArr = zzYwe;
            if (com.aspose.words.internal.zzZ1.binarySearch(iArr, 0, iArr.length, iZzT3) != 0) {
                if (expandedRunPr_IInline2.get(iZzT3) != null) {
                    zzzam.getRunPr_IInline().zzYsN().zzZ6C().set(iZzT3, expandedRunPr_IInline2.get(iZzT3));
                } else {
                    zzzam.getRunPr_IInline().zzYsN().zzZ6C().remove(iZzT3);
                }
            }
        }
    }

    public static void zzi(Paragraph paragraph) {
        int i;
        int i2 = 1;
        if (paragraph.zzYp5().zzYsN() != null) {
            zzYEF zzyefZzqv = paragraph.zzqv(1);
            zzYEF zzyefZzqv2 = paragraph.zzqv(17);
            zzyefZzqv2.zzX(zzyefZzqv);
            paragraph.zzYp5().zzYsN().zzY(zzyefZzqv2);
        }
        if (paragraph.zzZYj().zzYsN() != null) {
            if (paragraph.isInCell()) {
                i = 32;
                i2 = 0;
            } else {
                i = 33;
            }
            zzZS zzzsZzqw = paragraph.zzqw(i2);
            WordAttrCollection wordAttrCollectionZzqw = paragraph.zzqw(i);
            zzYMX zzymx = (zzYMX) paragraph.zzZYj().zzYsN().zzZ6C();
            if (paragraph.zzZYj().contains(1000) && !zzymx.contains(1000)) {
                zzymx.zzQ(1000, 0);
            }
            if (paragraph.zzZYj().zzZ7j() == zzymx.zzZ7j()) {
                int iIntValue = ((Integer) zzzsZzqw.zzPj(EditingLanguage.KASHMIRI_ARABIC)).intValue();
                int iIntValue2 = ((Integer) wordAttrCollectionZzqw.zzPj(EditingLanguage.KASHMIRI_ARABIC)).intValue();
                zzZS zzymx2 = new zzYMX();
                wordAttrCollectionZzqw.zzY(zzymx2, EditingLanguage.KASHMIRI_ARABIC);
                wordAttrCollectionZzqw.zzY(zzymx2, EditingLanguage.GALICIAN);
                if (iIntValue != iIntValue2) {
                    wordAttrCollectionZzqw.zzY(zzymx2, 1160);
                    wordAttrCollectionZzqw.zzY(zzymx2, EditingLanguage.CENTRAL_KURDISH_IRAQ);
                }
                wordAttrCollectionZzqw.zzX(zzzsZzqw);
                zzymx2.zzZ(wordAttrCollectionZzqw);
                paragraph.zzZYj().zzYsN().zzY(wordAttrCollectionZzqw);
            }
        }
    }
}

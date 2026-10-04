package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVE {
    private static void zzY(zzZS zzzs, zzZ9W zzz9w) throws Exception {
        String str;
        boolean zZzZmh = zzz9w.zzZmh();
        boolean z = zZzZmh && zzz9w.getCompliance() == 2;
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        PreferredWidth preferredWidth = null;
        String strZzsZ = null;
        Integer num = null;
        String strZzsZ2 = null;
        Shading shading = null;
        Boolean boolValueOf = null;
        String strZzR = null;
        Border border = null;
        Boolean bool = null;
        Border border2 = null;
        Border border3 = null;
        Border border4 = null;
        Border border5 = null;
        Border border6 = null;
        Border border7 = null;
        Border border8 = null;
        PreferredWidth preferredWidthZzpK = null;
        PreferredWidth preferredWidthZzpK2 = null;
        PreferredWidth preferredWidthZzpK3 = null;
        PreferredWidth preferredWidthZzpK4 = null;
        String strZzsY = null;
        Boolean bool2 = null;
        for (int i = 0; i < zzzs.getCount(); i++) {
            int iZzT3 = zzzs.zzT3(i);
            Object objZzVY = zzzs.zzVY(i);
            switch (iZzT3) {
                case 3020:
                    preferredWidth = (PreferredWidth) objZzVY;
                    break;
                case 3030:
                    strZzsZ2 = zzYUB.zzsZ(((Integer) objZzVY).intValue());
                    break;
                case 3040:
                    strZzsZ = zzYUB.zzsZ(((Integer) objZzVY).intValue());
                    break;
                case 3050:
                    strZzR = zzY8T.zzR(((Integer) objZzVY).intValue(), zZzZmh, zzz9w.getCompliance());
                    break;
                case 3060:
                    strZzsY = zzYUB.zzsY(((Integer) objZzVY).intValue());
                    break;
                case 3070:
                    preferredWidthZzpK = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    break;
                case 3080:
                    preferredWidthZzpK3 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    break;
                case 3090:
                    preferredWidthZzpK2 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    break;
                case 3100:
                    preferredWidthZzpK4 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    break;
                case 3110:
                    border = (Border) objZzVY;
                    break;
                case 3120:
                    border2 = (Border) objZzVY;
                    break;
                case 3130:
                    border3 = (Border) objZzVY;
                    break;
                case 3140:
                    border4 = (Border) objZzVY;
                    break;
                case 3150:
                    border7 = (Border) objZzVY;
                    break;
                case 3160:
                    border8 = (Border) objZzVY;
                    break;
                case 3170:
                    shading = (Shading) objZzVY;
                    break;
                case 3180:
                    boolValueOf = Boolean.valueOf(!((Boolean) objZzVY).booleanValue());
                    break;
                case 3190:
                    bool = (Boolean) objZzVY;
                    break;
                case 3200:
                    border5 = (Border) objZzVY;
                    break;
                case 3210:
                    border6 = (Border) objZzVY;
                    break;
                case 3220:
                    if (((Boolean) objZzVY).booleanValue()) {
                        bool2 = Boolean.TRUE;
                    }
                    break;
                case 3900:
                    num = (Integer) objZzVY;
                    break;
            }
        }
        zzyu6ZzZm2.zzZ("w:tcW", preferredWidth, z);
        if (!"restart".equals(strZzsZ) && num != null && num.intValue() > 1) {
            zzyu6ZzZm2.zzQ("w:gridSpan", num);
        }
        String str2 = zZzZmh ? "w:hMerge" : "w:hmerge";
        if ("continue".equals(strZzsZ)) {
            str = null;
            zzyu6ZzZm2.zzZ(str2, (String) null);
        } else {
            str = null;
            zzyu6ZzZm2.zzYz(str2, strZzsZ);
        }
        String str3 = zZzZmh ? "w:vMerge" : "w:vmerge";
        if ("continue".equals(strZzsZ2)) {
            zzyu6ZzZm2.zzZ(str3, str);
        } else {
            zzyu6ZzZm2.zzYz(str3, strZzsZ2);
        }
        String str4 = strZzR;
        Boolean bool3 = bool;
        zzyu6ZzZm2.zzV("w:tcBorders", "w:top", border, z ? "w:start" : "w:left", border2, "w:bottom", border3, z ? "w:end" : "w:right", border4, "w:insideH", border5, "w:insideV", border6, "w:tl2br", border7, "w:tr2bl", border8);
        zzyu6ZzZm2.zzW(shading);
        zzyu6ZzZm2.zzQ("w:noWrap", boolValueOf);
        zzyu6ZzZm2.zzZ("w:tcMar", preferredWidthZzpK, preferredWidthZzpK2, preferredWidthZzpK3, preferredWidthZzpK4, z);
        zzyu6ZzZm2.zzYz(zZzZmh ? "w:textDirection" : "w:textFlow", str4);
        zzyu6ZzZm2.zzQ("w:tcFitText", bool3);
        zzyu6ZzZm2.zzYz("w:vAlign", strZzsY);
        zzyu6ZzZm2.zzQ("w:hideMark", bool2);
    }

    public static void zzZ(zzWP zzwp, zzZ9W zzz9w) throws Exception {
        if (zzwp == null || zzwp.getCount() == 0) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("w:tcPr");
        if (zzwp.zzYsN() != null) {
            WordAttrCollection wordAttrCollection = (WordAttrCollection) zzwp.zzbn();
            wordAttrCollection.zzYpN();
            zzY(wordAttrCollection, zzz9w);
            zzZV8 deleteRevision = zzwp.getDeleteRevision() != null ? zzwp.getDeleteRevision() : zzwp.getInsertRevision();
            if (deleteRevision != null) {
                zzyu6ZzZm2.zzX(deleteRevision, zzz9w.zzZpW());
            }
            zzyu6ZzZm2.zzZ(zzwp.zzYsN(), "w:tcPrChange", zzz9w.zzZpW());
            if (zzz9w.zzZmh()) {
                zzyu6ZzZm2.zzY("w:tcPr");
            }
            zzY(zzwp, zzz9w);
            if (deleteRevision != null) {
                zzyu6ZzZm2.zzX(deleteRevision, zzz9w.zzZpW());
            }
            if (zzz9w.zzZmh()) {
                zzyu6ZzZm2.zzp();
            }
            zzyu6ZzZm2.zzZmP();
        } else {
            zzZV8 deleteRevision2 = zzwp.getDeleteRevision() != null ? zzwp.getDeleteRevision() : zzwp.getInsertRevision();
            if (deleteRevision2 != null) {
                zzyu6ZzZm2.zzX(deleteRevision2, zzz9w.zzZpW());
            }
            zzY(zzwp, zzz9w);
        }
        zzyu6ZzZm2.zzp();
    }
}

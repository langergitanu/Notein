package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUJ {
    private static void zzY(Section section, zzZ9W zzz9w) throws Exception {
        zzZ(section, 0, zzz9w);
        zzZ(section, 1, zzz9w);
        zzZ(section, 2, zzz9w);
        zzZ(section, 3, zzz9w);
        zzZ(section, 4, zzz9w);
        zzZ(section, 5, zzz9w);
    }

    public static void zzZ(Section section, zzZ9W zzz9w) throws Exception {
        zzYCZ zzyczZzYvR = section.zzYvR();
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("w:sectPr");
        if (zzz9w.zzZmh()) {
            zzyu6ZzZm2.zz0("w:rsidSect", zzYU3.zzZl(zzyczZzYvR.get(2250)));
        }
        if (zzyczZzYvR.zzYsN() != null) {
            zzY(section, zzz9w);
            zzYCZ zzycz = (zzYCZ) zzyczZzYvR.zzbn();
            zzycz.zzYpN();
            zzZ((zzZS) zzycz, false, zzz9w);
            zzyu6ZzZm2.zzZ(zzyczZzYvR.zzYsN(), "w:sectPrChange", zzz9w.zzZpW());
            zzyu6ZzZm2.zzY("w:sectPr");
            if (zzz9w.zzZmh()) {
                zzyu6ZzZm2.zz0("w:rsidSect", zzYU3.zzZl(zzyczZzYvR.get(2250)));
            }
            zzYCZ zzyczZzZ = zzZ(zzyczZzYvR, zzycz);
            if (zzyczZzZ.getCount() > 0) {
                zzyczZzYvR = (zzYCZ) zzyczZzYvR.zzbn();
                zzyczZzZ.zzY(zzyczZzYvR);
            }
            zzZ((zzZS) zzyczZzYvR, true, zzz9w);
            zzyu6ZzZm2.zzp();
            zzyu6ZzZm2.zzZmP();
        } else {
            zzY(section, zzz9w);
            zzZ((zzZS) zzyczZzYvR, false, zzz9w);
        }
        zzyu6ZzZm2.zzo();
    }

    private static zzYCZ zzZ(zzYCZ zzycz, zzYCZ zzycz2) {
        zzYCZ zzycz3 = new zzYCZ();
        int[] iArr = {2030, 2210, 2260, 2270};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            Object objZzPj = zzycz.zzPj(i2);
            Object objZzPj2 = zzycz2.zzPj(i2);
            Object objZzPj3 = zzycz3.zzPj(i2);
            if (objZzPj != objZzPj2 && objZzPj2 != objZzPj3 && objZzPj == objZzPj3) {
                zzycz3.zzQ(i2, objZzPj3);
            }
        }
        return zzycz3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzZS zzzs, boolean z, zzZ9W zzz9w) throws Exception {
        Border border;
        Border border2;
        int i;
        String strZzhY;
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        boolean zZzZmh = zzz9w.zzZmh();
        Border border3 = null;
        int i2 = 0;
        String strZzWF = null;
        String strZzWF2 = null;
        String strZzWF3 = null;
        String strZzZv = null;
        String strZzWF4 = null;
        String strZzWF5 = null;
        String strZzWF6 = null;
        String strZzWF7 = null;
        String strZzWF8 = null;
        Border border4 = null;
        String strZzt1 = null;
        String strZzWF9 = null;
        String strZzWF10 = null;
        String strZzWF11 = null;
        String strZzWF12 = null;
        String strZzWF13 = null;
        String strZzWF14 = null;
        Border border5 = null;
        Border border6 = null;
        String str = null;
        String strZzZw = null;
        String strZzt2 = null;
        String strZzWF15 = null;
        String strZzWF16 = null;
        String strZzWF17 = null;
        String strZzZx = null;
        String str2 = null;
        String strZzWF18 = null;
        String strZzZy = null;
        String strZzWF19 = null;
        Object obj = null;
        Object obj2 = null;
        zzY5Y zzy5y = null;
        String strZzt3 = null;
        Object obj3 = null;
        Boolean boolValueOf = null;
        Object obj4 = null;
        String strZzR = null;
        Object obj5 = null;
        Object obj6 = null;
        String strZzZC = null;
        String strZzWF20 = null;
        String strZzWF21 = null;
        Integer num = null;
        while (i2 < zzzs.getCount()) {
            int iZzT3 = zzzs.zzT3(i2);
            Object objZzVY = zzzs.zzVY(i2);
            switch (iZzT3) {
                case CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH /* 2010 */:
                    i = i2;
                    if (zZzZmh) {
                        strZzhY = zzZXP.zzFa(((Integer) objZzVY).intValue());
                    } else {
                        strZzhY = zzY1K.zzhY(((Integer) objZzVY).intValue());
                    }
                    str2 = strZzhY;
                    continue;
                    i2 = i + 1;
                    break;
                case CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED /* 2020 */:
                    i = i2;
                    strZzZy = zzYUL.zzZy(((Integer) objZzVY).intValue(), zZzZmh);
                    continue;
                    i2 = i + 1;
                    break;
                case 2030:
                    i = i2;
                    strZzZv = zzYUL.zzZv(((Integer) objZzVY).intValue(), zZzZmh);
                    continue;
                    i2 = i + 1;
                    break;
                case 2040:
                    i = i2;
                    obj3 = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2050:
                    i = i2;
                    if (strZzWF4 != null) {
                        continue;
                    } else if (((Boolean) objZzVY).booleanValue()) {
                        strZzWF4 = com.aspose.words.internal.zzJB.zzWF(1);
                    }
                    i2 = i + 1;
                    break;
                case EditingLanguage.FRENCH_BELGIUM /* 2060 */:
                    i = i2;
                    obj = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case EditingLanguage.PORTUGUESE_PORTUGAL /* 2070 */:
                    i = i2;
                    strZzWF5 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2080:
                    i = i2;
                    strZzWF7 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2090:
                    i = i2;
                    strZzWF9 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2100:
                    i = i2;
                    obj4 = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case EditingLanguage.MALAY_BRUNEI_DARUSSALAM /* 2110 */:
                    i = i2;
                    strZzZx = zzYUL.zzZx(((Integer) objZzVY).intValue(), zZzZmh);
                    continue;
                    i2 = i + 1;
                    break;
                case 2120:
                    i = i2;
                    strZzWF15 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2130:
                    i = i2;
                    border4 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2140:
                    i = i2;
                    border3 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2150:
                    i = i2;
                    border5 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2160:
                    i = i2;
                    border6 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2170:
                    i = i2;
                    strZzWF20 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2180:
                    i = i2;
                    strZzWF16 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue() - 1);
                    continue;
                    i2 = i + 1;
                    break;
                case 2190:
                    i = i2;
                    strZzWF18 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2200:
                    i = i2;
                    if (((Boolean) zzzs.zzPj(2050)).booleanValue()) {
                        strZzWF4 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    } else {
                        continue;
                    }
                    i2 = i + 1;
                    break;
                case 2210:
                    i = i2;
                    strZzt1 = zzYUL.zzt1(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2220:
                    i = i2;
                    strZzZw = zzYUL.zzZw(((Integer) objZzVY).intValue(), zZzZmh);
                    continue;
                    i2 = i + 1;
                    break;
                case 2230:
                    i = i2;
                    if (((Boolean) objZzVY).booleanValue()) {
                        str = "front";
                        continue;
                    } else {
                        str = "back";
                    }
                    i2 = i + 1;
                    break;
                case 2240:
                    i = i2;
                    strZzt2 = zzYUL.zzt2(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2260:
                    i = i2;
                    strZzWF6 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2270:
                    i = i2;
                    strZzWF8 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2280:
                    i = i2;
                    strZzWF13 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2290:
                    i = i2;
                    strZzWF11 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2300:
                    i = i2;
                    strZzWF10 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2310:
                    i = i2;
                    strZzWF12 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2312:
                    i = i2;
                    strZzWF14 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2320:
                    i = i2;
                    strZzWF = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2330:
                    i = i2;
                    strZzWF2 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2340:
                    i = i2;
                    strZzt3 = zzYUL.zzt3(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2350:
                    i = i2;
                    strZzWF19 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2360:
                    i = i2;
                    obj2 = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2370:
                    i = i2;
                    strZzWF3 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2380:
                    i = i2;
                    zzy5y = (zzY5Y) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2390:
                    i = i2;
                    boolValueOf = Boolean.valueOf(!((Boolean) objZzVY).booleanValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2400:
                    i = i2;
                    strZzWF17 = com.aspose.words.internal.zzJB.zzWF(com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    continue;
                    i2 = i + 1;
                    break;
                case 2410:
                    i = i2;
                    obj6 = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2420:
                    i = i2;
                    strZzWF21 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    continue;
                    i2 = i + 1;
                    break;
                case 2430:
                    i = i2;
                    strZzZC = zzYUL.zzZC(((Integer) objZzVY).intValue(), zZzZmh);
                    continue;
                    i2 = i + 1;
                    break;
                case 2440:
                    i = i2;
                    strZzR = zzY8T.zzR(zzY5T.zzjK(((Integer) objZzVY).intValue()), zZzZmh, zzz9w.getCompliance());
                    continue;
                    i2 = i + 1;
                    break;
                case 2450:
                    i = i2;
                    obj5 = objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 2540:
                    num = (Integer) objZzVY;
                    break;
            }
            i = i2;
            i2 = i + 1;
        }
        if (!z) {
            if (strZzWF == null) {
                strZzWF = com.aspose.words.internal.zzJB.zzWF(((Integer) zzYCZ.zzOt(2320)).intValue());
            }
            if (strZzWF2 == null) {
                strZzWF2 = com.aspose.words.internal.zzJB.zzWF(((Integer) zzYCZ.zzOt(2330)).intValue());
            }
            if (strZzWF3 == null) {
                strZzWF3 = com.aspose.words.internal.zzJB.zzWF(((Integer) zzYCZ.zzOt(2370)).intValue());
            }
        }
        String str3 = strZzWF3;
        zzz9w.zzY(zzzs, false);
        zzyu6ZzZm2.zzYz("w:type", strZzZv);
        Border border7 = border4;
        zzyu6ZzZm2.zzX("w:pgSz", "w:w", strZzWF6, "w:h", strZzWF8, "w:orient", strZzt1, "w:code", strZzWF9);
        zzyu6ZzZm2.zzX("w:pgMar", "w:top", strZzWF10, "w:right", strZzWF11, "w:bottom", strZzWF12, "w:left", strZzWF13, "w:header", strZzWF, "w:footer", strZzWF2, "w:gutter", strZzWF14);
        zzyu6ZzZm2.zzX("w:paperSrc", "w:first", strZzWF5, "w:other", strZzWF7);
        if (border7 == null && border3 == null) {
            border = border5;
            border2 = border6;
            if (border != null || border2 != null) {
            }
            zzyu6ZzZm2.zzX("w:lnNumType", !zZzZmh ? "w:countBy" : "w:count-by", strZzWF15, "w:start", strZzWF16, "w:distance", strZzWF17, "w:restart", strZzZx);
            zzyu6ZzZm2.zzX("w:pgNumType", "w:fmt", str2, "w:start", strZzWF4, !zZzZmh ? "w:chapStyle" : "w:chap-style", strZzWF18, !zZzZmh ? "w:chapSep" : "w:chap-sep", strZzZy);
            if (zzyu6ZzZm2.zzW("w:cols", "w:num", strZzWF19, "w:sep", obj, "w:space", str3, "w:equalWidth", obj2)) {
                zzY5Y zzy5y2 = zzy5y;
                if (zzy5y2 != null && zzy5y2.zzXW1()) {
                    for (int i3 = 0; i3 < zzy5y2.getCount(); i3++) {
                        zzyu6ZzZm2.zzX("w:col", "w:w", zzy5y2.get(i3).zzXW3() > 0 ? Integer.valueOf(zzy5y2.get(i3).zzXW3()) : null, "w:space", Integer.valueOf(zzy5y2.get(i3).zzXW2()));
                    }
                }
                zzyu6ZzZm2.zzp();
            }
            zzyu6ZzZm2.zzQ("w:formProt", boolValueOf);
            zzyu6ZzZm2.zzYz("w:vAlign", strZzt3);
            zzyu6ZzZm2.zzQ("w:noEndnote", obj4);
            zzyu6ZzZm2.zzQ("w:titlePg", obj3);
            zzyu6ZzZm2.zzQ(!zZzZmh ? "w:textDirection" : "w:textFlow", strZzR);
            zzyu6ZzZm2.zzQ("w:bidi", obj5);
            zzyu6ZzZm2.zzQ("w:rtlGutter", obj6);
            zzyu6ZzZm2.zzX("w:docGrid", "w:type", strZzZC, !zZzZmh ? "w:linePitch" : "w:line-pitch", strZzWF20, !zZzZmh ? "w:charSpace" : "w:char-space", strZzWF21);
            if (zZzZmh || zzz9w.getCompliance() == 0) {
            }
            zzyu6ZzZm2.zzX("w15:footnoteColumns", "w:val", num);
            return;
        }
        border = border5;
        border2 = border6;
        zzyu6ZzZm2.zzY("w:pgBorders");
        zzyu6ZzZm2.zz0(zZzZmh ? "w:zOrder" : "w:z-order", str);
        zzyu6ZzZm2.zz0("w:display", strZzZw);
        zzyu6ZzZm2.zz0(zZzZmh ? "w:offsetFrom" : "w:offset-from", strZzt2);
        zzyu6ZzZm2.zzX("w:top", border7);
        zzyu6ZzZm2.zzX("w:left", border3);
        zzyu6ZzZm2.zzX("w:bottom", border);
        zzyu6ZzZm2.zzX("w:right", border2);
        zzyu6ZzZm2.zzp();
        zzyu6ZzZm2.zzX("w:lnNumType", !zZzZmh ? "w:countBy" : "w:count-by", strZzWF15, "w:start", strZzWF16, "w:distance", strZzWF17, "w:restart", strZzZx);
        zzyu6ZzZm2.zzX("w:pgNumType", "w:fmt", str2, "w:start", strZzWF4, !zZzZmh ? "w:chapStyle" : "w:chap-style", strZzWF18, !zZzZmh ? "w:chapSep" : "w:chap-sep", strZzZy);
        if (zzyu6ZzZm2.zzW("w:cols", "w:num", strZzWF19, "w:sep", obj, "w:space", str3, "w:equalWidth", obj2)) {
        }
        zzyu6ZzZm2.zzQ("w:formProt", boolValueOf);
        zzyu6ZzZm2.zzYz("w:vAlign", strZzt3);
        zzyu6ZzZm2.zzQ("w:noEndnote", obj4);
        zzyu6ZzZm2.zzQ("w:titlePg", obj3);
        zzyu6ZzZm2.zzQ(!zZzZmh ? "w:textDirection" : "w:textFlow", strZzR);
        zzyu6ZzZm2.zzQ("w:bidi", obj5);
        zzyu6ZzZm2.zzQ("w:rtlGutter", obj6);
        zzyu6ZzZm2.zzX("w:docGrid", "w:type", strZzZC, !zZzZmh ? "w:linePitch" : "w:line-pitch", strZzWF20, !zZzZmh ? "w:charSpace" : "w:char-space", strZzWF21);
        if (zZzZmh) {
        }
    }

    private static void zzZ(Section section, int i, zzZ9W zzz9w) throws Exception {
        HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType == null || byHeaderFooterType.isLinkedToPrevious()) {
            return;
        }
        zzz9w.zzZ(byHeaderFooterType);
    }
}

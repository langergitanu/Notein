package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUU {
    public static boolean zzY(zzYMX zzymx, zzZ9W zzz9w) throws Exception {
        if (zzymx == null || zzymx.getCount() == 0) {
            return false;
        }
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        if (zzymx.zzYsN() == null) {
            return zzZ(zzymx, true, zzz9w, false);
        }
        zzyu6ZzZm2.zzY("w:pPr");
        WordAttrCollection wordAttrCollection = (WordAttrCollection) zzymx.zzbn();
        wordAttrCollection.zzYpN();
        zzZ(wordAttrCollection, false, zzz9w, false);
        zzyu6ZzZm2.zzZ(zzymx.zzYsN(), "w:pPrChange", zzz9w.zzZpW());
        zzyu6ZzZm2.zzY("w:pPr");
        zzZ(zzymx, false, zzz9w, true);
        zzyu6ZzZm2.zzo();
        zzyu6ZzZm2.zzZmP();
        return true;
    }

    public static void zzZ(zzYMX zzymx, zzZ9W zzz9w) throws Exception {
        if (zzY(zzymx, zzz9w)) {
            zzz9w.zzZm2().zzp();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0120, code lost:
    
        if (r61.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0155, code lost:
    
        if (r60.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
    
        if (r58.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016d, code lost:
    
        if (r56.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0179, code lost:
    
        if (r54.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0185, code lost:
    
        if (r52.isInherited() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0191, code lost:
    
        if (r50.isInherited() != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af A[PHI: r9 r10 r48 r50 r52 r54 r56 r58 r60 r61
      0x00af: PHI (r9v13 int) = (r9v1 int), (r9v3 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r10v12 java.lang.String) = 
      (r10v1 java.lang.String)
      (r10v7 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
      (r10v1 java.lang.String)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r48v8 com.aspose.words.zzYTV) = 
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v4 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
      (r48v1 com.aspose.words.zzYTV)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r50v7 com.aspose.words.Border) = 
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v3 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
      (r50v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r52v7 com.aspose.words.Border) = 
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v3 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
      (r52v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r54v7 com.aspose.words.Border) = 
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v3 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
      (r54v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r56v7 com.aspose.words.Border) = 
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v3 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
      (r56v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r58v7 com.aspose.words.Border) = 
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v3 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
      (r58v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r60v7 com.aspose.words.Border) = 
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
      (r60v3 com.aspose.words.Border)
      (r60v1 com.aspose.words.Border)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r61v7 com.aspose.words.Shading) = 
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v1 com.aspose.words.Shading)
      (r61v3 com.aspose.words.Shading)
     binds: [B:12:0x00ac, B:116:0x0314, B:98:0x02ad, B:51:0x0191, B:48:0x0185, B:45:0x0179, B:42:0x016d, B:39:0x0161, B:36:0x0155, B:29:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(WordAttrCollection wordAttrCollection, boolean z, zzZ9W zzz9w, boolean z2) throws Exception {
        boolean z3;
        WordAttrCollection wordAttrCollection2 = wordAttrCollection;
        boolean zZzZmh = zzz9w.zzZmh();
        boolean z4 = zZzZmh && zzz9w.getCompliance() == 2;
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        Object obj = null;
        Object obj2 = null;
        int i = 0;
        int i2 = 0;
        String strZzFs = null;
        Object obj3 = null;
        String strZztg = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String strZzte = null;
        Object obj7 = null;
        Object obj8 = null;
        Integer numValueOf = null;
        String strZzZL = null;
        Object obj9 = null;
        Object obj10 = null;
        String strZzZM = null;
        String strZzta = null;
        String strZztb = null;
        Object obj11 = null;
        String strZztc = null;
        Object obj12 = null;
        String strZztd = null;
        Object obj13 = null;
        Object obj14 = null;
        zzYTV zzytv = null;
        Border border = null;
        Border border2 = null;
        Border border3 = null;
        Border border4 = null;
        Border border5 = null;
        Border border6 = null;
        Shading shading = null;
        TabStopCollection tabStopCollection = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj28 = null;
        Object obj29 = null;
        Object obj30 = null;
        Integer numValueOf2 = null;
        String strZzZK = null;
        Object obj31 = null;
        Object obj32 = null;
        Object obj33 = null;
        Integer numValueOf3 = null;
        Object obj34 = null;
        Object obj35 = null;
        Object obj36 = null;
        Integer numValueOf4 = null;
        Object obj37 = null;
        Object obj38 = null;
        Object obj39 = null;
        String strZzX = null;
        String strZzR = null;
        String strZztf = null;
        Integer num = null;
        Object obj40 = null;
        Boolean bool = null;
        while (i < wordAttrCollection2.getCount()) {
            int iZzT3 = wordAttrCollection2.zzT3(i);
            Object objZzVY = wordAttrCollection2.zzVY(i);
            int i3 = i2 + 1;
            switch (iZzT3) {
                case 1000:
                    int iIntValue = ((Integer) objZzVY).intValue();
                    if (iIntValue == 0 || !zzY0C.zzhF(iIntValue)) {
                        strZzFs = null;
                    } else {
                        strZzFs = zzz9w.zzFs(iIntValue);
                        i2 = i3;
                    }
                    if (strZzFs == null) {
                        z3 = zZzZmh;
                    } else {
                        z3 = zZzZmh;
                        if (zzz9w.getDocument().getStyles().zzZ8(iIntValue, false).getType() == 4 || zzyu6ZzZm2.zzZmO()) {
                            i2--;
                            strZzFs = null;
                        }
                    }
                    break;
                case PointerIconCompat.TYPE_GRAB /* 1020 */:
                    strZzX = zzYUW.zzX(((Integer) objZzVY).intValue(), zZzZmh, zzz9w.getCompliance());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1022:
                    z3 = zZzZmh;
                    obj38 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                    z3 = zZzZmh;
                    obj5 = objZzVY;
                    i2 = i3;
                    break;
                case 1050:
                    z3 = zZzZmh;
                    obj4 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.SLOVENIAN /* 1060 */:
                    z3 = zZzZmh;
                    obj6 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.SORBIAN /* 1070 */:
                    z3 = zZzZmh;
                    obj16 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.FAEROESE /* 1080 */:
                    z3 = zZzZmh;
                    obj17 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.TURKMEN /* 1090 */:
                    z3 = zZzZmh;
                    obj18 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.MALAYALAM /* 1100 */:
                    z3 = zZzZmh;
                    obj19 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.GALICIAN /* 1110 */:
                    z3 = zZzZmh;
                    obj2 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                    z3 = zZzZmh;
                    obj14 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.DIVEHI /* 1125 */:
                    if (!z2) {
                        zzytv = (zzYTV) objZzVY;
                        if (!zzytv.isActive()) {
                            zzytv = null;
                            z3 = zZzZmh;
                        }
                    }
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case EditingLanguage.YORUBA /* 1130 */:
                    z3 = zZzZmh;
                    obj31 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.GUARANI /* 1140 */:
                    tabStopCollection = (TabStopCollection) objZzVY;
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case EditingLanguage.PAPIAMENTU /* 1145 */:
                    z3 = zZzZmh;
                    obj40 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.BRETON /* 1150 */:
                    z3 = zZzZmh;
                    obj33 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.CORSICAN /* 1155 */:
                    z3 = zZzZmh;
                    obj36 = objZzVY;
                    i2 = i3;
                    break;
                case 1160:
                    z3 = zZzZmh;
                    obj32 = objZzVY;
                    i2 = i3;
                    break;
                case 1165:
                    z3 = zZzZmh;
                    obj35 = objZzVY;
                    i2 = i3;
                    break;
                case EditingLanguage.CENTRAL_KURDISH_IRAQ /* 1170 */:
                    Integer num2 = (Integer) objZzVY;
                    if (num2.intValue() >= 0) {
                        z3 = zZzZmh;
                        obj34 = objZzVY;
                        i2 = i3;
                    } else {
                        numValueOf3 = Integer.valueOf(-num2.intValue());
                        z3 = zZzZmh;
                        i2 = i3;
                    }
                    break;
                case 1175:
                    Integer num3 = (Integer) objZzVY;
                    if (num3.intValue() >= 0) {
                        z3 = zZzZmh;
                        obj37 = objZzVY;
                        i2 = i3;
                    } else {
                        numValueOf4 = Integer.valueOf(-num3.intValue());
                        z3 = zZzZmh;
                        i2 = i3;
                    }
                    break;
                case 1200:
                    z3 = zZzZmh;
                    obj25 = objZzVY;
                    i2 = i3;
                    break;
                case 1205:
                    z3 = zZzZmh;
                    obj26 = objZzVY;
                    i2 = i3;
                    break;
                case 1210:
                    z3 = zZzZmh;
                    obj27 = objZzVY;
                    i2 = i3;
                    break;
                case 1220:
                    z3 = zZzZmh;
                    obj28 = objZzVY;
                    i2 = i3;
                    break;
                case 1225:
                    z3 = zZzZmh;
                    obj29 = objZzVY;
                    i2 = i3;
                    break;
                case 1230:
                    z3 = zZzZmh;
                    obj30 = objZzVY;
                    i2 = i3;
                    break;
                case 1240:
                    z3 = zZzZmh;
                    obj20 = objZzVY;
                    i2 = i3;
                    break;
                case 1250:
                    z3 = zZzZmh;
                    obj21 = objZzVY;
                    i2 = i3;
                    break;
                case 1260:
                    z3 = zZzZmh;
                    obj24 = objZzVY;
                    i2 = i3;
                    break;
                case 1270:
                    z3 = zZzZmh;
                    obj23 = objZzVY;
                    i2 = i3;
                    break;
                case 1280:
                    num = (Integer) objZzVY;
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1290:
                    strZztc = zzYUW.zztc(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1292:
                    obj11 = (objZzVY == null || ((Integer) objZzVY).intValue() != 0) ? objZzVY : null;
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1300:
                    strZztd = zzYUW.zztd(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1302:
                    obj12 = (objZzVY == null || ((Integer) objZzVY).intValue() != 0) ? objZzVY : null;
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1310:
                    z3 = zZzZmh;
                    obj8 = objZzVY;
                    i2 = i3;
                    break;
                case 1320:
                    strZztb = zzYUW.zztb(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1330:
                    strZzta = zzYUW.zzta(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1340:
                    strZzZM = zzYUW.zzZM(((Integer) objZzVY).intValue(), zZzZmh);
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1350:
                    border = (Border) objZzVY;
                    break;
                case 1360:
                    border2 = (Border) objZzVY;
                    break;
                case 1370:
                    border3 = (Border) objZzVY;
                    break;
                case 1380:
                    border4 = (Border) objZzVY;
                    break;
                case 1390:
                    border5 = (Border) objZzVY;
                    break;
                case 1400:
                    border6 = (Border) objZzVY;
                    break;
                case 1410:
                    z3 = zZzZmh;
                    obj15 = objZzVY;
                    i2 = i3;
                    break;
                case 1430:
                    zzZKP zzzkp = (zzZKP) objZzVY;
                    strZzZL = zzYUW.zzZL(zzzkp.zzZ4A(), zZzZmh);
                    numValueOf = Integer.valueOf(zzzkp.getValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1440:
                    strZzte = zzYUW.zzte(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1450:
                    z3 = zZzZmh;
                    obj7 = objZzVY;
                    i2 = i3;
                    break;
                case 1460:
                    shading = (Shading) objZzVY;
                    break;
                case 1470:
                    z3 = zZzZmh;
                    obj = objZzVY;
                    i2 = i3;
                    break;
                case 1480:
                    strZzR = zzY8T.zzR(((Integer) objZzVY).intValue(), zZzZmh, zzz9w.getCompliance());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1490:
                    z3 = zZzZmh;
                    obj10 = objZzVY;
                    i2 = i3;
                    break;
                case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                    z3 = zZzZmh;
                    obj9 = objZzVY;
                    i2 = i3;
                    break;
                case 1510:
                    strZztf = zzYUW.zztf(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1520:
                    z3 = zZzZmh;
                    obj13 = objZzVY;
                    i2 = i3;
                    break;
                case 1560:
                    z3 = zZzZmh;
                    obj22 = objZzVY;
                    i2 = i3;
                    break;
                case 1585:
                    z3 = zZzZmh;
                    obj3 = objZzVY;
                    i2 = i3;
                    break;
                case 1590:
                    strZztg = zzYUW.zztg(((Integer) objZzVY).intValue());
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1650:
                    zzZ52 zzz52 = (zzZ52) objZzVY;
                    numValueOf2 = Integer.valueOf(zzz52.getValue());
                    strZzZK = zzYUW.zzZK(zzz52.zzZ4A(), zZzZmh);
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
                case 1660:
                    z3 = zZzZmh;
                    obj39 = objZzVY;
                    i2 = i3;
                    break;
                case 1670:
                    bool = (Boolean) objZzVY;
                    z3 = zZzZmh;
                    i2 = i3;
                    break;
            }
            i++;
            wordAttrCollection2 = wordAttrCollection;
            zZzZmh = z3;
        }
        boolean z5 = zZzZmh;
        if (i2 == 0) {
            return false;
        }
        boolean z6 = false;
        if (z) {
            zzyu6ZzZm2.zzY("w:pPr");
        }
        zzyu6ZzZm2.zzYz("w:pStyle", strZzFs);
        zzyu6ZzZm2.zzQ("w:textboxTightWrap", strZztg);
        zzyu6ZzZm2.zzQ("w:divId", obj3);
        zzyu6ZzZm2.zzQ("w:keepNext", obj4);
        zzyu6ZzZm2.zzQ("w:keepLines", obj5);
        zzyu6ZzZm2.zzQ("w:pageBreakBefore", obj6);
        zzyu6ZzZm2.zzX("w:framePr", z5 ? "w:dropCap" : "w:drop-cap", strZzte, "w:lines", obj7, "w:w", obj8, "w:h", numValueOf, z5 ? "w:hRule" : "w:h-rule", strZzZL, z5 ? "w:hSpace" : "w:hspace", obj9, z5 ? "w:vSpace" : "w:vspace", obj10, "w:wrap", strZzZM, z5 ? "w:vAnchor" : "w:vanchor", strZzta, z5 ? "w:hAnchor" : "w:hanchor", strZztb, "w:x", obj11, z5 ? "w:xAlign" : "w:x-align", strZztc, "w:y", obj12, z5 ? "w:yAlign" : "w:y-align", strZztd, z5 ? "w:anchorLock" : "w:anchor-lock", obj13);
        zzyu6ZzZm2.zzQ("w:widowControl", obj);
        boolean z7 = obj2 != null;
        Object obj41 = obj14;
        boolean z8 = obj41 != null;
        String strZzZm1 = z5 ? null : zzz9w.zzZm1();
        String strZzZm0 = z5 ? null : zzz9w.zzZm0();
        zzYTV zzytv2 = zzytv;
        if (zzytv2 != null && zzytv2.isActive()) {
            z6 = true;
        }
        if (z7 || z8 || z6 || strZzZm1 != null || strZzZm0 != null) {
            zzyu6ZzZm2.zzY(z5 ? "w:numPr" : "w:listPr");
            if (z7) {
                zzyu6ZzZm2.zzQ("w:ilvl", obj2);
            }
            if (z8) {
                zzyu6ZzZm2.zzQ(z5 ? "w:numId" : "w:ilfo", obj41);
            }
            if (strZzZm1 != null) {
                zzyu6ZzZm2.zzYz("wx:t", strZzZm1);
            }
            if (strZzZm0 != null) {
                zzyu6ZzZm2.zzYz("wx:font", strZzZm0);
            }
            if (z6) {
                zzyu6ZzZm2.zzZ(zzytv2, zzz9w.zzZpW());
            }
            zzyu6ZzZm2.zzp();
        }
        zzyu6ZzZm2.zzQ(z5 ? "w:suppressLineNumbers" : "w:supressLineNumbers", obj31);
        zzyu6ZzZm2.zzV("w:pBdr", "w:top", border, "w:left", border2, "w:bottom", border3, "w:right", border4, "w:between", border5, "w:bar", border6);
        zzyu6ZzZm2.zzW(shading);
        zzZ(tabStopCollection, zzz9w);
        zzyu6ZzZm2.zzQ("w:suppressAutoHyphens", obj15);
        zzyu6ZzZm2.zzQ("w:kinsoku", obj16);
        zzyu6ZzZm2.zzQ("w:wordWrap", obj17);
        zzyu6ZzZm2.zzQ("w:overflowPunct", obj18);
        zzyu6ZzZm2.zzQ("w:topLinePunct", obj19);
        zzyu6ZzZm2.zzQ("w:autoSpaceDE", obj20);
        zzyu6ZzZm2.zzQ("w:autoSpaceDN", obj21);
        zzyu6ZzZm2.zzQ("w:bidi", obj22);
        zzyu6ZzZm2.zzQ("w:adjustRightInd", obj23);
        zzyu6ZzZm2.zzQ("w:snapToGrid", obj24);
        zzyu6ZzZm2.zzX("w:spacing", "w:before", obj25, z5 ? "w:beforeLines" : "w:before-lines", obj26, z5 ? "w:beforeAutospacing" : "w:before-autospacing", obj27, "w:after", obj28, z5 ? "w:afterLines" : "w:after-lines", obj29, z5 ? "w:afterAutospacing" : "w:after-autospacing", obj30, "w:line", numValueOf2, z5 ? "w:lineRule" : "w:line-rule", strZzZK);
        zzyu6ZzZm2.zzX("w:ind", z4 ? "w:start" : "w:left", obj32, z4 ? "w:end" : "w:right", obj33, "w:hanging", numValueOf3, z5 ? "w:firstLine" : "w:first-line", obj34, z5 ? "w:leftChars" : "w:left-chars", obj35, z5 ? "w:rightChars" : "w:right-chars", obj36, z5 ? "w:hangingChars" : "w:hanging-chars", numValueOf4, z5 ? "w:firstLineChars" : "w:first-line-chars", obj37);
        zzyu6ZzZm2.zzQ("w:contextualSpacing", obj38);
        zzyu6ZzZm2.zzQ("w:suppressOverlap", obj39);
        zzyu6ZzZm2.zzYz("w:jc", strZzX);
        zzyu6ZzZm2.zzYz("w:textDirection", strZzR);
        zzyu6ZzZm2.zzYz("w:textAlignment", strZztf);
        zzyu6ZzZm2.zzQ("w:outlineLvl", num);
        if (z5) {
            zzyu6ZzZm2.zzQ("w:mirrorIndents", obj40);
        } else if (obj40 != null) {
            zzz9w.zzT(65536, "MirrorIndents is not supported in WordML.");
        }
        if (bool != null && bool.booleanValue() && z5 && zzz9w.getCompliance() != 0) {
            zzyu6ZzZm2.zzZ("w15:collapsed", (String) null);
        }
        return true;
    }

    private static void zzZ(TabStopCollection tabStopCollection, zzZ9W zzz9w) {
        if (tabStopCollection == null || tabStopCollection.getCount() == 0) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("w:tabs");
        for (int i = 0; i < tabStopCollection.getCount(); i++) {
            TabStop tabStop = tabStopCollection.get(i);
            String strZzZJ = zzYUW.zzZJ(tabStop.getLeader(), zzz9w.zzZmh());
            int iMax = Math.max(tabStop.zzY0E(), -31680);
            String strZzS = zzYUW.zzS(tabStop.getAlignment(), zzz9w.zzZmh(), zzz9w.getCompliance() == 2);
            if ("none".equals(strZzZJ)) {
                strZzZJ = null;
            }
            zzyu6ZzZm2.zzX("w:tab", "w:val", strZzS, "w:leader", strZzZJ, "w:pos", Integer.valueOf(iMax));
        }
        zzyu6ZzZm2.zzp();
    }
}

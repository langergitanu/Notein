package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZS {
    public static void zzZ(String str, zz07 zz07Var, zzZXR zzzxr) {
        if (zz07Var == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zzzydZzZlV.zzZh("rot", com.aspose.words.internal.zzAN.zzZG(zz07Var.zzZCC().getValue()));
        int flipOrientation = zz07Var.getFlipOrientation();
        boolean z = flipOrientation == 1 || flipOrientation == 3;
        boolean z2 = flipOrientation == 2 || flipOrientation == 3;
        zzzydZzZlV.zzw("flipH", z);
        zzzydZzZlV.zzw("flipV", z2);
        zzH5.zzZ("a:off", com.aspose.words.internal.zzAN.zzZG(zz07Var.zzQb()), com.aspose.words.internal.zzAN.zzZG(zz07Var.zzYm()), zzzydZzZlV);
        zzH5.zzY("a:ext", com.aspose.words.internal.zzAN.zzZG(zz07Var.getWidth()), com.aspose.words.internal.zzAN.zzZG(zz07Var.getHeight()), zzzydZzZlV);
        zz6X zz6x = (zz6X) com.aspose.words.internal.zzZKW.zzZ(zz07Var, zz6X.class);
        if (zz6x != null) {
            zzH5.zzZ("a:chOff", com.aspose.words.internal.zzAN.zzZG(zz6x.zzZAe()), com.aspose.words.internal.zzAN.zzZG(zz6x.zzZAd()), zzzydZzZlV);
            zzH5.zzY("a:chExt", com.aspose.words.internal.zzAN.zzZG(zz6x.zzZAh()), com.aspose.words.internal.zzAN.zzZG(zz6x.zzZAg()), zzzydZzZlV);
        }
        zzzydZzZlV.zzo();
    }
}

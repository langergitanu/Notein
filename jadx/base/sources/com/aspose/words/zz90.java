package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zz90 {
    public static com.aspose.words.internal.zzZL zzY(zz8Z zz8z) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0L, zz8z.zzZCS());
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzHZ));
        zzg.zzX(zzzgZzW);
        zz2O zz2o = new zz2O(0);
        zz2o.setFill(zz8z.zzZCP().zzZER().zzZEo().getFill());
        zz2o.setOutline(zz8z.zzZCP().zzZER().zzZEp().getOutline());
        zz2o.zzZ(zz7G.zzOA(DrawToolFactory.LASSO_TYPE_RECT));
        zz2o.zzZ(zzZx(zzzq4));
        zz2o.zzO(zz8z.zzZCJ());
        zzg.zzX(new zz1P(zz2o).zzZ(zz8z.zzZCT()));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZ(zz8Z zz8z) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0L, zz8z.zzZCS());
        zz2O zz2o = new zz2O(0);
        zz2o.setOutline(zz8z.zzZCP().zzZER().zzZEp().getOutline());
        zz2o.zzZ(zz7G.zzOA(DrawToolFactory.LASSO_TYPE_RECT));
        zz2o.zzZ(zzZx(zzzq4));
        zz2o.zzO(zz8z.zzZCJ());
        return new zz1P(zz2o).zzZ(zz8z.zzZCT());
    }

    private static zz07 zzZx(com.aspose.words.internal.zzZQ4 zzzq4) {
        zz07 zz07Var = new zz07();
        zz07Var.zzW(zzzq4.getX());
        zz07Var.zzV(zzzq4.getY());
        zz07Var.setWidth(zzzq4.getWidth());
        zz07Var.setHeight(zzzq4.getHeight());
        return zz07Var;
    }
}

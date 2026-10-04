package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzDJ implements zzZC7 {
    private ShapeBase zzZaN;

    public zzDJ(ShapeBase shapeBase) {
        this.zzZaN = shapeBase;
    }

    private zzD8 getChartSpace() {
        return (zzD8) com.aspose.words.internal.zzZKW.zzZ(this.zzZaN.zzY9i(), zzD8.class);
    }

    @Override // com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        if (Float.intBitsToFloat((int) zz50Var.zzZIz()) < 0.05d || com.aspose.words.internal.zzZPW.zzYz(zz50Var.zzZIz()) < 0.05d) {
            return new com.aspose.words.internal.zzG();
        }
        zz50Var.zzZy8().zzO(getChartSpace().zzZTh());
        boolean z = getChartSpace().zzZHM() != null;
        zzZ90 themeProvider = zz50Var.zzZIB().getThemeProvider();
        if (z) {
            zz50Var.zzZIB().zzV(zzZ(themeProvider, getChartSpace().zzZHM()));
        }
        com.aspose.words.internal.zzZL zzzlZzZ = zzD6.zzZ(this.zzZaN, new zzDI(getChartSpace(), zz50Var));
        if (z) {
            zz50Var.zzZIB().zzV(themeProvider);
        }
        zz50Var.zzZy8().zzZsa();
        return zzzlZzZ;
    }

    private static Theme zzZ(zzZ90 zzz90, Theme theme) {
        if (theme.zzXVE().zzXVx()) {
            return theme;
        }
        Theme themeZzXVK = theme.zzXVK();
        for (int i : ThemeColors.zzX36) {
            themeZzXVK.zzXVE().zzZ(zzz90.getThemeColor(i), i);
        }
        return themeZzXVK;
    }
}

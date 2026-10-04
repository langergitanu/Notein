package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzW6 implements zzZ9G {
    private zzD8 zzZz1;

    public zzW6(zzD8 zzd8) {
        this.zzZz1 = zzd8;
    }

    private Theme getTheme() {
        return this.zzZz1.zzZyb().getDocument().zzZqI();
    }

    private com.aspose.words.internal.zzPV zz35() {
        if (!this.zzZz1.zz33()) {
            return com.aspose.words.internal.zzPV.zzHZ;
        }
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(com.aspose.words.internal.zzPV.zzYR(getTheme().getColors().getDark1()));
        zzip.zzZQ(1.0d - ((1.0d - zzip.zzGu()) * 0.65d));
        return zzip.zzGx();
    }

    private static boolean zzNW(int i) {
        return i == 830;
    }

    private static boolean zzNX(int i) {
        return (i == 360 || i == 370 || zzYED.zzn8(i)) ? false : true;
    }

    private static boolean zzNY(int i) {
        return i == 230 || i == 235 || i == 240 || i == 270;
    }

    private static Object zzZJ(Object obj) {
        return obj instanceof zz7X ? ((zz7X) obj).zzZQ6() : obj;
    }

    @Override // com.aspose.words.zzZ9G
    public void clearRunAttrs() {
        zz36();
    }

    @Override // com.aspose.words.zzZ9G
    public Object fetchInheritedRunAttr(int i) {
        Object objZzO8 = zzO8(i);
        return objZzO8 != null ? objZzO8 : zzNZ(i);
    }

    @Override // com.aspose.words.zzZ9G
    public Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    @Override // com.aspose.words.zzZ9G
    public void removeRunAttr(int i) {
        Iterator<zz30> it = zz3E().iterator();
        while (it.hasNext()) {
            zzYED.zzY(it.next(), i);
        }
    }

    @Override // com.aspose.words.zzZ9G
    public void setRunAttr(int i, Object obj) {
        if (zzNX(i)) {
            throw new IllegalStateException("The property is not supported on a chart object.");
        }
        zzYo(true);
        Iterator<zz30> it = zz3E().iterator();
        while (it.hasNext()) {
            zzYED.zzZ(it.next(), i, obj, getTheme());
        }
        Iterator<zz4A> it2 = zz3D().iterator();
        while (it2.hasNext()) {
            it2.next().zzZxp().zzWS(true);
        }
    }

    public final boolean zz33() {
        return this.zzZz1.zz33();
    }

    public final zzCL zz34() {
        return this.zzZz1.zzaR();
    }

    public void zz36() {
        Iterator<zz30> it = zz3E().iterator();
        while (it.hasNext()) {
            it.next().removeAll();
        }
    }

    public abstract zz30 zz3C();

    public abstract Iterable<zz4A> zz3D();

    public abstract Iterable<zz30> zz3E();

    public Object zzNZ(int i) {
        if (i == 160) {
            return zz35();
        }
        if (i == 190) {
            return Integer.valueOf(com.aspose.words.internal.zzSA.zzt(this.zzZz1.zz33() ? 9.0d : 10.0d));
        }
        if (i == 220) {
            return Integer.valueOf(this.zzZz1.zz33() ? 0 : 24);
        }
        if (i != 230) {
            return zzYEF.zzOt(i);
        }
        String fontName = getTheme() != null ? getTheme().getFontName(131073) : null;
        if (fontName == null) {
            fontName = "Calibri";
        }
        return zzU1.zzSP(fontName);
    }

    public abstract Object zzO8(int i);

    public final Object zzY(int i, zz30 zz30Var) {
        Theme theme = getTheme();
        if (theme == null && zzNY(i)) {
            theme = Theme.zzXVL();
        }
        return zzYED.zzZ(zz30Var, i, theme, true);
    }

    public abstract void zzYo(boolean z);

    public final Object zzZ(int i, zz30 zz30Var) {
        Object objZzY = zzY(i, zz30Var);
        if (objZzY == null || !zzNW(i)) {
            return objZzY;
        }
        Object objZzZJ = zzZJ(objZzY);
        zzYo(false);
        zzYED.zzZ(zz3C(), i, objZzZJ, getTheme());
        return objZzZJ;
    }

    @Override // com.aspose.words.zzZ9G
    public Object getDirectRunAttr(int i, int i2) {
        if (zz3C() != null && zzYED.zzZ(zz3C(), i)) {
            return zzY(i, zz3C());
        }
        if (i == 830) {
            return zzO8(i);
        }
        return null;
    }
}

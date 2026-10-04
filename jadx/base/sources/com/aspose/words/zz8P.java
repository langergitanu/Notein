package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8P {
    private com.aspose.words.internal.zz7D<zz8O> zzZ5g = new com.aspose.words.internal.zz7D<>();
    private zz8Z zzZ7J;

    public zz8P(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    private boolean zzR(zz2O zz2o) throws Exception {
        zzY9X zzy9xZzZb;
        if (zz2o == null || zz2o.zzZAk() == null) {
            return true;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZv = zz2o.zzZAk().zzZTh().zzZv();
        Document documentZzZpS = this.zzZ7J.zzZCQ().getDocument().zzZpS();
        Shape shape = (Shape) zz0G.zzY(zz2o.zzZAk(), zzzq4ZzZv, documentZzZpS);
        shape.zzmb(0);
        documentZzZpS.getFirstSection().getBody().getFirstParagraph().appendChild(shape);
        if (!shape.zzYac() || (zzy9xZzZb = documentZzZpS.zzWA(true).zzZb(shape)) == null) {
            return true;
        }
        zzYCD zzycd = new zzYCD(new zzYC5(shape), new zzZL4(), documentZzZpS.getWarningCallback());
        zzY63 zzy63 = new zzY63(zzy9xZzZb);
        long jZzXW8 = zzycd.zzYad().zzXW8();
        int i = (int) jZzXW8;
        zzy63.setWidth(Float.intBitsToFloat(i));
        zzy63.zzk(com.aspose.words.internal.zzZPW.zzYz(jZzXW8));
        zzy63.zzV9(false);
        zzy63.zzZ(shape);
        return zzy63.getHeight() <= com.aspose.words.internal.zzZPW.zzYz(jZzXW8) && zzY(zzy9xZzZb) <= Float.intBitsToFloat(i);
    }

    public final boolean zzY(zz8O zz8o) {
        return com.aspose.words.internal.zzZQB.zzRr(this.zzZ5g.get(zz8o));
    }

    public final boolean zzZ(zz8O zz8o) {
        return this.zzZ5g.containsKey(zz8o);
    }

    private static float zzY(zzY9X zzy9x) throws Exception {
        zzYC0 zzyc0;
        int iMax = 0;
        zzYBY zzybyZzQJ = zzy9x.zzQJ(false);
        if (zzybyZzQJ == null || (zzyc0 = (zzYC0) com.aspose.words.internal.zzZKW.zzZ(zzybyZzQJ.zzZXZ(), zzYC0.class)) == null) {
            return 0.0f;
        }
        for (zzZ6T zzz6tZzZXZ = zzyc0.zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
            iMax = Math.max(((zzYMM) com.aspose.words.internal.zzZKW.zzZ(zzz6tZzZXZ, zzYMM.class)).getMinWidth(), iMax);
        }
        return (float) (((double) iMax) / 20.0d);
    }

    public final boolean zzZ(zz8O zz8o, zz2O zz2o) throws Exception {
        boolean zZzR = zzR(zz2o);
        this.zzZ5g.set(zz8o, zZzR ? 1 : 0);
        return zZzR;
    }
}

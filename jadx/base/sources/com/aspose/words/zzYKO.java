package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYKO<CallbackType, ArgsType> {
    private HashMap<Integer, Double> zzXDe = new HashMap<>();
    private int zzXDf;
    protected CallbackType zzXDg;
    protected Document zzXDh;

    public zzYKO(DocumentBase documentBase, CallbackType callbacktype, int i) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(documentBase, Document.class);
        if (document == null) {
            return;
        }
        this.zzXDh = document;
        this.zzXDf = i;
        this.zzXDg = callbacktype;
    }

    private void zzQ(int i, double d) {
        if (this.zzXDe.containsKey(Integer.valueOf(i))) {
            this.zzXDe.put(Integer.valueOf(i), Double.valueOf(d));
        } else {
            com.aspose.words.internal.zzZQF.zzY(this.zzXDe, Integer.valueOf(i), Double.valueOf(d));
        }
    }

    private static double zzW(int i, int i2, double d) {
        if (i >= i2) {
            return 100.0d;
        }
        return Math.max((((double) i) / ((double) i2)) * 100.0d, d);
    }

    private double zzY(int i, int i2, zzYKP zzykp) {
        if (this.zzXDe.containsKey(Integer.valueOf(i))) {
            return this.zzXDe.get(Integer.valueOf(i)).doubleValue();
        }
        if (i != 0 || i2 <= 0) {
            return 0.0d;
        }
        return zzykp.zzZ(new zzY9G(zzykp.zzpI(i2), 100.0d));
    }

    private static double zzYO(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop.getLength() == 0) {
            return 100.0d;
        }
        return (zzzop.getPosition() / zzzop.getLength()) * 100.0d;
    }

    public boolean zzYVb() {
        return this.zzXDh != null;
    }

    public final boolean zzYmt() {
        return this.zzXDg != null;
    }

    public final zzY9G zzZ(int i, int i2, zzYKP zzykp) {
        return zzZ(zzW(i, i2, zzY(this.zzXDf, zzykp.zzpJ(this.zzXDf), zzykp)), zzykp);
    }

    public final zzY9G zzZ(com.aspose.words.internal.zzZOP zzzop, zzYKP zzykp, boolean z) throws Exception {
        return zzZ(z ? 100.0d : zzYO(zzzop), zzykp);
    }

    private zzY9G zzZ(double d, zzYKP zzykp) {
        int iZzpJ = zzykp.zzpJ(this.zzXDf);
        zzY9G zzy9g = new zzY9G(this.zzXDf, d);
        double dZzZ = zzykp.zzZ(zzy9g);
        double dZzY = zzY(0, iZzpJ, zzykp);
        if (com.aspose.words.internal.zzQO.zzZ(dZzY, 2) >= com.aspose.words.internal.zzQO.zzZ(dZzZ, 2)) {
            return null;
        }
        zzQ(this.zzXDf, d);
        zzQ(0, dZzZ);
        return zzy9g;
    }
}

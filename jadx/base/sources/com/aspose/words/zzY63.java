package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY63 implements zzZ91 {
    private static float zzX3V = 0.001f;
    private static float zzX3W = 1073741.9f;
    private float zzHi;
    private boolean zzX3R;
    private boolean zzX3S;
    private boolean zzX3U;
    private float zzwo;
    private zzZ6R zzYj1 = new zzZ6R();
    private HashMap<zzZ92, zzY9X> zzX3T = new HashMap<>();

    public zzY63(zzY9X zzy9x) {
        if (zzy9x.getNode().getParentNode() != null) {
            zzy9x.getNode().getParentNode().getNodeType();
        }
        zzY9X.zzZ(zzy9x, this.zzX3T);
        this.zzX3S = (zzy9x.zzY55() == null && zzy9x.zzY56() == null) ? false : true;
    }

    private static boolean zzK(zzTF zztf) {
        return (zztf.zz60() == 16 && ((zzY6N) ((zzYIC) ((zzWV) ((zzWT) zztf).zza9()).zza9()).zza9()).zzY6a().zzYKv()) ? false : true;
    }

    private static int zzL(zzTF zztf) throws Exception {
        return zztf.zz60() == 2 ? ((zzZ35) ((zzZ2D) ((zzUZ) zztf).zza9()).zzYTt()).zzYLs() : zztf.zzZXS();
    }

    private static zzZ92[] zzP(zzY9X zzy9x) {
        ArrayList arrayList = new ArrayList();
        while (zzy9x != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayList, zzy9x.getNode());
            zzy9x = zzy9x.zzY55();
        }
        zzZ92[] zzz92Arr = new zzZ92[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            zzz92Arr[i] = (zzZ92) arrayList.get(i);
        }
        return zzz92Arr;
    }

    private void zzW(zzYC4 zzyc4) throws Exception {
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (zzYMD zzymdZz6x = zzyc4.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            iMin = Math.min(iMin, zzymdZz6x.getY());
            iMax = Math.max(iMax, zzymdZz6x.getY() + zzymdZz6x.getHeight());
        }
        float f = (iMax - iMin) / 1000.0f;
        if (this.zzX3R) {
            this.zzX3R = false;
            f = 0.0f;
        }
        this.zzwo = Math.abs(f);
    }

    private static void zzY(zzYC4 zzyc4) throws Exception {
        zzYMD zzymdZz6w = zzyc4.zz6w();
        for (zzYMD zzymdZz6x = zzyc4.zz6x(); zzymdZz6x != zzymdZz6w; zzymdZz6x = zzymdZz6x.zz5Z()) {
            int y = zzymdZz6x.getY();
            zzymdZz6x.setY(zzymdZz6w.getY());
            zzymdZz6w.setY(y);
            zzymdZz6w = zzymdZz6w.zz5Y();
            if (zzymdZz6x == zzymdZz6w) {
                return;
            }
        }
    }

    private static zzYC4 zzYR(Object obj) {
        return (zzYC4) ((Object[]) obj)[3];
    }

    private static zzZ92 zzYS(Object obj) {
        return (zzZ92) ((Object[]) obj)[0];
    }

    private static void zzYT(Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 5 && (objArr[0] instanceof zzZ92) && (objArr[1] instanceof zzY9X) && (objArr[2] instanceof zzYBY) && (objArr[3] instanceof zzYC4) && (objArr[4] instanceof zzTF)) {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid object\r\nParameter name: opaque");
    }

    @Override // com.aspose.words.zzZ91
    public final float getHeight() {
        return this.zzwo;
    }

    @Override // com.aspose.words.zzZ91
    public final float getWidth() {
        return this.zzHi;
    }

    @Override // com.aspose.words.zzZ91
    public final void setWidth(float f) {
        this.zzHi = f;
    }

    @Override // com.aspose.words.zzZ91
    public final void zzV9(boolean z) {
        this.zzX3U = z;
    }

    @Override // com.aspose.words.zzZ91
    public final void zzX(zzZ6R zzz6r) {
        this.zzYj1 = zzz6r;
    }

    @Override // com.aspose.words.zzZ91
    public final boolean zzYW9() {
        return this.zzX3S;
    }

    @Override // com.aspose.words.zzZ91
    public final Object zzZ(zzZ92 zzz92) {
        long[] jArrZzZ;
        try {
            zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzQW.zzZ(this.zzX3T, zzz92);
            if (zzy9x == null) {
                return null;
            }
            zzTF zztf = (zzTF) zzy9x.zzqh(19);
            zzYBY zzybyZzQJ = zzy9x.zzQJ(false);
            zzY9X zzy9xZzY54 = zzy9x.zzY54();
            if (zzybyZzQJ == null) {
                zzybyZzQJ = zzy9xZzY54.zzQJ(false);
                if (zzybyZzQJ.zzac()) {
                    return zzZ(zzz92, zzy9x, zzybyZzQJ, zzy9x.zzY52(), zztf);
                }
            }
            zzZ6R zzz6rZza8 = zzybyZzQJ.zza8();
            zzybyZzQJ.zzZ(this.zzYj1);
            if (zzy9xZzY54.zzY55() != null) {
                jArrZzZ = zzY60.zzZ(zzP(zzy9xZzY54));
                this.zzX3U = false;
            } else {
                jArrZzZ = new long[]{com.aspose.words.internal.zzZPW.zzG(zzZ(zztf, zzz92), zzX3W)};
            }
            zzybyZzQJ.zzx(jArrZzZ);
            zzX(zzy9x.zzY52());
            zzW(zzy9x.zzY52());
            zzybyZzQJ.zzZ(zzz6rZza8);
            return zzZ(zzz92, zzy9x, zzybyZzQJ, zzy9x.zzY52(), zztf);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZ91
    public final void zzk(float f) {
        this.zzwo = f;
    }

    private static float zzX(zzTF zztf, boolean z) throws Exception {
        int iZzL;
        if (z) {
            zzYCT zzyct = (zzYCT) zztf.zza9().zzxY(2);
            if (zzyct.getStoryType() != 1) {
                zzyct = (zzZ2D) ((zzYN8) zztf.zzqh(1)).zza9();
            }
            zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzyct).zzYTt();
            iZzL = (zzz35.getPageHeight() - zzz35.zzZRg()) - zzz35.zzZRf();
        } else {
            iZzL = zzK(zztf) ? zzL(zztf) : zzL((zzTF) zztf.zzqh(3));
        }
        return iZzL / 1000.0f;
    }

    @Override // com.aspose.words.zzZ91
    public final boolean zzY(zzZ92 zzz92) {
        return this.zzX3T.containsKey(zzz92);
    }

    private void zzX(zzYC4 zzyc4) throws Exception {
        int x;
        if (this.zzX3U) {
            int width = zzyc4.getWidth();
            int iMax = Integer.MIN_VALUE;
            for (zzYMD zzymdZz6x = zzyc4.zz6x(); zzymdZz6x != null && iMax < width; zzymdZz6x = zzymdZz6x.zz5Z()) {
                int iZz60 = zzymdZz6x.zz60();
                if (iZz60 == 8) {
                    zzYIA zzyia = (zzYIA) zzymdZz6x;
                    int width2 = zzyia.getWidth();
                    if (zzymdZz6x.zza7().zzZYM()) {
                        x = ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().zzYM7() + (width2 - ((zzZ3B) ((zzWV) ((zzWV) ((zzYIC) zzyia.zza9()).zzZXY()).zzYTo()).zzYTt()).getRightPadding());
                    } else {
                        x = width2 - ((zzWT) zzyia.zz6x()).getX();
                    }
                } else if (iZz60 == 32) {
                    zzZ55 zzz55 = (zzZ55) zzymdZz6x;
                    if (zzY9R.zzmW(zzz55.zzYQc().zzZo6())) {
                        int x2 = (zzz55.getX() + zzZ55.zzc(zzz55)) - Math.min(0, zzz55.getX());
                        zzyc4.zz5X();
                        x = Math.max(0, ((zzYMM) zzz55.zza9()).zzYM4()) + x2;
                    } else {
                        x = width;
                    }
                } else {
                    throw new IllegalStateException("Unexpected content part type in a text box.");
                }
                iMax = Math.max(iMax, x);
            }
            this.zzHi = Math.min(iMax, width) / 1000.0f;
        }
    }

    @Override // com.aspose.words.zzZ91
    public final com.aspose.words.internal.zzG zzZ(Object obj, long j, float f, Shading shading, boolean z) throws Exception {
        zzYT(obj);
        zzYC4 zzyc4ZzYR = zzYR(obj);
        zzyc4ZzYR.zzZ(shading);
        boolean z2 = zzyc4ZzYR.getWidth() != com.aspose.words.internal.zzSA.zzn((double) Float.intBitsToFloat((int) j)) && zzYS(obj).getTextBoxWrapMode_ITextBox() == 2;
        zzyc4ZzYR.setWidth(com.aspose.words.internal.zzSA.zzn(Float.intBitsToFloat(r1)));
        zzyc4ZzYR.setHeight(com.aspose.words.internal.zzSA.zzn(com.aspose.words.internal.zzZPW.zzYz(j)));
        zzyc4ZzYR.zzm4(com.aspose.words.internal.zzSA.zzn(f));
        if (z2) {
            zzZ(zzyc4ZzYR);
        }
        if (z) {
            zzY(zzyc4ZzYR);
        }
        return (com.aspose.words.internal.zzG) zzyc4ZzYR.zzbF();
    }

    private static void zzZ(zzYC4 zzyc4) throws Exception {
        for (zzYMD zzymdZz6x = zzyc4.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            if (zzymdZz6x.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zzymdZz6x;
                if (zzZ5H.zzP(zzz55) != (zzz55.zz5T() ? 2 : 0)) {
                    zzZ59.zzU(zzz55, zzyc4.getWidth());
                    zzZ5H.zzT(zzz55);
                }
            } else if (zzymdZz6x.zz60() == 8) {
                zzYIA zzyia = (zzYIA) zzymdZz6x;
                if (zzyia.zzYjE()) {
                    ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzVc(zzyc4.zz5X(), zzyc4.getWidth() - zzyc4.zz5V());
                }
                if (((zzYIC) zzyia.zza9()).zzYk1().getAlignment() != (zzyia.zz5T() ? 2 : 0)) {
                    zzyia.setX(zzYIB.zzU(zzyia));
                }
            }
        }
    }

    private static Object zzZ(zzZ92 zzz92, zzY9X zzy9x, zzYBY zzyby, zzYC4 zzyc4, zzTF zztf) {
        zzy9x.zzQo(false);
        zzy9x.zzY54().zzQJ(false);
        return new Object[]{zzz92, zzy9x, zzyby, zzyc4, zztf};
    }

    private float zzZ(zzTF zztf, zzZ92 zzz92) throws Exception {
        if (!this.zzX3U) {
            return this.zzHi;
        }
        float fZzX = zzX(zztf, zzz92.hasVerticalTextFlow_ITextBox()) - zzz92.getHorizontalMargins_ITextBox();
        boolean z = fZzX <= 0.0f;
        this.zzX3R = z;
        return z ? zzX3V : fZzX;
    }
}

package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;

/* JADX INFO: loaded from: classes5.dex */
final class zz1L {
    private int zzfK;
    private boolean zzfL;
    private boolean zzfM;
    private zzP9 zzfN;
    private boolean zzfO;
    private zz39 zzjV;
    private zz4Y zzjX;
    private zz4X zzjY;
    private zz4W zzkV;

    public zz1L(zz4W zz4w, zz4X zz4x, zz39 zz39Var, zz4Y zz4y) {
        this.zzkV = zz4w;
        this.zzjY = zz4x;
        this.zzjV = zz39Var;
        this.zzjX = zz4y;
    }

    private void zzJ(zzZU zzzu) throws Exception {
        zzPV zzpvZzZy;
        float fZzPg;
        boolean zIsEmpty = zzzu.zzZy().isEmpty();
        if (zzzu.zzZq().isEmpty() && !zzzu.zzZr().zzPj()) {
            zzTR(0);
            zzZ(zzzu.zzZy(), false);
            return;
        }
        zzPV zzpvZzZq = zzzu.zzZq();
        if (zzzu.zzZr().zzPj()) {
            fZzPg = zzzu.zzZr().zzPg() / 35.0f;
            zzpvZzZy = !zzzu.zzZy().isEmpty() ? zzzu.zzZy() : zzzu.zzZq();
        } else {
            zzpvZzZy = zzpvZzZq;
            fZzPg = 0.5f;
        }
        if (zIsEmpty) {
            zzTR(1);
        } else {
            zzTR(2);
            zzZ(zzzu.zzZy(), false);
        }
        zzZX(fZzPg);
        zzZ(zzpvZzZy, true);
    }

    private static int zzK(float f, float f2) {
        return zzAN.zzZG((f * 1000.0f) / f2);
    }

    private void zzTR(int i) throws Exception {
        if (this.zzjV.zzTS(i)) {
            return;
        }
        zztb();
        this.zzjV.zzTR(i);
    }

    private void zzW(int i, float f) {
        this.zzfN.zzZ(new zzP9(1.0f, 0.0f, 0.0f, 1.0f, (i / 1000.0f) * f, 0.0f), 0);
    }

    private void zzX(zz3Q zz3q, float f) throws Exception {
        if (this.zzjV.zzZ(zz3q, f)) {
            return;
        }
        zztb();
        this.zzjV.zzY(zz3q, f);
    }

    private void zzXK(String str) throws Exception {
        zztb();
        this.zzjY.zzXH("/Span");
        this.zzjY.zzFd();
        this.zzjY.zzYY("/ActualText");
        this.zzjY.zzYV(str);
        this.zzjY.zzFc();
        this.zzjY.zzFh();
        this.zzjY.zzXV("BDC");
    }

    private static zzP9 zzY(zzPM zzpm, long j) {
        return new zzP9(1.0f, 0.0f, zzpm.zzPi() ? 0.34906584f : 0.0f, -1.0f, Float.intBitsToFloat((int) j), zzZPY.zzYC(j));
    }

    private void zzZX(float f) throws Exception {
        if (this.zzjV.zz1(f)) {
            return;
        }
        zztb();
        this.zzjV.zz0(f);
    }

    private void zzt9() throws Exception {
        if (this.zzfL) {
            this.zzjV.zztV().zzu7().zzun().zzX(this.zzjY);
            this.zzfL = false;
        }
    }

    private void zzta() throws Exception {
        if (this.zzfL) {
            return;
        }
        this.zzjV.zztV().zzu7().zzun().zzY(this.zzjY);
        this.zzfL = true;
    }

    private void zztb() throws Exception {
        if (this.zzfM) {
            zzt9();
            this.zzjY.zzXV("] TJ");
            this.zzfM = false;
            this.zzfK = 0;
        }
    }

    private void zztc() throws Exception {
        if (this.zzfM) {
            return;
        }
        this.zzjY.zzXW("[");
        this.zzfM = true;
        this.zzfK = 0;
    }

    private void zztd() throws Exception {
        zztb();
        this.zzjY.zzXV("EMC");
    }

    private void zzte() throws Exception {
        if (this.zzfO) {
            return;
        }
        this.zzjY.zzXV("BT");
        this.zzfO = true;
        this.zzfN = new zzP9();
    }

    private void zzy(zzP9 zzp9) throws Exception {
        zztb();
        this.zzjY.zzx(zzp9);
        this.zzjY.zzFh();
        this.zzjY.zzXV("Tm");
        this.zzfN = zzp9;
    }

    public final void zzQ(zzZU zzzu) throws Exception {
        zzte();
        zz3Q zz3qZzL = zzzu.zzZh() != null ? this.zzjX.zzL(zzzu.zzZr()) : this.zzjX.zzZ(zzzu.zzZr(), zzzu.getText());
        zzX(zz3qZzL, zzzu.zzZr().zzPg());
        zzZ(zzzu.zzZr(), zzzu.zzZT());
        zzJ(zzzu);
        zzZ(zzzu, zz3qZzL);
    }

    public final void zzZ(zzB zzb) throws Exception {
        zzte();
        zz3Q zz3qZzL = this.zzjX.zzL(zzb.zzZr());
        zzX(zz3qZzL, zzb.zzZr().zzPg());
        zzTR(0);
        zzXK(zzb.getText());
        zzZ(zzb.zzZr(), zzb.zzZT());
        for (zzZX7 zzzx7 : zzb.zzZC().zzoX().zzoV()) {
            zzZ(zzzx7.zzZy(), false);
            zzY(zzb.zzZT(), zzb.zzZr());
            zzZ(zzzx7.getGlyphIndex(), zzb.zzZD(), zz3qZzL, zzb.zzZr().zzPg());
        }
        zztd();
    }

    public final void zzvh() throws Exception {
        if (this.zzfO) {
            zztb();
            this.zzjY.zzXV("ET");
            this.zzfO = false;
        }
    }

    private static boolean zzW(zzP9 zzp9, zzP9 zzp92) {
        return zzP9.zzX(zzp9, zzp92) && zzAN.zzY(zzp9.zzOb(), zzp92.zzOb(), 0.001f) && zzAN.zzY(zzp9.zzOa(), zzp92.zzOa(), 0.001f);
    }

    private void zzY(long j, zzPM zzpm) throws Exception {
        if (!zzAN.zzS(zzZPY.zzYC(j), this.zzfN.zzOa())) {
            zzy(zzY(zzpm, j));
            return;
        }
        int iZzK = zzK(Float.intBitsToFloat((int) j) - this.zzfN.zzOb(), zzpm.zzPg());
        if (iZzK != 0 || this.zzkV.zzvc().getAdditionalTextPositioning()) {
            if (!this.zzfM) {
                zztc();
            }
            zzt9();
            this.zzjY.writeInt(-iZzK);
            zzW(iZzK, zzpm.zzPg());
        }
    }

    private void zzZ(zzPV zzpv, boolean z) throws Exception {
        if (this.zzjV.zzX(zzpv, z)) {
            return;
        }
        zztb();
        this.zzjV.zzZ(zzpv, z);
    }

    private void zzZ(zzPM zzpm, long j) throws Exception {
        zzP9 zzp9ZzY = zzY(zzpm, j);
        if (zzW(zzp9ZzY, this.zzfN)) {
            return;
        }
        if (!zzP9.zzX(zzp9ZzY, this.zzfN)) {
            zzy(zzp9ZzY);
            return;
        }
        if (!zzAN.zzY(zzp9ZzY.zzOa(), this.zzfN.zzOa(), 0.001f)) {
            zzy(zzp9ZzY);
        }
        if (Math.abs(zzK(zzp9ZzY.zzOb() - this.zzfN.zzOb(), zzpm.zzPg())) > 30000.0f) {
            zzy(zzp9ZzY);
        }
    }

    private void zzZ(zzZU zzzu, zz3Q zz3q) throws Exception {
        Cluster[] clusterArrZzZh = zzzu.zzZh();
        if (clusterArrZzZh == null) {
            clusterArrZzZh = zzzu.zzZr().zzZ(zzzu.getText(), zzzu.zzZk());
        }
        zzZ(clusterArrZzZh, zzzu, zz3q);
    }

    private void zzZ(Cluster[] clusterArr, zzZU zzzu, zz3Q zz3q) throws Exception {
        float width = 0.0f;
        for (Cluster cluster : clusterArr) {
            boolean z = true;
            if (cluster.getCodepoints().length == 1 && cluster.getGlyphs().length == 1) {
                z = false;
            }
            if (z) {
                zzXK(cluster.getString());
            }
            for (Glyph glyph : cluster.getGlyphs()) {
                long jZzZ = zzZ(zzzu.zzZr(), zzzu.zzZT(), width, glyph);
                width += glyph.getWidth(zzzu.zzZr().zzPl().zzpO(), zzzu.zzZr().zzPg());
                zzY(jZzZ, zzzu.zzZr());
                zzZ(glyph.getGlyphIndex(), z ? 0 : cluster.getCodepoints()[0], zz3q, zzzu.zzZr().zzPg());
                if (this.zzfK >= 10000) {
                    zztb();
                }
            }
            if (z) {
                zzZ(zz3q, cluster);
                zztd();
            }
        }
    }

    private static void zzZ(zz3Q zz3q, Cluster cluster) {
        int[] iArr;
        if (cluster.getCodepointsLength() == 0) {
            return;
        }
        for (int i = 0; i < cluster.getGlyphs().length; i++) {
            int glyphIndex = cluster.getGlyphs()[i].getGlyphIndex();
            if (i >= cluster.getCodepoints().length) {
                iArr = new int[]{cluster.getCodepoints()[cluster.getCodepoints().length - 1]};
            } else if (i == cluster.getGlyphs().length - 1) {
                int length = cluster.getCodepoints().length - i;
                int[] iArr2 = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr2[i2] = cluster.getCodepoints()[i + i2];
                }
                iArr = iArr2;
            } else {
                iArr = new int[]{cluster.getCodepoints()[i]};
            }
            zz3q.zzY(glyphIndex, iArr);
        }
    }

    private static long zzZ(zzPM zzpm, long j, float f, Glyph glyph) {
        return C22243OooO0Oo.OooO00o(-zzpm.zzY4(glyph.getAscenderOffset()), Float.intBitsToFloat((int) j) + zzpm.zzY4(glyph.getAdvanceOffset()) + f, j);
    }

    private void zzZ(int i, int i2, zz3Q zz3q, float f) throws Exception {
        zztc();
        zzta();
        zz3q.zzZ(i, i2, this.zzjY);
        zzW(zz3q.zzU0(zz3q.zzuo().zzPl().zzpP().zzSt(i).zzoZ()), f);
        this.zzfK++;
        zzZ(zz3q, i, i2);
    }

    private void zzZ(zz3Q zz3q, int i, int i2) {
        if (zzZVS.zzS1(i2)) {
            this.zzkV.zzv1().zzws();
        }
        if (i == zz3q.zzuo().zzPl().zzpP().zzoT().getGlyphIndex()) {
            this.zzkV.zzv1().zzwr();
        }
    }
}

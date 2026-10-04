package com.aspose.words;

import OooOoO.C20503OooO00o;
import OooOoO.C20504OooO0O0;
import OooOoO.C20509OooO0oo;
import Oooo0.C20855OooooOO;
import Oooo0o0.C21009OooOooO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzEM {
    private float zzHi;
    private ChartLegend zzZcH;
    private int[] zzZcb;
    private float zzZcc;
    private int zzZcd;
    private boolean zzZce;
    private float zzZcf;
    private float zzZcg;
    private float zzZdW;
    private com.aspose.words.internal.zzZQ4 zzZgO;
    private zzDI zzZyQ;
    private float zzwo;
    private float zzZca = 0.0f;
    private float zzZc9 = 0.0f;
    private boolean zzZc8 = false;
    private int zzZc7 = 1;
    private ArrayList<zzEQ> zzZc4 = new ArrayList<>();
    private ArrayList<zzEP> zzZc3 = new ArrayList<>();
    private com.aspose.words.internal.zzG zzZc6 = new com.aspose.words.internal.zzG();
    private com.aspose.words.internal.zzG zzZc5 = new com.aspose.words.internal.zzG();

    public zzEM(zzD8 zzd8, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        this.zzZcH = zzd8.zzZHX().getLegend();
        this.zzZyQ = zzdi;
        this.zzZgO = zzDG.zzZ(zzzq4, zzZLx(), this.zzZyQ);
        this.zzZce = zzd8.zzZHX().zz45().zzZPl();
        this.zzZcf = zzEN.zzY(zzZLy(), this.zzZyQ);
        this.zzZcc = zzDG.zzV(zzZLy(), this.zzZyQ);
        this.zzZdW = zzDG.zzS(zzZLy(), this.zzZyQ);
        ChartLegend chartLegend = this.zzZcH;
        if (chartLegend != null) {
            for (ChartLegendEntry chartLegendEntry : chartLegend.getLegendEntries().zz2T()) {
                if (chartLegendEntry != null) {
                    this.zzZcf = Math.max(this.zzZcf, zzEN.zzY(chartLegendEntry.zzaR(), this.zzZyQ));
                    this.zzZcc = Math.max(this.zzZcc, zzDG.zzV(chartLegendEntry.zzaR(), this.zzZyQ));
                    this.zzZdW = Math.max(this.zzZdW, zzDG.zzS(chartLegendEntry.zzaR(), this.zzZyQ));
                }
            }
        }
        zzY(zzd8);
    }

    private boolean zz3v() {
        if (zzZLw()) {
            return zzZLx().zzZLi() || zzZLx().zzZLj();
        }
        return false;
    }

    private boolean zz40() {
        return (zz3v() || zzZLv()) ? false : true;
    }

    private double zzKR(int i) {
        ChartLegendEntry chartLegendEntryZzNS = this.zzZcH.zzNS(i);
        return (chartLegendEntryZzNS != null ? chartLegendEntryZzNS.zzaR() : zzZLy()).zzZHj().zzZvS().zzZsA();
    }

    private zzEQ zzKS(int i) {
        return this.zzZc4.get(this.zzZcb[i]);
    }

    private void zzX(zzD8 zzd8) throws Exception {
        float f = this.zzZdW * 1.8f;
        if (!zzZLw() || this.zzZgO.getHeight() >= f || this.zzZgO.getWidth() >= f) {
            Iterator<zzGK> it = zzd8.zzZHX().zz45().zzZJe().iterator();
            while (it.hasNext()) {
                it.next().zzZ(this, this.zzZyQ);
            }
            Iterator<zzGK> it2 = zzd8.zzZHX().zz45().zzZJe().iterator();
            while (it2.hasNext()) {
                it2.next().zzY(this, this.zzZyQ);
            }
            this.zzZcb = new int[this.zzZc4.size()];
            float fMax = 0.0f;
            for (int i = 0; i < this.zzZc4.size(); i++) {
                this.zzZc4.get(i).zzZ(this.zzZca, this.zzZc9, 0.0f, this.zzZcc, this.zzZyQ);
                fMax = Math.max(fMax, Float.intBitsToFloat((int) this.zzZc4.get(i).getSize()));
                this.zzZcb[i] = i;
            }
            if (this.zzZc4.size() > 0) {
                zzZh(fMax);
            }
        }
    }

    private void zzXS(boolean z) {
        float fZzZ;
        int i;
        if (zz3v() || this.zzZc3.size() <= 0) {
            boolean z2 = zz3v() && z;
            this.zzZc3.clear();
            this.zzZc7 = zz40() ? 1 : this.zzZc4.size();
            float fZzZLs = z2 ? zzZLs() * 0.55f : this.zzZdW / 4.4f;
            if (this.zzZc7 == 1 && !z2) {
                fZzZLs = Math.max(zzZLs() * 1.1f, this.zzZdW * 0.3f);
            }
            float[] fArrZzZLI = zzZLI();
            float width = z2 ? this.zzZgO.getWidth() : (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) * 0.9f) - (zzZLs() * 0.4f);
            if (zz40()) {
                fZzZ = 0.0f;
            } else {
                float fZzZ2 = zzZ(fArrZzZLI, fZzZLs, z2);
                while (fZzZ2 > width && (i = this.zzZc7) > 1) {
                    this.zzZc7 = i - 1;
                    fZzZ2 = zzZ(zzZLI(), fZzZLs, z2);
                }
                this.zzZc7 = (int) Math.ceil(((double) this.zzZc4.size()) / ((double) ((int) Math.ceil(((double) this.zzZc4.size()) / ((double) this.zzZc7)))));
                fArrZzZLI = zzZLI();
                fZzZ = zzZ(fArrZzZLI, fZzZLs, z2);
            }
            zzZ(fArrZzZLI, zzX(z2, fZzZ, width), fZzZLs, z2);
        }
    }

    private void zzY(zzD8 zzd8) throws Exception {
        if (this.zzZcH == null) {
            return;
        }
        zzX(zzd8);
        zzZLG();
        zzXS(true);
        zzZLH();
        zzZLF();
    }

    private void zzY7(int i, int i2) {
        while (i < i2) {
            int[] iArr = this.zzZcb;
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            i2--;
            i++;
        }
    }

    private com.aspose.words.internal.zzZQ4 zzZLE() {
        return zzZLw() ? new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), this.zzZgO.getSize()) : this.zzZc3.size() == 0 ? com.aspose.words.internal.zzZQ4.zz2T : new com.aspose.words.internal.zzZQ4(-Math.max((this.zzHi - Float.intBitsToFloat((int) this.zzZc3.get(0).getSize())) / 2.0f, 0.0f), 0.0f, this.zzHi, this.zzwo);
    }

    private void zzZLF() throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZLE = zzZLE();
        if (zzzq4ZzZLE.isEmpty()) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4ZzZLE);
        zzER zzerZzZMH = this.zzZyQ.zzZIC().zzZMH();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzerZzZMH.zzZMW().zzZPK();
        zzerZzZMH.zzZMW().zzZK(zzzq4ZzZLE);
        zzzgZzW.zzY(zzDG.zzZ(this.zzZcH.zzaQ(), zzerZzZMH, 0, zzzgZzW));
        zzzgZzW.zzX(zzDG.zzZ(this.zzZcH.zzaQ(), zzerZzZMH, 0));
        zzerZzZMH.zzZMW().zzZK(zzzq4ZzZPK);
        if (zzDG.zzz(zzzgZzW)) {
            zzDG.zzZ(zzzgZzW, this.zzZc6, this.zzZcH.zzaQ(), zzerZzZMH);
        }
        this.zzZc6.zzX((com.aspose.words.internal.zzZL) this.zzZc5);
    }

    private void zzZLG() throws Exception {
        int i = 0;
        zzXS(false);
        Iterator<zzEP> it = this.zzZc3.iterator();
        float f = 0.0f;
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, com.aspose.words.internal.zzZPW.zzYz(it.next().getSize()));
        }
        int iMin = Math.min(this.zzZc3.size(), Math.max((int) C21009OooOooO.OooO00o(zzZLs(), 2.0f, com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) / 3.0f, fMax), 1));
        float fZzU = zzDG.zzU(zzZLy(), this.zzZyQ);
        float fCeil = (float) Math.ceil(fMax / Math.max(fZzU, this.zzZdW));
        float fZzYC = com.aspose.words.internal.zzSA.zzYC(240);
        float fZzYC2 = com.aspose.words.internal.zzSA.zzYC(90);
        float fZzYC3 = com.aspose.words.internal.zzSA.zzYC(120);
        while (i < iMin) {
            f = i != 0 ? i != 1 ? f + fZzYC3 : f + fZzYC2 : f + fZzYC;
            i++;
        }
        this.zzZcg = (iMin * fCeil * 0.99f * fZzU) + f;
    }

    private void zzZLH() {
        if (this.zzZc3.size() == 0) {
            return;
        }
        float f = this.zzZcc / 2.0f;
        float fOooO0O0 = this.zzZyQ.zzZIC().zzZdM * 1.2f;
        float fMax = 0.0f;
        for (zzEP zzep : this.zzZc3) {
            this.zzHi = Math.max(this.zzHi, Float.intBitsToFloat((int) zzep.getSize()));
            fMax = Math.max(fMax, com.aspose.words.internal.zzZPW.zzYz(zzep.getSize()));
        }
        float f2 = zz40() ? fMax + fOooO0O0 : fMax;
        if (!zz40()) {
            if (fMax > this.zzZdW) {
                f *= 2.0f;
            }
            f2 -= f;
        }
        int iZzv = zzv(f2, fOooO0O0);
        if (zz3v()) {
            if (this.zzZgO.getHeight() < (this.zzZcc / 2.0f) + fMax) {
                fOooO0O0 = 0.0f;
            } else {
                float f3 = iZzv;
                fOooO0O0 = C20509OooO0oo.OooO0O0(fMax, f3, this.zzZgO.getHeight(), f3);
            }
            this.zzHi = this.zzZgO.getWidth();
            this.zzwo = this.zzZgO.getHeight();
        } else {
            float f4 = (fMax + fOooO0O0) * iZzv;
            if (f4 < this.zzZgO.getHeight()) {
                this.zzwo = f4;
            }
        }
        float f5 = 0.0f;
        for (int i = 0; i < iZzv; i++) {
            zzEP zzep2 = this.zzZc3.get(i);
            float f6 = fOooO0O0 / 2.0f;
            float f7 = f5 + f6;
            com.aspose.words.internal.OooO0O0.OooO00o(zzep2.zzZLL());
            zzep2.zzZLL().zzZO().zzY(0.0f, f7, 0);
            this.zzZc5.zzX((com.aspose.words.internal.zzZL) zzep2.zzZLL());
            f5 = f7 + f6 + fMax;
        }
    }

    private float[] zzZLI() {
        int i = this.zzZc7;
        float[] fArr = new float[i];
        int i2 = 0;
        if (i == this.zzZc4.size()) {
            while (i2 < this.zzZc4.size()) {
                fArr[i2] = Float.intBitsToFloat((int) zzKS(i2).getSize());
                i2++;
            }
        } else {
            float fMax = 0.0f;
            for (int i3 = 0; i3 < this.zzZc4.size(); i3++) {
                fMax = Math.max(fMax, Float.intBitsToFloat((int) zzKS(i3).getSize()));
            }
            while (i2 < this.zzZc7) {
                fArr[i2] = fMax;
                i2++;
            }
        }
        return fArr;
    }

    private void zzZLJ() {
        if (this.zzZc8) {
            return;
        }
        com.aspose.words.internal.OooO0O0.OooO00o(this.zzZc6);
        if (zzZLw()) {
            this.zzZc6.zzZO().zzY(this.zzZgO.getX(), this.zzZgO.getY(), 0);
        } else {
            int position = getPosition();
            if (position == 1) {
                this.zzZc6.zzZO().zzY(C20503OooO00o.OooO0O0(this.zzZgO.getWidth(), this.zzHi, 2.0f, this.zzZgO.getX()), (this.zzZgO.getHeight() + this.zzZgO.getY()) - this.zzwo, 0);
            } else if (position == 2) {
                this.zzZc6.zzZO().zzY((zzZLs() * 0.3f) + this.zzZgO.getX(), C20503OooO00o.OooO0O0(this.zzZgO.getHeight(), this.zzwo, 2.0f, this.zzZgO.getY()), 0);
            } else if (position == 3) {
                this.zzZc6.zzZO().zzY(((this.zzZgO.getWidth() + this.zzZgO.getX()) - (zzZLs() * 0.3f)) - this.zzHi, C20503OooO00o.OooO0O0(this.zzZgO.getHeight(), this.zzwo, 2.0f, this.zzZgO.getY()), 0);
            } else if (position == 4) {
                this.zzZc6.zzZO().zzY(C20503OooO00o.OooO0O0(this.zzZgO.getWidth(), this.zzHi, 2.0f, this.zzZgO.getX()), this.zzZgO.getY(), 0);
            } else if (position == 5) {
                this.zzZc6.zzZO().zzY(((this.zzZgO.getWidth() + this.zzZgO.getX()) - (zzZLs() * 0.3f)) - this.zzHi, this.zzZgO.getY(), 0);
            }
        }
        this.zzZc8 = true;
    }

    private float zzZLs() {
        return this.zzZyQ.zzZIC().zzZdM;
    }

    private float zzZLt() {
        if (zz3v()) {
            return (zzZLs() * 0.4f) + this.zzZgO.getHeight();
        }
        if (zz40()) {
            return C20504OooO0O0.OooO0O0(zzZLs(), 2.0f, this.zzZgO.getHeight(), 0.95f);
        }
        return C20855OooooOO.OooO00o(zzZLs(), 8.0f, 3.0f, this.zzZgO.getHeight() / 3.0f);
    }

    private float zzZLu() {
        if (zz3v()) {
            return (zzZLs() * 1.7f) + this.zzZgO.getWidth();
        }
        if (!zz40()) {
            return this.zzZgO.getWidth();
        }
        return (zzZLs() * 2.0f) + (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) / 3.0f);
    }

    private boolean zzZLv() {
        int position = this.zzZcH.getPosition();
        return position == 1 || position == 4;
    }

    private boolean zzZLw() {
        return zzZLx() != null;
    }

    private zzEH zzZLx() {
        ChartLegend chartLegend = this.zzZcH;
        if (chartLegend != null) {
            return chartLegend.zz3y();
        }
        return null;
    }

    private zzCL zzZLy() {
        ChartLegend chartLegend = this.zzZcH;
        return chartLegend != null ? chartLegend.zzaR() : new zzCL();
    }

    private void zzZh(float f) {
        if (zzZLv() && f >= Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) * 0.45f) {
            int i = 0;
            zzGK zzgkZz3I = zzKS(0).zz3I();
            int i2 = -1;
            int i3 = -1;
            while (i < this.zzZc4.size()) {
                zzGK zzgkZz3I2 = zzKS(i).zz3I();
                if (zzgkZz3I2 != zzgkZz3I && i2 != -1) {
                    zzY7(i2, i3);
                    i2 = -1;
                    i3 = -1;
                }
                if (zzgkZz3I2 != null && zzgkZz3I2.zzZQj()) {
                    if (i2 == -1) {
                        i2 = i;
                    }
                    i3 = i;
                }
                if (i == this.zzZc4.size() - 1 && i2 != -1) {
                    zzY7(i2, i3);
                }
                i++;
                zzgkZz3I = zzgkZz3I2;
            }
        }
    }

    private int zzv(float f, float f2) {
        int iMin = Math.min(Math.max(1, (int) (zzZLt() / f)), this.zzZc3.size());
        this.zzwo = iMin * f;
        if (iMin >= this.zzZc3.size()) {
            return iMin;
        }
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzZc3.get(iMin).getSize()) + this.zzwo + f2;
        if (!com.aspose.words.internal.zzAN.zzP(zzZLt(), fZzYz)) {
            return iMin;
        }
        int i = iMin + 1;
        this.zzwo = fZzYz;
        return i;
    }

    public final boolean getOverlay() {
        ChartLegend chartLegend = this.zzZcH;
        return chartLegend != null && chartLegend.getOverlay();
    }

    public final int getPosition() {
        ChartLegend chartLegend = this.zzZcH;
        if (chartLegend == null) {
            return 0;
        }
        return chartLegend.getPosition();
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final void zzZ(zzEO zzeo, String str) throws Exception {
        zzZ(zzeo, str, (zzGK) null);
    }

    public final com.aspose.words.internal.zzZQ4 zzZLA() {
        return this.zzZgO;
    }

    public final boolean zzZLB() {
        return this.zzZce;
    }

    public final float zzZLC() {
        return this.zzZcf;
    }

    public final float zzZLD() {
        return this.zzZcg;
    }

    public final double zzZLz() {
        return zzKR(this.zzZcd);
    }

    public final void zzZNw() {
        ChartLegend chartLegend = this.zzZcH;
        if (chartLegend == null || chartLegend.getPosition() == 0) {
            return;
        }
        zzZLJ();
        if (this.zzZc6.getCount() > 0) {
            this.zzZyQ.zzsD().zzX((com.aspose.words.internal.zzZL) this.zzZc6);
        }
    }

    private float zzZ(float[] fArr, float f, boolean z) {
        float f2 = 0.0f;
        for (float f3 : fArr) {
            f2 += f3 + f;
        }
        return (zzZLv() || !z) ? f2 : (this.zzZyQ.zzZIC().zzZdM * 0.5f) + f2;
    }

    private void zzZ(zzCL zzcl, String str, zzEO zzeo, zzGK zzgk) throws Exception {
        float fZzZLu = zzZLu() - zzeo.getWidth();
        com.aspose.words.internal.zzZQG.zzZ(this.zzZc4, zzEQ.zzZ(zzZ(zzcl, str, fZzZLu), new zzCV(zzcl, new zzD9(), this.zzZyQ.zzZIC().zzZMQ().zzZM7(), this.zzZyQ.zzZIC().zzZMQ().zzZM4(), this.zzZyQ.zzZIC().zzZMH(), zzZLu() - zzeo.getWidth()), zzeo, this.zzZdW, this.zzZyQ, zzgk));
    }

    private String zzZ(zzCL zzcl, String str, float f) throws Exception {
        float fZzX = zzDG.zzX(str, zzcl, this.zzZyQ);
        if ("#REF!".equals(str) || f >= fZzX) {
            return str;
        }
        float fZzZ = zzDG.zzZ("...", zzcl, this.zzZyQ);
        int length = str.length() - 1;
        String strSubstring = str.substring(0, length);
        while (zzDG.zzX(strSubstring, zzcl, this.zzZyQ) + fZzZ > f && length > 1) {
            length--;
            strSubstring = str.substring(0, length);
        }
        return com.aspose.words.internal.zzZKN.format("{0}...", strSubstring);
    }

    public final void zzZ(zzEO zzeo, String str, zzGK zzgk) throws Exception {
        ChartLegendEntry chartLegendEntryZzNS = this.zzZcH.zzNS(this.zzZcd);
        this.zzZcd++;
        if (chartLegendEntryZzNS == null || !chartLegendEntryZzNS.isHidden()) {
            zzZ(chartLegendEntryZzNS != null ? chartLegendEntryZzNS.zzaR() : zzZLy(), str, zzeo, zzgk);
            this.zzZca = Math.max(this.zzZca, zzeo.getWidth());
            this.zzZc9 = Math.max(this.zzZc9, zzeo.getHeight());
        }
    }

    private float zzX(boolean z, float f, float f2) {
        if (zzZLw()) {
            if (z) {
                return (this.zzZgO.getWidth() - f) / (this.zzZc7 + 1);
            }
            return 0.0f;
        }
        int i = this.zzZc7;
        if (i == 1) {
            return zzZLs() * 0.75f;
        }
        if (i == this.zzZc4.size()) {
            return Math.min(this.zzZdW * 0.75f, (f2 - f) / (this.zzZc7 + 1));
        }
        return 0.0f;
    }

    private void zzZ(float[] fArr, float f, float f2, boolean z) {
        int i;
        int length = 0;
        while (length < this.zzZc4.size()) {
            float size = this.zzZdW * (this.zzZc3.size() + 1) * 0.85223f;
            if (z && this.zzZgO.getHeight() < size && length > 0) {
                return;
            }
            zzEP zzep = new zzEP();
            com.aspose.words.internal.zzZQG.zzZ(this.zzZc3, zzep);
            if (!zz40()) {
                zzep.zzZl(f);
            }
            for (int i2 = 0; i2 < fArr.length && (i = length + i2) < this.zzZc4.size(); i2++) {
                zzep.zzZl(f2);
                zzEQ zzeqZzKS = zzKS(i);
                zzep.zzY(zzeqZzKS.zzZLM(), com.aspose.words.internal.zzZPW.zzG(fArr[i2] + f, com.aspose.words.internal.zzZPW.zzYz(zzeqZzKS.getSize())));
            }
            length += fArr.length;
        }
    }
}

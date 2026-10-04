package com.aspose.words;

import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class Border extends InternableComplexAttr implements zzZCY, Cloneable {
    static Border zzZCe = new Border();
    private static com.aspose.words.internal.zzD3<float[]> zzZCf;
    private static com.aspose.words.internal.zzD3<float[]> zzZCg;
    private int zzEc;
    private boolean zzZCh;
    private String zzZCi;
    private String zzZCj;
    private String zzZCk;
    private boolean zzZCl;
    private boolean zzZCm;
    private int zzZCn;
    private int zzZCo;
    private int zzZCp;
    private zzZD6 zzZCq;
    private com.aspose.words.internal.zzPV zzZf;

    static {
        com.aspose.words.internal.zzD3<float[]> zzd3 = new com.aspose.words.internal.zzD3<>();
        zzZCg = zzd3;
        zzd3.add(6, new float[]{1.0f, 1.0f});
        zzZCg.add(22, new float[]{4.0f, 1.0f});
        zzZCg.add(7, new float[]{4.0f, 4.0f});
        zzZCg.add(8, new float[]{7.0f, 3.0f, 3.0f, 3.0f});
        zzZCg.add(9, new float[]{6.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f});
        com.aspose.words.internal.zzD3<float[]> zzd32 = new com.aspose.words.internal.zzD3<>();
        zzZCf = zzd32;
        zzd32.add(3, new float[]{1.0f, 1.0f, 1.0f});
        zzZCf.add(10, new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f});
        zzZCf.add(11, new float[]{1.0f, -0.75f, -0.75f});
        zzZCf.add(12, new float[]{-0.75f, -0.75f, 1.0f});
        zzZCf.add(14, new float[]{1.0f, 0.5f, 0.5f});
        zzZCf.add(15, new float[]{0.5f, 0.5f, 1.0f});
        zzZCf.add(17, new float[]{-1.5f, 1.0f, -0.75f});
        zzZCf.add(18, new float[]{-0.75f, 1.0f, -1.5f});
        zzZCf.add(13, new float[]{-0.75f, -0.75f, 1.0f, -0.75f, -0.75f});
        zzZCf.add(16, new float[]{0.5f, 0.5f, 1.0f, 0.5f, 0.5f});
        zzZCf.add(19, new float[]{-0.75f, 1.0f, -1.5f, 1.0f, -0.75f});
        zzZCf.add(24, new float[]{0.25f, 0.0f, 1.0f, 0.0f, 0.25f});
        zzZCf.add(25, new float[]{0.25f, 0.0f, 1.0f, 0.0f, 0.25f});
    }

    public Border() {
        this.zzZf = com.aspose.words.internal.zzPV.zzHZ;
        clearFormatting();
    }

    private int getWeight() {
        if (getLineStyle() == 6 || getLineStyle() == 7) {
            return 1;
        }
        return zzOP(getLineStyle()) * this.zzZCo;
    }

    private int zz8C() {
        return com.aspose.words.internal.zzZQ1.zzZZ(getColor()) & 255;
    }

    private int zz8D() {
        return ((com.aspose.words.internal.zzZQ1.zzZZ(getColor()) & 255) * 2) + (com.aspose.words.internal.zzZQ1.zzZY(getColor()) & 255);
    }

    private int zz8E() {
        return ((com.aspose.words.internal.zzZQ1.zzZZ(getColor()) & 255) * 2) + (com.aspose.words.internal.zzZQ1.zz0(getColor()) & 255) + (com.aspose.words.internal.zzZQ1.zzZY(getColor()) & 255);
    }

    public static Border zz8G() {
        Border border = new Border();
        border.zzZCh = true;
        return border;
    }

    private Border zz8I() {
        return (Border) this.zzZCq.fetchInheritedBorderAttr(this.zzEc);
    }

    private static int zzOP(int i) {
        switch (i) {
        }
        return 1;
    }

    private static int zzOQ(int i) {
        float[] fArr = zzZCf.get(i);
        if (fArr == null) {
            return 1;
        }
        return fArr.length;
    }

    public static float[] zzOR(int i) {
        float[] fArr = zzZCg.get(i);
        if (fArr == null) {
            return null;
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = fArr2[i2] * 1.0f;
        }
        return fArr2;
    }

    private static int zzOS(int i) {
        if (i == 11) {
            return 12;
        }
        if (i != 14) {
            return i != 17 ? 0 : 18;
        }
        return 15;
    }

    public static float zzT(int i, float f) {
        float f2;
        float f3 = 0.0f;
        if (i == 0) {
            return 0.0f;
        }
        if (i == 5 || i == 2) {
            return 0.75f;
        }
        if (i != 3 && i != 24 && i != 25) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 20:
                    f2 = 2.5f;
                    break;
                case 21:
                    f2 = 6.75f;
                    break;
                default:
                    return f;
            }
            return f * f2;
        }
        for (float f4 : zzU(i, f)) {
            f3 += f4;
        }
        return f3;
    }

    public static float[] zzU(int i, float f) {
        float[] fArr = zzZCf.get(i);
        if (fArr == null) {
            return new float[]{f};
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr2[i2];
            if (f2 >= 0.0f) {
                fArr2[i2] = f2 * f;
            } else {
                fArr2[i2] = Math.abs(f2);
            }
        }
        return fArr2;
    }

    public static Border zzV(Border border) {
        border.clearFormatting();
        border.zzZCh = true;
        return border;
    }

    public static boolean zzX(int i, float f, float f2) {
        return (i != 0 && f > 0.0f) || f2 > 0.0f;
    }

    private void zzY(double d, boolean z) {
        double d2 = 0.0d;
        if (d >= 0.0d) {
            d2 = 31.0d;
            if (d > 31.0d) {
                if (z) {
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: distanceFromText");
                }
            }
            zzbp();
            this.zzZCn = (int) d;
        }
        if (z) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: distanceFromText");
        }
        d = d2;
        zzbp();
        this.zzZCn = (int) d;
    }

    private static boolean zzYC(int i, int i2) {
        int iZzOS = zzOS(i);
        if (iZzOS != 0 && iZzOS == i2) {
            return true;
        }
        int iZzOS2 = zzOS(i2);
        return iZzOS2 != 0 && iZzOS2 == i;
    }

    private void zzZ(double d, boolean z) {
        double dZzR = com.aspose.words.internal.zzAN.zzR(d, 0.0d, 31.0d);
        if (dZzR == d || !z) {
            zzbp();
            this.zzZCo = zz8T() ? com.aspose.words.internal.zzAN.zzZG(dZzR) : com.aspose.words.internal.zzSA.zzs(dZzR);
        } else {
            throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Must be non-negative and less than or equal to {0}.", 31) + "\r\nParameter name: lineWidth");
        }
    }

    private void zzbp() {
        notifyChanging();
        if (isInherited()) {
            zzW(zz8I());
            this.zzZCq = null;
        }
    }

    public void clearFormatting() {
        zzbp();
        this.zzZCq = null;
        this.zzZCp = 0;
        this.zzZCo = 0;
        this.zzZf = com.aspose.words.internal.zzPV.zzHZ;
        this.zzZCn = 0;
        this.zzZCm = false;
        this.zzZCl = false;
        this.zzZCk = null;
        this.zzZCj = null;
        this.zzZCi = null;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public zzZCY deepCloneComplexAttr() {
        return zz8H();
    }

    public boolean equals(Border border) {
        try {
            if (com.aspose.words.internal.zzZKO.zzA(null, border)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(this, border)) {
                return true;
            }
            if (getLineStyle() == border.getLineStyle() && getLineWidth() == border.getLineWidth() && zz8Q().equals(border.zz8Q()) && getDistanceFromText() == border.getDistanceFromText() && zz8P() == border.zz8P() && getShadow() == border.getShadow() && com.aspose.words.internal.zzZKN.equals(this.zzZCk, border.zzZCk) && com.aspose.words.internal.zzZKN.equals(this.zzZCj, border.zzZCj) && com.aspose.words.internal.zzZKN.equals(this.zzZCi, border.zzZCi)) {
                if (this.zzZCh == border.zzZCh) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getColor() {
        return zz8Q().zzPG();
    }

    public double getDistanceFromText() {
        return isInherited() ? zz8I().getDistanceFromText() : this.zzZCn;
    }

    public int getLineStyle() {
        return isInherited() ? zz8I().getLineStyle() : this.zzZCp;
    }

    public double getLineWidth() {
        return isInherited() ? zz8I().getLineWidth() : zz8T() ? this.zzZCo : ((double) this.zzZCo) / 8.0d;
    }

    public boolean getShadow() {
        return isInherited() ? zz8I().getShadow() : this.zzZCm;
    }

    public int getThemeColor() {
        return zzY5L.zzAg(this.zzZCk);
    }

    public double getTintAndShade() {
        double dZzZe;
        double d;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzZCi)) {
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(this.zzZCi)) / 255.0d;
            d = 1.0d;
        } else {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZCj)) {
                return 0.0d;
            }
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(this.zzZCj)) / (-255.0d);
            d = -1.0d;
        }
        return d - dZzZe;
    }

    public int hashCode() {
        int i = ((this.zzZCp * 397) ^ this.zzZCo) * 397;
        com.aspose.words.internal.zzPV zzpv = this.zzZf;
        int iHashCode = (((((((i ^ (zzpv != null ? zzpv.hashCode() : 0)) * 397) ^ this.zzZCn) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZCm)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZCl)) * 397;
        String str = this.zzZCk;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.zzZCj;
        int iHashCode3 = (iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 397;
        String str3 = this.zzZCi;
        return ((iHashCode3 ^ (str3 != null ? str3.hashCode() : 0)) * 397) ^ (this.zzZCh ? 1 : 0);
    }

    public final boolean isInherited() {
        return this.zzZCq != null;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return isInherited();
    }

    public boolean isVisible() {
        return getLineStyle() != 0;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setColor(int i) {
        zzm(com.aspose.words.internal.zzPV.zzYR(i));
        this.zzZCk = null;
        this.zzZCj = null;
        this.zzZCi = null;
    }

    public void setDistanceFromText(double d) {
        zzY(d, true);
    }

    public void setLineStyle(int i) {
        zzOV(i);
        if (i != 0 && com.aspose.words.internal.zzAN.zzZD(getLineWidth())) {
            setLineWidth(0.25d);
        }
        this.zzZCh = this.zzZCp == 0;
    }

    public void setLineWidth(double d) {
        zzZ(d, true);
        zz8V();
    }

    public void setShadow(boolean z) {
        zzbp();
        this.zzZCm = z;
    }

    public void setThemeColor(int i) {
        this.zzZCk = zzY5L.toString(i);
        this.zzZf = com.aspose.words.internal.zzPV.zzHZ;
    }

    public void setTintAndShade(double d) {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZCk)) {
            throw new IllegalStateException("TintAndShade cannot be applied to a non-theme color.");
        }
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "TintAndShade");
        this.zzZCi = null;
        this.zzZCj = null;
        if (d > 0.0d) {
            this.zzZCi = com.aspose.words.internal.zzJB.zzWw((int) ((1.0d - d) * 255.0d));
        }
        if (d < 0.0d) {
            this.zzZCj = com.aspose.words.internal.zzJB.zzWw((int) (((-1.0d) - d) * (-255.0d)));
        }
    }

    public final boolean zz8B() {
        return getLineStyle() >= 0 && getLineStyle() <= 27;
    }

    public final boolean zz8F() {
        return this.zzZCh;
    }

    public final Border zz8H() {
        if (isInherited()) {
            throw new IllegalStateException("Cannot clone an inherited attribute.");
        }
        return (Border) memberwiseClone();
    }

    public final int zz8J() {
        return zzOQ(getLineStyle());
    }

    public final int zz8K() {
        return this.zzZCn;
    }

    public final int zz8L() {
        return this.zzZCo;
    }

    public final String zz8M() {
        return this.zzZCi;
    }

    public final String zz8N() {
        return this.zzZCj;
    }

    public final String zz8O() {
        return this.zzZCk;
    }

    public final boolean zz8P() {
        Border borderZz8I = this;
        while (borderZz8I.isInherited()) {
            borderZz8I = borderZz8I.zz8I();
        }
        return borderZz8I.zzZCl;
    }

    public final com.aspose.words.internal.zzPV zz8Q() {
        Border borderZz8I = this;
        while (borderZz8I.isInherited()) {
            borderZz8I = borderZz8I.zz8I();
        }
        return borderZz8I.zzZf;
    }

    public final float zz8R() {
        if (!isVisible()) {
            return 0.0f;
        }
        float fZz8S = zz8S();
        if (getShadow()) {
            fZz8S *= 2.0f;
        }
        return fZz8S + ((float) getDistanceFromText());
    }

    public final float zz8S() {
        return zzT(getLineStyle(), (float) zz8U());
    }

    public final boolean zz8T() {
        return getLineStyle() >= 64;
    }

    public final double zz8U() {
        double lineWidth = getLineWidth();
        if (lineWidth == 0.0d && isVisible()) {
            return 0.25d;
        }
        return lineWidth;
    }

    public final void zz8V() {
        if (getLineWidth() <= 0.0d || getLineStyle() != 0) {
            return;
        }
        zzOV(1);
    }

    public final void zzOT(int i) {
        this.zzZCn = i;
    }

    public final void zzOU(int i) {
        this.zzZCo = i;
    }

    public final void zzOV(int i) {
        zzbp();
        this.zzZCp = i;
        if (i == 0) {
            setLineWidth(0.0d);
        }
        this.zzZCh = false;
    }

    public final void zzTd(String str) {
        this.zzZCi = str;
    }

    public final void zzTe(String str) {
        this.zzZCj = str;
    }

    public final void zzTf(String str) {
        this.zzZCk = str;
    }

    public final void zzW(Border border) {
        if (border == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: src");
        }
        this.zzEc = border.zzEc;
        this.zzZCp = border.getLineStyle();
        this.zzZCo = border.zzZCo;
        this.zzZf = border.zz8Q();
        this.zzZCn = border.zzZCn;
        this.zzZCm = border.getShadow();
        this.zzZCl = border.zz8P();
        this.zzZCk = border.zzZCk;
        this.zzZCj = border.zzZCj;
        this.zzZCi = border.zzZCi;
        this.zzZCh = border.zzZCh;
        this.zzZCq = border.zzZCq;
    }

    public final void zzYN(boolean z) {
        this.zzZCh = z;
    }

    public final void zzYO(boolean z) {
        zzbp();
        this.zzZCl = z;
    }

    public final void zzZ4(double d) {
        zzY(d, false);
    }

    public final void zzZ5(double d) {
        zzZ(d, false);
    }

    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        zzbp();
        this.zzZf = zzpv;
    }

    private boolean zzX(Border border) {
        return zzYC(getLineStyle(), border.getLineStyle());
    }

    public Border(int i, int i2, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzPV zzpv2 = com.aspose.words.internal.zzPV.zzKh;
        this.zzZCp = i;
        this.zzZCo = i2;
        this.zzZf = zzpv;
    }

    public final boolean zzY(Border border) {
        return isVisible() && equals(border);
    }

    public final boolean zzZ(Border border, RefBoolean refBoolean) {
        if (isVisible() && zzOQ(getLineStyle()) != 1) {
            refBoolean.set(zzX(border));
            return (getLineStyle() == border.getLineStyle() || refBoolean.get()) && getLineWidth() == border.getLineWidth() && zz8P() == border.zz8P();
        }
        refBoolean.set(false);
        return false;
    }

    public Border(zzZD6 zzzd6, int i) {
        this.zzZf = com.aspose.words.internal.zzPV.zzHZ;
        this.zzZCq = zzzd6;
        this.zzEc = i;
    }

    public static Border zzZ(Border border, Border border2) {
        int iZzOP;
        int iZzOP2;
        int iZz8E;
        int iZz8E2;
        int iZz8D;
        int iZz8D2;
        return border == null ? border2 : (border2 != null && (border.getWeight() == border2.getWeight() ? (iZzOP = zzOP(border.getLineStyle())) == (iZzOP2 = zzOP(border2.getLineStyle())) ? (iZz8E = border.zz8E()) == (iZz8E2 = border2.zz8E()) ? (iZz8D = border.zz8D()) == (iZz8D2 = border2.zz8D()) ? border.zz8C() > border2.zz8C() : iZz8D >= iZz8D2 : iZz8E >= iZz8E2 : iZzOP <= iZzOP2 : border.getWeight() <= border2.getWeight())) ? border2 : border;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != Border.class) {
            return false;
        }
        return equals((Border) obj);
    }

    public final void zzZ(zzZD6 zzzd6) {
        this.zzZCq = zzzd6;
    }
}

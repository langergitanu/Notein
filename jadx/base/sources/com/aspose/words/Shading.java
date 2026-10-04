package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Shading extends InternableComplexAttr implements zzZCY, Cloneable {
    private int zzEc;
    private com.aspose.words.internal.zzPV zzXnA;
    private com.aspose.words.internal.zzPV zzXnB;
    private zzZ9C zzXnC;
    private String zzXnx;
    private String zzXny;
    private String zzXnz;
    private int zzY7D;
    private String zzZCi;
    private String zzZCj;
    private String zzZCk;

    public Shading() {
        clearFormatting();
    }

    private void zzO(Shading shading) {
        if (shading == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: src");
        }
        this.zzXnC = shading.zzXnC;
        this.zzEc = shading.zzEc;
        this.zzY7D = shading.getTexture();
        this.zzXnB = shading.zzYbJ();
        this.zzXnA = shading.zzYbK();
        this.zzZCk = shading.zzZCk;
        this.zzZCj = shading.zzZCj;
        this.zzZCi = shading.zzZCi;
        this.zzXnz = shading.zzXnz;
        this.zzXny = shading.zzXny;
        this.zzXnx = shading.zzXnx;
    }

    private Shading zzYbD() {
        return (Shading) this.zzXnC.fetchInheritedShadingAttr(this.zzEc);
    }

    private void zzbp() {
        notifyChanging();
        if (isInherited()) {
            zzO(zzYbD());
            this.zzXnC = null;
        }
    }

    public void clearFormatting() {
        this.zzXnC = null;
        this.zzY7D = 0;
        com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
        this.zzXnB = zzpv;
        this.zzXnA = zzpv;
        this.zzZCk = null;
        this.zzZCj = null;
        this.zzZCi = null;
        this.zzXnz = null;
        this.zzXny = null;
        this.zzXnx = null;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public zzZCY deepCloneComplexAttr() {
        if (isInherited()) {
            throw new IllegalStateException("Cannot clone an inherited attribute.");
        }
        return (Shading) memberwiseClone();
    }

    public boolean equals(Shading shading) {
        try {
            if (com.aspose.words.internal.zzZKO.zzA(null, shading)) {
                return false;
            }
            if (com.aspose.words.internal.zzZKO.zzA(this, shading)) {
                return true;
            }
            if (getTexture() == shading.getTexture() && com.aspose.words.internal.zzPV.zzZ(zzYbJ(), shading.zzYbJ()) && com.aspose.words.internal.zzPV.zzZ(zzYbK(), shading.zzYbK()) && com.aspose.words.internal.zzZKN.equals(this.zzZCk, shading.zzZCk) && com.aspose.words.internal.zzZKN.equals(this.zzZCj, shading.zzZCj) && com.aspose.words.internal.zzZKN.equals(this.zzZCi, shading.zzZCi) && com.aspose.words.internal.zzZKN.equals(this.zzXnz, shading.zzXnz) && com.aspose.words.internal.zzZKN.equals(this.zzXny, shading.zzXny)) {
                if (com.aspose.words.internal.zzZKN.equals(this.zzXnx, shading.zzXnx)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getBackgroundPatternColor() {
        return zzYbK().zzPG();
    }

    public int getBackgroundPatternThemeColor() {
        return zzY5L.zzAg(this.zzXnz);
    }

    public double getBackgroundTintAndShade() {
        double dZzZe;
        double d;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXnx)) {
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(this.zzXnx)) / 255.0d;
            d = 1.0d;
        } else {
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXny)) {
                return 0.0d;
            }
            dZzZe = ((double) com.aspose.words.internal.zzJB.zzZe(this.zzXny)) / (-255.0d);
            d = -1.0d;
        }
        return d - dZzZe;
    }

    public int getForegroundPatternColor() {
        return zzYbJ().zzPG();
    }

    public int getForegroundPatternThemeColor() {
        return zzY5L.zzAg(this.zzZCk);
    }

    public double getForegroundTintAndShade() {
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

    public int getTexture() {
        return isInherited() ? zzYbD().getTexture() : this.zzY7D;
    }

    public int hashCode() {
        int i = this.zzY7D * 397;
        com.aspose.words.internal.zzPV zzpv = this.zzXnB;
        int iHashCode = (i ^ (zzpv != null ? zzpv.hashCode() : 0)) * 397;
        com.aspose.words.internal.zzPV zzpv2 = this.zzXnA;
        int iHashCode2 = (iHashCode ^ (zzpv2 != null ? zzpv2.hashCode() : 0)) * 397;
        String str = this.zzZCk;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.zzZCj;
        int iHashCode4 = (iHashCode3 ^ (str2 != null ? str2.hashCode() : 0)) * 397;
        String str3 = this.zzZCi;
        int iHashCode5 = (iHashCode4 ^ (str3 != null ? str3.hashCode() : 0)) * 397;
        String str4 = this.zzXnz;
        int iHashCode6 = (iHashCode5 ^ (str4 != null ? str4.hashCode() : 0)) * 397;
        String str5 = this.zzXny;
        int iHashCode7 = (iHashCode6 ^ (str5 != null ? str5.hashCode() : 0)) * 397;
        String str6 = this.zzXnx;
        return iHashCode7 ^ (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isInherited() {
        return this.zzXnC != null;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return isInherited();
    }

    public final boolean isVisible() {
        if (getTexture() != 65535) {
            return (getTexture() == 0 && zzYbK().isEmpty()) ? false : true;
        }
        return false;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setBackgroundPatternColor(int i) {
        zzZK(com.aspose.words.internal.zzPV.zzYR(i));
        this.zzXnz = null;
        this.zzXny = null;
        this.zzXnx = null;
    }

    public void setBackgroundPatternThemeColor(int i) {
        this.zzXnz = zzY5L.toString(i);
        this.zzXnA = com.aspose.words.internal.zzPV.zzHZ;
    }

    public void setBackgroundTintAndShade(double d) {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXnz)) {
            throw new IllegalStateException("BackgroundTintAndShade cannot be applied to a non-theme color.");
        }
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "BackgroundTintAndShade");
        this.zzXnx = null;
        this.zzXny = null;
        if (d > 0.0d) {
            this.zzXnx = com.aspose.words.internal.zzJB.zzWw((int) ((1.0d - d) * 255.0d));
        }
        if (d < 0.0d) {
            this.zzXny = com.aspose.words.internal.zzJB.zzWw((int) (((-1.0d) - d) * (-255.0d)));
        }
    }

    public void setForegroundPatternColor(int i) {
        zzZJ(com.aspose.words.internal.zzPV.zzYR(i));
        this.zzZCk = null;
        this.zzZCj = null;
        this.zzZCi = null;
    }

    public void setForegroundPatternThemeColor(int i) {
        this.zzZCk = zzY5L.toString(i);
        this.zzXnB = com.aspose.words.internal.zzPV.zzHZ;
    }

    public void setForegroundTintAndShade(double d) {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZCk)) {
            throw new IllegalStateException("ForegroundTintAndShade cannot be applied to a non-theme color.");
        }
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "ForegroundTintAndShade");
        this.zzZCi = null;
        this.zzZCj = null;
        if (d > 0.0d) {
            this.zzZCi = com.aspose.words.internal.zzJB.zzWw((int) ((1.0d - d) * 255.0d));
        }
        if (d < 0.0d) {
            this.zzZCj = com.aspose.words.internal.zzJB.zzWw((int) (((-1.0d) - d) * (-255.0d)));
        }
    }

    public void setTexture(int i) {
        zzbp();
        this.zzY7D = i;
    }

    public final String zz8M() {
        return this.zzZCi;
    }

    public final String zz8N() {
        return this.zzZCj;
    }

    public final void zzB8(String str) {
        this.zzXnx = str;
    }

    public final void zzB9(String str) {
        this.zzXny = str;
    }

    public final void zzBa(String str) {
        this.zzXnz = str;
    }

    public final void zzBb(String str) {
        this.zzZCk = str;
    }

    public final void zzTd(String str) {
        this.zzZCi = str;
    }

    public final void zzTe(String str) {
        this.zzZCj = str;
    }

    public final Shading zzYbE() {
        if (isInherited()) {
            throw new IllegalStateException("Cannot clone an inherited attribute.");
        }
        return (Shading) memberwiseClone();
    }

    public final String zzYbF() {
        return this.zzXnx;
    }

    public final String zzYbG() {
        return this.zzXny;
    }

    public final String zzYbH() {
        return this.zzXnz;
    }

    public final String zzYbI() {
        return this.zzZCk;
    }

    public final com.aspose.words.internal.zzPV zzYbJ() {
        Shading shadingZzYbD = this;
        while (shadingZzYbD.isInherited()) {
            shadingZzYbD = shadingZzYbD.zzYbD();
        }
        return shadingZzYbD.zzXnB;
    }

    public final com.aspose.words.internal.zzPV zzYbK() {
        Shading shadingZzYbD = this;
        while (shadingZzYbD.isInherited()) {
            shadingZzYbD = shadingZzYbD.zzYbD();
        }
        return shadingZzYbD.zzXnA;
    }

    public final void zzZJ(com.aspose.words.internal.zzPV zzpv) {
        zzbp();
        this.zzXnB = zzpv;
    }

    public final void zzZK(com.aspose.words.internal.zzPV zzpv) {
        zzbp();
        this.zzXnA = zzpv;
    }

    public Shading(zzZ9C zzz9c, int i) {
        this.zzXnC = zzz9c;
        this.zzEc = i;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != Shading.class) {
            return false;
        }
        return equals((Shading) obj);
    }
}

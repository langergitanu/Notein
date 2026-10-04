package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ListLevel implements zzZ9G, Cloneable {
    private int zzPm;
    private int zzUG;
    private ListLevel zzYbZ;
    private zzZ9G zzYc0;
    private boolean zzYc2;
    private boolean zzYc3;
    private int zzYc4;
    private int zzYc5;
    private boolean zzYc6;
    private int zzYc7;
    private int zzYc8;
    private boolean zzYc9;
    private int zzYcb;
    boolean zzYcc;
    private DocumentBase zzZCL;
    private Font zzZEt;
    private int zzYXS = 1;
    private String zzYca = "";
    private String zzYuN = "";
    private zzYMX zzZsQ = new zzYMX();
    private zzYEF zzZsP = new zzYEF();
    private int zzYnm = -1;
    private int zzYc1 = StyleIdentifier.NIL;

    public ListLevel(DocumentBase documentBase, int i) {
        this.zzZCL = documentBase;
        this.zzYcb = zzx6(i);
        this.zzYc8 = i - 1;
    }

    public static String getEffectiveValue(int i, int i2, String str) {
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Specified argument must be in the range from {0} to {1}.", 1, 32767) + "\r\nParameter name: index\r\nParameter value: " + i);
        }
        if (com.aspose.words.internal.zzZKN.zzU3(str) && i2 == 65280) {
            throw new IllegalArgumentException("Specified argument must not be null or empty if the number style is custom.\r\nParameter name: customNumberStyleFormat");
        }
        if (com.aspose.words.internal.zzZKN.zzU3(str) || i2 == 65280) {
            return zzYTW.zzZ(i, i2, str, true);
        }
        throw new IllegalArgumentException("For this number style, the specified argument must be null or empty.\r\nParameter name: customNumberStyleFormat");
    }

    private static boolean zzJ5(String str) {
        return str != null && str.length() <= 31;
    }

    private static boolean zzJ6(String str) {
        return str != null && str.indexOf(65535) < 0;
    }

    private static boolean zzJ7(String str) {
        return zzJ5(str) && zzJ6(str);
    }

    private boolean zzV(ListLevel listLevel) {
        return getNumberStyle() == listLevel.getNumberStyle() && com.aspose.words.internal.zzZKN.equals(getNumberFormat(), listLevel.getNumberFormat()) && getAlignment() == listLevel.getAlignment() && zzYOd() == listLevel.zzYOd() && isLegal() == listLevel.isLegal() && getRestartAfterLevel() == listLevel.getRestartAfterLevel() && zzYO9() == listLevel.zzYO9() && getTrailingCharacter() == listLevel.getTrailingCharacter() && zzYO4().zzYnm == listLevel.zzYO4().zzYnm && zzZ0P() == listLevel.zzZ0P() && zzYO4().zzYcb == listLevel.zzYO4().zzYcb && com.aspose.words.internal.zzAN.zzL(getTabPosition(), listLevel.getTabPosition()) && com.aspose.words.internal.zzAN.zzL(getNumberPosition(), listLevel.getNumberPosition()) && com.aspose.words.internal.zzAN.zzL(getTextPosition(), listLevel.getTextPosition());
    }

    public static boolean zzYF(char c) {
        return c >= 0 && c <= '\b';
    }

    private ListLevel zzYO4() {
        ListLevel listLevel = this.zzYbZ;
        return listLevel != null ? listLevel : this;
    }

    public static boolean zzZA(String str, int i) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if ("\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b".indexOf(str.charAt(i2)) > i) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzx3(int i) {
        return i >= 0 && i <= 2;
    }

    public static boolean zzx4(int i) {
        return i >= 0 && i <= 2;
    }

    public static boolean zzx5(int i) {
        return (i >= 0 && i <= 59) || i == 255 || i == 65280;
    }

    public static int zzx6(int i) {
        if (zzx7(i)) {
            return i;
        }
        return 0;
    }

    public static boolean zzx7(int i) {
        return i >= 0 && i < 9;
    }

    public static boolean zzx8(int i) {
        return i >= -1 && i < 9;
    }

    public static boolean zzx9(int i) {
        return i >= 0 && i <= 32767;
    }

    public static boolean zzxa(int i) {
        return i >= -31680 && i <= 31680;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        zzYO4().zzZsP.clear();
    }

    public void createPictureBullet() throws Exception {
        Shape shape = new Shape(this.zzZCL, 75);
        this.zzZCL.getLists().zzo(shape);
        zzzp(this.zzZCL.getLists().zzYP0() - 1);
        setNumberStyle(23);
        setNumberFormat("\uf0b7");
        shape.getImageData().zzZ1(com.aspose.words.internal.zzEF.zzDM());
    }

    public void deletePictureBullet() {
        if (zzYOb()) {
            zzzp(-1);
            setNumberStyle(23);
            setNumberFormat("\uf0b7");
            zzYO4().zzZsP.setName("Symbol");
        }
    }

    public boolean equals(ListLevel listLevel) {
        return zzZ(listLevel, new com.aspose.words.internal.zzIM<>());
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return this.zzYc0 == null ? zzYEF.zzne(i) : ((i == 60 || i == 70) && getNumberStyle() == 23) ? zzYEF.zzne(i) : zzZ7R.zzZ(this.zzYc0, i, 0);
    }

    public int getAlignment() {
        return zzYO4().zzUG;
    }

    public String getCustomNumberStyleFormat() {
        return zzYOe();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return getDirectRunAttr(i, 0);
    }

    public Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(this, this.zzZCL);
        }
        return this.zzZEt;
    }

    public ImageData getImageData() {
        if (zzZ0P() != null) {
            return zzZ0P().getImageData();
        }
        return null;
    }

    public final boolean getLegacy() {
        return zzYO4().zzYc6;
    }

    public Style getLinkedStyle() {
        if (zzYO4().zzYc1 == 12287) {
            return null;
        }
        return this.zzZCL.getStyles().zzZ8(zzYO4().zzYc1, true);
    }

    public String getNumberFormat() {
        return zzYO4().zzYuN;
    }

    public double getNumberPosition() {
        return ((double) (zzYO4().zzZsQ.zzYM7() + zzYO4().zzZsQ.zzYMa())) / 20.0d;
    }

    public int getNumberStyle() {
        return zzYO4().zzPm;
    }

    public int getRestartAfterLevel() {
        return zzYO4().zzYc8;
    }

    public int getStartAt() {
        return zzYO4().zzYXS;
    }

    public double getTabPosition() {
        if (zzYO4().zzZsQ.getTabStops() == null || zzYO4().zzZsQ.getTabStops().getCount() <= 0) {
            return 0.0d;
        }
        return zzYO4().zzZsQ.getTabStops().get(0).getPosition();
    }

    public double getTextPosition() {
        return ((double) zzYO4().zzZsQ.zzYM7()) / 20.0d;
    }

    public int getTrailingCharacter() {
        return zzYO4().zzYc7;
    }

    public int hashCode() {
        int numberStyle = getNumberStyle();
        if (getNumberFormat() != null) {
            numberStyle = (numberStyle * 397) ^ getNumberFormat().hashCode();
        }
        int alignment = (((((((((((((((((((((((((numberStyle * 397) ^ getAlignment()) * 397) ^ zzYOd()) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(isLegal())) * 397) ^ getRestartAfterLevel()) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(zzYO9())) * 397) ^ getTrailingCharacter()) * 397) ^ zzYO4().zzYnm) * 397) ^ zzYO4().zzYcb) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(getTabPosition())) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(getNumberPosition())) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(getTextPosition())) * 397) ^ zzYO4().zzZsP.hashCode(Style.zzXa8)) * 397) ^ zzYO4().zzZsQ.hashCode(Style.zzXa8);
        return zzYO4().zzYc1 != 12287 ? (alignment * 397) ^ 1 : alignment;
    }

    public boolean isLegal() {
        return zzYO4().zzYc9;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        zzYO4().zzZsP.remove(i);
    }

    public void setAlignment(int i) {
        zzYO4().zzUG = i;
    }

    public void setLinkedStyle(Style style) {
        if (style == null) {
            zzx2(StyleIdentifier.NIL);
        } else {
            if (style.getType() != 1) {
                throw new IllegalArgumentException("The style must be a paragraph style.");
            }
            if (style.getDocument() != this.zzZCL) {
                throw new IllegalArgumentException("The style must belong to this document.");
            }
            zzx2(style.zzZ7j());
        }
    }

    public void setNumberFormat(String str) {
        if (!zzJ7(str)) {
            throw new IllegalArgumentException("value");
        }
        zzYO4().zzYuN = str;
    }

    public void setNumberPosition(double d) {
        zzYO4().zzZsQ.zzwb(com.aspose.words.internal.zzSA.zzr(d) - zzYO4().zzZsQ.zzYM7());
    }

    public void setNumberStyle(int i) {
        if (i != 65280) {
            zzYO4().zzYca = "";
        }
        zzYO4().zzPm = i;
    }

    public void setRestartAfterLevel(int i) {
        if (!zzx8(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzYO4().zzYc8 = i;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        zzYO4().zzZsP.zzQ(i, obj);
    }

    public void setStartAt(int i) {
        if (!zzx9(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        zzYO4().zzYXS = i;
    }

    public void setTabPosition(double d) {
        if (zzYO4().zzZsQ.getTabStops() == null) {
            zzYO4().zzZsQ.zzY(new TabStopCollection());
        }
        zzYO4().zzZsQ.getTabStops().clear();
        zzYO4().zzZsQ.getTabStops().add(d, 6, 0);
    }

    public void setTextPosition(double d) {
        double numberPosition = getNumberPosition();
        zzYO4().zzZsQ.zzwa(com.aspose.words.internal.zzSA.zzr(d));
        setNumberPosition(numberPosition);
    }

    public void setTrailingCharacter(int i) {
        zzYO4().zzYc7 = i;
    }

    public final ListLevel zzA(DocumentBase documentBase) {
        ListLevel listLevel = (ListLevel) memberwiseClone();
        listLevel.zzZCL = documentBase;
        listLevel.zzZsQ = (zzYMX) this.zzZsQ.zzbn();
        listLevel.zzZsP = (zzYEF) this.zzZsP.zzbn();
        listLevel.zzZEt = null;
        return listLevel;
    }

    public final void zzJ4(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzYO4().setNumberStyle(65280);
        }
        zzYO4().zzYca = str;
    }

    public final void zzJ8(String str) {
        if (zzJ7(str)) {
            zzYO4().zzYuN = str;
        }
    }

    public final void zzUG(boolean z) {
        zzYO4().zzYc3 = z;
    }

    public final void zzUH(boolean z) {
        zzYO4().zzYc2 = z;
    }

    public final void zzUI(boolean z) {
        zzYO4().zzYc6 = z;
    }

    public final int zzYO5() {
        return zzYO4().zzYc4;
    }

    public final int zzYO6() {
        return zzYO4().zzYc5;
    }

    public final boolean zzYO7() {
        return zzYO4().zzYc3;
    }

    public final boolean zzYO8() {
        return zzYO4().zzYc2;
    }

    public final boolean zzYO9() {
        return zzYO4().zzYc8 != zzYO4().zzYcb - 1;
    }

    public final int zzYOa() {
        return zzYO4().zzYcb;
    }

    public final boolean zzYOb() {
        return zzZ0P() != null;
    }

    public final int zzYOc() {
        return zzYO4().zzYc1;
    }

    public final int zzYOd() {
        int numberStyle = getNumberStyle();
        if (numberStyle == 20 || numberStyle == 21) {
            return 1;
        }
        if (numberStyle == 45 || numberStyle == 47) {
            return 2;
        }
        switch (numberStyle) {
            case 10:
            case 11:
            case 12:
            case 13:
                return 1;
            default:
                switch (numberStyle) {
                    case 16:
                    case 17:
                    case 18:
                        return 1;
                    default:
                        return 3;
                }
        }
    }

    public final String zzYOe() {
        return zzYO4().getNumberStyle() == 65280 ? zzYO4().zzYca : "";
    }

    public final boolean zzZ(ListLevel listLevel, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        return zzV(listLevel) && zzYO4().zzZsP.zzW(listLevel.zzYO4().zzZsP, Style.zzXa8) && zzYO4().zzZsQ.zzW(listLevel.zzYO4().zzZsQ, Style.zzXa8) && Style.zzZ(this.zzZCL.getStyles().zzZ8(zzYO4().zzYc1, false), listLevel.zzZCL.getStyles().zzZ8(listLevel.zzYO4().zzYc1, false), zzim);
    }

    public final Shape zzZ0P() {
        if (zzYO4().zzYnm < 0 || zzYO4().zzYnm >= this.zzZCL.getLists().zzYP0()) {
            return null;
        }
        return this.zzZCL.getLists().zzxn(zzYO4().zzYnm);
    }

    public final int zzZ0p() {
        return zzYO4().zzYnm;
    }

    public final zzYEF zzZYh() {
        return zzYO4().zzZsP;
    }

    public final zzYMX zzZYj() {
        return zzYO4().zzZsQ;
    }

    public final void zzx0(int i) {
        zzYO4().zzYc4 = i;
    }

    public final void zzx1(int i) {
        zzYO4().zzYc5 = i;
    }

    public final void zzx2(int i) {
        zzYO4().zzYc1 = i;
    }

    public final void zzxb(int i) {
        if (zzx8(i)) {
            zzYO4().zzYc8 = i;
        }
    }

    public final void zzxc(int i) {
        if (zzx9(i)) {
            zzYO4().zzYXS = i;
        }
    }

    public final void zzzp(int i) {
        zzYO4().zzYnm = i;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return zzYO4().zzZsP.get(i);
    }

    public void isLegal(boolean z) {
        zzYO4().zzYc9 = z;
    }

    public ListLevel(ListLevel listLevel, zzZ9G zzz9g) {
        this.zzZCL = listLevel.zzZCL;
        this.zzYbZ = listLevel;
        this.zzYc0 = zzz9g;
    }
}

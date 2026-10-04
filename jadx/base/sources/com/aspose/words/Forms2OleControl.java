package com.aspose.words;

import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Forms2OleControl extends OleControl {
    zzZLZ zzYvV;
    static com.aspose.words.internal.zzZOZ zzYvU = new com.aspose.words.internal.zzZOZ("0be35204-8f91-11ce-9de3-00aa004bb851");
    private static zzVB zzYvT = new zzVB("Embedded Object");
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("8bd21d50-ec42-11ce-9e0d-00aa006002f3", "978c9e23-d4b0-11ce-bf2d-00aa003f40d0", "8bd21d10-ec42-11ce-9e0d-00aa006002f3", "8bd21d40-ec42-11ce-9e0d-00aa006002f3", "8bd21d60-ec42-11ce-9e0d-00aa006002f3", "79176fb0-b7f2-11ce-97ef-00aa006d2776", "8bd21d30-ec42-11ce-9e0d-00aa006002f3", "6e182020-f460-11ce-9bcd-00aa00608e01", "46e31370-3f7a-11ce-bed6-00aa00611080", "d7053240-ce69-11cd-a777-00dd01143c57", "4c599241-6926-101b-9992-00000b65c6f9", "dfd181e0-5e2f-11ce-a449-00aa004a803d", "eae50eb0-4a62-11ce-bed6-00aa00611080", "8bd21d20-ec42-11ce-9e0d-00aa006002f3", "c62a69f0-16dc-11ce-9e98-00aa00574a4f");

    public Forms2OleControl(String str) {
        this(str, null);
    }

    private boolean zzAG(int i) {
        return (i & zzZ69()) != 0;
    }

    private static String zzAH(int i) {
        return com.aspose.words.internal.zzZKN.format("Forms.{0}.1", zzYO6.toString(i));
    }

    private static int zzLh(String str) {
        switch (zzUR.zzTP(str.toLowerCase())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 9;
            case 13:
                return 14;
            case 14:
                return 13;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected CLSID: {0}", str));
        }
    }

    public static String zzLi(String str) {
        return zzAH(zzLh(str));
    }

    private int zzZ69() {
        return ((Integer) this.zzYvV.zzPj(31010)).intValue();
    }

    private zzYOD zzZ6a() {
        return (zzYOD) this.zzYvV.zzPj(31050);
    }

    private zzYOD zzZ6b() {
        return (zzYOD) this.zzYvV.zzPj(31000);
    }

    private zzYOD zzZ6c() {
        return (zzYOD) this.zzYvV.zzPj(31005);
    }

    private zzYOB zzZ6d() {
        return (zzYOB) this.zzYvV.zzPj(31026);
    }

    private zzYO8 zzZ6e() {
        return (zzYO8) this.zzYvV.zzPj(31025);
    }

    public static Forms2OleControl zzv(int i, String str) {
        switch (i) {
            case 0:
                return new zzYNN(str);
            case 1:
                return new zzZ78(str);
            case 2:
                return new TextBoxControl(str);
            case 3:
                return new zzVY(str);
            case 4:
                return new zzY50(str);
            case 5:
                return new zzY9N(str);
            case 6:
                return new zzUX(str);
            case 7:
                return new zzZLS(str);
            case 8:
                return new zzYWX(str);
            case 9:
                return new zzY73(str);
            case 10:
                return new zzUW(str);
            case 11:
                return new zzZ8M(str);
            case 12:
                return new zzYDU(str);
            case 13:
                return new zzZMO(str);
            case 14:
                return new zzZ4L(str);
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected Forms2OleControl type: {0}", Integer.valueOf(i)));
        }
    }

    public final int getBackColor() {
        return zzZ6c().getColor();
    }

    public String getCaption() {
        return (String) this.zzYvV.zzPj(31015);
    }

    public Forms2OleControlCollection getChildNodes() {
        return null;
    }

    public boolean getEnabled() {
        return zzAG(2);
    }

    public final int getForeColor() {
        return zzZ6b().getColor();
    }

    public String getGroupName() {
        return (String) this.zzYvV.zzPj(31155);
    }

    public final double getHeight() {
        return com.aspose.words.internal.zzZKQ.zzS(((double) zzZ6e().getHeight()) * 0.028346456587314606d, 2);
    }

    public final int getIdInternal() {
        return ((Integer) this.zzYvV.zzPj(31265)).intValue();
    }

    public final double getLeft() {
        return com.aspose.words.internal.zzZKQ.zzS(((double) zzZ6d().getLeft()) * 0.028346456587314606d, 2);
    }

    public final boolean getMultiline() {
        return zzAG(Integer.MIN_VALUE);
    }

    @Override // com.aspose.words.OleControl
    public String getProgId() {
        return zzAH(getType());
    }

    public final String getTag() {
        return (String) this.zzYvV.zzPj(31305);
    }

    public final double getTop() {
        return com.aspose.words.internal.zzZKQ.zzS(((double) zzZ6d().getTop()) * 0.028346456587314606d, 2);
    }

    public abstract int getType();

    @Override // com.aspose.words.OleControl
    public String getUserType() {
        return com.aspose.words.internal.zzZKN.format("Microsoft Forms 2.0 {0}", zzYO6.toString(getType()));
    }

    public String getValue() {
        return (String) this.zzYvV.zzPj(31030);
    }

    public final double getWidth() {
        return com.aspose.words.internal.zzZKQ.zzS(((double) zzZ6e().getWidth()) * 0.028346456587314606d, 2);
    }

    public final boolean getWordWrap() {
        return zzAG(8388608);
    }

    public boolean isComposite() {
        return false;
    }

    public void setGroupName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "GroupName");
        this.zzYvV.zzQ(31155, str);
    }

    public final void setIdInternal(int i) {
        this.zzYvV.zzQ(31265, Integer.valueOf(i));
    }

    public final void setValue(String str) {
        this.zzYvV.zzQ(31030, str);
    }

    public abstract int zz1E();

    public final void zzAF(int i) {
        this.zzYvV.zzQ(31280, Integer.valueOf(i));
    }

    @Override // com.aspose.words.OleControl
    public void zzW(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzV(new com.aspose.words.internal.zzZOW(zzzor));
        zzaa.set("contents", zzzor);
    }

    @Override // com.aspose.words.OleControl
    public void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYu = zzaa.zzYu("contents");
        if (zzzorZzYu != null) {
            zzZ(new com.aspose.words.internal.zzZOX(zzzorZzYu));
        }
    }

    public final void zzZ(zzYO8 zzyo8) {
        this.zzYvV.zzQ(31025, zzyo8);
    }

    public final int zzZ6f() {
        return ((Integer) this.zzYvV.zzPj(31055)).intValue();
    }

    public final int zzZ6g() {
        return ((Integer) this.zzYvV.zzPj(31020)).intValue();
    }

    public final int zzZ6h() {
        return zzZ6a().getColor();
    }

    public final int zzZ6i() {
        return zzAG(8) ? 0 : 1;
    }

    public final boolean zzZ6j() {
        return ((Boolean) this.zzYvV.zzPj(31400)).booleanValue();
    }

    public final String zzZ6k() {
        return (String) this.zzYvV.zzPj(31325);
    }

    public final String zzZ6l() {
        return (String) this.zzYvV.zzPj(31320);
    }

    public final String zzZ6m() {
        return (String) this.zzYvV.zzPj(31315);
    }

    public final byte[] zzZ6n() {
        return (byte[]) this.zzYvV.zzPj(31060);
    }

    public final byte[] zzZ6o() {
        return (byte[]) this.zzYvV.zzPj(31070);
    }

    @Override // com.aspose.words.OleControl
    public final zzVB zzZ6p() {
        return zzYvT;
    }

    public final boolean zzZ6q() {
        return zzAG(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public final boolean zzZ6r() {
        return zzAG(8192);
    }

    public final String zzZzU() {
        return (String) this.zzYvV.zzPj(31455);
    }

    public Forms2OleControl(String str, zzZLZ zzzlz) {
        super(str);
        this.zzYvV = zzzlz == null ? new zzZLZ() : zzzlz;
    }
}

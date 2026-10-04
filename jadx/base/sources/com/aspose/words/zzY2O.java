package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2O {
    private byte[] zzP;
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private ShapeBase zzZBi;
    private String zzXrZ = null;
    private String zzWX0 = null;
    private String zzWWZ = null;
    private String zzWWY = null;
    private String zzWWX = null;
    private String zzWWW = null;
    private String zzWWV = null;
    private String zzWWU = null;
    private String zzWWT = null;
    private String zzWWS = null;
    private String zzWWR = null;
    private String zzWWQ = null;
    private String zzWWP = null;
    private String zzWWO = null;
    private String zzWWN = null;

    public zzY2O(ShapeBase shapeBase, zzYU6 zzyu6, zzZ8U zzz8u) {
        this.zzXSu = zzyu6;
        this.zzZBi = shapeBase;
        this.zzWZx = zzz8u;
    }

    private boolean zzzj(String str) throws Exception {
        Shape shape;
        ImageData imageData;
        return ((this.zzZBi instanceof Shape) && str == null && !this.zzWZx.zzZlT() && (imageData = (shape = (Shape) this.zzZBi).getImageData()) != null && shape.getShapeType() == 75 && imageData.isLinkOnly()) ? false : true;
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final void zzIg() throws Exception {
        if (this.zzP == null && this.zzWWZ == null && this.zzWWQ == null && this.zzWWN == null) {
            return;
        }
        this.zzXSu.zzY("v:imagedata");
        this.zzXSu.zz0(this.zzWZx.zzZm4(), this.zzXrZ);
        if (this.zzP != null && !com.aspose.words.internal.zzZKN.equals(this.zzWWZ, this.zzXrZ)) {
            this.zzXSu.zz0(this.zzWZx.zzZm3(), this.zzWWZ);
        }
        if (zzzj(this.zzWX0)) {
            this.zzXSu.zzX("o:title", this.zzWX0);
        }
        this.zzXSu.zz0("croptop", this.zzWWY);
        this.zzXSu.zz0("cropbottom", this.zzWWX);
        this.zzXSu.zz0("cropleft", this.zzWWW);
        this.zzXSu.zz0("cropright", this.zzWWV);
        this.zzXSu.zz0("chromakey", this.zzWWU);
        this.zzXSu.zz0("gain", this.zzWWT);
        this.zzXSu.zz0("blacklevel", this.zzWWS);
        this.zzXSu.zz0("gamma", this.zzWWR);
        this.zzXSu.zz0("grayscale", this.zzWWP);
        this.zzXSu.zz0("bilevel", this.zzWWO);
        this.zzXSu.zz0("embosscolor", this.zzWWQ);
        this.zzXSu.zz0("recolortarget", this.zzWWN);
        this.zzXSu.zzp();
    }

    public final String zzXTd() {
        return this.zzWWZ;
    }

    public final String zzYfy() {
        return this.zzXrZ;
    }

    public final void zzZP(int i, Object obj) {
        if (i == 268) {
            this.zzWWQ = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
            return;
        }
        if (i == 282) {
            com.aspose.words.internal.zzPV zzpv = new com.aspose.words.internal.zzPV(((Integer) obj).intValue());
            this.zzWWN = zzY35.zzf(new com.aspose.words.internal.zzPV(zzpv.zzPA(), zzpv.zzPB(), zzpv.zzPC()));
            return;
        }
        if (i == 317) {
            this.zzWWP = zzY23.zzW(obj, false);
            return;
        }
        if (i == 318) {
            this.zzWWO = zzY23.zzW(obj, false);
            return;
        }
        switch (i) {
            case 256:
                this.zzWWY = zzY23.zzYO(obj);
                break;
            case 257:
                this.zzWWX = zzY23.zzYO(obj);
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                this.zzWWW = zzY23.zzYO(obj);
                break;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                this.zzWWV = zzY23.zzYO(obj);
                break;
            default:
                switch (i) {
                    case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                        this.zzWWU = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                        break;
                    case StyleIdentifier.BOOK_TITLE /* 264 */:
                        this.zzWWT = zzY23.zzYO(obj);
                        break;
                    case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                        this.zzWWS = zzY23.zzYO(obj);
                        break;
                    case StyleIdentifier.TOC_HEADING /* 266 */:
                        this.zzWWR = zzY23.zzYO(obj);
                        break;
                    default:
                        switch (i) {
                            case 4102:
                                this.zzP = (byte[]) obj;
                                break;
                            case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                this.zzWX0 = (String) obj;
                                break;
                            case 4104:
                                this.zzWWZ = (String) obj;
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public final void zzzi(String str) {
        this.zzWWZ = str;
    }

    public final void zzzk(String str) {
        this.zzXrZ = str;
    }
}

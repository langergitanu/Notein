package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHA extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\f", "\\fcharset", "\\fnil", "\\froman", "\\fswiss", "\\fmodern", "\\fscript", "\\fdecor", "\\fprq");
    private int zzXvw;
    private int zzXvx;
    private int zzXvy;
    private FontInfo zzXvz;
    private int zzZti;

    public zzYHA(zzYFT zzyft) {
        super(zzyft);
        this.zzXvz = new FontInfo();
        this.zzXvx = -1;
        zzYiv();
    }

    private void zzK(zzYET zzyet) {
        zzZZF zzzzfZzZpV = this.zzXw4.getDocument().zzZpV();
        zzzzfZzZpV.zzYWw = false;
        int iZz0R = zzyet.zz0R();
        int i = 0;
        while (i < iZz0R) {
            int iZznH = zzyet.zznH(i) * 2;
            byte[] bArrZzVU = zzyet.zzVU(i, iZznH);
            int iZzZ = zzZN1.zzZ(com.aspose.words.internal.zzZKN.zzT(com.aspose.words.internal.zzKU.zza(bArrZzVU), (char) 0).toLowerCase(), this.zzXw4);
            boolean zZz8 = com.aspose.words.internal.zzKU.zz8(bArrZzVU);
            if (zZz8) {
                zzzzfZzZpV.zzYWw = true;
            }
            this.zzXvz.zzW(bArrZzVU, 0, iZzZ, zZz8);
            i += iZznH;
        }
    }

    private void zzL(zzYET zzyet) {
        if (zzyet.zzYeW()) {
            return;
        }
        String strZzYeX = zzyet.zzYeX();
        this.zzXvy = com.aspose.words.internal.zzJF.zzZG(strZzYeX);
        this.zzXvz.setName(com.aspose.words.internal.zzJF.zzZF(strZzYeX));
    }

    private void zzYit() {
        FontInfo fontInfo = this.zzXvz;
        int i = this.zzXvy;
        if (i == -1) {
            i = 1;
        }
        fontInfo.setCharset(i);
    }

    private void zzYiu() {
        if (this.zzXvx < 0 || !com.aspose.words.internal.zzZYD.zzXk(this.zzXvz.getName())) {
            return;
        }
        if (!this.zzXvz.zzZ73()) {
            zzYit();
        }
        this.zzXw4.zzYgt().zzZ(this.zzXvx, this.zzXvz, this.zzZti);
    }

    private void zzYiv() {
        FontInfo fontInfo = new FontInfo();
        this.zzXvz = fontInfo;
        this.zzXvx = 0;
        fontInfo.setCharset(-1);
        this.zzZti = 0;
    }

    private void zzYiw() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXvz.getName())) {
            zzYiu();
            zzYiv();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzYiw();
                this.zzXvx = zzyet.zzYeT();
                break;
            case 1:
                this.zzXvz.setCharset(zzyet.zzYeT());
                int iZzt = com.aspose.words.internal.zzT8.zzt(this.zzXvz.getCharset(), this.zzXw4.zzYgm().zzYic());
                this.zzXvw = iZzt;
                this.zzXw4.zzof(iZzt);
                break;
            case 2:
                this.zzXvz.setFamily(0);
                break;
            case 3:
                this.zzXvz.setFamily(1);
                break;
            case 4:
                this.zzXvz.setFamily(2);
                break;
            case 5:
                this.zzXvz.setFamily(3);
                break;
            case 6:
                this.zzXvz.setFamily(4);
                break;
            case 7:
                this.zzXvz.setFamily(5);
                break;
            case 8:
                this.zzXvz.setPitch(zzyet.zzYeT());
                break;
            default:
                int iZzBI = zzYEW.zzBI(zzyet.getName());
                if (iZzBI == Integer.MIN_VALUE) {
                    zzO(zzyet);
                } else {
                    this.zzZti = iZzBI;
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 2) {
            if (this.zzXvz == null || com.aspose.words.internal.zzZYD.zzXh(zzyet.zzYR())) {
                return;
            }
            zzL(zzyet);
            return;
        }
        if (type == 3) {
            this.zzXvz.setAltName(zzyet.zzYR());
            return;
        }
        if (type != 4) {
            if (type != 5) {
                return;
            }
            zzK(zzyet);
        } else {
            byte[] bArrZzYeZ = zzyet.zzYeZ();
            if (bArrZzYeZ.length == 10) {
                this.zzXvz.setPanose(bArrZzYeZ);
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiO() {
        zzYiu();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiP() {
        zzYiw();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() != 2) {
            this.zzXw4.zzof(this.zzXvw);
            return;
        }
        zzYiu();
        this.zzXw4.zzYgc();
        if (this.zzXw4.zzYgm().zzXvc != -1) {
            zzYFT zzyft = this.zzXw4;
            this.zzXw4.zzBW(zzyft.zzom(zzyft.zzYgm().zzXvc));
        }
        this.zzXw4.zzof(-1);
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 3 || type == 4) {
            zzYFT zzyft = this.zzXw4;
            zzyft.zzof(zzyft.zzYgm().zzYic());
            return this;
        }
        if (type != 5) {
            return null;
        }
        getDocument().zzZpV().zzYWy = true;
        return this;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHF extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\ansi", "\\mac", "\\pc", "\\pca", "\\ansicpg", "\\deff", "\\adeff", "\\deflang", "\\adeflang", "\\deflangfe", "\\stshfloch", "\\stshfdbch", "\\stshfhich", "\\stshfbi", "\\themelang", "\\themelangfe", "\\themelangcs");
    private com.aspose.words.internal.zzD3<Style> zzXvQ;
    private String zzXvR;
    private String zzXvS;
    private zzYFT zzXwE;

    public zzYHF(zzYFT zzyft) {
        super(zzyft);
        this.zzXvQ = new com.aspose.words.internal.zzD3<>();
        this.zzXwE = zzyft;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzXw4.zzYgm().zzoK(1252);
                this.zzXw4.zzYgm().zzYia();
                break;
            case 1:
                this.zzXw4.zzYgm().zzoK(10000);
                break;
            case 2:
                this.zzXw4.zzYgm().zzoK(437);
                break;
            case 3:
                this.zzXw4.zzYgm().zzoK(850);
                break;
            case 4:
                int iZzYeT = zzyet.zzYeT();
                if (iZzYeT >= 0 && iZzYeT <= 65535) {
                    this.zzXw4.zzYgm().zzoK(iZzYeT);
                } else {
                    this.zzXw4.zzYgm().zzoK(1252);
                }
                break;
            case 5:
                this.zzXw4.zzYgm().zzoP(zzyet.zzYeT());
                this.zzXw4.zzYgt().zzoU(this.zzXw4.zzYgm().zzYie());
                break;
            case 6:
                this.zzXw4.zzYgm().zzoO(zzyet.zzYeT());
                break;
            case 7:
                this.zzXw4.zzYgm().zzoN(zzyet.zzYeT());
                break;
            case 8:
                this.zzXw4.zzYgm().zzoM(zzyet.zzYeT());
                break;
            case 9:
                this.zzXw4.zzYgm().zzoL(zzyet.zzYeT());
                break;
            case 10:
                this.zzXw4.zzYgm().zzXvd = zzyet.zzYeT();
                break;
            case 11:
                this.zzXw4.zzYgm().zzXvc = zzyet.zzYeT();
                break;
            case 12:
                this.zzXw4.zzYgm().zzXvb = zzyet.zzYeT();
                break;
            case 13:
                this.zzXw4.zzYgm().zzXva = zzyet.zzYeT();
                break;
            case 14:
                this.zzXw4.getDocument().zzZpV().zzYVe.zzX34 = zzyet.zzYeT();
                break;
            case 15:
                this.zzXw4.getDocument().zzZpV().zzYVe.zzX33 = zzyet.zzYeT();
                break;
            case 16:
                this.zzXw4.getDocument().zzZpV().zzYVe.zzX32 = zzyet.zzYeT();
                break;
            default:
                super.zzT(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 0) {
            super.zzY(zzyet);
            return;
        }
        if (type == 88) {
            this.zzXw4.zzYgv().add(zzyet.zzYeX());
            return;
        }
        if (type == 114) {
            zzYG2.zzY(zzyet.zzYR(), getDocument().zzZpV().zzYW5.zzZo8());
            return;
        }
        if (type == 115) {
            getDocument().zzZpV().zzYWj.zzkD(new zzYGY(zzyet.zzYR()).zzXa());
            return;
        }
        switch (type) {
            case 25:
                getDocument().zzZpV().zzYWn = zzyet.zzYR();
                break;
            case 26:
                getDocument().zzZpV().zzYVo = zzyet.zzYR();
                break;
            case 27:
                if (this.zzXvS != null) {
                    this.zzXvR = zzyet.zzYR();
                } else {
                    this.zzXvS = zzyet.zzYR();
                }
                break;
            default:
                super.zzY(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiO() {
        this.zzXwE.zzYhj().zznN(this.zzXwE.zzYgo().getCount());
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final boolean zzYiX() {
        int type = zzYiN().getType();
        return (type == 256 || type == 258) ? false : true;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() != 27) {
            super.zzYjb();
        } else {
            getDocument().getVariables().add(this.zzXvS, this.zzXvR);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 27) {
            super.zzZ(zzyet);
        } else {
            this.zzXvS = null;
            this.zzXvR = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type == 1) {
            return new zzYHU(this.zzXw4);
        }
        if (type == 2) {
            return new zzYHA(this.zzXw4);
        }
        if (type == 61) {
            return new zzYGN(this.zzXw4, this.zzXvQ);
        }
        if (type == 68) {
            return new zzYGO(this.zzXw4, this.zzXvQ);
        }
        if (type == 79) {
            return new zzYHR(this.zzXw4);
        }
        if (type != 88 && type != 105) {
            if (type == 121) {
                return new zzYEL(this.zzXw4);
            }
            if (type == 135) {
                return new zzYHE(this.zzXw4);
            }
            if (type == 265) {
                return new zzYG0(this.zzXw4);
            }
            if (type == 267) {
                return new zzYFP(this.zzXw4);
            }
            if (type != 268) {
                switch (type) {
                    case 6:
                    case 8:
                    case 9:
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
                    case 20:
                        return new zzYGW(this.zzXw4);
                    case 7:
                        return new zzYH4(this.zzXw4);
                    case 21:
                        return new zzYEP(this.zzXw4);
                    default:
                        switch (type) {
                            case 25:
                            case 26:
                            case 27:
                                break;
                            case 28:
                                return new zzYF4(this.zzXw4);
                            default:
                                switch (type) {
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                        return new zzYH0(this.zzXw4);
                                    default:
                                        switch (type) {
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                            case 85:
                                            case 86:
                                                return new zzYH7(this.zzXw4);
                                            default:
                                                switch (type) {
                                                    case 112:
                                                    case 113:
                                                        break;
                                                    case 114:
                                                    case 115:
                                                        break;
                                                    case 116:
                                                        return new zzYGU(this.zzXw4);
                                                    default:
                                                        return super.zzZ(zzyhp);
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                return new zzYGS(this.zzXw4);
            }
        }
        return this;
    }
}

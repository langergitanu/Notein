package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGQ extends zzYHQ implements zzZ9H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\levelnfc", "\\levelnfcn", "\\leveljc", "\\leveljcn", "\\levelstartat", "\\levelold", "\\levelprev", "\\levelprevspace", "\\levelindent", "\\levelspace", "\\levelfollow", "\\levellegal", "\\levelnorestart", "\\levelpicture");
    private ListLevelCollection zzXuM;
    private zzYG4 zzXvr;
    private zzYFN zzXw5;
    private ListLevel zzYo4;

    private zzYGQ(zzYFT zzyft) {
        super(zzyft);
        this.zzXw5 = new zzYFN(zzyft, this);
        this.zzXvr = new zzYG4(zzyft, this);
    }

    private boolean zzE(zzYET zzyet) {
        String strZzYeX = zzyet.zzYeX();
        String numberFormat = this.zzYo4.getNumberFormat();
        for (int i = 0; i < strZzYeX.length(); i++) {
            int iCharAt = strZzYeX.charAt(i) - 1;
            if (iCharAt < 0 || iCharAt > numberFormat.length() - 1 || !ListLevel.zzYF(numberFormat.charAt(iCharAt))) {
                return false;
            }
        }
        return true;
    }

    private void zzF(zzYET zzyet) {
        String strZzYeX = zzyet.zzYeX();
        if (com.aspose.words.internal.zzZYD.zzXk(strZzYeX)) {
            this.zzYo4.zzJ8(strZzYeX.substring(1, Math.min((int) strZzYeX.charAt(0), strZzYeX.length() - 1) + 1));
        }
    }

    private boolean zzG(zzYET zzyet) throws Exception {
        return this.zzXvr.zzX(zzyet) || this.zzXw5.zzX(zzyet);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
            case 1:
                this.zzYo4.setNumberStyle(zzyet.zzYeT());
                break;
            case 2:
            case 3:
                this.zzYo4.setAlignment(zzyet.zzYeT());
                break;
            case 4:
                this.zzYo4.zzxc(zzyet.zzYeT());
                break;
            case 5:
                this.zzYo4.zzUI(zzyet.zzYeY());
                break;
            case 6:
                this.zzYo4.zzUH(zzyet.zzYeY());
                break;
            case 7:
                this.zzYo4.zzUG(zzyet.zzYeY());
                break;
            case 8:
                this.zzYo4.zzx0(zzyet.zzYeT());
                break;
            case 9:
                this.zzYo4.zzx1(zzyet.zzYeT());
                break;
            case 10:
                this.zzYo4.setTrailingCharacter(zzyet.zzYeT());
                break;
            case 11:
                this.zzYo4.isLegal(zzyet.zzYeY());
                break;
            case 12:
                if (zzyet.zzYeY()) {
                    this.zzYo4.setRestartAfterLevel(-1);
                }
                break;
            case 13:
                this.zzYo4.zzzp(zzyet.zzYeT());
                break;
            default:
                if (!zzG(zzyet)) {
                    zzO(zzyet);
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 66) {
            zzF(zzyet);
        } else if (type == 67 && !zzE(zzyet)) {
            this.zzYo4.setNumberFormat("");
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() == 65) {
            if (this.zzYo4.zzZYj().zzVE(1000)) {
                ListLevel listLevel = this.zzYo4;
                listLevel.zzx2(listLevel.zzZYj().zzZ7j());
                this.zzYo4.zzZYj().remove(1000);
            }
            this.zzYo4.zzZYh().remove(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
            this.zzYo4.zzZYh().remove(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        }
        super.zzYjb();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiN().getType() == 65 && this.zzYo4 == null) {
            ListLevel listLevel = new ListLevel(getDocument(), this.zzXuM.getCount());
            this.zzYo4 = listLevel;
            this.zzXuM.zzU(listLevel);
        }
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return this.zzYo4.zzZYh();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return this.zzYo4.zzZYj();
    }

    public zzYGQ(zzYFT zzyft, ListLevel listLevel) {
        this(zzyft);
        this.zzYo4 = listLevel;
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 66 || type == 67) {
            return this;
        }
        return null;
    }

    public zzYGQ(zzYFT zzyft, ListLevelCollection listLevelCollection) {
        this(zzyft);
        this.zzXuM = listLevelCollection;
    }
}

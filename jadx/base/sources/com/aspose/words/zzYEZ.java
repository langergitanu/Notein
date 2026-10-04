package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEZ extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\trowd", "\\lastrow", "\\trleft", "\\tblind", "\\trautofit", "\\trhdr", "\\trkeep", "\\trbrdrl", "\\trbrdrr", "\\trbrdrt", "\\trbrdrb", "\\trbrdrh", "\\trbrdrv", "\\tdfrmtxtLeft", "\\tdfrmtxtRight", "\\tdfrmtxtTop", "\\tdfrmtxtBottom", "\\tabsnoovrlp", "\\ltrrow", "\\rtlrow", "\\trgaph", "\\trpaddl", "\\trpaddfl", "\\trpaddr", "\\trpaddfr", "\\trpaddt", "\\trpaddft", "\\trpaddb", "\\trpaddfb", "\\trspdfl", "\\trspdfr", "\\trspdft", "\\trspdfb", "\\trspdl", "\\trspdr", "\\trspdt", "\\trspdb", "\\trwWidth", "\\trftsWidth", "\\trwWidthA", "\\trftsWidthA", "\\trwWidthB", "\\trftsWidthB", "\\trrh", "\\tposx", "\\tposnegx", "\\tposy", "\\tposnegy", "\\ts", "\\yts", "\\tposyil", "\\tbllkhdrrows", "\\tbllklastrow", "\\tbllkhdrcols", "\\tbllklastcol", "\\tbllknorowband", "\\tbllknocolband", "\\tsrowd", "\\tscbandsh", "\\tscbandsv", "\\tbllkborder", "\\tbllkshading", "\\tbllkfont", "\\tbllkcolor", "\\tbllkbestfit", "\\taprtl", "\\trkeepfollow", "\\trpadob", "\\trpadol", "\\trpador", "\\trpadot", "\\trpadofb", "\\trpadofl", "\\trpadofr", "\\trpadoft", "\\trspob", "\\trspol", "\\trspor", "\\trspofb", "\\trspofl", "\\trspofr", "\\trspoft", "\\tblindtype", "\\trcbpat", "\\trcfpat", "\\trpat", "\\trshdng", "\\trbgbdiag", "\\trbgdcross", "\\trbgcross", "\\trbgdkbdiag", "\\trbgdkcross", "\\trbgdkdcross", "\\trbgdkhor", "\\trbgdkvert", "\\trbgfdiag", "\\trbghoriz", "\\trbgvert", "\\clshdngraw", "\\rawclbghoriz", "\\rawclbgvert", "\\rawclbgfdiag", "\\rawclbgbdiag", "\\rawclbgcross", "\\rawclbgdcross", "\\rawclbgdkhor", "\\rawclbgdkvert", "\\rawclbgdkfdiag", "\\rawclbgdkbdiag", "\\rawclbgdkcross", "\\rawclbgdkdcross", "\\clcfpatraw", "\\clcbpatraw");
    private int zzXri;
    private int zzXrj;
    private int zzXrk;
    private zzY6G zzXrl;
    private int zzXrm;
    private int zzXrn;
    private int zzXro;
    private int zzXrp;
    private int zzXrq;
    private int zzXrr;
    private int zzXrs;
    private int zzXrt;
    private int zzXwn;
    private int zzXwo;

    public zzYEZ(zzYFT zzyft) {
        super(zzyft);
        this.zzXrl = new zzY6G();
    }

    private boolean zz1(zzYET zzyet) throws Exception {
        if (zzYf3() == null) {
            return false;
        }
        int iZzBu = zzYEO.zzBu(zzyet.getName());
        this.zzXri = iZzBu;
        return iZzBu != 0;
    }

    private boolean zz2(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 57:
                zzYiZ();
                return true;
            case 58:
                zzZYf().zzQ(4500, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 59:
                zzZYf().zzQ(4510, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
                zzYja().zzC0(zzyet.getName());
                return true;
            default:
                return zz1(zzyet);
        }
    }

    private TableStyle zzYf3() {
        if (zzYja().zzYgj()) {
            return ((zzYF4) zzYja().zzYgo().zzYiL().zzYim()).zzYfq();
        }
        return null;
    }

    private void zzYf4() {
        if (zzYja().zzYhj().zzYfm() > zzYja().zzYgo().getCount() + 1) {
            zzYja().zzYiM().zzYhF();
        }
    }

    private void zzYiZ() {
        this.zzXrt = 0;
        this.zzXrs = 0;
        this.zzXrr = 0;
        this.zzXrq = 0;
        this.zzXwo = 0;
        this.zzXri = 0;
        zzYja().zzYhj().zznP(zzYja().zzYgo().getCount());
    }

    private zzY6G zzZYf() {
        return zzYja().zzYgj() ? ((zzYF4) zzYja().zzYgo().zzYiL().zzYim()).zzZYf() : zzYja().zzYgo().getCount() == zzYja().zzYhj().zzYfm() ? zzYja().zzYhj().zzZYf() : this.zzXrl;
    }

    private void zznK(int i) {
        int styleOptions = zzZYf().contains(4140) ? zzZYf().getStyleOptions() : TableStyleOptions.DEFAULT_2003;
        zzZYf().zzQ(4140, Integer.valueOf((i == 1024 || i == 512) ? (~i) & styleOptions : i | styleOptions));
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        int iZzBV = zzYFQ.zzBV(zzyet.getName());
        if (iZzBV != Integer.MIN_VALUE) {
            zzZYf().zzQ(5101, Integer.valueOf(iZzBV));
            return true;
        }
        int iZzC5 = zzYFQ.zzC5(zzyet.getName());
        if (iZzC5 != Integer.MIN_VALUE) {
            zzZYf().zzQ(4180, Integer.valueOf(iZzC5));
            return true;
        }
        int iZzC4 = zzYFQ.zzC4(zzyet.getName());
        if (iZzC4 != Integer.MIN_VALUE) {
            zzZYf().zzQ(4200, Integer.valueOf(iZzC4));
            return true;
        }
        int iZzC7 = zzYFQ.zzC7(zzyet.getName());
        if (iZzC7 != Integer.MIN_VALUE) {
            zzZYf().zzQ(4150, Integer.valueOf(iZzC7));
            return true;
        }
        int iZzC6 = zzYFQ.zzC6(zzyet.getName());
        if (iZzC6 == Integer.MIN_VALUE) {
            return false;
        }
        zzZYf().zzQ(4160, Integer.valueOf(iZzC6));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zzZrB()) {
            return false;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                if (zzYja().zzYiM().getContainer().getNodeType() == 4) {
                    zzYja().zzYiM().zzYhq();
                }
                zzYf4();
                zzYiZ();
                zzYja().zzYhj().zzRh(true);
                return true;
            case 1:
                zzYja().zzYhj().zzYfb();
                return true;
            case 2:
                zzYja().zzYhj().zznS(zzyet.zzYeT());
                zzZYf().zzQ(5102, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 3:
                zzZYf().zzQ(4340, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 4:
                zzZYf().zzQ(4240, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 5:
                zzZYf().zzQ(4040, Boolean.TRUE);
                return true;
            case 6:
                zzZYf().zzQ(4360, Boolean.FALSE);
                return true;
            case 7:
                zzYja().zzR(zzZYf(), 4060);
                return true;
            case 8:
                zzYja().zzR(zzZYf(), 4080);
                return true;
            case 9:
                zzYja().zzR(zzZYf(), 4050);
                return true;
            case 10:
                zzYja().zzR(zzZYf(), 4070);
                return true;
            case 11:
                zzYja().zzR(zzZYf(), 4090);
                return true;
            case 12:
                zzYja().zzR(zzZYf(), EditingLanguage.CHINESE_SINGAPORE);
                return true;
            case 13:
                zzZYf().zzQ(4210, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 14:
                zzZYf().zzQ(4270, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 15:
                zzZYf().zzQ(4220, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 16:
                zzZYf().zzQ(4280, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 17:
                zzZYf().zzQ(4350, Boolean.valueOf(!zzyet.zzYeY()));
                return true;
            case 18:
                zzZYf().zzQ(4380, Boolean.FALSE);
                return true;
            case 19:
                zzZYf().zzQ(4380, Boolean.TRUE);
                return true;
            case 20:
                zzZYf().zzwx(zzyet.zzYeT());
                zzZYf().zzwu(zzyet.zzYeT());
                return true;
            case 21:
                this.zzXrt = zzyet.zzYeT();
                return true;
            case 22:
                if (zzyet.zzYeT() == 3) {
                    zzZYf().zzwx(this.zzXrt);
                }
                return true;
            case 23:
                this.zzXrs = zzyet.zzYeT();
                return true;
            case 24:
                if (zzyet.zzYeT() == 3) {
                    zzZYf().zzwu(this.zzXrs);
                }
                return true;
            case 25:
                this.zzXrr = zzyet.zzYeT();
                return true;
            case 26:
                if (zzyet.zzYeT() == 3) {
                    zzZYf().zzwv(this.zzXrr);
                }
                return true;
            case 27:
                this.zzXrq = zzyet.zzYeT();
                return true;
            case 28:
                if (zzyet.zzYeT() == 3) {
                    zzZYf().zzws(this.zzXrq);
                }
                return true;
            case 29:
                PreferredWidth preferredWidthZzW6 = PreferredWidth.zzW6(zzyet.zzYeT(), this.zzXrp);
                if (preferredWidthZzW6.isValid()) {
                    zzZYf().zzQ(4290, preferredWidthZzW6);
                }
                return true;
            case 30:
                PreferredWidth preferredWidthZzW62 = PreferredWidth.zzW6(zzyet.zzYeT(), this.zzXro);
                if (preferredWidthZzW62.isValid()) {
                    zzZYf().zzQ(4290, preferredWidthZzW62);
                }
                return true;
            case 31:
                PreferredWidth preferredWidthZzW63 = PreferredWidth.zzW6(zzyet.zzYeT(), this.zzXrn);
                if (preferredWidthZzW63.isValid()) {
                    zzZYf().zzQ(4290, preferredWidthZzW63);
                }
                return true;
            case 32:
                PreferredWidth preferredWidthZzW64 = PreferredWidth.zzW6(zzyet.zzYeT(), this.zzXrm);
                if (preferredWidthZzW64.isValid()) {
                    zzZYf().zzQ(4290, preferredWidthZzW64);
                }
                return true;
            case 33:
                this.zzXrp = zzyet.zzYeT();
                return true;
            case 34:
                this.zzXro = zzyet.zzYeT();
                return true;
            case 35:
                this.zzXrn = zzyet.zzYeT();
                return true;
            case 36:
                this.zzXrm = zzyet.zzYeT();
                return true;
            case 37:
                this.zzXwo = zzyet.zzYeT();
                zzZYf().zzQ(4230, PreferredWidth.zzW6(this.zzXwn, this.zzXwo));
                return true;
            case 38:
                this.zzXwn = zzyet.zzYeT();
                zzZYf().zzQ(4230, PreferredWidth.zzW6(this.zzXwn, this.zzXwo));
                return true;
            case 39:
                int iZzYeT = zzyet.zzYeT();
                zzZYf().zzQ(4260, Integer.valueOf(iZzYeT));
                zzZYf().zzQ(4261, PreferredWidth.zzW6(this.zzXrk, iZzYeT));
                return true;
            case 40:
                this.zzXrk = zzyet.zzYeT();
                return true;
            case 41:
                int iZzYeT2 = zzyet.zzYeT();
                zzZYf().zzQ(4250, Integer.valueOf(iZzYeT2));
                zzZYf().zzQ(4253, PreferredWidth.zzW6(this.zzXrj, iZzYeT2));
                return true;
            case 42:
                this.zzXrj = zzyet.zzYeT();
                return true;
            case 43:
                zzZYf().zzQ(4120, zzYEO.zznn(zzyet.zzYeT()));
                return true;
            case 44:
            case 45:
                zzZYf().zzQ(4170, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 46:
            case 47:
                zzZYf().zzQ(4190, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 48:
            case 49:
                zzZYf().zzQ(4005, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 50:
                return true;
            case 51:
                zznK(32);
                return true;
            case 52:
                zznK(64);
                return true;
            case 53:
                zznK(128);
                return true;
            case 54:
                zznK(256);
                return true;
            case 55:
                zznK(512);
                return true;
            case 56:
                zznK(1024);
                return true;
            default:
                return zz2(zzyet);
        }
    }

    public final int zzYfp() {
        return this.zzXri;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6F extends zzYL2 implements zzZ97 {
    private zzWN zzX4U;
    private int zzX4V;
    private zzY6G zzX4W;
    private zzY9J zzXH2;

    public zzY6F(zzZZB zzzzb) throws Exception {
        super(zzzzb);
        this.zzXH2 = new zzY9J(this, zzzzb.zzYUt, zzzzb.zzYUr);
    }

    private void zzXX3() throws Exception {
        PreferredWidth preferredWidthZzXX4 = zzXX4();
        if (preferredWidthZzXX4.isFixed()) {
            this.zzZF0.zzQ(4340, Integer.valueOf(preferredWidthZzXX4.zzYmD()));
        }
    }

    private PreferredWidth zzXX4() throws Exception {
        int i = this.zzW6.readByte() & 255;
        if (i == 19) {
            i = 3;
        }
        return PreferredWidth.zzW6(i, this.zzW6.zzXa());
    }

    private void zzXX5() throws Exception {
        int iZzYmD;
        this.zzW6.readByte();
        this.zzW6.readByte();
        byte b = this.zzW6.readByte();
        int i = b & 255;
        PreferredWidth preferredWidthZzXX4 = zzXX4();
        if (preferredWidthZzXX4.isFixed()) {
            iZzYmD = preferredWidthZzXX4.zzYmD();
        } else {
            zzY("Invalid table padding spacing read, replaced with defaults.", new Object[0]);
            i = b & 10;
            iZzYmD = 0;
        }
        if ((i & 2) != 0) {
            this.zzZF0.zzQ(zzYmO() ? 3090 : 4020, Integer.valueOf(iZzYmD));
        }
        if ((i & 1) != 0) {
            this.zzZF0.zzQ(zzYmO() ? 3070 : 4300, Integer.valueOf(iZzYmD));
        }
        if ((i & 4) != 0) {
            this.zzZF0.zzQ(zzYmO() ? 3080 : 4310, Integer.valueOf(iZzYmD));
        }
        if ((i & 8) != 0) {
            this.zzZF0.zzQ(zzYmO() ? 3100 : 4320, Integer.valueOf(iZzYmD));
        }
    }

    private void zzXX6() throws Exception {
        this.zzW6.readByte();
        this.zzW6.readByte();
        int i = this.zzW6.readByte() & 255;
        PreferredWidth preferredWidthZzXX4 = zzXX4();
        if (i == 15 && preferredWidthZzXX4.isValid()) {
            this.zzZF0.zzQ(4290, preferredWidthZzXX4);
        }
    }

    private void zzXX7() throws Exception {
        if (this.zzW6.readBoolean()) {
            zzY6G zzy6g = (zzY6G) ((zzY6G) this.zzZF0).zzYsN().zzZ6C();
            if (!zzy6g.contains(5100)) {
                zzWO zzwo = new zzWO();
                zzy6g.zzQ(5100, zzwo);
                for (int i = 0; i < ((zzY6G) this.zzZF0).zz5l().getCount(); i++) {
                    zzwo.zzU(new zzWP());
                }
                this.zzX4U.zzZ(zzwo);
            }
            this.zzZF0 = zzy6g;
        }
    }

    private void zzXX8() throws Exception {
        Shading shadingZzY = zzYCK.zzY(this.zzW6, (Shading) null);
        if (zzYmO()) {
            this.zzZF0.zzQ(3170, shadingZzY);
            return;
        }
        TableStyle tableStyle = this.zzYED;
        if (tableStyle == null) {
            zzY("Unexpected shading information occurred outside table style definition while reading DOC file.", new Object[0]);
        } else {
            tableStyle.zz6G().zzQ(3170, shadingZzY);
        }
    }

    private void zzXX9() throws Exception {
        if (this.zzX4U.zz5l() == null) {
            zzWO zzwo = new zzWO();
            ((zzY6G) this.zzZF0).zzQ(5100, zzwo);
            this.zzX4U.zzZ(zzwo);
        }
        this.zzX4U.zz5p();
    }

    private static int zzjR(int i) {
        if (i == 54399) {
            return 3110;
        }
        switch (i) {
            case 54912:
                return 3130;
            case 54913:
                return 3120;
            case 54914:
                return 3140;
            case 54915:
                return 3200;
            case 54916:
                return 3210;
            case 54917:
                return 3150;
            case 54918:
                return 3160;
            default:
                return 0;
        }
    }

    private void zzjS(int i) throws Exception {
        zzWj(4050, i);
        zzWj(4060, i);
        zzWj(4070, i);
        zzWj(4080, i);
        zzWj(4090, i);
        zzWj(EditingLanguage.CHINESE_SINGAPORE, i);
    }

    private void zzjT(int i) throws Exception {
        zzWO zzwo = new zzWO();
        ((zzY6G) this.zzZF0).zzQ(5100, zzwo);
        this.zzX4U.zzZ(zzwo);
        ((zzY6G) this.zzZF0).zzQ(5102, Integer.valueOf(this.zzX4U.zzOr(i)));
        if (((zzY6G) this.zzZF0).contains(4020) || ((zzY6G) this.zzZF0).contains(4320)) {
            return;
        }
        ((zzY6G) this.zzZF0).zzwx(0);
        ((zzY6G) this.zzZF0).zzwu(0);
    }

    public final void zzD(zzY6G zzy6g) {
        this.zzZF0 = zzy6g;
        this.zzX4W = zzy6g;
        this.zzX4V = 0;
        this.zzX4U = new zzWN(zzYmN().zzYUr);
        ((zzY6G) this.zzZF0).zzQ(4140, Integer.valueOf(TableStyleOptions.DEFAULT_2003));
    }

    public final void zzY(byte[] bArr, TableStyle tableStyle) throws Exception {
        this.zzYED = tableStyle;
        this.zzZF0 = tableStyle.zzZYf();
        this.zzXH2.zzXK(bArr);
        tableStyle.zzZYf().remove(4005);
        tableStyle.zzY(zzZ(tableStyle.zzZYf(), tableStyle.zzZYd(), 4360));
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            conditionalStyle.zzY(zzZ(conditionalStyle.zz6G(), conditionalStyle.zzZYd(), 4040));
        }
    }

    public final void zzYpf() {
        zzY6G zzy6g = this.zzX4W;
        this.zzZF0 = zzy6g;
        if (zzy6g.zz5l() == null || ((zzY6G) this.zzZF0).zz5l().getCount() == 0) {
            zzY("Cell properties is missing.", new Object[0]);
        }
    }

    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 != 5) {
            return true;
        }
        this.zzW6 = zzzox;
        if (zzYmN().zzZrB() && !zzYL2.zzpP(i)) {
            return true;
        }
        zzWN zzwn = this.zzX4U;
        if (zzwn != null && zzwn.zzZ(i, i2, i3, zzzox)) {
            return true;
        }
        switch (i) {
            case 197:
                zzjS(1);
                return true;
            case 13315:
                boolean z = !zzzox.readBoolean();
                if (zzYmN().zzYUr < 257) {
                    this.zzZF0.zzQ(4360, Boolean.valueOf(z));
                }
                return true;
            case 13316:
                this.zzZF0.zzQ(4040, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 13413:
                this.zzZF0.zzQ(4350, Boolean.valueOf(zzzox.readByte() == 0));
                return true;
            case 13414:
                this.zzZF0.zzQ(4360, Boolean.valueOf(!zzzox.readBoolean()));
                return true;
            case 13436:
                this.zzZF0.zzQ(3060, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 13448:
                this.zzZF0.zzQ(4500, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 13449:
                this.zzZF0.zzQ(4510, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 13837:
                zzWi(4150, 4160);
                return true;
            case 13845:
                this.zzZF0.zzQ(4240, Boolean.valueOf(zzzox.readByte() == 1));
                return true;
            case 13928:
                zzXX7();
                return true;
            case 21504:
                this.zzZF0.zzQ(5101, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 21642:
                WordAttrCollection wordAttrCollection = this.zzZF0;
                if (wordAttrCollection instanceof zzY6G) {
                    ((zzY6G) wordAttrCollection).setAlignment(zzzox.zzXa());
                }
                return true;
            case 22027:
                this.zzZF0.zzQ(4380, Boolean.valueOf(zzzox.zzXa() != 0));
                return true;
            case 22074:
                ((zzY6G) this.zzZF0).zzBl(zzzox.zzX9() & 65535);
                return true;
            case 22116:
                this.zzZF0.zzQ(5111, Boolean.valueOf(zzzox.zzXa() != 0));
                return true;
            case 29706:
                zzzox.zzXa();
                this.zzZF0.zzQ(4140, Integer.valueOf(zzY6G.zzjU(zzzox.zzXa())));
                return true;
            case 29801:
                this.zzZF0.zzQ(5015, Integer.valueOf(this.zzW6.zzXc()));
                return true;
            case 29817:
                this.zzZF0.zzQ(4400, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 30241:
                zzXX9();
                return true;
            case 37895:
                short sZzXa = zzzox.zzXa();
                this.zzZF0.zzQ(4120, new zzZKP(sZzXa != 0 ? sZzXa > 0 ? 0 : 1 : 2, Math.abs((int) sZzXa)));
                return true;
            case 37902:
                zzJ(4170, 4180, true);
                return true;
            case 37903:
                zzI(4190, 4200, true);
                return true;
            case 37904:
                this.zzZF0.zzQ(4210, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 37905:
                this.zzZF0.zzQ(4220, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 37918:
                this.zzZF0.zzQ(4270, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 37919:
                this.zzZF0.zzQ(4280, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 38401:
                short sZzXa2 = zzzox.zzXa();
                this.zzX4V = sZzXa2;
                this.zzZF0.zzQ(5108, Integer.valueOf(sZzXa2));
                return true;
            case 38402:
                short sZzXa3 = zzzox.zzXa();
                this.zzZF0.zzQ(5109, Integer.valueOf(sZzXa3));
                if (zzYmN().zzYUr <= 193) {
                    ((zzY6G) this.zzZF0).zzwx(sZzXa3);
                    ((zzY6G) this.zzZF0).zzwu(sZzXa3);
                }
                return true;
            case 54399:
            case 54912:
            case 54913:
            case 54914:
            case 54915:
            case 54916:
            case 54917:
            case 54918:
                if (i3 != 8) {
                    zzY("Invalid table formatting modifier 0x{0:x4}, ignored.", Integer.valueOf(i));
                    return true;
                }
                zzWj(zzjR(i), 3);
                return true;
            case 54789:
                zzjS(2);
                return true;
            case 54792:
                zzjT(i3);
                return true;
            case 54803:
                zzjS(3);
                return true;
            case 54835:
                zzXX6();
                return true;
            case 54836:
                zzXX5();
                return true;
            case 54880:
                zzpN(4330);
                return true;
            case 54887:
                zzY((WordAttrCollection) new zzY6G(), false);
                return true;
            case 54890:
                zzZ(this, zzzox, i3, 2);
                return true;
            case 54919:
                zzXX8();
                return true;
            case 62996:
                this.zzZF0.zzQ(4230, zzXX4());
                return true;
            case 62999:
                PreferredWidth preferredWidthZzXX4 = zzXX4();
                this.zzZF0.zzQ(4253, preferredWidthZzXX4);
                if (preferredWidthZzXX4.isFixed()) {
                    this.zzZF0.zzQ(4250, Integer.valueOf(preferredWidthZzXX4.zzYmD()));
                }
                return true;
            case 63000:
                PreferredWidth preferredWidthZzXX42 = zzXX4();
                this.zzZF0.zzQ(4261, preferredWidthZzXX42);
                if (preferredWidthZzXX42.isFixed()) {
                    this.zzZF0.zzQ(4260, Integer.valueOf(preferredWidthZzXX42.zzYmD()));
                }
                return true;
            case 63073:
                zzXX3();
                return true;
            default:
                if (i != 0) {
                    zzY(com.aspose.words.internal.zzZKN.format("Unknown formatting modifier 0x{0:x4} occurred while reading DOC file.", Integer.valueOf(i)), new Object[0]);
                }
                return false;
        }
    }

    private static zzY6G zzZ(WordAttrCollection wordAttrCollection, zzY6G zzy6g, int i) {
        if (wordAttrCollection == null || !wordAttrCollection.contains(i)) {
            return zzy6g;
        }
        if (zzy6g == null) {
            zzy6g = new zzY6G();
        }
        wordAttrCollection.zzY(zzy6g, i);
        return zzy6g;
    }
}

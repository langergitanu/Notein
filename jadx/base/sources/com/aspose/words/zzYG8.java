package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG8 extends zzYHS implements zzZ9H {
    private zzZS zzXu6;
    private Object zzXu7;
    private Object zzXu8;
    private Object zzXu9;
    private Object zzXua;
    private Object zzXub;
    private Object zzXuc;
    private zzYG4 zzXvr;
    private zzYFL zzXvs;
    private zzYFN zzXw5;

    public zzYG8(zzYFT zzyft) {
        super(zzyft);
    }

    private boolean zzX(zzYET zzyet) throws Exception {
        switch (zzYhQ()) {
            case 232:
                return this.zzXw5.zzX(zzyet);
            case 233:
                return this.zzXvs.zzX(zzyet);
            case 234:
                return this.zzXvr.zzX(zzyet);
            case 235:
                return true;
            default:
                return false;
        }
    }

    private void zzYh6() {
        if (zzYvR().zzPk(2030) == null) {
            zzYvR().zzQ(2030, 2);
        }
        this.zzXu6.zzX(zzYvR());
        zzYvR().zzZ(new zzZMK((zzYCZ) this.zzXu6, this.zzXw4.zzYgq(), this.zzXw4.zzYgp()));
    }

    private void zzYh7() {
        this.zzXu6 = zzYvR().zzbn();
        zzYvR().clear();
        this.zzXvs = new zzYFL(this.zzXw4, zzYvR());
    }

    private void zzYh8() {
        zzZNS.zzZ(zzZYj());
        zzZNS.zzZ((zzYMX) this.zzXu6);
        boolean z = zzZYj().zzPk(1000) != null;
        boolean z2 = this.zzXu6.zzPk(1000) != null;
        if (z && !z2) {
            zzZS zzzs = this.zzXu6;
            zzzs.zzQ(1000, zzzs.zzPi(1000));
        }
        this.zzXu6.zzX(zzZYj());
        this.zzXu6.remove(1610);
        this.zzXu6.remove(1640);
        this.zzXu6.remove(1620);
        this.zzXu6.remove(1630);
        if (this.zzXu8 != null) {
            zzZYj().zzQ(EditingLanguage.DIVEHI, this.zzXu8);
        }
        if (this.zzXu7 != null) {
            zzZYj().zzQ(1580, this.zzXu7);
        }
        if (this.zzXu6.getCount() > 0) {
            zzZYj().zzZ(new zzZMK((zzYMX) this.zzXu6, this.zzXw4.zzYgq(), this.zzXw4.zzYgp()));
        }
    }

    private void zzYh9() {
        this.zzXu8 = zzZYj().zzPk(EditingLanguage.DIVEHI);
        zzZYj().remove(EditingLanguage.DIVEHI);
        this.zzXu7 = zzZYj().zzPk(1580);
        zzZYj().remove(1580);
        this.zzXu6 = zzZYj().zzbn();
        zzZYj().clear();
        this.zzXvr = new zzYG4(this.zzXw4, this);
    }

    private int zzYhQ() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    private void zzYha() {
        zzZYh().remove(14);
        zzZYh().remove(12);
        zzZYh().remove(40);
        zzZYh().remove(30);
        zzYEF zzyef = (zzYEF) zzZYh().zzbn();
        this.zzXu6.zzY(zzZYh());
        zzyef.zzY(zzZYh());
        this.zzXu6.zzX(zzZYh());
        if (this.zzXu9 != null) {
            zzZYh().zzQ(14, this.zzXu9);
        }
        if (this.zzXua != null) {
            zzZYh().zzQ(12, this.zzXua);
        }
        if (this.zzXub != null) {
            zzZYh().zzQ(40, this.zzXub);
        }
        if (this.zzXuc != null) {
            zzZYh().zzQ(30, this.zzXuc);
        }
        zzZYh().zzZ(new zzZMK((zzYEF) this.zzXu6, this.zzXw4.zzYgq(), this.zzXw4.zzYgp()));
    }

    private void zzYhb() {
        this.zzXu9 = zzZYh().zzPk(14);
        zzZYh().remove(14);
        this.zzXua = zzZYh().zzPk(12);
        zzZYh().remove(12);
        this.zzXub = zzZYh().zzPk(40);
        zzZYh().remove(40);
        this.zzXuc = zzZYh().zzPk(30);
        zzZYh().remove(30);
        this.zzXu6 = zzZYh().zzbn();
        zzZYh().clear();
        this.zzXw5 = new zzYFN(this.zzXw4, this);
    }

    private zzYCZ zzYvR() {
        return zzYiL().zzYih().zzYvR();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (zzX(zzyet)) {
            return;
        }
        super.zzT(zzyet);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        switch (zzYhQ()) {
            case 232:
                zzYha();
                break;
            case 233:
                zzYh6();
                break;
            case 234:
                zzYh8();
                break;
            case 235:
                break;
            default:
                super.zzYjb();
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        switch (zzYhQ()) {
            case 232:
                zzYhb();
                break;
            case 233:
                zzYh7();
                break;
            case 234:
                zzYh9();
                break;
            case 235:
                break;
            default:
                super.zzZ(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return zzYiL().zzYih().zzZYh();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return zzYiL().zzYih().zzZYj();
    }
}

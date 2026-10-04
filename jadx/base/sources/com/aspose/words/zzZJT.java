package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJT extends zzZGR {
    private zzZYY zzYsX;
    private DocumentBuilder zzZwh;
    private String zzjy;

    public zzZJT(zzZGO zzzgo, int i, DocumentBuilder documentBuilder, zzZYY zzzyy, String str, int i2, String str2) {
        super(zzzgo, i, str);
        this.zzZwh = documentBuilder;
        this.zzYsX = zzzyy;
        zzzq(0);
        setNumberFormat(str);
        zzWY(zzZ1u().getListLevelNumber(), i2);
        this.zzjy = str2;
    }

    @Override // com.aspose.words.zzZGR
    public final void zzZ(zzZGB zzzgb) throws Exception {
        zzZGA zzzgaZzzf = zzzgb.zzzf(zzZ1u().getListLevelNumber());
        int iZzZ1s = zzZ1s();
        if (iZzZ1s == 0 || iZzZ1s == 1) {
            zzzgaZzzf.getListLevel().zzZYh().zzBp(this.zzjy);
        } else if (iZzZ1s == 2) {
            this.zzYsX.zzh(1, false);
            this.zzYsX.zzZ(zzzgaZzzf.getListLevel().getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
            this.zzYsX.zzh(0, false);
            if (((zzQ4) this.zzYsX.zzZUB().zzSx("font-family")) == null) {
                zzzgaZzzf.getListLevel().zzZYh().zzBp("Times New Roman");
            }
        }
        zzPT zzptZzSx = this.zzYsX.zzZUC().zzSx("-aw-font-weight");
        if (zzptZzSx != null) {
            boolean zZzP = zzptZzSx.zzZWj().zzP(zzL4.zzZn3);
            zzzgaZzzf.getListLevel().getFont().setBold(zZzP);
            zzzgaZzzf.getListLevel().getFont().setBoldBi(zZzP);
        }
    }
}

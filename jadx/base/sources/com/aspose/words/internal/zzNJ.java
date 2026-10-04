package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNJ {
    private boolean zzEU;
    private int zzEV;
    private int zzEW;
    private int zzEX;
    private zzZOR zzEY;
    private zzN6 zzFz;

    public zzNJ(zzN6 zzn6) {
        this.zzFz = zzn6;
    }

    private void zzLV() throws Exception {
        this.zzEY.zzH(0L);
        zzNH zznh = new zzNH(this.zzEY, this.zzFz);
        try {
            switch (this.zzEW) {
                case 1:
                    zzPY zzpyZzLU = zznh.zzLU();
                    if (zzpyZzLU != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zzpyZzLU);
                    }
                    break;
                case 2:
                    zzNC zzncZzLT = zznh.zzLT();
                    if (zzncZzLT != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zzncZzLT);
                    }
                    break;
                case 3:
                    zzP8 zzp8ZzLS = zznh.zzLS();
                    if (zzp8ZzLS != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zzp8ZzLS);
                    }
                    break;
                case 4:
                    zzON zzonZzLO = zznh.zzLO();
                    if (zzonZzLO != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zzonZzLO);
                    }
                    break;
                case 5:
                    zzNM zznmZzLR = zznh.zzLR();
                    if (zznmZzLR != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zznmZzLR);
                    }
                    break;
                case 6:
                    this.zzFz.zzKk().zzZ(this.zzEX, zznh.zzLP());
                    break;
                case 7:
                    zzN3 zzn3ZzLQ = zznh.zzLQ();
                    if (zzn3ZzLQ != null) {
                        this.zzFz.zzKk().zzZ(this.zzEX, zzn3ZzLQ);
                    }
                    break;
            }
        } catch (Exception unused) {
        }
        this.zzEY.close();
        this.zzEY = null;
        this.zzEU = false;
    }

    public final void zzLW() throws Exception {
        boolean zZzXu = this.zzFz.zzKm().zzLm().zzXu(0);
        int iZzn = this.zzFz.zzKm().zzLm().zzn(1, 7);
        int iZzn2 = this.zzFz.zzKm().zzLm().zzn(8, 15);
        if (this.zzEU) {
            this.zzFz.zzKl().zzXc();
            byte[] bArrZzn = this.zzFz.zzKl().zzn(this.zzFz.zzKm().getDataSize() - 4);
            this.zzEY.write(bArrZzn, 0, bArrZzn.length);
            if (!zZzXu || this.zzEY.getLength() >= this.zzEV) {
                zzLV();
                return;
            }
            return;
        }
        this.zzEY = new zzZOR();
        this.zzEX = iZzn2;
        this.zzEW = iZzn;
        if (zZzXu) {
            this.zzEU = true;
            this.zzEV = this.zzFz.zzKl().zzXc();
            byte[] bArrZzn2 = this.zzFz.zzKl().zzn(this.zzFz.zzKm().getDataSize() - 4);
            this.zzEY.write(bArrZzn2, 0, bArrZzn2.length);
            return;
        }
        this.zzEV = this.zzFz.zzKm().getDataSize();
        byte[] bArrZzn3 = this.zzFz.zzKl().zzn(this.zzFz.zzKm().getDataSize());
        this.zzEY.write(bArrZzn3, 0, bArrZzn3.length);
        zzLV();
    }
}

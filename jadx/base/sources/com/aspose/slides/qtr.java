package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class qtr extends C14270p8 {
    public qtr(C14270p8 c14270p8) {
        super(c14270p8);
    }

    @Override // com.aspose.slides.C14270p8
    /* JADX INFO: renamed from: x1 */
    public int mo68973x1() {
        int iMo68973x1;
        do {
            iMo68973x1 = super.mo68973x1();
            if (iMo68973x1 < 128 || (iMo68973x1 & 192) == 192) {
                break;
            }
        } while (iMo68973x1 != 65536);
        if (iMo68973x1 < 128 || iMo68973x1 == 65536) {
            return iMo68973x1;
        }
        if ((iMo68973x1 & 240) == 240) {
            int iMo68973x12 = super.mo68973x1() & 63;
            return ((((((iMo68973x1 & 7) << 6) | iMo68973x12) << 6) | (super.mo68973x1() & 63)) << 6) | (super.mo68973x1() & 63);
        }
        if ((iMo68973x1 & 224) == 224) {
            return ((((iMo68973x1 & 15) << 6) | (super.mo68973x1() & 63)) << 6) | (super.mo68973x1() & 63);
        }
        if ((iMo68973x1 & 192) != 192) {
            return iMo68973x1;
        }
        return ((iMo68973x1 & 31) << 6) | (super.mo68973x1() & 63);
    }
}

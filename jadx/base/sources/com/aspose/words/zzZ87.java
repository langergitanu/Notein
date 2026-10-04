package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ87 implements zzZBR {
    private zzZ6R zzYj1;
    private zzYNA zzYj2;
    private ImageSaveOptions zzYj3;
    private com.aspose.words.internal.zzH6 zzl7;

    private void zzYZ(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZH zzzhZzyj = zzyj(this.zzYj3.getPageSet().zzYq1().zzqJ(this.zzYj2.getCount()));
        zzYDY.zzZ(zzzhZzyj, zzzhZzyj.getSize(), zzzop, this.zzYj3, this.zzl7);
    }

    private void zzZ0(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        PageSet pageSet = this.zzYj3.getPageSet();
        if (pageSet.zzYq1().zzqK(this.zzYj2.getCount()) < 2) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: PageCount");
        }
        zzYN3 zzyn3ZzqI = pageSet.zzYq1().zzqI(this.zzYj2.getCount());
        zzyn3ZzqI.hasNext();
        com.aspose.words.internal.zzXN zzxnZzyk = zzyk(zzyn3ZzqI.next().intValue());
        try {
            com.aspose.words.internal.zzZWF zzzwf = new com.aspose.words.internal.zzZWF();
            try {
                int iZzYVP = this.zzYj3.zzYVP();
                int iZzYVO = this.zzYj3.zzYVO();
                byte thresholdForFloydSteinbergDithering = this.zzYj3.getThresholdForFloydSteinbergDithering();
                this.zzYj3.zzYVQ();
                zzzwf.zzZ(zzzop, iZzYVP, iZzYVO, thresholdForFloydSteinbergDithering, zzxnZzyk);
                while (zzyn3ZzqI.hasNext()) {
                    com.aspose.words.internal.zzXN zzxnZzyk2 = zzyk(zzyn3ZzqI.next().intValue());
                    try {
                        zzzwf.zzU(zzxnZzyk2);
                        if (zzxnZzyk2 != null) {
                            zzxnZzyk2.dispose();
                        }
                    } catch (Throwable th) {
                        if (zzxnZzyk2 != null) {
                            zzxnZzyk2.dispose();
                        }
                        throw th;
                    }
                }
                if (zzxnZzyk != null) {
                    zzxnZzyk.dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
        }
    }

    private static String zzyi(int i) {
        switch (i) {
            case 100:
                return "image/tiff";
            case 101:
                return "image/png";
            case 102:
                return "image/bmp";
            case 103:
                return "image/x-emf";
            case 104:
                return "image/jpeg";
            case 105:
                return "image/gif";
            case 106:
                return "image/x-eps";
            default:
                throw new IllegalStateException("Unknown save format requested.");
        }
    }

    private com.aspose.words.internal.zzZH zzyj(int i) throws Exception {
        return new zzZ72().zzZ(this.zzYj2.zzqO(i), this.zzYj1);
    }

    private com.aspose.words.internal.zzXN zzyk(int i) throws Exception {
        com.aspose.words.internal.zzZH zzzhZzyj = zzyj(i);
        return zzYDY.zzZ(zzzhZzyj, zzzhZzyj.getSize(), this.zzYj3, this.zzl7);
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzYj3 = (ImageSaveOptions) zzydz.zzXpa;
        Document document = zzydz.zzYfy;
        this.zzYj2 = document.zzZqh();
        this.zzYj1 = document.zzZqg();
        this.zzl7 = document.zzZqx();
        int iZzqK = this.zzYj3.getSaveFormat() == 100 ? this.zzYj3.getPageSet().zzYq1().zzqK(this.zzYj2.getCount()) : 1;
        if (this.zzYj3.getSaveFormat() != 100 || iZzqK <= 1) {
            zzYZ(zzydz.zzXpb);
        } else {
            zzZ0(zzydz.zzXpb);
        }
        return new SaveOutputParameters(zzyi(this.zzYj3.getSaveFormat()));
    }
}

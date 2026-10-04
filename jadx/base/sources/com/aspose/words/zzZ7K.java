package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7K {
    private static com.aspose.words.internal.zzPV zzP(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        int iZzPB = zzpv.zzPB();
        if (iZzPB == 1) {
            double dZzPA = (255.0d - ((double) zzpv.zzPA())) / 255.0d;
            com.aspose.words.internal.zzIQ zziq = new com.aspose.words.internal.zzIQ(zzpv2);
            zziq.zzo(com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzAN.zzR(((double) zziq.zzGy()) - (((double) zziq.zzGy()) * dZzPA), 0.0d, 255.0d)));
            return zziq.zzGx();
        }
        if (iZzPB == 2) {
            double dZzPA2 = (255.0d - ((double) zzpv.zzPA())) / 255.0d;
            com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv2);
            zzip.zzZQ(((1.0d - zzip.zzGu()) * dZzPA2) + zzip.zzGu());
            return zzip.zzGx();
        }
        if (iZzPB != 3) {
            return zzpv2;
        }
        return new com.aspose.words.internal.zzPV((int) com.aspose.words.internal.zzAN.zzZ(zzpv.zzPA() + zzpv2.zzPC(), 0.0f, 255.0f), (int) com.aspose.words.internal.zzAN.zzZ(zzpv.zzPA() + zzpv2.zzPB(), 0.0f, 255.0f), (int) com.aspose.words.internal.zzAN.zzZ(zzpv.zzPA() + zzpv2.zzPA(), 0.0f, 255.0f));
    }

    private static com.aspose.words.internal.zzPV zzY(com.aspose.words.internal.zzPV zzpv, Shape shape) {
        switch (zzpv.zzPC()) {
            case 240:
                return shape.zzY9J().zz8Q();
            case 241:
                return (!shape.getStroked() || shape.getStroke() == null || shape.getStroke().zz8Q() == null) ? shape.zzY9J().zz8Q() : shape.getStroke().zz8Q();
            case 242:
                return shape.getStroke().zz8Q();
            case 243:
                return shape.zzYbi();
            default:
                return zzpv;
        }
    }

    public static com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, Shape shape) {
        return zzpv.zzPD() != 239 ? zzpv : zzP(zzpv, zzY(zzpv, shape));
    }
}

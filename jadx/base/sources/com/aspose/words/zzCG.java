package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCG {
    public static boolean zzV(DocumentBase documentBase) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(documentBase, Document.class);
        return document == null || (document.getBuiltInDocumentProperties().getVersion() >> 16) <= 12;
    }

    public static boolean zzY1(double d) {
        com.aspose.words.internal.zzZQ9 zzzq9ZzY3 = zzY3(d);
        return com.aspose.words.internal.zzZQ9.zzW(zzzq9ZzY3, com.aspose.words.internal.zzZQ9.zz35) && com.aspose.words.internal.zzZQ9.zzY(zzzq9ZzY3, com.aspose.words.internal.zzZQ9.zz34);
    }

    private static com.aspose.words.internal.zzZQ9 zzY2(double d) {
        double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(d);
        double d2 = d - dZzZa;
        com.aspose.words.internal.zzZQ9 zzzq9ZzZg = com.aspose.words.internal.zzZQ9.zzZg(dZzZa);
        return com.aspose.words.internal.zzAN.zzZD(d2) ? zzzq9ZzZg : zzzq9ZzZg.zzZi(com.aspose.words.internal.zzZKQ.zzZa(d2 / 1.15740740727512E-5d));
    }

    public static com.aspose.words.internal.zzZQ9 zzY3(double d) {
        if (d < 61.0d) {
            d += d < 1.0d ? 2.0d : 1.0d;
        }
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzAN.zzK(d, zzzq9.zzkM())) {
            return zzzq9;
        }
        com.aspose.words.internal.zzZQ9 zzzq92 = com.aspose.words.internal.zzZQ9.zz34;
        return com.aspose.words.internal.zzAN.zzJ(d, zzzq92.zzkM()) ? zzzq92 : zzY2(d);
    }

    public static double zzp(com.aspose.words.internal.zzZQ9 zzzq9) {
        double dZzkM = zzzq9.zzkM();
        if (dZzkM < 61.0d) {
            return dZzkM - (dZzkM >= 2.0d ? 1.0d : 2.0d);
        }
        return dZzkM;
    }
}

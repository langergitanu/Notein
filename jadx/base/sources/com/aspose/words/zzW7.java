package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzW7 {
    private static boolean zzV(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        if (zzzop.getLength() != zzzop2.getLength()) {
            return false;
        }
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
        byte[] bArr = new byte[2048];
        byte[] bArr2 = new byte[2048];
        while (true) {
            int i = zzzop.read(bArr, 0, 2048);
            zzzop2.read(bArr2, 0, 2048);
            if (i == 0) {
                return true;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
    }

    public static boolean zzZ(Shape shape, Shape shape2) throws Exception {
        if (shape.hasChart()) {
            shape2.hasChart();
        }
        return zzZ(zzZ(shape), zzZ(shape2));
    }

    private static com.aspose.words.internal.zz78 zzZ(Shape shape) throws Exception {
        shape.getDocument().getNodeType();
        Document document = (Document) shape.getDocument();
        zzZW2 zzzw2 = new zzZW2();
        zzzw2.zzW(new zzYDZ(document, null, null, new OoxmlSaveOptions()));
        zzZXS zzzxs = new zzZXS(zzzw2, new com.aspose.words.internal.zzZWT(null));
        zzzxs.zzT(zzzxs.zzZmf().zzZ(null, "tmp.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", zzzxs.zzZmp().zzZkX()));
        zzYO3 zzyo3ZzZqn = document.zzZqn();
        if (zzyo3ZzZqn == null) {
            zzyo3ZzZqn = new zzYO3();
            zzyo3ZzZqn.zzYrc();
        }
        if (shape.getChart().getChartSpace().zz33()) {
            zzyo3ZzZqn.zzqU(16);
        }
        zzzxs.zzY(new zzZYD(zzzxs.zzZme(), true, zzyo3ZzZqn.getCompliance(), zzyo3ZzZqn.zzZlO(), null));
        zzC7.zzY(shape, zzzxs);
        return zzzw2.zzZmf();
    }

    private static boolean zzZ(com.aspose.words.internal.zz78 zz78Var, com.aspose.words.internal.zz78 zz78Var2) throws Exception {
        if (zz78Var.zzxo().getCount() != zz78Var2.zzxo().getCount()) {
            return false;
        }
        for (com.aspose.words.internal.zz77 zz77Var : zz78Var.zzxo()) {
            com.aspose.words.internal.zz77 zz77VarZzY8 = zz78Var2.zzxo().zzY8(zz77Var.getName());
            if (zz77VarZzY8 == null || !zzV(zz77Var.zzR1(), zz77VarZzY8.zzR1())) {
                return false;
            }
        }
        return true;
    }
}

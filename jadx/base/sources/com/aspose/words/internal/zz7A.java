package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7A extends zz78 {
    private static final zzZHW zzUR = new zzZHW("xmlData", "binaryData");

    public zz7A() {
    }

    private static String zz6(zzZOP zzzop) throws Exception {
        int iZzW;
        String strZziv = new zzZOO(zzzop).zziv();
        int i = zzZOF.ORDINAL$4894b8c8;
        int iZzT = zzZKN.zzT(strZziv, "<?xml", i);
        return (iZzT == -1 || (iZzW = zzZKN.zzW(strZziv, "?>", iZzT + 5, i)) == -1) ? strZziv : strZziv.substring(iZzW + 2);
    }

    private void zz7(zzZOP zzzop) throws Exception {
        zzO zzo = new zzO(zzzop);
        while (zzo.zzQ("package")) {
            if ("part".equals(zzo.getLocalName())) {
                zzxo().zzY(zzY(zzo));
            } else {
                zzo.zzk();
            }
        }
    }

    private void zz8(zzZOP zzzop) throws Exception {
        zz7(zzzop);
        zzxp();
    }

    private static zz77 zzY(zzO zzo) throws Exception {
        String strZzV = zzo.zzV("name", "");
        String strZzV2 = zzo.zzV("contentType", "");
        zzo.zzV("compression", "store");
        zz77 zz77Var = new zz77(strZzV, strZzV2);
        zzo.zzQ("part");
        int iZzTP = zzUR.zzTP(zzo.getLocalName());
        if (iZzTP == 0) {
            zzZON zzzon = new zzZON(zz77Var.zzR1());
            zzo.zzQ("xmlData");
            zzzon.write(zzo.zzf());
            zzzon.flush();
        } else if (iZzTP == 1) {
            byte[] bArrZzVT = zzZQB.zzVT(zzo.readString());
            zz77Var.zzR1().write(bArrZzVT, 0, bArrZzVT.length);
        }
        zz77Var.zzR1().zzH(0L);
        return zz77Var;
    }

    @Override // com.aspose.words.internal.zz78
    public final void zzL(zzZOP zzzop) throws Exception {
        zzP zzp = new zzP(zzzop, true);
        zzp.zzV(true);
        zzp.zzW("mso-application", "progid=\"Word.Document\"");
        zzp.zzY("pkg:package");
        zzp.zzX("xmlns:pkg", "http://schemas.microsoft.com/office/2006/xmlPackage");
        for (zz77 zz77Var : zzxo()) {
            zz77Var.zzR1().zzH(0L);
            zzp.zzY("pkg:part");
            zzp.zzX("pkg:name", zz77Var.getName());
            zzp.zzX("pkg:contentType", zz77Var.getContentType());
            if (zzZKN.zzW(zz77Var.getContentType(), "xml", zzZOF.ORDINAL$4894b8c8)) {
                zzp.zzY("pkg:xmlData");
                zzp.zzX(zz6(zz77Var.zzR1()));
                zzp.zzp();
            } else {
                zzp.zzX("pkg:compression", "store");
                zzp.zzY("pkg:binaryData");
                zzp.zzX(zz77Var.zzR1());
                zzp.zzp();
            }
            zzp.zzp();
        }
        zzp.endDocument();
    }

    public zz7A(zzZOP zzzop) throws Exception {
        zz8(zzzop);
    }
}

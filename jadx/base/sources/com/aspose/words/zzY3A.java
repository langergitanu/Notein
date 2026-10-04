package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3A {
    private DocumentBuilder zzYRM;
    private static com.aspose.words.internal.zzZYG<String> zzWZX = zzXTM();
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("html", "thumbnail_url");

    public zzY3A(DocumentBuilder documentBuilder) {
        this.zzYRM = documentBuilder;
    }

    private static zz3V zzV(String str, byte[] bArr, int i) throws Exception {
        zz3V zz3v = new zz3V();
        zz3v.zzZ(zz7G.zzOA(DrawToolFactory.LASSO_TYPE_RECT));
        zzH0 zzh0 = new zzH0();
        zzh0.zzZQ1().setExtensions(new com.aspose.words.internal.zzZYG<>());
        zz82 zz82Var = new zz82("{C809E66F-F1BF-436E-b5F7-EEA9579F0CBA}", null);
        zz82Var.zzZ(new zzZZW(str));
        zzh0.zzZQ1().getExtensions().zzW("{C809E66F-F1BF-436E-b5F7-EEA9579F0CBA}", zz82Var);
        if (bArr == null) {
            bArr = zzXTN();
        }
        zzh0.zzZQ1().zzYt(bArr);
        zz3v.zzZ(zzh0);
        zz4N zz4n = new zz4N();
        zz4n.zzY(new zz4T(i, ""));
        zz4n.zzZ(new zzBY());
        zz3v.zzZ(zz4n);
        return zz3v;
    }

    private static com.aspose.words.internal.zzZYG<String> zzXTM() {
        com.aspose.words.internal.zzZYG<String> zzzyg = new com.aspose.words.internal.zzZYG<>();
        zzWZX = zzzyg;
        zzzyg.zzW("youtube.com", "https://www.youtube.com/oembed");
        zzWZX.zzW("www.youtube.com", "https://www.youtube.com/oembed");
        zzWZX.zzW("youtu.be", "https://www.youtube.com/oembed");
        zzWZX.zzW("vimeo.com", "https://vimeo.com/api/oembed.xml");
        return zzWZX;
    }

    private static byte[] zzXTN() throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(10, 10);
        try {
            com.aspose.words.internal.zzIY zziy = new com.aspose.words.internal.zzIY(zzxn);
            try {
                zziy.zzZ(com.aspose.words.internal.zzPV.zzKa, 10.0f, 10.0f);
                zziy.dispose();
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                try {
                    zzxn.zzZ(zzzor, 6);
                    return zzzor.zzWy();
                } finally {
                    zzzor.close();
                }
            } catch (Throwable th) {
                zziy.dispose();
                throw th;
            }
        } finally {
            zzxn.dispose();
        }
    }

    public final Shape zzZ(String str, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzX0;
        String string;
        String str2;
        String host = new com.aspose.words.internal.zzZKL(str).getHost();
        String string2 = "";
        String str3 = zzWZX.containsKey(host) ? zzWZX.get(host) : "";
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            try {
                zzzopZzX0 = com.aspose.words.internal.zzZXR.zzX0(com.aspose.words.internal.zzZKN.format(str3 + "?url={0}&format=xml&maxwidth={1}&maxheight={2}", str, Double.valueOf(640.0d), Double.valueOf(390.0d)));
            } catch (Exception e) {
                zzY1Z.zzZ(this.zzYRM.getDocument().getWarningCallback(), 16777216, 0, e.getMessage());
                zzzopZzX0 = null;
            }
            if (zzzopZzX0 != null) {
                zzYU4 zzyu4 = new zzYU4(zzzopZzX0);
                string = "";
                while (zzyu4.zzQ("oembed")) {
                    int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                    if (iZzTP == 0) {
                        string = zzyu4.readString();
                    } else if (iZzTP != 1) {
                        zzyu4.zzk();
                    } else {
                        string2 = zzyu4.readString();
                    }
                }
                zzzopZzX0.close();
            } else {
                string = "";
            }
            str2 = string;
        } else {
            zzY1Z.zzZ(this.zzYRM.getDocument().getWarningCallback(), 16777216, 0, com.aspose.words.internal.zzZKN.format("Video from {0} can not be embedded. Please contact us through the Aspose.Words support forum: https://www.aspose.com/community/forums/default.aspx.", host));
            str2 = "";
        }
        return zzZ(str, str2, com.aspose.words.internal.zzZYD.zzXk(string2) ? zzZ8I.zzZ(string2, this.zzYRM.getDocument()) : null, i, d, i2, d2, d3, d4, i3);
    }

    public final Shape zzZ(String str, String str2, byte[] bArr, int i, double d, int i2, double d2, double d3, double d4, int i3) throws Exception {
        this.zzYRM.getDocument().getCompatibilityOptions().optimizeFor(5);
        zzYO3.zzd(this.zzYRM.getDocument());
        Shape shape = new Shape((DocumentBase) this.zzYRM.getDocument(), (byte) 0);
        shape.zzZ(this.zzYRM.zzZpG());
        shape.setRelativeHorizontalPosition(i);
        shape.setRelativeVerticalPosition(i2);
        shape.setLeft(d);
        shape.setTop(d2);
        shape.setWrapType(i3);
        shape.setShapeType(75);
        shape.setShapeAttr(898, str);
        shape.zzU(zzV(str2, bArr, this.zzYRM.getDocument().zzZq0()));
        shape.zze(d3, d4);
        this.zzYRM.insertNode(shape);
        return shape;
    }
}

package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYT implements zzZBR {
    private static com.aspose.words.internal.zzZO0 zzXYK = com.aspose.words.internal.zzZO0.zzhX();
    private zzTA zzXYL;
    private HtmlSaveOptions zzZE9;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZON zzZsj;

    private static String zzI5(String str) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zzzor);
            try {
                zzzon.write(str);
                zzzon.flush();
                zzzor.zzH(0L);
                int length = (int) zzzor.getLength();
                byte[] bArr = new byte[length];
                int i = 0;
                while (true) {
                    int i2 = zzzor.read(bArr, i, length);
                    if (i2 == 0) {
                        return com.aspose.words.internal.zzZKN.format("=?utf-8?B?{0}?=", com.aspose.words.internal.zzZQB.zzYT(bArr));
                    }
                    i += i2;
                    length -= i2;
                }
            } finally {
                zzzon.close();
            }
        } finally {
            zzzor.close();
        }
    }

    private static String zzI6(String str) throws Exception {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                return zzI5(str);
            }
        }
        return str;
    }

    private void zzSN(boolean z) throws Exception {
        if (!this.zzZE9.zzYZ6()) {
            String str = this.zzZE9.getExportGeneratorName() ? "Aspose.Words for Android via Java 24.3.0" : "MHTML Document";
            this.zzZsj.zzXB("From: <" + str + ">");
            String title = this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getTitle();
            String strZzI6 = com.aspose.words.internal.zzZYD.zzXk(title) ? zzI6(title) : "Untitled";
            this.zzZsj.zzXB("Subject: " + strZzI6);
            if (this.zzZE9.zzYZ7()) {
                String strZzN = com.aspose.words.internal.zzJB.zzN(com.aspose.words.internal.zzR1.zzQO());
                this.zzZsj.zzXB("Date: " + strZzN);
            }
        }
        this.zzZsj.zzXB("MIME-Version: 1.0");
        if (z) {
            this.zzZsj.zzXB("Content-Type: multipart/related;");
            this.zzZsj.zzXB("\ttype=\"text/html\";");
            this.zzZsj.zzXB("\tboundary=\"=boundary.Aspose.Words=--\"");
            this.zzZsj.zzFg();
            this.zzZsj.zzXB("This is a multi-part message in MIME format.");
        }
    }

    private void zzYDk() throws Exception {
        this.zzZsj.zzFg();
        this.zzZsj.zzXB("--=boundary.Aspose.Words=----");
    }

    private void zzZ(boolean z, String str, String str2, String str3, String str4) throws Exception {
        if (z) {
            this.zzZsj.zzFg();
            this.zzZsj.zzXB("--=boundary.Aspose.Words=--");
        }
        this.zzZsj.zzXB("Content-Disposition: inline;");
        this.zzZsj.zzXB("\tfilename=\"" + str4 + "\"");
        this.zzZsj.write("Content-Type: " + str);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzZsj.zzXB(";");
            this.zzZsj.write("\tcharset=\"" + str2 + "\"");
        }
        this.zzZsj.zzFg();
        this.zzZsj.zzXB("Content-Transfer-Encoding: " + str3);
        if (this.zzZE9.getExportCidUrlsForMhtmlResources()) {
            this.zzZsj.zzXB("Content-ID: <" + str4 + ">");
        } else {
            this.zzZsj.zzXB("Content-Location: " + str4);
        }
        this.zzZsj.zzFg();
    }

    private static boolean zzuc(int i) {
        return i == 1200 || i == 1201 || i == 12000 || i == 12001;
    }

    private void zzZ(zzY87 zzy87) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZz9P = zzy87.zz9P();
        try {
            try {
                if (zzy87.isText() && !zzuc(zzy87.zzY1F().getCodePage())) {
                    zzZ(true, zzy87.getContentType(), zzy87.zzY1F().zzi1(), "quoted-printable", zzy87.getUri());
                    this.zzXYL.zzZA(zzzorZz9P);
                } else {
                    try {
                        zzZ(true, zzy87.getContentType(), null, "base64", zzy87.getUri());
                        this.zzXYL.zzX(zzzorZz9P);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        zzzorZz9P.close();
                        throw th2;
                    }
                }
                zzzorZz9P.close();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        zzYYT zzyyt;
        zzydz.zzXpa.getSaveFormat();
        this.zzZFZ = zzydz;
        zzydz.zzYdd();
        HtmlSaveOptions htmlSaveOptionsZzYZe = ((HtmlSaveOptions) this.zzZFZ.zzXpa).zzYZe();
        this.zzZE9 = htmlSaveOptionsZzYZe;
        htmlSaveOptionsZzYZe.setExportFontsAsBase64(false);
        if (this.zzZE9.getDocumentSplitCriteria() == 0) {
            com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zzydz.zzXpb, zzXYK);
            this.zzZsj = zzzon;
            this.zzXYL = new zzTA(zzzon);
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                zzY86 zzy86 = new zzY86();
                zzYDZ zzydz2 = this.zzZFZ;
                new zzZJ2(zzydz2.zzYfy, zzzor, null, this.zzZE9, zzydz2, zzy86, null).zzZ3I();
                zzzor.zzH(0L);
                ArrayList<zzY87> arrayListZzyD = zzy86.zzyD();
                boolean z = arrayListZzyD.size() != 0;
                zzSN(z);
                com.aspose.words.internal.zzZO0 zzzo0ZzZ9Y = this.zzZE9.zzZ9Y();
                try {
                    if (zzuc(zzzo0ZzZ9Y.getCodePage())) {
                        zzyyt = this;
                        zzyyt.zzZ(z, "text/html", zzzo0ZzZ9Y.zzi1(), "base64", "document.html");
                        zzyyt.zzXYL.zzX(zzzor);
                    } else {
                        zzyyt = this;
                        zzyyt.zzZ(z, "text/html", zzzo0ZzZ9Y.zzi1(), "quoted-printable", "document.html");
                        zzyyt.zzXYL.zzZA(zzzor);
                    }
                    zzzor.close();
                    if (z) {
                        Iterator<zzY87> it = arrayListZzyD.iterator();
                        while (it.hasNext()) {
                            zzZ(it.next());
                        }
                        zzYDk();
                    }
                    zzyyt.zzZsj.flush();
                    return new SaveOutputParameters("multipart/related");
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    zzzor.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("Document cannot be split when saving in MHTML format.");
        }
    }
}

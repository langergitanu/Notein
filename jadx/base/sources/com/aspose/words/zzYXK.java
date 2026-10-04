package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYXK {
    private zzYY8 zzXXo;
    private zzYXW zzXXp;
    private com.aspose.words.internal.zzXZ zzXYi;
    private HtmlSaveOptions zzZE9;
    private zzYDZ zzZFZ;

    private void zzG(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        this.zzXXp.zzYCs();
        this.zzXYi.zzk(1179602516);
        this.zzXYi.zzk((int) zzzor.getLength());
        this.zzXYi.zzk(1);
        this.zzXYi.zzk(24);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(24);
        this.zzXYi.writeBytes(com.aspose.words.internal.zzZRV.zzT(zzzor, 1));
    }

    public static ArrayList<zzYM> zzW(zzY86 zzy86) {
        ArrayList<zzYM> arrayList = new ArrayList<>();
        for (zzY87 zzy87 : zzy86.zzyD()) {
            if ("application/octet-stream".equals(zzy87.getContentType()) && (zzy87 instanceof zzYM)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzYM) zzy87);
            }
        }
        return arrayList;
    }

    public static ArrayList<zzYXS> zzX(String str, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        byte[] bArr;
        ArrayList<zzYXS> arrayList = new ArrayList<>();
        char[] charArray = str.toCharArray();
        byte[] bArr2 = new byte[4099];
        com.aspose.words.internal.zzZO3 zzzo3Zzik = zzzo0.zzik();
        byte[] bArr3 = new byte[0];
        int i = 0;
        byte[] bArr4 = bArr3;
        while (i < charArray.length) {
            com.aspose.words.internal.zzZKV.zzZ(bArr4, 0, bArr2, 0, bArr4.length);
            int length = bArr4.length;
            RefInt refInt = new RefInt(0);
            RefInt refInt2 = new RefInt(0);
            RefBoolean refBoolean = new RefBoolean(false);
            zzzo3Zzik.zzZ(charArray, i, charArray.length - i, bArr2, length, 4096 - length, refInt, refInt2, refBoolean);
            int i2 = refInt.get();
            int i3 = refInt2.get();
            refBoolean.get();
            i += i2;
            int i4 = length + i3;
            if (i < charArray.length && i4 < 4096) {
                RefInt refInt3 = new RefInt(0);
                RefInt refInt4 = new RefInt(0);
                RefBoolean refBoolean2 = new RefBoolean(false);
                zzzo3Zzik.zzZ(charArray, i, 1, bArr2, i4, 4, refInt3, refInt4, refBoolean2);
                int i5 = refInt3.get();
                int i6 = refInt4.get();
                refBoolean2.get();
                i += i5;
                i4 += i6;
            }
            byte[] bArrZzo = zzYXZ.zzo(bArr2, Math.min(i4, 4096));
            if (i4 > 4096) {
                int i7 = i4 - 4096;
                bArr = new byte[i7];
                com.aspose.words.internal.zzZKV.zzZ(bArr2, 4096, bArr, 0, i7);
            } else {
                bArr = bArr3;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYXS(bArrZzo, bArr));
            bArr4 = bArr;
        }
        return arrayList;
    }

    public final void zzF(int i, int i2, int i3, int i4) throws Exception {
        this.zzXXp.zzYCs();
        zzYY8 zzyy8 = new zzYY8(this.zzXYi, this.zzZE9.zzZ9Y());
        this.zzXXo = zzyy8;
        zzyy8.zzZ(i, i2, i3, i4, this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getTitle(), this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getAuthor(), this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getSubject(), this.zzZE9.getExportGeneratorName() ? "Aspose.Words for Android via Java 24.3.0" : "");
    }

    public final void zzN(com.aspose.words.internal.zzXZ zzxz) {
        this.zzXYi = zzxz;
    }

    public final zzYY8 zzYC3() {
        return this.zzXXo;
    }

    public final zzYXW zzYC4() {
        return this.zzXXp;
    }

    public final HtmlSaveOptions zzYC5() {
        return this.zzZE9;
    }

    public final void zzYC6() throws Exception {
        this.zzXXp.zzYCs();
        this.zzXYi.zzk(-376566518);
    }

    public final void zzYC7() throws Exception {
        int iZzYCr = this.zzXXp.zzYCr();
        this.zzXXp.zzYCs();
        this.zzXXo.zzu2(iZzYCr);
        this.zzXXo.zzYCE();
        this.zzXYi.zzk(1179404627);
        this.zzXYi.zzk(8);
        this.zzXYi.zzk(4259840);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(-1);
        this.zzXYi.zzk(65539);
        this.zzXYi.zzk(3);
        this.zzXYi.zzk(1);
        this.zzXYi.zzk(-1);
    }

    public final com.aspose.words.internal.zzXZ zzYCU() {
        return this.zzXYi;
    }

    public final void zzZl(ArrayList<zzYM> arrayList) throws Exception {
        Iterator<zzYM> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZOR zzzorZz9P = it.next().zz9P();
            try {
                zzG(zzzorZz9P);
            } finally {
                zzzorZz9P.close();
            }
        }
    }

    public final void zzZm(ArrayList<zzYM> arrayList) throws Exception {
        for (zzYM zzym : arrayList) {
            this.zzXXp.zzYCs();
            com.aspose.words.internal.zzZOR zzzorZz9P = zzym.zz9P();
            try {
                this.zzXYi.zzW(zzzorZz9P.zziA(), (int) zzzorZz9P.getLength());
            } finally {
                zzzorZz9P.close();
            }
        }
    }

    public final void zzZn(ArrayList<zzYXS> arrayList) throws Exception {
        for (zzYXS zzyxs : arrayList) {
            this.zzXXp.zzYCs();
            zzyxs.zzX(this.zzXYi);
        }
    }

    public final void zzZo(ArrayList<zzYYG> arrayList) throws Exception {
        for (zzYYG zzyyg : arrayList) {
            this.zzXXp.zzYCs();
            zzyyg.zzO(this.zzXYi);
        }
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    public final void zztM(int i) throws Exception {
        int iZzYCr = this.zzXXp.zzYCr();
        this.zzXXp.zzYCs();
        this.zzXXo.zzu3(iZzYCr);
        this.zzXXo.zzYCF();
        this.zzXYi.zzk(1178814803);
        this.zzXYi.zzk(20);
        this.zzXYi.zzk(16);
        this.zzXYi.zzk(2);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(i);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(40);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(40);
        this.zzXYi.zzk(8);
        this.zzXYi.zzk(65537);
        this.zzXYi.zzk(0);
    }

    public final void zztN(int i) throws Exception {
        String strZzVh = com.aspose.words.internal.zzZOQ.zzVh(this.zzZFZ.zzYfy.zzZqA());
        zzYXW zzyxw = new zzYXW(this.zzXYi);
        this.zzXXp = zzyxw;
        zzyxw.zzZ(strZzVh, com.aspose.words.internal.zzR1.zzQO(), i);
    }

    public final void zzW(zzYDZ zzydz) {
        this.zzZFZ = zzydz;
    }

    public final void zzW(HtmlSaveOptions htmlSaveOptions) {
        this.zzZE9 = htmlSaveOptions;
    }

    public static void zzX(HtmlSaveOptions htmlSaveOptions) {
        htmlSaveOptions.setImagesFolder("");
        htmlSaveOptions.setImagesFolderAlias("");
        htmlSaveOptions.setFontsFolder("");
        htmlSaveOptions.setFontsFolderAlias("");
        htmlSaveOptions.setResourceFolder("");
        htmlSaveOptions.setResourceFolderAlias("");
        htmlSaveOptions.setExportImagesAsBase64(false);
        htmlSaveOptions.setExportFontsAsBase64(false);
        htmlSaveOptions.setExportDropDownFormFieldAsText(true);
        htmlSaveOptions.setExportTextInputFormFieldAsText(true);
        htmlSaveOptions.setExportRoundtripInformation(false);
        htmlSaveOptions.zzR(new com.aspose.words.internal.zzZNI(false));
    }

    public static ArrayList<zzYM> zzX(zzY86 zzy86) {
        ArrayList<zzYM> arrayList = new ArrayList<>();
        for (zzY87 zzy87 : zzy86.zzyD()) {
            if (com.aspose.words.internal.zzZKN.zzS(zzy87.getContentType(), "image/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) && !"image/svg+xml".equals(zzy87.getContentType()) && (zzy87 instanceof zzYM)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzYM) zzy87);
            }
        }
        return arrayList;
    }
}

package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYXU implements IResourceLoadingCallback, zzZBS {
    private zzYY3 zzXXB;
    private zzYY9 zzXXC;
    private zzYXX zzXXD;
    private zzYYL zzXXE;
    private Document zzZEY;

    public zzYXU(com.aspose.words.internal.zzZOP zzzop, Document document) {
        this.zzZEY = document;
        this.zzXXE = new zzYYL(zzzop);
    }

    private int zzY1(byte[] bArr) {
        int iZzm;
        int length = bArr.length;
        for (int i = 32768; i != 0; i >>= 1) {
            if ((((long) this.zzXXC.zzYCJ()) & 4294967295L & ((long) i)) != 0) {
                if (i == 1) {
                    length--;
                    iZzm = bArr[length] & 3;
                } else {
                    iZzm = (int) zzY3N.zzm(bArr, length - 1);
                }
                length -= iZzm;
            }
        }
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Invalid text record trailing data.");
    }

    private void zzYCl() throws Exception {
        int iZzYCQ = this.zzXXC.zzYCQ();
        if (iZzYCQ == -1) {
            return;
        }
        DocumentBuilder documentBuilder = new DocumentBuilder(this.zzZEY);
        Shape shapeInsertImage = documentBuilder.insertImage(zzP3(iZzYCQ));
        shapeInsertImage.setWrapType(1);
        shapeInsertImage.setHorizontalAlignment(2);
        shapeInsertImage.setVerticalAlignment(2);
        shapeInsertImage.setRelativeHorizontalPosition(1);
        shapeInsertImage.setRelativeVerticalPosition(1);
        shapeInsertImage.setAspectRatioLocked(false);
        shapeInsertImage.setWidth(documentBuilder.getPageSetup().getPageWidth());
        shapeInsertImage.setHeight(documentBuilder.getPageSetup().getPageHeight());
        shapeInsertImage.setAspectRatioLocked(true);
        documentBuilder.insertBreak(1);
    }

    private void zzYCm() {
        zzYY9 zzyy9 = this.zzXXC;
        String strZzM = zzyy9.zzM(zzyy9.zzQZ());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzM)) {
            this.zzZEY.getBuiltInDocumentProperties().setSubject(strZzM);
        }
    }

    private void zzYCn() {
        zzYY9 zzyy9 = this.zzXXC;
        String strZzN = zzyy9.zzN(zzyy9.zzQZ());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzN)) {
            this.zzZEY.getBuiltInDocumentProperties().setAuthor(strZzN);
        }
    }

    private byte[] zzYCo() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        for (int i = 0; i < this.zzXXC.zzYCP(); i++) {
            byte[] bArrZzY = this.zzXXD.zzY(this.zzXXE, this.zzXXC.zzYCG() + i);
            int iZzY1 = zzY1(bArrZzY);
            int iZzWL = this.zzXXC.zzWL();
            if (iZzWL == 1) {
                zzzor.write(bArrZzY, 0, iZzY1);
            } else if (iZzWL == 2) {
                zzYXY.zzZ(bArrZzY, iZzY1, zzzor);
            } else if (iZzWL == 17480) {
                this.zzXXB.zzZ(bArrZzY, iZzY1, zzzor);
            }
        }
        return zzzor.zzWy();
    }

    private void zzYCp() throws Exception {
        zzYY2[] zzyy2Arr = new zzYY2[256];
        int[] iArr = new int[33];
        int[] iArr2 = new int[33];
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzXXD.zzY(this.zzXXE, this.zzXXC.zzYCM()));
        try {
            zzZ(new com.aspose.words.internal.zzY0(zzzor), zzyy2Arr, iArr, iArr2);
            zzzor.close();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.zzXXC.zzYCL() - 1; i++) {
                zzzor = new com.aspose.words.internal.zzZOR(this.zzXXD.zzY(this.zzXXE, this.zzXXC.zzYCM() + i + 1));
                try {
                    zzZ(new com.aspose.words.internal.zzY0(zzzor), arrayList);
                    zzzor.close();
                } finally {
                }
            }
            this.zzXXB = new zzYY3(zzyy2Arr, iArr, iArr2, arrayList);
        } finally {
        }
    }

    private void zzYCq() throws Exception {
        zzYXX zzyxx = new zzYXX(this.zzXXE);
        this.zzXXD = zzyxx;
        zzyxx.zzW(this.zzXXE, 0);
        this.zzXXC = new zzYY9(this.zzXXE, 0);
        zzan();
    }

    private static void zzZ(com.aspose.words.internal.zzY0 zzy0, zzYY2[] zzyy2Arr, int[] iArr, int[] iArr2) throws Exception {
        if (zzy0.zzXb() != 1213548102) {
            throw new IllegalStateException("Unexpected HUFF header ID.");
        }
        if (zzy0.zzXb() != 24) {
            throw new IllegalStateException("Invalid HUFF header size.");
        }
        int iZzXb = zzy0.zzXb();
        int iZzXb2 = zzy0.zzXb();
        zzy0.zzXb();
        zzy0.zzXb();
        zzy0.zzq().zzH(((long) iZzXb) & 4294967295L);
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            zzyy2Arr[i2] = new zzYY2(zzy0.zzXb());
        }
        zzy0.zzq().zzH(((long) iZzXb2) & 4294967295L);
        iArr[0] = 0;
        iArr2[0] = 0;
        while (i < 32) {
            i++;
            iArr[i] = zzy0.zzXb();
            iArr2[i] = zzy0.zzXb();
        }
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        zzYCq();
        int iZzYCO = this.zzXXC.zzYCO();
        if (iZzYCO != 0) {
            if (iZzYCO == 1) {
                throw new UnsupportedFileFormatException("Old MobiPocket encryption is not yet supported.");
            }
            if (iZzYCO == 2) {
                throw new UnsupportedFileFormatException("MobiPocket encryption is not yet supported.");
            }
            throw new IllegalStateException("Unknown encryption.");
        }
        if (this.zzXXC.zzWL() == 17480) {
            zzYCp();
        }
        String baseUri = this.zzZEY.getBaseUri();
        IResourceLoadingCallback resourceLoadingCallback = this.zzZEY.getResourceLoadingCallback();
        try {
            this.zzZEY.setBaseUri("");
            this.zzZEY.setResourceLoadingCallback(this);
            zzYG(zzYCo());
            this.zzZEY.setBaseUri(baseUri);
            this.zzZEY.setResourceLoadingCallback(resourceLoadingCallback);
            zzYCn();
            zzYCm();
            zzYCl();
        } catch (Throwable th) {
            this.zzZEY.setBaseUri(baseUri);
            this.zzZEY.setResourceLoadingCallback(resourceLoadingCallback);
            throw th;
        }
    }

    public abstract byte[] zzP3(int i) throws Exception;

    public final zzYY9 zzYCi() {
        return this.zzXXC;
    }

    public final zzYXX zzYCj() {
        return this.zzXXD;
    }

    public final zzYYL zzYCk() {
        return this.zzXXE;
    }

    public abstract void zzYG(byte[] bArr) throws Exception;

    public void zzan() throws Exception {
    }

    private static void zzZ(com.aspose.words.internal.zzY0 zzy0, ArrayList<zzYY1> arrayList) throws Exception {
        if (zzy0.zzXb() == 1128548675) {
            int iZzXb = zzy0.zzXb();
            if (iZzXb == 16) {
                long jZzXb = ((long) zzy0.zzXb()) & 4294967295L;
                if (jZzXb <= 2147483647L) {
                    long jZzXb2 = ((long) zzy0.zzXb()) & 4294967295L;
                    if (jZzXb2 <= 15) {
                        int iMin = Math.min(1 << ((int) jZzXb2), ((int) jZzXb) - arrayList.size());
                        for (int i = 0; i < iMin; i++) {
                            short sZzX9 = zzy0.zzX9();
                            long position = zzy0.zzq().getPosition();
                            zzy0.zzq().zzH(((long) (sZzX9 & 65535)) + (((long) iZzXb) & 4294967295L));
                            short sZzX92 = zzy0.zzX9();
                            int i2 = sZzX92 & Short.MAX_VALUE;
                            boolean z = (sZzX92 & Short.MIN_VALUE) == 0;
                            byte[] bArrZzn = zzy0.zzn(i2);
                            zzy0.zzq().zzH(position);
                            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYY1(bArrZzn, z));
                        }
                        return;
                    }
                    throw new IllegalStateException("Invalid entry length.");
                }
                throw new IllegalStateException("Invalid total number of phrases.");
            }
            throw new IllegalStateException("Invalid CDIC header size.");
        }
        throw new IllegalStateException("Unexpected CDIC header ID.");
    }

    public final void zzZ(zzYY9 zzyy9) {
        this.zzXXC = zzyy9;
    }
}

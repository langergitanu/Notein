package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0 extends zzYXU implements IResourceLoadingCallback {
    private byte[][] zzZDS;
    private zzYY9 zzZDT;

    public zzZ0(com.aspose.words.internal.zzZOP zzzop, Document document) {
        super(zzzop, document);
    }

    private byte[] zzP2(int i) {
        if (i < 0) {
            return null;
        }
        byte[][] bArr = this.zzZDS;
        if (i < bArr.length) {
            return bArr[i];
        }
        return null;
    }

    private static int zzTs(String str) {
        if (str.length() < 16) {
            return -1;
        }
        String strSubstring = str.substring(12, 16);
        RefInt refInt = new RefInt(0);
        boolean zZzZ = zzYR.zzZ(strSubstring, refInt);
        int i = refInt.get();
        if (zZzZ && i > 0) {
            return i;
        }
        return -1;
    }

    private static boolean zzTt(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, "kindle:flow:", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private static int zzTu(String str) {
        if (str.length() < 17) {
            return -1;
        }
        String strSubstring = str.substring(13, 17);
        RefInt refInt = new RefInt(0);
        boolean zZzZ = zzYR.zzZ(strSubstring, refInt);
        int i = refInt.get();
        if (zZzZ && i > 0) {
            return i;
        }
        return -1;
    }

    private static boolean zzTv(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, "kindle:embed:", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private static com.aspose.words.internal.zzXE zzZ(byte[] bArr, zzYZ zzyz, zzZA[] zzzaArr) {
        com.aspose.words.internal.zzXE zzxe = new com.aspose.words.internal.zzXE(zzyz.zzYF(bArr));
        int i = 0;
        for (zzZA zzza : zzzaArr) {
            if (zzza.zzaP() == zzyz.zzaP()) {
                zzyz.zzZ(zzxe, bArr, zzza);
                i++;
            }
        }
        if (i == zzyz.zzaM()) {
            return zzxe;
        }
        throw new IllegalStateException("Not all fragments were processed.");
    }

    private zzZA[] zzak() throws Exception {
        if (!zzYCj().zztT(zzYCi().zzYCI())) {
            return new zzZA[0];
        }
        zzZ1 zzz1 = new zzZ1(zzYCj().zzX(zzYCk(), zzYCi().zzYCI()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zzz1.zzaq(); i++) {
            for (zzZ9 zzz9 : new zzZD(zzYCj().zzX(zzYCk(), zzYCi().zzYCI() + 1 + i), zzz1.zzap(), zzz1.zzao()).zzaO()) {
                int iZzZo = com.aspose.words.internal.zzJB.zzZo(zzz9.getText());
                if (iZzZo == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Cannot parse a fragment insert position.");
                }
                zzZA zzza = new zzZA(iZzZo, zzz9.zzaP(), zzz9.getStartPosition(), zzz9.getLength());
                if (zzz9.zzaL() != arrayList.size()) {
                    throw new IllegalStateException("Unexpected geometry chunk sequence number.");
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZA>) arrayList, zzza);
            }
        }
        return (zzZA[]) arrayList.toArray(new zzZA[0]);
    }

    private zzYZ[] zzal() throws Exception {
        if (!zzYCj().zztT(zzYCi().zzYCH())) {
            return new zzYZ[0];
        }
        zzZ1 zzz1 = new zzZ1(zzYCj().zzX(zzYCk(), zzYCi().zzYCH()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zzz1.zzaq(); i++) {
            for (zzZ9 zzz9 : new zzZD(zzYCj().zzX(zzYCk(), zzYCi().zzYCH() + 1 + i), zzz1.zzap(), zzz1.zzao()).zzaO()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYZ>) arrayList, new zzYZ(arrayList.size(), zzz9.zzaM(), zzz9.getStartPosition(), zzz9.getLength()));
            }
        }
        return (zzYZ[]) arrayList.toArray(new zzYZ[0]);
    }

    private ArrayList<zzZC> zzam() throws Exception {
        ArrayList<zzZC> arrayList = new ArrayList<>();
        if (zzYCj().zztT(zzYCi().zzYCK())) {
            zzYYL zzyylZzX = zzYCj().zzX(zzYCk(), zzYCi().zzYCK());
            zzyylZzX.zzua(1178882900);
            zzyylZzX.zzQk(4);
            int iZzYD0 = zzyylZzX.zzYD0();
            for (int i = 0; i < iZzYD0; i++) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZC(zzyylZzX));
            }
        }
        return arrayList;
    }

    @Override // com.aspose.words.IResourceLoadingCallback
    public final int resourceLoading(ResourceLoadingArgs resourceLoadingArgs) throws Exception {
        int iZzTs;
        byte[] bArrZzP2;
        int iZzTu;
        byte[] bArrZzP3;
        if (zzTv(resourceLoadingArgs.getUri()) && (iZzTu = zzTu(resourceLoadingArgs.getUri())) > 0 && (bArrZzP3 = zzP3(iZzTu - 1)) != null) {
            resourceLoadingArgs.setData(bArrZzP3);
            return 2;
        }
        if (!zzTt(resourceLoadingArgs.getUri()) || (iZzTs = zzTs(resourceLoadingArgs.getUri())) <= 0 || (bArrZzP2 = zzP2(iZzTs - 1)) == null) {
            resourceLoadingArgs.setData(null);
            return 2;
        }
        resourceLoadingArgs.setData(bArrZzP2);
        return 2;
    }

    @Override // com.aspose.words.zzYXU
    public final byte[] zzP3(int i) throws Exception {
        zzYY9 zzyy9ZzYCi = this.zzZDT;
        if (zzyy9ZzYCi == null) {
            zzyy9ZzYCi = zzYCi();
        }
        int iZzu8 = zzyy9ZzYCi.zzu8(i);
        if (zzYCj().zztT(iZzu8)) {
            return zzYCj().zzY(zzYCk(), iZzu8);
        }
        return null;
    }

    @Override // com.aspose.words.zzYXU
    public final void zzYG(byte[] bArr) throws Exception {
        byte[] bArrZzYH;
        ArrayList<zzZC> arrayListZzam = zzam();
        if (arrayListZzam.size() > 0) {
            bArrZzYH = arrayListZzam.get(0).zzYH(bArr);
            arrayListZzam.remove(0);
        } else {
            bArrZzYH = bArr;
        }
        if (arrayListZzam.size() > 0) {
            this.zzZDS = new byte[arrayListZzam.size()][];
            for (int i = 0; i < arrayListZzam.size(); i++) {
                this.zzZDS[i] = arrayListZzam.get(i).zzYH(bArr);
            }
        }
        zzYZ[] zzyzArrZzal = zzal();
        zzZA[] zzzaArrZzak = zzak();
        String strZzZn = zzYCi().zzQZ().zzZn(bArrZzYH);
        zzZE zzze = new zzZE(zzyzArrZzal, zzzaArrZzak, zzYCi().zzQZ());
        zzze.zzHO(strZzZn);
        zzZFF zzzff = new zzZFF(this, getDocument().getWarningCallback());
        DocumentBuilder documentBuilder = new DocumentBuilder(getDocument());
        if (zzyzArrZzal.length <= 0) {
            zzZ(strZzZn, documentBuilder, zzzff);
            return;
        }
        for (zzYZ zzyz : zzyzArrZzal) {
            zzZ(zzyz.zzZ(zzZ(bArrZzYH, zzyz, zzzaArrZzak), zzze), documentBuilder, zzzff);
        }
    }

    @Override // com.aspose.words.zzYXU
    public final void zzan() throws Exception {
        if (zzYCi().zzYCN() == 8) {
            return;
        }
        int iZzYCR = zzYCi().zzYCR();
        if (!zzYCj().zztT(iZzYCR) || !zzYCj().zzV(zzYCk(), iZzYCR)) {
            iZzYCR = zzYCj().zzT(zzYCk());
        }
        if (!zzYCj().zztT(iZzYCR)) {
            throw new IllegalStateException("AZW3 reader doesn't support old MOBI documents.");
        }
        this.zzZDT = zzYCi();
        int i = iZzYCR + 1;
        zzYCj().zzW(zzYCk(), i);
        zzZ(new zzYY9(zzYCk(), i));
    }

    private static void zzZ(String str, DocumentBuilder documentBuilder, zzZFF zzzff) throws Exception {
        zzZFH zzzfh = new zzZFH();
        zzzfh.zzYmC = true;
        new zzZFI(zzzfh, 50, zzzff).zzZ(str, documentBuilder, 0, false);
    }
}

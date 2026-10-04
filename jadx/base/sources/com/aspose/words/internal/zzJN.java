package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJN extends zzJO {
    private boolean zzA2;

    public zzJN(zzZXH zzzxh, boolean z) {
        super(zzzxh);
        zzHp();
        this.zzA2 = z;
    }

    private static String zz5(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0 && i % 36 == 0) {
                sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            zzZNH.zzZ(sb, "{0:x2}", Integer.valueOf(bArr[i] & 255));
        }
        return sb.toString();
    }

    private void zzZ(zzZOP zzzop, zzGS zzgs) throws Exception {
        zzZYV<Integer> zzzyv = new zzZYV<>();
        for (int i = 0; i < zzHn().getCount(); i++) {
            int iZzT3 = zzHn().zzT3(i);
            zzzyv.set(iZzT3, Integer.valueOf(iZzT3));
        }
        new zzZXF().zzZ(zzPl(), zzzyv, zzzop, this.zzA2, zzgs);
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzF(zzZOP zzzop) throws Exception {
        String strReplace = zzPl().zzpw().replace(" ", "");
        zzZON zzzon = new zzZON(zzzop);
        zzzon.zzXB("/FontSetInit /ProcSet findresource begin");
        zzZOR zzzor = new zzZOR();
        try {
            zzZON zzzon2 = new zzZON(zzzor);
            zzzon2.zzXB("StartData");
            zzzon2.flush();
            zzY(zzzor);
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            zzzon.zzZ("/{0} {1}", strReplace, Integer.valueOf(bArrZzWy.length));
            zzzon.zzXB("currentfile /ASCIIHexDecode filter cvx exec");
            zzzon.zzXB(zz5(bArrZzWy));
            zzzon.zzXB(">");
            zzzon.flush();
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzG(zzZOP zzzop) throws Exception {
        zzZ(zzzop, new zzZT2());
    }

    @Override // com.aspose.words.internal.zzJO
    public final boolean zzHo() {
        return false;
    }

    @Override // com.aspose.words.internal.zzJO
    public final int zzWO(int i) {
        return i;
    }

    @Override // com.aspose.words.internal.zzJO
    public final void zzY(zzZOP zzzop) throws Exception {
        zzZ(zzzop, new zzZZ2());
    }
}

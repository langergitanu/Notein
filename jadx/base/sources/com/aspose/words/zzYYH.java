package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYYH {
    private com.aspose.words.internal.zzZO0 zzMW;
    private HashMap<String, String> zzXYj;
    private com.aspose.words.internal.zzD3<ArrayList<zzYYJ>> zzXYk;
    private com.aspose.words.internal.zzZNR zzXYl;

    public zzYYH(com.aspose.words.internal.zzZO0 zzzo0, String str) {
        this.zzMW = zzzo0;
        this.zzXYl = new com.aspose.words.internal.zzZNR(str);
    }

    private String zzW(com.aspose.words.internal.zzXE zzxe) {
        String strZzZn = this.zzMW.zzZn(zzxe.zzWy());
        StringBuilder sb = new StringBuilder(strZzZn.length());
        int length = 0;
        for (com.aspose.words.internal.zzZNT zzzntZzUX = this.zzXYl.zzUX(strZzZn); zzzntZzUX.zzhL(); zzzntZzUX = zzzntZzUX.zzhK()) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzXYj, zzzntZzUX.getValue(), ref);
            String str = (String) ref.get();
            if (zZzZ) {
                sb.append((CharSequence) strZzZn, length, (zzzntZzUX.getIndex() - length) + length);
                com.aspose.words.internal.zzZNH.zzU(sb, str);
                length = zzzntZzUX.getLength() + zzzntZzUX.getIndex();
            }
        }
        sb.append((CharSequence) strZzZn, length, (strZzZn.length() - length) + length);
        return sb.toString();
    }

    private void zzY(com.aspose.words.internal.zzXE zzxe, int i) {
        ArrayList<zzYYJ> arrayList = this.zzXYk.get(i);
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzYYJ zzyyj = arrayList.get(size);
            if (zzyyj.zzY(zzxe)) {
                zzyyj.zzX(zzxe);
                zzyyj.zzZ(zzxe, this.zzMW);
            }
        }
    }

    public final void zzHO(String str) {
        com.aspose.words.internal.zzZYV zzzyv = new com.aspose.words.internal.zzZYV();
        for (com.aspose.words.internal.zzZNT zzzntZzUX = this.zzXYl.zzUX(str); zzzntZzUX.zzhL(); zzzntZzUX = zzzntZzUX.zzhK()) {
            zzYYJ zzyyjZzTx = zzTx(zzzntZzUX.getValue());
            if (zzyyjZzTx != null && !zzzyv.zzVE(zzyyjZzTx.zzKh())) {
                zzzyv.add(zzyyjZzTx.zzKh(), zzyyjZzTx);
            }
        }
        this.zzXYk = new com.aspose.words.internal.zzD3<>();
        this.zzXYj = new HashMap<>(zzzyv.getCount());
        for (int i = 0; i < zzzyv.getCount(); i++) {
            zzYYJ zzyyj = (zzYYJ) zzzyv.zzVY(i);
            ArrayList<zzYYJ> arrayList = this.zzXYk.get(zzyyj.zzaP());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.zzXYk.add(zzyyj.zzaP(), arrayList);
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyyj);
            com.aspose.words.internal.zzZQF.zzY(this.zzXYj, zzyyj.zzYCX(), zzyyj.zzYCW());
        }
    }

    public abstract zzYYJ zzTx(String str);

    public final String zzZ(com.aspose.words.internal.zzXE zzxe, int i) {
        zzY(zzxe, i);
        return zzW(zzxe);
    }
}

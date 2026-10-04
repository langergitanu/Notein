package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzM7 extends zzMP {
    private zzL4 zzZov;
    private zzL4 zzZow;
    private zzL4 zzZox;
    private zzL4 zzZoy;

    public zzM7(zzMP zzmp, zzMP zzmp2, zzMP zzmp3, zzMP zzmp4) {
        super(new zzL2(zzmp.zzZVx(), zzmp2.zzZVx(), zzmp3.zzZVx(), zzmp4.zzZVx()));
        zzmp.getCount();
        zzmp2.getCount();
        zzmp3.getCount();
        zzmp4.getCount();
        this.zzZoy = zzmp.zzZVx();
        this.zzZox = zzmp2.zzZVx();
        this.zzZow = zzmp3.zzZVx();
        this.zzZov = zzmp4.zzZVx();
    }

    @Override // com.aspose.words.zzMP
    public final void zzF(StringBuilder sb) {
        ArrayList<zzL4> arrayList = new ArrayList();
        if (this.zzZoy.zzP(this.zzZox) && this.zzZoy.zzP(this.zzZow) && this.zzZoy.zzP(this.zzZov)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZoy);
        } else if (this.zzZoy.zzP(this.zzZow) && this.zzZox.zzP(this.zzZov)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZoy);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZox);
        } else if (this.zzZox.zzP(this.zzZov)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZoy);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZox);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZow);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZoy);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZox);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZow);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzL4>) arrayList, this.zzZov);
        }
        boolean z = true;
        for (zzL4 zzl4 : arrayList) {
            if (!z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            zzl4.zzG(sb);
            z = false;
        }
    }
}

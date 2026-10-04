package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWQ {
    private int zzXWb;
    private ArrayList<zzYWR> zzYKI = new ArrayList<>();
    private int zzYlW;
    private zzZAO zzYqI;

    public zzYWQ(int i) {
        this.zzYlW = i;
    }

    public final void zzT(Paragraph paragraph, zzYMX zzymx) {
        String labelString;
        if (this.zzYlW <= 0 || !paragraph.zzZ7D()) {
            return;
        }
        int iZzZ7j = zzymx.zzZ7j();
        if (zzY8O.zzkF(iZzZ7j) && iZzZ7j <= this.zzYlW) {
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzYVY.zzZ((Node) paragraph, true, (Node) paragraph, true, true));
            if (strZzTX.length() == 0) {
                return;
            }
            zzYWR zzywr = new zzYWR();
            StringBuilder sb = new StringBuilder("navPoint_");
            int i = this.zzXWb + 1;
            this.zzXWb = i;
            sb.append(i);
            zzywr.zzXWf = sb.toString();
            zzywr.zzXWe = iZzZ7j;
            zzywr.zzXWd = strZzTX;
            zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
            if (zzzgiZzZW.isListItem() && (labelString = zzzgiZzZW.getLabelString()) != null && !C18358t1.g.f56183c.equals(labelString)) {
                zzywr.zzXWd = com.aspose.words.internal.zzZKN.format("{0} {1}", labelString, zzywr.zzXWd);
            }
            if (!com.aspose.words.internal.zzZKN.equals(this.zzYqI.zzZ3D(), "")) {
                zzywr.zzXWc = this.zzYqI.zzZ3D();
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYKI, zzywr);
            this.zzYqI.zzZ3E().zzX("id", zzywr.zzXWf);
        }
    }

    public final ArrayList<zzYWR> zzYBq() {
        return this.zzYKI;
    }

    public final void zzYC(String str, String str2) {
        if (this.zzYKI.size() == 0 || !com.aspose.words.internal.zzZKN.equals(((zzYWR) C21505OooO0Oo.OooO00o(1, this.zzYKI)).zzXWc, str)) {
            zzYWR zzywr = new zzYWR();
            zzywr.zzXWe = 1;
            zzywr.zzXWd = str2;
            zzywr.zzXWc = str;
            com.aspose.words.internal.zzZQG.zzZ(this.zzYKI, zzywr);
        }
    }

    public final void zzZ(zzZAO zzzao) {
        this.zzYqI = zzzao;
    }
}

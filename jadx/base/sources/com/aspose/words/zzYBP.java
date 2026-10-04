package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBP {
    private com.aspose.words.internal.zzZXH zzA4;
    private zzYE9 zzXeE;
    private boolean zzXeF;
    private int zzXeG;
    private zzYE8 zzXpP;

    public zzYBP(String[] strArr) {
        this.zzXeG = -1;
        this.zzXeE = new zzYE9();
        this.zzXpP = new zzYE8(strArr);
    }

    private boolean isBeforeFirst() {
        return this.zzXeG == -1;
    }

    private void zzY8p() {
        zzYE9 zzye9 = this.zzXeE;
        ArrayList arrayList = new ArrayList();
        if (zzye9.zzYdt()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2>) arrayList, new zz2(this.zzXpP, this.zzA4));
        }
        if (zzye9.zzYds()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZKQ>) arrayList, new zzZKQ(this.zzXpP));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzYBS) it.next()).apply();
        }
    }

    private void zzY8q() {
        new zzY43(this.zzXpP, this.zzXeE).apply();
        if (this.zzXeE.zzYdr()) {
            zzY8p();
        }
        this.zzXeF = true;
    }

    private boolean zzY8r() {
        return this.zzXeG >= this.zzXpP.getRunCount();
    }

    public static void zzZ(zzYBM zzybm) {
        com.aspose.words.internal.zzZYD.zzXk(zzybm.getText());
        if (zzybm.zzZnY()) {
            zzybm.setText(com.aspose.words.internal.zzZVS.zzWJ(zzybm.getText()));
        }
        if (com.aspose.words.internal.zzUX.zzQ(zzybm.getText().charAt(0)) && zzYTU.zzV(zzybm.getNumeralFormat(), zzybm.zzZz(), zzybm.getLocaleIdBi())) {
            zzybm.setText(zzYTU.zzZ(zzybm.getText(), zzybm.getNumeralFormat(), zzybm.zzZz(), zzybm.getLocaleIdBi()));
            zzybm.zzYKR();
        }
    }

    public final boolean moveNext() {
        int i = this.zzXeG + 1;
        this.zzXeG = i;
        return i < this.zzXpP.getRunCount();
    }

    public final String zzY8s() {
        if (isBeforeFirst()) {
            this.zzXeG = 0;
        }
        if (zzY8r()) {
            this.zzXeG = this.zzXpP.getRunCount();
            return null;
        }
        if (!this.zzXeF) {
            zzY8q();
        }
        return this.zzXpP.zzn2(this.zzXeG);
    }

    private zzYBP(zzYE8 zzye8) {
        this.zzXeG = -1;
        this.zzXeE = new zzYE9();
        this.zzXpP = zzye8;
    }

    public zzYBP(String[] strArr, com.aspose.words.internal.zzZXH zzzxh) {
        this(strArr);
        this.zzA4 = zzzxh;
    }

    public zzYBP(RunCollection runCollection, zzZ6R zzz6r) {
        this(zzYE6.zzZ(runCollection, zzz6r));
    }

    public zzYBP(zzYWB zzywb, zzZ6R zzz6r) {
        this(zzYE6.zzZ(zzywb, zzz6r));
    }
}

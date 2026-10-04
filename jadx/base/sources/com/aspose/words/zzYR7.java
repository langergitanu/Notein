package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzYR7 extends zzYOY {
    private List zzYo7;
    private boolean zzXOo = false;
    private ArrayList<String> zzXOn = new ArrayList<>();

    public zzYR7() {
        for (int i = 0; i < 9; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXOn, (Object) null);
        }
    }

    public final List getList() {
        return this.zzYo7;
    }

    public final void setList(List list) {
        this.zzYo7 = list;
    }

    public final void zzSo(boolean z) {
        this.zzXOo = true;
    }

    public final boolean zzYvJ() {
        return this.zzXOo;
    }

    public final ArrayList<String> zzYvK() {
        return this.zzXOn;
    }
}

package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSS extends zzYSZ {
    private zzYT2 zzXR3;
    private ArrayList<zzYT2> zzXR4;
    private String zzXR5;
    private String zzXR6;
    private String zzXR7;
    private String zzXR8;
    private zzYT4 zzXRm;
    private int zzZe9;

    public zzYSS(zzYPO zzypo) {
        super(zzypo);
        this.zzXR4 = new ArrayList<>();
    }

    public final void zzGh(String str) {
        this.zzXR5 = str;
    }

    public final void zzGi(String str) {
        this.zzXR6 = str;
    }

    public final void zzGj(String str) {
        this.zzXR7 = str;
    }

    public final void zzGk(String str) {
        this.zzXR8 = str;
    }

    public final zzYT2 zzYx2() {
        if (this.zzXR3 == null) {
            zzYT2 zzyt2 = new zzYT2(this.zzXRj);
            this.zzXR3 = zzyt2;
            zzyt2.setStyleName(getStyleName());
        }
        return this.zzXR3;
    }

    public final ArrayList<zzYT2> zzYx3() {
        return this.zzXR4;
    }

    public final String zzYx4() {
        return this.zzXR5;
    }

    public final String zzYx5() {
        return this.zzXR6;
    }

    public final String zzYx6() {
        return this.zzXR7;
    }

    public final String zzYx7() {
        return this.zzXR8;
    }

    public final zzYT4 zzYxt() {
        return this.zzXRm;
    }

    public final void zzZ(zzYT4 zzyt4) {
        this.zzXRm = zzyt4;
    }

    public final int zzZQO() {
        return this.zzZe9;
    }

    public final void zzsM(int i) {
        this.zzZe9 = i;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MustacheTag {
    private zzZPZ zzXWB;
    private int zzXWC;
    private Run zzXWD;
    private String zzZi;

    public MustacheTag(Run run, int i, String str, zzZPZ zzzpz) {
        this.zzXWD = run;
        this.zzXWC = i;
        this.zzZi = str;
        this.zzXWB = zzzpz;
    }

    public int getReferenceOffset() {
        return this.zzXWC;
    }

    public Run getReferenceRun() {
        return this.zzXWD;
    }

    public String getText() {
        return this.zzZi;
    }

    public final zzZPZ zzYBs() {
        return this.zzXWB;
    }
}

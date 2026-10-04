package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PhoneticGuide {
    private Run zzXEL;

    public PhoneticGuide(Run run) {
        this.zzXEL = run;
    }

    private zzYEJ zzYnr() {
        return (zzYEJ) com.aspose.words.internal.zzZKW.zzZ(this.zzXEL.zzZYh().get(885), zzYEJ.class);
    }

    public String getBaseText() {
        zzYEJ zzyejZzYnr = zzYnr();
        return zzyejZzYnr == null ? "" : zzyejZzYnr.zzYe6().getText();
    }

    public String getRubyText() {
        zzYEJ zzyejZzYnr = zzYnr();
        return zzyejZzYnr == null ? "" : zzyejZzYnr.zzYe7().getText();
    }
}

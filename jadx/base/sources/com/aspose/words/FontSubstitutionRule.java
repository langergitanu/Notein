package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FontSubstitutionRule {
    private boolean zzYwL = true;
    private Object zzZDm;

    public FontSubstitutionRule(Object obj) {
        this.zzZDm = obj;
    }

    public boolean getEnabled() {
        boolean z;
        synchronized (getSyncRoot()) {
            z = this.zzYwL;
        }
        return z;
    }

    public Object getSyncRoot() {
        return this.zzZDm;
    }

    public void setEnabled(boolean z) {
        synchronized (getSyncRoot()) {
            this.zzYwL = z;
        }
    }

    public final com.aspose.words.internal.zzZXH zzY(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        if (getEnabled()) {
            return zzZ(str, i, fontInfo, zzkj);
        }
        return null;
    }

    public abstract com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj);
}

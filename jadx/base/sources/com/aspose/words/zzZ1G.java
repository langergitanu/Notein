package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ1G {
    public final void zzX(Paragraph paragraph, zzYMX zzymx, int i, boolean z) throws Exception {
        zzZGI.zzZW(paragraph).isListItem();
        if (zzZV(paragraph) && z) {
            zzZ(paragraph, zzymx, i);
        } else {
            zzZ0K();
            zzZ(paragraph, zzymx, i, z);
        }
    }

    public abstract void zzZ(Paragraph paragraph, zzYMX zzymx, int i) throws Exception;

    public abstract void zzZ(Paragraph paragraph, zzYMX zzymx, int i, boolean z) throws Exception;

    public abstract void zzZ0K() throws Exception;

    public abstract void zzZ0L() throws Exception;

    public abstract boolean zzZV(Paragraph paragraph) throws Exception;
}

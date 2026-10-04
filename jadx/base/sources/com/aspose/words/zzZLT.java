package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLT {
    public static zzZBU zzAA(int i) {
        if (i == 50) {
            return new zzZIQ();
        }
        if (i == 70) {
            return new zzY4S();
        }
        throw new IllegalStateException("Exporting fragments of a document in this format is not supported.");
    }

    public static zzZBU zzV(SaveOptions saveOptions) {
        int saveFormat = saveOptions.getSaveFormat();
        if (saveFormat == 50) {
            return new zzZIQ((HtmlSaveOptions) saveOptions);
        }
        if (saveFormat == 70) {
            return new zzY4S((TxtSaveOptions) saveOptions);
        }
        throw new IllegalStateException("Exporting fragments of a document in this format is not supported.");
    }
}

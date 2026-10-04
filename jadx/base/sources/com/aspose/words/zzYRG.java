package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRG {
    private zzYOW zzXRR;
    private zzYOR zzXRT;

    public zzYRG(zzYOR zzyor, zzYOW zzyow) {
        this.zzXRT = zzyor;
        this.zzXRR = zzyow;
    }

    private static String zzW(HeaderFooter headerFooter) {
        String str = headerFooter.isHeader() ? "style:header" : "style:footer";
        int headerFooterType = headerFooter.getHeaderFooterType();
        return (headerFooterType == 0 || headerFooterType == 2) ? com.aspose.words.internal.zzZKN.format("{0}-left", str) : str;
    }

    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) {
        if (headerFooter.isLinkedToPrevious() || this.zzXRT.zzYsC() != 4) {
            return 0;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzW(headerFooter);
        zzytgZzYsG.zzo();
        return 0;
    }

    public final int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        if (this.zzXRT.zzYsF()) {
            return 1;
        }
        if (headerFooter.isLinkedToPrevious() || this.zzXRT.zzYsC() != 4) {
            return 0;
        }
        this.zzXRT.zzYsG().zzY(zzW(headerFooter));
        zzYOR zzyor = this.zzXRT;
        zzyor.zzr8(zzyor.zzYsx() + 1);
        this.zzXRR.zzY(headerFooter);
        return 0;
    }
}

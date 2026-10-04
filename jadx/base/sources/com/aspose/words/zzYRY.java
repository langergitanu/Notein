package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRY {
    private zzYOR zzXRT;

    public zzYRY(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private void zzV(FontInfo fontInfo) {
        if (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getName())) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("style:font-face");
            zzytgZzYsG.zz0("style:name", fontInfo.getName());
            zzytgZzYsG.zz0("svg:font-family", com.aspose.words.internal.zzZKN.format("{0}", fontInfo.getName()));
            zzytgZzYsG.zz0("style:font-pitch", zzYS3.zzsn(fontInfo.getPitch()));
            zzytgZzYsG.zz0("style:font-family-generic", zzYS3.zzso(fontInfo.getFamily()));
            if (fontInfo.getCharset() == 2) {
                zzytgZzYsG.zz0("style:font-charset", "x-symbol");
            }
            zzytgZzYsG.zzo();
        }
    }

    public final void zzIg() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("office:font-face-decls");
        Iterator<FontInfo> it = this.zzXRT.getDocument().getFontInfos().iterator();
        while (it.hasNext()) {
            zzV(it.next());
        }
        zzytgZzYsG.zzo();
    }
}

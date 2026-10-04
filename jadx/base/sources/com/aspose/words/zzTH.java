package com.aspose.words;

import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes6.dex */
final class zzTH extends zzYQ {
    public zzTH(String str, zzYDZ zzydz) throws Exception {
        super("META-INF/container.xml", str, zzydz);
    }

    public final void zzZY1() {
        startDocument();
        zzY("container");
        zzX("xmlns", "urn:oasis:names:tc:opendocument:xmlns:container");
        zzX("version", "1.0");
        zzY("rootfiles");
        zzY("rootfile");
        zzX("full-path", zz9Y());
        zzX(HTMLWriter.MEDIA_TYPE, "application/oebps-package+xml");
        zzp();
        zzn();
        endDocument();
    }
}

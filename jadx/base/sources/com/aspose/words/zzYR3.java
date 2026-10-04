package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR3 {
    private zzYTG zzXQU;
    private zzYOR zzXRT;

    public zzYR3(zzYOR zzyor) throws Exception {
        this.zzXRT = zzyor;
        this.zzXQU = zzyor.zzDg("/META-INF/manifest.xml");
    }

    private void zzYk(String str, String str2) {
        this.zzXQU.zzY("manifest:file-entry");
        this.zzXQU.zzX("manifest:media-type", str);
        this.zzXQU.zz0("manifest:full-path", str2);
        this.zzXQU.zzo();
    }

    private void zzYvD() {
        if (this.zzXRT.zzYst().size() > 0) {
            zzYk("", "Pictures/");
        }
        for (zzYR5 zzyr5 : this.zzXRT.zzYst()) {
            zzYk(zzyr5.zzYZ5(), zzyr5.zzYvG());
        }
    }

    private void zzYvE() {
        if (this.zzXRT.zzYs2()) {
            zzYk("", "ObjectReplacements/");
        }
        for (zzYR5 zzyr5 : this.zzXRT.zzYss()) {
            zzYk(zzyr5.zzYZ5(), zzyr5.zzYvG());
        }
    }

    private void zzYvF() throws Exception {
        for (zzYR5 zzyr5 : this.zzXRT.zzYsr()) {
            zzYk("application/vnd.oasis.opendocument.formula", com.aspose.words.internal.zzZKN.format("{0}/", com.aspose.words.internal.zzZOQ.zzVd(zzyr5.zzYvG())));
            zzYk(zzyr5.zzYZ5(), zzyr5.zzYvG());
        }
    }

    public final void write(String str) throws Exception {
        this.zzXQU.zzYxZ();
        zzYk(str, "/");
        Iterator<zzYR5> it = this.zzXRT.zzYux().iterator();
        while (it.hasNext()) {
            it.next().zzY(this.zzXRT.zzYsG());
        }
        zzYvD();
        zzYvE();
        zzYvF();
        this.zzXQU.endDocument();
    }
}

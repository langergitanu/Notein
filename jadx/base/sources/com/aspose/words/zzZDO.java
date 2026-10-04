package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDO extends zzZDN {
    public zzZDO() {
        super("html");
    }

    @Override // com.aspose.words.zzZDN, com.aspose.words.zzZDK
    public final void zzZ(zzZI0 zzzi0) throws Exception {
        zzzi0.zzZ(getName());
        zzYXj().zzZ(zzzi0);
        Iterator<zzZDK> it = zzYXk().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzi0);
        }
        zzzi0.endDocument();
    }
}

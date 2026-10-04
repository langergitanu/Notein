package com.aspose.words.internal;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZS0 {
    private Transformer zz5w;

    private void zzW(zzZOP zzzop, zzZOP zzzop2) throws Exception {
        this.zz5w.transform(new StreamSource(new zzZK7(zzzop)), new StreamResult(new zzZK6(zzzop2)));
        zzzop2.zzH(0L);
    }

    public final void zzR(zzZOP zzzop) throws Exception {
        this.zz5w = TransformerFactory.newInstance().newTransformer(new StreamSource(new zzZK7(zzzop)));
    }

    public final zzZOP zzZR(zzZOP zzzop) throws Exception {
        zzZOR zzzor = new zzZOR();
        zzW(zzzop, zzzor);
        return zzzor;
    }
}

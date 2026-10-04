package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6S extends zzYGS {
    public zzZ6S(Collection collection) throws CertificateEncodingException {
        super(zzT(collection));
    }

    private static Collection zzT(Collection collection) throws CertificateEncodingException {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new zzZ6T(((X509Certificate) obj).getEncoded()));
                } catch (IOException e) {
                    throw new CertificateEncodingException(C21111o0ooOoO.OooO00o(e, new StringBuilder("unable to read encoding: ")));
                }
            } else {
                arrayList.add((zzZ6T) obj);
            }
        }
        return arrayList;
    }
}

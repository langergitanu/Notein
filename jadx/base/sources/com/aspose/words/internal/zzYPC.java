package com.aspose.words.internal;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPC {
    public static Set zzZ(zzYR8 zzyr8, Date date, List<CertStore> list, List<zzYR9> list2) throws zzYQQ {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(zzZ(zzyr8, list2));
            hashSet.addAll(zzZ(zzyr8, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    X509Certificate certificateChecking = zzyr8.getCertificateChecking();
                    if (certificateChecking == null) {
                        hashSet2.add(x509crl);
                    } else if (x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (zzYQQ e) {
            throw new zzYQQ("Exception obtaining complete CRLs.", e);
        }
    }

    private static Collection zzZ(zzYR8 zzyr8, List list) throws zzYQQ {
        zzYQQ zzyqq;
        HashSet hashSet = new HashSet();
        zzYQQ zzyqq2 = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof zzYGK) {
                try {
                    hashSet.addAll(((zzYGK) obj).zzZ(zzyr8));
                    z = true;
                } catch (zzYGJ e) {
                    zzyqq = new zzYQQ("Exception searching in X.509 CRL store.", e);
                    zzyqq2 = zzyqq;
                }
            } else {
                try {
                    hashSet.addAll(zzYR8.zzZ(zzyr8, (CertStore) obj));
                    z = true;
                } catch (CertStoreException e2) {
                    zzyqq = new zzYQQ("Exception searching in X.509 CRL store.", e2);
                    zzyqq2 = zzyqq;
                }
            }
        }
        if (z || zzyqq2 == null) {
            return hashSet;
        }
        throw zzyqq2;
    }
}

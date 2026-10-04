package com.aspose.words.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ5 extends CertStoreSpi {
    private CollectionCertStoreParameters zzVUK;

    public zzYQ5(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof CollectionCertStoreParameters) {
            this.zzVUK = (CollectionCertStoreParameters) certStoreParameters;
        } else {
            throw new InvalidAlgorithmParameterException("org.bouncycastle.jcajce.provider.CertStoreCollectionSpi: parameter must be a CollectionCertStoreParameters object\n" + certStoreParameters.toString());
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public final Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = this.zzVUK.getCollection().iterator();
        if (cRLSelector == null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof CRL) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if ((next2 instanceof CRL) && cRLSelector.match((CRL) next2)) {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }

    @Override // java.security.cert.CertStoreSpi
    public final Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = this.zzVUK.getCollection().iterator();
        if (certSelector == null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Certificate) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if ((next2 instanceof Certificate) && certSelector.match((Certificate) next2)) {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }
}

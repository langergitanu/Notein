package com.aspose.words.internal;

import com.aspose.words.internal.zzYR5;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPA extends CertPathBuilderSpi {
    private zzYQQ zzVUd;
    private final zzYQ8 zzVWk;

    public zzYPA(zzYQ8 zzyq8) {
        this.zzVWk = zzyq8;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CertPathBuilderResult zzZ(X509Certificate x509Certificate, zzYR5 zzyr5, List list) throws CertPathBuilderException {
        CertPathBuilderResult certPathBuilderResultZzZ = null;
        if (list.contains(x509Certificate) || zzyr5.zzXBR().contains(x509Certificate)) {
            return null;
        }
        if (zzyr5.getMaxPathLength() != -1 && list.size() - 1 > zzyr5.getMaxPathLength()) {
            return null;
        }
        list.add(x509Certificate);
        try {
            zzYQ4 zzyq4 = new zzYQ4(this.zzVWk);
            zzYP9 zzyp9 = new zzYP9(this.zzVWk);
            try {
            } catch (zzYQQ e) {
                this.zzVUd = e;
            }
            if (zzYQ7.zzZ(x509Certificate, zzyr5.zzXBS().getTrustAnchors(), zzyr5.zzXBS().getSigProvider()) != null) {
                try {
                    CertPath certPathEngineGenerateCertPath = zzyq4.engineGenerateCertPath(list);
                    try {
                        PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) zzyp9.engineValidate(certPathEngineGenerateCertPath, zzyr5);
                        return new PKIXCertPathBuilderResult(certPathEngineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                    } catch (Exception e2) {
                        throw new zzYQQ("Certification path could not be validated.", e2);
                    }
                } catch (Exception e3) {
                    throw new zzYQQ("Certification path could not be constructed from certificate list.", e3);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(zzyr5.zzXBS().zzXBP());
            try {
                arrayList.addAll(zzYQ7.zzZ(x509Certificate.getExtensionValue(zzZ7U.zzWqG.getId()), zzyr5.zzXBS().zzXBO()));
                HashSet hashSet = new HashSet();
                try {
                    hashSet.addAll(zzYQ7.zzZ(x509Certificate, zzyr5.zzXBS().getCertStores(), arrayList));
                    if (hashSet.isEmpty()) {
                        throw new zzYQQ("No issuer certificate for certificate in certification path found.");
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext() && certPathBuilderResultZzZ == null) {
                        certPathBuilderResultZzZ = zzZ((X509Certificate) it.next(), zzyr5, list);
                    }
                    if (certPathBuilderResultZzZ == null) {
                        list.remove(x509Certificate);
                    }
                    return certPathBuilderResultZzZ;
                } catch (zzYQQ e4) {
                    throw new zzYQQ("Cannot find issuer certificate for certificate in certification path.", e4);
                }
            } catch (CertificateParsingException e5) {
                throw new zzYQQ("No additional X.509 stores can be added from certificate locations.", e5);
            }
            this.zzVUd = e;
            if (certPathBuilderResultZzZ == null) {
            }
            return certPathBuilderResultZzZ;
        } catch (Exception e6) {
            throw new CertPathBuilderException(OooOO0.OooO0OO.OooO0Oo(e6, new StringBuilder("Exception creating support classes: ")), e6);
        }
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public final CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        zzYR5 zzyr5ZzXBQ;
        if (certPathParameters instanceof zzYR5) {
            zzyr5ZzXBQ = (zzYR5) certPathParameters;
        } else {
            if (!(certPathParameters instanceof PKIXBuilderParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + zzYR5.class.getName() + ".");
            }
            zzyr5ZzXBQ = new zzYR5.zzZ((PKIXBuilderParameters) certPathParameters).zzXBQ();
        }
        ArrayList arrayList = new ArrayList();
        zzYR6 zzyr6ZzXBJ = zzyr5ZzXBQ.zzXBS().zzXBJ();
        try {
            Collection collectionZzZ = zzYQ7.zzZ(zzyr6ZzXBJ, zzyr5ZzXBQ.zzXBS().zzXBP());
            collectionZzZ.addAll(zzYQ7.zzZ(zzyr6ZzXBJ, zzyr5ZzXBQ.zzXBS().getCertStores()));
            if (collectionZzZ.isEmpty()) {
                throw new CertPathBuilderException("No certificate found matching targetContraints.");
            }
            Iterator it = collectionZzZ.iterator();
            CertPathBuilderResult certPathBuilderResultZzZ = null;
            while (it.hasNext() && certPathBuilderResultZzZ == null) {
                certPathBuilderResultZzZ = zzZ((X509Certificate) it.next(), zzyr5ZzXBQ, arrayList);
            }
            if (certPathBuilderResultZzZ == null && this.zzVUd != null) {
                throw new CertPathBuilderException(this.zzVUd.getMessage(), this.zzVUd.getCause());
            }
            if (certPathBuilderResultZzZ != null) {
                return certPathBuilderResultZzZ;
            }
            throw new CertPathBuilderException("Unable to find certificate chain.");
        } catch (zzYQQ e) {
            throw new CertPathBuilderException("Error finding target certificate.", e);
        }
    }
}

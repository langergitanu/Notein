package com.aspose.words.internal;

import com.aspose.words.internal.zzYR4;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP9 extends CertPathValidatorSpi {
    private final Provider zzVUf;

    public zzYP9(Provider provider) {
        this.zzVUf = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public final CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        zzYR4 zzyr4ZzXBI;
        X500Principal x500Principal;
        int i;
        PublicKey cAPublicKey;
        HashSet hashSet;
        HashSet hashSet2;
        if (certPathParameters instanceof zzYR4) {
            zzyr4ZzXBI = (zzYR4) certPathParameters;
        } else if (certPathParameters instanceof zzYR5) {
            zzyr4ZzXBI = ((zzYR5) certPathParameters).zzXBS();
        } else {
            if (!(certPathParameters instanceof PKIXParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be " + PKIXParameters.class.getName() + " or " + zzYR4.class.getName() + " instance.");
            }
            zzyr4ZzXBI = new zzYR4.zzZ((PKIXParameters) certPathParameters).zzXBI();
        }
        if (zzyr4ZzXBI.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Set initialPolicies = zzyr4ZzXBI.getInitialPolicies();
        try {
            TrustAnchor trustAnchorZzZ = zzYQ7.zzZ((X509Certificate) certificates.get(certificates.size() - 1), zzyr4ZzXBI.getTrustAnchors(), zzyr4ZzXBI.getSigProvider());
            if (trustAnchorZzZ == null) {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            }
            zzYR4 zzyr4ZzXBI2 = new zzYR4.zzZ(zzyr4ZzXBI).zzZ(trustAnchorZzZ).zzXBI();
            int i2 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i2];
            boolean z = false;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayListArr[i3] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add("2.5.29.32.0");
            zzYP8 zzyp8 = new zzYP8(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
            arrayListArr[0].add(zzyp8);
            zzZ7I zzz7i = new zzZ7I();
            HashSet hashSet4 = new HashSet();
            int i4 = zzyr4ZzXBI2.isExplicitPolicyRequired() ? 0 : i2;
            int i5 = zzyr4ZzXBI2.isAnyPolicyInhibited() ? 0 : i2;
            if (zzyr4ZzXBI2.isPolicyMappingInhibited()) {
                i2 = 0;
            }
            X509Certificate trustedCert = trustAnchorZzZ.getTrustedCert();
            try {
                if (trustedCert != null) {
                    X500Principal x500PrincipalZzX = zzYQ7.zzX(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                    x500Principal = x500PrincipalZzX;
                    i = 1;
                } else {
                    i = 1;
                    x500Principal = new X500Principal(trustAnchorZzZ.getCAName());
                    cAPublicKey = trustAnchorZzZ.getCAPublicKey();
                }
                try {
                    zzYQ7.zzZ(cAPublicKey);
                    if (zzyr4ZzXBI2.zzXBJ() != null) {
                        if (!zzyr4ZzXBI2.zzXBJ().zzWP((X509Certificate) certificates.get(0))) {
                            throw new CertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        z = false;
                    }
                    List certPathCheckers = zzyr4ZzXBI2.getCertPathCheckers();
                    Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((PKIXCertPathChecker) it.next()).init(z);
                    }
                    zzZ7I zzz7i2 = zzz7i;
                    X509Certificate x509Certificate = trustedCert;
                    int iZzV = size;
                    int i6 = i5;
                    zzYP8 zzyp82 = zzyp8;
                    X500Principal x500Principal2 = x500Principal;
                    int size2 = certificates.size() - 1;
                    int i7 = i4;
                    X509Certificate x509Certificate2 = null;
                    while (size2 >= 0) {
                        int i8 = size - size2;
                        X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                        boolean z2 = size2 == certificates.size() + (-1) ? i : 0;
                        if (x509Certificate3 == null) {
                            throw new CertPathValidatorException("NULL certificate found", null, certPath, size2);
                        }
                        PublicKey publicKey = cAPublicKey;
                        ArrayList[] arrayListArr2 = arrayListArr;
                        TrustAnchor trustAnchor = trustAnchorZzZ;
                        List<? extends Certificate> list = certificates;
                        zzZ7I zzz7i3 = zzz7i2;
                        zzYNF.zzZ(certPath, zzyr4ZzXBI2, size2, publicKey, z2, x500Principal2, x509Certificate, this.zzVUf);
                        X500Principal x500Principal3 = x500Principal2;
                        X509Certificate x509Certificate4 = x509Certificate;
                        zzYR4 zzyr4 = zzyr4ZzXBI2;
                        int i9 = size2;
                        zzYNF.zzZ(certPath, i9, zzz7i3);
                        HashSet hashSet5 = hashSet4;
                        int i10 = i6;
                        zzYP8 zzyp8ZzZ = zzYNF.zzZ(certPath, i9, zzYNF.zzZ(certPath, i9, hashSet5, zzyp82, arrayListArr2, i10));
                        zzYNF.zzZ(certPath, i9, zzyp8ZzZ, i7);
                        if (i8 == size) {
                            i6 = i10;
                            cAPublicKey = publicKey;
                            x500Principal2 = x500Principal3;
                            zzyp82 = zzyp8ZzZ;
                        } else {
                            if (x509Certificate3.getVersion() == i) {
                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i9);
                            }
                            zzYNF.zzZ(certPath, i9);
                            zzYP8 zzyp8ZzZ2 = zzYNF.zzZ(certPath, i9, arrayListArr2, zzyp8ZzZ, i2);
                            zzYNF.zzY(certPath, i9, zzz7i3);
                            int iZzU = zzYNF.zzU(certPath, i9, i7);
                            int iZzT = zzYNF.zzT(certPath, i9, i2);
                            int iZzS = zzYNF.zzS(certPath, i9, i10);
                            int iZzZ = zzYNF.zzZ(certPath, i9, iZzU);
                            int iZzY = zzYNF.zzY(certPath, i9, iZzT);
                            int iZzX = zzYNF.zzX(certPath, i9, iZzS);
                            zzYNF.zzY(certPath, i9);
                            iZzV = zzYNF.zzV(certPath, i9, zzYNF.zzW(certPath, i9, iZzV));
                            zzYNF.zzX(certPath, i9);
                            Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                hashSet2 = new HashSet(criticalExtensionOIDs);
                                hashSet2.removeAll(zzYNF.zzVOD);
                            } else {
                                hashSet2 = new HashSet();
                            }
                            zzYNF.zzZ(certPath, i9, hashSet2, certPathCheckers);
                            X500Principal x500PrincipalZzX2 = zzYQ7.zzX(x509Certificate3);
                            try {
                                PublicKey publicKeyZzZ = zzYQ7.zzZ(certPath.getCertificates(), i9, this.zzVUf);
                                zzYQ7.zzZ(publicKeyZzZ);
                                cAPublicKey = publicKeyZzZ;
                                i6 = iZzX;
                                x500Principal2 = x500PrincipalZzX2;
                                x509Certificate4 = x509Certificate3;
                                i2 = iZzY;
                                i7 = iZzZ;
                                zzyp82 = zzyp8ZzZ2;
                            } catch (CertPathValidatorException e) {
                                throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath, i9);
                            }
                        }
                        hashSet4 = hashSet5;
                        arrayListArr = arrayListArr2;
                        x509Certificate2 = x509Certificate3;
                        trustAnchorZzZ = trustAnchor;
                        i = 1;
                        size2 = i9 - 1;
                        zzyr4ZzXBI2 = zzyr4;
                        zzz7i2 = zzz7i3;
                        certificates = list;
                        x509Certificate = x509Certificate4;
                    }
                    zzYR4 zzyr42 = zzyr4ZzXBI2;
                    int i11 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    TrustAnchor trustAnchor2 = trustAnchorZzZ;
                    HashSet hashSet6 = hashSet4;
                    zzYP8 zzyp83 = zzyp82;
                    int i12 = i11 + 1;
                    int iZzR = zzYNF.zzR(certPath, i12, zzYNF.zzZ(i7, x509Certificate2));
                    Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.removeAll(zzYNF.zzVOD);
                        hashSet.remove(zzZ7U.zzWqr.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    zzYNF.zzZ(certPath, i12, certPathCheckers, hashSet);
                    zzYP8 zzyp8ZzZ3 = zzYNF.zzZ(certPath, zzyr42, initialPolicies, i12, arrayListArr3, zzyp83, hashSet6);
                    if (iZzR > 0 || zzyp8ZzZ3 != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor2, zzyp8ZzZ3, x509Certificate2.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i11);
                } catch (CertPathValidatorException e2) {
                    throw new CertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e2, certPath, -1);
                }
            } catch (IllegalArgumentException e3) {
                throw new CertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e3, certPath, -1);
            }
        } catch (zzYQQ e4) {
            throw new CertPathValidatorException(e4.getMessage(), e4, certPath, certificates.size() - 1);
        }
    }
}

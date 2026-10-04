package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYR6<T extends Certificate> implements zzYGL<T> {
    private final CertSelector zzVWQ;

    public static class zzY extends X509CertSelector {
        private final zzYR6 zzVWP;

        public zzY(zzYR6 zzyr6) {
            this.zzVWP = zzyr6;
            if (zzyr6.zzVWQ instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) zzyr6.zzVWQ;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e) {
                    throw new IllegalStateException(C21111o0ooOoO.OooO00o(e, new StringBuilder("base selector invalid: ")), e);
                }
            }
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public final boolean match(Certificate certificate) {
            zzYR6 zzyr6 = this.zzVWP;
            return zzyr6 == null ? certificate != null : zzyr6.zzWP(certificate);
        }
    }

    public static class zzZ {
        private final CertSelector zzVWQ;

        public zzZ(CertSelector certSelector) {
            this.zzVWQ = (CertSelector) certSelector.clone();
        }

        public final zzYR6<? extends Certificate> zzXBT() {
            return new zzYR6<>(this.zzVWQ, (byte) 0);
        }
    }

    public /* synthetic */ zzYR6(CertSelector certSelector, byte b) {
        this(certSelector);
    }

    @Override // com.aspose.words.internal.zzYGL
    public final Object clone() {
        return new zzYR6(this.zzVWQ);
    }

    @Override // com.aspose.words.internal.zzYGL
    /* JADX INFO: renamed from: match, reason: merged with bridge method [inline-methods] */
    public final boolean zzWP(Certificate certificate) {
        return this.zzVWQ.match(certificate);
    }

    private zzYR6(CertSelector certSelector) {
        this.zzVWQ = certSelector;
    }

    public static Collection<? extends Certificate> zzZ(zzYR6 zzyr6, CertStore certStore) throws CertStoreException {
        return certStore.getCertificates(new zzY(zzyr6));
    }
}

package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYR8<T extends CRL> implements zzYGL<T> {
    private final boolean zzVWS;
    private final byte[] zzVWT;
    private final BigInteger zzVWU;
    private final boolean zzVWV;
    private final boolean zzVWW;
    private final CRLSelector zzVWX;

    public static class zzY extends X509CRLSelector {
        private final zzYR8 zzVWR;

        public zzY(zzYR8 zzyr8) {
            this.zzVWR = zzyr8;
            if (zzyr8.zzVWX instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) zzyr8.zzVWX;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public final boolean match(CRL crl) {
            zzYR8 zzyr8 = this.zzVWR;
            return zzyr8 == null ? crl != null : zzyr8.zzWP(crl);
        }
    }

    public static class zzZ {
        private final CRLSelector zzVWX;
        private boolean zzVWW = false;
        private boolean zzVWV = false;
        private BigInteger zzVWU = null;
        private byte[] zzVWT = null;
        private boolean zzVWS = false;

        public zzZ(CRLSelector cRLSelector) {
            this.zzVWX = (CRLSelector) cRLSelector.clone();
        }

        public final void zzS(BigInteger bigInteger) {
            this.zzVWU = bigInteger;
        }

        public final void zzVW(byte[] bArr) {
            this.zzVWT = zzYGU.zzVI(bArr);
        }

        public final zzYR8<? extends CRL> zzXBU() {
            return new zzYR8<>(this, (byte) 0);
        }

        public final void zzXBV() {
            this.zzVWS = true;
        }

        public final zzZ zzXBW() {
            this.zzVWV = true;
            return this;
        }
    }

    public /* synthetic */ zzYR8(zzZ zzz, byte b) {
        this(zzz);
    }

    @Override // com.aspose.words.internal.zzYGL
    public final Object clone() {
        return this;
    }

    public final X509Certificate getCertificateChecking() {
        CRLSelector cRLSelector = this.zzVWX;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYGL
    /* JADX INFO: renamed from: match, reason: merged with bridge method [inline-methods] */
    public final boolean zzWP(CRL crl) {
        if (!(crl instanceof X509CRL)) {
            return this.zzVWX.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(zzZ7U.zzWqA.getId());
            zzZDD zzzddZzYB = extensionValue != null ? zzZDD.zzYB(zzZD9.zzYz(extensionValue).zzXL5()) : null;
            if (this.zzVWW && zzzddZzYB == null) {
                return false;
            }
            if (this.zzVWV && zzzddZzYB != null) {
                return false;
            }
            if (zzzddZzYB != null && this.zzVWU != null && zzzddZzYB.zzXKM().compareTo(this.zzVWU) == 1) {
                return false;
            }
            if (this.zzVWS) {
                byte[] extensionValue2 = x509crl.getExtensionValue(zzZ7U.zzWqz.getId());
                byte[] bArr = this.zzVWT;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!zzYGU.zzp(extensionValue2, bArr)) {
                    return false;
                }
            }
            return this.zzVWX.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }

    private zzYR8(zzZ zzz) {
        this.zzVWX = zzz.zzVWX;
        this.zzVWW = zzz.zzVWW;
        this.zzVWV = zzz.zzVWV;
        this.zzVWU = zzz.zzVWU;
        this.zzVWT = zzz.zzVWT;
        this.zzVWS = zzz.zzVWS;
    }

    public static Collection<? extends CRL> zzZ(zzYR8 zzyr8, CertStore certStore) throws CertStoreException {
        return certStore.getCRLs(new zzY(zzyr8));
    }
}

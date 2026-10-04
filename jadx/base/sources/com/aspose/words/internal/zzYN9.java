package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzZ7C;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYN9 extends X509CRL {
    private final boolean zzVOp;
    private final byte[] zzVOq;
    private final String zzVOr;
    private final zzZ7Z zzVOs;
    private final Provider zzVUf;
    private volatile boolean zzWqR = false;
    private volatile int zzWst;

    public zzYN9(Provider provider, zzZ7Z zzz7z) throws CRLException {
        this.zzVUf = provider;
        this.zzVOs = zzz7z;
        try {
            this.zzVOr = zzYN6.zzS(zzz7z.zzXIc());
            if (zzz7z.zzXIc().zzXJj() != null) {
                this.zzVOq = zzz7z.zzXIc().zzXJj().zzXL0().getEncoded("DER");
            } else {
                this.zzVOq = null;
            }
            this.zzVOp = zzX(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private Set zzOD(boolean z) {
        zzZ7T zzz7tZzXIH;
        if (getVersion() != 2 || (zzz7tZzXIH = this.zzVOs.zzXIa().zzXIH()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
        while (enumerationZzXHX.hasMoreElements()) {
            zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
            if (z == zzz7tZzXIH.zzQ(zzzda).isCritical()) {
                hashSet.add(zzzda.getId());
            }
        }
        return hashSet;
    }

    public static boolean zzX(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(zzZ7U.zzWqz.getId());
            if (extensionValue != null) {
                return zzZ7N.zzX5(zzZD9.zzYz(extensionValue).zzXL5()).zzXHR();
            }
            return false;
        } catch (Exception e) {
            throw new CRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    private Set zzXAb() {
        zzZ7U zzz7uZzQ;
        HashSet hashSet = new HashSet();
        Enumeration enumerationZzXI9 = this.zzVOs.zzXI9();
        zzZ8C zzz8cZzXn = null;
        while (enumerationZzXI9.hasMoreElements()) {
            zzZ7C.zzZ zzz = (zzZ7C.zzZ) enumerationZzXI9.nextElement();
            hashSet.add(new zzYNA(zzz, this.zzVOp, zzz8cZzXn));
            if (this.zzVOp && zzz.hasExtensions() && (zzz7uZzQ = zzz.zzXIH().zzQ(zzZ7U.zzWqy)) != null) {
                zzz8cZzXn = zzZ8C.zzXn(zzZ7Q.zzX8(zzz7uZzQ.zzXHY()).zzXHV()[0].zzXI1());
            }
        }
        return hashSet;
    }

    private void zzZ(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        if (!this.zzVOs.zzXIc().equals(this.zzVOs.zzXIa().zzXHG())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        byte[] bArr = this.zzVOq;
        if (bArr != null) {
            try {
                zzYN6.zzZ(signature, zzZD5.zzXo(bArr));
            } catch (IOException e) {
                throw new SignatureException(C21111o0ooOoO.OooO00o(e, new StringBuilder("cannot decode signature parameters: ")));
            }
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof zzYN9)) {
            return super.equals(obj);
        }
        zzYN9 zzyn9 = (zzYN9) obj;
        if (this.zzWqR && zzyn9.zzWqR && zzyn9.zzWst != this.zzWst) {
            return false;
        }
        return this.zzVOs.equals(zzyn9.zzVOs);
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return zzOD(true);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        try {
            return this.zzVOs.getEncoded("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        zzZ7U zzz7uZzQ;
        zzZ7T zzz7tZzXIH = this.zzVOs.zzXIa().zzXIH();
        if (zzz7tZzXIH == null || (zzz7uZzQ = zzz7tZzXIH.zzQ(new zzZDA(str))) == null) {
            return null;
        }
        try {
            return zzz7uZzQ.zzXHZ().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return getIssuerX500Principal();
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.zzVOs.zzXIh().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        if (this.zzVOs.zzXI7() != null) {
            return this.zzVOs.zzXI7().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return zzOD(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        zzZ7U zzz7uZzQ;
        Enumeration enumerationZzXI9 = this.zzVOs.zzXI9();
        zzZ8C zzz8cZzXn = null;
        while (enumerationZzXI9.hasMoreElements()) {
            zzZ7C.zzZ zzz = (zzZ7C.zzZ) enumerationZzXI9.nextElement();
            if (bigInteger.equals(zzz.zzXHF().zzXKZ())) {
                return new zzYNA(zzz, this.zzVOp, zzz8cZzXn);
            }
            if (this.zzVOp && zzz.hasExtensions() && (zzz7uZzQ = zzz.zzXIH().zzQ(zzZ7U.zzWqy)) != null) {
                zzz8cZzXn = zzZ8C.zzXn(zzZ7Q.zzX8(zzz7uZzQ.zzXHY()).zzXHV()[0].zzXI1());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        Set setZzXAb = zzXAb();
        if (setZzXAb.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(setZzXAb);
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        return this.zzVOr;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.zzVOs.zzXIc().zzXJk().getId();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        byte[] bArr = this.zzVOq;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.zzVOs.zzXIb().zzXL5();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() throws CRLException {
        try {
            return this.zzVOs.zzXIa().getEncoded("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.zzVOs.zzXI8().getDate();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        return this.zzVOs.zzXIi();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.removeAll(zzYNF.zzVOC);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.zzWqR) {
            this.zzWst = super.hashCode();
            this.zzWqR = true;
        }
        return this.zzWst;
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        zzZ8C zzz8cZzXIh;
        zzZ7U zzz7uZzQ;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        Enumeration enumerationZzXI9 = this.zzVOs.zzXI9();
        zzZ8C zzz8cZzXIh2 = this.zzVOs.zzXIh();
        if (enumerationZzXI9.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationZzXI9.hasMoreElements()) {
                zzZ7C.zzZ zzzZzWX = zzZ7C.zzZ.zzWX(enumerationZzXI9.nextElement());
                if (this.zzVOp && zzzZzWX.hasExtensions() && (zzz7uZzQ = zzzZzWX.zzXIH().zzQ(zzZ7U.zzWqy)) != null) {
                    zzz8cZzXIh2 = zzZ8C.zzXn(zzZ7Q.zzX8(zzz7uZzQ.zzXHY()).zzXHV()[0].zzXI1());
                }
                if (zzzZzWX.zzXHF().zzXKZ().equals(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        zzz8cZzXIh = zzZ8C.zzXn(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            zzz8cZzXIh = zzZ7B.zzWW(certificate.getEncoded()).zzXIh();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage(), e);
                        }
                    }
                    return zzz8cZzXIh2.equals(zzz8cZzXIh);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("              Version: ");
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(getVersion());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(strLineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(zzYGI.zzVG(zzYGC.zzm(signature, 0, 20)));
        stringBuffer.append(strLineSeparator);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(zzYGI.zzVG(zzYGC.zzm(signature, i, 20)));
                stringBuffer.append(strLineSeparator);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(zzYGI.zzVG(zzYGC.zzm(signature, i, signature.length - i)));
                stringBuffer.append(strLineSeparator);
            }
        }
        zzZ7T zzz7tZzXIH = this.zzVOs.zzXIa().zzXIH();
        if (zzz7tZzXIH != null) {
            Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
            if (enumerationZzXHX.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(strLineSeparator);
            }
            while (enumerationZzXHX.hasMoreElements()) {
                zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
                zzZ7U zzz7uZzQ = zzz7tZzXIH.zzQ(zzzda);
                if (zzz7uZzQ.zzXHZ() != null) {
                    byte[] bArrZzXL5 = zzz7uZzQ.zzXHZ().zzXL5();
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(zzz7uZzQ.isCritical());
                    stringBuffer.append(") ");
                    try {
                        zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArrZzXL5);
                        if (zzzda.equals(zzZ7U.zzWqE)) {
                            stringBuffer.append(new zzZ82(zzZDD.zzYB(zzzd5ZzXo).zzXKM()));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ7U.zzWqA)) {
                            stringBuffer.append("Base CRL: " + new zzZ82(zzZDD.zzYB(zzzd5ZzXo).zzXKM()));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ7U.zzWqz)) {
                            stringBuffer.append(zzZ7N.zzX5(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ7U.zzWqw)) {
                            stringBuffer.append(zzZ83.zzXj(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ7U.zzWqq)) {
                            stringBuffer.append(zzZ83.zzXj(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else {
                            stringBuffer.append(zzzda.getId());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(zzZ8F.zzXr(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(zzzda.getId());
                        stringBuffer.append(" value = *****");
                        stringBuffer.append(strLineSeparator);
                    }
                } else {
                    stringBuffer.append(strLineSeparator);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(strLineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException, NoSuchProviderException {
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), this.zzVUf);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        zzZ(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        Signature signature;
        if (str != null) {
            signature = Signature.getInstance(getSigAlgName(), str);
        } else {
            signature = Signature.getInstance(getSigAlgName());
        }
        zzZ(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        Signature signature;
        if (provider != null) {
            signature = Signature.getInstance(getSigAlgName(), provider);
        } else {
            signature = Signature.getInstance(getSigAlgName());
        }
        zzZ(publicKey, signature);
    }
}

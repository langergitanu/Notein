package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYN8 extends X509Certificate {

    /* JADX INFO: renamed from: a */
    private final zzZ84 f51244a;

    /* JADX INFO: renamed from: b */
    private final boolean[] f51245b;

    /* JADX INFO: renamed from: c */
    private volatile PublicKey f51246c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f51247d;
    private final zzZ80 zzVOo;
    private volatile int zzVOu;
    private final zzYQ8 zzVWk;

    public zzYN8(zzYQ8 zzyq8, zzZ80 zzz80) throws CertificateParsingException {
        this.zzVWk = zzyq8;
        this.zzVOo = zzz80;
        try {
            byte[] bArrZzwj = zzwj("2.5.29.19");
            if (bArrZzwj != null) {
                this.f51244a = zzZ84.zzXk(zzZD5.zzXo(bArrZzwj));
            } else {
                this.f51244a = null;
            }
            try {
                byte[] bArrZzwj2 = zzwj("2.5.29.15");
                if (bArrZzwj2 == null) {
                    this.f51245b = null;
                    return;
                }
                zzZCG zzzcgZzYu = zzZCG.zzYu(zzZD5.zzXo(bArrZzwj2));
                byte[] bytes = zzzcgZzYu.getBytes();
                int length = (bytes.length * 8) - zzzcgZzYu.zzXL4();
                int i = 9;
                if (length >= 9) {
                    i = length;
                }
                this.f51245b = new boolean[i];
                for (int i2 = 0; i2 != length; i2++) {
                    this.f51245b[i2] = (bytes[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                }
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    private static Collection zzVQ(byte[] bArr) throws CertificateParsingException {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationZzXKE = zzZD4.zzYy(bArr).zzXKE();
            while (enumerationZzXKE.hasMoreElements()) {
                zzZ7R zzz7rZzX9 = zzZ7R.zzX9(enumerationZzXKE.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(zzz7rZzX9.zzXKy()));
                switch (zzz7rZzX9.zzXKy()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(zzz7rZzX9.getEncoded());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((zzZCZ) zzz7rZzX9.zzXI1()).getString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        arrayList2.add(zzZ8C.zzZ(zzZ87.zzWrP, zzz7rZzX9.zzXI1()).toString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(zzZD9.zzYz(zzz7rZzX9.zzXI1()).zzXL5()).getHostAddress());
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                        break;
                    case 8:
                        arrayList2.add(zzZDA.zzYA(zzz7rZzX9.zzXI1()).getId());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + zzz7rZzX9.zzXKy());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private void zzY(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        if (!zzZ(this.zzVOo.zzXIc(), this.zzVOo.zzXIj().zzXHG())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        zzYN6.zzZ(signature, this.zzVOo.zzXIc().zzXJj());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    private static Signature zzZ(Provider provider, String str) throws NoSuchAlgorithmException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        try {
            return Signature.getInstance(str, provider);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }

    private byte[] zzwj(String str) {
        zzZ7U zzz7uZzQ;
        zzZ7T zzz7tZzXIH = this.zzVOo.zzXIj().zzXIH();
        if (zzz7tZzXIH == null || (zzz7uZzQ = zzz7tZzXIH.zzQ(new zzZDA(str))) == null) {
            return null;
        }
        return zzz7uZzQ.zzXHZ().zzXL5();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzYN8)) {
            return super.equals(obj);
        }
        zzYN8 zzyn8 = (zzYN8) obj;
        if (this.f51247d && zzyn8.f51247d && this.zzVOu != zzyn8.zzVOu) {
            return false;
        }
        return this.zzVOo.equals(zzyn8.zzVOo);
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        zzZ84 zzz84 = this.f51244a;
        if (zzz84 == null || !zzz84.zzXIm()) {
            return -1;
        }
        if (this.f51244a.zzXIl() == null) {
            return Integer.MAX_VALUE;
        }
        return this.f51244a.zzXIl().intValue();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        zzZ7T zzz7tZzXIH = this.zzVOo.zzXIj().zzXIH();
        if (zzz7tZzXIH == null) {
            return null;
        }
        Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
        while (enumerationZzXHX.hasMoreElements()) {
            zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
            if (zzz7tZzXIH.zzQ(zzzda).isCritical()) {
                hashSet.add(zzzda.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.zzVOo.getEncoded("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrZzwj = zzwj("2.5.29.37");
        if (bArrZzwj == null) {
            return null;
        }
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(bArrZzwj);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != zzzd4ZzYy.size(); i++) {
                arrayList.add(((zzZDA) zzzd4ZzYy.zzg6(i)).getId());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        zzZ7U zzz7uZzQ;
        zzZ7T zzz7tZzXIH = this.zzVOo.zzXIj().zzXIH();
        if (zzz7tZzXIH == null || (zzz7uZzQ = zzz7tZzXIH.zzQ(new zzZDA(str))) == null) {
            return null;
        }
        try {
            return zzz7uZzQ.zzXHZ().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return zzVQ(zzwj(zzZ7U.zzWqG.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        zzZCG zzzcgZzXHD = this.zzVOo.zzXIj().zzXHD();
        if (zzzcgZzXHD == null) {
            return null;
        }
        byte[] bytes = zzzcgZzXHD.getBytes();
        int length = (bytes.length * 8) - zzzcgZzXHD.zzXL4();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new zzZD7(byteArrayOutputStream).zzY(this.zzVOo.zzXIh());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException(C21111o0ooOoO.OooO00o(e, new StringBuilder("can't encode issuer DN: ")), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.f51245b;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        zzZ7T zzz7tZzXIH = this.zzVOo.zzXIj().zzXIH();
        if (zzz7tZzXIH == null) {
            return null;
        }
        Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
        while (enumerationZzXHX.hasMoreElements()) {
            zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
            if (!zzz7tZzXIH.zzQ(zzzda).isCritical()) {
                hashSet.add(zzzda.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.zzVOo.zzXIf().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.zzVOo.zzXIg().getDate();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        try {
            if (this.f51246c == null) {
                this.f51246c = this.zzVWk.zzU(this.zzVOo.zzXId());
            }
            return this.f51246c;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.zzVOo.zzXJQ().zzXKZ();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        zzYQ8 zzyq8 = this.zzVWk;
        if (zzyq8 != null) {
            String property = zzyq8.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.zzVOo.zzXIc().zzXJk().getId();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        if (this.zzVOo.zzXIc().zzXJj() != null) {
            try {
                return this.zzVOo.zzXIc().zzXJj().zzXL0().getEncoded("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.zzVOo.zzXIb().zzXL5();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return zzVQ(zzwj(zzZ7U.zzWqH.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        zzZCG zzzcgZzXHC = this.zzVOo.zzXIj().zzXHC();
        if (zzzcgZzXHC == null) {
            return null;
        }
        byte[] bytes = zzzcgZzXHC.getBytes();
        int length = (bytes.length * 8) - zzzcgZzXHC.zzXL4();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new zzZD7(byteArrayOutputStream).zzY(this.zzVOo.zzXIe());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException(C21111o0ooOoO.OooO00o(e, new StringBuilder("can't encode issuer DN: ")), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.zzVOo.zzXIj().getEncoded("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.zzVOo.zzXIi();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        if (getVersion() == 3 && this.zzVOo.zzXIj().zzXIH() != null) {
            Set criticalExtensionOIDs = getCriticalExtensionOIDs();
            criticalExtensionOIDs.removeAll(zzYNF.zzVOD);
            if (!criticalExtensionOIDs.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.f51247d) {
            this.zzVOu = super.hashCode();
            this.f51247d = true;
        }
        return this.zzVOu;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("  [0]         Version: ");
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(getVersion());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
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
        zzZ7T zzz7tZzXIH = this.zzVOo.zzXIj().zzXIH();
        if (zzz7tZzXIH != null) {
            Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
            if (enumerationZzXHX.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
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
                        if (zzzda.equals(zzZ7U.zzWqF)) {
                            stringBuffer.append(zzZ84.zzXk(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ7U.zzWqJ)) {
                            stringBuffer.append(zzZ7M.zzX4(zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ9U.zzWBs)) {
                            stringBuffer.append(new zzZ9T((zzZCG) zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ9U.zzWBq)) {
                            stringBuffer.append(new zzZ9S((zzZC9) zzzd5ZzXo));
                            stringBuffer.append(strLineSeparator);
                        } else if (zzzda.equals(zzZ9U.zzWBj)) {
                            stringBuffer.append(new zzZ9Q((zzZC9) zzzd5ZzXo));
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        zzY(publicKey, zzZ(this.zzVWk, zzYN6.zzS(this.zzVOo.zzXIc())));
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.zzVOo.zzXIf().zzXKU());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.zzVOo.zzXIg().zzXKU());
    }

    private static boolean zzZ(zzZ86 zzz86, zzZ86 zzz862) {
        if (!zzz86.zzXJk().equals(zzz862.zzXJk())) {
            return false;
        }
        if (zzz86.zzXJj() == null) {
            return zzz862.zzXJj() == null || zzz862.zzXJj().equals(zzZC8.zzWHS);
        }
        if (zzz862.zzXJj() == null) {
            return zzz86.zzXJj() == null || zzz86.zzXJj().equals(zzZC8.zzWHS);
        }
        return zzz86.zzXJj().equals(zzz862.zzXJj());
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Signature signature;
        String strZzS = zzYN6.zzS(this.zzVOo.zzXIc());
        if (str != null) {
            signature = Signature.getInstance(strZzS, str);
        } else {
            signature = Signature.getInstance(strZzS);
        }
        zzY(publicKey, signature);
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        zzY(publicKey, zzZ(provider, zzYN6.zzS(this.zzVOo.zzXIc())));
    }
}

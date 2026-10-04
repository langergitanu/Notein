package com.aspose.words.internal;

import com.aspose.words.internal.zzYR6;
import com.aspose.words.internal.zzYR8;
import com.orion.penkit.models.LayerInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ7 {
    protected static final zzYPC zzVUP = new zzYPC();
    protected static final String zzVUO = zzZ7U.zzWqE.getId();
    protected static final String[] zzVUN = {LayerInfo.UNSPECIFIED_LAYER_ID, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    private static zzZD5 zzN(String str, byte[] bArr) throws zzYQQ {
        try {
            return zzZD5.zzXo(zzZD9.zzYz(bArr).zzXL5());
        } catch (Exception e) {
            throw new zzYQQ(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("exception processing extension ", str), e);
        }
    }

    public static boolean zzW(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static X500Principal zzWM(Object obj) {
        return ((X509Certificate) obj).getIssuerX500Principal();
    }

    public static X500Principal zzX(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectX500Principal();
    }

    public static zzZ8C zzY(X509Certificate x509Certificate) {
        return zzZ8C.zzXn(x509Certificate.getSubjectX500Principal().getEncoded());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrustAnchor zzZ(X509Certificate x509Certificate, Set set, String str) throws zzYQQ {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        try {
            x509CertSelector.setSubject(issuerX500Principal.getEncoded());
            Iterator it = set.iterator();
            TrustAnchor trustAnchor = null;
            Exception e = null;
            PublicKey cAPublicKey = null;
            while (it.hasNext() && trustAnchor == null) {
                trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        cAPublicKey = trustAnchor.getTrustedCert().getPublicKey();
                    } else {
                        trustAnchor = null;
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                    try {
                        if (issuerX500Principal.equals(new X500Principal(trustAnchor.getCAName()))) {
                            cAPublicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cAPublicKey != null) {
                    try {
                        zzZ(x509Certificate, cAPublicKey, str);
                    } catch (Exception e2) {
                        e = e2;
                        trustAnchor = null;
                        cAPublicKey = null;
                    }
                }
            }
            if (trustAnchor != null || e == null) {
                return trustAnchor;
            }
            throw new zzYQQ("TrustAnchor found but certificate validation failed.", e);
        } catch (IOException e3) {
            throw new zzYQQ("Cannot set subject search criteria for trust anchor.", e3);
        }
    }

    public static boolean zzW(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    public static final Set zzX(zzZD4 zzzd4) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (zzzd4 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzZD7 zzzd7 = new zzZD7(byteArrayOutputStream);
            Enumeration enumerationZzXKE = zzzd4.zzXKE();
            while (enumerationZzXKE.hasMoreElements()) {
                try {
                    zzzd7.zzY((zzZDK) enumerationZzXKE.nextElement());
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (IOException e) {
                    throw new CertPathValidatorException("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    public static void zzY(int i, List[] listArr, zzZDA zzzda, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzYP8 zzyp8 = (zzYP8) list.get(i2);
            if ("2.5.29.32.0".equals(zzyp8.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(zzzda.getId());
                zzYP8 zzyp82 = new zzYP8(new ArrayList(), i, hashSet, zzyp8, set, zzzda.getId(), false);
                zzyp8.zzZ(zzyp82);
                listArr[i].add(zzyp82);
                return;
            }
        }
    }

    private static boolean zzY(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(zzYNF.zzVOL);
    }

    public static List<zzYR7> zzZ(byte[] bArr, Map<zzZ7R, zzYR7> map) throws CertificateParsingException {
        if (bArr != null) {
            zzZ7R[] zzz7rArrZzXHV = zzZ7Q.zzX8(zzZD9.zzYz(bArr).zzXL5()).zzXHV();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != zzz7rArrZzXHV.length; i++) {
                zzYR7 zzyr7 = map.get(zzz7rArrZzXHV[i]);
                if (zzyr7 != null) {
                    arrayList.add(zzyr7);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static zzZD5 zzZ(X509Extension x509Extension, String str) throws zzYQQ {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return zzN(str, extensionValue);
    }

    public static X500Principal zzZ(X509CRL x509crl) {
        return x509crl.getIssuerX500Principal();
    }

    public static zzZ86 zzZ(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return zzZ7D.zzWZ(publicKey.getEncoded()).zzXHJ();
        } catch (Exception e) {
            throw new CertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    public static zzYP8 zzZ(zzYP8 zzyp8, List[] listArr, zzYP8 zzyp82) {
        zzYP8 zzyp83 = (zzYP8) zzyp82.getParent();
        if (zzyp8 == null) {
            return null;
        }
        if (zzyp83 == null) {
            for (int i = 0; i < listArr.length; i++) {
                listArr[i] = new ArrayList();
            }
            return null;
        }
        zzyp83.zzY(zzyp82);
        zzZ(listArr, zzyp82);
        return zzyp8;
    }

    private static void zzZ(List[] listArr, zzYP8 zzyp8) {
        listArr[zzyp8.getDepth()].remove(zzyp8);
        if (zzyp8.hasChildren()) {
            Iterator children = zzyp8.getChildren();
            while (children.hasNext()) {
                zzZ(listArr, (zzYP8) children.next());
            }
        }
    }

    public static boolean zzZ(int i, List[] listArr, zzZDA zzzda, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzYP8 zzyp8 = (zzYP8) list.get(i2);
            if (zzyp8.getExpectedPolicies().contains(zzzda.getId())) {
                HashSet hashSet = new HashSet();
                hashSet.add(zzzda.getId());
                zzYP8 zzyp82 = new zzYP8(new ArrayList(), i, hashSet, zzyp8, set, zzzda.getId(), false);
                zzyp8.zzZ(zzyp82);
                listArr[i].add(zzyp82);
                list.set(i2, zzyp8);
                return true;
            }
        }
        return false;
    }

    public static Collection zzZ(zzYR6 zzyr6, List list) throws zzYQQ {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (obj instanceof zzYGK) {
                try {
                    linkedHashSet.addAll(((zzYGK) obj).zzZ(zzyr6));
                } catch (zzYGJ e) {
                    throw new zzYQQ("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(zzYR6.zzZ(zzyr6, (CertStore) obj));
                } catch (CertStoreException e2) {
                    throw new zzYQQ("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return linkedHashSet;
    }

    public static List<zzYR9> zzZ(zzZ83 zzz83, Map<zzZ7R, zzYR9> map) throws zzYQQ {
        if (zzz83 != null) {
            try {
                zzZ7W[] zzz7wArrZzXIk = zzz83.zzXIk();
                ArrayList arrayList = new ArrayList();
                for (zzZ7W zzz7w : zzz7wArrZzXIk) {
                    zzZ7V zzz7vZzXI4 = zzz7w.zzXI4();
                    if (zzz7vZzXI4 != null && zzz7vZzXI4.getType() == 0) {
                        for (zzZ7R zzz7r : zzZ7Q.zzX8(zzz7vZzXI4.zzXI1()).zzXHV()) {
                            zzYR9 zzyr9 = map.get(zzz7r);
                            if (zzyr9 != null) {
                                arrayList.add(zzyr9);
                            }
                        }
                    }
                }
                return arrayList;
            } catch (Exception e) {
                throw new zzYQQ("Distribution points could not be read.", e);
            }
        }
        return Collections.EMPTY_LIST;
    }

    private static void zzZ(zzZ7W zzz7w, Collection collection, X509CRLSelector x509CRLSelector) throws zzYQQ {
        ArrayList arrayList = new ArrayList();
        if (zzz7w.zzXI2() != null) {
            zzZ7R[] zzz7rArrZzXHV = zzz7w.zzXI2().zzXHV();
            for (int i = 0; i < zzz7rArrZzXHV.length; i++) {
                if (zzz7rArrZzXHV[i].zzXKy() == 4) {
                    try {
                        arrayList.add(new X500Principal(zzz7rArrZzXHV[i].zzXI1().zzXL0().getEncoded()));
                    } catch (IOException e) {
                        throw new zzYQQ("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
        } else if (zzz7w.zzXI4() != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add((X500Principal) it.next());
            }
        } else {
            throw new zzYQQ("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((X500Principal) it2.next()).getEncoded());
            } catch (IOException e2) {
                throw new zzYQQ("Cannot decode CRL issuer information.", e2);
            }
        }
    }

    public static void zzZ(Date date, X509CRL x509crl, Object obj, zzYQ6 zzyq6) throws zzYQQ {
        X509CRLEntry revokedCertificate;
        zzZDI zzzdiZzYD;
        try {
            if (zzYN9.zzX(x509crl)) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (certificateIssuer == null) {
                    certificateIssuer = x509crl.getIssuerX500Principal();
                }
                if (!x509Certificate.getIssuerX500Principal().equals(certificateIssuer)) {
                    return;
                }
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) obj;
                if (!x509Certificate2.getIssuerX500Principal().equals(x509crl.getIssuerX500Principal()) || (revokedCertificate = x509crl.getRevokedCertificate(x509Certificate2.getSerialNumber())) == null) {
                    return;
                }
            }
            if (revokedCertificate.hasExtensions()) {
                try {
                    zzzdiZzYD = zzZDI.zzYD(zzZ(revokedCertificate, zzZ7U.zzWqD.getId()));
                } catch (Exception e) {
                    throw new zzYQQ("Reason code CRL entry extension could not be decoded.", e);
                }
            } else {
                zzzdiZzYD = null;
            }
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || zzzdiZzYD == null || zzzdiZzYD.zzXKZ().intValue() == 0 || zzzdiZzYD.zzXKZ().intValue() == 1 || zzzdiZzYD.zzXKZ().intValue() == 2 || zzzdiZzYD.zzXKZ().intValue() == 8) {
                if (zzzdiZzYD != null) {
                    zzyq6.zzVUM = zzzdiZzYD.zzXKZ().intValue();
                } else {
                    zzyq6.zzVUM = 0;
                }
                zzyq6.zzVUL = revokedCertificate.getRevocationDate();
            }
        } catch (CRLException e2) {
            throw new zzYQQ("Failed check for indirect CRL.", e2);
        }
    }

    public static Set zzZ(Date date, X509CRL x509crl, List<CertStore> list, List<zzYR9> list2) throws zzYQQ {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(x509crl.getIssuerX500Principal().getEncoded());
            try {
                zzZD5 zzzd5ZzZ = zzZ(x509crl, zzVUO);
                BigInteger bigIntegerZzXKM = zzzd5ZzZ != null ? zzZDD.zzYB(zzzd5ZzZ).zzXKM() : null;
                try {
                    byte[] extensionValue = x509crl.getExtensionValue(zzYNF.zzVON);
                    x509CRLSelector.setMinCRLNumber(bigIntegerZzXKM != null ? bigIntegerZzXKM.add(BigInteger.valueOf(1L)) : null);
                    zzYR8.zzZ zzz = new zzYR8.zzZ(x509CRLSelector);
                    zzz.zzVW(extensionValue);
                    zzz.zzXBV();
                    zzz.zzS(bigIntegerZzXKM);
                    Set<X509CRL> setZzZ = zzYPC.zzZ(zzz.zzXBU(), date, list, list2);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : setZzZ) {
                        if (zzY(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e) {
                    throw new zzYQQ("Issuing distribution point extension value could not be read.", e);
                }
            } catch (Exception e2) {
                throw new zzYQQ("CRL number extension could not be extracted from CRL.", e2);
            }
        } catch (IOException e3) {
            throw new zzYQQ("Cannot extract issuer from CRL.", e3);
        }
    }

    public static Set zzZ(zzZ7W zzz7w, Object obj, zzYR4 zzyr4) throws zzYQQ {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(((X509Certificate) obj).getIssuerX500Principal());
            zzZ(zzz7w, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            zzYR8<? extends CRL> zzyr8ZzXBU = new zzYR8.zzZ(x509CRLSelector).zzXBW().zzXBU();
            zzyr4.getDate();
            Set setZzZ = zzYPC.zzZ(zzyr8ZzXBU, zzyr4.getDate(), zzyr4.getCertStores(), zzyr4.zzXBN());
            if (!setZzZ.isEmpty()) {
                return setZzZ;
            }
            throw new zzYQQ("No CRLs found for issuer \"" + ((X509Certificate) obj).getIssuerX500Principal() + "\"");
        } catch (zzYQQ e) {
            throw new zzYQQ("Could not get issuer information from distribution point.", e);
        }
    }

    public static Date zzZ(zzYR4 zzyr4, CertPath certPath, int i) throws zzYQQ {
        if (zzyr4.zzXBK() != 1) {
            return zzyr4.getDate();
        }
        if (i <= 0) {
            return zzyr4.getDate();
        }
        int i2 = i - 1;
        if (i2 == 0) {
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i2)).getExtensionValue(zzZ9Z.zzWBX.getId());
                zzZDF zzzdfZzYC = extensionValue != null ? zzZDF.zzYC(zzZD5.zzXo(extensionValue)) : null;
                if (zzzdfZzYC != null) {
                    try {
                        return zzzdfZzYC.getDate();
                    } catch (ParseException e) {
                        throw new zzYQQ("Date from date of cert gen extension could not be parsed.", e);
                    }
                }
                return ((X509Certificate) certPath.getCertificates().get(i2)).getNotBefore();
            } catch (IOException unused) {
                throw new zzYQQ("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new zzYQQ("Date of cert gen extension could not be read.");
            }
        }
        return ((X509Certificate) certPath.getCertificates().get(i2)).getNotBefore();
    }

    public static PublicKey zzZ(List list, int i, Provider provider) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i < list.size()) {
                PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
                if (publicKey2 instanceof DSAPublicKey) {
                    dSAPublicKey = (DSAPublicKey) publicKey2;
                } else {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
            } else {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return KeyFactory.getInstance("DSA", provider).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new CertPathValidatorException(e.getMessage(), e);
        }
    }

    public static Collection zzZ(X509Certificate x509Certificate, List<CertStore> list, List<zzYR7> list2) throws zzYQQ {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(x509Certificate.getIssuerX500Principal().getEncoded());
            zzYR6<? extends Certificate> zzyr6ZzXBT = new zzYR6.zzZ(x509CertSelector).zzXBT();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(zzZ(zzyr6ZzXBT, list));
                arrayList.addAll(zzZ(zzyr6ZzXBT, list2));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((X509Certificate) it.next());
                }
                return linkedHashSet;
            } catch (zzYQQ e) {
                throw new zzYQQ("Issuer certificate cannot be searched.", e);
            }
        } catch (IOException e2) {
            throw new zzYQQ("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static void zzZ(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }
}

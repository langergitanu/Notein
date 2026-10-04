package com.aspose.words.internal;

import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.internal.zzYR4;
import com.aspose.words.internal.zzYR5;
import com.aspose.words.internal.zzYR6;
import com.orion.penkit.models.LayerInfo;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNF {
    static final Set<String> zzVOC;
    static final Set<String> zzVOD;
    public static final String zzVOE;
    public static final String zzVOF;
    public static final String zzVOG;
    public static final String zzVOH;
    public static final String zzVOI;
    public static final String zzVOJ;
    public static final String zzVOK;
    public static final String zzVOL;
    public static final String zzVOM;
    public static final String zzVON;
    public static final String zzVOO;
    public static final String zzVOP;
    public static final String zzVOQ;
    protected static final String[] zzVUN;
    public static final String zzVUO;
    private static final zzYPC zzVUP = new zzYPC();

    static {
        String id = zzZ7U.zzWqv.getId();
        zzVOQ = id;
        String id2 = zzZ7U.zzWqu.getId();
        zzVOP = id2;
        String id3 = zzZ7U.zzWqp.getId();
        zzVOO = id3;
        String id4 = zzZ7U.zzWqz.getId();
        zzVON = id4;
        zzVOM = zzZ7U.zzWqq.getId();
        String id5 = zzZ7U.zzWqA.getId();
        zzVOL = id5;
        String id6 = zzZ7U.zzWqs.getId();
        zzVOK = id6;
        String id7 = zzZ7U.zzWqF.getId();
        zzVOJ = id7;
        zzVOI = zzZ7U.zzWqw.getId();
        String id8 = zzZ7U.zzWqH.getId();
        zzVOH = id8;
        String id9 = zzZ7U.zzWqx.getId();
        zzVOG = id9;
        zzVOF = zzZ7U.zzWqt.getId();
        String id10 = zzZ7U.zzWqJ.getId();
        zzVOE = id10;
        zzVUO = zzZ7U.zzWqE.getId();
        HashSet hashSet = new HashSet();
        zzVOD = hashSet;
        HashSet hashSet2 = new HashSet();
        zzVOC = hashSet2;
        hashSet.add(id10);
        hashSet.add(id);
        hashSet.add(id2);
        hashSet.add(id3);
        hashSet.add(id4);
        hashSet.add(id5);
        hashSet.add(id6);
        hashSet.add(id7);
        hashSet.add(id8);
        hashSet.add(id9);
        hashSet2.add(id4);
        hashSet2.add(id5);
        zzVUN = new String[]{LayerInfo.UNSPECIFIED_LAYER_ID, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    }

    public static int zzR(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOK));
            if (zzzd4ZzYy != null) {
                Enumeration enumerationZzXKE = zzzd4ZzYy.zzXKE();
                while (enumerationZzXKE.hasMoreElements()) {
                    zzZCY zzzcy = (zzZCY) enumerationZzXKE.nextElement();
                    if (zzzcy.zzXKy() == 0) {
                        try {
                            if (zzZDD.zzZ(zzzcy, false).zzXKZ().intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw new CertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (zzYQQ e2) {
            throw new CertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static int zzS(CertPath certPath, int i, int i2) {
        return (zzYQ7.zzW((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int zzT(CertPath certPath, int i, int i2) {
        return (zzYQ7.zzW((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int zzU(CertPath certPath, int i, int i2) {
        return (zzYQ7.zzW((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int zzV(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        BigInteger bigIntegerZzXIl;
        int iIntValue;
        try {
            zzZ84 zzz84ZzXk = zzZ84.zzXk(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOJ));
            return (zzz84ZzXk == null || (bigIntegerZzXIl = zzz84ZzXk.zzXIl()) == null || (iIntValue = bigIntegerZzXIl.intValue()) >= i2) ? i2 : iIntValue;
        } catch (Exception e) {
            throw new CertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int zzW(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        if (zzYQ7.zzW((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        throw new CertPathValidatorException("Max path length not greater than zero", null, certPath, i);
    }

    public static int zzX(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        int iIntValue;
        try {
            zzZDD zzzddZzYB = zzZDD.zzYB(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOO));
            return (zzzddZzYB == null || (iIntValue = zzzddZzYB.zzXKZ().intValue()) >= i2) ? i2 : iIntValue;
        } catch (Exception e) {
            throw new CertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    private static void zzY(zzZ7W zzz7w, Object obj, X509CRL x509crl) throws zzYQQ {
        zzZD5 zzzd5ZzZ = zzYQ7.zzZ(x509crl, zzVON);
        boolean z = true;
        boolean z2 = zzzd5ZzZ != null && zzZ7N.zzX5(zzzd5ZzZ).zzXHR();
        byte[] encoded = zzYQ7.zzZ(x509crl).getEncoded();
        if (zzz7w.zzXI2() != null) {
            zzZ7R[] zzz7rArrZzXHV = zzz7w.zzXI2().zzXHV();
            boolean z3 = false;
            for (int i = 0; i < zzz7rArrZzXHV.length; i++) {
                if (zzz7rArrZzXHV[i].zzXKy() == 4) {
                    try {
                        if (zzYGU.zzp(zzz7rArrZzXHV[i].zzXI1().zzXL0().getEncoded(), encoded)) {
                            z3 = true;
                        }
                    } catch (IOException e) {
                        throw new zzYQQ("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
            if (z3 && !z2) {
                throw new zzYQQ("Distribution point contains cRLIssuer field but CRL is not indirect.");
            }
            if (!z3) {
                throw new zzYQQ("CRL issuer of CRL does not match CRL issuer of distribution point.");
            }
            z = z3;
        } else if (!zzYQ7.zzZ(x509crl).equals(zzYQ7.zzWM(obj))) {
            z = false;
        }
        if (!z) {
            throw new zzYQQ("Cannot find matching CRL issuer for certificate.");
        }
    }

    private static void zzZ(zzZ7W zzz7w, Object obj, X509CRL x509crl) throws zzYQQ {
        int i;
        zzZ7R[] zzz7rArrZzXHV;
        try {
            zzZ7N zzz7nZzX5 = zzZ7N.zzX5(zzYQ7.zzZ(x509crl, zzVON));
            if (zzz7nZzX5 != null) {
                if (zzz7nZzX5.zzXI4() != null) {
                    zzZ7V zzz7vZzXI4 = zzZ7N.zzX5(zzz7nZzX5).zzXI4();
                    ArrayList arrayList = new ArrayList();
                    if (zzz7vZzXI4.getType() == 0) {
                        for (zzZ7R zzz7r : zzZ7Q.zzX8(zzz7vZzXI4.zzXI1()).zzXHV()) {
                            arrayList.add(zzz7r);
                        }
                    }
                    if (zzz7vZzXI4.getType() == 1) {
                        zzZDJ zzzdj = new zzZDJ();
                        try {
                            Enumeration enumerationZzXKE = zzZD4.zzYy(zzZD5.zzXo(zzYQ7.zzZ(x509crl).getEncoded())).zzXKE();
                            while (enumerationZzXKE.hasMoreElements()) {
                                zzzdj.zzZ((zzZDK) enumerationZzXKE.nextElement());
                            }
                            zzzdj.zzZ(zzz7vZzXI4.zzXI1());
                            arrayList.add(new zzZ7R(zzZ8C.zzXn(new zzZC2(zzzdj))));
                        } catch (IOException e) {
                            throw new zzYQQ("Could not read CRL issuer.", e);
                        }
                    }
                    if (zzz7w.zzXI4() == null) {
                        if (zzz7w.zzXI2() == null) {
                            throw new zzYQQ("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                        }
                        zzZ7R[] zzz7rArrZzXHV2 = zzz7w.zzXI2().zzXHV();
                        while (i < zzz7rArrZzXHV2.length) {
                            i = arrayList.contains(zzz7rArrZzXHV2[i]) ? 0 : i + 1;
                        }
                        throw new zzYQQ("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                    zzZ7V zzz7vZzXI42 = zzz7w.zzXI4();
                    zzZ7R[] zzz7rArrZzXHV3 = zzz7vZzXI42.getType() == 0 ? zzZ7Q.zzX8(zzz7vZzXI42.zzXI1()).zzXHV() : null;
                    if (zzz7vZzXI42.getType() == 1) {
                        if (zzz7w.zzXI2() != null) {
                            zzz7rArrZzXHV = zzz7w.zzXI2().zzXHV();
                        } else {
                            zzz7rArrZzXHV = new zzZ7R[1];
                            try {
                                zzz7rArrZzXHV[0] = new zzZ7R(zzZ8C.zzXn(zzYQ7.zzWM(obj).getEncoded()));
                            } catch (Exception e2) {
                                throw new zzYQQ("Could not read certificate issuer.", e2);
                            }
                        }
                        zzz7rArrZzXHV3 = zzz7rArrZzXHV;
                        for (int i2 = 0; i2 < zzz7rArrZzXHV3.length; i2++) {
                            Enumeration enumerationZzXKE2 = zzZD4.zzYy(zzz7rArrZzXHV3[i2].zzXI1().zzXL0()).zzXKE();
                            zzZDJ zzzdj2 = new zzZDJ();
                            while (enumerationZzXKE2.hasMoreElements()) {
                                zzzdj2.zzZ((zzZDK) enumerationZzXKE2.nextElement());
                            }
                            zzzdj2.zzZ(zzz7vZzXI42.zzXI1());
                            zzz7rArrZzXHV3[i2] = new zzZ7R(zzZ8C.zzXn(new zzZC2(zzzdj2)));
                        }
                    }
                    if (zzz7rArrZzXHV3 != null) {
                        while (i < zzz7rArrZzXHV3.length) {
                            i = arrayList.contains(zzz7rArrZzXHV3[i]) ? 0 : i + 1;
                        }
                    }
                    throw new zzYQQ("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                try {
                    zzZ84 zzz84ZzXk = zzZ84.zzXk(zzYQ7.zzZ((X509Extension) obj, zzVOJ));
                    if (obj instanceof X509Certificate) {
                        if (zzz7nZzX5.zzXHT() && zzz84ZzXk != null && zzz84ZzXk.zzXIm()) {
                            throw new zzYQQ("CA Cert CRL only contains user certificates.");
                        }
                        if (zzz7nZzX5.zzXHS() && (zzz84ZzXk == null || !zzz84ZzXk.zzXIm())) {
                            throw new zzYQQ("End CRL only contains CA certificates.");
                        }
                    }
                    if (zzz7nZzX5.zzXHQ()) {
                        throw new zzYQQ("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    throw new zzYQQ("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            throw new zzYQQ("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void zzX(CertPath certPath, int i) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null && !keyUsage[5]) {
            throw new CertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r4 = com.aspose.words.internal.zzZDD.zzZ(r1, false).zzXKZ().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 >= r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzY(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOK));
            if (zzzd4ZzYy != null) {
                Enumeration enumerationZzXKE = zzzd4ZzYy.zzXKE();
                while (true) {
                    if (!enumerationZzXKE.hasMoreElements()) {
                        break;
                    }
                    try {
                        zzZCY zzzcyZzYw = zzZCY.zzYw(enumerationZzXKE.nextElement());
                        if (zzzcyZzYw.zzXKy() == 1) {
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new CertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new CertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static void zzY(CertPath certPath, int i, zzZ7I zzz7i) throws CertPathValidatorException {
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOG));
            zzZ7K zzz7kZzX3 = zzzd4ZzYy != null ? zzZ7K.zzX3(zzzd4ZzYy) : null;
            if (zzz7kZzX3 != null) {
                zzZ7P[] zzz7pArrZzXHO = zzz7kZzX3.zzXHO();
                if (zzz7pArrZzXHO != null) {
                    try {
                        zzz7i.zzY(zzz7pArrZzXHO);
                    } catch (Exception e) {
                        throw new CertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                    }
                }
                zzZ7P[] zzz7pArrZzXHN = zzz7kZzX3.zzXHN();
                if (zzz7pArrZzXHN != null) {
                    for (int i2 = 0; i2 != zzz7pArrZzXHN.length; i2++) {
                        try {
                            zzz7i.zzZ(zzz7pArrZzXHN[i2]);
                        } catch (Exception e2) {
                            throw new CertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw new CertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    public static void zzY(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            zzZ84 zzz84ZzXk = zzZ84.zzXk(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOJ));
            if (zzz84ZzXk != null) {
                if (!zzz84ZzXk.zzXIm()) {
                    throw new CertPathValidatorException("Not a CA certificate");
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
        } catch (Exception e) {
            throw new CertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    private static void zzY(Date date, X509CRL x509crl, Object obj, zzYQ6 zzyq6) throws zzYQQ {
        if (zzyq6.zzVUM == 11) {
            zzYQ7.zzZ(date, x509crl, obj, zzyq6);
        }
    }

    private static zzYNE zzZ(X509CRL x509crl, zzZ7W zzz7w) throws zzYQQ {
        try {
            zzZ7N zzz7nZzX5 = zzZ7N.zzX5(zzYQ7.zzZ(x509crl, zzVON));
            if (zzz7nZzX5 != null && zzz7nZzX5.zzXHP() != null && zzz7w.zzXI3() != null) {
                return new zzYNE(zzz7w.zzXI3()).zzY(new zzYNE(zzz7nZzX5.zzXHP()));
            }
            if ((zzz7nZzX5 == null || zzz7nZzX5.zzXHP() == null) && zzz7w.zzXI3() == null) {
                return zzYNE.zzVOA;
            }
            return (zzz7w.zzXI3() == null ? zzYNE.zzVOA : new zzYNE(zzz7w.zzXI3())).zzY(zzz7nZzX5 == null ? zzYNE.zzVOA : new zzYNE(zzz7nZzX5.zzXHP()));
        } catch (Exception e) {
            throw new zzYQQ("Issuing distribution point extension could not be decoded.", e);
        }
    }

    private static Set zzZ(X509CRL x509crl, X509Certificate x509Certificate, PublicKey publicKey, zzYR4 zzyr4, List list, Provider provider) throws zzYQQ {
        int i;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(zzYQ7.zzZ(x509crl).getEncoded());
            zzYR6<? extends Certificate> zzyr6ZzXBT = new zzYR6.zzZ(x509CertSelector).zzXBT();
            try {
                Collection collectionZzZ = zzYQ7.zzZ(zzyr6ZzXBT, zzyr4.zzXBP());
                collectionZzZ.addAll(zzYQ7.zzZ(zzyr6ZzXBT, zzyr4.getCertStores()));
                collectionZzZ.add(x509Certificate);
                Iterator it = collectionZzZ.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilder certPathBuilder = CertPathBuilder.getInstance("PKIX", provider);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            zzYR4.zzZ zzzZzY = new zzYR4.zzZ(zzyr4).zzY(new zzYR6.zzZ(x509CertSelector2).zzXBT());
                            if (list.contains(x509Certificate2)) {
                                zzzZzY.setRevocationEnabled(false);
                            } else {
                                zzzZzY.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = certPathBuilder.build(new zzYR5.zzZ(zzzZzY.zzXBI()).zzXBQ()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(zzYQ7.zzZ(certificates, 0, provider));
                        } catch (CertPathBuilderException e) {
                            throw new zzYQQ("CertPath for CRL signer failed to validate.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new zzYQQ("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            throw new zzYQQ(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                zzYQQ zzyqq = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage != null && (keyUsage.length < 7 || !keyUsage[6])) {
                        zzyqq = new zzYQQ("Issuer certificate key usage extension does not permit CRL signing.");
                    } else {
                        hashSet.add(arrayList2.get(i));
                    }
                }
                if (hashSet.isEmpty() && zzyqq == null) {
                    throw new zzYQQ("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || zzyqq == null) {
                    return hashSet;
                }
                throw zzyqq;
            } catch (zzYQQ e4) {
                throw new zzYQQ("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (IOException e5) {
            throw new zzYQQ("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    private static PublicKey zzZ(X509CRL x509crl, Set set) throws zzYQQ {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new zzYQQ("Cannot verify CRL.", e);
    }

    private static X509CRL zzZ(Set set, PublicKey publicKey) throws zzYQQ {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new zzYQQ("Cannot verify delta CRL.", e);
    }

    private static void zzZ(X509CRL x509crl, X509CRL x509crl2, zzYR4 zzyr4) throws zzYQQ {
        if (x509crl == null) {
            return;
        }
        try {
            String str = zzVON;
            zzZ7N zzz7nZzX5 = zzZ7N.zzX5(zzYQ7.zzZ(x509crl2, str));
            if (zzyr4.zzXBL()) {
                if (x509crl.getIssuerX500Principal().equals(x509crl2.getIssuerX500Principal())) {
                    try {
                        zzZ7N zzz7nZzX52 = zzZ7N.zzX5(zzYQ7.zzZ(x509crl, str));
                        if (zzz7nZzX5 != null ? zzz7nZzX5.equals(zzz7nZzX52) : zzz7nZzX52 == null) {
                            try {
                                String str2 = zzVOF;
                                zzZD5 zzzd5ZzZ = zzYQ7.zzZ(x509crl2, str2);
                                try {
                                    zzZD5 zzzd5ZzZ2 = zzYQ7.zzZ(x509crl, str2);
                                    if (zzzd5ZzZ == null) {
                                        throw new zzYQQ("CRL authority key identifier is null.");
                                    }
                                    if (zzzd5ZzZ2 != null) {
                                        if (!zzzd5ZzZ.equals(zzzd5ZzZ2)) {
                                            throw new zzYQQ("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                        }
                                        return;
                                    }
                                    throw new zzYQQ("Delta CRL authority key identifier is null.");
                                } catch (zzYQQ e) {
                                    throw new zzYQQ("Authority key identifier extension could not be extracted from delta CRL.", e);
                                }
                            } catch (zzYQQ e2) {
                                throw new zzYQQ("Authority key identifier extension could not be extracted from complete CRL.", e2);
                            }
                        }
                        throw new zzYQQ("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    } catch (Exception e3) {
                        throw new zzYQQ("Issuing distribution point extension from delta CRL could not be decoded.", e3);
                    }
                }
                throw new zzYQQ("Complete CRL issuer does not match delta CRL issuer.");
            }
        } catch (Exception e4) {
            throw new zzYQQ("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    private static void zzZ(Date date, X509CRL x509crl, Object obj, zzYQ6 zzyq6, zzYR4 zzyr4) throws zzYQQ {
        if (!zzyr4.zzXBL() || x509crl == null) {
            return;
        }
        zzYQ7.zzZ(date, x509crl, obj, zzyq6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r5 = r18[r7].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r5.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        r6 = (com.aspose.words.internal.zzYP8) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if ("2.5.29.32.0".equals(r6.getValidPolicy()) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        r5 = ((com.aspose.words.internal.zzZD4) com.aspose.words.internal.zzYQ7.zzZ(r4, com.aspose.words.internal.zzYNF.zzVOQ)).zzXKE();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r5.hasMoreElements() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r8 = com.aspose.words.internal.zzZ7H.zzX1(r5.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if ("2.5.29.32.0".equals(r8.zzXHL().getId()) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r5 = com.aspose.words.internal.zzYQ7.zzX(r8.zzXHK());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy qualifier info set could not be decoded.", r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (r4.getCriticalExtensionOIDs() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        r12 = r4.getCriticalExtensionOIDs().contains(com.aspose.words.internal.zzYNF.zzVOQ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        r5 = (com.aspose.words.internal.zzYP8) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if ("2.5.29.32.0".equals(r5.getValidPolicy()) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r5 = new com.aspose.words.internal.zzYP8(new java.util.ArrayList(), r7, (java.util.Set) r13.get(r11), r5, r10, r11, r12);
        r5.zzZ(r5);
        r18[r7].add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Certificate policies extension could not be decoded.", r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYP8 zzZ(CertPath certPath, int i, List[] listArr, zzYP8 zzyp8, int i2) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size() - i;
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ(x509Certificate, zzVOP));
            if (zzzd4ZzYy == null) {
                return zzyp8;
            }
            HashMap map = new HashMap();
            HashSet<String> hashSet = new HashSet();
            for (int i3 = 0; i3 < zzzd4ZzYy.size(); i3++) {
                zzZD4 zzzd4 = (zzZD4) zzzd4ZzYy.zzg6(i3);
                String id = ((zzZDA) zzzd4.zzg6(0)).getId();
                String id2 = ((zzZDA) zzzd4.zzg6(1)).getId();
                if (!map.containsKey(id)) {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(id2);
                    map.put(id, hashSet2);
                    hashSet.add(id);
                } else {
                    ((Set) map.get(id)).add(id2);
                }
            }
            zzYP8 zzyp82 = zzyp8;
            for (String str : hashSet) {
                if (i2 > 0) {
                    Iterator it = listArr[size].iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zzYP8 zzyp83 = (zzYP8) it.next();
                        if (zzyp83.getValidPolicy().equals(str)) {
                            zzyp83.zzVUb = (Set) map.get(str);
                            break;
                        }
                    }
                } else {
                    Iterator it2 = listArr[size].iterator();
                    while (it2.hasNext()) {
                        zzYP8 zzyp84 = (zzYP8) it2.next();
                        if (zzyp84.getValidPolicy().equals(str)) {
                            ((zzYP8) zzyp84.getParent()).zzY(zzyp84);
                            it2.remove();
                            for (int i4 = size - 1; i4 >= 0; i4--) {
                                List list = listArr[i4];
                                for (int i5 = 0; i5 < list.size(); i5++) {
                                    zzYP8 zzyp85 = (zzYP8) list.get(i5);
                                    if (!zzyp85.hasChildren()) {
                                        zzYP8 zzyp8ZzZ = zzYQ7.zzZ(zzyp82, listArr, zzyp85);
                                        zzyp82 = zzyp8ZzZ;
                                        if (zzyp8ZzZ != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return zzyp82;
        } catch (zzYQQ e) {
            throw new CertPathValidatorException("Policy mappings extension could not be decoded.", e, certPath, i);
        }
    }

    public static void zzZ(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOP));
            if (zzzd4ZzYy != null) {
                for (int i2 = 0; i2 < zzzd4ZzYy.size(); i2++) {
                    try {
                        zzZD4 zzzd4ZzYy2 = zzZD4.zzYy(zzzd4ZzYy.zzg6(i2));
                        zzZDA zzzdaZzYA = zzZDA.zzYA(zzzd4ZzYy2.zzg6(0));
                        zzZDA zzzdaZzYA2 = zzZDA.zzYA(zzzd4ZzYy2.zzg6(1));
                        if (!"2.5.29.32.0".equals(zzzdaZzYA.getId())) {
                            if ("2.5.29.32.0".equals(zzzdaZzYA2.getId())) {
                                throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certPath, i);
                            }
                        } else {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw new CertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (zzYQQ e2) {
            throw new CertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void zzZ(CertPath certPath, int i, zzYP8 zzyp8, int i2) throws CertPathValidatorException {
        if (i2 <= 0 && zzyp8 == null) {
            throw new CertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i);
        }
    }

    public static zzYP8 zzZ(CertPath certPath, int i, zzYP8 zzyp8) throws CertPathValidatorException {
        try {
            if (zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOQ)) == null) {
                return null;
            }
            return zzyp8;
        } catch (zzYQQ e) {
            throw new CertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static void zzZ(CertPath certPath, int i, zzZ7I zzz7i) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!zzYQ7.zzW(x509Certificate) || i2 >= size) {
            try {
                zzZ8C zzz8cZzY = zzYQ7.zzY(x509Certificate);
                try {
                    zzz7i.zzZ(new zzZ7R(zzz8cZzY));
                    zzz7i.zzY(new zzZ7R(zzz8cZzY));
                    try {
                        zzZ7Q zzz7qZzX8 = zzZ7Q.zzX8(zzYQ7.zzZ(x509Certificate, zzVOH));
                        zzZ8D[] zzz8dArrZzS = zzZ8C.zzXn(zzz8cZzY).zzS(zzZ89.zzWrX);
                        for (int i3 = 0; i3 != zzz8dArrZzS.length; i3++) {
                            zzZ7R zzz7r = new zzZ7R(((zzZCZ) zzz8dArrZzS[i3].zzXIq().zzXIs()).getString());
                            try {
                                zzz7i.zzZ(zzz7r);
                                zzz7i.zzY(zzz7r);
                            } catch (zzZ7L e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (zzz7qZzX8 != null) {
                            try {
                                zzZ7R[] zzz7rArrZzXHV = zzz7qZzX8.zzXHV();
                                for (int i4 = 0; i4 < zzz7rArrZzXHV.length; i4++) {
                                    try {
                                        zzz7i.zzZ(zzz7rArrZzXHV[i4]);
                                        zzz7i.zzY(zzz7rArrZzXHV[i4]);
                                    } catch (zzZ7L e2) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (Exception e3) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (zzZ7L e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    public static zzYP8 zzZ(CertPath certPath, int i, Set set, zzYP8 zzyp8, List[] listArr, int i2) throws CertPathValidatorException {
        String id;
        int i3;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i4 = size - i;
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ(x509Certificate, zzVOQ));
            if (zzzd4ZzYy == null || zzyp8 == null) {
                return null;
            }
            Enumeration enumerationZzXKE = zzzd4ZzYy.zzXKE();
            HashSet hashSet = new HashSet();
            while (enumerationZzXKE.hasMoreElements()) {
                zzZ7H zzz7hZzX1 = zzZ7H.zzX1(enumerationZzXKE.nextElement());
                zzZDA zzzdaZzXHL = zzz7hZzX1.zzXHL();
                hashSet.add(zzzdaZzXHL.getId());
                if (!"2.5.29.32.0".equals(zzzdaZzXHL.getId())) {
                    try {
                        Set setZzX = zzYQ7.zzX(zzz7hZzX1.zzXHK());
                        if (!zzYQ7.zzZ(i4, listArr, zzzdaZzXHL, setZzX)) {
                            zzYQ7.zzY(i4, listArr, zzzdaZzXHL, setZzX);
                        }
                    } catch (CertPathValidatorException e) {
                        throw new CertPathValidatorException("Policy qualifier info set could not be build.", e, certPath, i);
                    }
                }
            }
            if (!set.isEmpty() && !set.contains("2.5.29.32.0")) {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            } else {
                set.clear();
                set.addAll(hashSet);
            }
            if (i2 > 0 || (i4 < size && zzYQ7.zzW(x509Certificate))) {
                Enumeration enumerationZzXKE2 = zzzd4ZzYy.zzXKE();
                while (true) {
                    if (!enumerationZzXKE2.hasMoreElements()) {
                        break;
                    }
                    zzZ7H zzz7hZzX12 = zzZ7H.zzX1(enumerationZzXKE2.nextElement());
                    if ("2.5.29.32.0".equals(zzz7hZzX12.zzXHL().getId())) {
                        Set setZzX2 = zzYQ7.zzX(zzz7hZzX12.zzXHK());
                        List list = listArr[i4 - 1];
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            zzYP8 zzyp82 = (zzYP8) list.get(i5);
                            for (Object obj2 : zzyp82.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    id = (String) obj2;
                                } else if (obj2 instanceof zzZDA) {
                                    id = ((zzZDA) obj2).getId();
                                }
                                String str = id;
                                Iterator children = zzyp82.getChildren();
                                boolean z = false;
                                while (children.hasNext()) {
                                    if (str.equals(((zzYP8) children.next()).getValidPolicy())) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str);
                                    zzYP8 zzyp83 = new zzYP8(new ArrayList(), i4, hashSet3, zzyp82, setZzX2, str, false);
                                    zzyp82.zzZ(zzyp83);
                                    listArr[i4].add(zzyp83);
                                }
                            }
                        }
                    }
                }
            }
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                List list2 = listArr[i6];
                for (0; i3 < list2.size(); i3 + 1) {
                    zzYP8 zzyp84 = (zzYP8) list2.get(i3);
                    i3 = (zzyp84.hasChildren() || (zzyp8 = zzYQ7.zzZ(zzyp8, listArr, zzyp84)) != null) ? i3 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean zContains = criticalExtensionOIDs.contains(zzVOQ);
                List list3 = listArr[i4];
                for (int i7 = 0; i7 < list3.size(); i7++) {
                    ((zzYP8) list3.get(i7)).zzOE(zContains);
                }
            }
            return zzyp8;
        } catch (zzYQQ e2) {
            throw new CertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i);
        }
    }

    public static void zzZ(CertPath certPath, zzYR4 zzyr4, int i, PublicKey publicKey, boolean z, X500Principal x500Principal, X509Certificate x509Certificate, Provider provider) throws CertPathValidatorException {
        X509Certificate x509Certificate2;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate3 = (X509Certificate) certificates.get(i);
        if (!z) {
            try {
                zzYQ7.zzZ(x509Certificate3, publicKey, zzyr4.getSigProvider());
            } catch (GeneralSecurityException e) {
                throw new CertPathValidatorException("Could not validate certificate signature.", e, certPath, i);
            }
        }
        try {
            x509Certificate3.checkValidity(zzYQ7.zzZ(zzyr4, certPath, i));
            if (zzyr4.isRevocationEnabled()) {
                x509Certificate2 = x509Certificate3;
                try {
                    zzZ(zzyr4, x509Certificate2, zzYQ7.zzZ(zzyr4, certPath, i), x509Certificate, publicKey, certificates, provider);
                } catch (zzYQQ e2) {
                    throw new CertPathValidatorException(e2.getMessage(), e2.getCause() != null ? e2.getCause() : e2, certPath, i);
                }
            } else {
                x509Certificate2 = x509Certificate3;
            }
            if (zzYQ7.zzWM(x509Certificate2).equals(x500Principal)) {
                return;
            }
            throw new CertPathValidatorException("IssuerName(" + zzYQ7.zzWM(x509Certificate2) + ") does not match SubjectName(" + x500Principal + ") of signing certificate.", null, certPath, i);
        } catch (zzYQQ e3) {
            throw new CertPathValidatorException("Could not validate time of certificate.", e3, certPath, i);
        } catch (CertificateExpiredException e4) {
            throw new CertPathValidatorException("Could not validate certificate: " + e4.getMessage(), e4, certPath, i);
        } catch (CertificateNotYetValidException e5) {
            throw new CertPathValidatorException("Could not validate certificate: " + e5.getMessage(), e5, certPath, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = com.aspose.words.internal.zzZDD.zzZ(r1, false).zzXKZ().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzZ(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzYQ7.zzZ((X509Certificate) certPath.getCertificates().get(i), zzVOK));
            if (zzzd4ZzYy != null) {
                Enumeration enumerationZzXKE = zzzd4ZzYy.zzXKE();
                while (true) {
                    if (!enumerationZzXKE.hasMoreElements()) {
                        break;
                    }
                    try {
                        zzZCY zzzcyZzYw = zzZCY.zzYw(enumerationZzXKE.nextElement());
                        if (zzzcyZzYw.zzXKy() == 0) {
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new CertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new CertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    private static void zzZ(zzZ7W zzz7w, zzYR4 zzyr4, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, zzYQ6 zzyq6, zzYNE zzyne, List list, Provider provider) throws zzYQQ {
        Set<String> criticalExtensionOIDs;
        if (date.getTime() <= new Date(System.currentTimeMillis()).getTime()) {
            Iterator it = zzYQ7.zzZ(zzz7w, x509Certificate, zzyr4).iterator();
            boolean z = false;
            zzYQQ e = null;
            while (it.hasNext() && zzyq6.zzVUM == 11 && !zzyne.zzXAc()) {
                try {
                    X509CRL x509crl = (X509CRL) it.next();
                    zzYNE zzyneZzZ = zzZ(x509crl, zzz7w);
                    if (zzyneZzZ.zzX(zzyne)) {
                        PublicKey publicKeyZzZ = zzZ(x509crl, zzZ(x509crl, x509Certificate2, publicKey, zzyr4, list, provider));
                        zzyr4.getDate();
                        X509CRL x509crlZzZ = zzyr4.zzXBL() ? zzZ(zzYQ7.zzZ(zzyr4.getDate(), x509crl, zzyr4.getCertStores(), zzyr4.zzXBN()), publicKeyZzZ) : null;
                        if (zzyr4.zzXBK() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new zzYQQ("No valid CRL for current time found.");
                        }
                        zzY(zzz7w, x509Certificate, x509crl);
                        zzZ(zzz7w, x509Certificate, x509crl);
                        zzZ(x509crlZzZ, x509crl, zzyr4);
                        zzZ(date, x509crlZzZ, x509Certificate, zzyq6, zzyr4);
                        zzY(date, x509crl, x509Certificate, zzyq6);
                        if (zzyq6.zzVUM == 8) {
                            zzyq6.zzVUM = 11;
                        }
                        zzyne.zzZ(zzyneZzZ);
                        Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(zzZ7U.zzWqz.getId());
                            hashSet.remove(zzZ7U.zzWqA.getId());
                            if (!hashSet.isEmpty()) {
                                throw new zzYQQ("CRL contains unsupported critical extensions.");
                            }
                        }
                        if (x509crlZzZ != null && (criticalExtensionOIDs = x509crlZzZ.getCriticalExtensionOIDs()) != null) {
                            HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                            hashSet2.remove(zzZ7U.zzWqz.getId());
                            hashSet2.remove(zzZ7U.zzWqA.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new zzYQQ("Delta CRL contains unsupported critical extension.");
                            }
                        }
                        z = true;
                    }
                } catch (zzYQQ e2) {
                    e = e2;
                }
            }
            if (!z) {
                throw e;
            }
            return;
        }
        throw new zzYQQ("Validation time is in future.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[PHI: r0
      0x00cc: PHI (r0v11 'e' com.aspose.words.internal.zzYQQ) = 
      (r0v10 'e' com.aspose.words.internal.zzYQQ)
      (r0v23 'e' com.aspose.words.internal.zzYQQ)
      (r0v10 'e' com.aspose.words.internal.zzYQQ)
     binds: [B:28:0x007f, B:34:0x00c2, B:30:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzYR4 zzyr4, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, List list, Provider provider) throws zzYQQ {
        boolean z;
        zzYQQ e;
        try {
            X509Certificate x509Certificate3 = x509Certificate;
            zzZ83 zzz83ZzXj = zzZ83.zzXj(zzYQ7.zzZ(x509Certificate3, zzVOI));
            zzYR4.zzZ zzz = new zzYR4.zzZ(zzyr4);
            try {
                Iterator<zzYR9> it = zzYQ7.zzZ(zzz83ZzXj, zzyr4.zzXBM()).iterator();
                while (it.hasNext()) {
                    zzz.zzZ(it.next());
                }
                zzYQ6 zzyq6 = new zzYQ6();
                zzYNE zzyne = new zzYNE();
                zzYR4 zzyr4ZzXBI = zzz.zzXBI();
                boolean z2 = true;
                if (zzz83ZzXj != null) {
                    try {
                        zzZ7W[] zzz7wArrZzXIk = zzz83ZzXj.zzXIk();
                        int i = 0;
                        z = false;
                        e = null;
                        while (i < zzz7wArrZzXIk.length && zzyq6.zzVUM == 11 && !zzyne.zzXAc()) {
                            try {
                                zzZ(zzz7wArrZzXIk[i], zzyr4ZzXBI, x509Certificate3, date, x509Certificate2, publicKey, zzyq6, zzyne, list, provider);
                                z = true;
                            } catch (zzYQQ e2) {
                                e = e2;
                            }
                            i++;
                            x509Certificate3 = x509Certificate;
                        }
                    } catch (Exception e3) {
                        throw new zzYQQ("Distribution points could not be read.", e3);
                    }
                } else {
                    z = false;
                    e = null;
                }
                if (zzyq6.zzVUM == 11) {
                    try {
                    } catch (zzYQQ e4) {
                        e = e4;
                    }
                    if (zzyne.zzXAc()) {
                        z2 = z;
                    } else {
                        try {
                            zzZ(new zzZ7W(new zzZ7V(new zzZ7Q(new zzZ7R(4, zzZD5.zzXo(zzYQ7.zzWM(x509Certificate).getEncoded()))))), (zzYR4) zzyr4.clone(), x509Certificate, date, x509Certificate2, publicKey, zzyq6, zzyne, list, provider);
                        } catch (Exception e5) {
                            throw new zzYQQ("Issuer from certificate for CRL could not be reencoded.", e5);
                        }
                    }
                }
                if (!z2) {
                    if (e != null) {
                        throw e;
                    }
                    throw new zzYQQ("No valid CRL found.", e);
                }
                if (zzyq6.zzVUM == 11) {
                    if (!zzyne.zzXAc() && zzyq6.zzVUM == 11) {
                        zzyq6.zzVUM = 12;
                    }
                    if (zzyq6.zzVUM == 12) {
                        throw new zzYQQ("Certificate status could not be determined.");
                    }
                    return;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO("Certificate revocation after " + simpleDateFormat.format(zzyq6.zzVUL), ", reason: ");
                sbOooO0OO.append(zzVUN[zzyq6.zzVUM]);
                throw new zzYQQ(sbOooO0OO.toString());
            } catch (zzYQQ e6) {
                throw new zzYQQ("No additional CRL locations could be decoded from CRL distribution point extension.", e6);
            }
        } catch (Exception e7) {
            throw new zzYQQ("CRL distribution point extension could not be read.", e7);
        }
    }

    public static void zzZ(CertPath certPath, int i, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
    }

    public static int zzZ(int i, X509Certificate x509Certificate) {
        return (zzYQ7.zzW(x509Certificate) || i == 0) ? i : i - 1;
    }

    public static void zzZ(CertPath certPath, int i, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
    }

    public static zzYP8 zzZ(CertPath certPath, zzYR4 zzyr4, Set set, int i, List[] listArr, zzYP8 zzyp8, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (zzyp8 == null) {
            if (zzyr4.isExplicitPolicyRequired()) {
                throw new CertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
            }
            return null;
        }
        if (zzYQ7.zzW(set)) {
            if (!zzyr4.isExplicitPolicyRequired()) {
                return zzyp8;
            }
            if (!set2.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        zzYP8 zzyp82 = (zzYP8) list.get(i2);
                        if ("2.5.29.32.0".equals(zzyp82.getValidPolicy())) {
                            Iterator children = zzyp82.getChildren();
                            while (children.hasNext()) {
                                hashSet.add(children.next());
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    set2.contains(((zzYP8) it.next()).getValidPolicy());
                }
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    List list2 = listArr[i3];
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        zzYP8 zzyp83 = (zzYP8) list2.get(i4);
                        if (!zzyp83.hasChildren()) {
                            zzyp8 = zzYQ7.zzZ(zzyp8, listArr, zzyp83);
                        }
                    }
                }
                return zzyp8;
            }
            throw new CertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
        }
        HashSet<zzYP8> hashSet2 = new HashSet();
        for (List list3 : listArr) {
            for (int i5 = 0; i5 < list3.size(); i5++) {
                zzYP8 zzyp84 = (zzYP8) list3.get(i5);
                if ("2.5.29.32.0".equals(zzyp84.getValidPolicy())) {
                    Iterator children2 = zzyp84.getChildren();
                    while (children2.hasNext()) {
                        zzYP8 zzyp85 = (zzYP8) children2.next();
                        if (!"2.5.29.32.0".equals(zzyp85.getValidPolicy())) {
                            hashSet2.add(zzyp85);
                        }
                    }
                }
            }
        }
        for (zzYP8 zzyp86 : hashSet2) {
            if (!set.contains(zzyp86.getValidPolicy())) {
                zzyp8 = zzYQ7.zzZ(zzyp8, listArr, zzyp86);
            }
        }
        if (zzyp8 != null) {
            for (int i6 = size - 1; i6 >= 0; i6--) {
                List list4 = listArr[i6];
                for (int i7 = 0; i7 < list4.size(); i7++) {
                    zzYP8 zzyp87 = (zzYP8) list4.get(i7);
                    if (!zzyp87.hasChildren()) {
                        zzyp8 = zzYQ7.zzZ(zzyp8, listArr, zzyp87);
                    }
                }
            }
        }
        return zzyp8;
    }
}

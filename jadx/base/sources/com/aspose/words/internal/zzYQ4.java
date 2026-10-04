package com.aspose.words.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ4 extends CertificateFactorySpi {
    private final zzYQ8 zzVWk;
    private static final zzYPD zzVUJ = new zzYPD("CERTIFICATE");
    private static final zzYPD zzVUI = new zzYPD("CRL");
    private zzZD2 zzVUH = null;
    private int zzVUG = 0;
    private InputStream zzVUF = null;
    private zzZD0 zzVUE = null;
    private zzZD2 zzVUD = null;
    private int zzVUC = 0;
    private InputStream zzVUB = null;
    private zzZAI zzVUA = null;

    public zzYQ4(zzYQ8 zzyq8) {
        this.zzVWk = zzyq8;
    }

    private Certificate getCertificate() throws CertificateParsingException, IOException {
        if (this.zzVUH == null) {
            return null;
        }
        while (this.zzVUG < this.zzVUH.size()) {
            zzZD2 zzzd2 = this.zzVUH;
            int i = this.zzVUG;
            this.zzVUG = i + 1;
            zzZDK zzzdkZzg6 = zzzd2.zzg6(i);
            if (zzzdkZzg6 instanceof zzZD4) {
                if (this.zzVUG == this.zzVUH.size()) {
                    zzZD1 zzzd1ZzXJI = this.zzVUA.zzXJI();
                    if (zzzd1ZzXJI != null) {
                        zzzd1ZzXJI.zzXL0();
                    }
                    zzZD1 zzzd1ZzXJH = this.zzVUA.zzXJH();
                    if (zzzd1ZzXJH != null) {
                        zzzd1ZzXJH.zzXL0();
                    }
                }
                return new zzYN8(this.zzVWk, zzZ80.zzXh(zzzdkZzg6));
            }
        }
        return null;
    }

    private CRL zzN(InputStream inputStream) throws CRLException {
        CRL crlZzXBe;
        InputStream inputStream2 = this.zzVUB;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.zzVUB = inputStream;
            this.zzVUD = null;
            this.zzVUC = 0;
        }
        try {
            zzZD2 zzzd2 = this.zzVUD;
            if (zzzd2 == null) {
                crlZzXBe = null;
            } else if (this.zzVUC != zzzd2.size()) {
                crlZzXBe = zzXBe();
            } else {
                this.zzVUD = null;
                this.zzVUC = 0;
                crlZzXBe = null;
            }
            if (crlZzXBe != null) {
                return crlZzXBe;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(zzYG9.zzJ(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            if (i != 48) {
                return zzP(inputStream);
            }
            this.zzVUE = new zzZD0(inputStream);
            return zzXBf();
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString(), e2);
        }
    }

    private Certificate zzO(InputStream inputStream) throws CertificateException {
        Certificate certificate;
        InputStream inputStream2 = this.zzVUF;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.zzVUF = inputStream;
            this.zzVUH = null;
            this.zzVUG = 0;
        }
        try {
            zzZD2 zzzd2 = this.zzVUH;
            if (zzzd2 == null) {
                certificate = null;
            } else if (this.zzVUG != zzzd2.size()) {
                certificate = getCertificate();
            } else {
                this.zzVUH = null;
                this.zzVUG = 0;
                certificate = null;
            }
            if (certificate != null) {
                return certificate;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(zzYG9.zzJ(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            if (i != 48) {
                return zzQ(inputStream);
            }
            this.zzVUE = new zzZD0(inputStream);
            return zzXBg();
        } catch (CertificateException e) {
            throw e;
        } catch (Exception e2) {
            throw new CertificateException(e2.getMessage(), e2);
        }
    }

    private CRL zzP(InputStream inputStream) throws IOException, CRLException {
        zzZD4 zzzd4ZzL = zzVUI.zzL(inputStream);
        if (zzzd4ZzL != null) {
            return zzZ(zzZ7Z.zzXg(zzzd4ZzL));
        }
        return null;
    }

    private Certificate zzQ(InputStream inputStream) throws CertificateParsingException, IOException {
        zzZD4 zzzd4ZzL = zzVUJ.zzL(inputStream);
        if (zzzd4ZzL != null) {
            return new zzYN8(this.zzVWk, zzZ80.zzXh(zzzd4ZzL));
        }
        return null;
    }

    private CRL zzXBe() throws IOException, CRLException {
        zzZD1 zzzd1ZzXJH;
        if (this.zzVUD == null) {
            return null;
        }
        while (this.zzVUC < this.zzVUD.size()) {
            zzZD2 zzzd2 = this.zzVUD;
            int i = this.zzVUC;
            this.zzVUC = i + 1;
            zzZDK zzzdkZzg6 = zzzd2.zzg6(i);
            if (zzzdkZzg6 instanceof zzZD4) {
                if (this.zzVUC == this.zzVUD.size() && (zzzd1ZzXJH = this.zzVUA.zzXJH()) != null) {
                    zzzd1ZzXJH.zzXL0();
                }
                return zzZ(zzZ7Z.zzXg(zzzdkZzg6));
            }
        }
        return null;
    }

    private CRL zzXBf() throws IOException, CRLException {
        zzZD3 zzzd3 = (zzZD3) this.zzVUE.zzXKC();
        zzZDK zzzdkZzXKC = zzzd3.zzXKC();
        if ((zzzdkZzXKC instanceof zzZDA) && zzzdkZzXKC.equals(zzZ96.zzWFL)) {
            zzZAI zzzaiZzY7 = zzZAI.zzY7(((zzZCK) zzzd3.zzXKC()).zzYR(1, true));
            this.zzVUA = zzzaiZzY7;
            zzzaiZzY7.zzXJL().zzXL0();
            zzZDK zzzdkZzXJU = this.zzVUA.zzXJK().zzXJU();
            if (zzzdkZzXJU != null) {
                zzzdkZzXJU.zzXL0();
            }
            this.zzVUA.zzXJJ().zzXL0();
            zzZD1 zzzd1ZzXJI = this.zzVUA.zzXJI();
            if (zzzd1ZzXJI == null) {
                return null;
            }
            this.zzVUD = zzZ(zzzd1ZzXJI);
            return zzXBe();
        }
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(zzzdkZzXKC.zzXL0());
        while (true) {
            zzZDK zzzdkZzXKC2 = zzzd3.zzXKC();
            if (zzzdkZzXKC2 == null) {
                return zzZ(zzZ7Z.zzXg(new zzZC2(zzzdj)));
            }
            zzzdj.zzZ(zzzdkZzXKC2.zzXL0());
        }
    }

    private Certificate zzXBg() throws CertificateParsingException, IOException {
        zzZD3 zzzd3 = (zzZD3) this.zzVUE.zzXKC();
        zzZDK zzzdkZzXKC = zzzd3.zzXKC();
        if ((zzzdkZzXKC instanceof zzZDA) && zzzdkZzXKC.equals(zzZ96.zzWFL)) {
            zzZAI zzzaiZzY7 = zzZAI.zzY7(((zzZCK) zzzd3.zzXKC()).zzYR(1, true));
            this.zzVUA = zzzaiZzY7;
            zzzaiZzY7.zzXJL().zzXL0();
            zzZDK zzzdkZzXJU = this.zzVUA.zzXJK().zzXJU();
            if (zzzdkZzXJU != null) {
                zzzdkZzXJU.zzXL0();
            }
            zzZD1 zzzd1ZzXJJ = this.zzVUA.zzXJJ();
            if (zzzd1ZzXJJ == null) {
                return null;
            }
            this.zzVUH = zzZ(zzzd1ZzXJJ);
            return getCertificate();
        }
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(zzzdkZzXKC.zzXL0());
        while (true) {
            zzZDK zzzdkZzXKC2 = zzzd3.zzXKC();
            if (zzzdkZzXKC2 == null) {
                return new zzYN8(this.zzVWk, zzZ80.zzXh(new zzZC2(zzzdj)));
            }
            zzzdj.zzZ(zzzdkZzXKC2.zzXL0());
        }
    }

    private static zzZD2 zzZ(zzZD1 zzzd1) {
        zzZD2 zzzd2ZzYx = zzZD2.zzYx(zzzd1.zzXL0());
        zzZDJ zzzdj = new zzZDJ();
        Enumeration enumerationZzXKE = zzzd2ZzYx.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZDK zzzdk = (zzZDK) enumerationZzXKE.nextElement();
            if (zzzdk instanceof zzZD4) {
                zzzdj.zzZ(zzzdk);
            }
        }
        return new zzZC0(zzzdj);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        CRL crlZzN = zzN(inputStream);
        if (crlZzN != null) {
            return crlZzN;
        }
        throw new CRLException("unexpected data detected in stream");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlZzN = zzN(bufferedInputStream);
            if (crlZzN == null) {
                return arrayList;
            }
            arrayList.add(crlZzN);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        Certificate certificateZzO = zzO(inputStream);
        if (certificateZzO != null) {
            return certificateZzO;
        }
        throw new CertificateException("Unexpected data detected in stream");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            Certificate certificateZzO = zzO(bufferedInputStream);
            if (certificateZzO == null) {
                return arrayList;
            }
            arrayList.add(certificateZzO);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Iterator engineGetCertPathEncodings() {
        return zzYPB.zzVUg.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new zzYPB(this.zzVWk, inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("List contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new zzYPB(this.zzVWk, list);
    }

    private CRL zzZ(zzZ7Z zzz7z) throws CRLException {
        return new zzYN9(this.zzVWk, zzz7z);
    }
}

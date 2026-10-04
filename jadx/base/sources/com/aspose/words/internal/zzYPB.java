package com.aspose.words.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.security.Provider;
import java.security.cert.CertPath;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPB extends CertPath {
    static final List zzVUg;
    private List zzVUe;
    private final Provider zzVUf;

    public static class zzZ extends Writer {
        private final ByteArrayOutputStream zzWeP;

        public zzZ(ByteArrayOutputStream byteArrayOutputStream) {
            this.zzWeP = byteArrayOutputStream;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.zzWeP.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            this.zzWeP.flush();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            for (int i3 = i; i3 != i + i2; i3++) {
                this.zzWeP.write(cArr[i3]);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        zzVUg = Collections.unmodifiableList(arrayList);
    }

    public zzYPB(Provider provider, List list) {
        super("X.509");
        this.zzVUf = provider;
        this.zzVUe = zzS(new ArrayList(list));
    }

    private static List zzS(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i = 1; i != list.size(); i++) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i4 = 0; i4 != arrayList.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 < list.size()) {
                                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                        arrayList.add(x509Certificate2);
                                        list.remove(i5);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            }
        }
        return list;
    }

    private static zzZD5 zzV(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return zzZD5.zzXo(x509Certificate.getEncoded());
        } catch (Exception e) {
            throw new CertificateEncodingException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("Exception while encoding certificate: ")));
        }
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.zzVUe));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        return zzVUg.iterator();
    }

    public zzYPB(Provider provider, InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        this.zzVUf = provider;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                zzZD5 zzzd5ZzXKN = new zzZDE(inputStream).zzXKN();
                if (zzzd5ZzXKN instanceof zzZD4) {
                    Enumeration enumerationZzXKE = ((zzZD4) zzzd5ZzXKN).zzXKE();
                    this.zzVUe = new ArrayList();
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", provider);
                    while (enumerationZzXKE.hasMoreElements()) {
                        this.zzVUe.add(0, certificateFactory.generateCertificate(new ByteArrayInputStream(((zzZDK) enumerationZzXKE.nextElement()).zzXL0().getEncoded("DER"))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            } else {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(str));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.zzVUe = new ArrayList();
                CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509", provider);
                while (bufferedInputStream.available() > 0) {
                    this.zzVUe.add(certificateFactory2.generateCertificate(bufferedInputStream));
                }
            }
            this.zzVUe = zzS(this.zzVUe);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        }
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            zzZDJ zzzdj = new zzZDJ();
            List list = this.zzVUe;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                zzzdj.zzZ(zzV((X509Certificate) listIterator.previous()));
            }
            return zzS(new zzZC2(zzzdj));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            zzZ9H zzz9h = new zzZ9H(zzZ96.zzWFM, null);
            zzZDJ zzzdj2 = new zzZDJ();
            while (i != this.zzVUe.size()) {
                zzzdj2.zzZ(zzV((X509Certificate) this.zzVUe.get(i)));
                i++;
            }
            return zzS(new zzZ9H(zzZ96.zzWFL, new zzZ8X(new zzZDD(1L), new zzZC0(), zzz9h, new zzZC0(zzzdj2), new zzZC0())));
        }
        if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzYG3 zzyg3 = new zzYG3(new zzZ(byteArrayOutputStream));
            while (i != this.zzVUe.size()) {
                try {
                    zzyg3.zzZ(new zzYG5("CERTIFICATE", ((X509Certificate) this.zzVUe.get(i)).getEncoded()));
                    i++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            zzyg3.close();
            return byteArrayOutputStream.toByteArray();
        }
        throw new CertificateEncodingException("unsupported encoding: ".concat(str));
    }

    private static byte[] zzS(zzZDK zzzdk) throws CertificateEncodingException {
        try {
            return zzzdk.zzXL0().getEncoded("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }
}

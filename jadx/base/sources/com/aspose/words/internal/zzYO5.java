package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYO5 extends zzYQR {

    public static class zzX extends KeyStoreSpi {
        private final Hashtable<String, zzZ> zzVRB = new Hashtable<>();
        private final boolean zzVTz;
        private final zzYQ8 zzVWk;

        public zzX(boolean z, zzYQ8 zzyq8) {
            this.zzVTz = z;
            this.zzVWk = zzyq8;
        }

        private static void zzZ(OutputStream outputStream, char[] cArr) throws IOException {
            for (int i = 0; i < cArr.length; i++) {
                outputStream.write((byte) (cArr[i] >> '\b'));
                outputStream.write((byte) cArr[i]);
            }
            outputStream.write(zzYGI.zzwb("Mighty Aphrodite"));
        }

        private CertificateFactory zzwm(String str) throws CertificateException {
            zzYQ8 zzyq8 = this.zzVWk;
            return zzyq8 != null ? CertificateFactory.getInstance(str, zzyq8) : CertificateFactory.getInstance(str);
        }

        @Override // java.security.KeyStoreSpi
        public final Enumeration<String> engineAliases() {
            Enumeration<String> enumerationKeys;
            synchronized (this.zzVRB) {
                enumerationKeys = this.zzVRB.keys();
            }
            return enumerationKeys;
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineContainsAlias(String str) {
            boolean zContainsKey;
            if (str == null) {
                throw new NullPointerException("alias value is null");
            }
            synchronized (this.zzVRB) {
                zContainsKey = this.zzVRB.containsKey(str);
            }
            return zContainsKey;
        }

        @Override // java.security.KeyStoreSpi
        public final void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("BCFIPS JKS store is read-only and only supports certificate entries");
        }

        @Override // java.security.KeyStoreSpi
        public final Certificate engineGetCertificate(String str) {
            synchronized (this.zzVRB) {
                try {
                    zzZ zzz = this.zzVRB.get(str);
                    if (zzz == null) {
                        return null;
                    }
                    return zzz.zzVRC;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public final String engineGetCertificateAlias(Certificate certificate) {
            synchronized (this.zzVRB) {
                try {
                    for (Map.Entry<String, zzZ> entry : this.zzVRB.entrySet()) {
                        if (entry.getValue().zzVRC.equals(certificate)) {
                            return entry.getKey();
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public final Certificate[] engineGetCertificateChain(String str) {
            return null;
        }

        @Override // java.security.KeyStoreSpi
        public final Date engineGetCreationDate(String str) {
            synchronized (this.zzVRB) {
                try {
                    zzZ zzz = this.zzVRB.get(str);
                    if (zzz == null) {
                        return null;
                    }
                    return zzz.zzVWJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public final Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return null;
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineIsCertificateEntry(String str) {
            boolean zContainsKey;
            synchronized (this.zzVRB) {
                zContainsKey = this.zzVRB.containsKey(str);
            }
            return zContainsKey;
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineIsKeyEntry(String str) {
            return false;
        }

        @Override // java.security.KeyStoreSpi
        public final void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (loadStoreParameter == null) {
                throw new IllegalArgumentException("'param' arg cannot be null");
            }
            if (!(loadStoreParameter instanceof zzYRI)) {
                throw new IllegalArgumentException("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
            }
            engineLoad(((zzYRI) loadStoreParameter).getInputStream(), zzYNC.zzZ(loadStoreParameter));
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("BCFIPS JKS store is read-only and only supports certificate entries");
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("BCFIPS JKS store is read-only and only supports certificate entries");
        }

        @Override // java.security.KeyStoreSpi
        public final int engineSize() {
            return this.zzVRB.size();
        }

        @Override // java.security.KeyStoreSpi
        public final void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            throw new IOException("BCFIPS JKS store is read-only and only supports certificate entries");
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("BCFIPS JKS store is read-only and only supports certificate entries");
        }

        private static zzY zzZ(InputStream inputStream, char[] cArr) throws IOException {
            new zzZ0P.zzR();
            zzZ10 zzz10ZzX = zzZ0P.zzR.zzX(zzZ0P.zzWex);
            byte[] bArrZzJ = zzYG9.zzJ(inputStream);
            if (cArr != null) {
                zzZ41 zzz41ZzXGT = zzz10ZzX.zzXGT();
                zzZ(zzz41ZzXGT, cArr);
                zzz41ZzXGT.write(bArrZzJ, 0, bArrZzJ.length - zzz10ZzX.zzQI());
                byte[] bArrZzXI5 = zzz10ZzX.zzXI5();
                byte[] bArr = new byte[bArrZzXI5.length];
                System.arraycopy(bArrZzJ, bArrZzJ.length - bArrZzXI5.length, bArr, 0, bArrZzXI5.length);
                if (zzYGU.zzo(bArrZzXI5, bArr)) {
                    return new zzY(bArrZzJ, bArrZzJ.length - bArrZzXI5.length);
                }
                zzYGU.fill(bArrZzJ, (byte) 0);
                throw new IOException("password incorrect or store tampered with");
            }
            return new zzY(bArrZzJ, bArrZzJ.length - zzz10ZzX.zzQI());
        }

        @Override // java.security.KeyStoreSpi
        public final void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            Hashtable hashtable;
            if (inputStream == null) {
                return;
            }
            zzY zzyZzZ = zzZ(inputStream, cArr);
            synchronized (this.zzVRB) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(zzyZzZ);
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    if (i == -17957139) {
                        CertificateFactory certificateFactoryZzwm = null;
                        if (i2 == 1) {
                            hashtable = null;
                            certificateFactoryZzwm = zzwm("X.509");
                        } else if (i2 == 2) {
                            hashtable = new Hashtable();
                        } else {
                            throw new IllegalStateException("unable to discern store version");
                        }
                        int i3 = dataInputStream.readInt();
                        for (int i4 = 0; i4 < i3; i4++) {
                            int i5 = dataInputStream.readInt();
                            if (i5 == 1) {
                                throw new IOException("BCFIPS JKS store is read-only and only supports certificate entries");
                            }
                            if (i5 == 2) {
                                String utf = dataInputStream.readUTF();
                                Date date = new Date(dataInputStream.readLong());
                                if (i2 == 2) {
                                    String utf2 = dataInputStream.readUTF();
                                    if (hashtable.containsKey(utf2)) {
                                        certificateFactoryZzwm = (CertificateFactory) hashtable.get(utf2);
                                    } else {
                                        CertificateFactory certificateFactoryZzwm2 = zzwm(utf2);
                                        hashtable.put(utf2, certificateFactoryZzwm2);
                                        certificateFactoryZzwm = certificateFactoryZzwm2;
                                    }
                                }
                                int i6 = dataInputStream.readInt();
                                byte[] bArr = new byte[i6];
                                dataInputStream.readFully(bArr);
                                zzY zzy = new zzY(bArr, i6);
                                try {
                                    Certificate certificateGenerateCertificate = certificateFactoryZzwm.generateCertificate(zzy);
                                    if (zzy.available() == 0) {
                                        zzy.zzXBs();
                                        this.zzVRB.put(utf, new zzZ(date, certificateGenerateCertificate));
                                    } else {
                                        throw new IOException("password incorrect or store tampered with");
                                    }
                                } catch (Throwable th) {
                                    zzy.zzXBs();
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("unable to discern entry type");
                            }
                        }
                    }
                    if (zzyZzZ.available() == 0) {
                        zzyZzZ.zzXBs();
                    } else {
                        throw new IOException("password incorrect or store tampered with");
                    }
                } catch (Throwable th2) {
                    zzyZzZ.zzXBs();
                    throw th2;
                }
            }
        }
    }

    public static final class zzY extends ByteArrayInputStream {
        public zzY(byte[] bArr, int i) {
            super(bArr, 0, i);
        }

        public final void zzXBs() {
            zzYGU.fill(((ByteArrayInputStream) this).buf, (byte) 0);
        }
    }

    public static final class zzZ {
        final Certificate zzVRC;
        final Date zzVWJ;

        public zzZ(Date date, Certificate certificate) {
            this.zzVWJ = date;
            this.zzVRC = certificate;
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyStore.JKS", "org.bouncycastle.jcajce.provider.keystore.jks.JKS", new zzYPS() { // from class: com.aspose.words.internal.zzYO5.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(true, zzyq8);
            }
        });
        if (zzZ5L.zzXH0()) {
            return;
        }
        zzyq8.zzZ("KeyStore.JKS-DEF", "org.bouncycastle.jcajce.provider.keystore.jks.JKSDef", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO5.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(false, null);
            }
        }));
    }
}

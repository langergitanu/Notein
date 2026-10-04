package com.aspose.words.internal;

import com.aspose.words.internal.zzYO5;
import com.aspose.words.internal.zzYP2;
import java.io.ByteArrayInputStream;
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
import java.util.Date;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOC extends zzYQR {

    public static class zzZ extends KeyStoreSpi {
        private KeyStoreSpi zzVRQ;
        private final boolean zzVRR;
        private final zzYQ8 zzVS0;

        public zzZ(boolean z, zzYQ8 zzyq8) {
            this.zzVRR = z;
            this.zzVS0 = zzyq8;
        }

        @Override // java.security.KeyStoreSpi
        public final Enumeration engineAliases() {
            return this.zzVRQ.engineAliases();
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineContainsAlias(String str) {
            return this.zzVRQ.engineContainsAlias(str);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineDeleteEntry(String str) throws KeyStoreException {
            if (this.zzVRR) {
                throw new KeyStoreException("delete operation not supported in immutable mode");
            }
            this.zzVRQ.engineDeleteEntry(str);
        }

        @Override // java.security.KeyStoreSpi
        public final Certificate engineGetCertificate(String str) {
            return this.zzVRQ.engineGetCertificate(str);
        }

        @Override // java.security.KeyStoreSpi
        public final String engineGetCertificateAlias(Certificate certificate) {
            return this.zzVRQ.engineGetCertificateAlias(certificate);
        }

        @Override // java.security.KeyStoreSpi
        public final Certificate[] engineGetCertificateChain(String str) {
            return this.zzVRQ.engineGetCertificateChain(str);
        }

        @Override // java.security.KeyStoreSpi
        public final Date engineGetCreationDate(String str) {
            return this.zzVRQ.engineGetCreationDate(str);
        }

        @Override // java.security.KeyStoreSpi
        public final Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return this.zzVRQ.engineGetKey(str, cArr);
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineIsCertificateEntry(String str) {
            return this.zzVRQ.engineIsCertificateEntry(str);
        }

        @Override // java.security.KeyStoreSpi
        public final boolean engineIsKeyEntry(String str) {
            return this.zzVRQ.engineIsKeyEntry(str);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (this.zzVRQ != null && this.zzVRR) {
                throw new IOException("immutable keystore already loaded");
            }
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
            if (this.zzVRR) {
                throw new KeyStoreException("set operation not supported in immutable mode");
            }
            this.zzVRQ.engineSetCertificateEntry(str, certificate);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
            if (this.zzVRR) {
                throw new KeyStoreException("set operation not supported in immutable mode");
            }
            this.zzVRQ.engineSetEntry(str, entry, protectionParameter);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            if (this.zzVRR) {
                throw new KeyStoreException("set operation not supported in immutable mode");
            }
            this.zzVRQ.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // java.security.KeyStoreSpi
        public final int engineSize() {
            return this.zzVRQ.engineSize();
        }

        @Override // java.security.KeyStoreSpi
        public final void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            this.zzVRQ.engineStore(loadStoreParameter);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            this.zzVRQ.engineStore(outputStream, cArr);
        }

        @Override // java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            if (!this.zzVRR) {
                this.zzVRQ.engineSetKeyEntry(str, key, cArr, certificateArr);
                return;
            }
            throw new KeyStoreException("set operation not supported in immutable mode");
        }

        @Override // java.security.KeyStoreSpi
        public final void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (this.zzVRQ != null && this.zzVRR) {
                throw new IOException("immutable keystore already loaded");
            }
            if (inputStream == null) {
                zzYP2.zzY zzy = new zzYP2.zzY(false, this.zzVS0);
                this.zzVRQ = zzy;
                zzy.engineLoad(null, cArr);
                return;
            }
            byte[] bArrZzJ = zzYG9.zzJ(inputStream);
            if (this.zzVRR) {
                try {
                    zzYP2.zzZ zzz = new zzYP2.zzZ(this.zzVS0);
                    this.zzVRQ = zzz;
                    zzz.engineLoad(new ByteArrayInputStream(bArrZzJ), cArr);
                    return;
                } catch (Exception unused) {
                    zzYO5.zzX zzx = new zzYO5.zzX(false, this.zzVS0);
                    this.zzVRQ = zzx;
                    zzx.engineLoad(new ByteArrayInputStream(bArrZzJ), cArr);
                    return;
                }
            }
            try {
                zzYP2.zzY zzy2 = new zzYP2.zzY(false, this.zzVS0);
                this.zzVRQ = zzy2;
                zzy2.engineLoad(new ByteArrayInputStream(bArrZzJ), cArr);
            } catch (Exception unused2) {
                zzYO5.zzX zzx2 = new zzYO5.zzX(false, this.zzVS0);
                this.zzVRQ = zzx2;
                zzx2.engineLoad(new ByteArrayInputStream(bArrZzJ), cArr);
            }
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyStore.FIPS", "org.bouncycastle.jcajce.provider.keystore.FipsKS.FIPSKeyStore", new zzYPS() { // from class: com.aspose.words.internal.zzYOC.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(false, zzyq8);
            }
        });
        zzyq8.zzZ("KeyStore.IFIPS", "org.bouncycastle.jcajce.provider.keystore.FipsKS.IFIPSKeyStore", new zzYPS() { // from class: com.aspose.words.internal.zzYOC.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(true, zzyq8);
            }
        });
        if (zzZ5L.zzXH0()) {
            return;
        }
        zzyq8.zzZ("KeyStore.FIPS-DEF", "org.bouncycastle.jcajce.provider.keystore.FipsKS.FIPSDefKeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOC.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(false, null);
            }
        }));
        zzyq8.zzZ("KeyStore.IFIPS-DEF", "org.bouncycastle.jcajce.provider.keystore.FipsKS.IFIPDefSKeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOC.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(true, null);
            }
        }));
    }
}

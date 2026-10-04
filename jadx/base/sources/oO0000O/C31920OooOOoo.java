package oO0000O;

import OooOoOO.C20519OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import o0oooooO.C31888OooO0OO;
import oO00000.C31906OooO0Oo;
import oO00000.C31907OooO0o0;
import oO00000o.C31909OooO0o0;
import oO00000o.C31910OooO0oO;
import oO00000o.EnumC31908OooO0Oo;
import oO00000o.EnumC31911OooO0oo;
import oO00000o.OooO0OO;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO0000O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31920OooOOoo extends KeyStoreSpi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113834OooO00o;

    public C31920OooOOoo(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
        this.f113834OooO00o = oooO00o;
    }

    public final void OooO00o(final oO00000o.OooO0o oooO0o, final PrivateKey privateKey, final EnumC31908OooO0Oo enumC31908OooO0Oo, final EnumC31911OooO0oo enumC31911OooO0oo, final X509Certificate x509Certificate) throws Exception {
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f113834OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOO0O
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                final oO00000o.OooO0o oooO0o2 = oooO0o;
                final EnumC31911OooO0oo enumC31911OooO0oo2 = enumC31911OooO0oo;
                final X509Certificate x509Certificate2 = x509Certificate;
                final PrivateKey privateKey2 = privateKey;
                final EnumC31908OooO0Oo enumC31908OooO0Oo2 = enumC31908OooO0Oo;
                arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOOOo
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
                        List listAsList;
                        C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                        oO00000o.OooO0o oooO0o3 = oooO0o2;
                        PrivateKey privateKey3 = privateKey2;
                        if (privateKey3 != null) {
                            oO00000o.OooO0OO oooO0OOOooO00o = oO00000o.OooO0OO.OooO00o(privateKey3);
                            EnumC31908OooO0Oo enumC31908OooO0Oo3 = enumC31908OooO0Oo2;
                            EnumC31911OooO0oo enumC31911OooO0oo3 = enumC31911OooO0oo2;
                            c31909OooO0o0.OooOOO0(oooO0OOOooO00o, enumC31908OooO0Oo3, enumC31911OooO0oo3, false);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            OooO0OO.AbstractC20185OooO0OO abstractC20185OooO0OO = oooO0OOOooO00o.f113744OooOo;
                            int iOrdinal = abstractC20185OooO0OO.f113751OooO00o.ordinal();
                            int i = abstractC20185OooO0OO.f113752OooO0O0;
                            if (iOrdinal == 0) {
                                if (privateKey3 instanceof RSAPrivateCrtKey) {
                                    RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKey3;
                                    listAsList = Arrays.asList(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
                                } else {
                                    if (!"PKCS#8".equals(privateKey3.getFormat())) {
                                        throw new UnsupportedEncodingException("Unsupported private key encoding");
                                    }
                                    try {
                                        ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) oO00000.OooO0o.OooO00o((byte[]) oO00000.OooO0o.OooO00o(oO00000.OooO0o.OooO0OO(48, privateKey3.getEncoded())).get(4)).get(48));
                                        ArrayList<C31907OooO0o0> arrayList = new ArrayList();
                                        while (byteBufferWrap.hasRemaining()) {
                                            arrayList.add(C31907OooO0o0.OooO00o(byteBufferWrap));
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        for (C31907OooO0o0 c31907OooO0o0 : arrayList) {
                                            int i2 = c31907OooO0o0.f113736OooO0O0;
                                            int i3 = c31907OooO0o0.f113738OooO0Oo;
                                            arrayList2.add(new BigInteger(Arrays.copyOfRange(c31907OooO0o0.f113737OooO0OO, i3, i2 + i3)));
                                        }
                                        int iIntValue = ((BigInteger) arrayList2.remove(0)).intValue();
                                        listAsList = arrayList2;
                                        if (iIntValue != 0) {
                                            throw new UnsupportedEncodingException("Expected value 0");
                                        }
                                    } catch (C31888OooO0OO e) {
                                        throw new UnsupportedEncodingException(e.getMessage());
                                    }
                                }
                                if (((BigInteger) listAsList.get(1)).intValue() != 65537) {
                                    throw new UnsupportedEncodingException("Unsupported RSA public exponent");
                                }
                                int i4 = (i / 8) / 2;
                                linkedHashMap.put(1, C31909OooO0o0.OooO0OO(i4, (BigInteger) listAsList.get(3)));
                                linkedHashMap.put(2, C31909OooO0o0.OooO0OO(i4, (BigInteger) listAsList.get(4)));
                                linkedHashMap.put(3, C31909OooO0o0.OooO0OO(i4, (BigInteger) listAsList.get(5)));
                                linkedHashMap.put(4, C31909OooO0o0.OooO0OO(i4, (BigInteger) listAsList.get(6)));
                                linkedHashMap.put(5, C31909OooO0o0.OooO0OO(i4, (BigInteger) listAsList.get(7)));
                            } else if (iOrdinal == 1) {
                                linkedHashMap.put(6, C31909OooO0o0.OooO0OO(i / 8, ((ECPrivateKey) privateKey3).getS()));
                            }
                            if (enumC31908OooO0Oo3 != EnumC31908OooO0Oo.DEFAULT) {
                                linkedHashMap.put(170, new byte[]{(byte) enumC31908OooO0Oo3.f113756OooOo0o});
                            }
                            if (enumC31911OooO0oo3 != EnumC31911OooO0oo.DEFAULT) {
                                linkedHashMap.put(171, new byte[]{(byte) enumC31911OooO0oo3.f113780OooOo0o});
                            }
                            InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C31909OooO0o0.f113771Oooo00O;
                            C20519OooO0Oo.OooO0o0(4, interfaceC34352OooO0O0, "Importing key with pin_policy={}, touch_policy={}", enumC31908OooO0Oo3, enumC31911OooO0oo3);
                            c31909OooO0o0.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-2, oooO0OOOooO00o.f113745OooOo0o, oooO0o3.f113763OooOo0o, oO00000.OooO0o.OooO0O0(linkedHashMap)));
                            C20519OooO0Oo.OooO0o0(3, interfaceC34352OooO0O0, "Private key imported in slot {} of type {}", oooO0o3, oooO0OOOooO00o);
                        }
                        X509Certificate x509Certificate3 = x509Certificate2;
                        if (x509Certificate3 != null) {
                            byte[] bArr = {0};
                            C20519OooO0Oo.OooO0o0(4, C31909OooO0o0.f113771Oooo00O, "Storing {}certificate in slot {}", "", oooO0o3);
                            try {
                                byte[] encoded = x509Certificate3.getEncoded();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put(112, encoded);
                                linkedHashMap2.put(113, bArr);
                                linkedHashMap2.put(Integer.valueOf(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6), null);
                                c31909OooO0o0.Oooo0(oooO0o3.f113762OooOo, oO00000.OooO0o.OooO0O0(linkedHashMap2));
                            } catch (CertificateEncodingException e2) {
                                throw new IllegalArgumentException("Failed to get encoded version of certificate", e2);
                            }
                        }
                        return Boolean.TRUE;
                    }
                }));
            }
        });
        ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
    }

    @Override // java.security.KeyStoreSpi
    public final Enumeration<String> engineAliases() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineContainsAlias(String str) {
        try {
            oO00000o.OooO0o.OooO00o(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineDeleteEntry(String str) throws KeyStoreException {
        final oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f113834OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOO0
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                final oO00000o.OooO0o oooO0o = oooO0oOooO00o;
                arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOOO
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
                        C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C31909OooO0o0.f113771Oooo00O;
                        oO00000o.OooO0o oooO0o2 = oooO0o;
                        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Deleting certificate in slot {}", oooO0o2);
                        c31909OooO0o0.Oooo0(oooO0o2.f113762OooOo, null);
                        return Boolean.TRUE;
                    }
                }));
            }
        });
        try {
            ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        } catch (Exception e) {
            throw new KeyStoreException(e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate engineGetCertificate(String str) {
        final oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f113834OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOOO0
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                final oO00000o.OooO0o oooO0o = oooO0oOooO00o;
                arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOOo0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((C31909OooO0o0) c31906OooO0Oo.OooO0O0()).OooOOo0(oooO0o);
                    }
                }));
            }
        });
        try {
            return (Certificate) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            if (e.f80297OooOo0o == 27266) {
                return null;
            }
            throw new RuntimeException(e);
        } catch (C31888OooO0OO unused) {
            return null;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final String engineGetCertificateAlias(Certificate certificate) {
        for (oO00000o.OooO0o oooO0o : oO00000o.OooO0o.values()) {
            String string = Integer.toString(oooO0o.f113763OooOo0o, 16);
            if (certificate.equals(engineGetCertificate(string))) {
                return string;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate[] engineGetCertificateChain(String str) {
        return new Certificate[]{engineGetCertificate(str)};
    }

    @Override // java.security.KeyStoreSpi
    public final Date engineGetCreationDate(String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public final KeyStore.Entry engineGetEntry(String str, final KeyStore.ProtectionParameter protectionParameter) throws UnrecoverableEntryException {
        final oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        try {
            final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            this.f113834OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooO
                @Override // oO00000.OooO00o
                public final void invoke(Object obj) {
                    final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                    final oO00000o.OooO0o oooO0o = oooO0oOooO00o;
                    final KeyStore.ProtectionParameter protectionParameter2 = protectionParameter;
                    arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOOo
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws C31888OooO0OO, com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
                            OooOo oooOoOooO00o;
                            C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                            oO00000o.OooO0o oooO0o2 = oooO0o;
                            X509Certificate x509CertificateOooOOo0 = c31909OooO0o0.OooOOo0(oooO0o2);
                            KeyStore.ProtectionParameter protectionParameter3 = protectionParameter2;
                            char[] password = protectionParameter3 instanceof KeyStore.PasswordProtection ? ((KeyStore.PasswordProtection) protectionParameter3).getPassword() : null;
                            if (C31909OooO0o0.f113766OooOoo.OooO0O0(c31909OooO0o0.f113772OooOo)) {
                                C31910OooO0oO c31910OooO0oOOooOooo = c31909OooO0o0.OooOooo(oooO0o2);
                                oO00000o.OooO0OO oooO0OO = c31910OooO0oOOooOooo.f113775OooO00o;
                                LinkedHashMap linkedHashMapOooO00o = oO00000.OooO0o.OooO00o(c31910OooO0oOOooOooo.f113776OooO0O0);
                                try {
                                    oooOoOooO00o = OooOo.OooO00o(oooO0OO.f113744OooOo.f113751OooO00o == OooO0OO.OooO00o.f113747OooOo0o ? KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(1, (byte[]) linkedHashMapOooO00o.get(129)), new BigInteger(1, (byte[]) linkedHashMapOooO00o.get(130)))) : C31909OooO0o0.Oooo00o(oooO0OO, (byte[]) linkedHashMapOooO00o.get(134)), oooO0o2, password);
                                } catch (NoSuchAlgorithmException e) {
                                    e = e;
                                    throw new RuntimeException(e);
                                } catch (InvalidKeySpecException e2) {
                                    e = e2;
                                    throw new RuntimeException(e);
                                }
                            } else {
                                oooOoOooO00o = OooOo.OooO00o(x509CertificateOooOOo0.getPublicKey(), oooO0o2, password);
                            }
                            return new KeyStore.PrivateKeyEntry(oooOoOooO00o, new Certificate[]{x509CertificateOooOOo0});
                        }
                    }));
                }
            });
            return (KeyStore.Entry) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            if (e.f80297OooOo0o == 27266) {
                return null;
            }
            throw new RuntimeException(e);
        } catch (C31888OooO0OO unused) {
            throw new UnrecoverableEntryException("Make sure the matching certificate is stored");
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Key engineGetKey(String str, final char[] cArr) throws UnrecoverableKeyException {
        final oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        try {
            final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            this.f113834OooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOO0o
                @Override // oO00000.OooO00o
                public final void invoke(Object obj) {
                    final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                    final oO00000o.OooO0o oooO0o = oooO0oOooO00o;
                    final char[] cArr2 = cArr;
                    arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOOOO
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
                            PublicKey publicKeyOooo00o;
                            C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                            boolean zOooO0O0 = C31909OooO0o0.f113766OooOoo.OooO0O0(c31909OooO0o0.f113772OooOo);
                            oO00000o.OooO0o oooO0o2 = oooO0o;
                            char[] cArr3 = cArr2;
                            if (!zOooO0O0) {
                                return OooOo.OooO00o(c31909OooO0o0.OooOOo0(oooO0o2).getPublicKey(), oooO0o2, cArr3);
                            }
                            C31910OooO0oO c31910OooO0oOOooOooo = c31909OooO0o0.OooOooo(oooO0o2);
                            oO00000o.OooO0OO oooO0OO = c31910OooO0oOOooOooo.f113775OooO00o;
                            LinkedHashMap linkedHashMapOooO00o = oO00000.OooO0o.OooO00o(c31910OooO0oOOooOooo.f113776OooO0O0);
                            try {
                                if (oooO0OO.f113744OooOo.f113751OooO00o == OooO0OO.OooO00o.f113747OooOo0o) {
                                    publicKeyOooo00o = KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(1, (byte[]) linkedHashMapOooO00o.get(129)), new BigInteger(1, (byte[]) linkedHashMapOooO00o.get(130))));
                                } else {
                                    publicKeyOooo00o = C31909OooO0o0.Oooo00o(oooO0OO, (byte[]) linkedHashMapOooO00o.get(134));
                                }
                                return OooOo.OooO00o(publicKeyOooo00o, oooO0o2, cArr3);
                            } catch (NoSuchAlgorithmException e) {
                                e = e;
                                throw new RuntimeException(e);
                            } catch (InvalidKeySpecException e2) {
                                e = e2;
                                throw new RuntimeException(e);
                            }
                        }
                    }));
                }
            });
            return (Key) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            if (e.f80297OooOo0o == 27266) {
                return null;
            }
            throw new RuntimeException(e);
        } catch (C31888OooO0OO unused) {
            throw new UnrecoverableKeyException("No way to infer KeyType, make sure the matching certificate is stored");
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsCertificateEntry(String str) {
        return engineGetCertificate(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsKeyEntry(String str) {
        return engineContainsAlias(str);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(InputStream inputStream, char[] cArr) {
        throw new InvalidParameterException("KeyStore must be loaded with a null LoadStoreParameter");
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        if (!(certificate instanceof X509Certificate)) {
            throw new KeyStoreException("Certificate must be X509Certificate");
        }
        try {
            OooO00o(oooO0oOooO00o, null, EnumC31908OooO0Oo.DEFAULT, EnumC31911OooO0oo.DEFAULT, (X509Certificate) certificate);
        } catch (Exception e) {
            throw new KeyStoreException(e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
        Certificate certificate;
        PrivateKey privateKey;
        EnumC31908OooO0Oo enumC31908OooO0Oo;
        EnumC31911OooO0oo enumC31911OooO0oo;
        oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        if (entry instanceof KeyStore.TrustedCertificateEntry) {
            if (protectionParameter != null) {
                throw new KeyStoreException("Certificate cannot use protParam");
            }
            certificate = ((KeyStore.TrustedCertificateEntry) entry).getTrustedCertificate();
            privateKey = null;
        } else {
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                throw new KeyStoreException("Unsupported KeyStore entry.");
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            certificate = privateKeyEntry.getCertificate();
            privateKey = privateKeyEntry.getPrivateKey();
        }
        if (certificate != null && !(certificate instanceof X509Certificate)) {
            throw new KeyStoreException("Certificate must be X509Certificate");
        }
        EnumC31908OooO0Oo enumC31908OooO0Oo2 = EnumC31908OooO0Oo.DEFAULT;
        EnumC31911OooO0oo enumC31911OooO0oo2 = EnumC31911OooO0oo.DEFAULT;
        if (privateKey == null || protectionParameter == null) {
            enumC31908OooO0Oo = enumC31908OooO0Oo2;
            enumC31911OooO0oo = enumC31911OooO0oo2;
        } else {
            if (!(protectionParameter instanceof C31915OooO0oo)) {
                throw new KeyStoreException("protParam must be an instance of PivKeyStoreKeyParameters");
            }
            enumC31908OooO0Oo = null;
            enumC31911OooO0oo = null;
        }
        try {
            OooO00o(oooO0oOooO00o, privateKey, enumC31908OooO0Oo, enumC31911OooO0oo, (X509Certificate) certificate);
        } catch (Exception e) {
            throw new KeyStoreException(e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        oO00000o.OooO0o oooO0oOooO00o = oO00000o.OooO0o.OooO00o(str);
        if (cArr != null) {
            throw new KeyStoreException("Password can not be set");
        }
        if (certificateArr.length != 1) {
            throw new KeyStoreException("Certificate chain must be a single certificate, or empty");
        }
        Certificate certificate = certificateArr[0];
        if (!(certificate instanceof X509Certificate)) {
            throw new KeyStoreException("Certificate must be X509Certificate");
        }
        try {
            OooO00o(oooO0oOooO00o, (PrivateKey) key, EnumC31908OooO0Oo.DEFAULT, EnumC31911OooO0oo.DEFAULT, (X509Certificate) certificate);
        } catch (Exception e) {
            throw new KeyStoreException(e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final int engineSize() {
        return oO00000o.OooO0o.values().length;
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(OutputStream outputStream, char[] cArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter != null) {
            throw new InvalidParameterException("KeyStore must be loaded with null");
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException("Use setKeyEntry with a PrivateKey instance instead of byte[]");
    }
}

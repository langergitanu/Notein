package com.nimbusds.jose.jwk;

import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.URI;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class RSAKey extends JWK implements AsymmetricJWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d */
    private final Base64URL f57403d;

    /* JADX INFO: renamed from: dp */
    private final Base64URL f57404dp;

    /* JADX INFO: renamed from: dq */
    private final Base64URL f57405dq;

    /* JADX INFO: renamed from: e */
    private final Base64URL f57406e;

    /* JADX INFO: renamed from: n */
    private final Base64URL f57407n;
    private final List<OtherPrimesInfo> oth;

    /* JADX INFO: renamed from: p */
    private final Base64URL f57408p;
    private final PrivateKey privateKey;

    /* JADX INFO: renamed from: q */
    private final Base64URL f57409q;

    /* JADX INFO: renamed from: qi */
    private final Base64URL f57410qi;

    public static class Builder {
        private Algorithm alg;

        /* JADX INFO: renamed from: d */
        private Base64URL f57411d;

        /* JADX INFO: renamed from: dp */
        private Base64URL f57412dp;

        /* JADX INFO: renamed from: dq */
        private Base64URL f57413dq;

        /* JADX INFO: renamed from: e */
        private final Base64URL f57414e;
        private String kid;

        /* JADX INFO: renamed from: ks */
        private KeyStore f57415ks;

        /* JADX INFO: renamed from: n */
        private final Base64URL f57416n;
        private Set<KeyOperation> ops;
        private List<OtherPrimesInfo> oth;

        /* JADX INFO: renamed from: p */
        private Base64URL f57417p;
        private PrivateKey priv;

        /* JADX INFO: renamed from: q */
        private Base64URL f57418q;

        /* JADX INFO: renamed from: qi */
        private Base64URL f57419qi;
        private KeyUse use;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(Base64URL base64URL, Base64URL base64URL2) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The modulus value must not be null");
            }
            this.f57416n = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The public exponent value must not be null");
            }
            this.f57414e = base64URL2;
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public RSAKey build() {
            try {
                return new RSAKey(this.f57416n, this.f57414e, this.f57411d, this.f57417p, this.f57418q, this.f57412dp, this.f57413dq, this.f57419qi, this.oth, this.priv, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.f57415ks);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        public Builder firstCRTCoefficient(Base64URL base64URL) {
            this.f57419qi = base64URL;
            return this;
        }

        public Builder firstFactorCRTExponent(Base64URL base64URL) {
            this.f57412dp = base64URL;
            return this;
        }

        public Builder firstPrimeFactor(Base64URL base64URL) {
            this.f57417p = base64URL;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder keyIDFromThumbprint() throws JOSEException {
            return keyIDFromThumbprint(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        }

        public Builder keyOperations(Set<KeyOperation> set) {
            this.ops = set;
            return this;
        }

        public Builder keyStore(KeyStore keyStore) {
            this.f57415ks = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.use = keyUse;
            return this;
        }

        public Builder otherPrimes(List<OtherPrimesInfo> list) {
            this.oth = list;
            return this;
        }

        public Builder privateExponent(Base64URL base64URL) {
            this.f57411d = base64URL;
            return this;
        }

        public Builder privateKey(RSAPrivateKey rSAPrivateKey) {
            if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
                return privateKey((RSAPrivateCrtKey) rSAPrivateKey);
            }
            if (rSAPrivateKey instanceof RSAMultiPrimePrivateCrtKey) {
                return privateKey((RSAMultiPrimePrivateCrtKey) rSAPrivateKey);
            }
            this.f57411d = Base64URL.encode(rSAPrivateKey.getPrivateExponent());
            return this;
        }

        public Builder secondFactorCRTExponent(Base64URL base64URL) {
            this.f57413dq = base64URL;
            return this;
        }

        public Builder secondPrimeFactor(Base64URL base64URL) {
            this.f57418q = base64URL;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.x5c = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.x5u = uri;
            return this;
        }

        public Builder keyIDFromThumbprint(String str) throws JOSEException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("e", this.f57414e.toString());
            linkedHashMap.put("kty", KeyType.RSA.getValue());
            linkedHashMap.put(BackupFile.PREFIX_NOTE_DIR, this.f57416n.toString());
            this.kid = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder(RSAPublicKey rSAPublicKey) {
            this.f57416n = Base64URL.encode(rSAPublicKey.getModulus());
            this.f57414e = Base64URL.encode(rSAPublicKey.getPublicExponent());
        }

        public Builder privateKey(PrivateKey privateKey) {
            if (privateKey instanceof RSAPrivateKey) {
                return privateKey((RSAPrivateKey) privateKey);
            }
            if (AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA.equalsIgnoreCase(privateKey.getAlgorithm())) {
                this.priv = privateKey;
                return this;
            }
            throw new IllegalArgumentException("The private key algorithm must be RSA");
        }

        public Builder(RSAKey rSAKey) {
            this.f57416n = rSAKey.f57407n;
            this.f57414e = rSAKey.f57406e;
            this.f57411d = rSAKey.f57403d;
            this.f57417p = rSAKey.f57408p;
            this.f57418q = rSAKey.f57409q;
            this.f57412dp = rSAKey.f57404dp;
            this.f57413dq = rSAKey.f57405dq;
            this.f57419qi = rSAKey.f57410qi;
            this.oth = rSAKey.oth;
            this.priv = rSAKey.privateKey;
            this.use = rSAKey.getKeyUse();
            this.ops = rSAKey.getKeyOperations();
            this.alg = rSAKey.getAlgorithm();
            this.kid = rSAKey.getKeyID();
            this.x5u = rSAKey.getX509CertURL();
            this.x5t = rSAKey.getX509CertThumbprint();
            this.x5t256 = rSAKey.getX509CertSHA256Thumbprint();
            this.x5c = rSAKey.getX509CertChain();
            this.f57415ks = rSAKey.getKeyStore();
        }

        public Builder privateKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
            this.f57411d = Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent());
            this.f57417p = Base64URL.encode(rSAPrivateCrtKey.getPrimeP());
            this.f57418q = Base64URL.encode(rSAPrivateCrtKey.getPrimeQ());
            this.f57412dp = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP());
            this.f57413dq = Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ());
            this.f57419qi = Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient());
            return this;
        }

        public Builder privateKey(RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey) {
            this.f57411d = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent());
            this.f57417p = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP());
            this.f57418q = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ());
            this.f57412dp = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP());
            this.f57413dq = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ());
            this.f57419qi = Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient());
            this.oth = OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo());
            return this;
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, null, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
    }

    public static RSAKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        Certificate certificate = keyStore.getCertificate(str);
        if (!(certificate instanceof X509Certificate)) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!(x509Certificate.getPublicKey() instanceof RSAPublicKey)) {
            throw new JOSEException("Couldn't load RSA JWK: The key algorithm is not RSA");
        }
        RSAKey rSAKeyBuild = new Builder(parse(x509Certificate)).keyID(str).keyStore(keyStore).build();
        try {
            Key key = keyStore.getKey(str, cArr);
            return key instanceof RSAPrivateKey ? new Builder(rSAKeyBuild).privateKey((RSAPrivateKey) key).build() : ((key instanceof PrivateKey) && AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA.equalsIgnoreCase(key.getAlgorithm())) ? new Builder(rSAKeyBuild).privateKey((PrivateKey) key).build() : rSAKeyBuild;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new JOSEException("Couldn't retrieve private RSA key (bad pin?): " + e.getMessage(), e);
        }
    }

    public static RSAKey parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        return Objects.equals(this.f57407n, rSAKey.f57407n) && Objects.equals(this.f57406e, rSAKey.f57406e) && Objects.equals(this.f57403d, rSAKey.f57403d) && Objects.equals(this.f57408p, rSAKey.f57408p) && Objects.equals(this.f57409q, rSAKey.f57409q) && Objects.equals(this.f57404dp, rSAKey.f57404dp) && Objects.equals(this.f57405dq, rSAKey.f57405dq) && Objects.equals(this.f57410qi, rSAKey.f57410qi) && Objects.equals(this.oth, rSAKey.oth) && Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    public Base64URL getFirstCRTCoefficient() {
        return this.f57410qi;
    }

    public Base64URL getFirstFactorCRTExponent() {
        return this.f57404dp;
    }

    public Base64URL getFirstPrimeFactor() {
        return this.f57408p;
    }

    public Base64URL getModulus() {
        return this.f57407n;
    }

    public List<OtherPrimesInfo> getOtherPrimes() {
        return this.oth;
    }

    public Base64URL getPrivateExponent() {
        return this.f57403d;
    }

    public Base64URL getPublicExponent() {
        return this.f57406e;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("e", this.f57406e.toString());
        linkedHashMap.put("kty", getKeyType().getValue());
        linkedHashMap.put(BackupFile.PREFIX_NOTE_DIR, this.f57407n.toString());
        return linkedHashMap;
    }

    public Base64URL getSecondFactorCRTExponent() {
        return this.f57405dq;
    }

    public Base64URL getSecondPrimeFactor() {
        return this.f57409q;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f57407n, this.f57406e, this.f57403d, this.f57408p, this.f57409q, this.f57404dp, this.f57405dq, this.f57410qi, this.oth, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f57403d == null && this.f57408p == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.f57406e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.f57407n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return ByteUtils.safeBitLength(this.f57407n.decode());
        } catch (IntegerOverflowException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put(BackupFile.PREFIX_NOTE_DIR, this.f57407n.toString());
        jSONObject.put("e", this.f57406e.toString());
        Base64URL base64URL = this.f57403d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.f57408p;
        if (base64URL2 != null) {
            jSONObject.put(ContextChain.TAG_PRODUCT, base64URL2.toString());
        }
        Base64URL base64URL3 = this.f57409q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.toString());
        }
        Base64URL base64URL4 = this.f57404dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.f57405dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.f57410qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.toString());
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
            for (OtherPrimesInfo otherPrimesInfo : this.oth) {
                Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
                mapNewJSONObject.put("r", otherPrimesInfo.f57421r.toString());
                mapNewJSONObject.put("d", otherPrimesInfo.f57420d.toString());
                mapNewJSONObject.put("t", otherPrimesInfo.f57422t.toString());
                listNewJSONArray.add(mapNewJSONObject);
            }
            jSONObject.put("oth", listNewJSONArray);
        }
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public KeyPair toKeyPair() throws JOSEException {
        return new KeyPair(toRSAPublicKey(), toPrivateKey());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PrivateKey toPrivateKey() throws JOSEException {
        RSAPrivateKey rSAPrivateKey = toRSAPrivateKey();
        return rSAPrivateKey != null ? rSAPrivateKey : this.privateKey;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public PublicKey toPublicKey() throws JOSEException {
        return toRSAPublicKey();
    }

    public RSAPrivateKey toRSAPrivateKey() throws JOSEException {
        RSAPrivateKeySpec rSAPrivateCrtKeySpec;
        RSAPrivateKeySpec rSAPrivateKeySpec;
        if (this.f57403d == null) {
            return null;
        }
        BigInteger bigIntegerDecodeToBigInteger = this.f57407n.decodeToBigInteger();
        BigInteger bigIntegerDecodeToBigInteger2 = this.f57403d.decodeToBigInteger();
        if (this.f57408p == null) {
            rSAPrivateKeySpec = new RSAPrivateKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger2);
        } else {
            BigInteger bigIntegerDecodeToBigInteger3 = this.f57406e.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger4 = this.f57408p.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger5 = this.f57409q.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger6 = this.f57404dp.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger7 = this.f57405dq.decodeToBigInteger();
            BigInteger bigIntegerDecodeToBigInteger8 = this.f57410qi.decodeToBigInteger();
            List<OtherPrimesInfo> list = this.oth;
            if (list == null || list.isEmpty()) {
                rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8);
            } else {
                RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new RSAOtherPrimeInfo[this.oth.size()];
                for (int i = 0; i < this.oth.size(); i++) {
                    OtherPrimesInfo otherPrimesInfo = this.oth.get(i);
                    rSAOtherPrimeInfoArr[i] = new RSAOtherPrimeInfo(otherPrimesInfo.getPrimeFactor().decodeToBigInteger(), otherPrimesInfo.getFactorCRTExponent().decodeToBigInteger(), otherPrimesInfo.getFactorCRTCoefficient().decodeToBigInteger());
                }
                rSAPrivateCrtKeySpec = new RSAMultiPrimePrivateCrtKeySpec(bigIntegerDecodeToBigInteger, bigIntegerDecodeToBigInteger3, bigIntegerDecodeToBigInteger2, bigIntegerDecodeToBigInteger4, bigIntegerDecodeToBigInteger5, bigIntegerDecodeToBigInteger6, bigIntegerDecodeToBigInteger7, bigIntegerDecodeToBigInteger8, rSAOtherPrimeInfoArr);
            }
            rSAPrivateKeySpec = rSAPrivateCrtKeySpec;
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePrivate(rSAPrivateKeySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public RSAPublicKey toRSAPublicKey() throws JOSEException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new RSAPublicKeySpec(this.f57407n.decodeToBigInteger(), this.f57406e.decodeToBigInteger()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        this(base64URL, base64URL2, base64URL3, null, null, null, null, null, null, null, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The private exponent must not be null");
        }
    }

    public static RSAKey parse(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> jSONArray;
        if (!KeyType.RSA.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, BackupFile.PREFIX_NOTE_DIR);
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "e");
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL(map, ContextChain.TAG_PRODUCT);
        Base64URL base64URL5 = JSONObjectUtils.getBase64URL(map, "q");
        Base64URL base64URL6 = JSONObjectUtils.getBase64URL(map, "dp");
        Base64URL base64URL7 = JSONObjectUtils.getBase64URL(map, "dq");
        Base64URL base64URL8 = JSONObjectUtils.getBase64URL(map, "qi");
        if (!map.containsKey("oth") || (jSONArray = JSONObjectUtils.getJSONArray(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(jSONArray.size());
            for (Object obj : jSONArray) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new OtherPrimesInfo(JSONObjectUtils.getBase64URL(map2, "r"), JSONObjectUtils.getBase64URL(map2, "dq"), JSONObjectUtils.getBase64URL(map2, "t")));
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new RSAKey(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, null, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public RSAKey toPublicJWK() {
        return new RSAKey(getModulus(), getPublicExponent(), getKeyUse(), getKeyOperations(), getAlgorithm(), getKeyID(), getX509CertURL(), getX509CertThumbprint(), getX509CertSHA256Thumbprint(), getX509CertChain(), getKeyStore());
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL8, Base64URL base64URL9, List<Base64> list2, KeyStore keyStore) {
        this(base64URL, base64URL2, null, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, list, null, keyUse, set, algorithm, str, uri, base64URL8, base64URL9, list2, keyStore);
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The first prime factor must not be null");
        }
        if (base64URL4 == null) {
            throw new IllegalArgumentException("The second prime factor must not be null");
        }
        if (base64URL5 == null) {
            throw new IllegalArgumentException("The first factor CRT exponent must not be null");
        }
        if (base64URL6 == null) {
            throw new IllegalArgumentException("The second factor CRT exponent must not be null");
        }
        if (base64URL7 == null) {
            throw new IllegalArgumentException("The first CRT coefficient must not be null");
        }
    }

    public static class OtherPrimesInfo implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: d */
        private final Base64URL f57420d;

        /* JADX INFO: renamed from: r */
        private final Base64URL f57421r;

        /* JADX INFO: renamed from: t */
        private final Base64URL f57422t;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The prime factor must not be null");
            }
            this.f57421r = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.f57420d = base64URL2;
            if (base64URL3 == null) {
                throw new IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.f57422t = base64URL3;
        }

        public static List<OtherPrimesInfo> toList(RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr) {
            ArrayList arrayList = new ArrayList();
            if (rSAOtherPrimeInfoArr != null) {
                for (RSAOtherPrimeInfo rSAOtherPrimeInfo : rSAOtherPrimeInfoArr) {
                    arrayList.add(new OtherPrimesInfo(rSAOtherPrimeInfo));
                }
            }
            return arrayList;
        }

        public Base64URL getFactorCRTCoefficient() {
            return this.f57422t;
        }

        public Base64URL getFactorCRTExponent() {
            return this.f57420d;
        }

        public Base64URL getPrimeFactor() {
            return this.f57421r;
        }

        public OtherPrimesInfo(RSAOtherPrimeInfo rSAOtherPrimeInfo) {
            this.f57421r = Base64URL.encode(rSAOtherPrimeInfo.getPrime());
            this.f57420d = Base64URL.encode(rSAOtherPrimeInfo.getExponent());
            this.f57422t = Base64URL.encode(rSAOtherPrimeInfo.getCrtCoefficient());
        }
    }

    @Deprecated
    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2) {
        this(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, list, null, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, null);
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, KeyStore keyStore) {
        super(KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, keyStore);
        if (base64URL != null) {
            this.f57407n = base64URL;
            if (base64URL2 != null) {
                this.f57406e = base64URL2;
                if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
                    throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                }
                this.f57403d = base64URL3;
                if (base64URL4 != null && base64URL5 != null && base64URL6 != null && base64URL7 != null && base64URL8 != null) {
                    this.f57408p = base64URL4;
                    this.f57409q = base64URL5;
                    this.f57404dp = base64URL6;
                    this.f57405dq = base64URL7;
                    this.f57410qi = base64URL8;
                    if (list != null) {
                        this.oth = Collections.unmodifiableList(list);
                    } else {
                        this.oth = Collections.EMPTY_LIST;
                    }
                } else if (base64URL4 == null && base64URL5 == null && base64URL6 == null && base64URL7 == null && base64URL8 == null && list == null) {
                    this.f57408p = null;
                    this.f57409q = null;
                    this.f57404dp = null;
                    this.f57405dq = null;
                    this.f57410qi = null;
                    this.oth = Collections.EMPTY_LIST;
                } else {
                    if (base64URL4 != null || base64URL5 != null || base64URL6 != null || base64URL7 != null || base64URL8 != null) {
                        if (base64URL4 == null) {
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                        }
                        if (base64URL5 == null) {
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                        }
                        if (base64URL6 == null) {
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                        }
                        if (base64URL7 == null) {
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                        }
                        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                    }
                    this.f57408p = null;
                    this.f57409q = null;
                    this.f57404dp = null;
                    this.f57405dq = null;
                    this.f57410qi = null;
                    this.oth = Collections.EMPTY_LIST;
                }
                this.privateKey = privateKey;
                return;
            }
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        throw new IllegalArgumentException("The modulus value must not be null");
    }

    public static RSAKey parse(X509Certificate x509Certificate) throws JOSEException {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            try {
                return new Builder((RSAPublicKey) x509Certificate.getPublicKey()).keyUse(KeyUse.from(x509Certificate)).keyID(x509Certificate.getSerialNumber().toString(10)).x509CertChain(Collections.singletonList(Base64.encode(x509Certificate.getEncoded()))).x509CertSHA256Thumbprint(Base64URL.encode(MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(x509Certificate.getEncoded()))).build();
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException("Couldn't encode x5t parameter: " + e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new JOSEException("Couldn't encode x5c parameter: " + e2.getMessage(), e2);
            }
        }
        throw new JOSEException("The public key of the X.509 certificate is not RSA");
    }

    public RSAKey(RSAPublicKey rSAPublicKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateKey.getPrivateExponent()), keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAPrivateCrtKey rSAPrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAPrivateCrtKey.getPrimeP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAPrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAPrivateCrtKey.getCrtCoefficient()), null, null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, RSAMultiPrimePrivateCrtKey rSAMultiPrimePrivateCrtKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrivateExponent()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentP()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getPrimeExponentQ()), Base64URL.encode(rSAMultiPrimePrivateCrtKey.getCrtCoefficient()), OtherPrimesInfo.toList(rSAMultiPrimePrivateCrtKey.getOtherPrimeInfo()), null, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }

    public RSAKey(RSAPublicKey rSAPublicKey, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        this(Base64URL.encode(rSAPublicKey.getModulus()), Base64URL.encode(rSAPublicKey.getPublicExponent()), null, null, null, null, null, null, null, privateKey, keyUse, set, algorithm, str, uri, base64URL, base64URL2, list, keyStore);
    }
}

package com.nimbusds.jose.jwk;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public final class OctetSequenceKey extends JWK implements SecretJWK {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: k */
    private final Base64URL f57400k;

    public static class Builder {
        private Algorithm alg;

        /* JADX INFO: renamed from: k */
        private final Base64URL f57401k;
        private String kid;

        /* JADX INFO: renamed from: ks */
        private KeyStore f57402ks;
        private Set<KeyOperation> ops;
        private KeyUse use;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;

        public Builder(Base64URL base64URL) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The key value must not be null");
            }
            this.f57401k = base64URL;
        }

        public Builder algorithm(Algorithm algorithm) {
            this.alg = algorithm;
            return this;
        }

        public OctetSequenceKey build() {
            try {
                return new OctetSequenceKey(this.f57401k, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.f57402ks);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
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
            this.f57402ks = keyStore;
            return this;
        }

        public Builder keyUse(KeyUse keyUse) {
            this.use = keyUse;
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
            linkedHashMap.put("k", this.f57401k.toString());
            linkedHashMap.put("kty", KeyType.OCT.getValue());
            this.kid = ThumbprintUtils.compute(str, (LinkedHashMap<String, ?>) linkedHashMap).toString();
            return this;
        }

        public Builder(byte[] bArr) {
            this(Base64URL.encode(bArr));
            if (bArr.length == 0) {
                throw new IllegalArgumentException("The key must have a positive length");
            }
        }

        public Builder(SecretKey secretKey) {
            this(secretKey.getEncoded());
        }
    }

    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OCT, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (base64URL == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.f57400k = base64URL;
    }

    public static OctetSequenceKey load(KeyStore keyStore, String str, char[] cArr) throws JOSEException, KeyStoreException {
        try {
            Key key = keyStore.getKey(str, cArr);
            if (key instanceof SecretKey) {
                return new Builder((SecretKey) key).keyID(str).keyStore(keyStore).build();
            }
            return null;
        } catch (NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new JOSEException("Couldn't retrieve secret key (bad pin?): " + e.getMessage(), e);
        }
    }

    public static OctetSequenceKey parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.f57400k, ((OctetSequenceKey) obj).f57400k);
        }
        return false;
    }

    public Base64URL getKeyValue() {
        return this.f57400k;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public LinkedHashMap<String, ?> getRequiredParams() {
        LinkedHashMap<String, ?> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("k", this.f57400k.toString());
        linkedHashMap.put("kty", getKeyType().toString());
        return linkedHashMap;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f57400k);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int size() {
        try {
            return ByteUtils.safeBitLength(this.f57400k.decode());
        } catch (IntegerOverflowException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }

    public byte[] toByteArray() {
        return getKeyValue().decode();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("k", this.f57400k.toString());
        return jSONObject;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public OctetSequenceKey toPublicJWK() {
        return null;
    }

    @Override // com.nimbusds.jose.jwk.SecretJWK
    public SecretKey toSecretKey() {
        return toSecretKey("NONE");
    }

    public static OctetSequenceKey parse(Map<String, Object> map) throws ParseException {
        if (!KeyType.OCT.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be oct", 0);
        }
        try {
            return new OctetSequenceKey(JSONObjectUtils.getBase64URL(map, "k"), JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public SecretKey toSecretKey(String str) {
        return new SecretKeySpec(toByteArray(), str);
    }
}

package com.nimbusds.jose;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class JWEHeader extends CommonSEHeader {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;
    private final Base64URL apu;
    private final Base64URL apv;
    private final EncryptionMethod enc;
    private final JWK epk;

    /* JADX INFO: renamed from: iv */
    private final Base64URL f57381iv;
    private final int p2c;
    private final Base64URL p2s;
    private final Base64URL tag;
    private final CompressionAlgorithm zip;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(AbstractJwtRequest.ClaimNames.ALG);
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add(AbstractDevicePopManager.SignedHttpRequestJwtClaims.JWK);
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add(AbstractJwtRequest.ClaimNames.X5C);
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWEHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    private static EncryptionMethod parseEncryptionMethod(Map<String, Object> map) throws ParseException {
        return EncryptionMethod.parse(JSONObjectUtils.getString(map, "enc"));
    }

    public Base64URL getAgreementPartyUInfo() {
        return this.apu;
    }

    public Base64URL getAgreementPartyVInfo() {
        return this.apv;
    }

    public Base64URL getAuthTag() {
        return this.tag;
    }

    public CompressionAlgorithm getCompressionAlgorithm() {
        return this.zip;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.enc;
    }

    public JWK getEphemeralPublicKey() {
        return this.epk;
    }

    public Base64URL getIV() {
        return this.f57381iv;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public Set<String> getIncludedParams() {
        Set<String> includedParams = super.getIncludedParams();
        if (this.enc != null) {
            includedParams.add("enc");
        }
        if (this.epk != null) {
            includedParams.add("epk");
        }
        if (this.zip != null) {
            includedParams.add("zip");
        }
        if (this.apu != null) {
            includedParams.add("apu");
        }
        if (this.apv != null) {
            includedParams.add("apv");
        }
        if (this.p2s != null) {
            includedParams.add("p2s");
        }
        if (this.p2c > 0) {
            includedParams.add("p2c");
        }
        if (this.f57381iv != null) {
            includedParams.add("iv");
        }
        if (this.tag != null) {
            includedParams.add("tag");
        }
        return includedParams;
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ JWK getJWK() {
        return super.getJWK();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ URI getJWKURL() {
        return super.getJWKURL();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ String getKeyID() {
        return super.getKeyID();
    }

    public int getPBES2Count() {
        return this.p2c;
    }

    public Base64URL getPBES2Salt() {
        return this.p2s;
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ List getX509CertChain() {
        return super.getX509CertChain();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ Base64URL getX509CertSHA256Thumbprint() {
        return super.getX509CertSHA256Thumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    @Deprecated
    public /* bridge */ /* synthetic */ Base64URL getX509CertThumbprint() {
        return super.getX509CertThumbprint();
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public /* bridge */ /* synthetic */ URI getX509CertURL() {
        return super.getX509CertURL();
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.toString());
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.toString());
        }
        int i = this.p2c;
        if (i > 0) {
            jSONObject.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.f57381iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put("tag", base64URL5.toString());
        }
        return jSONObject;
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm.getName().equals(Algorithm.NONE.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (encryptionMethod == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i;
        this.f57381iv = base64URL6;
        this.tag = base64URL7;
    }

    public static JWEHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        Algorithm algorithm = Header.parseAlgorithm(map);
        if (!(algorithm instanceof JWEAlgorithm)) {
            throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
        }
        Builder builderType = new Builder((JWEAlgorithm) algorithm, parseEncryptionMethod(map)).parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if (!AbstractJwtRequest.ClaimNames.ALG.equals(str) && !"enc".equals(str)) {
                if ("typ".equals(str)) {
                    String string = JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        builderType = builderType.type(new JOSEObjectType(string));
                    }
                } else if ("cty".equals(str)) {
                    builderType = builderType.contentType(JSONObjectUtils.getString(map, str));
                } else if ("crit".equals(str)) {
                    List<String> stringList = JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        builderType = builderType.criticalParams(new HashSet(stringList));
                    }
                } else if ("jku".equals(str)) {
                    builderType = builderType.jwkURL(JSONObjectUtils.getURI(map, str));
                } else if (AbstractDevicePopManager.SignedHttpRequestJwtClaims.JWK.equals(str)) {
                    Map<String, Object> jSONObject = JSONObjectUtils.getJSONObject(map, str);
                    if (jSONObject != null) {
                        builderType = builderType.jwk(JWK.parse(jSONObject));
                    }
                } else if ("x5u".equals(str)) {
                    builderType = builderType.x509CertURL(JSONObjectUtils.getURI(map, str));
                } else if ("x5t".equals(str)) {
                    builderType = builderType.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    builderType = builderType.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if (AbstractJwtRequest.ClaimNames.X5C.equals(str)) {
                    builderType = builderType.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, str)));
                } else if ("kid".equals(str)) {
                    builderType = builderType.keyID(JSONObjectUtils.getString(map, str));
                } else if ("epk".equals(str)) {
                    builderType = builderType.ephemeralPublicKey(JWK.parse(JSONObjectUtils.getJSONObject(map, str)));
                } else if ("zip".equals(str)) {
                    String string2 = JSONObjectUtils.getString(map, str);
                    if (string2 != null) {
                        builderType = builderType.compressionAlgorithm(new CompressionAlgorithm(string2));
                    }
                } else {
                    builderType = "apu".equals(str) ? builderType.agreementPartyUInfo(Base64URL.from(JSONObjectUtils.getString(map, str))) : "apv".equals(str) ? builderType.agreementPartyVInfo(Base64URL.from(JSONObjectUtils.getString(map, str))) : "p2s".equals(str) ? builderType.pbes2Salt(Base64URL.from(JSONObjectUtils.getString(map, str))) : "p2c".equals(str) ? builderType.pbes2Count(JSONObjectUtils.getInt(map, str)) : "iv".equals(str) ? builderType.m80459iv(Base64URL.from(JSONObjectUtils.getString(map, str))) : "tag".equals(str) ? builderType.authTag(Base64URL.from(JSONObjectUtils.getString(map, str))) : builderType.customParam(str, map.get(str));
                }
            }
        }
        return builderType.build();
    }

    @Override // com.nimbusds.jose.Header
    public JWEAlgorithm getAlgorithm() {
        return (JWEAlgorithm) super.getAlgorithm();
    }

    public static class Builder {
        private final JWEAlgorithm alg;
        private Base64URL apu;
        private Base64URL apv;
        private Set<String> crit;
        private String cty;
        private Map<String, Object> customParams;
        private final EncryptionMethod enc;
        private JWK epk;

        /* JADX INFO: renamed from: iv */
        private Base64URL f57382iv;
        private URI jku;
        private JWK jwk;
        private String kid;
        private int p2c;
        private Base64URL p2s;
        private Base64URL parsedBase64URL;
        private Base64URL tag;
        private JOSEObjectType typ;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;
        private CompressionAlgorithm zip;

        public Builder(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (jWEAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.alg = jWEAlgorithm;
            if (encryptionMethod == null) {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.enc = encryptionMethod;
        }

        public Builder agreementPartyUInfo(Base64URL base64URL) {
            this.apu = base64URL;
            return this;
        }

        public Builder agreementPartyVInfo(Base64URL base64URL) {
            this.apv = base64URL;
            return this;
        }

        public Builder authTag(Base64URL base64URL) {
            this.tag = base64URL;
            return this;
        }

        public JWEHeader build() {
            return new JWEHeader(this.alg, this.enc, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.epk, this.zip, this.apu, this.apv, this.p2s, this.p2c, this.f57382iv, this.tag, this.customParams, this.parsedBase64URL);
        }

        public Builder compressionAlgorithm(CompressionAlgorithm compressionAlgorithm) {
            this.zip = compressionAlgorithm;
            return this;
        }

        public Builder contentType(String str) {
            this.cty = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.crit = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (JWEHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("The parameter name \"", str, "\" matches a registered name"));
            }
            if (this.customParams == null) {
                this.customParams = new HashMap();
            }
            this.customParams.put(str, obj);
            return this;
        }

        public Builder customParams(Map<String, Object> map) {
            this.customParams = map;
            return this;
        }

        public Builder ephemeralPublicKey(JWK jwk) {
            this.epk = jwk;
            return this;
        }

        /* JADX INFO: renamed from: iv */
        public Builder m80459iv(Base64URL base64URL) {
            this.f57382iv = base64URL;
            return this;
        }

        public Builder jwk(JWK jwk) {
            this.jwk = jwk;
            return this;
        }

        public Builder jwkURL(URI uri) {
            this.jku = uri;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public Builder pbes2Count(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.p2c = i;
            return this;
        }

        public Builder pbes2Salt(Base64URL base64URL) {
            this.p2s = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
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

        public Builder(JWEHeader jWEHeader) {
            this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
            this.typ = jWEHeader.getType();
            this.cty = jWEHeader.getContentType();
            this.crit = jWEHeader.getCriticalParams();
            this.customParams = jWEHeader.getCustomParams();
            this.jku = jWEHeader.getJWKURL();
            this.jwk = jWEHeader.getJWK();
            this.x5u = jWEHeader.getX509CertURL();
            this.x5t = jWEHeader.getX509CertThumbprint();
            this.x5t256 = jWEHeader.getX509CertSHA256Thumbprint();
            this.x5c = jWEHeader.getX509CertChain();
            this.kid = jWEHeader.getKeyID();
            this.epk = jWEHeader.getEphemeralPublicKey();
            this.zip = jWEHeader.getCompressionAlgorithm();
            this.apu = jWEHeader.getAgreementPartyUInfo();
            this.apv = jWEHeader.getAgreementPartyVInfo();
            this.p2s = jWEHeader.getPBES2Salt();
            this.p2c = jWEHeader.getPBES2Count();
            this.f57382iv = jWEHeader.getIV();
            this.tag = jWEHeader.getAuthTag();
            this.customParams = jWEHeader.getCustomParams();
        }
    }

    public JWEHeader(JWEHeader jWEHeader) {
        this(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod(), jWEHeader.getType(), jWEHeader.getContentType(), jWEHeader.getCriticalParams(), jWEHeader.getJWKURL(), jWEHeader.getJWK(), jWEHeader.getX509CertURL(), jWEHeader.getX509CertThumbprint(), jWEHeader.getX509CertSHA256Thumbprint(), jWEHeader.getX509CertChain(), jWEHeader.getKeyID(), jWEHeader.getEphemeralPublicKey(), jWEHeader.getCompressionAlgorithm(), jWEHeader.getAgreementPartyUInfo(), jWEHeader.getAgreementPartyVInfo(), jWEHeader.getPBES2Salt(), jWEHeader.getPBES2Count(), jWEHeader.getIV(), jWEHeader.getAuthTag(), jWEHeader.getCustomParams(), jWEHeader.getParsedBase64URL());
    }

    public static JWEHeader parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str), (Base64URL) null);
    }

    public static JWEHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(JSONObjectUtils.parse(str), base64URL);
    }

    public static JWEHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}

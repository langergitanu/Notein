package com.nimbusds.jose;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class PlainHeader extends Header {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;

    public static class Builder {
        private Set<String> crit;
        private String cty;
        private Map<String, Object> customParams;
        private Base64URL parsedBase64URL;
        private JOSEObjectType typ;

        public Builder() {
        }

        public PlainHeader build() {
            return new PlainHeader(this.typ, this.cty, this.crit, this.customParams, this.parsedBase64URL);
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
            if (PlainHeader.getRegisteredParameterNames().contains(str)) {
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

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
            return this;
        }

        public Builder(PlainHeader plainHeader) {
            this.typ = plainHeader.getType();
            this.cty = plainHeader.getContentType();
            this.crit = plainHeader.getCriticalParams();
            this.customParams = plainHeader.getCustomParams();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(AbstractJwtRequest.ClaimNames.ALG);
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public PlainHeader() {
        this(null, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static PlainHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    @Override // com.nimbusds.jose.Header
    public Algorithm getAlgorithm() {
        return Algorithm.NONE;
    }

    public PlainHeader(JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        super(Algorithm.NONE, jOSEObjectType, str, set, map, base64URL);
    }

    public static PlainHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        if (Header.parseAlgorithm(map) != Algorithm.NONE) {
            throw new ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
        }
        Builder builderType = new Builder().parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if (!AbstractJwtRequest.ClaimNames.ALG.equals(str)) {
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
                } else {
                    builderType = builderType.customParam(str, map.get(str));
                }
            }
        }
        return builderType.build();
    }

    public PlainHeader(PlainHeader plainHeader) {
        this(plainHeader.getType(), plainHeader.getContentType(), plainHeader.getCriticalParams(), plainHeader.getCustomParams(), plainHeader.getParsedBase64URL());
    }

    public static PlainHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static PlainHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(JSONObjectUtils.parse(str), base64URL);
    }

    public static PlainHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}

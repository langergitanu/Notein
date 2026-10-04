package com.nimbusds.jwt;

import OooO0o.C20424OooO0Oo;
import OooOoo.C20593OooO0Oo;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jwt.util.DateUtils;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class JWTClaimsSet implements Serializable {
    private static final String AUDIENCE_CLAIM = "aud";
    private static final String EXPIRATION_TIME_CLAIM = "exp";
    private static final String ISSUED_AT_CLAIM = "iat";
    private static final String ISSUER_CLAIM = "iss";
    private static final String JWT_ID_CLAIM = "jti";
    private static final String NOT_BEFORE_CLAIM = "nbf";
    private static final Set<String> REGISTERED_CLAIM_NAMES;
    private static final String SUBJECT_CLAIM = "sub";
    private static final long serialVersionUID = 1;
    private final Map<String, Object> claims;

    public static class Builder {
        private final Map<String, Object> claims;

        public Builder() {
            this.claims = new LinkedHashMap();
        }

        public Builder audience(List<String> list) {
            this.claims.put("aud", list);
            return this;
        }

        public JWTClaimsSet build() {
            return new JWTClaimsSet(this.claims);
        }

        public Builder claim(String str, Object obj) {
            this.claims.put(str, obj);
            return this;
        }

        public Builder expirationTime(Date date) {
            this.claims.put("exp", date);
            return this;
        }

        public Map<String, Object> getClaims() {
            return Collections.unmodifiableMap(this.claims);
        }

        public Builder issueTime(Date date) {
            this.claims.put("iat", date);
            return this;
        }

        public Builder issuer(String str) {
            this.claims.put("iss", str);
            return this;
        }

        public Builder jwtID(String str) {
            this.claims.put(JWTClaimsSet.JWT_ID_CLAIM, str);
            return this;
        }

        public Builder notBeforeTime(Date date) {
            this.claims.put("nbf", date);
            return this;
        }

        public Builder subject(String str) {
            this.claims.put("sub", str);
            return this;
        }

        public Builder audience(String str) {
            if (str == null) {
                this.claims.put("aud", null);
                return this;
            }
            this.claims.put("aud", Collections.singletonList(str));
            return this;
        }

        public Builder(JWTClaimsSet jWTClaimsSet) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.claims = linkedHashMap;
            linkedHashMap.putAll(jWTClaimsSet.claims);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add(JWT_ID_CLAIM);
        REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public static Set<String> getRegisteredNames() {
        return REGISTERED_CLAIM_NAMES;
    }

    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        Builder builder = new Builder();
        for (String str : map.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = map.get("aud");
                    if (!(obj instanceof String)) {
                        if (obj instanceof List) {
                            builder.audience(JSONObjectUtils.getStringList(map, "aud"));
                        } else if (obj == null) {
                            builder.audience((String) null);
                        }
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(JSONObjectUtils.getString(map, "aud"));
                        builder.audience(arrayList);
                        break;
                    }
                    break;
                case "exp":
                    builder.expirationTime(new Date(JSONObjectUtils.getLong(map, "exp") * 1000));
                    break;
                case "iat":
                    builder.issueTime(new Date(JSONObjectUtils.getLong(map, "iat") * 1000));
                    break;
                case "iss":
                    builder.issuer(JSONObjectUtils.getString(map, "iss"));
                    break;
                case "jti":
                    builder.jwtID(JSONObjectUtils.getString(map, JWT_ID_CLAIM));
                    break;
                case "nbf":
                    builder.notBeforeTime(new Date(JSONObjectUtils.getLong(map, "nbf") * 1000));
                    break;
                case "sub":
                    builder.subject(JSONObjectUtils.getString(map, "sub"));
                    break;
                default:
                    builder.claim(str, map.get(str));
                    break;
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.claims, ((JWTClaimsSet) obj).claims);
        }
        return false;
    }

    public List<String> getAudience() {
        Object claim = getClaim("aud");
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim("aud");
            return stringListClaim != null ? stringListClaim : Collections.EMPTY_LIST;
        } catch (ParseException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public Boolean getBooleanClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof Boolean)) {
            return (Boolean) claim;
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a Boolean"), 0);
    }

    public Object getClaim(String str) {
        return this.claims.get(str);
    }

    public Map<String, Object> getClaims() {
        return Collections.unmodifiableMap(this.claims);
    }

    public Date getDateClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Date) {
            return (Date) claim;
        }
        if (claim instanceof Number) {
            return DateUtils.fromSecondsSinceEpoch(((Number) claim).longValue());
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a Date"), 0);
    }

    public Double getDoubleClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Double.valueOf(((Number) claim).doubleValue());
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a Double"), 0);
    }

    public Date getExpirationTime() {
        try {
            return getDateClaim("exp");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Float getFloatClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Float.valueOf(((Number) claim).floatValue());
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a Float"), 0);
    }

    public Integer getIntegerClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Integer.valueOf(((Number) claim).intValue());
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not an Integer"), 0);
    }

    public Date getIssueTime() {
        try {
            return getDateClaim("iat");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getIssuer() {
        try {
            return getStringClaim("iss");
        } catch (ParseException unused) {
            return null;
        }
    }

    public Map<String, Object> getJSONObjectClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (!(claim instanceof Map)) {
            throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a JSON object or Map"), 0);
        }
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry entry : ((Map) claim).entrySet()) {
            if (entry.getKey() instanceof String) {
                mapNewJSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return mapNewJSONObject;
    }

    public String getJWTID() {
        try {
            return getStringClaim(JWT_ID_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public Long getLongClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Long.valueOf(((Number) claim).longValue());
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a Number"), 0);
    }

    public Date getNotBeforeTime() {
        try {
            return getDateClaim("nbf");
        } catch (ParseException unused) {
            return null;
        }
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            List list = (List) getClaim(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused) {
                    throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a list / JSON array of strings"), 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a list / JSON array"), 0);
        }
    }

    public String getStringClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        throw new ParseException(C20593OooO0Oo.OooO0O0("The \"", str, "\" claim is not a String"), 0);
    }

    public List<String> getStringListClaim(String str) throws ParseException {
        String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(stringArrayClaim));
    }

    public String getSubject() {
        try {
            return getStringClaim("sub");
        } catch (ParseException unused) {
            return null;
        }
    }

    public URI getURIClaim(String str) throws ParseException {
        String stringClaim = getStringClaim(str);
        if (stringClaim == null) {
            return null;
        }
        try {
            return new URI(stringClaim);
        } catch (URISyntaxException e) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("The \"", str, "\" claim is not a URI: ");
            sbOooO0o0.append(e.getMessage());
            throw new ParseException(sbOooO0o0.toString(), 0);
        }
    }

    public int hashCode() {
        return Objects.hash(this.claims);
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(false);
    }

    public Payload toPayload() {
        return new Payload(toJSONObject());
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public <T> T toType(JWTClaimsSetTransformer<T> jWTClaimsSetTransformer) {
        return jWTClaimsSetTransformer.transform(this);
    }

    private JWTClaimsSet(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.claims = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public Map<String, Object> toJSONObject(boolean z) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry<String, Object> entry : this.claims.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapNewJSONObject.put(entry.getKey(), Long.valueOf(DateUtils.toSecondsSinceEpoch((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z) {
                        mapNewJSONObject.put("aud", null);
                    }
                } else if (audience.size() == 1) {
                    mapNewJSONObject.put("aud", audience.get(0));
                } else {
                    List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
                    listNewJSONArray.addAll(audience);
                    mapNewJSONObject.put("aud", listNewJSONArray);
                }
            } else if (entry.getValue() != null) {
                mapNewJSONObject.put(entry.getKey(), entry.getValue());
            } else if (z) {
                mapNewJSONObject.put(entry.getKey(), null);
            }
        }
        return mapNewJSONObject;
    }

    public String toString(boolean z) {
        return JSONObjectUtils.toJSONString(toJSONObject(z));
    }

    public static JWTClaimsSet parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }
}

package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Verify;
import com.huawei.hms.network.inner.api.NetworkService;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO000Oo.o0000O;
import oO0OOo0o.AbstractC33080OooOooo;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f114585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, OooO00o> f114586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, OooO00o> f114587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O.C32037OooOoOO f114588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, ?> f114589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f114590OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO0OO.OooO0O0<OooO00o> f114591OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Long f114592OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Boolean f114593OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Integer f114594OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Integer f114595OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C31994OoooOO0 f114596OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0000OO f114597OooO0o0;

        static {
            Preconditions.checkNotNull("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", "debugString");
            f114591OooO0oO = new OooO0OO.OooO0O0<>("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
        }

        public OooO00o(Map map, int i, int i2, boolean z) {
            long j;
            boolean z2;
            o0000OO o0000oo2;
            C31994OoooOO0 c31994OoooOO0;
            this.f114592OooO00o = o0OoOo0.OooO("timeout", map);
            this.f114593OooO0O0 = o0OoOo0.OooO0O0("waitForReady", map);
            Integer numOooO0o = o0OoOo0.OooO0o("maxResponseMessageBytes", map);
            this.f114594OooO0OO = numOooO0o;
            if (numOooO0o != null) {
                Preconditions.checkArgument(numOooO0o.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numOooO0o);
            }
            Integer numOooO0o2 = o0OoOo0.OooO0o("maxRequestMessageBytes", map);
            this.f114595OooO0Oo = numOooO0o2;
            if (numOooO0o2 != null) {
                Preconditions.checkArgument(numOooO0o2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numOooO0o2);
            }
            Map mapOooO0oO = z ? o0OoOo0.OooO0oO("retryPolicy", map) : null;
            if (mapOooO0oO == null) {
                j = 0;
                o0000oo2 = null;
                z2 = true;
            } else {
                int iIntValue = ((Integer) Preconditions.checkNotNull(o0OoOo0.OooO0o("maxAttempts", mapOooO0oO), "maxAttempts cannot be empty")).intValue();
                Preconditions.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
                int iMin = Math.min(iIntValue, i);
                long jLongValue = ((Long) Preconditions.checkNotNull(o0OoOo0.OooO("initialBackoff", mapOooO0oO), "initialBackoff cannot be empty")).longValue();
                Preconditions.checkArgument(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
                long jLongValue2 = ((Long) Preconditions.checkNotNull(o0OoOo0.OooO("maxBackoff", mapOooO0oO), "maxBackoff cannot be empty")).longValue();
                j = 0;
                z2 = true;
                Preconditions.checkArgument(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
                Double d = (Double) Preconditions.checkNotNull(o0OoOo0.OooO0o0("backoffMultiplier", mapOooO0oO), "backoffMultiplier cannot be empty");
                double dDoubleValue = d.doubleValue();
                Preconditions.checkArgument(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d);
                Long lOooO = o0OoOo0.OooO("perAttemptRecvTimeout", mapOooO0oO);
                Preconditions.checkArgument(lOooO == null || lOooO.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lOooO);
                Set setOooO00o = C32041o0000OoO.OooO00o("retryableStatusCodes", mapOooO0oO);
                Verify.verify(setOooO00o != null, "%s is required in retry policy", "retryableStatusCodes");
                Verify.verify(!setOooO00o.contains(o00Oo0.OooO00o.OK), "%s must not contain OK", "retryableStatusCodes");
                Preconditions.checkArgument((lOooO == null && setOooO00o.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
                o0000oo2 = new o0000OO(iMin, jLongValue, jLongValue2, dDoubleValue, lOooO, setOooO00o);
            }
            this.f114597OooO0o0 = o0000oo2;
            Map mapOooO0oO2 = z ? o0OoOo0.OooO0oO("hedgingPolicy", map) : null;
            if (mapOooO0oO2 == null) {
                c31994OoooOO0 = null;
            } else {
                int iIntValue2 = ((Integer) Preconditions.checkNotNull(o0OoOo0.OooO0o("maxAttempts", mapOooO0oO2), "maxAttempts cannot be empty")).intValue();
                Preconditions.checkArgument(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
                int iMin2 = Math.min(iIntValue2, i2);
                long jLongValue3 = ((Long) Preconditions.checkNotNull(o0OoOo0.OooO("hedgingDelay", mapOooO0oO2), "hedgingDelay cannot be empty")).longValue();
                Preconditions.checkArgument(jLongValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", jLongValue3);
                Set setOooO00o2 = C32041o0000OoO.OooO00o("nonFatalStatusCodes", mapOooO0oO2);
                if (setOooO00o2 == null) {
                    setOooO00o2 = Collections.unmodifiableSet(EnumSet.noneOf(o00Oo0.OooO00o.class));
                } else {
                    Verify.verify(!setOooO00o2.contains(o00Oo0.OooO00o.OK), "%s must not contain OK", "nonFatalStatusCodes");
                }
                c31994OoooOO0 = new C31994OoooOO0(iMin2, jLongValue3, setOooO00o2);
            }
            this.f114596OooO0o = c31994OoooOO0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Objects.equal(this.f114592OooO00o, oooO00o.f114592OooO00o) && Objects.equal(this.f114593OooO0O0, oooO00o.f114593OooO0O0) && Objects.equal(this.f114594OooO0OO, oooO00o.f114594OooO0OO) && Objects.equal(this.f114595OooO0Oo, oooO00o.f114595OooO0Oo) && Objects.equal(this.f114597OooO0o0, oooO00o.f114597OooO0o0) && Objects.equal(this.f114596OooO0o, oooO00o.f114596OooO0o);
        }

        public final int hashCode() {
            return Objects.hashCode(this.f114592OooO00o, this.f114593OooO0O0, this.f114594OooO0OO, this.f114595OooO0Oo, this.f114597OooO0o0, this.f114596OooO0o);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("timeoutNanos", this.f114592OooO00o).add("waitForReady", this.f114593OooO0O0).add("maxInboundMessageSize", this.f114594OooO0OO).add("maxOutboundMessageSize", this.f114595OooO0Oo).add("retryPolicy", this.f114597OooO0o0).add("hedgingPolicy", this.f114596OooO0o).toString();
        }
    }

    public static final class OooO0O0 extends AbstractC33080OooOooo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OOo f114598OooO0O0;

        public OooO0O0(o000OOo o000ooo2) {
            this.f114598OooO0O0 = o000ooo2;
        }

        @Override // oO0OOo0o.AbstractC33080OooOooo
        public final AbstractC33080OooOooo.OooO00o OooO00o() {
            Object objCheckNotNull = Preconditions.checkNotNull(this.f114598OooO0O0, NetworkService.Constants.CONFIG_SERVICE);
            Preconditions.checkState(objCheckNotNull != null, "config is not set");
            return new AbstractC33080OooOooo.OooO00o(oO0OOo0o.o00Oo0.f119717OooO0o0, objCheckNotNull);
        }
    }

    public o000OOo(OooO00o oooO00o, HashMap map, HashMap map2, o0000O.C32037OooOoOO c32037OooOoOO, Object obj, Map map3) {
        this.f114585OooO00o = oooO00o;
        this.f114586OooO0O0 = Collections.unmodifiableMap(new HashMap(map));
        this.f114587OooO0OO = Collections.unmodifiableMap(new HashMap(map2));
        this.f114588OooO0Oo = c32037OooOoOO;
        this.f114590OooO0o0 = obj;
        this.f114589OooO0o = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static o000OOo OooO00o(Map<String, ?> map, boolean z, int i, int i2, Object obj) {
        o0000O.C32037OooOoOO c32037OooOoOO;
        Map mapOooO0oO;
        o0000O.C32037OooOoOO c32037OooOoOO2;
        if (z) {
            if (map == null || (mapOooO0oO = o0OoOo0.OooO0oO("retryThrottling", map)) == null) {
                c32037OooOoOO2 = null;
            } else {
                float fFloatValue = o0OoOo0.OooO0o0("maxTokens", mapOooO0oO).floatValue();
                float fFloatValue2 = o0OoOo0.OooO0o0("tokenRatio", mapOooO0oO).floatValue();
                Preconditions.checkState(fFloatValue > 0.0f, "maxToken should be greater than zero");
                Preconditions.checkState(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                c32037OooOoOO2 = new o0000O.C32037OooOoOO(fFloatValue, fFloatValue2);
            }
            c32037OooOoOO = c32037OooOoOO2;
        } else {
            c32037OooOoOO = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapOooO0oO2 = map == null ? null : o0OoOo0.OooO0oO("healthCheckConfig", map);
        List<Map> listOooO0OO = o0OoOo0.OooO0OO("methodConfig", map);
        if (listOooO0OO == null) {
            listOooO0OO = null;
        } else {
            o0OoOo0.OooO00o(listOooO0OO);
        }
        if (listOooO0OO == null) {
            return new o000OOo(null, map2, map3, c32037OooOoOO, obj, mapOooO0oO2);
        }
        OooO00o oooO00o = null;
        for (Map map4 : listOooO0OO) {
            OooO00o oooO00o2 = new OooO00o(map4, i, i2, z);
            List<Map> listOooO0OO2 = o0OoOo0.OooO0OO("name", map4);
            if (listOooO0OO2 == null) {
                listOooO0OO2 = null;
            } else {
                o0OoOo0.OooO00o(listOooO0OO2);
            }
            if (listOooO0OO2 != null && !listOooO0OO2.isEmpty()) {
                for (Map map5 : listOooO0OO2) {
                    String strOooO0oo = o0OoOo0.OooO0oo(map5, "service");
                    String strOooO0oo2 = o0OoOo0.OooO0oo(map5, "method");
                    if (Strings.isNullOrEmpty(strOooO0oo)) {
                        Preconditions.checkArgument(Strings.isNullOrEmpty(strOooO0oo2), "missing service name for method %s", strOooO0oo2);
                        Preconditions.checkArgument(oooO00o == null, "Duplicate default method config in service config %s", map);
                        oooO00o = oooO00o2;
                    } else if (Strings.isNullOrEmpty(strOooO0oo2)) {
                        Preconditions.checkArgument(!map3.containsKey(strOooO0oo), "Duplicate service %s", strOooO0oo);
                        map3.put(strOooO0oo, oooO00o2);
                    } else {
                        String strOooO00o = C33101OoooOO0.OooO00o(strOooO0oo, strOooO0oo2);
                        Preconditions.checkArgument(!map2.containsKey(strOooO00o), "Duplicate method name %s", strOooO00o);
                        map2.put(strOooO00o, oooO00o2);
                    }
                }
            }
        }
        return new o000OOo(oooO00o, map2, map3, c32037OooOoOO, obj, mapOooO0oO2);
    }

    public final OooO0O0 OooO0O0() {
        if (this.f114587OooO0OO.isEmpty() && this.f114586OooO0O0.isEmpty() && this.f114585OooO00o == null) {
            return null;
        }
        return new OooO0O0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o000OOo.class == obj.getClass()) {
            o000OOo o000ooo2 = (o000OOo) obj;
            if (Objects.equal(this.f114585OooO00o, o000ooo2.f114585OooO00o) && Objects.equal(this.f114586OooO0O0, o000ooo2.f114586OooO0O0) && Objects.equal(this.f114587OooO0OO, o000ooo2.f114587OooO0OO) && Objects.equal(this.f114588OooO0Oo, o000ooo2.f114588OooO0Oo) && Objects.equal(this.f114590OooO0o0, o000ooo2.f114590OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f114585OooO00o, this.f114586OooO0O0, this.f114587OooO0OO, this.f114588OooO0Oo, this.f114590OooO0o0);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("defaultMethodConfig", this.f114585OooO00o).add("serviceMethodMap", this.f114586OooO0O0).add("serviceMap", this.f114587OooO0OO).add("retryThrottling", this.f114588OooO0Oo).add("loadBalancingConfig", this.f114590OooO0o0).toString();
    }
}

package oO000Oo;

import OooOo.C20485OooOoO;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.huawei.hms.network.inner.api.NetworkService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.C33092Oooo0oO;
import oO0OOo0o.o000oOoO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000Oo.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32041o0000OoO {

    /* JADX INFO: renamed from: oO000Oo.o0000OoO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f114548OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, ?> f114549OooO0O0;

        public OooO00o(String str, Map<String, ?> map) {
            this.f114548OooO00o = (String) Preconditions.checkNotNull(str, "policyName");
            this.f114549OooO0O0 = (Map) Preconditions.checkNotNull(map, "rawConfigValue");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f114548OooO00o.equals(oooO00o.f114548OooO00o) && this.f114549OooO0O0.equals(oooO00o.f114549OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f114548OooO00o, this.f114549OooO0O0);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("policyName", this.f114548OooO00o).add("rawConfigValue", this.f114549OooO0O0).toString();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000OoO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33086Oooo0o f114550OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f114551OooO0O0;

        public OooO0O0(AbstractC33086Oooo0o abstractC33086Oooo0o, Object obj) {
            this.f114550OooO00o = (AbstractC33086Oooo0o) Preconditions.checkNotNull(abstractC33086Oooo0o, "provider");
            this.f114551OooO0O0 = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && OooO0O0.class == obj.getClass()) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Objects.equal(this.f114550OooO00o, oooO0O0.f114550OooO00o) && Objects.equal(this.f114551OooO0O0, oooO0O0.f114551OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f114550OooO00o, this.f114551OooO0O0);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("provider", this.f114550OooO00o).add(NetworkService.Constants.CONFIG_SERVICE, this.f114551OooO0O0).toString();
        }
    }

    public static Set OooO00o(String str, Map map) {
        o00Oo0.OooO00o oooO00oValueOf;
        List listOooO0OO = o0OoOo0.OooO0OO(str, map);
        if (listOooO0OO == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(o00Oo0.OooO00o.class);
        for (Object obj : listOooO0OO) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                Verify.verify(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                oooO00oValueOf = oO0OOo0o.o00Oo0.OooO0Oo(iIntValue).f119728OooO00o;
                Verify.verify(oooO00oValueOf.f119750OooOo0o == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    oooO00oValueOf = o00Oo0.OooO00o.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(C20485OooOoO.OooO0O0("Status code ", obj, " is not valid"), e);
                }
            }
            enumSetNoneOf.add(oooO00oValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List<Map<String, ?>> OooO0O0(Map<String, ?> map) {
        String strOooO0oo;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listOooO0OO = o0OoOo0.OooO0OO("loadBalancingConfig", map);
            if (listOooO0OO == null) {
                listOooO0OO = null;
            } else {
                o0OoOo0.OooO00o(listOooO0OO);
            }
            arrayList.addAll(listOooO0OO);
        }
        if (arrayList.isEmpty() && (strOooO0oo = o0OoOo0.OooO0oo(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strOooO0oo.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static o000oOoO.OooO0O0 OooO0OO(List<OooO00o> list, C33092Oooo0oO c33092Oooo0oO) {
        ArrayList arrayList = new ArrayList();
        for (OooO00o oooO00o : list) {
            String str = oooO00o.f114548OooO00o;
            AbstractC33086Oooo0o abstractC33086Oooo0oOooO0O0 = c33092Oooo0oO.OooO0O0(str);
            if (abstractC33086Oooo0oOooO0O0 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(C32041o0000OoO.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                o000oOoO.OooO0O0 oooO0O0OooO0OO = abstractC33086Oooo0oOooO0O0.OooO0OO(oooO00o.f114549OooO0O0);
                return oooO0O0OooO0OO.f119709OooO00o != null ? oooO0O0OooO0OO : new o000oOoO.OooO0O0(new OooO0O0(abstractC33086Oooo0oOooO0O0, oooO0O0OooO0OO.f119710OooO0O0));
            }
            arrayList.add(str);
        }
        return new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119718OooO0oO.OooO0oo("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List<OooO00o> OooO0Oo(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String key = map.entrySet().iterator().next().getKey();
            arrayList.add(new OooO00o(key, o0OoOo0.OooO0oO(key, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }
}

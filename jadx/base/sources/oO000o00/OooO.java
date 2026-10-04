package oO000o00;

import com.google.common.base.Preconditions;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationResponse;
import java.util.List;
import java.util.Map;
import oO000Oo.C32041o0000OoO;
import oO000Oo.o0OoOo0;
import oO000o00.C32098OooO0oo;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33092Oooo0oO;
import oO0OOo0o.o000oOoO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends AbstractC33086Oooo0o {
    public static o000oOoO.OooO0O0 OooO0Oo(Map map) {
        Long l;
        Long l2;
        Long l3;
        Integer num;
        int i;
        C32098OooO0oo.OooO0o.OooO0O0 oooO0O0;
        C32098OooO0oo.OooO0o.OooO00o oooO00o;
        List list;
        Integer num2;
        Integer num3;
        Long lOooO = o0OoOo0.OooO(MicrosoftAuthorizationResponse.INTERVAL, map);
        Long lOooO2 = o0OoOo0.OooO("baseEjectionTime", map);
        Long lOooO3 = o0OoOo0.OooO("maxEjectionTime", map);
        Integer numOooO0o = o0OoOo0.OooO0o("maxEjectionPercentage", map);
        if (lOooO != null) {
            Preconditions.checkArgument(true);
            l = lOooO;
        } else {
            l = 10000000000L;
        }
        if (lOooO2 != null) {
            Preconditions.checkArgument(true);
            l2 = lOooO2;
        } else {
            l2 = 30000000000L;
        }
        if (lOooO3 != null) {
            Preconditions.checkArgument(true);
            l3 = lOooO3;
        } else {
            l3 = 300000000000L;
        }
        if (numOooO0o != null) {
            Preconditions.checkArgument(true);
            num = numOooO0o;
        } else {
            num = 10;
        }
        Map mapOooO0oO = o0OoOo0.OooO0oO("successRateEjection", map);
        if (mapOooO0oO != null) {
            Integer num4 = 1900;
            Integer num5 = 100;
            i = 5;
            Integer numOooO0o2 = o0OoOo0.OooO0o("stdevFactor", mapOooO0oO);
            Integer numOooO0o3 = o0OoOo0.OooO0o("enforcementPercentage", mapOooO0oO);
            Integer numOooO0o4 = o0OoOo0.OooO0o("minimumHosts", mapOooO0oO);
            Integer numOooO0o5 = o0OoOo0.OooO0o("requestVolume", mapOooO0oO);
            if (numOooO0o2 != null) {
                Preconditions.checkArgument(true);
                num4 = numOooO0o2;
            }
            if (numOooO0o3 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o3.intValue() >= 0 && numOooO0o3.intValue() <= 100);
                num2 = numOooO0o3;
            } else {
                num2 = num5;
            }
            if (numOooO0o4 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o4.intValue() >= 0);
                num3 = numOooO0o4;
            } else {
                num3 = 5;
            }
            if (numOooO0o5 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o5.intValue() >= 0);
                num5 = numOooO0o5;
            }
            oooO0O0 = new C32098OooO0oo.OooO0o.OooO0O0(num4, num2, num3, num5);
        } else {
            i = 5;
            oooO0O0 = null;
        }
        Map mapOooO0oO2 = o0OoOo0.OooO0oO("failurePercentageEjection", map);
        if (mapOooO0oO2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer numValueOf = Integer.valueOf(i);
            Integer numOooO0o6 = o0OoOo0.OooO0o("threshold", mapOooO0oO2);
            Integer numOooO0o7 = o0OoOo0.OooO0o("enforcementPercentage", mapOooO0oO2);
            Integer numOooO0o8 = o0OoOo0.OooO0o("minimumHosts", mapOooO0oO2);
            Integer numOooO0o9 = o0OoOo0.OooO0o("requestVolume", mapOooO0oO2);
            if (numOooO0o6 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o6.intValue() >= 0 && numOooO0o6.intValue() <= 100);
                num6 = numOooO0o6;
            }
            if (numOooO0o7 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o7.intValue() >= 0 && numOooO0o7.intValue() <= 100);
                num7 = numOooO0o7;
            }
            if (numOooO0o8 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o8.intValue() >= 0);
                numValueOf = numOooO0o8;
            }
            if (numOooO0o9 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numOooO0o9.intValue() >= 0);
            } else {
                numOooO0o9 = 50;
            }
            oooO00o = new C32098OooO0oo.OooO0o.OooO00o(num6, num7, numValueOf, numOooO0o9);
        } else {
            oooO00o = null;
        }
        List listOooO0OO = o0OoOo0.OooO0OO("childPolicy", map);
        if (listOooO0OO == null) {
            list = null;
        } else {
            o0OoOo0.OooO00o(listOooO0OO);
            list = listOooO0OO;
        }
        List<C32041o0000OoO.OooO00o> listOooO0Oo = C32041o0000OoO.OooO0Oo(list);
        if (listOooO0Oo == null || listOooO0Oo.isEmpty()) {
            return new o000oOoO.OooO0O0(o00Oo0.f119723OooOOO.OooO0oo("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        o000oOoO.OooO0O0 oooO0O0OooO0OO = C32041o0000OoO.OooO0OO(listOooO0Oo, C33092Oooo0oO.OooO00o());
        if (oooO0O0OooO0OO.f119709OooO00o != null) {
            return oooO0O0OooO0OO;
        }
        C32041o0000OoO.OooO0O0 oooO0O02 = (C32041o0000OoO.OooO0O0) oooO0O0OooO0OO.f119710OooO0O0;
        Preconditions.checkState(oooO0O02 != null);
        Preconditions.checkState(oooO0O02 != null);
        return new o000oOoO.OooO0O0(new C32098OooO0oo.OooO0o(l, l2, l3, num, oooO0O0, oooO00o, oooO0O02));
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO0OO
    public final AbstractC33087Oooo0o0 OooO00o(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        return new C32098OooO0oo(abstractC33089OooO0o0);
    }

    @Override // oO0OOo0o.AbstractC33086Oooo0o
    public final String OooO0O0() {
        return "outlier_detection_experimental";
    }

    @Override // oO0OOo0o.AbstractC33086Oooo0o
    public final o000oOoO.OooO0O0 OooO0OO(Map<String, ?> map) {
        try {
            return OooO0Oo(map);
        } catch (RuntimeException e) {
            return new o000oOoO.OooO0O0(o00Oo0.f119725OooOOOO.OooO0oO(e).OooO0oo("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}

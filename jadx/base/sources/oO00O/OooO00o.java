package oO00O;

import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32447OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f115244OooO00o;

    static {
        OooOOOO oooOOOO = OooOOOO.RSA;
        int i = 5;
        int i2 = 2;
        C32139OooO0Oo c32139OooO0Oo = new C32139OooO0Oo((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", oooOOOO, 128, i, i2);
        OooOOOO oooOOOO2 = OooOOOO.ECDHE;
        int i3 = 6;
        int i4 = 4;
        C32139OooO0Oo c32139OooO0Oo2 = new C32139OooO0Oo((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", oooOOOO2, 256, i3, i4);
        int i5 = 128;
        C32139OooO0Oo c32139OooO0Oo3 = new C32139OooO0Oo((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", oooOOOO2, i5, i, i4);
        C32139OooO0Oo c32139OooO0Oo4 = new C32139OooO0Oo((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", oooOOOO2, 256, i3, i2);
        C32139OooO0Oo c32139OooO0Oo5 = new C32139OooO0Oo((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", oooOOOO2, i5, i, i2);
        EnumC32140OooO0o0 enumC32140OooO0o0 = EnumC32140OooO0o0.f115262OooOo;
        List listOooOO0o = C34429OooOOo0.OooOO0o(c32139OooO0Oo2, c32139OooO0Oo4, c32139OooO0Oo3, c32139OooO0Oo5, c32139OooO0Oo, new C32139OooO0Oo((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", oooOOOO, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, 5, 2, enumC32140OooO0o0), new C32139OooO0Oo((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", oooOOOO, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, 5, 2, enumC32140OooO0o0));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOooOO0o) {
            C32139OooO0Oo c32139OooO0Oo6 = (C32139OooO0Oo) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(c32139OooO0Oo6, "<this>");
            C32447OooOOo c32447OooOOo = oO00OO0O.OooO0O0.f115707OooO00o;
            String str = ((oO00OO0O.OooO00o) c32447OooOOo.getValue()).f115705OooO00o;
            int iHashCode = str.hashCode();
            int i6 = c32139OooO0Oo6.f115250OooO0o;
            if (iHashCode != 46676283) {
                if (iHashCode != 46677244) {
                    if (iHashCode != 46678205 || !str.equals("1.8.0") || ((oO00OO0O.OooO00o) c32447OooOOo.getValue()).f115706OooO0O0 >= 161 || i6 <= 128) {
                        arrayList.add(obj);
                    }
                } else if (!str.equals("1.7.0") || ((oO00OO0O.OooO00o) c32447OooOOo.getValue()).f115706OooO0O0 >= 171 || i6 <= 128) {
                    arrayList.add(obj);
                }
            } else if (!str.equals("1.6.0") || ((oO00OO0O.OooO00o) c32447OooOOo.getValue()).f115706OooO0O0 >= 181 || i6 <= 128) {
                arrayList.add(obj);
            }
        }
        f115244OooO00o = arrayList;
    }
}

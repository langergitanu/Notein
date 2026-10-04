package oO0O0O0o;

import java.util.EnumMap;
import java.util.HashMap;
import oO0O0O0o.OooOO0;
import oO0Ooo.AbstractC33328Oooo0O0;

/* JADX INFO: renamed from: oO0O0O0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32590OooO0oo implements oO0O000o.OooO00o<OooOO0.OooO00o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f117104OooOo0o;

    public C32590OooO0oo(OooOO0 oooOO02) {
        this.f117104OooOo0o = oooOO02;
    }

    @Override // oO0O000o.OooO00o
    public final OooOO0.OooO00o invoke() {
        EnumMap enumMap = new EnumMap(OooOO0O.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (OooOO0O oooOO0O : OooOO0O.values()) {
            String strOooO0O0 = oooOO0O.f117123OooOo0o.OooO0O0();
            OooOO0 oooOO02 = this.f117104OooOo0o;
            if (strOooO0O0 == null) {
                oooOO02.getClass();
                OooOO0.OooO00o(46);
                throw null;
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = oooOO02.OooOO0(strOooO0O0).OooOOO();
            if (abstractC33328Oooo0O0OooOOO == null) {
                OooOO0.OooO00o(47);
                throw null;
            }
            String strOooO0O02 = oooOO0O.f117122OooOo.OooO0O0();
            if (strOooO0O02 == null) {
                OooOO0.OooO00o(46);
                throw null;
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO2 = oooOO02.OooOO0(strOooO0O02).OooOOO();
            if (abstractC33328Oooo0O0OooOOO2 == null) {
                OooOO0.OooO00o(47);
                throw null;
            }
            enumMap.put(oooOO0O, abstractC33328Oooo0O0OooOOO2);
            map.put(abstractC33328Oooo0O0OooOOO, abstractC33328Oooo0O0OooOOO2);
            map2.put(abstractC33328Oooo0O0OooOOO2, abstractC33328Oooo0O0OooOOO);
        }
        return new OooOO0.OooO00o(enumMap, map, map2);
    }
}

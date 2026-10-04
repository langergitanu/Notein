package o0000oO;

import java.util.ArrayList;

/* JADX INFO: renamed from: o0000oO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24320OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC24322OooOOOo f81866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<AbstractC24322OooOOOo> f81867OooO0O0;

    public static long OooO00o(C24312OooO0o c24312OooO0o, long j) {
        AbstractC24322OooOOOo abstractC24322OooOOOo = c24312OooO0o.f81836OooO0Oo;
        if (abstractC24322OooOOOo instanceof C24317OooOO0O) {
            return j;
        }
        ArrayList arrayList = c24312OooO0o.f81842OooOO0O;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC24311OooO0Oo interfaceC24311OooO0Oo = (InterfaceC24311OooO0Oo) arrayList.get(i);
            if (interfaceC24311OooO0Oo instanceof C24312OooO0o) {
                C24312OooO0o c24312OooO0o2 = (C24312OooO0o) interfaceC24311OooO0Oo;
                if (c24312OooO0o2.f81836OooO0Oo != abstractC24322OooOOOo) {
                    jMin = Math.min(jMin, OooO00o(c24312OooO0o2, ((long) c24312OooO0o2.f81837OooO0o) + j));
                }
            }
        }
        if (c24312OooO0o != abstractC24322OooOOOo.f81874OooO) {
            return jMin;
        }
        long jOooOO0 = abstractC24322OooOOOo.OooOO0();
        C24312OooO0o c24312OooO0o3 = abstractC24322OooOOOo.f81882OooO0oo;
        long j2 = j - jOooOO0;
        return Math.min(Math.min(jMin, OooO00o(c24312OooO0o3, j2)), j2 - ((long) c24312OooO0o3.f81837OooO0o));
    }

    public static long OooO0O0(C24312OooO0o c24312OooO0o, long j) {
        AbstractC24322OooOOOo abstractC24322OooOOOo = c24312OooO0o.f81836OooO0Oo;
        if (abstractC24322OooOOOo instanceof C24317OooOO0O) {
            return j;
        }
        ArrayList arrayList = c24312OooO0o.f81842OooOO0O;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC24311OooO0Oo interfaceC24311OooO0Oo = (InterfaceC24311OooO0Oo) arrayList.get(i);
            if (interfaceC24311OooO0Oo instanceof C24312OooO0o) {
                C24312OooO0o c24312OooO0o2 = (C24312OooO0o) interfaceC24311OooO0Oo;
                if (c24312OooO0o2.f81836OooO0Oo != abstractC24322OooOOOo) {
                    jMax = Math.max(jMax, OooO0O0(c24312OooO0o2, ((long) c24312OooO0o2.f81837OooO0o) + j));
                }
            }
        }
        if (c24312OooO0o != abstractC24322OooOOOo.f81882OooO0oo) {
            return jMax;
        }
        long jOooOO0 = abstractC24322OooOOOo.OooOO0();
        C24312OooO0o c24312OooO0o3 = abstractC24322OooOOOo.f81874OooO;
        long j2 = j + jOooOO0;
        return Math.max(Math.max(jMax, OooO0O0(c24312OooO0o3, j2)), j2 - ((long) c24312OooO0o3.f81837OooO0o));
    }
}

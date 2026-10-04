package o000OoO;

import oO00ooOo.C32473OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24536OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C24536OooO0Oo f82989OooO00o;

    public static C32473OooO00o OooO00o(InterfaceC32507OooOO0o... interfaceC32507OooOO0oArr) {
        if (interfaceC32507OooOO0oArr.length > 0) {
            return new C32473OooO00o(interfaceC32507OooOO0oArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int OooO0O0(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void OooO0OO(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" may not be null"));
        }
    }
}

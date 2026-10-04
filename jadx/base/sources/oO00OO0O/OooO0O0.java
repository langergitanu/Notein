package oO00OO0O;

import OooOoOO.C20519OooO0Oo;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32447OooOOo f115707OooO00o = C20519OooO0Oo.OooO0OO(OooO00o.f115708OooOo0o);

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<oO00OO0O.OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115708OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final oO00OO0O.OooO00o invoke() {
            oO00OO0O.OooO00o oooO00o = oO00OO0O.OooO00o.f115704OooO0OO;
            String property = System.getProperty("java.version");
            OooOOO0.OooO0o(property, "getProperty(\"java.version\")");
            try {
                List listO000oOoO = C33599OooOo0O.o000oOoO(property, new char[]{'-', '_'});
                return listO000oOoO.size() == 2 ? new oO00OO0O.OooO00o((String) listO000oOoO.get(0), Integer.parseInt((String) listO000oOoO.get(1))) : new oO00OO0O.OooO00o(property, -1);
            } catch (Throwable unused) {
                return oO00OO0O.OooO00o.f115704OooO0OO;
            }
        }
    }
}

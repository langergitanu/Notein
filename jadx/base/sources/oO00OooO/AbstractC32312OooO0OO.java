package oO00OooO;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import oO00Ooo0.C32309OooO00o;

/* JADX INFO: renamed from: oO00OooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32312OooO0OO {

    /* JADX INFO: renamed from: oO00OooO.OooO0OO$OooO00o */
    public static final class OooO00o extends AbstractC32312OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f116230OooO00o = new HashSet();

        static {
            Map map = Collections.EMPTY_MAP;
            C32309OooO00o.OooO00o(map, "numbersOfLatencySampledSpans");
            Map map2 = map;
            new C32310OooO00o(Collections.unmodifiableMap(new HashMap(map2)), Collections.unmodifiableMap(new HashMap(map2)));
        }
    }

    /* JADX INFO: renamed from: oO00OooO.OooO0OO$OooO0O0 */
    public static abstract class OooO0O0 {
        public abstract Map<Object, Integer> OooO00o();

        public abstract Map<Object, Integer> OooO0O0();
    }
}

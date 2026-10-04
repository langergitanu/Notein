package p619oO;

import androidx.fragment.app.C21893OooOOOo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOoOo.InterfaceC34201OooO0Oo;

/* JADX INFO: renamed from: oO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31898OooOOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<Integer, C31898OooOOo> f113664OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31892OooO0Oo f113665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31903OooOo0o f113666OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113667OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113668OooO0Oo;

    static {
        HashMap map = new HashMap();
        C34032OooOo0O c34032OooOo0O = InterfaceC34105OooO00o.f122523OooO00o;
        map.put(1, new C31898OooOOo(20, 2, c34032OooOo0O));
        C21893OooOOOo.OooO0O0(20, 4, c34032OooOo0O, map, 2);
        C21893OooOOOo.OooO0O0(40, 2, c34032OooOo0O, map, 3);
        C21893OooOOOo.OooO0O0(40, 4, c34032OooOo0O, map, 4);
        C21893OooOOOo.OooO0O0(40, 8, c34032OooOo0O, map, 5);
        C21893OooOOOo.OooO0O0(60, 3, c34032OooOo0O, map, 6);
        C21893OooOOOo.OooO0O0(60, 6, c34032OooOo0O, map, 7);
        C21893OooOOOo.OooO0O0(60, 12, c34032OooOo0O, map, 8);
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34105OooO00o.f122525OooO0OO;
        map.put(9, new C31898OooOOo(20, 2, c34032OooOo0O2));
        C21893OooOOOo.OooO0O0(20, 4, c34032OooOo0O2, map, 10);
        C21893OooOOOo.OooO0O0(40, 2, c34032OooOo0O2, map, 11);
        C21893OooOOOo.OooO0O0(40, 4, c34032OooOo0O2, map, 12);
        C21893OooOOOo.OooO0O0(40, 8, c34032OooOo0O2, map, 13);
        C21893OooOOOo.OooO0O0(60, 3, c34032OooOo0O2, map, 14);
        C21893OooOOOo.OooO0O0(60, 6, c34032OooOo0O2, map, 15);
        C21893OooOOOo.OooO0O0(60, 12, c34032OooOo0O2, map, 16);
        C34032OooOo0O c34032OooOo0O3 = InterfaceC34105OooO00o.f122531OooOO0;
        map.put(17, new C31898OooOOo(20, 2, c34032OooOo0O3));
        C21893OooOOOo.OooO0O0(20, 4, c34032OooOo0O3, map, 18);
        map.put(19, new C31898OooOOo(40, 2, c34032OooOo0O3));
        C21893OooOOOo.OooO0O0(40, 4, c34032OooOo0O3, map, 20);
        C21893OooOOOo.OooO0O0(40, 8, c34032OooOo0O3, map, 21);
        C21893OooOOOo.OooO0O0(60, 3, c34032OooOo0O3, map, 22);
        C21893OooOOOo.OooO0O0(60, 6, c34032OooOo0O3, map, 23);
        C21893OooOOOo.OooO0O0(60, 12, c34032OooOo0O3, map, 24);
        C34032OooOo0O c34032OooOo0O4 = InterfaceC34105OooO00o.f122532OooOO0O;
        map.put(25, new C31898OooOOo(20, 2, c34032OooOo0O4));
        C21893OooOOOo.OooO0O0(20, 4, c34032OooOo0O4, map, 26);
        C21893OooOOOo.OooO0O0(40, 2, c34032OooOo0O4, map, 27);
        C21893OooOOOo.OooO0O0(40, 4, c34032OooOo0O4, map, 28);
        C21893OooOOOo.OooO0O0(40, 8, c34032OooOo0O4, map, 29);
        C21893OooOOOo.OooO0O0(60, 3, c34032OooOo0O4, map, 30);
        C21893OooOOOo.OooO0O0(60, 6, c34032OooOo0O4, map, 31);
        C21893OooOOOo.OooO0O0(60, 12, c34032OooOo0O4, map, 32);
        f113664OooO0o0 = Collections.unmodifiableMap(map);
    }

    public C31898OooOOo(int i, int i2, C34032OooOo0O c34032OooOo0O) {
        this.f113667OooO0OO = i;
        this.f113668OooO0Oo = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        C31903OooOo0o c31903OooOo0o = new C31903OooOo0o(i3, c34032OooOo0O);
        this.f113666OooO0O0 = c31903OooOo0o;
        int i4 = c31903OooOo0o.f113716OooO0oO.f113653OooO0OO;
        String str = c31903OooOo0o.f113715OooO0o0;
        if (str != null) {
            this.f113665OooO00o = C31892OooO0Oo.f113624OooO0OO.get(C31892OooO0Oo.OooO00o(c31903OooOo0o.f113714OooO0o, c31903OooOo0o.f113713OooO0Oo, i4, i, str, i2));
        } else {
            Map<String, C31892OooO0Oo> map = C31892OooO0Oo.f113624OooO0OO;
            throw new NullPointerException("algorithmName == null");
        }
    }

    public C31898OooOOo(int i, int i2, InterfaceC34201OooO0Oo interfaceC34201OooO0Oo) {
        this(i, i2, OooO0o.OooO0O0(interfaceC34201OooO0Oo.OooO0O0()));
    }
}

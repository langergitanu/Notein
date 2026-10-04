package p619oO;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOoOo.InterfaceC34201OooO0Oo;

/* JADX INFO: renamed from: oO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31903OooOo0o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Map<Integer, C31903OooOo0o> f113709OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31893OooO0o0 f113710OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113711OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113712OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113713OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f113714OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f113715OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO0 f113716OooO0oO;

    static {
        HashMap map = new HashMap();
        C34032OooOo0O c34032OooOo0O = InterfaceC34105OooO00o.f122523OooO00o;
        map.put(1, new C31903OooOo0o(10, c34032OooOo0O));
        map.put(2, new C31903OooOo0o(16, c34032OooOo0O));
        map.put(3, new C31903OooOo0o(20, c34032OooOo0O));
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34105OooO00o.f122525OooO0OO;
        map.put(4, new C31903OooOo0o(10, c34032OooOo0O2));
        map.put(5, new C31903OooOo0o(16, c34032OooOo0O2));
        map.put(6, new C31903OooOo0o(20, c34032OooOo0O2));
        C34032OooOo0O c34032OooOo0O3 = InterfaceC34105OooO00o.f122531OooOO0;
        map.put(7, new C31903OooOo0o(10, c34032OooOo0O3));
        map.put(8, new C31903OooOo0o(16, c34032OooOo0O3));
        map.put(9, new C31903OooOo0o(20, c34032OooOo0O3));
        C34032OooOo0O c34032OooOo0O4 = InterfaceC34105OooO00o.f122532OooOO0O;
        map.put(10, new C31903OooOo0o(10, c34032OooOo0O4));
        map.put(11, new C31903OooOo0o(16, c34032OooOo0O4));
        map.put(12, new C31903OooOo0o(20, c34032OooOo0O4));
        f113709OooO0oo = Collections.unmodifiableMap(map);
    }

    public C31903OooOo0o(int i, C34032OooOo0O c34032OooOo0O) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c34032OooOo0O == null) {
            throw new NullPointerException("digest == null");
        }
        this.f113711OooO0O0 = i;
        int i2 = 2;
        while (true) {
            int i3 = this.f113711OooO0O0;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                this.f113712OooO0OO = i2;
                String str = (String) OooO0o.f113628OooO0O0.get(c34032OooOo0O);
                if (str == null) {
                    throw new IllegalArgumentException("unrecognized digest oid: " + c34032OooOo0O);
                }
                this.f113715OooO0o0 = str;
                OooOOO0 oooOOO0 = new OooOOO0(c34032OooOo0O);
                this.f113716OooO0oO = oooOOO0;
                int i4 = oooOOO0.f113651OooO00o;
                this.f113714OooO0o = i4;
                int i5 = oooOOO0.f113652OooO0O0;
                this.f113713OooO0Oo = i5;
                this.f113710OooO00o = C31893OooO0o0.f113629OooO0OO.get(C31893OooO0o0.OooO00o(i4, i5, oooOOO0.f113653OooO0OO, i, str));
                return;
            }
            i2++;
        }
    }

    public C31903OooOo0o(int i, InterfaceC34201OooO0Oo interfaceC34201OooO0Oo) {
        this(i, OooO0o.OooO0O0(interfaceC34201OooO0Oo.OooO0O0()));
    }
}

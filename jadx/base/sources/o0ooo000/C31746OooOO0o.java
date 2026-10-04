package o0ooo000;

import java.util.HashMap;

/* JADX INFO: renamed from: o0ooo000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31746OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C31746OooOO0o f113381OooO0O0 = new C31746OooOO0o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f113382OooO00o;

    public C31746OooOO0o() {
        HashMap map = new HashMap();
        this.f113382OooO00o = map;
        HashMap map2 = new HashMap();
        if (map.containsKey("Standard")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Standard", C31749OooOOOO.class);
        map2.put(C31747OooOOO.class, C31749OooOOOO.class);
        if (map.containsKey("Adobe.PubSec")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Adobe.PubSec", C31743OooO0oo.class);
        map2.put(C31740OooO0o.class, C31743OooO0oo.class);
    }
}

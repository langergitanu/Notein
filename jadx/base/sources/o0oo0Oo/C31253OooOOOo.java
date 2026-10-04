package o0oo0Oo;

import android.os.Build;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oO00ooO.C32443OooOOO;
import oO00ooOO.C32466OooO0OO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0oo0Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31253OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32466OooO0OO f111547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f111548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, Integer> f111549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, Integer> f111550OooO0Oo;

    /* JADX INFO: renamed from: o0oo0Oo.OooOOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Object f111551OooO00o = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(3.0f))), new C32443OooOOO(1, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(8.0f))), new C32443OooOOO(10, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(2.0f))), new C32443OooOOO(11, new C32443OooOOO(Float.valueOf(0.5f), Float.valueOf(8.0f))), new C32443OooOOO(2, new C32443OooOOO(Float.valueOf(0.5f), Float.valueOf(8.0f))), new C32443OooOOO(9, new C32443OooOOO(Float.valueOf(0.5f), Float.valueOf(8.0f))), new C32443OooOOO(7, new C32443OooOOO(Float.valueOf(0.3f), Float.valueOf(1.6f))), new C32443OooOOO(8, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(1.0f))), new C32443OooOOO(12, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(2.0f))), new C32443OooOOO(3, new C32443OooOOO(Float.valueOf(0.5f), Float.valueOf(20.0f))));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        public static C32443OooOOO OooO00o(int i, C32443OooOOO c32443OooOOO) {
            C32443OooOOO c32443OooOOO2 = (C32443OooOOO) f111551OooO00o.get(Integer.valueOf(i));
            return c32443OooOOO2 == null ? c32443OooOOO : c32443OooOOO2;
        }

        public static C32443OooOOO OooO0O0(int i) {
            return OooO00o(i, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(3.0f)));
        }
    }

    static {
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
        c32466OooO0OO.put(-1, -1);
        c32466OooO0OO.put(2, 2);
        c32466OooO0OO.put(3, 3);
        c32466OooO0OO.put(4, 4);
        c32466OooO0OO.put(5, 5);
        c32466OooO0OO.put(6, 6);
        c32466OooO0OO.put(7, 7);
        c32466OooO0OO.put(8, 8);
        c32466OooO0OO.put(9, 9);
        c32466OooO0OO.put(11, 11);
        if (Build.VERSION.SDK_INT >= 34) {
            c32466OooO0OO.put(10, 100);
            c32466OooO0OO.put(12, 101);
            c32466OooO0OO.put(0, 102);
        } else {
            c32466OooO0OO.put(10, 10);
            c32466OooO0OO.put(12, 12);
            c32466OooO0OO.put(0, 0);
        }
        C32466OooO0OO c32466OooO0OOOooO0O0 = c32466OooO0OO.OooO0O0();
        f111547OooO00o = c32466OooO0OOOooO0O0;
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(-1, -1), new C32443OooOOO(0, 0), new C32443OooOOO(1, 1), new C32443OooOOO(2, 2), new C32443OooOOO(3, 3), new C32443OooOOO(4, 4), new C32443OooOOO(5, 5), new C32443OooOOO(6, 6), new C32443OooOOO(7, 7), new C32443OooOOO(8, 8), new C32443OooOOO(9, 9), new C32443OooOOO(10, 10), new C32443OooOOO(12, 12), new C32443OooOOO(11, 11), new C32443OooOOO(100, 10), new C32443OooOOO(101, 12), new C32443OooOOO(102, 0), new C32443OooOOO(103, 1));
        f111548OooO0O0 = mapOooO0oo;
        f111549OooO0OO = new ConcurrentHashMap<>(c32466OooO0OOOooO0O0);
        f111550OooO0Oo = new ConcurrentHashMap<>(mapOooO0oo);
    }
}

package ooOOoOO0;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oO0o.InterfaceC33531OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f126122OooO00o = new ConcurrentHashMap(16);

    public static final class OooO00o<T> {
    }

    public final <T> T OooO00o(InterfaceC33531OooO0o0 descriptor, OooO00o<T> oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        Map map = (Map) this.f126122OooO00o.get(descriptor);
        T t = map != null ? (T) map.get(oooO00o) : null;
        if (t == null) {
            return null;
        }
        return t;
    }
}

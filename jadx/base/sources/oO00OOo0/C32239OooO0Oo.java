package oO00OOo0;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: oO00OOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32239OooO0Oo<K, V> {
    private volatile /* synthetic */ Object current = C34436OooOoOO.f123455OooOo0o;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C32239OooO0Oo.class, Object.class, "current");
    }

    public final Object OooO00o(OooO0O0.OooO0O0 key) {
        OooOOO0.OooO0oO(key, "key");
        return ((Map) this.current).get(key);
    }
}

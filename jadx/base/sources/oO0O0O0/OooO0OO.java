package oO0O0O0;

import java.util.concurrent.ConcurrentHashMap;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f116896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, V> f116897OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(InterfaceC32507OooOO0o<? super Class<?>, ? extends V> compute) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(compute, "compute");
        this.f116896OooO00o = (kotlin.jvm.internal.OooOOOO) compute;
        this.f116897OooO0O0 = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final V OooO00o(Class<?> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f116897OooO0O0;
        V v = concurrentHashMap.get(key);
        if (v != null) {
            return v;
        }
        V v2 = (V) this.f116896OooO00o.invoke(key);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(key, v2);
        return vPutIfAbsent == null ? v2 : vPutIfAbsent;
    }
}

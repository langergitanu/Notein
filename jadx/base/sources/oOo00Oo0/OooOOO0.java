package oOo00Oo0;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements InterfaceC34503OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap<C34502OooO00o<?>, Object> f123684OooO00o = new ConcurrentHashMap<>();

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final List OooO00o() {
        return oOo000Oo.OooOo.o0ooOO0(OooO0oO().keySet());
    }

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final boolean OooO0O0(C34502OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return OooO0oO().containsKey(key);
    }

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final Object OooO0OO(C34502OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return OooO0oO().get(key);
    }

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final <T> T OooO0Oo(C34502OooO00o<T> key, oO0O000o.OooO00o<? extends T> block) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
        ConcurrentHashMap<C34502OooO00o<?>, Object> concurrentHashMap = this.f123684OooO00o;
        T t = (T) concurrentHashMap.get(key);
        if (t != null) {
            return t;
        }
        T tInvoke = block.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent((C34502OooO00o<?>) key, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final Object OooO0o(C34502OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        Object objOooO0OO = OooO0OO(key);
        if (objOooO0OO != null) {
            return objOooO0OO;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    @Override // oOo00Oo0.InterfaceC34503OooO0O0
    public final void OooO0o0(C34502OooO00o key, Object value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        OooO0oO().put(key, value);
    }

    public final Map OooO0oO() {
        return this.f123684OooO00o;
    }
}

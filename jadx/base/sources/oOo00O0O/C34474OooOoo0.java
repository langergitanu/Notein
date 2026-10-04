package oOo00O0O;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oOo00O0O.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO(with = C34473OooOoo.class)
public final class C34474OooOoo0 extends OooOO0O implements Map<String, OooOO0O>, oO0O00.OooO00o {
    public static final OooO00o Companion = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Map<String, OooOO0O> f123538OooOo0o;

    /* JADX INFO: renamed from: oOo00O0O.OooOoo0$OooO00o */
    public static final class OooO00o {
        public final InterfaceC33911OooO0OO<C34474OooOoo0> serializer() {
            return C34473OooOoo.f123533OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34474OooOoo0(Map<String, ? extends OooOO0O> content) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        this.f123538OooOo0o = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O compute(String str, BiFunction<? super String, ? super OooOO0O, ? extends OooOO0O> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O computeIfAbsent(String str, Function<? super String, ? extends OooOO0O> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O computeIfPresent(String str, BiFunction<? super String, ? super OooOO0O, ? extends OooOO0O> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f123538OooOo0o.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O value = (OooOO0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        return this.f123538OooOo0o.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, OooOO0O>> entrySet() {
        return this.f123538OooOo0o.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123538OooOo0o, obj);
    }

    @Override // java.util.Map
    public final OooOO0O get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f123538OooOo0o.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f123538OooOo0o.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f123538OooOo0o.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f123538OooOo0o.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O merge(String str, OooOO0O oooOO0O, BiFunction<? super OooOO0O, ? super OooOO0O, ? extends OooOO0O> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O put(String str, OooOO0O oooOO0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends OooOO0O> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O putIfAbsent(String str, OooOO0O oooOO0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final OooOO0O remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ OooOO0O replace(String str, OooOO0O oooOO0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super OooOO0O, ? extends OooOO0O> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f123538OooOo0o.size();
    }

    public final String toString() {
        return oOo000Oo.OooOo.o000oOoO(this.f123538OooOo0o.entrySet(), ",", "{", "}", new C34472OooOoOO(0), 24);
    }

    @Override // java.util.Map
    public final Collection<OooOO0O> values() {
        return this.f123538OooOo0o.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, OooOO0O oooOO0O, OooOO0O oooOO0O2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

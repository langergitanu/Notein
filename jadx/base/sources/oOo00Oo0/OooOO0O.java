package oOo00Oo0;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o00oo0O0.C25667OooOO0o;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O<Value> implements Map<String, Value>, InterfaceC32497OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedHashMap f123681OooOo0o = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f123681OooOo0o.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f123681OooOo0o.containsKey(new C34510OooOO0o(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f123681OooOo0o.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Value>> entrySet() {
        return new C34513OooOOo0(this.f123681OooOo0o.entrySet(), C34508OooO0oO.f123678OooOo0o, C34509OooO0oo.f123679OooOo0o);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OooOO0O)) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O) obj).f123681OooOo0o, this.f123681OooOo0o);
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return (Value) this.f123681OooOo0o.get(C25667OooOO0o.OooO00o(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f123681OooOo0o.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f123681OooOo0o.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new C34513OooOOo0(this.f123681OooOo0o.keySet(), OooO.f123650OooOo0o, OooOO0.f123680OooOo0o);
    }

    @Override // java.util.Map
    public final Object put(String str, Object value) {
        String key = str;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        return this.f123681OooOo0o.put(C25667OooOO0o.OooO00o(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Value> from) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            this.f123681OooOo0o.put(C25667OooOO0o.OooO00o(key), value);
        }
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return (Value) this.f123681OooOo0o.remove(C25667OooOO0o.OooO00o(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f123681OooOo0o.size();
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.f123681OooOo0o.values();
    }
}

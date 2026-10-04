package oOo00Oo0;

import java.util.Map;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: oOo00Oo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34512OooOOo<Key, Value> implements Map.Entry<Key, Value>, InterfaceC32497OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Value f123687OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Key f123688OooOo0o;

    public C34512OooOOo(Key key, Value value) {
        this.f123688OooOo0o = key;
        this.f123687OooOo = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getKey(), this.f123688OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getValue(), this.f123687OooOo)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.f123688OooOo0o;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.f123687OooOo;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Key key = this.f123688OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(key);
        int iHashCode = key.hashCode() + 527;
        Value value = this.f123687OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(value);
        return value.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value value) {
        this.f123687OooOo = value;
        return value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f123688OooOo0o);
        sb.append('=');
        sb.append(this.f123687OooOo);
        return sb.toString();
    }
}

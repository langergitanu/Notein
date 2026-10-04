package oOo00Oo0;

import java.util.LinkedHashMap;
import java.util.Map;
import oO000oO0.OooO0OO;

/* JADX INFO: renamed from: oOo00Oo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34514OooOOoo<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0OO.OooO0Oo f123695OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO.C20200OooO0OO f123696OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f123697OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34514OooOOoo(OooO0OO.C20200OooO0OO c20200OooO0OO, OooO0OO.OooO0Oo close, int i) {
        super(10, 0.75f, true);
        kotlin.jvm.internal.OooOOO0.OooO0oO(close, "close");
        this.f123696OooOo0o = c20200OooO0OO;
        this.f123695OooOo = close;
        this.f123697OooOoO0 = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (this.f123697OooOoO0 == 0) {
            return (V) this.f123696OooOo0o.invoke(obj);
        }
        synchronized (this) {
            V v = (V) super.get(obj);
            if (v != null) {
                return v;
            }
            V v2 = (V) this.f123696OooOo0o.invoke(obj);
            put(obj, v2);
            return v2;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> eldest) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(eldest, "eldest");
        boolean z = super.size() > this.f123697OooOoO0;
        if (z) {
            this.f123695OooOo.invoke(eldest.getValue());
        }
        return z;
    }
}

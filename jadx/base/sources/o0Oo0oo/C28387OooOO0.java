package o0Oo0oo;

import OooOoo0.o00000;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o0Oo0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28387OooOO0 implements InterfaceC28404OooOoO0, Iterable<Map.Entry<? extends OooOo<?>, ? extends Object>>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f100642OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedHashMap f100643OooOo0o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f100644OooOoO0;

    @Override // o0Oo0oo.InterfaceC28404OooOoO0
    public final <T> void OooO0O0(OooOo<T> key, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        this.f100643OooOo0o.put(key, t);
    }

    public final <T> boolean OooO0Oo(OooOo<T> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f100643OooOo0o.containsKey(key);
    }

    public final <T> T OooO0o0(OooOo<T> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        T t = (T) this.f100643OooOo0o.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28387OooOO0)) {
            return false;
        }
        C28387OooOO0 c28387OooOO0 = (C28387OooOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100643OooOo0o, c28387OooOO0.f100643OooOo0o) && this.f100642OooOo == c28387OooOO0.f100642OooOo && this.f100644OooOoO0 == c28387OooOO0.f100644OooOoO0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100644OooOoO0) + o00000.OooO0O0(this.f100643OooOo0o.hashCode() * 31, 31, this.f100642OooOo);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends OooOo<?>, ? extends Object>> iterator() {
        return this.f100643OooOo0o.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f100642OooOo) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f100644OooOoO0) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f100643OooOo0o.entrySet()) {
            OooOo oooOo = (OooOo) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(oooOo.f100695OooO00o);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return o00000.OooOo00.OooO0OO(this) + "{ " + ((Object) sb) + " }";
    }
}

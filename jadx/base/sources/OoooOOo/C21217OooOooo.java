package OoooOOo;

import java.util.ConcurrentModificationException;
import java.util.Map;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: OoooOOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21217OooOooo implements Map.Entry<Object, Object>, InterfaceC32497OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f61559OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f61560OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C21219Oooo000<Object, Object> f61561OooOoO0;

    public C21217OooOooo(C21219Oooo000<Object, Object> c21219Oooo000) {
        this.f61561OooOoO0 = c21219Oooo000;
        Map.Entry<? extends Object, ? extends Object> entry = c21219Oooo000.f61564OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(entry);
        this.f61560OooOo0o = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = c21219Oooo000.f61564OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(entry2);
        this.f61559OooOo = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f61560OooOo0o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f61559OooOo;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C21219Oooo000<Object, Object> c21219Oooo000 = this.f61561OooOoO0;
        if (c21219Oooo000.f61563OooOo0o.OooO00o().f61525OooO0Oo != c21219Oooo000.f61565OooOoO0) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f61559OooOo;
        c21219Oooo000.f61563OooOo0o.put(this.f61560OooOo0o, obj);
        this.f61559OooOo = obj;
        return obj2;
    }
}

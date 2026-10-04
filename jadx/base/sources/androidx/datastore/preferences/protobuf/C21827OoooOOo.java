package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooOo;
import androidx.datastore.preferences.protobuf.OooOo00;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21827OoooOOo<T> implements InterfaceC21836Oooooo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC21822OoooO0 f64536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0<?, ?> f64537OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f64538OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC21798OooOOo0<?> f64539OooO0Oo;

    public C21827OoooOOo(o00Oo0<?, ?> o00oo02, AbstractC21798OooOOo0<?> abstractC21798OooOOo0, InterfaceC21822OoooO0 interfaceC21822OoooO0) {
        this.f64537OooO0O0 = o00oo02;
        this.f64538OooO0OO = abstractC21798OooOOo0.OooO0o0(interfaceC21822OoooO0);
        this.f64539OooO0Oo = abstractC21798OooOOo0;
        this.f64536OooO00o = interfaceC21822OoooO0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final int OooO00o(OooO00o oooO00o) {
        o00Oo0<?, ?> o00oo02 = this.f64537OooO0O0;
        int iOooO = o00oo02.OooO(o00oo02.OooO0oO(oooO00o));
        if (this.f64538OooO0OO) {
            C21839Ooooooo c21839Ooooooo = this.f64539OooO0Oo.OooO0OO(oooO00o).f64476OooO00o;
            if (c21839Ooooooo.f64592OooOo0o.size() > 0) {
                OooOo00.OooO0Oo(c21839Ooooooo.OooO0Oo(0));
                throw null;
            }
            Iterator<T> it = c21839Ooooooo.OooO0o0().iterator();
            if (it.hasNext()) {
                OooOo00.OooO0Oo((Map.Entry) it.next());
                throw null;
            }
        }
        return iOooO;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void OooO0O0(Object obj, OooOO0O oooOO0O, C21796OooOOOo c21796OooOOOo) throws IOException {
        o00Oo0<?, ?> o00oo02 = this.f64537OooO0O0;
        o00Ooo o00oooOooO0o = o00oo02.OooO0o(obj);
        AbstractC21798OooOOo0<?> abstractC21798OooOOo0 = this.f64539OooO0Oo;
        OooOo00<T> oooOo00OooO0Oo = abstractC21798OooOOo0.OooO0Oo(obj);
        while (oooOO0O.OooO00o() != Integer.MAX_VALUE) {
            try {
                OooOO0O oooOO0O2 = oooOO0O;
                C21796OooOOOo c21796OooOOOo2 = c21796OooOOOo;
                if (!OooO0o(oooOO0O2, c21796OooOOOo2, abstractC21798OooOOo0, oooOo00OooO0Oo, o00oo02, o00oooOooO0o)) {
                    return;
                }
                oooOO0O = oooOO0O2;
                c21796OooOOOo = c21796OooOOOo2;
            } finally {
                o00oo02.OooOOO(obj, o00oooOooO0o);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void OooO0OO(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException {
        Iterator itOooO0oO = this.f64539OooO0Oo.OooO0OO(t).OooO0oO();
        if (itOooO0oO.hasNext()) {
            ((OooOo00.OooO00o) ((Map.Entry) itOooO0oO.next()).getKey()).getLiteJavaType();
            throw null;
        }
        o00Oo0<?, ?> o00oo02 = this.f64537OooO0O0;
        o00oo02.OooOOo0(o00oo02.OooO0oO(t), interfaceC21846o0ooOO0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final boolean OooO0Oo(OooOo oooOo, OooOo oooOo2) {
        o00Oo0<?, ?> o00oo02 = this.f64537OooO0O0;
        if (!o00oo02.OooO0oO(oooOo).equals(o00oo02.OooO0oO(oooOo2))) {
            return false;
        }
        if (!this.f64538OooO0OO) {
            return true;
        }
        AbstractC21798OooOOo0<?> abstractC21798OooOOo0 = this.f64539OooO0Oo;
        return abstractC21798OooOOo0.OooO0OO(oooOo).equals(abstractC21798OooOOo0.OooO0OO(oooOo2));
    }

    public final boolean OooO0o(OooOO0O oooOO0O, C21796OooOOOo c21796OooOOOo, AbstractC21798OooOOo0 abstractC21798OooOOo0, OooOo00 oooOo00, o00Oo0 o00oo02, Object obj) throws IOException {
        int i = oooOO0O.f64437OooO0O0;
        InterfaceC21822OoooO0 interfaceC21822OoooO0 = this.f64536OooO00o;
        if (i != 11) {
            if ((i & 7) != 2) {
                return oooOO0O.OooOo();
            }
            OooOo.C21801OooO0o0 c21801OooO0o0OooO0O0 = abstractC21798OooOOo0.OooO0O0(c21796OooOOOo, interfaceC21822OoooO0, i >>> 3);
            if (c21801OooO0o0OooO0O0 == null) {
                return o00oo02.OooOO0o(0, oooOO0O, obj);
            }
            abstractC21798OooOOo0.OooO0oo(c21801OooO0o0OooO0O0);
            throw null;
        }
        int iOooOo0O = 0;
        OooOo.C21801OooO0o0 c21801OooO0o0OooO0O02 = null;
        OooO oooOOooO0o0 = null;
        while (oooOO0O.OooO00o() != Integer.MAX_VALUE) {
            int i2 = oooOO0O.f64437OooO0O0;
            if (i2 == 16) {
                oooOO0O.OooOo0o(0);
                iOooOo0O = oooOO0O.f64436OooO00o.OooOo0O();
                c21801OooO0o0OooO0O02 = abstractC21798OooOOo0.OooO0O0(c21796OooOOOo, interfaceC21822OoooO0, iOooOo0O);
            } else if (i2 == 26) {
                if (c21801OooO0o0OooO0O02 != null) {
                    abstractC21798OooOOo0.OooO0oo(c21801OooO0o0OooO0O02);
                    throw null;
                }
                oooOOooO0o0 = oooOO0O.OooO0o0();
            } else if (!oooOO0O.OooOo()) {
                break;
            }
        }
        if (oooOO0O.f64437OooO0O0 != 12) {
            throw new C21807OooOoOO("Protocol message end-group tag did not match expected tag.");
        }
        if (oooOOooO0o0 == null) {
            return true;
        }
        if (c21801OooO0o0OooO0O02 == null) {
            o00oo02.OooO0Oo(obj, iOooOo0O, oooOOooO0o0);
            return true;
        }
        abstractC21798OooOOo0.OooO(c21801OooO0o0OooO0O02);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final int OooO0o0(OooOo oooOo) {
        int iHashCode = this.f64537OooO0O0.OooO0oO(oooOo).hashCode();
        if (!this.f64538OooO0OO) {
            return iHashCode;
        }
        return this.f64539OooO0Oo.OooO0OO(oooOo).f64476OooO00o.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final boolean isInitialized(T t) {
        this.f64539OooO0Oo.OooO0OO(t).OooO0o0();
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void makeImmutable(T t) {
        this.f64537OooO0O0.OooOO0(t);
        this.f64539OooO0Oo.OooO0o(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void mergeFrom(T t, T t2) {
        Class<?> cls = C21838OoooooO.f64556OooO00o;
        o00Oo0<?, ?> o00oo02 = this.f64537OooO0O0;
        o00oo02.OooOOOO(t, o00oo02.OooOO0O(o00oo02.OooO0oO(t), o00oo02.OooO0oO(t2)));
        if (this.f64538OooO0OO) {
            C21838OoooooO.OooOO0O(this.f64539OooO0Oo, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final T newInstance() {
        InterfaceC21822OoooO0 interfaceC21822OoooO0 = this.f64536OooO00o;
        return interfaceC21822OoooO0 instanceof OooOo ? (T) ((OooOo) interfaceC21822OoooO0).OooOO0o() : (T) interfaceC21822OoooO0.newBuilderForType().OooO0Oo();
    }
}

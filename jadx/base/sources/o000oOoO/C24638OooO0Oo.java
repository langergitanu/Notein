package o000oOoO;

import Oooo0oO.AbstractC21048OooOooO;
import Oooo0oO.InterfaceC21103o000O0o0;
import Oooo0oO.o000000;
import OoooO00.InterfaceC21152OooO0Oo;
import OoooO0O.C21157OooO0Oo;
import OoooO0O.C21158OooO0o;
import OoooO0O.OooOo00;
import OoooOO0.C21175OooO0Oo;

/* JADX INFO: renamed from: o000oOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24638OooO0Oo extends C21157OooO0Oo<AbstractC21048OooOooO<Object>, InterfaceC21103o000O0o0<Object>> implements o000000 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C24638OooO0Oo f83457OooOoO = new C24638OooO0Oo(OooOo00.f61407OooO0o0, 0);

    /* JADX INFO: renamed from: o000oOoO.OooO0Oo$OooO00o */
    public static final class OooO00o extends C21158OooO0o<AbstractC21048OooOooO<Object>, InterfaceC21103o000O0o0<Object>> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public C24638OooO0Oo f83458OooOoo;

        @Override // OoooO0O.C21158OooO0o, OoooO00.InterfaceC21152OooO0Oo.OooO00o
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public final C24638OooO0Oo build() {
            Object obj = this.f61386OooOoO0;
            C24638OooO0Oo c24638OooO0Oo = this.f83458OooOoo;
            if (obj != c24638OooO0Oo.f61382OooOo0o) {
                this.f61383OooOo = new C21175OooO0Oo();
                c24638OooO0Oo = new C24638OooO0Oo(this.f61386OooOoO0, this.f61388OooOoo0);
            }
            this.f83458OooOoo = c24638OooO0Oo;
            return c24638OooO0Oo;
        }

        @Override // OoooO0O.C21158OooO0o, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC21048OooOooO) {
                return super.containsKey((AbstractC21048OooOooO) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof InterfaceC21103o000O0o0) {
                return super.containsValue((InterfaceC21103o000O0o0) obj);
            }
            return false;
        }

        @Override // OoooO0O.C21158OooO0o, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof AbstractC21048OooOooO) {
                return (InterfaceC21103o000O0o0) super.get((AbstractC21048OooOooO) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC21048OooOooO) ? obj2 : (InterfaceC21103o000O0o0) super.getOrDefault((AbstractC21048OooOooO) obj, (InterfaceC21103o000O0o0) obj2);
        }

        @Override // OoooO0O.C21158OooO0o, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof AbstractC21048OooOooO) {
                return (InterfaceC21103o000O0o0) super.remove((AbstractC21048OooOooO) obj);
            }
            return null;
        }
    }

    @Override // OoooO0O.C21157OooO0Oo
    /* JADX INFO: renamed from: OooO00o */
    public final C21158OooO0o<AbstractC21048OooOooO<Object>, InterfaceC21103o000O0o0<Object>> builder() {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.f83458OooOoo = this;
        return oooO00o;
    }

    @Override // OoooO0O.C21157OooO0Oo, OoooO00.InterfaceC21152OooO0Oo
    public final InterfaceC21152OooO0Oo.OooO00o<AbstractC21048OooOooO<Object>, InterfaceC21103o000O0o0<Object>> builder() {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.f83458OooOoo = this;
        return oooO00o;
    }

    @Override // OoooO0O.C21157OooO0Oo, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC21048OooOooO) {
            return super.containsKey((AbstractC21048OooOooO) obj);
        }
        return false;
    }

    @Override // oOo000Oo.AbstractC34423OooO0o0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC21103o000O0o0) {
            return super.containsValue((InterfaceC21103o000O0o0) obj);
        }
        return false;
    }

    @Override // OoooO0O.C21157OooO0Oo, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC21048OooOooO) {
            return (InterfaceC21103o000O0o0) super.get((AbstractC21048OooOooO) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC21048OooOooO) ? obj2 : (InterfaceC21103o000O0o0) super.getOrDefault((AbstractC21048OooOooO) obj, (InterfaceC21103o000O0o0) obj2);
    }

    @Override // OoooO0O.C21157OooO0Oo, OoooO00.InterfaceC21152OooO0Oo
    /* JADX INFO: renamed from: builder, reason: avoid collision after fix types in other method */
    public final InterfaceC21152OooO0Oo.OooO00o<AbstractC21048OooOooO<Object>, InterfaceC21103o000O0o0<Object>> builder2() {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.f83458OooOoo = this;
        return oooO00o;
    }
}

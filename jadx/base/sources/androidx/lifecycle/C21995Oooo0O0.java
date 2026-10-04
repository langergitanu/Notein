package androidx.lifecycle;

import OooOOO.OooO0O0;
import java.util.Iterator;
import java.util.Map;
import o000oo0.C24670OooOOo0;
import o00O0Ooo.C24893OooO;

/* JADX INFO: renamed from: androidx.lifecycle.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21995Oooo0O0<T> extends C21996Oooo0OO<T> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO.OooO0O0<Oooo0<?>, OooO00o<?>> f65593OooOO0o = new OooOOO.OooO0O0<>();

    /* JADX INFO: renamed from: androidx.lifecycle.Oooo0O0$OooO00o */
    public static class OooO00o<V> implements InterfaceC21998Oooo0o0<V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C24893OooO f65594OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24670OooOOo0 f65595OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f65596OooOoO0 = -1;

        public OooO00o(C24670OooOOo0 c24670OooOOo0, C24893OooO c24893OooO) {
            this.f65595OooOo0o = c24670OooOOo0;
            this.f65594OooOo = c24893OooO;
        }

        @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
        public final void OooO0O0(V v) {
            int i = this.f65596OooOoO0;
            int i2 = this.f65595OooOo0o.f65580OooO0oO;
            if (i != i2) {
                this.f65596OooOoO0 = i2;
                this.f65594OooOo.OooO0O0(v);
            }
        }
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO0o() {
        Iterator<Map.Entry<Oooo0<?>, OooO00o<?>>> it = this.f65593OooOO0o.iterator();
        while (true) {
            OooO0O0.OooO0o0 oooO0o0 = (OooO0O0.OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                return;
            }
            OooO00o oooO00o = (OooO00o) ((Map.Entry) oooO0o0.next()).getValue();
            oooO00o.f65595OooOo0o.OooO0o0(oooO00o);
        }
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO0oO() {
        Iterator<Map.Entry<Oooo0<?>, OooO00o<?>>> it = this.f65593OooOO0o.iterator();
        while (true) {
            OooO0O0.OooO0o0 oooO0o0 = (OooO0O0.OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                return;
            }
            OooO00o oooO00o = (OooO00o) ((Map.Entry) oooO0o0.next()).getValue();
            oooO00o.f65595OooOo0o.OooO(oooO00o);
        }
    }
}

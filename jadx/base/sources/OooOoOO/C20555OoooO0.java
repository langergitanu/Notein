package OooOoOO;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: OooOoOO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20555OoooO0<T> implements InterfaceC20540OooOoOO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f58723OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f58724OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final T f58725OooO0OO;

    public C20555OoooO0() {
        this(null, 7);
    }

    @Override // OooOoOO.InterfaceC20526OooOO0o
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final <V extends AbstractC20531OooOOo> o0ooOOo<V> OooO00o(InterfaceC20574Ooooooo<T, V> converter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
        T t = this.f58725OooO0OO;
        return new o0ooOOo<>(this.f58723OooO00o, this.f58724OooO0O0, t == null ? null : converter.OooO00o().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20555OoooO0) {
            C20555OoooO0 c20555OoooO0 = (C20555OoooO0) obj;
            if (c20555OoooO0.f58723OooO00o == this.f58723OooO00o && c20555OoooO0.f58724OooO0O0 == this.f58724OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(c20555OoooO0.f58725OooO0OO, this.f58725OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.f58725OooO0OO;
        return Float.hashCode(this.f58724OooO0O0) + C20509OooO0oo.OooO0OO(this.f58723OooO00o, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    public C20555OoooO0(float f, float f2, T t) {
        this.f58723OooO00o = f;
        this.f58724OooO0O0 = f2;
        this.f58725OooO0OO = t;
    }

    public /* synthetic */ C20555OoooO0(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }
}

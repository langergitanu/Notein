package oO0oO00;

import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Oo0<T> implements InterfaceC33911OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33911OooO0OO<T> f122265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000 f122266OooO0O0;

    public o00Oo0(InterfaceC33911OooO0OO<T> serializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        this.f122265OooO00o = serializer;
        this.f122266OooO0O0 = new o000000(serializer.getDescriptor());
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final T deserialize(oO0oO000.OooO0OO oooO0OO) {
        if (oooO0OO.OooOoo0()) {
            return (T) oooO0OO.OooOooo(this.f122265OooO00o);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o00Oo0.class == obj.getClass() && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122265OooO00o, ((o00Oo0) obj).f122265OooO00o);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122266OooO0O0;
    }

    public final int hashCode() {
        return this.f122265OooO00o.hashCode();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        if (t != null) {
            encoder.OooOOOo(this.f122265OooO00o, t);
        } else {
            encoder.OooOoO();
        }
    }
}

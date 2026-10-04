package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0<T, V extends AbstractC20531OooOOo> implements InterfaceC20574Ooooooo<T, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<T, V> f58815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f58816OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOo0(InterfaceC32507OooOO0o<? super T, ? extends V> convertToVector, InterfaceC32507OooOO0o<? super V, ? extends T> convertFromVector) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(convertToVector, "convertToVector");
        kotlin.jvm.internal.OooOOO0.OooO0oO(convertFromVector, "convertFromVector");
        this.f58815OooO00o = convertToVector;
        this.f58816OooO0O0 = (kotlin.jvm.internal.OooOOOO) convertFromVector;
    }

    @Override // OooOoOO.InterfaceC20574Ooooooo
    public final InterfaceC32507OooOO0o<T, V> OooO00o() {
        return this.f58815OooO00o;
    }

    @Override // OooOoOO.InterfaceC20574Ooooooo
    public final InterfaceC32507OooOO0o<V, T> OooO0O0() {
        return (InterfaceC32507OooOO0o<V, T>) this.f58816OooO0O0;
    }
}

package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32436OooO0o<T> implements InterfaceC32440OooOO0<T>, Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f116632OooOo0o;

    public C32436OooO0o(T t) {
        this.f116632OooOo0o = t;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final T getValue() {
        return this.f116632OooOo0o;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f116632OooOo0o);
    }
}

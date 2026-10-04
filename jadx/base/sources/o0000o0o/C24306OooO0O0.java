package o0000o0o;

import java.io.IOException;
import o0000o0O.C24249OooO0OO;
import o0000o0O.InterfaceC24250OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0000o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24306OooO0O0<T> implements InterfaceC24250OooO0Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<C24249OooO0OO, T> f81816OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public C24306OooO0O0(InterfaceC32507OooOO0o<? super C24249OooO0OO, ? extends T> interfaceC32507OooOO0o) {
        this.f81816OooO00o = interfaceC32507OooOO0o;
    }

    @Override // o0000o0O.InterfaceC24250OooO0Oo
    public final Object OooO00o(C24249OooO0OO c24249OooO0OO) throws IOException {
        return this.f81816OooO00o.invoke(c24249OooO0OO);
    }
}

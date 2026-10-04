package ooooOOo0;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import ooooOOo0.C35218OooOO0;

/* JADX INFO: renamed from: ooooOOo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35216OooO0oO implements InterfaceC35212OooO0OO<Object, InterfaceC35211OooO0O0<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Type f126437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Executor f126438OooO0O0;

    public C35216OooO0oO(Type type, Executor executor) {
        this.f126437OooO00o = type;
        this.f126438OooO0O0 = executor;
    }

    @Override // ooooOOo0.InterfaceC35212OooO0OO
    public final Type OooO00o() {
        return this.f126437OooO00o;
    }

    @Override // ooooOOo0.InterfaceC35212OooO0OO
    public final Object OooO0O0(C35225OooOOo c35225OooOOo) {
        Executor executor = this.f126438OooO0O0;
        return executor == null ? c35225OooOOo : new C35218OooOO0.OooO00o(executor, c35225OooOOo);
    }
}

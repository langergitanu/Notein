package o000oo;

import Oooo0oO.C21079o000000o;
import java.io.IOException;
import o000oo0o.InterfaceC24709OooO0O0;
import o000oooO.InterfaceC24757OooO0OO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o000oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24650OooO0O0 implements InterfaceC24709OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21079o000000o f83491OooOo0o;

    public C24650OooO0O0(C21079o000000o c21079o000000o) {
        this.f83491OooOo0o = c21079o000000o;
    }

    @Override // o000oo0o.InterfaceC24709OooO0O0
    public final Object OoooOoO(boolean z, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        InterfaceC24757OooO0OO interfaceC24757OooO0OO = (InterfaceC24757OooO0OO) this.f83491OooOo0o.f61054OooO00o;
        interfaceC24757OooO0OO.getDatabaseName();
        return interfaceC32508OooOOOo.invoke(new C24651OooO0OO(new C24649OooO00o(interfaceC24757OooO0OO.OooooOO())), abstractC32479OooO0OO);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((InterfaceC24757OooO0OO) this.f83491OooOo0o.f61054OooO00o).close();
    }
}

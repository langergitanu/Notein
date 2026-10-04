package Oooo0oO;

import kotlin.coroutines.Continuation;
import o0Oo00oO.C28035OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21076Oooooo0 implements o0000OO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33822OooO0OO f61045OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> f61046OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public oO0o0OO.o00000OO f61047OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public C21076Oooooo0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo) {
        this.f61046OooOo0o = interfaceC32508OooOOOo;
        this.f61045OooOo = C33633Oooo0.OooO00o(interfaceC34415OooO0oo);
    }

    @Override // Oooo0oO.o0000OO0
    public final void OooO0o0() {
        oO0o0OO.o00000OO o00000oo2 = this.f61047OooOoO0;
        if (o00000oo2 != null) {
            o00000oo2.cancel(C28035OooO00o.OooO00o("Old job was still running!", null));
        }
        this.f61047OooOoO0 = C33609OooO0oo.OooO0OO(this.f61045OooOo, null, null, this.f61046OooOo0o, 3);
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0OO() {
        oO0o0OO.o00000OO o00000oo2 = this.f61047OooOoO0;
        if (o00000oo2 != null) {
            o00000oo2.OooOo0O(new C21077OoooooO());
        }
        this.f61047OooOoO0 = null;
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0oO() {
        oO0o0OO.o00000OO o00000oo2 = this.f61047OooOoO0;
        if (o00000oo2 != null) {
            o00000oo2.OooOo0O(new C21077OoooooO());
        }
        this.f61047OooOoO0 = null;
    }
}

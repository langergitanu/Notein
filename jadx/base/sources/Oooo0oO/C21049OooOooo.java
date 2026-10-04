package Oooo0oO;

import java.util.Arrays;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0oO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21049OooOooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f60991OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0<?>[] f60992OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f60993OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21049OooOooo(o00000O0[] o00000o0Arr, C24633OooO00o c24633OooO00o, int i) {
        super(2);
        this.f60992OooOo0o = o00000o0Arr;
        this.f60991OooOo = c24633OooO00o;
        this.f60993OooOoO0 = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        num.intValue();
        o00000O0<?>[] o00000o0Arr = this.f60992OooOo0o;
        o00000O0[] o00000o0Arr2 = (o00000O0[]) Arrays.copyOf(o00000o0Arr, o00000o0Arr.length);
        int iOooO0oo = C21081o00000o0.OooO0oo(this.f60993OooOoO0 | 1);
        C21051Oooo000.OooO00o(o00000o0Arr2, this.f60991OooOo, interfaceC21033OooOOOO, iOooO0oo);
        return C32460OooOooO.f116667OooO00o;
    }
}

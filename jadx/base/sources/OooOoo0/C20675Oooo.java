package OooOoo0;

import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.C21060OoooO;
import Oooo0oO.C21074OooooOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: OooOoo0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20675Oooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59341OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59342OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f59343OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20675Oooo(int i, Object obj, Object obj2) {
        super(1);
        this.f59342OooOo0o = i;
        this.f59341OooOo = obj;
        this.f59343OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f59342OooOo0o) {
            case 0:
                C21060OoooO DisposableEffect = (C21060OoooO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(DisposableEffect, "$this$DisposableEffect");
                return new C20683Oooo0oo((Oooo0oO.o00oO0O) this.f59341OooOo, (InterfaceC20736OooOOO0) this.f59343OooOoO0);
            default:
                C21074OooooOo c21074OooooOo = (C21074OooooOo) this.f59341OooOo;
                Object obj2 = c21074OooooOo.f61040OooO00o;
                C33614OooOOO0 c33614OooOOO0 = (C33614OooOOO0) this.f59343OooOoO0;
                synchronized (obj2) {
                    c21074OooooOo.f61041OooO0O0.remove(c33614OooOOO0);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}

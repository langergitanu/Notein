package Oooo0;

import Oooo0O0.C20935Oooo00o;
import o00000.InterfaceC24054OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: Oooo0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20837Oooo0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC34635OooOOOO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f59920OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59921OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59922OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f59923OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59924OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20837Oooo0OO(o000O0 o000o0, C20935Oooo00o c20935Oooo00o, InterfaceC24054OooOo0 interfaceC24054OooOo0, o00000.Oooo0 oooo0, boolean z) {
        super(1);
        this.f59921OooOo0o = o000o0;
        this.f59920OooOo = z;
        this.f59923OooOoO0 = c20935Oooo00o;
        this.f59922OooOoO = oooo0;
        this.f59924OooOoOO = interfaceC24054OooOo0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        InterfaceC34635OooOOOO it = interfaceC34635OooOOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        o000O0 o000o0 = this.f59921OooOo0o;
        o000o0.f60107OooO0oO = it;
        if (this.f59920OooOo) {
            EnumC20854OooooO0 enumC20854OooooO0OooO00o = o000o0.OooO00o();
            EnumC20854OooooO0 enumC20854OooooO0 = EnumC20854OooooO0.f59963OooOo;
            C20935Oooo00o c20935Oooo00o = this.f59923OooOoO0;
            if (enumC20854OooooO0OooO00o == enumC20854OooooO0) {
                if (o000o0.f60110OooOO0O) {
                    c20935Oooo00o.OooOO0o();
                } else {
                    c20935Oooo00o.OooO();
                }
                o000o0.f60111OooOO0o.setValue(Boolean.valueOf(Oooo0O0.Oooo0.OooO0O0(c20935Oooo00o, true)));
                o000o0.f60113OooOOO0.setValue(Boolean.valueOf(Oooo0O0.Oooo0.OooO0O0(c20935Oooo00o, false)));
            } else if (o000o0.OooO00o() == EnumC20854OooooO0.f59966OooOoO0) {
                o000o0.f60112OooOOO.setValue(Boolean.valueOf(Oooo0O0.Oooo0.OooO0O0(c20935Oooo00o, true)));
            }
            C20849OoooOo0.OooO0o0(o000o0, this.f59922OooOoO, this.f59924OooOoOO);
        }
        o000O0Oo o000o0ooOooO0OO = o000o0.OooO0OO();
        if (o000o0ooOooO0OO != null) {
            o000o0ooOooO0OO.f60145OooO0O0 = it;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

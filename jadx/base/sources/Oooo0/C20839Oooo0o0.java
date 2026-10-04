package Oooo0;

import Oooo0.o000O0;
import Oooo0O0.C20935Oooo00o;
import Ooooo0o.C21271OooOOoo;
import Ooooo0o.C21274OooOo00;
import OooooO0.C21290OooO0o0;
import o00000.C24048OooO0oo;
import o00000.C24073OoooO;
import o00000.InterfaceC24054OooOo0;
import o00o00Oo.C25256OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20839Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21290OooO0o0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21274OooOo00 f59927OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59928OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59929OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o f59930OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20839Oooo0o0(o000O0 o000o0, C21274OooOo00 c21274OooOo00, C20935Oooo00o c20935Oooo00o, InterfaceC24054OooOo0 interfaceC24054OooOo0) {
        super(1);
        this.f59928OooOo0o = o000o0;
        this.f59927OooOo = c21274OooOo00;
        this.f59930OooOoO0 = c20935Oooo00o;
        this.f59929OooOoO = interfaceC24054OooOo0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(C21290OooO0o0 c21290OooO0o0) {
        long j = c21290OooO0o0.f61722OooO00o;
        C21274OooOo00 c21274OooOo00 = this.f59927OooOo;
        o000O0 o000o0 = this.f59928OooOo0o;
        if (o000o0.OooO0O0()) {
            C24073OoooO c24073OoooO = o000o0.f60104OooO0Oo;
            if (c24073OoooO != null && c24073OoooO.OooO00o()) {
                c24073OoooO.f81119OooO0O0.OooO0o();
            }
        } else {
            c21274OooOo00.OooO00o(C21271OooOOoo.f61677OooOo0o);
        }
        if (o000o0.OooO0O0()) {
            if (o000o0.OooO00o() != EnumC20854OooooO0.f59963OooOo) {
                o000O0Oo o000o0ooOooO0OO = o000o0.OooO0OO();
                if (o000o0ooOooO0OO != null) {
                    C24048OooO0oo editProcessor = o000o0.f60103OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(editProcessor, "editProcessor");
                    InterfaceC24054OooOo0 interfaceC24054OooOo0 = this.f59929OooOoO;
                    o000O0.OooO0O0 onValueChange = o000o0.f60116OooOOo;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(onValueChange, "onValueChange");
                    int iOooO00o = interfaceC24054OooOo0.OooO00o(o000o0ooOooO0OO.OooO0O0(j, true));
                    onValueChange.invoke(o00000.Oooo0.OooO00o(editProcessor.f81040OooO00o, null, C25256OooO00o.OooO0OO(iOooO00o, iOooO00o), 5));
                    if (o000o0.f60101OooO00o.f60009OooO00o.f124887OooOo0o.length() > 0) {
                        o000o0.f60109OooOO0.setValue(EnumC20854OooooO0.f59966OooOoO0);
                    }
                }
            } else {
                this.f59930OooOoO0.OooO0o0(new C21290OooO0o0(j));
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

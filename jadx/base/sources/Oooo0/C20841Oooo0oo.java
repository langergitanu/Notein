package Oooo0;

import Oooo0.o000O0;
import java.util.List;
import o00000.C24048OooO0oo;
import o00000.C24073OoooO;
import o00o00Oo.C25256OooO00o;
import o0Oo0oo.InterfaceC28404OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: Oooo0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20841Oooo0oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C34680OooO0O0, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28404OooOoO0 f59933OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59934OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20841Oooo0oo(o000O0 o000o0, InterfaceC28404OooOoO0 interfaceC28404OooOoO0) {
        super(1);
        this.f59934OooOo0o = o000o0;
        this.f59933OooOo = interfaceC28404OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(C34680OooO0O0 c34680OooO0O0) {
        C34680OooO0O0 text = c34680OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        o000O0 o000o0 = this.f59934OooOo0o;
        C24073OoooO c24073OoooO = o000o0.f60104OooO0Oo;
        o000O0.OooO0O0 onValueChange = o000o0.f60116OooOOo;
        C32460OooOooO c32460OooOooO = null;
        if (c24073OoooO != null) {
            List<? extends o00000.OooO0o> listOooOO0o = C34429OooOOo0.OooOO0o(new o00000.OooO0OO(), new o00000.OooO0O0(text, 1));
            C24048OooO0oo editProcessor = o000o0.f60103OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(editProcessor, "editProcessor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(onValueChange, "onValueChange");
            o00000.Oooo0 oooo0OooO00o = editProcessor.OooO00o(listOooOO0o);
            c24073OoooO.OooO0O0(null, oooo0OooO00o);
            onValueChange.invoke(oooo0OooO00o);
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        if (c32460OooOooO == null) {
            String str = text.f124887OooOo0o;
            int length = str.length();
            onValueChange.invoke(new o00000.Oooo0(str, C25256OooO00o.OooO0OO(length, length), 4));
        }
        return Boolean.TRUE;
    }
}

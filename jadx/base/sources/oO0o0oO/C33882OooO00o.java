package oO0o0oO;

import java.util.Map;
import oO0o0OO.InterfaceC33665o00000o0;
import oOO00OOo.C34355OooO0o0;
import oOo0000O.AbstractC34408OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import ooooOoOo.InterfaceC35245OooO00o;

/* JADX INFO: renamed from: oO0o0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33882OooO00o extends AbstractC34408OooO00o implements InterfaceC33665o00000o0<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C20340OooO00o f122058OooOoO0 = new C20340OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Map<String, String> f122059OooOo;

    /* JADX INFO: renamed from: oO0o0oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20340OooO00o implements InterfaceC34415OooO0oo.OooO0OO<C33882OooO00o> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33882OooO00o() {
        super(f122058OooOoO0);
        InterfaceC35245OooO00o interfaceC35245OooO00o = C34355OooO0o0.f123316OooO00o;
        if (interfaceC35245OooO00o == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map<String, String> mapOooO00o = interfaceC35245OooO00o.OooO00o();
        this.f122059OooOo = mapOooO00o;
    }

    public static void o0OoO0o(Map map) {
        if (map == null) {
            InterfaceC35245OooO00o interfaceC35245OooO00o = C34355OooO0o0.f123316OooO00o;
            if (interfaceC35245OooO00o == null) {
                throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            interfaceC35245OooO00o.clear();
            return;
        }
        InterfaceC35245OooO00o interfaceC35245OooO00o2 = C34355OooO0o0.f123316OooO00o;
        if (interfaceC35245OooO00o2 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        interfaceC35245OooO00o2.OooO0O0(map);
    }

    @Override // oO0o0OO.InterfaceC33665o00000o0
    public final void Oooo0OO(Object obj) {
        o0OoO0o((Map) obj);
    }

    @Override // oO0o0OO.InterfaceC33665o00000o0
    public final Map<String, ? extends String> o00Oo0(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC35245OooO00o interfaceC35245OooO00o = C34355OooO0o0.f123316OooO00o;
        if (interfaceC35245OooO00o == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map<String, String> mapOooO00o = interfaceC35245OooO00o.OooO00o();
        o0OoO0o(this.f122059OooOo);
        return mapOooO00o;
    }
}

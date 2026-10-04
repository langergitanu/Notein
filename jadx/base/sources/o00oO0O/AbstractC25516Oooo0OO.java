package o00oO0O;

import o0000Ooo.C24226OooO;
import o00oO0O.C25511OooOooo;
import oo000o.AbstractC34622OooO00o;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34635OooOOOO;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: o00oO0O.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25516Oooo0OO extends AbstractC34655Oooo0o implements InterfaceC34643OooOoO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f87023OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f87024OooOoo0;

    public static void o0000(AbstractC25521OoooO abstractC25521OoooO) {
        C25509OooOoo0 c25509OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC25521OoooO, "<this>");
        AbstractC25521OoooO abstractC25521OoooO2 = abstractC25521OoooO.f87052OooOooO;
        C25503OooOoOO c25503OooOoOO = abstractC25521OoooO2 != null ? abstractC25521OoooO2.f87051OooOoo : null;
        C25503OooOoOO c25503OooOoOO2 = abstractC25521OoooO.f87051OooOoo;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c25503OooOoOO, c25503OooOoOO2)) {
            c25503OooOoOO2.f86962OoooOOO.f86993OooO0oo.f87004Oooo00o.OooO0oO();
            return;
        }
        InterfaceC25484OooO0O0 interfaceC25484OooO0O0OooOo0o = c25503OooOoOO2.f86962OoooOOO.f86993OooO0oo.OooOo0o();
        if (interfaceC25484OooO0O0OooOo0o == null || (c25509OooOoo0 = ((C25511OooOooo.OooO0O0) interfaceC25484OooO0O0OooOo0o).f87004Oooo00o) == null) {
            return;
        }
        c25509OooOoo0.OooO0oO();
    }

    public abstract int o00000(AbstractC34622OooO00o abstractC34622OooO00o);

    public abstract AbstractC25516Oooo0OO o00000O();

    public final int o00000O0(AbstractC34622OooO00o alignmentLine) {
        int iO00000;
        kotlin.jvm.internal.OooOOO0.OooO0oO(alignmentLine, "alignmentLine");
        if (!o00000Oo() || (iO00000 = o00000(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long jO0ooOO0 = o0ooOO0();
        int i = C24226OooO.f81469OooO0OO;
        return iO00000 + ((int) (jO0ooOO0 & 4294967295L));
    }

    public abstract InterfaceC34635OooOOOO o00000OO();

    public abstract boolean o00000Oo();

    public abstract C25503OooOoOO o00000o0();

    public abstract AbstractC25516Oooo0OO o00000oO();

    public abstract long o00000oo();

    public abstract void o0000O00();

    public abstract oo000o.OooOo o0000Ooo();
}

package o0ooO0o0;

import java.io.IOException;
import java.util.HashMap;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0ooO0o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31474OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C31474OooOO0o f112596OooO0O0 = new C31474OooOO0o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f112597OooO00o;

    public C31474OooOO0o() {
        HashMap map = new HashMap();
        this.f112597OooO00o = map;
        C31476OooOOO0 c31476OooOOO0 = new C31476OooOOO0();
        C31463OooO c31463OooO = new C31463OooO();
        C31470OooO0oO c31470OooO0oO = new C31470OooO0oO();
        C31478OooOOOo c31478OooOOOo = new C31478OooOOOo();
        C31467OooO0Oo c31467OooO0Oo = new C31467OooO0Oo();
        C31464OooO00o c31464OooO00o = new C31464OooO00o();
        C31481OooOOoo c31481OooOOoo = new C31481OooOOoo();
        C31471OooO0oo c31471OooO0oo = new C31471OooO0oo();
        C31477OooOOOO c31477OooOOOO = new C31477OooOOOO();
        map.put(C31441OooOO0.f112301o0000o0O, c31476OooOOO0);
        map.put(C31441OooOO0.f112302o0000o0o, c31476OooOOO0);
        map.put(C31441OooOO0.f112444o0Oo0oo, c31463OooO);
        map.put(C31441OooOO0.f112442o0OO00O, c31463OooO);
        map.put(C31441OooOO0.f112267Ooooo0o, c31470OooO0oO);
        map.put(C31441OooOO0.f112268OooooO0, c31470OooO0oO);
        map.put(C31441OooOO0.f112344o000o00O, c31478OooOOOo);
        map.put(C31441OooOO0.f112345o000o00o, c31478OooOOOo);
        map.put(C31441OooOO0.f112253Oooo0o0, c31467OooO0Oo);
        map.put(C31441OooOO0.f112252Oooo0o, c31467OooO0Oo);
        map.put(C31441OooOO0.f112254Oooo0oO, c31464OooO00o);
        map.put(C31441OooOO0.f112255Oooo0oo, c31464OooO00o);
        map.put(C31441OooOO0.f112394o00O0o00, c31481OooOOoo);
        map.put(C31441OooOO0.f112437o00oOOo, c31481OooOOoo);
        map.put(C31441OooOO0.f112449o0ooOOo, c31471OooO0oo);
        map.put(C31441OooOO0.f112332o000Oo00, c31477OooOOOO);
    }

    public final AbstractC31473OooOO0O OooO00o(C31441OooOO0 c31441OooOO0) throws IOException {
        AbstractC31473OooOO0O abstractC31473OooOO0O = (AbstractC31473OooOO0O) this.f112597OooO00o.get(c31441OooOO0);
        if (abstractC31473OooOO0O != null) {
            return abstractC31473OooOO0O;
        }
        throw new IOException("Invalid filter: " + c31441OooOO0);
    }
}

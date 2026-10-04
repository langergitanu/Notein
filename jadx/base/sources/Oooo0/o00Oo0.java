package Oooo0;

import OooooO0.C21292OooO0oo;
import android.view.KeyEvent;
import kotlin.jvm.internal.C24028OooOoO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f60216OooO00o;

    public /* synthetic */ class OooO00o extends C24028OooOoO0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f60217OooOo0o = new OooO00o(o00O0O.OooO0OO.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

        @Override // kotlin.jvm.internal.C24028OooOoO0, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return Boolean.valueOf(((o00O0O.OooO0O0) obj).f84203OooO00o.isCtrlPressed());
        }
    }

    public static final class OooO0O0 implements InterfaceC20894ooOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O0O f60218OooO00o;

        public OooO0O0(o00O0O o00o0o2) {
            this.f60218OooO00o = o00o0o2;
        }

        @Override // Oooo0.InterfaceC20894ooOO
        public final int OooO00o(KeyEvent keyEvent) {
            int i = 0;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jOooO0OO = C21292OooO0oo.OooO0OO(keyEvent.getKeyCode());
                if (o00O0O.OooO00o.OooO00o(jOooO0OO, o000OOo.f60171OooO)) {
                    i = 35;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o000OOo.f60180OooOO0)) {
                    i = 36;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o000OOo.f60181OooOO0O)) {
                    i = 38;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o000OOo.f60182OooOO0o)) {
                    i = 37;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jOooO0OO2 = C21292OooO0oo.OooO0OO(keyEvent.getKeyCode());
                if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60171OooO)) {
                    i = 4;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60180OooOO0)) {
                    i = 3;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60181OooOO0O)) {
                    i = 6;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60182OooOO0o)) {
                    i = 5;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60174OooO0OO)) {
                    i = 20;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60192OooOo00)) {
                    i = 23;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60189OooOOoo)) {
                    i = 22;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO2, o000OOo.f60179OooO0oo)) {
                    i = 43;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jOooO0OO3 = C21292OooO0oo.OooO0OO(keyEvent.getKeyCode());
                if (o00O0O.OooO00o.OooO00o(jOooO0OO3, o000OOo.f60185OooOOOO)) {
                    i = 33;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO3, o000OOo.f60186OooOOOo)) {
                    i = 34;
                }
            } else if (keyEvent.isAltPressed()) {
                long jOooO0OO4 = C21292OooO0oo.OooO0OO(keyEvent.getKeyCode());
                if (o00O0O.OooO00o.OooO00o(jOooO0OO4, o000OOo.f60189OooOOoo)) {
                    i = 24;
                } else if (o00O0O.OooO00o.OooO00o(jOooO0OO4, o000OOo.f60192OooOo00)) {
                    i = 25;
                }
            }
            return i == 0 ? this.f60218OooO00o.OooO00o(keyEvent) : i;
        }
    }

    static {
        OooO00o shortcutModifier = OooO00o.f60217OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(shortcutModifier, "shortcutModifier");
        f60216OooO00o = new OooO0O0(new o00O0O(shortcutModifier));
    }
}

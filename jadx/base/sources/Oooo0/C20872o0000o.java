package Oooo0;

import Oooo0O0.C20932OooOooo;
import Oooo0O0.C20943Oooo0oO;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24030OooOoo;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20872o0000o extends C24019OooOO0o implements InterfaceC32507OooOO0o<o00O0O.OooO0O0, Boolean> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(o00O0O.OooO0O0 oooO0O0) {
        o00000.OooO0O0 oooO0O02;
        int iOooO00o;
        Integer numValueOf;
        KeyEvent keyEvent = oooO0O0.f84203OooO00o;
        C20875o0000o0o c20875o0000o0o = (C20875o0000o0o) this.receiver;
        c20875o0000o0o.getClass();
        boolean z = true;
        if (keyEvent.getAction() != 0 || keyEvent.getUnicodeChar() == 0) {
            oooO0O02 = null;
        } else {
            C20851OoooOoo c20851OoooOoo = c20875o0000o0o.f60044OooO;
            c20851OoooOoo.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                c20851OoooOoo.f59957OooO00o = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = c20851OoooOoo.f59957OooO00o;
                if (num != null) {
                    c20851OoooOoo.f59957OooO00o = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    numValueOf = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(unicodeChar);
                    }
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                StringBuilder appendCodePointX = new StringBuilder().appendCodePoint(numValueOf.intValue());
                kotlin.jvm.internal.OooOOO0.OooO0o(appendCodePointX, "appendCodePointX");
                String string = appendCodePointX.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().appendCo…ntX(codePoint).toString()");
                oooO0O02 = new o00000.OooO0O0(string, 1);
            }
        }
        C20943Oooo0oO c20943Oooo0oO = c20875o0000o0o.f60049OooO0o;
        boolean z2 = c20875o0000o0o.f60048OooO0Oo;
        if (oooO0O02 != null) {
            if (z2) {
                c20875o0000o0o.OooO00o(com.facebook.soloader.OooOo.OooO0oO(oooO0O02));
                c20943Oooo0oO.f60432OooO00o = null;
            } else {
                z = false;
            }
        } else if (o00O0O.OooO0OO.OooO00o(keyEvent) == 2 && (iOooO00o = c20875o0000o0o.f60053OooOO0.OooO00o(keyEvent)) != 0) {
            boolean z3 = true;
            switch (iOooO00o) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    z3 = false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    if (!z3 || z2) {
                        C24030OooOoo c24030OooOoo = new C24030OooOoo();
                        c24030OooOoo.f80938OooOo0o = true;
                        C20874o0000o0O c20874o0000o0O = new C20874o0000o0O(iOooO00o, c20875o0000o0o, c24030OooOoo);
                        o000O0Oo o000o0ooOooO0OO = c20875o0000o0o.f60045OooO00o.OooO0OO();
                        o00000.Oooo0 oooo0 = c20875o0000o0o.f60047OooO0OO;
                        C20932OooOooo c20932OooOooo = new C20932OooOooo(oooo0, c20875o0000o0o.f60051OooO0oO, o000o0ooOooO0OO, c20943Oooo0oO);
                        c20874o0000o0O.invoke(c20932OooOooo);
                        if (!C34696OooOOoo.OooO00o(c20932OooOooo.f60304OooO0o, oooo0.f81084OooO0O0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(c20932OooOooo.f60306OooO0oO, oooo0.f81083OooO00o)) {
                            c20875o0000o0o.f60054OooOO0O.invoke(o00000.Oooo0.OooO00o(oooo0, c20932OooOooo.f60306OooO0oO, c20932OooOooo.f60304OooO0o, 4));
                        }
                        o000O0O0 o000o0o02 = c20875o0000o0o.f60052OooO0oo;
                        if (o000o0o02 != null) {
                            o000o0o02.f60140OooO0o = true;
                        }
                        z = c24030OooOoo.f80938OooOo0o;
                        break;
                    }
                    break;
                default:
                    throw null;
            }
        }
        return Boolean.valueOf(z);
    }
}

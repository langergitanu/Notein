package Ooooo0o;

import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.C34625OooO0Oo;
import oo000o.InterfaceC34624OooO0OO;

/* JADX INFO: renamed from: Ooooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21254OooO00o {
    public static final <T> T OooO00o(FocusTargetModifierNode searchBeyondBounds, int i, InterfaceC32507OooOO0o<? super InterfaceC34624OooO0OO.OooO00o, ? extends T> interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(searchBeyondBounds, "$this$searchBeyondBounds");
        InterfaceC34624OooO0OO interfaceC34624OooO0OO = (InterfaceC34624OooO0OO) searchBeyondBounds.OooO00o(C34625OooO0Oo.f124805OooO00o);
        if (interfaceC34624OooO0OO == null) {
            return null;
        }
        if (i == 5 || i == 6 || i == 3 || i == 4 || i == 1 || i == 2) {
            return (T) interfaceC34624OooO0OO.OooO00o();
        }
        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
    }
}

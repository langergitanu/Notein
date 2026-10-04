package Oooo0O0;

import Oooo0.o000000;
import kotlin.jvm.internal.C24019OooOO0o;
import o00o00Oo.C25256OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0O0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20919OooOOOo extends C24019OooOO0o implements InterfaceC32507OooOO0o<Integer, C34696OooOOoo> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C34696OooOOoo invoke(Integer num) {
        int iIntValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.receiver;
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        int i = iIntValue - 1;
        while (true) {
            if (i <= 0) {
                i = 0;
                break;
            }
            if (charSequence.charAt(i - 1) == '\n') {
                break;
            }
            i--;
        }
        return new C34696OooOOoo(C25256OooO00o.OooO0OO(i, o000000.OooO0OO(iIntValue, charSequence)));
    }
}

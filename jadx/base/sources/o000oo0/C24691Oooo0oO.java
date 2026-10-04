package o000oo0;

import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooOO.C32463OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o000oo0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24691Oooo0oO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83662OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f83662OooOo0o) {
            case 0:
                InterfaceC24749OooO0Oo statement = (InterfaceC24749OooO0Oo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(statement, "statement");
                C32463OooO c32463OooO = new C32463OooO();
                while (statement.o00oO0o()) {
                    c32463OooO.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return C34449Oooo0oo.OooO0Oo(c32463OooO);
            default:
                String string = ((StackTraceElement) obj).toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                return string;
        }
    }
}

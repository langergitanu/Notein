package oO00O0o0;

import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO00O0o0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32205Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C32443OooOOO<? extends String, ? extends String>, CharSequence> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32205Oooo0O0 f115587OooOo0o = new C32205Oooo0O0(1);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final CharSequence invoke(C32443OooOOO<? extends String, ? extends String> c32443OooOOO) {
        C32443OooOOO<? extends String, ? extends String> it = c32443OooOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        String str = (String) it.f116638OooOo0o;
        B b = it.f116637OooOo;
        if (b == 0) {
            return str;
        }
        return str + '=' + String.valueOf(b);
    }
}

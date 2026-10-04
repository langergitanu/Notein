package oO0Ooo0o;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO0Ooo0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33437OooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f120875OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33432OooO0Oo f120876OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33437OooOO0(C33432OooO0Oo c33432OooO0Oo, StringBuilder sb) {
        super(1);
        this.f120876OooOo0o = c33432OooO0Oo;
        this.f120875OooOo = sb;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        String string = this.f120875OooOo.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "requestLog.toString()");
        C33432OooO0Oo c33432OooO0Oo = this.f120876OooOo0o;
        String string2 = C33599OooOo0O.Oooooo0(string).toString();
        StringBuilder sb = c33432OooO0Oo.f120856OooO0O0;
        sb.append(string2);
        sb.append('\n');
        c33432OooO0Oo.OooO00o();
        return C32460OooOooO.f116667OooO00o;
    }
}

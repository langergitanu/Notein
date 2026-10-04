package Oooo0;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<List<C34695OooOOo0>, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20861o000000o f59985OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(C20861o000000o c20861o000000o) {
        super(1);
        this.f59985OooOo0o = c20861o000000o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(List<C34695OooOOo0> list) {
        boolean z;
        List<C34695OooOOo0> it = list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C34695OooOOo0 c34695OooOOo0 = this.f59985OooOo0o.f59987OooOo0o.f60167OooO0o0;
        if (c34695OooOOo0 != null) {
            it.add(c34695OooOOo0);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

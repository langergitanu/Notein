package oO0Ooo;

import java.util.Collection;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33292OooO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC33342OoooOo0, Iterable<? extends AbstractC33320OooOoo>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC33300OooO0oo f120519OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33292OooO(AbstractC33300OooO0oo abstractC33300OooO0oo) {
        super(1);
        this.f120519OooOo0o = abstractC33300OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Iterable<? extends AbstractC33320OooOoo> invoke(InterfaceC33342OoooOo0 interfaceC33342OoooOo0) {
        Collection<AbstractC33320OooOoo> supertypes;
        InterfaceC33342OoooOo0 it = interfaceC33342OoooOo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        this.f120519OooOo0o.getClass();
        AbstractC33300OooO0oo abstractC33300OooO0oo = it instanceof AbstractC33300OooO0oo ? (AbstractC33300OooO0oo) it : null;
        if (abstractC33300OooO0oo != null) {
            supertypes = oOo000Oo.OooOo.OooooOO(abstractC33300OooO0oo.f120532OooO0O0.invoke().f120533OooO00o, abstractC33300OooO0oo.OooO());
        } else {
            supertypes = it.OooO0Oo();
            kotlin.jvm.internal.OooOOO0.OooO0o(supertypes, "supertypes");
        }
        return supertypes;
    }
}

package androidx.lifecycle;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OOO.AbstractC33687OooO0oO;

/* JADX INFO: renamed from: androidx.lifecycle.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22025o0ooOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC21979OooOOo0 f65702OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC33687OooO0oO f65703OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f65704OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22025o0ooOoO(AbstractC33687OooO0oO abstractC33687OooO0oO, AbstractC21979OooOOo0 abstractC21979OooOOo0, o0OOO0o o0ooo0o2) {
        super(1);
        this.f65703OooOo0o = abstractC33687OooO0oO;
        this.f65702OooOo = abstractC21979OooOOo0;
        this.f65704OooOoO0 = o0ooo0o2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = this.f65703OooOo0o;
        boolean zO000OOO = abstractC33687OooO0oO.o000OOO(oooO);
        o0OOO0o o0ooo0o2 = this.f65704OooOoO0;
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65702OooOo;
        if (zO000OOO) {
            abstractC33687OooO0oO.o0OoO0o(oooO, new o0ooOOo(0, abstractC21979OooOOo0, o0ooo0o2));
        } else {
            abstractC21979OooOOo0.OooO0OO(o0ooo0o2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

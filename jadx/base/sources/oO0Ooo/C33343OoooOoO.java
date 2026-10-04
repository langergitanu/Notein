package oO0Ooo;

import java.util.Map;

/* JADX INFO: renamed from: oO0Ooo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33343OoooOoO extends AbstractC33344OoooOoo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Map<InterfaceC33342OoooOo0, InterfaceC33348OooooOO> f120612OooO0OO;

    public C33343OoooOoO(Map map) {
        this.f120612OooO0OO = map;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO00o() {
        return false;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO0o0() {
        return this.f120612OooO0OO.isEmpty();
    }

    @Override // oO0Ooo.AbstractC33344OoooOoo
    public final InterfaceC33348OooooOO OooO0oO(InterfaceC33342OoooOo0 key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return this.f120612OooO0OO.get(key);
    }
}

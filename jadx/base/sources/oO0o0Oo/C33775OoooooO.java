package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO0o0OO.C33614OooOOO0;
import oO0o0OoO.AbstractC33791OooO0O0;
import oO0o0OoO.AbstractC33793OooO0Oo;

/* JADX INFO: renamed from: oO0o0Oo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33775OoooooO extends AbstractC33793OooO0Oo<C33772OooooOo<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f121769OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C33614OooOOO0 f121770OooO0O0;

    @Override // oO0o0OoO.AbstractC33793OooO0Oo
    public final boolean OooO00o(AbstractC33791OooO0O0 abstractC33791OooO0O0) {
        C33772OooooOo c33772OooooOo = (C33772OooooOo) abstractC33791OooO0O0;
        if (this.f121769OooO00o >= 0) {
            return false;
        }
        long j = c33772OooooOo.f121753OooOooo;
        if (j < c33772OooooOo.f121754Oooo000) {
            c33772OooooOo.f121754Oooo000 = j;
        }
        this.f121769OooO00o = j;
        return true;
    }

    @Override // oO0o0OoO.AbstractC33793OooO0Oo
    public final Continuation[] OooO0O0(AbstractC33791OooO0O0 abstractC33791OooO0O0) {
        long j = this.f121769OooO00o;
        this.f121769OooO00o = -1L;
        this.f121770OooO0O0 = null;
        return ((C33772OooooOo) abstractC33791OooO0O0).OooOo0(j);
    }
}

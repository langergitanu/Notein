package o0OO00o0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LatestOpenedNoteRepoImpl", m80623f = "LatestOpenedNoteRepoImpl.kt", m80624l = {33}, m80625m = "getLatestOpenedNotesSync")
public final class o00OO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91799OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00OO0O f91800OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f91801OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00OO0O f91802OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o00OO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f91802OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f91799OooOo = obj;
        this.f91801OooOoO |= Integer.MIN_VALUE;
        return this.f91802OooOoO0.OooO0Oo(this);
    }
}

package o000oo0;

import o000oo0O.C24703OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o000oo0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker", m80623f = "InvalidationTracker.kt", m80624l = {412}, m80625m = "notifyInvalidation")
public final class C24693OoooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24703OooO00o f83663OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24695OoooO00 f83664OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83665OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f83666OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f83667OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24693OoooO(C24695OoooO00 c24695OoooO00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83665OooOoO = c24695OoooO00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83666OooOoO0 = obj;
        this.f83667OooOoOO |= Integer.MIN_VALUE;
        return C24695OoooO00.OooO0O0(this.f83665OooOoO, this);
    }
}

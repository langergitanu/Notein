package o000oo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o000oo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.ObservedTableVersions", m80623f = "InvalidationTracker.kt", m80624l = {602}, m80625m = "collect")
public final class C24667OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24666OooOOO f83560OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f83561OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f83562OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24667OooOOO0(C24666OooOOO c24666OooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f83560OooOo = c24666OooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f83561OooOo0o = obj;
        this.f83562OooOoO0 |= Integer.MIN_VALUE;
        this.f83560OooOo.OooO00o(null, this);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}

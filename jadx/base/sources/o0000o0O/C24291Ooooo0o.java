package o0000o0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0000o0O.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.MultiProcessCoordinator", m80623f = "MultiProcessCoordinator.android.kt", m80624l = {211, 47, 48}, m80625m = "lock")
public final class C24291Ooooo0o<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f81747OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81748OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f81749OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f81750OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24287OoooOo0 f81751OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f81752OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24291Ooooo0o(C24287OoooOo0 c24287OoooOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81751OooOoOO = c24287OoooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81749OooOoO = obj;
        this.f81752OooOoo0 |= Integer.MIN_VALUE;
        return this.f81751OooOoOO.OooO0Oo(null, this);
    }
}

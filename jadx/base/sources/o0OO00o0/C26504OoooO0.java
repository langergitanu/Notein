package o0OO00o0;

import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO00o0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRepoImpl", m80623f = "DualLinkRepoImpl.kt", m80624l = {177, 178}, m80625m = "deleteDualLinkRefByPageIdSync")
public final class C26504OoooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f91101OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26515OooooO0 f91102OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26515OooooO0 f91103OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91104OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f91105OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26504OoooO0(C26515OooooO0 c26515OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f91103OooOoO = c26515OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f91104OooOoO0 = obj;
        this.f91105OooOoOO |= Integer.MIN_VALUE;
        return this.f91103OooOoO.OooO0Oo(null, null, this);
    }
}

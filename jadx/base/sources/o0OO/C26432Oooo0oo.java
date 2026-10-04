package o0OO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoLocalDBDataSource", m80623f = "PenInfoLocalDBDataSource.kt", m80624l = {23}, m80625m = "getPenInfoListByNoteIdSync")
public final class C26432Oooo0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26424Oooo f90777OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f90778OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26424Oooo f90779OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26432Oooo0oo(C26424Oooo c26424Oooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f90779OooOoO0 = c26424Oooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f90776OooOo = obj;
        this.f90778OooOoO |= Integer.MIN_VALUE;
        return this.f90779OooOoO0.OooO00o(null, this);
    }
}

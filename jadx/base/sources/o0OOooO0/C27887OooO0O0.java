package o0OOooO0;

import com.aspose.words.StyleIdentifier;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0OOooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager", m80623f = "CloudLockManager.kt", m80624l = {705, 246, 257, StyleIdentifier.BOOK_TITLE}, m80625m = "acquire")
public final class C27887OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98574OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27883OooO00o f98575OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98576OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33898OooO0Oo f98577OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o f98578OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98579OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27887OooO0O0(C27883OooO00o c27883OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98578OooOoOO = c27883OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98576OooOoO = obj;
        this.f98579OooOoo0 |= Integer.MIN_VALUE;
        return this.f98578OooOoOO.OooO0OO(null, this);
    }
}

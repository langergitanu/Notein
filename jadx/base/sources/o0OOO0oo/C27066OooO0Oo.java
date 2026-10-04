package o0OOO0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource", m80623f = "StickerLocalDataSource.kt", m80624l = {40}, m80625m = "getBuiltInStickerCollection")
public final class C27066OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27073OooOO0o f94216OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f94217OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94218OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27066OooO0Oo(C27073OooOO0o c27073OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f94218OooOoO0 = c27073OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f94215OooOo = obj;
        this.f94217OooOoO |= Integer.MIN_VALUE;
        return this.f94218OooOoO0.OooO0O0(null, this);
    }
}

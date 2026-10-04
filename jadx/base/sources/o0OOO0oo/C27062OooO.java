package o0OOO0oo;

import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0OOO0oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.sticker.StickerLocalDataSource", m80623f = "StickerLocalDataSource.kt", m80624l = {120}, m80625m = "getStickerFilesDir")
public final class C27062OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33895OooO00o f94201OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f94202OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27073OooOO0o f94203OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f94204OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f94205OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27062OooO(C27073OooOO0o c27073OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f94203OooOoO = c27073OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f94204OooOoO0 = obj;
        this.f94205OooOoOO |= Integer.MIN_VALUE;
        return this.f94203OooOoO.OooO0o0(this);
    }
}

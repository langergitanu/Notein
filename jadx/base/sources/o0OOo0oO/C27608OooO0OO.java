package o0OOo0oO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.audio.AudioUseCase", m80623f = "AudioUseCase.kt", m80624l = {83, 84}, m80625m = "updateAudioFile")
public final class C27608OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97076OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27610OooO0o0 f97077OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27610OooO0o0 f97078OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97079OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97080OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27608OooO0OO(C27610OooO0o0 c27610OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97078OooOoO = c27610OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97079OooOoO0 = obj;
        this.f97080OooOoOO |= Integer.MIN_VALUE;
        return this.f97078OooOoO.OooO0OO(null, null, this);
    }
}

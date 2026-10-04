package o0OoOOo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OoOOo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {1560}, m80625m = "runPlayerWaveformDetectionLoop")
public final class C29160Oooo0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f103366OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103367OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f103368OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103369OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29160Oooo0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103369OooOoO0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103366OooOo = obj;
        this.f103368OooOoO |= Integer.MIN_VALUE;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO0oO(this.f103369OooOoO0, this);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}

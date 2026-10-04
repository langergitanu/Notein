package o0OoOOo;

import com.aspose.words.EditingLanguage;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoOOo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {EditingLanguage.HEBREW}, m80625m = "updateAudioDurationOnStopRecording")
public final class C29172OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103441OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f103442OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29172OoooOOo(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103440OooOo = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103441OooOo0o = obj;
        this.f103442OooOoO0 |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
        return this.f103440OooOo.Oooo0o0(null, null, this);
    }
}

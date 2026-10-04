package o0OoOOo;

import android.media.MediaRecorder;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoOOo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {818, 822, 841, 859}, m80625m = "startMediaRecorderLocked")
public final class C29169OoooO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Long f103427OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103428OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f103429OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public MediaRecorder f103430OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103431OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f103432OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29169OoooO0O(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103431OooOoOO = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103429OooOoO = obj;
        this.f103432OooOoo0 |= Integer.MIN_VALUE;
        return com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0(this.f103431OooOoOO, null, this);
    }
}

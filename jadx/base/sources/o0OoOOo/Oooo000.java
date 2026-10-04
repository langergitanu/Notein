package o0OoOOo;

import android.net.Uri;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {501, 523, 536, 537, 542, 543, 551}, m80625m = "prepareMediaPlayerLocked")
public final class Oooo000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f103355OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103356OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f103357OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Uri f103358OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103359OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f103360OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103359OooOoOO = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103357OooOoO = obj;
        this.f103360OooOoo0 |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
        return this.f103359OooOoOO.OooOo0(null, this);
    }
}

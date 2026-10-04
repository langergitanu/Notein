package o0OoOOo;

import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoOOo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel", m80623f = "NoteAudioViewModel.kt", m80624l = {947}, m80625m = "stopMediaRecorderLocked")
public final class C29170OoooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f103433OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103434OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103435OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f103436OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f103437OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29170OoooOO0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103435OooOoO = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103436OooOoO0 = obj;
        this.f103437OooOoOO |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
        return this.f103435OooOoO.Oooo0O0(false, this);
    }
}

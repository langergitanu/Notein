package o0OoOOo;

import android.media.MediaPlayer;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoOOo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$runPlayerProgressDetectionLoop$2", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29159Oooo00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103365OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29159Oooo00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super C29159Oooo00o> continuation) {
        super(1, continuation);
        this.f103365OooOo0o = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C29159Oooo00o(this.f103365OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return ((C29159Oooo00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103365OooOo0o;
        if (!(oooO0o.f74227OooOO0.getValue() instanceof OooO0OO.C23396OooO0oo)) {
            return C32460OooOooO.f116667OooO00o;
        }
        MediaPlayer mediaPlayer = oooO0o.f74226OooO0oo;
        Integer num = new Integer(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0);
        C33781o00o0O c33781o00o0O = oooO0o.f74234OooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, num);
        return C32460OooOooO.f116667OooO00o;
    }
}

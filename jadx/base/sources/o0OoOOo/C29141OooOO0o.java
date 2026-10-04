package o0OoOOo;

import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$9", m80623f = "AudioBarChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
public final class C29141OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103297OooOo0o;

    /* JADX INFO: renamed from: o0OoOOo.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$onViewInitialed$9$1", m80623f = "AudioBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103298OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f103299OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103298OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f103298OooOo, continuation);
            oooO00o.f103299OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String noteId = (String) this.f103299OooOo0o;
            AudioBarChildFragment audioBarChildFragment = this.f103298OooOo;
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new C29164Oooo0oO(oooO0oOooOoo0, noteId, null), 3);
            audioBarChildFragment.OooOoOO().OooOooo(false);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29141OooOO0o(AudioBarChildFragment audioBarChildFragment, Continuation<? super C29141OooOO0o> continuation) {
        super(2, continuation);
        this.f103296OooOo = audioBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29141OooOO0o(this.f103296OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29141OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103297OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AudioBarChildFragment audioBarChildFragment = this.f103296OooOo;
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoOO = audioBarChildFragment.OooOoOO();
            OooO00o oooO00o = new OooO00o(audioBarChildFragment, null);
            this.f103297OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoOO.f73397OoooOoo, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

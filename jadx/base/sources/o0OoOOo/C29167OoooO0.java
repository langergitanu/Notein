package o0OoOOo;

import com.orion.notein.p607ui.noteeditor.audio.OooO0O0;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaRecorder$1", m80623f = "NoteAudioViewModel.kt", m80624l = {797, 798}, m80625m = "invokeSuspend")
public final class C29167OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103415OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Long f103416OooOoO0;

    /* JADX INFO: renamed from: o0OoOOo.OoooO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaRecorder$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {797}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103417OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103418OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f103417OooOo = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f103417OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103418OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f103418OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
                C32460OooOooO c32460OooOooOOooOOOo = this.f103417OooOo.OooOOOo(new OooO0O0.OooOO0());
                if (c32460OooOooOOooOOOo != enumC32485OooO00o) {
                    c32460OooOooOOooOOOo = C32460OooOooO.f116667OooO00o;
                }
                if (c32460OooOooOOooOOOo == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOo.OoooO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$startMediaRecorder$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {798}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103419OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103420OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Long f103421OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Long l, Continuation<? super OooO0O0> continuation) {
            super(1, continuation);
            this.f103419OooOo = oooO0o;
            this.f103421OooOoO0 = l;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO0O0(this.f103419OooOo, this.f103421OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103420OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f103420OooOo0o = 1;
                if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0(this.f103419OooOo, this.f103421OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29167OoooO0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Long l, Continuation<? super C29167OoooO0> continuation) {
        super(2, continuation);
        this.f103414OooOo = oooO0o;
        this.f103416OooOoO0 = l;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29167OoooO0(this.f103414OooOo, this.f103416OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29167OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0o(r2, r7, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103415OooOo0o;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103414OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(oooO0o, null);
            this.f103415OooOo0o = 1;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            if (oooO0o.Oooo0o(oooO00o, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO0O0 oooO0O0 = new OooO0O0(oooO0o, this.f103416OooOoO0, null);
        this.f103415OooOo0o = 2;
    }
}

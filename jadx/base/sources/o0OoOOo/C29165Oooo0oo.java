package o0OoOOo;

import android.media.MediaPlayer;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setPlaySpeed$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1381, 1387}, m80625m = "invokeSuspend")
public final class C29165Oooo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f103397OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103398OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f103399OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103400OooOoO0;

    /* JADX INFO: renamed from: o0OoOOo.Oooo0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setPlaySpeed$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1382}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103401OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103402OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ float f103403OooOoO0;

        /* JADX INFO: renamed from: o0OoOOo.Oooo0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setPlaySpeed$1$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19961OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ float f103404OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103405OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19961OooO00o(float f, Continuation<? super C19961OooO00o> continuation) {
                super(2, continuation);
                this.f103404OooOo = f;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19961OooO00o c19961OooO00o = new C19961OooO00o(this.f103404OooOo, continuation);
                c19961OooO00o.f103405OooOo0o = obj;
                return c19961OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C19961OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                ((C24334OooO0O0) this.f103405OooOo0o).OooO0oO(com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O, new Float(this.f103404OooOo));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103401OooOo = oooO0o;
            this.f103403OooOoO0 = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103401OooOo, this.f103403OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103402OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f103401OooOo.f74224OooO0o0;
            C19961OooO00o c19961OooO00o = new C19961OooO00o(this.f103403OooOoO0, null);
            this.f103402OooOo0o = 1;
            Object objOooO00o = C24332OooO.OooO00o(oooOO02, c19961OooO00o, this);
            return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOOo.Oooo0oo$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$setPlaySpeed$1$2", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33636Oooo00o f103406OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103407OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ float f103408OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, InterfaceC33636Oooo00o interfaceC33636Oooo00o, float f, Continuation<? super OooO0O0> continuation) {
            super(1, continuation);
            this.f103407OooOo0o = oooO0o;
            this.f103406OooOo = interfaceC33636Oooo00o;
            this.f103408OooOoO0 = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO0O0(this.f103407OooOo0o, this.f103406OooOo, this.f103408OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            MediaPlayer mediaPlayer = this.f103407OooOo0o.f74226OooO0oo;
            if (mediaPlayer == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0OO("setAudioPlaybackSpeed. mediaPlayer is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            if (!mediaPlayer.isPlaying()) {
                return C32460OooOooO.f116667OooO00o;
            }
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(this.f103408OooOoO0));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29165Oooo0oo(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, float f, Continuation<? super C29165Oooo0oo> continuation) {
        super(2, continuation);
        this.f103400OooOoO0 = oooO0o;
        this.f103399OooOoO = f;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29165Oooo0oo c29165Oooo0oo = new C29165Oooo0oo(this.f103400OooOoO0, this.f103399OooOoO, continuation);
        c29165Oooo0oo.f103397OooOo = obj;
        return c29165Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29165Oooo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r3.Oooo0o(r9, r8) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103398OooOo0o;
        float f = this.f103399OooOoO;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103400OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103397OooOo;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(oooO0o, f, null);
            this.f103397OooOo = interfaceC33636Oooo00o;
            this.f103398OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) != enumC32485OooO00o) {
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
        interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103397OooOo;
        C32446OooOOOo.OooO0O0(obj);
        OooO0O0 oooO0O0 = new OooO0O0(oooO0o, interfaceC33636Oooo00o, f, null);
        this.f103397OooOo = null;
        this.f103398OooOo0o = 2;
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
    }
}

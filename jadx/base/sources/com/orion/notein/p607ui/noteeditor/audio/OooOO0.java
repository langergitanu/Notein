package com.orion.notein.p607ui.noteeditor.audio;

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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$resetMediaPlayerLocked$2$2$1", m80623f = "NoteAudioViewModel.kt", m80624l = {472}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f74411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74412OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$resetMediaPlayerLocked$2$2$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {473}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f74413OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74414OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f74413OooOo = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f74413OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74414OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.C19281OooO0O0 c19281OooO0O0 = new OooO0O0.C19281OooO0O0(null, "OnError");
                this.f74414OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                if (this.f74413OooOo.OooOOOo(c19281OooO0O0) == enumC32485OooO00o) {
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
    public OooOO0(OooO0o oooO0o, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f74411OooOo = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f74411OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74412OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO0o oooO0o = this.f74411OooOo;
            OooO00o oooO00o = new OooO00o(oooO0o, null);
            this.f74412OooOo0o = 1;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o2 = OooO0o.f74218OoooO0O;
            if (oooO0o.Oooo0o(oooO00o, this) == enumC32485OooO00o) {
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

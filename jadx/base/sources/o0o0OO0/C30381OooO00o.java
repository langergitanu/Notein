package o0o0OO0;

import com.aspose.words.StyleIdentifier;
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
import oO0o0Oo.C33769Ooooo0o;

/* JADX INFO: renamed from: o0o0OO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30381OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f108441OooOo0o;

    /* JADX INFO: renamed from: o0o0OO0.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$1$1", m80623f = "AiOcrViewModel.kt", m80624l = {StyleIdentifier.SUBTLE_EMPHASIS}, m80625m = "invokeSuspend")
    public static final class C20072OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30394OooOOOO f108442OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f108443OooOo0o;

        /* JADX INFO: renamed from: o0o0OO0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$1$1$1", m80623f = "AiOcrViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20073OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
            public C20073OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20073OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((C20073OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20072OooO00o(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
            super(2, continuation);
            this.f108442OooOo = c30394OooOOOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C20072OooO00o(continuation, this.f108442OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C20072OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f108443OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f108442OooOo.f108513OooOoO;
                C20073OooO00o c20073OooO00o = new C20073OooO00o(2, null);
                this.f108443OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, c20073OooO00o, this) == enumC32485OooO00o) {
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
    public C30381OooO00o(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
        super(2, continuation);
        this.f108440OooOo = c30394OooOOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30381OooO00o c30381OooO00o = new C30381OooO00o(continuation, this.f108440OooOo);
        c30381OooO00o.f108441OooOo0o = obj;
        return c30381OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30381OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f108441OooOo0o, null, null, new C20072OooO00o(null, this.f108440OooOo), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

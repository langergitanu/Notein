package com.google.firebase.vertexai.common;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0oO00o.C34005OooO00o;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2$1$2$invokeSuspend$$inlined$decodeToFlow$1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"T", "LoO0o0OOo/OooOo0O;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V", "com/google/firebase/vertexai/common/util/KtorKt$decodeToFlow$1"}, m80613k = 3, m80614mv = {1, 8, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1", m80623f = "ktor.kt", m80624l = {82}, m80625m = "invokeSuspend")
public final class C17247xab0e0d14<R> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super R>, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ InterfaceC23986Ooooo0o $channel;
    final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2$1$2$invokeSuspend$$inlined$decodeToFlow$1$1, reason: invalid class name */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"T", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Ljava/lang/String;)V", "com/google/firebase/vertexai/common/util/KtorKt$decodeToFlow$1$1"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1$1", m80623f = "ktor.kt", m80624l = {84}, m80625m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ InterfaceC33712OooOo0O<R> $$this$channelFlow;
        final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC33712OooOo0O interfaceC33712OooOo0O, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation continuation) {
            super(2, continuation);
            this.$this_decodeToFlow = abstractC34457OooO0OO;
            this.$$this$channelFlow = interfaceC33712OooOo0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow, this.$this_decodeToFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33599OooOo0O.OoooO0((String) this.L$0, "data:");
            C34005OooO00o c34005OooO00o = this.$this_decodeToFlow.f123492OooO0O0;
            OooOOO0.OooOOO();
            throw null;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17247xab0e0d14(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation continuation) {
        super(2, continuation);
        this.$channel = interfaceC23986Ooooo0o;
        this.$this_decodeToFlow = abstractC34457OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C17247xab0e0d14 c17247xab0e0d14 = new C17247xab0e0d14(this.$channel, this.$this_decodeToFlow, continuation);
        c17247xab0e0d14.L$0 = obj;
        return c17247xab0e0d14;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooOOO0.OooOOO();
        throw null;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super R> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C17247xab0e0d14) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}

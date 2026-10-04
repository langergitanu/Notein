package com.google.firebase.vertexai.common;

import Oooo0oO.C21091o0000o;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO000o0.OooO0o;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32192OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33204OooO0oO;
import oO0Oo0Oo.C33209OooOOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.C33719OooO0OO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.OooO;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0o0OOo/OooOo0O;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V", "com/google/firebase/vertexai/common/APIController$postStream$2"}, m80613k = 3, m80614mv = {1, 8, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1", m80623f = "APIController.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class APIController$generateContentStream$$inlined$postStream$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super GenerateContentResponse.Internal>, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ GenerateContentRequest $request$inlined;
    final /* synthetic */ OooO0o $this_postStream;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ APIController this$0;
    final /* synthetic */ APIController this$0$inline_fun;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1 */
    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V", "com/google/firebase/vertexai/common/APIController$postStream$2$1"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1", m80623f = "APIController.kt", m80624l = {227, 230}, m80625m = "invokeSuspend")
    public static final class C172421 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ InterfaceC33712OooOo0O<GenerateContentResponse.Internal> $$this$channelFlow;
        final /* synthetic */ GenerateContentRequest $request$inlined;
        final /* synthetic */ OooO0o $this_postStream;
        final /* synthetic */ String $url;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ APIController this$0;
        final /* synthetic */ APIController this$0$inline_fun;

        /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0Oo0Oo/OooO0OO;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0Oo0Oo/OooO0OO;)V", "com/google/firebase/vertexai/common/APIController$postStream$2$1$2"}, m80613k = 3, m80614mv = {1, 8, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$postStream$2$1$2", m80623f = "APIController.kt", m80624l = {231, 233, 236}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {
            final /* synthetic */ InterfaceC33712OooOo0O<GenerateContentResponse.Internal> $$this$channelFlow;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"T", "LoO0o0OOo/OooOo0O;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V", "com/google/firebase/vertexai/common/APIController$postStream$2$1$2$invokeSuspend$$inlined$decodeToFlow$1"}, m80613k = 3, m80614mv = {1, 8, 0})
            @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1", m80623f = "ktor.kt", m80624l = {82}, m80625m = "invokeSuspend")
            public static final class C191081 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super GenerateContentResponse.Internal>, Continuation<? super C32460OooOooO>, Object> {
                final /* synthetic */ InterfaceC23986Ooooo0o $channel;
                final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"T", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Ljava/lang/String;)V", "com/google/firebase/vertexai/common/APIController$postStream$2$1$2$invokeSuspend$$inlined$decodeToFlow$1$1"}, m80613k = 3, m80614mv = {1, 8, 0})
                @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1$1", m80623f = "ktor.kt", m80624l = {84}, m80625m = "invokeSuspend")
                public static final class C191091 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
                    final /* synthetic */ InterfaceC33712OooOo0O<GenerateContentResponse.Internal> $$this$channelFlow;
                    final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C191091(InterfaceC33712OooOo0O interfaceC33712OooOo0O, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation continuation) {
                        super(2, continuation);
                        this.$this_decodeToFlow = abstractC34457OooO0OO;
                        this.$$this$channelFlow = interfaceC33712OooOo0O;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C191091 c191091 = new C191091(this.$$this$channelFlow, this.$this_decodeToFlow, continuation);
                        c191091.L$0 = obj;
                        return c191091;
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1$1$1$1$1 for r5v1 'this'  kotlin.coroutines.Continuation
                        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                        */
                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                        /*
                            r5 = this;
                            oO00ooo0.OooO00o r0 = oO00ooo0.EnumC32485OooO00o.f116726OooOo0o
                            int r1 = r5.label
                            r2 = 1
                            if (r1 == 0) goto L15
                            if (r1 != r2) goto Ld
                            oO00ooO.C32446OooOOOo.OooO0O0(r6)
                            goto L3c
                        Ld:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r0)
                            throw r6
                        L15:
                            oO00ooO.C32446OooOOOo.OooO0O0(r6)
                            java.lang.Object r6 = r5.L$0
                            java.lang.String r6 = (java.lang.String) r6
                            java.lang.String r1 = "data:"
                            java.lang.String r6 = oO0o0O0o.C33599OooOo0O.OoooO0(r6, r1)
                            oO0o0OOo.OooOo0O<com.google.firebase.vertexai.type.GenerateContentResponse$Internal> r1 = r5.$$this$channelFlow
                            oOo00O0O.OooO0OO r3 = r5.$this_decodeToFlow
                            r3.getClass()
                            com.google.firebase.vertexai.type.GenerateContentResponse$Internal$Companion r4 = com.google.firebase.vertexai.type.GenerateContentResponse.Internal.INSTANCE
                            oO0o0ooO.OooO0OO r4 = r4.serializer()
                            java.lang.Object r6 = r3.OooO0O0(r6, r4)
                            r5.label = r2
                            java.lang.Object r6 = r1.OooOOO(r6, r5)
                            if (r6 != r0) goto L3c
                            return r0
                        L3c:
                            oO00ooO.OooOooO r6 = oO00ooO.C32460OooOooO.f116667OooO00o
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$postStream$1.C172421.AnonymousClass1.C191081.C191091.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                        return ((C191091) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C191081(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation continuation) {
                    super(2, continuation);
                    this.$channel = interfaceC23986Ooooo0o;
                    this.$this_decodeToFlow = abstractC34457OooO0OO;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C191081 c191081 = new C191081(this.$channel, this.$this_decodeToFlow, continuation);
                    c191081.L$0 = obj;
                    return c191081;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.label;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
                        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = this.$channel;
                        C191091 c191091 = new C191091(interfaceC33712OooOo0O, this.$this_decodeToFlow, null);
                        this.label = 1;
                        if (KtorKt.onEachLine(interfaceC23986Ooooo0o, c191091, this) == enumC32485OooO00o) {
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

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33712OooOo0O<? super GenerateContentResponse.Internal> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
                    return ((C191081) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC33712OooOo0O interfaceC33712OooOo0O, Continuation continuation) {
                super(2, continuation);
                this.$$this$channelFlow = interfaceC33712OooOo0O;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
            
                if (r7.collect(r1, r6) != r0) goto L21;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AbstractC33200OooO0OO abstractC33200OooO0OO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.label;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.L$0;
                    this.L$0 = abstractC33200OooO0OO;
                    this.label = 1;
                    if (APIControllerKt.validateResponse(abstractC33200OooO0OO, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i == 1) {
                    abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.L$0;
                    C32446OooOOOo.OooO0O0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    C33719OooO0OO c33719OooO0OO = new C33719OooO0OO(new C191081((InterfaceC23986Ooooo0o) obj, APIControllerKt.getJSON(), null), OooO.f123416OooOo0o, -2, EnumC33692OooO0OO.f121452OooOo0o);
                    final InterfaceC33712OooOo0O<GenerateContentResponse.Internal> interfaceC33712OooOo0O = this.$$this$channelFlow;
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = new InterfaceC33723OooO0oO() { // from class: com.google.firebase.vertexai.common.APIController$generateContentStream$.inlined.postStream.1.1.1.2
                        public final Object emit(GenerateContentResponse.Internal internal, Continuation<? super C32460OooOooO> continuation) {
                            Object objOooOOO = interfaceC33712OooOo0O.OooOOO(internal, continuation);
                            return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
                        }

                        @Override // oO0o0Oo.InterfaceC33723OooO0oO
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GenerateContentResponse.Internal) obj2, (Continuation<? super C32460OooOooO>) continuation);
                        }
                    };
                    this.label = 3;
                }
                this.L$0 = null;
                this.label = 2;
                obj = C33204OooO0oO.OooO00o(abstractC33200OooO0OO, this);
                if (obj != enumC32485OooO00o) {
                    C33719OooO0OO c33719OooO0OO2 = new C33719OooO0OO(new C191081((InterfaceC23986Ooooo0o) obj, APIControllerKt.getJSON(), null), OooO.f123416OooOo0o, -2, EnumC33692OooO0OO.f121452OooOo0o);
                    final InterfaceC33712OooOo0O interfaceC33712OooOo0O2 = this.$$this$channelFlow;
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = new InterfaceC33723OooO0oO() { // from class: com.google.firebase.vertexai.common.APIController$generateContentStream$.inlined.postStream.1.1.1.2
                        public final Object emit(GenerateContentResponse.Internal internal, Continuation<? super C32460OooOooO> continuation) {
                            Object objOooOOO = interfaceC33712OooOo0O2.OooOOO(internal, continuation);
                            return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
                        }

                        @Override // oO0o0Oo.InterfaceC33723OooO0oO
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GenerateContentResponse.Internal) obj2, (Continuation<? super C32460OooOooO>) continuation);
                        }
                    };
                    this.label = 3;
                }
                return enumC32485OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
                return ((AnonymousClass1) create(abstractC33200OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172421(OooO0o oooO0o, String str, APIController aPIController, InterfaceC33712OooOo0O interfaceC33712OooOo0O, Continuation continuation, APIController aPIController2, GenerateContentRequest generateContentRequest) {
            super(2, continuation);
            this.$this_postStream = oooO0o;
            this.$url = str;
            this.this$0$inline_fun = aPIController;
            this.this$0 = aPIController2;
            this.$request$inlined = generateContentRequest;
            this.$$this$channelFlow = interfaceC33712OooOo0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C172421(this.$this_postStream, this.$url, this.this$0$inline_fun, this.$$this$channelFlow, continuation, this.this$0, this.$request$inlined);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        
            if (r7.OooO0O0(r1, r6) == r0) goto L16;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO0o oooO0o;
            C32132OooO0Oo c32132OooO0Oo;
            C32132OooO0Oo c32132OooO0Oo2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oooO0o = this.$this_postStream;
                String str = this.$url;
                APIController aPIController = this.this$0$inline_fun;
                C32132OooO0Oo c32132OooO0Oo3 = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo3, str);
                this.L$0 = oooO0o;
                this.L$1 = c32132OooO0Oo3;
                this.L$2 = c32132OooO0Oo3;
                this.label = 1;
                if (aPIController.applyHeaderProvider(c32132OooO0Oo3, this) != enumC32485OooO00o) {
                    c32132OooO0Oo = c32132OooO0Oo3;
                    c32132OooO0Oo2 = c32132OooO0Oo;
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
            c32132OooO0Oo = (C32132OooO0Oo) this.L$2;
            c32132OooO0Oo2 = (C32132OooO0Oo) this.L$1;
            oooO0o = (OooO0o) this.L$0;
            C32446OooOOOo.OooO0O0(obj);
            this.this$0.applyCommonConfiguration(c32132OooO0Oo, this.$request$inlined);
            c32132OooO0Oo2.OooO0Oo(C32192OooOo0.f115539OooO0OO);
            C33209OooOOO0 c33209OooOOO0 = new C33209OooOOO0(c32132OooO0Oo2, oooO0o);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172421) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APIController$generateContentStream$$inlined$postStream$1(OooO0o oooO0o, String str, APIController aPIController, Continuation continuation, APIController aPIController2, GenerateContentRequest generateContentRequest) {
        super(2, continuation);
        this.$this_postStream = oooO0o;
        this.$url = str;
        this.this$0$inline_fun = aPIController;
        this.this$0 = aPIController2;
        this.$request$inlined = generateContentRequest;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        APIController$generateContentStream$$inlined$postStream$1 aPIController$generateContentStream$$inlined$postStream$1 = new APIController$generateContentStream$$inlined$postStream$1(this.$this_postStream, this.$url, this.this$0$inline_fun, continuation, this.this$0, this.$request$inlined);
        aPIController$generateContentStream$$inlined$postStream$1.L$0 = obj;
        return aPIController$generateContentStream$$inlined$postStream$1;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
        C33609OooO0oo.OooO0OO(interfaceC33712OooOo0O, new C33635Oooo00O("postStream"), null, new C172421(this.$this_postStream, this.$url, this.this$0$inline_fun, interfaceC33712OooOo0O, null, this.this$0, this.$request$inlined), 2);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super GenerateContentResponse.Internal> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((APIController$generateContentStream$$inlined$postStream$1) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}

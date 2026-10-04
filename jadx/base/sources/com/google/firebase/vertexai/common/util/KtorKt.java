package com.google.firebase.vertexai.common.util;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0oO00o.C34005OooO00o;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a;\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0012\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m80612d2 = {"Lio/ktor/utils/io/Ooooo0o;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "LoO00ooO/OooOooO;", "", "block", "onEachLine", "(Lio/ktor/utils/io/Ooooo0o;LoO0O000o/OooOOOo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "LoOo00O0O/OooO0OO;", "channel", "LoO0o0Oo/OooO0o;", "decodeToFlow", "(LoOo00O0O/OooO0OO;Lio/ktor/utils/io/Ooooo0o;)LoO0o0Oo/OooO0o;", "Lio/ktor/utils/io/Oooo00O;", "", "bytes", "send", "(Lio/ktor/utils/io/Oooo00O;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SSE_SEPARATOR", "Ljava/lang/String;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class KtorKt {
    public static final String SSE_SEPARATOR = "\r\n\r\n";

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"T", "LoO0o0OOo/OooOo0O;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1", m80623f = "ktor.kt", m80624l = {82}, m80625m = "invokeSuspend")
    public static final class C172501<T> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super T>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ InterfaceC23986Ooooo0o $channel;
        final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"T", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Ljava/lang/String;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt$decodeToFlow$1$1", m80623f = "ktor.kt", m80624l = {84}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
            final /* synthetic */ InterfaceC33712OooOo0O<T> $$this$channelFlow;
            final /* synthetic */ AbstractC34457OooO0OO $this_decodeToFlow;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$channelFlow = interfaceC33712OooOo0O;
                this.$this_decodeToFlow = abstractC34457OooO0OO;
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
        public C172501(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC34457OooO0OO abstractC34457OooO0OO, Continuation<? super C172501> continuation) {
            super(2, continuation);
            this.$channel = interfaceC23986Ooooo0o;
            this.$this_decodeToFlow = abstractC34457OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooOOO0.OooOOO();
            throw null;
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
        public final Object invoke(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((C172501) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.util.KtorKt$onEachLine$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt", m80623f = "ktor.kt", m80624l = {50, 51, 52}, m80625m = "onEachLine")
    public static final class C172511 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172511(Continuation<? super C172511> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KtorKt.onEachLine(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.util.KtorKt$send$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.util.KtorKt", m80623f = "ktor.kt", m80624l = {96}, m80625m = "send")
    public static final class C172521 extends AbstractC32479OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C172521(Continuation<? super C172521> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KtorKt.send(null, null, this);
        }
    }

    public static final <T> InterfaceC33721OooO0o<T> decodeToFlow(AbstractC34457OooO0OO abstractC34457OooO0OO, InterfaceC23986Ooooo0o channel) {
        OooOOO0.OooO0oO(abstractC34457OooO0OO, "<this>");
        OooOOO0.OooO0oO(channel, "channel");
        OooOOO0.OooOOO();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        if (r9 != null) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:20:0x005e, B:31:0x0085], limit reached: 39 */
    /* JADX WARN: Path cross not found for [B:20:0x005e, B:36:0x008f], limit reached: 39 */
    /* JADX WARN: Path cross not found for [B:31:0x0085, B:20:0x005e], limit reached: 39 */
    /* JADX WARN: Path cross not found for [B:33:0x008b, B:34:0x008c], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[PHI: r7 r8 r9
      0x004b: PHI (r7v1 oO0O000o.OooOOOo<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super oO00ooO.OooOooO>, ? extends java.lang.Object>) = 
      (r7v3 oO0O000o.OooOOOo<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super oO00ooO.OooOooO>, ? extends java.lang.Object>)
      (r7v10 oO0O000o.OooOOOo<? super java.lang.String, ? super kotlin.coroutines.Continuation<? super oO00ooO.OooOooO>, ? extends java.lang.Object>)
     binds: [B:27:0x007e, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r8v1 io.ktor.utils.io.Ooooo0o) = (r8v3 io.ktor.utils.io.Ooooo0o), (r8v9 io.ktor.utils.io.Ooooo0o) binds: [B:27:0x007e, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r9v2 java.lang.Object) = (r9v6 java.lang.Object), (r9v1 java.lang.Object) binds: [B:27:0x007e, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0099 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onEachLine(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super C32460OooOooO> continuation) {
        C172511 c172511;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo2;
        String str;
        if (continuation instanceof C172511) {
            c172511 = (C172511) continuation;
            int i = c172511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172511.label = i - Integer.MIN_VALUE;
            } else {
                c172511 = new C172511(continuation);
            }
        }
        Object objOooOo0o = c172511.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172511.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0o);
        } else {
            if (i2 == 1) {
                interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) c172511.L$1;
                interfaceC23986Ooooo0o2 = (InterfaceC23986Ooooo0o) c172511.L$0;
                C32446OooOOOo.OooO0O0(objOooOo0o);
                c172511.L$0 = interfaceC23986Ooooo0o2;
                c172511.L$1 = interfaceC32508OooOOOo2;
                c172511.label = 2;
                objOooOo0o = interfaceC23986Ooooo0o2.OooOo0o(c172511);
                if (objOooOo0o != enumC32485OooO00o) {
                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o2;
                    interfaceC32508OooOOOo = interfaceC32508OooOOOo2;
                    interfaceC23986Ooooo0o = interfaceC23986Ooooo0o3;
                    str = (String) objOooOo0o;
                    if (str != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 == 2) {
                interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) c172511.L$1;
                interfaceC23986Ooooo0o2 = (InterfaceC23986Ooooo0o) c172511.L$0;
                C32446OooOOOo.OooO0O0(objOooOo0o);
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o32 = interfaceC23986Ooooo0o2;
                interfaceC32508OooOOOo = interfaceC32508OooOOOo2;
                interfaceC23986Ooooo0o = interfaceC23986Ooooo0o32;
                str = (String) objOooOo0o;
                if (str != null) {
                    if (str.length() == 0) {
                    }
                    if (0 != 0) {
                        c172511.L$0 = interfaceC23986Ooooo0o;
                        c172511.L$1 = interfaceC32508OooOOOo;
                        c172511.label = 3;
                        if (interfaceC32508OooOOOo.invoke(null, c172511) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo3 = (InterfaceC32508OooOOOo) c172511.L$1;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o4 = (InterfaceC23986Ooooo0o) c172511.L$0;
                C32446OooOOOo.OooO0O0(objOooOo0o);
                interfaceC32508OooOOOo = interfaceC32508OooOOOo3;
                interfaceC23986Ooooo0o = interfaceC23986Ooooo0o4;
            }
        }
        if (interfaceC23986Ooooo0o.OooOoo()) {
            return C32460OooOooO.f116667OooO00o;
        }
        c172511.L$0 = interfaceC23986Ooooo0o;
        c172511.L$1 = interfaceC32508OooOOOo;
        c172511.label = 1;
        if (interfaceC23986Ooooo0o.OooOoOO(c172511) != enumC32485OooO00o) {
            InterfaceC32508OooOOOo<? super String, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo4 = interfaceC32508OooOOOo;
            interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
            interfaceC32508OooOOOo2 = interfaceC32508OooOOOo4;
            c172511.L$0 = interfaceC23986Ooooo0o2;
            c172511.L$1 = interfaceC32508OooOOOo2;
            c172511.label = 2;
            objOooOo0o = interfaceC23986Ooooo0o2.OooOo0o(c172511);
            if (objOooOo0o != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object send(InterfaceC23967Oooo00O interfaceC23967Oooo00O, byte[] bArr, Continuation<? super C32460OooOooO> continuation) {
        C172521 c172521;
        if (continuation instanceof C172521) {
            c172521 = (C172521) continuation;
            int i = c172521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172521.label = i - Integer.MIN_VALUE;
            } else {
                c172521 = new C172521(continuation);
            }
        }
        Object obj = c172521.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172521.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c172521.L$0 = interfaceC23967Oooo00O;
            c172521.label = 1;
            if (C23992OoooooO.OooO0o(interfaceC23967Oooo00O, bArr, c172521) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC23967Oooo00O = (InterfaceC23967Oooo00O) c172521.L$0;
            C32446OooOOOo.OooO0O0(obj);
        }
        C23992OoooooO.OooO0O0(interfaceC23967Oooo00O);
        return C32460OooOooO.f116667OooO00o;
    }
}

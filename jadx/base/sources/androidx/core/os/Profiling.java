package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.core.os.Profiling;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\u0004\u0010\u000b\u001a%\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m80612d2 = {"Landroid/content/Context;", "context", "LoO0o0Oo/OooO0o;", "Landroid/os/ProfilingResult;", "registerForAllProfilingResults", "(Landroid/content/Context;)LoO0o0Oo/OooO0o;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/Consumer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LoO00ooO/OooOooO;", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "unregisterForAllProfilingResults", "(Landroid/content/Context;Ljava/util/function/Consumer;)V", "Landroidx/core/os/ProfilingRequest;", "profilingRequest", "requestProfiling", "(Landroid/content/Context;Landroidx/core/os/ProfilingRequest;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "", Profiling.KEY_DURATION_MS, "Ljava/lang/String;", Profiling.KEY_SAMPLING_INTERVAL_BYTES, Profiling.KEY_TRACK_JAVA_ALLOCATIONS, Profiling.KEY_FREQUENCY_HZ, Profiling.KEY_SIZE_KB, Profiling.KEY_BUFFER_FILL_POLICY, "", "VALUE_BUFFER_FILL_POLICY_DISCARD", "I", "VALUE_BUFFER_FILL_POLICY_RING_BUFFER", "core_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OOo/OooOo0O;", "Landroid/os/ProfilingResult;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m80623f = "Profiling.kt", m80624l = {79}, m80625m = "invokeSuspend")
    public static final class C00271 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super ProfilingResult>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1$2, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
        public static final class AnonymousClass2 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
            final /* synthetic */ Consumer<ProfilingResult> $listener;
            final /* synthetic */ ProfilingManager $service;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.$service = profilingManager;
                this.$listener = consumer;
            }

            @Override // oO0O000o.OooO00o
            public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
                invoke2();
                return C32460OooOooO.f116667OooO00o;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$service.unregisterForAllProfilingResults(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00271(Context context, Continuation<? super C00271> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC33712OooOo0O interfaceC33712OooOo0O, ProfilingResult result) {
            OooOOO0.OooO0o(result, "result");
            interfaceC33712OooOo0O.OooO0o0(result);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C00271 c00271 = new C00271(this.$context, continuation);
            c00271.L$0 = obj;
            return c00271;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.OooO, java.util.function.Consumer] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                final InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
                ?? r1 = new Consumer() { // from class: androidx.core.os.OooO
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C00271.invokeSuspend$lambda$0(interfaceC33712OooOo0O, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager profilingManagerOooO00o = C21671OooO0Oo.OooO00o(this.$context.getSystemService(OooO0OO.OooO00o()));
                profilingManagerOooO00o.registerForAllProfilingResults(new OooOO0(), r1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(profilingManagerOooO00o, r1);
                this.label = 1;
                if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, anonymousClass2, this) == enumC32485OooO00o) {
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
        public final Object invoke(InterfaceC33712OooOo0O<? super ProfilingResult> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((C00271) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public static final InterfaceC33721OooO0o<ProfilingResult> registerForAllProfilingResults(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return C25252OooO0Oo.OooO0o0(new C00271(context, null));
    }

    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(profilingRequest, "profilingRequest");
        C21671OooO0Oo.OooO00o(context.getSystemService(OooO0OO.OooO00o())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(listener, "listener");
        C21671OooO0Oo.OooO00o(context.getSystemService(OooO0OO.OooO00o())).unregisterForAllProfilingResults(listener);
    }

    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(listener, "listener");
        C21671OooO0Oo.OooO00o(context.getSystemService(OooO0OO.OooO00o())).registerForAllProfilingResults(executor, listener);
    }
}

package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lkotlin/coroutines/Continuation;", "LoO00ooO/OooOooO;", "Ljava/lang/Runnable;", "asRunnable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Runnable;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class RunnableKt {
    public static final Runnable asRunnable(Continuation<? super C32460OooOooO> continuation) {
        return new ContinuationRunnable(continuation);
    }
}

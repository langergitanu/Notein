package androidx.core.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, m80612d2 = {"asConsumer", "Ljava/util/function/Consumer;", "T", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ConsumerKt {
    public static final <T> java.util.function.Consumer<T> asConsumer(Continuation<? super T> continuation) {
        return new ContinuationConsumer(continuation);
    }
}

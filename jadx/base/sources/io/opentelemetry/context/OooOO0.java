package io.opentelemetry.context;

import io.opentelemetry.context.StrictContextStorage;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOO0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return StrictContextStorage.PendingScopes.lambda$drainPendingCallers$0((StrictContextStorage.CallerStackTrace) obj);
    }
}

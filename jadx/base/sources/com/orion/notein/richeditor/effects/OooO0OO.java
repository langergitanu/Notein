package com.orion.notein.richeditor.effects;

import com.orion.notein.richeditor.spans.RTSpan;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO0OO implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return BulletEffect.lambda$onParagraphLayoutChanged$2((RTSpan) obj);
    }
}

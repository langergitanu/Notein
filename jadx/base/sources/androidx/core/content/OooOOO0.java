package androidx.core.content;

import android.content.ComponentName;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
    }
}

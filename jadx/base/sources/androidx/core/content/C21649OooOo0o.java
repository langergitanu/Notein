package androidx.core.content;

import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: renamed from: androidx.core.content.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21649OooOo0o implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
    }
}

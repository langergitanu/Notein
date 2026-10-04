package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21533OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f62937OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TextClassifier f62938OooO0O0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOOo0$OooO00o */
    public static final class OooO00o {
        public static TextClassifier OooO00o(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C21533OooOOo0(TextView textView) {
        this.f62937OooO00o = (TextView) Preconditions.checkNotNull(textView);
    }
}

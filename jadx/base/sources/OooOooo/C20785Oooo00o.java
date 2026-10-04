package OooOooo;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.datatransport.Transformer;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;

/* JADX INFO: renamed from: OooOooo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20785Oooo00o implements Transformer, OnApplyWindowInsetsListener {
    public static int OooO00o(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        kotlin.jvm.internal.OooOOO0.OooO0oO(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        kotlin.jvm.internal.OooOOO0.OooO0o(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        kotlin.jvm.internal.OooOOO0.OooO0o(insets3, "getInsets(...)");
        v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), Math.max(insets2.bottom, insets3.bottom));
        return insets;
    }
}

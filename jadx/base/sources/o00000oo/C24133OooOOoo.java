package o00000oo;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: o00000oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24133OooOOoo extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline result) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        result.setRect(0, 0, view.getWidth(), view.getHeight());
        result.setAlpha(0.0f);
    }
}

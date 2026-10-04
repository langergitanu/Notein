package androidx.compose.p002ui.platform;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/ui/platform/ViewLayerContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "LoO00ooO/OooOooO;", "dispatchGetDisplayList", "()V", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ViewLayerContainer extends DrawChildContainer {
    @Override // androidx.compose.p002ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}

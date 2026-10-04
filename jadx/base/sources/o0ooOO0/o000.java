package o0ooOO0;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.core.view.ViewKt;
import com.orion.notein.global.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f112809OooOo0o;

    public o000(AbstractComposeView abstractComposeView) {
        this.f112809OooOo0o = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        AbstractComposeView abstractComposeView = this.f112809OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractComposeView, "<this>");
        Iterator<ViewParent> it = ViewKt.getAncestors(abstractComposeView).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
                Object tag = view.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        abstractComposeView.OooO0OO();
    }
}

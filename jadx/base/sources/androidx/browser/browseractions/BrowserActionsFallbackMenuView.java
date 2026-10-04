package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f63275OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f63276OooOo0o;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63276OooOo0o = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f63275OooOo = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f63276OooOo0o * 2), this.f63275OooOo), 1073741824), i2);
    }
}

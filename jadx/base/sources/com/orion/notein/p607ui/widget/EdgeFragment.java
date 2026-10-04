package com.orion.notein.p607ui.widget;

import android.os.Bundle;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/widget/EdgeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class EdgeFragment extends Fragment {
    public void OooOoO0(View view) {
        final int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.default_fragment_view_padding_top);
        view.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom());
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: o0oOoo0.OooO00o
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                OooOOO0.OooO0oO(v, "v");
                OooOOO0.OooO0oO(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                OooOOO0.OooO0o(insets2, "getInsets(...)");
                v.setPadding(insets2.left, Math.max(dimensionPixelSize, insets2.top), insets2.right, insets2.bottom);
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        OooOoO0(view);
    }
}

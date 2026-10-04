package androidx.navigation.fragment;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20418OooOoo;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24603Oooo0oO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "navigation-fragment_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class AbstractListDetailFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f65724OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f65725OooOo0o;

    public static final class OooO00o extends AbstractC20413OooOo0O implements SlidingPaneLayout.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SlidingPaneLayout f65726OooO00o;

        public OooO00o(SlidingPaneLayout slidingPaneLayout) {
            super(true);
            this.f65726OooO00o = slidingPaneLayout;
            slidingPaneLayout.f66259Oooo0O0.add(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.OooO0o
        public final void OooO00o(View panel) {
            OooOOO0.OooO0oO(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.OooO0o
        public final void OooO0O0(View panel) {
            OooOOO0.OooO0oO(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.OooO0o
        public final void OooO0OO(View panel) {
            OooOOO0.OooO0oO(panel, "panel");
            setEnabled(false);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            this.f65726OooO00o.OooO00o();
        }
    }

    public static final class OooO0O0 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ SlidingPaneLayout f65727OooOo;

        public OooO0O0(SlidingPaneLayout slidingPaneLayout) {
            this.f65727OooOo = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            OooOOO0.OooO0oo(view, "view");
            view.removeOnLayoutChangeListener(this);
            OooO00o oooO00o = AbstractListDetailFragment.this.f65725OooOo0o;
            OooOOO0.OooO0Oo(oooO00o);
            SlidingPaneLayout slidingPaneLayout = this.f65727OooOo;
            oooO00o.setEnabled(slidingPaneLayout.f66249OooOoOO && slidingPaneLayout.OooO0Oo());
        }
    }

    public abstract View OooOoO0();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragment;
        Bundle bundle2;
        OooOOO0.OooO0oO(inflater, "inflater");
        if (bundle != null) {
            this.f65724OooOo = bundle.getInt("android-support-nav:fragment:graphId");
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(R.id.sliding_pane_layout);
        View viewOooOoO0 = OooOoO0();
        if (!OooOOO0.OooO0O0(viewOooOoO0, slidingPaneLayout) && !OooOOO0.OooO0O0(viewOooOoO0.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewOooOoO0);
        }
        Context context = inflater.getContext();
        OooOOO0.OooO0o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(R.id.sliding_pane_detail_container);
        SlidingPaneLayout.C22085OooO0o0 c22085OooO0o0 = new SlidingPaneLayout.C22085OooO0o0(inflater.getContext().getResources().getDimensionPixelSize(R.dimen.sliding_pane_detail_pane_width), -1);
        c22085OooO0o0.f66274OooO00o = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, c22085OooO0o0);
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.sliding_pane_detail_container);
        if (fragmentOooOooO != null) {
        } else {
            int i = this.f65724OooOo;
            if (i != 0) {
                if (i != 0) {
                    bundle2 = new Bundle();
                    bundle2.putInt("android-support-nav:fragment:graphId", i);
                } else {
                    bundle2 = null;
                }
                navHostFragment = new NavHostFragment();
                if (bundle2 != null) {
                    navHostFragment.setArguments(bundle2);
                }
            } else {
                navHostFragment = new NavHostFragment();
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
            oooO00o.f65021OooOOo = true;
            oooO00o.OooO0Oo(R.id.sliding_pane_detail_container, navHostFragment, null, 1);
            oooO00o.OooO0oo();
        }
        this.f65725OooOo0o = new OooO00o(slidingPaneLayout);
        if (!ViewCompat.isLaidOut(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new OooO0O0(slidingPaneLayout));
        } else {
            OooO00o oooO00o2 = this.f65725OooOo0o;
            OooOOO0.OooO0Oo(oooO00o2);
            oooO00o2.setEnabled(slidingPaneLayout.f66249OooOoOO && slidingPaneLayout.OooO0Oo());
        }
        C20418OooOoo onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooO00o oooO00o3 = this.f65725OooOo0o;
        OooOOO0.OooO0Oo(oooO00o3);
        onBackPressedDispatcher.OooO00o(viewLifecycleOwner, oooO00o3);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C24603Oooo0oO.f83374OooO0O0);
        OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f65724OooOo = resourceId;
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        int i = this.f65724OooOo;
        if (i != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View listPaneView = ((SlidingPaneLayout) requireView()).getChildAt(0);
        OooOOO0.OooO0o(listPaneView, "listPaneView");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        OooO00o oooO00o = this.f65725OooOo0o;
        OooOOO0.OooO0Oo(oooO00o);
        oooO00o.setEnabled(((SlidingPaneLayout) requireView()).f66249OooOoOO && ((SlidingPaneLayout) requireView()).OooO0Oo());
    }
}

package androidx.fragment.app;

import Oooo0oO.C21023OooO0Oo;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.global.R;
import java.util.ArrayList;
import o000Oo0.OooO0O0;

/* JADX INFO: renamed from: androidx.fragment.app.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21914Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21905OooOooO f65044OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21915Oooo0oo f65045OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Fragment f65046OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f65047OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f65048OooO0o0 = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.Oooo0oO$OooO00o */
    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ View f65049OooOo0o;

        public OooO00o(View view) {
            this.f65049OooOo0o = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f65049OooOo0o;
            view2.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public C21914Oooo0oO(C21905OooOooO c21905OooOooO, C21915Oooo0oo c21915Oooo0oo, Fragment fragment) {
        this.f65044OooO00o = c21905OooOooO;
        this.f65045OooO0O0 = c21915Oooo0oo;
        this.f65046OooO0OO = fragment;
    }

    public final void OooO() {
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f65044OooO00o.OooO0o0(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            C21911Oooo0OO c21911Oooo0OO = this.f65045OooO0O0.f65053OooO0Oo;
            if (!((c21911Oooo0OO.f65039OooO0Oo.containsKey(fragment.mWho) && c21911Oooo0OO.f65042OooO0oO) ? c21911Oooo0OO.f65043OooO0oo : true)) {
                return;
            }
        }
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void OooO00o() {
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f65044OooO00o.OooO00o(fragment, false);
    }

    public final void OooO0O0() {
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.f65046OooO0OO;
        Fragment fragmentOooo000 = FragmentManager.Oooo000(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentOooo000 != null && !fragmentOooo000.equals(parentFragment)) {
            int i = fragment.mContainerId;
            OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(fragmentOooo000);
            sb.append(" via container with ID ");
            o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooOOO(fragment, C21023OooO0Oo.OooO0OO(" without using parent's childFragmentManager", i, sb)));
            o000Oo0.OooO0O0.OooO00o(fragment).getClass();
        }
        C21915Oooo0oo c21915Oooo0oo = this.f65045OooO0O0;
        c21915Oooo0oo.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = c21915Oooo0oo.f65050OooO00o;
            int iIndexOf = arrayList.indexOf(fragment);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = arrayList.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void OooO0OO() {
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        C21914Oooo0oO c21914Oooo0oO = null;
        C21915Oooo0oo c21915Oooo0oo = this.f65045OooO0O0;
        if (fragment2 != null) {
            C21914Oooo0oO c21914Oooo0oO2 = c21915Oooo0oo.f65051OooO0O0.get(fragment2.mWho);
            if (c21914Oooo0oO2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            c21914Oooo0oO = c21914Oooo0oO2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c21914Oooo0oO = c21915Oooo0oo.f65051OooO0O0.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0OO(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c21914Oooo0oO != null) {
            c21914Oooo0oO.OooOO0O();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f64816OooOo;
        fragment.mParentFragment = fragmentManager.f64821OooOoO;
        C21905OooOooO c21905OooOooO = this.f65044OooO00o;
        c21905OooOooO.OooO0oO(fragment, false);
        fragment.performAttach();
        c21905OooOooO.OooO0O0(fragment, false);
    }

    public final int OooO0Oo() {
        Fragment fragment = this.f65046OooO0OO;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f65048OooO0o0;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f65048OooO0o0, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f65048OooO0o0 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            AbstractC21925OoooOoO abstractC21925OoooOoOOooO = AbstractC21925OoooOoO.OooO(viewGroup, fragment.getParentFragmentManager());
            abstractC21925OoooOoOOooO.getClass();
            AbstractC21925OoooOoO.OooO0OO oooO0OOOooO0o = abstractC21925OoooOoOOooO.OooO0o(fragment);
            AbstractC21925OoooOoO.OooO0OO.OooO00o oooO00o = oooO0OOOooO0o != null ? oooO0OOOooO0o.f65088OooO0O0 : null;
            AbstractC21925OoooOoO.OooO0OO OooO0oO2 = abstractC21925OoooOoOOooO.OooO0oO(fragment);
            oooO00o = OooO0oO2 != null ? OooO0oO2.f65088OooO0O0 : null;
            int i = oooO00o == null ? -1 : AbstractC21925OoooOoO.C21926OooO0Oo.f65106OooO00o[oooO00o.ordinal()];
            if (i != -1 && i != 1) {
                oooO00o = oooO00o;
            }
        }
        if (oooO00o == AbstractC21925OoooOoO.OooO0OO.OooO00o.f65097OooOo) {
            iMin = Math.min(iMin, 6);
        } else if (oooO00o == AbstractC21925OoooOoO.OooO0OO.OooO00o.f65100OooOoO0) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void OooO0o() {
        String resourceName;
        Fragment fragment = this.f65046OooO0OO;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(C21893OooOOOo.OooO00o("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f64822OooOoO0.OooO0O0(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
                    o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooOOO0(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    o000Oo0.OooO0O0.OooO00o(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.Oooo0o(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                OooO0O0();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                ViewCompat.requestApplyInsets(fragment.mView);
            } else {
                View view = fragment.mView;
                view.addOnAttachStateChangeListener(new OooO00o(view));
            }
            fragment.performViewCreated();
            this.f65044OooO00o.OooOOO0(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void OooO0o0() {
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            C21905OooOooO c21905OooOooO = this.f65044OooO00o;
            c21905OooOooO.OooO0oo(fragment, false);
            fragment.performCreate(bundle2);
            c21905OooOooO.OooO0OO(fragment, false);
        }
    }

    public final void OooO0oO() {
        Fragment fragmentOooO0O0;
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        C21915Oooo0oo c21915Oooo0oo = this.f65045OooO0O0;
        if (z && !fragment.mBeingSaved) {
            c21915Oooo0oo.OooO(null, fragment.mWho);
        }
        if (!z) {
            C21911Oooo0OO c21911Oooo0OO = c21915Oooo0oo.f65053OooO0Oo;
            if (!((c21911Oooo0OO.f65039OooO0Oo.containsKey(fragment.mWho) && c21911Oooo0OO.f65042OooO0oO) ? c21911Oooo0OO.f65043OooO0oo : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentOooO0O0 = c21915Oooo0oo.OooO0O0(str)) != null && fragmentOooO0O0.mRetainInstance) {
                    fragment.mTarget = fragmentOooO0O0;
                }
                fragment.mState = 0;
                return;
            }
        }
        AbstractC21900OooOoO<?> abstractC21900OooOoO = fragment.mHost;
        if (abstractC21900OooOoO instanceof InterfaceC22023o00ooo) {
            zIsChangingConfigurations = c21915Oooo0oo.f65053OooO0Oo.f65043OooO0oo;
        } else {
            ActivityC21897OooOo0 activityC21897OooOo0 = abstractC21900OooOoO.f64990OooOo;
            if (activityC21897OooOo0 != null) {
                zIsChangingConfigurations = true ^ activityC21897OooOo0.isChangingConfigurations();
            }
        }
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            c21915Oooo0oo.f65053OooO0Oo.OooO0o(fragment, false);
        }
        fragment.performDestroy();
        this.f65044OooO00o.OooO0Oo(fragment, false);
        for (C21914Oooo0oO c21914Oooo0oO : c21915Oooo0oo.OooO0Oo()) {
            if (c21914Oooo0oO != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = c21915Oooo0oo.OooO0O0(str3);
        }
        c21915Oooo0oo.OooO0oo(this);
    }

    public final void OooO0oo() {
        View view;
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f65044OooO00o.OooOOO(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.OooOO0(null);
        fragment.mInLayout = false;
    }

    public final void OooOO0() {
        Fragment fragment = this.f65046OooO0OO;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.Oooo0o(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f65044OooO00o.OooOOO0(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f65047OooO0Oo;
        Fragment fragment = this.f65046OooO0OO;
        if (z) {
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f65047OooO0Oo = true;
            boolean z2 = false;
            while (true) {
                int iOooO0Oo = OooO0Oo();
                int i = fragment.mState;
                AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O0 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65101OooOo;
                AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O02 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65104OooOoO0;
                C21915Oooo0oo c21915Oooo0oo = this.f65045OooO0O0;
                if (iOooO0Oo == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.Oooo0o(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        c21915Oooo0oo.f65053OooO0Oo.OooO0o(fragment, true);
                        c21915Oooo0oo.OooO0oo(this);
                        if (FragmentManager.Oooo0o(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC21925OoooOoO abstractC21925OoooOoOOooO = AbstractC21925OoooOoO.OooO(viewGroup, fragment.getParentFragmentManager());
                            boolean z3 = fragment.mHidden;
                            AbstractC21925OoooOoO.OooO0OO.OooO00o oooO00o = AbstractC21925OoooOoO.OooO0OO.OooO00o.f65098OooOo0o;
                            if (z3) {
                                abstractC21925OoooOoOOooO.getClass();
                                if (FragmentManager.Oooo0o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                abstractC21925OoooOoOOooO.OooO0Oo(oooO0O02, oooO00o, this);
                            } else {
                                abstractC21925OoooOoOOooO.getClass();
                                if (FragmentManager.Oooo0o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                abstractC21925OoooOoOOooO.OooO0Oo(oooO0O0, oooO00o, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.Oooo0oO(fragment)) {
                            fragmentManager.f64829Oooo0 = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.OooOOOO();
                    }
                    this.f65047OooO0Oo = false;
                    return;
                }
                C21905OooOooO c21905OooOooO = this.f65044OooO00o;
                if (iOooO0Oo <= i) {
                    switch (i - 1) {
                        case -1:
                            OooO();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (c21915Oooo0oo.f65052OooO0OO.get(fragment.mWho) == null) {
                                    c21915Oooo0oo.OooO(OooOOO(), fragment.mWho);
                                }
                            }
                            OooO0oO();
                            break;
                        case 1:
                            OooO0oo();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.Oooo0o(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                c21915Oooo0oo.OooO(OooOOO(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                OooOOOO();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                AbstractC21925OoooOoO abstractC21925OoooOoOOooO2 = AbstractC21925OoooOoO.OooO(viewGroup2, fragment.getParentFragmentManager());
                                abstractC21925OoooOoOOooO2.getClass();
                                if (FragmentManager.Oooo0o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                abstractC21925OoooOoOOooO2.OooO0Oo(AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65102OooOo0o, AbstractC21925OoooOoO.OooO0OO.OooO00o.f65100OooOoO0, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.Oooo0o(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            c21905OooOooO.OooOO0o(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.Oooo0o(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            c21905OooOooO.OooO0o(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            OooO0OO();
                            break;
                        case 1:
                            OooO0o0();
                            break;
                        case 2:
                            OooOO0();
                            OooO0o();
                            break;
                        case 3:
                            OooO00o();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC21925OoooOoO abstractC21925OoooOoOOooO3 = AbstractC21925OoooOoO.OooO(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        oooO0O0 = AbstractC21925OoooOoO.OooO0OO.OooO0O0.f65103OooOoO;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        oooO0O0 = oooO0O02;
                                    }
                                }
                                abstractC21925OoooOoOOooO3.getClass();
                                if (FragmentManager.Oooo0o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                abstractC21925OoooOoOOooO3.OooO0Oo(oooO0O0, AbstractC21925OoooOoO.OooO0OO.OooO00o.f65097OooOo, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.Oooo0o(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            c21905OooOooO.OooOO0O(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            OooOOO0();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.f65047OooO0Oo = false;
            throw th;
        }
    }

    public final void OooOO0o(ClassLoader classLoader) {
        Fragment fragment = this.f65046OooO0OO;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment.mTargetWho = fragmentState.f64883Oooo0;
                fragment.mTargetRequestCode = fragmentState.f64887Oooo0O0;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.f64888Oooo0OO;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    public final Bundle OooOOO() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f65046OooO0OO;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f65044OooO00o.OooOO0(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.OooO0OO(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleOoooo00 = fragment.mChildFragmentManager.Ooooo00();
            if (!bundleOoooo00.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleOoooo00);
            }
            if (fragment.mView != null) {
                OooOOOO();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO0() {
        boolean zOooo0o = FragmentManager.Oooo0o(3);
        Fragment fragment = this.f65046OooO0OO;
        if (zOooo0o) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                boolean zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.Oooo0o(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(zRequestFocus ? TelemetryEventStrings.Value.SUCCEEDED : TelemetryEventStrings.Value.FAILED);
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == fragment.mView) {
                        boolean zRequestFocus2 = focusedView.requestFocus();
                        if (FragmentManager.Oooo0o(2)) {
                        }
                    }
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f65044OooO00o.OooO(fragment, false);
        this.f65045OooO0O0.OooO(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void OooOOOO() {
        Fragment fragment = this.f65046OooO0OO;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f65113OooOoo0.OooO0OO(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public C21914Oooo0oO(C21905OooOooO c21905OooOooO, C21915Oooo0oo c21915Oooo0oo, ClassLoader classLoader, C21901OooOoO0 c21901OooOoO0, Bundle bundle) {
        this.f65044OooO00o = c21905OooOooO;
        this.f65045OooO0O0 = c21915Oooo0oo;
        Fragment fragmentOooO00o = ((FragmentState) bundle.getParcelable("state")).OooO00o(c21901OooOoO0, classLoader);
        this.f65046OooO0OO = fragmentOooO00o;
        fragmentOooO00o.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentOooO00o.setArguments(bundle2);
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentOooO00o);
        }
    }

    public C21914Oooo0oO(C21905OooOooO c21905OooOooO, C21915Oooo0oo c21915Oooo0oo, Fragment fragment, Bundle bundle) {
        this.f65044OooO00o = c21905OooOooO;
        this.f65045OooO0O0 = c21915Oooo0oo;
        this.f65046OooO0OO = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}

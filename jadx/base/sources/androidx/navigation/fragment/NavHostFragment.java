package androidx.navigation.fragment;

import OooO0Oo.C20418OooOoo;
import OooO0Oo.Oooo000;
import Oooo0oO.C21022OooO0OO;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.o00Oo0;
import androidx.navigation.NavBackStackEntryState;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooO0O0;
import kotlin.jvm.internal.OooO0OO;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24578OooOOo;
import o000o0O0.C24586OooOoOO;
import o000o0O0.C24588OooOoo0;
import o000o0O0.C24600Oooo0OO;
import o000o0O0.C24603Oooo0oO;
import o000o0O0.OooOO0;
import o000o0O0.OooOO0O;
import o000o0O0.Oooo0;
import o000o0OO.C24606OooO0OO;
import o000o0OO.C24607OooO0Oo;
import o000o0OO.C24608OooO0o0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Boolean f65729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24586OooOoOO f65730OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f65731OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f65732OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f65733OooOoOO;

    public final C24586OooOoOO OooOoO0() {
        C24586OooOoOO c24586OooOoOO = this.f65730OooOo0o;
        if (c24586OooOoOO != null) {
            return c24586OooOoOO;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        OooOOO0.OooO0oO(context, "context");
        super.onAttach(context);
        if (this.f65733OooOoOO) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(parentFragmentManager);
            oooO00o.OooOOOO(this);
            oooO00o.OooO0oo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.content.Context, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        AbstractC21979OooOOo0 lifecycle;
        ?? RequireContext = requireContext();
        OooOOO0.OooO0o(RequireContext, "requireContext()");
        C24586OooOoOO c24586OooOoOO = new C24586OooOoOO(RequireContext);
        this.f65730OooOo0o = c24586OooOoOO;
        if (!equals(c24586OooOoOO.f83219OooOOO0)) {
            NavHostFragment navHostFragment = c24586OooOoOO.f83219OooOOO0;
            OooOO0O oooOO0O = c24586OooOoOO.f83222OooOOo;
            if (navHostFragment != null && (lifecycle = navHostFragment.getLifecycle()) != null) {
                lifecycle.OooO0OO(oooOO0O);
            }
            c24586OooOoOO.f83219OooOOO0 = this;
            getLifecycle().OooO00o(oooOO0O);
        }
        while (true) {
            if (!(RequireContext instanceof ContextWrapper)) {
                break;
            }
            if (RequireContext instanceof Oooo000) {
                C24586OooOoOO c24586OooOoOO2 = this.f65730OooOo0o;
                OooOOO0.OooO0Oo(c24586OooOoOO2);
                C20418OooOoo onBackPressedDispatcher = ((Oooo000) RequireContext).getOnBackPressedDispatcher();
                OooOOO0.OooO0o(onBackPressedDispatcher, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!onBackPressedDispatcher.equals(c24586OooOoOO2.f83218OooOOO)) {
                    NavHostFragment navHostFragment2 = c24586OooOoOO2.f83219OooOOO0;
                    if (navHostFragment2 == null) {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
                    }
                    C24572OooOO0o.C24574OooO0o0 c24574OooO0o0 = c24586OooOoOO2.f83224OooOOoo;
                    c24574OooO0o0.remove();
                    c24586OooOoOO2.f83218OooOOO = onBackPressedDispatcher;
                    onBackPressedDispatcher.OooO00o(navHostFragment2, c24574OooO0o0);
                    AbstractC21979OooOOo0 lifecycle2 = navHostFragment2.getLifecycle();
                    OooOO0O oooOO0O2 = c24586OooOoOO2.f83222OooOOo;
                    lifecycle2.OooO0OO(oooOO0O2);
                    lifecycle2.OooO00o(oooOO0O2);
                }
            } else {
                RequireContext = ((ContextWrapper) RequireContext).getBaseContext();
                OooOOO0.OooO0o(RequireContext, "context.baseContext");
            }
        }
        C24586OooOoOO c24586OooOoOO3 = this.f65730OooOo0o;
        OooOOO0.OooO0Oo(c24586OooOoOO3);
        Boolean bool = this.f65729OooOo;
        c24586OooOoOO3.f83227OooOo00 = bool != null && bool.booleanValue();
        c24586OooOoOO3.OooOoo0();
        this.f65729OooOo = null;
        C24586OooOoOO c24586OooOoOO4 = this.f65730OooOo0o;
        OooOOO0.OooO0Oo(c24586OooOoOO4);
        C22021o00o0O viewModelStore = getViewModelStore();
        OooOOO0.OooO0o(viewModelStore, "viewModelStore");
        C24578OooOOo c24578OooOOo = c24586OooOoOO4.f83220OooOOOO;
        C24578OooOOo.OooO00o oooO00o = C24578OooOOo.f83260OooO0o0;
        if (!OooOOO0.OooO0O0(c24578OooOOo, (C24578OooOOo) new o00Oo0(viewModelStore, oooO00o, 0).OooO00o(C24578OooOOo.class))) {
            if (!c24586OooOoOO4.f83213OooO0oO.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
            c24586OooOoOO4.f83220OooOOOO = (C24578OooOOo) new o00Oo0(viewModelStore, oooO00o, 0).OooO00o(C24578OooOOo.class);
        }
        C24586OooOoOO c24586OooOoOO5 = this.f65730OooOo0o;
        OooOOO0.OooO0Oo(c24586OooOoOO5);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        OooOOO0.OooO0o(childFragmentManager, "childFragmentManager");
        C24606OooO0OO c24606OooO0OO = new C24606OooO0OO(contextRequireContext, childFragmentManager);
        C24600Oooo0OO c24600Oooo0OO = c24586OooOoOO5.f83226OooOo0;
        c24600Oooo0OO.OooO00o(c24606OooO0OO);
        Context contextRequireContext2 = requireContext();
        OooOOO0.OooO0o(contextRequireContext2, "requireContext()");
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        OooOOO0.OooO0o(childFragmentManager2, "childFragmentManager");
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        c24600Oooo0OO.OooO00o(new C24607OooO0Oo(contextRequireContext2, childFragmentManager2, id));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f65733OooOoOO = true;
                FragmentManager parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                OooO00o oooO00o2 = new OooO00o(parentFragmentManager);
                oooO00o2.OooOOOO(this);
                oooO00o2.OooO0oo();
            }
            this.f65731OooOoO = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            C24586OooOoOO c24586OooOoOO6 = this.f65730OooOo0o;
            OooOOO0.OooO0Oo(c24586OooOoOO6);
            bundle2.setClassLoader(c24586OooOoOO6.f83207OooO00o.getClassLoader());
            c24586OooOoOO6.f83210OooO0Oo = bundle2.getBundle("android-support-nav:controller:navigatorState");
            c24586OooOoOO6.f83212OooO0o0 = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = c24586OooOoOO6.f83217OooOO0o;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    c24586OooOoOO6.f83216OooOO0O.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String id2 : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                    if (parcelableArray != null) {
                        OooOOO0.OooO0o(id2, "id");
                        C34426OooOO0o c34426OooOO0o = new C34426OooOO0o(parcelableArray.length);
                        OooO0O0 OooO0O02 = OooO0OO.OooO0O0(parcelableArray);
                        while (OooO0O02.hasNext()) {
                            Parcelable parcelable = (Parcelable) OooO0O02.next();
                            if (parcelable == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                            c34426OooOO0o.addLast((NavBackStackEntryState) parcelable);
                        }
                        linkedHashMap.put(id2, c34426OooOO0o);
                    }
                }
            }
            c24586OooOoOO6.f83211OooO0o = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f65731OooOoO != 0) {
            C24586OooOoOO c24586OooOoOO7 = this.f65730OooOo0o;
            OooOOO0.OooO0Oo(c24586OooOoOO7);
            c24586OooOoOO7.OooOoO0(((C24588OooOoo0) c24586OooOoOO7.f83234OooOoo0.getValue()).OooO0O0(this.f65731OooOoO), null);
        } else {
            Bundle arguments = getArguments();
            int i3 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i3 != 0) {
                C24586OooOoOO c24586OooOoOO8 = this.f65730OooOo0o;
                OooOOO0.OooO0Oo(c24586OooOoOO8);
                c24586OooOoOO8.OooOoO0(((C24588OooOoo0) c24586OooOoOO8.f83234OooOoo0.getValue()).OooO0O0(i3), bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        Context context = inflater.getContext();
        OooOOO0.OooO0o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f65732OooOoO0;
        if (view != null && C21022OooO0OO.OooO0O0(view) == this.f65730OooOo0o) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f65732OooOoO0 = null;
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
            this.f65731OooOoO = resourceId;
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C24608OooO0o0.f83390OooO0OO);
        OooOOO0.OooO0o(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f65733OooOoOO = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrimaryNavigationFragmentChanged(boolean z) {
        C24586OooOoOO c24586OooOoOO = this.f65730OooOo0o;
        if (c24586OooOoOO == null) {
            this.f65729OooOo = Boolean.valueOf(z);
        } else {
            c24586OooOoOO.f83227OooOo00 = z;
            c24586OooOoOO.OooOoo0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Bundle bundle;
        OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        C24586OooOoOO c24586OooOoOO = this.f65730OooOo0o;
        OooOOO0.OooO0Oo(c24586OooOoOO);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : C34444Oooo0O0.OooOOO0(c24586OooOoOO.f83226OooOo0.f83365OooO00o).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleOooO0oo = ((Oooo0) entry.getValue()).OooO0oo();
            if (bundleOooO0oo != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleOooO0oo);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C34426OooOO0o<OooOO0> c34426OooOO0o = c24586OooOoOO.f83213OooO0oO;
        if (!c34426OooOO0o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c34426OooOO0o.f123447OooOoO0];
            Iterator<OooOO0> it = c34426OooOO0o.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c24586OooOoOO.f83216OooOO0O;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str2);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c24586OooOoOO.f83217OooOO0o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                C34426OooOO0o c34426OooOO0o2 = (C34426OooOO0o) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[c34426OooOO0o2.f123447OooOoO0];
                int i3 = 0;
                for (Object obj : c34426OooOO0o2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c24586OooOoOO.f83211OooO0o) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c24586OooOoOO.f83211OooO0o);
        }
        if (bundle != null) {
            outState.putBundle("android-support-nav:fragment:navControllerState", bundle);
        }
        if (this.f65733OooOoOO) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i5 = this.f65731OooOoO;
        if (i5 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, this.f65730OooOo0o);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view2 = (View) parent;
            this.f65732OooOoO0 = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f65732OooOoO0;
                OooOOO0.OooO0Oo(view3);
                view3.setTag(R.id.nav_controller_view_tag, this.f65730OooOo0o);
            }
        }
    }
}

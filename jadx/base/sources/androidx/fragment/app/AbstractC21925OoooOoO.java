package androidx.fragment.app;

import OooO0o.C20424OooO0Oo;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.fragment.app.C21885OooO0Oo;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: androidx.fragment.app.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21925OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ViewGroup f65077OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f65078OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f65079OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f65080OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f65081OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f65082OooO0o0;

    /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f65083OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f65084OooO0O0;

        public boolean OooO00o() {
            return this instanceof C21885OooO0Oo.OooO0OO;
        }

        public void OooO0O0(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        }

        public void OooO0OO(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        }

        public void OooO0Oo(OooO0Oo.OooO0OO oooO0OO, ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        }

        public void OooO0o0(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO0O0 */
    public static final class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final C21914Oooo0oO f65085OooOO0o;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0O0(OooO0OO.OooO0O0 oooO0O0, OooO0OO.OooO00o oooO00o, C21914Oooo0oO c21914Oooo0oO) {
            Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(fragment, "fragmentStateManager.fragment");
            super(oooO0O0, oooO00o, fragment);
            this.f65085OooOO0o = c21914Oooo0oO;
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO0OO
        public final void OooO0O0() {
            super.OooO0O0();
            this.f65089OooO0OO.mTransitioning = false;
            this.f65085OooOO0o.OooOO0O();
        }

        @Override // androidx.fragment.app.AbstractC21925OoooOoO.OooO0OO
        public final void OooO0o0() {
            if (this.f65094OooO0oo) {
                return;
            }
            this.f65094OooO0oo = true;
            OooO0OO.OooO00o oooO00o = this.f65088OooO0O0;
            OooO0OO.OooO00o oooO00o2 = OooO0OO.OooO00o.f65097OooOo;
            C21914Oooo0oO c21914Oooo0oO = this.f65085OooOO0o;
            if (oooO00o != oooO00o2) {
                if (oooO00o == OooO0OO.OooO00o.f65100OooOoO0) {
                    Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.f65089OooO0OO.requireView();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                c21914Oooo0oO.OooO0O0();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f65086OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0O0 f65087OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f65088OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Fragment f65089OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f65090OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f65091OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f65092OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f65093OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f65094OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ArrayList f65095OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ArrayList f65096OooOO0O;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO0OO$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO00o f65097OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO00o f65098OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ OooO00o[] f65099OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final OooO00o f65100OooOoO0;

            static {
                OooO00o oooO00o = new OooO00o("NONE", 0);
                f65098OooOo0o = oooO00o;
                OooO00o oooO00o2 = new OooO00o("ADDING", 1);
                f65097OooOo = oooO00o2;
                OooO00o oooO00o3 = new OooO00o("REMOVING", 2);
                f65100OooOoO0 = oooO00o3;
                f65099OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
            }

            public OooO00o() {
                throw null;
            }

            public static OooO00o valueOf(String str) {
                return (OooO00o) Enum.valueOf(OooO00o.class, str);
            }

            public static OooO00o[] values() {
                return (OooO00o[]) f65099OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO0OO$OooO0O0 */
        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO0O0 f65101OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO0O0 f65102OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final OooO0O0 f65103OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final OooO0O0 f65104OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public static final /* synthetic */ OooO0O0[] f65105OooOoOO;

            static {
                OooO0O0 oooO0O0 = new OooO0O0("REMOVED", 0);
                f65102OooOo0o = oooO0O0;
                OooO0O0 oooO0O02 = new OooO0O0("VISIBLE", 1);
                f65101OooOo = oooO0O02;
                OooO0O0 oooO0O03 = new OooO0O0("GONE", 2);
                f65104OooOoO0 = oooO0O03;
                OooO0O0 oooO0O04 = new OooO0O0("INVISIBLE", 3);
                f65103OooOoO = oooO0O04;
                f65105OooOoOO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04};
            }

            public OooO0O0() {
                throw null;
            }

            public static OooO0O0 valueOf(String str) {
                return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
            }

            public static OooO0O0[] values() {
                return (OooO0O0[]) f65105OooOoOO.clone();
            }

            public final void OooO00o(View view, ViewGroup container) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
                kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public OooO0OO(OooO0O0 oooO0O0, OooO00o oooO00o, Fragment fragment) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
            this.f65087OooO00o = oooO0O0;
            this.f65088OooO0O0 = oooO00o;
            this.f65089OooO0OO = fragment;
            this.f65090OooO0Oo = new ArrayList();
            this.f65086OooO = true;
            ArrayList arrayList = new ArrayList();
            this.f65095OooOO0 = arrayList;
            this.f65096OooOO0O = arrayList;
        }

        public final void OooO00o(ViewGroup container) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            this.f65094OooO0oo = false;
            if (this.f65092OooO0o0) {
                return;
            }
            this.f65092OooO0o0 = true;
            if (this.f65095OooOO0.isEmpty()) {
                OooO0O0();
                return;
            }
            for (OooO00o oooO00o : oOo000Oo.OooOo.o0ooOO0(this.f65096OooOO0O)) {
                oooO00o.getClass();
                if (!oooO00o.f65084OooO0O0) {
                    oooO00o.OooO0O0(container);
                }
                oooO00o.f65084OooO0O0 = true;
            }
        }

        public void OooO0O0() {
            this.f65094OooO0oo = false;
            if (this.f65091OooO0o) {
                return;
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f65091OooO0o = true;
            Iterator it = this.f65090OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void OooO0OO(OooO00o effect) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(effect, "effect");
            ArrayList arrayList = this.f65095OooOO0;
            if (arrayList.remove(effect) && arrayList.isEmpty()) {
                OooO0O0();
            }
        }

        public final void OooO0Oo(OooO0O0 oooO0O0, OooO00o oooO00o) {
            int iOrdinal = oooO00o.ordinal();
            OooO0O0 oooO0O02 = OooO0O0.f65102OooOo0o;
            Fragment fragment = this.f65089OooO0OO;
            if (iOrdinal == 0) {
                if (this.f65087OooO00o != oooO0O02) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f65087OooO00o + " -> " + oooO0O0 + FilenameUtils.EXTENSION_SEPARATOR);
                    }
                    this.f65087OooO00o = oooO0O0;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f65087OooO00o == oooO0O02) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f65088OooO0O0 + " to ADDING.");
                    }
                    this.f65087OooO00o = OooO0O0.f65101OooOo;
                    this.f65088OooO0O0 = OooO00o.f65097OooOo;
                    this.f65086OooO = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f65087OooO00o + " -> REMOVED. mLifecycleImpact  = " + this.f65088OooO0O0 + " to REMOVING.");
            }
            this.f65087OooO00o = oooO0O02;
            this.f65088OooO0O0 = OooO00o.f65100OooOoO0;
            this.f65086OooO = true;
        }

        public void OooO0o0() {
            this.f65094OooO0oo = true;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbOooO0o0.append(this.f65087OooO00o);
            sbOooO0o0.append(" lifecycleImpact = ");
            sbOooO0o0.append(this.f65088OooO0O0);
            sbOooO0o0.append(" fragment = ");
            sbOooO0o0.append(this.f65089OooO0OO);
            sbOooO0o0.append('}');
            return sbOooO0o0.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooOoO$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C21926OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f65106OooO00o;

        static {
            int[] iArr = new int[OooO0OO.OooO00o.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f65106OooO00o = iArr;
        }
    }

    public AbstractC21925OoooOoO(ViewGroup container) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        this.f65077OooO00o = container;
        this.f65078OooO0O0 = new ArrayList();
        this.f65079OooO0OO = new ArrayList();
    }

    public static final AbstractC21925OoooOoO OooO(ViewGroup container, FragmentManager fragmentManager) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.OooOOO0.OooO0o(fragmentManager.Oooo0OO(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AbstractC21925OoooOoO) {
            return (AbstractC21925OoooOoO) tag;
        }
        C21885OooO0Oo c21885OooO0Oo = new C21885OooO0Oo(container);
        container.setTag(R.id.special_effects_controller_view_tag, c21885OooO0Oo);
        return c21885OooO0Oo;
    }

    public static boolean OooOO0(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                OooO0OO oooO0OO = (OooO0OO) it.next();
                if (!oooO0OO.f65096OooOO0O.isEmpty()) {
                    ArrayList arrayList2 = oooO0OO.f65096OooOO0O;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((OooO00o) it2.next()).OooO00o()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C34431OooOo0.OooOo0o(arrayList3, ((OooO0OO) it3.next()).f65096OooOO0O);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO00o(OooO0OO operation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "operation");
        if (operation.f65086OooO) {
            OooO0OO.OooO0O0 oooO0O0 = operation.f65087OooO00o;
            View viewRequireView = operation.f65089OooO0OO.requireView();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "operation.fragment.requireView()");
            oooO0O0.OooO00o(viewRequireView, this.f65077OooO00o);
            operation.f65086OooO = false;
        }
    }

    public abstract void OooO0O0(ArrayList arrayList, boolean z);

    public final void OooO0OO(ArrayList operations) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, ((OooO0OO) it.next()).f65096OooOO0O);
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(oOo000Oo.OooOo.o0OO00O(arrayList));
        int size = listO0ooOO0.size();
        for (int i = 0; i < size; i++) {
            ((OooO00o) listO0ooOO0.get(i)).OooO0OO(this.f65077OooO00o);
        }
        int size2 = operations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            OooO00o((OooO0OO) operations.get(i2));
        }
        List listO0ooOO02 = oOo000Oo.OooOo.o0ooOO0(operations);
        int size3 = listO0ooOO02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            OooO0OO oooO0OO = (OooO0OO) listO0ooOO02.get(i3);
            if (oooO0OO.f65096OooOO0O.isEmpty()) {
                oooO0OO.OooO0O0();
            }
        }
    }

    public final void OooO0Oo(OooO0OO.OooO0O0 oooO0O0, OooO0OO.OooO00o oooO00o, C21914Oooo0oO c21914Oooo0oO) {
        synchronized (this.f65078OooO0O0) {
            try {
                Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0o(fragment, "fragmentStateManager.fragment");
                OooO0OO oooO0OOOooO0o = OooO0o(fragment);
                if (oooO0OOOooO0o == null) {
                    Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                    oooO0OOOooO0o = fragment2.mTransitioning ? OooO0oO(fragment2) : null;
                }
                if (oooO0OOOooO0o != null) {
                    oooO0OOOooO0o.OooO0Oo(oooO0O0, oooO00o);
                    return;
                }
                final OooO0O0 oooO0O02 = new OooO0O0(oooO0O0, oooO00o, c21914Oooo0oO);
                this.f65078OooO0O0.add(oooO0O02);
                oooO0O02.f65090OooO0Oo.add(new Runnable() { // from class: androidx.fragment.app.OoooOOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC21925OoooOoO this$0 = this.f65074OooOo0o;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        AbstractC21925OoooOoO.OooO0O0 oooO0O03 = oooO0O02;
                        if (this$0.f65078OooO0O0.contains(oooO0O03)) {
                            AbstractC21925OoooOoO.OooO0OO.OooO0O0 oooO0O04 = oooO0O03.f65087OooO00o;
                            View view = oooO0O03.f65089OooO0OO.mView;
                            kotlin.jvm.internal.OooOOO0.OooO0o(view, "operation.fragment.mView");
                            oooO0O04.OooO00o(view, this$0.f65077OooO00o);
                        }
                    }
                });
                oooO0O02.f65090OooO0Oo.add(new Runnable() { // from class: androidx.fragment.app.OoooOo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC21925OoooOoO this$0 = this.f65076OooOo0o;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        AbstractC21925OoooOoO.OooO0O0 oooO0O03 = oooO0O02;
                        this$0.f65078OooO0O0.remove(oooO0O03);
                        this$0.f65079OooO0OO.remove(oooO0O03);
                    }
                });
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final OooO0OO OooO0o(Fragment fragment) {
        Object next;
        Iterator it = this.f65078OooO0O0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OooO0OO oooO0OO = (OooO0OO) next;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO.f65089OooO0OO, fragment) && !oooO0OO.f65092OooO0o0) {
                break;
            }
        }
        return (OooO0OO) next;
    }

    public final void OooO0o0() {
        if (this.f65081OooO0o) {
            return;
        }
        if (!this.f65077OooO00o.isAttachedToWindow()) {
            OooO0oo();
            this.f65082OooO0o0 = false;
            return;
        }
        synchronized (this.f65078OooO0O0) {
            try {
                ArrayList<OooO0OO> arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(this.f65079OooO0OO);
                this.f65079OooO0OO.clear();
                for (OooO0OO oooO0OO : arrayListO0ooOoO) {
                    oooO0OO.f65093OooO0oO = !this.f65078OooO0O0.isEmpty() && oooO0OO.f65089OooO0OO.mTransitioning;
                }
                for (OooO0OO oooO0OO2 : arrayListO0ooOoO) {
                    if (this.f65080OooO0Oo) {
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + oooO0OO2);
                        }
                        oooO0OO2.OooO0O0();
                    } else {
                        if (FragmentManager.Oooo0o(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + oooO0OO2);
                        }
                        oooO0OO2.OooO00o(this.f65077OooO00o);
                    }
                    this.f65080OooO0Oo = false;
                    if (!oooO0OO2.f65091OooO0o) {
                        this.f65079OooO0OO.add(oooO0OO2);
                    }
                }
                if (!this.f65078OooO0O0.isEmpty()) {
                    OooOOO0();
                    ArrayList arrayListO0ooOoO2 = oOo000Oo.OooOo.o0ooOoO(this.f65078OooO0O0);
                    if (arrayListO0ooOoO2.isEmpty()) {
                        return;
                    }
                    this.f65078OooO0O0.clear();
                    this.f65079OooO0OO.addAll(arrayListO0ooOoO2);
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    OooO0O0(arrayListO0ooOoO2, this.f65082OooO0o0);
                    boolean zOooOO0 = OooOO0(arrayListO0ooOoO2);
                    Iterator it = arrayListO0ooOoO2.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        if (!((OooO0OO) it.next()).f65089OooO0OO.mTransitioning) {
                            z = false;
                        }
                    }
                    this.f65080OooO0Oo = z && !zOooOO0;
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zOooOO0 + " \ntransition = " + z);
                    }
                    if (!z) {
                        OooOO0o(arrayListO0ooOoO2);
                        OooO0OO(arrayListO0ooOoO2);
                    } else if (zOooOO0) {
                        OooOO0o(arrayListO0ooOoO2);
                        int size = arrayListO0ooOoO2.size();
                        for (int i = 0; i < size; i++) {
                            OooO00o((OooO0OO) arrayListO0ooOoO2.get(i));
                        }
                    }
                    this.f65082OooO0o0 = false;
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final OooO0OO OooO0oO(Fragment fragment) {
        Object next;
        Iterator it = this.f65079OooO0OO.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OooO0OO oooO0OO = (OooO0OO) next;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0OO.f65089OooO0OO, fragment) && !oooO0OO.f65092OooO0o0) {
                break;
            }
        }
        return (OooO0OO) next;
    }

    public final void OooO0oo() {
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f65077OooO00o.isAttachedToWindow();
        synchronized (this.f65078OooO0O0) {
            try {
                OooOOO0();
                OooOO0o(this.f65078OooO0O0);
                ArrayList<OooO0OO> arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(this.f65079OooO0OO);
                Iterator it = arrayListO0ooOoO.iterator();
                while (it.hasNext()) {
                    ((OooO0OO) it.next()).f65093OooO0oO = false;
                }
                for (OooO0OO oooO0OO : arrayListO0ooOoO) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f65077OooO00o + " is not attached to window. ") + "Cancelling running operation " + oooO0OO);
                    }
                    oooO0OO.OooO00o(this.f65077OooO00o);
                }
                ArrayList<OooO0OO> arrayListO0ooOoO2 = oOo000Oo.OooOo.o0ooOoO(this.f65078OooO0O0);
                Iterator it2 = arrayListO0ooOoO2.iterator();
                while (it2.hasNext()) {
                    ((OooO0OO) it2.next()).f65093OooO0oO = false;
                }
                for (OooO0OO oooO0OO2 : arrayListO0ooOoO2) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f65077OooO00o + " is not attached to window. ") + "Cancelling pending operation " + oooO0OO2);
                    }
                    oooO0OO2.OooO00o(this.f65077OooO00o);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O() {
        Object objPrevious;
        OooO0OO.OooO0O0 oooO0O0;
        synchronized (this.f65078OooO0O0) {
            try {
                OooOOO0();
                ArrayList arrayList = this.f65078OooO0O0;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    OooO0OO oooO0OO = (OooO0OO) objPrevious;
                    View view = oooO0OO.f65089OooO0OO.mView;
                    kotlin.jvm.internal.OooOOO0.OooO0o(view, "operation.fragment.mView");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        oooO0O0 = OooO0OO.OooO0O0.f65103OooOoO;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            oooO0O0 = OooO0OO.OooO0O0.f65101OooOo;
                        } else if (visibility == 4) {
                            oooO0O0 = OooO0OO.OooO0O0.f65103OooOoO;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            oooO0O0 = OooO0OO.OooO0O0.f65104OooOoO0;
                        }
                    }
                    OooO0OO.OooO0O0 oooO0O02 = oooO0OO.f65087OooO00o;
                    OooO0OO.OooO0O0 oooO0O03 = OooO0OO.OooO0O0.f65101OooOo;
                    if (oooO0O02 == oooO0O03 && oooO0O0 != oooO0O03) {
                        break;
                    }
                }
                OooO0OO oooO0OO2 = (OooO0OO) objPrevious;
                Fragment fragment = oooO0OO2 != null ? oooO0OO2.f65089OooO0OO : null;
                this.f65081OooO0o = fragment != null ? fragment.isPostponed() : false;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OooO0OO) arrayList.get(i)).OooO0o0();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList2, ((OooO0OO) it.next()).f65096OooOO0O);
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(oOo000Oo.OooOo.o0OO00O(arrayList2));
        int size2 = listO0ooOO0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            OooO00o oooO00o = (OooO00o) listO0ooOO0.get(i2);
            oooO00o.getClass();
            ViewGroup container = this.f65077OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            if (!oooO00o.f65083OooO00o) {
                oooO00o.OooO0o0(container);
            }
            oooO00o.f65083OooO00o = true;
        }
    }

    public final void OooOOO0() {
        OooO0OO.OooO0O0 oooO0O0;
        for (OooO0OO oooO0OO : this.f65078OooO0O0) {
            if (oooO0OO.f65088OooO0O0 == OooO0OO.OooO00o.f65097OooOo) {
                View viewRequireView = oooO0OO.f65089OooO0OO.requireView();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    oooO0O0 = OooO0OO.OooO0O0.f65101OooOo;
                } else if (visibility == 4) {
                    oooO0O0 = OooO0OO.OooO0O0.f65103OooOoO;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(visibility, "Unknown visibility "));
                    }
                    oooO0O0 = OooO0OO.OooO0O0.f65104OooOoO0;
                }
                oooO0OO.OooO0Oo(oooO0O0, OooO0OO.OooO00o.f65098OooOo0o);
            }
        }
    }
}

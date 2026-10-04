package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.AbstractC21921OoooOO0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.RunnableC21889OooO0o0;
import androidx.transition.C22102OooOOo;
import androidx.transition.OooOOO0;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22093OooO0o0 extends AbstractC21921OoooOO0 {

    /* JADX INFO: renamed from: androidx.transition.OooO0o0$OooO00o */
    public class OooO00o extends OooOOO0.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f66343OooO00o;

        public OooO00o(Rect rect) {
            this.f66343OooO00o = rect;
        }

        @Override // androidx.transition.OooOOO0.OooO0o
        public final Rect OooO00o() {
            return this.f66343OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0o0$OooO0O0 */
    public class OooO0O0 implements OooOOO0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ View f66344OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f66345OooO0O0;

        public OooO0O0(View view, ArrayList arrayList) {
            this.f66344OooO00o = view;
            this.f66345OooO0O0 = arrayList;
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            oooOOO0.removeListener(this);
            this.f66344OooO00o.setVisibility(8);
            ArrayList arrayList = this.f66345OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionPause(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionResume(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0) {
            oooOOO0.removeListener(this);
            oooOOO0.addListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0o0$OooO0OO */
    public class OooO0OO extends OooOOO0.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f66346OooO00o;

        public OooO0OO(Rect rect) {
            this.f66346OooO00o = rect;
        }

        @Override // androidx.transition.OooOOO0.OooO0o
        public final Rect OooO00o() {
            Rect rect = this.f66346OooO00o;
            if (rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean OooOoO(OooOOO0 oooOOO0) {
        return (AbstractC21921OoooOO0.OooOO0O(oooOOO0.getTargetIds()) && AbstractC21921OoooOO0.OooOO0O(oooOOO0.getTargetNames()) && AbstractC21921OoooOO0.OooOO0O(oooOOO0.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooO(ViewGroup viewGroup, Object obj) {
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        ArrayList<ViewGroup> arrayList = C22102OooOOo.f66376OooO0OO;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!oooOOO0.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        OooOOO0 oooOOO0Mo80680clone = oooOOO0.mo80680clone();
        C22105OooOo0 c22105OooOo0 = new C22105OooOo0();
        c22105OooOo0.OooO00o(oooOOO0Mo80680clone);
        C22102OooOOo.OooO0OO(viewGroup, c22105OooOo0);
        viewGroup.setTag(R.id.transition_current_scene, null);
        C22102OooOOo.OooO00o oooO00o = new C22102OooOOo.OooO00o();
        oooO00o.f66378OooOo0o = c22105OooOo0;
        oooO00o.f66377OooOo = viewGroup;
        viewGroup.addOnAttachStateChangeListener(oooO00o);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(oooO00o);
        viewGroup.invalidate();
        return c22105OooOo0.createSeekController();
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO00o(Object obj, View view) {
        ((OooOOO0) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0O0(ArrayList arrayList, Object obj) {
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (oooOOO0 == null) {
            return;
        }
        int i = 0;
        if (oooOOO0 instanceof C22105OooOo0) {
            C22105OooOo0 c22105OooOo0 = (C22105OooOo0) oooOOO0;
            int size = c22105OooOo0.f66386OooOo0o.size();
            while (i < size) {
                OooO0O0(arrayList, c22105OooOo0.OooO0O0(i));
                i++;
            }
            return;
        }
        if (OooOoO(oooOOO0) || !AbstractC21921OoooOO0.OooOO0O(oooOOO0.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            oooOOO0.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0OO(Object obj) {
        ((OooOo00) obj).OooO0O0();
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0Oo(Object obj, androidx.fragment.app.OooOO0O oooOO0O) {
        ((OooOo00) obj).OooO00o(oooOO0O);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0o0(ViewGroup viewGroup, Object obj) {
        C22102OooOOo.OooO00o(viewGroup, (OooOOO0) obj);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooO0oO(Object obj) {
        return obj instanceof OooOOO0;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooO0oo(Object obj) {
        if (obj != null) {
            return ((OooOOO0) obj).mo80680clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooOO0o() {
        return true;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOOO(Object obj, Object obj2, Object obj3) {
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        OooOOO0 oooOOO02 = (OooOOO0) obj2;
        OooOOO0 oooOOO03 = (OooOOO0) obj3;
        if (oooOOO0 != null && oooOOO02 != null) {
            C22105OooOo0 c22105OooOo0 = new C22105OooOo0();
            c22105OooOo0.OooO00o(oooOOO0);
            c22105OooOo0.OooO00o(oooOOO02);
            c22105OooOo0.OooO0o(1);
            oooOOO0 = c22105OooOo0;
        } else if (oooOOO0 == null) {
            oooOOO0 = oooOOO02 != null ? oooOOO02 : null;
        }
        if (oooOOO03 == null) {
            return oooOOO0;
        }
        C22105OooOo0 c22105OooOo02 = new C22105OooOo0();
        if (oooOOO0 != null) {
            c22105OooOo02.OooO00o(oooOOO0);
        }
        c22105OooOo02.OooO00o(oooOOO03);
        return c22105OooOo02;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooOOO0(Object obj) {
        boolean zIsSeekingSupported = ((OooOOO0) obj).isSeekingSupported();
        if (!zIsSeekingSupported) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zIsSeekingSupported;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOOOO(Object obj, Object obj2) {
        C22105OooOo0 c22105OooOo0 = new C22105OooOo0();
        if (obj != null) {
            c22105OooOo0.OooO00o((OooOOO0) obj);
        }
        c22105OooOo0.OooO00o((OooOOO0) obj2);
        return c22105OooOo0;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOOo(Object obj, View view, ArrayList<View> arrayList) {
        ((OooOOO0) obj).addListener(new OooO0O0(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOo(Object obj, float f) {
        OooOo00 oooOo00 = (OooOo00) obj;
        if (oooOo00.isReady()) {
            long jOooO0OO = (long) (f * oooOo00.OooO0OO());
            if (jOooO0OO == 0) {
                jOooO0OO = 1;
            }
            if (jOooO0OO == oooOo00.OooO0OO()) {
                jOooO0OO = oooOo00.OooO0OO() - 1;
            }
            oooOo00.OooO0Oo(jOooO0OO);
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOo0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((OooOOO0) obj).addListener(new OooO0o(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOoo(Object obj, Rect rect) {
        ((OooOOO0) obj).setEpicenterCallback(new OooO0OO(rect));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C22105OooOo0 c22105OooOo0 = (C22105OooOo0) obj;
        if (c22105OooOo0 != null) {
            c22105OooOo0.getTargets().clear();
            c22105OooOo0.getTargets().addAll(arrayList2);
            OooOoOO(c22105OooOo0, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo0(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        OooOo0O(obj, cancellationSignal, null, runnable);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo00(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC21921OoooOO0.OooOO0(rect, view);
            ((OooOOO0) obj).setEpicenterCallback(new OooO00o(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo0O(Object obj, CancellationSignal cancellationSignal, final RunnableC21889OooO0o0 runnableC21889OooO0o0, final Runnable runnable) {
        final OooOOO0 oooOOO0 = (OooOOO0) obj;
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.transition.OooO0Oo
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                RunnableC21889OooO0o0 runnableC21889OooO0o02 = runnableC21889OooO0o0;
                if (runnableC21889OooO0o02 != null) {
                    runnableC21889OooO0o02.run();
                } else {
                    oooOOO0.cancel();
                    runnable.run();
                }
            }
        });
        oooOOO0.addListener(new C22094OooO0oO(runnable));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo0o(Object obj, View view, ArrayList<View> arrayList) {
        C22105OooOo0 c22105OooOo0 = (C22105OooOo0) obj;
        List<View> targets = c22105OooOo0.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC21921OoooOO0.OooO0o(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        OooO0O0(arrayList, c22105OooOo0);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOoO0(Object obj) {
        if (obj == null) {
            return null;
        }
        C22105OooOo0 c22105OooOo0 = new C22105OooOo0();
        c22105OooOo0.OooO00o((OooOOO0) obj);
        return c22105OooOo0;
    }

    public final void OooOoOO(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        int i = 0;
        if (oooOOO0 instanceof C22105OooOo0) {
            C22105OooOo0 c22105OooOo0 = (C22105OooOo0) oooOOO0;
            int size = c22105OooOo0.f66386OooOo0o.size();
            while (i < size) {
                OooOoOO(c22105OooOo0.OooO0O0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (OooOoO(oooOOO0)) {
            return;
        }
        List<View> targets = oooOOO0.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size2) {
                oooOOO0.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                oooOOO0.removeTarget(arrayList.get(size3));
            }
        }
    }
}

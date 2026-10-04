package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21917OoooO0 extends AbstractC21921OoooOO0 {

    /* JADX INFO: renamed from: androidx.fragment.app.OoooO0$OooO00o */
    public class OooO00o extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f65059OooO00o;

        public OooO00o(Rect rect) {
            this.f65059OooO00o = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f65059OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooO0$OooO0O0 */
    public class OooO0O0 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ View f65060OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f65061OooO0O0;

        public OooO0O0(View view, ArrayList arrayList) {
            this.f65060OooO00o = view;
            this.f65061OooO0O0 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f65060OooO00o.setVisibility(8);
            ArrayList arrayList = this.f65061OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooO0$OooO0OO */
    public class OooO0OO implements Transition.TransitionListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Runnable f65062OooO00o;

        public OooO0OO(Runnable runnable) {
            this.f65062OooO00o = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            this.f65062OooO00o.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OoooO0$OooO0Oo, reason: case insensitive filesystem */
    public class C21918OooO0Oo extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f65063OooO00o;

        public C21918OooO0Oo(Rect rect) {
            this.f65063OooO00o = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f65063OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean OooOoO(Transition transition) {
        return (AbstractC21921OoooOO0.OooOO0O(transition.getTargetIds()) && AbstractC21921OoooOO0.OooOO0O(transition.getTargetNames()) && AbstractC21921OoooOO0.OooOO0O(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO00o(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0O0(ArrayList arrayList, Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooO0O0(arrayList, transitionSet.getTransitionAt(i));
                i++;
            }
            return;
        }
        if (OooOoO(transition) || !AbstractC21921OoooOO0.OooOO0O(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooO0o0(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooO0oO(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooO0oo(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooOO0o() {
        if (!FragmentManager.Oooo0o(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOOO(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final boolean OooOOO0(Object obj) {
        if (!FragmentManager.Oooo0o(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOOOO(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOOo(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new OooO0O0(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOo0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C21920OoooO0O(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOOoo(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C21918OooO0Oo(rect));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            OooOoOO(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo0(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        ((Transition) obj).addListener(new OooO0OO(runnable));
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo00(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC21921OoooOO0.OooOO0(rect, view);
            ((Transition) obj).setEpicenterCallback(new OooO00o(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final void OooOo0o(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC21921OoooOO0.OooO0o(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        OooO0O0(arrayList, transitionSet);
    }

    @Override // androidx.fragment.app.AbstractC21921OoooOO0
    public final Object OooOoO0(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void OooOoOO(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooOoOO(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (OooOoO(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}

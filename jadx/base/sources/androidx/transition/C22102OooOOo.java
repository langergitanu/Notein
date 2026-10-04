package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.transition.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22102OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final androidx.transition.OooO00o f66374OooO00o = new androidx.transition.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>>>> f66375OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f66376OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.transition.OooOOo$OooO00o */
    public static class OooO00o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ViewGroup f66377OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public OooOOO0 f66378OooOo0o;

        /* JADX INFO: renamed from: androidx.transition.OooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19043OooO00o extends C22103OooOOo0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooOo.OooO00o f66379OooO00o;

            public C19043OooO00o(OooOo.OooO00o oooO00o) {
                this.f66379OooO00o = oooO00o;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
            public final void onTransitionEnd(OooOOO0 oooOOO0) {
                ((ArrayList) this.f66379OooO00o.get(OooO00o.this.f66377OooOo)).remove(oooOOO0);
                oooOOO0.removeListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.f66377OooOo;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = C22102OooOOo.f66376OooO0OO;
            ViewGroup viewGroup2 = this.f66377OooOo;
            if (!arrayList.remove(viewGroup2)) {
                return true;
            }
            OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>> oooO00oOooO0O0 = C22102OooOOo.OooO0O0();
            ArrayList<OooOOO0> arrayList2 = oooO00oOooO0O0.get(viewGroup2);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                oooO00oOooO0O0.put(viewGroup2, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList3 = new ArrayList(arrayList2);
            }
            OooOOO0 oooOOO0 = this.f66378OooOo0o;
            arrayList2.add(oooOOO0);
            oooOOO0.addListener(new C19043OooO00o(oooO00oOooO0O0));
            oooOOO0.captureValues(viewGroup2, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((OooOOO0) it.next()).resume(viewGroup2);
                }
            }
            oooOOO0.playTransition(viewGroup2);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f66377OooOo;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = C22102OooOOo.f66376OooO0OO;
            ViewGroup viewGroup2 = this.f66377OooOo;
            arrayList.remove(viewGroup2);
            ArrayList<OooOOO0> arrayList2 = C22102OooOOo.OooO0O0().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<OooOOO0> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup2);
                }
            }
            this.f66378OooOo0o.clearValues(true);
        }
    }

    public static void OooO00o(ViewGroup viewGroup, OooOOO0 oooOOO0) {
        ArrayList<ViewGroup> arrayList = f66376OooO0OO;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (oooOOO0 == null) {
            oooOOO0 = f66374OooO00o;
        }
        OooOOO0 oooOOO0Mo80680clone = oooOOO0.mo80680clone();
        OooO0OO(viewGroup, oooOOO0Mo80680clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (oooOOO0Mo80680clone != null) {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f66378OooOo0o = oooOOO0Mo80680clone;
            oooO00o.f66377OooOo = viewGroup;
            viewGroup.addOnAttachStateChangeListener(oooO00o);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(oooO00o);
        }
    }

    public static OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>> OooO0O0() {
        OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>> oooO00o;
        ThreadLocal<WeakReference<OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>>>> threadLocal = f66375OooO0O0;
        WeakReference<OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>>> weakReference = threadLocal.get();
        if (weakReference != null && (oooO00o = weakReference.get()) != null) {
            return oooO00o;
        }
        OooOo.OooO00o<ViewGroup, ArrayList<OooOOO0>> oooO00o2 = new OooOo.OooO00o<>();
        threadLocal.set(new WeakReference<>(oooO00o2));
        return oooO00o2;
    }

    public static void OooO0OO(ViewGroup viewGroup, OooOOO0 oooOOO0) {
        ArrayList<OooOOO0> arrayList = OooO0O0().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<OooOOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (oooOOO0 != null) {
            oooOOO0.captureValues(viewGroup, true);
        }
        if (((OooOO0O) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}

package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21921OoooOO0 {
    public static void OooO0o(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        if (ViewCompat.getTransitionName(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (ViewCompat.getTransitionName(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void OooOO0(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean OooOO0O(List list) {
        return list == null || list.isEmpty();
    }

    public Object OooO(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract void OooO00o(Object obj, View view);

    public abstract void OooO0O0(ArrayList arrayList, Object obj);

    public void OooO0OO(Object obj) {
    }

    public void OooO0Oo(Object obj, OooOO0O oooOO0O) {
    }

    public abstract void OooO0o0(ViewGroup viewGroup, Object obj);

    public abstract boolean OooO0oO(Object obj);

    public abstract Object OooO0oo(Object obj);

    public boolean OooOO0o() {
        if (!FragmentManager.Oooo0o(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public abstract Object OooOOO(Object obj, Object obj2, Object obj3);

    public boolean OooOOO0(Object obj) {
        return false;
    }

    public abstract Object OooOOOO(Object obj, Object obj2);

    public abstract void OooOOOo(Object obj, View view, ArrayList<View> arrayList);

    public void OooOOo(Object obj, float f) {
    }

    public abstract void OooOOo0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void OooOOoo(Object obj, Rect rect);

    public abstract void OooOo(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public void OooOo0(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        OooOo0O(obj, cancellationSignal, null, runnable);
    }

    public abstract void OooOo00(Object obj, View view);

    public void OooOo0O(Object obj, CancellationSignal cancellationSignal, RunnableC21889OooO0o0 runnableC21889OooO0o0, Runnable runnable) {
        runnable.run();
    }

    public abstract void OooOo0o(Object obj, View view, ArrayList<View> arrayList);

    public abstract Object OooOoO0(Object obj);
}

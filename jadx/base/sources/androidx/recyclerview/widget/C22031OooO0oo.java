package androidx.recyclerview.widget;

import OooO0Oo.C20398OooO0O0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22031OooO0oo extends Oooo000 {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static TimeInterpolator f65833OooOOoo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65835OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65834OooO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<C22033OooO0o0> f65836OooOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<C22032OooO0Oo> f65837OooOO0O = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.AbstractC22078OooOooO>> f65838OooOO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<ArrayList<C22033OooO0o0>> f65840OooOOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList<ArrayList<C22032OooO0Oo>> f65839OooOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65841OooOOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65842OooOOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65844OooOOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList<RecyclerView.AbstractC22078OooOooO> f65843OooOOo = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f65846OooOo0o;

        public OooO00o(ArrayList arrayList) {
            this.f65846OooOo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f65846OooOo0o;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C22031OooO0oo c22031OooO0oo = C22031OooO0oo.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c22031OooO0oo.f65840OooOOO0.remove(arrayList);
                    return;
                }
                C22033OooO0o0 c22033OooO0o0 = (C22033OooO0o0) it.next();
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22033OooO0o0.f65857OooO00o;
                c22031OooO0oo.getClass();
                View view = abstractC22078OooOooO.itemView;
                int i = c22033OooO0o0.f65860OooO0Oo - c22033OooO0o0.f65858OooO0O0;
                int i2 = c22033OooO0o0.f65861OooO0o0 - c22033OooO0o0.f65859OooO0OO;
                if (i != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i2 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c22031OooO0oo.f65842OooOOOo.add(abstractC22078OooOooO);
                viewPropertyAnimatorAnimate.setDuration(c22031OooO0oo.f66061OooO0o0).setListener(new OooOO0O(c22031OooO0oo, abstractC22078OooOooO, i, view, i2, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f65848OooOo0o;

        public OooO0O0(ArrayList arrayList) {
            this.f65848OooOo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f65848OooOo0o;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C22031OooO0oo c22031OooO0oo = C22031OooO0oo.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c22031OooO0oo.f65839OooOOO.remove(arrayList);
                    return;
                }
                C22032OooO0Oo c22032OooO0Oo = (C22032OooO0Oo) it.next();
                c22031OooO0oo.getClass();
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22032OooO0Oo.f65851OooO00o;
                View view = abstractC22078OooOooO == null ? null : abstractC22078OooOooO.itemView;
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = c22032OooO0Oo.f65852OooO0O0;
                View view2 = abstractC22078OooOooO2 != null ? abstractC22078OooOooO2.itemView : null;
                ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList2 = c22031OooO0oo.f65843OooOOo;
                long j = c22031OooO0oo.f66060OooO0o;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j);
                    arrayList2.add(c22032OooO0Oo.f65851OooO00o);
                    duration.translationX(c22032OooO0Oo.f65856OooO0o0 - c22032OooO0Oo.f65853OooO0OO);
                    duration.translationY(c22032OooO0Oo.f65855OooO0o - c22032OooO0Oo.f65854OooO0Oo);
                    duration.alpha(0.0f).setListener(new C22034OooOO0o(c22031OooO0oo, c22032OooO0Oo, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(c22032OooO0Oo.f65852OooO0O0);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new OooOOO0(c22031OooO0oo, c22032OooO0Oo, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo$OooO0OO */
    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f65850OooOo0o;

        public OooO0OO(ArrayList arrayList) {
            this.f65850OooOo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f65850OooOo0o;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C22031OooO0oo c22031OooO0oo = C22031OooO0oo.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c22031OooO0oo.f65838OooOO0o.remove(arrayList);
                    return;
                }
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = (RecyclerView.AbstractC22078OooOooO) it.next();
                c22031OooO0oo.getClass();
                View view = abstractC22078OooOooO.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c22031OooO0oo.f65841OooOOOO.add(abstractC22078OooOooO);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c22031OooO0oo.f66058OooO0OO).setListener(new OooOO0(view, viewPropertyAnimatorAnimate, c22031OooO0oo, abstractC22078OooOooO)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static class C22032OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RecyclerView.AbstractC22078OooOooO f65851OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RecyclerView.AbstractC22078OooOooO f65852OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65853OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65854OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f65855OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f65856OooO0o0;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f65851OooO00o);
            sb.append(", newHolder=");
            sb.append(this.f65852OooO0O0);
            sb.append(", fromX=");
            sb.append(this.f65853OooO0OO);
            sb.append(", fromY=");
            sb.append(this.f65854OooO0Oo);
            sb.append(", toX=");
            sb.append(this.f65856OooO0o0);
            sb.append(", toY=");
            return C20398OooO0O0.OooO00o('}', sb, this.f65855OooO0o);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    public static class C22033OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RecyclerView.AbstractC22078OooOooO f65857OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65858OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f65859OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65860OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f65861OooO0o0;
    }

    public static void OooOOO0(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC22078OooOooO) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final void OooO() {
        ArrayList<C22033OooO0o0> arrayList = this.f65836OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C22033OooO0o0 c22033OooO0o0 = arrayList.get(size);
            View view = c22033OooO0o0.f65857OooO00o.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0oO(c22033OooO0o0.f65857OooO00o);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList2 = this.f65835OooO0oo;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            OooO0oO(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList3 = this.f65834OooO;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = arrayList3.get(size3);
            abstractC22078OooOooO.itemView.setAlpha(1.0f);
            OooO0oO(abstractC22078OooOooO);
            arrayList3.remove(size3);
        }
        ArrayList<C22032OooO0Oo> arrayList4 = this.f65837OooOO0O;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C22032OooO0Oo c22032OooO0Oo = arrayList4.get(size4);
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = c22032OooO0Oo.f65851OooO00o;
            if (abstractC22078OooOooO2 != null) {
                OooOOOo(c22032OooO0Oo, abstractC22078OooOooO2);
            }
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO3 = c22032OooO0Oo.f65852OooO0O0;
            if (abstractC22078OooOooO3 != null) {
                OooOOOo(c22032OooO0Oo, abstractC22078OooOooO3);
            }
        }
        arrayList4.clear();
        if (OooOO0()) {
            ArrayList<ArrayList<C22033OooO0o0>> arrayList5 = this.f65840OooOOO0;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<C22033OooO0o0> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C22033OooO0o0 c22033OooO0o02 = arrayList6.get(size6);
                    View view2 = c22033OooO0o02.f65857OooO00o.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    OooO0oO(c22033OooO0o02.f65857OooO00o);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.AbstractC22078OooOooO>> arrayList7 = this.f65838OooOO0o;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO4 = arrayList8.get(size8);
                    abstractC22078OooOooO4.itemView.setAlpha(1.0f);
                    OooO0oO(abstractC22078OooOooO4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<C22032OooO0Oo>> arrayList9 = this.f65839OooOOO;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<C22032OooO0Oo> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C22032OooO0Oo c22032OooO0Oo2 = arrayList10.get(size10);
                    RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO5 = c22032OooO0Oo2.f65851OooO00o;
                    if (abstractC22078OooOooO5 != null) {
                        OooOOOo(c22032OooO0Oo2, abstractC22078OooOooO5);
                    }
                    RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO6 = c22032OooO0Oo2.f65852OooO0O0;
                    if (abstractC22078OooOooO6 != null) {
                        OooOOOo(c22032OooO0Oo2, abstractC22078OooOooO6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            OooOOO0(this.f65844OooOOo0);
            OooOOO0(this.f65842OooOOOo);
            OooOOO0(this.f65841OooOOOO);
            OooOOO0(this.f65843OooOOo);
            ArrayList<RecyclerView.AbstractC22064OooOO0o.OooO00o> arrayList11 = this.f66057OooO0O0;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).OooO00o();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooO0o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, List<Object> list) {
        if (list.isEmpty()) {
            return !this.f66038OooO0oO || abstractC22078OooOooO.isInvalid();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final void OooO0oo(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        View view = abstractC22078OooOooO.itemView;
        view.animate().cancel();
        ArrayList<C22033OooO0o0> arrayList = this.f65836OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f65857OooO00o == abstractC22078OooOooO) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0oO(abstractC22078OooOooO);
                arrayList.remove(size);
            }
        }
        OooOOOO(this.f65837OooOO0O, abstractC22078OooOooO);
        if (this.f65835OooO0oo.remove(abstractC22078OooOooO)) {
            view.setAlpha(1.0f);
            OooO0oO(abstractC22078OooOooO);
        }
        if (this.f65834OooO.remove(abstractC22078OooOooO)) {
            view.setAlpha(1.0f);
            OooO0oO(abstractC22078OooOooO);
        }
        ArrayList<ArrayList<C22032OooO0Oo>> arrayList2 = this.f65839OooOOO;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<C22032OooO0Oo> arrayList3 = arrayList2.get(size2);
            OooOOOO(arrayList3, abstractC22078OooOooO);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<C22033OooO0o0>> arrayList4 = this.f65840OooOOO0;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<C22033OooO0o0> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f65857OooO00o == abstractC22078OooOooO) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0oO(abstractC22078OooOooO);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC22078OooOooO>> arrayList6 = this.f65838OooOO0o;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(abstractC22078OooOooO)) {
                view.setAlpha(1.0f);
                OooO0oO(abstractC22078OooOooO);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f65844OooOOo0.remove(abstractC22078OooOooO);
        this.f65841OooOOOO.remove(abstractC22078OooOooO);
        this.f65843OooOOo.remove(abstractC22078OooOooO);
        this.f65842OooOOOo.remove(abstractC22078OooOooO);
        OooOOO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final boolean OooOO0() {
        return (this.f65834OooO.isEmpty() && this.f65837OooOO0O.isEmpty() && this.f65836OooOO0.isEmpty() && this.f65835OooO0oo.isEmpty() && this.f65842OooOOOo.isEmpty() && this.f65844OooOOo0.isEmpty() && this.f65841OooOOOO.isEmpty() && this.f65843OooOOo.isEmpty() && this.f65840OooOOO0.isEmpty() && this.f65838OooOO0o.isEmpty() && this.f65839OooOOO.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22064OooOO0o
    public final void OooOO0O() {
        long j;
        ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList = this.f65835OooO0oo;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<C22033OooO0o0> arrayList2 = this.f65836OooOO0;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<C22032OooO0Oo> arrayList3 = this.f65837OooOO0O;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList4 = this.f65834OooO;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.AbstractC22078OooOooO> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j = this.f66059OooO0Oo;
            if (!zHasNext) {
                break;
            }
            RecyclerView.AbstractC22078OooOooO next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f65844OooOOo0.add(next);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new OooO(view, viewPropertyAnimatorAnimate, this, next)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<C22033OooO0o0> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f65840OooOOO0.add(arrayList5);
            arrayList2.clear();
            OooO00o oooO00o = new OooO00o(arrayList5);
            if (zIsEmpty) {
                oooO00o.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList5.get(0).f65857OooO00o.itemView, oooO00o, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<C22032OooO0Oo> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f65839OooOOO.add(arrayList6);
            arrayList3.clear();
            OooO0O0 oooO0O0 = new OooO0O0(arrayList6);
            if (zIsEmpty) {
                oooO0O0.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList6.get(0).f65851OooO00o.itemView, oooO0O0, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.AbstractC22078OooOooO> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.f65838OooOO0o.add(arrayList7);
        arrayList4.clear();
        OooO0OO oooO0OO = new OooO0OO(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            oooO0OO.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        ViewCompat.postOnAnimationDelayed(arrayList7.get(0).itemView, oooO0OO, Math.max(!zIsEmpty2 ? this.f66061OooO0o0 : 0L, zIsEmpty3 ? 0L : this.f66060OooO0o) + j);
    }

    @Override // androidx.recyclerview.widget.Oooo000
    public final boolean OooOO0o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, int i2, int i3, int i4) {
        View view = abstractC22078OooOooO.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC22078OooOooO.itemView.getTranslationY());
        OooOOo0(abstractC22078OooOooO);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0oO(abstractC22078OooOooO);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList<C22033OooO0o0> arrayList = this.f65836OooOO0;
        C22033OooO0o0 c22033OooO0o0 = new C22033OooO0o0();
        c22033OooO0o0.f65857OooO00o = abstractC22078OooOooO;
        c22033OooO0o0.f65858OooO0O0 = translationX;
        c22033OooO0o0.f65859OooO0OO = translationY;
        c22033OooO0o0.f65860OooO0Oo = i3;
        c22033OooO0o0.f65861OooO0o0 = i4;
        arrayList.add(c22033OooO0o0);
        return true;
    }

    public final void OooOOO() {
        if (OooOO0()) {
            return;
        }
        ArrayList<RecyclerView.AbstractC22064OooOO0o.OooO00o> arrayList = this.f66057OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
        arrayList.clear();
    }

    public final void OooOOOO(ArrayList arrayList, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C22032OooO0Oo c22032OooO0Oo = (C22032OooO0Oo) arrayList.get(size);
            if (OooOOOo(c22032OooO0Oo, abstractC22078OooOooO) && c22032OooO0Oo.f65851OooO00o == null && c22032OooO0Oo.f65852OooO0O0 == null) {
                arrayList.remove(c22032OooO0Oo);
            }
        }
    }

    public final boolean OooOOOo(C22032OooO0Oo c22032OooO0Oo, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        if (c22032OooO0Oo.f65852OooO0O0 == abstractC22078OooOooO) {
            c22032OooO0Oo.f65852OooO0O0 = null;
        } else {
            if (c22032OooO0Oo.f65851OooO00o != abstractC22078OooOooO) {
                return false;
            }
            c22032OooO0Oo.f65851OooO00o = null;
        }
        abstractC22078OooOooO.itemView.setAlpha(1.0f);
        abstractC22078OooOooO.itemView.setTranslationX(0.0f);
        abstractC22078OooOooO.itemView.setTranslationY(0.0f);
        OooO0oO(abstractC22078OooOooO);
        return true;
    }

    public final void OooOOo0(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        if (f65833OooOOoo == null) {
            f65833OooOOoo = new ValueAnimator().getInterpolator();
        }
        abstractC22078OooOooO.itemView.animate().setInterpolator(f65833OooOOoo);
        OooO0oo(abstractC22078OooOooO);
    }
}

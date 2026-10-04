package o0Ooo0O0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C22031OooO0oo;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o0Ooo0O.C29375OooO00o;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Ooo0O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29379OooO0O0 extends C22041OooOOo.AbstractC22044OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C29375OooO00o.OooO0OO f104177OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C29382OooO0o f104178OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C29383OooO0o0 f104179OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o f104180OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C29375OooO00o.OooO0OO f104181OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f104182OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f104183OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f104184OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Handler f104185OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AtomicBoolean f104186OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final RunnableC29378OooO00o f104187OooOOOO;

    /* JADX INFO: renamed from: o0Ooo0O0.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f104188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f104189OooO0O0;

        public OooO00o(Rect rect, boolean z) {
            this.f104188OooO00o = rect;
            this.f104189OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104188OooO00o, oooO00o.f104188OooO00o) && this.f104189OooO0O0 == oooO00o.f104189OooO0O0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104189OooO0O0) + (this.f104188OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "InterestArea(rect=" + this.f104188OooO00o + ", canHoverEdge=" + this.f104189OooO0O0 + ")";
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [o0Ooo0O0.OooO00o] */
    public C29379OooO0O0() {
        super(15);
        this.f104180OooO0oO = new OooO00o(new Rect(), false);
        this.f104182OooOO0 = -1;
        this.f104186OooOOO0 = new AtomicBoolean(false);
        this.f104185OooOOO = new Handler(Looper.getMainLooper());
        this.f104187OooOOOO = new Runnable() { // from class: o0Ooo0O0.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                this.f104176OooOo0o.f104186OooOOO0.compareAndSet(false, true);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecyclerView.AbstractC22078OooOooO OooO0O0(RecyclerView.AbstractC22078OooOooO selected, ArrayList arrayList, int i, int i2) {
        ArrayList dropTargets = arrayList;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selected, "selected");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dropTargets, "dropTargets");
        int absoluteAdapterPosition = selected.getAbsoluteAdapterPosition();
        int left = i - selected.itemView.getLeft();
        int top = i2 - selected.itemView.getTop();
        int size = dropTargets.size();
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = null;
        C32443OooOOO c32443OooOOO = null;
        int i3 = 0;
        while (i3 < size) {
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = (RecyclerView.AbstractC22078OooOooO) dropTargets.get(i3);
            int absoluteAdapterPosition2 = abstractC22078OooOooO2.getAbsoluteAdapterPosition();
            Rect rect = new Rect(abstractC22078OooOooO2.itemView.getLeft(), abstractC22078OooOooO2.itemView.getTop(), abstractC22078OooOooO2.itemView.getRight(), abstractC22078OooOooO2.itemView.getBottom());
            Rect rect2 = new Rect(selected.itemView.getLeft(), selected.itemView.getTop(), selected.itemView.getRight(), selected.itemView.getBottom());
            rect2.offset(left, top);
            Rect rect3 = new Rect(rect);
            if (rect3.intersect(rect2)) {
                boolean z = true;
                if (absoluteAdapterPosition2 <= absoluteAdapterPosition ? rect.top <= rect2.top : rect.top >= rect2.top) {
                    z = false;
                }
                int iAbs = Math.abs(rect3.height() * rect3.width());
                if (c32443OooOOO != null) {
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    B b = c32443OooOOO.f116637OooOo;
                    if (!zBooleanValue ? z || iAbs > ((Number) b).intValue() : z && iAbs > ((Number) b).intValue()) {
                    }
                }
                this.f104180OooO0oO = new OooO00o(rect3, z);
                c32443OooOOO = new C32443OooOOO(Boolean.valueOf(z), Integer.valueOf(iAbs));
                abstractC22078OooOooO = abstractC22078OooOooO2;
            }
            i3++;
            dropTargets = arrayList;
        }
        return abstractC22078OooOooO;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        C29382OooO0o c29382OooO0o;
        View view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        super.OooO0OO(recyclerView, viewHolder);
        Object tag = viewHolder.itemView.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
        C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
        C29375OooO00o.OooO0OO oooO0OO = this.f104177OooO;
        C30837OooO00o c30837OooO00o2 = (C30837OooO00o) ((oooO0OO == null || (view = oooO0OO.itemView) == null) ? null : view.getTag());
        if (c30837OooO00o2 != null) {
            C29383OooO0o0 c29383OooO0o0 = this.f104179OooO0o0;
            if (c29383OooO0o0 != null) {
                c29383OooO0o0.invoke(c30837OooO00o, c30837OooO00o2);
            }
        } else {
            int i = this.f104182OooOO0;
            if (i >= 0 && (c29382OooO0o = this.f104178OooO0o) != null) {
                c29382OooO0o.invoke(c30837OooO00o, Integer.valueOf(i));
            }
        }
        this.f104182OooOO0 = -1;
        this.f104177OooO = null;
        this.f104181OooO0oo = null;
        this.f104184OooOO0o = 0;
        this.f104183OooOO0O = 0;
        recyclerView.setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final float OooO0oO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        return 0.1f;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        Object tag = viewHolder.itemView.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
        String str = ((C30837OooO00o) tag).f110196OooO00o;
        if (str.length() == 0 || str.equals(LayerInfo.PAPER_THEME_LAYER_ID)) {
            return 0;
        }
        return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(this.f65993OooO0Oo);
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C29375OooO00o.OooO0OO oooO0OO;
        if (i != 0 || (oooO0OO = this.f104177OooO) == null) {
            return;
        }
        oooO0OO.OooO0Oo(false);
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        View view;
        C29375OooO00o.OooO0OO oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        C29375OooO00o.OooO0OO oooO0OO2 = (C29375OooO00o.OooO0OO) viewHolder;
        C29375OooO00o.OooO0OO oooO0OO3 = (C29375OooO00o.OooO0OO) abstractC22078OooOooO;
        Object tag = abstractC22078OooOooO.itemView.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
        boolean z = (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104181OooO0oo, abstractC22078OooOooO) && (oooO0OO = this.f104181OooO0oo) != null && oooO0OO.getAbsoluteAdapterPosition() == oooO0OO3.getAbsoluteAdapterPosition()) ? false : true;
        this.f104181OooO0oo = oooO0OO3;
        AtomicBoolean atomicBoolean = this.f104186OooOOO0;
        Handler handler = this.f104185OooOOO;
        if (z) {
            handler.removeCallbacksAndMessages(null);
            this.f104183OooOO0O = 0;
            atomicBoolean.set(true);
        } else {
            OooO00o oooO00o = this.f104180OooO0oO;
            Rect rect = oooO00o.f104188OooO00o;
            float height = abstractC22078OooOooO.itemView.getHeight();
            int i = ((float) rect.height()) < 0.2f * height ? 0 : (!oooO00o.f104189OooO0O0 || ((float) rect.height()) >= height * 0.6f) ? 2 : 1;
            if (i != this.f104183OooOO0O) {
                handler.removeCallbacksAndMessages(null);
                if (i == 0) {
                    this.f104183OooOO0O = 0;
                    atomicBoolean.set(true);
                } else {
                    this.f104183OooOO0O = i;
                    handler.postDelayed(this.f104187OooOOOO, 240L);
                }
            }
        }
        if (atomicBoolean.compareAndSet(true, false) && (abstractC22078OooOooO.equals(this.f104181OooO0oo) || this.f104183OooOO0O == 0)) {
            int i2 = this.f104184OooOO0o;
            int i3 = this.f104183OooOO0O;
            if (i2 != i3) {
                this.f104184OooOO0o = i3;
                this.f104183OooOO0O = 0;
                if (i3 != 1) {
                    if (i3 != 2) {
                        C29375OooO00o.OooO0OO oooO0OO4 = this.f104177OooO;
                        if (oooO0OO4 != null) {
                            oooO0OO4.OooO0Oo(false);
                        }
                        this.f104177OooO = null;
                        return true;
                    }
                    C29375OooO00o.OooO0OO oooO0OO5 = this.f104177OooO;
                    if (oooO0OO5 != null && (view = oooO0OO5.itemView) != null) {
                        view.setBackgroundColor(0);
                    }
                    this.f104177OooO = oooO0OO3;
                    oooO0OO3.OooO0Oo(true);
                    return true;
                }
                RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.adapter.PageLayerAdapter");
                C29375OooO00o c29375OooO00o = (C29375OooO00o) adapter;
                int absoluteAdapterPosition = oooO0OO2.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = oooO0OO3.getAbsoluteAdapterPosition();
                this.f104181OooO0oo = null;
                this.f104182OooOO0 = absoluteAdapterPosition2;
                C29375OooO00o.OooO0OO oooO0OO6 = this.f104177OooO;
                if (oooO0OO6 != null) {
                    oooO0OO6.OooO0Oo(false);
                }
                this.f104177OooO = null;
                if (recyclerView.getItemAnimator() == null) {
                    recyclerView.setItemAnimator(new C22031OooO0oo());
                }
                c29375OooO00o.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
    }
}

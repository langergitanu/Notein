package o0o00oOo;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.C22031OooO0oo;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.RunnableC22770OooO0oo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o0o00oOo.C30035OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o00oOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30051OooOooO extends C22041OooOOo.AbstractC22044OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C30035OooO0oO.OooO0O0 f106857OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC32510OooOOo0<? super NoteVO, ? super NoteVO, ? super Boolean, C32460OooOooO> f106858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC32510OooOOo0<? super NoteVO, ? super NoteVO, ? super Boolean, C32460OooOooO> f106859OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f106860OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f106861OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C30035OooO0oO.OooO0O0 f106862OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f106863OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ValueAnimator f106864OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f106865OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList f106866OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f106867OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f106868OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Handler f106869OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final AtomicBoolean f106870OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final RunnableC22770OooO0oo f106871OooOOoo;

    /* JADX INFO: renamed from: o0o00oOo.OooOooO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f106872OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f106873OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f106874OooO0OO;

        public OooO00o(Rect rect, boolean z, boolean z2) {
            this.f106872OooO00o = rect;
            this.f106873OooO0O0 = z;
            this.f106874OooO0OO = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f106872OooO00o, oooO00o.f106872OooO00o) && this.f106873OooO0O0 == oooO00o.f106873OooO0O0 && this.f106874OooO0OO == oooO00o.f106874OooO0OO;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106874OooO0OO) + OooOoo0.o00000.OooO0O0(this.f106872OooO00o.hashCode() * 31, 31, this.f106873OooO0O0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InterestArea(rect=");
            sb.append(this.f106872OooO00o);
            sb.append(", onLeft=");
            sb.append(this.f106873OooO0O0);
            sb.append(", onTop=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f106874OooO0OO);
        }
    }

    public C30051OooOooO() {
        super(15);
        this.f106861OooO0oo = new OooO00o(new Rect(), false, false);
        this.f106863OooOO0O = -1;
        this.f106870OooOOo0 = new AtomicBoolean(false);
        this.f106869OooOOo = new Handler(Looper.getMainLooper());
        this.f106871OooOOoo = new RunnableC22770OooO0oo(this, 1);
    }

    public static boolean OooOOOo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        int itemCount = adapter.getItemCount() - 1;
        while (-1 < itemCount) {
            int itemViewType = adapter.getItemViewType(itemCount);
            if (itemViewType == 0 || itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
                return itemCount == abstractC22078OooOooO.getAdapterPosition();
            }
            itemCount--;
        }
        return false;
    }

    public static void OooOOo0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, float f, float f2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        if ((abstractC22078OooOooO instanceof C30035OooO0oO.OooO0O0) && (viewGroup = ((C30035OooO0oO.OooO0O0) abstractC22078OooOooO).f106789OooOOOo) != null) {
            if (z && z2) {
                View itemView = abstractC22078OooOooO.itemView;
                kotlin.jvm.internal.OooOOO0.OooO0o(itemView, "itemView");
                if (itemView.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                    Float fValueOf = Float.valueOf(ViewCompat.getElevation(viewGroup));
                    int childCount = recyclerView.getChildCount();
                    float f3 = 0.0f;
                    for (int i = 0; i < childCount; i++) {
                        View viewFindViewById = recyclerView.getChildAt(i).findViewById(R.id.cl_draggable_view);
                        if (viewFindViewById != null && viewFindViewById != itemView) {
                            float elevation = ViewCompat.getElevation(viewFindViewById);
                            if (elevation > f3) {
                                f3 = elevation;
                            }
                        }
                    }
                    ViewCompat.setElevation(itemView, f3 + 1.0f);
                    itemView.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
                }
            }
            viewGroup.setTranslationX(f);
            viewGroup.setTranslationY(f2);
        }
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final RecyclerView.AbstractC22078OooOooO OooO0O0(RecyclerView.AbstractC22078OooOooO selected, ArrayList arrayList, int i, int i2) {
        ArrayList dropTargets = arrayList;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selected, "selected");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dropTargets, "dropTargets");
        int left = i - selected.itemView.getLeft();
        int top = i2 - selected.itemView.getTop();
        int size = dropTargets.size();
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = null;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = (RecyclerView.AbstractC22078OooOooO) dropTargets.get(i4);
            Rect rect = new Rect(abstractC22078OooOooO2.itemView.getLeft(), abstractC22078OooOooO2.itemView.getTop(), abstractC22078OooOooO2.itemView.getRight(), abstractC22078OooOooO2.itemView.getBottom());
            Rect rect2 = new Rect(selected.itemView.getLeft(), selected.itemView.getTop(), selected.itemView.getRight(), selected.itemView.getBottom());
            rect2.offset(left, top);
            int i5 = left;
            Rect rect3 = new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom));
            if (rect3.left < rect3.right && rect3.top < rect3.bottom) {
                if (this.f106860OooO0oO) {
                    int height = selected.itemView.getHeight();
                    int iAbs = Math.abs(rect3.height() * rect3.width());
                    boolean z = rect2.right < rect.right;
                    boolean z2 = rect2.bottom < rect.bottom;
                    if ((rect3.height() > height / 3 && z2 && !this.f106861OooO0oo.f106874OooO0OO) || iAbs > i3) {
                        this.f106861OooO0oo = new OooO00o(rect3, z, z2);
                        abstractC22078OooOooO = abstractC22078OooOooO2;
                        i3 = iAbs;
                    }
                } else {
                    int iAbs2 = Math.abs(rect3.height() * rect3.width());
                    if (iAbs2 > i3) {
                        this.f106861OooO0oo = new OooO00o(rect3, rect2.right < rect.right, rect2.bottom < rect.bottom);
                        i3 = iAbs2;
                        abstractC22078OooOooO = abstractC22078OooOooO2;
                    }
                }
            }
            i4++;
            dropTargets = arrayList;
            left = i5;
        }
        return abstractC22078OooOooO;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        InterfaceC32510OooOOo0<? super NoteVO, ? super NoteVO, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0;
        View view;
        View view2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        super.OooO0OO(recyclerView, viewHolder);
        ValueAnimator valueAnimator = this.f106864OooOO0o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f106864OooOO0o = null;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.AbstractC22078OooOooO childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if (childViewHolder instanceof C30035OooO0oO.OooO0O0) {
                C30035OooO0oO.OooO0O0 oooO0O0 = (C30035OooO0oO.OooO0O0) childViewHolder;
                oooO0O0.OooOOO();
                oooO0O0.OooOOOo();
                super.OooO0OO(recyclerView, childViewHolder);
            }
        }
        Object tag = viewHolder.itemView.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
        NoteVO noteVO = (NoteVO) tag;
        C30035OooO0oO.OooO0O0 oooO0O02 = this.f106862OooOO0;
        NoteVO noteVO2 = (NoteVO) ((oooO0O02 == null || (view2 = oooO0O02.itemView) == null) ? null : view2.getTag());
        if (noteVO2 != null) {
            InterfaceC32510OooOOo0<? super NoteVO, ? super NoteVO, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo02 = this.f106859OooO0o0;
            if (interfaceC32510OooOOo02 != null) {
                ArrayList arrayList = this.f106866OooOOO0;
                interfaceC32510OooOOo02.invoke(noteVO, noteVO2, Boolean.valueOf((arrayList != null ? arrayList.size() : 0) > 1));
            }
        } else {
            int i2 = this.f106863OooOO0O;
            if (i2 >= 0) {
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(i2 + 1);
                Object tag2 = (abstractC22078OooOooOFindViewHolderForLayoutPosition == null || (view = abstractC22078OooOooOFindViewHolderForLayoutPosition.itemView) == null) ? null : view.getTag();
                NoteVO noteVO3 = tag2 instanceof NoteVO ? (NoteVO) tag2 : null;
                RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
                Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
                int i3 = this.f106863OooOO0O + 1;
                if (((numValueOf != null && i3 == numValueOf.intValue()) || noteVO3 != null) && (interfaceC32510OooOOo0 = this.f106858OooO0o) != null) {
                    ArrayList arrayList2 = this.f106866OooOOO0;
                    interfaceC32510OooOOo0.invoke(noteVO, noteVO3, Boolean.valueOf((arrayList2 != null ? arrayList2.size() : 0) > 1));
                }
            }
        }
        this.f106863OooOO0O = -1;
        this.f106862OooOO0 = null;
        this.f106857OooO = null;
        this.f106868OooOOOo = 0;
        this.f106867OooOOOO = 0;
        this.f106866OooOOO0 = null;
        recyclerView.setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final int OooO0o() {
        return Oooo0.o000000O.OooO0o(0);
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
        NoteVO noteVO = tag instanceof NoteVO ? (NoteVO) tag : null;
        if ((noteVO == null || noteVO.getType() != 0) && (noteVO == null || noteVO.getType() != 1)) {
            return 0;
        }
        return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(this.f65993OooO0Oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0o(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView.AbstractC22078OooOooO viewHolder, float f, float f2, final int i, final boolean z) {
        final ViewGroup viewGroup;
        ArrayList arrayList;
        C30051OooOooO c30051OooOooO;
        View view;
        RecyclerView recyclerView2 = recyclerView;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView2, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        boolean z2 = viewHolder instanceof C30035OooO0oO.OooO0O0;
        C30035OooO0oO.OooO0O0 oooO0O0 = z2 ? (C30035OooO0oO.OooO0O0) viewHolder : null;
        Object tag = (oooO0O0 == null || (view = oooO0O0.itemView) == null) ? null : view.getTag();
        NoteVO noteVO = tag instanceof NoteVO ? (NoteVO) tag : null;
        if (noteVO != null && noteVO.isSelected() && z && this.f106866OooOOO0 == null) {
            RecyclerView.AbstractC22062OooO0oO adapter = recyclerView2.getAdapter();
            kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.notelist.NoteAdapter");
            Iterable iterable = ((C30035OooO0oO) adapter).f66021OooO00o.f65811OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                NoteVO noteVO2 = (NoteVO) obj;
                C32443OooOOO c32443OooOOO = noteVO2.isSelected() ? new C32443OooOOO(Integer.valueOf(i2), noteVO2) : null;
                if (c32443OooOOO != null) {
                    arrayList2.add(c32443OooOOO);
                }
                i2 = i3;
            }
            this.f106866OooOOO0 = arrayList2;
        }
        if (noteVO != null && noteVO.isSelected()) {
            ArrayList arrayList3 = this.f106866OooOOO0;
            if ((arrayList3 != null ? arrayList3.size() : 0) > 1) {
                C30035OooO0oO.OooO0O0 oooO0O02 = z2 ? (C30035OooO0oO.OooO0O0) viewHolder : null;
                View view2 = oooO0O02 != null ? oooO0O02.itemView : null;
                Object tag2 = view2 != null ? view2.getTag() : null;
                NoteVO noteVO3 = tag2 instanceof NoteVO ? (NoteVO) tag2 : null;
                if (noteVO3 == null || !noteVO3.isSelected()) {
                    super.OooOO0o(canvas, recyclerView, viewHolder, f, f2, i, z);
                    return;
                }
                ArrayList arrayList4 = this.f106866OooOOO0;
                if (arrayList4 != null) {
                    int childCount = recyclerView2.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        RecyclerView.AbstractC22078OooOooO childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i4));
                        if (childViewHolder instanceof C30035OooO0oO.OooO0O0) {
                            C30035OooO0oO.OooO0O0 oooO0O03 = (C30035OooO0oO.OooO0O0) childViewHolder;
                            Object tag3 = oooO0O03.itemView.getTag();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(tag3, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                            NoteVO noteVO4 = (NoteVO) tag3;
                            if (noteVO4.isSelected()) {
                                oooO0O03.itemView.setTranslationZ(1.0f);
                                View view3 = oooO0O03.f106791OooOOo0;
                                if (view3 != null) {
                                    view3.setBackgroundColor(ContextCompat.getColor(view3.getContext(), R.color.note_mask_bg_color));
                                }
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                }
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO4.getId(), noteVO3.getId())) {
                                    oooO0O03.OooOOo0(arrayList4.size(), true);
                                }
                            } else {
                                oooO0O03.OooOOO();
                            }
                        }
                    }
                }
                if (this.f106864OooOO0o == null) {
                    float left = viewHolder.itemView.getLeft() + f;
                    if (Math.abs((viewHolder.itemView.getRight() + f2) - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * 0.1f || Math.abs(left - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * 0.1f) {
                        if (z2 && (viewGroup = ((C30035OooO0oO.OooO0O0) viewHolder).f106789OooOOOo) != null) {
                            Object tag4 = viewHolder.itemView.getTag();
                            NoteVO noteVO5 = tag4 instanceof NoteVO ? (NoteVO) tag4 : null;
                            if (noteVO5 == null || (arrayList = this.f106866OooOOO0) == null) {
                                c30051OooOooO = this;
                            } else {
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.f106864OooOO0o = valueAnimatorOfFloat;
                                if (valueAnimatorOfFloat != null) {
                                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                }
                                ValueAnimator valueAnimator = this.f106864OooOO0o;
                                if (valueAnimator != null) {
                                    valueAnimator.setDuration(360L);
                                }
                                ValueAnimator valueAnimator2 = this.f106864OooOO0o;
                                if (valueAnimator2 != null) {
                                    c30051OooOooO = this;
                                    recyclerView2 = recyclerView;
                                    valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(viewGroup, this, canvas, recyclerView, viewHolder, i, z) { // from class: o0o00oOo.OooOoo

                                        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                                        public final /* synthetic */ ViewGroup f106852OooO00o;

                                        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                                        public final /* synthetic */ C30051OooOooO f106853OooO0O0;

                                        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                                        public final /* synthetic */ RecyclerView f106854OooO0OO;

                                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                                        public final /* synthetic */ RecyclerView.AbstractC22078OooOooO f106855OooO0Oo;

                                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                                        public final /* synthetic */ boolean f106856OooO0o0;

                                        {
                                            this.f106854OooO0OO = recyclerView;
                                            this.f106855OooO0Oo = viewHolder;
                                            this.f106856OooO0o0 = z;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
                                        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
                                        /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
                                        /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
                                        /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
                                        /* JADX WARN: Type inference failed for: r6v0, types: [oOo000Oo.OooOoO] */
                                        /* JADX WARN: Type inference failed for: r6v1 */
                                        /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void onAnimationUpdate(ValueAnimator it) {
                                            ?? arrayList5;
                                            Object animatedValue;
                                            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                                            ViewGroup viewGroup2 = this.f106852OooO00o;
                                            float translationX = viewGroup2.getTranslationX();
                                            float translationY = viewGroup2.getTranslationY();
                                            C30051OooOooO c30051OooOooO2 = this.f106853OooO0O0;
                                            c30051OooOooO2.getClass();
                                            Object tag5 = this.f106855OooO0Oo.itemView.getTag();
                                            NoteVO noteVO6 = tag5 instanceof NoteVO ? (NoteVO) tag5 : null;
                                            if (noteVO6 == null) {
                                                return;
                                            }
                                            ArrayList arrayList6 = c30051OooOooO2.f106866OooOOO0;
                                            if (arrayList6 != null) {
                                                arrayList5 = new ArrayList();
                                                for (Object obj2 : arrayList6) {
                                                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) ((C32443OooOOO) obj2).f116637OooOo).getId(), noteVO6.getId())) {
                                                        arrayList5.add(obj2);
                                                    }
                                                }
                                            } else {
                                                arrayList5 = C34434OooOoO.f123453OooOo0o;
                                            }
                                            for (C32443OooOOO c32443OooOOO2 : (Iterable) arrayList5) {
                                                int iIntValue = ((Number) c32443OooOOO2.f116638OooOo0o).intValue();
                                                RecyclerView recyclerView3 = this.f106854OooO0OO;
                                                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView3.findViewHolderForAdapterPosition(iIntValue);
                                                if (abstractC22078OooOooOFindViewHolderForAdapterPosition != null) {
                                                    View itemView = abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView;
                                                    kotlin.jvm.internal.OooOOO0.OooO0o(itemView, "itemView");
                                                    float left2 = itemView.getLeft();
                                                    float top = itemView.getTop();
                                                    ValueAnimator valueAnimator3 = c30051OooOooO2.f106864OooOO0o;
                                                    if (valueAnimator3 == null) {
                                                        animatedValue = null;
                                                        Float f3 = !(animatedValue instanceof Float) ? (Float) animatedValue : null;
                                                        float fFloatValue = f3 == null ? f3.floatValue() : 1.0f;
                                                        C30051OooOooO.OooOOo0(recyclerView3, abstractC22078OooOooOFindViewHolderForAdapterPosition, ((r2.itemView.getLeft() - left2) * fFloatValue) + translationX, ((r2.itemView.getTop() - top) * fFloatValue) + translationY, this.f106856OooO0o0, false);
                                                    } else {
                                                        if (!valueAnimator3.isRunning()) {
                                                            valueAnimator3 = null;
                                                        }
                                                        if (valueAnimator3 != null) {
                                                            animatedValue = valueAnimator3.getAnimatedValue();
                                                        }
                                                        if (!(animatedValue instanceof Float)) {
                                                        }
                                                        if (f3 == null) {
                                                        }
                                                        C30051OooOooO.OooOOo0(recyclerView3, abstractC22078OooOooOFindViewHolderForAdapterPosition, ((r2.itemView.getLeft() - left2) * fFloatValue) + translationX, ((r2.itemView.getTop() - top) * fFloatValue) + translationY, this.f106856OooO0o0, false);
                                                    }
                                                }
                                            }
                                        }
                                    });
                                } else {
                                    c30051OooOooO = this;
                                }
                                ValueAnimator valueAnimator3 = c30051OooOooO.f106864OooOO0o;
                                if (valueAnimator3 != null) {
                                    valueAnimator3.addListener(new C30052OooOooo(arrayList, recyclerView2, noteVO5));
                                }
                            }
                            ValueAnimator valueAnimator4 = c30051OooOooO.f106864OooOO0o;
                            if (valueAnimator4 != null) {
                                valueAnimator4.start();
                            }
                        }
                    }
                }
                OooOOo0(recyclerView2, viewHolder, f, f2, z, true);
                return;
            }
        }
        super.OooOO0o(canvas, recyclerView, viewHolder, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C30035OooO0oO.OooO0O0 oooO0O0;
        View view;
        if (i != 0 || (oooO0O0 = this.f106862OooOO0) == null || (view = oooO0O0.itemView) == null) {
            return;
        }
        view.setBackgroundColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        int i;
        View view;
        View view2;
        View view3;
        C30035OooO0oO.OooO0O0 oooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        C30035OooO0oO.OooO0O0 oooO0O02 = (C30035OooO0oO.OooO0O0) viewHolder;
        C30035OooO0oO.OooO0O0 oooO0O03 = (C30035OooO0oO.OooO0O0) abstractC22078OooOooO;
        Object tag = abstractC22078OooOooO.itemView.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
        NoteVO noteVO = (NoteVO) tag;
        if (noteVO.getType() == 0 || noteVO.getType() == 1) {
            boolean z = (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f106857OooO, abstractC22078OooOooO) && (oooO0O0 = this.f106857OooO) != null && oooO0O0.getAdapterPosition() == oooO0O03.getAdapterPosition()) ? false : true;
            this.f106857OooO = oooO0O03;
            AtomicBoolean atomicBoolean = this.f106870OooOOo0;
            Handler handler = this.f106869OooOOo;
            if (z) {
                handler.removeCallbacksAndMessages(null);
                this.f106867OooOOOO = 0;
                atomicBoolean.set(true);
            } else {
                boolean zOooOOOo = OooOOOo(recyclerView, abstractC22078OooOooO);
                OooO00o oooO00o = this.f106861OooO0oo;
                Rect rect = oooO00o.f106872OooO00o;
                if (this.f106860OooO0oO) {
                    if (rect.width() >= Oooo0.o000000O.OooO0o(20) && rect.height() >= Oooo0.o000000O.OooO0o(20)) {
                        i = (rect.height() < Oooo0.o000000O.OooO0o(40) && this.f106865OooOOO && (oooO00o.f106874OooO0OO || zOooOOOo)) ? 1 : 2;
                    }
                    i = 0;
                } else {
                    if (rect.width() >= Oooo0.o000000O.OooO0o(75) && rect.height() >= Oooo0.o000000O.OooO0o(70)) {
                        if ((rect.width() < Oooo0.o000000O.OooO0o(120) || rect.height() < Oooo0.o000000O.OooO0o(100)) && this.f106865OooOOO && (oooO00o.f106873OooO0O0 || zOooOOOo)) {
                        }
                    }
                    i = 0;
                }
                if (i != 1 || !noteVO.isSelected()) {
                    if (i != this.f106867OooOOOO) {
                        handler.removeCallbacksAndMessages(null);
                        if (i == 0) {
                            this.f106867OooOOOO = 0;
                            atomicBoolean.set(true);
                        } else {
                            this.f106867OooOOOO = i;
                            handler.postDelayed(this.f106871OooOOoo, 240L);
                        }
                    }
                }
            }
            if (atomicBoolean.compareAndSet(true, false) && (abstractC22078OooOooO.equals(this.f106857OooO) || this.f106867OooOOOO == 0)) {
                int i2 = this.f106868OooOOOo;
                int i3 = this.f106867OooOOOO;
                if (i2 != i3) {
                    this.f106868OooOOOo = i3;
                    this.f106867OooOOOO = 0;
                    Log.d("NoteListItemTouchCallback", "dropTarget " + oooO0O03.getAdapterPosition() + ", targetHoverType: " + this.f106868OooOOOo);
                    int i4 = this.f106868OooOOOo;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            C30035OooO0oO.OooO0O0 oooO0O04 = this.f106862OooOO0;
                            if (oooO0O04 != null && (view3 = oooO0O04.itemView) != null) {
                                view3.setBackgroundColor(0);
                            }
                            this.f106862OooOO0 = null;
                            return true;
                        }
                        C30035OooO0oO.OooO0O0 oooO0O05 = this.f106862OooOO0;
                        if (oooO0O05 != null && (view2 = oooO0O05.itemView) != null) {
                            view2.setBackgroundColor(0);
                        }
                        this.f106862OooOO0 = oooO0O03;
                        oooO0O03.itemView.setBackgroundColor(ContextCompat.getColor(recyclerView.getContext(), R.color.note_hover_bg_color));
                        return true;
                    }
                    RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.notelist.NoteAdapter");
                    C30035OooO0oO c30035OooO0oO = (C30035OooO0oO) adapter;
                    int adapterPosition = oooO0O03.getAdapterPosition();
                    int adapterPosition2 = oooO0O02.getAdapterPosition();
                    if (!this.f106860OooO0oO || adapterPosition2 >= adapterPosition) {
                        adapterPosition = oooO0O03.getAdapterPosition();
                    } else if (!OooOOOo(recyclerView, oooO0O03) || this.f106861OooO0oo.f106874OooO0OO) {
                        adapterPosition--;
                    }
                    this.f106857OooO = null;
                    this.f106863OooOO0O = adapterPosition;
                    C30035OooO0oO.OooO0O0 oooO0O06 = this.f106862OooOO0;
                    if (oooO0O06 != null && (view = oooO0O06.itemView) != null) {
                        view.setBackgroundColor(0);
                    }
                    this.f106862OooOO0 = null;
                    if (recyclerView.getItemAnimator() == null) {
                        recyclerView.setItemAnimator(new C22031OooO0oo());
                    }
                    c30035OooO0oO.notifyItemMoved(adapterPosition2, adapterPosition);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
    }
}

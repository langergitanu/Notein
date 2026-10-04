package com.orion.notein.p607ui.pageeditor;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import com.orion.notein.p607ui.pageeditor.TiledPageListFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0o0OO.C30367OooO0o0;
import o0o0OO.C30371OooOOOo;
import o0o0OO.OooOOOO;
import o0o0OO0O.ViewOnLongClickListenerC30448OooOoo0;
import o0o0OO0o.C30455OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/TiledPageListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lo0o0OO0O/OooOo00;", "parentNavArgs", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TiledPageListFragment extends Hilt_TiledPageListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TiledPagePreviewVOFilter f78588OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78589OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f78590OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public RecyclerView f78591OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C30455OooO0Oo f78592Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO00o f78593Oooo00O;

    public static final class OooO00o extends C22041OooOOo.AbstractC22044OooO0oO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f78595OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f78596OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ValueAnimator f78597OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f78598OooO0oo;

        public OooO00o() {
            super(15);
            this.f78596OooO0o0 = -1;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final boolean OooO00o(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO current, RecyclerView.AbstractC22078OooOooO target) {
            OooOOO0.OooO0oO(recyclerView, "recyclerView");
            OooOOO0.OooO0oO(current, "current");
            OooOOO0.OooO0oO(target, "target");
            Object tag = target.itemView.getTag();
            return (tag instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag : null) != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [oOo000Oo.OooOoO] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            ?? arrayList;
            View view;
            OooOOO0.OooO0oO(recyclerView, "recyclerView");
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
            super.OooO0OO(recyclerView, viewHolder);
            ValueAnimator valueAnimator = this.f78597OooO0oO;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f78597OooO0oO = null;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.AbstractC22078OooOooO childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                if (childViewHolder instanceof C30455OooO0Oo.OooO0O0) {
                    C30455OooO0Oo.OooO0O0 oooO0O0 = (C30455OooO0Oo.OooO0O0) childViewHolder;
                    oooO0O0.OooO0O0();
                    oooO0O0.OooO0OO();
                    super.OooO0OO(recyclerView, childViewHolder);
                }
            }
            if (this.f78596OooO0o0 == -1) {
                this.f78598OooO0oo = null;
                return;
            }
            Object tag = viewHolder.itemView.getTag();
            OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
            TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) tag;
            ArrayList arrayList2 = this.f78598OooO0oo;
            boolean z = (arrayList2 != null ? arrayList2.size() : 0) > 1;
            TiledPageListFragment tiledPageListFragment = TiledPageListFragment.this;
            if (z) {
                C30455OooO0Oo c30455OooO0Oo = tiledPageListFragment.f78592Oooo000;
                if (c30455OooO0Oo == null) {
                    OooOOO0.OooOOOO("tiledPageAdapter");
                    throw null;
                }
                c30455OooO0Oo.notifyDataSetChanged();
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(this.f78596OooO0o0 - 1);
                Object tag2 = (abstractC22078OooOooOFindViewHolderForLayoutPosition == null || (view = abstractC22078OooOooOFindViewHolderForLayoutPosition.itemView) == null) ? null : view.getTag();
                TiledPagePreviewVO tiledPagePreviewVO2 = tag2 instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag2 : null;
                if (this.f78596OooO0o0 == 0 || tiledPagePreviewVO2 != null) {
                    ArrayList arrayList3 = this.f78598OooO0oo;
                    if (arrayList3 != null) {
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((TiledPagePreviewVO) ((C32443OooOOO) it.next()).f116637OooOo).getId());
                        }
                    } else {
                        arrayList = C34434OooOoO.f123453OooOo0o;
                    }
                    C30367OooO0o0 c30367OooO0o0OooOoO = tiledPageListFragment.OooOoO();
                    c30367OooO0o0OooOoO.f108351OooOoo = tiledPagePreviewVO.getId();
                    c30367OooO0o0OooOoO.f108352OooOoo0 = null;
                    C30367OooO0o0 c30367OooO0o0OooOoO2 = tiledPageListFragment.OooOoO();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30367OooO0o0OooOoO2), null, null, new C30371OooOOOo(c30367OooO0o0OooOoO2, arrayList, tiledPagePreviewVO2 != null ? tiledPagePreviewVO2.getId() : null, null), 3);
                }
            } else {
                C30367OooO0o0 c30367OooO0o0OooOoO3 = tiledPageListFragment.OooOoO();
                String pageId = tiledPagePreviewVO.getId();
                int i2 = this.f78596OooO0o0;
                OooOOO0.OooO0oO(pageId, "pageId");
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30367OooO0o0OooOoO3), null, null, new OooOOOO(c30367OooO0o0OooOoO3, pageId, i2, null), 3);
            }
            this.f78596OooO0o0 = -1;
            this.f78598OooO0oo = null;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final float OooO0oO(RecyclerView.AbstractC22078OooOooO viewHolder) {
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
            return 0.1f;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            OooOOO0.OooO0oO(recyclerView, "recyclerView");
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
            Object tag = viewHolder.itemView.getTag();
            if ((tag instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag : null) == null) {
                return 0;
            }
            return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(15);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final boolean OooOO0() {
            this.f78595OooO0o = false;
            this.f78596OooO0o0 = -1;
            TiledPagePreviewVOFilter tiledPagePreviewVOFilter = TiledPageListFragment.this.f78588OooOoo;
            if (tiledPagePreviewVOFilter != null) {
                return !tiledPagePreviewVOFilter.getReadOnly();
            }
            OooOOO0.OooOOOO("filterVO");
            throw null;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooOO0o(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView.AbstractC22078OooOooO viewHolder, float f, float f2, final int i, final boolean z) {
            ArrayList arrayList;
            View view;
            OooOOO0.OooO0oO(recyclerView, "recyclerView");
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
            boolean z2 = viewHolder instanceof C30455OooO0Oo.OooO0O0;
            C30455OooO0Oo.OooO0O0 oooO0O0 = z2 ? (C30455OooO0Oo.OooO0O0) viewHolder : null;
            Object tag = (oooO0O0 == null || (view = oooO0O0.itemView) == null) ? null : view.getTag();
            TiledPagePreviewVO tiledPagePreviewVO = tag instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag : null;
            if (tiledPagePreviewVO != null && tiledPagePreviewVO.isSelected() && z && this.f78598OooO0oo == null) {
                RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
                OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.pageeditor.adapter.TiledPageAdapter");
                Iterable iterable = ((C30455OooO0Oo) adapter).f66021OooO00o.f65811OooO0o;
                OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                for (Object obj : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    TiledPagePreviewVO tiledPagePreviewVO2 = (TiledPagePreviewVO) obj;
                    C32443OooOOO c32443OooOOO = tiledPagePreviewVO2.isSelected() ? new C32443OooOOO(Integer.valueOf(i2), tiledPagePreviewVO2) : null;
                    if (c32443OooOOO != null) {
                        arrayList2.add(c32443OooOOO);
                    }
                    i2 = i3;
                }
                this.f78598OooO0oo = arrayList2;
            }
            if (tiledPagePreviewVO != null && tiledPagePreviewVO.isSelected()) {
                ArrayList arrayList3 = this.f78598OooO0oo;
                if ((arrayList3 != null ? arrayList3.size() : 0) > 1) {
                    Object tag2 = viewHolder.itemView.getTag();
                    TiledPagePreviewVO tiledPagePreviewVO3 = tag2 instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag2 : null;
                    if (tiledPagePreviewVO3 == null || !tiledPagePreviewVO3.isSelected()) {
                        super.OooOO0o(canvas, recyclerView, viewHolder, f, f2, i, z);
                        return;
                    }
                    ArrayList arrayList4 = this.f78598OooO0oo;
                    if (arrayList4 != null) {
                        int childCount = recyclerView.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            RecyclerView.AbstractC22078OooOooO childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i4));
                            if (childViewHolder instanceof C30455OooO0Oo.OooO0O0) {
                                C30455OooO0Oo.OooO0O0 oooO0O02 = (C30455OooO0Oo.OooO0O0) childViewHolder;
                                Object tag3 = oooO0O02.itemView.getTag();
                                OooOOO0.OooO0o0(tag3, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
                                TiledPagePreviewVO tiledPagePreviewVO4 = (TiledPagePreviewVO) tag3;
                                if (tiledPagePreviewVO4.isSelected()) {
                                    boolean zOooO0O0 = OooOOO0.OooO0O0(tiledPagePreviewVO4.getId(), tiledPagePreviewVO3.getId());
                                    oooO0O02.itemView.setTranslationZ(1.0f);
                                    View view2 = oooO0O02.f108759OooO0o0;
                                    if (view2 != null) {
                                        view2.setVisibility(!zOooO0O0 ? 0 : 8);
                                    }
                                    if (zOooO0O0) {
                                        oooO0O02.OooO0Oo(arrayList4.size(), true);
                                    }
                                } else {
                                    oooO0O02.OooO0O0();
                                }
                            }
                        }
                    }
                    if (this.f78597OooO0oO == null) {
                        float left = viewHolder.itemView.getLeft() + f;
                        if (Math.abs((viewHolder.itemView.getRight() + f2) - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * 0.1f || Math.abs(left - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * 0.1f) {
                            if (z2) {
                                Object tag4 = viewHolder.itemView.getTag();
                                TiledPagePreviewVO tiledPagePreviewVO5 = tag4 instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag4 : null;
                                if (tiledPagePreviewVO5 != null && (arrayList = this.f78598OooO0oo) != null) {
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    this.f78597OooO0oO = valueAnimatorOfFloat;
                                    if (valueAnimatorOfFloat != null) {
                                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                    }
                                    ValueAnimator valueAnimator = this.f78597OooO0oO;
                                    if (valueAnimator != null) {
                                        valueAnimator.setDuration(360L);
                                    }
                                    ValueAnimator valueAnimator2 = this.f78597OooO0oO;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, canvas, recyclerView, i, z) { // from class: o0o0OO0O.OooOooo

                                            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                                            public final /* synthetic */ TiledPageListFragment.OooO00o f108732OooO0O0;

                                            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                                            public final /* synthetic */ RecyclerView f108733OooO0OO;

                                            {
                                                this.f108733OooO0OO = recyclerView;
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
                                            /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
                                            /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
                                            /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
                                            /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
                                            /* JADX WARN: Type inference failed for: r6v0, types: [oOo000Oo.OooOoO] */
                                            /* JADX WARN: Type inference failed for: r6v1 */
                                            /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void onAnimationUpdate(ValueAnimator it) {
                                                ?? arrayList5;
                                                Object animatedValue;
                                                float left2;
                                                float top;
                                                ViewGroup viewGroup;
                                                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                                                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f108731OooO00o;
                                                float translationX = abstractC22078OooOooO.itemView.getTranslationX();
                                                float translationY = abstractC22078OooOooO.itemView.getTranslationY();
                                                TiledPageListFragment.OooO00o oooO00o = this.f108732OooO0O0;
                                                oooO00o.getClass();
                                                Object tag5 = abstractC22078OooOooO.itemView.getTag();
                                                TiledPagePreviewVO tiledPagePreviewVO6 = tag5 instanceof TiledPagePreviewVO ? (TiledPagePreviewVO) tag5 : null;
                                                if (tiledPagePreviewVO6 == null) {
                                                    return;
                                                }
                                                ArrayList arrayList6 = oooO00o.f78598OooO0oo;
                                                if (arrayList6 != null) {
                                                    arrayList5 = new ArrayList();
                                                    for (Object obj2 : arrayList6) {
                                                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((TiledPagePreviewVO) ((C32443OooOOO) obj2).f116637OooOo).getId(), tiledPagePreviewVO6.getId())) {
                                                            arrayList5.add(obj2);
                                                        }
                                                    }
                                                } else {
                                                    arrayList5 = C34434OooOoO.f123453OooOo0o;
                                                }
                                                Iterator it2 = ((Iterable) arrayList5).iterator();
                                                while (it2.hasNext()) {
                                                    RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f108733OooO0OO.findViewHolderForAdapterPosition(((Number) ((C32443OooOOO) it2.next()).f116638OooOo0o).intValue());
                                                    if (abstractC22078OooOooOFindViewHolderForAdapterPosition != null) {
                                                        View itemView = abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView;
                                                        kotlin.jvm.internal.OooOOO0.OooO0o(itemView, "itemView");
                                                        float left3 = itemView.getLeft();
                                                        float top2 = itemView.getTop();
                                                        ValueAnimator valueAnimator3 = oooO00o.f78597OooO0oO;
                                                        if (valueAnimator3 == null) {
                                                            animatedValue = null;
                                                            Float f3 = !(animatedValue instanceof Float) ? (Float) animatedValue : null;
                                                            float fFloatValue = f3 == null ? f3.floatValue() : 1.0f;
                                                            left2 = ((abstractC22078OooOooO.itemView.getLeft() - left3) * fFloatValue) + translationX;
                                                            top = ((abstractC22078OooOooO.itemView.getTop() - top2) * fFloatValue) + translationY;
                                                            if ((abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30455OooO0Oo.OooO0O0) && (viewGroup = ((C30455OooO0Oo.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition).f108758OooO0Oo) != null) {
                                                                viewGroup.setTranslationX(left2);
                                                                viewGroup.setTranslationY(top);
                                                            }
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
                                                            left2 = ((abstractC22078OooOooO.itemView.getLeft() - left3) * fFloatValue) + translationX;
                                                            top = ((abstractC22078OooOooO.itemView.getTop() - top2) * fFloatValue) + translationY;
                                                            if (abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30455OooO0Oo.OooO0O0) {
                                                                viewGroup.setTranslationX(left2);
                                                                viewGroup.setTranslationY(top);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    }
                                    ValueAnimator valueAnimator3 = this.f78597OooO0oO;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.addListener(new com.orion.notein.p607ui.pageeditor.OooO00o(arrayList, recyclerView, tiledPagePreviewVO5));
                                    }
                                }
                            }
                            ValueAnimator valueAnimator4 = this.f78597OooO0oO;
                            if (valueAnimator4 != null) {
                                valueAnimator4.start();
                            }
                        }
                    }
                    super.OooOO0o(canvas, recyclerView, viewHolder, f, f2, i, z);
                    return;
                }
            }
            if (Math.abs(f2) + Math.abs(f) > 20.0f) {
                this.f78595OooO0o = true;
            }
            if (z && this.f78595OooO0o) {
                viewHolder.itemView.setScaleX(1.2f);
                viewHolder.itemView.setScaleY(1.2f);
            } else {
                viewHolder.itemView.setScaleX(1.0f);
                viewHolder.itemView.setScaleY(1.0f);
            }
            super.OooOO0o(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            OooOOO0.OooO0oO(recyclerView, "recyclerView");
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
            int adapterPosition = abstractC22078OooOooO instanceof C30455OooO0Oo.OooO00o ? ((C30455OooO0Oo.OooO00o) abstractC22078OooOooO).getAdapterPosition() - 1 : abstractC22078OooOooO.getAdapterPosition();
            this.f78596OooO0o0 = adapterPosition;
            Log.d("TiledPageEditorFragment", "dropTarget " + adapterPosition);
            int adapterPosition2 = viewHolder.getAdapterPosition();
            int i = this.f78596OooO0o0;
            C30455OooO0Oo c30455OooO0Oo = TiledPageListFragment.this.f78592Oooo000;
            if (c30455OooO0Oo != null) {
                c30455OooO0Oo.notifyItemMoved(adapterPosition2, i);
                return true;
            }
            OooOOO0.OooOOOO("tiledPageAdapter");
            throw null;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
            OooOOO0.OooO0oO(viewHolder, "viewHolder");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListFragment$onViewCreated$3", m80623f = "TiledPageListFragment.kt", m80624l = {74}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78600OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TiledPageListFragment f78601OooOo0o;

            public OooO00o(TiledPageListFragment tiledPageListFragment) {
                this.f78601OooOo0o = tiledPageListFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List list = (List) obj;
                if (list != null) {
                    final TiledPageListFragment tiledPageListFragment = this.f78601OooOo0o;
                    TiledPagePreviewVOFilter tiledPagePreviewVOFilter = tiledPageListFragment.f78588OooOoo;
                    if (tiledPagePreviewVOFilter == null) {
                        OooOOO0.OooOOOO("filterVO");
                        throw null;
                    }
                    InterfaceC32507OooOO0o<TiledPagePreviewVO, Boolean> filter = tiledPagePreviewVOFilter.getFilter();
                    final ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (filter.invoke((TiledPagePreviewVO) t).booleanValue()) {
                            arrayList.add(t);
                        }
                    }
                    C30455OooO0Oo c30455OooO0Oo = tiledPageListFragment.f78592Oooo000;
                    if (c30455OooO0Oo == null) {
                        OooOOO0.OooOOOO("tiledPageAdapter");
                        throw null;
                    }
                    final int itemCount = c30455OooO0Oo.getItemCount();
                    RecyclerView recyclerView = tiledPageListFragment.f78591OooOooo;
                    if (recyclerView == null) {
                        OooOOO0.OooOOOO("tiledPageList");
                        throw null;
                    }
                    RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                    OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    final int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                    C30455OooO0Oo c30455OooO0Oo2 = tiledPageListFragment.f78592Oooo000;
                    if (c30455OooO0Oo2 == null) {
                        OooOOO0.OooOOOO("tiledPageAdapter");
                        throw null;
                    }
                    c30455OooO0Oo2.OooO0o0(arrayList, new Runnable() { // from class: o0o0OO0O.OooOoOO
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iFindFirstVisibleItemPosition2 = gridLayoutManager.findFirstVisibleItemPosition();
                            ArrayList arrayList2 = arrayList;
                            TiledPageListFragment tiledPageListFragment2 = tiledPageListFragment;
                            if (itemCount > 1 || arrayList2.isEmpty()) {
                                int i = iFindFirstVisibleItemPosition;
                                if (i != iFindFirstVisibleItemPosition2) {
                                    RecyclerView recyclerView2 = tiledPageListFragment2.f78591OooOooo;
                                    if (recyclerView2 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                        throw null;
                                    }
                                    recyclerView2.scrollToPosition(i);
                                }
                            } else {
                                Integer num = tiledPageListFragment2.OooOoO().f108352OooOoo0;
                                tiledPageListFragment2.OooOoO().f108352OooOoo0 = null;
                                String str = tiledPageListFragment2.OooOoO().f108351OooOoo;
                                if (str != null) {
                                    C30455OooO0Oo c30455OooO0Oo3 = tiledPageListFragment2.f78592Oooo000;
                                    if (c30455OooO0Oo3 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageAdapter");
                                        throw null;
                                    }
                                    List<T> list2 = c30455OooO0Oo3.f66021OooO00o.f65811OooO0o;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(list2, "getCurrentList(...)");
                                    Iterator it = list2.iterator();
                                    int i2 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i2 = -1;
                                            break;
                                        } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TiledPagePreviewVO) it.next()).getId(), str)) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    if (i2 != -1) {
                                        RecyclerView recyclerView3 = tiledPageListFragment2.f78591OooOooo;
                                        if (recyclerView3 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                            throw null;
                                        }
                                        recyclerView3.scrollToPosition(i2);
                                    }
                                } else if (num != null) {
                                    RecyclerView recyclerView4 = tiledPageListFragment2.f78591OooOooo;
                                    if (recyclerView4 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                        throw null;
                                    }
                                    recyclerView4.scrollToPosition(num.intValue());
                                } else {
                                    RecyclerView recyclerView5 = tiledPageListFragment2.f78591OooOooo;
                                    if (recyclerView5 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                        throw null;
                                    }
                                    recyclerView5.scrollToPosition(0);
                                }
                            }
                            View view = tiledPageListFragment2.f78590OooOooO;
                            if (view != null) {
                                view.setVisibility(arrayList2.isEmpty() ? 0 : 8);
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBackground");
                                throw null;
                            }
                        }
                    });
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TiledPageListFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78600OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TiledPageListFragment tiledPageListFragment = TiledPageListFragment.this;
                C30367OooO0o0 c30367OooO0o0OooOoO = tiledPageListFragment.OooOoO();
                OooO00o oooO00o = new OooO00o(tiledPageListFragment);
                this.f78600OooOo0o = 1;
                if (c30367OooO0o0OooOoO.f108346OooOo0O.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(TiledPageListFragment.this).OooO0o(R.id.tiledPageEditorFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23758OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78603OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23758OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78603OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78603OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78604OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78604OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = TiledPageListFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78604OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23759OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78606OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23759OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78606OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78606OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public TiledPageListFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0OO());
        C23758OooO0Oo c23758OooO0Oo = new C23758OooO0Oo(c32447OooOOoOooO0OO);
        this.f78589OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30367OooO0o0.class), c23758OooO0Oo, new OooO0o(c32447OooOOoOooO0OO), new C23759OooO0o0(c32447OooOOoOooO0OO));
        this.f78593Oooo00O = new OooO00o();
    }

    public final C30367OooO0o0 OooOoO() {
        return (C30367OooO0o0) this.f78589OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_page_editor, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.containsKey("filter")) {
                arguments = null;
            }
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("filter");
                OooOOO0.OooO0o0(serializable, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVOFilter");
                this.f78588OooOoo = (TiledPagePreviewVOFilter) serializable;
            }
        }
        this.f78590OooOooO = view.findViewById(R.id.empty_bg_wrapper);
        this.f78591OooOooo = (RecyclerView) view.findViewById(R.id.item_list);
        if (this.f78588OooOoo == null) {
            OooOOO0.OooOOOO("filterVO");
            throw null;
        }
        C30455OooO0Oo c30455OooO0Oo = new C30455OooO0Oo(!r7.getReadOnly());
        this.f78592Oooo000 = c30455OooO0Oo;
        c30455OooO0Oo.f108752OooO0OO = new ViewOnClickListenerC28413OooO0oO(this, 4);
        c30455OooO0Oo.f108753OooO0Oo = new ViewOnLongClickListenerC30448OooOoo0(this);
        RecyclerView recyclerView = this.f78591OooOooo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("tiledPageList");
            throw null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), recyclerView.getResources().getConfiguration().screenWidthDp / 143));
        C30455OooO0Oo c30455OooO0Oo2 = this.f78592Oooo000;
        if (c30455OooO0Oo2 == null) {
            OooOOO0.OooOOOO("tiledPageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30455OooO0Oo2);
        recyclerView.setItemAnimator(null);
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = this.f78588OooOoo;
        if (tiledPagePreviewVOFilter == null) {
            OooOOO0.OooOOOO("filterVO");
            throw null;
        }
        if (!tiledPagePreviewVOFilter.getReadOnly()) {
            C22041OooOOo c22041OooOOo = new C22041OooOOo(this.f78593Oooo00O);
            RecyclerView recyclerView2 = this.f78591OooOooo;
            if (recyclerView2 == null) {
                OooOOO0.OooOOOO("tiledPageList");
                throw null;
            }
            c22041OooOOo.OooO0o(recyclerView2);
        }
        RecyclerView recyclerView3 = this.f78591OooOooo;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("tiledPageList");
            throw null;
        }
        recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0o0OO0O.OooOoo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                TiledPageListFragment tiledPageListFragment = this.f108727OooOo0o;
                Context context = tiledPageListFragment.getContext();
                if (context == null) {
                    return;
                }
                int i9 = context.getResources().getConfiguration().screenWidthDp;
                RecyclerView recyclerView4 = tiledPageListFragment.f78591OooOooo;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView4.getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int i10 = i9 / 143;
                if (gridLayoutManager.f65751OooOo != i10) {
                    RecyclerView recyclerView5 = tiledPageListFragment.f78591OooOooo;
                    if (recyclerView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                        throw null;
                    }
                    GridLayoutManager gridLayoutManager2 = new GridLayoutManager(tiledPageListFragment.requireContext(), i10);
                    gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
                    recyclerView5.setLayoutManager(gridLayoutManager2);
                }
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}

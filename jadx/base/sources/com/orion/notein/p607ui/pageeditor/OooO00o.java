package com.orion.notein.p607ui.pageeditor;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0o00oOo.C30035OooO0oO;
import o0o0OO0o.C30455OooO0Oo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f78492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ TiledPagePreviewVO f78493OooO0OO;

    public OooO00o(ArrayList arrayList, RecyclerView recyclerView, TiledPagePreviewVO tiledPagePreviewVO) {
        this.f78491OooO00o = arrayList;
        this.f78492OooO0O0 = recyclerView;
        this.f78493OooO0OO = tiledPagePreviewVO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        OooOOO0.OooO0oO(animator, "animator");
        Iterator it = this.f78491OooO00o.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f78492OooO0O0.findViewHolderForAdapterPosition(((Number) ((C32443OooOOO) it.next()).f116638OooOo0o).intValue());
            if (abstractC22078OooOooOFindViewHolderForAdapterPosition != null) {
                C30035OooO0oO.OooO0O0 oooO0O0 = abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30035OooO0oO.OooO0O0 ? (C30035OooO0oO.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition : null;
                if (oooO0O0 != null) {
                    oooO0O0.OooOOOo();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition;
        OooOOO0.OooO0oO(animator, "animator");
        for (C32443OooOOO c32443OooOOO : this.f78491OooO00o) {
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            if (!OooOOO0.OooO0O0(((TiledPagePreviewVO) c32443OooOOO.f116637OooOo).getId(), this.f78493OooO0OO.getId()) && (abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f78492OooO0O0.findViewHolderForAdapterPosition(iIntValue)) != null) {
                C30455OooO0Oo.OooO0O0 oooO0O0 = abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30455OooO0Oo.OooO0O0 ? (C30455OooO0Oo.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition : null;
                if (oooO0O0 != null) {
                    oooO0O0.OooO0OO();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        OooOOO0.OooO0oO(animator, "animator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOOO0.OooO0oO(animator, "animator");
        ArrayList<C32443OooOOO> arrayList = this.f78491OooO00o;
        for (C32443OooOOO c32443OooOOO : arrayList) {
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) c32443OooOOO.f116637OooOo;
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f78492OooO0O0.findViewHolderForAdapterPosition(iIntValue);
            if (abstractC22078OooOooOFindViewHolderForAdapterPosition != null) {
                boolean zOooO0O0 = OooOOO0.OooO0O0(tiledPagePreviewVO.getId(), this.f78493OooO0OO.getId());
                C30455OooO0Oo.OooO0O0 oooO0O0 = abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30455OooO0Oo.OooO0O0 ? (C30455OooO0Oo.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition : null;
                if (oooO0O0 != null) {
                    oooO0O0.OooO0Oo(arrayList.size(), zOooO0O0);
                }
            }
        }
    }
}

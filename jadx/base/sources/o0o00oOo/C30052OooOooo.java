package o0o00oOo;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import o0o00oOo.C30035OooO0oO;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00oOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30052OooOooo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f106875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f106876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f106877OooO0OO;

    public C30052OooOooo(ArrayList arrayList, RecyclerView recyclerView, NoteVO noteVO) {
        this.f106875OooO00o = arrayList;
        this.f106876OooO0O0 = recyclerView;
        this.f106877OooO0OO = noteVO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(animator, "animator");
        for (C32443OooOOO c32443OooOOO : this.f106875OooO00o) {
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f106876OooO0O0.findViewHolderForAdapterPosition(iIntValue);
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
        kotlin.jvm.internal.OooOOO0.OooO0oO(animator, "animator");
        for (C32443OooOOO c32443OooOOO : this.f106875OooO00o) {
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteVO) c32443OooOOO.f116637OooOo).getId(), this.f106877OooO0OO.getId()) && (abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f106876OooO0O0.findViewHolderForAdapterPosition(iIntValue)) != null) {
                C30035OooO0oO.OooO0O0 oooO0O0 = abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30035OooO0oO.OooO0O0 ? (C30035OooO0oO.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition : null;
                if (oooO0O0 != null) {
                    oooO0O0.OooOOOo();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(animator, "animator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(animator, "animator");
        ArrayList<C32443OooOOO> arrayList = this.f106875OooO00o;
        for (C32443OooOOO c32443OooOOO : arrayList) {
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116637OooOo;
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = this.f106876OooO0O0.findViewHolderForAdapterPosition(iIntValue);
            if (abstractC22078OooOooOFindViewHolderForAdapterPosition != null) {
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), this.f106877OooO0OO.getId());
                if (abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C30035OooO0oO.OooO0O0) {
                    ((C30035OooO0oO.OooO0O0) abstractC22078OooOooOFindViewHolderForAdapterPosition).OooOOo0(arrayList.size(), zOooO0O0);
                }
            }
        }
    }
}

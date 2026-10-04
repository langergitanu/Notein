package o0o0O0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31051OooOo0O;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0O0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30183OooO0oo f107443OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ View f107444OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f107445OooOoO0;

    public /* synthetic */ OooO0O0(View view, View view2, C30183OooO0oo c30183OooO0oo) {
        this.f107444OooOo0o = view;
        this.f107443OooOo = c30183OooO0oo;
        this.f107445OooOoO0 = view2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C31051OooOo0O noteSimpleInfoVO = (C31051OooOo0O) obj;
        OooOOO0.OooO0oO(noteSimpleInfoVO, "noteSimpleInfoVO");
        final View view = this.f107444OooOo0o;
        view.setTranslationX(view.getWidth());
        view.setVisibility(0);
        final C30183OooO0oo c30183OooO0oo = this.f107443OooOo;
        c30183OooO0oo.getClass();
        View viewFindViewById = view.findViewById(R.id.iv_back);
        final View view2 = this.f107445OooOoO0;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0.OooO0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                c30183OooO0oo.getClass();
                C30183OooO0oo.OooO0O0(view2, view);
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.tv_type_info);
        textView.setText(noteSimpleInfoVO.f110860OooO0O0 ? textView.getContext().getString(R.string.note_list_tabs_pdf) : noteSimpleInfoVO.f110861OooO0OO ? textView.getContext().getString(R.string.note_list_tabs_folder) : textView.getContext().getString(R.string.note_list_tabs_note));
        ((TextView) view.findViewById(R.id.tv_size_info)).setText(C31430OooO00o.OooO0OO(noteSimpleInfoVO.f110863OooO0o));
        ((TextView) view.findViewById(R.id.tv_creation_time_info)).setText(noteSimpleInfoVO.f110866OooO0oo);
        ((TextView) view.findViewById(R.id.tv_modification_time_info)).setText(noteSimpleInfoVO.f110858OooO);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_sync_time_info);
        textView2.setText(noteSimpleInfoVO.f110865OooO0oO == 0 ? textView2.getContext().getString(R.string.note_no_sync) : noteSimpleInfoVO.f110867OooOO0);
        float width = view2.getWidth();
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, -width);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0OoO0oo;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28291OooO0OO;
import o0OoO000.ViewOnClickListenerC28529OooOO0o;
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28565Ooooo00;
import o0OoOOo.ViewOnClickListenerC29133OooO0oO;
import o0OoOOo0.ViewOnClickListenerC29184OooO0Oo;
import o0OoOoo.ViewOnClickListenerC29219OooO0OO;
import o0Ooo0oo.C29441OooO0OO;
import o0Ooo0oo.C29449OooOO0o;
import o0Ooo0oo.C29478Oooo0oO;
import o0Ooo0oo.C29482OoooO00;
import o0Ooo0oo.C29483OoooO0O;
import o0Ooo0oo.C29544o000O0oO;
import o0Ooo0oo.C29553o00O0O;
import o0Ooo0oo.C29554o00Oo0;
import o0Ooo0oo.C29555o00Ooo;
import o0Ooo0oo.ViewOnClickListenerC29444OooO0o0;
import o0Ooo0oo.ViewOnClickListenerC29451OooOOO0;
import o0Ooo0oo.ViewOnClickListenerC29465OooOoo;
import o0Ooo0oo.ViewOnClickListenerC29467OooOooO;
import o0Ooo0oo.ViewOnClickListenerC29468OooOooo;
import o0Ooo0oo.ViewOnHoverListenerC29453OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oo0oO0.C34897o00o0OO;

/* JADX INFO: renamed from: o0OoO0oo.o0OoOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28975o0OoOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102649OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102650OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f102651OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f102652OooOoO0;

    public /* synthetic */ C28975o0OoOo0(Object obj, Object obj2, Object obj3, int i) {
        this.f102650OooOo0o = i;
        this.f102649OooOo = obj;
        this.f102652OooOoO0 = obj2;
        this.f102651OooOoO = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Integer num;
        String strO000OoO;
        int i;
        int i2;
        String strO000OoO2;
        int i3;
        int i4;
        switch (this.f102650OooOo0o) {
            case 0:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                if (it instanceof PenBarChildFragment) {
                    final PenBarChildFragment penBarChildFragment = (PenBarChildFragment) it;
                    InterfaceC21987OooOoo viewLifecycleOwner = ((NoteEditorContainerFragment) this.f102652OooOoO0).getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    final View view = (View) this.f102649OooOo;
                    C28753o00000OO c28753o00000OO = (C28753o00000OO) this.f102651OooOoO;
                    penBarChildFragment.f75247OooOooO = viewLifecycleOwner;
                    C33781o00o0O c33781o00o0O = penBarChildFragment.Oooo0oO().f75152OooOOOo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, 0);
                    penBarChildFragment.f75248OooOooo = view;
                    view.setFocusableInTouchMode(true);
                    View view2 = penBarChildFragment.f75248OooOooo;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view2.setVisibility(4);
                    penBarChildFragment.f75251Oooo000 = view.findViewById(R.id.cl_pen_bar_container);
                    View viewFindViewById = view.findViewById(R.id.drag_handle);
                    penBarChildFragment.f75252Oooo00O = viewFindViewById;
                    if (viewFindViewById == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                        throw null;
                    }
                    viewFindViewById.setOnTouchListener(penBarChildFragment.f75296o0000OOO);
                    View viewFindViewById2 = view.findViewById(R.id.pen_box_icon_wrapper);
                    penBarChildFragment.f75250Oooo0 = viewFindViewById2;
                    if (viewFindViewById2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    Rect rect = new Rect(0, 0, PenBarChildFragment.f75240o0000OOo, PenBarChildFragment.f75242o0000Oo0);
                    View view3 = penBarChildFragment.f75252Oooo00O;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                        throw null;
                    }
                    viewFindViewById2.setTouchDelegate(new TouchDelegate(rect, view3));
                    penBarChildFragment.f75253Oooo00o = view.findViewById(R.id.v_shadow_divider);
                    penBarChildFragment.f75254Oooo0O0 = (ImageView) view.findViewById(R.id.pen_box_icon);
                    penBarChildFragment.f75255Oooo0OO = (ImageView) view.findViewById(R.id.pen_box_tape_pen_tint);
                    penBarChildFragment.f75257Oooo0o0 = (ImageView) view.findViewById(R.id.pen_box_icon_tint);
                    LinkedHashMap linkedHashMap = penBarChildFragment.f75309o00ooo;
                    linkedHashMap.clear();
                    linkedHashMap.put(0, C20519OooO0Oo.OooO0OO(new C29449OooOO0o(penBarChildFragment, 0)));
                    penBarChildFragment.f75256Oooo0o = view.findViewById(R.id.cl_primary);
                    penBarChildFragment.f75258Oooo0oO = (ConstraintLayout) view.findViewById(R.id.cl_secondary);
                    penBarChildFragment.f75259Oooo0oo = (ConstraintLayout) view.findViewById(R.id.cl_pen_list);
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pen_list);
                    recyclerView.setItemAnimator(null);
                    C29554o00Oo0 c29554o00Oo0 = penBarChildFragment.f75308o00oO0o;
                    recyclerView.setAdapter(c29554o00Oo0);
                    c29554o00Oo0.f104839OooO0O0 = new ViewOnClickListenerC28291OooO0OO(penBarChildFragment, 2);
                    recyclerView.addOnScrollListener(new C29482OoooO00(penBarChildFragment));
                    penBarChildFragment.f75249Oooo = recyclerView;
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_more_pen);
                    if (imageView != null) {
                        imageView.setOnClickListener(new ViewOnClickListenerC28529OooOO0o(penBarChildFragment, 1));
                    } else {
                        imageView = null;
                    }
                    penBarChildFragment.f75262OoooO00 = imageView;
                    penBarChildFragment.f75261OoooO0 = (ConstraintLayout) view.findViewById(R.id.cl_tertiary);
                    penBarChildFragment.f75263OoooO0O = (ConstraintLayout) view.findViewById(R.id.cl_pen_color);
                    RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_color_list);
                    recyclerView2.setItemAnimator(null);
                    C29553o00O0O c29553o00O0O = penBarChildFragment.f75307o00oO0O;
                    recyclerView2.setAdapter(c29553o00O0O);
                    penBarChildFragment.f75260OoooO = recyclerView2;
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_star_color);
                    imageView2.setOnClickListener(new ViewOnClickListenerC29184OooO0Oo(penBarChildFragment, 1));
                    penBarChildFragment.f75264OoooOO0 = imageView2;
                    penBarChildFragment.f75265OoooOOO = (ImageView) view.findViewById(R.id.iv_eraser_px);
                    penBarChildFragment.f75266OoooOOo = (ImageView) view.findViewById(R.id.iv_eraser_stroke);
                    penBarChildFragment.f75267OoooOo0 = (ImageView) view.findViewById(R.id.iv_eraser_lasso);
                    penBarChildFragment.f75268OoooOoO = (TextView) view.findViewById(R.id.tv_clear_page);
                    penBarChildFragment.f75302o000oOoO = (ConstraintLayout) view.findViewById(R.id.cl_eraser);
                    c29553o00O0O.f104835OooO0Oo = new ViewOnClickListenerC28565Ooooo00(penBarChildFragment, 2);
                    TextView textView = penBarChildFragment.f75268OoooOoO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvClearPage");
                        throw null;
                    }
                    textView.setOnClickListener((View.OnClickListener) penBarChildFragment.f75288o00000o0.getValue());
                    ImageView imageView3 = penBarChildFragment.f75265OoooOOO;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserPx");
                        throw null;
                    }
                    imageView3.setOnClickListener(new ViewOnClickListenerC29465OooOoo(penBarChildFragment, 0));
                    ImageView imageView4 = penBarChildFragment.f75266OoooOOo;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserStroke");
                        throw null;
                    }
                    imageView4.setOnClickListener(new ViewOnClickListenerC29219OooO0OO(penBarChildFragment, 1));
                    ImageView imageView5 = penBarChildFragment.f75267OoooOo0;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserLasso");
                        throw null;
                    }
                    imageView5.setOnClickListener(new ViewOnClickListenerC29467OooOooO(penBarChildFragment, 0));
                    penBarChildFragment.f75269OoooOoo = (ConstraintLayout) view.findViewById(R.id.cl_quaternary_large);
                    penBarChildFragment.f75278Ooooooo = (ConstraintLayout) view.findViewById(R.id.cl_quaternary_small);
                    penBarChildFragment.f75270Ooooo00 = (ConstraintLayout) view.findViewById(R.id.cl_pen_width);
                    RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.rv_pen_width_list);
                    recyclerView3.setItemAnimator(null);
                    C29544o000O0oO c29544o000O0oO = penBarChildFragment.f75315o0ooOO0;
                    recyclerView3.setAdapter(c29544o000O0oO);
                    c29544o000O0oO.f104803OooO0O0 = new ViewOnClickListenerC28534OooOOoo(penBarChildFragment, 1);
                    penBarChildFragment.f75271Ooooo0o = (ConstraintLayout) view.findViewById(R.id.cl_lasso);
                    final C29441OooO0OO c29441OooO0OO = new C29441OooO0OO(penBarChildFragment, 0);
                    ImageView imageView6 = (ImageView) view.findViewById(R.id.iv_free_lasso);
                    imageView6.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo0oo.OooO0Oo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                            if (!penBarChildFragment2.f75311o0OO00O) {
                                ImageView imageView7 = penBarChildFragment2.f75272OooooO0;
                                if (imageView7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoFree");
                                    throw null;
                                }
                                if (imageView7.isSelected()) {
                                    c29441OooO0OO.invoke(DrawToolFactory.LASSO_TYPE_FREE);
                                    return;
                                }
                            }
                            penBarChildFragment2.Oooo0oO().OooOOO0(DrawToolFactory.LASSO_TYPE_FREE);
                        }
                    });
                    penBarChildFragment.f75272OooooO0 = imageView6;
                    ImageView imageView7 = (ImageView) view.findViewById(R.id.iv_rect_lasso);
                    imageView7.setOnClickListener(new ViewOnClickListenerC29444OooO0o0(penBarChildFragment, c29441OooO0OO, 0));
                    penBarChildFragment.f75273OooooOO = imageView7;
                    ImageView imageView8 = (ImageView) view.findViewById(R.id.iv_capture_lasso);
                    imageView8.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo0oo.OooO0o
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                            if (!penBarChildFragment2.f75311o0OO00O) {
                                ImageView imageView9 = penBarChildFragment2.f75274OooooOo;
                                if (imageView9 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoCapture");
                                    throw null;
                                }
                                if (imageView9.isSelected()) {
                                    c29441OooO0OO.invoke(DrawToolFactory.LASSO_TYPE_CAPTURE);
                                    return;
                                }
                            }
                            InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment2.f75247OooOooO;
                            if (interfaceC21987OooOoo != null) {
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C29476Oooo0o(penBarChildFragment2, null), 3);
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                                throw null;
                            }
                        }
                    });
                    penBarChildFragment.f75274OooooOo = imageView8;
                    penBarChildFragment.f75276Oooooo0 = (ConstraintLayout) view.findViewById(R.id.cl_vector);
                    RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.rv_vector_list);
                    recyclerView4.setItemAnimator(null);
                    C29555o00Ooo c29555o00Ooo = penBarChildFragment.f75316o0ooOOo;
                    recyclerView4.setAdapter(c29555o00Ooo);
                    recyclerView4.addOnScrollListener(new C29478Oooo0oO(penBarChildFragment));
                    penBarChildFragment.f75275Oooooo = recyclerView4;
                    ImageView imageView9 = (ImageView) view.findViewById(R.id.iv_more_vector);
                    imageView9.setOnClickListener(new ViewOnClickListenerC29133OooO0oO(penBarChildFragment, 1));
                    penBarChildFragment.f75277OoooooO = imageView9;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cl_selected_pen_width);
                    constraintLayout.setOnClickListener(new ViewOnClickListenerC26091OooO00o(penBarChildFragment, 3));
                    penBarChildFragment.f75314o0OoOo0 = constraintLayout;
                    penBarChildFragment.f75320ooOO = (ImageView) constraintLayout.findViewById(R.id.iv_selected_pen_width);
                    ConstraintLayout constraintLayout2 = penBarChildFragment.f75314o0OoOo0;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clSelectedPenWidth");
                        throw null;
                    }
                    penBarChildFragment.f75303o00O0O = (TextView) constraintLayout2.findViewById(R.id.tv_selected_pen_width);
                    ImageView imageView10 = (ImageView) view.findViewById(R.id.iv_selected_eraser_type);
                    imageView10.setOnClickListener(new o0O0oO.OooO0O0(penBarChildFragment, 2));
                    penBarChildFragment.f75304o00Oo0 = imageView10;
                    ImageView imageView11 = (ImageView) view.findViewById(R.id.iv_selected_lasso_type);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView11);
                    C28050OooO0OO.OooO00o(imageView11, 500L, new ViewOnClickListenerC28540OooOoOO(c29441OooO0OO, 1));
                    penBarChildFragment.f75305o00Ooo = imageView11;
                    ViewOnClickListenerC29468OooOooo viewOnClickListenerC29468OooOooo = new ViewOnClickListenerC29468OooOooo(penBarChildFragment, 0);
                    c29555o00Ooo.getClass();
                    c29555o00Ooo.f104845OooO0O0 = viewOnClickListenerC29468OooOooo;
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fl_show_favorite_toolbox);
                    penBarChildFragment.f75306o00o0O = viewGroup;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                        throw null;
                    }
                    C28050OooO0OO.OooO00o(viewGroup, 500L, new ViewOnClickListenerC29451OooOOO0(penBarChildFragment, 0));
                    penBarChildFragment.f75312o0OOO0o = 0;
                    penBarChildFragment.f75313o0Oo0oo = new Rect();
                    Object parent = view.getParent();
                    View view4 = parent instanceof View ? (View) parent : null;
                    if (view4 != null) {
                        view4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Ooo0oo.OooO0oo
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view5, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                int i13 = PenBarChildFragment.f75240o0000OOo;
                                if (i7 - i5 == i11 - i9 && i8 - i6 == i12 - i10) {
                                    return;
                                }
                                PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                                if (penBarChildFragment2.f75310o0O0O00) {
                                    return;
                                }
                                View view6 = penBarChildFragment2.f75248OooOooo;
                                if (view6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                Object parent2 = view6.getParent();
                                View view7 = parent2 instanceof View ? (View) parent2 : null;
                                int width = view7 != null ? view7.getWidth() : 0;
                                View view8 = penBarChildFragment2.f75248OooOooo;
                                if (view8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                Object parent3 = view8.getParent();
                                View view9 = parent3 instanceof View ? (View) parent3 : null;
                                int height = view9 != null ? view9.getHeight() : 0;
                                if (width <= 0 || height <= 0) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                                    c20358OooO00o.OooO0OO("reConstrainNormalLayout: parentWidth or parentHeight is null", new Object[0]);
                                    return;
                                }
                                Integer num2 = (Integer) penBarChildFragment2.Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
                                if (num2 != null && num2.intValue() == 1) {
                                    penBarChildFragment2.OooooOo();
                                    return;
                                }
                                Integer num3 = (Integer) penBarChildFragment2.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                                if (num3 == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("PenBarChildFragment");
                                    c20358OooO00o2.OooO0OO("reConstrainNormalLayout: uiPosition is null", new Object[0]);
                                    return;
                                }
                                int iOooo0o0 = penBarChildFragment2.Oooo0o0(num3.intValue());
                                View view10 = penBarChildFragment2.f75248OooOooo;
                                if (view10 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                if (view10.getLayoutParams().width == iOooo0o0) {
                                    penBarChildFragment2.OooooOo();
                                    return;
                                }
                                View view11 = penBarChildFragment2.f75248OooOooo;
                                if (view11 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view11.getLayoutParams().width = iOooo0o0;
                                View view12 = penBarChildFragment2.f75248OooOooo;
                                if (view12 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view12.requestLayout();
                                View view13 = penBarChildFragment2.f75248OooOooo;
                                if (view13 != null) {
                                    view13.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC29475Oooo0OO(penBarChildFragment2));
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        });
                    }
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Ooo0oo.OooO
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view5, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                            int i13 = PenBarChildFragment.f75240o0000OOo;
                            penBarChildFragment.OoooO0O();
                        }
                    });
                    RecyclerView recyclerView5 = penBarChildFragment.f75275Oooooo;
                    if (recyclerView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvVectorList");
                        throw null;
                    }
                    recyclerView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Ooo0oo.OooOO0
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view5, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                            int i13 = PenBarChildFragment.f75240o0000OOo;
                            if (i5 == i9 && i7 == i11 && i6 == i10 && i8 == i12) {
                                return;
                            }
                            penBarChildFragment.OoooO0O();
                        }
                    });
                    if (penBarChildFragment.OooooOO() && (num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue()) != null) {
                        penBarChildFragment.OoooooO(penBarChildFragment.Oooo0o0(num.intValue()), false);
                    }
                    view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0Ooo0oo.OooOOO
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view5, boolean z) {
                            int i5 = PenBarChildFragment.f75240o0000OOo;
                            PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                            Integer num2 = (Integer) penBarChildFragment2.Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
                            Integer num3 = (Integer) penBarChildFragment2.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                            if (num2 != null && num2.intValue() == 0) {
                                if (((Boolean) ((C32443OooOOO) penBarChildFragment2.Oooo0oO().f75185OoooOOo.f121747OooOo0o.getValue()).f116638OooOo0o).booleanValue()) {
                                    if (z) {
                                        return;
                                    }
                                    view.requestFocus();
                                    return;
                                } else if ((num3 != null && num3.intValue() == 0) || ((num3 != null && num3.intValue() == 2) || ((num3 != null && num3.intValue() == 6) || (num3 != null && num3.intValue() == 4)))) {
                                    penBarChildFragment2.Oooo0oO().OooOO0(1);
                                }
                            }
                            if (z || !kotlin.jvm.internal.OooOOO0.OooO0O0(penBarChildFragment2.Oooo00O().f73373OooOoo.f121747OooOo0o.getValue(), Boolean.FALSE)) {
                                return;
                            }
                            penBarChildFragment2.OoooO00(false, true);
                        }
                    });
                    penBarChildFragment.f75301o000OOo = c28753o00000OO;
                    ViewOnHoverListenerC29453OooOOOo viewOnHoverListenerC29453OooOOOo = new ViewOnHoverListenerC29453OooOOOo();
                    View view5 = penBarChildFragment.f75252Oooo00O;
                    if (view5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                        throw null;
                    }
                    view5.setOnHoverListener(viewOnHoverListenerC29453OooOOOo);
                    View view6 = penBarChildFragment.f75250Oooo0;
                    if (view6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    view6.setOnHoverListener(viewOnHoverListenerC29453OooOOOo);
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.noteeditor.penbar.OooO00o(penBarChildFragment, null), 3);
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29483OoooO0O(penBarChildFragment, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                Set<String> set = (Set) this.f102651OooOoO;
                C34897o00o0OO c34897o00o0OO = (C34897o00o0OO) this.f102649OooOo;
                c34897o00o0OO.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f102652OooOoO0);
                try {
                    int i5 = 1;
                    for (String str : set) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i5);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i5, str);
                        }
                        i5++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    C34897o00o0OO c34897o00o0OO2 = c34897o00o0OO;
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        PaperOrientation paperOrientationOooOOO = C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4));
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)) != 0;
                        int i7 = iOooO0Oo4;
                        int i8 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i9 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i9)) {
                            strO000OoO2 = null;
                            i4 = iOooO0Oo;
                            i3 = i7;
                        } else {
                            strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i9);
                            i3 = i7;
                            i4 = iOooO0Oo;
                        }
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo13;
                        int i12 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i10);
                        int i13 = iOooO0Oo17;
                        int i14 = iOooO0Oo14;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i13)) != 0;
                        int i15 = iOooO0Oo18;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i15);
                        iOooO0Oo18 = i15;
                        C34897o00o0OO c34897o00o0OO3 = c34897o00o0OO2;
                        int i16 = iOooO0Oo19;
                        arrayList.add(new PageEntity(strO000OoO3, strO000OoO4, strO000OoO5, paperOrientationOooOOO, strO000OoO, i6, strO000OoO6, strO000OoO7, j, j2, strO000OoO8, z, i8, strO000OoO9, strO000OoO2, i12, z2, c34897o00o0OO3.f125434OooO0OO.stringToChildren(strO000OoO10), (int) interfaceC24749OooO0OoO0ooOOo.getLong(i16)));
                        iOooO0Oo19 = i16;
                        iOooO0Oo13 = i11;
                        iOooO0Oo14 = i14;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        iOooO0Oo16 = i10;
                        iOooO0Oo17 = i13;
                        c34897o00o0OO2 = c34897o00o0OO3;
                        iOooO0Oo = i4;
                        iOooO0Oo15 = i9;
                        iOooO0Oo4 = i3;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}

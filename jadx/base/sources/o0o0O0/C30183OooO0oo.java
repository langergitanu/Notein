package o0o0O0;

import Oooo0.o000000O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0OoOO00.ViewOnClickListenerC29033OoooOOo;
import o0Ooo.ViewOnClickListenerC29256OooO0Oo;
import o0Ooo.ViewOnClickListenerC29259OooO0oO;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0o00oOo.C30030OooO0O0;
import o0o0O00.C30200OooOOO;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30209OooOo00;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30183OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f107460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public NoteVO f107461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C30201OooOOO0 f107462OooO0OO;

    /* JADX INFO: renamed from: o0o0O0.OooO0oo$OooO00o */
    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ View f107463OooO00o;

        public OooO00o(View view) {
            this.f107463OooO00o = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f107463OooO00o.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public C30183OooO0oo(View view) {
        this.f107460OooO00o = view;
        view.findViewById(R.id.item_rename).setOnClickListener(new ViewOnClickListenerC29578OooO00o(this, 2));
        view.findViewById(R.id.item_add_label).setOnClickListener(new ViewOnClickListenerC28591o0000oOO(this, 3));
        view.findViewById(R.id.item_export).setOnClickListener(new ViewOnClickListenerC30181OooO0o0(this, 0));
        int i = 1;
        view.findViewById(R.id.item_move).setOnClickListener(new ViewOnClickListenerC29256OooO0Oo(this, i));
        view.findViewById(R.id.item_delete).setOnClickListener(new ViewOnClickListenerC29781OooO0o(this, i));
        View viewFindViewById = view.findViewById(R.id.item_create_shortcut);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC28603OooO00o(this, 5));
        }
        final View viewFindViewById2 = view.findViewById(R.id.cl_note_actions);
        final View viewFindViewById3 = view.findViewById(R.id.cl_folder_colors);
        final View view2 = null;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(8);
            viewFindViewById3.findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() { // from class: o0o0O0.OooO0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    View view4 = viewFindViewById2;
                    OooOOO0.OooO0Oo(view4);
                    View view5 = viewFindViewById3;
                    this.getClass();
                    C30183OooO0oo.OooO0O0(view4, view5);
                }
            });
            RecyclerView recyclerView = (RecyclerView) viewFindViewById3.findViewById(R.id.rv_folder_color_list);
            o0o0O000.OooO0OO oooO0OO = new o0o0O000.OooO0OO(R.layout.item_bottomsheet_folder_color);
            oooO0OO.f107632OooO0OO = new ViewOnClickListenerC29259OooO0oO(1, this, oooO0OO);
            recyclerView.setAdapter(oooO0OO);
        } else {
            viewFindViewById3 = null;
        }
        View viewFindViewById4 = view.findViewById(R.id.item_folder_color);
        OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
        C28050OooO0OO.OooO00o(viewFindViewById4, 1000L, new View.OnClickListener() { // from class: o0o0O0.OooO0oO
            @Override // android.view.View.OnClickListener
            public final void onClick(View v) {
                View view3;
                final View view4;
                final View view5;
                OooOOO0.OooO0oO(v, "v");
                final C30183OooO0oo c30183OooO0oo = this;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null) {
                    if (C30983OooO0o.OooO00o(v, "getContext(...)") && (view4 = viewFindViewById2) != null && (view5 = viewFindViewById3) != null) {
                        C30201OooOOO0 c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO;
                        if (c30201OooOOO0 != null) {
                            c30201OooOOO0.OooO0O0(noteVO, new InterfaceC32507OooOO0o() { // from class: o0o0O0.OooO0OO
                                @Override // oO0O000o.InterfaceC32507OooOO0o
                                public final Object invoke(Object obj) {
                                    List folderColorVOs = (List) obj;
                                    OooOOO0.OooO0oO(folderColorVOs, "folderColorVOs");
                                    View view6 = view5;
                                    view6.setTranslationX(view6.getWidth());
                                    view6.setVisibility(0);
                                    C30183OooO0oo c30183OooO0oo2 = c30183OooO0oo;
                                    c30183OooO0oo2.getClass();
                                    RecyclerView recyclerView2 = (RecyclerView) view6.findViewById(R.id.rv_folder_color_list);
                                    recyclerView2.setLayoutManager(new GridLayoutManager(view6.getContext(), (c30183OooO0oo2.f107460OooO00o.getWidth() - o000000O.OooO0o(20)) / o000000O.OooO0o(70)));
                                    RecyclerView.AbstractC22062OooO0oO adapter = recyclerView2.getAdapter();
                                    OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.notelist.folder.FolderColorAdapter");
                                    ((o0o0O000.OooO0OO) adapter).OooO0Oo(folderColorVOs);
                                    View view7 = view4;
                                    float width = view7.getWidth();
                                    Property property = View.TRANSLATION_X;
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view7, (Property<View, Float>) property, 0.0f, -width);
                                    objectAnimatorOfFloat.setDuration(300L);
                                    objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view6, (Property<View, Float>) property, width, 0.0f);
                                    objectAnimatorOfFloat2.setDuration(300L);
                                    objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                                    animatorSet.start();
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    C30201OooOOO0 c30201OooOOO02 = c30183OooO0oo.f107462OooO0OO;
                    if (c30201OooOOO02 != null) {
                        Iterable iterable = (Iterable) c30201OooOOO02.f107549OooO0OO.f77140OooOo0o.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (((C31040OooOO0o) obj).f110821OooO00o != 0) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            C31040OooOO0o c31040OooOO0o = (C31040OooOO0o) it.next();
                            int folderCoverColor = noteVO.getFolderCoverColor();
                            int i2 = c31040OooOO0o.f110821OooO00o;
                            if (folderCoverColor != i2) {
                                z = false;
                            }
                            arrayList2.add(new C31040OooOO0o(i2, z));
                        }
                        OooO oooO = c30201OooOOO02.f107552OooO0o0;
                        if (oooO == null || (view3 = oooO.f107437OooO0Oo) == null) {
                            return;
                        }
                        C30030OooO0O0 c30030OooO0O0 = (C30030OooO0O0) c30201OooOOO02.f107553OooO0oO.getValue();
                        String folderId = noteVO.getId();
                        c30030OooO0O0.getClass();
                        OooOOO0.OooO0oO(folderId, "folderId");
                        boolean zCompareAndSet = c30030OooO0O0.f106753OooO0oo.compareAndSet(false, true);
                        Context context = c30030OooO0O0.f106746OooO00o;
                        int i3 = c30030OooO0O0.f106752OooO0oO;
                        if (zCompareAndSet) {
                            Object systemService = context.getSystemService("layout_inflater");
                            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_folder_color, (ViewGroup) null);
                            OooOOO0.OooO0o(viewInflate, "inflate(...)");
                            RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(R.id.rv_folder_color_list);
                            c30030OooO0O0.f106749OooO0Oo = recyclerView2;
                            if (recyclerView2 != null) {
                                recyclerView2.setLayoutManager(new GridLayoutManager(context, 5));
                            }
                            o0o0O000.OooO0OO oooO0OO2 = new o0o0O000.OooO0OO(R.layout.item_popupwindow_folder_color);
                            oooO0OO2.f107632OooO0OO = new ViewOnClickListenerC29033OoooOOo(c30030OooO0O0, 2);
                            c30030OooO0O0.f106751OooO0o0 = oooO0OO2;
                            RecyclerView recyclerView3 = c30030OooO0O0.f106749OooO0Oo;
                            if (recyclerView3 != null) {
                                recyclerView3.setAdapter(oooO0OO2);
                            }
                            PopupWindow popupWindow = new PopupWindow(viewInflate, i3, o000000O.OooO0o(70), false);
                            c30030OooO0O0.f106748OooO0OO = popupWindow;
                            popupWindow.setOutsideTouchable(true);
                            PopupWindow popupWindow2 = c30030OooO0O0.f106748OooO0OO;
                            if (popupWindow2 != null) {
                                popupWindow2.setElevation(10.0f);
                            }
                        }
                        c30030OooO0O0.f106750OooO0o = folderId;
                        Rect rect = new Rect();
                        view3.getGlobalVisibleRect(rect);
                        int iIntValue = C28038OooO0Oo.OooO00o(context).f116638OooOo0o.intValue();
                        int i4 = rect.left;
                        int iOooO0o = i4 > iIntValue / 2 ? (i4 - i3) - o000000O.OooO0o(110) : ((i3 / 2) + rect.right) - o000000O.OooO0o(20);
                        int iOooO0o2 = o000000O.OooO0o(135) + rect.bottom;
                        PopupWindow popupWindow3 = c30030OooO0O0.f106748OooO0OO;
                        if (popupWindow3 != null) {
                            popupWindow3.showAtLocation(view3, 0, iOooO0o, iOooO0o2);
                        }
                        o0o0O000.OooO0OO oooO0OO3 = c30030OooO0O0.f106751OooO0o0;
                        if (oooO0OO3 != null) {
                            oooO0OO3.OooO0Oo(arrayList2);
                        }
                    }
                }
            }
        });
        View viewFindViewById5 = view.findViewById(R.id.cl_note_infos);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(8);
            view2 = viewFindViewById5;
        }
        View viewFindViewById6 = view.findViewById(R.id.item_note_info);
        OooOOO0.OooO0o(viewFindViewById6, "findViewById(...)");
        C28050OooO0OO.OooO00o(viewFindViewById6, 1000L, new View.OnClickListener() { // from class: o0o0O0.OooO00o
            @Override // android.view.View.OnClickListener
            public final void onClick(View v) {
                View view3;
                View view4;
                OooOOO0.OooO0oO(v, "v");
                C30183OooO0oo c30183OooO0oo = this;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null) {
                    if (!C30983OooO0o.OooO00o(v, "getContext(...)") || (view3 = viewFindViewById2) == null || (view4 = view2) == null) {
                        C30201OooOOO0 c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO;
                        if (c30201OooOOO0 != null) {
                            InterfaceC21987OooOoo viewLifecycleOwner = c30201OooOOO0.f107547OooO00o.getViewLifecycleOwner();
                            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30209OooOo00(noteVO, null, c30201OooOOO0), 3);
                            return;
                        }
                        return;
                    }
                    C30201OooOOO0 c30201OooOOO02 = c30183OooO0oo.f107462OooO0OO;
                    if (c30201OooOOO02 != null) {
                        OooO0O0 oooO0O0 = new OooO0O0(view4, view3, c30183OooO0oo);
                        InterfaceC21987OooOoo viewLifecycleOwner2 = c30201OooOOO02.f107547OooO00o.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30200OooOOO(c30201OooOOO02, noteVO, oooO0O0, null), 3);
                    }
                }
            }
        });
        view.findViewById(R.id.item_recover_history).setOnClickListener(new ViewOnClickListenerC28958o00oOo0o(this, 3));
    }

    public static void OooO0O0(View view, View view2) {
        float width = view.getWidth();
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, width);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, -width, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        animatorSet.addListener(new OooO00o(view2));
    }

    public final void OooO00o(NoteVO vo, C30201OooOOO0 listener) {
        OooOOO0.OooO0oO(vo, "vo");
        OooOOO0.OooO0oO(listener, "listener");
        this.f107462OooO0OO = listener;
        this.f107461OooO0O0 = vo;
        View view = this.f107460OooO00o;
        View viewFindViewById = view.findViewById(R.id.item_export);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(vo.getType() == 0 ? 0 : 8);
        View viewFindViewById2 = view.findViewById(R.id.item_folder_color);
        OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(vo.getType() != 1 ? 8 : 0);
        View viewFindViewById3 = view.findViewById(R.id.item_recover_history);
        OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
        viewFindViewById3.setVisibility(8);
    }
}

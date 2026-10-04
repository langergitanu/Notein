package o0OoOOOo;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Set;
import o0O0o0oO.ViewOnClickListenerC26049OoooOO0;
import o0O0oooO.o0Oo0oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOo0.C29181OooO00o;
import o0OoOOo0.C29185OooO0o;
import o0Ooo0oo.C29553o00O0O;
import oO00ooO.C32447OooOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoOOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29108OooOOo implements InterfaceC29093OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PopupWindow f103141OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC29094OooO0O0 f103142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC29095OooO0OO f103143OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RecyclerView f103144OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C29185OooO0o f103145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C29181OooO00o f103146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RecyclerView f103147OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public RecyclerView f103148OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C29553o00O0O f103149OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final View f103150OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f103151OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C29051OooOO0o f103152OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int f103137OooOOO0 = o000000O.OooO0o(220);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int f103136OooOOO = o000000O.OooO0o(162);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final int f103138OooOOOO = o000000O.OooO0o(50);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Set<Integer> f103139OooOOOo = oOo000Oo.OooOOO.OoooOo0(new Integer[]{3, 4});

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Set<Integer> f103140OooOOo0 = oOo000Oo.OooOOO.OoooOo0(new Integer[]{7, 8, 9});

    public C29108OooOOo(Context context) {
        this.f103151OooOO0O = C20519OooO0Oo.OooO0OO(new C29103OooOO0o(context, 0));
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_text_full_style, (ViewGroup) null);
        this.f103150OooOO0 = viewInflate;
        PopupWindow popupWindow = new PopupWindow(viewInflate, f103137OooOOO0, f103136OooOOO, true);
        this.f103141OooO = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new C29105OooOOO0(this, 0));
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final boolean OooO00o() {
        return this.f103141OooO.isShowing();
    }

    public final o0o00Ooo.OooOO0 OooO0O0() {
        return (o0o00Ooo.OooOO0) this.f103151OooOO0O.getValue();
    }

    public final void OooO0OO(final C29051OooOO0o viewModel, androidx.lifecycle.OooOo oooOo, InterfaceC29094OooO0O0 interfaceC29094OooO0O0, InterfaceC29095OooO0OO interfaceC29095OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        this.f103152OooOO0o = viewModel;
        this.f103142OooO00o = interfaceC29094OooO0O0;
        this.f103143OooO0O0 = interfaceC29095OooO0OO;
        View view = this.f103150OooOO0;
        this.f103144OooO0OO = (RecyclerView) view.findViewById(R.id.rv_text_style);
        C29185OooO0o c29185OooO0o = new C29185OooO0o(R.layout.item_text_style);
        this.f103145OooO0Oo = c29185OooO0o;
        RecyclerView recyclerView = this.f103144OooO0OO;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextStyle");
            throw null;
        }
        recyclerView.setAdapter(c29185OooO0o);
        C29185OooO0o c29185OooO0o2 = this.f103145OooO0Oo;
        if (c29185OooO0o2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textStyleAdapter");
            throw null;
        }
        c29185OooO0o2.f103511OooO0OO = new o0Oo0oo(this, 3);
        this.f103147OooO0o0 = (RecyclerView) view.findViewById(R.id.rv_color_style);
        C29181OooO00o c29181OooO00o = new C29181OooO00o();
        this.f103146OooO0o = c29181OooO00o;
        RecyclerView recyclerView2 = this.f103147OooO0o0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvColorStyle");
            throw null;
        }
        recyclerView2.setAdapter(c29181OooO00o);
        C29181OooO00o c29181OooO00o2 = this.f103146OooO0o;
        if (c29181OooO00o2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textBoxColorAdapter");
            throw null;
        }
        c29181OooO00o2.f103491OooO0O0 = new ViewOnClickListenerC26049OoooOO0(this, 2);
        this.f103148OooO0oO = (RecyclerView) view.findViewById(R.id.rv_text_color_list);
        this.f103149OooO0oo = new C29553o00O0O(o000000O.OooO0o(2), 2, 0);
        OooO0O0().f106174OooO0oo = new C29107OooOOOo(viewModel);
        OooO0O0().f106173OooO0oO = new ViewOnClickListenerC29104OooOOO(0, interfaceC29094OooO0O0, this);
        C29553o00O0O c29553o00O0O = this.f103149OooO0oo;
        if (c29553o00O0O == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textColorAdapter");
            throw null;
        }
        c29553o00O0O.f104835OooO0Oo = new View.OnClickListener() { // from class: o0OoOOOo.OooOOOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object tag = view2.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                if (penColorVO.getSelected()) {
                    this.f103134OooOo0o.OooO0O0().OooO0oO(view2, penColorVO);
                } else {
                    viewModel.OooO(penColorVO.getColor());
                }
            }
        };
        RecyclerView recyclerView3 = this.f103148OooO0oO;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextColorList");
            throw null;
        }
        recyclerView3.setAdapter(c29553o00O0O);
        C33609OooO0oo.OooO0OO(oooOo, null, null, new C29109OooOOo0(viewModel, this, null), 3);
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final void dismiss() {
        this.f103141OooO.dismiss();
        OooO0O0().dismiss();
        InterfaceC29095OooO0OO interfaceC29095OooO0OO = this.f103143OooO0O0;
        if (interfaceC29095OooO0OO != null) {
            interfaceC29095OooO0OO.OooO0Oo(false);
        }
    }
}

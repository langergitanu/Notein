package o0o0O00;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.widget.EdgeFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0Oo0Ooo.ViewOnClickListenerC28134OooO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28415OooOO0;
import o0o00oO0.ViewOnClickListenerC30011Oooo0OO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30185OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View f107466OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EdgeFragment f107467OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C30189OooO0o f107468OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f107469OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Toolbar f107470OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f107471OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f107472OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f107473OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f107474OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f107475OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public View f107476OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f107477OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f107478OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f107479OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ImageView f107480OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ImageView f107481OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f107482OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ImageView f107483OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ImageView f107484OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public View f107485OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public View f107486OooOo00;

    /* JADX INFO: renamed from: o0o0O00.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC20048OooO00o {
        void OooO00o();
    }

    public C30185OooO00o(EdgeFragment edgeFragment, C30189OooO0o listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.f107467OooO00o = edgeFragment;
        this.f107468OooO0O0 = listener;
    }

    public final View OooO00o(int i) {
        Toolbar toolbar = this.f107470OooO0Oo;
        if (toolbar == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        View viewFindViewById = toolbar.findViewById(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    public final void OooO0O0(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        this.f107470OooO0Oo = toolbar;
        this.f107469OooO0OO = toolbar.findViewById(R.id.normal);
        this.f107471OooO0o = view.findViewById(R.id.btn_creative_library);
        this.f107474OooO0oo = (TextView) view.findViewById(R.id.current_folder_name);
        this.f107475OooOO0 = (TextView) view.findViewById(R.id.parent_folder_name);
        View viewFindViewById = view.findViewById(R.id.btn_menu);
        this.f107472OooO0o0 = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28413OooO0oO(this, 3));
        View viewFindViewById2 = view.findViewById(R.id.btn_back_to_parent);
        this.f107466OooO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC30011Oooo0OO(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_select);
        this.f107473OooO0oO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28139OooO0o(this, 3));
        View viewFindViewById4 = view.findViewById(R.id.btn_search);
        this.f107486OooOo00 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSearch");
            throw null;
        }
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC28141OooO0oO(this, 3));
        View viewFindViewById5 = view.findViewById(R.id.btn_settings);
        this.f107485OooOo0 = viewFindViewById5;
        if (viewFindViewById5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSettings");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new com.google.android.material.search.OooOO0O(this, 4));
        Toolbar toolbar2 = this.f107470OooO0Oo;
        if (toolbar2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        this.f107476OooOO0O = toolbar2.findViewById(R.id.select);
        Toolbar toolbar3 = this.f107470OooO0Oo;
        if (toolbar3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        TextView textView = (TextView) toolbar3.findViewById(R.id.select_all);
        this.f107479OooOOO0 = textView;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28142OooO0oo(this, 3));
        View view2 = this.f107476OooOO0O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
            throw null;
        }
        View viewFindViewById6 = view2.findViewById(R.id.select_finish);
        this.f107477OooOO0o = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectFinish");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new com.google.android.material.search.OooOOO0(this, 3));
        View viewFindViewById7 = view.findViewById(R.id.select_action);
        ImageView imageView = (ImageView) viewFindViewById7.findViewById(R.id.btn_export);
        this.f107480OooOOOO = imageView;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28134OooO(this, 3));
        ImageView imageView2 = (ImageView) viewFindViewById7.findViewById(R.id.btn_copy);
        this.f107481OooOOOo = imageView2;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC26210OooO00o(this, 4));
        ImageView imageView3 = (ImageView) viewFindViewById7.findViewById(R.id.btn_move);
        this.f107483OooOOo0 = imageView3;
        if (imageView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
            throw null;
        }
        imageView3.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(this, 4));
        ImageView imageView4 = (ImageView) viewFindViewById7.findViewById(R.id.btn_delete);
        this.f107482OooOOo = imageView4;
        if (imageView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
            throw null;
        }
        imageView4.setOnClickListener(new ViewOnClickListenerC28137OooO0OO(this, 3));
        ImageView imageView5 = (ImageView) viewFindViewById7.findViewById(R.id.btn_label);
        this.f107484OooOOoo = imageView5;
        if (imageView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
            throw null;
        }
        imageView5.setOnClickListener(new ViewOnClickListenerC28415OooOO0(this, 1));
        this.f107478OooOOO = viewFindViewById7;
    }

    public final void OooO0OO(NoteVO noteVO, NoteVO noteVO2) {
        String name;
        Resources resources = this.f107467OooO00o.getResources();
        kotlin.jvm.internal.OooOOO0.OooO0o(resources, "getResources(...)");
        View view = this.f107471OooO0o;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
            throw null;
        }
        view.setVisibility(8);
        TextView textView = this.f107474OooO0oo;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
            throw null;
        }
        textView.setVisibility(0);
        String string = resources.getString(R.string.action_bar_favorite);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = resources.getString(R.string.action_bar_back_parent);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        if (noteVO == null) {
            TextView textView2 = this.f107474OooO0oo;
            if (textView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                throw null;
            }
            textView2.setText(string);
            View view2 = this.f107473OooO0oO;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = this.f107472OooO0o0;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                throw null;
            }
            view3.setVisibility(0);
            View view4 = this.f107466OooO;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                throw null;
            }
            view4.setVisibility(8);
            TextView textView3 = this.f107475OooOO0;
            if (textView3 != null) {
                textView3.setText(string2);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackParentFolderName");
                throw null;
            }
        }
        TextView textView4 = this.f107474OooO0oo;
        if (textView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
            throw null;
        }
        textView4.setText(noteVO.getName());
        View view5 = this.f107473OooO0oO;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
            throw null;
        }
        view5.setVisibility(0);
        View view6 = this.f107472OooO0o0;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
            throw null;
        }
        view6.setVisibility(8);
        View view7 = this.f107466OooO;
        if (view7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
            throw null;
        }
        view7.setVisibility(0);
        TextView textView5 = this.f107475OooOO0;
        if (textView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackParentFolderName");
            throw null;
        }
        if (noteVO2 != null && (name = noteVO2.getName()) != null) {
            string = name;
        }
        textView5.setText(string);
    }

    public final void OooO0Oo(int i) {
        if (i == 0) {
            View view = this.f107469OooO0OO;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
                throw null;
            }
            view.setVisibility(0);
            View view2 = this.f107476OooOO0O;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = this.f107478OooOOO;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
                throw null;
            }
        }
        if (i != 1) {
            return;
        }
        View view4 = this.f107469OooO0OO;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
            throw null;
        }
        view4.setVisibility(8);
        View view5 = this.f107476OooOO0O;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
            throw null;
        }
        view5.setVisibility(0);
        View view6 = this.f107478OooOOO;
        if (view6 != null) {
            view6.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
    }

    public final void OooO0o(int i) {
        try {
            Toolbar toolbar = this.f107470OooO0Oo;
            if (toolbar == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
                throw null;
            }
            View viewFindViewById = toolbar.findViewById(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(8);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ActionBarDelegate");
            c20358OooO00o.OooO0O0(e);
        }
    }

    public final void OooO0o0(List<NoteVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        Resources resources = this.f107467OooO00o.getResources();
        kotlin.jvm.internal.OooOOO0.OooO0o(resources, "getResources(...)");
        if (list.isEmpty()) {
            TextView textView = this.f107479OooOOO0;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                throw null;
            }
            textView.setText(resources.getString(R.string.action_bar_select_all));
        } else {
            TextView textView2 = this.f107479OooOOO0;
            if (textView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                throw null;
            }
            textView2.setText(resources.getString(R.string.action_bar_cancel_select));
        }
        TextView textView3 = this.f107479OooOOO0;
        if (textView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
            throw null;
        }
        textView3.requestLayout();
        List<NoteVO> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NoteVO) it.next()).getType()));
        }
        if (oOo000Oo.OooOo.Oooo0(arrayList).isEmpty()) {
            ImageView imageView = this.f107480OooOOOO;
            if (imageView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                throw null;
            }
            imageView.setEnabled(false);
            ImageView imageView2 = this.f107481OooOOOo;
            if (imageView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                throw null;
            }
            imageView2.setEnabled(false);
            ImageView imageView3 = this.f107483OooOOo0;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
                throw null;
            }
            imageView3.setEnabled(false);
            ImageView imageView4 = this.f107482OooOOo;
            if (imageView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
                throw null;
            }
            imageView4.setEnabled(false);
            ImageView imageView5 = this.f107484OooOOoo;
            if (imageView5 != null) {
                imageView5.setEnabled(false);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
                throw null;
            }
        }
        ImageView imageView6 = this.f107480OooOOOO;
        if (imageView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        imageView6.setEnabled(!r9.contains(1));
        ImageView imageView7 = this.f107481OooOOOo;
        if (imageView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        imageView7.setEnabled(true);
        ImageView imageView8 = this.f107483OooOOo0;
        if (imageView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
            throw null;
        }
        imageView8.setEnabled(true);
        ImageView imageView9 = this.f107482OooOOo;
        if (imageView9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
            throw null;
        }
        imageView9.setEnabled(true);
        ImageView imageView10 = this.f107484OooOOoo;
        if (imageView10 != null) {
            imageView10.setEnabled(true);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
            throw null;
        }
    }
}

package com.orion.notein.p607ui.paperconfig;

import Oooo.C20811OooO00o;
import Oooo.C20813OooO0o0;
import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oooO.C24755OooO00o;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0O0o0oO.ViewOnClickListenerC26058OooooOO;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0O0oooO.o0OoOo0;
import o0Oo0o0o.OooOo00;
import o0Oo0o0o.Oooo000;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0OoO0oO.C28674OooO0OO;
import o0OoO0oO.C28679OooO0oo;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0o0OOO.C30526o0000Oo;
import o0o0OOO.C30534o0000o0;
import o0o0OOO.o0000OO0;
import o0o0OOOo.EnumC30546OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/paperconfig/StandardTemplateFragment;", "Lcom/orion/notein/ui/paperconfig/PaperConfigTemplateFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StandardTemplateFragment extends PaperConfigTemplateFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RecyclerView f78674OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C30534o0000o0 f78675OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f78676OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30534o0000o0 f78677OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public SelectableSymbolButtonView f78678OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public PaperConfigPreview f78679OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public SelectableSymbolButtonView f78680OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SelectableTextButtonView f78681OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SelectableTextButtonView f78682Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SelectableTextButtonView f78683Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public SelectableTextButtonView f78684Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SelectableTextButtonView f78685Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public SelectableTextButtonView f78686Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public SelectableTextButtonView f78687Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C28674OooO0OO f78688Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C28679OooO0oo f78689Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Set<Integer> f78690Oooo0oO;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f78691OooO00o;

        static {
            int[] iArr = new int[EnumC30546OooO0O0.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC30546OooO0O0 enumC30546OooO0O0 = EnumC30546OooO0O0.f109264OooOo0o;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PaperOrientation.values().length];
            try {
                iArr2[PaperOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PaperOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f78691OooO00o = iArr2;
        }
    }

    public StandardTemplateFragment() {
        PaperColors paperColors = PaperColors.INSTANCE;
        this.f78690Oooo0oO = OooOOO.OoooOo0(new Integer[]{Integer.valueOf(paperColors.getCOLOR_01()), Integer.valueOf(paperColors.getCOLOR_02()), Integer.valueOf(paperColors.getCOLOR_03()), Integer.valueOf(paperColors.getCOLOR_04()), Integer.valueOf(paperColors.getCOLOR_05())});
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoO() {
        SelectableTextButtonView selectableTextButtonView = this.f78682Oooo0;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnAfterPage");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoOO() {
        SelectableTextButtonView selectableTextButtonView = this.f78684Oooo00O;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnAtTop");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoo() {
        SelectableTextButtonView selectableTextButtonView = this.f78686Oooo0O0;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnChangeAll");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoo0() {
        SelectableTextButtonView selectableTextButtonView = this.f78685Oooo00o;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnBeforePage");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOooO() {
        SelectableTextButtonView selectableTextButtonView = this.f78687Oooo0OO;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnChangeCurrent");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_standard_template, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.orion.notein.p607ui.paperconfig.OooO00o oooO00o;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f78674OooOo = (RecyclerView) view.findViewById(R.id.rv_papers);
        this.f78676OooOoO0 = (RecyclerView) view.findViewById(R.id.rv_covers);
        this.f78679OooOoo0 = (PaperConfigPreview) view.findViewById(R.id.paper_config_preview);
        this.f78678OooOoo = (SelectableSymbolButtonView) view.findViewById(R.id.btn_portrait_template);
        this.f78680OooOooO = (SelectableSymbolButtonView) view.findViewById(R.id.btn_landscape_template);
        this.f78681OooOooo = (SelectableTextButtonView) view.findViewById(R.id.btn_standard_note);
        this.f78683Oooo000 = (SelectableTextButtonView) view.findViewById(R.id.btn_infinite_note);
        this.f78684Oooo00O = (SelectableTextButtonView) view.findViewById(R.id.btn_at_top);
        this.f78685Oooo00o = (SelectableTextButtonView) view.findViewById(R.id.btn_before_page);
        this.f78682Oooo0 = (SelectableTextButtonView) view.findViewById(R.id.btn_after_page);
        this.f78686Oooo0O0 = (SelectableTextButtonView) view.findViewById(R.id.btn_change_all);
        this.f78687Oooo0OO = (SelectableTextButtonView) view.findViewById(R.id.btn_change_current);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        C28679OooO0oo c28679OooO0oo = new C28679OooO0oo(contextRequireContext, o000000O.OooO0o(StyleIdentifier.BOOK_TITLE));
        c28679OooO0oo.f101625OooOO0O = -1;
        this.f78689Oooo0o0 = c28679OooO0oo;
        c28679OooO0oo.f101624OooOO0 = new ViewOnClickListenerC26036Oooo(this, 7);
        Context contextRequireContext2 = requireContext();
        OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        C20811OooO00o c20811OooO00o = new C20811OooO00o();
        c20811OooO00o.f59743OooO00o = this;
        this.f78688Oooo0o = new C28674OooO0OO(contextRequireContext2, c20811OooO00o, new C24755OooO00o(this));
        this.f78675OooOoO = new C30534o0000o0();
        this.f78677OooOoOO = new C30534o0000o0();
        RecyclerView recyclerView = this.f78674OooOo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvPapers");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C30534o0000o0 c30534o0000o0 = this.f78675OooOoO;
        if (c30534o0000o0 == null) {
            OooOOO0.OooOOOO("paperThemeCategoryAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30534o0000o0);
        RecyclerView recyclerView2 = this.f78676OooOoO0;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvCovers");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        C30534o0000o0 c30534o0000o02 = this.f78677OooOoOO;
        if (c30534o0000o02 == null) {
            OooOOO0.OooOOOO("coverThemeCategoryAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c30534o0000o02);
        C30534o0000o0 c30534o0000o03 = this.f78675OooOoO;
        if (c30534o0000o03 == null) {
            OooOOO0.OooOOOO("paperThemeCategoryAdapter");
            throw null;
        }
        c30534o0000o03.f109152OooO0O0 = new ViewOnClickListenerC26054OoooOoo(this, 5);
        C20813OooO0o0 c20813OooO0o0 = new C20813OooO0o0();
        c20813OooO0o0.f59765OooO00o = this;
        c30534o0000o03.f109153OooO0OO = c20813OooO0o0;
        c30534o0000o03.f109154OooO0Oo = new o0000OO0(this);
        C30534o0000o0 c30534o0000o04 = this.f78677OooOoOO;
        if (c30534o0000o04 == null) {
            OooOOO0.OooOOOO("coverThemeCategoryAdapter");
            throw null;
        }
        c30534o0000o04.f109152OooO0O0 = new ViewOnClickListenerC26058OooooOO(this, 5);
        PaperConfigPreview paperConfigPreview = this.f78679OooOoo0;
        if (paperConfigPreview == null) {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
        paperConfigPreview.setOnPreviewTypeClickListener(new com.google.firebase.datastorage.OooO00o(this, 1));
        PaperConfigPreview paperConfigPreview2 = this.f78679OooOoo0;
        if (paperConfigPreview2 == null) {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
        paperConfigPreview2.setMoreButtonClickListener(new ViewOnClickListenerC26057OooooO0(this, 6));
        SelectableSymbolButtonView selectableSymbolButtonView = this.f78678OooOoo;
        if (selectableSymbolButtonView == null) {
            OooOOO0.OooOOOO("btnPortraitTemplate");
            throw null;
        }
        selectableSymbolButtonView.setOnClickListener(new ViewOnClickListenerC26059OooooOo(this, 5));
        SelectableSymbolButtonView selectableSymbolButtonView2 = this.f78680OooOooO;
        if (selectableSymbolButtonView2 == null) {
            OooOOO0.OooOOOO("btnLandscapeTemplate");
            throw null;
        }
        selectableSymbolButtonView2.setOnClickListener(new ViewOnClickListenerC28251OooOooo(this, 6));
        SelectableTextButtonView selectableTextButtonView = this.f78681OooOooo;
        if (selectableTextButtonView == null) {
            OooOOO0.OooOOOO("btnStandardNote");
            throw null;
        }
        selectableTextButtonView.setOnClickListener(new Oooo000(this, 6));
        SelectableTextButtonView selectableTextButtonView2 = this.f78683Oooo000;
        if (selectableTextButtonView2 == null) {
            OooOOO0.OooOOOO("btnInfiniteNote");
            throw null;
        }
        selectableTextButtonView2.setOnClickListener(new ViewOnClickListenerC29113OooOo0O(this, 4));
        Oooo000();
        SelectableTextButtonView selectableTextButtonViewOooOoo = OooOoo();
        if (selectableTextButtonViewOooOoo != null) {
            selectableTextButtonViewOooOoo.setOnClickListener(new o0OoOo0(this, 6));
        }
        SelectableTextButtonView selectableTextButtonViewOooOooO = OooOooO();
        if (selectableTextButtonViewOooOooO != null) {
            selectableTextButtonViewOooOooO.setOnClickListener(new OooOo00(this, 4));
        }
        Fragment parentFragment = getParentFragment();
        PaperConfigDialogFragment paperConfigDialogFragment = parentFragment instanceof PaperConfigDialogFragment ? (PaperConfigDialogFragment) parentFragment : null;
        if (paperConfigDialogFragment != null) {
            oooO00o = paperConfigDialogFragment.f78658Oooo000;
            if (oooO00o == null) {
                OooOOO0.OooOOOO("strategy");
                throw null;
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o != null) {
            boolean zOooO0OO = oooO00o.OooO0OO();
            SelectableTextButtonView selectableTextButtonView3 = this.f78684Oooo00O;
            if (selectableTextButtonView3 == null) {
                OooOOO0.OooOOOO("_btnAtTop");
                throw null;
            }
            selectableTextButtonView3.setVisibility(zOooO0OO ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView4 = this.f78685Oooo00o;
            if (selectableTextButtonView4 == null) {
                OooOOO0.OooOOOO("_btnBeforePage");
                throw null;
            }
            selectableTextButtonView4.setVisibility(zOooO0OO ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView5 = this.f78682Oooo0;
            if (selectableTextButtonView5 == null) {
                OooOOO0.OooOOOO("_btnAfterPage");
                throw null;
            }
            selectableTextButtonView5.setVisibility(zOooO0OO ? 0 : 8);
            boolean zOooO0O0 = oooO00o.OooO0O0();
            SelectableTextButtonView selectableTextButtonView6 = this.f78686Oooo0O0;
            if (selectableTextButtonView6 == null) {
                OooOOO0.OooOOOO("_btnChangeAll");
                throw null;
            }
            selectableTextButtonView6.setVisibility(zOooO0O0 ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView7 = this.f78687Oooo0OO;
            if (selectableTextButtonView7 == null) {
                OooOOO0.OooOOOO("_btnChangeCurrent");
                throw null;
            }
            selectableTextButtonView7.setVisibility(zOooO0O0 ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView8 = this.f78681OooOooo;
            if (selectableTextButtonView8 == null) {
                OooOOO0.OooOOOO("btnStandardNote");
                throw null;
            }
            selectableTextButtonView8.setVisibility(oooO00o.OooO0Oo() ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView9 = this.f78683Oooo000;
            if (selectableTextButtonView9 == null) {
                OooOOO0.OooOOOO("btnInfiniteNote");
                throw null;
            }
            selectableTextButtonView9.setVisibility(oooO00o.OooO0Oo() ? 0 : 8);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30526o0000Oo(this, null), 3);
    }
}

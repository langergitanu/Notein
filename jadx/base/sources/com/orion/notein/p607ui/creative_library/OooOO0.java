package com.orion.notein.p607ui.creative_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.domain.models.material.MaterialCategory;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoO.OooO0OO;
import o0Oo0oOo.o00000O;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListFragment$observeState$1", m80623f = "CreativeLibraryListFragment.kt", m80624l = {148}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryListFragment f71066OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71067OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListFragment$observeState$1$1", m80623f = "CreativeLibraryListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23033OooOO0o.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibraryListFragment f71068OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71069OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibraryListFragment creativeLibraryListFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71068OooOo = creativeLibraryListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71068OooOo, continuation);
            oooO00o.f71069OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C23033OooOO0o.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            String string;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C23033OooOO0o.OooO0OO oooO0OO = (C23033OooOO0o.OooO0OO) this.f71069OooOo0o;
            List<MaterialCategory> list = oooO0OO.f71104OooO00o;
            CreativeLibraryListFragment creativeLibraryListFragment = this.f71068OooOo;
            OooO0OO oooO0OO2 = creativeLibraryListFragment.f70858OooOoo0;
            OooOOO0.OooO0Oo(oooO0OO2);
            if (oooO0OO2.f94936OooO00o.getTabCount() == 0) {
                for (MaterialCategory category : list) {
                    LayoutInflater layoutInflater = creativeLibraryListFragment.getLayoutInflater();
                    OooO0OO oooO0OO3 = creativeLibraryListFragment.f70858OooOoo0;
                    OooOOO0.OooO0Oo(oooO0OO3);
                    View viewInflate = layoutInflater.inflate(R.layout.item_creative_tab, (ViewGroup) oooO0OO3.f94936OooO00o, false);
                    Context contextRequireContext = creativeLibraryListFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    OooOOO0.OooO0oO(category, "category");
                    int i = o00000O.f100552OooO00o[category.ordinal()];
                    if (i == 1) {
                        string = contextRequireContext.getString(R.string.creative_library_category_template);
                        OooOOO0.OooO0o(string, "getString(...)");
                    } else if (i == 2) {
                        string = contextRequireContext.getString(R.string.creative_library_category_sticker);
                        OooOOO0.OooO0o(string, "getString(...)");
                    } else if (i == 3) {
                        string = contextRequireContext.getString(R.string.creative_library_category_font);
                        OooOOO0.OooO0o(string, "getString(...)");
                    } else {
                        if (i != 4) {
                            throw new C32442OooOO0o();
                        }
                        string = contextRequireContext.getString(R.string.creative_library_category_palette);
                        OooOOO0.OooO0o(string, "getString(...)");
                    }
                    TextView textView = (TextView) viewInflate.findViewById(R.id.tabTitle);
                    if (textView != null) {
                        textView.setText(string);
                    }
                    OooO0OO oooO0OO4 = creativeLibraryListFragment.f70858OooOoo0;
                    OooOOO0.OooO0Oo(oooO0OO4);
                    OooO0OO oooO0OO5 = creativeLibraryListFragment.f70858OooOoo0;
                    OooOOO0.OooO0Oo(oooO0OO5);
                    oooO0OO4.f94936OooO00o.addTab(oooO0OO5.f94936OooO00o.newTab().setCustomView(viewInflate), false);
                }
            }
            int iIndexOf = list.indexOf(oooO0OO.f71105OooO0O0);
            if (iIndexOf >= 0) {
                OooO0OO oooO0OO6 = creativeLibraryListFragment.f70858OooOoo0;
                OooOOO0.OooO0Oo(oooO0OO6);
                if (oooO0OO6.f94936OooO00o.getSelectedTabPosition() != iIndexOf) {
                    OooO0OO oooO0OO7 = creativeLibraryListFragment.f70858OooOoo0;
                    OooOOO0.OooO0Oo(oooO0OO7);
                    TabLayout.Tab tabAt = oooO0OO7.f94936OooO00o.getTabAt(iIndexOf);
                    if (tabAt != null) {
                        tabAt.select();
                    }
                }
            }
            OooO0OO oooO0OO8 = creativeLibraryListFragment.f70858OooOoo0;
            OooOOO0.OooO0Oo(oooO0OO8);
            int selectedTabPosition = oooO0OO8.f94936OooO00o.getSelectedTabPosition();
            OooO0OO oooO0OO9 = creativeLibraryListFragment.f70858OooOoo0;
            OooOOO0.OooO0Oo(oooO0OO9);
            int tabCount = oooO0OO9.f94936OooO00o.getTabCount();
            int i2 = 0;
            while (i2 < tabCount) {
                OooO0OO oooO0OO10 = creativeLibraryListFragment.f70858OooOoo0;
                OooOOO0.OooO0Oo(oooO0OO10);
                CreativeLibraryListFragment.OooOooO(oooO0OO10.f94936OooO00o.getTabAt(i2), i2 == selectedTabPosition);
                i2++;
            }
            com.orion.notein.p607ui.creative_library.OooO00o oooO00o = creativeLibraryListFragment.f70859OooOooO;
            if (oooO00o == null) {
                OooOOO0.OooOOOO("adapter");
                throw null;
            }
            oooO00o.OooO0Oo(oooO0OO.f71106OooO0OO);
            OooO0OO oooO0OO11 = creativeLibraryListFragment.f70858OooOoo0;
            OooOOO0.OooO0Oo(oooO0OO11);
            oooO0OO11.f94940OooO0o0.setRefreshing(oooO0OO.f71107OooO0Oo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(CreativeLibraryListFragment creativeLibraryListFragment, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f71066OooOo = creativeLibraryListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f71066OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71067OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibraryListFragment creativeLibraryListFragment = this.f71066OooOo;
            C23033OooOO0o c23033OooOO0oOooOoo = creativeLibraryListFragment.OooOoo();
            OooO00o oooO00o = new OooO00o(creativeLibraryListFragment, null);
            this.f71067OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c23033OooOO0oOooOoo.f71085OooOOO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

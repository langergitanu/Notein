package com.orion.notein.p607ui.pageeditor;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20418OooOoo;
import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import OooooOo.C21384OooOOO0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.C22352OooO0Oo;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.MainActivity;
import com.orion.notein.NotesRoleEntryActivity;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.C24572OooOO0o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0OOo0o.C27430o000oo;
import o0OOo0o.C27449o00O0OoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoOO00.ViewOnClickListenerC28989OooO00o;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0o0O0.ViewOnClickListenerC30181OooO0o0;
import o0o0OO.C30367OooO0o0;
import o0o0OO0O.C30434OooOOO;
import o0o0OO0O.C30440OooOOoo;
import o0o0OO0O.C30441OooOo0;
import o0o0OO0O.C30443OooOo0o;
import o0o0OO0O.OooOo00;
import o0o0OO0O.ViewOnClickListenerC30435OooOOO0;
import o0o0OO0o.C30453OooO0O0;
import o0o0OO0o.C30454OooO0OO;
import o0o0OOO0.C30543OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/TiledPageListContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TiledPageListContainerFragment extends Hilt_TiledPageListContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f78518OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78519OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f78520OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f78521OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C30453OooO0O0 f78522Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78523Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f78524Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f78525Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f78526Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f78527Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f78528Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f78529Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f78530Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f78531Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public RecyclerView f78532Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public C30454OooO0OO f78533OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TabLayout f78534OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView f78535OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ViewPager2 f78536OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public C23749OooO0Oo f78537OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO00o f78538OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public List<TiledPagePreviewVOFilter> f78539o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return TiledPageListContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO00o extends ViewPager2.AbstractC22132OooO0o0 {
        public OooO00o() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
        public final void onPageSelected(int i) {
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            ViewPager2 viewPager2 = tiledPageListContainerFragment.f78536OoooO0O;
            if (viewPager2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                throw null;
            }
            if (viewPager2.getCurrentItem() == i) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(C21023OooO0Oo.OooO0OO(", ignore it", i, com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "TiledPageListContainerFragment", "onPageSelected() called with: position = ", i, ", but current item is ")), new Object[0]);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o2, "TiledPageListContainerFragment", "onPageSelected() called with: position = ", i), new Object[0]);
            TiledPageListContainerFragment.OooOoOO(tiledPageListContainerFragment, !((Collection) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue()).isEmpty());
            tiledPageListContainerFragment.Oooo000().OooO(0);
            C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
            List<TiledPagePreviewVOFilter> list = tiledPageListContainerFragment.f78539o000oOoO;
            if (list == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteTypeFilters");
                throw null;
            }
            ViewPager2 viewPager22 = tiledPageListContainerFragment.f78536OoooO0O;
            if (viewPager22 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                throw null;
            }
            c30367OooO0o0Oooo000.f108349OooOoO0.setValue((TiledPagePreviewVOFilter) OooOo.OoooO00(viewPager22.getCurrentItem(), list));
            super.onPageSelected(i);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onBtnDeleteClicked$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {544, 547}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78543OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<TiledPagePreviewVO> f78544OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<TiledPagePreviewVO> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f78544OooOoO0 = list;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TiledPageListContainerFragment.this.new OooO0O0(this.f78544OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            if (r7 == r0) goto L27;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78543OooOo0o;
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f78543OooOo0o = 1;
                obj = TiledPageListContainerFragment.OooOooO(tiledPageListContainerFragment, 43, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                tiledPageListContainerFragment.Oooo000().OooO(0);
                C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                List<TiledPagePreviewVO> list = this.f78544OooOoO0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TiledPagePreviewVO) it.next()).getId());
                }
                this.f78543OooOo0o = 2;
                String str = (String) c30367OooO0o0Oooo000.f108338OooOOOO.getValue();
                C27449o00O0OoO c27449o00O0OoO = c30367OooO0o0Oooo000.f108328OooO0Oo;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27430o000oo(c27449o00O0OoO, str, arrayList, null), this);
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO0o != enumC32485OooO00o2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != enumC32485OooO00o2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onBtnExportClicked$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {492, 497}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f78545OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Context f78546OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ ArrayList f78547OooOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f78547OooOoO = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TiledPageListContainerFragment.this.new OooO0OO(this.f78547OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context context;
            Context context2;
            String string;
            MainActivity mainActivity;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78545OooOo;
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Context context3 = tiledPageListContainerFragment.getContext();
                if (context3 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f78546OooOo0o = context3;
                this.f78545OooOo = 1;
                Object objOooOooO = TiledPageListContainerFragment.OooOooO(tiledPageListContainerFragment, 36, this);
                if (objOooOooO != enumC32485OooO00o) {
                    context = context3;
                    obj = objOooOooO;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context2 = this.f78546OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                File file = (File) obj;
                String str = (String) tiledPageListContainerFragment.Oooo000().f108338OooOOOO.getValue();
                string = (String) tiledPageListContainerFragment.Oooo000().f108341OooOOo0.f121747OooOo0o.getValue();
                if (C33599OooOo0O.Oooo0o0(string)) {
                    string = context2.getString(R.string.app_name);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                }
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                ExportRequest.PageExport pageExport = new ExportRequest.PageExport(absolutePath, str, string);
                ActivityC21897OooOo0 activity = tiledPageListContainerFragment.getActivity();
                mainActivity = !(activity instanceof MainActivity) ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openExportOptions(pageExport);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            context = this.f78546OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f78546OooOo0o = context;
            this.f78545OooOo = 2;
            obj = ExportBottomSheetFragment.f71509OoooOoO.OooO00o(context, this.f78547OooOoO, this);
            if (obj != enumC32485OooO00o) {
                context2 = context;
                File file2 = (File) obj;
                String str2 = (String) tiledPageListContainerFragment.Oooo000().f108338OooOOOO.getValue();
                string = (String) tiledPageListContainerFragment.Oooo000().f108341OooOOo0.f121747OooOo0o.getValue();
                if (C33599OooOo0O.Oooo0o0(string)) {
                }
                String absolutePath2 = file2.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                ExportRequest.PageExport pageExport2 = new ExportRequest.PageExport(absolutePath2, str2, string);
                ActivityC21897OooOo0 activity2 = tiledPageListContainerFragment.getActivity();
                if (!(activity2 instanceof MainActivity)) {
                }
                if (mainActivity != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23749OooO0Oo extends AbstractC20413OooOo0O {
        public C23749OooO0Oo() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            if (((Number) tiledPageListContainerFragment.Oooo000().f108345OooOo00.getValue()).intValue() != 0) {
                tiledPageListContainerFragment.Oooo000().OooO(0);
            } else {
                C21030OooOO0o.OooO0OO(tiledPageListContainerFragment).OooOOo0();
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4", m80623f = "TiledPageListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78551OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {205}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78552OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78553OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19453OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78554OooOo0o;

                public C19453OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78554OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TextView textView = this.f78554OooOo0o.f78524Oooo000;
                    if (textView != null) {
                        textView.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78552OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78552OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78553OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78552OooOo;
                    C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                    C19453OooO00o c19453OooO00o = new C19453OooO00o(tiledPageListContainerFragment);
                    this.f78553OooOo0o = 1;
                    if (c30367OooO0o0Oooo000.f108341OooOOo0.f121747OooOo0o.collect(c19453OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$2", m80623f = "TiledPageListContainerFragment.kt", m80624l = {206}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78555OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78556OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78557OooOo0o;

                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78557OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    boolean z = !list.isEmpty();
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78557OooOo0o;
                    TiledPageListContainerFragment.OooOoOO(tiledPageListContainerFragment, z);
                    TiledPageListContainerFragment.OooOoo0(tiledPageListContainerFragment, list);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78555OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78555OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78556OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78555OooOo;
                    C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment);
                    this.f78556OooOo0o = 1;
                    if (c30367OooO0o0Oooo000.f108347OooOo0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$3", m80623f = "TiledPageListContainerFragment.kt", m80624l = {210}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78558OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78559OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78560OooOo0o;

                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78560OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78560OooOo0o;
                    TiledPageListContainerFragment.OooOoo0(tiledPageListContainerFragment, c34434OooOoO);
                    if (iIntValue == 0) {
                        TextView textView = tiledPageListContainerFragment.f78524Oooo000;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                            throw null;
                        }
                        textView.setText((CharSequence) tiledPageListContainerFragment.Oooo000().f108341OooOOo0.f121747OooOo0o.getValue());
                        TextView textView2 = tiledPageListContainerFragment.f78525Oooo00O;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
                            throw null;
                        }
                        textView2.setText(tiledPageListContainerFragment.getString(R.string.select));
                    } else {
                        TextView textView3 = tiledPageListContainerFragment.f78524Oooo000;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                            throw null;
                        }
                        textView3.setText(tiledPageListContainerFragment.getString(R.string.select));
                        TextView textView4 = tiledPageListContainerFragment.f78525Oooo00O;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
                            throw null;
                        }
                        textView4.setText(tiledPageListContainerFragment.getString(R.string.done));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78558OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78558OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78559OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                TiledPageListContainerFragment tiledPageListContainerFragment = this.f78558OooOo;
                C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment);
                this.f78559OooOo0o = 1;
                c30367OooO0o0Oooo000.f108345OooOo00.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$4", m80623f = "TiledPageListContainerFragment.kt", m80624l = {220}, m80625m = "invokeSuspend")
        public static final class C23750OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78561OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78562OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78563OooOo0o;

                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78563OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78563OooOo0o;
                    C21030OooOO0o.OooO0OO(tiledPageListContainerFragment).OooOOo(R.id.tiledPageEditorFragment, false);
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(tiledPageListContainerFragment), new C30443OooOo0o(iIntValue));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23750OooO0Oo(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C23750OooO0Oo> continuation) {
                super(2, continuation);
                this.f78561OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23750OooO0Oo(this.f78561OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23750OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78562OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                TiledPageListContainerFragment tiledPageListContainerFragment = this.f78561OooOo;
                C33772OooooOo c33772OooooOo = tiledPageListContainerFragment.Oooo000().f108334OooOO0O;
                OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment);
                this.f78562OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$6", m80623f = "TiledPageListContainerFragment.kt", m80624l = {226}, m80625m = "invokeSuspend")
        public static final class C19454OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78564OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78565OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78566OooOo0o;

                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78566OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78566OooOo0o;
                    TextView textView = tiledPageListContainerFragment.f78527Oooo0O0;
                    if (textView != null) {
                        textView.setEnabled(zBooleanValue && !((Collection) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue()).isEmpty());
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19454OooO0o(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C19454OooO0o> continuation) {
                super(2, continuation);
                this.f78564OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19454OooO0o(this.f78564OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19454OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78565OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78564OooOo;
                    C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment);
                    this.f78565OooOo0o = 1;
                    if (c30367OooO0o0Oooo000.f108343OooOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$5", m80623f = "TiledPageListContainerFragment.kt", m80624l = {223}, m80625m = "invokeSuspend")
        public static final class C23751OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78567OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78568OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78569OooOo0o;

                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment) {
                    this.f78569OooOo0o = tiledPageListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C30367OooO0o0.OooO00o oooO00o = (C30367OooO0o0.OooO00o) obj;
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78569OooOo0o;
                    int i = oooO00o.f108353OooO00o;
                    if (i != 1) {
                        if (i != 3) {
                            tiledPageListContainerFragment.Oooo00O(oooO00o);
                        } else {
                            C21030OooOO0o.OooO0OO(tiledPageListContainerFragment).OooOOo(R.id.tiledPageEditorFragment, false);
                        }
                    } else if (oooO00o.f108355OooO0OO) {
                        C21030OooOO0o.OooO0OO(tiledPageListContainerFragment).OooOOo(R.id.tiledPageEditorFragment, false);
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(tiledPageListContainerFragment), new C30441OooOo0((String) tiledPageListContainerFragment.Oooo000().f108338OooOOOO.getValue()));
                    } else {
                        tiledPageListContainerFragment.Oooo00O(oooO00o);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23751OooO0o0(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C23751OooO0o0> continuation) {
                super(2, continuation);
                this.f78567OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23751OooO0o0(this.f78567OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23751OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78568OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                TiledPageListContainerFragment tiledPageListContainerFragment = this.f78567OooOo;
                C33772OooooOo c33772OooooOo = tiledPageListContainerFragment.Oooo000().f108337OooOOO0;
                OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment);
                this.f78568OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$7", m80623f = "TiledPageListContainerFragment.kt", m80624l = {230}, m80625m = "invokeSuspend")
        public static final class C23752OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78570OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78571OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$7$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78572OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f78573OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78572OooOo = tiledPageListContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78572OooOo, continuation);
                    oooO00o.f78573OooOo0o = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f78573OooOo0o;
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78572OooOo;
                    TiledPageListContainerFragment.OooOoo(tiledPageListContainerFragment, tiledPageListContainerFragment.f78526Oooo00o, z);
                    TiledPageListContainerFragment.OooOoo(tiledPageListContainerFragment, tiledPageListContainerFragment.f78523Oooo0, z);
                    TiledPageListContainerFragment.OooOoo(tiledPageListContainerFragment, tiledPageListContainerFragment.f78527Oooo0O0, z);
                    TiledPageListContainerFragment.OooOoo(tiledPageListContainerFragment, tiledPageListContainerFragment.f78529Oooo0o, z);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23752OooO0oO(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C23752OooO0oO> continuation) {
                super(2, continuation);
                this.f78570OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23752OooO0oO(this.f78570OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23752OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78571OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78570OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) tiledPageListContainerFragment.f78518OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment, null);
                    this.f78571OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90249OoooOOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$8", m80623f = "TiledPageListContainerFragment.kt", m80624l = {238}, m80625m = "invokeSuspend")
        public static final class C23753OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TiledPageListContainerFragment f78574OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78575OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$4$8$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C30543OooO00o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TiledPageListContainerFragment f78576OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78577OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78576OooOo = tiledPageListContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78576OooOo, continuation);
                    oooO00o.f78577OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C30543OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f78577OooOo0o;
                    C34406OooO00o.f123390OooO00o.OooO00o("pageOperationList: " + list, new Object[0]);
                    C30453OooO0O0 c30453OooO0O0 = this.f78576OooOo.f78522Oooo;
                    if (c30453OooO0O0 != null) {
                        c30453OooO0O0.OooO0Oo(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23753OooO0oo(TiledPageListContainerFragment tiledPageListContainerFragment, Continuation<? super C23753OooO0oo> continuation) {
                super(2, continuation);
                this.f78574OooOo = tiledPageListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23753OooO0oo(this.f78574OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23753OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78575OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TiledPageListContainerFragment tiledPageListContainerFragment = this.f78574OooOo;
                    C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(tiledPageListContainerFragment, null);
                    this.f78575OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30367OooO0o0Oooo000.f108350OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0o oooO0o = TiledPageListContainerFragment.this.new OooO0o(continuation);
            oooO0o.f78551OooOo0o = obj;
            return oooO0o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78551OooOo0o;
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23750OooO0Oo(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23751OooO0o0(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19454OooO0o(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23752OooO0oO(tiledPageListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23753OooO0oo(tiledPageListContainerFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$onViewCreated$1", m80623f = "TiledPageListContainerFragment.kt", m80624l = {181}, m80625m = "invokeSuspend")
    public static final class C23754OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78579OooOo0o;

        public C23754OooO0o0(Continuation<? super C23754OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TiledPageListContainerFragment.this.new C23754OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23754OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78579OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
                C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                String str = tiledPageListContainerFragment.OooOooo().f108714OooO00o;
                this.f78579OooOo0o = 1;
                o00000OO o00000oo2 = c30367OooO0o0Oooo000.f108332OooO0oo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                c30367OooO0o0Oooo000.f108332OooO0oo = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(getContext()), null, null, new o0o0OO.OooOO0(c30367OooO0o0Oooo000, str, null), 3);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23755OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23755OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return TiledPageListContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23756OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23756OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return TiledPageListContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(TiledPageListContainerFragment.this).OooO0o(R.id.tiledPageEditorFragment);
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78583OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78583OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78583OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.TiledPageListContainerFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23757OooOO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78584OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23757OooOO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78584OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78584OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            TiledPageListContainerFragment tiledPageListContainerFragment = TiledPageListContainerFragment.this;
            Bundle arguments = tiledPageListContainerFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + tiledPageListContainerFragment + " has null arguments");
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78586OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78586OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = TiledPageListContainerFragment.this.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78586OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public TiledPageListContainerFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooOO0());
        OooOO0O oooOO0O = new OooOO0O(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78519OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30367OooO0o0.class), oooOO0O, new OooOOO0(c32447OooOOoOooO0OO), new C23757OooOO0o(c32447OooOOoOooO0OO));
        this.f78518OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23755OooO0oO(), new OooO(), new C23756OooO0oo());
        this.f78520OooOooO = new C24568OooO0oO(oooo0.OooO0O0(OooOo00.class), new OooOOO());
        this.f78538OoooOOO = new OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoOO(TiledPageListContainerFragment tiledPageListContainerFragment, boolean z) {
        List<TiledPagePreviewVOFilter> list = tiledPageListContainerFragment.f78539o000oOoO;
        if (list == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTypeFilters");
            throw null;
        }
        ViewPager2 viewPager2 = tiledPageListContainerFragment.f78536OoooO0O;
        if (viewPager2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = (TiledPagePreviewVOFilter) OooOo.OoooO00(viewPager2.getCurrentItem(), list);
        boolean readOnly = tiledPagePreviewVOFilter != null ? tiledPagePreviewVOFilter.getReadOnly() : true;
        boolean zBooleanValue = ((Boolean) tiledPageListContainerFragment.Oooo000().f108343OooOo.f121747OooOo0o.getValue()).booleanValue();
        TextView textView = tiledPageListContainerFragment.f78526Oooo00o;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = tiledPageListContainerFragment.f78523Oooo0;
        if (textView2 != null) {
            textView2.setEnabled(z);
        }
        TextView textView3 = tiledPageListContainerFragment.f78527Oooo0O0;
        if (textView3 != null) {
            textView3.setEnabled(z && !readOnly && zBooleanValue);
        }
        TextView textView4 = tiledPageListContainerFragment.f78528Oooo0OO;
        if (textView4 != null) {
            textView4.setEnabled(z);
        }
        TextView textView5 = tiledPageListContainerFragment.f78530Oooo0o0;
        if (textView5 != null) {
            textView5.setEnabled(z && !readOnly);
        }
        TextView textView6 = tiledPageListContainerFragment.f78529Oooo0o;
        if (textView6 != null) {
            textView6.setEnabled(z);
        }
        TextView textView7 = tiledPageListContainerFragment.f78531Oooo0oO;
        if (textView7 != null) {
            textView7.setEnabled(z);
        }
    }

    public static final void OooOoo(TiledPageListContainerFragment tiledPageListContainerFragment, TextView textView, boolean z) {
        Drawable drawable;
        if (textView == null) {
            return;
        }
        try {
            drawable = textView.getCompoundDrawables()[1];
        } catch (Exception unused) {
            drawable = null;
        }
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, new InsetDrawable(ContextCompat.getDrawable(tiledPageListContainerFragment.requireContext(), R.drawable.ic_ni_vip_12_selector), o000000O.OooO0o(4), 0, 0, 0), (Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
    }

    public static final void OooOoo0(TiledPageListContainerFragment tiledPageListContainerFragment, List list) {
        if (tiledPageListContainerFragment.getContext() == null) {
            return;
        }
        List list2 = (List) tiledPageListContainerFragment.Oooo000().f108346OooOo0O.f121747OooOo0o.getValue();
        int size = list2 != null ? list2.size() : 0;
        if (((Number) tiledPageListContainerFragment.Oooo000().f108345OooOo00.getValue()).intValue() == 0) {
            TextView textView = tiledPageListContainerFragment.f78521OooOooo;
            if (textView != null) {
                textView.setText(tiledPageListContainerFragment.getString(R.string.close));
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnComposite");
                throw null;
            }
        }
        if (list.isEmpty()) {
            TextView textView2 = tiledPageListContainerFragment.f78521OooOooo;
            if (textView2 != null) {
                textView2.setText(tiledPageListContainerFragment.getString(R.string.select_all));
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnComposite");
                throw null;
            }
        }
        if (list.size() == size) {
            TextView textView3 = tiledPageListContainerFragment.f78521OooOooo;
            if (textView3 != null) {
                textView3.setText(tiledPageListContainerFragment.getString(R.string.unselect_all));
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnComposite");
                throw null;
            }
        }
        TextView textView4 = tiledPageListContainerFragment.f78521OooOooo;
        if (textView4 != null) {
            textView4.setText(tiledPageListContainerFragment.getString(R.string.unselect));
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOooO(TiledPageListContainerFragment tiledPageListContainerFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30440OooOOoo c30440OooOOoo;
        boolean zBooleanValue;
        tiledPageListContainerFragment.getClass();
        if (abstractC32479OooO0OO instanceof C30440OooOOoo) {
            c30440OooOOoo = (C30440OooOOoo) abstractC32479OooO0OO;
            int i2 = c30440OooOOoo.f108708OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30440OooOOoo.f108708OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30440OooOOoo = new C30440OooOOoo(tiledPageListContainerFragment, abstractC32479OooO0OO);
            }
        }
        C30440OooOOoo c30440OooOOoo2 = c30440OooOOoo;
        Object objShowNonVipFeatureLimitedDialog$default = c30440OooOOoo2.f108707OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30440OooOOoo2.f108708OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = tiledPageListContainerFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30440OooOOoo2.f108708OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30440OooOOoo2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooOo00 OooOooo() {
        return (OooOo00) this.f78520OooOooO.getValue();
    }

    public final void Oooo0() {
        Iterable iterable = (Iterable) Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((TiledPagePreviewVO) it.next()).getId());
        }
        Oooo000().OooO(0);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(arrayList, null), 3);
    }

    public final C30367OooO0o0 Oooo000() {
        return (C30367OooO0o0) this.f78519OooOoo0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void Oooo00O(C30367OooO0o0.OooO00o oooO00o) {
        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(this);
        c24572OooOO0oOooO0OO.OooOOo(R.id.tiledPageEditorFragment, false);
        int i = oooO00o.f108353OooO00o;
        int size = oooO00o.f108354OooO0O0.size();
        String targetNoteId = oooO00o.f108356OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetNoteId, "targetNoteId");
        C28026OooO0OO.OooO0O0(c24572OooOO0oOooO0OO, new o0o0OO0O.OooOo(i, size, targetNoteId, oooO00o.f108355OooO0OO));
    }

    public final void Oooo00o() {
        List list = (List) Oooo000().f108346OooOo0O.f121747OooOo0o.getValue();
        if (list == null) {
            return;
        }
        List list2 = (List) Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
        if (list2.size() < list.size()) {
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(list2, null), 3);
        } else {
            Context context = getContext();
            if (context != null) {
                String string = getString(R.string.unable_to_delete_all_page);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0O0() {
        List list = (List) Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
        if (list.isEmpty() || ((TiledPagePreviewVO) OooOo.OoooOOo(list)).getIndex() - ((TiledPagePreviewVO) OooOo.Oooo0oO(list)).getIndex() != list.size() - 1) {
            C30367OooO0o0 c30367OooO0o0Oooo000 = Oooo000();
            c30367OooO0o0Oooo000.OooO0oO(Math.max(0, ((NoteContent) c30367OooO0o0Oooo000.f108339OooOOOo.f121747OooOo0o.getValue()).getPages().size()));
            return;
        }
        C30367OooO0o0 c30367OooO0o0Oooo0002 = Oooo000();
        String pageId = ((TiledPagePreviewVO) OooOo.OoooOOo(list)).getId();
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        Iterator<Page> it = ((NoteContent) c30367OooO0o0Oooo0002.f108339OooOOOo.f121747OooOo0o.getValue()).getPages().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (pageId.equals(it.next().getId())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        c30367OooO0o0Oooo0002.OooO0oO(Math.max(0, i + 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_page_editor_container, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("choose_note", this, new InterfaceC21912Oooo0o() { // from class: o0o0OO0O.OooOO0o
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                Context context;
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("note_id", "");
                int i = bundle.getInt("action", -1);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                TiledPageListContainerFragment tiledPageListContainerFragment = this.f108693OooOo0o;
                if (string.length() == 0 && (context = tiledPageListContainerFragment.getContext()) != null) {
                    String string2 = tiledPageListContainerFragment.getString(R.string.move_fail);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string2);
                }
                Iterable iterable = (Iterable) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TiledPagePreviewVO) it.next()).getId());
                }
                tiledPageListContainerFragment.Oooo000().OooO(0);
                if (i == 0) {
                    tiledPageListContainerFragment.Oooo000().OooO0o0(tiledPageListContainerFragment.OooOooo().f108714OooO00o, arrayList);
                } else {
                    if (i != 1) {
                        return;
                    }
                    tiledPageListContainerFragment.Oooo000().OooO0o(tiledPageListContainerFragment.OooOooo().f108714OooO00o, arrayList);
                }
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("save_as", this, new C21384OooOOO0(this));
        this.f78537OoooOO0 = new C23749OooO0Oo();
        C20418OooOoo onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        C23749OooO0Oo c23749OooO0Oo = this.f78537OoooOO0;
        if (c23749OooO0Oo != null) {
            onBackPressedDispatcher.OooO00o(this, c23749OooO0Oo);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("mBackPressedCallback");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC21897OooOo0 activity = getActivity();
        NotesRoleEntryActivity notesRoleEntryActivity = activity instanceof NotesRoleEntryActivity ? (NotesRoleEntryActivity) activity : null;
        if (!(notesRoleEntryActivity == null ? true : notesRoleEntryActivity.OoooO())) {
            C21030OooOO0o.OooO0OO(this).OooOOo0();
            return;
        }
        C30367OooO0o0 c30367OooO0o0Oooo000 = Oooo000();
        Integer numValueOf = Integer.valueOf(OooOooo().f108715OooO0O0);
        C33781o00o0O c33781o00o0O = c30367OooO0o0Oooo000.f108344OooOo0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        String string = getString(R.string.all_pages);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = new TiledPagePreviewVOFilter(0, string, R.drawable.ic_ni_tile_view_normal, false);
        String string2 = getString(R.string.comment_page_filter);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        this.f78539o000oOoO = C34429OooOOo0.OooOO0o(tiledPagePreviewVOFilter, new TiledPagePreviewVOFilter(1, string2, R.drawable.ic_pages_with_comments, true));
        C30367OooO0o0 c30367OooO0o0Oooo0002 = Oooo000();
        String str = OooOooo().f108714OooO00o;
        C33781o00o0O c33781o00o0O2 = c30367OooO0o0Oooo0002.f108336OooOOO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, str);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23754OooO0o0(null), 3);
        C30367OooO0o0 c30367OooO0o0Oooo0003 = Oooo000();
        Bundle arguments = getArguments();
        c30367OooO0o0Oooo0003.f108352OooOoo0 = arguments != null ? Integer.valueOf(arguments.getInt(Note.KEY_INITIAL_PAGE_INDEX)) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove(Note.KEY_INITIAL_PAGE_INDEX);
        }
        this.f78534OoooO0 = (TabLayout) view.findViewById(R.id.tablayout);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.pager);
        this.f78536OoooO0O = viewPager2;
        if (viewPager2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager2.OooO00o(this.f78538OoooOOO);
        ViewPager2 viewPager22 = this.f78536OoooO0O;
        if (viewPager22 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        View childAt = viewPager22.getChildAt(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).setOverScrollMode(2);
        List<TiledPagePreviewVOFilter> list = this.f78539o000oOoO;
        if (list == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTypeFilters");
            throw null;
        }
        C30454OooO0OO c30454OooO0OO = new C30454OooO0OO(this, list);
        this.f78533OoooO = c30454OooO0OO;
        ViewPager2 viewPager23 = this.f78536OoooO0O;
        if (viewPager23 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager23.setAdapter(c30454OooO0OO);
        TabLayout tabLayout = this.f78534OoooO0;
        if (tabLayout == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tabLayout");
            throw null;
        }
        ViewPager2 viewPager24 = this.f78536OoooO0O;
        if (viewPager24 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        new TabLayoutMediator(tabLayout, viewPager24, new C22352OooO0Oo(this)).attach();
        TextView textView = (TextView) view.findViewById(R.id.btn_save_as);
        this.f78526Oooo00o = textView;
        if (textView != null) {
            C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC29781OooO0o(this, 2));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.btn_copy_and_move);
        this.f78523Oooo0 = textView2;
        if (textView2 != null) {
            C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC28603OooO00o(this, 6));
        }
        TextView textView3 = (TextView) view.findViewById(R.id.btn_paste);
        this.f78527Oooo0O0 = textView3;
        if (textView3 != null) {
            C28050OooO0OO.OooO00o(textView3, 500L, new ViewOnClickListenerC28989OooO00o(this, 3));
        }
        TextView textView4 = (TextView) view.findViewById(R.id.btn_export);
        this.f78528Oooo0OO = textView4;
        if (textView4 != null) {
            C28050OooO0OO.OooO00o(textView4, 500L, new ViewOnClickListenerC28407OooO00o(this, 3));
        }
        TextView textView5 = (TextView) view.findViewById(R.id.btn_dup);
        this.f78530Oooo0o0 = textView5;
        if (textView5 != null) {
            C28050OooO0OO.OooO00o(textView5, 500L, new ViewOnClickListenerC28408OooO0O0(this, 6));
        }
        TextView textView6 = (TextView) view.findViewById(R.id.btn_cut_and_move);
        this.f78529Oooo0o = textView6;
        if (textView6 != null) {
            C28050OooO0OO.OooO00o(textView6, 500L, new ViewOnClickListenerC28583o0000OoO(this, 3));
        }
        TextView textView7 = (TextView) view.findViewById(R.id.btn_delete);
        this.f78531Oooo0oO = textView7;
        if (textView7 != null) {
            C28050OooO0OO.OooO00o(textView7, 500L, new ViewOnClickListenerC28586o0000o0(this, 4));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_operation);
        if (recyclerView != null) {
            C30453OooO0O0 c30453OooO0O0 = new C30453OooO0O0(C30453OooO0O0.OooO00o.f108746OooO00o);
            c30453OooO0O0.f108745OooO0O0 = new ViewOnClickListenerC28588o0000o0o(this, 2);
            this.f78522Oooo = c30453OooO0O0;
            recyclerView.setAdapter(c30453OooO0O0);
            recyclerView.addOnScrollListener(new C30434OooOOO(this));
        } else {
            recyclerView = null;
        }
        this.f78532Oooo0oo = recyclerView;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_more_operation);
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC30435OooOOO0(this, imageView, 0));
        } else {
            imageView = null;
        }
        this.f78535OoooO00 = imageView;
        TextView textView8 = (TextView) view.findViewById(R.id.btn_close);
        this.f78521OooOooo = textView8;
        if (textView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView8.setOnClickListener(new ViewOnClickListenerC28591o0000oOO(this, 4));
        TextView textView9 = (TextView) view.findViewById(R.id.btn_select);
        this.f78525Oooo00O = textView9;
        if (textView9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
            throw null;
        }
        textView9.setOnClickListener(new ViewOnClickListenerC30181OooO0o0(this, 1));
        this.f78524Oooo000 = (TextView) view.findViewById(R.id.tv_title);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0o(null), 3);
    }
}

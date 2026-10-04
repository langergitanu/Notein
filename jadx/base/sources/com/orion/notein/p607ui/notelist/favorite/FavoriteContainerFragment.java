package com.orion.notein.p607ui.notelist.favorite;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0oO.C20438OooO0oO;
import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22008OoooOo0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment.C23659OooO0Oo;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment.OooO0O0;
import io.ktor.utils.p616io.C23968Oooo00o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0OoOoo.ViewOnClickListenerC29219OooO0OO;
import o0OoOoo.ViewOnClickListenerC29221OooO0o;
import o0Ooo0oo.ViewOnClickListenerC29465OooOoo;
import o0Ooo0oo.ViewOnClickListenerC29467OooOooO;
import o0Ooo0oo.ViewOnClickListenerC29468OooOooo;
import o0o00ooo.C30141OooO;
import o0o00ooo.C30146OooO0o;
import o0o00ooo.C30147OooO0o0;
import o0o00ooo.C30149OooO0oO;
import o0o00ooo.C30150OooO0oo;
import o0o00ooo.C30151OooOO0;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30189OooO0o;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30207OooOo;
import o0o0O00.C30214OooOoOO;
import o0o0O0o.C30294OooO0OO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/favorite/FavoriteContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FavoriteContainerFragment extends Hilt_FavoriteContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77469OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f77470OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C30185OooO00o f77471OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32447OooOOo f77472OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public NoteFilterBottomSheetDialog f77473Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C30207OooOo f77474Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C30214OooOoOO f77475Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f77476Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f77477Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C30294OooO0OO f77478Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0OO f77479Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f77480Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TipsDialogFragment f77481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO00o f77482Oooo0oo;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return FavoriteContainerFragment.this;
        }
    }

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Uri f77484OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o.OooO0O0<String> f77485OooO0O0;

        public OooO00o(final FavoriteContainerFragment favoriteContainerFragment) {
            OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult = favoriteContainerFragment.registerForActivityResult(new C20438OooO0oO(), new OooO0o.OooO00o() { // from class: o0o00ooo.OooO0Oo
                @Override // OooO0o.OooO00o
                public final void OooO0O0(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    FavoriteContainerFragment favoriteContainerFragment2 = favoriteContainerFragment;
                    if (zBooleanValue) {
                        Uri uri = this.f107293OooOo0o.f77484OooO00o;
                        if (uri != null) {
                            favoriteContainerFragment2.OooOoo0().OooOOO(uri);
                            return;
                        }
                        return;
                    }
                    String string = favoriteContainerFragment2.getString(R.string.request_permission_title_import_file);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = favoriteContainerFragment2.getString(R.string.request_permission_content_import_file);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(favoriteContainerFragment2), new C30155OooOOO0(string, string2));
                }
            });
            kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
            this.f77485OooO0O0 = oooO0O0RegisterForActivityResult;
        }
    }

    public static final class OooO0O0 extends C30189OooO0o {
        public OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO) {
            super(FavoriteContainerFragment.this, oooO0OO);
        }

        @Override // o0o0O00.C30189OooO0o, o0o0O00.C30185OooO00o.InterfaceC20048OooO00o
        public final void OooO00o() {
            FavoriteContainerFragment favoriteContainerFragment = FavoriteContainerFragment.this;
            if (((List) favoriteContainerFragment.OooOoo0().f77172OooooOO.f121747OooOo0o.getValue()).size() != 0) {
                favoriteContainerFragment.OooOoo0().Oooo0O0();
                return;
            }
            C30214OooOoOO c30214OooOoOO = favoriteContainerFragment.f77475Oooo00O;
            if (c30214OooOoOO == null) {
                favoriteContainerFragment.OooOoo0().OooOo0o((List) favoriteContainerFragment.OooOoo0().f77170Ooooo0o.f121747OooOo0o.getValue());
                return;
            }
            Iterable iterable = (Iterable) favoriteContainerFragment.OooOoo0().f77170Ooooo0o.f121747OooOo0o.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (c30214OooOoOO.OooO00o().getFilterFunction().invoke((NoteVO) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            favoriteContainerFragment.OooOoo0().OooOo0o(arrayList);
        }
    }

    public static final class OooO0OO extends AbstractC20413OooOo0O {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$backPressedCallback$1$handleOnBackPressed$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {126}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77488OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77489OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ NoteVO f77490OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FavoriteContainerFragment favoriteContainerFragment, NoteVO noteVO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77488OooOo = favoriteContainerFragment;
                this.f77490OooOoO0 = noteVO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77488OooOo, this.f77490OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77489OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = this.f77488OooOo.OooOoo0();
                    this.f77489OooOo0o = 1;
                    if (oooO0OOOooOoo0.OooOoO0(this.f77490OooOoO0, this) == enumC32485OooO00o) {
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

        public OooO0OO() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            C22008OoooOo0 c22008OoooOo0;
            FavoriteContainerFragment favoriteContainerFragment = FavoriteContainerFragment.this;
            if (((Number) favoriteContainerFragment.OooOoo0().f77147OooOooo.getValue()).intValue() != 0) {
                Log.d("FavoriteContainerFragment", "onBackPressed");
                favoriteContainerFragment.OooOoo0().Oooo000(0);
                return;
            }
            o000o0O0.OooOO0 oooOO0OooOO0O = C21030OooOO0o.OooO0OO(favoriteContainerFragment).OooOO0O();
            String str = (oooOO0OooOO0O == null || (c22008OoooOo0 = (C22008OoooOo0) oooOO0OooOO0O.f83201Oooo00o.getValue()) == null) ? null : (String) c22008OoooOo0.OooO0O0("initial_folder");
            C32443OooOOO c32443OooOOO = (C32443OooOOO) favoriteContainerFragment.OooOoo0().f77161OoooO00.getValue();
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
            if (noteVO == null || kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), str)) {
                C21030OooOO0o.OooO0OO(favoriteContainerFragment).OooOOo0();
                return;
            }
            InterfaceC21987OooOoo viewLifecycleOwner = favoriteContainerFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(favoriteContainerFragment, noteVO2, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onCreate$2$1$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {174}, m80625m = "invokeSuspend")
    public static final class C23659OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77492OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList<Uri> f77493OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onCreate$2$1$1$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {178}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77494OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77495OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ String f77496OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ArrayList<Uri> f77497OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FavoriteContainerFragment favoriteContainerFragment, ArrayList<Uri> arrayList, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77494OooOo = favoriteContainerFragment;
                this.f77497OooOoO0 = arrayList;
                this.f77496OooOoO = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77494OooOo, this.f77497OooOoO0, this.f77496OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77495OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = this.f77494OooOo.OooOoo0();
                    this.f77495OooOo0o = 1;
                    if (oooO0OOOooOoo0.OooOOo0(this.f77497OooOoO0, this.f77496OooOoO, this) == enumC32485OooO00o) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23659OooO0Oo(ArrayList<Uri> arrayList, Continuation<? super C23659OooO0Oo> continuation) {
            super(2, continuation);
            this.f77493OooOoO0 = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FavoriteContainerFragment.this.new C23659OooO0Oo(this.f77493OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23659OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77492OooOo0o;
            FavoriteContainerFragment favoriteContainerFragment = FavoriteContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77492OooOo0o = 1;
                obj = FavoriteContainerFragment.OooOoOO(favoriteContainerFragment, 37, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) favoriteContainerFragment.OooOoo0().f77161OoooO00.getValue()).f116638OooOo0o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new OooO00o(favoriteContainerFragment, this.f77493OooOoO0, noteVO != null ? noteVO.getId() : null, null), 3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FavoriteContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5", m80623f = "FavoriteContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23660OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77500OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77501OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77502OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19409OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FavoriteContainerFragment f77503OooOo0o;

                public C19409OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                    this.f77503OooOo0o = favoriteContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    List<SortKeyVO> list = (List) obj;
                    List<SortKeyVO> list2 = list;
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((SortKeyVO) next).getSelected()) {
                            break;
                        }
                    }
                    SortKeyVO sortKeyVO = next;
                    com.orion.notein.p607ui.p609vo.OooO00o key = sortKeyVO != null ? sortKeyVO.getKey() : null;
                    com.orion.notein.p607ui.p609vo.OooO00o oooO00o = com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0;
                    FavoriteContainerFragment favoriteContainerFragment = this.f77503OooOo0o;
                    if (key == oooO00o) {
                        ArrayList arrayList = new ArrayList();
                        for (SortKeyVO sortKeyVOCopy$default : list2) {
                            int iOrdinal = sortKeyVOCopy$default.getKey().ordinal();
                            if (iOrdinal == 0) {
                                sortKeyVOCopy$default = SortKeyVO.copy$default(sortKeyVOCopy$default, null, true, false, 5, null);
                            } else if (iOrdinal == 9) {
                                sortKeyVOCopy$default = null;
                            }
                            if (sortKeyVOCopy$default != null) {
                                arrayList.add(sortKeyVOCopy$default);
                            }
                        }
                        C30294OooO0OO c30294OooO0OO = favoriteContainerFragment.f77478Oooo0OO;
                        if (c30294OooO0OO == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                            throw null;
                        }
                        c30294OooO0OO.OooO0OO(arrayList);
                    } else {
                        C30294OooO0OO c30294OooO0OO2 = favoriteContainerFragment.f77478Oooo0OO;
                        if (c30294OooO0OO2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                            throw null;
                        }
                        c30294OooO0OO2.OooO0OO(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77501OooOo = favoriteContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77501OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77502OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FavoriteContainerFragment favoriteContainerFragment = this.f77501OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                    C19409OooO00o c19409OooO00o = new C19409OooO00o(favoriteContainerFragment);
                    this.f77502OooOo0o = 1;
                    if (oooO0OOOooOoo0.f77159OoooO.f121747OooOo0o.collect(c19409OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5$2", m80623f = "FavoriteContainerFragment.kt", m80624l = {304}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77504OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77505OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FavoriteContainerFragment f77506OooOo0o;

                public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                    this.f77506OooOo0o = favoriteContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    FavoriteContainerFragment favoriteContainerFragment = this.f77506OooOo0o;
                    if (!zBooleanValue) {
                        TipsDialogFragment tipsDialogFragment = favoriteContainerFragment.f77481Oooo0oO;
                        if (tipsDialogFragment == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteDuplicatedTipsDialog");
                            throw null;
                        }
                        tipsDialogFragment.dismiss();
                    } else if (favoriteContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment- duplicate note") == null) {
                        TipsDialogFragment tipsDialogFragment2 = favoriteContainerFragment.f77481Oooo0oO;
                        if (tipsDialogFragment2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteDuplicatedTipsDialog");
                            throw null;
                        }
                        tipsDialogFragment2.show(favoriteContainerFragment.getChildFragmentManager(), "TipsDialogFragment- duplicate note");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77504OooOo = favoriteContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77504OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77505OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                FavoriteContainerFragment favoriteContainerFragment = this.f77504OooOo;
                C33772OooooOo c33772OooooOo = favoriteContainerFragment.OooOoo0().f77144OooOoo;
                OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
                this.f77505OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5$3", m80623f = "FavoriteContainerFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77507OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77508OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FavoriteContainerFragment f77509OooOo0o;

                public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
                    this.f77509OooOo0o = favoriteContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    MainActivity mainActivity;
                    ImportFileResult importFileResult = (ImportFileResult) obj;
                    FavoriteContainerFragment favoriteContainerFragment = this.f77509OooOo0o;
                    int code = importFileResult.getCode();
                    if (code == -7) {
                        ActivityC21897OooOo0 activity = favoriteContainerFragment.getActivity();
                        mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.showUpgradeTipOnInFileDBVersionNotMatch();
                        }
                    } else if (code != -5) {
                        if (code == -4) {
                            Context context = favoriteContainerFragment.getContext();
                            if (context != null) {
                                String string = favoriteContainerFragment.getString(R.string.import_failed_vip_limit);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string);
                            }
                            ActivityC21897OooOo0 activity2 = favoriteContainerFragment.getActivity();
                            mainActivity = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                            if (mainActivity != null) {
                                mainActivity.openMembershipPlans();
                            }
                        } else if (code == -1) {
                            Context context2 = favoriteContainerFragment.getContext();
                            if (context2 != null) {
                                String string2 = favoriteContainerFragment.getString(R.string.uri_permission_toast_import_file);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context2, string2);
                            }
                        } else if (code == 0) {
                            Context context3 = favoriteContainerFragment.getContext();
                            if (context3 != null) {
                                String string3 = favoriteContainerFragment.getString(R.string.import_success);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context3, string3);
                            }
                        } else if (code != 1) {
                            Context context4 = favoriteContainerFragment.getContext();
                            if (context4 != null) {
                                String string4 = favoriteContainerFragment.getString(R.string.import_failed);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context4, string4);
                            }
                        } else {
                            Object obj2 = importFileResult.getObj();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type com.orion.notein.domain.models.note.NoteMeta");
                            NoteMeta noteMeta = (NoteMeta) obj2;
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(favoriteContainerFragment), C23968Oooo00o.OooO0o0(28, noteMeta.getId(), noteMeta.getParentId(), null));
                        }
                    } else if (favoriteContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                        String string5 = favoriteContainerFragment.getString(R.string.tips);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                        String string6 = favoriteContainerFragment.getString(R.string.hit_max_num_of_my_templates);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                        new TipsDialogFragment(string5, string6, null, null).show(favoriteContainerFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f77507OooOo = favoriteContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f77507OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77508OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FavoriteContainerFragment favoriteContainerFragment = this.f77507OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
                    this.f77508OooOo0o = 1;
                    if (oooO0OOOooOoo0.f77169Ooooo00.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5$4", m80623f = "FavoriteContainerFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2}, m80625m = "invokeSuspend")
        public static final class C23661OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FavoriteContainerFragment f77510OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77511OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0o0$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$onViewCreated$5$4$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FavoriteContainerFragment f77512OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77513OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77512OooOo = favoriteContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77512OooOo, continuation);
                    oooO00o.f77513OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(bool, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Boolean bool = (Boolean) this.f77513OooOo0o;
                    View view = this.f77512OooOo.f77480Oooo0o0;
                    if (view != null) {
                        view.setActivated(kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.TRUE));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23661OooO0Oo(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super C23661OooO0Oo> continuation) {
                super(2, continuation);
                this.f77510OooOo = favoriteContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23661OooO0Oo(this.f77510OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23661OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77511OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FavoriteContainerFragment favoriteContainerFragment = this.f77510OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(favoriteContainerFragment, null);
                    this.f77511OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo0.f77164OoooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        public C23660OooO0o0(Continuation<? super C23660OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23660OooO0o0 c23660OooO0o0 = FavoriteContainerFragment.this.new C23660OooO0o0(continuation);
            c23660OooO0o0.f77500OooOo0o = obj;
            return c23660OooO0o0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23660OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77500OooOo0o;
            FavoriteContainerFragment favoriteContainerFragment = FavoriteContainerFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(favoriteContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(favoriteContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(favoriteContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23661OooO0Oo(favoriteContainerFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23662OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23662OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FavoriteContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23663OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23663OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FavoriteContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO f77516OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(OooO oooO) {
            super(0);
            this.f77516OooOo0o = oooO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77516OooOo0o.invoke();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77517OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77517OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77517OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23664OooOO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77518OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23664OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77518OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77518OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77519OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77519OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77519OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? FavoriteContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FavoriteContainerFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooOO0(new OooO()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77470OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new OooOO0O(interfaceC32440OooOO0OooO0O0), new OooOOO0(interfaceC32440OooOO0OooO0O0), new C23664OooOO0o(interfaceC32440OooOO0OooO0O0));
        this.f77469OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0o(), new C23663OooO0oo(), new C23662OooO0oO());
        this.f77472OooOooo = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o00ooo.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                FavoriteContainerFragment favoriteContainerFragment = this.f107289OooOo0o;
                return favoriteContainerFragment.new OooO0O0(favoriteContainerFragment.OooOoo0());
            }
        });
        this.f77479Oooo0o = new OooO0OO();
        this.f77482Oooo0oo = new OooO00o(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(FavoriteContainerFragment favoriteContainerFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30151OooOO0 c30151OooOO0;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30151OooOO0) {
            c30151OooOO0 = (C30151OooOO0) abstractC32479OooO0OO;
            int i2 = c30151OooOO0.f107320OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30151OooOO0.f107320OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30151OooOO0 = new C30151OooOO0(favoriteContainerFragment, abstractC32479OooO0OO);
            }
        }
        C30151OooOO0 c30151OooOO02 = c30151OooOO0;
        Object objShowNonVipFeatureLimitedDialog$default = c30151OooOO02.f107319OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30151OooOO02.f107320OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = favoriteContainerFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30151OooOO02.f107320OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30151OooOO02, 6, null);
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

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOoo0() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f77470OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerForActivityResult(new C20439OooO0oo(), new com.google.firebase.appcheck.debug.internal.OooO00o(this));
        C21904OooOoo0.OooO0oO(this, "import_batch_pdf", new InterfaceC32508OooOOOo() { // from class: o0o00ooo.OooO00o
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("pdf_uri_list", Uri.class) : bundle2.getParcelableArrayList("pdf_uri_list");
                if (parcelableArrayList != null) {
                    FavoriteContainerFragment favoriteContainerFragment = this.f107288OooOo0o;
                    InterfaceC21987OooOoo viewLifecycleOwner = favoriteContainerFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, favoriteContainerFragment.new C23659OooO0Oo(parcelableArrayList, null), 3);
                } else {
                    Log.d("FavoriteContainerFragment", "key 'pdf_uri_list' not exist");
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, this.f77479Oooo0o);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_note_list_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C30207OooOo c30207OooOo = this.f77474Oooo000;
        if (c30207OooOo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
            throw null;
        }
        c30207OooOo.OooO0O0();
        C30294OooO0OO c30294OooO0OO = this.f77478Oooo0OO;
        if (c30294OooO0OO != null) {
            c30294OooO0OO.OooO00o();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("move_notes_and_folders", this, new OooOOOo.OooO(this));
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        ((MainActivity) activityC21897OooOo0RequireActivity).setDrawerEnable(true);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        OooOoo0().Oooo00O(NoteMeta.PROPERTY_FAVORITE);
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("initial_folder") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && ((C32443OooOOO) OooOoo0().f77161OoooO00.getValue()).f116638OooOo0o == 0) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.remove("initial_folder");
            }
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30141OooO(this, str, null), 3);
        }
        String string = getString(R.string.note_copy_into);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.note_copying_and_waiting);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        this.f77481Oooo0oO = new TipsDialogFragment(string, string2, new ViewOnClickListenerC29465OooOoo(this, 1), null);
        C30191OooO0oO c30191OooO0oO = new C30191OooO0oO(this, OooOoo0());
        c30191OooO0oO.OooOOOo();
        c30191OooO0oO.OooOOOO();
        C30207OooOo c30207OooOo = new C30207OooOo(this, c30191OooO0oO);
        this.f77474Oooo000 = c30207OooOo;
        c30207OooOo.OooO00o(view, (C26320o0000OoO) this.f77469OooOoo.getValue(), OooOoo0());
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30146OooO0o(this, null), 3);
        C30185OooO00o c30185OooO00o = new C30185OooO00o(this, (C30189OooO0o) this.f77472OooOooo.getValue());
        this.f77471OooOooO = c30185OooO00o;
        c30185OooO00o.OooO0O0(view);
        C30185OooO00o c30185OooO00o2 = this.f77471OooOooO;
        if (c30185OooO00o2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
            throw null;
        }
        c30185OooO00o2.OooO0o(R.id.btn_settings);
        C30185OooO00o c30185OooO00o3 = this.f77471OooOooO;
        if (c30185OooO00o3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("actionBarInitializer");
            throw null;
        }
        c30185OooO00o3.OooO0o(R.id.message_wrapper);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30147OooO0o0(this, null), 3);
        if (((TabLayout) view.findViewById(R.id.tablayout)) != null) {
            C30214OooOoOO c30214OooOoOO = new C30214OooOoOO(this, view, ((Number) OooOoo0().f77141OooOoO.getValue()).intValue(), new C30150OooO0oo(this));
            this.f77475Oooo00O = c30214OooOoOO;
            c30214OooOoOO.OooO0O0();
            OooOoo0().OooOoo(null);
        }
        View viewFindViewById = view.findViewById(R.id.label_color_filter_section);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_more_note_tab);
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC29221OooO0o(this, 1));
            TextView textView = (TextView) view.findViewById(R.id.tv_note_filter);
            if (textView != null) {
                this.f77476Oooo00o = textView;
                FavoriteListFragment favoriteListFragment = new FavoriteListFragment();
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
                oooO00o.OooO0o0(favoriteListFragment, R.id.fragment_container);
                oooO00o.OooO0oo();
                OooOoo0().OooOoo((Integer) OooOoo0().f77141OooOoO.getValue());
                InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C30149OooO0oO(this, null), 3);
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.sort);
        this.f77477Oooo0O0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSort");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29219OooO0OO(this, 2));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77478Oooo0OO = new C30294OooO0OO(contextRequireContext, new ViewOnClickListenerC29467OooOooO(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_list_layout);
        this.f77480Oooo0o0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC29468OooOooo(this, 1));
        InterfaceC21987OooOoo viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner5), null, null, new C23660OooO0o0(null), 3);
    }
}

package com.orion.notein.p607ui.notelist.trashbin;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20418OooOoo;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment.OooO0O0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0Oo0oOo.ViewOnClickListenerC28316OooOO0o;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28541OooOoo;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0OoO0oo.oo00o;
import o0OoOOoO.ViewOnClickListenerC29187OooO00o;
import o0o00Ooo.ViewOnClickListenerC29918OooO0o0;
import o0o00oo0.ViewOnClickListenerC30134OooO00o;
import o0o00oo0.ViewOnClickListenerC30136OooO0OO;
import o0o0O00.C30214OooOoOO;
import o0o0O0o.C30294OooO0OO;
import o0o0O0oO.C30311OooO;
import o0o0O0oO.C30314OooO0OO;
import o0o0O0oO.C30315OooO0Oo;
import o0o0O0oO.C30317OooO0o0;
import o0o0O0oO.C30319OooO0oo;
import o0o0O0oO.C30349Oooo0o;
import o0o0O0oO.C30351Oooo0oO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/trashbin/TrashBinContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TrashBinContainerFragment extends Hilt_TrashBinContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f78067OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78068OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Toolbar f78069OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f78070OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f78071Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78072Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f78073Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f78074Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f78075Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f78076Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f78077Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f78078Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f78079Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f78080Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f78081Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f78082OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f78083OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public C30214OooOoOO f78084OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public NoteFilterBottomSheetDialog f78085OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public C30294OooO0OO f78086OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO00o f78087OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f78088o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78089OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78089OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78089OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o extends AbstractC20413OooOo0O {

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onCreate$1$handleOnBackPressed$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {134}, m80625m = "invokeSuspend")
        public static final class C19433OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TrashBinContainerFragment f78091OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78092OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ NoteVO f78093OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19433OooO00o(TrashBinContainerFragment trashBinContainerFragment, NoteVO noteVO, Continuation<? super C19433OooO00o> continuation) {
                super(2, continuation);
                this.f78091OooOo = trashBinContainerFragment;
                this.f78093OooOoO0 = noteVO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19433OooO00o(this.f78091OooOo, this.f78093OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19433OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78092OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30351Oooo0oO c30351Oooo0oOOooOoOO = this.f78091OooOo.OooOoOO();
                    this.f78092OooOo0o = 1;
                    if (c30351Oooo0oOOooOoOO.OooOOOO(this.f78093OooOoO0, this) == enumC32485OooO00o) {
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

        public OooO00o() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            TrashBinContainerFragment trashBinContainerFragment = TrashBinContainerFragment.this;
            if (((Number) trashBinContainerFragment.OooOoOO().f108238OooOOo.getValue()).intValue() == 1) {
                trashBinContainerFragment.OooOoOO().OooOOo0(0);
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) trashBinContainerFragment.OooOoOO().f108242OooOo0.getValue();
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
            if (noteVO == null) {
                C21030OooOO0o.OooO0OO(trashBinContainerFragment).OooOOo0();
                return;
            }
            InterfaceC21987OooOoo viewLifecycleOwner = trashBinContainerFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C19433OooO00o(trashBinContainerFragment, noteVO2, null), 2);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onResume$1$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {90}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78095OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TrashBinContainerFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78095OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30351Oooo0oO c30351Oooo0oOOooOoOO = TrashBinContainerFragment.this.OooOoOO();
                this.f78095OooOo0o = 1;
                if (c30351Oooo0oOOooOoOO.OooO0o0(this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onResume$2$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {103, 106, 109, 113}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f78096OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78097OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f78098OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TrashBinContainerFragment f78099OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Bundle f78100OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, TrashBinContainerFragment trashBinContainerFragment, int i, Bundle bundle, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f78096OooOo = str;
            this.f78099OooOoO0 = trashBinContainerFragment;
            this.f78098OooOoO = i;
            this.f78100OooOoOO = bundle;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f78096OooOo, this.f78099OooOoO0, this.f78098OooOoO, this.f78100OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (r10.OooO(r9) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        
            if (r1.OooO0oo(r8, r10, r9) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78097OooOo0o;
            TrashBinContainerFragment trashBinContainerFragment = this.f78099OooOoO0;
            int i2 = this.f78098OooOoO;
            String str = this.f78096OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (str != null) {
                    if (i2 == 0) {
                        C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
                        this.f78097OooOo0o = 2;
                        if (c30351Oooo0oOOooOoOO.OooO0oO(str, this) != enumC32485OooO00o) {
                        }
                    }
                    if (i2 == 1) {
                    }
                    if (i2 == 2) {
                    }
                    trashBinContainerFragment.OooOoOO().OooOOo0(0);
                    return C32460OooOooO.f116667OooO00o;
                }
                C30351Oooo0oO c30351Oooo0oOOooOoOO2 = trashBinContainerFragment.OooOoOO();
                this.f78097OooOo0o = 1;
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (i2 == 1) {
                        C30351Oooo0oO c30351Oooo0oOOooOoOO3 = trashBinContainerFragment.OooOoOO();
                        this.f78097OooOo0o = 3;
                        if (c30351Oooo0oOOooOoOO3.OooO0o(str, this) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    if (i2 == 2) {
                    }
                    trashBinContainerFragment.OooOoOO().OooOOo0(0);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i == 3) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (i2 == 2) {
                        String string = this.f78100OooOoOO.getString("pageNoteId");
                        if (string == null) {
                            string = "";
                        }
                        C30351Oooo0oO c30351Oooo0oOOooOoOO4 = trashBinContainerFragment.OooOoOO();
                        this.f78097OooOo0o = 4;
                    }
                    trashBinContainerFragment.OooOoOO().OooOOo0(0);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            trashBinContainerFragment.OooOoOO().OooOOo0(0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onViewCreated$3", m80623f = "TrashBinContainerFragment.kt", m80624l = {182}, m80625m = "invokeSuspend")
    public static final class C23712OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78102OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0Oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TrashBinContainerFragment f78103OooOo0o;

            public OooO00o(TrashBinContainerFragment trashBinContainerFragment) {
                this.f78103OooOo0o = trashBinContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<SortKeyVO> list = (List) obj;
                C30294OooO0OO c30294OooO0OO = this.f78103OooOo0o.f78086OoooOO0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO0OO(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("sortPopupWindow");
                throw null;
            }
        }

        public C23712OooO0Oo(Continuation<? super C23712OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TrashBinContainerFragment.this.new C23712OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C23712OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78102OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TrashBinContainerFragment trashBinContainerFragment = TrashBinContainerFragment.this;
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(trashBinContainerFragment);
                this.f78102OooOo0o = 1;
                if (c30351Oooo0oOOooOoOO.f108241OooOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return TrashBinContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onViewCreated$5", m80623f = "TrashBinContainerFragment.kt", m80624l = {193}, m80625m = "invokeSuspend")
    public static final class C23713OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78106OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$onViewCreated$5$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TrashBinContainerFragment f78107OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f78108OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78107OooOo = trashBinContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f78107OooOo, continuation);
                oooO00o.f78108OooOo0o = obj;
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
                Boolean bool = (Boolean) this.f78108OooOo0o;
                View view = this.f78107OooOo.f78088o000oOoO;
                if (view != null) {
                    view.setActivated(OooOOO0.OooO0O0(bool, Boolean.TRUE));
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("btnListLayout");
                throw null;
            }
        }

        public C23713OooO0o0(Continuation<? super C23713OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TrashBinContainerFragment.this.new C23713OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23713OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78106OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TrashBinContainerFragment trashBinContainerFragment = TrashBinContainerFragment.this;
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(trashBinContainerFragment, null);
                this.f78106OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30351Oooo0oOOooOoOO.f108248OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23714OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f78109OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23714OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f78109OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78109OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23715OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78110OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23715OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78110OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78110OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78111OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78111OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78111OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TrashBinContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TrashBinContainerFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23714OooO0oO(new OooO0o()));
        this.f78068OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30351Oooo0oO.class), new C23715OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
    }

    public final C30351Oooo0oO OooOoOO() {
        return (C30351Oooo0oO) this.f78068OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78087OoooOOO = new OooO00o();
        C20418OooOoo onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        OooO00o oooO00o = this.f78087OoooOOO;
        if (oooO00o != null) {
            onBackPressedDispatcher.OooO00o(this, oooO00o);
        } else {
            OooOOO0.OooOOOO("mBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_trash_bin_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C30294OooO0OO c30294OooO0OO = this.f78086OoooOO0;
        if (c30294OooO0OO != null) {
            c30294OooO0OO.OooO00o();
        } else {
            OooOOO0.OooOOOO("sortPopupWindow");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C30351Oooo0oO c30351Oooo0oOOooOoOO = OooOoOO();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30351Oooo0oOOooOoOO);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30349Oooo0o(c30351Oooo0oOOooOoOO, null), 2);
        requireActivity().getSupportFragmentManager().Oooooo0("clear_trash", this, new InterfaceC21912Oooo0o() { // from class: o0o0O0oO.OooO0O0
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "<unused var>");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TrashBinContainerFragment");
                c20358OooO00o.OooO0o0("confirm to clear trash bin. ", new Object[0]);
                TrashBinContainerFragment trashBinContainerFragment = this.f108084OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = trashBinContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, trashBinContainerFragment.new OooO0O0(null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("delete_permanently", this, new oo00o(this));
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C33781o00o0O c33781o00o0O = OooOoOO().f108240OooOOoo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, "trash_bin");
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        this.f78069OooOooO = toolbar;
        View viewFindViewById = view.findViewById(R.id.btn_menu);
        this.f78074Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnMenu");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28305OooO(this, 5));
        Toolbar toolbar2 = this.f78069OooOooO;
        if (toolbar2 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        this.f78067OooOoo = toolbar2.findViewById(R.id.normal);
        this.f78073Oooo000 = (TextView) view.findViewById(R.id.current_folder_name);
        this.f78072Oooo0 = (TextView) view.findViewById(R.id.parent_folder_name);
        View viewFindViewById2 = view.findViewById(R.id.btn_back_to_parent);
        this.f78075Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBackToParent");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28314OooOO0(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.btn_delete_all);
        this.f78076Oooo0O0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnDeleteAll");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29187OooO00o(this, 3));
        View viewFindViewById4 = view.findViewById(R.id.btn_select);
        this.f78070OooOooo = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnSelect");
            throw null;
        }
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC28316OooOO0o(this, 2));
        Toolbar toolbar3 = this.f78069OooOooO;
        if (toolbar3 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        this.f78077Oooo0OO = toolbar3.findViewById(R.id.select);
        Toolbar toolbar4 = this.f78069OooOooO;
        if (toolbar4 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        TextView textView = (TextView) toolbar4.findViewById(R.id.select_all);
        this.f78078Oooo0o = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("selectAll");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28318OooOOO0(this, 5));
        View view2 = this.f78077Oooo0OO;
        if (view2 == null) {
            OooOOO0.OooOOOO("atbSelect");
            throw null;
        }
        View viewFindViewById5 = view2.findViewById(R.id.select_finish);
        this.f78079Oooo0o0 = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("selectFinish");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC28542OooOoo0(this, 4));
        this.f78080Oooo0oO = view.findViewById(R.id.select_action);
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_recover);
        this.f78081Oooo0oo = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnRecover");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28541OooOoo(this, 3));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.btn_delete_permanent);
        this.f78071Oooo = imageView2;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("btnDeletePermanently");
            throw null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC29918OooO0o0(this, 2));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30314OooO0OO(this, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30315OooO0Oo(this, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30317OooO0o0(this, null), 3);
        if (((TabLayout) view.findViewById(R.id.tablayout)) != null) {
            C30214OooOoOO c30214OooOoOO = new C30214OooOoOO(this, view, ((Number) OooOoOO().f108232OooOO0O.getValue()).intValue(), new C30311OooO(this));
            this.f78084OoooO00 = c30214OooOoOO;
            c30214OooOoOO.OooO0O0();
            OooOoOO().OooOOOo(null);
        }
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_more_note_tab);
        if (imageView3 != null) {
            imageView3.setOnClickListener(new o0o0000.OooO00o(this, 2));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_note_filter);
        if (textView2 != null) {
            this.f78083OoooO0 = textView2;
            TrashBinListFragment trashBinListFragment = new TrashBinListFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
            oooO00o.OooO0o0(trashBinListFragment, R.id.fragment_container);
            oooO00o.OooO0oo();
            OooOoOO().OooOOOo((Integer) OooOoOO().f108232OooOO0O.getValue());
            InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C30319OooO0oo(this, null), 3);
        }
        View viewFindViewById6 = view.findViewById(R.id.sort);
        this.f78082OoooO = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnSort");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC28540OooOoOO(this, 4));
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f78086OoooOO0 = new C30294OooO0OO(contextRequireContext, new ViewOnClickListenerC30134OooO00o(this, 1));
        InterfaceC21987OooOoo viewLifecycleOwner5 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner5), null, null, new C23712OooO0Oo(null), 3);
        View viewFindViewById7 = view.findViewById(R.id.btn_list_layout);
        this.f78088o000oOoO = viewFindViewById7;
        if (viewFindViewById7 == null) {
            OooOOO0.OooOOOO("btnListLayout");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new ViewOnClickListenerC30136OooO0OO(this, 1));
        InterfaceC21987OooOoo viewLifecycleOwner6 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner6), null, null, new C23713OooO0o0(null), 3);
    }
}

package com.orion.notein.p607ui.noteeditor.addpage;

import OooO0o.OooOO0;
import OooO0oO.C20433OooO0OO;
import OooO0oO.C20440OooOO0;
import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.google.android.material.search.OooOO0O;
import com.google.android.material.search.ViewOnClickListenerC22479OooOOo;
import com.google.firebase.firestore.local.C22646OooOoO;
import com.google.firebase.inappmessaging.internal.C22741OooOoo;
import com.google.firebase.inappmessaging.internal.C22743OooOooO;
import com.google.firebase.inappmessaging.internal.Oooo000;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.addpage.OooO0OO;
import com.orion.notein.ui.noteeditor.addpage.AddPageFragment.OooO00o;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28426OooOo0;
import o0OoOO00.C29006OooOOoo;
import o0OoOO00.C29016OooOooO;
import o0OoOO00.C29032OoooOOO;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/AddPageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AddPageFragment extends Hilt_AddPageFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f73799OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f73800OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f73801OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public RecyclerView f73802OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO0o.OooO0O0<Uri> f73803Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C29032OoooOOO f73804Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Uri f73805Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Uri f73806Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Handler f73807Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO0o.OooO0O0<OooOO0> f73808Oooo0OO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageFragment$onCreate$2$1", m80623f = "AddPageFragment.kt", m80624l = {116}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73810OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f73811OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73811OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AddPageFragment.this.new OooO00o(this.f73811OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73810OooOo0o;
            AddPageFragment addPageFragment = AddPageFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
                Context contextRequireContext = addPageFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                List listOooO0oO = OooOo.OooO0oO(this.f73811OooOoO0);
                this.f73810OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29016OooOooO(oooO0OOOooOoO, listOooO0oO, contextRequireContext, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            addPageFragment.OooOoO().OooO0oO();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageFragment$pickMultipleMedia$1$1", m80623f = "AddPageFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73813OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f73814OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<Uri> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f73814OooOoO0 = list;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AddPageFragment.this.new OooO0O0(this.f73814OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73813OooOo0o;
            AddPageFragment addPageFragment = AddPageFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
                Context contextRequireContext = addPageFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                List<Uri> list = this.f73814OooOoO0;
                OooOOO0.OooO0Oo(list);
                this.f73813OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29016OooOooO(oooO0OOOooOoO, list, contextRequireContext, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            addPageFragment.OooOoO().OooO0oO();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29006OooOOoo f73815OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C29006OooOOoo c29006OooOOoo) {
            super(0);
            this.f73815OooOo0o = c29006OooOOoo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73815OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.AddPageFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23362OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73816OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23362OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73816OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73816OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73817OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73817OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73817OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? AddPageFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.AddPageFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23363OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73819OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23363OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73819OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73819OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public AddPageFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new C29006OooOOoo(this, 0)));
        this.f73800OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO.class), new C23362OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23363OooO0o0(interfaceC32440OooOO0OooO0O0));
        this.f73799OooOoo = "";
        this.f73801OooOooO = "";
        this.f73807Oooo0O0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o0OoOO00.OooOo00
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
                if (message.what != 1) {
                    return false;
                }
                Object obj = message.obj;
                Uri uri = obj instanceof Uri ? (Uri) obj : null;
                if (uri == null) {
                    return true;
                }
                AddPageFragment addPageFragment = this.f102759OooOo0o;
                com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
                String noteId = addPageFragment.f73799OooOoo;
                String pageId = addPageFragment.f73801OooOooO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
                oooO0OOOooOoO.OooO0o(new OooO0OO.OooO00o.OooO0Oo(noteId, pageId, uri));
                return true;
            }
        });
        OooO0o.OooO0O0<OooOO0> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20433OooO0OO(9), new com.google.firebase.crashlytics.OooO00o(this, 1));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f73808Oooo0OO = oooO0O0RegisterForActivityResult;
    }

    public final com.orion.notein.p607ui.noteeditor.addpage.OooO0OO OooOoO() {
        return (com.orion.notein.p607ui.noteeditor.addpage.OooO0OO) this.f73800OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("note_id");
            if (string == null) {
                string = "";
            }
            this.f73799OooOoo = string;
            String string2 = arguments.getString("page_id");
            this.f73801OooOooO = string2 != null ? string2 : "";
        }
        this.f73803Oooo0 = registerForActivityResult(new C20440OooOO0(), new OooO0o.OooO00o() { // from class: o0OoOO00.OooOOo
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                AddPageFragment addPageFragment;
                Uri uri2;
                Boolean success = (Boolean) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(success, "success");
                if (success.booleanValue() && (uri2 = (addPageFragment = this.f102751OooOo0o).f73805Oooo00O) != null) {
                    InterfaceC21987OooOoo viewLifecycleOwner = addPageFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, addPageFragment.new OooO00o(uri2, null), 3);
                }
            }
        });
        Uri uri2 = null;
        if (bundle != null) {
            uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("state_image_save_uri", Uri.class) : bundle.getParcelable("state_image_save_uri"));
        } else {
            uri = null;
        }
        this.f73805Oooo00O = uri;
        if (bundle != null) {
            uri2 = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("state_pending_pdf_uri", Uri.class) : bundle.getParcelable("state_pending_pdf_uri"));
        }
        this.f73806Oooo00o = uri2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.add_page_fragment, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f73807Oooo0O0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("pdf_password", this, new C22743OooOooO(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        Uri uri = this.f73805Oooo00O;
        if (uri != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                outState.putParcelable("state_image_save_uri", uri);
            } else {
                outState.putParcelable("state_image_save_uri", uri);
            }
        }
        Uri uri2 = this.f73806Oooo00o;
        if (uri2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                outState.putParcelable("state_pending_pdf_uri", uri2);
            } else {
                outState.putParcelable("state_pending_pdf_uri", uri2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        int i2 = 3;
        int i3 = 1;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager parentFragmentManager = requireParentFragment().getParentFragmentManager();
        OooOOO0.OooO0o(parentFragmentManager, "getParentFragmentManager(...)");
        parentFragmentManager.Oooooo0("add_pdf_page", getViewLifecycleOwner(), new Oooo000(this));
        parentFragmentManager.Oooooo0("get_pdf_path", getViewLifecycleOwner(), new C22646OooOoO(this, 3));
        parentFragmentManager.Oooooo0("get_pdf_path_and_add_entire_pdf_doc", getViewLifecycleOwner(), new C22741OooOoo(this, 2));
        if (this.f73799OooOoo.length() == 0 || this.f73801OooOooO.length() == 0) {
            C34406OooO00o.f123390OooO00o.OooOO0O("AddPageFragment missing required args, dismissing self", new Object[0]);
            OooOoO().OooO0oO();
            return;
        }
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = OooOoO();
        String pageId = this.f73801OooOooO;
        OooOOO0.OooO0oO(pageId, "pageId");
        C33781o00o0O c33781o00o0O = oooO0OOOooOoO.f73861OooOOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, pageId);
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO2 = OooOoO();
        String noteId = this.f73799OooOoo;
        OooOOO0.OooO0oO(noteId, "noteId");
        C33781o00o0O c33781o00o0O2 = oooO0OOOooOoO2.f73859OooOO0o;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, noteId);
        C29032OoooOOO c29032OoooOOO = new C29032OoooOOO(C29032OoooOOO.OooO00o.f102848OooO00o);
        c29032OoooOOO.f102847OooO0O0 = new OooOO0O(this, i2);
        this.f73804Oooo000 = c29032OoooOOO;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.page_theme_list);
        this.f73802OooOooo = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("pageThemeList");
            throw null;
        }
        C29032OoooOOO c29032OoooOOO2 = this.f73804Oooo000;
        if (c29032OoooOOO2 == null) {
            OooOOO0.OooOOOO("pageThemeAdapter");
            throw null;
        }
        recyclerView.setAdapter(c29032OoooOOO2);
        RecyclerView recyclerView2 = this.f73802OooOooo;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("pageThemeList");
            throw null;
        }
        recyclerView2.setItemAnimator(null);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0OoOO00.OooOo(this, null), 2);
        View viewFindViewById = view.findViewById(R.id.add_from_theme);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC28426OooOo0(this, i3));
        }
        View viewFindViewById2 = view.findViewById(R.id.add_from_gallery);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29007OooOo0(this, i));
        }
        View viewFindViewById3 = view.findViewById(R.id.add_from_camera);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC22479OooOOo(this, 2));
        }
        View viewFindViewById4 = view.findViewById(R.id.add_from_pdf);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(this, i3));
        }
        View viewFindViewById5 = view.findViewById(R.id.add_a_pdf_doc);
        if (viewFindViewById5 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById5, 1000L, new ViewOnClickListenerC28137OooO0OO(this, i3));
        }
    }
}

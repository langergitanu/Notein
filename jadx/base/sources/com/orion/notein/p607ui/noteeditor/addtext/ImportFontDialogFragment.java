package com.orion.notein.p607ui.noteeditor.addtext;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0oO.C20438OooO0oO;
import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.OooO0OO;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0Oo0o00.ViewOnClickListenerC28183Oooo0O0;
import o0Oo0o00.ViewOnClickListenerC28184Oooo0OO;
import o0OoO0oo.C28692OooO0oo;
import o0OoOOO.C29039OooO00o;
import o0OoOOO0.C29042OooO0O0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/ImportFontDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImportFontDialogFragment extends Hilt_ImportFontDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f73981OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f73982OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C29039OooO00o f73983Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f73984Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f73985Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SearchView f73986Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f73987Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f73988Oooo0OO;

    public static final class OooO00o extends AbstractC20413OooOo0O {
        public OooO00o() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            ImportFontDialogFragment importFontDialogFragment = ImportFontDialogFragment.this;
            File file = (File) importFontDialogFragment.OooOoo().f74018OooO0oO.getValue();
            if (OooOOO0.OooO0O0(file.getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath())) {
                C21030OooOO0o.OooO0OO(importFontDialogFragment).OooOOo0();
                return;
            }
            String parent = file.getParent();
            if (parent != null) {
                importFontDialogFragment.OooOoo().OooO0o0(parent);
            }
        }
    }

    public static final class OooO0O0 implements SearchView.OooOOO0 {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = ImportFontDialogFragment.this.OooOoo();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f74020OooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = oooO0OOOooOoo.f74014OooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$onViewCreated$8", m80623f = "ImportFontDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f73992OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$onViewCreated$8$1", m80623f = "ImportFontDialogFragment.kt", m80624l = {155}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportFontDialogFragment f73993OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73994OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19275OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportFontDialogFragment f73995OooOo0o;

                public C19275OooO00o(ImportFontDialogFragment importFontDialogFragment) {
                    this.f73995OooOo0o = importFontDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    List<T> list = (List) obj;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((C31039OooOO0O) next).f110820OooO0o0) {
                            break;
                        }
                    }
                    boolean z = next != null;
                    ImportFontDialogFragment importFontDialogFragment = this.f73995OooOo0o;
                    TextView textView = importFontDialogFragment.f73984Oooo000;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    C29039OooO00o c29039OooO00o = importFontDialogFragment.f73983Oooo0;
                    if (c29039OooO00o != null) {
                        c29039OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("fileNodeAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ImportFontDialogFragment importFontDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73993OooOo = importFontDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73993OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73994OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportFontDialogFragment importFontDialogFragment = this.f73993OooOo;
                    com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = importFontDialogFragment.OooOoo();
                    C19275OooO00o c19275OooO00o = new C19275OooO00o(importFontDialogFragment);
                    this.f73994OooOo0o = 1;
                    if (oooO0OOOooOoo.f74021OooOO0O.f121747OooOo0o.collect(c19275OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$onViewCreated$8$2", m80623f = "ImportFontDialogFragment.kt", m80624l = {162}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportFontDialogFragment f73996OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73997OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportFontDialogFragment f73998OooOo0o;

                public OooO00o(ImportFontDialogFragment importFontDialogFragment) {
                    this.f73998OooOo0o = importFontDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ImportFontDialogFragment importFontDialogFragment = this.f73998OooOo0o;
                    if (iIntValue == 0) {
                        TextView textView = importFontDialogFragment.f73982OooOooo;
                        if (textView == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView.setText(importFontDialogFragment.getString(R.string.cancel));
                    } else if (iIntValue == 1) {
                        TextView textView2 = importFontDialogFragment.f73982OooOooo;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(importFontDialogFragment.getString(R.string.select_all));
                    } else if (iIntValue != 2) {
                        importFontDialogFragment.getClass();
                    } else {
                        TextView textView3 = importFontDialogFragment.f73982OooOooo;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView3.setText(importFontDialogFragment.getString(R.string.unselect_all));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ImportFontDialogFragment importFontDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73996OooOo = importFontDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73996OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73997OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportFontDialogFragment importFontDialogFragment = this.f73996OooOo;
                    com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = importFontDialogFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(importFontDialogFragment);
                    this.f73997OooOo0o = 1;
                    if (oooO0OOOooOoo.f74022OooOO0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = ImportFontDialogFragment.this.new OooO0OO(continuation);
            oooO0OO.f73992OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73992OooOo0o;
            ImportFontDialogFragment importFontDialogFragment = ImportFontDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(importFontDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(importFontDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23375OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23375OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ImportFontDialogFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74000OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74000OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74000OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23376OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23375OooO0Oo f74001OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23376OooO0o0(C23375OooO0Oo c23375OooO0Oo) {
            super(0);
            this.f74001OooOo0o = c23375OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74001OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23377OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74002OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23377OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74002OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74002OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.ImportFontDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23378OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74003OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23378OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74003OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74003OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ImportFontDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ImportFontDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23376OooO0o0(new C23375OooO0Oo()));
        this.f73981OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.noteeditor.addtext.OooO0OO.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23378OooO0oo(interfaceC32440OooOO0OooO0O0), new C23377OooO0oO(interfaceC32440OooOO0OooO0O0));
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0OoOOO0.OooO00o
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ClipData clipData;
                Uri data;
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                ArrayList arrayList = new ArrayList();
                ImportFontDialogFragment importFontDialogFragment = this.f102876OooOo0o;
                Intent intent = result.f62239OooOo;
                if (intent != null && (data = intent.getData()) != null) {
                    if (!importFontDialogFragment.OooOooO(data)) {
                        data = null;
                    }
                    if (data != null) {
                        arrayList.add(data);
                    }
                }
                if (intent != null && (clipData = intent.getClipData()) != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
                        if (importFontDialogFragment.OooOooO(uri)) {
                            arrayList.add(uri);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC21987OooOoo viewLifecycleOwner = importFontDialogFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.noteeditor.addtext.OooO00o(arrayList, importFontDialogFragment, null), 3);
                    return;
                }
                Context context = importFontDialogFragment.getContext();
                if (context != null) {
                    String string = importFontDialogFragment.getString(R.string.no_file_is_selected);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                if (importFontDialogFragment.f73987Oooo0O0) {
                    importFontDialogFragment.dismissAllowingStateLoss();
                }
            }
        });
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f73988Oooo0OO = oooO0O0RegisterForActivityResult;
        OooOOO0.OooO0o(registerForActivityResult(new C20438OooO0oO(), new C29042OooO0O0(this, 0)), "registerForActivityResult(...)");
    }

    public static final void OooOoo0(ImportFontDialogFragment importFontDialogFragment, OooO0OO.OooO00o oooO00o) {
        Context context;
        importFontDialogFragment.getClass();
        String str = oooO00o.f74024OooO0O0;
        int i = oooO00o.f74023OooO00o;
        if (i == 1) {
            Context context2 = importFontDialogFragment.getContext();
            if (context2 != null) {
                String string = importFontDialogFragment.getString(R.string.font_import_failed_no_file, str);
                OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context2, string);
            }
        } else if (i == 2) {
            Context context3 = importFontDialogFragment.getContext();
            if (context3 != null) {
                String string2 = importFontDialogFragment.getString(R.string.font_import_failed_duplicate, str);
                OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(context3, string2);
            }
        } else if (i == 3 && (context = importFontDialogFragment.getContext()) != null) {
            String string3 = importFontDialogFragment.getString(R.string.font_import_failed, str);
            OooOOO0.OooO0o(string3, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string3);
        }
        if (importFontDialogFragment.f73987Oooo0O0) {
            importFontDialogFragment.dismissAllowingStateLoss();
        }
    }

    public final com.orion.notein.p607ui.noteeditor.addtext.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.noteeditor.addtext.OooO0OO) this.f73981OooOooO.getValue();
    }

    public final boolean OooOooO(Uri uri) {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (!C33595OooOOo.OooOOo(context.getContentResolver().getType(uri), "font/ttf", true)) {
            String strOooO0o0 = C32501OooO0oO.OooO0o0(new File(C28692OooO0oo.OooO0OO(context, uri)));
            if (!"ttf".equalsIgnoreCase(strOooO0o0) && !"otf".equalsIgnoreCase(strOooO0o0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, new OooO00o());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_font_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f73987Oooo0O0 = contextRequireContext.getApplicationInfo().targetSdkVersion >= 30;
        com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = OooOoo();
        Boolean bool = Boolean.TRUE;
        C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f74017OooO0o0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView == null) {
            OooOOO0.OooOOOO("txtTitle");
            throw null;
        }
        textView.setText(getString(R.string.title_import_font));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        this.f73982OooOooo = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView2.setOnClickListener(new ViewOnClickListenerC28179Oooo0(this, 1));
        TextView textView3 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f73984Oooo000 = textView3;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView3.setText(getString(R.string._import));
        TextView textView4 = this.f73984Oooo000;
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView4, 500L, new ViewOnClickListenerC28183Oooo0O0(this, 1));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_bread_crumbs);
        OooOOO0.OooO0Oo(viewGroup);
        viewGroup.setVisibility(8);
        C29039OooO00o c29039OooO00o = new C29039OooO00o(C29039OooO00o.C19951OooO00o.f102867OooO00o);
        this.f73983Oooo0 = c29039OooO00o;
        c29039OooO00o.f102866OooO0O0 = new ViewOnClickListenerC28184Oooo0OO(this, 1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C29039OooO00o c29039OooO00o2 = this.f73983Oooo0;
        if (c29039OooO00o2 == null) {
            OooOOO0.OooOOOO("fileNodeAdapter");
            throw null;
        }
        recyclerView.setAdapter(c29039OooO00o2);
        recyclerView.setItemAnimator(null);
        SearchView searchView = (SearchView) view.findViewById(R.id.search_box);
        this.f73986Oooo00o = searchView;
        if (searchView == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        searchView.setFocusable(false);
        SearchView searchView2 = this.f73986Oooo00o;
        if (searchView2 == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        searchView2.setOnQueryTextListener(new OooO0O0());
        TextView textView5 = (TextView) view.findViewById(R.id.tv_file_manager);
        this.f73985Oooo00O = textView5;
        if (textView5 == null) {
            OooOOO0.OooOOOO("btnFileManager");
            throw null;
        }
        textView5.setOnClickListener(new ViewOnClickListenerC26290Oooo0o0(this, 2));
        OooOoo().OooO0o0("/storage");
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
        view.setVisibility(4);
        TextView textView6 = this.f73985Oooo00O;
        if (textView6 != null) {
            textView6.performClick();
        } else {
            OooOOO0.OooOOOO("btnFileManager");
            throw null;
        }
    }
}

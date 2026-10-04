package com.orion.notein.p607ui.notelist.pdf;

import OooO0Oo.AbstractC20413OooOo0O;
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
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment.OooO00o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.Oooo000;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0o0O0O0.C30266OooO00o;
import o0o0O0O0.C30269OooO0o0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/pdf/ImportBatchPdfDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImportBatchPdfDialogFragment extends Hilt_ImportBatchPdfDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f77833OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f77834OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f77835Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f77836Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f77837Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f77838Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C30266OooO00o f77839Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f77840Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f77841Oooo0o0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77842OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77842OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77842OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$documentLauncher$1$1", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77844OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f77845OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f77845OooOoO0 = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ImportBatchPdfDialogFragment.this.new OooO00o(this.f77845OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77844OooOo0o;
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = ImportBatchPdfDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Iterable iterable = (Iterable) importBatchPdfDialogFragment.OooOooo().f107904OooOO0O.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((C31039OooOO0O) obj2).f110820OooO0o0) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                this.f77844OooOo0o = 1;
                obj = ImportBatchPdfDialogFragment.OooOoo0(importBatchPdfDialogFragment, 37, size, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                if (importBatchPdfDialogFragment.f77840Oooo0OO) {
                    importBatchPdfDialogFragment.dismiss();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            String str = importBatchPdfDialogFragment.OooOoo().f107872OooO00o;
            importBatchPdfDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("pdf_uri_list", this.f77845OooOoO0)), str);
            C21030OooOO0o.OooO0OO(importBatchPdfDialogFragment).OooOOo0();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends AbstractC20413OooOo0O {
        public OooO0O0() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = ImportBatchPdfDialogFragment.this;
            File file = (File) importBatchPdfDialogFragment.OooOooo().f107901OooO0oO.getValue();
            if (OooOOO0.OooO0O0(file.getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath())) {
                C21030OooOO0o.OooO0OO(importBatchPdfDialogFragment).OooOOo0();
                return;
            }
            String parent = file.getParent();
            if (parent != null) {
                importBatchPdfDialogFragment.OooOooo().OooO0o0(parent);
            }
        }
    }

    public static final class OooO0OO implements SearchView.OooOOO0 {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo = ImportBatchPdfDialogFragment.this.OooOooo();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = oooOOO0OooOooo.f107903OooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = oooOOO0OooOooo.f107897OooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$onViewCreated$9", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23689OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77849OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$onViewCreated$9$1", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {189}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportBatchPdfDialogFragment f77850OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77851OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19417OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportBatchPdfDialogFragment f77852OooOo0o;

                public C19417OooO00o(ImportBatchPdfDialogFragment importBatchPdfDialogFragment) {
                    this.f77852OooOo0o = importBatchPdfDialogFragment;
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
                    ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f77852OooOo0o;
                    TextView textView = importBatchPdfDialogFragment.f77838Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    C30266OooO00o c30266OooO00o = importBatchPdfDialogFragment.f77839Oooo0O0;
                    if (c30266OooO00o != null) {
                        c30266OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("fileNodeAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ImportBatchPdfDialogFragment importBatchPdfDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77850OooOo = importBatchPdfDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77850OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77851OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f77850OooOo;
                    o0o0O0O0.OooOOO0 oooOOO0OooOooo = importBatchPdfDialogFragment.OooOooo();
                    C19417OooO00o c19417OooO00o = new C19417OooO00o(importBatchPdfDialogFragment);
                    this.f77851OooOo0o = 1;
                    if (oooOOO0OooOooo.f107904OooOO0O.f121747OooOo0o.collect(c19417OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$onViewCreated$9$2", m80623f = "ImportBatchPdfDialogFragment.kt", m80624l = {196}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportBatchPdfDialogFragment f77853OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77854OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0Oo$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportBatchPdfDialogFragment f77855OooOo0o;

                public OooO00o(ImportBatchPdfDialogFragment importBatchPdfDialogFragment) {
                    this.f77855OooOo0o = importBatchPdfDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f77855OooOo0o;
                    if (iIntValue == 0) {
                        TextView textView = importBatchPdfDialogFragment.f77836Oooo000;
                        if (textView == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView.setText(importBatchPdfDialogFragment.getString(R.string.cancel));
                    } else if (iIntValue == 1) {
                        TextView textView2 = importBatchPdfDialogFragment.f77836Oooo000;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(importBatchPdfDialogFragment.getString(R.string.select_all));
                    } else if (iIntValue != 2) {
                        importBatchPdfDialogFragment.getClass();
                    } else {
                        TextView textView3 = importBatchPdfDialogFragment.f77836Oooo000;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView3.setText(importBatchPdfDialogFragment.getString(R.string.unselect_all));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ImportBatchPdfDialogFragment importBatchPdfDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77853OooOo = importBatchPdfDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77853OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77854OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f77853OooOo;
                    o0o0O0O0.OooOOO0 oooOOO0OooOooo = importBatchPdfDialogFragment.OooOooo();
                    OooO00o oooO00o = new OooO00o(importBatchPdfDialogFragment);
                    this.f77854OooOo0o = 1;
                    if (oooOOO0OooOooo.f107905OooOO0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public C23689OooO0Oo(Continuation<? super C23689OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23689OooO0Oo c23689OooO0Oo = ImportBatchPdfDialogFragment.this.new C23689OooO0Oo(continuation);
            c23689OooO0Oo.f77849OooOo0o = obj;
            return c23689OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23689OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77849OooOo0o;
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = ImportBatchPdfDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(importBatchPdfDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(importBatchPdfDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ImportBatchPdfDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23690OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23690OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            ImportBatchPdfDialogFragment importBatchPdfDialogFragment = ImportBatchPdfDialogFragment.this;
            Bundle arguments = importBatchPdfDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + importBatchPdfDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23691OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f77858OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23691OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f77858OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77858OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.pdf.ImportBatchPdfDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23692OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77859OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23692OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77859OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77859OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77860OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77860OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77860OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ImportBatchPdfDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ImportBatchPdfDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77833OooOooO = new C24568OooO0oO(oooo0.OooO0O0(o0o0O0O0.OooO0o.class), new C23690OooO0o0());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23691OooO0oO(new OooO0o()));
        this.f77834OooOooo = new C22026ooOO(oooo0.OooO0O0(o0o0O0O0.OooOOO0.class), new C23692OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0o0O0O0.OooO0O0
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ClipData clipData;
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                Intent intent = result.f62239OooOo;
                Uri data = intent != null ? intent.getData() : null;
                C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
                if (intent != null && (clipData = intent.getClipData()) != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        kotlin.jvm.internal.OooOOO0.OooO0o(uri, "getUri(...)");
                        c32465OooO0O0OooO0Oo.add(uri);
                    }
                }
                C32465OooO0O0 clipDataUris = OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                ImportBatchPdfDialogFragment importBatchPdfDialogFragment = this.f107865OooOo0o;
                OooO0OO oooO0OO = new OooO0OO(importBatchPdfDialogFragment, 0);
                kotlin.jvm.internal.OooOOO0.OooO0oO(clipDataUris, "clipDataUris");
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = OooOo.OooO0Oo();
                if (data != null) {
                    if (!((Boolean) oooO0OO.invoke(data)).booleanValue()) {
                        data = null;
                    }
                    if (data != null) {
                        c32465OooO0O0OooO0Oo2.add(data);
                    }
                }
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = clipDataUris.listIterator(0);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (!c20232OooO0O0.hasNext()) {
                        break;
                    }
                    Object next = c20232OooO0O0.next();
                    if (((Boolean) oooO0OO.invoke(next)).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c32465OooO0O0OooO0Oo2.add((Uri) it.next());
                }
                C32465OooO0O0 c32465OooO0O0OooO0O0 = OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ListIterator listIterator2 = c32465OooO0O0OooO0O0.listIterator(0);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O02 = (C32465OooO0O0.C20232OooO0O0) listIterator2;
                    if (!c20232OooO0O02.hasNext()) {
                        break;
                    }
                    Object next2 = c20232OooO0O02.next();
                    if (hashSet.add(((Uri) next2).normalizeScheme().toString())) {
                        arrayList2.add(next2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    InterfaceC21987OooOoo viewLifecycleOwner = importBatchPdfDialogFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, importBatchPdfDialogFragment.new OooO00o(arrayList2, null), 3);
                    return;
                }
                Context context = importBatchPdfDialogFragment.getContext();
                if (context != null) {
                    String string = importBatchPdfDialogFragment.getString(R.string.no_file_is_selected);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                if (importBatchPdfDialogFragment.f77840Oooo0OO) {
                    importBatchPdfDialogFragment.dismiss();
                }
            }
        });
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f77841Oooo0o0 = oooO0O0RegisterForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(ImportBatchPdfDialogFragment importBatchPdfDialogFragment, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30269OooO0o0 c30269OooO0o0;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30269OooO0o0) {
            c30269OooO0o0 = (C30269OooO0o0) abstractC32479OooO0OO;
            int i3 = c30269OooO0o0.f107878OooOoO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c30269OooO0o0.f107878OooOoO0 = i3 - Integer.MIN_VALUE;
            } else {
                c30269OooO0o0 = new C30269OooO0o0(importBatchPdfDialogFragment, abstractC32479OooO0OO);
            }
        }
        C30269OooO0o0 c30269OooO0o02 = c30269OooO0o0;
        Object objShowNonVipFeatureLimitedDialog$default = c30269OooO0o02.f107877OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c30269OooO0o02.f107878OooOoO0;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = importBatchPdfDialogFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30269OooO0o02.f107878OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, i2, null, c30269OooO0o02, 4, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public static List OooOooO(int i) {
        if (i == 0) {
            return OooOo.OooO0oO("application/pdf");
        }
        if (i == 1) {
            return C34429OooOOo0.OooOO0o("application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        }
        if (i == 2) {
            return C34429OooOOo0.OooOO0o("application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        }
        if (i == 3) {
            return OooOo.OooO0oO("application/epub+zip");
        }
        if (i == 4) {
            return C34429OooOOo0.OooOO0o("application/octet-stream", "application/caj");
        }
        if (i == 5) {
            return C34429OooOOo0.OooOO0o("application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        }
        throw new IllegalArgumentException("extensions is not valid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0o0O0O0.OooO0o OooOoo() {
        return (o0o0O0O0.OooO0o) this.f77833OooOooO.getValue();
    }

    public final o0o0O0O0.OooOOO0 OooOooo() {
        return (o0o0O0O0.OooOOO0) this.f77834OooOooo.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, new OooO0O0());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_batch_pdf_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77840Oooo0OO = contextRequireContext.getApplicationInfo().targetSdkVersion >= 30;
        this.f77837Oooo00O = (TextView) view.findViewById(R.id.title);
        int i = OooOoo().f107875OooO0Oo;
        if (i == 0) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo = OooOooo();
            List listOooO0oO = OooOo.OooO0oO("pdf");
            C33781o00o0O c33781o00o0O = oooOOO0OooOooo.f107902OooO0oo;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, listOooO0oO);
            TextView textView = this.f77837Oooo00O;
            if (textView == null) {
                OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView.setText(getString(R.string.fab_import_pdf));
        } else if (i == 1) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo2 = OooOooo();
            List listOooOO0o = C34429OooOOo0.OooOO0o("ppt", "pptx");
            C33781o00o0O c33781o00o0O2 = oooOOO0OooOooo2.f107902OooO0oo;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, listOooOO0o);
            TextView textView2 = this.f77837Oooo00O;
            if (textView2 == null) {
                OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView2.setText(getString(R.string.fab_import_ppt));
        } else if (i == 2) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo3 = OooOooo();
            List listOooOO0o2 = C34429OooOOo0.OooOO0o("doc", "docx");
            C33781o00o0O c33781o00o0O3 = oooOOO0OooOooo3.f107902OooO0oo;
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, listOooOO0o2);
            TextView textView3 = this.f77837Oooo00O;
            if (textView3 == null) {
                OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView3.setText(getString(R.string.fab_import_doc));
        } else if (i == 3) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo4 = OooOooo();
            List listOooO0oO2 = OooOo.OooO0oO("epub");
            C33781o00o0O c33781o00o0O4 = oooOOO0OooOooo4.f107902OooO0oo;
            c33781o00o0O4.getClass();
            c33781o00o0O4.OooOO0(null, listOooO0oO2);
            TextView textView4 = this.f77837Oooo00O;
            if (textView4 == null) {
                OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView4.setText(getString(R.string.fab_import_epub));
        } else if (i == 5) {
            o0o0O0O0.OooOOO0 oooOOO0OooOooo5 = OooOooo();
            List listOooOO0o3 = C34429OooOOo0.OooOO0o("xls", "xlsx");
            C33781o00o0O c33781o00o0O5 = oooOOO0OooOooo5.f107902OooO0oo;
            c33781o00o0O5.getClass();
            c33781o00o0O5.OooOO0(null, listOooOO0o3);
            TextView textView5 = this.f77837Oooo00O;
            if (textView5 == null) {
                OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView5.setText(getString(R.string.fab_import_excel));
        }
        o0o0O0O0.OooOOO0 oooOOO0OooOooo6 = OooOooo();
        Boolean boolValueOf = Boolean.valueOf(OooOoo().f107874OooO0OO == 0);
        C33781o00o0O c33781o00o0O6 = oooOOO0OooOooo6.f107900OooO0o0;
        c33781o00o0O6.getClass();
        c33781o00o0O6.OooOO0(null, boolValueOf);
        TextView textView6 = (TextView) view.findViewById(R.id.btn_cancel);
        this.f77836Oooo000 = textView6;
        if (textView6 == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView6.setOnClickListener(new ViewOnClickListenerC26059OooooOo(this, 4));
        TextView textView7 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f77838Oooo00o = textView7;
        if (textView7 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView7.setText(getString(R.string._import));
        TextView textView8 = this.f77838Oooo00o;
        if (textView8 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView8, 500L, new ViewOnClickListenerC28251OooOooo(this, 5));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_bread_crumbs);
        OooOOO0.OooO0Oo(viewGroup);
        viewGroup.setVisibility(8);
        C30266OooO00o c30266OooO00o = new C30266OooO00o(C30266OooO00o.C20060OooO00o.f107859OooO00o);
        this.f77839Oooo0O0 = c30266OooO00o;
        c30266OooO00o.f107858OooO0O0 = new Oooo000(this, 5);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C30266OooO00o c30266OooO00o2 = this.f77839Oooo0O0;
        if (c30266OooO00o2 == null) {
            OooOOO0.OooOOOO("fileNodeAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30266OooO00o2);
        recyclerView.setItemAnimator(null);
        SearchView searchView = (SearchView) view.findViewById(R.id.search_box);
        if (searchView == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        searchView.setOnQueryTextListener(new OooO0OO());
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.cl_file_manager);
        OooOOO0.OooO0Oo(viewGroup2);
        viewGroup2.setVisibility(OooOoo().f107874OooO0OO != 0 ? 8 : 0);
        TextView textView9 = (TextView) view.findViewById(R.id.tv_file_manager);
        this.f77835Oooo0 = textView9;
        if (textView9 == null) {
            OooOOO0.OooOOOO("btnFileManager");
            throw null;
        }
        textView9.setOnClickListener(new ViewOnClickListenerC29113OooOo0O(this, 3));
        OooOooo().OooO0o0("/storage");
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23689OooO0Oo(null), 3);
        if (this.f77840Oooo0OO) {
            view.setVisibility(4);
            TextView textView10 = this.f77835Oooo0;
            if (textView10 != null) {
                textView10.performClick();
            } else {
                OooOOO0.OooOOOO("btnFileManager");
                throw null;
            }
        }
    }
}

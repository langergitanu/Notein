package com.orion.notein.p607ui.export;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ShareCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.C23108OooO0o0;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.export.OooO0o;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26047OoooO00;
import o0O0oooO.C26320o0000OoO;
import o0OO00o0.o000Oo0;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.C28235OooOOO;
import o0Oo0o0o.C28237OooOOOO;
import o0Oo0o0o.C28242OooOo0;
import o0Oo0o0o.C28245OooOoO;
import o0Oo0o0o.C28246OooOoO0;
import o0Oo0o0o.C28262OoooO0;
import o0Oo0o0o.OooOo;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0Oo0o0o.ViewOnClickListenerC28232OooOO0;
import o0Oo0o0o.ViewOnClickListenerC28233OooOO0O;
import o0Oo0o0o.ViewOnClickListenerC28234OooOO0o;
import o0Oo0o0o.ViewOnClickListenerC28239OooOOo;
import o0Oo0o0o.ViewOnClickListenerC28241OooOOoo;
import o0Oo0o0o.ViewOnClickListenerC28243OooOo0O;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
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
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33764OoooOOo;
import oO0o0Oo.C33765OoooOo0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportBottomSheetFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ExportBottomSheetFragment extends Hilt_ExportBottomSheetFragment {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final OooO00o f71509OoooOoO = new OooO00o();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C32447OooOOo f71510OooOooO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Oo0o0o.OooOOO0
        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            Bundle bundleRequireArguments = this.f100077OooOo0o.requireArguments();
            kotlin.jvm.internal.OooOOO0.OooO0o(bundleRequireArguments, "requireArguments(...)");
            return C23108OooO0o0.OooO00o.OooO00o(bundleRequireArguments);
        }
    });

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32447OooOOo f71511OooOooo = C20519OooO0Oo.OooO0OO(new C28235OooOOO(this, 0));

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f71512Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f71513Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f71514Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f71515Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f71516Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f71517Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f71518Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f71519Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f71520Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f71521Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f71522Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f71523OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f71524OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f71525OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f71526OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f71527OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public C23110OooO0oo.OooO00o f71528OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ExportProgressDialogFragment f71529OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f71530OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f71531o000oOoO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$editWatermarkClickListener$1$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {164}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71533OooOo0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportBottomSheetFragment.this.new OooO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71533OooOo0o;
            ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f71533OooOo0o = 1;
                obj = ExportBottomSheetFragment.OooOoo0(exportBottomSheetFragment, this);
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
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC21987OooOoo viewLifecycleOwner = exportBottomSheetFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28246OooOoO0(exportBottomSheetFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO00o {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(Context context, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
            com.orion.notein.p607ui.export.OooO0OO oooO0OO;
            if (abstractC32479OooO0OO instanceof com.orion.notein.p607ui.export.OooO0OO) {
                oooO0OO = (com.orion.notein.p607ui.export.OooO0OO) abstractC32479OooO0OO;
                int i = oooO0OO.f71748OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0OO.f71748OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO0OO = new com.orion.notein.p607ui.export.OooO0OO(this, abstractC32479OooO0OO);
                }
            }
            Object objOooO0o = oooO0OO.f71747OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0OO.f71748OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                C23106OooO0Oo c23106OooO0Oo = new C23106OooO0Oo(context, list, null);
                oooO0OO.f71748OooOoO0 = 1;
                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c23106OooO0Oo, oooO0OO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
            return objOooO0o;
        }
    }

    public /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f71534OooO00o;

        static {
            int[] iArr = new int[C23110OooO0oo.OooO00o.values().length];
            try {
                C23110OooO0oo.OooO00o.C19210OooO00o c19210OooO00o = C23110OooO0oo.OooO00o.f71797OooOo0o;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71534OooO00o = iArr;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$1$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {173}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71536OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportBottomSheetFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71536OooOo0o;
            ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f71536OooOo0o = 1;
                obj = ExportBottomSheetFragment.OooOoo0(exportBottomSheetFragment, this);
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
                return C32460OooOooO.f116667OooO00o;
            }
            View view = exportBottomSheetFragment.f71523OoooO;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                throw null;
            }
            if (view.isActivated()) {
                exportBottomSheetFragment.Oooo000().OooO0o0(C23110OooO0oo.OooO00o.f71798OooOoO);
            } else {
                exportBottomSheetFragment.Oooo000().OooO0o0(OooO0O0.f71534OooO00o[exportBottomSheetFragment.f71528OoooOOO.ordinal()] == 1 ? C23110OooO0oo.OooO00o.f71800OooOoOO : C23110OooO0oo.OooO00o.f71799OooOoO0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17", m80623f = "ExportBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23081OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71538OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71539OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71540OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$1$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19201OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ int f71541OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f71542OooOo0o;

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(Integer num, Integer num2, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>> continuation) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    C19201OooO00o c19201OooO00o = new C19201OooO00o(3, continuation);
                    c19201OooO00o.f71542OooOo0o = iIntValue;
                    c19201OooO00o.f71541OooOo = iIntValue2;
                    return c19201OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32443OooOOO(new Integer(this.f71542OooOo0o), Boolean.valueOf(this.f71541OooOo == 0));
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO00o$OooO0O0 */
            public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71543OooOo0o;

                public OooO0O0(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71543OooOo0o = exportBottomSheetFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    ExportBottomSheetFragment exportBottomSheetFragment = this.f71543OooOo0o;
                    View view = exportBottomSheetFragment.f71517Oooo0O0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                        throw null;
                    }
                    view.setActivated(zBooleanValue);
                    View view2 = exportBottomSheetFragment.f71517Oooo0O0;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                        throw null;
                    }
                    view2.setAlpha(zBooleanValue ? 1.0f : 0.5f);
                    if (zBooleanValue || iIntValue != 0) {
                        ExportBottomSheetFragment.OooOoo(exportBottomSheetFragment, iIntValue);
                    } else {
                        exportBottomSheetFragment.OooOooo().OooOO0(1);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71539OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f71539OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71540OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ExportBottomSheetFragment exportBottomSheetFragment = this.f71539OooOo;
                    com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo = exportBottomSheetFragment.OooOooo();
                    com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo2 = exportBottomSheetFragment.OooOooo();
                    C19201OooO00o c19201OooO00o = new C19201OooO00o(3, null);
                    OooO0O0 oooO0O0 = new OooO0O0(exportBottomSheetFragment);
                    this.f71540OooOo0o = 1;
                    Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(c19201OooO00o, null), oooO0O0, new InterfaceC33721OooO0o[]{oooO0oOooOooo.f71766OooOOoo, oooO0oOooOooo2.f71770OooOo0O});
                    if (objOooO00o != obj2) {
                        objOooO00o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO00o == obj2) {
                        return obj2;
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

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$2", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71544OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71545OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71546OooOo0o;

                public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71546OooOo0o = exportBottomSheetFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ExportBottomSheetFragment.OooOoo(this.f71546OooOo0o, ((Number) obj).intValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f71544OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f71544OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71545OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71544OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo = exportBottomSheetFragment.OooOooo();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71545OooOo0o = 1;
                oooO0oOooOooo.f71766OooOOoo.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$3", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71547OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71548OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71549OooOo0o;

                public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71549OooOo0o = exportBottomSheetFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ExportBottomSheetFragment exportBottomSheetFragment = this.f71549OooOo0o;
                    View view = exportBottomSheetFragment.f71521Oooo0oO;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeTheme");
                        throw null;
                    }
                    view.setActivated((iIntValue & 1) != 0);
                    View view2 = exportBottomSheetFragment.f71522Oooo0oo;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
                        throw null;
                    }
                    view2.setActivated((iIntValue & 2) != 0);
                    View view3 = exportBottomSheetFragment.f71512Oooo;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagElements");
                        throw null;
                    }
                    view3.setActivated((iIntValue & 4) != 0);
                    View view4 = exportBottomSheetFragment.f71525OoooO00;
                    if (view4 != null) {
                        view4.setActivated((iIntValue & 16) != 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagePadding");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f71547OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f71547OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71548OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71547OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo = exportBottomSheetFragment.OooOooo();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71548OooOo0o = 1;
                oooO0oOooOooo.f71768OooOo0.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0Oo, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$4", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class C19202OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71550OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71551OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71552OooOo0o;

                public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71552OooOo0o = exportBottomSheetFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ((Number) obj).intValue();
                    ExportBottomSheetFragment exportBottomSheetFragment = this.f71552OooOo0o;
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = exportBottomSheetFragment.OooOooo().f71767OooOo;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        ExportProgressDialogFragment exportProgressDialogFragment = exportBottomSheetFragment.f71529OoooOOo;
                        if (exportProgressDialogFragment == null || !exportProgressDialogFragment.isAdded()) {
                            boolean z = exportBottomSheetFragment.OooOooO() instanceof ExportRequest.PageExport;
                            int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportBottomSheetFragment.OooOooO());
                            boolean z2 = (z || copyOnWriteArrayList.size() <= 1) && ((Number) exportBottomSheetFragment.OooOooo().f71766OooOOoo.getValue()).intValue() == 2;
                            ExportProgressDialogFragment exportProgressDialogFragment2 = new ExportProgressDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("no_progress", z2);
                            bundle.putInt("export_source", iOooO0O0);
                            exportProgressDialogFragment2.setArguments(bundle);
                            exportProgressDialogFragment2.show(exportBottomSheetFragment.getChildFragmentManager(), "ExportProgressDialogFragment");
                            exportBottomSheetFragment.f71529OoooOOo = exportProgressDialogFragment2;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19202OooO0Oo(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super C19202OooO0Oo> continuation) {
                super(2, continuation);
                this.f71550OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19202OooO0Oo(this.f71550OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19202OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71551OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71550OooOo;
                C33772OooooOo c33772OooooOo = exportBottomSheetFragment.OooOooo().f71751OooO;
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71551OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$6", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71553OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71554OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71555OooOo0o;

                public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71555OooOo0o = exportBottomSheetFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    View view = this.f71555OooOo0o.f71516Oooo00o;
                    if (view != null) {
                        view.setEnabled(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnConfirm");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f71553OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f71553OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71554OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71553OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo = exportBottomSheetFragment.OooOooo();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71554OooOo0o = 1;
                oooO0oOooOooo.f71762OooOOOO.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$17$5", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class C23082OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71556OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71557OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0Oo$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportBottomSheetFragment f71558OooOo0o;

                public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                    this.f71558OooOo0o = exportBottomSheetFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    OooO0o.OooO00o oooO00o = (OooO0o.OooO00o) obj;
                    ExportBottomSheetFragment exportBottomSheetFragment = this.f71558OooOo0o;
                    ExportProgressDialogFragment exportProgressDialogFragment = exportBottomSheetFragment.f71529OoooOOo;
                    if (exportProgressDialogFragment != null) {
                        exportProgressDialogFragment.dismissAllowingStateLoss();
                    }
                    exportBottomSheetFragment.f71529OoooOOo = null;
                    Context context = exportBottomSheetFragment.getContext();
                    if (context != null) {
                        Uri uriForFile = oooO00o.f71772OooO00o;
                        if (uriForFile == null || uriForFile == null) {
                            String string = exportBottomSheetFragment.getString(R.string.export_fail);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                            exportBottomSheetFragment.dismissAllowingStateLoss();
                        } else {
                            File file = oooO00o.f71773OooO0O0;
                            if (file != null) {
                                try {
                                    uriForFile = FileProvider.getUriForFile(context, C28036OooO0O0.OooO0O0(context), file);
                                } catch (Exception e) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("ExportBottomSheetFragment");
                                    c20358OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to get URI for file: ", file.getAbsolutePath()), new Object[0]);
                                }
                            }
                            new ShareCompat.IntentBuilder(context).setType(context.getContentResolver().getType(uriForFile)).setStream(uriForFile).setChooserTitle(exportBottomSheetFragment.getString(R.string.export_and_share)).startChooser();
                            exportBottomSheetFragment.dismissAllowingStateLoss();
                            exportBottomSheetFragment.dismissAllowingStateLoss();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23082OooO0o0(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super C23082OooO0o0> continuation) {
                super(2, continuation);
                this.f71556OooOo = exportBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23082OooO0o0(this.f71556OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23082OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71557OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71556OooOo;
                C33772OooooOo c33772OooooOo = exportBottomSheetFragment.OooOooo().f71758OooOO0O;
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71557OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public C23081OooO0Oo(Continuation<? super C23081OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23081OooO0Oo c23081OooO0Oo = ExportBottomSheetFragment.this.new C23081OooO0Oo(continuation);
            c23081OooO0Oo.f71538OooOo0o = obj;
            return c23081OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23081OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f71538OooOo0o;
            ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(exportBottomSheetFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(exportBottomSheetFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(exportBottomSheetFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19202OooO0Oo(exportBottomSheetFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23082OooO0o0(exportBottomSheetFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(exportBottomSheetFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$4", m80623f = "ExportBottomSheetFragment.kt", m80624l = {215}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71560OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71561OooOo0o;

            public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                this.f71561OooOo0o = exportBottomSheetFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                View view = this.f71561OooOo0o.f71523OoooO;
                if (view != null) {
                    view.setActivated(str != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                throw null;
            }
        }

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportBottomSheetFragment.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71560OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo000 = exportBottomSheetFragment.Oooo000();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71560OooOo0o = 1;
                if (oooO0O0Oooo000.f71706OooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$3", m80623f = "ExportBottomSheetFragment.kt", m80624l = {209}, m80625m = "invokeSuspend")
    public static final class C23083OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71563OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$3$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, String, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ String f71564OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f71565OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71566OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super OooO00o> continuation) {
                super(3, continuation);
                this.f71566OooOoO0 = exportBottomSheetFragment;
            }

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Integer num, String str, Continuation<? super String> continuation) {
                int iIntValue = num.intValue();
                OooO00o oooO00o = new OooO00o(this.f71566OooOoO0, continuation);
                oooO00o.f71565OooOo0o = iIntValue;
                oooO00o.f71564OooOo = str;
                return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f71565OooOo0o;
                String str = this.f71564OooOo;
                C23110OooO0oo.OooO00o.f71797OooOo0o.getClass();
                C23110OooO0oo.OooO00o OooO00o2 = C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i);
                C23110OooO0oo.OooO00o oooO00o = C23110OooO0oo.OooO00o.f71800OooOoOO;
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71566OooOoO0;
                if (OooO00o2 == oooO00o || OooO00o2 == C23110OooO0oo.OooO00o.f71799OooOoO0 || OooO00o2 == C23110OooO0oo.OooO00o.f71796OooOo) {
                    exportBottomSheetFragment.f71528OoooOOO = OooO00o2;
                }
                int iOrdinal = OooO00o2.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return exportBottomSheetFragment.getString(R.string.no_water_mark);
                    }
                    if (iOrdinal != 3) {
                        throw new C32442OooOO0o();
                    }
                }
                return str;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0o0$OooO0O0 */
        public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71567OooOo0o;

            public OooO0O0(ExportBottomSheetFragment exportBottomSheetFragment) {
                this.f71567OooOo0o = exportBottomSheetFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                TextView textView = this.f71567OooOo0o.f71527OoooOO0;
                if (textView != null) {
                    textView.setText(str);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                throw null;
            }
        }

        public C23083OooO0o0(Continuation<? super C23083OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportBottomSheetFragment.this.new C23083OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23083OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71563OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo000 = exportBottomSheetFragment.Oooo000();
                com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo0002 = exportBottomSheetFragment.Oooo000();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment, null);
                OooO0O0 oooO0O0 = new OooO0O0(exportBottomSheetFragment);
                this.f71563OooOo0o = 1;
                Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(oooO00o, null), oooO0O0, new InterfaceC33721OooO0o[]{oooO0O0Oooo000.f71710OooO0oO, oooO0O0Oooo0002.f71711OooO0oo});
                if (objOooO00o != obj2) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$5", m80623f = "ExportBottomSheetFragment.kt", m80624l = {221}, m80625m = "invokeSuspend")
    public static final class C23084OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71569OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportBottomSheetFragment f71570OooOo0o;

            public OooO00o(ExportBottomSheetFragment exportBottomSheetFragment) {
                this.f71570OooOo0o = exportBottomSheetFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ExportBottomSheetFragment exportBottomSheetFragment = this.f71570OooOo0o;
                exportBottomSheetFragment.f71531o000oOoO = zBooleanValue;
                Context context = exportBottomSheetFragment.getContext();
                if (context != null) {
                    int color = ContextCompat.getColor(context, zBooleanValue ? R.color.export_dialog_value_text_color : R.color.export_dialog_value_text_color_disabled);
                    TextView textView = exportBottomSheetFragment.f71527OoooOO0;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                        throw null;
                    }
                    textView.setTextColor(color);
                    TextView textView2 = exportBottomSheetFragment.f71527OoooOO0;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                        throw null;
                    }
                    TextViewCompat.setCompoundDrawableTintList(textView2, ColorStateList.valueOf(color));
                }
                float f = zBooleanValue ? 1.0f : 0.6f;
                View view = exportBottomSheetFragment.f71523OoooO;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                    throw null;
                }
                view.setAlpha(f);
                TextView textView3 = exportBottomSheetFragment.f71527OoooOO0;
                if (textView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                    throw null;
                }
                textView3.setAlpha(f);
                View view2 = exportBottomSheetFragment.f71526OoooO0O;
                if (view2 != null) {
                    view2.setAlpha(f);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                throw null;
            }
        }

        public C23084OooO0oO(Continuation<? super C23084OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportBottomSheetFragment.this.new C23084OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C23084OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71569OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo000 = exportBottomSheetFragment.Oooo000();
                OooO00o oooO00o = new OooO00o(exportBottomSheetFragment);
                this.f71569OooOo0o = 1;
                if (oooO0O0Oooo000.f71708OooO0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$onViewCreated$6", m80623f = "ExportBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23085OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ boolean f71572OooOo0o;

        public C23085OooO0oo(Continuation<? super C23085OooO0oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23085OooO0oo c23085OooO0oo = ExportBottomSheetFragment.this.new C23085OooO0oo(continuation);
            c23085OooO0oo.f71572OooOo0o = ((Boolean) obj).booleanValue();
            return c23085OooO0oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((C23085OooO0oo) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f71572OooOo0o;
            ExportBottomSheetFragment exportBottomSheetFragment = ExportBottomSheetFragment.this;
            if (z) {
                View view = exportBottomSheetFragment.f71526OoooO0O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                    throw null;
                }
                view.setVisibility(0);
            } else {
                View view2 = exportBottomSheetFragment.f71526OoooO0O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                    throw null;
                }
                view2.setVisibility(8);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23086OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23086OooOO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ExportBottomSheetFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23087OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23087OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ExportBottomSheetFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23088OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71580OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23088OooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71580OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71580OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23089OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23087OooOOOo f71581OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23089OooOOo0(C23087OooOOOo c23087OooOOOo) {
            super(0);
            this.f71581OooOo0o = c23087OooOOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71581OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportBottomSheetFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23090OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71582OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23090OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71582OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71582OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71583OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71583OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71583OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ExportBottomSheetFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ExportBottomSheetFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23089OooOOo0(new C23087OooOOOo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f71514Oooo000 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.export.OooO0o.class), new C23088OooOOo(interfaceC32440OooOO0OooO0O0), new OooOo00(interfaceC32440OooOO0OooO0O0), new C23090OooOOoo(interfaceC32440OooOO0OooO0O0));
        this.f71515Oooo00O = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.export.OooO0O0.class), new OooOO0(), new C23086OooOO0o(), new OooOO0O());
        new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooOOO0(), new OooOOOO(), new OooOOO());
        this.f71528OoooOOO = C23110OooO0oo.OooO00o.f71799OooOoO0;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new C28237OooOOOO(this));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f71530OoooOo0 = oooO0O0RegisterForActivityResult;
    }

    public static final void OooOoo(ExportBottomSheetFragment exportBottomSheetFragment, int i) {
        boolean z = true;
        boolean z2 = i == 0;
        boolean z3 = i == 1;
        boolean z4 = i == 3;
        boolean z5 = i == 2;
        View view = exportBottomSheetFragment.f71517Oooo0O0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
            throw null;
        }
        view.setSelected(z2);
        View view2 = exportBottomSheetFragment.f71518Oooo0OO;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("immutablePdfTypeView");
            throw null;
        }
        view2.setSelected(z3);
        View view3 = exportBottomSheetFragment.f71520Oooo0o0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageTypeView");
            throw null;
        }
        view3.setSelected(z4);
        View view4 = exportBottomSheetFragment.f71519Oooo0o;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteinTypeView");
            throw null;
        }
        view4.setSelected(z5);
        Context context = exportBottomSheetFragment.getContext();
        if (context == null) {
            return;
        }
        TextView textView = exportBottomSheetFragment.f71524OoooO0;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("txtIncludeOutlineAndComment");
            throw null;
        }
        textView.setText(z2 ? exportBottomSheetFragment.getString(R.string.export_flag_include_outline) : exportBottomSheetFragment.getString(R.string.export_flag_include_outline_and_comment));
        if (!z3 && !z4) {
            z = false;
        }
        View view5 = exportBottomSheetFragment.f71522Oooo0oo;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
            throw null;
        }
        view5.setEnabled(!z);
        TextView textView2 = exportBottomSheetFragment.f71524OoooO0;
        if (textView2 != null) {
            textView2.setTextColor(z ? context.getColor(R.color.item_text_description_color) : context.getColor(R.color.item_text_name_color));
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("txtIncludeOutlineAndComment");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(ExportBottomSheetFragment exportBottomSheetFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo oooOo;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f100088OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f100088OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(exportBottomSheetFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooo00O = oooOo.f100087OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f100088OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo00O);
            if (exportBottomSheetFragment.f71531o000oOoO) {
                return Boolean.TRUE;
            }
            oooOo.f100088OooOoO0 = 1;
            objOooo00O = exportBottomSheetFragment.Oooo00O(15, oooOo);
            if (objOooo00O == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooo00O);
        }
        return Boolean.valueOf(!((Boolean) objOooo00O).booleanValue());
    }

    public final ExportRequest OooOooO() {
        return (ExportRequest) this.f71511OooOooo.getValue();
    }

    public final com.orion.notein.p607ui.export.OooO0o OooOooo() {
        return (com.orion.notein.p607ui.export.OooO0o) this.f71514Oooo000.getValue();
    }

    public final com.orion.notein.p607ui.export.OooO0O0 Oooo000() {
        return (com.orion.notein.p607ui.export.OooO0O0) this.f71515Oooo00O.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00O(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28245OooOoO c28245OooOoO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C28245OooOoO) {
            c28245OooOoO = (C28245OooOoO) abstractC32479OooO0OO;
            int i2 = c28245OooOoO.f100099OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28245OooOoO.f100099OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c28245OooOoO = new C28245OooOoO(this, abstractC32479OooO0OO);
            }
        }
        C28245OooOoO c28245OooOoO2 = c28245OooOoO;
        Object objShowNonVipFeatureLimitedDialog$default = c28245OooOoO2.f100098OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28245OooOoO2.f100099OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c28245OooOoO2.f100099OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28245OooOoO2, 6, null);
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.export_bottom_sheet_host, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ExportProgressDialogFragment exportProgressDialogFragment = this.f71529OoooOOo;
        if (exportProgressDialogFragment != null) {
            exportProgressDialogFragment.dismissAllowingStateLoss();
        }
        this.f71529OoooOOo = null;
        super.onDestroyView();
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        final View viewFindViewById;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        viewFindViewById.setLayoutParams(marginLayoutParams);
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o0Oo0o0o.OooOOOo
                @Override // java.lang.Runnable
                public final void run() {
                    Object parent = viewFindViewById.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 == null) {
                        return;
                    }
                    view2.setBackgroundColor(0);
                }
            });
        }
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 1;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f71526OoooO0O = view.findViewById(R.id.ll_add_water_mark);
        this.f71523OoooO = view.findViewById(R.id.btn_add_water_mark);
        this.f71527OoooOO0 = (TextView) view.findViewById(R.id.tv_val_add_water_mark);
        int i2 = 0;
        ViewOnClickListenerC28223OooO viewOnClickListenerC28223OooO = new ViewOnClickListenerC28223OooO(this, i2);
        View view2 = this.f71526OoooO0O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
            throw null;
        }
        view2.setOnClickListener(viewOnClickListenerC28223OooO);
        TextView textView = this.f71527OoooOO0;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
            throw null;
        }
        textView.setOnClickListener(viewOnClickListenerC28223OooO);
        View view3 = this.f71523OoooO;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
            throw null;
        }
        view3.setOnClickListener(new o0Oo0o0o.OooOo00(this, i2));
        getChildFragmentManager().Oooooo0("key_result_for_text", getViewLifecycleOwner(), new C28242OooOo0(this, i2));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23083OooO0o0(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0o(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C23084OooO0oO(null), 3);
        com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo = OooOooo();
        C25252OooO0Oo.OooOo0o(new o000Oo0(oooO0oOooOooo.f71763OooOOOo, new C23085OooO0oo(null), 1), C21989OooOooO.OooO00o(this));
        com.orion.notein.p607ui.export.OooO0o oooO0oOooOooo2 = OooOooo();
        String idListTempFile = OooOooO().getF71680OooOo0o();
        kotlin.jvm.internal.OooOOO0.OooO0oO(idListTempFile, "idListTempFile");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0oOooOooo2);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28262OoooO0(oooO0oOooOooo2, idListTempFile, null), 2);
        OooOooo().OooO(C33599OooOo0O.Oooooo0(OooOooO().getF71681OooOoO0()).toString());
        View viewFindViewById = view.findViewById(R.id.export_type_pdf);
        this.f71517Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28243OooOo0O(this, i2));
        View viewFindViewById2 = view.findViewById(R.id.export_type_immutable_pdf);
        this.f71518Oooo0OO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("immutablePdfTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28244OooOo0o(this, i2));
        View viewFindViewById3 = view.findViewById(R.id.export_type_image);
        this.f71520Oooo0o0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC26036Oooo(this, i));
        View viewFindViewById4 = view.findViewById(R.id.export_type_notein);
        this.f71519Oooo0o = viewFindViewById4;
        if (viewFindViewById4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteinTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC26047OoooO00(this, 1));
        this.f71524OoooO0 = (TextView) view.findViewById(R.id.tv_include_outline_and_comment);
        View viewFindViewById5 = view.findViewById(R.id.btn_include_paper_theme);
        this.f71521Oooo0oO = viewFindViewById5;
        if (viewFindViewById5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeTheme");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC28232OooOO0(this, i2));
        View viewFindViewById6 = view.findViewById(R.id.btn_include_outline_and_comment);
        this.f71522Oooo0oo = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC28233OooOO0O(this, 0));
        View viewFindViewById7 = view.findViewById(R.id.btn_include_page_elements);
        this.f71512Oooo = viewFindViewById7;
        if (viewFindViewById7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagElements");
            throw null;
        }
        viewFindViewById7.setOnClickListener(new ViewOnClickListenerC28234OooOO0o(this, 0));
        View viewFindViewById8 = view.findViewById(R.id.btn_include_page_padding);
        this.f71525OoooO00 = viewFindViewById8;
        if (viewFindViewById8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagePadding");
            throw null;
        }
        viewFindViewById8.setOnClickListener(new ViewOnClickListenerC28239OooOOo(this, 0));
        View viewFindViewById9 = view.findViewById(R.id.btn_confirm);
        this.f71516Oooo00o = viewFindViewById9;
        if (viewFindViewById9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById9.setOnClickListener(new ViewOnClickListenerC28241OooOOoo(this, i2));
        View viewFindViewById10 = view.findViewById(R.id.btn_cancel);
        this.f71513Oooo0 = viewFindViewById10;
        if (viewFindViewById10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById10.setOnClickListener(new o0O0oooO.o0OoOo0(this, i));
        InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C23081OooO0Oo(null), 3);
    }
}

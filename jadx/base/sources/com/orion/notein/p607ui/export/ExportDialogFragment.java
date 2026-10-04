package com.orion.notein.p607ui.export;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
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
import com.aspose.slides.C22201OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.C23108OooO0o0;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.export.OooO0o;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26049OoooOO0;
import o0O0o0oO.ViewOnClickListenerC26050OoooOOO;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0O0o0oO.ViewOnClickListenerC26052OoooOo0;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0O0o0oO.ViewOnClickListenerC26058OooooOO;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.o0Oo0oo;
import o0OO00o0.o000Oo0;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.C28249OooOoo0;
import o0Oo0o0o.C28254Oooo00o;
import o0Oo0o0o.C28255Oooo0O0;
import o0Oo0o0o.C28262OoooO0;
import o0Oo0o0o.Oooo0;
import o0Oo0o0o.Oooo000;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0Oo0o0o.ViewOnClickListenerC28253Oooo00O;
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
import oO0OOooo.C33163OooO0oO;
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
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ExportDialogFragment extends Hilt_ExportDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f71585Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C22026ooOO f71586Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C32447OooOOo f71587Oooo000 = C20519OooO0Oo.OooO0OO(new C28249OooOoo0(this, 0));

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32447OooOOo f71588Oooo00O = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Oo0o0o.OooOoo
        @Override // oO0O000o.OooO00o
        public final Object invoke() {
            return ((C23108OooO0o0) this.f100102OooOo0o.f71587Oooo000.getValue()).f71779OooO00o;
        }
    });

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f71589Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f71590Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f71591Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f71592Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f71593Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f71594Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f71595Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f71596OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f71597OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f71598OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f71599OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f71600OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f71601OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f71602OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public C23110OooO0oo.OooO00o f71603OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ExportProgressDialogFragment f71604OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f71605OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f71606o000oOoO;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ExportDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f71608OooO00o;

        static {
            int[] iArr = new int[C23110OooO0oo.OooO00o.values().length];
            try {
                C23110OooO0oo.OooO00o.C19210OooO00o c19210OooO00o = C23110OooO0oo.OooO00o.f71797OooOo0o;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71608OooO00o = iArr;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$1$1", m80623f = "ExportDialogFragment.kt", m80624l = {131}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71610OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportDialogFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71610OooOo0o;
            ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f71610OooOo0o = 1;
                obj = ExportDialogFragment.Oooo00o(exportDialogFragment, this);
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
            View view = exportDialogFragment.f71606o000oOoO;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                throw null;
            }
            if (view.isActivated()) {
                exportDialogFragment.Oooo0o0().OooO0o0(C23110OooO0oo.OooO00o.f71798OooOoO);
            } else {
                exportDialogFragment.Oooo0o0().OooO0o0(OooO00o.f71608OooO00o[exportDialogFragment.f71603OoooOo0.ordinal()] == 1 ? C23110OooO0oo.OooO00o.f71800OooOoOO : C23110OooO0oo.OooO00o.f71799OooOoO0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17", m80623f = "ExportDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71612OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$1", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71613OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71614OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$1$1", m80623f = "ExportDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19203OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ int f71615OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f71616OooOo0o;

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(Integer num, Integer num2, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>> continuation) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    C19203OooO00o c19203OooO00o = new C19203OooO00o(3, continuation);
                    c19203OooO00o.f71616OooOo0o = iIntValue;
                    c19203OooO00o.f71615OooOo = iIntValue2;
                    return c19203OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32443OooOOO(new Integer(this.f71616OooOo0o), Boolean.valueOf(this.f71615OooOo == 0));
                }
            }

            public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71617OooOo0o;

                public OooO0O0(ExportDialogFragment exportDialogFragment) {
                    this.f71617OooOo0o = exportDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    ExportDialogFragment exportDialogFragment = this.f71617OooOo0o;
                    View view = exportDialogFragment.f71593Oooo0o0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                        throw null;
                    }
                    view.setActivated(zBooleanValue);
                    View view2 = exportDialogFragment.f71593Oooo0o0;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
                        throw null;
                    }
                    view2.setAlpha(zBooleanValue ? 1.0f : 0.5f);
                    if (zBooleanValue || iIntValue != 0) {
                        ExportDialogFragment.Oooo0(exportDialogFragment, iIntValue);
                    } else {
                        exportDialogFragment.Oooo0OO().OooOO0(1);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ExportDialogFragment exportDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71613OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f71613OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71614OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ExportDialogFragment exportDialogFragment = this.f71613OooOo;
                    com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO = exportDialogFragment.Oooo0OO();
                    com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO2 = exportDialogFragment.Oooo0OO();
                    C19203OooO00o c19203OooO00o = new C19203OooO00o(3, null);
                    OooO0O0 oooO0O0 = new OooO0O0(exportDialogFragment);
                    this.f71614OooOo0o = 1;
                    Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(c19203OooO00o, null), oooO0O0, new InterfaceC33721OooO0o[]{oooO0oOooo0OO.f71766OooOOoo, oooO0oOooo0OO2.f71770OooOo0O});
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$2", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71618OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71619OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71620OooOo0o;

                public OooO00o(ExportDialogFragment exportDialogFragment) {
                    this.f71620OooOo0o = exportDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ExportDialogFragment.Oooo0(this.f71620OooOo0o, ((Number) obj).intValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ExportDialogFragment exportDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f71618OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f71618OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71619OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = this.f71618OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO = exportDialogFragment.Oooo0OO();
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71619OooOo0o = 1;
                oooO0oOooo0OO.f71766OooOOoo.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0OO$OooO0OO, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$3", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class C19204OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71621OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71622OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0OO$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71623OooOo0o;

                public OooO00o(ExportDialogFragment exportDialogFragment) {
                    this.f71623OooOo0o = exportDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ExportDialogFragment exportDialogFragment = this.f71623OooOo0o;
                    View view = exportDialogFragment.f71585Oooo;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeTheme");
                        throw null;
                    }
                    view.setActivated((iIntValue & 1) != 0);
                    View view2 = exportDialogFragment.f71598OoooO00;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
                        throw null;
                    }
                    view2.setActivated((iIntValue & 2) != 0);
                    View view3 = exportDialogFragment.f71597OoooO0;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagElements");
                        throw null;
                    }
                    view3.setActivated((iIntValue & 4) != 0);
                    View view4 = exportDialogFragment.f71599OoooO0O;
                    if (view4 != null) {
                        view4.setActivated((iIntValue & 16) != 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagePadding");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19204OooO0OO(ExportDialogFragment exportDialogFragment, Continuation<? super C19204OooO0OO> continuation) {
                super(2, continuation);
                this.f71621OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19204OooO0OO(this.f71621OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19204OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71622OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = this.f71621OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO = exportDialogFragment.Oooo0OO();
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71622OooOo0o = 1;
                oooO0oOooo0OO.f71768OooOo0.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$4", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71624OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71625OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71626OooOo0o;

                public OooO00o(ExportDialogFragment exportDialogFragment) {
                    this.f71626OooOo0o = exportDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ((Number) obj).intValue();
                    ExportDialogFragment exportDialogFragment = this.f71626OooOo0o;
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = exportDialogFragment.Oooo0OO().f71767OooOo;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        ExportProgressDialogFragment exportProgressDialogFragment = exportDialogFragment.f71604OoooOoO;
                        if (exportProgressDialogFragment == null || !exportProgressDialogFragment.isAdded()) {
                            boolean z = exportDialogFragment.Oooo0O0() instanceof ExportRequest.PageExport;
                            int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportDialogFragment.Oooo0O0());
                            boolean z2 = (z || copyOnWriteArrayList.size() <= 1) && ((Number) exportDialogFragment.Oooo0OO().f71766OooOOoo.getValue()).intValue() == 2;
                            ExportProgressDialogFragment exportProgressDialogFragment2 = new ExportProgressDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("no_progress", z2);
                            bundle.putInt("export_source", iOooO0O0);
                            exportProgressDialogFragment2.setArguments(bundle);
                            exportProgressDialogFragment2.show(exportDialogFragment.getChildFragmentManager(), "ExportProgressDialogFragment");
                            exportDialogFragment.f71604OoooOoO = exportProgressDialogFragment2;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0Oo(ExportDialogFragment exportDialogFragment, Continuation<? super OooO0Oo> continuation) {
                super(2, continuation);
                this.f71624OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0Oo(this.f71624OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71625OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = this.f71624OooOo;
                C33772OooooOo c33772OooooOo = exportDialogFragment.Oooo0OO().f71751OooO;
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71625OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$6", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71627OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71628OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71629OooOo0o;

                public OooO00o(ExportDialogFragment exportDialogFragment) {
                    this.f71629OooOo0o = exportDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    View view = this.f71629OooOo0o.f71590Oooo0O0;
                    if (view != null) {
                        view.setEnabled(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnConfirm");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(ExportDialogFragment exportDialogFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f71627OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f71627OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71628OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = this.f71627OooOo;
                com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO = exportDialogFragment.Oooo0OO();
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71628OooOo0o = 1;
                oooO0oOooo0OO.f71762OooOOOO.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0OO$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$17$5", m80623f = "ExportDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class C23091OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71630OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71631OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0OO$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ExportDialogFragment f71632OooOo0o;

                public OooO00o(ExportDialogFragment exportDialogFragment) {
                    this.f71632OooOo0o = exportDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    OooO0o.OooO00o oooO00o = (OooO0o.OooO00o) obj;
                    ExportDialogFragment exportDialogFragment = this.f71632OooOo0o;
                    ExportProgressDialogFragment exportProgressDialogFragment = exportDialogFragment.f71604OoooOoO;
                    if (exportProgressDialogFragment != null) {
                        exportProgressDialogFragment.dismissAllowingStateLoss();
                    }
                    exportDialogFragment.f71604OoooOoO = null;
                    Context context = exportDialogFragment.getContext();
                    if (context != null) {
                        Uri uriForFile = oooO00o.f71772OooO00o;
                        if (uriForFile == null || uriForFile == null) {
                            String string = exportDialogFragment.getString(R.string.export_fail);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                            exportDialogFragment.dismissAllowingStateLoss();
                        } else {
                            File file = oooO00o.f71773OooO0O0;
                            if (file != null) {
                                try {
                                    uriForFile = FileProvider.getUriForFile(context, C28036OooO0O0.OooO0O0(context), file);
                                } catch (Exception e) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("ExportDialogFragment");
                                    c20358OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to get URI for file: ", file.getAbsolutePath()), new Object[0]);
                                }
                            }
                            new ShareCompat.IntentBuilder(context).setType(context.getContentResolver().getType(uriForFile)).setStream(uriForFile).setChooserTitle(exportDialogFragment.getString(R.string.export_and_share)).startChooser();
                            exportDialogFragment.dismissAllowingStateLoss();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23091OooO0o0(ExportDialogFragment exportDialogFragment, Continuation<? super C23091OooO0o0> continuation) {
                super(2, continuation);
                this.f71630OooOo = exportDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23091OooO0o0(this.f71630OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23091OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71631OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = this.f71630OooOo;
                C33772OooooOo c33772OooooOo = exportDialogFragment.Oooo0OO().f71758OooOO0O;
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71631OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = ExportDialogFragment.this.new OooO0OO(continuation);
            oooO0OO.f71612OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f71612OooOo0o;
            ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(exportDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(exportDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19204OooO0OO(exportDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0Oo(exportDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23091OooO0o0(exportDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(exportDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$3", m80623f = "ExportDialogFragment.kt", m80624l = {167}, m80625m = "invokeSuspend")
    public static final class C23092OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71634OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$3$1", m80623f = "ExportDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, String, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ String f71635OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f71636OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71637OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ExportDialogFragment exportDialogFragment, Continuation<? super OooO00o> continuation) {
                super(3, continuation);
                this.f71637OooOoO0 = exportDialogFragment;
            }

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Integer num, String str, Continuation<? super String> continuation) {
                int iIntValue = num.intValue();
                OooO00o oooO00o = new OooO00o(this.f71637OooOoO0, continuation);
                oooO00o.f71636OooOo0o = iIntValue;
                oooO00o.f71635OooOo = str;
                return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f71636OooOo0o;
                String str = this.f71635OooOo;
                C23110OooO0oo.OooO00o.f71797OooOo0o.getClass();
                C23110OooO0oo.OooO00o OooO00o2 = C23110OooO0oo.OooO00o.C19210OooO00o.OooO00o(i);
                C23110OooO0oo.OooO00o oooO00o = C23110OooO0oo.OooO00o.f71800OooOoOO;
                ExportDialogFragment exportDialogFragment = this.f71637OooOoO0;
                if (OooO00o2 == oooO00o || OooO00o2 == C23110OooO0oo.OooO00o.f71799OooOoO0 || OooO00o2 == C23110OooO0oo.OooO00o.f71796OooOo) {
                    exportDialogFragment.f71603OoooOo0 = OooO00o2;
                }
                int iOrdinal = OooO00o2.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return exportDialogFragment.getString(R.string.no_water_mark);
                    }
                    if (iOrdinal != 3) {
                        throw new C32442OooOO0o();
                    }
                }
                return str;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0Oo$OooO0O0 */
        public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71638OooOo0o;

            public OooO0O0(ExportDialogFragment exportDialogFragment) {
                this.f71638OooOo0o = exportDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                TextView textView = this.f71638OooOo0o.f71601OoooOOO;
                if (textView != null) {
                    textView.setText(str);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                throw null;
            }
        }

        public C23092OooO0Oo(Continuation<? super C23092OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportDialogFragment.this.new C23092OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23092OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71634OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 Oooo0o02 = exportDialogFragment.Oooo0o0();
                com.orion.notein.p607ui.export.OooO0O0 Oooo0o03 = exportDialogFragment.Oooo0o0();
                OooO00o oooO00o = new OooO00o(exportDialogFragment, null);
                OooO0O0 oooO0O0 = new OooO0O0(exportDialogFragment);
                this.f71634OooOo0o = 1;
                Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(oooO00o, null), oooO0O0, new InterfaceC33721OooO0o[]{Oooo0o02.f71710OooO0oO, Oooo0o03.f71711OooO0oo});
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$5", m80623f = "ExportDialogFragment.kt", m80624l = {179}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71640OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71641OooOo0o;

            public OooO00o(ExportDialogFragment exportDialogFragment) {
                this.f71641OooOo0o = exportDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ExportDialogFragment exportDialogFragment = this.f71641OooOo0o;
                exportDialogFragment.f71602OoooOOo = zBooleanValue;
                Context context = exportDialogFragment.getContext();
                if (context != null) {
                    int color = ContextCompat.getColor(context, zBooleanValue ? R.color.export_dialog_value_text_color : R.color.export_dialog_value_text_color_disabled);
                    TextView textView = exportDialogFragment.f71601OoooOOO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                        throw null;
                    }
                    textView.setTextColor(color);
                    TextView textView2 = exportDialogFragment.f71601OoooOOO;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                        throw null;
                    }
                    TextViewCompat.setCompoundDrawableTintList(textView2, ColorStateList.valueOf(color));
                }
                float f = zBooleanValue ? 1.0f : 0.6f;
                View view = exportDialogFragment.f71606o000oOoO;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                    throw null;
                }
                view.setAlpha(f);
                TextView textView3 = exportDialogFragment.f71601OoooOOO;
                if (textView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
                    throw null;
                }
                textView3.setAlpha(f);
                View view2 = exportDialogFragment.f71600OoooOO0;
                if (view2 != null) {
                    view2.setAlpha(f);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                throw null;
            }
        }

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportDialogFragment.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71640OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 Oooo0o02 = exportDialogFragment.Oooo0o0();
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71640OooOo0o = 1;
                if (Oooo0o02.f71708OooO0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$4", m80623f = "ExportDialogFragment.kt", m80624l = {173}, m80625m = "invokeSuspend")
    public static final class C23093OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71643OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportDialogFragment f71644OooOo0o;

            public OooO00o(ExportDialogFragment exportDialogFragment) {
                this.f71644OooOo0o = exportDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                View view = this.f71644OooOo0o.f71606o000oOoO;
                if (view != null) {
                    view.setActivated(str != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
                throw null;
            }
        }

        public C23093OooO0o0(Continuation<? super C23093OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportDialogFragment.this.new C23093OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C23093OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71643OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
                com.orion.notein.p607ui.export.OooO0O0 Oooo0o02 = exportDialogFragment.Oooo0o0();
                OooO00o oooO00o = new OooO00o(exportDialogFragment);
                this.f71643OooOo0o = 1;
                if (Oooo0o02.f71706OooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$6", m80623f = "ExportDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23094OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ boolean f71646OooOo0o;

        public C23094OooO0oO(Continuation<? super C23094OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23094OooO0oO c23094OooO0oO = ExportDialogFragment.this.new C23094OooO0oO(continuation);
            c23094OooO0oO.f71646OooOo0o = ((Boolean) obj).booleanValue();
            return c23094OooO0oO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((C23094OooO0oO) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f71646OooOo0o;
            ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
            if (z) {
                View view = exportDialogFragment.f71600OoooOO0;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                    throw null;
                }
                view.setVisibility(0);
            } else {
                View view2 = exportDialogFragment.f71600OoooOO0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
                    throw null;
                }
                view2.setVisibility(8);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportDialogFragment$onViewCreated$editWatermarkClickListener$1$1", m80623f = "ExportDialogFragment.kt", m80624l = {122}, m80625m = "invokeSuspend")
    public static final class C23095OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71648OooOo0o;

        public C23095OooO0oo(Continuation<? super C23095OooO0oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportDialogFragment.this.new C23095OooO0oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23095OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71648OooOo0o;
            ExportDialogFragment exportDialogFragment = ExportDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f71648OooOo0o = 1;
                obj = ExportDialogFragment.Oooo00o(exportDialogFragment, this);
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
            InterfaceC21987OooOoo viewLifecycleOwner = exportDialogFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new Oooo0(exportDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ExportDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ExportDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23096OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23096OooOO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ExportDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ExportDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ExportDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ExportDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23097OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f71655OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23097OooOOOo(OooOOOO oooOOOO) {
            super(0);
            this.f71655OooOo0o = oooOOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71655OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23098OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71656OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23098OooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71656OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71656OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23099OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71657OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23099OooOOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71657OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71657OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportDialogFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23100OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71658OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23100OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71658OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71658OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ExportDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ExportDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23097OooOOOo(new OooOOOO()));
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f71589Oooo00o = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.export.OooO0o.class), new C23099OooOOo0(interfaceC32440OooOO0OooO0O0), new C23100OooOOoo(interfaceC32440OooOO0OooO0O0), new C23098OooOOo(interfaceC32440OooOO0OooO0O0));
        this.f71586Oooo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.export.OooO0O0.class), new OooO(), new OooOO0O(), new OooOO0());
        new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23096OooOO0o(), new OooOOO(), new OooOOO0());
        this.f71603OoooOo0 = C23110OooO0oo.OooO00o.f71799OooOoO0;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0Oo0o0o.OooOooO
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
            @Override // OooO0o.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void OooO0O0(Object obj) throws IOException {
                String str;
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.f62240OooOo0o != -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ExportDialogFragment");
                    c20358OooO00o.OooO0o0("User cancelled file browsing", new Object[0]);
                    return;
                }
                ExportDialogFragment exportDialogFragment = this.f100105OooOo0o;
                Context context = exportDialogFragment.getContext();
                if (context == null) {
                    return;
                }
                String lastPathSegment = null;
                Intent intent = result.f62239OooOo;
                Uri data = intent != null ? intent.getData() : null;
                if (data == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("ExportDialogFragment");
                    c20358OooO00o2.OooO0OO("File uri not found", new Object[0]);
                    return;
                }
                CopyOnWriteArrayList<String> copyOnWriteArrayList = exportDialogFragment.Oooo0OO().f71767OooOo;
                String scheme = data.getScheme();
                if (scheme == null) {
                    lastPathSegment = data.getLastPathSegment();
                } else {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != 3143036) {
                        if (iHashCode == 951530617 && scheme.equals(FirebaseAnalytics.Param.CONTENT)) {
                            Cursor cursorQuery = context.getContentResolver().query(data, null, null, null, null);
                            if (cursorQuery != null) {
                                Cursor cursor = cursorQuery;
                                try {
                                    Cursor cursor2 = cursor;
                                    int columnIndex = cursor2.getColumnIndex("_display_name");
                                    if (cursor2.moveToFirst() && columnIndex != -1) {
                                        lastPathSegment = cursor2.getString(columnIndex);
                                    }
                                    cursor.close();
                                } finally {
                                }
                            }
                        }
                    } else if (scheme.equals("file")) {
                        String path = data.getPath();
                        if (path != null) {
                            lastPathSegment = new File(path).getName();
                        }
                    }
                }
                if (lastPathSegment == null) {
                    lastPathSegment = "unnamed";
                }
                String strOooooOO = C33599OooOo0O.OooooOO(lastPathSegment, ".", lastPathSegment);
                String str2 = (String) exportDialogFragment.Oooo0o0().f71706OooO.f121747OooOo0o.getValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o3, "ExportDialogFragment", "ExportDialogFragment export, watermarkText: ", str2, "."), new Object[0]);
                int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportDialogFragment.Oooo0O0());
                ExportRequest exportRequestOooo0O0 = exportDialogFragment.Oooo0O0();
                if (exportRequestOooo0O0 instanceof ExportRequest.PageExport) {
                    str = ((ExportRequest.PageExport) exportRequestOooo0O0).f71679OooOo;
                } else {
                    if (!(exportRequestOooo0O0 instanceof ExportRequest.NoteExport)) {
                        throw new C32442OooOO0o();
                    }
                    str = "";
                }
                exportDialogFragment.Oooo0OO().OooO0oO((C33163OooO0oO) context, copyOnWriteArrayList, iOooO0O0, data, strOooooOO, str, str2);
            }
        });
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f71605OoooOoo = oooO0O0RegisterForActivityResult;
    }

    public static final void Oooo0(ExportDialogFragment exportDialogFragment, int i) {
        boolean z = true;
        boolean z2 = i == 0;
        boolean z3 = i == 1;
        boolean z4 = i == 3;
        boolean z5 = i == 2;
        View view = exportDialogFragment.f71593Oooo0o0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
            throw null;
        }
        view.setSelected(z2);
        View view2 = exportDialogFragment.f71592Oooo0o;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("immutablePdfTypeView");
            throw null;
        }
        view2.setSelected(z3);
        View view3 = exportDialogFragment.f71594Oooo0oO;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageTypeView");
            throw null;
        }
        view3.setSelected(z4);
        View view4 = exportDialogFragment.f71595Oooo0oo;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteinTypeView");
            throw null;
        }
        view4.setSelected(z5);
        Context context = exportDialogFragment.getContext();
        if (context == null) {
            return;
        }
        TextView textView = exportDialogFragment.f71596OoooO;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("txtIncludeOutlineAndComment");
            throw null;
        }
        textView.setText(z2 ? exportDialogFragment.getString(R.string.export_flag_include_outline) : exportDialogFragment.getString(R.string.export_flag_include_outline_and_comment));
        if (!z3 && !z4) {
            z = false;
        }
        View view5 = exportDialogFragment.f71598OoooO00;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
            throw null;
        }
        view5.setEnabled(!z);
        TextView textView2 = exportDialogFragment.f71596OoooO;
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
    public static final Object Oooo00o(ExportDialogFragment exportDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28254Oooo00o c28254Oooo00o;
        if (abstractC32479OooO0OO instanceof C28254Oooo00o) {
            c28254Oooo00o = (C28254Oooo00o) abstractC32479OooO0OO;
            int i = c28254Oooo00o.f100119OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28254Oooo00o.f100119OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28254Oooo00o = new C28254Oooo00o(exportDialogFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooo0o = c28254Oooo00o.f100118OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28254Oooo00o.f100119OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0o);
            if (exportDialogFragment.f71602OoooOOo) {
                return Boolean.TRUE;
            }
            c28254Oooo00o.f100119OooOoO0 = 1;
            objOooo0o = exportDialogFragment.Oooo0o(15, c28254Oooo00o);
            if (objOooo0o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooo0o);
        }
        return Boolean.valueOf(!((Boolean) objOooo0o).booleanValue());
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.export_dialog_container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.export_dialog_host;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final boolean OooOoo0() {
        return false;
    }

    public final ExportRequest Oooo0O0() {
        return (ExportRequest) this.f71588Oooo00O.getValue();
    }

    public final com.orion.notein.p607ui.export.OooO0o Oooo0OO() {
        return (com.orion.notein.p607ui.export.OooO0o) this.f71589Oooo00o.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28255Oooo0O0 c28255Oooo0O0;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C28255Oooo0O0) {
            c28255Oooo0O0 = (C28255Oooo0O0) abstractC32479OooO0OO;
            int i2 = c28255Oooo0O0.f100122OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28255Oooo0O0.f100122OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c28255Oooo0O0 = new C28255Oooo0O0(this, abstractC32479OooO0OO);
            }
        }
        C28255Oooo0O0 c28255Oooo0O02 = c28255Oooo0O0;
        Object objShowNonVipFeatureLimitedDialog$default = c28255Oooo0O02.f100121OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28255Oooo0O02.f100122OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c28255Oooo0O02.f100122OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28255Oooo0O02, 6, null);
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

    public final com.orion.notein.p607ui.export.OooO0O0 Oooo0o0() {
        return (com.orion.notein.p607ui.export.OooO0O0) this.f71586Oooo0.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ExportProgressDialogFragment exportProgressDialogFragment = this.f71604OoooOoO;
        if (exportProgressDialogFragment != null) {
            exportProgressDialogFragment.dismissAllowingStateLoss();
        }
        this.f71604OoooOoO = null;
        super.onDestroyView();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f71600OoooOO0 = view.findViewById(R.id.ll_add_water_mark);
        this.f71606o000oOoO = view.findViewById(R.id.btn_add_water_mark);
        this.f71601OoooOOO = (TextView) view.findViewById(R.id.tv_val_add_water_mark);
        int i2 = 1;
        ViewOnClickListenerC26057OooooO0 viewOnClickListenerC26057OooooO0 = new ViewOnClickListenerC26057OooooO0(this, i2);
        View view2 = this.f71600OoooOO0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("addWaterMark");
            throw null;
        }
        view2.setOnClickListener(viewOnClickListenerC26057OooooO0);
        TextView textView = this.f71601OoooOOO;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("txtWaterMarkValue");
            throw null;
        }
        textView.setOnClickListener(viewOnClickListenerC26057OooooO0);
        View view3 = this.f71606o000oOoO;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddWaterMark");
            throw null;
        }
        view3.setOnClickListener(new Oooo000(this, 0));
        getChildFragmentManager().Oooooo0("key_result_for_text", getViewLifecycleOwner(), new com.google.firebase.remoteconfig.OooOO0O(this));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23092OooO0Oo(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C23093OooO0o0(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new OooO0o(null), 3);
        com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO = Oooo0OO();
        C25252OooO0Oo.OooOo0o(new o000Oo0(oooO0oOooo0OO.f71763OooOOOo, new C23094OooO0oO(null), 1), C21989OooOooO.OooO00o(this));
        com.orion.notein.p607ui.export.OooO0o oooO0oOooo0OO2 = Oooo0OO();
        String idListTempFile = Oooo0O0().getF71680OooOo0o();
        kotlin.jvm.internal.OooOOO0.OooO0oO(idListTempFile, "idListTempFile");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0oOooo0OO2);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28262OoooO0(oooO0oOooo0OO2, idListTempFile, null), 2);
        Oooo0OO().OooO(C33599OooOo0O.Oooooo0(Oooo0O0().getF71681OooOoO0()).toString());
        View viewFindViewById = view.findViewById(R.id.export_type_pdf);
        this.f71593Oooo0o0 = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("pdfTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28253Oooo00O(this, i));
        View viewFindViewById2 = view.findViewById(R.id.export_type_immutable_pdf);
        this.f71592Oooo0o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("immutablePdfTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new o0Oo0oo(this, i2));
        View viewFindViewById3 = view.findViewById(R.id.export_type_image);
        this.f71594Oooo0oO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC26049OoooOO0(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.export_type_notein);
        this.f71595Oooo0oo = viewFindViewById4;
        if (viewFindViewById4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteinTypeView");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC26050OoooOOO(this, i2));
        this.f71596OoooO = (TextView) view.findViewById(R.id.tv_include_outline_and_comment);
        View viewFindViewById5 = view.findViewById(R.id.btn_include_paper_theme);
        this.f71585Oooo = viewFindViewById5;
        if (viewFindViewById5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeTheme");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC26051OoooOOo(this, 1));
        View viewFindViewById6 = view.findViewById(R.id.btn_include_outline_and_comment);
        this.f71598OoooO00 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludeOutlineAndComment");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC26052OoooOo0(this, i2));
        View viewFindViewById7 = view.findViewById(R.id.btn_include_page_elements);
        this.f71597OoooO0 = viewFindViewById7;
        if (viewFindViewById7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagElements");
            throw null;
        }
        viewFindViewById7.setOnClickListener(new ViewOnClickListenerC26053OoooOoO(this, 1));
        View viewFindViewById8 = view.findViewById(R.id.btn_include_page_padding);
        this.f71599OoooO0O = viewFindViewById8;
        if (viewFindViewById8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnIncludePagePadding");
            throw null;
        }
        viewFindViewById8.setOnClickListener(new ViewOnClickListenerC26058OooooOO(this, i2));
        View viewFindViewById9 = view.findViewById(R.id.btn_confirm);
        this.f71590Oooo0O0 = viewFindViewById9;
        if (viewFindViewById9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById9.setOnClickListener(new ViewOnClickListenerC26059OooooOo(this, i2));
        View viewFindViewById10 = view.findViewById(R.id.btn_cancel);
        this.f71591Oooo0OO = viewFindViewById10;
        if (viewFindViewById10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC28251OooOooo(this, i));
        InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new OooO0OO(null), 3);
    }
}

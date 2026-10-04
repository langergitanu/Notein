package com.orion.notein.p607ui.settings.debug;

import OooO0oO.C20438OooO0oO;
import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.inappmessaging.internal.C22741OooOoo;
import com.google.firebase.inappmessaging.internal.C22749Oooo0OO;
import com.google.firebase.inappmessaging.internal.C22758OoooOO0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment.C23805OooO0Oo;
import com.orion.notein.p607ui.settings.debug.DebugFragment.C23807OooO0oO;
import com.orion.notein.ui.settings.debug.DebugFragment.OooO00o;
import com.orion.notein.ui.settings.debug.DebugFragment.OooO0OO;
import com.orion.notein.ui.settings.debug.DebugFragment.OooO0o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o000o00.AbstractC24555OooO00o;
import o000o0Oo.C24610OooO0O0;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OO00o0.o000Oo0;
import o0OO0Ooo.C26794Ooooo0o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28151OooO0Oo;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oo0o00.ViewOnClickListenerC28177OooOooo;
import o0Oo0o00.ViewOnClickListenerC28180Oooo000;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0OoO0oO.ViewOnClickListenerC28681OooOO0O;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
import o0OoOO00.ViewOnClickListenerC29033OoooOOo;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
import o0Oooo0.ViewOnClickListenerC29610OooO00o;
import o0o0OoOO.C30693OooOOO;
import o0o0OoOO.C30696OooOOOo;
import o0o0OoOO.C30702OooOo00;
import o0o0OoOO.C30709OooOoo0;
import o0o0OoOO.ViewOnClickListenerC30687OooO0o0;
import o0o0OoOo.C30722OooO00o;
import o0o0OoOo.C30723OooO0O0;
import o0o0OoOo.C30727OooO0o0;
import o0o0OoOo.C30729OooO0oo;
import o0o0OoOo.C30732OooOO0o;
import o0o0OoOo.C30734OooOOO0;
import o0o0OoOo.C30740OooOo;
import o0o0OoOo.C30742OooOo00;
import o0o0OoOo.C30745OooOoO;
import o0o0OoOo.C30746OooOoO0;
import o0o0OoOo.C30747OooOoOO;
import o0oOoo0.C31113OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/debug/DebugFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DebugFragment extends Hilt_DebugFragment {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f79020Oooo0OO = C24340OooO0oo.OooO00o("key_switch_flat_note_list");

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f79021Oooo0o0 = C24340OooO0oo.OooO00o("key_skip_note_meta_write_in_editor");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f79022OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79023OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f79024OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C31113OooO0O0 f79025OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f79026Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public androidx.appcompat.app.OooOO0 f79027Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO0o.OooO0O0<String> f79028Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f79029Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f79030Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23808OooO0oo f79031OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C23808OooO0oo c23808OooO0oo) {
            super(0);
            this.f79031OooOo0o = c23808OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79031OooOo0o.invoke();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$harmonyBackupChooserLauncher$1$1", m80623f = "DebugFragment.kt", m80624l = {615}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79033OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f79034OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79034OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new OooO00o(this.f79034OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79033OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79033OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30745OooOoO(c30722OooO00oOooOoO, this.f79034OooOoO0, null), this);
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
                String string = debugFragment.getString(R.string.debug_restore_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = debugFragment.getString(R.string.debug_harmony_restore_success_desc);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string, string2, null, null, new ViewOnClickListenerC26311Ooooooo(), 28);
            } else {
                String string3 = debugFragment.getString(R.string.debug_restore_failed);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                String string4 = debugFragment.getString(R.string.debug_harmony_restore_failed_desc);
                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string3, string4, null, null, new ViewOnClickListenerC26311Ooooooo(), 28);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$logFileChooserLauncher$1$1", m80623f = "DebugFragment.kt", m80624l = {651}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79036OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f79037OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Uri uri, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f79037OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new OooO0O0(this.f79037OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79036OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79036OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30723OooO0O0(c30722OooO00oOooOoO, this.f79037OooOoO0, null), this);
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
                String string = debugFragment.getString(R.string.debug_export_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string, "", null, null, new ViewOnClickListenerC26311Ooooooo(), 28);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$onViewCreated$10$1$1", m80623f = "DebugFragment.kt", m80624l = {StyleIdentifier.MEDIUM_GRID_2_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79039OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f79040OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(View view, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f79040OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new OooO0OO(this.f79040OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79039OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79039OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30740OooOo(c30722OooO00oOooOoO, null), this);
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
            Context context = this.f79040OooOoO0.getContext();
            if (context != null) {
                String string = debugFragment.getString(R.string.debug_restore_complete);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$onViewCreated$11$1$1", m80623f = "DebugFragment.kt", m80624l = {StyleIdentifier.INTENSE_REFERENCE}, m80625m = "invokeSuspend")
    public static final class C23805OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79042OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f79043OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23805OooO0Oo(View view, Continuation<? super C23805OooO0Oo> continuation) {
            super(2, continuation);
            this.f79043OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new C23805OooO0Oo(this.f79043OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23805OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79042OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79042OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30746OooOoO0(c30722OooO00oOooOoO, null), this);
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
            Context context = this.f79043OooOoO0.getContext();
            if (context != null) {
                String string = debugFragment.getString(R.string.debug_restore_complete);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$onViewCreated$8$1$1", m80623f = "DebugFragment.kt", m80624l = {236}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79045OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f79046OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(View view, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f79046OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new OooO0o(this.f79046OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79045OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79045OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30747OooOoOO(c30722OooO00oOooOoO, null), this);
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
            Context context = this.f79046OooOoO0.getContext();
            if (context != null) {
                String string = debugFragment.getString(R.string.debug_restore_complete);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$onViewCreated$4$1$runnable$1$1", m80623f = "DebugFragment.kt", m80624l = {180}, m80625m = "invokeSuspend")
    public static final class C23806OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79048OooOo0o;

        public C23806OooO0o0(Continuation<? super C23806OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new C23806OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23806OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79048OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79048OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30727OooO0o0(c30722OooO00oOooOoO, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
            boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
            String str = (String) c32443OooOOO.f116637OooOo;
            String strOoooOoO = C33599OooOo0O.OoooOoO(str, "Documents/", str);
            if (zBooleanValue) {
                String string = debugFragment.getString(R.string.debug_export_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = debugFragment.getString(R.string.debug_log_exported_to, strOoooOoO);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string, string2, null, null, new ViewOnClickListenerC26311Ooooooo(), 28);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$onViewCreated$9$1$1", m80623f = "DebugFragment.kt", m80624l = {245}, m80625m = "invokeSuspend")
    public static final class C23807OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79050OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f79051OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23807OooO0oO(View view, Continuation<? super C23807OooO0oO> continuation) {
            super(2, continuation);
            this.f79051OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new C23807OooO0oO(this.f79051OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23807OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79050OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79050OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30742OooOo00(c30722OooO00oOooOoO, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = this.f79051OooOoO0.getContext();
            if (context != null) {
                String string = debugFragment.getString(R.string.debug_recovered_folders, new Integer(iIntValue));
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23808OooO0oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23808OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return DebugFragment.this;
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79053OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79053OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79053OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79054OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79054OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79054OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23809OooOO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79055OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23809OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79055OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79055OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? DebugFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$storageReportChooserLauncher$1$1", m80623f = "DebugFragment.kt", m80624l = {115}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79058OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f79059OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Uri uri, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f79059OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugFragment.this.new OooOOO0(this.f79059OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79058OooOo0o;
            DebugFragment debugFragment = DebugFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
                this.f79058OooOo0o = 1;
                obj = c30722OooO00oOooOoO.OooO0o(this.f79059OooOoO0, this);
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
                String string = debugFragment.getString(R.string.page_operation_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                DebugFragment.OooOoOO(debugFragment, string, "", null, null, new ViewOnClickListenerC26311Ooooooo(), 28);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public DebugFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO(new C23808OooO0oo()));
        this.f79023OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30722OooO00o.class), new OooOO0(interfaceC32440OooOO0OooO0O0), new C23809OooOO0o(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0));
        OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20438OooO0oO(), new C22741OooOoo(this, 3));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f79028Oooo00O = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new C22749Oooo0OO(this));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f79029Oooo00o = oooO0O0RegisterForActivityResult2;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0o0OoOO.OooOO0o
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.f62240OooOo0o != -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DebugFragment");
                    c20358OooO00o.OooO0o0("User cancelled harmony backup file browsing", new Object[0]);
                    return;
                }
                Intent intent = result.f62239OooOo;
                Uri data = intent != null ? intent.getData() : null;
                if (data == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("DebugFragment");
                    c20358OooO00o2.OooO0OO("Harmony backup file uri not found", new Object[0]);
                } else {
                    DebugFragment debugFragment = this.f109773OooOo0o;
                    InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new OooO00o(data, null), 3);
                }
            }
        });
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult3, "registerForActivityResult(...)");
        this.f79026Oooo0 = oooO0O0RegisterForActivityResult3;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult4 = registerForActivityResult(new C20439OooO0oo(), new C22758OoooOO0(this));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult4, "registerForActivityResult(...)");
        this.f79030Oooo0O0 = oooO0O0RegisterForActivityResult4;
    }

    public static void OooOoOO(DebugFragment debugFragment, String str, String str2, ViewOnClickListenerC30687OooO0o0 viewOnClickListenerC30687OooO0o0, ViewOnClickListenerC29007OooOo0 viewOnClickListenerC29007OooOo0, View.OnClickListener onClickListener, int i) {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(debugFragment), null, null, new C30709OooOoo0(debugFragment, str, str2, (i & 4) != 0 ? null : viewOnClickListenerC30687OooO0o0, (i & 8) != 0 ? null : viewOnClickListenerC29007OooOo0, (i & 32) != 0 ? null : onClickListener, null), 3);
    }

    public final C30722OooO00o OooOoO() {
        return (C30722OooO00o) this.f79023OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_debug, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C31113OooO0O0 c31113OooO0O0 = this.f79025OooOooo;
        if (c31113OooO0O0 != null) {
            c31113OooO0O0.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText("Debug, brand_" + Build.BRAND + ", flavor_google_play");
        View viewFindViewById = view.findViewById(R.id.cl_export_log);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC29033OoooOOo(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.cl_storage_report);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
        C28050OooO0OO.OooO00o(viewFindViewById2, 1500L, new ViewOnClickListenerC28681OooOO0O(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.cl_export_download_theme);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById3);
        viewFindViewById3.setVisibility(8);
        C28050OooO0OO.OooO00o(viewFindViewById3, 1500L, new ViewOnClickListenerC28177OooOooo(this, 3));
        this.f79022OooOoo = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.cl_display_pdf_list);
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC28180Oooo000(this, 2));
        this.f79024OooOooO = viewFindViewById4;
        view.findViewById(R.id.cl_image_list).setOnClickListener(new ViewOnClickListenerC28139OooO0o(this, 5));
        view.findViewById(R.id.cl_clear_unused_pdf).setOnClickListener(new ViewOnClickListenerC28141OooO0oO(this, 5));
        final View viewFindViewById5 = view.findViewById(R.id.cl_restore_folders);
        viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.OooO00o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = this.f109756OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new OooO0o(viewFindViewById5, null), 3);
            }
        });
        final View viewFindViewById6 = view.findViewById(R.id.cl_recover_detached_folders);
        viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.OooO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = this.f109758OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new C23807OooO0oO(viewFindViewById6, null), 3);
            }
        });
        final View viewFindViewById7 = view.findViewById(R.id.cl_reset_user_of_notes);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById7);
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new View.OnClickListener() { // from class: o0o0OoOO.OooO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = this.f109760OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new OooO0OO(viewFindViewById7, null), 3);
            }
        });
        final View viewFindViewById8 = view.findViewById(R.id.cl_reset_user_of_stickers);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById8);
        C28050OooO0OO.OooO00o(viewFindViewById8, 500L, new View.OnClickListener() { // from class: o0o0OoOO.OooO0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = this.f109762OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new C23805OooO0Oo(viewFindViewById8, null), 3);
            }
        });
        View viewFindViewById9 = view.findViewById(R.id.cl_storage_report);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById9);
        C28050OooO0OO.OooO00o(viewFindViewById9, 1500L, new ViewOnClickListenerC29034OooO00o(this, 4));
        C21904OooOoo0.OooO0oO(this, "storage_optimization", new InterfaceC32508OooOOOo() { // from class: o0o0OoOO.OooOOO0
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO((Bundle) obj2, "<unused var>");
                DebugFragment debugFragment = this.f109776OooOo0o;
                Context context = debugFragment.getContext();
                if (context != null) {
                    String string = debugFragment.getString(R.string.debug_cleanup_success);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        view.findViewById(R.id.cl_recover_layer).setOnClickListener(new ViewOnClickListenerC28151OooO0Oo(this, 2));
        C21904OooOoo0.OooO0oO(this, "key_select_note_for_recover_layer", new InterfaceC32508OooOOOo() { // from class: o0o0OoOO.OooO0o
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String requestKey = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(requestKey, "requestKey");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                if (requestKey.equals("key_select_note_for_recover_layer")) {
                    String string = bundle2.getString("note_id");
                    if (string == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    DebugFragment debugFragment = this.f109763OooOo0o;
                    Context context = debugFragment.getContext();
                    if (context != null) {
                        String string2 = debugFragment.getString(R.string.debug_restoring);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30699OooOOoo(debugFragment, string, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById10 = view.findViewById(R.id.cl_pen_debug_settings);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById10);
        C28050OooO0OO.OooO00o(viewFindViewById10, 1500L, new ViewOnClickListenerC28152OooO0o(this, 4));
        view.findViewById(R.id.cl_trace_homepage_load).setOnClickListener(new ViewOnClickListenerC28155OooO0oo(this, 6));
        C21904OooOoo0.OooO0oO(this, "key_select_note_for_home_load_trace", new InterfaceC32508OooOOOo() { // from class: o0o0OoOO.OooO0oo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String requestKey = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(requestKey, "requestKey");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                if (requestKey.equals("key_select_note_for_home_load_trace")) {
                    String string = bundle2.getString("note_id");
                    if (string == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    DebugFragment debugFragment = this.f109765OooOo0o;
                    Context context = debugFragment.getContext();
                    if (context != null) {
                        String string2 = debugFragment.getString(R.string.debug_start_load_test);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30698OooOOo0(debugFragment, string, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switch_flat_note_list);
        if (switchCompat != null) {
            C25252OooO0Oo.OooOo0o(new o000Oo0(new C26794Ooooo0o(new C30729OooO0oo(C28051OooO00o.OooO00o(OooOoO().f109859OooO0Oo).getData(), 0), 1), new C30693OooOOO(switchCompat, null), 1), C21989OooOooO.OooO00o(this));
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OoOO.OooOO0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                    DebugFragment debugFragment = this.f109766OooO00o;
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(debugFragment), null, null, new C30695OooOOOO(debugFragment, null, z), 3);
                }
            });
        }
        SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(R.id.switch_skip_note_meta_write);
        if (switchCompat2 != null) {
            C25252OooO0Oo.OooOo0o(new o000Oo0(new C30734OooOOO0(new C30732OooOO0o(C28051OooO00o.OooO00o(OooOoO().f109859OooO0Oo).getData())), new C30702OooOo00(switchCompat2, null), 1), C21989OooOooO.OooO00o(this));
            switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OoOO.OooO0oO
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DebugFragment debugFragment = this.f109764OooO00o;
                    AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                    C24610OooO0O0.f83393OooO00o = z;
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(debugFragment), null, null, new C30701OooOo0(debugFragment, null, z), 3);
                    String string = z ? debugFragment.getString(R.string.debug_skip_meta_write_on) : debugFragment.getString(R.string.debug_skip_meta_write_off);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                    Context context = debugFragment.getContext();
                    if (context != null) {
                        C25206OooO0Oo.OooO0oO(context, string);
                    }
                }
            });
        }
        view.findViewById(R.id.cl_recover_page).setOnClickListener(new ViewOnClickListenerC29610OooO00o(this, 2));
        C21904OooOoo0.OooO0oO(this, "key_select_note_for_recover_page", new InterfaceC32508OooOOOo() { // from class: o0o0OoOO.OooO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String requestKey = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(requestKey, "requestKey");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                if (requestKey.equals("key_select_note_for_recover_page")) {
                    String string = bundle2.getString("note_id");
                    if (string == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    DebugFragment debugFragment = this.f109754OooOo0o;
                    Context context = debugFragment.getContext();
                    if (context != null) {
                        String string2 = debugFragment.getString(R.string.debug_restoring_page);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30697OooOOo(debugFragment, string, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById11 = view.findViewById(R.id.cl_restore_harmony_backup);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById11);
        C28050OooO0OO.OooO00o(viewFindViewById11, 1500L, new ViewOnClickListenerC28427OooOo00(this, 4));
        TextView textView = (TextView) view.findViewById(R.id.tv_import_harmony_progress);
        View viewFindViewById12 = view.findViewById(R.id.iv_import_harmony_progress);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30696OooOOOo(this, textView, viewFindViewById12, null), 3);
    }
}

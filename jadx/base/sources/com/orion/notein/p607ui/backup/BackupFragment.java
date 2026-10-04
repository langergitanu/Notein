package com.orion.notein.p607ui.backup;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21985OooOoO0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0Oo0oo;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.inappmessaging.internal.C22730OooOO0o;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.BackupFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.o000OOo;
import o0o000OO.ViewOnClickListenerC29749OooO00o;
import o0o000OO.ViewOnClickListenerC29750OooO0O0;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31117OooO0O0;
import o0oOoo00.C31118OooO0OO;
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
import oO0o0OO.o00000OO;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/BackupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BackupFragment extends Hilt_BackupFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f70474OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f70475OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f70476OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f70477OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f70478Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f70479Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f70480Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final BackupResultDialogFragment f70481Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f70482Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70483OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70483OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70483OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BackupFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4", m80623f = "BackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70486OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$1", m80623f = "BackupFragment.kt", m80624l = {82}, m80625m = "invokeSuspend")
        public static final class C19140OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupFragment f70487OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70488OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19141OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BackupFragment f70489OooOo0o;

                public C19141OooO00o(BackupFragment backupFragment) {
                    this.f70489OooOo0o = backupFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    if (((Number) obj).intValue() != 0) {
                        BackupFragment backupFragment = this.f70489OooOo0o;
                        if (backupFragment.getChildFragmentManager().OooOooo("BackupResultDialogFragment") == null) {
                            AbstractC21979OooOOo0 lifecycle = backupFragment.getLifecycle();
                            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
                            boolean zO000OOO = abstractC33687OooO0oOO000OOoO.o000OOO(continuation.getContext());
                            if (zO000OOO) {
                                Object objOooO00o = o0Oo0oo.OooO00o(lifecycle, zO000OOO, abstractC33687OooO0oOO000OOoO, new C31117OooO0O0(backupFragment), continuation);
                                if (objOooO00o == EnumC32485OooO00o.f116726OooOo0o) {
                                    return objOooO00o;
                                }
                            } else {
                                if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                                    throw new C21985OooOoO0();
                                }
                                if (lifecycle.OooO0O0().compareTo(oooO0O0) >= 0) {
                                    backupFragment.f70481Oooo00o.show(backupFragment.getChildFragmentManager(), "BackupResultDialogFragment");
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                }
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19140OooO00o(BackupFragment backupFragment, Continuation<? super C19140OooO00o> continuation) {
                super(2, continuation);
                this.f70487OooOo = backupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19140OooO00o(this.f70487OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19140OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70488OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                BackupFragment backupFragment = this.f70487OooOo;
                C31114OooO c31114OooOOooOoO = backupFragment.OooOoO();
                C19141OooO00o c19141OooO00o = new C19141OooO00o(backupFragment);
                this.f70488OooOo0o = 1;
                c31114OooOOooOoO.f111030OooOO0.collect(c19141OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$2", m80623f = "BackupFragment.kt", m80624l = {94}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupFragment f70490OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70491OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19142OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BackupFragment f70492OooOo0o;

                public C19142OooO00o(BackupFragment backupFragment) {
                    this.f70492OooOo0o = backupFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    BackupFragment backupFragment = this.f70492OooOo0o;
                    if (backupFragment.getChildFragmentManager().OooOooo("RestoreConfirmDialogFragment") != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    AbstractC21979OooOOo0 lifecycle = backupFragment.getLifecycle();
                    AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
                    boolean zO000OOO = abstractC33687OooO0oOO000OOoO.o000OOO(continuation.getContext());
                    if (zO000OOO) {
                        Object objOooO00o = o0Oo0oo.OooO00o(lifecycle, zO000OOO, abstractC33687OooO0oOO000OOoO, new C31118OooO0OO(backupFragment), continuation);
                        if (objOooO00o == EnumC32485OooO00o.f116726OooOo0o) {
                            return objOooO00o;
                        }
                    } else {
                        if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                            throw new C21985OooOoO0();
                        }
                        if (lifecycle.OooO0O0().compareTo(oooO0O0) >= 0) {
                            new ImportLocalDataDialogFragment().show(backupFragment.getChildFragmentManager(), "RestoreConfirmDialogFragment");
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(BackupFragment backupFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f70490OooOo = backupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f70490OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70491OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                BackupFragment backupFragment = this.f70490OooOo;
                C33772OooooOo c33772OooooOo = backupFragment.OooOoO().f111037OooOOo;
                C19142OooO00o c19142OooO00o = new C19142OooO00o(backupFragment);
                this.f70491OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, c19142OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$3", m80623f = "BackupFragment.kt", m80624l = {105}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupFragment f70493OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70494OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$3$1", m80623f = "BackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19143OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BackupFragment f70495OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f70496OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19143OooO00o(BackupFragment backupFragment, Continuation<? super C19143OooO00o> continuation) {
                    super(2, continuation);
                    this.f70495OooOo = backupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19143OooO00o c19143OooO00o = new C19143OooO00o(this.f70495OooOo, continuation);
                    c19143OooO00o.f70496OooOo0o = ((Number) obj).intValue();
                    return c19143OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19143OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    if (this.f70496OooOo0o == -111) {
                        ActivityC21897OooOo0 activity = this.f70495OooOo.getActivity();
                        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.showUpgradeTipOnInFileDBVersionNotMatch();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(BackupFragment backupFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f70493OooOo = backupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f70493OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70494OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFragment backupFragment = this.f70493OooOo;
                    C33772OooooOo c33772OooooOo = backupFragment.OooOoO().f111042OooOo00;
                    C19143OooO00o c19143OooO00o = new C19143OooO00o(backupFragment, null);
                    this.f70494OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19143OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$4", m80623f = "BackupFragment.kt", m80624l = {113}, m80625m = "invokeSuspend")
        public static final class C22982OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupFragment f70497OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70498OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupFragment$onViewCreated$4$4$1", m80623f = "BackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19144OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BackupFragment f70499OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f70500OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19144OooO00o(BackupFragment backupFragment, Continuation<? super C19144OooO00o> continuation) {
                    super(2, continuation);
                    this.f70499OooOo = backupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19144OooO00o c19144OooO00o = new C19144OooO00o(this.f70499OooOo, continuation);
                    c19144OooO00o.f70500OooOo0o = ((Boolean) obj).booleanValue();
                    return c19144OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19144OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f70500OooOo0o;
                    BackupFragment backupFragment = this.f70499OooOo;
                    View view = backupFragment.f70480Oooo00O;
                    if (view == null) {
                        OooOOO0.OooOOOO("clLoadingLocalFile");
                        throw null;
                    }
                    view.setVisibility(z ? 0 : 8);
                    View view2 = backupFragment.f70477OooOooo;
                    if (view2 != null) {
                        view2.setVisibility(z ? 8 : 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnRestore");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22982OooO0Oo(BackupFragment backupFragment, Continuation<? super C22982OooO0Oo> continuation) {
                super(2, continuation);
                this.f70497OooOo = backupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22982OooO0Oo(this.f70497OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22982OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70498OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFragment backupFragment = this.f70497OooOo;
                    C31114OooO c31114OooOOooOoO = backupFragment.OooOoO();
                    C19144OooO00o c19144OooO00o = new C19144OooO00o(backupFragment, null);
                    this.f70498OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c31114OooOOooOoO.f111033OooOOO, c19144OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = BackupFragment.this.new OooO00o(continuation);
            oooO00o.f70486OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70486OooOo0o;
            BackupFragment backupFragment = BackupFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19140OooO00o(backupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(backupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(backupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22982OooO0Oo(backupFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return BackupFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return BackupFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22983OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22983OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return BackupFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C22984OooO0o0 f70504OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C22984OooO0o0 c22984OooO0o0) {
            super(0);
            this.f70504OooOo0o = c22984OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70504OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C22984OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C22984OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return BackupFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C22985OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70506OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22985OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70506OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70506OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C22986OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70507OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22986OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70507OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70507OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public BackupFragment() {
        super(R.layout.fragment_backup);
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C22984OooO0o0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f70475OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C31114OooO.class), new C22985OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C22986OooO0oo(interfaceC32440OooOO0OooO0O0));
        new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C22983OooO0Oo(), new OooO0OO());
        this.f70481Oooo00o = new BackupResultDialogFragment();
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new C22730OooOO0o(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f70478Oooo0 = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0oOoo00.OooO00o
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.f62240OooOo0o != -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupFragment");
                    c20358OooO00o.OooO0o0("User cancelled file browsing when recover", new Object[0]);
                    return;
                }
                Intent intent = result.f62239OooOo;
                Uri data = intent != null ? intent.getData() : null;
                if (data == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("BackupFragment");
                    c20358OooO00o2.OooO0OO("File uri not found for recover", new Object[0]);
                    return;
                }
                BackupFragment backupFragment = this.f111059OooOo0o;
                backupFragment.requireContext().getContentResolver().takePersistableUriPermission(data, 3);
                C31114OooO c31114OooOOooOoO = backupFragment.OooOoO();
                o00000OO o00000oo2 = c31114OooOOooOoO.f111028OooO0oO;
                if (o00000oo2 == null || !o00000oo2.isActive()) {
                    C33781o00o0O c33781o00o0O = c31114OooOOooOoO.f111024OooO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, 0);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c31114OooOOooOoO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31125OooOO0O(c31114OooOOooOoO, data, null), 2);
                }
            }
        });
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f70482Oooo0O0 = oooO0O0RegisterForActivityResult2;
    }

    public final C31114OooO OooOoO() {
        return (C31114OooO) this.f70475OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_manual_backup_introduce);
        this.f70479Oooo000 = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("tvIntroduce");
            throw null;
        }
        textView.setText(getString(R.string.backup_introduce, getString(R.string.backup_local_path)));
        TextView textView2 = this.f70479Oooo000;
        if (textView2 == null) {
            OooOOO0.OooOOOO("tvIntroduce");
            throw null;
        }
        textView2.setVisibility(8);
        View viewFindViewById = view.findViewById(R.id.btn_back_to_parent);
        this.f70474OooOoo = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new o000OOo(this, 2));
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_backup);
        this.f70476OooOooO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBackup");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC29749OooO00o(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.btn_restore);
        this.f70477OooOooo = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnRestore");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC29750OooO0O0(this, 3));
        this.f70480Oooo00O = view.findViewById(R.id.cl_loading_local_file);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

package com.orion.notein.p607ui.backup;

import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0OOo.C28084OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0Ooo.C29260OooO0oo;
import o0oOoOo.C31055OooOoOO;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31126OooOO0o;
import o0oOoo00.C31128OooOOO0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/ImportLocalDataDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImportLocalDataDialogFragment extends Hilt_ImportLocalDataDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f70665OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C28084OooO0OO f70666OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f70667Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f70668Oooo00O;

    public static final class OooO00o implements SearchView.OooOOO0 {
        public OooO00o() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            C31114OooO c31114OooOOooOoo0 = ImportLocalDataDialogFragment.this.OooOoo0();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = c31114OooOOooOoo0.f111044OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = c31114OooOOooOoo0.f111043OooOo0O;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportLocalDataDialogFragment$onViewCreated$3$1", m80623f = "ImportLocalDataDialogFragment.kt", m80624l = {77}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70671OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ImportLocalDataDialogFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOooO0o0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70671OooOo0o;
            ImportLocalDataDialogFragment importLocalDataDialogFragment = ImportLocalDataDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C31114OooO c31114OooOOooOoo0 = importLocalDataDialogFragment.OooOoo0();
                this.f70671OooOo0o = 1;
                objOooO0o0 = c31114OooOOooOoo0.OooO0o0(this);
                if (objOooO0o0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o0 = obj;
            }
            int iIntValue = ((Number) objOooO0o0).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        if (importLocalDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                            ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                            ViewOnClickListenerC28136OooO0O0 viewOnClickListenerC28136OooO0O0 = new ViewOnClickListenerC28136OooO0O0(importLocalDataDialogFragment, 7);
                            String string = importLocalDataDialogFragment.getString(R.string.upgrade_now);
                            OooOOO0.OooO0o(string, "getString(...)");
                            int i2 = importLocalDataDialogFragment.OooOoo0().f111026OooO0o.f96920OooO0Oo.f95374OooO00o.OooO0OO(true).f88053OooO00o - 1;
                            int i3 = i2 >= 1 ? i2 : 1;
                            String string2 = importLocalDataDialogFragment.getString(R.string.title_upgrade_to_vip_create_note);
                            OooOOO0.OooO0o(string2, "getString(...)");
                            String string3 = importLocalDataDialogFragment.getString(R.string.content_upgrade_to_vip_create_note, Integer.valueOf(i3));
                            OooOOO0.OooO0o(string3, "getString(...)");
                            new TipsDialogFragment(string2, string3, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28136OooO0O0, null, string, 0, null, 384).show(importLocalDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C31114OooO c31114OooOOooOoo02 = importLocalDataDialogFragment.OooOoo0();
                    o00000OO o00000oo2 = c31114OooOOooOoo02.f111028OooO0oO;
                    if (o00000oo2 == null || !o00000oo2.isActive()) {
                        List list = (List) c31114OooOOooOoo02.f111041OooOo0.getValue();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C31126OooOO0o(list, c31114OooOOooOoo02, null), 3);
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C31128OooOOO0(list, c31114OooOOooOoo02, null), 3);
                    }
                    importLocalDataDialogFragment.dismissAllowingStateLoss();
                } else if (importLocalDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    String string4 = importLocalDataDialogFragment.getString(R.string.tips);
                    OooOOO0.OooO0o(string4, "getString(...)");
                    String string5 = importLocalDataDialogFragment.getString(R.string.hit_my_templates_vip_limit);
                    OooOOO0.OooO0o(string5, "getString(...)");
                    new TipsDialogFragment(string4, string5, null, null).show(importLocalDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
                }
            } else if (importLocalDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                String string6 = importLocalDataDialogFragment.getString(R.string.tips);
                OooOOO0.OooO0o(string6, "getString(...)");
                String string7 = importLocalDataDialogFragment.getString(R.string.hit_max_num_of_my_templates);
                OooOOO0.OooO0o(string7, "getString(...)");
                new TipsDialogFragment(string6, string7, null, null).show(importLocalDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportLocalDataDialogFragment$onViewCreated$6", m80623f = "ImportLocalDataDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70673OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportLocalDataDialogFragment$onViewCreated$6$1", m80623f = "ImportLocalDataDialogFragment.kt", m80624l = {125}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportLocalDataDialogFragment f70674OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70675OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportLocalDataDialogFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19155OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportLocalDataDialogFragment f70676OooOo0o;

                public C19155OooO00o(ImportLocalDataDialogFragment importLocalDataDialogFragment) {
                    this.f70676OooOo0o = importLocalDataDialogFragment;
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
                        if (((C31055OooOoOO) next).f110872OooO0o) {
                            break;
                        }
                    }
                    boolean z = next != null;
                    ImportLocalDataDialogFragment importLocalDataDialogFragment = this.f70676OooOo0o;
                    View view = importLocalDataDialogFragment.f70668Oooo00O;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    view.setEnabled(z);
                    C28084OooO0OO c28084OooO0OO = importLocalDataDialogFragment.f70666OooOooo;
                    if (c28084OooO0OO != null) {
                        c28084OooO0OO.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("noteinAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ImportLocalDataDialogFragment importLocalDataDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f70674OooOo = importLocalDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f70674OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70675OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportLocalDataDialogFragment importLocalDataDialogFragment = this.f70674OooOo;
                    C31114OooO c31114OooOOooOoo0 = importLocalDataDialogFragment.OooOoo0();
                    C19155OooO00o c19155OooO00o = new C19155OooO00o(importLocalDataDialogFragment);
                    this.f70675OooOo0o = 1;
                    if (c31114OooOOooOoo0.f111046OooOoO0.f121747OooOo0o.collect(c19155OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportLocalDataDialogFragment$onViewCreated$6$2", m80623f = "ImportLocalDataDialogFragment.kt", m80624l = {129}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportLocalDataDialogFragment f70677OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70678OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportLocalDataDialogFragment f70679OooOo0o;

                public OooO00o(ImportLocalDataDialogFragment importLocalDataDialogFragment) {
                    this.f70679OooOo0o = importLocalDataDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ImportLocalDataDialogFragment importLocalDataDialogFragment = this.f70679OooOo0o;
                    if (iIntValue == 0) {
                        TextView textView = importLocalDataDialogFragment.f70667Oooo000;
                        if (textView == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView.setText(importLocalDataDialogFragment.getString(R.string.cancel));
                    } else if (iIntValue == 1) {
                        TextView textView2 = importLocalDataDialogFragment.f70667Oooo000;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(importLocalDataDialogFragment.getString(R.string.select_all));
                    } else if (iIntValue != 2) {
                        importLocalDataDialogFragment.getClass();
                    } else {
                        TextView textView3 = importLocalDataDialogFragment.f70667Oooo000;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView3.setText(importLocalDataDialogFragment.getString(R.string.unselect_all));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ImportLocalDataDialogFragment importLocalDataDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f70677OooOo = importLocalDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f70677OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70678OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportLocalDataDialogFragment importLocalDataDialogFragment = this.f70677OooOo;
                    C31114OooO c31114OooOOooOoo0 = importLocalDataDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(importLocalDataDialogFragment);
                    this.f70678OooOo0o = 1;
                    if (c31114OooOOooOoo0.f111045OooOoO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
            OooO0OO oooO0OO = ImportLocalDataDialogFragment.this.new OooO0OO(continuation);
            oooO0OO.f70673OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70673OooOo0o;
            ImportLocalDataDialogFragment importLocalDataDialogFragment = ImportLocalDataDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(importLocalDataDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(importLocalDataDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportLocalDataDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23001OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29260OooO0oo f70680OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23001OooO0Oo(C29260OooO0oo c29260OooO0oo) {
            super(0);
            this.f70680OooOo0o = c29260OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70680OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70681OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70681OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70681OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportLocalDataDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23002OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70682OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23002OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70682OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70682OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportLocalDataDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23003OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70683OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23003OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70683OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70683OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ImportLocalDataDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ImportLocalDataDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23001OooO0Oo(new C29260OooO0oo(this, 2)));
        this.f70665OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C31114OooO.class), new C23002OooO0o0(interfaceC32440OooOO0OooO0O0), new C23003OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
    }

    public final C31114OooO OooOoo0() {
        return (C31114OooO) this.f70665OooOooO.getValue();
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
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.import_local_backup_files));
        ((SearchView) view.findViewById(R.id.search_box)).setOnQueryTextListener(new OooO00o());
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70667Oooo000 = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28610OooO0oo(this, 6));
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        this.f70668Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28413OooO0oO(this, 7));
        C28084OooO0OO c28084OooO0OO = new C28084OooO0OO(C28084OooO0OO.OooO00o.f99543OooO00o);
        this.f70666OooOooo = c28084OooO0OO;
        c28084OooO0OO.f99542OooO0O0 = new ViewOnClickListenerC26210OooO00o(this, 7);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C28084OooO0OO c28084OooO0OO2 = this.f70666OooOooo;
        if (c28084OooO0OO2 == null) {
            OooOOO0.OooOOOO("noteinAdapter");
            throw null;
        }
        recyclerView.setAdapter(c28084OooO0OO2);
        recyclerView.setItemAnimator(null);
        ((TextView) view.findViewById(R.id.bread_crumbs)).setText("Storage > Documents > Notein > backup");
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
    }
}

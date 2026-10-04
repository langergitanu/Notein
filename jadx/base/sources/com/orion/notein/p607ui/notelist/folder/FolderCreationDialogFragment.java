package com.orion.notein.p607ui.notelist.folder;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o0OOoooO.C27996OooO00o;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;
import o0Oo0ooO.ViewOnClickListenerC28438Oooo0;
import o0OoO0oO.ViewOnClickListenerC28677OooO0o0;
import o0OoOO00.ViewOnClickListenerC29033OoooOOo;
import o0o0O000.C30218OooO0Oo;
import o0o0O000.C30219OooO0o0;
import o0o0O000.C30220OooO0oO;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/folder/FolderCreationDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FolderCreationDialogFragment extends Hilt_FolderCreationDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f77596Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f77597Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f77598Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f77599Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f77600Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EditText f77601Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0o0O000.OooO0OO f77602Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RecyclerView f77603Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public CardView f77604Oooo0oO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77605OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77605OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77605OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (charSequence.length() == 0) {
                FolderCreationDialogFragment folderCreationDialogFragment = FolderCreationDialogFragment.this;
                EditText editText = folderCreationDialogFragment.f77601Oooo0OO;
                if (editText != null) {
                    editText.setHint(folderCreationDialogFragment.getString(R.string.folder_creation_dialog_hint));
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$5$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {81, 82}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<String> f77607OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77608OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ FolderCreationDialogFragment f77609OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$5$1$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FolderCreationDialogFragment f77610OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77610OooOo0o = folderCreationDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77610OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Dialog dialog = this.f77610OooOo0o.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C24034Oooo00O<String> c24034Oooo00O, FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f77607OooOo = c24034Oooo00O;
            this.f77609OooOoO0 = folderCreationDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f77607OooOo, this.f77609OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r6, r1, r5) == r0) goto L18;
         */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77608OooOo0o;
            FolderCreationDialogFragment folderCreationDialogFragment = this.f77609OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O<String> c24034Oooo00O = this.f77607OooOo;
                if (c24034Oooo00O.f80942OooOo0o.length() == 0) {
                    c24034Oooo00O.f80942OooOo0o = folderCreationDialogFragment.getString(R.string.folder_title_default);
                }
                C30220OooO0oO c30220OooO0oOOooo0 = folderCreationDialogFragment.Oooo0();
                String str = c24034Oooo00O.f80942OooOo0o;
                this.f77608OooOo0o = 1;
                if (c30220OooO0oOOooo0.OooO0o0(str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(folderCreationDialogFragment, null);
            this.f77608OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$6$1$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {99}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77611OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77612OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ FolderCreationDialogFragment f77613OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f77614OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(View view, FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f77614OooOoO0 = view;
            this.f77613OooOoO = folderCreationDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f77614OooOoO0, this.f77613OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = this.f77611OooOo;
            FolderCreationDialogFragment folderCreationDialogFragment = this.f77613OooOoO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Object tag = this.f77614OooOoO0.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                int i3 = C27996OooO00o.f99274OooO00o;
                int i4 = ((C31040OooOO0o) tag).f110821OooO00o;
                if (i4 == i3) {
                    folderCreationDialogFragment.Oooo0().OooO0o(i4);
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f77612OooOo0o = i4;
                this.f77611OooOo = 1;
                Object objOooo00o = FolderCreationDialogFragment.Oooo00o(folderCreationDialogFragment, 24, this);
                if (objOooo00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i = i4;
                obj = objOooo00o;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f77612OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                folderCreationDialogFragment.Oooo0().OooO0o(i);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$7", m80623f = "FolderCreationDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23670OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77616OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$7$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {112}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FolderCreationDialogFragment f77617OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77618OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$7$1$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19412OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31040OooOO0o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FolderCreationDialogFragment f77619OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77620OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19412OooO00o(FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super C19412OooO00o> continuation) {
                    super(2, continuation);
                    this.f77619OooOo = folderCreationDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19412OooO00o c19412OooO00o = new C19412OooO00o(this.f77619OooOo, continuation);
                    c19412OooO00o.f77620OooOo0o = obj;
                    return c19412OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31040OooOO0o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19412OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f77620OooOo0o;
                    o0o0O000.OooO0OO oooO0OO = this.f77619OooOo.f77602Oooo0o;
                    if (oooO0OO != null) {
                        oooO0OO.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("folderColorAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77617OooOo = folderCreationDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77617OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77618OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FolderCreationDialogFragment folderCreationDialogFragment = this.f77617OooOo;
                    C30220OooO0oO c30220OooO0oOOooo0 = folderCreationDialogFragment.Oooo0();
                    C19412OooO00o c19412OooO00o = new C19412OooO00o(folderCreationDialogFragment, null);
                    this.f77618OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30220OooO0oOOooo0.f107648OooO0oo, c19412OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$7$2", m80623f = "FolderCreationDialogFragment.kt", m80624l = {117}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FolderCreationDialogFragment f77621OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77622OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0Oo$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$onViewCreated$7$2$1", m80623f = "FolderCreationDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FolderCreationDialogFragment f77623OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f77624OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77623OooOo = folderCreationDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77623OooOo, continuation);
                    oooO00o.f77624OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f77624OooOo0o;
                    CardView cardView = this.f77623OooOo.f77604Oooo0oO;
                    if (cardView != null) {
                        cardView.setCardBackgroundColor(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("coverWrapper");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FolderCreationDialogFragment folderCreationDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77621OooOo = folderCreationDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77621OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77622OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FolderCreationDialogFragment folderCreationDialogFragment = this.f77621OooOo;
                    C30220OooO0oO c30220OooO0oOOooo0 = folderCreationDialogFragment.Oooo0();
                    OooO00o oooO00o = new OooO00o(folderCreationDialogFragment, null);
                    this.f77622OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30220OooO0oOOooo0.f107643OooO, oooO00o, this) == enumC32485OooO00o) {
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

        public C23670OooO0Oo(Continuation<? super C23670OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23670OooO0Oo c23670OooO0Oo = FolderCreationDialogFragment.this.new C23670OooO0Oo(continuation);
            c23670OooO0Oo.f77616OooOo0o = obj;
            return c23670OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23670OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77616OooOo0o;
            FolderCreationDialogFragment folderCreationDialogFragment = FolderCreationDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(folderCreationDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(folderCreationDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return FolderCreationDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23671OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23671OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            FolderCreationDialogFragment folderCreationDialogFragment = FolderCreationDialogFragment.this;
            Bundle arguments = folderCreationDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + folderCreationDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23672OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f77627OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23672OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f77627OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77627OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.FolderCreationDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23673OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77628OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23673OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77628OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77628OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77629OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77629OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77629OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? FolderCreationDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FolderCreationDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77597Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C30219OooO0o0.class), new C23671OooO0o0());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23672OooO0oO(new OooO0o()));
        this.f77598Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30220OooO0oO.class), new C23673OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo00o(FolderCreationDialogFragment folderCreationDialogFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30218OooO0Oo c30218OooO0Oo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30218OooO0Oo) {
            c30218OooO0Oo = (C30218OooO0Oo) abstractC32479OooO0OO;
            int i2 = c30218OooO0Oo.f107641OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30218OooO0Oo.f107641OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30218OooO0Oo = new C30218OooO0Oo(folderCreationDialogFragment, abstractC32479OooO0OO);
            }
        }
        C30218OooO0Oo c30218OooO0Oo2 = c30218OooO0Oo;
        Object objShowNonVipFeatureLimitedDialog$default = c30218OooO0Oo2.f107640OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30218OooO0Oo2.f107641OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = folderCreationDialogFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30218OooO0Oo2.f107641OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30218OooO0Oo2, 6, null);
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

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_folder_creation_dialog;
    }

    public final C30220OooO0oO Oooo0() {
        return (C30220OooO0oO) this.f77598Oooo00O.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Oooo0().f107645OooO0o.setValue(((C30219OooO0o0) this.f77597Oooo000.getValue()).f107642OooO00o);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f77601Oooo0OO = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f77601Oooo0OO;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f77601Oooo0OO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.addTextChangedListener(new OooO00o());
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f77600Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28158OooOO0o(this, 5));
        EditText editText4 = this.f77601Oooo0OO;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f77599Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28438Oooo0(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f77596Oooo0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28677OooO0o0(this, 1));
        this.f77603Oooo0o0 = (RecyclerView) view.findViewById(R.id.rv_folder_color_list);
        o0o0O000.OooO0OO oooO0OO = new o0o0O000.OooO0OO(R.layout.item_folder_color);
        oooO0OO.f107632OooO0OO = new ViewOnClickListenerC29033OoooOOo(this, 3);
        this.f77602Oooo0o = oooO0OO;
        RecyclerView recyclerView = this.f77603Oooo0o0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("folderColorList");
            throw null;
        }
        recyclerView.setAdapter(oooO0OO);
        this.f77604Oooo0oO = (CardView) view.findViewById(R.id.cover_wrapper);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23670OooO0Oo(null), 3);
    }
}

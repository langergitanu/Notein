package com.orion.notein.p607ui.notelist.folder;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.ink.strokes.C21971OooOO0o;
import androidx.ink.strokes.OooOO0O;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.MainActivity;
import com.orion.notein.data.repo.transactions.o000oOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.FolderVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0OOo0O.C27279OooO00o;
import o0Oo0o00.ViewOnClickListenerC28181Oooo00O;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0Oo0o00.ViewOnClickListenerC28191OoooO00;
import o0OoO0oo.ViewOnClickListenerC28688OooO0Oo;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0o0O000.C30216OooO00o;
import o0o0O000.C30220OooO0oO;
import o0o0O000.C30224OooOOo;
import o0o0O000.C30226OooOOoo;
import o0o0O000.C30227OooOo0;
import o0o0O000.C30230OooOoO;
import o0o0O000.C30231OooOoO0;
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
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33747Oooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/folder/MoveToFolderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MoveToFolderFragment extends Hilt_MoveToFolderFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77658OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f77659OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C32447OooOOo f77660OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f77661OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f77662Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C30216OooO00o f77663Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f77664Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f77665Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f77666Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f77667Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f77668Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public EditText f77669Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f77670Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f77671Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f77672Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public String f77673OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o0o0O000.OooO0OO f77674OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public RecyclerView f77675OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f77676OoooO0O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77677OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77677OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77677OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MoveToFolderFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$createFolder$1", m80623f = "MoveToFolderFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77680OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<String> f77681OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.MoveToFolderFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$createFolder$1$1", m80623f = "MoveToFolderFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class C19413OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MoveToFolderFragment f77682OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77683OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ String f77684OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19413OooO00o(MoveToFolderFragment moveToFolderFragment, String str, Continuation<? super C19413OooO00o> continuation) {
                super(2, continuation);
                this.f77682OooOo = moveToFolderFragment;
                this.f77684OooOoO0 = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19413OooO00o(this.f77682OooOo, this.f77684OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19413OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77683OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MoveToFolderFragment moveToFolderFragment = this.f77682OooOo;
                    EditText editText = moveToFolderFragment.f77669Oooo0o;
                    if (editText == null) {
                        OooOOO0.OooOOOO("inputNewFolderName");
                        throw null;
                    }
                    editText.setText("");
                    moveToFolderFragment.OooOoo0();
                    this.f77683OooOo0o = 1;
                    if (MoveToFolderFragment.OooOoO(moveToFolderFragment, this.f77684OooOoO0, this) == enumC32485OooO00o) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24034Oooo00O<String> c24034Oooo00O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f77681OooOoO0 = c24034Oooo00O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MoveToFolderFragment.this.new OooO00o(this.f77681OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r4, r6) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77680OooOo0o;
            MoveToFolderFragment moveToFolderFragment = MoveToFolderFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30220OooO0oO c30220OooO0oO = (C30220OooO0oO) moveToFolderFragment.f77658OooOoo.getValue();
                String str = this.f77681OooOoO0.f80942OooOo0o;
                this.f77680OooOo0o = 1;
                obj = c30220OooO0oO.OooO0o0(str, this);
                if (obj != enumC32485OooO00o) {
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
            C19413OooO00o c19413OooO00o = new C19413OooO00o(moveToFolderFragment, (String) obj, null);
            this.f77680OooOo0o = 2;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27279OooO00o f77685OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C27279OooO00o c27279OooO00o) {
            super(0);
            this.f77685OooOo0o = c27279OooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77685OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77686OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77686OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77686OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.MoveToFolderFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23674OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77687OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23674OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77687OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77687OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f77688OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooOO0O oooOO0O) {
            super(0);
            this.f77688OooOo0o = oooOO0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77688OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.MoveToFolderFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23675OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77689OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23675OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77689OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77689OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MoveToFolderFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.MoveToFolderFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23676OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77691OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23676OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77691OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77691OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.folder.MoveToFolderFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23677OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77692OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23677OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77692OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77692OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public MoveToFolderFragment() {
        C27279OooO00o c27279OooO00o = new C27279OooO00o(this, 2);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(c27279OooO00o));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77659OooOoo0 = new C22026ooOO(oooo0.OooO0O0(o0o0O000.OooO.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23675OooO0o0(interfaceC32440OooOO0OooO0O0), new C23674OooO0Oo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0o(new OooOO0O(this, 2)));
        this.f77658OooOoo = new C22026ooOO(oooo0.OooO0O0(C30220OooO0oO.class), new C23676OooO0oO(interfaceC32440OooOO0OooO0O02), new OooO(interfaceC32440OooOO0OooO0O02), new C23677OooO0oo(interfaceC32440OooOO0OooO0O02));
        this.f77660OooOooO = C20519OooO0Oo.OooO0OO(new C21971OooOO0o(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(MoveToFolderFragment moveToFolderFragment, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30227OooOo0 c30227OooOo0;
        moveToFolderFragment.getClass();
        if (abstractC32479OooO0OO instanceof C30227OooOo0) {
            c30227OooOo0 = (C30227OooOo0) abstractC32479OooO0OO;
            int i = c30227OooOo0.f107687OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30227OooOo0.f107687OooOoO = i - Integer.MIN_VALUE;
            } else {
                c30227OooOo0 = new C30227OooOo0(moveToFolderFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c30227OooOo0.f107685OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30227OooOo0.f107687OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C33747Oooo c33747Oooo = new C33747Oooo(new o000oOoO(moveToFolderFragment.OooOooo().f107618OooOO0o, str, 2));
            c30227OooOo0.f107686OooOo0o = moveToFolderFragment;
            c30227OooOo0.f107687OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c33747Oooo, c30227OooOo0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            moveToFolderFragment = c30227OooOo0.f107686OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        FolderVO vo = (FolderVO) objOooOOo;
        o0o0O000.OooO oooOOooOooo = moveToFolderFragment.OooOooo();
        OooOOO0.OooO0oO(vo, "vo");
        C33781o00o0O c33781o00o0O = oooOOooOooo.f107615OooO0oo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, vo);
        o0o0O000.OooO oooOOooOooo2 = moveToFolderFragment.OooOooo();
        FolderVO folderVO = (FolderVO) oooOOooOooo2.f107610OooO.getValue();
        if (!folderVO.isExpand()) {
            oooOOooOooo2.OooO0o(folderVO);
        }
        moveToFolderFragment.f77673OoooO = vo.getId();
        moveToFolderFragment.Oooo000();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(MoveToFolderFragment moveToFolderFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30230OooOoO c30230OooOoO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30230OooOoO) {
            c30230OooOoO = (C30230OooOoO) abstractC32479OooO0OO;
            int i2 = c30230OooOoO.f107708OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30230OooOoO.f107708OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30230OooOoO = new C30230OooOoO(moveToFolderFragment, abstractC32479OooO0OO);
            }
        }
        C30230OooOoO c30230OooOoO2 = c30230OooOoO;
        Object objShowNonVipFeatureLimitedDialog$default = c30230OooOoO2.f107707OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30230OooOoO2.f107708OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = moveToFolderFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30230OooOoO2.f107708OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30230OooOoO2, 6, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.CharSequence] */
    public final void OooOoo() {
        InputMethodManager inputMethodManager;
        String string;
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        EditText editText = this.f77669Oooo0o;
        if (editText == null) {
            OooOOO0.OooOOOO("inputNewFolderName");
            throw null;
        }
        Editable text = editText.getText();
        ?? string2 = (text == null || (string = text.toString()) == null) ? 0 : C33599OooOo0O.Oooooo0(string).toString();
        if (string2 == 0) {
            string2 = "";
        }
        c24034Oooo00O.f80942OooOo0o = string2;
        if (string2.length() == 0) {
            c24034Oooo00O.f80942OooOo0o = getString(R.string.folder_title_default);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(c24034Oooo00O, null), 2);
        Context context = getContext();
        if (context == null || (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService((C33163OooO0oO) context, InputMethodManager.class)) == null) {
            return;
        }
        EditText editText2 = this.f77669Oooo0o;
        if (editText2 != null) {
            inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
        } else {
            OooOOO0.OooOOOO("inputNewFolderName");
            throw null;
        }
    }

    public final void OooOoo0() {
        InputMethodManager inputMethodManager;
        if (this.f77661OooOooo) {
            this.f77661OooOooo = false;
            View view = this.f77667Oooo0O0;
            if (view == null) {
                OooOOO0.OooOOOO("createFolderSection");
                throw null;
            }
            view.setSelected(false);
            View view2 = this.f77671Oooo0oO;
            if (view2 == null) {
                OooOOO0.OooOOOO("dividerCreateFolder");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = this.f77672Oooo0oo;
            if (view3 == null) {
                OooOOO0.OooOOOO("createFolderBottomRow");
                throw null;
            }
            view3.setVisibility(8);
            View view4 = this.f77670Oooo0o0;
            if (view4 == null) {
                OooOOO0.OooOOOO("btnCancelNewFolder");
                throw null;
            }
            view4.setVisibility(8);
            ImageView imageView = this.f77668Oooo0OO;
            if (imageView == null) {
                OooOOO0.OooOOOO("icCreateFolder");
                throw null;
            }
            imageView.setImageResource(R.drawable.ic_ni_plus_button);
            EditText editText = this.f77669Oooo0o;
            if (editText == null) {
                OooOOO0.OooOOOO("inputNewFolderName");
                throw null;
            }
            if (editText.hasFocus()) {
                EditText editText2 = this.f77669Oooo0o;
                if (editText2 == null) {
                    OooOOO0.OooOOOO("inputNewFolderName");
                    throw null;
                }
                editText2.clearFocus();
                Context context = getContext();
                if (context == null || (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService((C33163OooO0oO) context, InputMethodManager.class)) == null) {
                    return;
                }
                EditText editText3 = this.f77669Oooo0o;
                if (editText3 != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText3.getWindowToken(), 0);
                } else {
                    OooOOO0.OooOOOO("inputNewFolderName");
                    throw null;
                }
            }
        }
    }

    public final void OooOooO() {
        InputMethodManager inputMethodManager;
        if (this.f77661OooOooo) {
            return;
        }
        this.f77661OooOooo = true;
        View view = this.f77667Oooo0O0;
        if (view == null) {
            OooOOO0.OooOOOO("createFolderSection");
            throw null;
        }
        view.setSelected(true);
        View view2 = this.f77671Oooo0oO;
        if (view2 == null) {
            OooOOO0.OooOOOO("dividerCreateFolder");
            throw null;
        }
        view2.setVisibility(0);
        View view3 = this.f77672Oooo0oo;
        if (view3 == null) {
            OooOOO0.OooOOOO("createFolderBottomRow");
            throw null;
        }
        view3.setVisibility(0);
        View view4 = this.f77670Oooo0o0;
        if (view4 == null) {
            OooOOO0.OooOOOO("btnCancelNewFolder");
            throw null;
        }
        view4.setVisibility(0);
        ImageView imageView = this.f77668Oooo0OO;
        if (imageView == null) {
            OooOOO0.OooOOOO("icCreateFolder");
            throw null;
        }
        imageView.setImageResource(R.drawable.ic_fragment_back);
        Context context = getContext();
        if (context == null || (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService((C33163OooO0oO) context, InputMethodManager.class)) == null) {
            return;
        }
        EditText editText = this.f77669Oooo0o;
        if (editText != null) {
            inputMethodManager.showSoftInput(editText, 1);
        } else {
            OooOOO0.OooOOOO("inputNewFolderName");
            throw null;
        }
    }

    public final o0o0O000.OooO OooOooo() {
        return (o0o0O000.OooO) this.f77659OooOoo0.getValue();
    }

    public final void Oooo000() {
        String str = this.f77673OoooO;
        if (str == null) {
            return;
        }
        C30216OooO00o c30216OooO00o = this.f77663Oooo0;
        if (c30216OooO00o == null) {
            OooOOO0.OooOOOO("folderAdapter");
            throw null;
        }
        List<T> list = c30216OooO00o.f66021OooO00o.f65811OooO0o;
        OooOOO0.OooO0o(list, "getCurrentList(...)");
        Iterator it = list.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (OooOOO0.OooO0O0(((FolderVO) it.next()).getId(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            RecyclerView recyclerView = this.f77666Oooo00o;
            if (recyclerView == null) {
                OooOOO0.OooOOOO("folderList");
                throw null;
            }
            recyclerView.post(new Runnable() { // from class: o0o0O000.OooOOOO
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView recyclerView2 = this.f107670OooOo0o.f77666Oooo00o;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollToPosition(i);
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("folderList");
                        throw null;
                    }
                }
            });
            this.f77673OoooO = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_move_to_folder, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f77664Oooo000 = view.findViewById(R.id.btn_cancel);
        this.f77665Oooo00O = view.findViewById(R.id.btn_confirm);
        this.f77666Oooo00o = (RecyclerView) view.findViewById(R.id.folder_list);
        this.f77667Oooo0O0 = view.findViewById(R.id.create_folder_section);
        this.f77668Oooo0OO = (ImageView) view.findViewById(R.id.ic_create_folder);
        this.f77670Oooo0o0 = view.findViewById(R.id.btn_cancel_new_folder);
        this.f77669Oooo0o = (EditText) view.findViewById(R.id.input_new_folder_name);
        this.f77671Oooo0oO = view.findViewById(R.id.divider_create_folder);
        this.f77672Oooo0oo = view.findViewById(R.id.create_folder_bottom_row);
        this.f77662Oooo = (ImageView) view.findViewById(R.id.iv_folder_color_preview);
        this.f77675OoooO00 = (RecyclerView) view.findViewById(R.id.folder_color_list);
        this.f77676OoooO0O = view.findViewById(R.id.btn_create_folder);
        View view2 = this.f77664Oooo000;
        if (view2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        view2.setOnClickListener(new ViewOnClickListenerC28181Oooo00O(this, 3));
        View view3 = this.f77665Oooo00O;
        if (view3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        view3.setOnClickListener(new ViewOnClickListenerC28182Oooo00o(this, 3));
        OooOooo().f107614OooO0oO.clear();
        ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr = (ItemDataOfMovingToFolder[]) this.f77660OooOooO.getValue();
        ArrayList arrayList = new ArrayList();
        for (ItemDataOfMovingToFolder itemDataOfMovingToFolder : itemDataOfMovingToFolderArr) {
            if (itemDataOfMovingToFolder.f77653OooOoO0 == 1) {
                arrayList.add(itemDataOfMovingToFolder);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((ItemDataOfMovingToFolder) it.next()).f77651OooOo;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            OooOooo().f107614OooO0oO.add((String) it2.next());
        }
        RecyclerView recyclerView = this.f77666Oooo00o;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("folderList");
            throw null;
        }
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f77666Oooo00o;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("folderList");
            throw null;
        }
        recyclerView2.setNestedScrollingEnabled(true);
        C30216OooO00o c30216OooO00o = new C30216OooO00o(C30216OooO00o.C20050OooO00o.f107625OooO00o);
        c30216OooO00o.f107624OooO0O0 = new ViewOnClickListenerC28701OooOOo0(this, 2);
        this.f77663Oooo0 = c30216OooO00o;
        RecyclerView recyclerView3 = this.f77666Oooo00o;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("folderList");
            throw null;
        }
        recyclerView3.setAdapter(c30216OooO00o);
        o0o0O000.OooO0OO oooO0OO = new o0o0O000.OooO0OO(R.layout.item_folder_color);
        oooO0OO.f107632OooO0OO = new ViewOnClickListenerC26290Oooo0o0(this, 5);
        this.f77674OoooO0 = oooO0OO;
        RecyclerView recyclerView4 = this.f77675OoooO00;
        if (recyclerView4 == null) {
            OooOOO0.OooOOOO("folderColorList");
            throw null;
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecyclerView recyclerView5 = this.f77675OoooO00;
        if (recyclerView5 == null) {
            OooOOO0.OooOOOO("folderColorList");
            throw null;
        }
        o0o0O000.OooO0OO oooO0OO2 = this.f77674OoooO0;
        if (oooO0OO2 == null) {
            OooOOO0.OooOOOO("folderColorAdapter");
            throw null;
        }
        recyclerView5.setAdapter(oooO0OO2);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0o0O000.OooOo(this, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30231OooOoO0(this, null), 3);
        ImageView imageView = this.f77668Oooo0OO;
        if (imageView == null) {
            OooOOO0.OooOOOO("icCreateFolder");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28688OooO0Oo(this, 2));
        View view4 = this.f77670Oooo0o0;
        if (view4 == null) {
            OooOOO0.OooOOOO("btnCancelNewFolder");
            throw null;
        }
        view4.setOnClickListener(new ViewOnClickListenerC28191OoooO00(this, 3));
        EditText editText = this.f77669Oooo0o;
        if (editText == null) {
            OooOOO0.OooOOOO("inputNewFolderName");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0O000.OooOOOo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view5, boolean z) {
                MoveToFolderFragment moveToFolderFragment = this.f107671OooO00o;
                if (z) {
                    moveToFolderFragment.OooOooO();
                    return;
                }
                EditText editText2 = moveToFolderFragment.f77669Oooo0o;
                if (editText2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputNewFolderName");
                    throw null;
                }
                Editable text = editText2.getText();
                if (text == null || C33599OooOo0O.Oooo0o0(text)) {
                    moveToFolderFragment.OooOoo0();
                }
            }
        });
        EditText editText2 = this.f77669Oooo0o;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputNewFolderName");
            throw null;
        }
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0O000.OooOOo0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                this.f107676OooOo0o.OooOoo();
                return true;
            }
        });
        View view5 = this.f77676OoooO0O;
        if (view5 == null) {
            OooOOO0.OooOOOO("btnCreateFolder");
            throw null;
        }
        view5.setOnClickListener(new ViewOnClickListenerC26295OoooO00(this, 4));
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30224OooOOo(this, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new C30226OooOOoo(this, null), 3);
    }
}

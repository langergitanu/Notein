package com.orion.notein.p607ui.noteeditor.textstylebar;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000Oo0O.C24530OooOo0O;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28766o0000Oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29065OooOo00;
import o0OoOOO0.C29066OooOo0O;
import o0OoOOOo.C29096OooO0Oo;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.InterfaceC29094OooO0O0;
import o0OoOOOo.InterfaceC29095OooO0OO;
import o0OoOOo0.C29185OooO0o;
import o0Ooo0oo.C29553o00O0O;
import o0OooOo.C29576OooO0O0;
import o0o000oO.C29794OooOOOO;
import o0o000oO.C29795OooOOOo;
import o0o00Ooo.C29920OooO0oo;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/textstylebar/TextStyleBarChildFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextStyleBarChildFragment extends Hilt_TextStyleBarChildFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f76429OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f76430OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public InterfaceC21987OooOoo f76431OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ConstraintLayout f76432OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f76433Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f76434Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageView f76435Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ConstraintLayout f76436Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f76437Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f76438Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ConstraintLayout f76439Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ConstraintLayout f76440Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ImageView f76441Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RecyclerView f76442Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f76443Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C29185OooO0o f76444OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ConstraintLayout f76445OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView f76446OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f76447OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C29553o00O0O f76448OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f76449OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f76450OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f76451OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o0o00Ooo.OooOO0 f76452OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public C23383OooO0Oo f76453OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO f76454Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o f76455Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public C29096OooO0Oo f76456OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public C29108OooOOo f76457OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C22026ooOO f76458o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76459OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76459OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76459OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TextStyleBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements InterfaceC29094OooO0O0 {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$initTextFullStylePopupWindow$1$1$onTextColorSetSelected$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK}, m80625m = "invokeSuspend")
        public static final class C19387OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f76462OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76463OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C29920OooO0oo f76464OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19387OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, C29920OooO0oo c29920OooO0oo, Continuation<? super C19387OooO00o> continuation) {
                super(2, continuation);
                this.f76462OooOo = textStyleBarChildFragment;
                this.f76464OooOoO0 = c29920OooO0oo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19387OooO00o(this.f76462OooOo, this.f76464OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19387OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76463OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76463OooOo0o = 1;
                    if (TextStyleBarChildFragment.OooOoO(this.f76462OooOo, this.f76464OooOoO0, this) == enumC32485OooO00o) {
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

        public OooO00o() {
        }

        @Override // o0OoOOOo.InterfaceC29094OooO0O0
        public final void OooO00o(int i, boolean z) {
            TextStyleBarChildFragment.this.OooOoOO().OooOO0o(i, z);
        }

        @Override // o0OoOOOo.InterfaceC29094OooO0O0
        public final void OooO0O0(C29920OooO0oo c29920OooO0oo) {
            TextStyleBarChildFragment textStyleBarChildFragment = TextStyleBarChildFragment.this;
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(textStyleBarChildFragment), null, null, new C19387OooO00o(textStyleBarChildFragment, c29920OooO0oo, null), 3);
        }

        @Override // o0OoOOOo.InterfaceC29094OooO0O0
        public final void OooO0OO(String id, String name) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(TextStyleBarChildFragment.this), new C28766o0000Oo(name, id));
        }

        @Override // o0OoOOOo.InterfaceC29094OooO0O0
        public final void OooO0Oo(String id) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            TextStyleBarChildFragment.this.OooOoOO().OooO0o0(id);
        }

        @Override // o0OoOOOo.InterfaceC29094OooO0O0
        public final void OooO0o0(int i, int i2) {
            TextStyleBarChildFragment textStyleBarChildFragment = TextStyleBarChildFragment.this;
            textStyleBarChildFragment.OooOoOO().OooOOO0(i);
            textStyleBarChildFragment.OooOoOO().OooO(i2);
            C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0oOooOoOO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29065OooOo00(c29051OooOO0oOooOoOO, i, null), 2);
        }
    }

    public static final class OooO0O0 implements InterfaceC29095OooO0OO {
        public OooO0O0() {
        }

        @Override // o0OoOOOo.InterfaceC29095OooO0OO
        public final void OooO0Oo(boolean z) {
            TextStyleBarChildFragment textStyleBarChildFragment = TextStyleBarChildFragment.this;
            ImageView imageView = textStyleBarChildFragment.f76447OoooO0O;
            if (imageView != null) {
                imageView.setActivated(z);
            }
            ImageView imageView2 = textStyleBarChildFragment.f76443Oooo0oo;
            if (imageView2 != null) {
                imageView2.setActivated(z);
            }
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return TextStyleBarChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23565OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23565OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return TextStyleBarChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29576OooO0O0 f76468OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C29576OooO0O0 c29576OooO0O0) {
            super(0);
            this.f76468OooOo0o = c29576OooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76468OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23566OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23566OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return TextStyleBarChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23567OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76470OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23567OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76470OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76470OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23568OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76471OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23568OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76471OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76471OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24530OooOo0O f76472OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(C24530OooOo0O c24530OooOo0O) {
            super(0);
            this.f76472OooOo0o = c24530OooOo0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76472OooOo0o.invoke();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76473OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76473OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76473OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23569OooOO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76474OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23569OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76474OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76474OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76475OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76475OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76475OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TextStyleBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TextStyleBarChildFragment() {
        C29576OooO0O0 c29576OooO0O0 = new C29576OooO0O0(this, 1);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0o(c29576OooO0O0));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f76430OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23567OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23568OooO0oo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooOO0(new C24530OooOo0O(this, 1)));
        this.f76429OooOoo = new C22026ooOO(oooo0.OooO0O0(C29051OooOO0o.class), new OooOO0O(interfaceC32440OooOO0OooO0O02), new OooOOO0(interfaceC32440OooOO0OooO0O02), new C23569OooOO0o(interfaceC32440OooOO0OooO0O02));
        this.f76444OoooO = new C29185OooO0o(R.layout.item_pen_bar_text_style);
        int i = 0;
        this.f76448OoooOO0 = new C29553o00O0O(i, 3, i);
        this.f76458o000oOoO = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0OO(), new C23566OooO0o0(), new C23565OooO0Oo());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(TextStyleBarChildFragment textStyleBarChildFragment, C29920OooO0oo colorSetVO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29794OooOOOO c29794OooOOOO;
        boolean zBooleanValue;
        textStyleBarChildFragment.getClass();
        if (abstractC32479OooO0OO instanceof C29794OooOOOO) {
            c29794OooOOOO = (C29794OooOOOO) abstractC32479OooO0OO;
            int i = c29794OooOOOO.f105760OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29794OooOOOO.f105760OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29794OooOOOO = new C29794OooOOOO(textStyleBarChildFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooOooo = c29794OooOOOO.f105759OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29794OooOOOO.f105760OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOooo);
            if (colorSetVO.f106162OooO0o != 2) {
                zBooleanValue = false;
                if (!zBooleanValue) {
                    C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(colorSetVO, "colorSetVO");
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0oOooOoOO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29066OooOo0O(c29051OooOO0oOooOoOO, colorSetVO, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            c29794OooOOOO.f105757OooOo0o = textStyleBarChildFragment;
            c29794OooOOOO.f105756OooOo = colorSetVO;
            c29794OooOOOO.f105760OooOoOO = 1;
            objOooOooo = textStyleBarChildFragment.OooOooo(20, c29794OooOOOO);
            if (objOooOooo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            colorSetVO = c29794OooOOOO.f105756OooOo;
            textStyleBarChildFragment = c29794OooOOOO.f105757OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOooo);
        }
        Boolean bool = (Boolean) objOooOooo;
        if (bool.booleanValue()) {
            C29108OooOOo c29108OooOOo = textStyleBarChildFragment.f76457OooooOO;
            if (c29108OooOOo != null) {
                c29108OooOOo.dismiss();
            }
            o0o00Ooo.OooOO0 oooOO02 = textStyleBarChildFragment.f76452OoooOoO;
            if (oooOO02 != null) {
                oooOO02.dismiss();
            }
        }
        zBooleanValue = bool.booleanValue();
        if (!zBooleanValue) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final C29051OooOO0o OooOoOO() {
        return (C29051OooOO0o) this.f76429OooOoo.getValue();
    }

    public final void OooOoo() {
        if (this.f76457OooooOO == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29108OooOOo c29108OooOOo = new C29108OooOOo(contextRequireContext);
            c29108OooOOo.OooO0OO(OooOoOO(), C21989OooOooO.OooO00o(this), new OooO00o(), new OooO0O0());
            this.f76457OooooOO = c29108OooOOo;
        }
    }

    public final void OooOoo0() {
        o0o00Ooo.OooOO0 oooOO02 = this.f76452OoooOoO;
        if (oooOO02 != null) {
            oooOO02.dismiss();
        }
        C23383OooO0Oo c23383OooO0Oo = this.f76453OoooOoo;
        if (c23383OooO0Oo != null) {
            c23383OooO0Oo.dismiss();
        }
        com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO oooO0OO = this.f76454Ooooo00;
        if (oooO0OO != null) {
            oooO0OO.dismiss();
        }
        com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = this.f76455Ooooo0o;
        if (oooO00o != null) {
            oooO00o.dismiss();
        }
        C29096OooO0Oo c29096OooO0Oo = this.f76456OooooO0;
        if (c29096OooO0Oo != null) {
            c29096OooO0Oo.dismiss();
        }
        C29108OooOOo c29108OooOOo = this.f76457OooooOO;
        if (c29108OooOOo != null) {
            c29108OooOOo.dismiss();
        }
    }

    public final void OooOooO(boolean z) {
        ((com.orion.notein.p607ui.noteeditor.OooO0OO) this.f76430OooOoo0.getValue()).Oooo0oO(z ? OooO0OO.OooO00o.f73440OooOo : OooO0OO.OooO00o.f73441OooOo0o);
        Boolean boolValueOf = Boolean.valueOf(z);
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            noteEditorContainerFragment.Oooo0OO(6, boolValueOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOooo(int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29795OooOOOo c29795OooOOOo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C29795OooOOOo) {
            c29795OooOOOo = (C29795OooOOOo) abstractC32479OooO0OO;
            int i2 = c29795OooOOOo.f105763OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29795OooOOOo.f105763OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29795OooOOOo = new C29795OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        C29795OooOOOo c29795OooOOOo2 = c29795OooOOOo;
        Object objShowNonVipFeatureLimitedDialog$default = c29795OooOOOo2.f105762OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29795OooOOOo2.f105763OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29795OooOOOo2.f105763OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29795OooOOOo2, 6, null);
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
    public final void onDestroyView() {
        super.onDestroyView();
        OooOoo0();
    }
}

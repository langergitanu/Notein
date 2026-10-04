package com.orion.notein.p607ui.noteeditor.noteswitch;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.core.os.PersistableBundleKt;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.OooOo;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0o0oO.o000000;
import o0O0o0oO.o0OO00O;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0o0oO.oo0o0Oo;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.C28257Oooo0o;
import o0Oo0o0o.oo000o;
import o0OoO0oo.C28957o00oOo0O;
import o0o0O0o.C30294OooO0OO;
import o0oOO0Oo.C30801OooO00o;
import o0oOO0Oo.C30810OooOO0O;
import o0oOO0Oo.C30811OooOO0o;
import o0oOO0Oo.C30812OooOOO;
import o0oOO0Oo.C30821OooOo0O;
import o0oOoOoo.C31102OooO00o;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/noteswitch/NoteEditorSwitchFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteEditorSwitchFragment extends Hilt_NoteEditorSwitchFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f74710OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f74711OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f74712OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f74713OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C31102OooO00o f74714Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74715Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74716Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30801OooO00o f74717Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C30294OooO0OO f74718Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23437OooO0oo f74719OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C23437OooO0oo c23437OooO0oo) {
            super(0);
            this.f74719OooOo0o = c23437OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74719OooOo0o.invoke();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$onViewCreated$3$1$1$1", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {108}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74721OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorSwitchFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74721OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f74721OooOo0o = 1;
                if (NoteEditorSwitchFragment.OooOoO(NoteEditorSwitchFragment.this, 8, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 implements SearchView.OooOOO0 {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            C30821OooOo0O c30821OooOo0OOooOooO = NoteEditorSwitchFragment.this.OooOooO();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = c30821OooOo0OOooOooO.f110159OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = c30821OooOo0OOooOooO.f110165OooOO0;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$onViewCreated$5$1", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {138, 142}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74724OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorSwitchFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r9 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Resources resources;
            Configuration configuration;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74724OooOo0o;
            NoteEditorSwitchFragment noteEditorSwitchFragment = NoteEditorSwitchFragment.this;
            Integer num = null;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f74724OooOo0o = 1;
                obj = NoteEditorSwitchFragment.OooOoO(noteEditorSwitchFragment, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) obj;
                if (((Number) ((C32443OooOOO) noteEditorSwitchFragment.OooOoo().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue() == 0) {
                    Context context = noteEditorSwitchFragment.getContext();
                    if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                        num = new Integer(configuration.orientation);
                    }
                    if (noteEditorSwitchFragment.getResources().getConfiguration().screenWidthDp < 480 || (num != null && num.intValue() == 1)) {
                        noteEditorSwitchFragment.OooOoo().OooOo0O(str, "", new PointF(0.0f, 0.0f), null, false);
                    } else {
                        noteEditorSwitchFragment.OooOoo().OooOo(str, "", new PointF(0.0f, 0.0f), null, false);
                    }
                } else {
                    noteEditorSwitchFragment.OooOoo().OooOOoo(str);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            C30821OooOo0O c30821OooOo0OOooOooO = noteEditorSwitchFragment.OooOooO();
            String string = noteEditorSwitchFragment.requireContext().getString(R.string.note_title_scratch);
            OooOOO0.OooO0o(string, "getString(...)");
            String str2 = noteEditorSwitchFragment.OooOoo().f73368OooOo0O;
            this.f74724OooOo0o = 2;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30812OooOOO(c30821OooOo0OOooOooO, string, str2, null), this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23434OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28257Oooo0o f74725OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23434OooO0Oo(C28257Oooo0o c28257Oooo0o) {
            super(0);
            this.f74725OooOo0o = c28257Oooo0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74725OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74726OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74726OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74726OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23435OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74727OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23435OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74727OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74727OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23436OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74728OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23436OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74728OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74728OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorSwitchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23437OooO0oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23437OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorSwitchFragment.this;
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74731OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74731OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74731OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74732OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74732OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74732OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23438OooOO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74733OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23438OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74733OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74733OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorSwitchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public NoteEditorSwitchFragment() {
        C28257Oooo0o c28257Oooo0o = new C28257Oooo0o(this, 2);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23434OooO0Oo(c28257Oooo0o));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f74711OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23435OooO0o0(interfaceC32440OooOO0OooO0O0), new C23436OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO(new C23437OooO0oo()));
        this.f74710OooOoo = new C22026ooOO(oooo0.OooO0O0(C30821OooOo0O.class), new OooOO0(interfaceC32440OooOO0OooO0O02), new C23438OooOO0o(interfaceC32440OooOO0OooO0O02), new OooOO0O(interfaceC32440OooOO0OooO0O02));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(NoteEditorSwitchFragment noteEditorSwitchFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30811OooOO0o c30811OooOO0o;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30811OooOO0o) {
            c30811OooOO0o = (C30811OooOO0o) abstractC32479OooO0OO;
            int i2 = c30811OooOO0o.f110128OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30811OooOO0o.f110128OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30811OooOO0o = new C30811OooOO0o(noteEditorSwitchFragment, abstractC32479OooO0OO);
            }
        }
        C30811OooOO0o c30811OooOO0o2 = c30811OooOO0o;
        Object objShowNonVipFeatureLimitedDialog$default = c30811OooOO0o2.f110127OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30811OooOO0o2.f110128OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = noteEditorSwitchFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30811OooOO0o2.f110128OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30811OooOO0o2, 6, null);
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

    public final void OooOoOO() {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = fragmentRequireParentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) fragmentRequireParentFragment : null;
        View view = noteEditorContainerFragment != null ? noteEditorContainerFragment.getView() : null;
        DrawerLayout drawerLayout = view instanceof DrawerLayout ? (DrawerLayout) view : null;
        if (drawerLayout != null) {
            drawerLayout.OooO0Oo(false);
        }
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f74711OooOoo0.getValue();
    }

    public final LockNoteFragment OooOoo0() {
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null) {
            return (LockNoteFragment) fragmentOooOooo;
        }
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
        oooO00oOooO0OO.OooOO0O();
        return lockNoteFragment;
    }

    public final C30821OooOo0O OooOooO() {
        return (C30821OooOo0O) this.f74710OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_note_editor_switch, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C30294OooO0OO c30294OooO0OO = this.f74718Oooo0O0;
        if (c30294OooO0OO != null) {
            c30294OooO0OO.OooO00o();
        }
        C31102OooO00o c31102OooO00o = this.f74714Oooo0;
        if (c31102OooO00o == null) {
            OooOOO0.OooOOOO("noteItemMoreMenu");
            throw null;
        }
        c31102OooO00o.OooO00o();
        Oooo0O0.OooOO0.OooO00o(this);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o0oOO0Oo.OooO0oo] */
    /* JADX WARN: Type inference failed for: r0v12, types: [o0oOO0Oo.OooO0Oo] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f74712OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new oo000o(this, 7));
        Context context = getContext();
        if (context == null || !C28039OooO00o.OooO00o((C33163OooO0oO) context)) {
            View view2 = this.f74712OooOooO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            view2.setTranslationY(0.0f);
        } else {
            View view3 = this.f74712OooOooO;
            if (view3 == null) {
                OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            view3.setTranslationY(o000000O.OooO0o0(10.0f));
        }
        View viewFindViewById2 = view.findViewById(R.id.newbie_guide);
        this.f74713OooOooo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnGuide");
            throw null;
        }
        int i = 6;
        viewFindViewById2.setOnClickListener(new o0OOO0o(this, i));
        view.findViewById(R.id.iv_sort).setOnClickListener(new o0Oo0oo(this, i));
        SearchView searchView = (SearchView) view.findViewById(R.id.search_box);
        if (searchView == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        searchView.setOnQueryTextListener(new OooO0O0());
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f74714Oooo0 = new C31102OooO00o(contextRequireContext, new o0OoO000.OooO0OO(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.cl_create_new);
        this.f74715Oooo000 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnCreate");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new o0OO00O(this, 6));
        View viewFindViewById4 = view.findViewById(R.id.btn_option_of_creation);
        this.f74716Oooo00O = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnCreateOption");
            throw null;
        }
        viewFindViewById4.setOnClickListener(new oo0o0Oo(this, 4));
        View view4 = this.f74715Oooo000;
        if (view4 == null) {
            OooOOO0.OooOOOO("btnCreate");
            throw null;
        }
        view4.setOnContextClickListener(new View.OnContextClickListener() { // from class: o0oOO0Oo.OooO0oO
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view5) {
                View view6 = this.f110110OooO00o.f74716Oooo00O;
                if (view6 != null) {
                    return view6.performClick();
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnCreateOption");
                throw null;
            }
        });
        C30801OooO00o c30801OooO00o = new C30801OooO00o(C30801OooO00o.C20127OooO00o.f110092OooO00o);
        this.f74717Oooo00o = c30801OooO00o;
        c30801OooO00o.f110089OooO0O0 = new o000000(this, 2);
        c30801OooO00o.f110090OooO0OO = new View.OnContextClickListener() { // from class: o0oOO0Oo.OooO0oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view5) {
                Object tag = view5.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110111OooO00o;
                C31102OooO00o c31102OooO00o = noteEditorSwitchFragment.f74714Oooo0;
                if (c31102OooO00o != null) {
                    c31102OooO00o.OooO0O0(view5, new C31103OooO0O0(noteVO.getId(), noteVO.isSelected()), ((Number) ((C32443OooOOO) noteEditorSwitchFragment.OooOoo().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue(), false, false, 0);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                throw null;
            }
        };
        c30801OooO00o.f110091OooO0Oo = new View.OnLongClickListener() { // from class: o0oOO0Oo.OooO0Oo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(final View view5) {
                Object tag = view5.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag;
                final NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110103OooO00o;
                LockNoteFragment lockNoteFragmentOooOoo0 = noteEditorSwitchFragment.OooOoo0();
                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorSwitchFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, C21989OooOooO.OooO00o(viewLifecycleOwner), OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0oOO0Oo.OooO0o0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        String id = noteVO.getId();
                        View viewFindViewById5 = view5.findViewById(R.id.cover_wrapper);
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById5, "findViewById(...)");
                        NoteEditorSwitchFragment noteEditorSwitchFragment2 = noteEditorSwitchFragment;
                        noteEditorSwitchFragment2.getClass();
                        ClipData.Item item = new ClipData.Item(id);
                        int fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(noteEditorSwitchFragment2);
                        ClipData clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"text/plain"}, item);
                        clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, 4), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, Integer.valueOf(fragmentHostId))));
                        viewFindViewById5.startDragAndDrop(clipData, new C28957o00oOo0O(viewFindViewById5), null, 257);
                        noteEditorSwitchFragment2.OooOoOO();
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return true;
            }
        };
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_recent_notes);
        if (recyclerView == null) {
            OooOOO0.OooOOOO("recentNoteList");
            throw null;
        }
        C30801OooO00o c30801OooO00o2 = this.f74717Oooo00o;
        if (c30801OooO00o2 == null) {
            OooOOO0.OooOOOO("recentNoteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30801OooO00o2);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30810OooOO0O(this, null), 3);
    }
}

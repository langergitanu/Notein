package o0o00oo;

import android.app.role.RoleManager;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment2;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26319o0000Oo0;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26327o0000oO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$checkOtherFragmentVisibility$1", m80623f = "NoteListContainerFragment.kt", m80624l = {549}, m80625m = "invokeSuspend")
public final class C30103OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107174OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107175OooOo0o;

    /* JADX INFO: renamed from: o0o00oo.OooOO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$checkOtherFragmentVisibility$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {567}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107176OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107177OooOo0o;

        /* JADX INFO: renamed from: o0o00oo.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC20041OooO00o implements View.OnClickListener {
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX INFO: renamed from: o0o00oo.OooOO0O$OooO00o$OooO0O0 */
        public static final class OooO0O0 implements View.OnClickListener {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107178OooOo0o;

            public OooO0O0(NoteListContainerFragment noteListContainerFragment) {
                this.f107178OooOo0o = noteListContainerFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107178OooOo0o.f77374o00oO0o.OooO00o(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
            }
        }

        /* JADX INFO: renamed from: o0o00oo.OooOO0O$OooO00o$OooO0OO */
        public static final class OooO0OO implements View.OnClickListener {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107179OooOo0o;

            public OooO0OO(NoteListContainerFragment noteListContainerFragment) {
                this.f107179OooOo0o = noteListContainerFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C26320o0000OoO c26320o0000OoOOooOooO = this.f107179OooOo0o.OooOooO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c26320o0000OoOOooOooO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C26327o0000oO0(null, c26320o0000OoOOooOooO), 2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107176OooOo = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107176OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            RoleManager roleManager;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107177OooOo0o;
            NoteListContainerFragment noteListContainerFragment = this.f107176OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (Build.VERSION.SDK_INT >= 34 && (roleManager = noteListContainerFragment.f77342Oooo00O) != null) {
                    if (!roleManager.isRoleAvailable("android.app.role.NOTES")) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteListContainerFragment");
                        c20358OooO00o.OooO0o0("checkOtherFragmentVisibility: role not available", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (roleManager.isRoleHeld("android.app.role.NOTES")) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("NoteListContainerFragment");
                        c20358OooO00o2.OooO0o0("checkOtherFragmentVisibility: role already held", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C26320o0000OoO c26320o0000OoOOooOooO = noteListContainerFragment.OooOooO();
                    this.f107177OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26319o0000Oo0(null, c26320o0000OoOOooOooO), this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("NoteListContainerFragment");
                c20358OooO00o3.OooO0o0("checkOtherFragmentVisibility: no need to show default notes app dialog", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            if (noteListContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment2") != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("NoteListContainerFragment");
                c20358OooO00o4.OooO0o0("checkOtherFragmentVisibility: default notes app dialog already shown", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            OooO0O0 oooO0O0 = new OooO0O0(noteListContainerFragment);
            ViewOnClickListenerC20041OooO00o viewOnClickListenerC20041OooO00o = new ViewOnClickListenerC20041OooO00o();
            OooO0OO oooO0OO = new OooO0OO(noteListContainerFragment);
            String string = noteListContainerFragment.getString(R.string.default_notes_app_dialog_title);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = noteListContainerFragment.getString(R.string.default_notes_app_dialog_content);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment2(string, string2, viewOnClickListenerC20041OooO00o, oooO0O0, oooO0OO).show(noteListContainerFragment.getChildFragmentManager(), "TipsDialogFragment2");
            noteListContainerFragment.OooOooO().f90254Ooooo0o = true;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30103OooOO0O(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30103OooOO0O> continuation) {
        super(2, continuation);
        this.f107174OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30103OooOO0O(this.f107174OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30103OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107175OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            NoteListContainerFragment noteListContainerFragment = this.f107174OooOo;
            OooO00o oooO00o = new OooO00o(noteListContainerFragment, null);
            this.f107175OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(noteListContainerFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

package o0o000oo;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o0OoO0oo.C28755o00000o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0o000oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC29820OooOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105798OooOo0o;

    /* JADX INFO: renamed from: o0o000oo.OooOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$createExportNotePopupWindow$exportClickListener$1$onClick$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {446, 461}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105799OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105800OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f105801OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation continuation) {
            super(2, continuation);
            this.f105799OooOo = baseToolbarChildFragment;
            this.f105801OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105801OooOoO0, this.f105799OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        
            if (com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment.OooOoo0(r10.f105799OooOo, r5, r6, 0, r8, r10) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
        
            if (com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment.OooOoo0(r10.f105799OooOo, r5, r6, 1, r8, r10) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C28755o00000o0 c28755o00000o0;
            String string;
            String string2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105800OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105799OooOo;
                NoteContent noteContent = (NoteContent) baseToolbarChildFragment.Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                NoteMeta noteMeta = (NoteMeta) baseToolbarChildFragment.Oooo0OO().f73395OoooOo0.f121747OooOo0o.getValue();
                View view = this.f105801OooOoO0;
                switch (view.getId()) {
                    case R.id.cl_export_multi_page /* 2131297093 */:
                        if (!noteContent.getUnboundedNote() && (c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO) != null) {
                            c28755o00000o0.OooO0Oo();
                        }
                        break;
                    case R.id.cl_export_single_page /* 2131297095 */:
                        if (noteMeta == null || (string = noteMeta.getTitle()) == null) {
                            string = baseToolbarChildFragment.getString(R.string.app_name);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        } else if (C33599OooOo0O.Oooo0o0(string)) {
                            string = baseToolbarChildFragment.getString(R.string.app_name);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        }
                        String str = string;
                        Context context = view.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                        this.f105800OooOo0o = 1;
                        break;
                    case R.id.cl_export_the_whole_note /* 2131297096 */:
                        if (noteMeta == null || (string2 = noteMeta.getTitle()) == null) {
                            string2 = baseToolbarChildFragment.getString(R.string.app_name);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        } else if (C33599OooOo0O.Oooo0o0(string2)) {
                            string2 = baseToolbarChildFragment.getString(R.string.app_name);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        }
                        String str2 = string2;
                        Context context2 = view.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
                        this.f105800OooOo0o = 2;
                        break;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public ViewOnClickListenerC29820OooOo0(BaseToolbarChildFragment baseToolbarChildFragment) {
        this.f105798OooOo0o = baseToolbarChildFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105798OooOo0o;
        baseToolbarChildFragment.Ooooo0o();
        baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new OooO00o(v, baseToolbarChildFragment, null), 3);
    }
}

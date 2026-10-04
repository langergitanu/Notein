package o0o000oO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import kotlin.coroutines.Continuation;
import o000o0O0.C24564OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29056OooOOO;
import o0OoOOO0.C29062OooOOoo;
import o0oOoOo.C31087Oooooo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o000oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29785OooOO0 implements OooO00o.InterfaceC19278OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105699OooO00o;

    /* JADX INFO: renamed from: o0o000oO.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$initTextFontPopupWindow$1$1$onImportFontClick$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {214}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105700OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105701OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105700OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105700OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105701OooOo0o;
            TextStyleBarChildFragment textStyleBarChildFragment = this.f105700OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f105701OooOo0o = 1;
                obj = textStyleBarChildFragment.OooOooo(7, this);
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
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textStyleBarChildFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_importFontDialogFragment));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o000oO.OooOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$initTextFontPopupWindow$1$1$onItemClick$1$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {196}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105703OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C31087Oooooo0 f105704OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33163OooO0oO f105705OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TextStyleBarChildFragment textStyleBarChildFragment, C33163OooO0oO c33163OooO0oO, C31087Oooooo0 c31087Oooooo0, Continuation continuation) {
            super(2, continuation);
            this.f105702OooOo = textStyleBarChildFragment;
            this.f105705OooOoO0 = c33163OooO0oO;
            this.f105704OooOoO = c31087Oooooo0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f105702OooOo, this.f105705OooOoO0, this.f105704OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105703OooOo0o;
            String str = this.f105704OooOoO.f110946OooO00o;
            TextStyleBarChildFragment textStyleBarChildFragment = this.f105702OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                this.f105703OooOo0o = 1;
                C33163OooO0oO c33163OooO0oO = this.f105705OooOoO0;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29056OooOOO(c33163OooO0oO, str, null, c29051OooOO0oOooOoOO), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Typeface typeface = (Typeface) obj;
            if (typeface != null) {
                textStyleBarChildFragment.OooOoOO().OooOO0(str, typeface);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C29785OooOO0(TextStyleBarChildFragment textStyleBarChildFragment) {
        this.f105699OooO00o = textStyleBarChildFragment;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO00o() {
        TextStyleBarChildFragment textStyleBarChildFragment = this.f105699OooO00o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(textStyleBarChildFragment), null, null, new OooO00o(textStyleBarChildFragment, null), 3);
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0O0(boolean z) {
        TextView textView = this.f105699OooO00o.f76437Oooo00o;
        if (textView != null) {
            textView.setActivated(z);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontName");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0OO(final String fontName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontName, "fontName");
        final TextStyleBarChildFragment textStyleBarChildFragment = this.f105699OooO00o;
        Context context = textStyleBarChildFragment.getContext();
        if (context != null) {
            String string = context.getString(R.string.title_delete_font);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = context.getString(R.string.content_delete_font);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            final C33163OooO0oO c33163OooO0oO = (C33163OooO0oO) context;
            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new View.OnClickListener() { // from class: o0o000oO.OooO0o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextStyleBarChildFragment textStyleBarChildFragment2 = textStyleBarChildFragment;
                    C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment2.OooOoOO();
                    C33163OooO0oO c33163OooO0oO2 = c33163OooO0oO;
                    String str = fontName;
                    c29051OooOO0oOooOoOO.OooO0oo(c33163OooO0oO2, str);
                    C29051OooOO0o c29051OooOO0oOooOoOO2 = textStyleBarChildFragment2.OooOoOO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0oOooOoOO2);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29062OooOOoo(c29051OooOO0oOooOoOO2, str, null), 2);
                }
            }, null, null, 1, null, 384).show(textStyleBarChildFragment.getChildFragmentManager(), "TipsDialogFragment");
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0Oo(C31087Oooooo0 c31087Oooooo0) {
        Context context;
        TextStyleBarChildFragment textStyleBarChildFragment = this.f105699OooO00o;
        Typeface typeface = c31087Oooooo0.f110947OooO0O0;
        if (typeface != null) {
            textStyleBarChildFragment.OooOoOO().OooOO0(c31087Oooooo0.f110946OooO00o, typeface);
        } else {
            if (c31087Oooooo0.f110949OooO0Oo || (context = textStyleBarChildFragment.getContext()) == null) {
                return;
            }
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(textStyleBarChildFragment), null, null, new OooO0O0(textStyleBarChildFragment, (C33163OooO0oO) context, c31087Oooooo0, null), 3);
        }
    }
}

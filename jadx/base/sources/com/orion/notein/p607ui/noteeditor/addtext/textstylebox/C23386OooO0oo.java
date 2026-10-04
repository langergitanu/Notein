package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29056OooOOO;
import o0OoOOO0.C29062OooOOoo;
import o0OoOOOo.OooOo;
import o0oOoOo.C31087Oooooo0;
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

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23386OooO0oo implements OooO00o.InterfaceC19278OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBox f74128OooO00o;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$setTextBoxFontPopupWindowListener$1$onItemClick$1", m80623f = "TextStyleBox.kt", m80624l = {387}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f74129OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74130OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C31087Oooooo0 f74131OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TextStyleBox textStyleBox, C31087Oooooo0 c31087Oooooo0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f74129OooOo = textStyleBox;
            this.f74131OooOoO0 = c31087Oooooo0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f74129OooOo, this.f74131OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74130OooOo0o;
            C31087Oooooo0 c31087Oooooo0 = this.f74131OooOoO0;
            TextStyleBox textStyleBox = this.f74129OooOo;
            String str = c31087Oooooo0.f110946OooO00o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
                if (c29051OooOO0o == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                Context context = textStyleBox.getContext();
                OooOOO0.OooO0o(context, "getContext(...)");
                this.f74130OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29056OooOOO(context, str, null, c29051OooOO0o), this);
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
                C29051OooOO0o c29051OooOO0o2 = textStyleBox.f74153OoooO;
                if (c29051OooOO0o2 == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                c29051OooOO0o2.OooOO0(str, typeface);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C23386OooO0oo(TextStyleBox textStyleBox) {
        this.f74128OooO00o = textStyleBox;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO00o() {
        TextStyleBox.OooO00o oooO00o = this.f74128OooO00o.f74155OoooO00;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0O0(boolean z) {
        TextView textView = this.f74128OooO00o.f74134OooOo0o;
        if (textView != null) {
            textView.setActivated(z);
        } else {
            OooOOO0.OooOOOO("tvTextBoxFontName");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0OO(final String fontName) {
        OooOOO0.OooO0oO(fontName, "fontName");
        int i = TextStyleBox.f74132o000oOoO;
        final TextStyleBox textStyleBox = this.f74128OooO00o;
        final Context context = textStyleBox.getContext();
        if (context != null) {
            String string = context.getString(R.string.title_delete_font);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = context.getString(R.string.content_delete_font);
            OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, new OooOo(), new View.OnClickListener() { // from class: o0OoOOOo.OooOoO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextStyleBox textStyleBox2 = textStyleBox;
                    C29051OooOO0o c29051OooOO0o = textStyleBox2.f74153OoooO;
                    if (c29051OooOO0o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    Context context2 = context;
                    String str = fontName;
                    c29051OooOO0o.OooO0oo(context2, str);
                    C29051OooOO0o c29051OooOO0o2 = textStyleBox2.f74153OoooO;
                    if (c29051OooOO0o2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0o2);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29062OooOOoo(c29051OooOO0o2, str, null), 2);
                }
            }, null, null, 1, null, 384).show(C21929Ooooo0o.OooO0Oo(textStyleBox).getChildFragmentManager(), "TipsDialogFragment");
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o.InterfaceC19278OooO00o
    public final void OooO0Oo(C31087Oooooo0 c31087Oooooo0) {
        TextStyleBox textStyleBox = this.f74128OooO00o;
        Typeface typeface = c31087Oooooo0.f110947OooO0O0;
        if (typeface != null) {
            C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
            if (c29051OooOO0o != null) {
                c29051OooOO0o.OooOO0(c31087Oooooo0.f110946OooO00o, typeface);
                return;
            } else {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
        }
        if (c31087Oooooo0.f110949OooO0Oo) {
            return;
        }
        androidx.lifecycle.OooOo oooOo = textStyleBox.f74157OoooOO0;
        if (oooOo != null) {
            C33609OooO0oo.OooO0OO(oooOo, null, null, new OooO00o(textStyleBox, c31087Oooooo0, null), 3);
        } else {
            OooOOO0.OooOOOO("viewScope");
            throw null;
        }
    }
}

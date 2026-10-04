package o0OoOOOo;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o0OoOOo0.C29182OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFontPopupWindow$bindFontEditingMode$1", m80623f = "TextFontPopupWindow.kt", m80624l = {162}, m80625m = "invokeSuspend")
public final class C29092OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o f103112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103113OooOo0o;

    /* JADX INFO: renamed from: o0OoOOOo.OooO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o f103114OooOo0o;

        public OooO00o(com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o) {
            this.f103114OooOo0o = oooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextFontPopupWindow");
            c20358OooO00o.OooO00o("TextFontPopup isEditing: " + zBooleanValue + ".", new Object[0]);
            com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = this.f103114OooOo0o;
            ImageView imageView = (ImageView) oooO00o.f74089OooO0OO.getContentView().findViewById(R.id.iv_edit_font);
            TextView textView = (TextView) oooO00o.f74089OooO0OO.getContentView().findViewById(R.id.tv_edit_font_manage);
            if (zBooleanValue) {
                if (textView != null) {
                    textView.setText(oooO00o.OooO0O0().getText(R.string.exit_edit));
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ic_ni_close_normal);
                }
                if (imageView != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), R.color.color_blue_primary)));
                }
            } else {
                if (textView != null) {
                    textView.setText(oooO00o.OooO0O0().getText(R.string.edit));
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ic_ni_edit);
                }
                if (imageView != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), R.color.color_blue_primary)));
                }
            }
            C29182OooO0O0 c29182OooO0O0 = (C29182OooO0O0) oooO00o.f74090OooO0Oo.getValue();
            c29182OooO0O0.f103498OooO0Oo.setValue(c29182OooO0O0, C29182OooO0O0.f103495OooO0o[0], bool);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29092OooO(com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o, Continuation<? super C29092OooO> continuation) {
        super(2, continuation);
        this.f103112OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29092OooO(this.f103112OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C29092OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103113OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = this.f103112OooOo;
        C33781o00o0O c33781o00o0O = oooO00o.OooO0OO().f103125OooO0Oo;
        OooO00o oooO00o2 = new OooO00o(oooO00o);
        this.f103113OooOo0o = 1;
        c33781o00o0O.collect(oooO00o2, this);
        return enumC32485OooO00o;
    }
}

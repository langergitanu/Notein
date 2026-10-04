package o0o0OOO;

import android.content.Context;
import android.view.View;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30459OooO0O0 extends com.orion.notein.p607ui.paperconfig.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C30459OooO0O0 f108769OooO00o = new C30459OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f108770OooO0O0 = true;

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final void OooO00o(View view) {
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final boolean OooO0OO() {
        return f108770OooO0O0;
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final String OooO0o(Context context) {
        String string = context.getString(R.string.paper_config_select_template);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(C30520o000000o c30520o000000o, PaperConfigDialogFragment paperConfigDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30458OooO00o c30458OooO00o;
        String str;
        String str2;
        if (abstractC32479OooO0OO instanceof C30458OooO00o) {
            c30458OooO00o = (C30458OooO00o) abstractC32479OooO0OO;
            int i = c30458OooO00o.f108768OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30458OooO00o.f108768OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30458OooO00o = new C30458OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c30458OooO00o.f108767OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30458OooO00o.f108768OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str3 = paperConfigDialogFragment.OooOoo0().f108930OooO0OO;
            String str4 = paperConfigDialogFragment.OooOoo0().f108931OooO0Oo;
            if (str3 == null || C33599OooOo0O.Oooo0o0(str3) || str4 == null || C33599OooOo0O.Oooo0o0(str4)) {
                C34406OooO00o.f123390OooO00o.OooO0OO("AddPageStrategy", C22237OooO0o0.OooO00o("addPageToNote failed: noteId=", str3, ", pageId=", str4));
                return Boolean.FALSE;
            }
            c30458OooO00o.f108765OooOo0o = str3;
            c30458OooO00o.f108764OooOo = str4;
            c30458OooO00o.f108768OooOoOO = 1;
            c30520o000000o.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30514OooooOO(c30520o000000o, str3, str4, null), c30458OooO00o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            obj = objOooO0o;
            str = str4;
            str2 = str3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30458OooO00o.f108764OooOo;
            str2 = c30458OooO00o.f108765OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            C34406OooO00o.f123390OooO00o.OooO0OO("AddPageStrategy", C22237OooO0o0.OooO00o("addPageToNote failed: noteId=", str2, ", pageId=", str));
        }
        return bool;
    }
}

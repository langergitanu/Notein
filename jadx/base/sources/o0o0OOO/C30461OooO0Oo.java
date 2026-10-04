package o0o0OOO;

import android.content.Context;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30461OooO0Oo extends com.orion.notein.p607ui.paperconfig.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C30461OooO0Oo f108777OooO00o = new C30461OooO0Oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f108778OooO0O0 = true;

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final void OooO00o(View view) {
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final boolean OooO0O0() {
        return f108778OooO0O0;
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final String OooO0o(Context context) {
        String string = context.getString(R.string.paper_config_change_template);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(C30520o000000o c30520o000000o, PaperConfigDialogFragment paperConfigDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30460OooO0OO c30460OooO0OO;
        String str;
        String str2;
        Object obj;
        String str3;
        if (abstractC32479OooO0OO instanceof C30460OooO0OO) {
            c30460OooO0OO = (C30460OooO0OO) abstractC32479OooO0OO;
            int i = c30460OooO0OO.f108776OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30460OooO0OO.f108776OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c30460OooO0OO = new C30460OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c30460OooO0OO.f108773OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30460OooO0OO.f108776OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            str = paperConfigDialogFragment.OooOoo0().f108930OooO0OO;
            if (str != null && (str2 = paperConfigDialogFragment.OooOoo0().f108931OooO0Oo) != null) {
                c30460OooO0OO.f108772OooOo0o = paperConfigDialogFragment;
                c30460OooO0OO.f108771OooOo = str;
                c30460OooO0OO.f108774OooOoO0 = str2;
                c30460OooO0OO.f108776OooOoo0 = 1;
                c30520o000000o.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30522o00000o0(c30520o000000o, str, str2, null), c30460OooO0OO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objOooO0o;
                str3 = str2;
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str3 = c30460OooO0OO.f108774OooOoO0;
        String str4 = c30460OooO0OO.f108771OooOo;
        PaperConfigDialogFragment paperConfigDialogFragment2 = c30460OooO0OO.f108772OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        str = str4;
        paperConfigDialogFragment = paperConfigDialogFragment2;
        obj = obj2;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            C21904OooOoo0.OooO0o(BundleKt.bundleOf(new C32443OooOOO("note_id", str), new C32443OooOOO("page_id", str3)), paperConfigDialogFragment, "template_changed");
        }
        return bool;
    }
}

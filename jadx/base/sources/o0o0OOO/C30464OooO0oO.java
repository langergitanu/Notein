package o0o0OOO;

import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33649OoooOOo;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0o0OOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30464OooO0oO extends com.orion.notein.p607ui.paperconfig.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C30464OooO0oO f108785OooO00o = new C30464OooO0oO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f108786OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f108787OooO0OO = true;

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final void OooO00o(View view) {
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final boolean OooO0Oo() {
        return f108787OooO0OO;
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final String OooO0o(Context context) {
        String string = context.getString(R.string.paper_config_creation);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    public final boolean OooO0o0() {
        return f108786OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r8, r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.p607ui.paperconfig.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(C30520o000000o c30520o000000o, PaperConfigDialogFragment paperConfigDialogFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30463OooO0o0 c30463OooO0o0;
        if (abstractC32479OooO0OO instanceof C30463OooO0o0) {
            c30463OooO0o0 = (C30463OooO0o0) abstractC32479OooO0OO;
            int i = c30463OooO0o0.f108783OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30463OooO0o0.f108783OooOoO = i - Integer.MIN_VALUE;
            } else {
                c30463OooO0o0 = new C30463OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c30463OooO0o0.f108781OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30463OooO0o0.f108783OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            Object value = c30520o000000o.f109031Oooo0O0.getValue();
            if (C33599OooOo0O.Oooo0o0((String) value)) {
                value = null;
            }
            String string = (String) value;
            if (string == null) {
                string = paperConfigDialogFragment.getString(R.string.note_title_default);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            }
            String str = paperConfigDialogFragment.OooOoo0().f108929OooO0O0;
            c30463OooO0o0.f108782OooOo0o = paperConfigDialogFragment;
            c30463OooO0o0.f108783OooOoO = 1;
            objOooOO0O = c30520o000000o.OooOO0O(str, string, c30463OooO0o0);
            if (objOooOO0O != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0O);
            return Boolean.TRUE;
        }
        paperConfigDialogFragment = c30463OooO0o0.f108782OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        String str2 = (String) objOooOO0O;
        if (str2 == null) {
            Context context = paperConfigDialogFragment.getContext();
            if (context != null) {
                String string2 = paperConfigDialogFragment.getString(R.string.create_note_failed);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string2);
            }
            return Boolean.FALSE;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        C30462OooO0o c30462OooO0o = new C30462OooO0o(str2, paperConfigDialogFragment, null);
        c30463OooO0o0.f108782OooOo0o = null;
        c30463OooO0o0.f108783OooOoO = 2;
    }
}

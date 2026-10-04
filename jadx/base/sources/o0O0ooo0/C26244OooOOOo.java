package o0O0ooo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00oO0O;
import Oooooo.AbstractC21396OooO0O0;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p002ui.platform.C21608OooO0Oo;
import com.orion.notein.global.R;
import o0O0oOoo.C26177Oooo0o;
import o0O0oOoo.EnumC26180Oooo0oo;
import o0OOO0o.C27049OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0ooo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26244OooOOOo implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f89684OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f89685OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<Boolean> f89686OooOoO0;

    public C26244OooOOOo(boolean z, boolean z2, o00oO0O<Boolean> o00oo0o) {
        this.f89685OooOo0o = z;
        this.f89684OooOo = z2;
        this.f89686OooOoO0 = o00oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        AbstractC21396OooO0O0 abstractC21396OooO0O0OooO00o;
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            boolean z = this.f89685OooOo0o;
            if (z) {
                interfaceC21033OooOOOO2.OooOo00(979222458);
                abstractC21396OooO0O0OooO00o = C27049OooO0Oo.OooO00o(R.drawable.ni_symbol_eye_open, interfaceC21033OooOOOO2);
                interfaceC21033OooOOOO2.OooOoo();
            } else {
                interfaceC21033OooOOOO2.OooOo00(979342552);
                abstractC21396OooO0O0OooO00o = C27049OooO0Oo.OooO00o(R.drawable.ni_symbol_eye_closed, interfaceC21033OooOOOO2);
                interfaceC21033OooOOOO2.OooOoo();
            }
            AbstractC21396OooO0O0 abstractC21396OooO0O0 = abstractC21396OooO0O0OooO00o;
            int i = z ? R.string.notein_ui_password_visibility_hide : R.string.notein_ui_password_visibility_show;
            interfaceC21033OooOOOO2.OooO0o0(C21608OooO0Oo.f63495OooO00o);
            Resources resources = ((Context) interfaceC21033OooOOOO2.OooO0o0(C21608OooO0Oo.f63496OooO0O0)).getResources();
            kotlin.jvm.internal.OooOOO0.OooO0o(resources, "LocalContext.current.resources");
            String string = resources.getString(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "resources.getString(id)");
            EnumC26180Oooo0oo enumC26180Oooo0oo = EnumC26180Oooo0oo.f89375OooOoO0;
            interfaceC21033OooOOOO2.OooOo00(-1215305727);
            o00oO0O<Boolean> o00oo0o = this.f89686OooOoO0;
            boolean zOooO0oo = interfaceC21033OooOOOO2.OooO0oo(o00oo0o);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new OooOOOO(o00oo0o, 0);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26177Oooo0o.OooO00o(abstractC21396OooO0O0, string, null, enumC26180Oooo0oo, this.f89684OooOo, null, null, 0.0f, (oO0O000o.OooO00o) objOooOo0, interfaceC21033OooOOOO2, 3072, 228);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

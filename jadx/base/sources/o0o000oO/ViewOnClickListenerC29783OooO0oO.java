package o0o000oO;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import java.util.Map;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.Oooo0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o000oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29783OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105695OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105696OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f105697OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29783OooO0oO(int i, Object obj, Object obj2) {
        this.f105696OooOo0o = i;
        this.f105695OooOo = obj;
        this.f105697OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105696OooOo0o) {
            case 0:
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o((InterfaceC21987OooOoo) this.f105695OooOo), null, null, new C29788OooOOO((TextStyleBarChildFragment) this.f105697OooOoO0, null), 3);
                break;
            default:
                Oooo0 oooo0 = (Oooo0) this.f105695OooOo;
                String str = oooo0.f106645Oooo00o;
                String type = (String) this.f105697OooOoO0;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, type)) {
                    String str2 = oooo0.f106645Oooo00o;
                    oooo0.OooO0o(type);
                    String str3 = oooo0.f106645Oooo00o;
                    Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO("line", oooo0.f106635OooOo0o), new C32443OooOOO("spot", oooo0.f106637OooOoO0));
                    View view2 = (View) mapOooO0oo.get(str3);
                    if (view2 != null) {
                        Oooo0.OooO0OO(oooo0, view2, Oooo0.f106632Oooo0, 0.0f);
                    }
                    View view3 = (View) mapOooO0oo.get(str2);
                    if (view3 != null) {
                        Oooo0.OooO0OO(oooo0, view3, 0.0f, Oooo0.f106632Oooo0);
                    }
                    C29936OooO0oO c29936OooO0oO = oooo0.f106644Oooo00O;
                    if (c29936OooO0oO != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                        PenBox.InterfaceC23605OooO0Oo interfaceC23605OooO0Oo = c29936OooO0oO.f106281OooO;
                        if (interfaceC23605OooO0Oo != null) {
                            interfaceC23605OooO0Oo.OooO0O0(type);
                        }
                    }
                    break;
                }
                break;
        }
    }
}

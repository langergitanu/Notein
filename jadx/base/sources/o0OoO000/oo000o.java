package o0OoO000;

import android.content.Context;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.penkit.models.AnchorAssistLine;
import com.orion.penkit.models.VerticalLine;
import java.util.ArrayList;
import java.util.Set;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo000o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101368OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101369OooOo0o;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f101369OooOo0o = i;
        this.f101368OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f101369OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseUserLoginFragment) this.f101368OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                Set<? extends AnchorAssistLine<?>> set = ((ShapesAnchorEditor) this.f101368OooOo).currentAssistLines;
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    if (obj instanceof VerticalLine) {
                        arrayList.add(obj);
                    }
                }
                return Boolean.valueOf(!arrayList.isEmpty());
        }
    }
}

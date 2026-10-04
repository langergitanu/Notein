package o0OoO000;

import android.content.Context;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import com.orion.penkit.models.AnchorAssistLine;
import com.orion.penkit.models.HorizontalLine;
import java.util.ArrayList;
import java.util.Set;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO000.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28597o00oO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101354OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101355OooOo0o;

    public /* synthetic */ C28597o00oO0o(Object obj, int i) {
        this.f101355OooOo0o = i;
        this.f101354OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f101354OooOo;
        switch (this.f101355OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseUserLoginFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            case 1:
                Set<? extends AnchorAssistLine<?>> set = ((ShapesAnchorEditor) obj).currentAssistLines;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (obj2 instanceof HorizontalLine) {
                        arrayList.add(obj2);
                    }
                }
                return Boolean.valueOf(!arrayList.isEmpty());
            default:
                int i = ImageCropView.f80139OooooO0;
                ((ImageCropView) obj).invalidate();
                return C32460OooOooO.f116667OooO00o;
        }
    }
}

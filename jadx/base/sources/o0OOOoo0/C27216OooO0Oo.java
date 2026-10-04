package o0OOOoo0;

import OooooO0.C21294OooOO0O;
import android.graphics.RectF;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TypedRect;
import o000OO00.C24488OoooO0O;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooo.C26389Oooo000;
import o0OOOO0o.C27144o00o0O;

/* JADX INFO: renamed from: o0OOOoo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27216OooO0Oo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f95057OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95058OooOo0o;

    public /* synthetic */ C27216OooO0Oo(Object obj, int i) {
        this.f95058OooOo0o = i;
        this.f95057OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        int i = 1;
        Object obj = this.f95057OooOo;
        switch (this.f95058OooOo0o) {
            case 0:
                return C21294OooOO0O.OooO0Oo((AbstractApplicationC26277OooOoOO) obj, "notein-cloudsync-sp");
            case 1:
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o.OooOO0O(oooO0O0Oooo0oO, interfaceC21987OooOoo, new C24488OoooO0O(penBarChildFragment, i), new C27144o00o0O(penBarChildFragment, 2), new C26389Oooo000(penBarChildFragment, i));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            default:
                int i3 = ShapesEditorPanel.f76301OoooO0;
                TypedRect<Integer> typedRect = ((ShapeInfo) obj).getTypedRect();
                return new RectF(typedRect.getLeft().intValue(), typedRect.getTop().intValue(), typedRect.getRight().intValue(), typedRect.getBottom().intValue());
        }
    }
}

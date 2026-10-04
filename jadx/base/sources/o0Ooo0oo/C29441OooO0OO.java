package o0Ooo0oo;

import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.penkit.tools.DrawToolFactory;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Ooo0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29441OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104492OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104493OooOo0o;

    public /* synthetic */ C29441OooO0OO(Object obj, int i) {
        this.f104493OooOo0o = i;
        this.f104492OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Long lValueOf = null;
        Object obj2 = this.f104492OooOo;
        switch (this.f104493OooOo0o) {
            case 0:
                String prevType = (String) obj;
                int i = PenBarChildFragment.f75240o0000OOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(prevType, "prevType");
                String str = DrawToolFactory.LASSO_TYPE_FREE;
                if (prevType.equals(DrawToolFactory.LASSO_TYPE_FREE)) {
                    str = DrawToolFactory.LASSO_TYPE_RECT;
                } else if (prevType.equals(DrawToolFactory.LASSO_TYPE_RECT)) {
                    str = DrawToolFactory.LASSO_TYPE_CAPTURE;
                }
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj2;
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C29479Oooo0oo(str, penBarChildFragment, null), 3);
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT COUNT(*) FROM ShapeEntity WHERE layer_id = ?");
                String str2 = (String) obj2;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}

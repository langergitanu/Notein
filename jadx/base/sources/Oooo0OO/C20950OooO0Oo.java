package Oooo0OO;

import OooOo.C20485OooOoO;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00oO0O;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.p002ui.platform.C21608OooO0Oo;

/* JADX INFO: renamed from: Oooo0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20950OooO0Oo extends AbstractC20951OooO0o {
    public C20950OooO0Oo() {
        throw null;
    }

    @Override // Oooo0OO.AbstractC20951OooO0o
    public final AbstractC20960OooOOOO OooO0O0(InterfaceC20736OooOOO0 interactionSource, boolean z, float f, o00oO0O o00oo0o, o00oO0O o00oo0o2, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        View rippleContainer;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interactionSource, "interactionSource");
        interfaceC21033OooOOOO.OooOo00(331259447);
        interfaceC21033OooOOOO.OooOo00(-1737891121);
        Object objOooO0o0 = interfaceC21033OooOOOO.OooO0o0(C21608OooO0Oo.f63499OooO0o);
        while (!(objOooO0o0 instanceof ViewGroup)) {
            ViewParent parent = ((View) objOooO0o0).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(C20485OooOoO.OooO0O0("Couldn't find a valid parent for ", objOooO0o0, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(parent, "parent");
            objOooO0o0 = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objOooO0o0;
        interfaceC21033OooOOOO.OooOoo();
        interfaceC21033OooOOOO.OooOo00(1643267286);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        Object obj = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        if (zIsInEditMode) {
            interfaceC21033OooOOOO.OooOo00(511388516);
            boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(interactionSource) | interfaceC21033OooOOOO.OooO0oo(this);
            Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
            if (zOooO0oo || objOooOo0 == obj) {
                objOooOo0 = new C20948OooO0O0(z, f, o00oo0o, o00oo0o2);
                interfaceC21033OooOOOO.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO.OooOoo();
            C20948OooO0O0 c20948OooO0O0 = (C20948OooO0O0) objOooOo0;
            interfaceC21033OooOOOO.OooOoo();
            interfaceC21033OooOOOO.OooOoo();
            return c20948OooO0O0;
        }
        interfaceC21033OooOOOO.OooOoo();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                rippleContainer = null;
                break;
            }
            rippleContainer = viewGroup.getChildAt(i);
            if (rippleContainer instanceof RippleContainer) {
                break;
            }
            i++;
        }
        if (rippleContainer == null) {
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "view.context");
            rippleContainer = new RippleContainer(context);
            viewGroup.addView(rippleContainer);
        }
        interfaceC21033OooOOOO.OooOo00(1618982084);
        boolean zOooO0oo2 = interfaceC21033OooOOOO.OooO0oo(interactionSource) | interfaceC21033OooOOOO.OooO0oo(this) | interfaceC21033OooOOOO.OooO0oo(rippleContainer);
        Object objOooOo02 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo2 || objOooOo02 == obj) {
            Object c20947OooO00o = new C20947OooO00o(z, f, o00oo0o, o00oo0o2, (RippleContainer) rippleContainer);
            interfaceC21033OooOOOO.OooOOo0(c20947OooO00o);
            objOooOo02 = c20947OooO00o;
        }
        interfaceC21033OooOOOO.OooOoo();
        C20947OooO00o c20947OooO00o2 = (C20947OooO00o) objOooOo02;
        interfaceC21033OooOOOO.OooOoo();
        return c20947OooO00o2;
    }
}

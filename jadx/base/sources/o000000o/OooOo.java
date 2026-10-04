package o000000o;

import android.graphics.Typeface;
import java.util.Collection;
import oO0o0O0.C33552OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements InterfaceC24096OooOo0O, C33552OooO00o.OooO0OO {
    public static Typeface OooO0Oo(String str, C24093OooOOo0 c24093OooOOo0, int i) {
        if (i == 0 && kotlin.jvm.internal.OooOOO0.OooO0O0(c24093OooOOo0, C24093OooOOo0.f81191OooOoO0) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            kotlin.jvm.internal.OooOOO0.OooO0o(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c24093OooOOo0.f81193OooOo0o, i == 1);
        kotlin.jvm.internal.OooOOO0.OooO0o(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }

    @Override // o000000o.InterfaceC24096OooOo0O
    public Typeface OooO00o(C24093OooOOo0 fontWeight, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        return OooO0Oo(null, fontWeight, i);
    }

    @Override // oO0o0O0.C33552OooO00o.OooO0OO
    public Iterable OooO0O0(Object obj) {
        oO0O0OO.OooO0O0 oooO0O0 = (oO0O0OO.OooO0O0) obj;
        Collection<? extends oO0O0OO.OooO0O0> collectionOooOO0o = oooO0O0 != null ? oooO0O0.OooOO0o() : null;
        return collectionOooOO0o == null ? C34434OooOoO.f123453OooOo0o : collectionOooOO0o;
    }

    @Override // o000000o.InterfaceC24096OooOo0O
    public Typeface OooO0OO(C24092OooOOo name, C24093OooOOo0 fontWeight, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        return OooO0Oo(name.f81188OooOoO0, fontWeight, i);
    }
}

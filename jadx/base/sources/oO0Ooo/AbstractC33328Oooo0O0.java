package oO0Ooo;

import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Iterator;
import oO0o0000.InterfaceC33542OooO0oo;

/* JADX INFO: renamed from: oO0Ooo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33328Oooo0O0 extends AbstractC33354o00o0O implements InterfaceC33542OooO0oo, oO0o0000.OooO {
    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000oO, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC33328Oooo0O0 o00000Oo(boolean z);

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000oo, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO c33339OoooOOO);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<oOo0oooO.OooO0OO> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", oO0OOOO.OooO0OO.f118963OooO0OO.OooOo0o(it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(o00000());
        if (!o000000O().isEmpty()) {
            oOo000Oo.OooOo.OoooOO0(o000000O(), sb, ", ", "<", ">", null, 112);
        }
        if (o00000O0()) {
            sb.append(MsalUtils.QUERY_STRING_SYMBOL);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

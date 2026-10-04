package oO000O0;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f113895OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f113894OooOo = new ArrayList();

    public OooO0O0() {
        new HashMap();
    }

    public final void OooO00o(EnumC31935OooO0Oo enumC31935OooO0Oo, Object... objArr) {
        this.f113895OooOo0o.add(enumC31935OooO0Oo);
        this.f113894OooOo.add(OooO00o.OooO00o(objArr));
    }

    public final String OooO0O0(Locale locale) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f113895OooOo0o;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(new MessageFormat(((OooO0OO) arrayList.get(i2)).OooOooo(locale), locale).format((Object[]) this.f113894OooOo.get(i2)));
            i++;
            if (i < size) {
                sb.append(": ");
            }
        }
        return sb.toString();
    }
}

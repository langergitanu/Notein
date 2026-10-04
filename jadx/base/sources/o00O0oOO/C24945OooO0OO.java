package o00O0oOO;

import com.aspose.words.ControlChar;
import java.util.ArrayList;

/* JADX INFO: renamed from: o00O0oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24945OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char f84641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f84642OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f84643OooO0OO;

    public C24945OooO0OO(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f84641OooO00o = c;
        this.f84642OooO0O0 = str;
        this.f84643OooO0OO = str2;
    }

    public final int hashCode() {
        String str = this.f84643OooO0OO;
        String str2 = this.f84642OooO0O0;
        return str2.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f84641OooO00o * ControlChar.OPTIONAL_HYPHEN_CHAR, 31, str);
    }
}

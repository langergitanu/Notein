package o0oooO0O;

import java.io.IOException;
import java.util.ArrayList;
import o0ooo0.AbstractC31720OooOOOo;

/* JADX INFO: renamed from: o0oooO0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31825OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f113446OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f113447OooO0O0;

    public final float OooO00o(AbstractC31720OooOOOo abstractC31720OooOOOo, float f) throws IOException {
        float f2 = f / 1000.0f;
        float f3 = 0.0f;
        int i = 0;
        for (C31828OooOo0 c31828OooOo0 : this.f113446OooO00o) {
            float fFloatValue = ((Float) c31828OooOo0.f113449OooO00o.getIterator().getAttribute(C31829OooOo00.f113451OooOo0o)).floatValue() + f3;
            if (i == r0.size() - 1) {
                String str = c31828OooOo0.f113450OooO0O0;
                if (Character.isWhitespace(str.charAt(str.length() - 1))) {
                    fFloatValue -= abstractC31720OooOOOo.OooOO0(str.substring(str.length() - 1)) * f2;
                }
            }
            f3 = fFloatValue;
            i++;
        }
        return f3;
    }
}

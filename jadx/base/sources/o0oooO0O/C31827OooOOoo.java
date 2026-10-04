package o0oooO0O;

import java.io.IOException;
import java.text.AttributedString;
import java.text.BreakIterator;
import java.util.ArrayList;
import o0ooo0.AbstractC31720OooOOOo;

/* JADX INFO: renamed from: o0oooO0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31827OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113448OooO00o;

    public C31827OooOOoo(String str) {
        this.f113448OooO00o = str;
    }

    public final ArrayList OooO00o(AbstractC31720OooOOOo abstractC31720OooOOOo, float f, float f2) throws IOException {
        String strSubstring;
        BreakIterator lineInstance = BreakIterator.getLineInstance();
        String str = this.f113448OooO00o;
        lineInstance.setText(str);
        float f3 = f / 1000.0f;
        int iFirst = lineInstance.first();
        int next = lineInstance.next();
        ArrayList arrayList = new ArrayList();
        C31825OooOOo c31825OooOOo = new C31825OooOOo();
        float fOooOO0 = 0.0f;
        while (next != -1) {
            String strSubstring2 = str.substring(iFirst, next);
            float fOooOO02 = abstractC31720OooOOOo.OooOO0(strSubstring2) * f3;
            int i = next - iFirst;
            fOooOO0 += fOooOO02;
            boolean z = true;
            if (fOooOO0 >= f2 && Character.isWhitespace(strSubstring2.charAt(strSubstring2.length() - 1))) {
                fOooOO0 -= abstractC31720OooOOOo.OooOO0(strSubstring2.substring(strSubstring2.length() - 1)) * f3;
            }
            if (fOooOO0 >= f2 && !c31825OooOOo.f113446OooO00o.isEmpty()) {
                c31825OooOOo.f113447OooO0O0 = c31825OooOOo.OooO00o(abstractC31720OooOOOo, f);
                arrayList.add(c31825OooOOo);
                c31825OooOOo = new C31825OooOOo();
                fOooOO0 = abstractC31720OooOOOo.OooOO0(strSubstring2) * f3;
            }
            ArrayList arrayList2 = c31825OooOOo.f113446OooO00o;
            BreakIterator breakIterator = lineInstance;
            if (fOooOO02 <= f2 || !arrayList2.isEmpty()) {
                z = false;
            } else {
                do {
                    i--;
                    strSubstring = strSubstring2.substring(0, i);
                } while (abstractC31720OooOOOo.OooOO0(strSubstring) * f3 >= f2);
                fOooOO02 = abstractC31720OooOOOo.OooOO0(strSubstring) * f3;
                strSubstring2 = strSubstring;
                fOooOO0 = fOooOO02;
            }
            AttributedString attributedString = new AttributedString(strSubstring2);
            attributedString.addAttribute(C31829OooOo00.f113451OooOo0o, Float.valueOf(fOooOO02));
            C31828OooOo0 c31828OooOo0 = new C31828OooOo0(strSubstring2);
            c31828OooOo0.f113449OooO00o = attributedString;
            arrayList2.add(c31828OooOo0);
            if (z) {
                iFirst += i;
            } else {
                iFirst = next;
                next = breakIterator.next();
            }
            lineInstance = breakIterator;
        }
        c31825OooOOo.f113447OooO0O0 = c31825OooOOo.OooO00o(abstractC31720OooOOOo, f);
        arrayList.add(c31825OooOOo);
        return arrayList;
    }
}

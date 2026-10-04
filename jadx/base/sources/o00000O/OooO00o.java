package o00000O;

import OooOo.C20496Oooo0o0;
import OooooOO.C21348Ooooo0o;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000000o.AbstractC24088OooO0oO;
import o000000o.C24085OooO0OO;
import o000000o.C24093OooOOo0;
import o000000o.OooOOOO;
import o00000O0.C24108OooO0Oo;
import o00000o0.C24115OooO0OO;
import o00000o0.C24120OooOO0o;
import o00000o0.OooOO0O;
import o0000Ooo.InterfaceC24229OooO0OO;
import oO00ooO.C32442OooOO0o;
import oOo000Oo.C34434OooOoO;
import oo0o0Oo.AbstractC34697OooOo0;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34681OooO0OO;
import oo0o0Oo.C34691OooOOO0;
import oo0o0Oo.C34699OooOo0O;
import oo0o0Oo.C34700OooOo0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public static final SpannableString OooO00o(C34680OooO0O0 c34680OooO0O0, InterfaceC24229OooO0OO interfaceC24229OooO0OO, AbstractC24088OooO0oO.OooO00o fontFamilyResolver) {
        ?? arrayList;
        InterfaceC24229OooO0OO density = interfaceC24229OooO0OO;
        OooOOO0.OooO0oO(density, "density");
        OooOOO0.OooO0oO(fontFamilyResolver, "fontFamilyResolver");
        String str = c34680OooO0O0.f124887OooOo0o;
        SpannableString spannableString = new SpannableString(str);
        List<C34680OooO0O0.C20372OooO0O0<C34691OooOOO0>> list = c34680OooO0O0.f124886OooOo;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C34680OooO0O0.C20372OooO0O0<C34691OooOOO0> c20372OooO0O0 = list.get(i);
                C34691OooOOO0 c34691OooOOO0 = c20372OooO0O0.f124898OooO00o;
                long jOooO00o = c34691OooOOO0.f124943OooO00o.OooO00o();
                o00000o0.OooOO0O c24115OooO0OO = c34691OooOOO0.f124943OooO00o;
                if (!C21348Ooooo0o.OooO0OO(jOooO00o, c24115OooO0OO.OooO00o())) {
                    c24115OooO0OO = jOooO00o != C21348Ooooo0o.f61766OooO0oO ? new C24115OooO0OO(jOooO00o) : OooOO0O.OooO00o.f81276OooO00o;
                }
                long jOooO00o2 = c24115OooO0OO.OooO00o();
                int i2 = c20372OooO0O0.f124899OooO0O0;
                int i3 = c20372OooO0O0.f124900OooO0OO;
                o00000OO.OooO0OO.OooO0O0(spannableString, jOooO00o2, i2, i3);
                o00000OO.OooO0OO.OooO0OO(spannableString, c34691OooOOO0.f124944OooO0O0, density, i2, i3);
                C24093OooOOo0 c24093OooOOo0 = c34691OooOOO0.f124945OooO0OO;
                OooOOOO oooOOOO = c34691OooOOO0.f124946OooO0Oo;
                if (c24093OooOOo0 != null || oooOOOO != null) {
                    if (c24093OooOOo0 == null) {
                        c24093OooOOo0 = C24093OooOOo0.f81191OooOoO0;
                    }
                    spannableString.setSpan(new StyleSpan(C24085OooO0OO.OooO0O0(c24093OooOOo0, oooOOOO != null ? oooOOOO.f81185OooO00o : 0)), i2, i3, 33);
                }
                o00000o0.OooO oooO = c34691OooOOO0.f124955OooOOO0;
                if (oooO != null) {
                    int i4 = oooO.f81257OooO00o;
                    if ((i4 | 1) == i4) {
                        spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
                    }
                    if ((i4 | 2) == i4) {
                        spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
                    }
                }
                C24120OooOO0o c24120OooOO0o = c34691OooOOO0.f124951OooOO0;
                if (c24120OooOO0o != null) {
                    spannableString.setSpan(new ScaleXSpan(c24120OooOO0o.f81280OooO00o), i2, i3, 33);
                }
                C24108OooO0Oo c24108OooO0Oo = c34691OooOOO0.f124952OooOO0O;
                if (c24108OooO0Oo != null) {
                    o00000OO.OooO0OO.OooO0Oo(spannableString, o00000OO.OooO00o.f81246OooO00o.OooO00o(c24108OooO0Oo), i2, i3);
                }
                long j = C21348Ooooo0o.f61766OooO0oO;
                long j2 = c34691OooOOO0.f124953OooOO0o;
                if (j2 != j) {
                    o00000OO.OooO0OO.OooO0Oo(spannableString, new BackgroundColorSpan(C20496Oooo0o0.OooO0oo(j2)), i2, i3);
                }
                i++;
                density = interfaceC24229OooO0OO;
            }
        }
        int length = str.length();
        ?? arrayList2 = C34434OooOoO.f123453OooOo0o;
        List<C34680OooO0O0.C20372OooO0O0<? extends Object>> list2 = c34680OooO0O0.f124888OooOoO;
        if (list2 != null) {
            arrayList = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C34680OooO0O0.C20372OooO0O0<? extends Object> c20372OooO0O02 = list2.get(i5);
                C34680OooO0O0.C20372OooO0O0<? extends Object> c20372OooO0O03 = c20372OooO0O02;
                if ((c20372OooO0O03.f124898OooO00o instanceof AbstractC34697OooOo0) && C34681OooO0OO.OooO0OO(0, length, c20372OooO0O03.f124899OooO0O0, c20372OooO0O03.f124900OooO0OO)) {
                    arrayList.add(c20372OooO0O02);
                }
            }
        } else {
            arrayList = arrayList2;
        }
        int size3 = arrayList.size();
        for (int i6 = 0; i6 < size3; i6++) {
            C34680OooO0O0.C20372OooO0O0 c20372OooO0O04 = (C34680OooO0O0.C20372OooO0O0) arrayList.get(i6);
            AbstractC34697OooOo0 abstractC34697OooOo0 = (AbstractC34697OooOo0) c20372OooO0O04.f124898OooO00o;
            OooOOO0.OooO0oO(abstractC34697OooOo0, "<this>");
            if (!(abstractC34697OooOo0 instanceof C34700OooOo0o)) {
                throw new C32442OooOO0o();
            }
            ((C34700OooOo0o) abstractC34697OooOo0).getClass();
            TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(null).build();
            OooOOO0.OooO0o(ttsSpanBuild, "builder.build()");
            spannableString.setSpan(ttsSpanBuild, c20372OooO0O04.f124899OooO0O0, c20372OooO0O04.f124900OooO0OO, 33);
        }
        int length2 = str.length();
        if (list2 != null) {
            arrayList2 = new ArrayList(list2.size());
            int size4 = list2.size();
            for (int i7 = 0; i7 < size4; i7++) {
                C34680OooO0O0.C20372OooO0O0<? extends Object> c20372OooO0O05 = list2.get(i7);
                C34680OooO0O0.C20372OooO0O0<? extends Object> c20372OooO0O06 = c20372OooO0O05;
                if ((c20372OooO0O06.f124898OooO00o instanceof C34699OooOo0O) && C34681OooO0OO.OooO0OO(0, length2, c20372OooO0O06.f124899OooO0O0, c20372OooO0O06.f124900OooO0OO)) {
                    arrayList2.add(c20372OooO0O05);
                }
            }
        }
        int size5 = arrayList2.size();
        for (int i8 = 0; i8 < size5; i8++) {
            C34680OooO0O0.C20372OooO0O0 c20372OooO0O07 = (C34680OooO0O0.C20372OooO0O0) arrayList2.get(i8);
            C34699OooOo0O c34699OooOo0O = (C34699OooOo0O) c20372OooO0O07.f124898OooO00o;
            OooOOO0.OooO0oO(c34699OooOo0O, "<this>");
            c34699OooOo0O.getClass();
            spannableString.setSpan(new URLSpan((String) null), c20372OooO0O07.f124899OooO0O0, c20372OooO0O07.f124900OooO0OO, 33);
        }
        return spannableString;
    }
}

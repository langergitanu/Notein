package o000000o;

import OooooO0.C21290OooO0o0;
import android.graphics.Typeface;
import android.util.Log;
import com.facebook.soloader.AbstractC22320OooOoO0;
import com.facebook.soloader.C22307OooO0Oo;
import com.facebook.soloader.C22317OooOo0O;
import com.facebook.soloader.C22318OooOo0o;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24749OooO0Oo;
import o00Ooo.C25077OooO0o0;
import o00o0O.C25303OooO00o;
import o00o0O.C25304OooO0O0;
import o00o0O.C25305OooO0OO;
import o00o0O.C25306OooO0Oo;
import o00o0O.C25307OooO0o0;
import o00ooOo.InterfaceC25783OooO0o;
import oO00ooO.C32435OooO0Oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o000000o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24099OooOoO0 implements InterfaceC24096OooOo0O, InterfaceC25783OooO0o {
    public static final void OooO0Oo(C25307OooO0o0 c25307OooO0o0, o00Ooo.OooOo00 event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25307OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        boolean zOooO00o = o00Ooo.OooOOO.OooO00o(event);
        int i = 0;
        C25306OooO0Oo c25306OooO0Oo = c25307OooO0o0.f86130OooO0O0;
        C25306OooO0Oo c25306OooO0Oo2 = c25307OooO0o0.f86129OooO00o;
        long j = event.f85146OooO0OO;
        if (zOooO00o) {
            c25307OooO0o0.f86131OooO0OO = j;
            C25303OooO00o[] c25303OooO00oArr = c25306OooO0Oo2.f86125OooO0OO;
            Oooo.OooO0OO.OooOOOO(c25303OooO00oArr, null, 0, c25303OooO00oArr.length);
            c25306OooO0Oo2.f86126OooO0Oo = 0;
            C25303OooO00o[] c25303OooO00oArr2 = c25306OooO0Oo.f86125OooO0OO;
            Oooo.OooO0OO.OooOOOO(c25303OooO00oArr2, null, 0, c25303OooO00oArr2.length);
            c25306OooO0Oo.f86126OooO0Oo = 0;
        }
        List list = event.f85153OooOO0O;
        if (list == null) {
            list = C34434OooOoO.f123453OooOo0o;
        }
        int size = list.size();
        long j2 = event.f85148OooO0o;
        while (i < size) {
            C25077OooO0o0 c25077OooO0o0 = (C25077OooO0o0) list.get(i);
            long jOooO0o = C21290OooO0o0.OooO0o(c25307OooO0o0.f86131OooO0OO, C21290OooO0o0.OooO0o0(c25077OooO0o0.f85107OooO0O0, j2));
            c25307OooO0o0.f86131OooO0OO = jOooO0o;
            float fOooO0OO = C21290OooO0o0.OooO0OO(jOooO0o);
            long j3 = c25077OooO0o0.f85106OooO00o;
            c25306OooO0Oo2.OooO00o(fOooO0OO, j3);
            c25306OooO0Oo.OooO00o(C21290OooO0o0.OooO0Oo(jOooO0o), j3);
            i++;
            j2 = c25077OooO0o0.f85107OooO0O0;
        }
        long jOooO0o2 = C21290OooO0o0.OooO0o(c25307OooO0o0.f86131OooO0OO, C21290OooO0o0.OooO0o0(j, j2));
        c25307OooO0o0.f86131OooO0OO = jOooO0o2;
        float fOooO0OO2 = C21290OooO0o0.OooO0OO(jOooO0o2);
        long j4 = event.f85145OooO0O0;
        c25306OooO0Oo2.OooO00o(fOooO0OO2, j4);
        c25306OooO0Oo.OooO00o(C21290OooO0o0.OooO0Oo(jOooO0o2), j4);
    }

    public static Typeface OooO0o(String str, C24093OooOOo0 c24093OooOOo0, int i) {
        if (i == 0 && kotlin.jvm.internal.OooOOO0.OooO0O0(c24093OooOOo0, C24093OooOOo0.f81191OooOoO0) && (str == null || str.length() == 0)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            kotlin.jvm.internal.OooOOO0.OooO0o(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int iOooO0O0 = C24085OooO0OO.OooO0O0(c24093OooOOo0, i);
        if (str == null || str.length() == 0) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iOooO0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iOooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }

    public static final void OooO0o0(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Throwable th) {
        if (interfaceC24749OooO0Oo != null) {
            if (th == null) {
                interfaceC24749OooO0Oo.close();
                return;
            }
            try {
                interfaceC24749OooO0Oo.close();
            } catch (Throwable th2) {
                C32435OooO0Oo.OooO00o(th, th2);
            }
        }
    }

    public static final ArrayList OooO0oO(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = 2 >= arrayList.size() ? arrayList.size() - 1 : 2;
        ArrayList arrayList3 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList3.add(Float.valueOf(0.0f));
        }
        int size2 = arrayList.size();
        int i2 = size + 1;
        C25304OooO0O0 c25304OooO0O0 = new C25304OooO0O0(i2, size2);
        for (int i3 = 0; i3 < size2; i3++) {
            c25304OooO0O0.OooO0O0(0, i3, 1.0f);
            for (int i4 = 1; i4 < i2; i4++) {
                c25304OooO0O0.OooO0O0(i4, i3, ((Number) arrayList.get(i3)).floatValue() * c25304OooO0O0.OooO00o(i4 - 1, i3));
            }
        }
        C25304OooO0O0 c25304OooO0O02 = new C25304OooO0O0(i2, size2);
        C25304OooO0O0 c25304OooO0O03 = new C25304OooO0O0(i2, i2);
        int i5 = 0;
        while (true) {
            C25305OooO0OO[] c25305OooO0OOArr = c25304OooO0O02.f86120OooO00o;
            if (i5 >= i2) {
                C25305OooO0OO c25305OooO0OO = new C25305OooO0OO(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    c25305OooO0OO.f86122OooO0O0[i6] = Float.valueOf(((Number) arrayList2.get(i6)).floatValue() * 1.0f);
                }
                for (int i7 = size; -1 < i7; i7--) {
                    arrayList3.set(i7, Float.valueOf(c25305OooO0OOArr[i7].OooO00o(c25305OooO0OO)));
                    int i8 = i7 + 1;
                    if (i8 <= size) {
                        int i9 = size;
                        while (true) {
                            arrayList3.set(i7, Float.valueOf(((Number) arrayList3.get(i7)).floatValue() - (((Number) arrayList3.get(i9)).floatValue() * c25304OooO0O03.OooO00o(i7, i9))));
                            if (i9 != i8) {
                                i9--;
                            }
                        }
                    }
                    arrayList3.set(i7, Float.valueOf(((Number) arrayList3.get(i7)).floatValue() / c25304OooO0O03.OooO00o(i7, i7)));
                }
                return arrayList3;
            }
            for (int i10 = 0; i10 < size2; i10++) {
                c25304OooO0O02.OooO0O0(i5, i10, c25304OooO0O0.OooO00o(i5, i10));
            }
            for (int i11 = 0; i11 < i5; i11++) {
                float fOooO00o = c25305OooO0OOArr[i5].OooO00o(c25305OooO0OOArr[i11]);
                for (int i12 = 0; i12 < size2; i12++) {
                    c25304OooO0O02.OooO0O0(i5, i12, c25304OooO0O02.OooO00o(i5, i12) - (c25304OooO0O02.OooO00o(i11, i12) * fOooO00o));
                }
            }
            C25305OooO0OO c25305OooO0OO2 = c25305OooO0OOArr[i5];
            float fSqrt = (float) Math.sqrt(c25305OooO0OO2.OooO00o(c25305OooO0OO2));
            if (fSqrt < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f = 1.0f / fSqrt;
            for (int i13 = 0; i13 < size2; i13++) {
                c25304OooO0O02.OooO0O0(i5, i13, c25304OooO0O02.OooO00o(i5, i13) * f);
            }
            int i14 = 0;
            while (i14 < i2) {
                c25304OooO0O03.OooO0O0(i5, i14, i14 < i5 ? 0.0f : c25305OooO0OOArr[i5].OooO00o(c25304OooO0O0.f86120OooO00o[i14]));
                i14++;
            }
            i5++;
        }
    }

    @Override // o000000o.InterfaceC24096OooOo0O
    public Typeface OooO00o(C24093OooOOo0 fontWeight, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        return OooO0o(null, fontWeight, i);
    }

    @Override // o00ooOo.InterfaceC25783OooO0o
    public boolean OooO0O0(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        C22318OooOo0o c22318OooOo0o;
        String message;
        if ((unsatisfiedLinkError instanceof C22318OooOo0o) && !(unsatisfiedLinkError instanceof C22317OooOo0O) && (message = (c22318OooOo0o = (C22318OooOo0o) unsatisfiedLinkError).getMessage()) != null && (message.contains("/app/") || message.contains("/mnt/"))) {
            StringBuilder sb = new StringBuilder("Reunpacking BackupSoSources due to ");
            sb.append(unsatisfiedLinkError);
            String str = c22318OooOo0o.f67512OooOo0o;
            sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
            Log.e("SoLoader", sb.toString());
            for (AbstractC22320OooOoO0 abstractC22320OooOoO0 : abstractC22320OooOoO0Arr) {
                if (abstractC22320OooOoO0 instanceof C22307OooO0Oo) {
                    C22307OooO0Oo c22307OooO0Oo = (C22307OooO0Oo) abstractC22320OooOoO0;
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Runpacking BackupSoSource ");
                        c22307OooO0Oo.getClass();
                        sb2.append("BackupSoSource");
                        Log.e("SoLoader", sb2.toString());
                        c22307OooO0Oo.OooO0o0(2);
                    } catch (Exception e) {
                        StringBuilder sb3 = new StringBuilder("Encountered an exception while reunpacking BackupSoSource BackupSoSource for library ");
                        c22307OooO0Oo.getClass();
                        sb3.append(str);
                        sb3.append(": ");
                        Log.e("SoLoader", sb3.toString(), e);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // o000000o.InterfaceC24096OooOo0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface OooO0OO(C24092OooOOo name, C24093OooOOo0 fontWeight, int i) {
        String strConcat;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        String name2 = name.f81188OooOoO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name2, "name");
        int i2 = fontWeight.f81193OooOo0o / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = name2.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = name2.concat("-light");
        } else if (i2 != 4) {
            strConcat = i2 == 5 ? name2.concat("-medium") : ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) ? name2.concat("-black") : name2;
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceOooO0o = OooO0o(strConcat, fontWeight, i);
            if (!typefaceOooO0o.equals(Typeface.create(Typeface.DEFAULT, C24085OooO0OO.OooO0O0(fontWeight, i))) && !typefaceOooO0o.equals(OooO0o(null, fontWeight, i))) {
                typeface = typefaceOooO0o;
            }
        }
        return typeface == null ? OooO0o(name2, fontWeight, i) : typeface;
    }
}

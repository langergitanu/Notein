package OoooooO;

import OooooOO.C21348Ooooo0o;
import com.aspose.words.ControlChar;
import java.util.ArrayList;
import java.util.List;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooooO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21457OoooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f62122OooO00o = 0;

    static {
        int i = C21348Ooooo0o.f61767OooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<AbstractC21410OooO0o> OooO00o(String str) {
        char c;
        int i;
        float[] fArr;
        if (str == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        C21422OooO0oo c21422OooO0oo = new C21422OooO0oo();
        ArrayList arrayList = c21422OooO0oo.f62051OooO00o;
        arrayList.clear();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i5++;
                }
                if (cCharAt != 'e' && cCharAt != 'E') {
                    break;
                }
                i5++;
            }
            String strSubstring = str.substring(i4, i5);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - i3;
            int i6 = i2;
            int i7 = i6;
            while (true) {
                c = ControlChar.SPACE_CHAR;
                if (i6 > length) {
                    break;
                }
                int i8 = kotlin.jvm.internal.OooOOO0.OooO(strSubstring.charAt(i7 == 0 ? i6 : length), 32) <= 0 ? i3 : i2;
                if (i7 == 0) {
                    if (i8 == 0) {
                        i7 = i3;
                    } else {
                        i6++;
                    }
                } else {
                    if (i8 == 0) {
                        break;
                    }
                    length--;
                }
            }
            String string = strSubstring.subSequence(i6, length + 1).toString();
            if (string.length() > 0) {
                if (string.charAt(i2) == 'z' || string.charAt(i2) == 'Z') {
                    i = i2;
                    fArr = new float[i];
                } else {
                    int length2 = string.length();
                    float[] fArr2 = new float[length2];
                    int length3 = string.length();
                    int i9 = i2;
                    int i10 = i3;
                    while (i10 < length3) {
                        int i11 = i2;
                        int i12 = i11;
                        int i13 = i12;
                        int i14 = i13;
                        int i15 = i10;
                        while (i15 < string.length()) {
                            char cCharAt2 = string.charAt(i15);
                            if (cCharAt2 == c || cCharAt2 == ',') {
                                i11 = 0;
                                i13 = 1;
                            } else if (cCharAt2 == '-') {
                                if (i15 == i10 || i11 != 0) {
                                    i11 = 0;
                                } else {
                                    i11 = 0;
                                    i13 = 1;
                                    i14 = 1;
                                }
                            } else if (cCharAt2 == '.') {
                                if (i12 == 0) {
                                    i11 = 0;
                                    i12 = 1;
                                }
                            } else if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                                i11 = 1;
                            }
                            if (i13 != 0) {
                                break;
                            }
                            i15++;
                            c = ControlChar.SPACE_CHAR;
                        }
                        if (i10 < i15) {
                            String strSubstring2 = string.substring(i10, i15);
                            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            fArr2[i9] = Float.parseFloat(strSubstring2);
                            i9++;
                        }
                        i10 = i14 != 0 ? i15 : i15 + 1;
                        i2 = 0;
                        c = ControlChar.SPACE_CHAR;
                    }
                    if (i9 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (length2 < 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    fArr = new float[i9];
                    i = 0;
                    System.arraycopy(fArr2, 0, fArr, 0, Math.min(i9, length2));
                }
                c21422OooO0oo.OooO00o(string.charAt(i), fArr);
            }
            i4 = i5;
            i3 = 1;
            i5++;
            i2 = 0;
        }
        if (i5 - i4 == 1 && i4 < str.length()) {
            c21422OooO0oo.OooO00o(str.charAt(i4), new float[0]);
        }
        return arrayList;
    }
}

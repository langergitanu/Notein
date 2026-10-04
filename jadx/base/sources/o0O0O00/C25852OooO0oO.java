package o0O0O00;

import OooOooo.C20785Oooo00o;
import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0O0O00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25852OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Layout f88218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f88219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f88220OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean[] f88221OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public char[] f88222OooO0o0;

    /* JADX INFO: renamed from: o0O0O00.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f88223OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f88224OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f88225OooO0OO;

        public OooO00o(int i, int i2, boolean z) {
            this.f88223OooO00o = i;
            this.f88224OooO0O0 = i2;
            this.f88225OooO0OO = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f88223OooO00o == oooO00o.f88223OooO00o && this.f88224OooO0O0 == oooO00o.f88224OooO0O0 && this.f88225OooO0OO == oooO00o.f88225OooO0OO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iOooO00o = C20785Oooo00o.OooO00o(this.f88224OooO0O0, Integer.hashCode(this.f88223OooO00o) * 31, 31);
            boolean z = this.f88225OooO0OO;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iOooO00o + r1;
        }

        public final String toString() {
            return "BidiRun(start=" + this.f88223OooO00o + ", end=" + this.f88224OooO0O0 + ", isRtl=" + this.f88225OooO0OO + ')';
        }
    }

    public C25852OooO0oO(Layout layout) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "layout");
        this.f88218OooO00o = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.f88218OooO00o.getText();
            kotlin.jvm.internal.OooOOO0.OooO0o(text, "layout.text");
            int iOooo0 = C33599OooOo0O.Oooo0(text, '\n', length, 4);
            length = iOooo0 < 0 ? this.f88218OooO00o.getText().length() : iOooo0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f88218OooO00o.getText().length());
        this.f88219OooO0O0 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f88220OooO0OO = arrayList2;
        this.f88221OooO0Oo = new boolean[this.f88219OooO0O0.size()];
        this.f88219OooO0O0.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float OooO00o(int i, boolean z, boolean z2) {
        int lineForOffset;
        int i2;
        int i3;
        boolean z3;
        int i4;
        Bidi bidi;
        Bidi bidi2;
        boolean z4;
        int iOooO0O0 = i;
        Layout layout = this.f88218OooO00o;
        if (!z2) {
            return z ? layout.getPrimaryHorizontal(iOooO0O0) : layout.getSecondaryHorizontal(iOooO0O0);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "<this>");
        if (iOooO0O0 <= 0) {
            lineForOffset = 0;
        } else if (iOooO0O0 >= layout.getText().length()) {
            lineForOffset = layout.getLineCount() - 1;
        } else {
            lineForOffset = layout.getLineForOffset(iOooO0O0);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == iOooO0O0 || lineEnd == iOooO0O0) {
                if (lineStart == iOooO0O0) {
                    if (z2) {
                        lineForOffset--;
                    }
                } else if (!z2) {
                    lineForOffset++;
                }
            }
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (iOooO0O0 != lineStart2 && iOooO0O0 != lineEnd2) {
            return z ? layout.getPrimaryHorizontal(iOooO0O0) : layout.getSecondaryHorizontal(iOooO0O0);
        }
        if (iOooO0O0 == 0 || iOooO0O0 == layout.getText().length()) {
            return z ? layout.getPrimaryHorizontal(iOooO0O0) : layout.getSecondaryHorizontal(iOooO0O0);
        }
        ArrayList arrayList = this.f88219OooO0O0;
        int iOooO = C34429OooOOo0.OooO(arrayList, Integer.valueOf(iOooO0O0));
        int i5 = iOooO < 0 ? -(iOooO + 1) : iOooO + 1;
        if (z2 && i5 > 0) {
            int i6 = i5 - 1;
            if (iOooO0O0 == ((Number) arrayList.get(i6)).intValue()) {
                i5 = i6;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1;
        int iOooO0O02 = OooO0O0(lineEnd2);
        int iIntValue = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
        int i7 = lineStart2 - iIntValue;
        int i8 = iOooO0O02 - iIntValue;
        boolean[] zArr = this.f88221OooO0Oo;
        boolean z6 = zArr[i5];
        ArrayList arrayList2 = this.f88220OooO0OO;
        if (z6) {
            bidi2 = (Bidi) arrayList2.get(i5);
            i3 = lineForOffset;
            i2 = iOooO0O02;
            i4 = -1;
        } else {
            int iIntValue2 = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i5)).intValue();
            int i9 = iIntValue3 - iIntValue2;
            char[] cArr = this.f88222OooO0o0;
            i2 = iOooO0O02;
            if (cArr == null || cArr.length < i9) {
                cArr = new char[i9];
            }
            i3 = lineForOffset;
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i9)) {
                i4 = -1;
                Bidi bidi3 = new Bidi(cArr, 0, null, 0, i9, layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi3.getRunCount() != 1) {
                    bidi = bidi3;
                }
                arrayList2.set(i5, bidi);
                zArr[i5] = z3;
                if (bidi != null) {
                    char[] cArr2 = this.f88222OooO0o0;
                    cArr = cArr == cArr2 ? null : cArr2;
                }
                this.f88222OooO0o0 = cArr;
                bidi2 = bidi;
            } else {
                z3 = true;
                i4 = -1;
            }
            bidi = null;
            arrayList2.set(i5, bidi);
            zArr[i5] = z3;
            if (bidi != null) {
            }
            this.f88222OooO0o0 = cArr;
            bidi2 = bidi;
        }
        Bidi bidiCreateLineBidi = bidi2 != null ? bidi2.createLineBidi(i7, i8) : null;
        if (bidiCreateLineBidi == null) {
            z4 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                OooO00o[] oooO00oArr = new OooO00o[runCount];
                for (int i10 = 0; i10 < runCount; i10++) {
                    oooO00oArr[i10] = new OooO00o(bidiCreateLineBidi.getRunStart(i10) + lineStart2, bidiCreateLineBidi.getRunLimit(i10) + lineStart2, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i11 = 0; i11 < runCount2; i11++) {
                    bArr[i11] = (byte) bidiCreateLineBidi.getRunLevel(i11);
                }
                Bidi.reorderVisually(bArr, 0, oooO00oArr, 0, runCount);
                if (iOooO0O0 == lineStart2) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= runCount) {
                            i12 = i4;
                            break;
                        }
                        if (oooO00oArr[i12].f88223OooO00o == iOooO0O0) {
                            break;
                        }
                        i12++;
                    }
                    OooO00o oooO00o = oooO00oArr[i12];
                    if (z || z5 == oooO00o.f88225OooO0OO) {
                        z5 = !z5;
                    }
                    if (i12 == 0 && z5) {
                        return layout.getLineLeft(i3);
                    }
                    return (i12 != runCount + (-1) || z5) ? z5 ? layout.getPrimaryHorizontal(oooO00oArr[i12 - 1].f88223OooO00o) : layout.getPrimaryHorizontal(oooO00oArr[i12 + 1].f88223OooO00o) : layout.getLineRight(i3);
                }
                int i13 = i3;
                if (iOooO0O0 > i2) {
                    iOooO0O0 = OooO0O0(i);
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= runCount) {
                        i14 = i4;
                        break;
                    }
                    if (oooO00oArr[i14].f88224OooO0O0 == iOooO0O0) {
                        break;
                    }
                    i14++;
                }
                OooO00o oooO00o2 = oooO00oArr[i14];
                if (!z && z5 != oooO00o2.f88225OooO0OO) {
                    z5 = !z5;
                }
                return (i14 == 0 && z5) ? layout.getLineLeft(i13) : (i14 != runCount + (-1) || z5) ? z5 ? layout.getPrimaryHorizontal(oooO00oArr[i14 - 1].f88224OooO0O0) : layout.getPrimaryHorizontal(oooO00oArr[i14 + 1].f88224OooO0O0) : layout.getLineRight(i13);
            }
            z4 = true;
        }
        int i15 = i3;
        boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z || z5 == zIsRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return iOooO0O0 == lineStart2 ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i15) : layout.getLineRight(i15);
    }

    public final int OooO0O0(int i) {
        while (i > 0) {
            char cCharAt = this.f88218OooO00o.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((8192 > cCharAt || cCharAt >= 8203 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }
}

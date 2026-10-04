package com.aspose.words.internal;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDR {
    final String[] zzWIO;
    final char[] zzWMm;

    public static final class zzZ {
        int zzVf;
        final String[] zzWIO;
        char[] zzWMm;

        public zzZ(TreeSet<String> treeSet) {
            int size = treeSet.size();
            String[] strArr = new String[size];
            this.zzWIO = strArr;
            treeSet.toArray(strArr);
            if (size >= 2) {
                int i = size * 6;
                this.zzWMm = new char[i < 256 ? 256 : i];
            } else {
                if (size == 0) {
                    throw new IllegalArgumentException();
                }
                this.zzWMm = null;
            }
        }

        private void zzZR(int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            int i6;
            if (this.zzVf >= this.zzWMm.length) {
                zzg9(1);
            }
            char[] cArr = this.zzWMm;
            int i7 = this.zzVf;
            this.zzVf = i7 + 1;
            cArr[i7] = 0;
            int i8 = i7 + 2;
            String[] strArr = this.zzWIO;
            int i9 = 57344;
            if (strArr[i2].length() == i) {
                if (this.zzVf + 2 > this.zzWMm.length) {
                    zzg9(2);
                }
                char[] cArr2 = this.zzWMm;
                int i10 = this.zzVf;
                int i11 = i10 + 1;
                this.zzVf = i11;
                cArr2[i10] = 0;
                this.zzVf = i10 + 2;
                cArr2[i11] = (char) (i2 + 57344);
                i5 = i2 + 1;
                i4 = 1;
                z = true;
            } else {
                i4 = 0;
                z = false;
                i5 = i2;
            }
            while (i5 < i3) {
                char cCharAt = strArr[i5].charAt(i);
                int i12 = i5 + 1;
                while (i12 < i3 && strArr[i12].charAt(i) == cCharAt) {
                    i12++;
                }
                if (this.zzVf + 2 > this.zzWMm.length) {
                    zzg9(2);
                }
                char[] cArr3 = this.zzWMm;
                int i13 = this.zzVf;
                int i14 = i9;
                int i15 = i13 + 1;
                this.zzVf = i15;
                cArr3[i13] = cCharAt;
                this.zzVf = i13 + 2;
                cArr3[i15] = (char) (i12 - i5);
                i4++;
                i5 = i12;
                i9 = i14;
            }
            int i16 = i9;
            this.zzWMm[i7] = (char) i4;
            if (z) {
                i8 = i7 + 4;
                i6 = i2 + 1;
            } else {
                i6 = i2;
            }
            int i17 = this.zzVf;
            int i18 = i + 1;
            while (i8 < i17) {
                char[] cArr4 = this.zzWMm;
                char c = cArr4[i8];
                if (c == 1) {
                    cArr4[i8] = (char) (i6 + i16);
                } else {
                    cArr4[i8] = (char) this.zzVf;
                    zzZR(i18, i6, i6 + c);
                }
                i6 += c;
                i8 += 2;
            }
        }

        private char[] zzg9(int i) {
            char[] cArr = this.zzWMm;
            int length = cArr.length;
            int i2 = (length < 4096 ? length : length >> 1) + length;
            int i3 = this.zzVf;
            if (i2 < i3 + i) {
                i2 = i3 + i + 64;
            }
            char[] cArr2 = new char[i2];
            this.zzWMm = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, length);
            return this.zzWMm;
        }

        public final zzZDR zzXLb() {
            char[] cArr = null;
            byte b = 0;
            if (this.zzWMm != null) {
                zzZR(0, 0, this.zzWIO.length);
                int i = this.zzVf;
                if (i > 57344) {
                    return null;
                }
                cArr = new char[i];
                System.arraycopy(this.zzWMm, 0, cArr, 0, i);
            }
            return new zzZDR(this.zzWIO, cArr, b);
        }
    }

    public /* synthetic */ zzZDR(String[] strArr, char[] cArr, byte b) {
        this(strArr, cArr);
    }

    private String zzH(char[] cArr, int i, int i2) {
        String str = this.zzWIO[0];
        int i3 = i2 - i;
        if (str.length() != i3) {
            return null;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (str.charAt(i4) != cArr[i + i4]) {
                return null;
            }
        }
        return str;
    }

    public static zzZDR zzZ(TreeSet<String> treeSet) {
        if (treeSet.size() > 8192) {
            return null;
        }
        return new zzZ(treeSet).zzXLb();
    }

    public final int size() {
        return this.zzWIO.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzWIO.length << 3) + 16);
        int length = this.zzWIO.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.zzWIO[i]);
        }
        return sb.toString();
    }

    public final String zzL(char[] cArr, int i, int i2) {
        char c;
        char[] cArr2 = this.zzWMm;
        if (cArr2 == null) {
            return zzH(cArr, i, i2);
        }
        int i3 = i;
        char c2 = 0;
        while (i3 != i2) {
            int i4 = c2 + 1;
            char c3 = cArr2[c2];
            int i5 = i3 + 1;
            char c4 = cArr[i3];
            if (c3 >= 7) {
                int i6 = c3 - 1;
                int i7 = 0;
                while (i7 <= i6) {
                    int i8 = (i7 + i6) >> 1;
                    int i9 = (i8 << 1) + i4;
                    int i10 = cArr2[i9] - c4;
                    if (i10 > 0) {
                        i6 = i8 - 1;
                    } else if (i10 < 0) {
                        i7 = i8 + 1;
                    } else {
                        c = cArr2[i9 + 1];
                    }
                }
                return null;
            }
            if (cArr2[i4] == c4) {
                c = cArr2[c2 + 2];
            } else {
                if (cArr2[c2 + 3] != c4) {
                    int i11 = i4 + (c3 << 1);
                    for (int i12 = c2 + 5; i12 < i11; i12 += 2) {
                        if (cArr2[i12] == c4) {
                            c = cArr2[i12 + 1];
                        }
                    }
                    return null;
                }
                c = cArr2[c2 + 4];
            }
            c2 = c;
            if (c2 >= 57344) {
                String str = this.zzWIO[c2 - 57344];
                if (str.length() != i2 - i) {
                    return null;
                }
                int i13 = i5 - i;
                while (i5 < i2) {
                    if (str.charAt(i13) != cArr[i5]) {
                        return null;
                    }
                    i13++;
                    i5++;
                }
                return str;
            }
            i3 = i5;
        }
        if (cArr2[c2 + 1] == 0) {
            return this.zzWIO[cArr2[c2 + 2] - 57344];
        }
        return null;
    }

    public final String zzwU(String str) {
        char c;
        char[] cArr = this.zzWMm;
        if (cArr == null) {
            String str2 = this.zzWIO[0];
            if (str2.equals(str)) {
                return str2;
            }
            return null;
        }
        int length = str.length();
        int i = 0;
        char c2 = 0;
        while (i != length) {
            int i2 = c2 + 1;
            char c3 = cArr[c2];
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (c3 >= 7) {
                int i4 = c3 - 1;
                int i5 = 0;
                while (i5 <= i4) {
                    int i6 = (i5 + i4) >> 1;
                    int i7 = (i6 << 1) + i2;
                    int i8 = cArr[i7] - cCharAt;
                    if (i8 > 0) {
                        i4 = i6 - 1;
                    } else if (i8 < 0) {
                        i5 = i6 + 1;
                    } else {
                        c = cArr[i7 + 1];
                    }
                }
                return null;
            }
            if (cArr[i2] == cCharAt) {
                c = cArr[c2 + 2];
            } else {
                if (cArr[c2 + 3] != cCharAt) {
                    int i9 = i2 + (c3 << 1);
                    for (int i10 = c2 + 5; i10 < i9; i10 += 2) {
                        if (cArr[i10] == cCharAt) {
                            c = cArr[i10 + 1];
                        }
                    }
                    return null;
                }
                c = cArr[c2 + 4];
            }
            c2 = c;
            if (c2 >= 57344) {
                String str3 = this.zzWIO[c2 - 57344];
                if (str3.length() != str.length()) {
                    return null;
                }
                while (i3 < length) {
                    if (str3.charAt(i3) != str.charAt(i3)) {
                        return null;
                    }
                    i3++;
                }
                return str3;
            }
            i = i3;
        }
        if (cArr[c2 + 1] == 0) {
            return this.zzWIO[cArr[c2 + 2] - 57344];
        }
        return null;
    }

    private zzZDR(String[] strArr, char[] cArr) {
        this.zzWIO = strArr;
        this.zzWMm = cArr;
    }
}

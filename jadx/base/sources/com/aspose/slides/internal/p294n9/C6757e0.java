package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C6757e0 extends AbstractC6778um {

    /* JADX INFO: renamed from: k4 */
    public static final C6757e0 f18654k4 = new C6757e0();

    /* JADX INFO: renamed from: x1 */
    private static final char[] f18655x1 = {256, 'A', 257, 'a', 258, 'A', 259, 'a', 260, 'A', 261, 'a', 262, 'C', 263, 'c', 264, 'C', 265, 'c', 266, 'C', 267, 'c', 268, 'C', 269, 'c', 270, 'D', 271, 'd', 272, 'D', 273, 'd', 274, 'E', 275, 'e', 276, 'E', 277, 'e', 278, 'E', 279, 'e', 280, 'E', 281, 'e', 282, 'E', 283, 'e', 284, 'G', 285, 'g', 286, 'G', 287, 'g', 288, 'G', 289, 'g', 290, 'G', 291, 'g', 292, 'H', 293, 'h', 294, 'H', 295, 'h', 296, 'I', 297, 'i', 298, 'I', 299, 'i', 300, 'I', 301, 'i', 302, 'I', 303, 'i', 304, 'I', 305, 'i', 308, 'J', 309, 'j', 310, 'K', 311, 'k', 313, 'L', 314, 'l', 315, 'L', 316, 'l', 317, 'L', 318, 'l', 321, 'L', 322, 'l', 323, 'N', 324, 'n', 325, 'N', 326, 'n', 327, 'N', 328, 'n', 332, 'O', 333, 'o', 334, 'O', 335, 'o', 336, 'O', 337, 'o', 338, 'O', 339, 'o', 340, 'R', 341, 'r', 342, 'R', 343, 'r', 344, 'R', 345, 'r', 346, 'S', 347, 's', 348, 'S', 349, 's', 350, 'S', 351, 's', 352, 'S', 353, 's', 354, 'T', 355, 't', 356, 'T', 357, 't', 358, 'T', 359, 't', 360, 'U', 361, 'u', 362, 'U', 363, 'u', 364, 'U', 365, 'u', 366, 'U', 367, 'u', 368, 'U', 369, 'u', 370, 'U', 371, 'u', 372, 'W', 373, 'w', 374, 'Y', 375, 'y', 376, 'Y', 377, 'Z', 378, 'z', 379, 'Z', 380, 'z', 381, 'Z', 382, 'z', 384, 'b', 393, 'D', 401, 'F', 402, 'f', 407, 'I', 410, 'l', 415, 'O', 416, 'O', 417, 'o', 427, 't', 430, 'T', 431, 'U', 432, 'u', 438, 'z', 461, 'A', 462, 'a', 463, 'I', 464, 'i', 465, 'O', 466, 'o', 467, 'U', 468, 'u', 469, 'U', 470, 'u', 471, 'U', 472, 'u', 473, 'U', 474, 'u', 475, 'U', 476, 'u', 478, 'A', 479, 'a', 484, 'G', 485, 'g', 486, 'G', 487, 'g', 488, 'K', 489, 'k', 490, 'O', 491, 'o', 492, 'O', 493, 'o', 496, 'j', 609, 'g', 697, '\'', 698, '\"', 700, '\'', 708, '^', 710, '^', 712, '\'', 713, '?', 714, '?', 715, '`', 717, '_', 730, '?', 732, '~', 768, '`', 770, '^', 771, '~', 782, '\"', 817, '_', 818, '_', 8192, ControlChar.SPACE_CHAR, 8193, ControlChar.SPACE_CHAR, ControlChar.DEFAULT_TEXT_INPUT_CHAR, ControlChar.SPACE_CHAR, 8195, ControlChar.SPACE_CHAR, 8196, ControlChar.SPACE_CHAR, 8197, ControlChar.SPACE_CHAR, 8198, ControlChar.SPACE_CHAR, 8208, '-', 8209, '-', 8211, '-', 8212, '-', 8216, '\'', 8217, '\'', 8218, ',', 8220, '\"', 8221, '\"', 8222, '\"', 8224, '?', 8225, '?', 8226, FilenameUtils.EXTENSION_SEPARATOR, 8230, FilenameUtils.EXTENSION_SEPARATOR, 8240, '?', 8242, '\'', 8245, '`', 8249, '<', 8250, '>', 8482, 'T', 65281, '!', 65282, '\"', 65283, '#', 65284, '$', 65285, '%', 65286, '&', 65287, '\'', 65288, '(', 65289, ')', 65290, '*', 65291, '+', 65292, ',', 65293, '-', 65294, FilenameUtils.EXTENSION_SEPARATOR, 65295, IOUtils.DIR_SEPARATOR_UNIX, 65296, '0', 65297, '1', 65298, '2', 65299, '3', 65300, '4', 65301, '5', 65302, '6', 65303, '7', 65304, '8', 65305, '9', 65306, ':', 65307, ';', 65308, '<', 65309, '=', 65310, '>', 65311, '?', 65312, '@', 65313, 'A', 65314, 'B', 65315, 'C', 65316, 'D', 65317, 'E', 65318, 'F', 65319, 'G', 65320, 'H', 65321, 'I', 65322, 'J', 65323, 'K', 65324, 'L', 65325, 'M', 65326, 'N', 65327, 'O', 65328, 'P', 65329, 'Q', 65330, 'R', 65331, 'S', 65332, 'T', 65333, 'U', 65334, 'V', 65335, 'W', 65336, 'X', 65337, 'Y', 65338, 'Z', 65339, '[', 65340, IOUtils.DIR_SEPARATOR_WINDOWS, 65341, ']', 65342, '^', 65343, '_', 65344, '`', 65345, 'a', 65346, 'b', 65347, 'c', 65348, 'd', 65349, 'e', 65350, 'f', 65351, 'g', 65352, 'h', 65353, 'i', 65354, 'j', 65355, 'k', 65356, 'l', 65357, 'm', 65358, 'n', 65359, 'o', 65360, 'p', 65361, 'q', 65362, 'r', 65363, 's', 65364, 't', 65365, 'u', 65366, 'v', 65367, 'w', 65368, 'x', 65369, 'y', 65370, 'z', 65371, '{', 65372, '|', 65373, '}', 65374, '~'};

    public C6757e0() {
        super(28591);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26620k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
        }
        long jMo26737x1 = ((long) i) + 1;
        if (m26654ck().mo26737x1() > 1) {
            jMo26737x1 *= (long) m26654ck().mo26737x1();
        }
        if (jMo26737x1 <= 2147483647L) {
            return (int) jMo26737x1;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: qq */
    public char[] mo26675qq() {
        return f18655x1;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        long jMo26735x1 = i;
        if (m26656fa().mo26735x1() > 1) {
            jMo26735x1 *= (long) m26656fa().mo26735x1();
        }
        if (jMo26735x1 <= 2147483647L) {
            return (int) jMo26735x1;
        }
        throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        return i2;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        if (i4 < i2) {
            m26668k4(c6753ck, i4 < 1);
            i2 = i4;
        }
        int i5 = i + i2;
        while (i < i5) {
            cArr[i3] = (char) (bArr[i] & 255);
            i3++;
            i++;
        }
        if (c6753ck != null) {
            c6753ck.f18640du = i2;
        }
        return i2;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        AbstractC6761ix abstractC6761ixMo26736k4;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        if (c6782wl != null && c6782wl.mo26737x1() == 1) {
            return c > 0 ? i2 + 1 : i2;
        }
        int i3 = i + i2;
        int[] iArr = new int[1];
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i3, c6780uz, false);
            iArr[0] = i;
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i = iArr[0];
        } else {
            abstractC6761ixMo26736k4 = null;
        }
        int i4 = 0;
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i >= i3) {
                return i4;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i];
                i++;
            }
            if (cM26755h4 > 255) {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i3 - i2, i3, c6780uz, false);
                }
                iArr[0] = i;
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                i = iArr[0];
            } else {
                i4++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        r10 = false;
     */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        C6782wl c6782wl;
        char c;
        AbstractC6761ix abstractC6761ixMo26736k4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        int i8;
        if (c6780uz != null) {
            c = c6780uz.f18747kk;
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) c6780uz.m26811k4(), C6782wl.class);
        } else {
            c6782wl = (C6782wl) C7019kk.m27452k4((Object) m26654ck(), C6782wl.class);
            c = 0;
        }
        int i9 = i + i2;
        if (c6782wl != null && c6782wl.mo26737x1() == 1 && (cCharAt = c6782wl.m26843du().charAt(0)) <= 255) {
            if (c > 0) {
                if (i4 == 0) {
                    m26670k4(c6780uz, true);
                }
                i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                i8 = i4 - 1;
            } else {
                i7 = i3;
                i8 = i4;
            }
            if (i8 < i2) {
                m26670k4(c6780uz, i8 < 1);
                i9 = i + i8;
            }
            int i10 = i;
            while (i10 < i9) {
                int i11 = i10 + 1;
                char c2 = cArr[i10];
                if (c2 > 255) {
                    bArr[i7] = (byte) cCharAt;
                    i7++;
                } else {
                    bArr[i7] = (byte) c2;
                    i7++;
                }
                i10 = i11;
            }
            if (c6780uz != null) {
                c6780uz.f18747kk = (char) 0;
                c6780uz.f18745du = i10 - i;
            }
            return i7 - i3;
        }
        int i12 = i3 + i4;
        int[] iArr = new int[1];
        if (c > 0) {
            abstractC6761ixMo26736k4 = c6780uz.m26814x1();
            abstractC6761ixMo26736k4.m26758k4(i, i9, c6780uz, true);
            iArr[0] = i;
            abstractC6761ixMo26736k4.m26761k4(c, cArr, iArr);
            i6 = iArr[0];
            if (abstractC6761ixMo26736k4.mo26762kk() > i12 - i3) {
                m26670k4(c6780uz, true);
            }
            i5 = i3;
        } else {
            abstractC6761ixMo26736k4 = null;
            i5 = i3;
            i6 = i;
        }
        while (true) {
            char cM26755h4 = abstractC6761ixMo26736k4 == null ? (char) 0 : abstractC6761ixMo26736k4.m26755h4();
            if (cM26755h4 == 0 && i6 >= i9) {
                break;
            }
            if (cM26755h4 == 0) {
                cM26755h4 = cArr[i6];
                i6++;
            }
            if (cM26755h4 > 255) {
                if (abstractC6761ixMo26736k4 == null) {
                    abstractC6761ixMo26736k4 = c6780uz == null ? this.f18591ks.mo26736k4() : c6780uz.m26814x1();
                    abstractC6761ixMo26736k4.m26758k4(i9 - i2, i9, c6780uz, true);
                }
                iArr[0] = i6;
                abstractC6761ixMo26736k4.m26761k4(cM26755h4, cArr, iArr);
                i6 = iArr[0];
                if (abstractC6761ixMo26736k4.mo26762kk() > i12 - i5) {
                    i6--;
                    abstractC6761ixMo26736k4.m26754du();
                    if (i6 != i) {
                    }
                }
            } else if (i5 >= i12) {
                if (abstractC6761ixMo26736k4 == null || !abstractC6761ixMo26736k4.f18669h4) {
                    i6--;
                }
                if (i6 != i) {
                }
            } else {
                bArr[i5] = (byte) cM26755h4;
                i5++;
            }
        }
        m26670k4(c6780uz, z);
        if (c6780uz != null) {
            if (abstractC6761ixMo26736k4 != null && !abstractC6761ixMo26736k4.f18668du) {
                c6780uz.f18747kk = (char) 0;
            }
            c6780uz.f18745du = i6 - i;
        }
        return i5 - i3;
    }
}

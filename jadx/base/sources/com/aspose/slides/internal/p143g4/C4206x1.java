package com.aspose.slides.internal.p143g4;

import com.aspose.slides.internal.p102e8.OooO00o;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.g4.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4206x1 {

    /* JADX INFO: renamed from: k4 */
    private static long f11471k4 = 4294112499L;

    /* JADX INFO: renamed from: k4 */
    public static long m16877k4(long j) {
        long j2;
        long j3 = f11471k4;
        if (j == j3) {
            return 0L;
        }
        long j4 = j & 4294967295L;
        int i = ((byte) ((j4 >> 24) & 4294967295L)) & 255;
        if (i == 0) {
            return j3;
        }
        if (i == 255) {
            j2 = ((~j4) & 4294967295L) | 4278190080L;
        } else {
            j2 = ~((OooO00o.OooO00o((((byte) (j & 4294967295L)) & 255) * i, 255.0f, 13) & 255) | (((OooO00o.OooO00o((((byte) ((j4 >> 16) & 4294967295L)) & 255) * i, 255.0f, 13) & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) | (((OooO00o.OooO00o((((byte) ((j4 >> 8) & 4294967295L)) & 255) * i, 255.0f, 13) & 255) << 8) & 65280));
        }
        return j2 & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public static long m16880kk(long j, long j2) {
        return m16877k4(m16882x1(j, j2));
    }

    /* JADX INFO: renamed from: to */
    public static long m16881to(long j, long j2) {
        return m16880kk(m16880kk(j, m16880kk(j, j2)), m16880kk(j2, m16880kk(j, j2)));
    }

    /* JADX INFO: renamed from: x1 */
    public static long m16882x1(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j2 & 4294967295L;
        byte b = (byte) ((j4 >> 24) & 4294967295L);
        long j5 = j & j2 & 4294967295L;
        int i = ((byte) ((j3 >> 24) & 4294967295L)) & 255;
        if (i == 0 && (b & 255) == 0) {
            return 0L;
        }
        if (i == 255 && (b & 255) == 255) {
            return j5;
        }
        if ((j3 == 0 && j2 == 4294967295L) || (j4 == 0 && j == 4294967295L)) {
            return 0L;
        }
        float f = i;
        byte bOooO00o = OooO00o.OooO00o((((byte) ((j3 >> 16) & 4294967295L)) & 255) * 1.0f, f, 13);
        long jM27442k4 = ((((C7019kk.m27442k4(Float.valueOf(((((byte) ((j3 >> 8) & 4294967295L)) & 255) * 1.0f) / f), 13) & 255) << 8) & 65280) | ((long) (((bOooO00o & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | 4278190080L | ((long) (C7019kk.m27442k4(Float.valueOf(((((byte) (j & 4294967295L)) & 255) * 1.0f) / f), 13) & 255))) & 4294967295L;
        float f2 = b & 255;
        byte bOooO00o2 = OooO00o.OooO00o((((byte) ((j4 >> 16) & 4294967295L)) & 255) * 1.0f, f2, 13);
        byte bM27442k4 = C7019kk.m27442k4(Float.valueOf(((((byte) ((j4 >> 8) & 4294967295L)) & 255) * 1.0f) / f2), 13);
        return jM27442k4 & (((long) (C7019kk.m27442k4(Float.valueOf(((((byte) (j2 & 4294967295L)) & 255) * 1.0f) / f2), 13) & 255)) | ((long) (((bM27442k4 & 255) << 8) & 65280)) | ((long) (((bOooO00o2 & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) | 4278190080L) & 4294967295L & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m16878k4(long j, long j2) {
        long j3 = (j | j2) & 4294967295L;
        long j4 = j & 4294967295L;
        long j5 = j2 & 4294967295L;
        byte b = (byte) (4294967295L & (j5 >> 24));
        if ((((byte) ((j4 >> 24) & 4294967295L)) & 255) == 0 && (b & 255) == 0) {
            return 0L;
        }
        if ((j4 == 0 && j2 == 4278190080L) || (j5 == 0 && j == 4278190080L)) {
            return 0L;
        }
        return j3;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m16879k4(long j, long j2, long j3, long j4) {
        switch ((int) j4) {
            case 0:
                return 4278190080L;
            case 1:
                return m16877k4(m16878k4(j2, m16878k4(j3, j)));
            case 2:
                return m16882x1(j2, m16877k4(m16878k4(j3, j)));
            case 3:
                return m16877k4(m16878k4(j3, j));
            case 4:
                return m16882x1(j, m16877k4(m16878k4(j2, j3)));
            case 5:
                return m16877k4(m16878k4(j2, j3));
            case 6:
                return m16877k4(m16878k4(j3, m16877k4(m16881to(j2, j))));
            case 7:
                return m16877k4(m16878k4(j3, m16882x1(j2, j)));
            case 8:
                return m16882x1(j, m16882x1(j2, m16877k4(j3)));
            case 9:
                return m16877k4(m16878k4(j3, m16881to(j2, j)));
            case 10:
                return m16882x1(j2, m16877k4(j3));
            case 11:
                return m16877k4(m16878k4(j3, m16882x1(j, m16877k4(j2))));
            case 12:
                return m16882x1(j, m16877k4(j3));
            case 13:
                return m16877k4(m16878k4(m16882x1(m16877k4(j), j2), j3));
            case 14:
                return m16877k4(m16878k4(m16877k4(m16878k4(j2, j)), j3));
            case 15:
                return m16877k4(j3);
            case 16:
                return m16882x1(m16877k4(m16878k4(j2, j)), j3);
            case 17:
                return m16877k4(m16878k4(j, j2));
            case 18:
                return m16877k4(m16878k4(m16877k4(m16881to(j3, j2)), j));
            case 19:
                return m16877k4(m16878k4(m16882x1(j3, j2), j));
            case 20:
                return m16877k4(m16878k4(m16877k4(m16881to(j, j3)), j2));
            case 21:
                return m16877k4(m16878k4(m16882x1(j, j3), j2));
            case 22:
                return m16881to(m16881to(m16882x1(m16877k4(m16882x1(j, j3)), j2), j), j3);
            case 23:
                return m16877k4(m16881to(m16882x1(m16881to(j, j2), m16881to(j3, j)), j));
            case 24:
                return m16882x1(m16881to(j2, j3), m16881to(j3, j));
            case 25:
                return m16877k4(m16881to(m16882x1(m16877k4(m16882x1(j, j3)), j2), j));
            case 26:
                return m16881to(m16878k4(m16882x1(j3, j), j2), j3);
            case 27:
                return m16877k4(m16881to(m16882x1(m16881to(j, j3), j2), j));
            case 28:
                return m16881to(m16878k4(m16882x1(j3, j2), j), j3);
            case 29:
                return m16877k4(m16881to(m16882x1(m16881to(j2, j3), j), j2));
            case 30:
                return m16881to(m16878k4(j, j2), j3);
            case 31:
                return m16877k4(m16882x1(m16878k4(j, j2), j3));
            case 32:
                return m16882x1(m16882x1(m16877k4(j), j3), j2);
            case 33:
                return m16877k4(m16878k4(m16881to(j3, j2), j));
            case 34:
                return m16882x1(m16877k4(j), j2);
            case 35:
                return m16877k4(m16878k4(m16882x1(m16877k4(j2), j3), j));
            case 36:
                return m16882x1(m16881to(j, j2), m16881to(j3, j));
            case 37:
                return m16877k4(m16881to(m16882x1(m16877k4(m16882x1(j3, j)), j2), j3));
            case 38:
                return m16881to(m16878k4(m16882x1(j, j3), j2), j);
            case 39:
                return m16881to(m16878k4(m16877k4(m16881to(j, j3)), j2), j);
            case 40:
                return m16882x1(m16881to(j, j3), j2);
            case 41:
                return m16877k4(m16881to(m16881to(m16878k4(m16882x1(j, j3), j2), j), j3));
            case 42:
                return m16882x1(m16877k4(m16882x1(j, j3)), j2);
            case 43:
                return m16877k4(m16881to(m16882x1(m16881to(j2, j3), m16881to(j3, j)), j));
            case 44:
                return m16881to(m16882x1(m16878k4(j, j2), j3), j);
            case 45:
                return m16881to(m16878k4(m16877k4(j2), j), j3);
            case 46:
                return m16881to(m16878k4(m16881to(j3, j2), j), j3);
            case 47:
                return m16877k4(m16882x1(m16878k4(m16877k4(j2), j), j3));
            case 48:
                return m16882x1(m16877k4(j), j3);
            case 49:
                return m16877k4(m16878k4(m16882x1(m16877k4(j3), j2), j));
            case 50:
                return m16881to(m16878k4(m16878k4(j, j3), j2), j);
            case 51:
                return m16877k4(j);
            case 52:
                return m16881to(m16878k4(m16882x1(j, j2), j3), j);
            case 53:
                return m16881to(m16878k4(m16877k4(m16881to(j, j2)), j3), j);
            case 54:
                return m16881to(m16878k4(j3, j2), j);
            case 55:
                return m16877k4(m16882x1(m16878k4(j3, j2), j));
            case 56:
                return m16881to(m16882x1(m16878k4(j3, j2), j), j3);
            case 57:
                return m16881to(m16878k4(m16877k4(j2), j3), j);
            case 58:
                return m16881to(m16878k4(m16881to(j, j2), j3), j);
            case 59:
                return m16877k4(m16882x1(m16878k4(m16877k4(j2), j3), j));
            case 60:
                return m16881to(j, j3);
            case 61:
                return m16881to(m16878k4(m16877k4(m16878k4(j, j2)), j3), j);
            case 62:
                return m16881to(m16878k4(m16882x1(m16877k4(j), j2), j3), j);
            case 63:
                return m16877k4(m16882x1(j, j3));
            case 64:
                return m16882x1(m16882x1(m16877k4(j2), j), j3);
            case 65:
                return m16877k4(m16878k4(m16881to(j, j3), j2));
            case 66:
                return m16882x1(m16881to(j2, j3), m16881to(j2, j));
            case 67:
                return m16877k4(m16881to(m16882x1(m16877k4(m16882x1(j, j2)), j3), j));
            case 68:
                return m16882x1(m16877k4(j2), j);
            case 69:
                return m16877k4(m16878k4(m16882x1(m16877k4(j), j3), j2));
            case 70:
                return m16881to(m16878k4(m16882x1(j2, j3), j), j2);
            case 71:
                return m16877k4(m16881to(m16882x1(m16881to(j3, j2), j), j3));
            case 72:
                return m16882x1(m16881to(j3, j2), j);
            case 73:
                return m16877k4(m16881to(m16881to(m16878k4(m16882x1(j2, j3), j), j2), j3));
            case 74:
                return m16881to(m16882x1(m16878k4(j2, j), j3), j2);
            case 75:
                return m16881to(m16878k4(m16877k4(j), j2), j3);
            case 76:
                return m16882x1(m16877k4(m16882x1(j3, j2)), j);
            case 77:
                return m16877k4(m16881to(m16878k4(m16881to(j, j2), m16881to(j3, j)), j));
            case 78:
                return m16881to(m16878k4(m16881to(j3, j), j2), j3);
            case 79:
                return m16877k4(m16882x1(m16878k4(m16877k4(j), j2), j3));
            case 80:
                return m16882x1(m16877k4(j2), j3);
            case 81:
                return m16877k4(m16878k4(m16882x1(m16877k4(j3), j), j2));
            case 82:
                return m16881to(m16878k4(m16882x1(j2, j), j3), j2);
            case 83:
                return m16877k4(m16881to(m16882x1(m16881to(j, j2), j3), j));
            case 84:
                return m16877k4(m16878k4(m16877k4(m16878k4(j, j3)), j2));
            case 85:
                return m16877k4(j2);
            case 86:
                return m16881to(m16878k4(j, j3), j2);
            case 87:
                return m16877k4(m16882x1(m16878k4(j, j3), j2));
            case 88:
                return m16881to(m16882x1(m16878k4(j3, j), j2), j3);
            case 89:
                return m16881to(m16878k4(m16877k4(j), j3), j2);
            case 90:
                return m16881to(j3, j2);
            case 91:
                return m16881to(m16878k4(m16877k4(m16878k4(j2, j)), j3), j2);
            case 92:
                return m16881to(m16878k4(m16881to(j2, j), j3), j2);
            case 93:
                return m16877k4(m16882x1(m16878k4(m16877k4(j), j3), j2));
            case 94:
                return m16881to(m16878k4(m16882x1(m16877k4(j2), j), j3), j2);
            case 95:
                return m16877k4(m16882x1(j3, j2));
            case 96:
                return m16882x1(m16881to(j, j2), j3);
            case 97:
                return m16877k4(m16881to(m16881to(m16878k4(m16882x1(j, j2), j3), j), j2));
            case 98:
                return m16881to(m16882x1(m16878k4(j2, j3), j), j2);
            case 99:
                return m16881to(m16878k4(m16877k4(j3), j2), j);
            case 100:
                return m16881to(m16882x1(m16878k4(j, j3), j2), j);
            case 101:
                return m16881to(m16878k4(m16877k4(j3), j), j2);
            case 102:
                return m16881to(j, j2);
            case 103:
                return m16881to(m16878k4(m16877k4(m16878k4(j, j3)), j2), j);
            case 104:
                return m16877k4(m16881to(m16881to(m16878k4(m16877k4(m16878k4(j, j2)), j3), j), j2));
            case 105:
                return m16877k4(m16881to(m16881to(j, j2), j3));
            case 106:
                return m16881to(m16882x1(j, j3), j2);
            case 107:
                return m16877k4(m16881to(m16881to(m16882x1(m16878k4(j, j3), j2), j), j3));
            case 108:
                return m16881to(m16882x1(j3, j2), j);
            case 109:
                return m16877k4(m16881to(m16881to(m16882x1(m16878k4(j2, j3), j), j2), j3));
            case 110:
                return m16881to(m16882x1(m16878k4(m16877k4(j), j3), j2), j);
            case 111:
                return m16877k4(m16882x1(m16877k4(m16881to(j, j2)), j3));
            case 112:
                return m16882x1(m16877k4(m16882x1(j, j2)), j3);
            case 113:
                return m16877k4(m16881to(m16882x1(m16881to(j2, j3), m16881to(j2, j)), j));
            case 114:
                return m16881to(m16878k4(m16881to(j, j3), j2), j);
            case 115:
                return m16877k4(m16882x1(m16878k4(m16877k4(j3), j2), j));
            case 116:
                return m16881to(m16878k4(m16881to(j2, j3), j), j2);
            case 117:
                return m16877k4(m16882x1(m16878k4(m16877k4(j3), j), j2));
            case 118:
                return m16881to(m16878k4(m16882x1(m16877k4(j), j3), j2), j);
            case 119:
                return m16877k4(m16882x1(j, j2));
            case 120:
                return m16881to(m16882x1(j, j2), j3);
            case 121:
                return m16877k4(m16881to(m16881to(m16882x1(m16878k4(j, j2), j3), j), j2));
            case 122:
                return m16881to(m16882x1(m16878k4(m16877k4(j2), j), j3), j2);
            case 123:
                return m16877k4(m16882x1(m16877k4(m16881to(j3, j2)), j));
            case 124:
                return m16881to(m16882x1(m16878k4(m16877k4(j), j2), j3), j);
            case 125:
                return m16877k4(m16882x1(m16877k4(m16881to(j, j3)), j2));
            case 126:
                return m16878k4(m16881to(j, j2), m16881to(j3, j));
            case 127:
                return m16877k4(m16882x1(m16882x1(j, j3), j2));
            case 128:
                return m16882x1(m16882x1(j, j3), j2);
            case 129:
                return m16877k4(m16878k4(m16881to(j, j2), m16881to(j3, j)));
            case 130:
                return m16882x1(m16877k4(m16881to(j, j3)), j2);
            case 131:
                return m16877k4(m16881to(m16882x1(m16878k4(m16877k4(j), j2), j3), j));
            case 132:
                return m16882x1(m16877k4(m16881to(j3, j2)), j);
            case 133:
                return m16877k4(m16881to(m16882x1(m16878k4(m16877k4(j3), j), j2), j3));
            case 134:
                return m16881to(m16881to(m16882x1(m16878k4(j, j2), j3), j), j2);
            case 135:
                return m16877k4(m16881to(m16882x1(j, j2), j3));
            case 136:
                return m16882x1(j, j2);
            case 137:
                return m16877k4(m16881to(m16878k4(m16882x1(m16877k4(j), j3), j2), j));
            case 138:
                return m16882x1(m16878k4(m16877k4(j3), j), j2);
            case 139:
                return m16877k4(m16881to(m16878k4(m16881to(j2, j3), j), j2));
            case 140:
                return m16882x1(m16878k4(m16877k4(j3), j2), j);
            case 141:
                return m16877k4(m16881to(m16878k4(m16881to(j, j3), j2), j));
            case 142:
                return m16881to(m16882x1(m16881to(j2, j3), m16881to(j2, j)), j);
            case 143:
                return m16877k4(m16882x1(m16877k4(m16882x1(j, j2)), j3));
            case 144:
                return m16882x1(m16877k4(m16881to(j, j2)), j3);
            case 145:
                return m16877k4(m16881to(m16882x1(m16878k4(m16877k4(j), j3), j2), j));
            case 146:
                return m16881to(m16881to(m16882x1(m16878k4(j3, j2), j), j3), j2);
            case 147:
                return m16877k4(m16881to(m16882x1(j2, j3), j));
            case 148:
                return m16881to(m16881to(m16882x1(m16878k4(j, j3), j2), j), j3);
            case 149:
                return m16877k4(m16881to(m16882x1(j, j3), j2));
            case 150:
                return m16881to(m16881to(j, j3), j2);
            case 151:
                return m16881to(m16881to(m16878k4(m16877k4(m16878k4(j, j3)), j2), j), j3);
            case 152:
                return m16877k4(m16881to(m16878k4(m16877k4(m16878k4(j, j3)), j2), j));
            case 153:
                return m16877k4(m16881to(j, j2));
            case 154:
                return m16881to(m16882x1(m16877k4(j), j3), j2);
            case 155:
                return m16877k4(m16881to(m16882x1(m16878k4(j, j3), j2), j));
            case 156:
                return m16881to(m16882x1(m16877k4(j2), j3), j);
            case 157:
                return m16877k4(m16881to(m16882x1(m16878k4(j2, j3), j), j2));
            case 158:
                return m16881to(m16881to(m16878k4(m16882x1(j, j2), j3), j), j2);
            case 159:
                return m16877k4(m16882x1(m16881to(j, j2), j3));
            case 160:
                return m16882x1(j3, j2);
            case 161:
                return m16877k4(m16881to(m16878k4(m16882x1(m16877k4(j3), j), j2), j3));
            case 162:
                return m16882x1(m16878k4(m16877k4(j), j3), j2);
            case 163:
                return m16877k4(m16881to(m16878k4(m16881to(j2, j), j3), j2));
            case 164:
                return m16877k4(m16881to(m16878k4(m16877k4(m16878k4(j3, j)), j2), j3));
            case 165:
                return m16877k4(m16881to(j2, j3));
            case 166:
                return m16881to(m16882x1(m16877k4(j3), j), j2);
            case 167:
                return m16877k4(m16881to(m16882x1(m16878k4(j3, j), j2), j3));
            case 168:
                return m16882x1(m16878k4(j, j3), j2);
            case 169:
                return m16877k4(m16881to(m16878k4(j, j3), j2));
            case 170:
            default:
                return j2;
            case 171:
                return m16878k4(m16877k4(m16878k4(j, j3)), j2);
            case 172:
                return m16881to(m16882x1(m16881to(j, j2), j3), j);
            case 173:
                return m16877k4(m16881to(m16878k4(m16882x1(j2, j), j3), j2));
            case 174:
                return m16878k4(m16882x1(m16877k4(j3), j), j2);
            case 175:
                return m16878k4(m16877k4(j3), j2);
            case 176:
                return m16882x1(m16878k4(m16877k4(j), j2), j3);
            case 177:
                return m16877k4(m16881to(m16878k4(m16881to(j3, j), j2), j3));
            case 178:
                return m16881to(m16878k4(m16881to(j, j2), m16881to(j3, j)), j);
            case 179:
                return m16877k4(m16882x1(m16877k4(m16882x1(j3, j2)), j));
            case 180:
                return m16881to(m16882x1(m16877k4(j2), j), j3);
            case 181:
                return m16877k4(m16881to(m16882x1(m16878k4(j2, j), j3), j2));
            case 182:
                return m16881to(m16881to(m16878k4(m16882x1(j3, j2), j), j3), j2);
            case 183:
                return m16877k4(m16882x1(m16881to(j3, j2), j));
            case 184:
                return m16881to(m16882x1(m16881to(j3, j2), j), j3);
            case 185:
                return m16877k4(m16881to(m16878k4(m16882x1(j2, j3), j), j2));
            case 186:
                return m16878k4(m16882x1(m16877k4(j), j3), j2);
            case 187:
                return m16878k4(m16877k4(j), j2);
            case 188:
                return m16881to(m16882x1(m16877k4(m16882x1(j, j2)), j3), j);
            case 189:
                return m16877k4(m16882x1(m16881to(j2, j3), m16881to(j2, j)));
            case 190:
                return m16878k4(m16881to(j, j3), j2);
            case 191:
                return m16878k4(m16877k4(m16882x1(j, j3)), j2);
            case 192:
                return m16882x1(j, j3);
            case 193:
                return m16877k4(m16881to(m16878k4(m16882x1(m16877k4(j), j2), j3), j));
            case 194:
                return m16877k4(m16881to(m16878k4(m16877k4(m16878k4(j, j2)), j3), j));
            case 195:
                return m16877k4(m16881to(j, j3));
            case 196:
                return m16882x1(m16878k4(m16877k4(j2), j3), j);
            case 197:
                return m16877k4(m16881to(m16878k4(m16881to(j, j2), j3), j));
            case 198:
                return m16881to(m16882x1(m16877k4(j3), j2), j);
            case 199:
                return m16877k4(m16881to(m16882x1(m16878k4(j3, j2), j), j3));
            case 200:
                return m16882x1(m16878k4(j3, j2), j);
            case 201:
                return m16877k4(m16881to(m16878k4(j2, j3), j));
            case 202:
                return m16881to(m16882x1(m16881to(j2, j), j3), j2);
            case 203:
                return m16877k4(m16881to(m16878k4(m16882x1(j, j2), j3), j));
            case 204:
                return j;
            case 205:
                return m16878k4(m16877k4(m16878k4(j3, j2)), j);
            case 206:
                return m16878k4(m16882x1(m16877k4(j3), j2), j);
            case 207:
                return m16878k4(m16877k4(j3), j);
            case 208:
                return m16882x1(m16878k4(m16877k4(j2), j), j3);
            case 209:
                return m16877k4(m16881to(m16878k4(m16881to(j3, j2), j), j3));
            case 210:
                return m16881to(m16882x1(m16877k4(j), j2), j3);
            case 211:
                return m16877k4(m16881to(m16882x1(m16878k4(j, j2), j3), j));
            case 212:
                return m16881to(m16882x1(m16881to(j2, j3), m16881to(j3, j)), j);
            case 213:
                return m16877k4(m16882x1(m16877k4(m16882x1(j, j3)), j2));
            case 214:
                return m16881to(m16881to(m16878k4(m16882x1(j, j3), j2), j), j3);
            case 215:
                return m16877k4(m16882x1(m16881to(j, j3), j2));
            case 216:
                return m16881to(m16882x1(m16881to(j3, j), j2), j3);
            case 217:
                return m16877k4(m16881to(m16878k4(m16882x1(j, j3), j2), j));
            case 218:
                return m16881to(m16882x1(m16877k4(m16882x1(j2, j)), j3), j2);
            case 219:
                return m16877k4(m16882x1(m16881to(j, j2), m16881to(j3, j)));
            case 220:
                return m16878k4(m16882x1(m16877k4(j2), j3), j);
            case 221:
                return m16878k4(m16877k4(j2), j);
            case 222:
                return m16878k4(m16881to(j3, j2), j);
            case 223:
                return m16878k4(m16877k4(m16882x1(j3, j2)), j);
            case 224:
                return m16882x1(m16878k4(j, j2), j3);
            case 225:
                return m16877k4(m16881to(m16878k4(j, j2), j3));
            case 226:
                return m16881to(m16882x1(m16881to(j2, j3), j), j2);
            case 227:
                return m16877k4(m16881to(m16878k4(m16882x1(j3, j2), j), j3));
            case 228:
                return m16881to(m16882x1(m16881to(j, j3), j2), j);
            case 229:
                return m16877k4(m16881to(m16878k4(m16882x1(j3, j), j2), j3));
            case 230:
                return m16881to(m16882x1(m16877k4(m16882x1(j, j3)), j2), j);
            case 231:
                return m16877k4(m16882x1(m16881to(j2, j3), m16881to(j3, j)));
            case 232:
                return m16881to(m16882x1(m16881to(j, j2), m16881to(j3, j)), j);
            case 233:
                return m16877k4(m16881to(m16881to(m16882x1(m16877k4(m16882x1(j, j2)), j3), j), j2));
            case 234:
                return m16878k4(m16882x1(j, j3), j2);
            case 235:
                return m16878k4(m16877k4(m16881to(j, j3)), j2);
            case 236:
                return m16878k4(m16882x1(j3, j2), j);
            case 237:
                return m16878k4(m16877k4(m16881to(j3, j2)), j);
            case 238:
                return m16878k4(j, j2);
            case 239:
                return m16878k4(m16878k4(m16877k4(j3), j2), j);
            case 240:
                return j3;
            case 241:
                return m16878k4(m16877k4(m16878k4(j, j2)), j3);
            case 242:
                return m16878k4(m16882x1(m16877k4(j), j2), j3);
            case 243:
                return m16878k4(m16877k4(j), j3);
            case 244:
                return m16878k4(m16882x1(m16877k4(j2), j), j3);
            case 245:
                return m16878k4(m16877k4(j2), j3);
            case 246:
                return m16878k4(m16881to(j, j2), j3);
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                return m16878k4(m16877k4(m16882x1(j, j2)), j3);
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                return m16878k4(m16882x1(j, j2), j3);
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                return m16878k4(m16877k4(m16881to(j, j2)), j3);
            case 250:
                return m16878k4(j3, j2);
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                return m16878k4(m16878k4(m16877k4(j), j3), j2);
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                return m16878k4(j, j3);
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                return m16878k4(m16878k4(m16877k4(j2), j), j3);
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                return m16878k4(m16878k4(j, j3), j2);
            case 255:
                return 4294967295L;
        }
    }
}

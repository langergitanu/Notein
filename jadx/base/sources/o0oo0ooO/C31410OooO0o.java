package o0oo0ooO;

import com.aspose.slides.Oooo0;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o0oo0oOo.C31356OooO00o;
import o0oo0oOo.C31357OooO0O0;
import o0oo0ooO.C31407OooO0O0;

/* JADX INFO: renamed from: o0oo0ooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31410OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C31411OooO0o0 f112160OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31409OooO0Oo f112161OooO0O0;

    public static ArrayList OooO00o(ArrayList arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() - 1;
        for (int i = 1; i < size; i++) {
            C31407OooO0O0 c31407OooO0O0 = (C31407OooO0O0) arrayList.get(i);
            C31407OooO0O0.OooO00o oooO00o = c31407OooO0O0.f112138OooO0OO;
            if (oooO00o == C31407OooO0O0.OooO00o.f112141OooOoO) {
                arrayList2.add(Float.valueOf(Float.parseFloat(c31407OooO0O0.f112136OooO00o)));
            } else {
                if (oooO00o != C31407OooO0O0.OooO00o.f112143OooOoOO) {
                    throw new IOException("Expected INTEGER or REAL but got " + c31407OooO0O0 + " at array position " + i);
                }
                arrayList2.add(Integer.valueOf(c31407OooO0O0.OooO00o()));
            }
        }
        return arrayList2;
    }

    public static byte[] OooO0O0(int i, int i2, byte[] bArr) {
        if (i2 == -1) {
            return bArr;
        }
        if (bArr.length == 0 || i2 > bArr.length) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length - i2];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = bArr[i3] & 255;
            int i5 = (i >> 8) ^ i4;
            if (i3 >= i2) {
                bArr2[i3 - i2] = (byte) i5;
            }
            i = Oooo0.OooO00o(i4, i, 52845, 22719) & 65535;
        }
        return bArr2;
    }

    public final void OooO() throws IOException {
        C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112139OooOo;
        OooO0oO("readonly");
        C31407OooO0O0 c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
        String str = c31407OooO0O0OooO0Oo.f112136OooO00o;
        if (str.equals("NP") || str.equals("|")) {
            return;
        }
        if (str.equals("noaccess")) {
            c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
        }
        if (c31407OooO0O0OooO0Oo.f112136OooO00o.equals("put")) {
            return;
        }
        throw new IOException("Found " + c31407OooO0O0OooO0Oo + " but expected NP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0373, code lost:
    
        OooO0oO("currentdict");
        OooO0o0("end", r7);
        OooO0o0("currentfile", r7);
        OooO0o0("eexec", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0384, code lost:
    
        if (r25.length <= 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0386, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0388, code lost:
    
        if (r25.length >= 4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x038a, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038f, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0390, code lost:
    
        if (r5 >= r12) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0392, code lost:
    
        r12 = r25[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0396, code lost:
    
        if (r12 == 10) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x039a, code lost:
    
        if (r12 == 13) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x039e, code lost:
    
        if (r12 == 32) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03a2, code lost:
    
        if (r12 == 9) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ac, code lost:
    
        if (java.lang.Character.digit((char) r12, 16) != (-1)) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ae, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03b0, code lost:
    
        r2 = OooO0O0(55665, r8, r25);
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b6, code lost:
    
        r5 = r5 + 1;
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ba, code lost:
    
        r5 = r25.length;
        r8 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03bd, code lost:
    
        if (r8 >= r5) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03bf, code lost:
    
        r21 = r5;
        r22 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03cd, code lost:
    
        if (java.lang.Character.digit((char) r25[r8], 16) == (-1)) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03cf, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d1, code lost:
    
        r8 = r22 + 1;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03d6, code lost:
    
        r5 = new byte[r12 / 2];
        r8 = r25.length;
        r2 = 0;
        r12 = -1;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03df, code lost:
    
        if (r2 >= r8) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03e1, code lost:
    
        r21 = r2;
        r22 = r8;
        r2 = java.lang.Character.digit((char) r25[r21], 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ef, code lost:
    
        if (r2 == (-1)) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03f1, code lost:
    
        if (r12 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03f3, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f5, code lost:
    
        r5[r16] = (byte) ((r12 * 16) + r2);
        r12 = -1;
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0400, code lost:
    
        r2 = r21 + 1;
        r8 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0405, code lost:
    
        r12 = 4;
        r2 = OooO0O0(55665, 4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x040d, code lost:
    
        r5 = new o0oo0ooO.C31411OooO0o0(r2);
        r23.f112160OooO00o = r5;
        r2 = r5.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0418, code lost:
    
        if (r2 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0420, code lost:
    
        if (r2.f112136OooO00o.equals("Private") != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0422, code lost:
    
        r23.f112160OooO00o.OooO0O0();
        r2 = r23.f112160OooO00o.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x042c, code lost:
    
        if (r2 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x042e, code lost:
    
        OooO0o0("Private", r6);
        r2 = OooO0Oo(r1).OooO00o();
        OooO0o0("dict", r7);
        OooO0oO("dup");
        OooO0o0("begin", r7);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0443, code lost:
    
        r8 = o0oo0ooO.C31407OooO0O0.OooO00o.f112151Oooo00o;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0447, code lost:
    
        if (r5 >= r2) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0449, code lost:
    
        r3 = r23.f112160OooO00o.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x044d, code lost:
    
        if (r3 == null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0451, code lost:
    
        if (r3.f112138OooO0OO == r6) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0453, code lost:
    
        r20 = r8;
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x045a, code lost:
    
        r3 = OooO0Oo(r6).f112136OooO00o;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0468, code lost:
    
        if ("Subrs".equals(r3) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x046a, code lost:
    
        r2 = OooO0Oo(r1).OooO00o();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0473, code lost:
    
        if (r3 >= r2) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0475, code lost:
    
        r23.f112161OooO0O0.f112158OooOoo0.add(null);
        r3 = r3 + 1;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0486, code lost:
    
        r19 = r5;
        OooO0o0(r14, r7);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x048c, code lost:
    
        if (r3 >= r2) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x048e, code lost:
    
        r5 = r23.f112160OooO00o.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0492, code lost:
    
        if (r5 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0495, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0499, code lost:
    
        if (r5.f112138OooO0OO != r7) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a1, code lost:
    
        if (r5.f112136OooO00o.equals("dup") != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04a4, code lost:
    
        OooO0o0("dup", r7);
        r2 = OooO0Oo(r1);
        OooO0Oo(r1);
        r23.f112161OooO0O0.f112158OooOoo0.set(r2.OooO00o(), OooO0O0(4330, r12, OooO0Oo(r8).f112137OooO0O0));
        OooO();
        r3 = r3 + 1;
        r2 = r18;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04d5, code lost:
    
        OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04d8, code lost:
    
        r21 = r12;
        r18 = r14;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04e1, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04e9, code lost:
    
        if ("OtherSubrs".equals(r3) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04f3, code lost:
    
        if (r23.f112160OooO00o.f112163OooO0O0.f112138OooO0OO != o0oo0ooO.C31407OooO0O0.OooO00o.f112145OooOoo0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f5, code lost:
    
        OooOO0O();
        OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04fc, code lost:
    
        r2 = OooO0Oo(r1).OooO00o();
        OooO0o0(r14, r7);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0508, code lost:
    
        if (r3 >= r2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x050a, code lost:
    
        OooO0o0("dup", r7);
        OooO0Oo(r1);
        OooOO0O();
        OooO();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0519, code lost:
    
        OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0523, code lost:
    
        if ("lenIV".equals(r3) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0525, code lost:
    
        r2 = OooOO0O();
        OooO0o();
        r12 = ((o0oo0ooO.C31407OooO0O0) r2.get(0)).OooO00o();
        r18 = r14;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x053f, code lost:
    
        r2 = "ND".equals(r3);
        r5 = o0oo0ooO.C31407OooO0O0.OooO00o.f112147OooOooo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x054d, code lost:
    
        if (r2 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x054f, code lost:
    
        r18 = r14;
        r14 = r24;
        OooO0Oo(r14);
        OooO0oO("noaccess");
        OooO0o0("def", r7);
        OooO0Oo(r5);
        OooO0oO("executeonly");
        OooO0oO("readonly");
        OooO0o0("def", r7);
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x056d, code lost:
    
        r21 = r12;
        r18 = r14;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0579, code lost:
    
        if ("NP".equals(r3) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x057b, code lost:
    
        OooO0Oo(r14);
        OooO0oO("noaccess");
        OooO0Oo(r7);
        OooO0Oo(r5);
        OooO0oO("executeonly");
        OooO0oO("readonly");
        OooO0o0("def", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0597, code lost:
    
        if ("RD".equals(r3) == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0599, code lost:
    
        OooO0Oo(r14);
        OooO0oo();
        OooO0oO("bind");
        OooO0oO("executeonly");
        OooO0oO("readonly");
        OooO0o0("def", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05ae, code lost:
    
        r2 = OooOO0O();
        OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05bb, code lost:
    
        if (r3.equals("BlueValues") == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05bd, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x05cc, code lost:
    
        if (r3.equals("OtherBlues") == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05ce, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05dd, code lost:
    
        if (r3.equals("FamilyBlues") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05df, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05ee, code lost:
    
        if (r3.equals("FamilyOtherBlues") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05f0, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0600, code lost:
    
        if (r3.equals("BlueScale") == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0602, code lost:
    
        r3 = r23.f112161OooO0O0;
        java.lang.Float.parseFloat(((o0oo0ooO.C31407OooO0O0) r2.get(0)).f112136OooO00o);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x061b, code lost:
    
        if (r3.equals("BlueShift") == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x061d, code lost:
    
        r3 = r23.f112161OooO0O0;
        ((o0oo0ooO.C31407OooO0O0) r2.get(0)).OooO00o();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0635, code lost:
    
        if (r3.equals("BlueFuzz") == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0637, code lost:
    
        r3 = r23.f112161OooO0O0;
        ((o0oo0ooO.C31407OooO0O0) r2.get(0)).OooO00o();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x064d, code lost:
    
        if (r3.equals("StdHW") == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x064f, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x065f, code lost:
    
        if (r3.equals("StdVW") == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0661, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0671, code lost:
    
        if (r3.equals("StemSnapH") == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0673, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0683, code lost:
    
        if (r3.equals("StemSnapV") == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0685, code lost:
    
        r3 = r23.f112161OooO0O0;
        OooO00o(r2);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0695, code lost:
    
        if (r3.equals("ForceBold") == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0697, code lost:
    
        r3 = r23.f112161OooO0O0;
        ((o0oo0ooO.C31407OooO0O0) r2.get(0)).f112136OooO00o.equals(com.microsoft.identity.common.java.telemetry.TelemetryEventStrings.Value.TRUE);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06b0, code lost:
    
        if (r3.equals("LanguageGroup") == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x06b2, code lost:
    
        r3 = r23.f112161OooO0O0;
        ((o0oo0ooO.C31407OooO0O0) r2.get(0)).OooO00o();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x06c1, code lost:
    
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06c3, code lost:
    
        r5 = r19 + 1;
        r24 = r14;
        r3 = r16;
        r2 = r17;
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06cf, code lost:
    
        r2 = r23.f112160OooO00o.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x06d5, code lost:
    
        if (r2.f112138OooO0OO != r6) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06df, code lost:
    
        if (r2.f112136OooO00o.equals("CharStrings") != false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06e1, code lost:
    
        r5 = r16;
        r12 = r20;
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x06ea, code lost:
    
        OooO0o0("CharStrings", r6);
        r2 = OooO0Oo(r1).OooO00o();
        OooO0o0("dict", r7);
        OooO0o0("dup", r7);
        OooO0o0("begin", r7);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x06ff, code lost:
    
        if (r3 >= r2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0701, code lost:
    
        r4 = r23.f112160OooO00o.f112163OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0705, code lost:
    
        if (r4 != null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0707, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x070c, code lost:
    
        if (r4.f112138OooO0OO != r7) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x070e, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0716, code lost:
    
        if (r4.f112136OooO00o.equals(r5) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0719, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x071b, code lost:
    
        r4 = OooO0Oo(r6);
        OooO0Oo(r1);
        r12 = r20;
        r23.f112161OooO0O0.f112157OooOoo.put(r4.f112136OooO00o, OooO0O0(4330, r21, OooO0Oo(r12).f112137OooO0O0));
        OooO0o();
        r3 = r3 + 1;
        r16 = r5;
        r20 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0745, code lost:
    
        OooO0o0(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0749, code lost:
    
        r23.f112160OooO00o.OooO0O0();
        r16 = r5;
        r20 = r12;
        r21 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x075d, code lost:
    
        throw new java.io.IOException("/Private token not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0760, code lost:
    
        return r23.f112161OooO0O0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31409OooO0Oo OooO0OO(byte[] bArr, byte[] bArr2) throws IOException {
        this.f112161OooO0O0 = new C31409OooO0Oo();
        if (bArr.length == 0) {
            throw new IOException("ASCII segment of type 1 font is empty");
        }
        char c = 2;
        if (bArr.length < 2 || (bArr[0] != 37 && bArr[1] != 33)) {
            throw new IOException("Invalid start of ASCII segment of type 1 font");
        }
        C31411OooO0o0 c31411OooO0o0 = new C31411OooO0o0(bArr);
        this.f112160OooO00o = c31411OooO0o0;
        boolean zEquals = c31411OooO0o0.f112163OooO0O0.f112136OooO00o.equals("FontDirectory");
        C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112142OooOoO0;
        C31407OooO0O0.OooO00o oooO00o2 = C31407OooO0O0.OooO00o.f112139OooOo;
        C31407OooO0O0.OooO00o oooO00o3 = C31407OooO0O0.OooO00o.f112146OooOooO;
        if (zEquals) {
            OooO0o0("FontDirectory", oooO00o2);
            OooO0Oo(oooO00o);
            OooO0o0("known", oooO00o2);
            OooO0Oo(oooO00o3);
            OooO0oo();
            OooO0Oo(oooO00o3);
            OooO0oo();
            OooO0o0("ifelse", oooO00o2);
        }
        C31407OooO0O0.OooO00o oooO00o4 = C31407OooO0O0.OooO00o.f112143OooOoOO;
        int iOooO00o = OooO0Oo(oooO00o4).OooO00o();
        OooO0o0("dict", oooO00o2);
        OooO0oO("dup");
        OooO0o0("begin", oooO00o2);
        int i = 0;
        while (true) {
            String str = "array";
            char c2 = c;
            String str2 = "end";
            C31407OooO0O0.OooO00o oooO00o5 = oooO00o3;
            if (i >= iOooO00o) {
                break;
            }
            int i2 = iOooO00o;
            C31407OooO0O0 c31407OooO0O0 = this.f112160OooO00o.f112163OooO0O0;
            if (c31407OooO0O0 == null) {
                break;
            }
            int i3 = i;
            if (c31407OooO0O0.f112138OooO0OO == oooO00o2) {
                String str3 = c31407OooO0O0.f112136OooO00o;
                if (str3.equals("currentdict") || str3.equals("end")) {
                    break;
                }
            }
            String str4 = OooO0Oo(oooO00o).f112136OooO00o;
            if (str4.equals("FontInfo") || str4.equals("Fontinfo")) {
                for (Map.Entry entry : OooOO0().entrySet()) {
                    String str5 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (str5.equals("version")) {
                        C31409OooO0Oo c31409OooO0Oo = this.f112161OooO0O0;
                        ((C31407OooO0O0) list.get(0)).getClass();
                        c31409OooO0Oo.getClass();
                    } else if (str5.equals("Notice")) {
                        C31409OooO0Oo c31409OooO0Oo2 = this.f112161OooO0O0;
                        ((C31407OooO0O0) list.get(0)).getClass();
                        c31409OooO0Oo2.getClass();
                    } else if (str5.equals("FullName")) {
                        this.f112161OooO0O0.f112156OooOoOO = ((C31407OooO0O0) list.get(0)).f112136OooO00o;
                    } else if (str5.equals("FamilyName")) {
                        C31409OooO0Oo c31409OooO0Oo3 = this.f112161OooO0O0;
                        String str6 = ((C31407OooO0O0) list.get(0)).f112136OooO00o;
                        c31409OooO0Oo3.getClass();
                    } else if (str5.equals("Weight")) {
                        C31409OooO0Oo c31409OooO0Oo4 = this.f112161OooO0O0;
                        String str7 = ((C31407OooO0O0) list.get(0)).f112136OooO00o;
                        c31409OooO0Oo4.getClass();
                    } else if (str5.equals("ItalicAngle")) {
                        C31409OooO0Oo c31409OooO0Oo5 = this.f112161OooO0O0;
                        Float.parseFloat(((C31407OooO0O0) list.get(0)).f112136OooO00o);
                        c31409OooO0Oo5.getClass();
                    } else if (str5.equals("isFixedPitch")) {
                        C31409OooO0Oo c31409OooO0Oo6 = this.f112161OooO0O0;
                        ((C31407OooO0O0) list.get(0)).f112136OooO00o.equals(TelemetryEventStrings.Value.TRUE);
                        c31409OooO0Oo6.getClass();
                    } else if (str5.equals("UnderlinePosition")) {
                        C31409OooO0Oo c31409OooO0Oo7 = this.f112161OooO0O0;
                        Float.parseFloat(((C31407OooO0O0) list.get(0)).f112136OooO00o);
                        c31409OooO0Oo7.getClass();
                    } else if (str5.equals("UnderlineThickness")) {
                        C31409OooO0Oo c31409OooO0Oo8 = this.f112161OooO0O0;
                        Float.parseFloat(((C31407OooO0O0) list.get(0)).f112136OooO00o);
                        c31409OooO0Oo8.getClass();
                    }
                }
            } else if (str4.equals("Metrics")) {
                OooOO0();
            } else if (str4.equals("Encoding")) {
                C31411OooO0o0 c31411OooO0o02 = this.f112160OooO00o;
                if (c31411OooO0o02.f112163OooO0O0.f112138OooO0OO == oooO00o2) {
                    String str8 = c31411OooO0o02.OooO0O0().f112136OooO00o;
                    if (!str8.equals("StandardEncoding")) {
                        throw new IOException("Unknown encoding: ".concat(str8));
                    }
                    this.f112161OooO0O0.f112152OooOo = C31357OooO0O0.f111966OooO0o0;
                    OooO0oO("readonly");
                    OooO0o0("def", oooO00o2);
                } else {
                    OooO0Oo(oooO00o4).OooO00o();
                    OooO0oO("array");
                    while (true) {
                        C31407OooO0O0 c31407OooO0O02 = this.f112160OooO00o.f112163OooO0O0;
                        if (c31407OooO0O02.f112138OooO0OO == oooO00o2 && (c31407OooO0O02.f112136OooO00o.equals("dup") || this.f112160OooO00o.f112163OooO0O0.f112136OooO00o.equals("readonly") || this.f112160OooO00o.f112163OooO0O0.f112136OooO00o.equals("def"))) {
                            break;
                        }
                        this.f112160OooO00o.OooO0O0();
                    }
                    HashMap map = new HashMap();
                    while (true) {
                        C31407OooO0O0 c31407OooO0O03 = this.f112160OooO00o.f112163OooO0O0;
                        if (c31407OooO0O03.f112138OooO0OO != oooO00o2 || !c31407OooO0O03.f112136OooO00o.equals("dup")) {
                            break;
                        }
                        OooO0o0("dup", oooO00o2);
                        int iOooO00o2 = OooO0Oo(oooO00o4).OooO00o();
                        C31407OooO0O0 c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
                        OooO0o0("put", oooO00o2);
                        map.put(Integer.valueOf(iOooO00o2), c31407OooO0O0OooO0Oo.f112136OooO00o);
                    }
                    C31409OooO0Oo c31409OooO0Oo9 = this.f112161OooO0O0;
                    C31356OooO00o c31356OooO00o = new C31356OooO00o(1);
                    for (Map.Entry entry2 : map.entrySet()) {
                        c31356OooO00o.OooO00o(((Integer) entry2.getKey()).intValue(), (String) entry2.getValue());
                    }
                    c31409OooO0Oo9.f112152OooOo = c31356OooO00o;
                    OooO0oO("readonly");
                    OooO0o0("def", oooO00o2);
                }
            } else {
                ArrayList arrayListOooOO0O = OooOO0O();
                OooO0o();
                if (str4.equals("FontName")) {
                    this.f112161OooO0O0.f112153OooOo0o = ((C31407OooO0O0) arrayListOooOO0O.get(0)).f112136OooO00o;
                } else if (str4.equals("PaintType")) {
                    C31409OooO0Oo c31409OooO0Oo10 = this.f112161OooO0O0;
                    ((C31407OooO0O0) arrayListOooOO0O.get(0)).OooO00o();
                    c31409OooO0Oo10.getClass();
                } else if (str4.equals("FontType")) {
                    C31409OooO0Oo c31409OooO0Oo11 = this.f112161OooO0O0;
                    ((C31407OooO0O0) arrayListOooOO0O.get(0)).OooO00o();
                    c31409OooO0Oo11.getClass();
                } else if (str4.equals("FontMatrix")) {
                    this.f112161OooO0O0.f112155OooOoO0 = OooO00o(arrayListOooOO0O);
                } else if (str4.equals("FontBBox")) {
                    this.f112161OooO0O0.f112154OooOoO = OooO00o(arrayListOooOO0O);
                } else if (str4.equals("UniqueID")) {
                    C31409OooO0Oo c31409OooO0Oo12 = this.f112161OooO0O0;
                    ((C31407OooO0O0) arrayListOooOO0O.get(0)).OooO00o();
                    c31409OooO0Oo12.getClass();
                } else if (str4.equals("StrokeWidth")) {
                    C31409OooO0Oo c31409OooO0Oo13 = this.f112161OooO0O0;
                    Float.parseFloat(((C31407OooO0O0) arrayListOooOO0O.get(0)).f112136OooO00o);
                    c31409OooO0Oo13.getClass();
                } else if (str4.equals("FID")) {
                    C31409OooO0Oo c31409OooO0Oo14 = this.f112161OooO0O0;
                    ((C31407OooO0O0) arrayListOooOO0O.get(0)).getClass();
                    c31409OooO0Oo14.getClass();
                }
            }
            i = i3 + 1;
            oooO00o3 = oooO00o5;
            c = c2;
            iOooO00o = i2;
        }
    }

    public final C31407OooO0O0 OooO0Oo(C31407OooO0O0.OooO00o oooO00o) throws IOException {
        C31407OooO0O0 c31407OooO0O0OooO0O0 = this.f112160OooO00o.OooO0O0();
        if (c31407OooO0O0OooO0O0 != null && c31407OooO0O0OooO0O0.f112138OooO0OO == oooO00o) {
            return c31407OooO0O0OooO0O0;
        }
        throw new IOException("Found " + c31407OooO0O0OooO0O0 + " but expected " + oooO00o);
    }

    public final void OooO0o() throws IOException {
        C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112139OooOo;
        OooO0oO("readonly");
        OooO0oO("noaccess");
        C31407OooO0O0 c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
        String str = c31407OooO0O0OooO0Oo.f112136OooO00o;
        if (str.equals("ND") || str.equals("|-")) {
            return;
        }
        if (str.equals("noaccess")) {
            c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
        }
        if (c31407OooO0O0OooO0Oo.f112136OooO00o.equals("def")) {
            return;
        }
        throw new IOException("Found " + c31407OooO0O0OooO0Oo + " but expected ND");
    }

    public final void OooO0o0(String str, C31407OooO0O0.OooO00o oooO00o) throws IOException {
        C31407OooO0O0 c31407OooO0O0OooO0Oo = OooO0Oo(oooO00o);
        if (c31407OooO0O0OooO0Oo.f112136OooO00o.equals(str)) {
            return;
        }
        throw new IOException("Found " + c31407OooO0O0OooO0Oo + " but expected " + str);
    }

    public final C31407OooO0O0 OooO0oO(String str) throws IOException {
        C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112139OooOo;
        C31407OooO0O0 c31407OooO0O0 = this.f112160OooO00o.f112163OooO0O0;
        if (c31407OooO0O0 != null && c31407OooO0O0.f112138OooO0OO == oooO00o && c31407OooO0O0.f112136OooO00o.equals(str)) {
            return this.f112160OooO00o.OooO0O0();
        }
        return null;
    }

    public final void OooO0oo() throws IOException {
        int i = 1;
        while (true) {
            C31411OooO0o0 c31411OooO0o0 = this.f112160OooO00o;
            if (c31411OooO0o0.f112163OooO0O0.f112138OooO0OO == C31407OooO0O0.OooO00o.f112146OooOooO) {
                i++;
            }
            if (c31411OooO0o0.OooO0O0().f112138OooO0OO == C31407OooO0O0.OooO00o.f112147OooOooo && i - 1 == 0) {
                OooO0oO("executeonly");
                return;
            }
        }
    }

    public final HashMap OooOO0() throws IOException {
        C31407OooO0O0 c31407OooO0O0;
        HashMap map = new HashMap();
        int iOooO00o = OooO0Oo(C31407OooO0O0.OooO00o.f112143OooOoOO).OooO00o();
        C31407OooO0O0.OooO00o oooO00o = C31407OooO0O0.OooO00o.f112139OooOo;
        OooO0o0("dict", oooO00o);
        OooO0oO("dup");
        OooO0o0("begin", oooO00o);
        for (int i = 0; i < iOooO00o && (c31407OooO0O0 = this.f112160OooO00o.f112163OooO0O0) != null; i++) {
            if (c31407OooO0O0.f112138OooO0OO == oooO00o && !c31407OooO0O0.f112136OooO00o.equals("end")) {
                OooO0Oo(oooO00o);
            }
            C31407OooO0O0 c31407OooO0O02 = this.f112160OooO00o.f112163OooO0O0;
            if (c31407OooO0O02 == null || (c31407OooO0O02.f112138OooO0OO == oooO00o && c31407OooO0O02.f112136OooO00o.equals("end"))) {
                break;
            }
            C31407OooO0O0 c31407OooO0O0OooO0Oo = OooO0Oo(C31407OooO0O0.OooO00o.f112142OooOoO0);
            ArrayList arrayListOooOO0O = OooOO0O();
            OooO0o();
            map.put(c31407OooO0O0OooO0Oo.f112136OooO00o, arrayListOooOO0O);
        }
        OooO0o0("end", oooO00o);
        OooO0oO("readonly");
        OooO0o0("def", oooO00o);
        return map;
    }

    public final ArrayList OooOO0O() throws IOException {
        ArrayList arrayList = new ArrayList();
        C31407OooO0O0 c31407OooO0O0OooO0O0 = this.f112160OooO00o.OooO0O0();
        if (this.f112160OooO00o.f112163OooO0O0 != null) {
            arrayList.add(c31407OooO0O0OooO0O0);
            C31407OooO0O0.OooO00o oooO00o = c31407OooO0O0OooO0O0.f112138OooO0OO;
            C31407OooO0O0.OooO00o oooO00o2 = C31407OooO0O0.OooO00o.f112145OooOoo0;
            C31407OooO0O0.OooO00o oooO00o3 = C31407OooO0O0.OooO00o.f112139OooOo;
            C31407OooO0O0.OooO00o oooO00o4 = C31407OooO0O0.OooO00o.f112147OooOooo;
            C31407OooO0O0.OooO00o oooO00o5 = C31407OooO0O0.OooO00o.f112146OooOooO;
            int i = 1;
            if (oooO00o == oooO00o2) {
                while (true) {
                    C31411OooO0o0 c31411OooO0o0 = this.f112160OooO00o;
                    C31407OooO0O0 c31407OooO0O0 = c31411OooO0o0.f112163OooO0O0;
                    if (c31407OooO0O0 == null) {
                        break;
                    }
                    if (c31407OooO0O0.f112138OooO0OO == oooO00o2) {
                        i++;
                    }
                    C31407OooO0O0 c31407OooO0O0OooO0O02 = c31411OooO0o0.OooO0O0();
                    arrayList.add(c31407OooO0O0OooO0O02);
                    if (c31407OooO0O0OooO0O02.f112138OooO0OO == C31407OooO0O0.OooO00o.f112144OooOoo && i - 1 == 0) {
                        break;
                    }
                }
            } else if (oooO00o == oooO00o5) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    C31411OooO0o0 c31411OooO0o02 = this.f112160OooO00o;
                    if (c31411OooO0o02.f112163OooO0O0.f112138OooO0OO == oooO00o5) {
                        i++;
                    }
                    C31407OooO0O0 c31407OooO0O0OooO0O03 = c31411OooO0o02.OooO0O0();
                    arrayList2.add(c31407OooO0O0OooO0O03);
                    if (c31407OooO0O0OooO0O03.f112138OooO0OO == oooO00o4 && i - 1 == 0) {
                        break;
                    }
                }
                C31407OooO0O0 c31407OooO0O0OooO0oO = OooO0oO("executeonly");
                if (c31407OooO0O0OooO0oO != null) {
                    arrayList2.add(c31407OooO0O0OooO0oO);
                }
                arrayList.addAll(arrayList2);
            } else if (oooO00o == C31407OooO0O0.OooO00o.f112149Oooo000) {
                OooO0Oo(C31407OooO0O0.OooO00o.f112150Oooo00O);
                return arrayList;
            }
            if (this.f112160OooO00o.f112163OooO0O0.f112136OooO00o.equals("systemdict")) {
                OooO0o0("systemdict", oooO00o3);
                OooO0o0("internaldict", C31407OooO0O0.OooO00o.f112142OooOoO0);
                OooO0o0("known", oooO00o3);
                OooO0Oo(oooO00o5);
                OooO0oo();
                OooO0Oo(oooO00o5);
                OooO0oo();
                OooO0o0("ifelse", oooO00o3);
                OooO0Oo(oooO00o5);
                OooO0o0(TokenRequest.TokenType.POP, oooO00o3);
                arrayList.clear();
                arrayList.addAll(OooOO0O());
                OooO0Oo(oooO00o4);
                OooO0o0("if", oooO00o3);
            }
        }
        return arrayList;
    }
}

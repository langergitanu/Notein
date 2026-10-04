package com.aspose.slides;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10607qk;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.jn */
/* JADX INFO: loaded from: classes3.dex */
class C13693jn {
    /* JADX INFO: renamed from: k4 */
    public static void m63444k4(ICamera iCamera, C10534m3 c10534m3, m4c m4cVar) {
        int i;
        C10480ii c10480iiM51263x1 = c10534m3 != null ? c10534m3.m51263x1() : new C10480ii();
        C1123fw c1123fwM453to = ((Camera) iCamera).m453to();
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(704), C10609qn.class);
        C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(705), C10609qn.class);
        C10609qn c10609qn3 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(715), C10609qn.class);
        C10609qn c10609qn4 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(716), C10609qn.class);
        C10609qn c10609qn5 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(718), C10609qn.class);
        C10609qn c10609qn6 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(719), C10609qn.class);
        C10607qk c10607qk = (C10607qk) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(767), C10607qk.class);
        if (c10607qk == null) {
            c10607qk = new C10607qk();
        }
        long jM51597ar = c10609qn3 != null ? c10609qn3.m51597ar() : 1250000L;
        long jM51597ar2 = c10609qn4 != null ? c10609qn4.m51597ar() : 4293717296L;
        long jM51597ar3 = c10609qn5 != null ? c10609qn5.m51597ar() : 32768L;
        long jM51597ar4 = c10609qn6 != null ? c10609qn6.m51597ar() : 4294934528L;
        if (jM51597ar == 4293717296L && jM51597ar2 == 4293717296L && jM51597ar3 == 4294934528L && jM51597ar4 == 4294934528L) {
            iCamera.setCameraType(c10607qk.m51573ck() ? 27 : 36);
        } else {
            long j = jM51597ar & 4294967295L;
            if (j == 0 && jM51597ar2 == 4293717296L && (jM51597ar3 & 4294967295L) == 0 && jM51597ar4 == 4294934528L) {
                i = !c10607qk.m51573ck() ? 35 : 26;
            } else if (jM51597ar == 1250000 && jM51597ar2 == 4293717296L && jM51597ar3 == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID && jM51597ar4 == 4294934528L) {
                i = !c10607qk.m51573ck() ? 37 : 28;
            } else if (jM51597ar == 4293717296L && (jM51597ar2 & 4294967295L) == 0 && jM51597ar3 == 4294934528L && (jM51597ar4 & 4294967295L) == 0) {
                i = !c10607qk.m51573ck() ? 33 : 24;
            } else if (j == 0 && (jM51597ar2 & 4294967295L) == 0 && (jM51597ar3 & 4294967295L) == 0 && (jM51597ar4 & 4294967295L) == 0) {
                i = !c10607qk.m51573ck() ? 32 : 23;
            } else if (jM51597ar == 1250000 && (jM51597ar2 & 4294967295L) == 0 && jM51597ar3 == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID && (jM51597ar4 & 4294967295L) == 0) {
                i = !c10607qk.m51573ck() ? 34 : 25;
            } else if (jM51597ar == 4293717296L && (jM51597ar2 & 4294967295L) == 1250000 && jM51597ar3 == 4294934528L && (jM51597ar4 & 4294967295L) == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
                i = !c10607qk.m51573ck() ? 30 : 21;
            } else if (j == 0 && (jM51597ar2 & 4294967295L) == 1250000 && (jM51597ar3 & 4294967295L) == 0 && (jM51597ar4 & 4294967295L) == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
                i = !c10607qk.m51573ck() ? 29 : 20;
            } else if (jM51597ar == 1250000 && (jM51597ar2 & 4294967295L) == 1250000 && jM51597ar3 == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID && (jM51597ar4 & 4294967295L) == PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
                i = !c10607qk.m51573ck() ? 31 : 22;
            } else {
                iCamera.setCameraType(c10607qk.m51573ck() ? 27 : 36);
                c1123fwM453to.m6337k4(true);
            }
            iCamera.setCameraType(i);
        }
        if (!c10607qk.m51581jd()) {
            m4cVar.m64712du().m71946k4().m2349du().m1921k4(C14113y2.m67408k4("Deserialization of the ", "Style3Dc3DRotationAxisX, ..AxisY, ..AxisZ, ..Angle Camera data is not imlemented yet."), 2);
            return;
        }
        int iM51597ar = c10609qn2 != null ? (int) c10609qn2.m51597ar() : 0;
        int iM51597ar2 = c10609qn != null ? (int) c10609qn.m51597ar() : 0;
        float f = (-iM51597ar) / 65536.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        float f2 = iM51597ar2 / 65536.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        iCamera.setRotation(f, f2, 0 / 65536.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r1.m6340x1() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m63445k4(ICamera iCamera, C10534m3 c10534m3, boolean[] zArr, y2n y2nVar) {
        char c;
        boolean z;
        C10480ii c10480iiM51263x1 = c10534m3.m51263x1();
        C1123fw c1123fwM453to = ((Camera) iCamera).m453to();
        if (c1123fwM453to.m6340x1()) {
            c10480iiM51263x1.m50928kk(717);
            c10480iiM51263x1.m50928kk(720);
            c10480iiM51263x1.m50928kk(721);
        }
        c10480iiM51263x1.m50928kk(704);
        c10480iiM51263x1.m50928kk(705);
        if (iCamera.getCameraType() == -1) {
            return;
        }
        C10607qk c10607qk = (C10607qk) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(767), C10607qk.class);
        zArr[0] = true;
        int cameraType = iCamera.getCameraType();
        if (cameraType != -1) {
            char c2 = 0;
            z = true;
            switch (cameraType) {
                case 20:
                case 29:
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 0L));
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 1250000L));
                    c10480iiM51263x1.m50930x1(new C10609qn(718, 0L));
                    C22225Oooo0oO.OooO0O0(719, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, c10480iiM51263x1);
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 5898240L, c10480iiM51263x1);
                    }
                    boolean z2 = iCamera.getCameraType() == 20;
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 21:
                case 30:
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 4293717296L));
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 1250000L));
                    c10480iiM51263x1.m50930x1(new C10609qn(718, 4294934528L));
                    C22225Oooo0oO.OooO0O0(719, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, c10480iiM51263x1);
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 2949120L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 21) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 22:
                case 31:
                    c10480iiM51263x1.m50928kk(715);
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 1250000L));
                    c10480iiM51263x1.m50928kk(718);
                    c10480iiM51263x1.m50930x1(new C10609qn(719, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID));
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 8847360L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 22) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 23:
                case 32:
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 0L));
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 0L));
                    c10480iiM51263x1.m50930x1(new C10609qn(718, 0L));
                    C22225Oooo0oO.OooO0O0(719, 0L, c10480iiM51263x1);
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 0L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 23) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 24:
                case 33:
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 4293717296L));
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 0L));
                    c10480iiM51263x1.m50930x1(new C10609qn(718, 4294934528L));
                    C22225Oooo0oO.OooO0O0(719, 0L, c10480iiM51263x1);
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 4271374336L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 24) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 25:
                case 34:
                    c10480iiM51263x1.m50928kk(715);
                    c10480iiM51263x1.m50930x1(new C10609qn(716, 0L));
                    c10480iiM51263x1.m50928kk(718);
                    c10480iiM51263x1.m50930x1(new C10609qn(719, 0L));
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 11796480L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 25) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 26:
                case 35:
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 0L));
                    c10480iiM51263x1.m50928kk(716);
                    C22224Oooo0o0.OooO0O0(718, 0L, c10480iiM51263x1, 719);
                    if (c1123fwM453to.m6340x1()) {
                        C22225Oooo0oO.OooO0O0(720, 4289069056L, c10480iiM51263x1);
                    }
                    if (iCamera.getCameraType() == 26) {
                    }
                    c10607qk.m51586m9(z2);
                    c = c2;
                    break;
                case 27:
                case 36:
                    if (c1123fwM453to.m6338k4()) {
                        c = c2;
                    }
                    c10480iiM51263x1.m50930x1(new C10609qn(715, 4293717296L));
                    c10480iiM51263x1.m50930x1(new C10609qn(718, 4294934528L));
                    c10480iiM51263x1.m50930x1(new C10609qn(720, 4292018176L));
                    boolean z3 = iCamera.getCameraType() == 27;
                    c10607qk.m51586m9(z3);
                    c = c2;
                    break;
                case 28:
                case 37:
                    c10480iiM51263x1.m50928kk(715);
                    c10480iiM51263x1.m50928kk(716);
                    c10480iiM51263x1.m50928kk(718);
                    c10480iiM51263x1.m50928kk(719);
                    if (iCamera.getCameraType() == 28) {
                    }
                    c10607qk.m51586m9(z3);
                    c = c2;
                    break;
                default:
                    y2nVar.m73707k4("Serialization of the non-Legacy CameraPreset types into metroBlob is not imlemented yet.", 2);
                    zArr[0] = false;
                    c = c2;
                    break;
            }
        } else {
            c = 0;
            z = true;
            zArr[0] = false;
        }
        float[] rotation = iCamera.getRotation();
        if (rotation != null) {
            int iOooO00o = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(-rotation[c], 65536.0d, 14);
            if (iOooO00o != 0) {
                c10480iiM51263x1.m50926k4(new C10609qn(705, ((long) iOooO00o) & 4294967295L));
                zArr[c] = z;
            }
            float f = rotation[c];
            if (f > 90.0f) {
                rotation[c] = f - 360.0f;
            }
            float f2 = rotation[z ? 1 : 0];
            if (f2 > 90.0f) {
                rotation[z ? 1 : 0] = f2 - 360.0f;
            }
            int iOooO00o2 = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(rotation[z ? 1 : 0], 65536.0d, 14);
            if (iOooO00o2 != 0) {
                c10480iiM51263x1.m50926k4(new C10609qn(704, ((long) iOooO00o2) & 4294967295L));
                zArr[c] = z;
            }
        }
    }
}

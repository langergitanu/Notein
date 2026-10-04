package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p492x4.C12386x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.vd */
/* JADX INFO: loaded from: classes3.dex */
class C14673vd {
    /* JADX INFO: renamed from: k4 */
    public static List<jrz> m72182k4(String str) {
        List<jrz> list = new List<>();
        m72183k4(str, list, 1L, 1L, 0L, 0L);
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72184x1(String str, List<jrz> list, long j, long j2, long j3, long j4) {
        C12385to c12385toM57989x1 = pe5.f48044m9.m57989x1(str);
        jrz jrzVar = new jrz(c12385toM57989x1.mo57994k4());
        while (c12385toM57989x1.mo58006to()) {
            if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 2)) {
                jrzVar.m63524k4(C13850af.m65122ks(c12385toM57989x1.m58004du().m58000k4(3).mo57995kk()) * j);
                if (jrzVar.m63529kk() < 0 && j3 > 0) {
                    long jM63529kk = jrzVar.m63529kk() + j3;
                    jrzVar.m63524k4(jM63529kk < 0 ? j3 : jM63529kk + j3);
                }
                jrzVar.m63536x1(C13850af.m65122ks(c12385toM57989x1.m58004du().m58000k4(4).mo57995kk()) * j2);
                if (jrzVar.m63533to() < 0 && j4 > 0) {
                    long jM63533to = jrzVar.m63533to() + j4;
                    jrzVar.m63536x1(jM63533to < 0 ? j4 : jM63533to + j4);
                }
                jrzVar.m63530kk(C13850af.m65122ks(c12385toM57989x1.m58004du().m58000k4(5).mo57995kk()));
                jrzVar.m63534to(C13850af.m65122ks(c12385toM57989x1.m58004du().m58000k4(6).mo57995kk()));
            } else if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 7)) {
                if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 8)) {
                    C12386x1 c12386x1M58000k4 = c12385toM57989x1.m58004du().m58000k4(9);
                    C12386x1 c12386x1M58000k42 = c12385toM57989x1.m58004du().m58000k4(10);
                    jrzVar.m63527k4(c12386x1M58000k4.mo58006to() ? c12386x1M58000k4.mo57995kk() : null);
                    jrzVar.m63537x1(c12386x1M58000k42.mo58006to() ? c12386x1M58000k42.mo57995kk() : null);
                }
                if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 11)) {
                    C12386x1 c12386x1M58000k43 = c12385toM57989x1.m58004du().m58000k4(12);
                    C12386x1 c12386x1M58000k44 = c12385toM57989x1.m58004du().m58000k4(14);
                    jrzVar.m63527k4(c12386x1M58000k43.mo58006to() ? c12386x1M58000k43.mo57995kk() : null);
                    jrzVar.m63537x1(c12386x1M58000k44.mo58006to() ? c12386x1M58000k44.mo57995kk() : null);
                }
                if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 13)) {
                    C12386x1 c12386x1M58000k45 = c12385toM57989x1.m58004du().m58000k4(12);
                    C12386x1 c12386x1M58000k46 = c12385toM57989x1.m58004du().m58000k4(14);
                    jrzVar.m63527k4(c12386x1M58000k45.mo58006to() ? c12386x1M58000k45.mo57995kk() : null);
                    jrzVar.m63537x1(c12386x1M58000k46.mo58006to() ? c12386x1M58000k46.mo57995kk() : null);
                }
            } else if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 1)) {
                jrzVar.m63520fa().addItem(new hzm(c12385toM57989x1.mo57994k4(), c12385toM57989x1.mo57996x1()));
                jrzVar.m63525k4(c12385toM57989x1);
            }
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
        }
        if (jrzVar.m63535up().size() > 0) {
            if (jrzVar.m63535up().size() > 1 || !C14113y2.m67411k4(jrzVar.m63535up().get_Item(0))) {
                try {
                    jrzVar.m7343k4(c12385toM57989x1.mo57994k4() - jrzVar.m7344yj());
                } catch (IllegalStateException unused) {
                    jrzVar.m7343k4(-jrzVar.m7344yj());
                }
                list.addItem(jrzVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72183k4(String str, List<jrz> list, long j, long j2, long j3, long j4) {
        String strOooO00o;
        for (C12385to c12385toM57989x1 = pe5.f48041h4.m57989x1(str); c12385toM57989x1.mo58006to(); c12385toM57989x1 = c12385toM57989x1.m58005h4()) {
            if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 2) && androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 3)) {
                C12385to c12385toM57989x12 = pe5.f48039du.m57989x1(c12385toM57989x1.m58004du().m58000k4(3).mo57995kk());
                if (c12385toM57989x12.mo58006to() && androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x12, 0)) {
                    long jM65122ks = C13850af.m65122ks(c12385toM57989x12.m58004du().m58000k4(2).mo57995kk());
                    long jM65122ks2 = C13850af.m65122ks(c12385toM57989x12.m58004du().m58000k4(3).mo57995kk());
                    long jM65122ks3 = C13850af.m65122ks(c12385toM57989x12.m58004du().m58000k4(4).mo57995kk());
                    long jM65122ks4 = C13850af.m65122ks(c12385toM57989x12.m58004du().m58000k4(5).mo57995kk());
                    if (jM65122ks3 != 0) {
                        jM65122ks3 = jM65122ks / jM65122ks3;
                    }
                    if (jM65122ks3 == 0) {
                        jM65122ks3 = 1;
                    }
                    if (jM65122ks4 != 0) {
                        jM65122ks4 = jM65122ks2 / jM65122ks4;
                    }
                    m72183k4(OooOo.OooO00o(c12385toM57989x1, 3), list, jM65122ks3, jM65122ks4 != 0 ? jM65122ks4 : 1L, jM65122ks, jM65122ks2);
                }
            } else {
                if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 4) && androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 5)) {
                    strOooO00o = OooOo.OooO00o(c12385toM57989x1, 5);
                } else if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 6) && androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 7)) {
                    strOooO00o = OooOo.OooO00o(c12385toM57989x1, 7);
                }
                m72184x1(strOooO00o, list, j, j2, j3, j4);
            }
        }
    }
}

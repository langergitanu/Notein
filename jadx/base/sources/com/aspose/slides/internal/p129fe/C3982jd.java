package com.aspose.slides.internal.p129fe;

import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.p559ms.System.C14047bz;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C3982jd implements Cloneable {

    /* JADX INFO: renamed from: c5 */
    private byte[][] f10810c5;

    /* JADX INFO: renamed from: ck */
    private int f10811ck;

    /* JADX INFO: renamed from: du */
    private int f10812du;

    /* JADX INFO: renamed from: dy */
    private String f10813dy;

    /* JADX INFO: renamed from: h4 */
    private String f10814h4;

    /* JADX INFO: renamed from: jd */
    private byte[][] f10815jd;

    /* JADX INFO: renamed from: kk */
    private String f10817kk;

    /* JADX INFO: renamed from: to */
    private String f10819to;

    /* JADX INFO: renamed from: x1 */
    private String f10820x1;

    /* JADX INFO: renamed from: k4 */
    private C14047bz f10816k4 = new C14047bz();

    /* JADX INFO: renamed from: m9 */
    private C14047bz f10818m9 = new C14047bz();

    /* JADX INFO: renamed from: du */
    public C14047bz m15698du() {
        return this.f10818m9;
    }

    /* JADX INFO: renamed from: h4 */
    public String m15699h4() {
        return this.f10813dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15700k4(int i) {
        this.f10812du = i;
    }

    /* JADX INFO: renamed from: kk */
    public String m15704kk() {
        return this.f10820x1;
    }

    /* JADX INFO: renamed from: to */
    public String m15706to() {
        return this.f10819to;
    }

    /* JADX INFO: renamed from: x1 */
    public C14047bz m15708x1() {
        return this.f10816k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15701k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f10816k4);
    }

    /* JADX INFO: renamed from: kk */
    public void m15705kk(String str) {
        this.f10814h4 = str;
    }

    /* JADX INFO: renamed from: to */
    public void m15707to(String str) {
        this.f10813dy = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15709x1(int i) {
        this.f10811ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15702k4(String str) {
        this.f10820x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15710x1(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f10818m9);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15703k4(byte[][] bArr) {
        this.f10810c5 = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15711x1(String str) {
        this.f10819to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3982jd[] m15697k4() {
        HashMap mapM62906to = C13630k4.m62906to();
        C3982jd[] c3982jdArr = new C3982jd[mapM62906to.size()];
        int i = 0;
        for (C3982jd c3982jd : mapM62906to.values()) {
            C3982jd c3982jd2 = new C3982jd();
            c3982jdArr[i] = c3982jd2;
            c3982jd2.f10816k4 = c3982jd.f10816k4;
            c3982jd2.f10818m9 = c3982jd.f10818m9;
            c3982jd2.f10820x1 = c3982jd.f10820x1;
            c3982jd2.f10817kk = c3982jd.f10817kk;
            c3982jd2.f10812du = c3982jd.f10812du;
            c3982jd2.f10819to = c3982jd.f10819to;
            c3982jd2.f10814h4 = c3982jd.f10814h4;
            c3982jd2.f10813dy = c3982jd.f10813dy;
            c3982jd2.f10810c5 = c3982jd.f10810c5;
            c3982jd2.f10815jd = c3982jd.f10815jd;
            i++;
            c3982jd2.f10811ck = c3982jd.f10811ck;
        }
        return c3982jdArr;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15712x1(byte[][] bArr) {
        this.f10815jd = bArr;
    }
}

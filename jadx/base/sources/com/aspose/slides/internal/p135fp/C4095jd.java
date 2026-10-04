package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4095jd {

    /* JADX INFO: renamed from: c5 */
    private int f11190c5;

    /* JADX INFO: renamed from: ck */
    private int f11191ck;

    /* JADX INFO: renamed from: du */
    private int f11192du;

    /* JADX INFO: renamed from: dy */
    private int f11193dy;

    /* JADX INFO: renamed from: fa */
    private int f11194fa;

    /* JADX INFO: renamed from: h4 */
    private int f11195h4;

    /* JADX INFO: renamed from: jd */
    private int f11196jd;

    /* JADX INFO: renamed from: k4 */
    public int f11197k4;

    /* JADX INFO: renamed from: kk */
    public int f11198kk;

    /* JADX INFO: renamed from: m9 */
    private byte f11199m9;

    /* JADX INFO: renamed from: to */
    public int f11200to;

    /* JADX INFO: renamed from: up */
    private byte f11201up;

    /* JADX INFO: renamed from: x1 */
    public byte f11202x1;

    public C4095jd() {
    }

    /* JADX INFO: renamed from: c5 */
    public int m16310c5() {
        return this.f11191ck;
    }

    /* JADX INFO: renamed from: ck */
    public byte m16311ck() {
        return this.f11201up;
    }

    /* JADX INFO: renamed from: du */
    public int m16312du() {
        return this.f11195h4;
    }

    /* JADX INFO: renamed from: dy */
    public int m16315dy() {
        return this.f11196jd;
    }

    /* JADX INFO: renamed from: fa */
    public byte m16316fa() {
        return C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f11202x1), 6) & 15), 9);
    }

    /* JADX INFO: renamed from: h4 */
    public byte m16317h4() {
        return this.f11199m9;
    }

    /* JADX INFO: renamed from: jd */
    public int m16320jd() {
        return this.f11194fa;
    }

    /* JADX INFO: renamed from: k4 */
    public byte m16321k4() {
        return C7019kk.m27442k4(Integer.valueOf(m16324kk() & 15), 9);
    }

    /* JADX INFO: renamed from: kk */
    public int m16324kk() {
        return this.f11192du;
    }

    /* JADX INFO: renamed from: m9 */
    public int m16327m9() {
        return this.f11190c5;
    }

    /* JADX INFO: renamed from: to */
    public byte m16329to() {
        return C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f11202x1), 6) >> 4), 9);
    }

    /* JADX INFO: renamed from: x1 */
    public byte m16332x1() {
        return C7019kk.m27442k4(Integer.valueOf(m16324kk() >> 4), 9);
    }

    public C4095jd(byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.f11199m9 = b;
        m16325kk(b2);
        m16318h4(b3);
        this.f11201up = b4;
        m16333x1(b5);
        m16322k4(b6);
    }

    /* JADX INFO: renamed from: du */
    public void m16313du(byte b) {
        this.f11201up = b;
    }

    /* JADX INFO: renamed from: h4 */
    public void m16318h4(byte b) {
        this.f11202x1 = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(b), 6) | (C7019kk.m27462to(Byte.valueOf(this.f11202x1), 6) & 240)), 9);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16322k4(byte b) {
        m16323k4(C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(b), 6) | (m16324kk() & 240)), 9)), 6));
    }

    /* JADX INFO: renamed from: kk */
    public void m16325kk(byte b) {
        this.f11202x1 = C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(b), 6) << 4) | C7019kk.m27462to(Byte.valueOf(this.f11202x1), 6)), 9);
    }

    /* JADX INFO: renamed from: m9 */
    public void m16328m9(int i) {
        this.f11194fa = i;
    }

    /* JADX INFO: renamed from: to */
    public void m16330to(byte b) {
        this.f11199m9 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16333x1(byte b) {
        m16323k4(C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(b), 6) << 4) | m16324kk()), 9)), 6));
    }

    /* JADX INFO: renamed from: du */
    public void m16314du(int i) {
        this.f11196jd = i;
    }

    /* JADX INFO: renamed from: h4 */
    public void m16319h4(int i) {
        this.f11191ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16323k4(int i) {
        this.f11192du = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m16326kk(int i) {
        this.f11193dy = i;
    }

    /* JADX INFO: renamed from: to */
    public void m16331to(int i) {
        this.f11190c5 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16334x1(int i) {
        this.f11195h4 = i;
    }
}

package com.miui.penengine.p595d;

import android.os.Bundle;
import com.miui.penengine.estimate.MiuiMotionEventInfo;

/* JADX INFO: renamed from: com.miui.penengine.d.c */
/* JADX INFO: loaded from: classes9.dex */
public class C18763c {

    /* JADX INFO: renamed from: i */
    public static final double f57158i = 0.5d;

    /* JADX INFO: renamed from: j */
    public static final double f57159j = 0.7853981852531433d;

    /* JADX INFO: renamed from: k */
    public static final double f57160k = 1.0d;

    /* JADX INFO: renamed from: a */
    public float f57161a;

    /* JADX INFO: renamed from: b */
    public float f57162b;

    /* JADX INFO: renamed from: c */
    public long f57163c;

    /* JADX INFO: renamed from: d */
    public double f57164d;

    /* JADX INFO: renamed from: e */
    public double f57165e;

    /* JADX INFO: renamed from: f */
    public double f57166f;

    /* JADX INFO: renamed from: g */
    public boolean f57167g;

    /* JADX INFO: renamed from: h */
    public int f57168h;

    public C18763c(double d, double d2, long j, double d3, double d4, double d5, boolean z, int i) {
        this.f57161a = (float) d;
        this.f57162b = (float) d2;
        this.f57163c = j;
        this.f57164d = d3;
        this.f57165e = d4;
        this.f57166f = d5;
        this.f57167g = z;
        this.f57168h = i;
    }

    /* JADX INFO: renamed from: a */
    public static C18763c m80298a(MiuiMotionEventInfo miuiMotionEventInfo) {
        if (miuiMotionEventInfo == null) {
            return null;
        }
        return new C18763c(miuiMotionEventInfo.getX(), miuiMotionEventInfo.getY(), miuiMotionEventInfo.getTime(), miuiMotionEventInfo.getPressure(), miuiMotionEventInfo.getOrientation(), miuiMotionEventInfo.getTilt(), miuiMotionEventInfo.isHistoryPoint(), miuiMotionEventInfo.getMotionAction());
    }

    /* JADX INFO: renamed from: b */
    public double m80307b() {
        return this.f57165e;
    }

    /* JADX INFO: renamed from: c */
    public double m80310c() {
        return this.f57164d;
    }

    /* JADX INFO: renamed from: d */
    public double m80312d() {
        return this.f57166f;
    }

    /* JADX INFO: renamed from: e */
    public long m80313e() {
        return this.f57163c;
    }

    /* JADX INFO: renamed from: f */
    public float m80314f() {
        return this.f57161a;
    }

    /* JADX INFO: renamed from: g */
    public float m80315g() {
        return this.f57162b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m80316h() {
        return this.f57167g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder, long] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, void] */
    public String toString() {
        ?? sb = new StringBuilder("MotionPoint{x=");
        sb.append(this.f57161a);
        sb.append(", y=");
        sb.append(this.f57162b);
        sb.append(", time=");
        sb.append(this.f57163c);
        sb.append(", pressure=");
        sb.append(this.f57164d);
        sb.append(", orientation=");
        sb.append(this.f57165e);
        sb.append(", tilt=");
        sb.append(this.f57166f);
        sb.append(", isHistory=");
        sb.append(this.f57167g);
        sb.append(", action=");
        int i = this.f57168h;
        return Bundle.putLong(125, sb);
    }

    public C18763c(double d, double d2, long j, int i) {
        this(d, d2, j, 1.0d, 0.7853981852531433d, 0.5d, false, i);
    }

    /* JADX INFO: renamed from: a */
    public int m80299a() {
        return this.f57168h;
    }

    /* JADX INFO: renamed from: b */
    public void m80308b(double d) {
        this.f57164d = d;
    }

    /* JADX INFO: renamed from: c */
    public void m80311c(double d) {
        this.f57166f = d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m80306a(C18763c c18763c) {
        return c18763c != null && c18763c.f57161a == this.f57161a && c18763c.f57162b == this.f57162b;
    }

    /* JADX INFO: renamed from: b */
    public void m80309b(float f) {
        this.f57162b = f;
    }

    /* JADX INFO: renamed from: a */
    public void m80301a(double d, double d2, long j, double d3, double d4, double d5, boolean z, int i) {
        this.f57161a = (float) d;
        this.f57162b = (float) d2;
        this.f57163c = j;
        this.f57164d = d3;
        this.f57165e = d4;
        this.f57166f = d5;
        this.f57167g = z;
        this.f57168h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m80303a(int i) {
        this.f57168h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m80305a(boolean z) {
        this.f57167g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m80300a(double d) {
        this.f57165e = d;
    }

    /* JADX INFO: renamed from: a */
    public void m80304a(long j) {
        this.f57163c = j;
    }

    /* JADX INFO: renamed from: a */
    public void m80302a(float f) {
        this.f57161a = f;
    }
}

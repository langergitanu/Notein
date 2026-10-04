package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import o00OO0oO.C25004OooO0Oo;
import o00OooOO.C25159OooO0oO;
import o00o00oO.C25291OooO0oO;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.C25298OooO0o;
import o00o0O0.C25312OooO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o extends ContextWrapper {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO0O0 f67120OooOO0O = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f67121OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25159OooO0oO f67122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25312OooO0o f67123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25298OooO0o f67124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25004OooO0Oo f67125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo.OooO00o f67126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<InterfaceC25289OooO0o<Object>> f67127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OooO.OooOOO0 f67128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C22251OooO0oO f67129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C25291OooO0oO f67130OooOO0;

    public OooO0o(Context context, C25159OooO0oO c25159OooO0oO, OooOO0 oooOO02, C25298OooO0o c25298OooO0o, C25004OooO0Oo c25004OooO0Oo, OooOo.OooO00o oooO00o, List list, o00OooO.OooOOO0 oooOOO0, C22251OooO0oO c22251OooO0oO, int i) {
        super(context.getApplicationContext());
        this.f67122OooO00o = c25159OooO0oO;
        this.f67124OooO0OO = c25298OooO0o;
        this.f67125OooO0Oo = c25004OooO0Oo;
        this.f67127OooO0o0 = list;
        this.f67126OooO0o = oooO00o;
        this.f67128OooO0oO = oooOOO0;
        this.f67129OooO0oo = c22251OooO0oO;
        this.f67121OooO = i;
        this.f67123OooO0O0 = new C25312OooO0o(oooOO02);
    }

    public final OooO OooO00o() {
        return (OooO) this.f67123OooO0O0.get();
    }
}

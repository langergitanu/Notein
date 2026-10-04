package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o00O0oo.C24959OooO00o;
import o00OO00O.C24983OooO0Oo;

/* JADX INFO: renamed from: com.airbnb.lottie.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22142OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet<String> f66769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public HashMap f66770OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HashMap f66771OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo.OooOOO<C24959OooO00o> f66772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f66773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f66774OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f66775OooO0oO;

    public C22142OooO0oo() {
        new OooOo.OooO0O0();
        new HashMap();
        this.f66769OooO00o = new HashSet<>();
        this.f66775OooO0oO = 0;
    }

    public final void OooO00o(String str) {
        C24983OooO0Oo.OooO0O0(str);
        this.f66769OooO00o.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f66774OooO0o0.iterator();
        while (it.hasNext()) {
            sb.append(((C24959OooO00o) it.next()).OooO00o("\t"));
        }
        return sb.toString();
    }
}

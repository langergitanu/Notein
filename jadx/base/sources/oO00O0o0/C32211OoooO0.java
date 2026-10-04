package oO00O0o0;

import OooOoOO.C20519OooO0Oo;
import java.util.ArrayList;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: oO00O0o0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32211OoooO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f115593OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0 f115594OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f115595OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f115596OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f115597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f115598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32195OooOoO f115599OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f115600OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f115601OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C32447OooOOo f115602OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f115603OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C32447OooOOo f115604OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C32447OooOOo f115605OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C32447OooOOo f115606OooOOO0;

    public C32211OoooO0(Oooo0 protocol, String host, int i, ArrayList arrayList, InterfaceC32195OooOoO parameters, String fragment, String str, String str2, boolean z, String str3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(protocol, "protocol");
        kotlin.jvm.internal.OooOOO0.OooO0oO(host, "host");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parameters, "parameters");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
        this.f115594OooO00o = protocol;
        this.f115595OooO0O0 = host;
        this.f115596OooO0OO = i;
        this.f115597OooO0Oo = arrayList;
        this.f115599OooO0o0 = parameters;
        this.f115598OooO0o = str;
        this.f115600OooO0oO = str2;
        this.f115601OooO0oo = z;
        this.f115593OooO = str3;
        if ((i < 0 || i >= 65536) && i != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        int i2 = 0;
        this.f115602OooOO0 = C20519OooO0Oo.OooO0OO(new C32209Oooo0oO(this, i2));
        this.f115603OooOO0O = C20519OooO0Oo.OooO0OO(new C32202Oooo(this));
        C20519OooO0Oo.OooO0OO(new C32210Oooo0oo(this));
        this.f115604OooOO0o = C20519OooO0Oo.OooO0OO(new C32212OoooO00(this, i2));
        this.f115606OooOOO0 = C20519OooO0Oo.OooO0OO(new C32207Oooo0o(this, i2));
        this.f115605OooOOO = C20519OooO0Oo.OooO0OO(new Oooo0.OooOOO(this, 1));
    }

    public final int OooO00o() {
        int i = this.f115596OooO0OO;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f115594OooO00o.f115584OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C32211OoooO0.class == obj.getClass() && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115593OooO, ((C32211OoooO0) obj).f115593OooO);
    }

    public final int hashCode() {
        return this.f115593OooO.hashCode();
    }

    public final String toString() {
        return this.f115593OooO;
    }
}

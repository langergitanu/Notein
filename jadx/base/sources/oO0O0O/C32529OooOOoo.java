package oO0O0O;

import OooooO0.C21286OooO0O0;
import kotlin.jvm.internal.C24034Oooo00O;
import oO0O0O.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0o0O0.C33552OooO00o;

/* JADX INFO: renamed from: oO0O0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32529OooOOoo extends C33552OooO00o.OooO0O0<InterfaceC32596OooO0o0, OooOOO.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f116876OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<OooOOO.OooO00o> f116877OooO0O0;

    public C32529OooOOoo(String str, C24034Oooo00O<OooOOO.OooO00o> c24034Oooo00O) {
        this.f116876OooO00o = str;
        this.f116877OooO0O0 = c24034Oooo00O;
    }

    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final Object OooO00o() {
        OooOOO.OooO00o oooO00o = this.f116877OooO0O0.f80942OooOo0o;
        return oooO00o == null ? OooOOO.OooO00o.f116867OooOoO0 : oooO00o;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, oO0O0O.OooOOO$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, oO0O0O.OooOOO$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, oO0O0O.OooOOO$OooO00o] */
    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final boolean OooO0O0(Object obj) {
        InterfaceC32596OooO0o0 javaClassDescriptor = (InterfaceC32596OooO0o0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(javaClassDescriptor, "javaClassDescriptor");
        String strOooO0o = C21286OooO0O0.OooO0o(javaClassDescriptor, this.f116876OooO00o);
        boolean zContains = C32532OooOo0o.f116881OooO0O0.contains(strOooO0o);
        C24034Oooo00O<OooOOO.OooO00o> c24034Oooo00O = this.f116877OooO0O0;
        if (zContains) {
            c24034Oooo00O.f80942OooOo0o = OooOOO.OooO00o.f116865OooOo0o;
        } else if (C32532OooOo0o.f116882OooO0OO.contains(strOooO0o)) {
            c24034Oooo00O.f80942OooOo0o = OooOOO.OooO00o.f116864OooOo;
        } else if (C32532OooOo0o.f116880OooO00o.contains(strOooO0o)) {
            c24034Oooo00O.f80942OooOo0o = OooOOO.OooO00o.f116866OooOoO;
        }
        return c24034Oooo00O.f80942OooOo0o == null;
    }
}

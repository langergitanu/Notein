package oO0Ooo0O;

import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.io.InputStream;
import java.util.List;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0oO.OooO0OO;
import oO00Oo0o.C32274OooO00o;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33386OooOO0o extends OooO0OO.AbstractC20204OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Long f120703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32183OooO0Oo f120704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f120705OooO0OO;

    public C33386OooOO0o(C32132OooO0Oo c32132OooO0Oo, C32183OooO0Oo c32183OooO0Oo, Object obj) {
        this.f120705OooO0OO = obj;
        C32187OooOO0o c32187OooOO0o = c32132OooO0Oo.f115205OooO0OO;
        List<String> list = C32190OooOOo0.f115537OooO00o;
        String strOooO0o0 = c32187OooOO0o.OooO0o0("Content-Length");
        this.f120703OooO00o = strOooO0o0 != null ? Long.valueOf(Long.parseLong(strOooO0o0)) : null;
        if (c32183OooO0Oo == null) {
            C32183OooO0Oo c32183OooO0Oo2 = C32183OooO0Oo.OooO00o.f115523OooO00o;
            c32183OooO0Oo = C32183OooO0Oo.OooO00o.f115524OooO0O0;
        }
        this.f120704OooO0O0 = c32183OooO0Oo;
    }

    @Override // oO00O0oO.OooO0OO
    public final Long OooO00o() {
        return this.f120703OooO00o;
    }

    @Override // oO00O0oO.OooO0OO
    public final C32183OooO0Oo OooO0O0() {
        return this.f120704OooO0O0;
    }

    @Override // oO00O0oO.OooO0OO.AbstractC20204OooO0OO
    public final InterfaceC23986Ooooo0o OooO0o0() {
        InputStream inputStream = (InputStream) this.f120705OooO0OO;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 context = ExecutorC33873OooO0O0.f122045OooOoO0;
        C32274OooO00o.C20213OooO00o pool = C32274OooO00o.f115992OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputStream, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pool, "pool");
        return C24005o00o0O.OooO0OO(C33662Ooooooo.f121350OooOo0o, context, true, new io.ktor.utils.p616io.jvm.javaio.OooO(pool, inputStream, null)).f80790OooOo;
    }
}

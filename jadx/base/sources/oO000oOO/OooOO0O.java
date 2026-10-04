package oO000oOO;

import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.InterfaceC32184OooO0o0;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O implements InterfaceC32184OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f115179OooO00o = new OooOO0O();

    @Override // oO00O0o0.InterfaceC32184OooO0o0
    public final boolean OooO00o(C32183OooO0Oo contentType) {
        OooOOO0.OooO0oO(contentType, "contentType");
        if (contentType.OooO0o0(C32183OooO0Oo.OooO00o.f115523OooO00o)) {
            return true;
        }
        if (!((List) contentType.f81815OooO0OO).isEmpty()) {
            contentType = new C32183OooO0Oo(contentType.f115521OooO0Oo, contentType.f115522OooO0o0, C34434OooOoO.f123453OooOo0o);
        }
        String string = contentType.toString();
        return C33595OooOOo.OooOoO0(string, "application/", false) && C33595OooOOo.OooOOo0(string, "+json", false);
    }
}

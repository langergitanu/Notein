package ooOOO0Oo;

import java.util.Map;
import oO00ooOO.C32465OooO0O0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: ooOOO0Oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35045OooOoO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<String[]> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C35044OooOoO f125830OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35045OooOoO0(C35044OooOoO c35044OooOoO) {
        super(0);
        this.f125830OooOo0o = c35044OooOoO;
    }

    @Override // oO0O000o.OooO00o
    public final String[] invoke() {
        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
        C35044OooOoO c35044OooOoO = this.f125830OooOo0o;
        c32465OooO0O0OooO0Oo.add(c35044OooOoO.f125826OooO00o.f125877OooOo0o);
        Oooo000 oooo000 = c35044OooOoO.f125827OooO0O0;
        if (oooo000 != null) {
            c32465OooO0O0OooO0Oo.add("under-migration:".concat(oooo000.f125877OooOo0o));
        }
        for (Map.Entry<C33477OooO0OO, Oooo000> entry : c35044OooOoO.f125828OooO0OO.entrySet()) {
            c32465OooO0O0OooO0Oo.add("@" + entry.getKey() + ':' + entry.getValue().f125877OooOo0o);
        }
        return (String[]) com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo).toArray(new String[0]);
    }
}

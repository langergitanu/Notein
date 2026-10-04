package oO0o0O0o;

import java.util.Iterator;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: oO0o0O0o.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33598OooOo0 implements InterfaceC33569OooO0oo<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f121269OooO00o;

    public C33598OooOo0(String str) {
        this.f121269OooO00o = str;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<String> iterator() {
        return new C33585OooO0o0(this.f121269OooO00o);
    }
}

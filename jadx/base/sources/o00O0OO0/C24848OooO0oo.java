package o00O0OO0;

import android.content.Context;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24768OooO0oO;

/* JADX INFO: renamed from: o00O0OO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24848OooO0oo implements InterfaceC24757OooO0OO.InterfaceC19651OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f84353OooO00o;

    public C24848OooO0oo(Context context) {
        this.f84353OooO00o = context;
    }

    @Override // o000oooO.InterfaceC24757OooO0OO.InterfaceC19651OooO0OO
    public final InterfaceC24757OooO0OO OooO00o(InterfaceC24757OooO0OO.OooO0O0 oooO0O0) {
        Context context = this.f84353OooO00o;
        InterfaceC24757OooO0OO.OooO00o callback = oooO0O0.f83965OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
        String str = oooO0O0.f83964OooO0O0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        InterfaceC24757OooO0OO.OooO0O0 oooO0O02 = new InterfaceC24757OooO0OO.OooO0O0(context, str, callback, true);
        return new C24768OooO0oO(oooO0O02.f83963OooO00o, oooO0O02.f83964OooO0O0, oooO0O02.f83965OooO0OO, oooO0O02.f83966OooO0Oo);
    }
}

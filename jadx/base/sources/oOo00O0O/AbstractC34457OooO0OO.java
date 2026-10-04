package oOo00O0O;

import com.huawei.hms.network.embedded.C18437z2;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33926OooOOoo;
import oO0oO00o.C34005OooO00o;
import oO0oO00o.C34006OooO0O0;
import oOo000Oo.C34426OooOO0o;
import ooOOoOO0.C35120OooO0oO;
import ooOOoOO0.C35131OooOoO;
import ooOOoOO0.C35140Oooo0O0;
import ooOOoOO0.C35143Oooo0o0;
import ooOOoOO0.EnumC35144Oooo0oO;
import ooOOoOO0.Oooo0;

/* JADX INFO: renamed from: oOo00O0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34457OooO0OO implements InterfaceC33926OooOOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f123490OooO0Oo = new OooO00o(new C34461OooO0oo(false, false, false, false, true, "    ", C18437z2.f56754h, false, true, EnumC34455OooO00o.f123484OooOo), C34006OooO0O0.f122302OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34461OooO0oo f123491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34005OooO00o f123492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ooOOoOO0.OooOOO f123493OooO0OO = new ooOOoOO0.OooOOO();

    /* JADX INFO: renamed from: oOo00O0O.OooO0OO$OooO00o */
    public static final class OooO00o extends AbstractC34457OooO0OO {
    }

    public AbstractC34457OooO0OO(C34461OooO0oo c34461OooO0oo, C34005OooO00o c34005OooO00o) {
        this.f123491OooO00o = c34461OooO0oo;
        this.f123492OooO0O0 = c34005OooO00o;
    }

    @Override // oO0o0ooO.InterfaceC33926OooOOoo
    public final String OooO00o(InterfaceC33911OooO0OO serializer, Object obj) {
        char[] cArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        C35131OooOoO c35131OooOoO = new C35131OooOoO();
        C35120OooO0oO c35120OooO0oO = C35120OooO0oO.f126111OooO0OO;
        synchronized (c35120OooO0oO) {
            C34426OooOO0o<char[]> c34426OooOO0o = c35120OooO0oO.f126112OooO00o;
            cArr = null;
            char[] cArrRemoveLast = c34426OooOO0o.isEmpty() ? null : c34426OooOO0o.removeLast();
            if (cArrRemoveLast != null) {
                c35120OooO0oO.f126113OooO0O0 -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c35131OooOoO.f126142OooO00o = cArr;
        try {
            new C35140Oooo0O0(new ooOOoOO0.OooOO0O(c35131OooOoO), this, EnumC35144Oooo0oO.f126195OooOoO0, new InterfaceC34466OooOOoo[EnumC35144Oooo0oO.f126199OooOooO.OooO0O0()]).OooOOOo(serializer, obj);
            return c35131OooOoO.toString();
        } finally {
            c35131OooOoO.OooO0O0();
        }
    }

    @Override // oO0o0ooO.InterfaceC33926OooOOoo
    public final Object OooO0O0(String string, InterfaceC33911OooO0OO deserializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(deserializer, "deserializer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        C35143Oooo0o0 c35143Oooo0o0 = new C35143Oooo0o0(string);
        Object objOooOooo = new Oooo0(this, EnumC35144Oooo0oO.f126195OooOoO0, c35143Oooo0o0, deserializer.getDescriptor(), null).OooOooo(deserializer);
        c35143Oooo0o0.OooOOOo();
        return objOooOooo;
    }
}

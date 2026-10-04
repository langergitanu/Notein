package oO0OOo0o;

import java.util.concurrent.ConcurrentHashMap;
import oO0OOo0o.OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOO0 f119558OooO0O0 = new OooOOO0(new OooOO0O.OooO00o(), OooOO0O.OooO0O0.f119551OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f119559OooO00o = new ConcurrentHashMap();

    public OooOOO0(InterfaceC33064OooOO0o... interfaceC33064OooOO0oArr) {
        for (InterfaceC33064OooOO0o interfaceC33064OooOO0o : interfaceC33064OooOO0oArr) {
            this.f119559OooO00o.put(interfaceC33064OooOO0o.OooO00o(), interfaceC33064OooOO0o);
        }
    }
}

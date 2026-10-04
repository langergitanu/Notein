package oO0o;

import OooO0o.C20424OooO0Oo;
import java.util.ArrayList;
import java.util.HashSet;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33523OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f121093OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C34434OooOoO f121094OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f121095OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet f121096OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f121097OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f121098OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f121099OooO0oO;

    public C33523OooO00o(String serialName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serialName, "serialName");
        this.f121093OooO00o = serialName;
        this.f121094OooO0O0 = C34434OooOoO.f123453OooOo0o;
        this.f121095OooO0OO = new ArrayList();
        this.f121096OooO0Oo = new HashSet();
        this.f121098OooO0o0 = new ArrayList();
        this.f121097OooO0o = new ArrayList();
        this.f121099OooO0oO = new ArrayList();
    }

    public static void OooO00o(C33523OooO00o c33523OooO00o, String str, InterfaceC33531OooO0o0 descriptor) {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        c33523OooO00o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        if (!c33523OooO00o.f121096OooO0Oo.add(str)) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Element with name '", str, "' is already registered in ");
            sbOooO0o0.append(c33523OooO00o.f121093OooO00o);
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        c33523OooO00o.f121095OooO0OO.add(str);
        c33523OooO00o.f121098OooO0o0.add(descriptor);
        c33523OooO00o.f121097OooO0o.add(c34434OooOoO);
        c33523OooO00o.f121099OooO0oO.add(false);
    }
}

package Oooo0;

import OooOoo.EnumC20624Oooo0oO;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import o0000o0O.C24276Oooo0o;
import o0000o0O.C24278Oooo0oO;
import o0000o0O.C24282OoooO00;

/* JADX INFO: renamed from: Oooo0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20838Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59925OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59926OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20838Oooo0o(Object obj, int i) {
        super(0);
        this.f59926OooOo0o = i;
        this.f59925OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() throws IOException {
        switch (this.f59926OooOo0o) {
            case 0:
                return new C20888o000Ooo((EnumC20624Oooo0oO) this.f59925OooOo, 0.0f);
            default:
                C24278Oooo0oO c24278Oooo0oO = ((o0000o0O.OooOOO) this.f59925OooOo).f81551OooO00o;
                File canonicalFile = c24278Oooo0oO.f81706OooO0OO.invoke().getCanonicalFile();
                synchronized (C24278Oooo0oO.f81703OooO0o0) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = C24278Oooo0oO.f81702OooO0Oo;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0o(path, "path");
                    linkedHashSet.add(path);
                }
                return new C24282OoooO00(canonicalFile, c24278Oooo0oO.f81704OooO00o, c24278Oooo0oO.f81705OooO0O0.invoke(canonicalFile), new C24276Oooo0o(canonicalFile, 0));
        }
    }
}

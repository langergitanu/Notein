package oO00OoOO;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO00OoO0.InterfaceC32282OooO0O0;

/* JADX INFO: renamed from: oO00OoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32288OooO00o implements InterfaceC32282OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f116172OooO00o = Logger.getLogger(C32288OooO00o.class.getName());

    @Override // oO00OoO0.InterfaceC32282OooO0O0
    public final InputStream OooO00o(String str) {
        InputStream resourceAsStream = C32288OooO00o.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f116172OooO00o.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}

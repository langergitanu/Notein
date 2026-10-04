package oO00o000;

import OooOOOo.OooOOOO;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO00Ooo.OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f116247OooO00o = Logger.getLogger(OooO00o.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOO0O f116248OooO0O0;

    static {
        OooOO0O oooO0O0;
        try {
            oooO0O0 = (OooOO0O) OooOOOO.OooO0O0(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryContextManager", true, OooOO0O.class.getClassLoader()), OooOO0O.class);
        } catch (ClassNotFoundException e) {
            f116247OooO00o.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry context manager, now loading original implementation.", (Throwable) e);
            oooO0O0 = new OooO0O0();
        }
        f116248OooO0O0 = oooO0O0;
    }
}

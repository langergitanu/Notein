package oO00Ooo;

import java.util.logging.Level;
import java.util.logging.Logger;
import oO00Ooo.AbstractC32305OooOOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f116219OooO00o = Logger.getLogger(OooOo.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AbstractC32305OooOOoo f116220OooO0O0;

    static {
        AbstractC32305OooOOoo oooO00o;
        ClassLoader classLoader = AbstractC32305OooOOoo.class.getClassLoader();
        try {
            oooO00o = (AbstractC32305OooOOoo) OooOOOo.OooOOOO.OooO0O0(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryTraceComponentImpl", true, classLoader), AbstractC32305OooOOoo.class);
        } catch (ClassNotFoundException e) {
            Level level = Level.FINE;
            Logger logger = f116219OooO00o;
            logger.log(level, "Couldn't load full implementation for OpenTelemetry TraceComponent, now trying to load original implementation.", (Throwable) e);
            try {
                oooO00o = (AbstractC32305OooOOoo) OooOOOo.OooOOOO.OooO0O0(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), AbstractC32305OooOOoo.class);
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e2);
                try {
                    oooO00o = (AbstractC32305OooOOoo) OooOOOo.OooOOOO.OooO0O0(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), AbstractC32305OooOOoo.class);
                } catch (ClassNotFoundException e3) {
                    logger.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e3);
                    oooO00o = new AbstractC32305OooOOoo.OooO00o();
                }
            }
        }
        f116220OooO0O0 = oooO00o;
    }
}

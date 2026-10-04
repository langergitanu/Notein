package oO000Oo;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Preconditions;
import com.huawei.hms.network.embedded.C18163eb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.C31989OoooO0O;
import oO000Oo.Oooo0;
import oO0OO0OO.C32906OooO0o0;
import oO0OOo0o.AbstractC33081Oooo;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.AbstractC33102OoooOOO;
import oO0OOo0o.C33074OooOoO;
import oO0OOo0o.C33079OooOooO;
import oO0OOo0o.C33103OoooOOo;
import oO0OOo0o.InterfaceC33062OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class oo0o0Oo extends AbstractC33081Oooo<oo0o0Oo> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final Method f114773OooOooo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oO0OOo0o.OooOOO0 f114774OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32046o0000o0o f114775OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32046o0000o0o f114776OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f114777OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33103OoooOOo f114778OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f114779OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f114780OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f114781OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oO0OOo0o.OooOo00 f114782OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f114783OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f114784OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f114785OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f114786OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f114787OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f114788OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33079OooOooO f114789OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f114790OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f114791OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f114792OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f114793OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final boolean f114794OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f114795OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f114796OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f114797OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Logger f114768OooOoO0 = Logger.getLogger(oo0o0Oo.class.getName());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final long f114767OooOoO = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final long f114769OooOoOO = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C32046o0000o0o f114771OooOoo0 = new C32046o0000o0o(C31989OoooO0O.f114228OooOOOo);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final oO0OOo0o.OooOo00 f114770OooOoo = oO0OOo0o.OooOo00.f119581OooO0Oo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final oO0OOo0o.OooOOO0 f114772OooOooO = oO0OOo0o.OooOOO0.f119558OooO0O0;

    public interface OooO00o {
        int OooO00o();
    }

    public interface OooO0O0 {
        C32906OooO0o0.C20274OooO0o0 OooO00o();
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        f114773OooOooo = declaredMethod;
    }

    public oo0o0Oo(String str, C32906OooO0o0.C32907OooO0Oo c32907OooO0Oo, C32906OooO0o0.OooO0OO oooO0OO) {
        C33103OoooOOo c33103OoooOOo;
        C32046o0000o0o c32046o0000o0o = f114771OooOoo0;
        this.f114775OooO00o = c32046o0000o0o;
        this.f114776OooO0O0 = c32046o0000o0o;
        this.f114777OooO0OO = new ArrayList();
        Logger logger = C33103OoooOOo.f119681OooO0Oo;
        synchronized (C33103OoooOOo.class) {
            try {
                if (C33103OoooOOo.f119682OooO0o0 == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z = C31979Oooo00o.f114198OooO00o;
                        arrayList.add(C31979Oooo00o.class);
                    } catch (ClassNotFoundException e) {
                        C33103OoooOOo.f119681OooO0Oo.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<AbstractC33102OoooOOO> listOooO00o = oO0OOo0o.o00O0O.OooO00o(AbstractC33102OoooOOO.class, Collections.unmodifiableList(arrayList), AbstractC33102OoooOOO.class.getClassLoader(), new C33103OoooOOo.OooO00o());
                    if (listOooO00o.isEmpty()) {
                        C33103OoooOOo.f119681OooO0Oo.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    C33103OoooOOo.f119682OooO0o0 = new C33103OoooOOo();
                    for (AbstractC33102OoooOOO abstractC33102OoooOOO : listOooO00o) {
                        C33103OoooOOo.f119681OooO0Oo.fine("Service loader found " + abstractC33102OoooOOO);
                        C33103OoooOOo c33103OoooOOo2 = C33103OoooOOo.f119682OooO0o0;
                        synchronized (c33103OoooOOo2) {
                            abstractC33102OoooOOO.getClass();
                            Preconditions.checkArgument(true, "isAvailable() returned false");
                            c33103OoooOOo2.f119684OooO0O0.add(abstractC33102OoooOOO);
                        }
                    }
                    C33103OoooOOo.f119682OooO0o0.OooO00o();
                }
                c33103OoooOOo = C33103OoooOOo.f119682OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f114778OooO0Oo = c33103OoooOOo;
        this.f114780OooO0o0 = new ArrayList();
        this.f114781OooO0oO = "pick_first";
        this.f114782OooO0oo = f114770OooOoo;
        this.f114774OooO = f114772OooOooO;
        this.f114783OooOO0 = f114767OooOoO;
        this.f114784OooOO0O = 5;
        this.f114785OooOO0o = 5;
        this.f114787OooOOO0 = C18163eb.f54662y;
        this.f114786OooOOO = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f114788OooOOOO = true;
        this.f114789OooOOOo = C33079OooOooO.f119610OooO0o0;
        this.f114791OooOOo0 = true;
        this.f114790OooOOo = true;
        this.f114792OooOOoo = true;
        this.f114795OooOo00 = true;
        this.f114794OooOo0 = true;
        this.f114796OooOo0O = true;
        this.f114779OooO0o = (String) Preconditions.checkNotNull(str, "target");
        this.f114797OooOo0o = (OooO0O0) Preconditions.checkNotNull(c32907OooO0Oo, "clientTransportFactoryBuilder");
        this.f114793OooOo = oooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    @Override // oO0OOo0o.AbstractC33081Oooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC33093Oooo0oo OooO00o() {
        InterfaceC33062OooO0oO interfaceC33062OooO0oO;
        C32906OooO0o0.C20274OooO0o0 c20274OooO0o0OooO00o = this.f114797OooOo0o.OooO00o();
        Oooo0.OooO00o oooO00o = new Oooo0.OooO00o();
        C32046o0000o0o c32046o0000o0o = new C32046o0000o0o(C31989OoooO0O.f114228OooOOOo);
        C31989OoooO0O.C31990OooO0Oo c31990OooO0Oo = C31989OoooO0O.f114229OooOOo;
        ArrayList arrayList = new ArrayList(this.f114777OooO0OO);
        synchronized (C33074OooOoO.class) {
        }
        InterfaceC33062OooO0oO interfaceC33062OooO0oO2 = null;
        if (this.f114790OooOOo) {
            Method method = f114773OooOooo;
            if (method != null) {
                try {
                    interfaceC33062OooO0oO = (InterfaceC33062OooO0oO) method.invoke(null, Boolean.valueOf(this.f114792OooOOoo), Boolean.valueOf(this.f114795OooOo00), Boolean.FALSE, Boolean.valueOf(this.f114794OooOo0));
                } catch (IllegalAccessException e) {
                    f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    interfaceC33062OooO0oO = null;
                } catch (InvocationTargetException e2) {
                    f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                    interfaceC33062OooO0oO = null;
                }
                if (interfaceC33062OooO0oO != null) {
                    arrayList.add(0, interfaceC33062OooO0oO);
                }
            } else {
                interfaceC33062OooO0oO = null;
                if (interfaceC33062OooO0oO != null) {
                }
            }
        }
        if (this.f114796OooOo0O) {
            try {
                interfaceC33062OooO0oO2 = (InterfaceC33062OooO0oO) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException e3) {
                f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            } catch (IllegalAccessException e4) {
                f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            } catch (NoSuchMethodException e5) {
                f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (InvocationTargetException e6) {
                f114768OooOoO0.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            }
            if (interfaceC33062OooO0oO2 != null) {
                arrayList.add(0, interfaceC33062OooO0oO2);
            }
        }
        return new o0O0O00(new o00Ooo(this, c20274OooO0o0OooO00o, oooO00o, c32046o0000o0o, c31990OooO0Oo, arrayList));
    }
}

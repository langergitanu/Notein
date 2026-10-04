package io.ktor.client.engine.cio;

import OooOoo0.C20694Ooooo00;
import OooOooo.C20790Oooo0oO;
import OoooOOo.C21201OooOOOO;
import OooooOO.C21355Ooooooo;
import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.Oooo0;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C24033OooOooo;
import oO000oO.C32105OooO0OO;
import oO000oO.C32106OooO0Oo;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO00O0o0.C32190OooOOo0;
import oO00O0oO.OooO0OO;
import oO00O0oo.C32222OooOO0o;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Ooo0O.C33418OoooO;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o00000OO;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0oOo.InterfaceC33899OooO0o;
import oO0oOOO0.C34108OooO00o;
import oO0oOOO0.C34109OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00Oo0.C34515OooOo0;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23938OooOOo0 implements InterfaceC33636Oooo00o, Closeable {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80429Oooo00O = AtomicIntegerFieldUpdater.newUpdater(C23938OooOOo0.class, "connections");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f80430OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f80431OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C23932OooO0o0 f80432OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f80433OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C23934OooO0oo f80434OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO0OO f80435OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f80436OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33695OooO0o0 f80437OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final long f80438OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final o00000OO f80439Oooo000;
    private volatile /* synthetic */ int connections;
    volatile /* synthetic */ long lastActivity;

    public C23938OooOOo0(String host, int i, boolean z, C23932OooO0o0 config, C23934OooO0oo connectionFactory, InterfaceC34415OooO0oo coroutineContext, OooO0OO oooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(host, "host");
        kotlin.jvm.internal.OooOOO0.OooO0oO(config, "config");
        kotlin.jvm.internal.OooOOO0.OooO0oO(connectionFactory, "connectionFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f80431OooOo0o = host;
        this.f80430OooOo = i;
        this.f80433OooOoO0 = z;
        this.f80432OooOoO = config;
        this.f80434OooOoOO = connectionFactory;
        this.f80436OooOoo0 = coroutineContext;
        this.f80435OooOoo = oooO0OO;
        TimeZone timeZone = C34108OooO00o.f122561OooO00o;
        this.lastActivity = System.currentTimeMillis();
        this.connections = 0;
        this.f80437OooOooO = C33703OooOOO0.OooO00o(0, 7, null);
        config.f80384OooO00o.getClass();
        this.f80438OooOooo = ((long) 2) * 5000;
        this.f80439Oooo000 = C33609OooO0oo.OooO0OO(this, coroutineContext.plus(new C33635Oooo00O("Endpoint timeout(" + host + ':' + i + ')')), null, new C23936OooOOOo(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e A[Catch: all -> 0x018d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x018d, blocks: (B:63:0x0178, B:65:0x017c, B:49:0x011e), top: B:112:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #7 {all -> 0x018d, blocks: (B:63:0x0178, B:65:0x017c, B:49:0x011e), top: B:112:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0221  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0171 -> B:30:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(C32134OooO0o0 c32134OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO oooO;
        C23938OooOOo0 c23938OooOOo0;
        long j;
        C24033OooOooo c24033OooOooo;
        long j2;
        int i;
        int i2;
        C32134OooO0o0 c32134OooO0o02;
        long j3;
        C23938OooOOo0 c23938OooOOo02;
        C32222OooOO0o address;
        InterfaceC32225OooOOo0 interfaceC32225OooOOo0;
        oO00O0oo.OooOO0O oooOO0O;
        InterfaceC32225OooOOo0 interfaceC32225OooOOo02;
        OooO oooO2;
        C23938OooOOo0 c23938OooOOo03;
        C23938OooOOo0 c23938OooOOo04;
        InterfaceC32225OooOOo0 interfaceC32225OooOOo03;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i3 = oooO.f80351Oooo00o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO.f80351Oooo00o = i3 - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objInvoke = oooO.f80349Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooO.f80351Oooo00o;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80429Oooo00O;
        try {
            if (i4 == 0) {
                j = LocationRequestCompat.PASSIVE_INTERVAL;
                C32446OooOOOo.OooO0O0(objInvoke);
                C23932OooO0o0 c23932OooO0o0 = this.f80432OooOoO;
                c23932OooO0o0.f80384OooO00o.getClass();
                OooO.OooO00o oooO00o = c23932OooO0o0.f80384OooO00o;
                oooO00o.getClass();
                oooO00o.getClass();
                C32443OooOOO c32443OooOOO = new C32443OooOOO(5000L, Long.valueOf(LocationRequestCompat.PASSIVE_INTERVAL));
                C33419OoooO0.OooO0O0 oooO0O0 = C33419OoooO0.f120809OooO0Oo;
                C33419OoooO0.OooO00o oooO00o2 = (C33419OoooO0.OooO00o) c32134OooO0o0.OooO00o();
                if (oooO00o2 != null) {
                    Long l = oooO00o2.f120816OooO0OO;
                    long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
                    Long l2 = oooO00o2.f120815OooO0O0;
                    c32443OooOOO = new C32443OooOOO(Long.valueOf(l2 != null ? l2.longValue() : 5000L), Long.valueOf(jLongValue));
                }
                long jLongValue2 = ((Number) c32443OooOOO.f116638OooOo0o).longValue();
                long jLongValue3 = ((Number) c32443OooOOO.f116637OooOo).longValue();
                C24033OooOooo c24033OooOooo2 = new C24033OooOooo();
                atomicIntegerFieldUpdater.incrementAndGet(this);
                c24033OooOooo = c24033OooOooo2;
                j2 = jLongValue3;
                i = 0;
                i2 = 1;
                c32134OooO0o02 = c32134OooO0o0;
                j3 = jLongValue2;
                c23938OooOOo02 = this;
                if (i < i2) {
                }
            } else if (i4 == 1) {
                address = (C32222OooOO0o) oooO.f80343OooOoO0;
                c23938OooOOo0 = oooO.f80341OooOo0o;
                C32446OooOOOo.OooO0O0(objInvoke);
                interfaceC32225OooOOo0 = (InterfaceC32225OooOOo0) objInvoke;
                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32225OooOOo0, "<this>");
                io.ktor.utils.p616io.OooO00o oooO00o3 = new io.ktor.utils.p616io.OooO00o(false);
                interfaceC32225OooOOo0.OooOOoo(oooO00o3);
                io.ktor.utils.p616io.OooO00o oooO00o4 = new io.ktor.utils.p616io.OooO00o(false);
                interfaceC32225OooOOo0.OooO00o(oooO00o4);
                oooOO0O = new oO00O0oo.OooOO0O(interfaceC32225OooOOo0, oooO00o3, oooO00o4);
                if (!c23938OooOOo0.f80433OooOoO0) {
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC32225OooOOo03 = (InterfaceC32225OooOOo0) oooO.f80343OooOoO0;
                        address = (C32222OooOO0o) oooO.f80340OooOo;
                        c23938OooOOo03 = oooO.f80341OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(objInvoke);
                            InterfaceC32225OooOOo0 interfaceC32225OooOOo04 = (InterfaceC32225OooOOo0) objInvoke;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32225OooOOo04, "<this>");
                            io.ktor.utils.p616io.OooO00o oooO00o5 = new io.ktor.utils.p616io.OooO00o(false);
                            interfaceC32225OooOOo04.OooOOoo(oooO00o5);
                            io.ktor.utils.p616io.OooO00o oooO00o6 = new io.ktor.utils.p616io.OooO00o(false);
                            interfaceC32225OooOOo04.OooO00o(oooO00o6);
                            return new oO00O0oo.OooOO0O(interfaceC32225OooOOo04, oooO00o5, oooO00o6);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                interfaceC32225OooOOo03.close();
                            } catch (Throwable unused) {
                            }
                            try {
                                C23934OooO0oo c23934OooO0oo = c23938OooOOo03.f80434OooOoOO;
                                c23934OooO0oo.getClass();
                                kotlin.jvm.internal.OooOOO0.OooO0oO(address, "address");
                                InterfaceC33899OooO0o interfaceC33899OooO0o = c23934OooO0oo.f80390OooO0OO.f115797OooOo0o.get(address);
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC33899OooO0o);
                                interfaceC33899OooO0o.release();
                                c23934OooO0oo.f80389OooO0O0.release();
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                c23938OooOOo0 = c23938OooOOo03;
                                atomicIntegerFieldUpdater.decrementAndGet(c23938OooOOo0);
                                throw th;
                            }
                        }
                    }
                    oO00O0oo.OooOO0O oooOO0O2 = oooO.f80344OooOoOO;
                    interfaceC32225OooOOo02 = (InterfaceC32225OooOOo0) oooO.f80342OooOoO;
                    C32222OooOO0o c32222OooOO0o = (C32222OooOO0o) oooO.f80343OooOoO0;
                    C23938OooOOo0 c23938OooOOo05 = oooO.f80341OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objInvoke);
                        oooO2 = oooO;
                        oooOO0O = oooOO0O2;
                        address = c32222OooOO0o;
                        c23938OooOOo03 = c23938OooOOo05;
                        try {
                            c23938OooOOo03.getClass();
                            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c23938OooOOo03.f80436OooOoo0;
                            OooOO0O oooOO0O3 = new OooOO0O(c23938OooOOo03, address);
                            oooO2.f80341OooOo0o = c23938OooOOo03;
                            oooO2.f80340OooOo = address;
                            oooO2.f80343OooOoO0 = interfaceC32225OooOOo02;
                            oooO2.f80342OooOoO = null;
                            oooO2.f80344OooOoOO = null;
                            oooO2.f80351Oooo00o = 4;
                            objInvoke = C20790Oooo0oO.OooO0o(oooOO0O, interfaceC34415OooO0oo, oooOO0O3, oooO2);
                            if (objInvoke != enumC32485OooO00o) {
                                interfaceC32225OooOOo03 = interfaceC32225OooOOo02;
                                InterfaceC32225OooOOo0 interfaceC32225OooOOo042 = (InterfaceC32225OooOOo0) objInvoke;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32225OooOOo042, "<this>");
                                io.ktor.utils.p616io.OooO00o oooO00o52 = new io.ktor.utils.p616io.OooO00o(false);
                                interfaceC32225OooOOo042.OooOOoo(oooO00o52);
                                io.ktor.utils.p616io.OooO00o oooO00o62 = new io.ktor.utils.p616io.OooO00o(false);
                                interfaceC32225OooOOo042.OooO00o(oooO00o62);
                                return new oO00O0oo.OooOO0O(interfaceC32225OooOOo042, oooO00o52, oooO00o62);
                            }
                            return enumC32485OooO00o;
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC32225OooOOo03 = interfaceC32225OooOOo02;
                            interfaceC32225OooOOo03.close();
                            C23934OooO0oo c23934OooO0oo2 = c23938OooOOo03.f80434OooOoOO;
                            c23934OooO0oo2.getClass();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(address, "address");
                            InterfaceC33899OooO0o interfaceC33899OooO0o2 = c23934OooO0oo2.f80390OooO0OO.f115797OooOo0o.get(address);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC33899OooO0o2);
                            interfaceC33899OooO0o2.release();
                            c23934OooO0oo2.f80389OooO0O0.release();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC32225OooOOo03 = interfaceC32225OooOOo02;
                        address = c32222OooOO0o;
                        c23938OooOOo03 = c23938OooOOo05;
                        interfaceC32225OooOOo03.close();
                        C23934OooO0oo c23934OooO0oo22 = c23938OooOOo03.f80434OooOoOO;
                        c23934OooO0oo22.getClass();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(address, "address");
                        InterfaceC33899OooO0o interfaceC33899OooO0o22 = c23934OooO0oo22.f80390OooO0OO.f115797OooOo0o.get(address);
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC33899OooO0o22);
                        interfaceC33899OooO0o22.release();
                        c23934OooO0oo22.f80389OooO0O0.release();
                        throw th;
                    }
                }
                i = oooO.f80345OooOoo;
                long j4 = oooO.f80348OooOooo;
                j = LocationRequestCompat.PASSIVE_INTERVAL;
                j3 = oooO.f80347OooOooO;
                i2 = oooO.f80346OooOoo0;
                C32222OooOO0o c32222OooOO0o2 = (C32222OooOO0o) oooO.f80342OooOoO;
                c24033OooOooo = (C24033OooOooo) oooO.f80343OooOoO0;
                C32134OooO0o0 c32134OooO0o03 = (C32134OooO0o0) oooO.f80340OooOo;
                c23938OooOOo0 = oooO.f80341OooOo0o;
                C32446OooOOOo.OooO0O0(objInvoke);
                long j5 = j3;
                C32222OooOO0o c32222OooOO0o3 = c32222OooOO0o2;
                c23938OooOOo02 = c23938OooOOo0;
                C24033OooOooo c24033OooOooo3 = c24033OooOooo;
                int i5 = i2;
                j2 = j4;
                try {
                    interfaceC32225OooOOo0 = (InterfaceC32225OooOOo0) objInvoke;
                    if (interfaceC32225OooOOo0 != null) {
                        c24033OooOooo3.f80940OooOo0o++;
                        i++;
                        j3 = j5;
                        i2 = i5;
                        c24033OooOooo = c24033OooOooo3;
                        c32134OooO0o02 = c32134OooO0o03;
                        if (i < i2) {
                            C23938OooOOo0 c23938OooOOo06 = c23938OooOOo02;
                            atomicIntegerFieldUpdater.decrementAndGet(c23938OooOOo06);
                            int i6 = c24033OooOooo.f80940OooOo0o;
                            c23938OooOOo06.getClass();
                            if (i6 == i2) {
                                throw C33418OoooO.OooO00o(c32134OooO0o02, null);
                            }
                            throw new C23939OooOOoo("Connect timed out or retry attempts exceeded");
                        }
                        try {
                            C32222OooOO0o c32222OooOO0o4 = new C32222OooOO0o(c23938OooOOo02.f80431OooOo0o, c23938OooOOo02.f80430OooOo);
                            OooOO0 oooOO02 = new OooOO0(c23938OooOOo04, c32222OooOO0o4, j2, null);
                            c23938OooOOo0 = c23938OooOOo04;
                            c32222OooOO0o2 = c32222OooOO0o4;
                            j4 = j2;
                            if (j3 == j) {
                                oooO.f80341OooOo0o = c23938OooOOo0;
                                oooO.f80340OooOo = c32134OooO0o02;
                                oooO.f80343OooOoO0 = c32222OooOO0o2;
                                oooO.f80342OooOoO = null;
                                oooO.f80351Oooo00o = 1;
                                objInvoke = oooOO02.invoke(c23938OooOOo0, oooO);
                                if (objInvoke != enumC32485OooO00o) {
                                    address = c32222OooOO0o2;
                                    interfaceC32225OooOOo0 = (InterfaceC32225OooOOo0) objInvoke;
                                    kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32225OooOOo0, "<this>");
                                    io.ktor.utils.p616io.OooO00o oooO00o32 = new io.ktor.utils.p616io.OooO00o(false);
                                    interfaceC32225OooOOo0.OooOOoo(oooO00o32);
                                    io.ktor.utils.p616io.OooO00o oooO00o42 = new io.ktor.utils.p616io.OooO00o(false);
                                    interfaceC32225OooOOo0.OooO00o(oooO00o42);
                                    oooOO0O = new oO00O0oo.OooOO0O(interfaceC32225OooOOo0, oooO00o32, oooO00o42);
                                    if (!c23938OooOOo0.f80433OooOoO0) {
                                        return oooOO0O;
                                    }
                                    interfaceC32225OooOOo02 = interfaceC32225OooOOo0;
                                    oooO2 = oooO;
                                    c23938OooOOo03 = c23938OooOOo0;
                                    c23938OooOOo03.getClass();
                                    InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = c23938OooOOo03.f80436OooOoo0;
                                    OooOO0O oooOO0O32 = new OooOO0O(c23938OooOOo03, address);
                                    oooO2.f80341OooOo0o = c23938OooOOo03;
                                    oooO2.f80340OooOo = address;
                                    oooO2.f80343OooOoO0 = interfaceC32225OooOOo02;
                                    oooO2.f80342OooOoO = null;
                                    oooO2.f80344OooOoOO = null;
                                    oooO2.f80351Oooo00o = 4;
                                    objInvoke = C20790Oooo0oO.OooO0o(oooOO0O, interfaceC34415OooO0oo2, oooOO0O32, oooO2);
                                    if (objInvoke != enumC32485OooO00o) {
                                    }
                                }
                            } else {
                                oooO.f80341OooOo0o = c23938OooOOo0;
                                oooO.f80340OooOo = c32134OooO0o02;
                                oooO.f80343OooOoO0 = c24033OooOooo;
                                oooO.f80342OooOoO = c32222OooOO0o2;
                                oooO.f80346OooOoo0 = i2;
                                oooO.f80347OooOooO = j3;
                                oooO.f80348OooOooo = j4;
                                oooO.f80345OooOoo = i;
                                oooO.f80351Oooo00o = 2;
                                Object objOooOO0O = C21355Ooooooo.OooOO0O(j3, oooOO02, oooO);
                                if (objOooOO0O != enumC32485OooO00o) {
                                    c32134OooO0o03 = c32134OooO0o02;
                                    objInvoke = objOooOO0O;
                                    long j52 = j3;
                                    C32222OooOO0o c32222OooOO0o32 = c32222OooOO0o2;
                                    c23938OooOOo02 = c23938OooOOo0;
                                    C24033OooOooo c24033OooOooo32 = c24033OooOooo;
                                    int i52 = i2;
                                    j2 = j4;
                                    interfaceC32225OooOOo0 = (InterfaceC32225OooOOo0) objInvoke;
                                    if (interfaceC32225OooOOo0 != null) {
                                        c23938OooOOo0 = c23938OooOOo02;
                                        address = c32222OooOO0o32;
                                        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32225OooOOo0, "<this>");
                                        io.ktor.utils.p616io.OooO00o oooO00o322 = new io.ktor.utils.p616io.OooO00o(false);
                                        interfaceC32225OooOOo0.OooOOoo(oooO00o322);
                                        io.ktor.utils.p616io.OooO00o oooO00o422 = new io.ktor.utils.p616io.OooO00o(false);
                                        interfaceC32225OooOOo0.OooO00o(oooO00o422);
                                        oooOO0O = new oO00O0oo.OooOO0O(interfaceC32225OooOOo0, oooO00o322, oooO00o422);
                                        if (!c23938OooOOo0.f80433OooOoO0) {
                                        }
                                    }
                                }
                            }
                            return enumC32485OooO00o;
                        } catch (Throwable th5) {
                            th = th5;
                            c23938OooOOo0 = c23938OooOOo04;
                            atomicIntegerFieldUpdater.decrementAndGet(c23938OooOOo0);
                            throw th;
                        }
                        c23938OooOOo04 = c23938OooOOo02;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c23938OooOOo0 = c23938OooOOo02;
                    atomicIntegerFieldUpdater.decrementAndGet(c23938OooOOo0);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f80436OooOoo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(C32134OooO0o0 c32134OooO0o0, InterfaceC34415OooO0oo interfaceC34415OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C23935OooOO0o c23935OooOO0o;
        if (abstractC32479OooO0OO instanceof C23935OooOO0o) {
            c23935OooOO0o = (C23935OooOO0o) abstractC32479OooO0OO;
            int i = c23935OooOO0o.f80400OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23935OooOO0o.f80400OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c23935OooOO0o = new C23935OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c23935OooOO0o.f80399OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23935OooOO0o.f80400OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            TimeZone timeZone = C34108OooO00o.f122561OooO00o;
            this.lastActivity = System.currentTimeMillis();
            this.f80432OooOoO.getClass();
            c23935OooOO0o.f80400OooOoO0 = 1;
            Object objOooOOoo = OooOOoo(c32134OooO0o0, interfaceC34415OooO0oo, c23935OooOO0o);
            return objOooOOoo == obj2 ? obj2 : objOooOOoo;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        if (i2 == 2) {
            C32446OooOOOo.OooO0O0(obj);
            c23935OooOO0o.f80400OooOoO0 = 3;
            throw null;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(2:4|(1:6)(1:7))(0)|8|(7:(2:147|(1:(1:(6:14|15|16|145|105|106)(2:20|21))(20:22|163|23|24|25|141|93|94|161|95|152|96|97|98|99|100|148|101|(4:104|145|105|106)|103))(5:28|29|30|82|83))(4:31|159|32|33)|19|124|(2:(2:(1:127)(1:128)|(1:130)(1:165))|131)(1:132)|133|(1:135)(1:136)|(1:166)(2:139|140))(5:36|156|37|(1:40)|103)|154|41|42|43|(1:49)(1:48)|50|51|(1:55)(2:158|54)|56|(1:60)(6:61|62|143|63|64|65)|66|150|70|71|(1:76)|75|77|(4:79|(1:81)|82|83)(3:86|(1:88)(1:89)|(16:92|25|141|93|94|161|95|152|96|97|98|99|100|148|101|(0)))|103) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0215, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0217, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0226 A[LOOP:0: B:126:0x0226->B:130:0x0230, LOOP_START, PHI: r2
      0x0226: PHI (r2v7 java.lang.Throwable) = (r2v1 java.lang.Throwable), (r2v8 java.lang.Throwable) binds: [B:125:0x0224, B:130:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(C32134OooO0o0 c32134OooO0o0, InterfaceC34415OooO0oo interfaceC34415OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO0 oooOOO0;
        Throwable th;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo2;
        Object objOooO00o;
        C23938OooOOo0 c23938OooOOo0;
        C32134OooO0o0 request;
        Throwable cause;
        Throwable th2;
        Throwable thOooO0O0;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o;
        Oooo0 oooo0;
        C34109OooO0O0 c34109OooO0O0;
        C32134OooO0o0 c32134OooO0o02;
        long j;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo4;
        int i;
        C32134OooO0o0 c32134OooO0o03 = c32134OooO0o0;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i2 = oooOOO0.f80412OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOO0.f80412OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOOO0.f80411OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooOOO0.f80412OooOooO;
        if (i3 != 0) {
            if (i3 != 1) {
                try {
                    if (i3 == 2) {
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        return (C32135OooO0oO) objOooO0o;
                    }
                    if (i3 == 3) {
                        c34109OooO0O0 = oooOOO0.f80409OooOoOO;
                        oooo0 = oooOOO0.f80407OooOoO;
                        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2 = (InterfaceC23986Ooooo0o) oooOOO0.f80408OooOoO0;
                        InterfaceC34415OooO0oo interfaceC34415OooO0oo5 = (InterfaceC34415OooO0oo) oooOOO0.f80405OooOo;
                        C32134OooO0o0 c32134OooO0o04 = (C32134OooO0o0) oooOOO0.f80406OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(objOooO0o);
                            interfaceC23986Ooooo0o = interfaceC23986Ooooo0o2;
                            interfaceC34415OooO0oo3 = interfaceC34415OooO0oo5;
                            request = c32134OooO0o04;
                            C34109OooO0O0 c34109OooO0O02 = c34109OooO0O0;
                            Oooo0 oooo02 = oooo0;
                            try {
                                oooOOO0.f80406OooOo0o = request;
                                th = null;
                                try {
                                    oooOOO0.f80405OooOo = null;
                                    oooOOO0.f80408OooOoO0 = null;
                                    try {
                                        oooOOO0.f80407OooOoO = null;
                                        oooOOO0.f80409OooOoOO = null;
                                        oooOOO0.f80412OooOooO = 4;
                                        c32134OooO0o02 = request;
                                        try {
                                            objOooO0o = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo3, new OooOo00(interfaceC23986Ooooo0o, oooo02, interfaceC34415OooO0oo3, c34109OooO0O02, c32134OooO0o02, null), oooOOO0);
                                            if (objOooO0o != enumC32485OooO00o) {
                                                c32134OooO0o03 = c32134OooO0o02;
                                                return (C32135OooO0oO) objOooO0o;
                                            }
                                            return enumC32485OooO00o;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            request = c32134OooO0o02;
                                            kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
                                            cause = th.getCause();
                                            if (cause == null) {
                                            }
                                            if (!(th2 instanceof SocketTimeoutException)) {
                                            }
                                            if (thOooO0O0 != null) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c32134OooO0o02 = request;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = null;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            request = c32134OooO0o04;
                            th = null;
                        }
                    } else {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c32134OooO0o03 = (C32134OooO0o0) oooOOO0.f80406OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        th = null;
                        try {
                            return (C32135OooO0oO) objOooO0o;
                        } catch (Throwable th8) {
                            th = th8;
                            request = c32134OooO0o03;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
                            cause = th.getCause();
                            if (cause == null) {
                            }
                            if (!(th2 instanceof SocketTimeoutException)) {
                            }
                            if (thOooO0O0 != null) {
                            }
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    request = c32134OooO0o03;
                }
            } else {
                InterfaceC34415OooO0oo interfaceC34415OooO0oo6 = (InterfaceC34415OooO0oo) oooOOO0.f80408OooOoO0;
                C32134OooO0o0 c32134OooO0o05 = (C32134OooO0o0) oooOOO0.f80405OooOo;
                c23938OooOOo0 = (C23938OooOOo0) oooOOO0.f80406OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    request = c32134OooO0o05;
                    objOooO00o = objOooO0o;
                    interfaceC34415OooO0oo2 = interfaceC34415OooO0oo6;
                } catch (Throwable th10) {
                    th = th10;
                    request = c32134OooO0o05;
                }
            }
            th = null;
            kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
            cause = th.getCause();
            if (cause == null) {
                while (true) {
                    if ((cause != null ? cause.getCause() : th) == null) {
                        break;
                    }
                    cause = cause.getCause();
                }
                th2 = cause;
            } else {
                th2 = th;
            }
            thOooO0O0 = !(th2 instanceof SocketTimeoutException) ? C33418OoooO.OooO0O0(request, th.getCause()) : th.getCause();
            if (thOooO0O0 != null) {
                throw th;
            }
            throw thOooO0O0;
        }
        C32446OooOOOo.OooO0O0(objOooO0o);
        try {
            oooOOO0.f80406OooOo0o = this;
            oooOOO0.f80405OooOo = c32134OooO0o03;
            interfaceC34415OooO0oo2 = interfaceC34415OooO0oo;
            oooOOO0.f80408OooOoO0 = interfaceC34415OooO0oo2;
            oooOOO0.f80412OooOooO = 1;
            objOooO00o = OooO00o(c32134OooO0o03, oooOOO0);
            if (objOooO00o != enumC32485OooO00o) {
                c23938OooOOo0 = this;
                request = c32134OooO0o03;
            }
            return enumC32485OooO00o;
        } catch (Throwable th11) {
            th = th11;
            th = null;
            request = c32134OooO0o03;
            kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
            cause = th.getCause();
            if (cause == null) {
            }
            if (!(th2 instanceof SocketTimeoutException)) {
            }
            if (thOooO0O0 != null) {
            }
        }
        oO00O0oo.OooOO0O oooOO0O = (oO00O0oo.OooOO0O) objOooO00o;
        io.ktor.utils.p616io.OooO00o oooO00o = oooOO0O.f115661OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c23938OooOOo0, "<this>");
        C23932OooO0o0 engineConfig = c23938OooOOo0.f80432OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
        boolean z = C34515OooOo0.f123700OooO00o;
        Oooo0 oooo03 = new Oooo0(new C20694Ooooo00(request, 1));
        C32105OooO0OO c32105OooO0OO = new C32105OooO0OO(oooO00o, oooo03, null);
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        C24005o00o0O.OooO0O0(c23938OooOOo0, oooO, oooo03, c32105OooO0OO);
        io.ktor.utils.p616io.OooO00o oooO00o2 = oooOO0O.f115662OooO0OO;
        oooo0 = new Oooo0(new C20694Ooooo00(request, 1));
        C24005o00o0O.OooO0O0(c23938OooOOo0, oooO, oooo0, new C32106OooO0Oo(oooO00o2, oooo0, null));
        engineConfig.f80384OooO00o.getClass();
        InterfaceC23990Oooooo interfaceC23990OoooooOooO00o = C23945OooOoOO.OooO00o(oooo0, interfaceC34415OooO0oo2);
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0oo2.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        ((InterfaceC33672o00ooo) oooO0O0).invokeOnCompletion(new OooOOO(oooo03, oooo0, oooOO0O, c23938OooOOo0));
        kotlin.jvm.internal.OooOOO0.OooO0oO(engineConfig, "engineConfig");
        oO00O0o0.Oooo0 oooo04 = request.f115215OooO00o.f115594OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo04, "<this>");
        String str = oooo04.f115583OooO00o;
        boolean z2 = kotlin.jvm.internal.OooOOO0.OooO0O0(str, "ws") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "wss");
        C33419OoooO0.OooO0O0 oooO0O02 = C33419OoooO0.f120809OooO0Oo;
        if (request.OooO00o() != null || z2) {
            j = Long.MAX_VALUE;
        } else {
            try {
                j = engineConfig.f80387OooO0Oo;
            } catch (Throwable th12) {
                th = th12;
                th = null;
                kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
                cause = th.getCause();
                if (cause == null) {
                }
                if (!(th2 instanceof SocketTimeoutException)) {
                }
                if (thOooO0O0 != null) {
                }
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL || j == 0) {
            interfaceC34415OooO0oo4 = interfaceC34415OooO0oo2;
            i = 1;
        } else {
            interfaceC34415OooO0oo4 = interfaceC34415OooO0oo2;
            C32134OooO0o0 c32134OooO0o06 = request;
            try {
                request = c32134OooO0o06;
                i = 1;
                oO00o00.OooO0OO.OooO0Oo(interfaceC34415OooO0oo4).invokeOnCompletion(new C21201OooOOOO(C33609OooO0oo.OooO0OO(C33662Ooooooo.f121350OooOo0o, null, null, new C23937OooOOo(j, interfaceC34415OooO0oo4, c32134OooO0o06, null), 3), i));
            } catch (Throwable th13) {
                th = th13;
                request = c32134OooO0o06;
                th = null;
                kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
                cause = th.getCause();
                if (cause == null) {
                }
                if (!(th2 instanceof SocketTimeoutException)) {
                }
                if (thOooO0O0 != null) {
                }
            }
        }
        th = null;
        C34109OooO0O0 c34109OooO0O0OooO00o = C34108OooO00o.OooO00o(null);
        oO00O0o0.OooOOO0 oooOOO02 = request.f115217OooO0OO;
        List<String> list = C32190OooOOo0.f115537OooO00o;
        String str2 = oooOOO02.get(HttpHeaders.EXPECT);
        oO00O0oO.OooO0OO oooO0OO = request.f115218OooO0Oo;
        if (str2 == null || (oooO0OO instanceof OooO0OO.OooO0O0)) {
            i = 0;
        }
        InterfaceC34415OooO0oo interfaceC34415OooO0oo7 = interfaceC34415OooO0oo4;
        if (i != 0) {
            oooOOO0.f80406OooOo0o = request;
            oooOOO0.f80405OooOo = null;
            oooOOO0.f80408OooOoO0 = null;
            oooOOO0.f80412OooOooO = 2;
            objOooO0o = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo7, new OooOOOO(request, interfaceC23990OoooooOooO00o, false, c34109OooO0O0OooO00o, oooo03, oooo0, interfaceC34415OooO0oo7, null), oooOOO0);
            if (objOooO0o == enumC32485OooO00o) {
            }
            return (C32135OooO0oO) objOooO0o;
        }
        c34109OooO0O0 = c34109OooO0O0OooO00o;
        oooOOO0.f80406OooOo0o = request;
        oooOOO0.f80405OooOo = interfaceC34415OooO0oo7;
        oooOOO0.f80408OooOoO0 = oooo03;
        oooOOO0.f80407OooOoO = oooo0;
        oooOOO0.f80409OooOoOO = c34109OooO0O0;
        oooOOO0.f80412OooOooO = 3;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo7, new C23943OooOoO(request, interfaceC23990OoooooOooO00o, false, true, interfaceC34415OooO0oo7, null), oooOOO0);
        if (objOooO0o2 != enumC32485OooO00o) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o2 != enumC32485OooO00o) {
            interfaceC34415OooO0oo3 = interfaceC34415OooO0oo7;
            interfaceC23986Ooooo0o = oooo03;
            C34109OooO0O0 c34109OooO0O022 = c34109OooO0O0;
            Oooo0 oooo022 = oooo0;
            oooOOO0.f80406OooOo0o = request;
            th = null;
            oooOOO0.f80405OooOo = null;
            oooOOO0.f80408OooOoO0 = null;
            oooOOO0.f80407OooOoO = null;
            oooOOO0.f80409OooOoOO = null;
            oooOOO0.f80412OooOooO = 4;
            c32134OooO0o02 = request;
            objOooO0o = C33609OooO0oo.OooO0o(interfaceC34415OooO0oo3, new OooOo00(interfaceC23986Ooooo0o, oooo022, interfaceC34415OooO0oo3, c34109OooO0O022, c32134OooO0o02, null), oooOOO0);
            if (objOooO0o != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f80439Oooo000.cancel((CancellationException) null);
    }
}

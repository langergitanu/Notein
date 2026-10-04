package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO00OoOo.C32290OooO00o;
import oO00Ooo.AbstractC32301OooOO0o;
import oO00Ooo.AbstractC32307OooOo0O;
import oO00Ooo.C32295OooO0Oo;
import oO00Ooo.C32297OooO0o0;
import oO00Ooo.C32300OooOO0;
import oO00Ooo.C32303OooOOo;
import oO00Ooo.OooOOO0;
import oO00Ooo.OooOOOO;
import oO00Ooo.OooOo;
import oO00Ooo0.C32309OooO00o;
import oO00OooO.AbstractC32312OooO0OO;
import oO0OOoOo.AbstractC33128OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public class OpenCensusUtils {
    private static final AtomicLong idGenerator;
    private static volatile boolean isRecordEvent;
    static volatile AbstractC33128OooO00o propagationTextFormat;
    static volatile AbstractC33128OooO00o.AbstractC20300OooO00o propagationTextFormatSetter;
    private static final AbstractC32307OooOo0O tracer;
    private static final Logger logger = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";

    static {
        OooOo.f116220OooO0O0.getClass();
        tracer = AbstractC32307OooOo0O.f116224OooO00o;
        idGenerator = new AtomicLong();
        isRecordEvent = true;
        propagationTextFormat = null;
        propagationTextFormatSetter = null;
        try {
            propagationTextFormat = new C32290OooO00o();
            propagationTextFormatSetter = new AbstractC33128OooO00o.AbstractC20300OooO00o<HttpHeaders>() { // from class: com.google.api.client.http.OpenCensusUtils.1
                @Override // oO0OOoOo.AbstractC33128OooO00o.AbstractC20300OooO00o
                public void put(HttpHeaders httpHeaders, String str, String str2) {
                    httpHeaders.set(str, (Object) str2);
                }
            };
        } catch (Exception e) {
            logger.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e);
        }
        try {
            AbstractC32312OooO0OO.OooO00o oooO00o = OooOo.f116220OooO0O0.OooO00o().f116229OooO00o;
            ImmutableList immutableListM75107of = ImmutableList.m75107of(SPAN_NAME_HTTP_REQUEST_EXECUTE);
            oooO00o.getClass();
            C32309OooO00o.OooO00o(immutableListM75107of, "spanNames");
            synchronized (oooO00o.f116230OooO00o) {
                oooO00o.f116230OooO00o.addAll(immutableListM75107of);
            }
        } catch (Exception e2) {
            logger.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e2);
        }
    }

    private OpenCensusUtils() {
    }

    public static AbstractC32301OooOO0o getEndSpanOptions(Integer num) {
        C32303OooOOo c32303OooOOo;
        int i = AbstractC32301OooOO0o.f116194OooO00o;
        if (num == null) {
            c32303OooOOo = C32303OooOOo.f116210OooO0Oo;
        } else if (HttpStatusCodes.isSuccess(num.intValue())) {
            c32303OooOOo = C32303OooOOo.f116209OooO0OO;
        } else {
            int iIntValue = num.intValue();
            c32303OooOOo = iIntValue != 400 ? iIntValue != 401 ? iIntValue != 403 ? iIntValue != 404 ? iIntValue != 412 ? iIntValue != 500 ? C32303OooOOo.f116210OooO0Oo : C32303OooOOo.f116215OooOO0 : C32303OooOOo.f116207OooO : C32303OooOOo.f116211OooO0o : C32303OooOOo.f116213OooO0oO : C32303OooOOo.f116214OooO0oo : C32303OooOOo.f116212OooO0o0;
        }
        return new C32295OooO0Oo(false, c32303OooOOo);
    }

    public static AbstractC32307OooOo0O getTracer() {
        return tracer;
    }

    public static boolean isRecordEvent() {
        return isRecordEvent;
    }

    public static void propagateTracingContext(OooOOOO oooOOOO, HttpHeaders httpHeaders) {
        Preconditions.checkArgument(oooOOOO != null, "span should not be null.");
        Preconditions.checkArgument(httpHeaders != null, "headers should not be null.");
        if (propagationTextFormat == null || propagationTextFormatSetter == null || oooOOOO.equals(C32300OooOO0.f116193OooO0o0)) {
            return;
        }
        propagationTextFormat.OooO00o(oooOOOO.f116203OooO00o, httpHeaders, propagationTextFormatSetter);
    }

    public static void recordMessageEvent(OooOOOO oooOOOO, long j, OooOOO0.OooO0O0 oooO0O0) {
        Preconditions.checkArgument(oooOOOO != null, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        C32297OooO0o0.OooO00o OooO00o2 = OooOOO0.OooO00o(oooO0O0, idGenerator.getAndIncrement());
        OooO00o2.f116190OooO0OO = Long.valueOf(j);
        oooOOOO.OooO00o(OooO00o2.OooO00o());
    }

    public static void recordReceivedMessageEvent(OooOOOO oooOOOO, long j) {
        recordMessageEvent(oooOOOO, j, OooOOO0.OooO0O0.f116198OooOo);
    }

    public static void recordSentMessageEvent(OooOOOO oooOOOO, long j) {
        recordMessageEvent(oooOOOO, j, OooOOO0.OooO0O0.f116199OooOo0o);
    }

    public static void setIsRecordEvent(boolean z) {
        isRecordEvent = z;
    }

    public static void setPropagationTextFormat(AbstractC33128OooO00o abstractC33128OooO00o) {
        propagationTextFormat = abstractC33128OooO00o;
    }

    public static void setPropagationTextFormatSetter(AbstractC33128OooO00o.AbstractC20300OooO00o abstractC20300OooO00o) {
        propagationTextFormatSetter = abstractC20300OooO00o;
    }
}

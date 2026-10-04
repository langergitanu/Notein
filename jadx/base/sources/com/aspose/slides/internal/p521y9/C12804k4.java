package com.aspose.slides.internal.p521y9;

import com.aspose.slides.C22210OooOo0o;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5557uz;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.y9.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12804k4 extends C5543ix {

    /* JADX INFO: renamed from: x1 */
    private static final C11697x1 f42564x1 = new C11697x1("en-US");

    public C12804k4(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: x1 */
    private <T> T m59488x1(String str, T t, Class<T> cls) {
        try {
            return (T) C14080ne.m66938k4(str, AbstractC14068j5.m66733to(C7019kk.m27443k4((Class<?>) cls)), f42564x1);
        } catch (RuntimeException unused) {
            return t;
        }
    }

    /* JADX INFO: renamed from: bv */
    public final String m59489bv() {
        return m59490c5(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m59490c5(String str, String str2) {
        String strMo22741kk;
        InterfaceC12772kk interfaceC12772kkMo22861x1 = m22704h4().mo22861x1(str);
        return (interfaceC12772kkMo22861x1 == null || (strMo22741kk = interfaceC12772kkMo22861x1.mo22741kk()) == null) ? str2 : strMo22741kk;
    }

    /* JADX INFO: renamed from: ck */
    public final void m59491ck(String str) {
        mo22708k4(NoteMeta.PROPERTY_TITLE, str);
    }

    /* JADX INFO: renamed from: f9 */
    public final String m59492f9() {
        return m59490c5("style", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: fa */
    public final void m59493fa(String str) {
        mo22708k4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, str);
    }

    /* JADX INFO: renamed from: gi */
    public final String m59494gi() {
        return m59490c5("dir", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: jd */
    public final void m59495jd(String str) {
        mo22708k4("id", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5558v4 m59496k4(IGenericEnumerable<String> iGenericEnumerable) {
        return C5557uz.m22838k4(this, iGenericEnumerable);
    }

    /* JADX INFO: renamed from: qq */
    public final String m59501qq() {
        return m59490c5(NoteMeta.PROPERTY_TITLE, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: s7 */
    public final String m59502s7() {
        return m59490c5("class", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m59503u4(String str) {
        mo22708k4("style", str);
    }

    /* JADX INFO: renamed from: up */
    public final void m59504up(String str) {
        mo22708k4("dir", str);
    }

    /* JADX INFO: renamed from: uz */
    public final AbstractC5558v4 m59505uz(String str) {
        return C5557uz.m22839k4(this, str);
    }

    /* JADX INFO: renamed from: wl */
    public final String m59506wl() {
        return m59490c5("id", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: yj */
    public final void m59508yj(String str) {
        mo22708k4("class", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final <T> T m59497k4(String str, T t, Class<T> cls) {
        String strMo22721to = mo22721to(str);
        return strMo22721to != null ? (T) m59488x1(strMo22721to, t, cls) : t;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59507x1(String str, boolean z) {
        mo22708k4(str, z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
    }

    /* JADX INFO: renamed from: k4 */
    public final <T> T m59498k4(String str, T t, Class<T> cls, String str2) {
        String strMo22721to = mo22721to(str);
        if (strMo22721to != null) {
            C12385to c12385toOooO00o = C22210OooOo0o.OooO00o(str2, strMo22721to);
            if (c12385toOooO00o.mo58006to()) {
                return (T) m59488x1(c12385toOooO00o.mo57995kk(), t, cls);
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59499k4(String str, float f) {
        mo22708k4(str, C14064he.m66704h4(f));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59500k4(String str, int i) {
        mo22708k4(str, C14057f9.m66591x1(i));
    }
}

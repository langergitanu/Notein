package com.aspose.slides.internal.p253lm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14076m2;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6191v4 extends C6198wp {

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17506to;

    public C6191v4(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17506to = interfaceC6173qw;
    }

    /* JADX INFO: renamed from: bv */
    public static AbstractC6123ca m25075bv(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no tiem specified");
        }
        abstractC6211yd.mo24771k4(Double.valueOf(abstractC6123caArr[0].mo24775x1()));
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: bz */
    public static AbstractC6123ca m25076bz(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no month specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67136k4(-c14084qqClone.m67129dy()).CloneTo(c14084qqClone);
        c14084qqClone.m67136k4(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14)).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25077c6(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: c6 */
    public static AbstractC6123ca m25077c6(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no date specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67135k4(-c14084qqClone.m67153x1()).CloneTo(c14084qqClone);
        c14084qqClone.m67135k4(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: e0 */
    public static AbstractC6123ca m25078e0(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no month specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67136k4(-c14084qqClone.m67129dy()).CloneTo(c14084qqClone);
        c14084qqClone.m67136k4(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14)).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25077c6(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: g8 */
    public static AbstractC6123ca m25079g8(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no year specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67156x1(-(c14084qqClone.m67158yj() - C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14))).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25078e0(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: qm */
    public static AbstractC6123ca m25082qm(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no year specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67156x1(-(c14084qqClone.m67158yj() - C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14))).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25078e0(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: ts */
    public static AbstractC6123ca m25083ts(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no date specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67135k4(-c14084qqClone.m67153x1()).CloneTo(c14084qqClone);
        c14084qqClone.m67135k4(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: ak */
    public final AbstractC6123ca m25084ak(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no minute specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67148to(-c14084qqClone.m67144m9()).CloneTo(c14084qqClone);
        c14084qqClone.m67148to(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25120yd(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: ar */
    public final AbstractC6123ca m25085ar(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67131h4());
    }

    /* JADX INFO: renamed from: b3 */
    public final AbstractC6123ca m25086b3(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no second specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67128du(-c14084qqClone.m67126ck()).CloneTo(c14084qqClone);
        c14084qqClone.m67128du(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25113v4(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC6123ca m25087c5(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67158yj());
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC6123ca m25088ck(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67129dy() - 1);
    }

    /* JADX INFO: renamed from: dq */
    public final AbstractC6123ca m25089dq(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no hour specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67155x1(-c14084qqClone.m67147to()).CloneTo(c14084qqClone);
        c14084qqClone.m67155x1(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25115wy(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m25090du(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67140k4("ddd, dd MMM yyyy"));
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC6123ca m25091dy(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(abstractC6211yd.mo24775x1());
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC6123ca m25092fa(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67129dy() - 1);
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6123ca m25093h4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67140k4("HH':'mm':'ss 'GMT'zzz"));
    }

    /* JADX INFO: renamed from: ix */
    public final AbstractC6123ca m25094ix(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67144m9());
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC6123ca m25095jd(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67158yj());
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM25106sv;
        if ("UTC".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25108to(abstractC6123caArr);
        } else if ("parse".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25097k4(abstractC6123caArr);
        } else if ("parseLocale".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25117x1(abstractC6123caArr);
        } else if ("toString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25096k4(abstractC6211yd, abstractC6123caArr);
        } else if ("toDateString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25116x1(abstractC6211yd, abstractC6123caArr);
        } else if ("toTimeString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25098kk(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25107to(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleDateString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25090du(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleTimeString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25093h4(abstractC6211yd, abstractC6123caArr);
        } else if ("valueOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25102m9(abstractC6211yd, abstractC6123caArr);
        } else if ("getTime".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25091dy(abstractC6211yd, abstractC6123caArr);
        } else if ("getFullYear".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25087c5(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCFullYear".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25095jd(abstractC6211yd, abstractC6123caArr);
        } else if ("getMonth".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25088ck(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCMonth".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25092fa(abstractC6211yd, abstractC6123caArr);
        } else if ("getDate".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25111up(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCDate".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25121yj(abstractC6211yd, abstractC6123caArr);
        } else if ("getDay".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25100ks(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCDay".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25105rv(abstractC6211yd, abstractC6123caArr);
        } else if ("getHours".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25118x6(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCHours".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25103ne(abstractC6211yd, abstractC6123caArr);
        } else if ("getMinutes".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25094ix(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCMinutes".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25109u4(abstractC6211yd, abstractC6123caArr);
        } else if ("getSeconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25112uz(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCSeconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25114wl(abstractC6211yd, abstractC6123caArr);
        } else if ("getMilliseconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25104qq(abstractC6211yd, abstractC6123caArr);
        } else if ("getUTCMilliseconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25085ar(abstractC6211yd, abstractC6123caArr);
        } else if ("getTimezoneOffset".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25110um(abstractC6211yd, abstractC6123caArr);
        } else if ("setTime".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25075bv(abstractC6211yd, abstractC6123caArr);
        } else if ("setMilliseconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25113v4(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCMilliseconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25101lr(abstractC6211yd, abstractC6123caArr);
        } else if ("setSeconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25120yd(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCSeconds".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25086b3(abstractC6211yd, abstractC6123caArr);
        } else if ("setMinutes".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25115wy(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCMinutes".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25084ak(abstractC6211yd, abstractC6123caArr);
        } else if ("setHours".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25089dq(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCHours".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25119xk(abstractC6211yd, abstractC6123caArr);
        } else if ("setDate".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25077c6(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCDate".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25083ts(abstractC6211yd, abstractC6123caArr);
        } else if ("setMonth".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25078e0(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCMonth".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25076bz(abstractC6211yd, abstractC6123caArr);
        } else if ("setFullYear".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25082qm(abstractC6211yd, abstractC6123caArr);
        } else if ("setUTCFullYear".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM25106sv = m25079g8(abstractC6211yd, abstractC6123caArr);
        } else {
            if (!"toUTCString".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown date function");
            }
            abstractC6123caM25106sv = m25106sv(abstractC6211yd, abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM25106sv);
        return abstractC6123caM25106sv;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m25098kk(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().mo66517k4("HH':'mm':'ss 'GMT'zzz", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ks */
    public final AbstractC6123ca m25100ks(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67141kk());
    }

    /* JADX INFO: renamed from: lr */
    public final AbstractC6123ca m25101lr(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no millisecond specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67142kk(-c14084qqClone.m67131h4()).CloneTo(c14084qqClone);
        c14084qqClone.m67142kk(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(Double.valueOf(this.f17506to.mo24975rv().m24780k4(c14084qqClone.Clone()).mo24775x1()));
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC6123ca m25102m9(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(abstractC6211yd.mo24775x1());
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC6123ca m25103ne(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67147to());
    }

    /* JADX INFO: renamed from: qq */
    public final AbstractC6123ca m25104qq(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67131h4());
    }

    /* JADX INFO: renamed from: rv */
    public final AbstractC6123ca m25105rv(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67141kk());
    }

    /* JADX INFO: renamed from: sv */
    public final AbstractC6123ca m25106sv(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).mo66517k4("ddd, dd MMM yyyy HH':'mm':'ss 'UTC'", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m25107to(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().mo66517k4("F", C11697x1.m55252to()));
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: u4 */
    public final AbstractC6123ca m25109u4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67144m9());
    }

    /* JADX INFO: renamed from: um */
    public final AbstractC6123ca m25110um(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17506to.mo24977um().m25186k4(-C14076m2.m66792k4(TimeZone.getDefault(), new C14084qq()).m66814dy());
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC6123ca m25111up(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67153x1());
    }

    /* JADX INFO: renamed from: uz */
    public final AbstractC6123ca m25112uz(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67126ck());
    }

    /* JADX INFO: renamed from: v4 */
    public final AbstractC6123ca m25113v4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no millisecond specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67142kk(-c14084qqClone.m67131h4()).CloneTo(c14084qqClone);
        c14084qqClone.m67142kk(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(Double.valueOf(this.f17506to.mo24975rv().m24780k4(c14084qqClone.Clone()).mo24775x1()));
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: wl */
    public final AbstractC6123ca m25114wl(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67126ck());
    }

    /* JADX INFO: renamed from: wy */
    public final AbstractC6123ca m25115wy(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no minute specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67148to(-c14084qqClone.m67144m9()).CloneTo(c14084qqClone);
        c14084qqClone.m67148to(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25120yd(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m25116x1(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().mo66517k4("ddd, dd MMM yyyy", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: x6 */
    public final AbstractC6123ca m25118x6(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().m67147to());
    }

    /* JADX INFO: renamed from: xk */
    public final AbstractC6123ca m25119xk(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no hour specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).Clone();
        c14084qqClone.m67155x1(-c14084qqClone.m67147to()).CloneTo(c14084qqClone);
        c14084qqClone.m67155x1(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25115wy(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: yd */
    public final AbstractC6123ca m25120yd(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            throw new ArgumentException("There was no second specified");
        }
        C14084qq c14084qqClone = m25080k4(abstractC6211yd.mo24775x1()).m67145ne().Clone();
        c14084qqClone.m67128du(-c14084qqClone.m67126ck()).CloneTo(c14084qqClone);
        c14084qqClone.m67128du(abstractC6123caArr[0].mo24775x1()).CloneTo(c14084qqClone);
        abstractC6211yd.mo24771k4(c14084qqClone.Clone());
        if (abstractC6123caArr.length <= 1) {
            return abstractC6211yd;
        }
        int length = abstractC6123caArr.length - 1;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC6123caArr), 1, AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0, length);
        return (C6188um) m25113v4(abstractC6211yd, abstractC6123caArr2);
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC6123ca m25121yj(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24973lr() : this.f17506to.mo24977um().m25186k4(m25080k4(abstractC6211yd.mo24775x1()).m67151uz().m67153x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25096k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return C14044b3.m66437kk(abstractC6211yd.mo24775x1()) ? this.f17506to.mo24980v4().m25068h4(C14044b3.m66425h4(Double.NaN)) : this.f17506to.mo24980v4().m25068h4(m25080k4(abstractC6211yd.mo24775x1()).m67145ne().mo66517k4("ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: kk */
    public final C6188um m25099kk(AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 1) {
            if (("Number".equals(abstractC6123caArr[0].mo24774to()) || "Object".equals(abstractC6123caArr[0].mo24774to())) && C14044b3.m66437kk(abstractC6123caArr[0].mo24775x1())) {
                return this.f17506to.mo24975rv().m24779k4(Double.NaN);
            }
            if ("Number".equals(abstractC6123caArr[0].mo24774to())) {
                return this.f17506to.mo24975rv().m24779k4(abstractC6123caArr[0].mo24775x1());
            }
            double[] dArr = {0.0d};
            boolean zM25081k4 = m25081k4(abstractC6123caArr[0].toString(), C11697x1.m55250kk(), dArr);
            double d = dArr[0];
            if (zM25081k4) {
                return this.f17506to.mo24975rv().m24779k4(d);
            }
            dArr[0] = d;
            return m25081k4(abstractC6123caArr[0].toString(), C11697x1.m55252to(), dArr) ? this.f17506to.mo24975rv().m24779k4(dArr[0]) : this.f17506to.mo24975rv().m24779k4(0.0d);
        }
        if (abstractC6123caArr.length <= 1) {
            return this.f17506to.mo24975rv().m24780k4(C14084qq.m67074c5().Clone());
        }
        C14084qq c14084qq = new C14084qq(0L, 2L);
        if (abstractC6123caArr.length > 0) {
            int iM27462to = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14);
            int i = iM27462to - 1;
            if (i < 100) {
                i = iM27462to + 1899;
            }
            c14084qq.m67156x1(i).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 1) {
            c14084qq.m67136k4(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[1].mo24775x1()), 14)).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 2) {
            c14084qq.m67135k4(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[2].mo24775x1()), 14) - 1).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 3) {
            c14084qq.m67155x1(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[3].mo24775x1()), 14)).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 4) {
            c14084qq.m67148to(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[4].mo24775x1()), 14)).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 5) {
            c14084qq.m67128du(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[5].mo24775x1()), 14)).CloneTo(c14084qq);
        }
        if (abstractC6123caArr.length > 6) {
            c14084qq.m67142kk(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[6].mo24775x1()), 14)).CloneTo(c14084qq);
        }
        return this.f17506to.mo24975rv().m24780k4(c14084qq.Clone());
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m25108to(AbstractC6123ca[] abstractC6123caArr) {
        for (int i = 0; i < abstractC6123caArr.length; i++) {
            AbstractC6123ca abstractC6123ca = abstractC6123caArr[i];
            if (abstractC6123ca == C6163nh.f17403k4 || (("Number".equals(abstractC6123ca.mo24774to()) && C14044b3.m66437kk(abstractC6123caArr[i].mo24775x1())) || ("Number".equals(abstractC6123caArr[i].mo24774to()) && C14044b3.m66439x1(abstractC6123caArr[i].mo24775x1())))) {
                return this.f17506to.mo24973lr();
            }
        }
        return this.f17506to.mo24977um().m25186k4(C14076m2.m66792k4(TimeZone.getDefault(), new C14084qq()).m66822m9() + m25099kk(abstractC6123caArr).mo24775x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m25117x1(AbstractC6123ca[] abstractC6123caArr) {
        double[] dArr = {0.0d};
        return m25081k4(abstractC6123caArr[0].toString(), C11697x1.m55252to(), dArr) ? this.f17506to.mo24977um().m25186k4(dArr[0]) : this.f17506to.mo24973lr();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25097k4(AbstractC6123ca[] abstractC6123caArr) {
        double[] dArr = {0.0d};
        return m25081k4(abstractC6123caArr[0].toString(), C11697x1.m55250kk(), dArr) ? this.f17506to.mo24977um().m25186k4(dArr[0]) : this.f17506to.mo24973lr();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14084qq m25080k4(double d) {
        return new C14084qq(C7019kk.m27438h4(Double.valueOf((d * 10000.0d) + C6188um.f17501k4), 14), 1L);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m25081k4(String str, InterfaceC14073kp interfaceC14073kp, double[] dArr) {
        C14084qq c14084qq = new C14084qq(0L, 1L);
        dArr[0] = 0.0d;
        C14084qq[] c14084qqArr = {c14084qq};
        boolean zM67099k4 = C14084qq.m67099k4(str, interfaceC14073kp, 0, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        if (zM67099k4) {
            dArr[0] = this.f17506to.mo24975rv().m24780k4(c14084qq.Clone()).mo24775x1();
            return true;
        }
        c14084qqArr[0] = c14084qq;
        boolean zM67101k4 = C14084qq.m67101k4(str, "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", interfaceC14073kp, 0, c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        if (zM67101k4) {
            dArr[0] = this.f17506to.mo24975rv().m24780k4(c14084qq.Clone()).mo24775x1();
            return true;
        }
        C14084qq c14084qq2 = new C14084qq();
        C14084qq[] c14084qqArr2 = {c14084qq2};
        boolean zM67101k42 = C14084qq.m67101k4(str, "ddd, dd MMM yyyy", interfaceC14073kp, 0, c14084qqArr2);
        c14084qqArr2[0].CloneTo(c14084qq2);
        if (zM67101k42) {
            c14084qq.m67137k4(c14084qq2.m67130fa()).CloneTo(c14084qq);
        }
        c14084qqArr2[0] = c14084qq2;
        boolean zM67101k43 = C14084qq.m67101k4(str, "HH':'mm':'ss 'GMT'zzz", interfaceC14073kp, 0, c14084qqArr2);
        c14084qqArr2[0].CloneTo(c14084qq2);
        if (zM67101k43) {
            c14084qq.m67137k4(c14084qq2.m67130fa()).CloneTo(c14084qq);
        }
        if (c14084qq.m67130fa() > 0) {
            dArr[0] = this.f17506to.mo24975rv().m24780k4(c14084qq.Clone()).mo24775x1();
        }
        return true;
    }
}

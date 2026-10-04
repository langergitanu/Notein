package o0OOO0;

import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import com.orion.notein.domain.mapper.NoteinAiQuotaRecordMapper;
import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.C26334o000O0o0;
import o0OOO0O0.C27004OooOO0o;
import o0OOO0O0.C27005OooOOOo;
import o0OOO0O0.C27006OooOOo0;
import o0OOO0O0.OooOO0O;
import o0OOO0O0.OooOOO;
import o0OOO0O0.OooOOOO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27325OoooO00;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0 implements InterfaceC27325OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27004OooOO0o f93778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27006OooOOo0 f93779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NoteinAiQuotaRecordMapper f93780OooO0OO;

    public OooOO0(C27004OooOO0o c27004OooOO0o, C27006OooOOo0 c27006OooOOo0, NoteinAiQuotaRecordMapper mapper) {
        OooOOO0.OooO0oO(mapper, "mapper");
        this.f93778OooO00o = c27004OooOO0o;
        this.f93779OooO0O0 = c27006OooOOo0;
        this.f93780OooO0OO = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26986OooO0oO c26986OooO0oO;
        if (abstractC32479OooO0OO instanceof C26986OooO0oO) {
            c26986OooO0oO = (C26986OooO0oO) abstractC32479OooO0OO;
            int i = c26986OooO0oO.f93772OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26986OooO0oO.f93772OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26986OooO0oO = new C26986OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26986OooO0oO.f93771OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26986OooO0oO.f93772OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                C27006OooOOo0 c27006OooOOo0 = this.f93779OooO0O0;
                c26986OooO0oO.f93772OooOoO0 = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOO(list, c27006OooOOo0, str, null), c26986OooO0oO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0o);
            }
            return (C27174OooO0O0) objOooO0o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiOcrRepo");
            c20358OooO00o.OooO0OO("Unable to convert image to html, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return new C27174OooO0O0(false, null, "599999", e.getMessage(), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO oooO;
        OooOO0 oooOO02;
        C27174OooO0O0 c27174OooO0O0;
        NoteinAiQuotaRecordV2 noteinAiQuotaRecordV22 = noteinAiQuotaRecordV2;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i = oooO.f93743OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f93743OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooO.f93742OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO.f93743OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            try {
                C27006OooOOo0 c27006OooOOo0 = this.f93779OooO0O0;
                oooO.f93740OooOo0o = this;
                oooO.f93739OooOo = noteinAiQuotaRecordV22;
                oooO.f93743OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27005OooOOOo(c27006OooOOo0, noteinAiQuotaRecordV22, null), oooO);
                if (objOooO0o != enumC32485OooO00o) {
                    oooOO02 = this;
                }
            } catch (Exception e) {
                e = e;
                oooOO02 = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrRepo");
                c20358OooO00o.OooO0Oo(e, "reportUserAiQuotaRecord error", new Object[0]);
                c27174OooO0O0 = new C27174OooO0O0(false, null, "599999", e.getMessage(), 2);
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) oooO.f93740OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            return c27174OooO0O02;
        }
        noteinAiQuotaRecordV22 = oooO.f93739OooOo;
        oooOO02 = (OooOO0) oooO.f93740OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO0o);
        } catch (Exception e2) {
            e = e2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("AiOcrRepo");
            c20358OooO00o2.OooO0Oo(e, "reportUserAiQuotaRecord error", new Object[0]);
            c27174OooO0O0 = new C27174OooO0O0(false, null, "599999", e.getMessage(), 2);
        }
        c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
        String userId = noteinAiQuotaRecordV22.getUserId();
        oooO.f93740OooOo0o = c27174OooO0O0;
        oooO.f93739OooOo = null;
        oooO.f93743OooOoOO = 2;
        return oooOO02.OooO0OO(userId, oooO) == enumC32485OooO00o ? enumC32485OooO00o : c27174OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
    
        if (r14 != r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26987OooO0oo c26987OooO0oo;
        OooOO0 oooOO02;
        OooOO0 oooOO03;
        C27174OooO0O0 c27174OooO0O0;
        List list;
        String str2;
        OooOO0 oooOO04;
        if (abstractC32479OooO0OO instanceof C26987OooO0oo) {
            c26987OooO0oo = (C26987OooO0oo) abstractC32479OooO0OO;
            int i = c26987OooO0oo.f93777OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26987OooO0oo.f93777OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26987OooO0oo = new C26987OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26987OooO0oo.f93776OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26987OooO0oo.f93777OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            try {
                C27006OooOOo0 c27006OooOOo0 = this.f93779OooO0O0;
                c26987OooO0oo.f93774OooOo0o = this;
                c26987OooO0oo.f93773OooOo = str;
                c26987OooO0oo.f93777OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOOO(c27006OooOOo0, null), c26987OooO0oo);
            } catch (Exception e) {
                e = e;
                oooOO02 = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrRepo");
                c20358OooO00o.OooO0Oo(e, "fetchUserAiQuotaRecords error", new Object[0]);
            }
            if (objOooO0o != enumC32485OooO00o) {
                oooOO03 = this;
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AiOcrRepo");
                c20358OooO00o2.OooO00o("fetchUserAiOcrQuota: " + c27174OooO0O0, new Object[0]);
                list = (List) c27174OooO0O0.OooO0O0();
                if (!OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                }
                str2 = str;
                oooOO04 = oooOO03;
                C27004OooOO0o c27004OooOO0o = oooOO04.f93778OooO00o;
                c26987OooO0oo.f93774OooOo0o = oooOO04;
                c26987OooO0oo.f93773OooOo = null;
                c26987OooO0oo.f93777OooOoOO = 3;
                objOooO0o = c27004OooOO0o.f93961OooO00o.OooO0Oo(str2, c26987OooO0oo);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26987OooO0oo.f93773OooOo;
            oooOO03 = c26987OooO0oo.f93774OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("AiOcrRepo");
                c20358OooO00o22.OooO00o("fetchUserAiOcrQuota: " + c27174OooO0O0, new Object[0]);
                list = (List) c27174OooO0O0.OooO0O0();
            } catch (Exception e2) {
                e = e2;
                oooOO02 = oooOO03;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("AiOcrRepo");
                c20358OooO00o3.OooO0Oo(e, "fetchUserAiQuotaRecords error", new Object[0]);
            }
            if (!OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") && list != null) {
                Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(oooOO03.f93780OooO0OO.toEntity((NoteinAiQuotaRecordV2) it.next()));
                }
                C27004OooOO0o c27004OooOO0o2 = oooOO03.f93778OooO00o;
                c26987OooO0oo.f93774OooOo0o = oooOO03;
                c26987OooO0oo.f93773OooOo = str;
                c26987OooO0oo.f93777OooOoOO = 2;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOO0O(c27004OooOO0o2, str, arrayList, null), c26987OooO0oo);
                if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o2 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o2 != enumC32485OooO00o) {
                    oooOO02 = oooOO03;
                    str2 = str;
                    oooOO04 = oooOO02;
                    C27004OooOO0o c27004OooOO0o3 = oooOO04.f93778OooO00o;
                    c26987OooO0oo.f93774OooOo0o = oooOO04;
                    c26987OooO0oo.f93773OooOo = null;
                    c26987OooO0oo.f93777OooOoOO = 3;
                    objOooO0o = c27004OooOO0o3.f93961OooO00o.OooO0Oo(str2, c26987OooO0oo);
                }
                return enumC32485OooO00o;
            }
            str2 = str;
            oooOO04 = oooOO03;
            C27004OooOO0o c27004OooOO0o32 = oooOO04.f93778OooO00o;
            c26987OooO0oo.f93774OooOo0o = oooOO04;
            c26987OooO0oo.f93773OooOo = null;
            c26987OooO0oo.f93777OooOoOO = 3;
            objOooO0o = c27004OooOO0o32.f93961OooO00o.OooO0Oo(str2, c26987OooO0oo);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOO04 = c26987OooO0oo.f93774OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                Iterable iterable2 = (Iterable) objOooO0o;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(oooOO04.f93780OooO0OO.fromEntity((NoteinAiQuotaRecordEntityV2) it2.next()));
                }
                return arrayList2;
            }
            str = c26987OooO0oo.f93773OooOo;
            oooOO02 = c26987OooO0oo.f93774OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
            } catch (Exception e3) {
                e = e3;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("AiOcrRepo");
                c20358OooO00o32.OooO0Oo(e, "fetchUserAiQuotaRecords error", new Object[0]);
            }
            str2 = str;
            oooOO04 = oooOO02;
            C27004OooOO0o c27004OooOO0o322 = oooOO04.f93778OooO00o;
            c26987OooO0oo.f93774OooOo0o = oooOO04;
            c26987OooO0oo.f93773OooOo = null;
            c26987OooO0oo.f93777OooOoOO = 3;
            objOooO0o = c27004OooOO0o322.f93961OooO00o.OooO0Oo(str2, c26987OooO0oo);
        }
    }

    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    public final InterfaceC33721OooO0o OooO0Oo(String userId) {
        C27004OooOO0o c27004OooOO0o = this.f93778OooO00o;
        OooOOO0.OooO0oO(userId, "userId");
        return c27004OooOO0o.f93961OooO00o.OooO0OO(userId);
    }

    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    public final InterfaceC33721OooO0o OooO0o(String userId) {
        C27004OooOO0o c27004OooOO0o = this.f93778OooO00o;
        OooOOO0.OooO0oO(userId, "userId");
        return c27004OooOO0o.f93961OooO00o.OooO0O0(userId);
    }

    @Override // o0OOo0Oo.InterfaceC27325OoooO00
    public final C26334o000O0o0 OooO0o0(String str) {
        return new C26334o000O0o0(this.f93778OooO00o.f93961OooO00o.OooO00o(str), 1);
    }
}

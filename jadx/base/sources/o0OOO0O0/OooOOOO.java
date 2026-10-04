package o0OOO0O0;

import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0OOOOo.InterfaceC27159OooO00o;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.VertexAiRemoteGoogleDataSource$fetchUserOcrAiQuota$2", m80623f = "VertexAiRemoteGoogleDataSource.kt", m80624l = {126}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinAiQuotaRecordV2>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27006OooOOo0 f93968OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93969OooOo0o;

    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteinAiQuotaRecordV2) t).getCreatedAt()), Long.valueOf(((NoteinAiQuotaRecordV2) t2).getCreatedAt()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C27006OooOOo0 c27006OooOOo0, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f93968OooOo = c27006OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOOO(this.f93968OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinAiQuotaRecordV2>>> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String errorCode;
        String errorMsg;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93969OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27159OooO00o interfaceC27159OooO00o = this.f93968OooOo.f93973OooO00o;
                this.f93969OooOo0o = 1;
                obj = interfaceC27159OooO00o.OooO0O0(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            if (!c35238OooOoO.f126541OooO00o.OooO0OO()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrRemoteGoogleDataSource");
                c20358OooO00o.OooO0OO("Unable to fetch user ai quota, response: " + c35238OooOoO, new Object[0]);
                return new C27174OooO0O0(false, null, "100001", "Request error", 2);
            }
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            InterfaceC27159OooO00o.C19853OooO00o c19853OooO00o = c27174OooO0O0 != null ? (InterfaceC27159OooO00o.C19853OooO00o) c27174OooO0O0.OooO0O0() : null;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0 != null ? c27174OooO0O0.getErrorCode() : null, "0") && c19853OooO00o != null) {
                return new C27174OooO0O0(true, OooOo.o00O0O(c19853OooO00o.OooO00o(), new OooO00o()), "0", null, 8);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0OO(OooOOO0.OooO0O0(c20358OooO00o2, "AiOcrRemoteGoogleDataSource", "Unable to fetch user ai quota, error: ", c27174OooO0O0), new Object[0]);
            if (c27174OooO0O0 == null || (errorCode = c27174OooO0O0.getErrorCode()) == null) {
                errorCode = "100001";
            }
            if (c27174OooO0O0 == null || (errorMsg = c27174OooO0O0.getErrorMsg()) == null) {
                errorMsg = "Server error";
            }
            return new C27174OooO0O0(errorCode, errorMsg, null, false);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("AiOcrRemoteGoogleDataSource");
            c20358OooO00o3.OooO0OO("Unable to fetch user ai quota, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            String message = e.getMessage();
            if (message == null) {
                message = "Network error";
            }
            return new C27174OooO0O0(false, null, "199999", message, 2);
        }
    }
}

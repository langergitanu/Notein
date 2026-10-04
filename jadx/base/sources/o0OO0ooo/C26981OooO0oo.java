package o0OO0ooo;

import android.util.Log;
import com.orion.notein.data.service.dto.NoteinMessageDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OO0ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26981OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooOO0 f93734OooO00o;

    public C26981OooO0oo(o0OOOOO0.OooOO0 noteinMessageService) {
        OooOOO0.OooO0oO(noteinMessageService, "noteinMessageService");
        this.f93734OooO00o = noteinMessageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26978OooO0o c26978OooO0o;
        if (abstractC32479OooO0OO instanceof C26978OooO0o) {
            c26978OooO0o = (C26978OooO0o) abstractC32479OooO0OO;
            int i = c26978OooO0o.f93727OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26978OooO0o.f93727OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26978OooO0o = new C26978OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26978OooO0o.f93725OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26978OooO0o.f93727OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0OOOOO0.OooOO0 oooOO02 = this.f93734OooO00o;
                c26978OooO0o.f93726OooOo0o = str;
                c26978OooO0o.f93727OooOoO = 1;
                objOooO00o = oooOO02.OooO00o(c26978OooO0o);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c26978OooO0o.f93726OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            List list = (List) ((C35238OooOoO) objOooO00o).f126542OooO0O0;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                NoteinMessageDto noteinMessageDto = (NoteinMessageDto) obj;
                if (noteinMessageDto.getType() == 0 || OooOOO0.OooO0O0(noteinMessageDto.getUid(), str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("CouponRemoteDataSource", "Unable to fetchMessagesByUser: " + C32460OooOooO.f116667OooO00o);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26980OooO0oO c26980OooO0oO;
        if (abstractC32479OooO0OO instanceof C26980OooO0oO) {
            c26980OooO0oO = (C26980OooO0oO) abstractC32479OooO0OO;
            int i = c26980OooO0oO.f93733OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26980OooO0oO.f93733OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26980OooO0oO = new C26980OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26980OooO0oO.f93732OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26980OooO0oO.f93733OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                o0OOOOO0.OooOO0 oooOO02 = this.f93734OooO00o;
                c26980OooO0oO.f93733OooOoO0 = 1;
                objOooO0O0 = oooOO02.OooO0O0(c26980OooO0oO);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            List list = (List) ((C35238OooOoO) objOooO0O0).f126542OooO0O0;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((NoteinMessageDto) obj).getType() == 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("CouponRemoteDataSource", "Unable to fetchSysMessages: " + C32460OooOooO.f116667OooO00o);
            return null;
        }
    }
}

package o0OOO0;

import android.net.Uri;
import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import com.orion.notein.domain.mapper.AiOcrSessionMapper;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0OOO0O0.C27000OooO0Oo;
import o0OOO0O0.C27002OooO0oO;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import o0o0OO0.C30399OooOOo0;
import o0o0OO0.C30403OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26984OooO0Oo implements InterfaceC27288OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27002OooO0oO f93759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AiOcrSessionMapper f93760OooO0O0;

    public C26984OooO0Oo(C27002OooO0oO c27002OooO0oO, AiOcrSessionMapper sessionMapper) {
        OooOOO0.OooO0oO(sessionMapper, "sessionMapper");
        this.f93759OooO00o = c27002OooO0oO;
        this.f93760OooO0O0 = sessionMapper;
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final OooO00o OooO00o(String userId) {
        OooOOO0.OooO0oO(userId, "userId");
        return new OooO00o(this.f93759OooO00o.f93949OooO0O0.OooO00o(userId), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        C26984OooO0Oo c26984OooO0Oo;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f93757OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f93757OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = oooO0OO.f93755OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f93757OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            oooO0OO.f93756OooOo0o = this;
            oooO0OO.f93757OooOoO = 1;
            objOooO0o0 = this.f93759OooO00o.f93949OooO0O0.OooO0o0(str, oooO0OO);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26984OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26984OooO0Oo = oooO0OO.f93756OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        AiOcrSessionEntity aiOcrSessionEntity = (AiOcrSessionEntity) objOooO0o0;
        if (aiOcrSessionEntity != null) {
            return c26984OooO0Oo.f93760OooO0O0.fromEntity(aiOcrSessionEntity);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final Object OooO0OO(String str, Uri uri, C30403OooOo0O c30403OooOo0O) {
        return this.f93759OooO00o.OooO0o(str, uri, c30403OooOo0O);
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final Object OooO0Oo(String str, AiOcrSessionInputSource aiOcrSessionInputSource, AbstractC32476OooO abstractC32476OooO) {
        C27002OooO0oO c27002OooO0oO = this.f93759OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27000OooO0Oo(c27002OooO0oO, str, aiOcrSessionInputSource, null), abstractC32476OooO);
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final Object OooO0o(AiOcrSession aiOcrSession, AbstractC32476OooO abstractC32476OooO) {
        AiOcrSessionEntity entity = this.f93760OooO0O0.toEntity(aiOcrSession);
        OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO0o = this.f93759OooO00o.f93949OooO0O0.OooO0o(new AiOcrSessionEntity[]{entity}, abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final Object OooO0o0(String str, C30399OooOOo0 c30399OooOOo0) throws Throwable {
        C27002OooO0oO c27002OooO0oO = this.f93759OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOO0O0.OooO00o(c27002OooO0oO, str, null), c30399OooOOo0);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        C26984OooO0Oo c26984OooO0Oo;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f93753OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f93753OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooO0O0.f93751OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f93753OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooO0O0.f93752OooOo0o = this;
            oooO0O0.f93753OooOoO = 1;
            objOooO0O0 = this.f93759OooO00o.f93949OooO0O0.OooO0O0(str, oooO0O0);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26984OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26984OooO0Oo = oooO0O0.f93752OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26984OooO0Oo.f93760OooO0O0.fromEntity((AiOcrSessionEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27288OooO0OO
    public final Object OooO0oo(AiOcrSession aiOcrSession, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        AiOcrSessionEntity entity = this.f93760OooO0O0.toEntity(aiOcrSession);
        OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO0Oo = this.f93759OooO00o.f93949OooO0O0.OooO0Oo(entity, abstractC32479OooO0OO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0Oo != enumC32485OooO00o) {
            objOooO0Oo = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0Oo == enumC32485OooO00o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }
}

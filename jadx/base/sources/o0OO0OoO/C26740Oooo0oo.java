package o0OO0OoO;

import Oooo0.C20860Ooooooo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.RestrictedApi;
import com.huawei.cloud.base.http.HttpResponseException;
import com.microsoft.identity.client.exception.MsalUiRequiredException;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLException;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27624OooOOO0;
import o0OOooO0.EnumC27953o00000Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0OoO.C33799OooOO0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import okhttp3.ResponseBody;
import ooooOOo0.C35219OooOO0O;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OO0OoO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26740Oooo0oo implements InterfaceC27605OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f92492OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CloudMetaMapper f92493OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f92494OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC24338OooO0o0.OooO00o<String> f92495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26737Oooo0o f92496OooO0o0;

    public C26740Oooo0oo(ImmutableSet dataSources, o0000o0O.OooOO0 preferences, CloudMetaMapper cloudMetaMapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataSources, "dataSources");
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper, "cloudMetaMapper");
        this.f92492OooO00o = preferences;
        this.f92493OooO0O0 = cloudMetaMapper;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(dataSources, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo < 16 ? 16 : iOooO0Oo);
        for (Object obj : dataSources) {
            linkedHashMap.put(((OooO00o) obj).getType(), obj);
        }
        this.f92494OooO0OO = linkedHashMap;
        this.f92495OooO0Oo = C24340OooO0oo.OooO0o0("key_cloud_sync_flag");
        this.f92496OooO0o0 = new C26737Oooo0o(this.f92492OooO00o.getData(), this);
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final Object OooO(EnumC27285OooO enumC27285OooO, CloudAuthRequest cloudAuthRequest, C27624OooOOO0 c27624OooOOO0) {
        return Oooo(enumC27285OooO).OooOo(cloudAuthRequest, c27624OooOOO0);
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C33799OooOO0O OooO00o() {
        return C25252OooO0Oo.OooOoO(this.f92496OooO0o0, new C26726OooOoO0(null, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26714OooO0o0 c26714OooO0o0;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof C26714OooO0o0) {
            c26714OooO0o0 = (C26714OooO0o0) abstractC32479OooO0OO;
            int i = c26714OooO0o0.f92326OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26714OooO0o0.f92326OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26714OooO0o0 = new C26714OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26714OooO0o0.f92324OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26714OooO0o0.f92326OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            c26714OooO0o0.f92325OooOo0o = this;
            c26714OooO0o0.f92326OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(this.f92496OooO0o0, c26714OooO0o0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26740Oooo0oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo = c26714OooO0o0.f92325OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) objOooOOo;
        if (enumC27285OooO == EnumC27285OooO.f95076OooOo0o) {
            return null;
        }
        return c26740Oooo0oo.Oooo(enumC27285OooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo oooOo;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f92394OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f92394OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooOo.f92392OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f92394OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            oooOo.f92393OooOo0o = this;
            oooOo.f92394OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(this.f92496OooO0o0, oooOo);
            if (objOooOOo != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return ((C32445OooOOOO) objOooOOo).f116639OooOo0o;
        }
        c26740Oooo0oo = oooOo.f92393OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) objOooOOo;
        if (enumC27285OooO == EnumC27285OooO.f95076OooOo0o) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("No cloud sync type"));
        }
        OooO00o oooO00oOooo = c26740Oooo0oo.Oooo(enumC27285OooO);
        oooOo.f92393OooOo0o = null;
        oooOo.f92394OooOoO = 2;
        Object objOooOoO = oooO00oOooo.OooOoO(oooOo);
        return objOooOoO == enumC32485OooO00o ? enumC32485OooO00o : objOooOoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26727OooOoOO c26727OooOoOO;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooO0Oo;
        if (abstractC32479OooO0OO instanceof C26727OooOoOO) {
            c26727OooOoOO = (C26727OooOoOO) abstractC32479OooO0OO;
            int i = c26727OooOoOO.f92428OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26727OooOoOO.f92428OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26727OooOoOO = new C26727OooOoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26727OooOoOO.f92426OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26727OooOoOO.f92428OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26727OooOoOO.f92427OooOo0o = this;
            c26727OooOoOO.f92428OooOoO = 1;
            objOooO0O0 = OooO0O0(c26727OooOoOO);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26740Oooo0oo = c26727OooOoOO.f92427OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo = c26727OooOoOO.f92427OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooO0Oo = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
                return objOooO0Oo;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0Oo);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26727OooOoOO.f92427OooOo0o = null;
            c26727OooOoOO.f92428OooOoO = 3;
            objOooO0O0 = c26740Oooo0oo.OoooO00(thOooO00o, c26727OooOoOO);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("Cloud sync type not selected"));
        }
        c26727OooOoOO.f92427OooOo0o = c26740Oooo0oo;
        c26727OooOoOO.f92428OooOoO = 2;
        objOooO0Oo = oooO00o.OooO0Oo(c26727OooOoOO);
        if (objOooO0Oo != enumC32485OooO00o) {
            if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C25252OooO0Oo.OooOOo(this.f92496OooO0o0, abstractC32479OooO0OO);
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C33799OooOO0O OooO0o0() {
        return C25252OooO0Oo.OooOoO(this.f92496OooO0o0, new C26729OooOoo0(null, this));
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C33799OooOO0O OooO0oO() {
        return C25252OooO0Oo.OooOoO(this.f92496OooO0o0, new C26730OooOooO(null, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r7.OooOo0(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        C26740Oooo0oo c26740Oooo0oo;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f92315OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f92315OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooO0OO.f92313OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f92315OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            if (enumC27285OooO == null) {
                oooO0OO.f92314OooOo0o = this;
                oooO0OO.f92315OooOoO = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(this.f92496OooO0o0, oooO0OO);
                if (objOooOOo != enumC32485OooO00o) {
                    c26740Oooo0oo2 = this;
                }
                return enumC32485OooO00o;
            }
            c26740Oooo0oo = this;
            if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
                return C32460OooOooO.f116667OooO00o;
            }
            OooO00o oooO00oOooo = c26740Oooo0oo.Oooo(enumC27285OooO);
            oooO0OO.f92314OooOo0o = null;
            oooO0OO.f92315OooOoO = 2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
                return C32460OooOooO.f116667OooO00o;
            }
            c26740Oooo0oo2 = oooO0OO.f92314OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        EnumC27285OooO enumC27285OooO2 = (EnumC27285OooO) objOooOOo;
        c26740Oooo0oo = c26740Oooo0oo2;
        enumC27285OooO = enumC27285OooO2;
        if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26733Oooo00O c26733Oooo00O;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOoo0;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26733Oooo00O) {
            c26733Oooo00O = (C26733Oooo00O) abstractC32479OooO0OO;
            int i = c26733Oooo00O.f92462OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26733Oooo00O.f92462OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26733Oooo00O = new C26733Oooo00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26733Oooo00O.f92461OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26733Oooo00O.f92462OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26733Oooo00O.f92459OooOo0o = this;
            c26733Oooo00O.f92458OooOo = str;
            c26733Oooo00O.f92462OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26733Oooo00O);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26733Oooo00O.f92458OooOo;
            c26740Oooo0oo = c26733Oooo00O.f92459OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = c26733Oooo00O.f92459OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOoo0 = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooOoo0 instanceof C32445OooOOOO.OooO00o)) {
                objOooOoo0 = c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain((CloudMetaRemoteEntity) objOooOoo0);
            }
            if (objOooOoo0 instanceof C32445OooOOOO.OooO00o) {
                return objOooOoo0;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOoo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26733Oooo00O.f92459OooOo0o = null;
            c26733Oooo00O.f92462OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, c26733Oooo00O);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26733Oooo00O.f92459OooOo0o = c26740Oooo0oo;
        c26733Oooo00O.f92458OooOo = null;
        c26733Oooo00O.f92462OooOoOO = 2;
        objOooOoo0 = oooO00o.OooOoo0(str, c26733Oooo00O);
        if (objOooOoo0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooOoo0 instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooOoo0 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26724OooOo0o c26724OooOo0o;
        C26740Oooo0oo c26740Oooo0oo;
        OooO00o oooO00o;
        String str3;
        OooO00o oooO00o2;
        Object obj;
        C26740Oooo0oo c26740Oooo0oo2;
        CloudMetaLocalEntity cloudMetaLocalEntity;
        if (abstractC32479OooO0OO instanceof C26724OooOo0o) {
            c26724OooOo0o = (C26724OooOo0o) abstractC32479OooO0OO;
            int i = c26724OooOo0o.f92418OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26724OooOo0o.f92418OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26724OooOo0o = new C26724OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26724OooOo0o.f92415OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26724OooOo0o.f92418OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26724OooOo0o.f92414OooOo0o = this;
            c26724OooOo0o.f92413OooOo = str;
            c26724OooOo0o.f92416OooOoO0 = str2;
            c26724OooOo0o.f92418OooOoo0 = 1;
            objOooO0O0 = OooO0O0(c26724OooOo0o);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26740Oooo0oo2 = c26724OooOo0o.f92414OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                cloudMetaLocalEntity = (CloudMetaLocalEntity) objOooO0O0;
                if (cloudMetaLocalEntity != null) {
                    return null;
                }
                return c26740Oooo0oo2.f92493OooO0O0.toLocalDomain(cloudMetaLocalEntity);
            }
            oooO00o2 = (OooO00o) c26724OooOo0o.f92416OooOoO0;
            str3 = c26724OooOo0o.f92413OooOo;
            c26740Oooo0oo = c26724OooOo0o.f92414OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            obj = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (obj instanceof C32445OooOOOO.OooO00o) {
                obj = null;
            }
            String str4 = (String) obj;
            oooO00o = oooO00o2;
            str = str3;
            str2 = str4;
            if (str2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o.OooOO0O("getCloudMetaLocal: driveId is null", new Object[0]);
                return null;
            }
            c26724OooOo0o.f92414OooOo0o = c26740Oooo0oo;
            c26724OooOo0o.f92413OooOo = null;
            c26724OooOo0o.f92416OooOoO0 = null;
            c26724OooOo0o.f92418OooOoo0 = 3;
            objOooO0O0 = oooO00o.OooOoo(str, str2, c26724OooOo0o);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo2 = c26740Oooo0oo;
                cloudMetaLocalEntity = (CloudMetaLocalEntity) objOooO0O0;
                if (cloudMetaLocalEntity != null) {
                }
            }
            return enumC32485OooO00o;
        }
        str2 = (String) c26724OooOo0o.f92416OooOoO0;
        str = c26724OooOo0o.f92413OooOo;
        c26740Oooo0oo = c26724OooOo0o.f92414OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o2.OooOO0O("getCloudMetaLocal: cloud sync type not selected", new Object[0]);
            return null;
        }
        if (str2 == null) {
            c26724OooOo0o.f92414OooOo0o = c26740Oooo0oo;
            c26724OooOo0o.f92413OooOo = str;
            c26724OooOo0o.f92416OooOoO0 = oooO00o;
            c26724OooOo0o.f92418OooOoo0 = 2;
            Object objOooO0Oo = oooO00o.OooO0Oo(c26724OooOo0o);
            if (objOooO0Oo != enumC32485OooO00o) {
                str3 = str;
                oooO00o2 = oooO00o;
                obj = objOooO0Oo;
                if (obj instanceof C32445OooOOOO.OooO00o) {
                }
                String str42 = (String) obj;
                oooO00o = oooO00o2;
                str = str3;
                str2 = str42;
                if (str2 == null) {
                }
            }
        } else if (str2 == null) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26715OooO0oO c26715OooO0oO;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOo0O;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26715OooO0oO) {
            c26715OooO0oO = (C26715OooO0oO) abstractC32479OooO0OO;
            int i = c26715OooO0oO.f92332OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26715OooO0oO.f92332OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26715OooO0oO = new C26715OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26715OooO0oO.f92331OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26715OooO0oO.f92332OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26715OooO0oO.f92329OooOo0o = this;
            c26715OooO0oO.f92328OooOo = str;
            c26715OooO0oO.f92332OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26715OooO0oO);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26715OooO0oO.f92328OooOo;
            c26740Oooo0oo = c26715OooO0oO.f92329OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = c26715OooO0oO.f92329OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOo0O = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooOo0O instanceof C32445OooOOOO.OooO00o)) {
                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooOo0O;
                objOooOo0O = cloudMetaRemoteEntity != null ? c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain(cloudMetaRemoteEntity) : null;
            }
            if (objOooOo0O instanceof C32445OooOOOO.OooO00o) {
                return objOooOo0O;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0O);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26715OooO0oO.f92329OooOo0o = null;
            c26715OooO0oO.f92332OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, c26715OooO0oO);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26715OooO0oO.f92329OooOo0o = c26740Oooo0oo;
        c26715OooO0oO.f92328OooOo = null;
        c26715OooO0oO.f92332OooOoOO = 2;
        objOooOo0O = oooO00o.OooOo0O(str, c26715OooO0oO);
        if (objOooOo0O != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooOo0O instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooOo0O instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26725OooOoO c26725OooOoO;
        if (abstractC32479OooO0OO instanceof C26725OooOoO) {
            c26725OooOoO = (C26725OooOoO) abstractC32479OooO0OO;
            int i = c26725OooOoO.f92421OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26725OooOoO.f92421OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26725OooOoO = new C26725OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c26725OooOoO.f92420OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26725OooOoO.f92421OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            c26725OooOoO.f92421OooOoO0 = 1;
            objOooOO0O = OooOO0O(str, null, c26725OooOoO);
            if (objOooOO0O == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0O);
        }
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) objOooOO0O;
        if (cloudMetaLocal != null) {
            return cloudMetaLocal.getMimeType();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f92323OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f92323OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0o.f92322OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f92323OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (enumC27285OooO == EnumC27285OooO.f95076OooOo0o) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("CloudSyncRepo: cloud sync type not selected"));
        }
        OooO00o oooO00oOooo = Oooo(enumC27285OooO);
        oooO0o.f92323OooOoO0 = 1;
        Object objOooOooo = oooO00oOooo.OooOooo(oooO0o);
        return objOooOooo == enumC32485OooO00o ? enumC32485OooO00o : objOooOooo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7.OooOO0(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26739Oooo0oO c26739Oooo0oO;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof C26739Oooo0oO) {
            c26739Oooo0oO = (C26739Oooo0oO) abstractC32479OooO0OO;
            int i = c26739Oooo0oO.f92491OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26739Oooo0oO.f92491OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26739Oooo0oO = new C26739Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26739Oooo0oO.f92490OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26739Oooo0oO.f92491OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26739Oooo0oO.f92488OooOo0o = this;
            c26739Oooo0oO.f92487OooOo = cloudMetaLocal;
            c26739Oooo0oO.f92491OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26739Oooo0oO);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return C32460OooOooO.f116667OooO00o;
        }
        cloudMetaLocal = c26739Oooo0oO.f92487OooOo;
        c26740Oooo0oo = c26739Oooo0oO.f92488OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("updateCloudMetaLocal: cloud sync type not selected", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        CloudMetaLocalEntity localEntity = c26740Oooo0oo.f92493OooO0O0.toLocalEntity(cloudMetaLocal);
        c26739Oooo0oO.f92488OooOo0o = null;
        c26739Oooo0oO.f92487OooOo = null;
        c26739Oooo0oO.f92491OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    @RestrictedApi(explanation = "For debug use only")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOOo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26719OooOOo c26719OooOOo;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof C26719OooOOo) {
            c26719OooOOo = (C26719OooOOo) abstractC32479OooO0OO;
            int i = c26719OooOOo.f92378OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26719OooOOo.f92378OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26719OooOOo = new C26719OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26719OooOOo.f92376OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26719OooOOo.f92378OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            Object obj = this.f92494OooO0OO.get(EnumC27285OooO.f95076OooOo0o);
            C26732Oooo c26732Oooo = obj instanceof C26732Oooo ? (C26732Oooo) obj : null;
            if (c26732Oooo == null) {
                throw new IllegalStateException("DefaultCloudSyncDataSource not registered");
            }
            c26719OooOOo.f92377OooOo0o = this;
            c26719OooOOo.f92378OooOoO = 1;
            objOooO0o = c26732Oooo.f98681OooO0Oo.OooO0o(c26719OooOOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26740Oooo0oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo = c26719OooOOo.f92377OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        Iterable iterable = (Iterable) objOooO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26740Oooo0oo.f92493OooO0O0.toRemoteDomain((CloudMetaRemoteEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0O oooOO0O;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOooO;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i = oooOO0O.f92348OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f92348OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOO0O.f92345OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO0O.f92348OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooOO0O.f92344OooOo0o = this;
            oooOO0O.f92343OooOo = str;
            oooOO0O.f92346OooOoO0 = str2;
            oooOO0O.f92348OooOoo0 = 1;
            objOooO0O0 = OooO0O0(oooOO0O);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str2 = oooOO0O.f92346OooOoO0;
            str = oooOO0O.f92343OooOo;
            c26740Oooo0oo = oooOO0O.f92344OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = oooOO0O.f92344OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOooO = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (objOooOooO instanceof C32445OooOOOO.OooO00o) {
                return objOooOooO;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOooO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            oooOO0O.f92344OooOo0o = null;
            oooOO0O.f92348OooOoo0 = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, oooOO0O);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        oooOO0O.f92344OooOo0o = c26740Oooo0oo;
        oooOO0O.f92343OooOo = null;
        oooOO0O.f92346OooOoO0 = null;
        oooOO0O.f92348OooOoo0 = 2;
        objOooOooO = oooO00o.OooOooO(str, str2, null, oooOO0O);
        if (objOooOooO != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (objOooOooO instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[LOOP:0: B:29:0x0083->B:31:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        C26740Oooo0oo c26740Oooo0oo;
        C26740Oooo0oo c26740Oooo0oo2;
        Iterator it;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f92370OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f92370OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOOOO.f92369OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f92370OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooOOOO.f92367OooOo0o = this;
            oooOOOO.f92366OooOo = str;
            oooOOOO.f92370OooOoOO = 1;
            objOooO0O0 = OooO0O0(oooOOOO);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo2 = oooOOOO.f92367OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            Iterable iterable = (Iterable) objOooO0O0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(c26740Oooo0oo2.f92493OooO0O0.toLocalDomain((CloudMetaLocalEntity) it.next()));
            }
            return arrayList;
        }
        str = oooOOOO.f92366OooOo;
        c26740Oooo0oo = oooOOOO.f92367OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("getAllCloudMetaLocals: cloud sync type not selected", new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
        oooOOOO.f92367OooOo0o = c26740Oooo0oo;
        oooOOOO.f92366OooOo = null;
        oooOOOO.f92370OooOoOO = 2;
        objOooO0O0 = oooO00o.Oooo000(str, oooOOOO);
        if (objOooO0O0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            Iterable iterable2 = (Iterable) objOooO0O0;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final Object OooOOoo(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO00o oooO00o = (OooO00o) this.f92494OooO0OO.get(enumC27285OooO);
        return oooO00o == null ? Boolean.FALSE : C25252OooO0Oo.OooOOo(oooO00o.OooO0O0(), abstractC32479OooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26716OooO0oo c26716OooO0oo;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOOO;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26716OooO0oo) {
            c26716OooO0oo = (C26716OooO0oo) abstractC32479OooO0OO;
            int i = c26716OooO0oo.f92337OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26716OooO0oo.f92337OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26716OooO0oo = new C26716OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26716OooO0oo.f92336OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26716OooO0oo.f92337OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26716OooO0oo.f92334OooOo0o = this;
            c26716OooO0oo.f92333OooOo = str;
            c26716OooO0oo.f92337OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26716OooO0oo);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26716OooO0oo.f92333OooOo;
            c26740Oooo0oo = c26716OooO0oo.f92334OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = c26716OooO0oo.f92334OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOOO = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooOOO instanceof C32445OooOOOO.OooO00o)) {
                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooOOO;
                objOooOOO = cloudMetaRemoteEntity != null ? c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain(cloudMetaRemoteEntity) : null;
            }
            if (objOooOOO instanceof C32445OooOOOO.OooO00o) {
                return objOooOOO;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26716OooO0oo.f92334OooOo0o = null;
            c26716OooO0oo.f92337OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, c26716OooO0oo);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26716OooO0oo.f92334OooOo0o = c26740Oooo0oo;
        c26716OooO0oo.f92333OooOo = null;
        c26716OooO0oo.f92337OooOoOO = 2;
        objOooOOO = oooO00o.OooOOO(str, c26716OooO0oo);
        if (objOooOOO != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooOOO instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooOOO instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C33799OooOO0O OooOo0(String driveId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        return C25252OooO0Oo.OooOoO(this.f92496OooO0o0, new OooOo00(null, this, driveId));
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C26737Oooo0o OooOo00() {
        return this.f92496OooO0o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO oooO;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOO0o;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i = oooO.f92307OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f92307OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooO.f92306OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO.f92307OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooO.f92304OooOo0o = this;
            oooO.f92303OooOo = str;
            oooO.f92307OooOoOO = 1;
            objOooO0O0 = OooO0O0(oooO);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = oooO.f92303OooOo;
            c26740Oooo0oo = oooO.f92304OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = oooO.f92304OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOO0o = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (objOooOO0o instanceof C32445OooOOOO.OooO00o) {
                return objOooOO0o;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOO0o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            oooO.f92304OooOo0o = null;
            oooO.f92307OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, oooO);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        oooO.f92304OooOo0o = c26740Oooo0oo;
        oooO.f92303OooOo = null;
        oooO.f92307OooOoOO = 2;
        objOooOO0o = oooO00o.OooOO0o(str, oooO);
        if (objOooOO0o != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (objOooOO0o instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO0 oooOOO0;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f92364OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f92364OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0oo = oooOOO0.f92362OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f92364OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0oo);
            oooOOO0.f92363OooOo0o = str;
            oooOOO0.f92364OooOoO = 1;
            objOooo0oo = Oooo0oo(oooOOO0);
            if (objOooo0oo != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooo0oo);
            return objOooo0oo;
        }
        str = oooOOO0.f92363OooOo0o;
        C32446OooOOOo.OooO0O0(objOooo0oo);
        oooOOO0.f92363OooOo0o = null;
        oooOOO0.f92364OooOoO = 2;
        Object objOooO = ((OooO00o) objOooo0oo).OooO(str, oooOOO0);
        return objOooO == obj ? obj : objOooO;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final C33799OooOO0O OooOoO(String driveId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        return C25252OooO0Oo.OooOoO(this.f92496OooO0o0, new C26718OooOOOo(null, this, driveId));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    @RestrictedApi(explanation = "For debug use only")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOoO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f92360OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f92360OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOOO.f92358OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f92360OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            Object obj = this.f92494OooO0OO.get(EnumC27285OooO.f95076OooOo0o);
            C26732Oooo c26732Oooo = obj instanceof C26732Oooo ? (C26732Oooo) obj : null;
            if (c26732Oooo == null) {
                throw new IllegalStateException("DefaultCloudSyncDataSource not registered");
            }
            oooOOO.f92359OooOo0o = this;
            oooOOO.f92360OooOoO = 1;
            objOooO0o = c26732Oooo.f98680OooO0OO.OooO0o(oooOOO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26740Oooo0oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo = oooOOO.f92359OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        Iterable iterable = (Iterable) objOooO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26740Oooo0oo.f92493OooO0O0.toLocalDomain((CloudMetaLocalEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r6.OooOOOO() == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoOO(EnumC27953o00000Oo enumC27953o00000Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26738Oooo0o0 c26738Oooo0o0;
        if (abstractC32479OooO0OO instanceof C26738Oooo0o0) {
            c26738Oooo0o0 = (C26738Oooo0o0) abstractC32479OooO0OO;
            int i = c26738Oooo0o0.f92486OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26738Oooo0o0.f92486OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26738Oooo0o0 = new C26738Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26738Oooo0o0.f92485OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26738Oooo0o0.f92486OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26738Oooo0o0.f92486OooOoO0 = 1;
            objOooO0O0 = OooO0O0(c26738Oooo0o0);
            if (objOooO0O0 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("setNetworkStrategy: cloud sync type not selected", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        c26738Oooo0o0.f92486OooOoO0 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26728OooOoo c26728OooOoo;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOOo0;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26728OooOoo) {
            c26728OooOoo = (C26728OooOoo) abstractC32479OooO0OO;
            int i = c26728OooOoo.f92434OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26728OooOoo.f92434OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26728OooOoo = new C26728OooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26728OooOoo.f92433OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26728OooOoo.f92434OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26728OooOoo.f92431OooOo0o = this;
            c26728OooOoo.f92430OooOo = str;
            c26728OooOoo.f92434OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26728OooOoo);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c26728OooOoo.f92430OooOo;
            c26740Oooo0oo = c26728OooOoo.f92431OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = c26728OooOoo.f92431OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOOo0 = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (objOooOOo0 instanceof C32445OooOOOO.OooO00o) {
                return objOooOOo0;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26728OooOoo.f92431OooOo0o = null;
            c26728OooOoo.f92434OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, c26728OooOoo);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26728OooOoo.f92431OooOo0o = c26740Oooo0oo;
        c26728OooOoo.f92430OooOo = null;
        c26728OooOoo.f92434OooOoOO = 2;
        objOooOOo0 = oooO00o.OooOOo0(str, c26728OooOoo);
        if (objOooOOo0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (objOooOOo0 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r1 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoo0(String str, String str2, String str3, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26717OooOO0o c26717OooOO0o;
        String str4;
        String str5;
        long j2;
        String str6;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOOO0;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26717OooOO0o) {
            c26717OooOO0o = (C26717OooOO0o) abstractC32479OooO0OO;
            int i = c26717OooOO0o.f92357OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26717OooOO0o.f92357OooOooo = i - Integer.MIN_VALUE;
            } else {
                c26717OooOO0o = new C26717OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        C26717OooOO0o c26717OooOO0o2 = c26717OooOO0o;
        Object objOoooO00 = c26717OooOO0o2.f92354OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26717OooOO0o2.f92357OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOoooO00);
            c26717OooOO0o2.f92350OooOo0o = this;
            c26717OooOO0o2.f92349OooOo = str;
            c26717OooOO0o2.f92352OooOoO0 = str2;
            str4 = str3;
            c26717OooOO0o2.f92351OooOoO = str4;
            c26717OooOO0o2.f92353OooOoOO = interfaceC32507OooOO0o;
            c26717OooOO0o2.f92355OooOoo0 = j;
            c26717OooOO0o2.f92357OooOooo = 1;
            Object objOooO0O0 = OooO0O0(c26717OooOO0o2);
            if (objOooO0O0 != enumC32485OooO00o) {
                str5 = str;
                objOoooO00 = objOooO0O0;
                j2 = j;
                str6 = str2;
                interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            long j3 = c26717OooOO0o2.f92355OooOoo0;
            interfaceC32507OooOO0o2 = c26717OooOO0o2.f92353OooOoOO;
            String str7 = c26717OooOO0o2.f92351OooOoO;
            str6 = c26717OooOO0o2.f92352OooOoO0;
            str5 = c26717OooOO0o2.f92349OooOo;
            c26740Oooo0oo = c26717OooOO0o2.f92350OooOo0o;
            C32446OooOOOo.OooO0O0(objOoooO00);
            j2 = j3;
            str4 = str7;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOoooO00);
                return C32446OooOOOo.OooO00o((Throwable) objOoooO00);
            }
            c26740Oooo0oo2 = c26717OooOO0o2.f92350OooOo0o;
            C32446OooOOOo.OooO0O0(objOoooO00);
            objOooOOO0 = ((C32445OooOOOO) objOoooO00).f116639OooOo0o;
            if (objOooOOO0 instanceof C32445OooOOOO.OooO00o) {
                return objOooOOO0;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOO0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26717OooOO0o2.f92350OooOo0o = null;
            c26717OooOO0o2.f92357OooOooo = 3;
            objOoooO00 = c26740Oooo0oo2.OoooO00(thOooO00o, c26717OooOO0o2);
        }
        long j4 = j2;
        OooO00o oooO00o = (OooO00o) objOoooO00;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26717OooOO0o2.f92350OooOo0o = c26740Oooo0oo;
        c26717OooOO0o2.f92349OooOo = null;
        c26717OooOO0o2.f92352OooOoO0 = null;
        c26717OooOO0o2.f92351OooOoO = null;
        c26717OooOO0o2.f92353OooOoOO = null;
        c26717OooOO0o2.f92357OooOooo = 2;
        objOooOOO0 = oooO00o.OooOOO0(str5, str6, str4, j4, interfaceC32507OooOO0o2, c26717OooOO0o2);
        if (objOooOOO0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (objOooOOO0 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOooO(String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26734Oooo00o c26734Oooo00o;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOoOO;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof C26734Oooo00o) {
            c26734Oooo00o = (C26734Oooo00o) abstractC32479OooO0OO;
            int i = c26734Oooo00o.f92468OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26734Oooo00o.f92468OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26734Oooo00o = new C26734Oooo00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26734Oooo00o.f92467OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26734Oooo00o.f92468OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26734Oooo00o.f92464OooOo0o = this;
            c26734Oooo00o.f92463OooOo = str;
            c26734Oooo00o.f92466OooOoO0 = cloudBundle;
            c26734Oooo00o.f92465OooOoO = z;
            c26734Oooo00o.f92468OooOoo = 1;
            objOooO0O0 = OooO0O0(c26734Oooo00o);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            z = c26734Oooo00o.f92465OooOoO;
            cloudBundle = c26734Oooo00o.f92466OooOoO0;
            str = c26734Oooo00o.f92463OooOo;
            c26740Oooo0oo = c26734Oooo00o.f92464OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = c26734Oooo00o.f92464OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOoOO = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooOoOO instanceof C32445OooOOOO.OooO00o)) {
                objOooOoOO = c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain((CloudMetaRemoteEntity) objOooOoOO);
            }
            if (objOooOoOO instanceof C32445OooOOOO.OooO00o) {
                return objOooOoOO;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOoOO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26734Oooo00o.f92464OooOo0o = null;
            c26734Oooo00o.f92468OooOoo = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, c26734Oooo00o);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        c26734Oooo00o.f92464OooOo0o = c26740Oooo0oo;
        c26734Oooo00o.f92463OooOo = null;
        c26734Oooo00o.f92466OooOoO0 = null;
        c26734Oooo00o.f92468OooOoo = 2;
        objOooOoOO = oooO00o.OooOoOO(str, cloudBundle, z, c26734Oooo00o);
        if (objOooOoOO != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooOoOO instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooOoOO instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOooo(String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo0 oooo0;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooO0oo;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f92452OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f92452OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooo0.f92451OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f92452OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooo0.f92448OooOo0o = this;
            oooo0.f92447OooOo = str;
            oooo0.f92450OooOoO0 = cloudBundle;
            oooo0.f92449OooOoO = z;
            oooo0.f92452OooOoo = 1;
            objOooO0O0 = OooO0O0(oooo0);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            z = oooo0.f92449OooOoO;
            cloudBundle = oooo0.f92450OooOoO0;
            str = oooo0.f92447OooOo;
            c26740Oooo0oo = oooo0.f92448OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = oooo0.f92448OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooO0oo = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooO0oo instanceof C32445OooOOOO.OooO00o)) {
                objOooO0oo = c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain((CloudMetaRemoteEntity) objOooO0oo);
            }
            if (objOooO0oo instanceof C32445OooOOOO.OooO00o) {
                return objOooO0oo;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0oo);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            oooo0.f92448OooOo0o = null;
            oooo0.f92452OooOoo = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, oooo0);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        oooo0.f92448OooOo0o = c26740Oooo0oo;
        oooo0.f92447OooOo = null;
        oooo0.f92450OooOoO0 = null;
        oooo0.f92452OooOoo = 2;
        objOooO0oo = oooO00o.OooO0oo(str, cloudBundle, z, oooo0);
        if (objOooO0oo != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooO0oo instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooO0oo instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    public final OooO00o Oooo(EnumC27285OooO enumC27285OooO) {
        if (enumC27285OooO == EnumC27285OooO.f95076OooOo0o) {
            throw new IllegalArgumentException("CloudSyncRepo: cloud sync type not selected");
        }
        OooO00o oooO00o = (OooO00o) this.f92494OooO0OO.get(enumC27285OooO);
        if (oooO00o != null) {
            return oooO00o;
        }
        throw new IllegalStateException("CloudSyncRepo: no data source registered for " + enumC27285OooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26723OooOo0O c26723OooOo0O;
        C26740Oooo0oo c26740Oooo0oo;
        C26740Oooo0oo c26740Oooo0oo2;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        if (abstractC32479OooO0OO instanceof C26723OooOo0O) {
            c26723OooOo0O = (C26723OooOo0O) abstractC32479OooO0OO;
            int i = c26723OooOo0O.f92412OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26723OooOo0O.f92412OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26723OooOo0O = new C26723OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26723OooOo0O.f92411OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26723OooOo0O.f92412OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26723OooOo0O.f92409OooOo0o = this;
            c26723OooOo0O.f92408OooOo = str;
            c26723OooOo0O.f92412OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26723OooOo0O);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo2 = c26723OooOo0O.f92409OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO0O0;
            if (cloudMetaRemoteEntity != null) {
                return null;
            }
            return c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain(cloudMetaRemoteEntity);
        }
        str = c26723OooOo0O.f92408OooOo;
        c26740Oooo0oo = c26723OooOo0O.f92409OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("getCachedCloudMetaRemote: cloud sync type not selected", new Object[0]);
            return null;
        }
        c26723OooOo0O.f92409OooOo0o = c26740Oooo0oo;
        c26723OooOo0O.f92408OooOo = null;
        c26723OooOo0O.f92412OooOoOO = 2;
        objOooO0O0 = oooO00o.OooOOo(str, c26723OooOo0O);
        if (objOooO0O0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO0O0;
            if (cloudMetaRemoteEntity != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo000(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26713OooO0Oo c26713OooO0Oo;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOoO0;
        if (abstractC32479OooO0OO instanceof C26713OooO0Oo) {
            c26713OooO0Oo = (C26713OooO0Oo) abstractC32479OooO0OO;
            int i = c26713OooO0Oo.f92319OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26713OooO0Oo.f92319OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26713OooO0Oo = new C26713OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26713OooO0Oo.f92317OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26713OooO0Oo.f92319OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            c26713OooO0Oo.f92318OooOo0o = this;
            c26713OooO0Oo.f92319OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(this.f92496OooO0o0, c26713OooO0Oo);
            if (objOooOOo != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26740Oooo0oo = c26713OooO0Oo.f92318OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
                return C32446OooOOOo.OooO00o((Throwable) objOooOOo);
            }
            c26740Oooo0oo = c26713OooO0Oo.f92318OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            objOooOoO0 = ((C32445OooOOOO) objOooOOo).f116639OooOo0o;
            if (objOooOoO0 instanceof C32445OooOOOO.OooO00o) {
                return objOooOoO0;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOoO0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            c26713OooO0Oo.f92318OooOo0o = null;
            c26713OooO0Oo.f92319OooOoO = 3;
            objOooOOo = c26740Oooo0oo.OoooO00(thOooO00o, c26713OooO0Oo);
        }
        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) objOooOOo;
        if (enumC27285OooO == EnumC27285OooO.f95076OooOo0o) {
            return Boolean.FALSE;
        }
        OooO00o oooO00oOooo = c26740Oooo0oo.Oooo(enumC27285OooO);
        c26713OooO0Oo.f92318OooOo0o = c26740Oooo0oo;
        c26713OooO0Oo.f92319OooOoO = 2;
        objOooOoO0 = oooO00oOooo.OooOoO0(c26713OooO0Oo);
        if (objOooOoO0 != enumC32485OooO00o) {
            if (objOooOoO0 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r8.OooOO0O(r6, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00O(String str, CloudContentTag cloudContentTag, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f92312OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f92312OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooO0O0.f92311OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f92312OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooO0O0.f92309OooOo0o = str;
            oooO0O0.f92308OooOo = cloudContentTag;
            oooO0O0.f92312OooOoOO = 1;
            objOooO0O0 = OooO0O0(oooO0O0);
            if (objOooO0O0 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return C32460OooOooO.f116667OooO00o;
        }
        cloudContentTag = oooO0O0.f92308OooOo;
        str = oooO0O0.f92309OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("addLocalPendingContent: cloud sync type not selected", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0O0.f92309OooOo0o = null;
        oooO0O0.f92308OooOo = null;
        oooO0O0.f92312OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOo00;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f92456OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f92456OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooo000.f92454OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo000.f92456OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooo000.f92455OooOo0o = this;
            oooo000.f92456OooOoO = 1;
            objOooO0O0 = OooO0O0(oooo000);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26740Oooo0oo = oooo000.f92455OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo = oooo000.f92455OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOo00 = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (objOooOo00 instanceof C32445OooOOOO.OooO00o) {
                return objOooOo00;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo00);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            oooo000.f92455OooOo0o = null;
            oooo000.f92456OooOoO = 3;
            objOooO0O0 = c26740Oooo0oo.OoooO00(thOooO00o, oooo000);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        oooo000.f92455OooOo0o = c26740Oooo0oo;
        oooo000.f92456OooOoO = 2;
        objOooOo00 = oooO00o.OooOo00(oooo000);
        if (objOooOo00 != enumC32485OooO00o) {
            if (objOooOo00 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        C26740Oooo0oo c26740Oooo0oo;
        Object objOooOo0o;
        C26740Oooo0oo c26740Oooo0oo2;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f92342OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f92342OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOO02.f92341OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f92342OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooOO02.f92339OooOo0o = this;
            oooOO02.f92338OooOo = str;
            oooOO02.f92342OooOoOO = 1;
            objOooO0O0 = OooO0O0(oooOO02);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = oooOO02.f92338OooOo;
            c26740Oooo0oo = oooOO02.f92339OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32446OooOOOo.OooO00o((Throwable) objOooO0O0);
            }
            c26740Oooo0oo2 = oooOO02.f92339OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            objOooOo0o = ((C32445OooOOOO) objOooO0O0).f116639OooOo0o;
            if (!(objOooOo0o instanceof C32445OooOOOO.OooO00o)) {
                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooOo0o;
                objOooOo0o = cloudMetaRemoteEntity != null ? c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain(cloudMetaRemoteEntity) : null;
            }
            if (objOooOo0o instanceof C32445OooOOOO.OooO00o) {
                return objOooOo0o;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            oooOO02.f92339OooOo0o = null;
            oooOO02.f92342OooOoOO = 3;
            objOooO0O0 = c26740Oooo0oo2.OoooO00(thOooO00o, oooOO02);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return C32446OooOOOo.OooO00o(new CloudSyncError.NotInitialized(null, 1, null));
        }
        oooOO02.f92339OooOo0o = c26740Oooo0oo;
        oooOO02.f92338OooOo = null;
        oooOO02.f92342OooOoOO = 2;
        objOooOo0o = oooO00o.OooOo0o(str, oooOO02);
        if (objOooOo0o != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            if (!(objOooOo0o instanceof C32445OooOOOO.OooO00o)) {
            }
            if (objOooOo0o instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final InterfaceC33721OooO0o<Boolean> Oooo0OO(EnumC27285OooO enumC27285OooO) {
        OooO00o oooO00o = (OooO00o) this.f92494OooO0OO.get(enumC27285OooO);
        return oooO00o == null ? new C33716OooO(Boolean.FALSE) : oooO00o.OooO0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[LOOP:0: B:29:0x0083->B:31:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0o0.InterfaceC27605OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable Oooo0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26721OooOOoo c26721OooOOoo;
        C26740Oooo0oo c26740Oooo0oo;
        C26740Oooo0oo c26740Oooo0oo2;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C26721OooOOoo) {
            c26721OooOOoo = (C26721OooOOoo) abstractC32479OooO0OO;
            int i = c26721OooOOoo.f92391OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26721OooOOoo.f92391OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26721OooOOoo = new C26721OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26721OooOOoo.f92390OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26721OooOOoo.f92391OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26721OooOOoo.f92388OooOo0o = this;
            c26721OooOOoo.f92387OooOo = str;
            c26721OooOOoo.f92391OooOoOO = 1;
            objOooO0O0 = OooO0O0(c26721OooOOoo);
            if (objOooO0O0 != enumC32485OooO00o) {
                c26740Oooo0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo2 = c26721OooOOoo.f92388OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            Iterable iterable = (Iterable) objOooO0O0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(c26740Oooo0oo2.f92493OooO0O0.toRemoteDomain((CloudMetaRemoteEntity) it.next()));
            }
            return arrayList;
        }
        str = c26721OooOOoo.f92387OooOo;
        c26740Oooo0oo = c26721OooOOoo.f92388OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o.OooOO0O("getAllCloudMetaLocals: cloud sync type not selected", new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
        c26721OooOOoo.f92388OooOo0o = c26740Oooo0oo;
        c26721OooOOoo.f92387OooOo = null;
        c26721OooOOoo.f92391OooOoOO = 2;
        objOooO0O0 = oooO00o.Oooo00O(str, c26721OooOOoo);
        if (objOooO0O0 != enumC32485OooO00o) {
            c26740Oooo0oo2 = c26740Oooo0oo;
            Iterable iterable2 = (Iterable) objOooO0O0;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0o0.InterfaceC27605OooO00o
    public final Object Oooo0o0(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f92492OooO00o, new C26736Oooo0OO(this, enumC27285OooO, null), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable Oooo0oO(HttpResponseException httpResponseException, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26731OooOooo c26731OooOooo;
        if (abstractC32479OooO0OO instanceof C26731OooOooo) {
            c26731OooOooo = (C26731OooOooo) abstractC32479OooO0OO;
            int i = c26731OooOooo.f92445OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26731OooOooo.f92445OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26731OooOooo = new C26731OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26731OooOooo.f92443OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26731OooOooo.f92445OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            int statusCode = httpResponseException.getStatusCode();
            String content = httpResponseException.getContent();
            if (content == null) {
                content = "";
            }
            if (statusCode == 403 && C33599OooOo0O.OooOoOO(content, "SPACE_FULL", false)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o.OooOO0O("Huawei Drive SPACE_FULL error detected", new Object[0]);
                return new CloudSyncError.StorageFull(httpResponseException);
            }
            if (statusCode != 401) {
                if (statusCode == 404 && C33599OooOo0O.OooOoOO(content, "CONTENT_NOT_FOUND", false)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CloudSyncRepoImpl");
                    c20358OooO00o2.OooOO0O("Huawei Drive resource not found (404)", new Object[0]);
                    return new CloudSyncError.ResourceNotFound(httpResponseException);
                }
                if (400 <= statusCode && statusCode < 500) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o3, "CloudSyncRepoImpl", "Huawei Drive client error: ", statusCode), new Object[0]);
                    return new CloudSyncError.Internal(httpResponseException);
                }
                if (500 > statusCode || statusCode >= 600) {
                    return new CloudSyncError.Network(httpResponseException);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o4, "CloudSyncRepoImpl", "Huawei Drive server error: ", statusCode), new Object[0]);
                return new CloudSyncError.ServerTemporary(httpResponseException);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o5.OooOO0O("Huawei Drive auth expired (401)", new Object[0]);
            c26731OooOooo.f92444OooOo0o = httpResponseException;
            c26731OooOooo.f92445OooOoO = 1;
            objOooO0O0 = OooO0O0(c26731OooOooo);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpResponseException = c26731OooOooo.f92444OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        OooO00o oooO00o = (OooO00o) objOooO0O0;
        return (oooO00o == null || oooO00o.OooO0o()) ? new CloudSyncError.AuthExpired(httpResponseException) : new CloudSyncError.HmsComponentNotAvailable(httpResponseException);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26735Oooo0O0 c26735Oooo0O0;
        C26740Oooo0oo c26740Oooo0oo;
        if (abstractC32479OooO0OO instanceof C26735Oooo0O0) {
            c26735Oooo0O0 = (C26735Oooo0O0) abstractC32479OooO0OO;
            int i = c26735Oooo0O0.f92472OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26735Oooo0O0.f92472OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26735Oooo0O0 = new C26735Oooo0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26735Oooo0O0.f92470OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26735Oooo0O0.f92472OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            c26735Oooo0O0.f92471OooOo0o = this;
            c26735Oooo0O0.f92472OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(this.f92496OooO0o0, c26735Oooo0O0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26740Oooo0oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26740Oooo0oo = c26735Oooo0O0.f92471OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) objOooOOo;
        if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
            return c26740Oooo0oo.Oooo(enumC27285OooO);
        }
        throw new IllegalArgumentException("CloudSyncRepo: cloud sync type not selected");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Serializable OoooO00(Throwable th, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        String message;
        Object objOooO00o;
        String str;
        ResponseBody responseBody;
        if (th instanceof CloudSyncError) {
            return (CloudSyncError) th;
        }
        if (th instanceof HttpResponseException) {
            return Oooo0oO((HttpResponseException) th, abstractC32479OooO0OO);
        }
        if (th instanceof GoogleJsonResponseException) {
            GoogleJsonResponseException googleJsonResponseException = (GoogleJsonResponseException) th;
            int statusCode = googleJsonResponseException.getStatusCode();
            String content = googleJsonResponseException.getContent();
            str = content != null ? content : "";
            if (statusCode == 401) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o.OooOO0O("Google Drive auth expired (401)", new Object[0]);
                return new CloudSyncError.AuthExpired(googleJsonResponseException);
            }
            if (statusCode == 403) {
                if (C33599OooOo0O.OooOoOO(str, "storageQuotaExceeded", true)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CloudSyncRepoImpl");
                    c20358OooO00o2.OooOO0O("Google Drive storage full (storageQuotaExceeded)", new Object[0]);
                    return new CloudSyncError.StorageFull(googleJsonResponseException);
                }
                if (C33599OooOo0O.OooOoOO(str, "userRateLimitExceeded", true) || C33599OooOo0O.OooOoOO(str, "rateLimitExceeded", true)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("CloudSyncRepoImpl");
                    c20358OooO00o3.OooOO0O("Google Drive rate limited (403)", new Object[0]);
                    return new CloudSyncError.ServerTemporary(googleJsonResponseException);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o4.OooOO0O("Google Drive client error (403), content: ".concat(str), new Object[0]);
                return new CloudSyncError.Internal(googleJsonResponseException);
            }
            if (statusCode == 404) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o5.OooOO0O("Google Drive resource not found (404)", new Object[0]);
                return new CloudSyncError.ResourceNotFound(googleJsonResponseException);
            }
            if (statusCode == 429) {
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o6.OooOO0O("Google Drive rate limited (429)", new Object[0]);
                return new CloudSyncError.ServerTemporary(googleJsonResponseException);
            }
            if (400 <= statusCode && statusCode < 500) {
                C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o7, "CloudSyncRepoImpl", "Google Drive client error: ", statusCode, ", content: ");
                sbOooO00o.append(str);
                c20358OooO00o7.OooOO0O(sbOooO00o.toString(), new Object[0]);
                return new CloudSyncError.Internal(googleJsonResponseException);
            }
            if (500 > statusCode || statusCode >= 600) {
                return new CloudSyncError.Network(googleJsonResponseException);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o8.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o8, "CloudSyncRepoImpl", "Google Drive server error: ", statusCode), new Object[0]);
            return new CloudSyncError.ServerTemporary(googleJsonResponseException);
        }
        if (th instanceof UserRecoverableAuthIOException) {
            C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o9.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o9.OooOO0O("Google Drive auth requires user interaction", new Object[0]);
            return new CloudSyncError.AuthExpired(th);
        }
        if (th instanceof C35219OooOO0O) {
            C35219OooOO0O c35219OooOO0O = (C35219OooOO0O) th;
            try {
                C35238OooOoO<?> c35238OooOoO = c35219OooOO0O.f126447OooOo;
                objOooO00o = (c35238OooOoO == null || (responseBody = c35238OooOoO.f126543OooO0OO) == null) ? null : responseBody.string();
            } catch (Throwable th2) {
                objOooO00o = C32446OooOOOo.OooO00o(th2);
            }
            String str2 = (String) (objOooO00o instanceof C32445OooOOOO.OooO00o ? null : objOooO00o);
            str = str2 != null ? str2 : "";
            int i = c35219OooOO0O.f126448OooOo0o;
            if (i == 401) {
                C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o10.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o10.OooOO0O("OneDrive auth expired (401)", new Object[0]);
                return new CloudSyncError.AuthExpired(c35219OooOO0O);
            }
            if (i == 403) {
                if (C33599OooOo0O.OooOoOO(str, "quotaLimitReached", true)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o11.OooOOO0("CloudSyncRepoImpl");
                    c20358OooO00o11.OooOO0O("OneDrive storage full (quotaLimitReached)", new Object[0]);
                    return new CloudSyncError.StorageFull(c35219OooOO0O);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o12 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o12.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o12.OooOO0O("OneDrive access denied (403)", new Object[0]);
                return new CloudSyncError.AuthExpired(c35219OooOO0O);
            }
            if (i == 404) {
                C34406OooO00o.C20358OooO00o c20358OooO00o13 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o13.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o13.OooOO0O("OneDrive resource not found (404)", new Object[0]);
                return new CloudSyncError.ResourceNotFound(c35219OooOO0O);
            }
            if (i == 409) {
                C34406OooO00o.C20358OooO00o c20358OooO00o14 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o14.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o14.OooOO0O("OneDrive conflict (409)", new Object[0]);
                return new CloudSyncError.MetaVersionMismatch(c35219OooOO0O);
            }
            if (i == 429) {
                C34406OooO00o.C20358OooO00o c20358OooO00o15 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o15.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o15.OooOO0O("OneDrive rate limited (429)", new Object[0]);
                return new CloudSyncError.ServerTemporary(c35219OooOO0O);
            }
            if (400 <= i && i < 500) {
                C34406OooO00o.C20358OooO00o c20358OooO00o16 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o2 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o16, "CloudSyncRepoImpl", "OneDrive client error: ", i, ", body: ");
                sbOooO00o2.append(str);
                c20358OooO00o16.OooOO0O(sbOooO00o2.toString(), new Object[0]);
                return new CloudSyncError.Internal(c35219OooOO0O);
            }
            if (i == 507) {
                C34406OooO00o.C20358OooO00o c20358OooO00o17 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o17.OooOOO0("CloudSyncRepoImpl");
                c20358OooO00o17.OooOO0O("OneDrive storage full (507)", new Object[0]);
                return new CloudSyncError.StorageFull(c35219OooOO0O);
            }
            if (500 > i || i >= 600) {
                return new CloudSyncError.Network(c35219OooOO0O);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o18 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o18.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o18, "CloudSyncRepoImpl", "OneDrive server error: ", i), new Object[0]);
            return new CloudSyncError.ServerTemporary(c35219OooOO0O);
        }
        if (th instanceof MsalUiRequiredException) {
            MsalUiRequiredException msalUiRequiredException = (MsalUiRequiredException) th;
            C34406OooO00o.C20358OooO00o c20358OooO00o19 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o19.OooOOO0("CloudSyncRepoImpl");
            c20358OooO00o19.OooOO0O(C22237OooO0o0.OooO00o("MSAL UI required exception: ", msalUiRequiredException.getErrorCode(), ", ", msalUiRequiredException.getMessage()), new Object[0]);
            String errorCode = msalUiRequiredException.getErrorCode();
            int iHashCode = errorCode.hashCode();
            return (iHashCode == -1811371790 ? errorCode.equals("no_account_found") : iHashCode == -1048059301 ? errorCode.equals("no_tokens_found") : iHashCode == -847806252 && errorCode.equals("invalid_grant")) ? new CloudSyncError.AuthExpired(msalUiRequiredException) : new CloudSyncError.Internal(msalUiRequiredException);
        }
        if ((th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException)) {
            return new CloudSyncError.Network(th);
        }
        if (th instanceof IOException) {
            return new CloudSyncError.Internal(th);
        }
        if (!(th instanceof o0OO000.OooOO0)) {
            if (!(th instanceof IllegalStateException)) {
                return new CloudSyncError.Internal(th);
            }
            String message2 = th.getMessage();
            return ((message2 == null || !C33599OooOo0O.OooOoOO(message2, "not selected", false)) && ((message = th.getMessage()) == null || !C33599OooOo0O.OooOoOO(message, "not initialized", false))) ? new CloudSyncError.Internal(th) : new CloudSyncError.NotInitialized(th);
        }
        String str3 = ((o0OO000.OooOO0) th).f90831OooOo0o;
        int iHashCode2 = str3.hashCode();
        switch (iHashCode2) {
            case -2146020875:
                if (str3.equals("RETRY_LATER")) {
                    return new CloudSyncError.ServerTemporary(th);
                }
                break;
            case 1507454:
                if (str3.equals("1010")) {
                    return new CloudSyncError.NoteinAuthFailed(th);
                }
                break;
            case 1353037501:
                if (str3.equals("INTERNAL")) {
                    return new CloudSyncError.ChecksumMismatch(th);
                }
                break;
            case 2030064304:
                if (str3.equals("LOCK_EXPIRING")) {
                    return new CloudSyncError.ServerTemporary(th);
                }
                break;
            default:
                switch (iHashCode2) {
                    case 1507424:
                        if (str3.equals("1001")) {
                            return new CloudSyncError.LockBusy(th);
                        }
                        break;
                    case 1507425:
                        if (str3.equals("1002")) {
                            return new CloudSyncError.LockExpired(th);
                        }
                        break;
                    case 1507426:
                        if (str3.equals("1003")) {
                            return new CloudSyncError.ResourceNotFound(th);
                        }
                        break;
                    case 1507427:
                        if (str3.equals("1004")) {
                            return new CloudSyncError.LockBusy(th);
                        }
                        break;
                    case 1507428:
                        if (str3.equals("1005")) {
                            return new CloudSyncError.MetaNotFound(th);
                        }
                        break;
                    case 1507429:
                        if (str3.equals("1006")) {
                            return new CloudSyncError.MetaVersionMismatch(th);
                        }
                        break;
                    case 1507430:
                        if (str3.equals("1007")) {
                            return new CloudSyncError.ResourceNotFound(th);
                        }
                        break;
                    case 1507431:
                        if (str3.equals("1008")) {
                            return new CloudSyncError.LockBusy(th);
                        }
                        break;
                    case 1507432:
                        if (str3.equals("1009")) {
                            return new CloudSyncError.UnknownContentSource(th);
                        }
                        break;
                }
                break;
        }
        return new CloudSyncError.Internal(th);
    }
}

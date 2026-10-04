package com.orion.notein.data.repo.backup;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOo0O.C27182OooO0O0;
import o0oo000O.C31186OooO0Oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource$download$2", m80623f = "BackupBaiduDatasource.kt", m80624l = {236, 243, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.PLAIN_TABLE_3}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f69836OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f69837OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ BackupFile f69838OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69839OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f69840OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(BackupBaiduDatasource backupBaiduDatasource, BackupFile backupFile, String str, Continuation continuation) {
        super(2, continuation);
        this.f69839OooOoO0 = backupBaiduDatasource;
        this.f69838OooOoO = backupFile;
        this.f69840OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO(this.f69839OooOoO0, this.f69838OooOoO, this.f69840OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0253, code lost:
    
        if (r1 != r6) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0Oo;
        String str;
        Object objOooO0oO;
        String str2;
        String str3;
        String str4;
        o0OOOOOO.OooO00o oooO00o;
        Object objOooO;
        C35238OooOoO c35238OooOoO;
        C27182OooO0O0 c27182OooO0O0;
        String str5;
        Object objOooOO0O;
        C35238OooOoO<ResponseBody> c35238OooOoOExecute;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f69836OooOo;
        BackupBaiduDatasource backupBaiduDatasource = this.f69839OooOoO0;
        BackupFile backupFile = this.f69838OooOoO;
        boolean z = false;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f69836OooOo = 1;
            AbstractC24338OooO0o0.OooO00o<String> oooO00o2 = BackupBaiduDatasource.f69830OooO0o;
            objOooO0Oo = backupBaiduDatasource.OooO0Oo(this);
            if (objOooO0Oo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
        } else {
            if (i == 2) {
                str = this.f69837OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oO = obj;
                String str6 = str;
                str2 = (String) objOooO0oO;
                if (str2 != null || str2.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o.OooO0OO("download, instanceDirPath is null or empty.", new Object[0]);
                    throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
                }
                String json = backupBaiduDatasource.f69834OooO0Oo.toJson(com.facebook.soloader.OooOo.OooO0oO(new Long(Long.parseLong(backupFile.getId()))));
                try {
                    oooO00o = backupBaiduDatasource.f69832OooO0O0;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(json);
                    this.f69837OooOo0o = str6;
                    this.f69836OooOo = 3;
                    str3 = str6;
                } catch (Exception e) {
                    e = e;
                    str3 = str6;
                }
                try {
                    objOooO = oooO00o.OooO("filemetas", str3, json, 1, this);
                } catch (Exception e2) {
                    e = e2;
                    str4 = str3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o2.OooO0Oo(e, "download, get file meta failed.", new Object[0]);
                    c35238OooOoO = null;
                }
                if (objOooO != enumC32485OooO00o) {
                    str4 = str3;
                    c35238OooOoO = (C35238OooOoO) objOooO;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BackupBaiduDatasource");
                    if (c35238OooOoO == null) {
                    }
                    if (c35238OooOoO == null) {
                    }
                    c20358OooO00o3.OooO0o0("download, get file meta result: " + (c35238OooOoO == null ? (C27182OooO0O0) c35238OooOoO.f126542OooO0O0 : null) + ", isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                    if (c35238OooOoO == null) {
                    }
                    if (c35238OooOoO == null) {
                    }
                    if (c27182OooO0O0 != null) {
                    }
                    str5 = "Unable to get the file metadata from baidu's disk.";
                    this.f69837OooOo0o = "Unable to get the file metadata from baidu's disk.";
                    this.f69836OooOo = 4;
                    AbstractC24338OooO0o0.OooO00o<String> oooO00o3 = BackupBaiduDatasource.f69830OooO0o;
                    objOooOO0O = backupBaiduDatasource.OooOO0O(num, this);
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = this.f69837OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0O = obj;
                throw new BackupException(str5, ((Number) objOooOO0O).intValue(), null, 4, null);
            }
            str4 = this.f69837OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                objOooO = obj;
                c35238OooOoO = (C35238OooOoO) objOooO;
            } catch (Exception e3) {
                e = e3;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o22.OooO0Oo(e, "download, get file meta failed.", new Object[0]);
                c35238OooOoO = null;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o32.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o32.OooO0o0("download, get file meta result: " + (c35238OooOoO == null ? (C27182OooO0O0) c35238OooOoO.f126542OooO0O0 : null) + ", isSuccess: " + (c35238OooOoO == null ? Boolean.valueOf(c35238OooOoO.f126541OooO00o.OooO0OO()) : null), new Object[0]);
            c27182OooO0O0 = c35238OooOoO == null ? (C27182OooO0O0) c35238OooOoO.f126542OooO0O0 : null;
            if (c35238OooOoO == null && c35238OooOoO.f126541OooO00o.OooO0OO() && c27182OooO0O0 != null && c27182OooO0O0.getErrno() == 0 && !c27182OooO0O0.OooO0O0().isEmpty()) {
                String dLink = c27182OooO0O0.OooO0O0().get(0).getDLink();
                try {
                    c35238OooOoOExecute = backupBaiduDatasource.f69832OooO0O0.OooO0O0(dLink + "&access_token=" + str4).execute();
                } catch (Exception e4) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("BackupBaiduDatasource");
                    c20358OooO00o4.OooO0Oo(e4, "download failed.", new Object[0]);
                    c35238OooOoOExecute = null;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
                c20358OooO00o5.OooO0o0("download result: " + (c35238OooOoOExecute != null ? c35238OooOoOExecute.f126542OooO0O0 : null) + ", isSuccess: " + (c35238OooOoOExecute != null ? Boolean.valueOf(c35238OooOoOExecute.f126541OooO00o.OooO0OO()) : null), new Object[0]);
                ResponseBody responseBody = c35238OooOoOExecute != null ? c35238OooOoOExecute.f126542OooO0O0 : null;
                if (c35238OooOoOExecute != null && c35238OooOoOExecute.f126541OooO00o.OooO0OO() && responseBody != null) {
                    String str7 = this.f69840OooOoOO;
                    AbstractC24338OooO0o0.OooO00o<String> oooO00o4 = BackupBaiduDatasource.f69830OooO0o;
                    try {
                        InputStream inputStreamByteStream = responseBody.byteStream();
                        try {
                            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
                            c20358OooO00o5.OooO0o0("writeFileFromResponseBody, start download file to: " + str7, new Object[0]);
                            boolean zOooO0OO = C31186OooO0Oo.OooO0OO(C31190OooO0oo.OooOOO0(str7), inputStreamByteStream);
                            c20358OooO00o5.OooOOO0("BackupBaiduDatasource");
                            c20358OooO00o5.OooO0o0("writeFileFromResponseBody, result: " + zOooO0OO + ", targetFilePath: " + str7, new Object[0]);
                            oO0O000.OooO00o.OooO00o(inputStreamByteStream, null);
                            z = zOooO0OO;
                        } finally {
                        }
                    } catch (IOException e5) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o6.OooOOO0("BackupBaiduDatasource");
                        c20358OooO00o6.OooO0Oo(e5, "writeFileFromResponseBody error.", new Object[0]);
                    }
                }
                if (z) {
                    return C32460OooOooO.f116667OooO00o;
                }
                throw new BackupException("Unable to get the file metadata from baidu's disk.", -999, null, 4, null);
            }
            Integer num = c27182OooO0O0 != null ? new Integer(c27182OooO0O0.getErrno()) : null;
            str5 = "Unable to get the file metadata from baidu's disk.";
            this.f69837OooOo0o = "Unable to get the file metadata from baidu's disk.";
            this.f69836OooOo = 4;
            AbstractC24338OooO0o0.OooO00o<String> oooO00o32 = BackupBaiduDatasource.f69830OooO0o;
            objOooOO0O = backupBaiduDatasource.OooOO0O(num, this);
        }
        str = (String) objOooO0Oo;
        C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o7.OooOOO0("BackupBaiduDatasource");
        c20358OooO00o7.OooO0o0("download, sourceFileMeta: " + backupFile + ", accessToken is nullOrEmpty: " + (str == null || str.length() == 0), new Object[0]);
        if (str == null || str.length() == 0) {
            throw new BackupException("Token is null or empty.", BackupEvent.ERROR_INVALID_TOKEN, null, 4, null);
        }
        this.f69837OooOo0o = str;
        this.f69836OooOo = 2;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o5 = BackupBaiduDatasource.f69830OooO0o;
        objOooO0oO = backupBaiduDatasource.OooO0oO(this);
        if (objOooO0oO != enumC32485OooO00o) {
            String str62 = str;
            str2 = (String) objOooO0oO;
            if (str2 != null) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o8.OooOOO0("BackupBaiduDatasource");
            c20358OooO00o8.OooO0OO("download, instanceDirPath is null or empty.", new Object[0]);
            throw new BackupException("Couldn't get the instance dir.", -999, null, 4, null);
        }
        return enumC32485OooO00o;
    }
}

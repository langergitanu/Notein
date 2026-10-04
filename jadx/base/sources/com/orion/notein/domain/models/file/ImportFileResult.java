package com.orion.notein.domain.models.file;

import Oooo0o0.C21009OooOooO;
import androidx.concurrent.futures.OooO0o;
import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/file/ImportFileResult;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "obj", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getObj", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ImportFileResult {
    public static final int ERROR_CAN_NOT_RETRIEVE_FILE_INFO = -3;
    public static final int ERROR_CAN_NOT_RETRIEVE_FILE_PATH = -2;
    public static final int ERROR_IN_FILE_DB_VERSION_BIG_THAN_LOCAL = -7;
    public static final int ERROR_NO_URI_PERMISSIONS = -1;
    public static final int ERROR_OTHER = -999;
    public static final int ERROR_PDF_ENCRYPTED = -6;
    public static final int ERROR_TEMPLATE_LIMIT_REACHED = -5;
    public static final int ERROR_VIP_LIMITATION = -4;
    public static final int RESULT_NONSENSE = Integer.MIN_VALUE;
    public static final int RESULT_OK = 0;
    public static final int RESULT_OK_AND_OPEN_NOTE = 1;
    private final int code;
    private final String msg;
    private final Object obj;

    public ImportFileResult(int i, String msg, Object obj) {
        OooOOO0.OooO0oO(msg, "msg");
        this.code = i;
        this.msg = msg;
        this.obj = obj;
    }

    public static /* synthetic */ ImportFileResult copy$default(ImportFileResult importFileResult, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = importFileResult.code;
        }
        if ((i2 & 2) != 0) {
            str = importFileResult.msg;
        }
        if ((i2 & 4) != 0) {
            obj = importFileResult.obj;
        }
        return importFileResult.copy(i, str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getObj() {
        return this.obj;
    }

    public final ImportFileResult copy(int code, String msg, Object obj) {
        OooOOO0.OooO0oO(msg, "msg");
        return new ImportFileResult(code, msg, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportFileResult)) {
            return false;
        }
        ImportFileResult importFileResult = (ImportFileResult) other;
        return this.code == importFileResult.code && OooOOO0.OooO0O0(this.msg, importFileResult.msg) && OooOOO0.OooO0O0(this.obj, importFileResult.obj);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Object getObj() {
        return this.obj;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(Integer.hashCode(this.code) * 31, 31, this.msg);
        Object obj = this.obj;
        return iOooO0O0 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        int i = this.code;
        String str = this.msg;
        return OooO0o.OooO0O0(C21009OooOooO.OooO0OO(i, "ImportFileResult(code=", ", msg=", str, ", obj="), this.obj, ")");
    }

    public /* synthetic */ ImportFileResult(int i, String str, Object obj, int i2, C24018OooO0oo c24018OooO0oo) {
        this(i, str, (i2 & 4) != 0 ? null : obj);
    }
}

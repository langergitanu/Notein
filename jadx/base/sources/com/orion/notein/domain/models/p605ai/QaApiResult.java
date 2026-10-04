package com.orion.notein.domain.models.p605ai;

import OooOoo0.o00000;
import androidx.concurrent.futures.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/ai/QaApiResult;", "", "fileName", "", "isSuccessful", "", "answer", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "()Z", "getAnswer", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class QaApiResult {
    private final String answer;
    private final String fileName;
    private final boolean isSuccessful;

    public QaApiResult(String fileName, boolean z, String str) {
        OooOOO0.OooO0oO(fileName, "fileName");
        this.fileName = fileName;
        this.isSuccessful = z;
        this.answer = str;
    }

    public static /* synthetic */ QaApiResult copy$default(QaApiResult qaApiResult, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qaApiResult.fileName;
        }
        if ((i & 2) != 0) {
            z = qaApiResult.isSuccessful;
        }
        if ((i & 4) != 0) {
            str2 = qaApiResult.answer;
        }
        return qaApiResult.copy(str, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final QaApiResult copy(String fileName, boolean isSuccessful, String answer) {
        OooOOO0.OooO0oO(fileName, "fileName");
        return new QaApiResult(fileName, isSuccessful, answer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QaApiResult)) {
            return false;
        }
        QaApiResult qaApiResult = (QaApiResult) other;
        return OooOOO0.OooO0O0(this.fileName, qaApiResult.fileName) && this.isSuccessful == qaApiResult.isSuccessful && OooOOO0.OooO0O0(this.answer, qaApiResult.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(this.fileName.hashCode() * 31, 31, this.isSuccessful);
        String str = this.answer;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public String toString() {
        String str = this.fileName;
        boolean z = this.isSuccessful;
        String str2 = this.answer;
        StringBuilder sb = new StringBuilder("QaApiResult(fileName=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(", answer=");
        return OooO00o.OooO0OO(sb, str2, ")");
    }

    public /* synthetic */ QaApiResult(String str, boolean z, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}

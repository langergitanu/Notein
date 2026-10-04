package com.orion.notein.domain.models.backup;

import OooOo.C20485OooOoO;
import androidx.concurrent.futures.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "errorCode", "", "noteTitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getErrorCode", "()I", "getNoteTitle", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BackupException extends Exception {
    private final int errorCode;
    private final String message;
    private final String noteTitle;

    public /* synthetic */ BackupException(String str, int i, String str2, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, i, (i2 & 4) != 0 ? null : str2);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getNoteTitle() {
        return this.noteTitle;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        int i = this.errorCode;
        return OooO00o.OooO0OO(C20485OooOoO.OooO0OO(i, "BackupException(message = ", message, ", errorCode = ", ", noteTitle: "), this.noteTitle, ")");
    }

    public BackupException(String str, int i, String str2) {
        super(str);
        this.message = str;
        this.errorCode = i;
        this.noteTitle = str2;
    }
}
